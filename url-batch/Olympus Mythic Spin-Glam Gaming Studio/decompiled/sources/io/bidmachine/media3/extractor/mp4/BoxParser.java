package io.bidmachine.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import io.bidmachine.media3.common.ColorInfo;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.CodecSpecificDataUtil;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableBitArray;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.container.MdtaMetadataEntry;
import io.bidmachine.media3.container.Mp4AlternateGroupData;
import io.bidmachine.media3.container.Mp4Box;
import io.bidmachine.media3.container.Mp4LocationData;
import io.bidmachine.media3.container.Mp4TimestampData;
import io.bidmachine.media3.container.NalUnitUtil;
import io.bidmachine.media3.extractor.AacUtil;
import io.bidmachine.media3.extractor.Ac3Util;
import io.bidmachine.media3.extractor.Ac4Util;
import io.bidmachine.media3.extractor.AvcConfig;
import io.bidmachine.media3.extractor.DolbyVisionConfig;
import io.bidmachine.media3.extractor.ExtractorUtil;
import io.bidmachine.media3.extractor.GaplessInfoHolder;
import io.bidmachine.media3.extractor.HevcConfig;
import io.bidmachine.media3.extractor.OpusUtil;
import io.bidmachine.media3.extractor.VorbisUtil;
import io.bidmachine.media3.extractor.mp4.FixedSampleSizeRechunker;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes.dex */
public final class BoxParser {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final int SAMPLE_RATE_AMR_NB = 8000;
    private static final int SAMPLE_RATE_AMR_WB = 16000;
    private static final String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static int parseFullBoxFlags(int i) {
        return i & 16777215;
    }

    public static int parseFullBoxVersion(int i) {
        return (i >> 24) & 255;
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2, Function function) throws ParserException {
        Track track;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerBox.containerChildren.size(); i++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i);
            if (containerBox2.type == 1953653099 && (track = (Track) function.apply(parseTrak(containerBox2, (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(track, (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(1835297121))).getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + readInt));
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + readInt));
            } else if (readInt2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return metadata;
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long readLong;
        long readLong2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            readLong = parsableByteArray.readUnsignedInt();
            readLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readLong = parsableByteArray.readLong();
            readLong2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(readLong, readLong2, parsableByteArray.readUnsignedInt());
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(1751411826);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(1801812339);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(1768715124);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 >= 0 && readInt4 < readInt) {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            } else {
                Log.w(TAG, "Skipped metadata with unknown key index: " + readInt4);
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    @Nullable
    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        Mp4Box.LeafBox leafBox2;
        long j2;
        long[] jArr;
        long[] jArr2;
        Format format;
        Metadata metadata;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<long[], long[]> parseEdts;
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1953196132))).data);
        if (j == -9223372036854775807L) {
            leafBox2 = leafBox;
            j2 = parseTkhd.duration;
        } else {
            leafBox2 = leafBox;
            j2 = j;
        }
        long j3 = parseMvhd(leafBox2.data).timescale;
        long scaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, j3) : -9223372036854775807L;
        Mp4Box.ContainerBox containerBox3 = (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212));
        MdhdData parseMdhd = parseMdhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(1835296868))).data);
        Mp4Box.LeafBox leafBoxOfType = containerBox3.getLeafBoxOfType(1937011556);
        if (leafBoxOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData parseStsd = parseStsd(leafBoxOfType.data, parseTkhd.id, parseTkhd.rotationDegrees, parseMdhd.language, drmInitData, z2);
        if (z || (containerBoxOfType = containerBox.getContainerBoxOfType(1701082227)) == null || (parseEdts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        }
        if (parseStsd.format == null) {
            return null;
        }
        if (parseTkhd.alternateGroup != 0) {
            Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(parseTkhd.alternateGroup);
            Format.Builder buildUpon = parseStsd.format.buildUpon();
            Metadata metadata2 = parseStsd.format.metadata;
            if (metadata2 != null) {
                metadata = metadata2.copyWithAppendedEntries(mp4AlternateGroupData);
            } else {
                metadata = new Metadata(mp4AlternateGroupData);
            }
            format = buildUpon.setMetadata(metadata).build();
        } else {
            format = parseStsd.format;
        }
        return new Track(parseTkhd.id, trackTypeForHdlr, parseMdhd.timescale, j3, scaleLargeTimestamp, parseMdhd.mediaDurationUs, format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static TrackSampleTable parseStbl(Track track, Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Track track2;
        int[] iArr3;
        long[] jArr3;
        long j;
        long j2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr4;
        int i15;
        int[] iArr5;
        boolean z3;
        int i16;
        int i17;
        Track track3 = track;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(1937011578);
        if (leafBoxOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafBoxOfType, track3.format);
        } else {
            Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(1937013298);
            if (leafBoxOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafBoxOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (track3.type == 2) {
            long j3 = track3.mediaDurationUs;
            if (j3 > 0) {
                track3 = track3.copyWithFormat(track3.format.buildUpon().setFrameRate(sampleCount / (j3 / 1000000.0f)).build());
            }
        }
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(1937007471);
        if (leafBoxOfType3 == null) {
            leafBoxOfType3 = (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1668232756));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1937011555))).data;
        ParsableByteArray parsableByteArray3 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1937011827))).data;
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(1937011571);
        ParsableByteArray parsableByteArray4 = leafBoxOfType4 != null ? leafBoxOfType4.data : null;
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(1668576371);
        ParsableByteArray parsableByteArray5 = leafBoxOfType5 != null ? leafBoxOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i = parsableByteArray5.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            i3 = parsableByteArray4.readUnsignedIntToInt();
            if (i3 > 0) {
                i2 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                i2 = -1;
                parsableByteArray4 = null;
            }
        } else {
            i2 = -1;
            i3 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track3.format.sampleMimeType;
        if (fixedSampleSize != -1 && ("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && readUnsignedIntToInt == 0 && i == 0 && i3 == 0) {
            int i18 = chunkIterator.length;
            long[] jArr4 = new long[i18];
            int[] iArr6 = new int[i18];
            while (chunkIterator.moveNext()) {
                int i19 = chunkIterator.index;
                jArr4[i19] = chunkIterator.offset;
                iArr6[i19] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr4, iArr6, readUnsignedIntToInt3);
            jArr = rechunk.offsets;
            int[] iArr7 = rechunk.sizes;
            int i20 = rechunk.maximumSize;
            long[] jArr5 = rechunk.timestamps;
            iArr2 = rechunk.flags;
            long j4 = rechunk.duration;
            j2 = rechunk.totalSize;
            track2 = track3;
            iArr3 = iArr7;
            i4 = i20;
            jArr3 = jArr5;
            j = j4;
        } else {
            long[] jArr6 = new long[sampleCount];
            int[] iArr8 = new int[sampleCount];
            long[] jArr7 = new long[sampleCount];
            int[] iArr9 = new int[sampleCount];
            int i21 = readUnsignedIntToInt;
            int i22 = i2;
            int i23 = i;
            i4 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            Track track4 = track3;
            int i27 = 0;
            while (true) {
                if (i27 >= sampleCount) {
                    i5 = i3;
                    jArr = jArr6;
                    iArr = iArr8;
                    jArr2 = jArr7;
                    iArr2 = iArr9;
                    i6 = i24;
                    i7 = i25;
                    break;
                }
                long j8 = j7;
                int i28 = i24;
                boolean z4 = true;
                while (i28 == 0) {
                    z4 = chunkIterator.moveNext();
                    if (!z4) {
                        break;
                    }
                    int i29 = readUnsignedIntToInt3;
                    long j9 = chunkIterator.offset;
                    i28 = chunkIterator.numSamples;
                    j8 = j9;
                    readUnsignedIntToInt3 = i29;
                    i3 = i3;
                    sampleCount = sampleCount;
                }
                int i30 = sampleCount;
                int i31 = readUnsignedIntToInt3;
                i5 = i3;
                if (!z4) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    long[] copyOf = Arrays.copyOf(jArr6, i27);
                    int[] copyOf2 = Arrays.copyOf(iArr8, i27);
                    jArr2 = Arrays.copyOf(jArr7, i27);
                    iArr2 = Arrays.copyOf(iArr9, i27);
                    jArr = copyOf;
                    iArr = copyOf2;
                    i7 = i25;
                    sampleCount = i27;
                    i6 = i28;
                    break;
                }
                if (parsableByteArray5 != null) {
                    while (i26 == 0 && i23 > 0) {
                        i26 = parsableByteArray5.readUnsignedIntToInt();
                        i25 = parsableByteArray5.readInt();
                        i23--;
                    }
                    i26--;
                }
                int i32 = i25;
                jArr6[i27] = j8;
                int readNextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                iArr8[i27] = readNextSampleSize;
                ChunkIterator chunkIterator2 = chunkIterator;
                SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
                j6 += readNextSampleSize;
                if (readNextSampleSize > i4) {
                    i4 = readNextSampleSize;
                }
                jArr7[i27] = j5 + i32;
                iArr9[i27] = parsableByteArray4 == null ? 1 : 0;
                if (i27 == i22) {
                    iArr9[i27] = 1;
                    i12 = i5 - 1;
                    if (i12 > 0) {
                        i22 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                    i9 = i22;
                    i10 = i32;
                    i11 = i31;
                } else {
                    i9 = i22;
                    i10 = i32;
                    i11 = i31;
                    i12 = i5;
                }
                j5 += i11;
                readUnsignedIntToInt2--;
                if (readUnsignedIntToInt2 != 0 || i21 <= 0) {
                    i13 = i11;
                    i14 = i21;
                } else {
                    int readUnsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt();
                    i13 = parsableByteArray3.readInt();
                    i14 = i21 - 1;
                    readUnsignedIntToInt2 = readUnsignedIntToInt4;
                }
                int i33 = i13;
                long j10 = j8 + iArr8[i27];
                i24 = i28 - 1;
                i27++;
                j7 = j10;
                i25 = i10;
                i22 = i9;
                sampleCount = i30;
                chunkIterator = chunkIterator2;
                int i34 = i14;
                readUnsignedIntToInt3 = i33;
                i21 = i34;
                i3 = i12;
                stz2SampleSizeBox = sampleSizeBox;
            }
            long j11 = j5 + i7;
            if (parsableByteArray5 != null) {
                while (i23 > 0) {
                    if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                        z2 = false;
                        break;
                    }
                    parsableByteArray5.readInt();
                    i23--;
                }
            }
            z2 = true;
            if (i5 == 0 && readUnsignedIntToInt2 == 0 && i6 == 0 && i21 == 0) {
                i8 = i26;
                if (i8 == 0 && z2) {
                    track2 = track4;
                    iArr3 = iArr;
                    jArr3 = jArr2;
                    j = j11;
                    j2 = j6;
                }
            } else {
                i8 = i26;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Inconsistent stbl box for track ");
            track2 = track4;
            sb.append(track2.id);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i5);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(readUnsignedIntToInt2);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i6);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i21);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i8);
            sb.append(!z2 ? ", ctts invalid" : "");
            Log.w(TAG, sb.toString());
            iArr3 = iArr;
            jArr3 = jArr2;
            j = j11;
            j2 = j6;
        }
        int[] iArr10 = iArr2;
        long j12 = track2.mediaDurationUs;
        if (j12 > 0) {
            long scaleLargeValue = Util.scaleLargeValue(j2 * 8, 1000000L, j12, RoundingMode.HALF_DOWN);
            if (scaleLargeValue > 0 && scaleLargeValue < 2147483647L) {
                track2 = track2.copyWithFormat(track2.format.buildUpon().setAverageBitrate((int) scaleLargeValue).build());
            }
        }
        int[] iArr11 = iArr10;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        long[] jArr8 = track2.editListDurations;
        if (jArr8 == null) {
            Util.scaleLargeTimestampsInPlace(jArr3, 1000000L, track2.timescale);
            return new TrackSampleTable(track2, jArr, iArr3, i4, jArr3, iArr11, scaleLargeTimestamp);
        }
        if (jArr8.length == 1 && track2.type == 1 && jArr3.length >= 2) {
            long j13 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale) + j13;
            if (canApplyEditWithGaplessInfo(jArr3, j, j13, scaleLargeTimestamp2)) {
                long j14 = j - scaleLargeTimestamp2;
                long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j13 - jArr3[0], track2.format.sampleRate, track2.timescale);
                long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j14, track2.format.sampleRate, track2.timescale);
                if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr3, 1000000L, track2.timescale);
                    return new TrackSampleTable(track2, jArr, iArr3, i4, jArr3, iArr11, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                }
            }
        }
        long[] jArr9 = track2.editListDurations;
        if (jArr9.length == 1 && jArr9[0] == 0) {
            long j15 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            for (int i35 = 0; i35 < jArr3.length; i35++) {
                jArr3[i35] = Util.scaleLargeTimestamp(jArr3[i35] - j15, 1000000L, track2.timescale);
            }
            return new TrackSampleTable(track2, jArr, iArr3, i4, jArr3, iArr11, Util.scaleLargeTimestamp(j - j15, 1000000L, track2.timescale));
        }
        boolean z5 = track2.type == 1;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
        int i36 = 0;
        boolean z6 = false;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            long[] jArr11 = track2.editListDurations;
            if (i36 >= jArr11.length) {
                break;
            }
            int i39 = i4;
            long j16 = jArr10[i36];
            if (j16 != -1) {
                long j17 = jArr11[i36];
                iArr4 = iArr3;
                i15 = sampleCount;
                boolean z7 = z6;
                int i40 = i37;
                long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(j17, track2.timescale, track2.movieTimescale);
                iArr12[i36] = Util.binarySearchFloor(jArr3, j16, true, true);
                long j18 = j16 + scaleLargeTimestamp5;
                iArr13[i36] = Util.binarySearchCeil(jArr3, j18, z5, false);
                int i41 = iArr12[i36];
                while (true) {
                    i17 = iArr12[i36];
                    iArr5 = iArr11;
                    if (i17 < 0 || (iArr5[i17] & 1) != 0) {
                        break;
                    }
                    iArr12[i36] = i17 - 1;
                    iArr11 = iArr5;
                }
                if (i17 < 0) {
                    iArr12[i36] = i41;
                    while (true) {
                        int i42 = iArr12[i36];
                        if (i42 >= iArr13[i36] || (iArr5[i42] & 1) != 0) {
                            break;
                        }
                        iArr12[i36] = i42 + 1;
                    }
                }
                if (track2.type == 2 && iArr12[i36] != iArr13[i36]) {
                    while (true) {
                        int i43 = iArr13[i36];
                        if (i43 >= jArr3.length - 1 || jArr3[i43 + 1] > j18) {
                            break;
                        }
                        iArr13[i36] = i43 + 1;
                    }
                }
                int i44 = iArr13[i36];
                int i45 = iArr12[i36];
                i16 = i40 + (i44 - i45);
                z3 = z7 | (i38 != i45);
                i38 = i44;
            } else {
                iArr4 = iArr3;
                i15 = sampleCount;
                int i46 = i37;
                iArr5 = iArr11;
                z3 = z6;
                i16 = i46;
            }
            i36++;
            iArr11 = iArr5;
            z6 = z3;
            iArr3 = iArr4;
            i37 = i16;
            i4 = i39;
            sampleCount = i15;
        }
        int[] iArr14 = iArr3;
        int i47 = i37;
        int i48 = i4;
        int[] iArr15 = iArr11;
        boolean z8 = z6 | (i47 != sampleCount);
        long[] jArr12 = z8 ? new long[i47] : jArr;
        int[] iArr16 = z8 ? new int[i47] : iArr14;
        int i49 = z8 ? 0 : i48;
        int[] iArr17 = z8 ? new int[i47] : iArr15;
        long[] jArr13 = new long[i47];
        int i50 = i49;
        int i51 = 0;
        int i52 = 0;
        long j19 = 0;
        boolean z9 = false;
        while (i51 < track2.editListDurations.length) {
            long j20 = track2.editListMediaTimes[i51];
            int i53 = iArr12[i51];
            int[] iArr18 = iArr12;
            int i54 = iArr13[i51];
            int[] iArr19 = iArr13;
            if (z8) {
                int i55 = i54 - i53;
                System.arraycopy(jArr, i53, jArr12, i52, i55);
                System.arraycopy(iArr14, i53, iArr16, i52, i55);
                System.arraycopy(iArr15, i53, iArr17, i52, i55);
            }
            int i56 = i50;
            while (i53 < i54) {
                int i57 = i54;
                int[] iArr20 = iArr15;
                long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j19, 1000000L, track2.movieTimescale);
                long[] jArr14 = jArr12;
                long[] jArr15 = jArr;
                long scaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr3[i53] - j20, 1000000L, track2.timescale);
                if (scaleLargeTimestamp7 < 0) {
                    z9 = true;
                }
                jArr13[i52] = scaleLargeTimestamp6 + scaleLargeTimestamp7;
                if (z8 && iArr16[i52] > i56) {
                    i56 = iArr14[i53];
                }
                i52++;
                i53++;
                iArr15 = iArr20;
                i54 = i57;
                jArr = jArr15;
                jArr12 = jArr14;
            }
            j19 += track2.editListDurations[i51];
            i51++;
            iArr15 = iArr15;
            i50 = i56;
            iArr12 = iArr18;
            iArr13 = iArr19;
            jArr12 = jArr12;
        }
        long[] jArr16 = jArr12;
        long scaleLargeTimestamp8 = Util.scaleLargeTimestamp(j19, 1000000L, track2.movieTimescale);
        if (z9) {
            track2 = track2.copyWithFormat(track2.format.buildUpon().setHasPrerollSamples(true).build());
        }
        return new TrackSampleTable(track2, jArr16, iArr16, i50, jArr13, iArr17, scaleLargeTimestamp8);
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Nullable
    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short readShort = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String readString = parsableByteArray.readString(readShort);
        int max = Math.max(readString.lastIndexOf(43), readString.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(readString.substring(0, max)), Float.parseFloat(readString.substring(max, readString.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullBoxVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i = parseFullBoxVersion == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i2 < i) {
                if (parsableByteArray.getData()[position + i2] != -1) {
                    long readUnsignedInt = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (readUnsignedInt != 0) {
                        j = readUnsignedInt;
                    }
                } else {
                    i2++;
                }
            } else {
                parsableByteArray.skipBytes(i);
                break;
            }
        }
        parsableByteArray.skipBytes(10);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(4);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        return new TkhdData(readInt, j, readUnsignedShort, (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) ? 90 : (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) ? 270 : (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) ? 180 : 0);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullBoxVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i = parseFullBoxVersion == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                if (parsableByteArray.getData()[position + i2] != -1) {
                    long readUnsignedInt2 = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (readUnsignedInt2 != 0) {
                        j = Util.scaleLargeTimestamp(readUnsignedInt2, 1000000L, readUnsignedInt);
                    }
                } else {
                    i2++;
                }
            } else {
                parsableByteArray.skipBytes(i);
                break;
            }
        }
        j = -9223372036854775807L;
        return new MdhdData(readUnsignedInt, j, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    @Nullable
    private static String getLanguageFromCode(int i) {
        char[] cArr = {(char) (((i >> 10) & 31) + 96), (char) (((i >> 5) & 31) + 96), (char) ((i & 31) + 96)};
        for (int i2 = 0; i2 < 3; i2++) {
            char c = cArr[i2];
            if (c < 'a' || c > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, @Nullable String str, @Nullable DrmInitData drmInitData, boolean z) throws ParserException {
        int i3;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1748121139 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521 || readInt3 == 1634760241) {
                i3 = position;
                parseVideoSampleEntry(parsableByteArray, readInt3, i3, readInt2, i, str, i2, drmInitData, stsdData, i4);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667 || readInt3 == 1767992678) {
                i3 = position;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData, i4);
            } else {
                if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
                } else if (readInt3 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, readInt3, position, i, stsdData);
                } else if (readInt3 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i).setSampleMimeType("application/x-camera-motion").build();
                }
                i3 = position;
            }
            parsableByteArray.setPosition(i3 + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, @Nullable String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableList = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableList).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, @Nullable String str, int i5, @Nullable DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        String str2;
        String str3;
        DrmInitData drmInitData2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i2;
        int i17 = i3;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i16 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i18 = i;
        if (i18 == 1701733238) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i16, i17);
            if (parseSampleEntryEncryptionData != null) {
                i18 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = "video/3gpp";
        if (i18 != 1831958048) {
            str2 = i18 == 1211250227 ? "video/3gpp" : null;
        } else {
            str2 = "video/mpeg";
        }
        float f2 = 1.0f;
        int i19 = 8;
        int i20 = 8;
        List<byte[]> list = null;
        String str5 = null;
        byte[] bArr = null;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        ByteBuffer byteBuffer = null;
        BtrtData btrtData = null;
        EsdsData esdsData = null;
        NalUnitUtil.H265VpsData h265VpsData = null;
        boolean z = false;
        while (position - i16 < i17) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0) {
                str3 = str4;
                if (parsableByteArray.getPosition() - i16 == i17) {
                    break;
                }
            } else {
                str3 = str4;
            }
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                ExtractorUtil.checkContainerInput(str2 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                List<byte[]> list2 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f2 = parse.pixelWidthHeightRatio;
                }
                String str6 = parse.codecs;
                int i27 = parse.maxNumReorderFrames;
                int i28 = parse.colorSpace;
                drmInitData2 = drmInitData3;
                i9 = readUnsignedShort2;
                i10 = i18;
                i22 = i27;
                i25 = parse.colorRange;
                i26 = parse.colorTransfer;
                i19 = parse.bitdepthLuma;
                list = list2;
                str2 = "video/avc";
                str5 = str6;
                i7 = i28;
                i20 = parse.bitdepthChroma;
            } else {
                if (readInt2 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str2 == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list3 = parse2.initializationData;
                    stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                    if (!z) {
                        f2 = parse2.pixelWidthHeightRatio;
                    }
                    int i29 = parse2.maxNumReorderPics;
                    int i30 = parse2.maxSubLayers;
                    String str7 = parse2.codecs;
                    int i31 = parse2.stereoMode;
                    list = list3;
                    if (i31 != -1) {
                        i21 = i31;
                    }
                    int i32 = parse2.colorSpace;
                    int i33 = parse2.colorRange;
                    int i34 = parse2.colorTransfer;
                    int i35 = parse2.bitdepthLuma;
                    int i36 = parse2.bitdepthChroma;
                    h265VpsData = parse2.vpsData;
                    drmInitData2 = drmInitData3;
                    i9 = readUnsignedShort2;
                    i10 = i18;
                    i25 = i33;
                    i26 = i34;
                    i19 = i35;
                    i22 = i29;
                    str2 = "video/hevc";
                    i23 = i30;
                    i7 = i32;
                    str5 = str7;
                    i20 = i36;
                } else {
                    drmInitData2 = drmInitData3;
                    if (readInt2 == 1818785347) {
                        ExtractorUtil.checkContainerInput("video/hevc".equals(str2), "lhvC must follow hvcC atom");
                        NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
                        ExtractorUtil.checkContainerInput(h265VpsData2 != null && h265VpsData2.layerInfos.size() >= 2, "must have at least two layers");
                        parsableByteArray.setPosition(position2 + 8);
                        HevcConfig parseLayered = HevcConfig.parseLayered(parsableByteArray, (NalUnitUtil.H265VpsData) Assertions.checkNotNull(h265VpsData2));
                        ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == parseLayered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i37 = parseLayered.colorSpace;
                        i7 = i24;
                        if (i37 != -1) {
                            ExtractorUtil.checkContainerInput(i7 == i37, "colorSpace must be the same for both views");
                        }
                        int i38 = parseLayered.colorRange;
                        int i39 = i25;
                        if (i38 != -1) {
                            ExtractorUtil.checkContainerInput(i39 == i38, "colorRange must be the same for both views");
                        }
                        int i40 = parseLayered.colorTransfer;
                        if (i40 != -1) {
                            int i41 = i26;
                            i15 = i41;
                            ExtractorUtil.checkContainerInput(i41 == i40, "colorTransfer must be the same for both views");
                        } else {
                            i15 = i26;
                        }
                        ExtractorUtil.checkContainerInput(i19 == parseLayered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                        ExtractorUtil.checkContainerInput(i20 == parseLayered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                        List<byte[]> list4 = list;
                        if (list4 != null) {
                            list = ImmutableList.builder().addAll((Iterable) list4).addAll((Iterable) parseLayered.initializationData).build();
                        } else {
                            list = list4;
                            ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        h265VpsData = h265VpsData2;
                        str2 = "video/mv-hevc";
                        i9 = readUnsignedShort2;
                        i10 = i18;
                        i25 = i39;
                        i26 = i15;
                        str5 = parseLayered.codecs;
                    } else {
                        List<byte[]> list5 = list;
                        i7 = i24;
                        int i42 = i25;
                        int i43 = i26;
                        NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData;
                        if (readInt2 == 1986361461) {
                            VexuData parseVideoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, readInt);
                            if (parseVideoExtendedUsageBox != null && parseVideoExtendedUsageBox.eyesData != null) {
                                if (h265VpsData3 == null || h265VpsData3.layerInfos.size() < 2) {
                                    i14 = i21;
                                    if (i14 == -1) {
                                        i21 = parseVideoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                                        h265VpsData = h265VpsData3;
                                        i9 = readUnsignedShort2;
                                        i10 = i18;
                                        list = list5;
                                        i25 = i42;
                                        i26 = i43;
                                    }
                                    i21 = i14;
                                    h265VpsData = h265VpsData3;
                                    i9 = readUnsignedShort2;
                                    i10 = i18;
                                    list = list5;
                                    i25 = i42;
                                    i26 = i43;
                                } else {
                                    ExtractorUtil.checkContainerInput(parseVideoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                                    ExtractorUtil.checkContainerInput(!parseVideoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                                }
                            }
                            i14 = i21;
                            i21 = i14;
                            h265VpsData = h265VpsData3;
                            i9 = readUnsignedShort2;
                            i10 = i18;
                            list = list5;
                            i25 = i42;
                            i26 = i43;
                        } else {
                            int i44 = i21;
                            if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                                i8 = i44;
                                i9 = readUnsignedShort2;
                                i10 = i18;
                                i11 = i20;
                                f = f2;
                                i12 = i19;
                                i13 = i43;
                                DolbyVisionConfig parse3 = DolbyVisionConfig.parse(parsableByteArray);
                                if (parse3 != null) {
                                    str2 = "video/dolby-vision";
                                    str5 = parse3.codecs;
                                }
                            } else if (readInt2 == 1987076931) {
                                ExtractorUtil.checkContainerInput(str2 == null, null);
                                String str8 = i18 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                parsableByteArray.setPosition(position2 + 12);
                                byte readUnsignedByte = (byte) parsableByteArray.readUnsignedByte();
                                byte readUnsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                i20 = readUnsignedByte3 >> 4;
                                byte b = (byte) ((readUnsignedByte3 >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    list5 = CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(readUnsignedByte, readUnsignedByte2, (byte) i20, b);
                                }
                                boolean z2 = (readUnsignedByte3 & 1) != 0;
                                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                                int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
                                int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedByte4);
                                i25 = z2 ? 1 : 2;
                                i26 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedByte5);
                                str2 = str8;
                                i9 = readUnsignedShort2;
                                i19 = i20;
                                h265VpsData = h265VpsData3;
                                i7 = isoColorPrimariesToColorSpace;
                                list = list5;
                                i21 = i44;
                                i10 = i18;
                            } else if (readInt2 == 1635135811) {
                                int i45 = readInt - 8;
                                byte[] bArr2 = new byte[i45];
                                parsableByteArray.readBytes(bArr2, 0, i45);
                                list = ImmutableList.of(bArr2);
                                parsableByteArray.setPosition(position2 + 8);
                                ColorInfo parseAv1c = parseAv1c(parsableByteArray);
                                int i46 = parseAv1c.lumaBitdepth;
                                int i47 = parseAv1c.chromaBitdepth;
                                i7 = parseAv1c.colorSpace;
                                int i48 = parseAv1c.colorRange;
                                i26 = parseAv1c.colorTransfer;
                                i19 = i46;
                                i9 = readUnsignedShort2;
                                i10 = i18;
                                i25 = i48;
                                h265VpsData = h265VpsData3;
                                i21 = i44;
                                i20 = i47;
                                str2 = "video/av01";
                            } else if (readInt2 == 1668050025) {
                                if (byteBuffer == null) {
                                    byteBuffer = allocateHdrStaticInfo();
                                }
                                ByteBuffer byteBuffer2 = byteBuffer;
                                byteBuffer2.position(21);
                                byteBuffer2.putShort(parsableByteArray.readShort());
                                byteBuffer2.putShort(parsableByteArray.readShort());
                                byteBuffer = byteBuffer2;
                                i9 = readUnsignedShort2;
                                i10 = i18;
                                h265VpsData = h265VpsData3;
                                list = list5;
                                i25 = i42;
                                i26 = i43;
                                i21 = i44;
                            } else {
                                if (readInt2 == 1835295606) {
                                    if (byteBuffer == null) {
                                        byteBuffer = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer3 = byteBuffer;
                                    short readShort = parsableByteArray.readShort();
                                    short readShort2 = parsableByteArray.readShort();
                                    i10 = i18;
                                    short readShort3 = parsableByteArray.readShort();
                                    short readShort4 = parsableByteArray.readShort();
                                    int i49 = i20;
                                    short readShort5 = parsableByteArray.readShort();
                                    int i50 = i19;
                                    short readShort6 = parsableByteArray.readShort();
                                    i8 = i44;
                                    short readShort7 = parsableByteArray.readShort();
                                    float f3 = f2;
                                    short readShort8 = parsableByteArray.readShort();
                                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                                    long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                                    i9 = readUnsignedShort2;
                                    byteBuffer3.position(1);
                                    byteBuffer3.putShort(readShort5);
                                    byteBuffer3.putShort(readShort6);
                                    byteBuffer3.putShort(readShort);
                                    byteBuffer3.putShort(readShort2);
                                    byteBuffer3.putShort(readShort3);
                                    byteBuffer3.putShort(readShort4);
                                    byteBuffer3.putShort(readShort7);
                                    byteBuffer3.putShort(readShort8);
                                    byteBuffer3.putShort((short) (readUnsignedInt / 10000));
                                    byteBuffer3.putShort((short) (readUnsignedInt2 / 10000));
                                    byteBuffer = byteBuffer3;
                                    i20 = i49;
                                    i19 = i50;
                                    list = list5;
                                    i25 = i42;
                                    i26 = i43;
                                    f2 = f3;
                                } else {
                                    i8 = i44;
                                    i9 = readUnsignedShort2;
                                    i10 = i18;
                                    i11 = i20;
                                    f = f2;
                                    i12 = i19;
                                    if (readInt2 == 1681012275) {
                                        ExtractorUtil.checkContainerInput(str2 == null, null);
                                        str2 = str3;
                                    } else if (readInt2 == 1702061171) {
                                        ExtractorUtil.checkContainerInput(str2 == null, null);
                                        esdsData = parseEsdsFromParent(parsableByteArray, position2);
                                        String str9 = esdsData.mimeType;
                                        byte[] bArr3 = esdsData.initializationData;
                                        list = bArr3 != null ? ImmutableList.of(bArr3) : list5;
                                        str2 = str9;
                                        i20 = i11;
                                        i19 = i12;
                                        i25 = i42;
                                        i26 = i43;
                                        f2 = f;
                                    } else if (readInt2 == 1651798644) {
                                        btrtData = parseBtrtFromParent(parsableByteArray, position2);
                                    } else {
                                        if (readInt2 == 1885434736) {
                                            f2 = parsePaspFromParent(parsableByteArray, position2);
                                            i20 = i11;
                                            i19 = i12;
                                            list = list5;
                                            i25 = i42;
                                            i26 = i43;
                                            z = true;
                                        } else if (readInt2 == 1937126244) {
                                            bArr = parseProjFromParent(parsableByteArray, position2, readInt);
                                        } else if (readInt2 == 1936995172) {
                                            int readUnsignedByte6 = parsableByteArray.readUnsignedByte();
                                            parsableByteArray.skipBytes(3);
                                            if (readUnsignedByte6 == 0) {
                                                int readUnsignedByte7 = parsableByteArray.readUnsignedByte();
                                                if (readUnsignedByte7 == 0) {
                                                    i8 = 0;
                                                } else if (readUnsignedByte7 == 1) {
                                                    i8 = 1;
                                                } else if (readUnsignedByte7 == 2) {
                                                    i8 = 2;
                                                } else if (readUnsignedByte7 == 3) {
                                                    i8 = 3;
                                                }
                                            }
                                        } else if (readInt2 == 1634760259) {
                                            int i51 = readInt - 12;
                                            byte[] bArr4 = new byte[i51];
                                            parsableByteArray.setPosition(position2 + 12);
                                            parsableByteArray.readBytes(bArr4, 0, i51);
                                            list = ImmutableList.of(bArr4);
                                            ColorInfo parseApvc = parseApvc(new ParsableByteArray(bArr4));
                                            int i52 = parseApvc.lumaBitdepth;
                                            int i53 = parseApvc.chromaBitdepth;
                                            int i54 = parseApvc.colorSpace;
                                            int i55 = parseApvc.colorRange;
                                            i26 = parseApvc.colorTransfer;
                                            i19 = i52;
                                            i20 = i53;
                                            i25 = i55;
                                            f2 = f;
                                            i7 = i54;
                                            str2 = "video/apv";
                                            h265VpsData = h265VpsData3;
                                            i21 = i8;
                                        } else if (readInt2 == 1668246642) {
                                            i13 = i43;
                                            if (i7 == -1 && i13 == -1) {
                                                int readInt3 = parsableByteArray.readInt();
                                                if (readInt3 == TYPE_nclx || readInt3 == TYPE_nclc) {
                                                    int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                                                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                                                    parsableByteArray.skipBytes(2);
                                                    boolean z3 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                    int isoColorPrimariesToColorSpace2 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                                                    int i56 = z3 ? 1 : 2;
                                                    i20 = i11;
                                                    i19 = i12;
                                                    list = list5;
                                                    f2 = f;
                                                    i26 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                                                    i25 = i56;
                                                    i7 = isoColorPrimariesToColorSpace2;
                                                } else {
                                                    Log.w(TAG, "Unsupported color type: " + Mp4Box.getBoxTypeString(readInt3));
                                                }
                                            }
                                        } else {
                                            i13 = i43;
                                        }
                                        int i57 = i8;
                                        h265VpsData = h265VpsData3;
                                        i21 = i57;
                                    }
                                    i20 = i11;
                                    i19 = i12;
                                    list = list5;
                                    i25 = i42;
                                    i26 = i43;
                                    f2 = f;
                                }
                                int i572 = i8;
                                h265VpsData = h265VpsData3;
                                i21 = i572;
                            }
                            i20 = i11;
                            i19 = i12;
                            list = list5;
                            i25 = i42;
                            f2 = f;
                            i26 = i13;
                            int i5722 = i8;
                            h265VpsData = h265VpsData3;
                            i21 = i5722;
                        }
                    }
                }
                position += readInt;
                i16 = i2;
                i17 = i3;
                stsdData2 = stsdData;
                i18 = i10;
                drmInitData3 = drmInitData2;
                readUnsignedShort2 = i9;
                i24 = i7;
                str4 = str3;
            }
            position += readInt;
            i16 = i2;
            i17 = i3;
            stsdData2 = stsdData;
            i18 = i10;
            drmInitData3 = drmInitData2;
            readUnsignedShort2 = i9;
            i24 = i7;
            str4 = str3;
        }
        DrmInitData drmInitData4 = drmInitData3;
        int i58 = readUnsignedShort2;
        float f4 = f2;
        List<byte[]> list6 = list;
        int i59 = i21;
        int i60 = i24;
        int i61 = i25;
        int i62 = i26;
        int i63 = i20;
        int i64 = i19;
        if (str2 == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i4).setSampleMimeType(str2).setCodecs(str5).setWidth(readUnsignedShort).setHeight(i58).setPixelWidthHeightRatio(f4).setRotationDegrees(i5).setProjectionData(bArr).setStereoMode(i59).setInitializationData(list6).setMaxNumReorderSamples(i22).setMaxSubLayers(i23).setDrmInitData(drmInitData4).setLanguage(str).setColorInfo(new ColorInfo.Builder().setColorSpace(i60).setColorRange(i61).setColorTransfer(i62).setHdrStaticInfo(byteBuffer != null ? byteBuffer.array() : null).setLumaBitdepth(i64).setChromaBitdepth(i63).build());
        if (btrtData != null) {
            colorInfo.setAverageBitrate(Ints.saturatedCast(btrtData.avgBitrate)).setPeakBitrate(Ints.saturatedCast(btrtData.maxBitrate));
        } else if (esdsData != null) {
            colorInfo.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int readBits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean readBit = parsableBitArray.readBit();
        boolean readBit2 = parsableBitArray.readBit();
        if (readBits == 2 && readBit) {
            builder.setLumaBitdepth(readBit2 ? 12 : 10);
            builder.setChromaBitdepth(readBit2 ? 12 : 10);
        } else if (readBits <= 2) {
            builder.setLumaBitdepth(readBit ? 10 : 8);
            builder.setChromaBitdepth(readBit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int readBits2 = parsableBitArray.readBits(4);
        if (readBits2 != 1) {
            Log.i(TAG, "Unsupported obu_type: " + readBits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean readBit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (readBit3 && parsableBitArray.readBits(8) > 127) {
            Log.i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int readBits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int readBits4 = parsableBitArray.readBits(5);
        boolean z = false;
        for (int i = 0; i <= readBits4; i++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int readBits5 = parsableBitArray.readBits(4);
        int readBits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(readBits5 + 1);
        parsableBitArray.skipBits(readBits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean readBit4 = parsableBitArray.readBit();
        if (readBit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (readBit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean readBit5 = parsableBitArray.readBit();
        if (readBits3 == 2 && readBit5) {
            parsableBitArray.skipBit();
        }
        if (readBits3 != 1 && parsableBitArray.readBit()) {
            z = true;
        }
        if (parsableBitArray.readBit()) {
            int readBits7 = parsableBitArray.readBits(8);
            int readBits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(readBits7)).setColorRange(((z || readBits7 != 1 || readBits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits8));
        }
        return builder.build();
    }

    private static ColorInfo parseApvc(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int readBits = parsableBitArray.readBits(8);
        for (int i = 0; i < readBits; i++) {
            parsableBitArray.skipBytes(1);
            int readBits2 = parsableBitArray.readBits(8);
            for (int i2 = 0; i2 < readBits2; i2++) {
                parsableBitArray.skipBits(6);
                boolean readBit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int readBits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(readBits3);
                builder.setChromaBitdepth(readBits3);
                parsableBitArray.skipBytes(1);
                if (readBit) {
                    int readBits4 = parsableBitArray.readBits(8);
                    int readBits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(readBits4)).setColorRange(parsableBitArray.readBit() ? 1 : 2).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits5));
                }
            }
        }
        return builder.build();
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(1701606260);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            jArr[i] = parseFullBoxVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullBoxVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, @Nullable String str, boolean z, @Nullable DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int i6;
        int readUnsignedShort;
        int readUnsignedFixedPoint1616;
        int readInt;
        int i7;
        String str2;
        int i8;
        String str3;
        String format;
        ImmutableList of;
        int i9 = i;
        int i10 = i2;
        int i11 = i3;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i10 + 16);
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            readInt = parsableByteArray.readInt();
            if (i6 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i7 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            readUnsignedShort = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            int readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            boolean z2 = (readUnsignedIntToInt2 & 1) != 0;
            boolean z3 = (readUnsignedIntToInt2 & 2) != 0;
            if (!z2) {
                if (readUnsignedIntToInt == 8) {
                    i7 = 3;
                } else if (readUnsignedIntToInt == 16) {
                    i7 = z3 ? 268435456 : 2;
                } else if (readUnsignedIntToInt == 24) {
                    i7 = z3 ? 1342177280 : 21;
                } else {
                    if (readUnsignedIntToInt == 32) {
                        i7 = z3 ? 1610612736 : 22;
                    }
                    i7 = -1;
                }
                parsableByteArray.skipBytes(8);
                readInt = 0;
            } else {
                if (readUnsignedIntToInt == 32) {
                    i7 = 4;
                    parsableByteArray.skipBytes(8);
                    readInt = 0;
                }
                i7 = -1;
                parsableByteArray.skipBytes(8);
                readInt = 0;
            }
        }
        if (i9 == 1767992678) {
            readUnsignedFixedPoint1616 = -1;
            readUnsignedShort = -1;
        } else {
            if (i9 != 1935764850) {
                readUnsignedFixedPoint1616 = i9 == 1935767394 ? 16000 : 8000;
            }
            readUnsignedShort = 1;
        }
        int position = parsableByteArray.getPosition();
        if (i9 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i10, i11);
            if (parseSampleEntryEncryptionData != null) {
                i9 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = "audio/mhm1";
        if (i9 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i9 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i9 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i9 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i9 == 1685353320 || i9 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i9 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i9 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i9 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i9 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i9 != 1936684916) {
                if (i9 == 1953984371) {
                    str2 = "audio/raw";
                    i8 = 268435456;
                } else if (i9 == 1819304813) {
                    if (i7 != -1) {
                        i8 = i7;
                        str2 = "audio/raw";
                    }
                } else if (i9 == 778924082 || i9 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i9 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i9 == 1835560241) {
                    i8 = i7;
                    str2 = "audio/mhm1";
                } else if (i9 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i9 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i9 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i9 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i9 == 1716281667) {
                    str2 = "audio/flac";
                } else if (i9 == 1835823201) {
                    str2 = "audio/true-hd";
                } else if (i9 == 1767992678) {
                    str2 = "audio/iamf";
                } else {
                    i8 = i7;
                    str2 = null;
                }
                int i12 = i8;
                String str5 = null;
                List<byte[]> list = null;
                EsdsData esdsData = null;
                BtrtData btrtData = null;
                while (position - i10 < i11) {
                    parsableByteArray.setPosition(position);
                    int readInt2 = parsableByteArray.readInt();
                    ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
                    int readInt3 = parsableByteArray.readInt();
                    if (readInt3 == 1835557187) {
                        parsableByteArray.setPosition(position + 8);
                        parsableByteArray.skipBytes(1);
                        int readUnsignedByte = parsableByteArray.readUnsignedByte();
                        parsableByteArray.skipBytes(1);
                        if (Objects.equals(str2, str4)) {
                            format = String.format("mhm1.%02X", Integer.valueOf(readUnsignedByte));
                        } else {
                            format = String.format("mha1.%02X", Integer.valueOf(readUnsignedByte));
                        }
                        String str6 = format;
                        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                        byte[] bArr = new byte[readUnsignedShort2];
                        parsableByteArray.readBytes(bArr, 0, readUnsignedShort2);
                        if (list == null) {
                            of = ImmutableList.of(bArr);
                        } else {
                            of = ImmutableList.of(bArr, list.get(0));
                        }
                        list = of;
                        str5 = str6;
                    } else {
                        if (readInt3 == 1835557200) {
                            parsableByteArray.setPosition(position + 8);
                            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                            if (readUnsignedByte2 > 0) {
                                byte[] bArr2 = new byte[readUnsignedByte2];
                                str3 = str4;
                                parsableByteArray.readBytes(bArr2, 0, readUnsignedByte2);
                                if (list == null) {
                                    list = ImmutableList.of(bArr2);
                                } else {
                                    list = ImmutableList.of(list.get(0), bArr2);
                                }
                            }
                        } else {
                            str3 = str4;
                            if (readInt3 == 1702061171 || (z && readInt3 == 2002876005)) {
                                int findBoxPosition = readInt3 == 1702061171 ? position : findBoxPosition(parsableByteArray, 1702061171, position, readInt2);
                                if (findBoxPosition != -1) {
                                    esdsData = parseEsdsFromParent(parsableByteArray, findBoxPosition);
                                    str2 = esdsData.mimeType;
                                    byte[] bArr3 = esdsData.initializationData;
                                    if (bArr3 != null) {
                                        if ("audio/vorbis".equals(str2)) {
                                            list = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                        } else {
                                            if ("audio/mp4a-latm".equals(str2)) {
                                                AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                                int i13 = parseAudioSpecificConfig.sampleRateHz;
                                                int i14 = parseAudioSpecificConfig.channelCount;
                                                str5 = parseAudioSpecificConfig.codecs;
                                                readUnsignedFixedPoint1616 = i13;
                                                readUnsignedShort = i14;
                                            }
                                            list = ImmutableList.of(bArr3);
                                        }
                                    }
                                }
                            } else if (readInt3 == 1651798644) {
                                btrtData = parseBtrtFromParent(parsableByteArray, position);
                            } else if (readInt3 == 1684103987) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                            } else if (readInt3 == 1684366131) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                            } else if (readInt3 == 1684103988) {
                                parsableByteArray.setPosition(position + 8);
                                stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                            } else if (readInt3 == 1684892784) {
                                if (readInt <= 0) {
                                    throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + readInt, null);
                                }
                                readUnsignedFixedPoint1616 = readInt;
                                readUnsignedShort = 2;
                            } else if (readInt3 == 1684305011 || readInt3 == 1969517683) {
                                stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setChannelCount(readUnsignedShort).setSampleRate(readUnsignedFixedPoint1616).setDrmInitData(drmInitData2).setLanguage(str).build();
                            } else if (readInt3 == 1682927731) {
                                int i15 = readInt2 - 8;
                                byte[] bArr4 = opusMagic;
                                byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i15);
                                parsableByteArray.setPosition(position + 8);
                                parsableByteArray.readBytes(copyOf, bArr4.length, i15);
                                list = OpusUtil.buildInitializationData(copyOf);
                            } else if (readInt3 == 1684425825) {
                                byte[] bArr5 = new byte[readInt2 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr5, 4, readInt2 - 12);
                                list = ImmutableList.of(bArr5);
                            } else if (readInt3 == 1634492771) {
                                int i16 = readInt2 - 12;
                                byte[] bArr6 = new byte[i16];
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr6, 0, i16);
                                Pair<Integer, Integer> parseAlacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                int intValue = ((Integer) parseAlacAudioSpecificConfig.first).intValue();
                                int intValue2 = ((Integer) parseAlacAudioSpecificConfig.second).intValue();
                                list = ImmutableList.of(bArr6);
                                readUnsignedFixedPoint1616 = intValue;
                                readUnsignedShort = intValue2;
                            } else if (readInt3 == 1767990114) {
                                parsableByteArray.setPosition(position + 9);
                                int readUnsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
                                byte[] bArr7 = new byte[readUnsignedLeb128ToInt];
                                parsableByteArray.readBytes(bArr7, 0, readUnsignedLeb128ToInt);
                                list = ImmutableList.of(bArr7);
                            }
                            position += readInt2;
                            i10 = i2;
                            i11 = i3;
                            str4 = str3;
                        }
                        position += readInt2;
                        i10 = i2;
                        i11 = i3;
                        str4 = str3;
                    }
                    str3 = str4;
                    position += readInt2;
                    i10 = i2;
                    i11 = i3;
                    str4 = str3;
                }
                if (stsdData.format != null || str2 == null) {
                    return;
                }
                Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str2).setCodecs(str5).setChannelCount(readUnsignedShort).setSampleRate(readUnsignedFixedPoint1616).setPcmEncoding(i12).setInitializationData(list).setDrmInitData(drmInitData2).setLanguage(str);
                if (esdsData != null) {
                    language.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
                } else if (btrtData != null) {
                    language.setAverageBitrate(Ints.saturatedCast(btrtData.avgBitrate)).setPeakBitrate(Ints.saturatedCast(btrtData.maxBitrate));
                }
                stsdData.format = language.build();
                return;
            }
            str2 = "audio/raw";
            i8 = 2;
            int i122 = i8;
            String str52 = null;
            List<byte[]> list2 = null;
            EsdsData esdsData2 = null;
            BtrtData btrtData2 = null;
            while (position - i10 < i11) {
            }
            if (stsdData.format != null) {
                return;
            } else {
                return;
            }
        }
        i8 = i7;
        int i1222 = i8;
        String str522 = null;
        List<byte[]> list22 = null;
        EsdsData esdsData22 = null;
        BtrtData btrtData22 = null;
        while (position - i10 < i11) {
        }
        if (stsdData.format != null) {
        }
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, readUnsignedInt2 > 0 ? readUnsignedInt2 : -1L, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    private static BtrtData parseBtrtFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        parsableByteArray.skipBytes(4);
        return new BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    @Nullable
    static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        EyesData eyesData = null;
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                eyesData = parseStereoViewBox(parsableByteArray, position, readInt);
            }
            position += readInt;
        }
        if (eyesData == null) {
            return null;
        }
        return new VexuData(eyesData);
    }

    @Nullable
    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                return new EyesData(new StriData((readUnsignedByte & 1) == 1, (readUnsignedByte & 2) == 2, (readUnsignedByte & 8) == 8));
            }
            position += readInt;
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    @Nullable
    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private BoxParser() {
    }

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long readUnsignedInt;
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                readUnsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                readUnsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = readUnsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private static final class TkhdData {
        private final int alternateGroup;
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2, int i3) {
            this.id = i;
            this.duration = j;
            this.alternateGroup = i2;
            this.rotationDegrees = i3;
        }
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    private static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    private static final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j, long j2) {
            this.avgBitrate = j;
            this.maxBitrate = j2;
        }
    }

    private static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z, boolean z2, boolean z3) {
            this.hasLeftEyeView = z;
            this.hasRightEyeView = z2;
            this.eyeViewsReversed = z3;
        }
    }

    private static final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }
    }

    private static final class MdhdData {

        @Nullable
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j, long j2, @Nullable String str) {
            this.timescale = j;
            this.mediaDurationUs = j2;
            this.language = str;
        }
    }

    static final class VexuData {

        @Nullable
        private final EyesData eyesData;

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // io.bidmachine.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // io.bidmachine.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // io.bidmachine.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // io.bidmachine.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // io.bidmachine.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // io.bidmachine.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 == 0) {
                int readUnsignedByte = this.data.readUnsignedByte();
                this.currentByte = readUnsignedByte;
                return (readUnsignedByte & 240) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}

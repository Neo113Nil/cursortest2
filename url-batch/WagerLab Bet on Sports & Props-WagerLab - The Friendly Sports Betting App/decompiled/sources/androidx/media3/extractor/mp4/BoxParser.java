package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.collection.SieveCacheKt;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.mp4.FixedSampleSizeRechunker;
import androidx.media3.extractor.ts.PsExtractor;
import com.facebook.imagepipeline.common.RotationOptions;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
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
        return i & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int parseFullBoxVersion(int i) {
        return (i >> 24) & 255;
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j, DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Track apply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerBox.containerChildren.size(); i++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i);
            if (containerBox2.type == 1953653099 && (apply = function.apply(parseTrak(containerBox2, (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(apply, (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_mdia))).getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl)), gaplessInfoHolder));
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

    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_keys);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ilst);
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

    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<long[], long[]> parseEdts;
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(Mp4Box.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_tkhd))).data);
        long j2 = C.TIME_UNSET;
        long j3 = j == C.TIME_UNSET ? parseTkhd.duration : j;
        long j4 = parseMvhd(leafBox.data).timescale;
        if (j3 != C.TIME_UNSET) {
            j2 = Util.scaleLargeTimestamp(j3, 1000000L, j4);
        }
        long j5 = j2;
        Mp4Box.ContainerBox containerBox3 = (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl));
        MdhdData parseMdhd = parseMdhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_mdhd))).data);
        Mp4Box.LeafBox leafBoxOfType = containerBox3.getLeafBoxOfType(Mp4Box.TYPE_stsd);
        if (leafBoxOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData parseStsd = parseStsd(leafBoxOfType.data, parseTkhd.id, parseTkhd.rotationDegrees, parseMdhd.language, drmInitData, z2);
        if (z || (containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_edts)) == null || (parseEdts = parseEdts(containerBoxOfType)) == null) {
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
        return new Track(parseTkhd.id, trackTypeForHdlr, parseMdhd.timescale, j4, j5, parseMdhd.mediaDurationUs, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TrackSampleTable parseStbl(Track track, Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Track track2;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i7;
        int[] iArr2;
        int i8;
        Track track3;
        long[] jArr3;
        int i9;
        long j;
        int i10;
        int i11;
        int i12;
        int i13;
        Track track4 = track;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsz);
        if (leafBoxOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafBoxOfType, track4.format);
        } else {
            Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stz2);
            if (leafBoxOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafBoxOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track4, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (track4.type == 2 && track4.mediaDurationUs > 0) {
            track4 = track4.copyWithFormat(track4.format.buildUpon().setFrameRate(sampleCount / (track4.mediaDurationUs / 1000000.0f)).build());
        }
        Track track5 = track4;
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stco);
        if (leafBoxOfType3 == null) {
            leafBoxOfType3 = (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_co64));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stts))).data;
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafBoxOfType4 != null ? leafBoxOfType4.data : null;
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ctts);
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
                i4 = 0;
            } else {
                i2 = -1;
                i4 = 0;
                parsableByteArray4 = null;
            }
        } else {
            i2 = -1;
            i3 = 0;
            i4 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track5.format.sampleMimeType;
        if (((fixedSampleSize == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && readUnsignedIntToInt == 0 && i == 0 && i3 == 0)) ? i4 : 1) != 0) {
            long[] jArr4 = new long[chunkIterator.length];
            int[] iArr3 = new int[chunkIterator.length];
            while (chunkIterator.moveNext()) {
                jArr4[chunkIterator.index] = chunkIterator.offset;
                iArr3[chunkIterator.index] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr4, iArr3, readUnsignedIntToInt3);
            long[] jArr5 = rechunk.offsets;
            iArr = rechunk.sizes;
            int i14 = rechunk.maximumSize;
            jArr2 = rechunk.timestamps;
            iArr2 = rechunk.flags;
            jArr3 = jArr5;
            i9 = i14;
            i5 = 1;
            j = rechunk.duration;
            track3 = track5;
        } else {
            long[] jArr6 = new long[sampleCount];
            int[] iArr4 = new int[sampleCount];
            long[] jArr7 = new long[sampleCount];
            i5 = 1;
            int[] iArr5 = new int[sampleCount];
            ParsableByteArray parsableByteArray6 = parsableByteArray5;
            SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
            int i15 = readUnsignedIntToInt3;
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            long j2 = 0;
            long j3 = 0;
            int i16 = i2;
            int i17 = i4;
            int i18 = i17;
            int i19 = i18;
            int i20 = i19;
            int i21 = readUnsignedIntToInt2;
            int i22 = readUnsignedIntToInt;
            int i23 = i20;
            while (true) {
                if (i17 >= sampleCount) {
                    i6 = i22;
                    track2 = track5;
                    jArr = jArr6;
                    iArr = iArr4;
                    jArr2 = jArr7;
                    i7 = i19;
                    iArr2 = iArr5;
                    break;
                }
                long j4 = j3;
                int i24 = i19;
                boolean z2 = true;
                while (i24 == 0) {
                    z2 = chunkIterator.moveNext();
                    if (!z2) {
                        break;
                    }
                    int i25 = i22;
                    long j5 = chunkIterator.offset;
                    i24 = chunkIterator.numSamples;
                    j4 = j5;
                    track5 = track5;
                    i22 = i25;
                    sampleCount = sampleCount;
                }
                int i26 = sampleCount;
                i6 = i22;
                track2 = track5;
                if (!z2) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    jArr = Arrays.copyOf(jArr6, i17);
                    int[] copyOf = Arrays.copyOf(iArr4, i17);
                    jArr2 = Arrays.copyOf(jArr7, i17);
                    iArr2 = Arrays.copyOf(iArr5, i17);
                    i7 = i24;
                    iArr = copyOf;
                    sampleCount = i17;
                    break;
                }
                if (parsableByteArray6 != null) {
                    int i27 = i20;
                    while (i27 == 0 && i > 0) {
                        i27 = parsableByteArray6.readUnsignedIntToInt();
                        i18 = parsableByteArray6.readInt();
                        i--;
                    }
                    i20 = i27 - 1;
                }
                jArr6[i17] = j4;
                int readNextSampleSize = sampleSizeBox.readNextSampleSize();
                iArr4[i17] = readNextSampleSize;
                if (readNextSampleSize > i23) {
                    i23 = readNextSampleSize;
                }
                jArr7[i17] = j2 + i18;
                iArr5[i17] = parsableByteArray7 == null ? 1 : i4;
                if (i17 == i16) {
                    iArr5[i17] = 1;
                    i3--;
                    if (i3 > 0) {
                        i16 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                    }
                }
                j2 += i15;
                i21--;
                if (i21 != 0 || i6 <= 0) {
                    i22 = i6;
                } else {
                    i22 = i6 - 1;
                    i21 = parsableByteArray3.readUnsignedIntToInt();
                    i15 = parsableByteArray3.readInt();
                }
                long j6 = j4 + iArr4[i17];
                i19 = i24 - 1;
                i17++;
                track5 = track2;
                j3 = j6;
                sampleCount = i26;
            }
            long j7 = j2 + i18;
            if (parsableByteArray6 != null) {
                while (i > 0) {
                    if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                        i8 = i4;
                        break;
                    }
                    parsableByteArray6.readInt();
                    i--;
                }
            }
            i8 = 1;
            if (i3 == 0 && i21 == 0 && i7 == 0 && i6 == 0 && i20 == 0 && i8 != 0) {
                track3 = track2;
            } else {
                track3 = track2;
                Log.w(TAG, "Inconsistent stbl box for track " + track3.id + ": remainingSynchronizationSamples " + i3 + ", remainingSamplesAtTimestampDelta " + i21 + ", remainingSamplesInChunk " + i7 + ", remainingTimestampDeltaChanges " + i6 + ", remainingSamplesAtTimestampOffset " + i20 + (i8 == 0 ? ", ctts invalid" : ""));
            }
            jArr3 = jArr;
            i9 = i23;
            j = j7;
        }
        long[] jArr8 = jArr2;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track3.timescale);
        if (track3.editListDurations == null) {
            Util.scaleLargeTimestampsInPlace(jArr8, 1000000L, track3.timescale);
            return new TrackSampleTable(track3, jArr3, iArr, i9, jArr8, iArr2, scaleLargeTimestamp);
        }
        Track track6 = track3;
        int[] iArr6 = iArr;
        int[] iArr7 = iArr2;
        int i28 = i5;
        if (track6.editListDurations.length == i28 && track6.type == i28 && jArr8.length >= 2) {
            long j8 = ((long[]) Assertions.checkNotNull(track6.editListMediaTimes))[i4];
            long scaleLargeTimestamp2 = j8 + Util.scaleLargeTimestamp(track6.editListDurations[i4], track6.timescale, track6.movieTimescale);
            if (canApplyEditWithGaplessInfo(jArr8, j, j8, scaleLargeTimestamp2)) {
                long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j8 - jArr8[i4], track6.format.sampleRate, track6.timescale);
                long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - scaleLargeTimestamp2, track6.format.sampleRate, track6.timescale);
                if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= SieveCacheKt.NodeLinkMask && scaleLargeTimestamp4 <= SieveCacheKt.NodeLinkMask) {
                    gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr8, 1000000L, track6.timescale);
                    return new TrackSampleTable(track6, jArr3, iArr6, i9, jArr8, iArr7, Util.scaleLargeTimestamp(track6.editListDurations[i4], 1000000L, track6.movieTimescale));
                }
            }
        }
        if (track6.editListDurations.length == 1 && track6.editListDurations[i4] == 0) {
            long j9 = ((long[]) Assertions.checkNotNull(track6.editListMediaTimes))[i4];
            for (int i29 = i4; i29 < jArr8.length; i29++) {
                jArr8[i29] = Util.scaleLargeTimestamp(jArr8[i29] - j9, 1000000L, track6.timescale);
            }
            return new TrackSampleTable(track6, jArr3, iArr6, i9, jArr8, iArr7, Util.scaleLargeTimestamp(j - j9, 1000000L, track6.timescale));
        }
        boolean z3 = track6.type == 1 ? 1 : i4;
        int[] iArr8 = new int[track6.editListDurations.length];
        int[] iArr9 = new int[track6.editListDurations.length];
        long[] jArr9 = (long[]) Assertions.checkNotNull(track6.editListMediaTimes);
        int i30 = i4;
        int i31 = i30;
        int i32 = i31;
        int i33 = i32;
        while (i30 < track6.editListDurations.length) {
            int[] iArr10 = iArr8;
            int[] iArr11 = iArr9;
            long j10 = jArr9[i30];
            long[] jArr10 = jArr9;
            if (j10 != -1) {
                int i34 = i30;
                int i35 = i31;
                long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(track6.editListDurations[i30], track6.timescale, track6.movieTimescale);
                i11 = i34;
                iArr10[i11] = Util.binarySearchFloor(jArr8, j10, true, true);
                long j11 = j10 + scaleLargeTimestamp5;
                iArr11[i11] = Util.binarySearchCeil(jArr8, j11, z3, (boolean) i4);
                int i36 = iArr10[i11];
                while (true) {
                    i13 = iArr10[i11];
                    if (i13 < 0 || (iArr7[i13] & 1) != 0) {
                        break;
                    }
                    iArr10[i11] = i13 - 1;
                }
                if (i13 < 0) {
                    iArr10[i11] = i36;
                    while (true) {
                        int i37 = iArr10[i11];
                        if (i37 >= iArr11[i11] || (iArr7[i37] & 1) != 0) {
                            break;
                        }
                        iArr10[i11] = i37 + 1;
                    }
                }
                if (track6.type == 2 && iArr10[i11] != iArr11[i11]) {
                    while (true) {
                        int i38 = iArr11[i11];
                        if (i38 >= jArr8.length - 1 || jArr8[i38 + 1] > j11) {
                            break;
                        }
                        iArr11[i11] = i38 + 1;
                    }
                }
                int i39 = iArr11[i11];
                int i40 = iArr10[i11];
                i32 += i39 - i40;
                i12 = i35 | (i33 != i40 ? 1 : 0);
                i33 = i39;
            } else {
                i11 = i30;
                i12 = i31;
            }
            i30 = i11 + 1;
            jArr9 = jArr10;
            i31 = i12;
            iArr8 = iArr10;
            iArr9 = iArr11;
            i4 = 0;
        }
        int[] iArr12 = iArr8;
        int[] iArr13 = iArr9;
        int i41 = i31 | (i32 != sampleCount ? 1 : 0);
        long[] jArr11 = i41 != 0 ? new long[i32] : jArr3;
        int[] iArr14 = i41 != 0 ? new int[i32] : iArr6;
        if (i41 != 0) {
            i9 = 0;
        }
        int[] iArr15 = i41 != 0 ? new int[i32] : iArr7;
        long[] jArr12 = new long[i32];
        long j12 = 0;
        int i42 = 0;
        int i43 = 0;
        boolean z4 = false;
        while (true) {
            i10 = i9;
            if (i42 >= track6.editListDurations.length) {
                break;
            }
            long j13 = track6.editListMediaTimes[i42];
            int i44 = iArr12[i42];
            int i45 = iArr13[i42];
            if (i41 != 0) {
                int i46 = i45 - i44;
                System.arraycopy(jArr3, i44, jArr11, i43, i46);
                System.arraycopy(iArr6, i44, iArr14, i43, i46);
                System.arraycopy(iArr7, i44, iArr15, i43, i46);
            }
            i9 = i10;
            while (i44 < i45) {
                int i47 = i41;
                long[] jArr13 = jArr11;
                long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j12, 1000000L, track6.movieTimescale);
                long scaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr8[i44] - j13, 1000000L, track6.timescale);
                if (scaleLargeTimestamp7 < 0) {
                    z4 = true;
                }
                jArr12[i43] = scaleLargeTimestamp6 + scaleLargeTimestamp7;
                if (i47 != 0 && iArr14[i43] > i9) {
                    i9 = iArr6[i44];
                }
                i43++;
                i44++;
                i41 = i47;
                jArr11 = jArr13;
            }
            j12 += track6.editListDurations[i42];
            i42++;
            i41 = i41;
        }
        long[] jArr14 = jArr11;
        long scaleLargeTimestamp8 = Util.scaleLargeTimestamp(j12, 1000000L, track6.movieTimescale);
        if (z4) {
            track6 = track6.copyWithFormat(track6.format.buildUpon().setHasPrerollSamples(true).build());
        }
        return new TrackSampleTable(track6, jArr14, iArr14, i10, jArr12, iArr15, scaleLargeTimestamp8);
    }

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
        int i3 = 0;
        while (true) {
            j = C.TIME_UNSET;
            if (i3 < i) {
                if (parsableByteArray.getData()[position + i3] != -1) {
                    long readUnsignedInt = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (readUnsignedInt != 0) {
                        j = readUnsignedInt;
                    }
                } else {
                    i3++;
                }
            } else {
                parsableByteArray.skipBytes(i);
                break;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = RotationOptions.ROTATE_270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = RotationOptions.ROTATE_180;
        }
        return new TkhdData(readInt, j, i2);
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
            j = C.TIME_UNSET;
            if (i2 < i) {
                if (parsableByteArray.getData()[position + i2] != -1) {
                    long readUnsignedInt2 = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (readUnsignedInt2 != 0) {
                        long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedInt2, 1000000L, readUnsignedInt);
                        readUnsignedInt = readUnsignedInt;
                        j = scaleLargeTimestamp;
                    }
                } else {
                    i2++;
                }
            } else {
                parsableByteArray.skipBytes(i);
                break;
            }
        }
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return new MdhdData(readUnsignedInt, j, "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        int i3 = 0;
        while (i3 < readInt) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1748121139 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521 || readInt3 == 1634760241) {
                StsdData stsdData2 = stsdData;
                int i4 = i3;
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, i, i2, drmInitData, stsdData2, i4);
                stsdData = stsdData2;
                i3 = i4;
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667 || readInt3 == 1767992678) {
                StsdData stsdData3 = stsdData;
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData3, i3);
                stsdData = stsdData3;
            } else if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
            } else if (readInt3 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, readInt3, position, i, stsdData);
            } else if (readInt3 == 1667329389) {
                stsdData.format = new Format.Builder().setId(i).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
            }
            parsableByteArray.setPosition(position + readInt2);
            i3++;
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableList = ImmutableList.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableList).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        String str;
        int i7;
        String str2;
        int i8;
        DrmInitData drmInitData2;
        List<byte[]> list;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        NalUnitUtil.H265VpsData h265VpsData;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i2;
        int i21 = i3;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i20 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i22 = i;
        if (i22 == 1701733238) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i20, i21);
            if (parseSampleEntryEncryptionData != null) {
                i22 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i6] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = MimeTypes.VIDEO_H263;
        if (i22 != 1831958048) {
            str = i22 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        } else {
            str = MimeTypes.VIDEO_MPEG;
        }
        float f = 1.0f;
        int i23 = 8;
        int i24 = 8;
        List<byte[]> list2 = null;
        String str4 = null;
        byte[] bArr = null;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        ByteBuffer byteBuffer = null;
        EsdsData esdsData = null;
        NalUnitUtil.H265VpsData h265VpsData2 = null;
        boolean z = false;
        while (position - i20 < i21) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0 && parsableByteArray.getPosition() - i2 == i21) {
                break;
            }
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                List<byte[]> list3 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f = parse.pixelWidthHeightRatio;
                }
                String str5 = parse.codecs;
                int i31 = parse.maxNumReorderFrames;
                int i32 = parse.colorSpace;
                int i33 = parse.colorRange;
                list2 = list3;
                int i34 = parse.colorTransfer;
                int i35 = parse.bitdepthLuma;
                NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData2;
                drmInitData2 = drmInitData3;
                h265VpsData = h265VpsData3;
                i7 = position;
                i9 = i22;
                str2 = str3;
                i28 = i32;
                i8 = i33;
                i30 = i34;
                i24 = parse.bitdepthChroma;
                i23 = i35;
                str4 = str5;
                str = MimeTypes.VIDEO_H264;
                i26 = i31;
            } else {
                i7 = position;
                if (readInt2 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list4 = parse2.initializationData;
                    stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                    if (!z) {
                        f = parse2.pixelWidthHeightRatio;
                    }
                    int i36 = parse2.maxNumReorderPics;
                    int i37 = parse2.maxSubLayers;
                    String str6 = parse2.codecs;
                    list2 = list4;
                    if (parse2.stereoMode != -1) {
                        i25 = parse2.stereoMode;
                    }
                    int i38 = parse2.colorSpace;
                    int i39 = parse2.colorRange;
                    int i40 = parse2.colorTransfer;
                    int i41 = parse2.bitdepthLuma;
                    int i42 = parse2.bitdepthChroma;
                    drmInitData2 = drmInitData3;
                    i9 = i22;
                    str2 = str3;
                    i8 = i39;
                    i28 = i38;
                    i30 = i40;
                    i23 = i41;
                    h265VpsData = parse2.vpsData;
                    i26 = i36;
                    i27 = i37;
                    str4 = str6;
                    i24 = i42;
                    str = MimeTypes.VIDEO_H265;
                } else {
                    str2 = str3;
                    if (readInt2 == 1818785347) {
                        ExtractorUtil.checkContainerInput(MimeTypes.VIDEO_H265.equals(str), "lhvC must follow hvcC atom");
                        NalUnitUtil.H265VpsData h265VpsData4 = h265VpsData2;
                        ExtractorUtil.checkContainerInput(h265VpsData4 != null && h265VpsData4.layerInfos.size() >= 2, "must have at least two layers");
                        parsableByteArray.setPosition(position2 + 8);
                        HevcConfig parseLayered = HevcConfig.parseLayered(parsableByteArray, (NalUnitUtil.H265VpsData) Assertions.checkNotNull(h265VpsData4));
                        ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == parseLayered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        if (parseLayered.colorSpace != -1) {
                            i16 = i28;
                            ExtractorUtil.checkContainerInput(i16 == parseLayered.colorSpace, "colorSpace must be the same for both views");
                        } else {
                            i16 = i28;
                        }
                        if (parseLayered.colorRange != -1) {
                            i17 = i29;
                            ExtractorUtil.checkContainerInput(i17 == parseLayered.colorRange, "colorRange must be the same for both views");
                        } else {
                            i17 = i29;
                        }
                        if (parseLayered.colorTransfer != -1) {
                            int i43 = i30;
                            i18 = i43;
                            ExtractorUtil.checkContainerInput(i43 == parseLayered.colorTransfer, "colorTransfer must be the same for both views");
                        } else {
                            i18 = i30;
                        }
                        ExtractorUtil.checkContainerInput(i23 == parseLayered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                        ExtractorUtil.checkContainerInput(i24 == parseLayered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                        List<byte[]> list5 = list2;
                        if (list5 != null) {
                            list5 = ImmutableList.builder().addAll((Iterable) list5).addAll((Iterable) parseLayered.initializationData).build();
                            i19 = i16;
                        } else {
                            i19 = i16;
                            ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        String str7 = parseLayered.codecs;
                        str = MimeTypes.VIDEO_MV_HEVC;
                        drmInitData2 = drmInitData3;
                        i9 = i22;
                        i8 = i17;
                        i28 = i19;
                        i30 = i18;
                        str4 = str7;
                        h265VpsData = h265VpsData4;
                        list2 = list5;
                    } else {
                        List<byte[]> list6 = list2;
                        int i44 = i28;
                        i8 = i29;
                        int i45 = i30;
                        NalUnitUtil.H265VpsData h265VpsData5 = h265VpsData2;
                        if (readInt2 == 1986361461) {
                            VexuData parseVideoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, readInt);
                            if (parseVideoExtendedUsageBox != null && parseVideoExtendedUsageBox.eyesData != null) {
                                if (h265VpsData5 == null || h265VpsData5.layerInfos.size() < 2) {
                                    i15 = i25;
                                    if (i15 == -1) {
                                        i25 = parseVideoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                                        drmInitData2 = drmInitData3;
                                        list2 = list6;
                                        i9 = i22;
                                        i28 = i44;
                                        i30 = i45;
                                        h265VpsData = h265VpsData5;
                                    }
                                    i25 = i15;
                                    drmInitData2 = drmInitData3;
                                    list2 = list6;
                                    i9 = i22;
                                    i28 = i44;
                                    i30 = i45;
                                    h265VpsData = h265VpsData5;
                                } else {
                                    ExtractorUtil.checkContainerInput(parseVideoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                                    ExtractorUtil.checkContainerInput(!parseVideoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                                }
                            }
                            i15 = i25;
                            i25 = i15;
                            drmInitData2 = drmInitData3;
                            list2 = list6;
                            i9 = i22;
                            i28 = i44;
                            i30 = i45;
                            h265VpsData = h265VpsData5;
                        } else {
                            int i46 = i25;
                            if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                                drmInitData2 = drmInitData3;
                                list = list6;
                                i9 = i22;
                                i10 = i46;
                                i11 = i24;
                                i12 = i23;
                                i13 = i44;
                                i14 = i45;
                                DolbyVisionConfig parse3 = DolbyVisionConfig.parse(parsableByteArray);
                                if (parse3 != null) {
                                    String str8 = parse3.codecs;
                                    str = MimeTypes.VIDEO_DOLBY_VISION;
                                    str4 = str8;
                                }
                            } else if (readInt2 == 1987076931) {
                                ExtractorUtil.checkContainerInput(str == null, null);
                                String str9 = i22 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                parsableByteArray.setPosition(position2 + 12);
                                byte readUnsignedByte = (byte) parsableByteArray.readUnsignedByte();
                                byte readUnsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                i23 = readUnsignedByte3 >> 4;
                                i9 = i22;
                                byte b = (byte) ((readUnsignedByte3 >> 1) & 7);
                                if (str9.equals(MimeTypes.VIDEO_VP9)) {
                                    list6 = CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(readUnsignedByte, readUnsignedByte2, (byte) i23, b);
                                }
                                boolean z2 = (readUnsignedByte3 & 1) != 0;
                                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                                int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
                                i28 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedByte4);
                                int i47 = z2 ? 1 : 2;
                                i30 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedByte5);
                                str = str9;
                                drmInitData2 = drmInitData3;
                                i24 = i23;
                                i8 = i47;
                                h265VpsData = h265VpsData5;
                                list2 = list6;
                                i25 = i46;
                            } else {
                                i9 = i22;
                                if (readInt2 == 1635135811) {
                                    int i48 = readInt - 8;
                                    byte[] bArr2 = new byte[i48];
                                    parsableByteArray.readBytes(bArr2, 0, i48);
                                    list2 = ImmutableList.of(bArr2);
                                    parsableByteArray.setPosition(position2 + 8);
                                    ColorInfo parseAv1c = parseAv1c(parsableByteArray);
                                    int i49 = parseAv1c.lumaBitdepth;
                                    int i50 = parseAv1c.chromaBitdepth;
                                    int i51 = parseAv1c.colorSpace;
                                    int i52 = parseAv1c.colorRange;
                                    i30 = parseAv1c.colorTransfer;
                                    i23 = i49;
                                    drmInitData2 = drmInitData3;
                                    i24 = i50;
                                    i28 = i51;
                                    i8 = i52;
                                    str = MimeTypes.VIDEO_AV1;
                                    h265VpsData = h265VpsData5;
                                } else if (readInt2 == 1668050025) {
                                    if (byteBuffer == null) {
                                        byteBuffer = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer2 = byteBuffer;
                                    byteBuffer2.position(21);
                                    byteBuffer2.putShort(parsableByteArray.readShort());
                                    byteBuffer2.putShort(parsableByteArray.readShort());
                                    byteBuffer = byteBuffer2;
                                    drmInitData2 = drmInitData3;
                                    list2 = list6;
                                    h265VpsData = h265VpsData5;
                                    i28 = i44;
                                    i30 = i45;
                                } else if (readInt2 == 1835295606) {
                                    if (byteBuffer == null) {
                                        byteBuffer = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer3 = byteBuffer;
                                    short readShort = parsableByteArray.readShort();
                                    short readShort2 = parsableByteArray.readShort();
                                    short readShort3 = parsableByteArray.readShort();
                                    short readShort4 = parsableByteArray.readShort();
                                    int i53 = i24;
                                    short readShort5 = parsableByteArray.readShort();
                                    int i54 = i23;
                                    short readShort6 = parsableByteArray.readShort();
                                    drmInitData2 = drmInitData3;
                                    short readShort7 = parsableByteArray.readShort();
                                    short readShort8 = parsableByteArray.readShort();
                                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                                    long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
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
                                    h265VpsData = h265VpsData5;
                                    i24 = i53;
                                    i23 = i54;
                                    i28 = i44;
                                    i30 = i45;
                                    list2 = list6;
                                    i25 = i46;
                                } else {
                                    drmInitData2 = drmInitData3;
                                    list = list6;
                                    i10 = i46;
                                    i11 = i24;
                                    i12 = i23;
                                    if (readInt2 == 1681012275) {
                                        ExtractorUtil.checkContainerInput(str == null, null);
                                        h265VpsData = h265VpsData5;
                                        i24 = i11;
                                        i23 = i12;
                                        str = str2;
                                    } else if (readInt2 == 1702061171) {
                                        ExtractorUtil.checkContainerInput(str == null, null);
                                        esdsData = parseEsdsFromParent(parsableByteArray, position2);
                                        String str10 = esdsData.mimeType;
                                        byte[] bArr3 = esdsData.initializationData;
                                        list2 = bArr3 != null ? ImmutableList.of(bArr3) : list;
                                        str = str10;
                                        h265VpsData = h265VpsData5;
                                        i24 = i11;
                                        i23 = i12;
                                        i28 = i44;
                                        i30 = i45;
                                        i25 = i10;
                                    } else if (readInt2 == 1885434736) {
                                        f = parsePaspFromParent(parsableByteArray, position2);
                                        h265VpsData = h265VpsData5;
                                        i24 = i11;
                                        i23 = i12;
                                        i28 = i44;
                                        i30 = i45;
                                        list2 = list;
                                        i25 = i10;
                                        z = true;
                                    } else {
                                        if (readInt2 == 1937126244) {
                                            bArr = parseProjFromParent(parsableByteArray, position2, readInt);
                                        } else if (readInt2 == 1936995172) {
                                            int readUnsignedByte6 = parsableByteArray.readUnsignedByte();
                                            parsableByteArray.skipBytes(3);
                                            if (readUnsignedByte6 == 0) {
                                                int readUnsignedByte7 = parsableByteArray.readUnsignedByte();
                                                if (readUnsignedByte7 == 0) {
                                                    i10 = 0;
                                                } else if (readUnsignedByte7 == 1) {
                                                    i10 = 1;
                                                } else if (readUnsignedByte7 == 2) {
                                                    i10 = 2;
                                                } else if (readUnsignedByte7 == 3) {
                                                    i10 = 3;
                                                }
                                            }
                                        } else {
                                            if (readInt2 == 1634760259) {
                                                int i55 = readInt - 12;
                                                byte[] bArr4 = new byte[i55];
                                                parsableByteArray.setPosition(position2 + 12);
                                                parsableByteArray.readBytes(bArr4, 0, i55);
                                                list2 = ImmutableList.of(bArr4);
                                                ColorInfo parseApvc = parseApvc(new ParsableByteArray(bArr4));
                                                int i56 = parseApvc.lumaBitdepth;
                                                int i57 = parseApvc.chromaBitdepth;
                                                int i58 = parseApvc.colorSpace;
                                                int i59 = parseApvc.colorRange;
                                                i30 = parseApvc.colorTransfer;
                                                i23 = i56;
                                                i24 = i57;
                                                i28 = i58;
                                                i8 = i59;
                                                str = MimeTypes.VIDEO_APV;
                                                h265VpsData = h265VpsData5;
                                                i25 = i10;
                                            } else {
                                                i13 = i44;
                                                if (readInt2 == 1668246642) {
                                                    i14 = i45;
                                                    if (i13 == -1 && i14 == -1) {
                                                        int readInt3 = parsableByteArray.readInt();
                                                        if (readInt3 == TYPE_nclx || readInt3 == TYPE_nclc) {
                                                            int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                                                            int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                                                            parsableByteArray.skipBytes(2);
                                                            boolean z3 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                            int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                                                            i8 = z3 ? 1 : 2;
                                                            i24 = i11;
                                                            i23 = i12;
                                                            list2 = list;
                                                            i28 = isoColorPrimariesToColorSpace;
                                                            i30 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                                                            h265VpsData = h265VpsData5;
                                                            i25 = i10;
                                                        } else {
                                                            Log.w(TAG, "Unsupported color type: " + Mp4Box.getBoxTypeString(readInt3));
                                                        }
                                                    }
                                                } else {
                                                    i14 = i45;
                                                }
                                            }
                                        }
                                        h265VpsData = h265VpsData5;
                                        i24 = i11;
                                        i23 = i12;
                                    }
                                    i28 = i44;
                                    i30 = i45;
                                    list2 = list;
                                    i25 = i10;
                                }
                                i25 = i46;
                            }
                            i24 = i11;
                            i23 = i12;
                            list2 = list;
                            i30 = i14;
                            i28 = i13;
                            h265VpsData = h265VpsData5;
                            i25 = i10;
                        }
                    }
                }
            }
            DrmInitData drmInitData4 = drmInitData2;
            h265VpsData2 = h265VpsData;
            drmInitData3 = drmInitData4;
            i20 = i2;
            i21 = i3;
            position = i7 + readInt;
            i22 = i9;
            str3 = str2;
            i29 = i8;
            stsdData2 = stsdData;
        }
        DrmInitData drmInitData5 = drmInitData3;
        List<byte[]> list7 = list2;
        int i60 = i25;
        int i61 = i28;
        int i62 = i29;
        int i63 = i30;
        int i64 = i24;
        int i65 = i23;
        if (str == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i4).setSampleMimeType(str).setCodecs(str4).setWidth(readUnsignedShort).setHeight(readUnsignedShort2).setPixelWidthHeightRatio(f).setRotationDegrees(i5).setProjectionData(bArr).setStereoMode(i60).setInitializationData(list7).setMaxNumReorderSamples(i26).setMaxSubLayers(i27).setDrmInitData(drmInitData5).setColorInfo(new ColorInfo.Builder().setColorSpace(i61).setColorRange(i62).setColorTransfer(i63).setHdrStaticInfo(byteBuffer != null ? byteBuffer.array() : null).setLumaBitdepth(i65).setChromaBitdepth(i64).build());
        if (esdsData != null) {
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

    private static Pair<long[], long[]> parseEdts(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_elst);
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

    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int i6;
        int i7;
        int i8;
        int readUnsignedShort;
        int readUnsignedFixedPoint1616;
        int readInt;
        int i9;
        String str2;
        String str3;
        int i10;
        String format;
        ImmutableList of;
        int i11 = i;
        int i12 = i3;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i2 + 16);
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i7 = 2;
            i8 = 4;
            readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            readInt = parsableByteArray.readInt();
            if (i6 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i9 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            i7 = 2;
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            int readUnsignedIntToInt3 = parsableByteArray.readUnsignedIntToInt();
            boolean z2 = (readUnsignedIntToInt3 & 1) != 0;
            boolean z3 = (readUnsignedIntToInt3 & 2) != 0;
            i8 = 4;
            if (!z2) {
                if (readUnsignedIntToInt2 == 8) {
                    i9 = 3;
                } else if (readUnsignedIntToInt2 == 16) {
                    i9 = z3 ? 268435456 : 2;
                } else if (readUnsignedIntToInt2 == 24) {
                    i9 = z3 ? C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
                } else {
                    if (readUnsignedIntToInt2 == 32) {
                        i9 = z3 ? C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
                    }
                    i9 = -1;
                }
                parsableByteArray.skipBytes(8);
                readUnsignedShort = readUnsignedIntToInt;
                readInt = 0;
            } else {
                if (readUnsignedIntToInt2 == 32) {
                    i9 = 4;
                    parsableByteArray.skipBytes(8);
                    readUnsignedShort = readUnsignedIntToInt;
                    readInt = 0;
                }
                i9 = -1;
                parsableByteArray.skipBytes(8);
                readUnsignedShort = readUnsignedIntToInt;
                readInt = 0;
            }
        }
        if (i11 == 1767992678) {
            readUnsignedFixedPoint1616 = -1;
            readUnsignedShort = -1;
        } else {
            if (i11 != 1935764850) {
                readUnsignedFixedPoint1616 = i11 == 1935767394 ? 16000 : 8000;
            }
            readUnsignedShort = 1;
        }
        int position = parsableByteArray.getPosition();
        if (i11 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i2, i12);
            if (parseSampleEntryEncryptionData != null) {
                i11 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = MimeTypes.AUDIO_MPEGH_MHM1;
        if (i11 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i11 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i11 == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (i11 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i11 == 1685353320 || i11 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i11 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i11 == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (i11 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (i11 == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else {
            if (i11 != 1936684916) {
                if (i11 == 1953984371) {
                    str2 = MimeTypes.AUDIO_RAW;
                    i9 = 268435456;
                } else if (i11 != 1819304813) {
                    str2 = (i11 == 778924082 || i11 == 778924083) ? MimeTypes.AUDIO_MPEG : i11 == 1835557169 ? MimeTypes.AUDIO_MPEGH_MHA1 : i11 == 1835560241 ? MimeTypes.AUDIO_MPEGH_MHM1 : i11 == 1634492771 ? MimeTypes.AUDIO_ALAC : i11 == 1634492791 ? MimeTypes.AUDIO_ALAW : i11 == 1970037111 ? MimeTypes.AUDIO_MLAW : i11 == 1332770163 ? MimeTypes.AUDIO_OPUS : i11 == 1716281667 ? MimeTypes.AUDIO_FLAC : i11 == 1835823201 ? MimeTypes.AUDIO_TRUEHD : i11 == 1767992678 ? MimeTypes.AUDIO_IAMF : null;
                } else if (i9 != -1) {
                    str2 = MimeTypes.AUDIO_RAW;
                }
            }
            str2 = MimeTypes.AUDIO_RAW;
            i9 = i7;
        }
        String str5 = null;
        List<byte[]> list = null;
        EsdsData esdsData = null;
        while (position - i2 < i12) {
            parsableByteArray.setPosition(position);
            int readInt2 = parsableByteArray.readInt();
            int i13 = i9;
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
                        i10 = i8;
                        int findBoxPosition = readInt3 == 1702061171 ? position : findBoxPosition(parsableByteArray, Mp4Box.TYPE_esds, position, readInt2);
                        if (findBoxPosition != -1) {
                            esdsData = parseEsdsFromParent(parsableByteArray, findBoxPosition);
                            str2 = esdsData.mimeType;
                            byte[] bArr3 = esdsData.initializationData;
                            if (bArr3 != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str2)) {
                                    list = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                } else {
                                    if (MimeTypes.AUDIO_AAC.equals(str2)) {
                                        AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                        int i14 = parseAudioSpecificConfig.sampleRateHz;
                                        int i15 = parseAudioSpecificConfig.channelCount;
                                        str5 = parseAudioSpecificConfig.codecs;
                                        readUnsignedFixedPoint1616 = i14;
                                        readUnsignedShort = i15;
                                    }
                                    list = ImmutableList.of(bArr3);
                                }
                            }
                        }
                    } else {
                        if (readInt3 == 1684103987) {
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
                            i10 = i8;
                            readUnsignedShort = i7;
                        } else if (readInt3 == 1684305011 || readInt3 == 1969517683) {
                            i10 = i8;
                            stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str2).setChannelCount(readUnsignedShort).setSampleRate(readUnsignedFixedPoint1616).setDrmInitData(drmInitData2).setLanguage(str).build();
                        } else if (readInt3 == 1682927731) {
                            int i16 = readInt2 - 8;
                            byte[] bArr4 = opusMagic;
                            byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i16);
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.readBytes(copyOf, bArr4.length, i16);
                            list = OpusUtil.buildInitializationData(copyOf);
                        } else if (readInt3 == 1684425825) {
                            byte[] bArr5 = new byte[readInt2 - 8];
                            bArr5[0] = 102;
                            bArr5[1] = 76;
                            bArr5[i7] = 97;
                            bArr5[3] = 67;
                            parsableByteArray.setPosition(position + 12);
                            i10 = i8;
                            parsableByteArray.readBytes(bArr5, i10, readInt2 - 12);
                            list = ImmutableList.of(bArr5);
                        } else {
                            i10 = i8;
                            if (readInt3 == 1634492771) {
                                int i17 = readInt2 - 12;
                                byte[] bArr6 = new byte[i17];
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr6, 0, i17);
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
                        }
                        i10 = i8;
                    }
                    position += readInt2;
                    i12 = i3;
                    i8 = i10;
                    i9 = i13;
                    str4 = str3;
                }
                i10 = i8;
                position += readInt2;
                i12 = i3;
                i8 = i10;
                i9 = i13;
                str4 = str3;
            }
            str3 = str4;
            i10 = i8;
            position += readInt2;
            i12 = i3;
            i8 = i10;
            i9 = i13;
            str4 = str3;
        }
        int i18 = i9;
        if (stsdData.format != null || str2 == null) {
            return;
        }
        Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str2).setCodecs(str5).setChannelCount(readUnsignedShort).setSampleRate(readUnsignedFixedPoint1616).setPcmEncoding(i18).setInitializationData(list).setDrmInitData(drmInitData2).setLanguage(str);
        if (esdsData != null) {
            language.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
        }
        stsdData.format = language.build();
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
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j = readUnsignedInt2;
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        if (j <= 0) {
            j = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

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
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
    }

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
                    i4 = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
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
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
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
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j, long j2, String str) {
            this.timescale = j;
            this.mediaDurationUs = j2;
            this.language = str;
        }
    }

    static final class VexuData {
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
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
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

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
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

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
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
                return (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}

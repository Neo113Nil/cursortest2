package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ChunkIndex;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class FragmentedMp4Extractor implements Extractor {
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    private static final int FLAG_SIDELOADED = 8;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";

    @Nullable
    private final TrackOutput additionalEmsgTrackOutput;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] cea608TrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final byte[] extendedTypeScratch;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private long segmentIndexEarliestPresentationTimeUs;

    @Nullable
    private final DrmInitData sideloadedDrmInitData;

    @Nullable
    private final Track sideloadedTrack;

    @Nullable
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.FragmentedMp4Extractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new FragmentedMp4Extractor()};
        }
    };
    private static final int SAMPLE_GROUP_TYPE_seig = Util.getIntegerCodeForString("seig");
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format EMSG_FORMAT = Format.createSampleFormat(null, "application/x-emsg", Long.MAX_VALUE);

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static final class MetadataSampleInfo {
        public final long presentationTimeDeltaUs;
        public final int size;

        public MetadataSampleInfo(long j, int i) {
            this.presentationTimeDeltaUs = j;
            this.size = i;
        }
    }

    private static final class TrackBundle {
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public final TrackOutput output;
        public Track track;
        public final TrackFragment fragment = new TrackFragment();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        private TrackEncryptionBox getEncryptionBox() {
            TrackFragment trackFragment = this.fragment;
            int i = trackFragment.header.sampleDescriptionIndex;
            TrackEncryptionBox trackEncryptionBox = trackFragment.trackEncryptionBox;
            return trackEncryptionBox != null ? trackEncryptionBox : this.track.getSampleDescriptionEncryptionBox(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void skipSampleEncryptionData() {
            TrackFragment trackFragment = this.fragment;
            if (trackFragment.definesEncryptionData) {
                ParsableByteArray parsableByteArray = trackFragment.sampleEncryptionData;
                int i = getEncryptionBox().initializationVectorSize;
                if (i != 0) {
                    parsableByteArray.skipBytes(i);
                }
                if (this.fragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex]) {
                    parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
                }
            }
        }

        public void init(Track track, DefaultSampleValues defaultSampleValues) {
            this.track = (Track) Assertions.checkNotNull(track);
            this.defaultSampleValues = (DefaultSampleValues) Assertions.checkNotNull(defaultSampleValues);
            this.output.format(track.format);
            reset();
        }

        public boolean next() {
            this.currentSampleIndex++;
            int i = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i;
            int[] iArr = this.fragment.trunLength;
            int i2 = this.currentTrackRunIndex;
            if (i != iArr[i2]) {
                return true;
            }
            this.currentTrackRunIndex = i2 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public int outputSampleEncryptionData() {
            ParsableByteArray parsableByteArray;
            if (!this.fragment.definesEncryptionData) {
                return 0;
            }
            TrackEncryptionBox encryptionBox = getEncryptionBox();
            int i = encryptionBox.initializationVectorSize;
            if (i != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = encryptionBox.defaultInitializationVector;
                this.defaultInitializationVector.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                i = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean z = this.fragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex];
            ParsableByteArray parsableByteArray3 = this.encryptionSignalByte;
            parsableByteArray3.data[0] = (byte) ((z ? 128 : 0) | i);
            parsableByteArray3.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1);
            this.output.sampleData(parsableByteArray, i);
            if (!z) {
                return i + 1;
            }
            ParsableByteArray parsableByteArray4 = this.fragment.sampleEncryptionData;
            int readUnsignedShort = parsableByteArray4.readUnsignedShort();
            parsableByteArray4.skipBytes(-2);
            int i2 = (readUnsignedShort * 6) + 2;
            this.output.sampleData(parsableByteArray4, i2);
            return i + 1 + i2;
        }

        public void reset() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
        }

        public void seek(long j) {
            long usToMs = C.usToMs(j);
            int i = this.currentSampleIndex;
            while (true) {
                TrackFragment trackFragment = this.fragment;
                if (i >= trackFragment.sampleCount || trackFragment.getSamplePresentationTime(i) >= usToMs) {
                    return;
                }
                if (this.fragment.sampleIsSyncFrameTable[i]) {
                    this.firstSampleToOutputIndex = i;
                }
                i++;
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.track.getSampleDescriptionEncryptionBox(this.fragment.header.sampleDescriptionIndex);
            this.output.format(this.track.format.copyWithDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)));
        }
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (DefaultSampleValues) Assertions.checkNotNull(sparseArray.get(i));
    }

    private static DrmInitData getDrmInitDataFromAtoms(List<Atom.LeafAtom> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Atom.LeafAtom leafAtom = list.get(i);
            if (leafAtom.type == Atom.TYPE_pssh) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = leafAtom.data.data;
                UUID parseUuid = PsshAtomUtil.parseUuid(bArr);
                if (parseUuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(parseUuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static TrackBundle getNextFragmentRun(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        TrackBundle trackBundle = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            TrackBundle valueAt = sparseArray.valueAt(i);
            int i2 = valueAt.currentTrackRunIndex;
            TrackFragment trackFragment = valueAt.fragment;
            if (i2 != trackFragment.trunCount) {
                long j2 = trackFragment.trunDataPosition[i2];
                if (j2 < j) {
                    trackBundle = valueAt;
                    j = j2;
                }
            }
        }
        return trackBundle;
    }

    @Nullable
    private static TrackBundle getTrackBundle(SparseArray<TrackBundle> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : sparseArray.get(i);
    }

    private void maybeInitExtraTracks() {
        int i;
        if (this.emsgTrackOutputs == null) {
            TrackOutput[] trackOutputArr = new TrackOutput[2];
            this.emsgTrackOutputs = trackOutputArr;
            TrackOutput trackOutput = this.additionalEmsgTrackOutput;
            if (trackOutput != null) {
                trackOutputArr[0] = trackOutput;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.flags & 4) != 0) {
                trackOutputArr[i] = this.extractorOutput.track(this.trackBundles.size(), 4);
                i++;
            }
            TrackOutput[] trackOutputArr2 = (TrackOutput[]) Arrays.copyOf(this.emsgTrackOutputs, i);
            this.emsgTrackOutputs = trackOutputArr2;
            for (TrackOutput trackOutput2 : trackOutputArr2) {
                trackOutput2.format(EMSG_FORMAT);
            }
        }
        if (this.cea608TrackOutputs == null) {
            this.cea608TrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
            for (int i2 = 0; i2 < this.cea608TrackOutputs.length; i2++) {
                TrackOutput track = this.extractorOutput.track(this.trackBundles.size() + 1 + i2, 3);
                track.format(this.closedCaptionFormats.get(i2));
                this.cea608TrackOutputs[i2] = track;
            }
        }
    }

    private void onContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        int i = containerAtom.type;
        if (i == Atom.TYPE_moov) {
            onMoovContainerAtomRead(containerAtom);
        } else if (i == Atom.TYPE_moof) {
            onMoofContainerAtomRead(containerAtom);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(containerAtom);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        TrackOutput[] trackOutputArr = this.emsgTrackOutputs;
        if (trackOutputArr == null || trackOutputArr.length == 0) {
            return;
        }
        parsableByteArray.setPosition(12);
        int bytesLeft = parsableByteArray.bytesLeft();
        parsableByteArray.readNullTerminatedString();
        parsableByteArray.readNullTerminatedString();
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, parsableByteArray.readUnsignedInt());
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray.setPosition(12);
            trackOutput.sampleData(parsableByteArray, bytesLeft);
        }
        long j = this.segmentIndexEarliestPresentationTimeUs;
        if (j == -9223372036854775807L) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(scaleLargeTimestamp, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        long j2 = j + scaleLargeTimestamp;
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            j2 = timestampAdjuster.adjustSampleTimestamp(j2);
        }
        long j3 = j2;
        for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(j3, 1, bytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(Atom.LeafAtom leafAtom, long j) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafAtom);
            return;
        }
        int i = leafAtom.type;
        if (i != Atom.TYPE_sidx) {
            if (i == Atom.TYPE_emsg) {
                onEmsgLeafAtomRead(leafAtom.data);
            }
        } else {
            Pair<Long, ChunkIndex> parseSidx = parseSidx(leafAtom.data, j);
            this.segmentIndexEarliestPresentationTimeUs = ((Long) parseSidx.first).longValue();
            this.extractorOutput.seekMap((SeekMap) parseSidx.second);
            this.haveOutputSeekMap = true;
        }
    }

    private void onMoofContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        parseMoof(containerAtom, this.trackBundles, this.flags, this.extendedTypeScratch);
        DrmInitData drmInitDataFromAtoms = this.sideloadedDrmInitData != null ? null : getDrmInitDataFromAtoms(containerAtom.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i = 0; i < size; i++) {
                this.trackBundles.valueAt(i).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != -9223372036854775807L) {
            int size2 = this.trackBundles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.trackBundles.valueAt(i2).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = -9223372036854775807L;
        }
    }

    private void onMoovContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        int i;
        int i2;
        int i3 = 0;
        Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitData = this.sideloadedDrmInitData;
        if (drmInitData == null) {
            drmInitData = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        }
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mvex);
        SparseArray<DefaultSampleValues> sparseArray = new SparseArray<>();
        int size = containerAtomOfType.leafChildren.size();
        long j = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            Atom.LeafAtom leafAtom = containerAtomOfType.leafChildren.get(i4);
            int i5 = leafAtom.type;
            if (i5 == Atom.TYPE_trex) {
                Pair<Integer, DefaultSampleValues> parseTrex = parseTrex(leafAtom.data);
                sparseArray.put(((Integer) parseTrex.first).intValue(), (DefaultSampleValues) parseTrex.second);
            } else if (i5 == Atom.TYPE_mehd) {
                j = parseMehd(leafAtom.data);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = containerAtom.containerChildren.size();
        int i6 = 0;
        while (i6 < size2) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i6);
            if (containerAtom2.type == Atom.TYPE_trak) {
                i = i6;
                i2 = size2;
                Track parseTrak = AtomParsers.parseTrak(containerAtom2, containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd), j, drmInitData, (this.flags & 16) != 0, false);
                if (parseTrak != null) {
                    sparseArray2.put(parseTrak.id, parseTrak);
                }
            } else {
                i = i6;
                i2 = size2;
            }
            i6 = i + 1;
            size2 = i2;
        }
        int size3 = sparseArray2.size();
        if (this.trackBundles.size() != 0) {
            Assertions.checkState(this.trackBundles.size() == size3);
            while (i3 < size3) {
                Track track = (Track) sparseArray2.valueAt(i3);
                this.trackBundles.get(track.id).init(track, getDefaultSampleValues(sparseArray, track.id));
                i3++;
            }
            return;
        }
        while (i3 < size3) {
            Track track2 = (Track) sparseArray2.valueAt(i3);
            TrackBundle trackBundle = new TrackBundle(this.extractorOutput.track(i3, track2.type));
            trackBundle.init(track2, getDefaultSampleValues(sparseArray, track2.id));
            this.trackBundles.put(track2.id, trackBundle);
            this.durationUs = Math.max(this.durationUs, track2.durationUs);
            i3++;
        }
        maybeInitExtraTracks();
        this.extractorOutput.endTracks();
    }

    private void outputPendingMetadataSamples(long j) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo removeFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= removeFirst.size;
            long j2 = removeFirst.presentationTimeDeltaUs + j;
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j2 = timestampAdjuster.adjustSampleTimestamp(j2);
            }
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j2, 1, removeFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(Atom.ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, int i, byte[] bArr) throws ParserException {
        int size = containerAtom.containerChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i2);
            if (containerAtom2.type == Atom.TYPE_traf) {
                parseTraf(containerAtom2, sparseArray, i, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        if ((Atom.parseFullAtomFlags(readInt) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 1) {
            trackFragment.auxiliaryDataPosition += Atom.parseFullAtomVersion(readInt) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
        } else {
            throw new ParserException("Unexpected saio entry count: " + readUnsignedIntToInt);
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        int i;
        int i2 = trackEncryptionBox.initializationVectorSize;
        parsableByteArray.setPosition(8);
        if ((Atom.parseFullAtomFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt != trackFragment.sampleCount) {
            throw new ParserException("Length mismatch: " + readUnsignedIntToInt + ", " + trackFragment.sampleCount);
        }
        if (readUnsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i = 0;
            for (int i3 = 0; i3 < readUnsignedIntToInt; i3++) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                i += readUnsignedByte2;
                zArr[i3] = readUnsignedByte2 > i2;
            }
        } else {
            i = readUnsignedByte * readUnsignedIntToInt;
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, readUnsignedByte > i2);
        }
        trackFragment.initEncryptionData(i);
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    private static void parseSgpd(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, String str, TrackFragment trackFragment) throws ParserException {
        byte[] bArr;
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        int i = SAMPLE_GROUP_TYPE_seig;
        if (readInt2 != i) {
            return;
        }
        if (Atom.parseFullAtomVersion(readInt) == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int readInt3 = parsableByteArray2.readInt();
        if (parsableByteArray2.readInt() != i) {
            return;
        }
        int parseFullAtomVersion = Atom.parseFullAtomVersion(readInt3);
        if (parseFullAtomVersion == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw new ParserException("Variable length description in sgpd found (unsupported)");
            }
        } else if (parseFullAtomVersion >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw new ParserException("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
        int i2 = (readUnsignedByte & 240) >> 4;
        int i3 = readUnsignedByte & 15;
        boolean z = parsableByteArray2.readUnsignedByte() == 1;
        if (z) {
            int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (z && readUnsignedByte2 == 0) {
                int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                byte[] bArr3 = new byte[readUnsignedByte3];
                parsableByteArray2.readBytes(bArr3, 0, readUnsignedByte3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i2, i3, bArr);
        }
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j) throws ParserException {
        long readUnsignedLongToLong;
        long readUnsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullAtomVersion == 0) {
            readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j2 = readUnsignedLongToLong;
        long j3 = j + readUnsignedLongToLong2;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000L, readUnsignedInt);
        parsableByteArray.skipBytes(2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long[] jArr3 = new long[readUnsignedShort];
        long j4 = scaleLargeTimestamp;
        int i = 0;
        long j5 = j2;
        while (i < readUnsignedShort) {
            int readInt = parsableByteArray.readInt();
            if ((readInt & Integer.MIN_VALUE) != 0) {
                throw new ParserException("Unhandled indirect reference");
            }
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i] = readInt & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + readUnsignedInt2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = readUnsignedShort;
            long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(j6, 1000000L, readUnsignedInt);
            jArr4[i] = scaleLargeTimestamp2 - jArr5[i];
            parsableByteArray.skipBytes(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            readUnsignedShort = i2;
            j5 = j6;
            j4 = scaleLargeTimestamp2;
        }
        return Pair.create(Long.valueOf(scaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        TrackBundle trackBundle = getTrackBundle(sparseArray, parsableByteArray.readInt());
        if (trackBundle == null) {
            return null;
        }
        if ((parseFullAtomFlags & 1) != 0) {
            long readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            TrackFragment trackFragment = trackBundle.fragment;
            trackFragment.dataPosition = readUnsignedLongToLong;
            trackFragment.auxiliaryDataPosition = readUnsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = trackBundle.defaultSampleValues;
        trackBundle.fragment.header = new DefaultSampleValues((parseFullAtomFlags & 2) != 0 ? parsableByteArray.readUnsignedIntToInt() - 1 : defaultSampleValues.sampleDescriptionIndex, (parseFullAtomFlags & 8) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.duration, (parseFullAtomFlags & 16) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.size, (parseFullAtomFlags & 32) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.flags);
        return trackBundle;
    }

    private static void parseTraf(Atom.ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, int i, byte[] bArr) throws ParserException {
        TrackBundle parseTfhd = parseTfhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tfhd).data, sparseArray);
        if (parseTfhd == null) {
            return;
        }
        TrackFragment trackFragment = parseTfhd.fragment;
        long j = trackFragment.nextFragmentDecodeTime;
        parseTfhd.reset();
        int i2 = Atom.TYPE_tfdt;
        if (containerAtom.getLeafAtomOfType(i2) != null && (i & 2) == 0) {
            j = parseTfdt(containerAtom.getLeafAtomOfType(i2).data);
        }
        parseTruns(containerAtom, parseTfhd, j, i);
        TrackEncryptionBox sampleDescriptionEncryptionBox = parseTfhd.track.getSampleDescriptionEncryptionBox(trackFragment.header.sampleDescriptionIndex);
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_saiz);
        if (leafAtomOfType != null) {
            parseSaiz(sampleDescriptionEncryptionBox, leafAtomOfType.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_saio);
        if (leafAtomOfType2 != null) {
            parseSaio(leafAtomOfType2.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_senc);
        if (leafAtomOfType3 != null) {
            parseSenc(leafAtomOfType3.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_sbgp);
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_sgpd);
        if (leafAtomOfType4 != null && leafAtomOfType5 != null) {
            parseSgpd(leafAtomOfType4.data, leafAtomOfType5.data, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
        }
        int size = containerAtom.leafChildren.size();
        for (int i3 = 0; i3 < size; i3++) {
            Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i3);
            if (leafAtom.type == Atom.TYPE_uuid) {
                parseUuid(leafAtom.data, trackFragment, bArr);
            }
        }
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readUnsignedIntToInt() - 1, parsableByteArray.readUnsignedIntToInt(), parsableByteArray.readUnsignedIntToInt(), parsableByteArray.readInt()));
    }

    private static int parseTrun(TrackBundle trackBundle, int i, long j, int i2, ParsableByteArray parsableByteArray, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        parsableByteArray.setPosition(8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        Track track = trackBundle.track;
        TrackFragment trackFragment = trackBundle.fragment;
        DefaultSampleValues defaultSampleValues = trackFragment.header;
        trackFragment.trunLength[i] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = trackFragment.trunDataPosition;
        long j2 = trackFragment.dataPosition;
        jArr[i] = j2;
        if ((parseFullAtomFlags & 1) != 0) {
            jArr[i] = j2 + parsableByteArray.readInt();
        }
        boolean z6 = (parseFullAtomFlags & 4) != 0;
        int i9 = defaultSampleValues.flags;
        if (z6) {
            i9 = parsableByteArray.readUnsignedIntToInt();
        }
        boolean z7 = (parseFullAtomFlags & 256) != 0;
        boolean z8 = (parseFullAtomFlags & 512) != 0;
        boolean z9 = (parseFullAtomFlags & 1024) != 0;
        boolean z10 = (parseFullAtomFlags & 2048) != 0;
        long[] jArr2 = track.editListDurations;
        long j3 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j3 = Util.scaleLargeTimestamp(track.editListMediaTimes[0], 1000L, track.timescale);
        }
        int[] iArr = trackFragment.sampleSizeTable;
        int[] iArr2 = trackFragment.sampleCompositionTimeOffsetTable;
        long[] jArr3 = trackFragment.sampleDecodingTimeTable;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        int i10 = i9;
        boolean z11 = track.type == 2 && (i2 & 1) != 0;
        int i11 = i3 + trackFragment.trunLength[i];
        long j4 = track.timescale;
        long j5 = j3;
        long j6 = i > 0 ? trackFragment.nextFragmentDecodeTime : j;
        int i12 = i3;
        while (i12 < i11) {
            if (z7) {
                z = z7;
                i4 = parsableByteArray.readUnsignedIntToInt();
            } else {
                z = z7;
                i4 = defaultSampleValues.duration;
            }
            if (z8) {
                z2 = z8;
                i5 = parsableByteArray.readUnsignedIntToInt();
            } else {
                z2 = z8;
                i5 = defaultSampleValues.size;
            }
            if (i12 == 0 && z6) {
                z3 = z6;
                i6 = i10;
            } else if (z9) {
                z3 = z6;
                i6 = parsableByteArray.readInt();
            } else {
                z3 = z6;
                i6 = defaultSampleValues.flags;
            }
            if (z10) {
                z4 = z10;
                i7 = i11;
                i8 = i4;
                iArr2[i12] = (int) ((parsableByteArray.readInt() * 1000) / j4);
                z5 = false;
            } else {
                z4 = z10;
                i7 = i11;
                i8 = i4;
                z5 = false;
                iArr2[i12] = 0;
            }
            jArr3[i12] = Util.scaleLargeTimestamp(j6, 1000L, j4) - j5;
            iArr[i12] = i5;
            zArr[i12] = (((i6 >> 16) & 1) != 0 || (z11 && i12 != 0)) ? z5 : true;
            j6 += i8;
            i12++;
            z7 = z;
            z8 = z2;
            z6 = z3;
            z10 = z4;
            i11 = i7;
        }
        int i13 = i11;
        trackFragment.nextFragmentDecodeTime = j6;
        return i13;
    }

    private static void parseTruns(Atom.ContainerAtom containerAtom, TrackBundle trackBundle, long j, int i) {
        List<Atom.LeafAtom> list = containerAtom.leafChildren;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Atom.LeafAtom leafAtom = list.get(i4);
            if (leafAtom.type == Atom.TYPE_trun) {
                ParsableByteArray parsableByteArray = leafAtom.data;
                parsableByteArray.setPosition(12);
                int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (readUnsignedIntToInt > 0) {
                    i3 += readUnsignedIntToInt;
                    i2++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Atom.LeafAtom leafAtom2 = list.get(i7);
            if (leafAtom2.type == Atom.TYPE_trun) {
                i6 = parseTrun(trackBundle, i5, j, i, leafAtom2.data, i6);
                i5++;
            }
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private void processAtomEnded(long j) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.data, 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j = this.atomSize;
        if (j == 1) {
            extractorInput.readFully(this.atomHeader.data, 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - this.atomHeaderBytesRead;
        if (this.atomType == Atom.TYPE_moof) {
            int size = this.trackBundles.size();
            for (int i = 0; i < size; i++) {
                TrackFragment trackFragment = this.trackBundles.valueAt(i).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i2 = this.atomType;
        if (i2 == Atom.TYPE_mdat) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = this.atomSize + position;
            if (!this.haveOutputSeekMap) {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
                this.haveOutputSeekMap = true;
            }
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i2)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw new ParserException("Leaf atom defines extended atom size (unsupported).");
            }
            long j2 = this.atomSize;
            if (j2 > 2147483647L) {
                throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) j2);
            this.atomData = parsableByteArray;
            System.arraycopy(this.atomHeader.data, 0, parsableByteArray.data, 0, 8);
            this.parserState = 1;
        } else {
            if (this.atomSize > 2147483647L) {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i = ((int) this.atomSize) - this.atomHeaderBytesRead;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.data, 8, i);
            onLeafAtomRead(new Atom.LeafAtom(this.atomType, this.atomData), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int size = this.trackBundles.size();
        TrackBundle trackBundle = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            TrackFragment trackFragment = this.trackBundles.valueAt(i).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill) {
                long j2 = trackFragment.auxiliaryDataPosition;
                if (j2 < j) {
                    trackBundle = this.trackBundles.valueAt(i);
                    j = j2;
                }
            }
        }
        if (trackBundle == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j - extractorInput.getPosition());
        if (position < 0) {
            throw new ParserException("Offset to encryption data was negative.");
        }
        extractorInput.skipFully(position);
        trackBundle.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean readSample(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i;
        TrackOutput.CryptoData cryptoData;
        int sampleData;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        if (this.parserState == 3) {
            if (this.currentTrackBundle == null) {
                TrackBundle nextFragmentRun = getNextFragmentRun(this.trackBundles);
                if (nextFragmentRun == null) {
                    int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                    if (position < 0) {
                        throw new ParserException("Offset to end of mdat was negative.");
                    }
                    extractorInput.skipFully(position);
                    enterReadingAtomHeaderState();
                    return false;
                }
                int position2 = (int) (nextFragmentRun.fragment.trunDataPosition[nextFragmentRun.currentTrackRunIndex] - extractorInput.getPosition());
                if (position2 < 0) {
                    Log.w(TAG, "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                extractorInput.skipFully(position2);
                this.currentTrackBundle = nextFragmentRun;
            }
            TrackBundle trackBundle = this.currentTrackBundle;
            int[] iArr = trackBundle.fragment.sampleSizeTable;
            int i5 = trackBundle.currentSampleIndex;
            int i6 = iArr[i5];
            this.sampleSize = i6;
            if (i5 < trackBundle.firstSampleToOutputIndex) {
                extractorInput.skipFully(i6);
                this.currentTrackBundle.skipSampleEncryptionData();
                if (!this.currentTrackBundle.next()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (trackBundle.track.sampleTransformation == 1) {
                this.sampleSize = i6 - 8;
                extractorInput.skipFully(8);
            }
            int outputSampleEncryptionData = this.currentTrackBundle.outputSampleEncryptionData();
            this.sampleBytesWritten = outputSampleEncryptionData;
            this.sampleSize += outputSampleEncryptionData;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        TrackBundle trackBundle2 = this.currentTrackBundle;
        TrackFragment trackFragment = trackBundle2.fragment;
        Track track = trackBundle2.track;
        TrackOutput trackOutput = trackBundle2.output;
        int i7 = trackBundle2.currentSampleIndex;
        long samplePresentationTime = trackFragment.getSamplePresentationTime(i7) * 1000;
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            samplePresentationTime = timestampAdjuster.adjustSampleTimestamp(samplePresentationTime);
        }
        long j = samplePresentationTime;
        int i8 = track.nalUnitLengthFieldLength;
        if (i8 == 0) {
            while (true) {
                int i9 = this.sampleBytesWritten;
                int i10 = this.sampleSize;
                if (i9 >= i10) {
                    break;
                }
                this.sampleBytesWritten += trackOutput.sampleData(extractorInput, i10 - i9, false);
            }
        } else {
            byte[] bArr = this.nalPrefix.data;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i11 = i8 + 1;
            int i12 = 4 - i8;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i13 = this.sampleCurrentNalBytesRemaining;
                if (i13 == 0) {
                    extractorInput.readFully(bArr, i12, i11);
                    this.nalPrefix.setPosition(i4);
                    this.sampleCurrentNalBytesRemaining = this.nalPrefix.readUnsignedIntToInt() - i3;
                    this.nalStartCode.setPosition(i4);
                    trackOutput.sampleData(this.nalStartCode, i2);
                    trackOutput.sampleData(this.nalPrefix, i3);
                    this.processSeiNalUnitPayload = (this.cea608TrackOutputs.length <= 0 || !NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, bArr[i2])) ? i4 : i3;
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i12;
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i13);
                        extractorInput.readFully(this.nalBuffer.data, i4, this.sampleCurrentNalBytesRemaining);
                        trackOutput.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        sampleData = this.sampleCurrentNalBytesRemaining;
                        ParsableByteArray parsableByteArray = this.nalBuffer;
                        int unescapeStream = NalUnitUtil.unescapeStream(parsableByteArray.data, parsableByteArray.limit());
                        this.nalBuffer.setPosition("video/hevc".equals(track.format.sampleMimeType) ? 1 : 0);
                        this.nalBuffer.setLimit(unescapeStream);
                        CeaUtil.consume(j, this.nalBuffer, this.cea608TrackOutputs);
                    } else {
                        sampleData = trackOutput.sampleData(extractorInput, i13, i4);
                    }
                    this.sampleBytesWritten += sampleData;
                    this.sampleCurrentNalBytesRemaining -= sampleData;
                    i2 = 4;
                    i3 = 1;
                    i4 = 0;
                }
            }
        }
        boolean z = trackFragment.sampleIsSyncFrameTable[i7];
        if (trackFragment.definesEncryptionData) {
            int i14 = (z ? 1 : 0) | 1073741824;
            TrackEncryptionBox trackEncryptionBox = trackFragment.trackEncryptionBox;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = track.getSampleDescriptionEncryptionBox(trackFragment.header.sampleDescriptionIndex);
            }
            i = i14;
            cryptoData = trackEncryptionBox.cryptoData;
        } else {
            i = z ? 1 : 0;
            cryptoData = null;
        }
        trackOutput.sampleMetadata(j, i, this.sampleSize, 0, cryptoData);
        outputPendingMetadataSamples(j);
        if (!this.currentTrackBundle.next()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return true;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == Atom.TYPE_moov || i == Atom.TYPE_trak || i == Atom.TYPE_mdia || i == Atom.TYPE_minf || i == Atom.TYPE_stbl || i == Atom.TYPE_moof || i == Atom.TYPE_traf || i == Atom.TYPE_mvex || i == Atom.TYPE_edts;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == Atom.TYPE_hdlr || i == Atom.TYPE_mdhd || i == Atom.TYPE_mvhd || i == Atom.TYPE_sidx || i == Atom.TYPE_stsd || i == Atom.TYPE_tfdt || i == Atom.TYPE_tfhd || i == Atom.TYPE_tkhd || i == Atom.TYPE_trex || i == Atom.TYPE_trun || i == Atom.TYPE_pssh || i == Atom.TYPE_saiz || i == Atom.TYPE_saio || i == Atom.TYPE_senc || i == Atom.TYPE_uuid || i == Atom.TYPE_sbgp || i == Atom.TYPE_sgpd || i == Atom.TYPE_elst || i == Atom.TYPE_mehd || i == Atom.TYPE_emsg;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        Track track = this.sideloadedTrack;
        if (track != null) {
            TrackBundle trackBundle = new TrackBundle(extractorOutput.track(0, track.type));
            trackBundle.init(this.sideloadedTrack, new DefaultSampleValues(0, 0, 0, 0));
            this.trackBundles.put(0, trackBundle);
            maybeInitExtraTracks();
            this.extractorOutput.endTracks();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        while (true) {
            int i = this.parserState;
            if (i != 0) {
                if (i == 1) {
                    readAtomPayload(extractorInput);
                } else if (i == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        int size = this.trackBundles.size();
        for (int i = 0; i < size; i++) {
            this.trackBundles.valueAt(i).reset();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j2;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return Sniffer.sniffFragmented(extractorInput);
    }

    public FragmentedMp4Extractor(int i) {
        this(i, null);
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int parseFullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if ((parseFullAtomFlags & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (parseFullAtomFlags & 2) != 0;
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == trackFragment.sampleCount) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z);
            trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
            trackFragment.fillEncryptionData(parsableByteArray);
        } else {
            throw new ParserException("Length mismatch: " + readUnsignedIntToInt + ", " + trackFragment.sampleCount);
        }
    }

    public FragmentedMp4Extractor(int i, @Nullable TimestampAdjuster timestampAdjuster) {
        this(i, timestampAdjuster, null, null);
    }

    public FragmentedMp4Extractor(int i, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, @Nullable DrmInitData drmInitData) {
        this(i, timestampAdjuster, track, drmInitData, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, @Nullable DrmInitData drmInitData, List<Format> list) {
        this(i, timestampAdjuster, track, drmInitData, list, null);
    }

    public FragmentedMp4Extractor(int i, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable TrackOutput trackOutput) {
        this.flags = i | (track != null ? 8 : 0);
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.sideloadedDrmInitData = drmInitData;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        this.extendedTypeScratch = new byte[16];
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.durationUs = -9223372036854775807L;
        this.pendingSeekTimeUs = -9223372036854775807L;
        this.segmentIndexEarliestPresentationTimeUs = -9223372036854775807L;
        enterReadingAtomHeaderState();
    }
}

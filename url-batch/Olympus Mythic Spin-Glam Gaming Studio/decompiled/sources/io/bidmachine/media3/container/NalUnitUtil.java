package io.bidmachine.media3.container;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.media3.common.ColorInfo;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.CodecSpecificDataUtil;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes12.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    public static final int H264_NAL_UNIT_TYPE_AUD = 9;
    public static final int H264_NAL_UNIT_TYPE_IDR = 5;
    public static final int H264_NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int H264_NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int H264_NAL_UNIT_TYPE_PPS = 8;
    public static final int H264_NAL_UNIT_TYPE_PREFIX = 14;
    public static final int H264_NAL_UNIT_TYPE_SEI = 6;
    public static final int H264_NAL_UNIT_TYPE_SPS = 7;
    public static final int H264_NAL_UNIT_TYPE_UNSPECIFIED = 24;
    public static final int H265_NAL_UNIT_TYPE_AUD = 35;
    public static final int H265_NAL_UNIT_TYPE_BLA_W_LP = 16;
    public static final int H265_NAL_UNIT_TYPE_CRA = 21;
    public static final int H265_NAL_UNIT_TYPE_PPS = 34;
    public static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int H265_NAL_UNIT_TYPE_RASL_R = 9;
    public static final int H265_NAL_UNIT_TYPE_SPS = 33;
    public static final int H265_NAL_UNIT_TYPE_SUFFIX_SEI = 40;
    public static final int H265_NAL_UNIT_TYPE_UNSPECIFIED = 48;
    public static final int H265_NAL_UNIT_TYPE_VPS = 32;
    private static final int INVALID_ID = -1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_AUD = 9;

    @Deprecated
    public static final int NAL_UNIT_TYPE_IDR = 5;

    @Deprecated
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PPS = 8;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PREFIX = 14;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SEI = 6;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    private static int applyConformanceWindowToHeight(int i, int i2, int i3, int i4) {
        return i - ((i2 == 1 ? 2 : 1) * (i3 + i4));
    }

    private static int applyConformanceWindowToWidth(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    public static boolean isH264NalUnitDependedOn(byte b) {
        if (((b & 96) >> 5) != 0) {
            return true;
        }
        int i = b & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.profileIdc = i;
            this.constraintsFlagsAndReservedZero2Bits = i2;
            this.levelIdc = i3;
            this.seqParameterSetId = i4;
            this.maxNumRefFrames = i5;
            this.width = i6;
            this.height = i7;
            this.pixelWidthHeightRatio = f;
            this.bitDepthLumaMinus8 = i8;
            this.bitDepthChromaMinus8 = i9;
            this.separateColorPlaneFlag = z;
            this.frameMbsOnlyFlag = z2;
            this.frameNumLength = i10;
            this.picOrderCountType = i11;
            this.picOrderCntLsbLength = i12;
            this.deltaPicOrderAlwaysZeroFlag = z3;
            this.colorSpace = i13;
            this.colorRange = i14;
            this.colorTransfer = i15;
            this.maxNumReorderFrames = i16;
        }
    }

    public static final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i, int i2, int i3) {
            this.nalUnitType = i;
            this.layerId = i2;
            this.temporalId = i3;
        }
    }

    public static final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i, int i2) {
            this.layerIdInVps = i;
            this.viewId = i2;
        }
    }

    public static final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
            this.generalProfileSpace = i;
            this.generalTierFlag = z;
            this.generalProfileIdc = i2;
            this.generalProfileCompatibilityFlags = i3;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i4;
        }
    }

    public static final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final ImmutableList<H265ProfileTierLevel> profileTierLevels;

        public H265ProfileTierLevelsAndIndices(List<H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i, int i2, int i3, int i4, int i5) {
            this.chromaFormatIdc = i;
            this.bitDepthLumaMinus8 = i2;
            this.bitDepthChromaMinus8 = i3;
            this.width = i4;
            this.height = i5;
        }
    }

    public static final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final ImmutableList<H265RepFormat> repFormats;

        public H265RepFormatsAndIndices(List<H265RepFormat> list, int[] iArr) {
            this.repFormats = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i, int i2, int i3) {
            this.colorSpace = i;
            this.colorRange = i2;
            this.colorTransfer = i3;
        }
    }

    public static final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final ImmutableList<H265VideoSignalInfo> videoSignalInfos;

        public H265VideoSignalInfosAndIndices(List<H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265VpsData {
        public final ImmutableList<H265LayerInfo> layerInfos;
        public final H265NalHeader nalHeader;
        public final H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;

        @Nullable
        public final H265RepFormatsAndIndices repFormatsAndIndices;

        @Nullable
        public final H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(H265NalHeader h265NalHeader, @Nullable List<H265LayerInfo> list, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, @Nullable H265RepFormatsAndIndices h265RepFormatsAndIndices, @Nullable H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            this.nalHeader = h265NalHeader;
            this.layerInfos = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int height;
        public final int maxNumReorderPics;
        public final int maxSubLayersMinus1;
        public final H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;

        @Nullable
        public final H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(H265NalHeader h265NalHeader, int i, @Nullable H265ProfileTierLevel h265ProfileTierLevel, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, int i10, int i11) {
            this.nalHeader = h265NalHeader;
            this.maxSubLayersMinus1 = i;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i2;
            this.bitDepthLumaMinus8 = i3;
            this.bitDepthChromaMinus8 = i4;
            this.seqParameterSetId = i5;
            this.width = i6;
            this.height = i7;
            this.pixelWidthHeightRatio = f;
            this.maxNumReorderPics = i8;
            this.colorSpace = i9;
            this.colorRange = i10;
            this.colorTransfer = i11;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i, int i2, boolean z) {
            this.picParameterSetId = i;
            this.seqParameterSetId = i2;
            this.bottomFieldPicOrderInFramePresentFlag = z;
        }
    }

    public static final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.precRefDisplayWidth = i;
            this.precRefViewingDist = i2;
            this.numRefDisplays = i3;
            this.leftViewId = i4;
            this.rightViewId = i5;
            this.exponentRefDisplayWidth = i6;
            this.mantissaRefDisplayWidth = i7;
            this.exponentRefViewingDist = i8;
            this.mantissaRefViewingDist = i9;
        }
    }

    public static int unescapeStream(byte[] bArr, int i) {
        int i2;
        synchronized (scratchEscapePositionsLock) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = findNextUnescapeIndex(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i4) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = scratchEscapePositions[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    @Deprecated
    public static boolean isNalUnitSei(@Nullable String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
    }

    public static boolean isNalUnitSei(Format format, byte b) {
        if ((Objects.equals(format.sampleMimeType, "video/avc") || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, "video/avc")) && (b & 31) == 6) {
            return true;
        }
        return (Objects.equals(format.sampleMimeType, "video/hevc") || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, "video/hevc")) && ((b & 126) >> 1) == 39;
    }

    public static int getNalUnitType(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int numberOfBytesInNalUnitHeader(Format format) {
        if (Objects.equals(format.sampleMimeType, "video/avc")) {
            return 1;
        }
        return (Objects.equals(format.sampleMimeType, "video/hevc") || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, "video/hevc")) ? 2 : 0;
    }

    public static boolean isDependedOn(byte[] bArr, int i, int i2, Format format) {
        if (Objects.equals(format.sampleMimeType, "video/avc")) {
            return isH264NalUnitDependedOn(bArr[i]);
        }
        if (Objects.equals(format.sampleMimeType, "video/hevc")) {
            return isH265NalUnitDependedOn(bArr, i, i2, format);
        }
        return true;
    }

    private static boolean isH265NalUnitDependedOn(byte[] bArr, int i, int i2, Format format) {
        H265NalHeader parseH265NalHeader = parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i, i2 + i));
        int i3 = parseH265NalHeader.nalUnitType;
        if (i3 == 35) {
            return false;
        }
        return (i3 <= 14 && i3 % 2 == 0 && parseH265NalHeader.temporalId == format.maxSubLayers - 1) ? false : true;
    }

    public static int getH265NalUnitType(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i, int i2) {
        return parseSpsNalUnitPayload(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpsData parseSpsNalUnitPayload(byte[] bArr, int i, int i2) {
        int readUnsignedExpGolombCodedInt;
        boolean readBit;
        int readUnsignedExpGolombCodedInt2;
        int readUnsignedExpGolombCodedInt3;
        int i3;
        int i4;
        boolean z;
        boolean readBit2;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        int readBits = parsableNalUnitBitArray.readBits(8);
        int readBits2 = parsableNalUnitBitArray.readBits(8);
        int readBits3 = parsableNalUnitBitArray.readBits(8);
        int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readBits == 100 || readBits == 110 || readBits == 122 || readBits == 244 || readBits == 44 || readBits == 83 || readBits == 86 || readBits == 118 || readBits == 128 || readBits == 138) {
            readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readBit = readUnsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i12 = readUnsignedExpGolombCodedInt == 3 ? 12 : 8;
                int i13 = 0;
                while (i13 < i12) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i13 < 6 ? 16 : 64);
                    }
                    i13++;
                }
            }
        } else {
            readUnsignedExpGolombCodedInt = 1;
            readBit = false;
            readUnsignedExpGolombCodedInt2 = 0;
            readUnsignedExpGolombCodedInt3 = 0;
        }
        int readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (readUnsignedExpGolombCodedInt6 == 0) {
            i3 = readBits;
            i4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        } else {
            if (readUnsignedExpGolombCodedInt6 == 1) {
                boolean readBit3 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                i3 = readBits;
                long readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i14 = 0; i14 < readUnsignedExpGolombCodedInt7; i14++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z = readBit3;
                i4 = 0;
                int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.skipBit();
                int readUnsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                int readUnsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                readBit2 = parsableNalUnitBitArray.readBit();
                int i15 = (2 - (readBit2 ? 1 : 0)) * readUnsignedExpGolombCodedInt10;
                if (!readBit2) {
                    parsableNalUnitBitArray.skipBit();
                }
                parsableNalUnitBitArray.skipBit();
                int i16 = readUnsignedExpGolombCodedInt9 * 16;
                int i17 = i15 * 16;
                if (parsableNalUnitBitArray.readBit()) {
                    int readUnsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int readUnsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int readUnsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int readUnsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    if (readUnsignedExpGolombCodedInt == 0) {
                        i11 = 2 - (readBit2 ? 1 : 0);
                        i10 = 1;
                    } else {
                        i10 = readUnsignedExpGolombCodedInt == 3 ? 1 : 2;
                        i11 = (readUnsignedExpGolombCodedInt == 1 ? 2 : 1) * (2 - (readBit2 ? 1 : 0));
                    }
                    i16 -= (readUnsignedExpGolombCodedInt11 + readUnsignedExpGolombCodedInt12) * i10;
                    i17 -= (readUnsignedExpGolombCodedInt13 + readUnsignedExpGolombCodedInt14) * i11;
                }
                int i18 = i17;
                int i19 = i3;
                int i20 = i16;
                int i21 = ((i19 != 44 || i19 == 86 || i19 == 100 || i19 == 110 || i19 == 122 || i19 == 244) && (readBits2 & 16) != 0) ? 0 : 16;
                int i22 = -1;
                float f2 = 1.0f;
                if (parsableNalUnitBitArray.readBit()) {
                    i5 = i21;
                    i6 = -1;
                    f = 1.0f;
                    i7 = -1;
                } else {
                    if (parsableNalUnitBitArray.readBit()) {
                        int readBits4 = parsableNalUnitBitArray.readBits(8);
                        if (readBits4 == 255) {
                            int readBits5 = parsableNalUnitBitArray.readBits(16);
                            int readBits6 = parsableNalUnitBitArray.readBits(16);
                            if (readBits5 != 0 && readBits6 != 0) {
                                f2 = readBits5 / readBits6;
                            }
                        } else {
                            float[] fArr = ASPECT_RATIO_IDC_VALUES;
                            if (readBits4 < fArr.length) {
                                f2 = fArr[readBits4];
                            } else {
                                Log.w(TAG, "Unexpected aspect_ratio_idc value: " + readBits4);
                            }
                        }
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBits(3);
                        i9 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                        if (parsableNalUnitBitArray.readBit()) {
                            int readBits7 = parsableNalUnitBitArray.readBits(8);
                            int readBits8 = parsableNalUnitBitArray.readBits(8);
                            parsableNalUnitBitArray.skipBits(8);
                            i22 = ColorInfo.isoColorPrimariesToColorSpace(readBits7);
                            i8 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits8);
                        } else {
                            i8 = -1;
                        }
                    } else {
                        i8 = -1;
                        i9 = -1;
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBits(65);
                    }
                    boolean readBit4 = parsableNalUnitBitArray.readBit();
                    if (readBit4) {
                        skipHrdParameters(parsableNalUnitBitArray);
                    }
                    boolean readBit5 = parsableNalUnitBitArray.readBit();
                    if (readBit5) {
                        skipHrdParameters(parsableNalUnitBitArray);
                    }
                    if (readBit4 || readBit5) {
                        parsableNalUnitBitArray.skipBit();
                    }
                    parsableNalUnitBitArray.skipBit();
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i21 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    i5 = i21;
                    i6 = i8;
                    f = f2;
                    i7 = i9;
                }
                return new SpsData(i19, readBits2, readBits3, readUnsignedExpGolombCodedInt4, readUnsignedExpGolombCodedInt8, i20, i18, f, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt3, readBit, readBit2, readUnsignedExpGolombCodedInt5, readUnsignedExpGolombCodedInt6, i4, z, i22, i7, i6, i5);
            }
            i3 = readBits;
            i4 = 0;
        }
        z = false;
        int readUnsignedExpGolombCodedInt82 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int readUnsignedExpGolombCodedInt92 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int readUnsignedExpGolombCodedInt102 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        readBit2 = parsableNalUnitBitArray.readBit();
        int i152 = (2 - (readBit2 ? 1 : 0)) * readUnsignedExpGolombCodedInt102;
        if (!readBit2) {
        }
        parsableNalUnitBitArray.skipBit();
        int i162 = readUnsignedExpGolombCodedInt92 * 16;
        int i172 = i152 * 16;
        if (parsableNalUnitBitArray.readBit()) {
        }
        int i182 = i172;
        int i192 = i3;
        int i202 = i162;
        if (i192 != 44) {
        }
        int i222 = -1;
        float f22 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
        }
        return new SpsData(i192, readBits2, readBits3, readUnsignedExpGolombCodedInt4, readUnsignedExpGolombCodedInt82, i202, i182, f, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt3, readBit, readBit2, readUnsignedExpGolombCodedInt5, readUnsignedExpGolombCodedInt6, i4, z, i222, i7, i6, i5);
    }

    public static H265VpsData parseH265VpsNalUnit(byte[] bArr, int i, int i2) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        return parseH265VpsNalUnitPayload(parsableNalUnitBitArray, parseH265NalHeader(parsableNalUnitBitArray));
    }

    private static H265NalHeader parseH265NalHeader(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static H265VpsData parseH265VpsNalUnitPayload(ParsableNalUnitBitArray parsableNalUnitBitArray, H265NalHeader h265NalHeader) {
        int[][] iArr;
        int i;
        int i2;
        int i3;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i4;
        int i5;
        boolean[][] zArr;
        int i6;
        boolean[][] zArr2;
        int[] iArr2;
        int i7;
        int[] iArr3;
        parsableNalUnitBitArray.skipBits(4);
        boolean readBit = parsableNalUnitBitArray.readBit();
        boolean readBit2 = parsableNalUnitBitArray.readBit();
        int readBits = parsableNalUnitBitArray.readBits(6);
        int i8 = readBits + 1;
        int readBits2 = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBits(17);
        boolean z = true;
        H265ProfileTierLevel parseH265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, readBits2, null);
        for (int i9 = parsableNalUnitBitArray.readBit() ? 0 : readBits2; i9 <= readBits2; i9++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int readBits3 = parsableNalUnitBitArray.readBits(6);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new H265ProfileTierLevelsAndIndices(ImmutableList.of(parseH265ProfileTierLevel), new int[1]);
        Object[] objArr = i8 >= 2 && readUnsignedExpGolombCodedInt >= 2;
        Object[] objArr2 = readBit && readBit2;
        int i10 = readBits3 + 1;
        Object[] objArr3 = i10 >= i8;
        if (objArr == false || objArr2 == false || objArr3 == false) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, readUnsignedExpGolombCodedInt, i10);
        int[] iArr5 = new int[readUnsignedExpGolombCodedInt];
        int[] iArr6 = new int[readUnsignedExpGolombCodedInt];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i11 = 1; i11 < readUnsignedExpGolombCodedInt; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 <= readBits3; i13++) {
                if (parsableNalUnitBitArray.readBit()) {
                    iArr4[i11][i12] = i13;
                    iArr6[i11] = i13;
                    i12++;
                }
                iArr5[i11] = i12;
            }
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(64);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i14 = 0;
            while (i14 < readUnsignedExpGolombCodedInt2) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (i14 != 0 && !parsableNalUnitBitArray.readBit()) {
                    z = false;
                }
                skipH265HrdParameters(parsableNalUnitBitArray, z, readBits2);
                i14++;
                z = true;
            }
        }
        if (!parsableNalUnitBitArray.readBit()) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        parsableNalUnitBitArray.byteAlign();
        H265ProfileTierLevel parseH265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, false, readBits2, parseH265ProfileTierLevel);
        boolean readBit3 = parsableNalUnitBitArray.readBit();
        boolean[] zArr3 = new boolean[16];
        int i15 = 0;
        for (int i16 = 0; i16 < 16; i16++) {
            boolean readBit4 = parsableNalUnitBitArray.readBit();
            zArr3[i16] = readBit4;
            if (readBit4) {
                i15++;
            }
        }
        if (i15 == 0 || !zArr3[1]) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr7 = new int[i15];
        for (int i17 = 0; i17 < i15 - (readBit3 ? 1 : 0); i17++) {
            iArr7[i17] = parsableNalUnitBitArray.readBits(3);
        }
        int[] iArr8 = new int[i15 + 1];
        if (readBit3) {
            int i18 = 1;
            while (i18 < i15) {
                int[][] iArr9 = iArr4;
                for (int i19 = 0; i19 < i18; i19++) {
                    iArr8[i18] = iArr8[i18] + iArr7[i19] + 1;
                }
                i18++;
                iArr4 = iArr9;
            }
            iArr = iArr4;
            iArr8[i15] = 6;
        } else {
            iArr = iArr4;
        }
        int[][] iArr10 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i15);
        int[] iArr11 = new int[i8];
        iArr11[0] = 0;
        boolean readBit5 = parsableNalUnitBitArray.readBit();
        int i20 = 1;
        while (i20 < i8) {
            if (readBit5) {
                i7 = readBits2;
                iArr11[i20] = parsableNalUnitBitArray.readBits(6);
            } else {
                i7 = readBits2;
                iArr11[i20] = i20;
            }
            if (readBit3) {
                iArr3 = iArr7;
                for (int i21 = 0; i21 < i15; i21++) {
                    iArr10[i20][i21] = (iArr11[i20] & ((1 << iArr8[r32]) - 1)) >> iArr8[i21];
                }
            } else {
                int i22 = 0;
                while (i22 < i15) {
                    iArr10[i20][i22] = parsableNalUnitBitArray.readBits(iArr7[i22] + 1);
                    i22++;
                    iArr7 = iArr7;
                }
                iArr3 = iArr7;
            }
            i20++;
            readBits2 = i7;
            iArr7 = iArr3;
        }
        int i23 = readBits2;
        int[] iArr12 = new int[i10];
        int i24 = 1;
        for (int i25 = 0; i25 < i8; i25++) {
            iArr12[iArr11[i25]] = -1;
            int i26 = 0;
            for (int i27 = 0; i27 < 16; i27++) {
                if (zArr3[i27]) {
                    if (i27 == 1) {
                        iArr12[iArr11[i25]] = iArr10[i25][i26];
                    }
                    i26++;
                }
            }
            if (i25 > 0) {
                int i28 = 0;
                while (true) {
                    if (i28 >= i25) {
                        i24++;
                        break;
                    }
                    if (iArr12[iArr11[i25]] == iArr12[iArr11[i28]]) {
                        break;
                    }
                    i28++;
                }
            }
        }
        int readBits4 = parsableNalUnitBitArray.readBits(4);
        if (i24 < 2 || readBits4 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr13 = new int[i24];
        for (int i29 = 0; i29 < i24; i29++) {
            iArr13[i29] = parsableNalUnitBitArray.readBits(readBits4);
        }
        int[] iArr14 = new int[i10];
        for (int i30 = 0; i30 < i8; i30++) {
            iArr14[Math.min(iArr11[i30], readBits3)] = i30;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int i31 = 0;
        while (i31 <= readBits3) {
            int min = Math.min(iArr12[i31], i24 - 1);
            builder.add((Object) new H265LayerInfo(iArr14[i31], min >= 0 ? iArr13[min] : -1));
            i31++;
            iArr12 = iArr12;
        }
        ImmutableList build = builder.build();
        if (((H265LayerInfo) build.get(0)).viewId == -1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i32 = 1;
        while (true) {
            if (i32 > readBits3) {
                i = -1;
                i2 = -1;
                break;
            }
            i = -1;
            if (((H265LayerInfo) build.get(i32)).viewId != -1) {
                i2 = i32;
                break;
            }
            i32++;
        }
        if (i2 == i) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls, i8, i8);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls, i8, i8);
        for (int i33 = 1; i33 < i8; i33++) {
            for (int i34 = 0; i34 < i33; i34++) {
                boolean[] zArr6 = zArr4[i33];
                boolean[] zArr7 = zArr5[i33];
                boolean readBit6 = parsableNalUnitBitArray.readBit();
                zArr7[i34] = readBit6;
                zArr6[i34] = readBit6;
            }
        }
        for (int i35 = 1; i35 < i8; i35++) {
            for (int i36 = 0; i36 < readBits; i36++) {
                int i37 = 0;
                while (true) {
                    if (i37 < i35) {
                        boolean[] zArr8 = zArr5[i35];
                        if (zArr8[i37] && zArr5[i37][i36]) {
                            zArr8[i36] = true;
                            break;
                        }
                        i37++;
                    }
                }
            }
        }
        int[] iArr15 = new int[i10];
        for (int i38 = 0; i38 < i8; i38++) {
            int i39 = 0;
            for (int i40 = 0; i40 < i38; i40++) {
                i39 += zArr4[i38][i40] ? 1 : 0;
            }
            iArr15[iArr11[i38]] = i39;
        }
        int i41 = 0;
        for (int i42 = 0; i42 < i8; i42++) {
            if (iArr15[iArr11[i42]] == 0) {
                i41++;
            }
        }
        if (i41 > 1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr16 = new int[i8];
        int[] iArr17 = new int[readUnsignedExpGolombCodedInt];
        if (parsableNalUnitBitArray.readBit()) {
            for (int i43 = 0; i43 < i8; i43++) {
                iArr16[i43] = parsableNalUnitBitArray.readBits(3);
            }
            i3 = i23;
        } else {
            i3 = i23;
            Arrays.fill(iArr16, 0, i8, i3);
        }
        int i44 = 0;
        while (i44 < readUnsignedExpGolombCodedInt) {
            boolean[][] zArr9 = zArr5;
            int[] iArr18 = iArr15;
            int[] iArr19 = iArr11;
            int i45 = 0;
            for (int i46 = 0; i46 < iArr5[i44]; i46++) {
                i45 = Math.max(i45, iArr16[((H265LayerInfo) build.get(iArr[i44][i46])).layerIdInVps]);
            }
            iArr17[i44] = i45 + 1;
            i44++;
            iArr11 = iArr19;
            iArr15 = iArr18;
            zArr5 = zArr9;
        }
        boolean[][] zArr10 = zArr5;
        int[] iArr20 = iArr15;
        int[] iArr21 = iArr11;
        if (parsableNalUnitBitArray.readBit()) {
            int i47 = 0;
            while (i47 < readBits) {
                int i48 = i47 + 1;
                for (int i49 = i48; i49 < i8; i49++) {
                    if (zArr4[i49][i47]) {
                        parsableNalUnitBitArray.skipBits(3);
                    }
                }
                i47 = i48;
            }
        }
        parsableNalUnitBitArray.skipBit();
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add((Object) parseH265ProfileTierLevel);
        if (readUnsignedExpGolombCodedInt3 > 1) {
            H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel2;
            builder2.add((Object) h265ProfileTierLevel);
            for (int i50 = 2; i50 < readUnsignedExpGolombCodedInt3; i50++) {
                h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, parsableNalUnitBitArray.readBit(), i3, h265ProfileTierLevel);
                builder2.add((Object) h265ProfileTierLevel);
            }
        }
        ImmutableList build2 = builder2.build();
        int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + readUnsignedExpGolombCodedInt;
        if (readUnsignedExpGolombCodedInt4 > readUnsignedExpGolombCodedInt) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int readBits5 = parsableNalUnitBitArray.readBits(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, readUnsignedExpGolombCodedInt4, i10);
        int[] iArr22 = new int[readUnsignedExpGolombCodedInt4];
        int[] iArr23 = new int[readUnsignedExpGolombCodedInt4];
        int i51 = 0;
        while (i51 < readUnsignedExpGolombCodedInt) {
            int i52 = readUnsignedExpGolombCodedInt;
            iArr22[i51] = 0;
            iArr23[i51] = iArr6[i51];
            if (readBits5 == 0) {
                zArr2 = zArr4;
                iArr2 = iArr17;
                i6 = i8;
                Arrays.fill(zArr11[i51], 0, iArr5[i51], true);
                iArr22[i51] = iArr5[i51];
            } else {
                i6 = i8;
                zArr2 = zArr4;
                iArr2 = iArr17;
                if (readBits5 == 1) {
                    int i53 = iArr6[i51];
                    for (int i54 = 0; i54 < iArr5[i51]; i54++) {
                        zArr11[i51][i54] = iArr[i51][i54] == i53;
                    }
                    iArr22[i51] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr22[0] = 1;
                    i51++;
                    readUnsignedExpGolombCodedInt = i52;
                    zArr4 = zArr2;
                    iArr17 = iArr2;
                    i8 = i6;
                }
            }
            i51++;
            readUnsignedExpGolombCodedInt = i52;
            zArr4 = zArr2;
            iArr17 = iArr2;
            i8 = i6;
        }
        int i55 = i8;
        boolean[][] zArr12 = zArr4;
        int[] iArr24 = iArr17;
        int i56 = readUnsignedExpGolombCodedInt;
        int[] iArr25 = new int[i10];
        int i57 = 2;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, readUnsignedExpGolombCodedInt4, i10);
        int i58 = 1;
        int i59 = 0;
        while (i58 < readUnsignedExpGolombCodedInt4) {
            if (readBits5 == i57) {
                for (int i60 = 0; i60 < iArr5[i58]; i60++) {
                    zArr11[i58][i60] = parsableNalUnitBitArray.readBit();
                    int i61 = iArr22[i58];
                    boolean z2 = zArr11[i58][i60];
                    iArr22[i58] = i61 + (z2 ? 1 : 0);
                    if (z2) {
                        iArr23[i58] = iArr[i58][i60];
                    }
                }
            }
            if (i59 == 0 && iArr[i58][0] == 0 && zArr11[i58][0]) {
                for (int i62 = 1; i62 < iArr5[i58]; i62++) {
                    if (iArr[i58][i62] == i2 && zArr11[i58][i2]) {
                        i59 = i58;
                    }
                }
            }
            int i63 = 0;
            while (i63 < iArr5[i58]) {
                if (readUnsignedExpGolombCodedInt3 > 1) {
                    zArr13[i58][i63] = zArr11[i58][i63];
                    zArr = zArr11;
                    i4 = readUnsignedExpGolombCodedInt3;
                    int log2 = DoubleMath.log2(readUnsignedExpGolombCodedInt3, RoundingMode.CEILING);
                    if (!zArr13[i58][i63]) {
                        int i64 = ((H265LayerInfo) build.get(iArr[i58][i63])).layerIdInVps;
                        int i65 = 0;
                        while (i65 < i63) {
                            i5 = i2;
                            if (zArr10[i64][((H265LayerInfo) build.get(iArr[i58][i65])).layerIdInVps]) {
                                zArr13[i58][i63] = true;
                                break;
                            }
                            i65++;
                            i2 = i5;
                        }
                    }
                    i5 = i2;
                    if (zArr13[i58][i63]) {
                        if (i59 > 0 && i58 == i59) {
                            iArr25[i63] = parsableNalUnitBitArray.readBits(log2);
                        } else {
                            parsableNalUnitBitArray.skipBits(log2);
                        }
                    }
                } else {
                    i4 = readUnsignedExpGolombCodedInt3;
                    i5 = i2;
                    zArr = zArr11;
                }
                i63++;
                zArr11 = zArr;
                readUnsignedExpGolombCodedInt3 = i4;
                i2 = i5;
            }
            int i66 = readUnsignedExpGolombCodedInt3;
            int i67 = i2;
            boolean[][] zArr14 = zArr11;
            if (iArr22[i58] == 1 && iArr20[iArr23[i58]] > 0) {
                parsableNalUnitBitArray.skipBit();
            }
            i58++;
            zArr11 = zArr14;
            readUnsignedExpGolombCodedInt3 = i66;
            i2 = i67;
            i57 = 2;
        }
        if (i59 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        H265RepFormatsAndIndices parseH265RepFormatsAndIndices = parseH265RepFormatsAndIndices(parsableNalUnitBitArray, i55);
        parsableNalUnitBitArray.skipBits(2);
        for (int i68 = 1; i68 < i55; i68++) {
            if (iArr20[iArr21[i68]] == 0) {
                parsableNalUnitBitArray.skipBit();
            }
        }
        skipH265DpbSize(parsableNalUnitBitArray, readUnsignedExpGolombCodedInt4, iArr24, iArr5, zArr13);
        skipToH265VuiPresentFlagAfterDpbSize(parsableNalUnitBitArray, i55, zArr12);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.byteAlign();
            h265VideoSignalInfosAndIndices = parseH265VideoSignalInfosAndIndices(parsableNalUnitBitArray, i55, i56, iArr24);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new H265VpsData(h265NalHeader, build, new H265ProfileTierLevelsAndIndices(build2, iArr25), parseH265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i, int i2, @Nullable H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i + 2, i2, parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i, i2)), h265VpsData);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i, int i2, H265NalHeader h265NalHeader, @Nullable H265VpsData h265VpsData) {
        int readUnsignedExpGolombCodedInt;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i13;
        int i14;
        int i15;
        H265RepFormatsAndIndices h265RepFormatsAndIndices;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        parsableNalUnitBitArray.skipBits(4);
        int readBits = parsableNalUnitBitArray.readBits(3);
        boolean z = h265NalHeader.layerId != 0 && readBits == 7;
        int i16 = (h265VpsData == null || h265VpsData.layerInfos.isEmpty()) ? 0 : h265VpsData.layerInfos.get(Math.min(h265NalHeader.layerId, h265VpsData.layerInfos.size() - 1)).layerIdInVps;
        H265ProfileTierLevel h265ProfileTierLevel = null;
        if (!z) {
            parsableNalUnitBitArray.skipBit();
            h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, readBits, null);
        } else if (h265VpsData != null) {
            H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = h265VpsData.profileTierLevelsAndIndices;
            int i17 = h265ProfileTierLevelsAndIndices.indices[i16];
            if (h265ProfileTierLevelsAndIndices.profileTierLevels.size() > i17) {
                h265ProfileTierLevel = h265VpsData.profileTierLevelsAndIndices.profileTierLevels.get(i17);
            }
        }
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z) {
            int readBits2 = parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBits(8) : -1;
            if (h265VpsData != null && (h265RepFormatsAndIndices = h265VpsData.repFormatsAndIndices) != null) {
                if (readBits2 == -1) {
                    readBits2 = h265RepFormatsAndIndices.indices[i16];
                }
                if (readBits2 != -1 && h265RepFormatsAndIndices.repFormats.size() > readBits2) {
                    H265RepFormat h265RepFormat = h265VpsData.repFormatsAndIndices.repFormats.get(readBits2);
                    i3 = h265RepFormat.chromaFormatIdc;
                    i4 = h265RepFormat.width;
                    i5 = h265RepFormat.height;
                    i6 = h265RepFormat.bitDepthLumaMinus8;
                    readUnsignedExpGolombCodedInt = h265RepFormat.bitDepthChromaMinus8;
                }
            }
            i5 = 0;
            i6 = 0;
            readUnsignedExpGolombCodedInt = 0;
            i3 = 0;
            i4 = 0;
        } else {
            int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (readUnsignedExpGolombCodedInt3 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (parsableNalUnitBitArray.readBit()) {
                int readUnsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                readUnsignedExpGolombCodedInt4 = applyConformanceWindowToWidth(readUnsignedExpGolombCodedInt4, readUnsignedExpGolombCodedInt3, readUnsignedExpGolombCodedInt6, readUnsignedExpGolombCodedInt7);
                readUnsignedExpGolombCodedInt5 = applyConformanceWindowToHeight(readUnsignedExpGolombCodedInt5, readUnsignedExpGolombCodedInt3, readUnsignedExpGolombCodedInt8, readUnsignedExpGolombCodedInt9);
            }
            int readUnsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            i3 = readUnsignedExpGolombCodedInt3;
            i4 = readUnsignedExpGolombCodedInt4;
            i5 = readUnsignedExpGolombCodedInt5;
            i6 = readUnsignedExpGolombCodedInt10;
        }
        int readUnsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z) {
            i7 = -1;
        } else {
            i7 = -1;
            for (int i18 = parsableNalUnitBitArray.readBit() ? 0 : readBits; i18 <= readBits; i18++) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                i7 = Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), i7);
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            if (z ? parsableNalUnitBitArray.readBit() : false) {
                parsableNalUnitBitArray.skipBits(6);
            } else if (parsableNalUnitBitArray.readBit()) {
                skipH265ScalingList(parsableNalUnitBitArray);
            }
        }
        int i19 = 2;
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipH265ShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i20 = 0;
            while (i20 < readUnsignedExpGolombCodedInt12) {
                parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt11 + 5);
                i20++;
                i19 = 2;
            }
        }
        parsableNalUnitBitArray.skipBits(i19);
        float f2 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int readBits3 = parsableNalUnitBitArray.readBits(8);
                if (readBits3 == 255) {
                    int readBits4 = parsableNalUnitBitArray.readBits(16);
                    int readBits5 = parsableNalUnitBitArray.readBits(16);
                    if (readBits4 != 0 && readBits5 != 0) {
                        f2 = readBits4 / readBits5;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (readBits3 < fArr.length) {
                        f2 = fArr[readBits3];
                    } else {
                        Log.w(TAG, "Unexpected aspect_ratio_idc value: " + readBits3);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i12 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int readBits6 = parsableNalUnitBitArray.readBits(8);
                    int readBits7 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    i14 = ColorInfo.isoColorPrimariesToColorSpace(readBits6);
                    i15 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits7);
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                    if (parsableNalUnitBitArray.readBit()) {
                        i5 *= 2;
                    }
                    i10 = i12;
                    i9 = i14;
                    i11 = i15;
                    f = f2;
                    i8 = i5;
                }
                i14 = -1;
                i15 = -1;
                if (parsableNalUnitBitArray.readBit()) {
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                i10 = i12;
                i9 = i14;
                i11 = i15;
                f = f2;
                i8 = i5;
            } else if (h265VpsData != null && (h265VideoSignalInfosAndIndices = h265VpsData.videoSignalInfosAndIndices) != null && h265VideoSignalInfosAndIndices.videoSignalInfos.size() > (i13 = h265VideoSignalInfosAndIndices.indices[i16])) {
                H265VideoSignalInfo h265VideoSignalInfo = h265VpsData.videoSignalInfosAndIndices.videoSignalInfos.get(i13);
                i14 = h265VideoSignalInfo.colorSpace;
                int i21 = h265VideoSignalInfo.colorRange;
                i15 = h265VideoSignalInfo.colorTransfer;
                i12 = i21;
                if (parsableNalUnitBitArray.readBit()) {
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                i10 = i12;
                i9 = i14;
                i11 = i15;
                f = f2;
                i8 = i5;
            } else {
                i12 = -1;
                i14 = -1;
                i15 = -1;
                if (parsableNalUnitBitArray.readBit()) {
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                i10 = i12;
                i9 = i14;
                i11 = i15;
                f = f2;
                i8 = i5;
            }
        } else {
            f = 1.0f;
            i8 = i5;
            i9 = -1;
            i10 = -1;
            i11 = -1;
        }
        return new H265SpsData(h265NalHeader, readBits, h265ProfileTierLevel, i3, i6, readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, i4, i8, f, i7, i9, i10, i11);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i, int i2) {
        return parsePpsNalUnitPayload(bArr, i + 1, i2);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i, int i2) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    @Nullable
    public static H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i, int i2) {
        byte b;
        int max;
        int max2;
        int i3 = i + 2;
        do {
            i2--;
            b = bArr[i2];
            if (b != 0) {
                break;
            }
        } while (i2 > i3);
        if (b != 0 && i2 > i3) {
            ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i3, i2 + 1);
            while (parsableNalUnitBitArray.canReadBits(16)) {
                int readBits = parsableNalUnitBitArray.readBits(8);
                int i4 = 0;
                while (readBits == 255) {
                    i4 += 255;
                    readBits = parsableNalUnitBitArray.readBits(8);
                }
                int i5 = i4 + readBits;
                int readBits2 = parsableNalUnitBitArray.readBits(8);
                int i6 = 0;
                while (readBits2 == 255) {
                    i6 += 255;
                    readBits2 = parsableNalUnitBitArray.readBits(8);
                }
                int i7 = i6 + readBits2;
                if (i7 == 0 || !parsableNalUnitBitArray.canReadBits(i7)) {
                    break;
                }
                if (i5 == 176) {
                    int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    boolean readBit = parsableNalUnitBitArray.readBit();
                    int readUnsignedExpGolombCodedInt2 = readBit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                    int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int i8 = -1;
                    int i9 = -1;
                    int i10 = -1;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = -1;
                    for (int i14 = 0; i14 <= readUnsignedExpGolombCodedInt3; i14++) {
                        i8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i10 = parsableNalUnitBitArray.readBits(6);
                        if (i10 == 63) {
                            return null;
                        }
                        if (i10 == 0) {
                            max = Math.max(0, readUnsignedExpGolombCodedInt - 30);
                        } else {
                            max = Math.max(0, (i10 + readUnsignedExpGolombCodedInt) - 31);
                        }
                        i11 = parsableNalUnitBitArray.readBits(max);
                        if (readBit) {
                            i12 = parsableNalUnitBitArray.readBits(6);
                            if (i12 == 63) {
                                return null;
                            }
                            if (i12 == 0) {
                                max2 = Math.max(0, readUnsignedExpGolombCodedInt2 - 30);
                            } else {
                                max2 = Math.max(0, (i12 + readUnsignedExpGolombCodedInt2) - 31);
                            }
                            i13 = parsableNalUnitBitArray.readBits(max2);
                        }
                        if (parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.skipBits(10);
                        }
                    }
                    return new H265Sei3dRefDisplayInfoData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt3 + 1, i8, i9, i10, i11, i12, i13);
                }
            }
        }
        return null;
    }

    public static int findNalUnit(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        Assertions.checkState(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    clearPrefixFlags(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @Nullable
    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = list.get(i);
            int length = bArr.length;
            if (length > 3) {
                ImmutableList<Integer> findNalUnitPositions = findNalUnitPositions(bArr);
                for (int i2 = 0; i2 < findNalUnitPositions.size(); i2++) {
                    if (findNalUnitPositions.get(i2).intValue() + 3 < length) {
                        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, findNalUnitPositions.get(i2).intValue() + 3, length);
                        H265NalHeader parseH265NalHeader = parseH265NalHeader(parsableNalUnitBitArray);
                        if (parseH265NalHeader.nalUnitType == 33 && parseH265NalHeader.layerId == 0) {
                            return createCodecStringFromH265SpsPalyoad(parsableNalUnitBitArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static ImmutableList<Integer> findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (i < bArr.length) {
            int findNalUnit = findNalUnit(bArr, i, bArr.length, zArr);
            if (findNalUnit != bArr.length) {
                builder.add((Object) Integer.valueOf(findNalUnit));
            }
            i = findNalUnit + 3;
        }
        return builder.build();
    }

    @Nullable
    private static String createCodecStringFromH265SpsPalyoad(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(4);
        int readBits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        H265ProfileTierLevel parseH265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, readBits, null);
        return CodecSpecificDataUtil.buildHevcCodecString(parseH265ProfileTierLevel.generalProfileSpace, parseH265ProfileTierLevel.generalTierFlag, parseH265ProfileTierLevel.generalProfileIdc, parseH265ProfileTierLevel.generalProfileCompatibilityFlags, parseH265ProfileTierLevel.constraintBytes, parseH265ProfileTierLevel.generalLevelIdc);
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void skipH265HrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z, int i) {
        ?? r9;
        ?? r1;
        boolean z2;
        boolean readBit;
        if (z) {
            boolean readBit2 = parsableNalUnitBitArray.readBit();
            boolean readBit3 = parsableNalUnitBitArray.readBit();
            if (readBit2 || readBit3) {
                z2 = parsableNalUnitBitArray.readBit();
                if (z2) {
                    parsableNalUnitBitArray.skipBits(19);
                }
                parsableNalUnitBitArray.skipBits(8);
                if (z2) {
                    parsableNalUnitBitArray.skipBits(4);
                }
                parsableNalUnitBitArray.skipBits(15);
                r1 = readBit3;
                r9 = readBit2;
            } else {
                z2 = false;
                r1 = readBit3;
                r9 = readBit2;
            }
        } else {
            r9 = 0;
            r1 = 0;
            z2 = false;
        }
        for (int i2 = 0; i2 <= i; i2++) {
            boolean readBit4 = parsableNalUnitBitArray.readBit();
            if (!readBit4) {
                readBit4 = parsableNalUnitBitArray.readBit();
            }
            if (readBit4) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                readBit = false;
            } else {
                readBit = parsableNalUnitBitArray.readBit();
            }
            int readUnsignedExpGolombCodedInt = !readBit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
            int i3 = r9 + r1;
            for (int i4 = 0; i4 < i3; i4++) {
                for (int i5 = 0; i5 <= readUnsignedExpGolombCodedInt; i5++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    if (z2) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static H265ProfileTierLevel parseH265ProfileTierLevel(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z, int i, @Nullable H265ProfileTierLevel h265ProfileTierLevel) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            int readBits = parsableNalUnitBitArray.readBits(2);
            z3 = parsableNalUnitBitArray.readBit();
            i5 = parsableNalUnitBitArray.readBits(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (parsableNalUnitBitArray.readBit()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = parsableNalUnitBitArray.readBits(8);
            }
            i2 = readBits;
        } else if (h265ProfileTierLevel != null) {
            int i9 = h265ProfileTierLevel.generalProfileSpace;
            z3 = h265ProfileTierLevel.generalTierFlag;
            i5 = h265ProfileTierLevel.generalProfileIdc;
            i6 = h265ProfileTierLevel.generalProfileCompatibilityFlags;
            iArr2 = h265ProfileTierLevel.constraintBytes;
            i2 = i9;
        } else {
            iArr = iArr2;
            i2 = 0;
            z2 = false;
            i3 = 0;
            i4 = 0;
            int readBits2 = parsableNalUnitBitArray.readBits(8);
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                if (parsableNalUnitBitArray.readBit()) {
                    i10 += 88;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    i10 += 8;
                }
            }
            parsableNalUnitBitArray.skipBits(i10);
            if (i > 0) {
                parsableNalUnitBitArray.skipBits((8 - i) * 2);
            }
            return new H265ProfileTierLevel(i2, z2, i3, i4, iArr, readBits2);
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int readBits22 = parsableNalUnitBitArray.readBits(8);
        int i102 = 0;
        while (i11 < i) {
        }
        parsableNalUnitBitArray.skipBits(i102);
        if (i > 0) {
        }
        return new H265ProfileTierLevel(i2, z2, i3, i4, iArr, readBits22);
    }

    private static H265RepFormatsAndIndices parseH265RepFormatsAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i2 = readUnsignedExpGolombCodedInt + 1;
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(i2);
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i2; i3++) {
            builderWithExpectedSize.add((Object) parseH265RepFormat(parsableNalUnitBitArray));
        }
        int i4 = 1;
        if (i2 <= 1 || !parsableNalUnitBitArray.readBit()) {
            while (i4 < i) {
                iArr[i4] = Math.min(i4, readUnsignedExpGolombCodedInt);
                i4++;
            }
        } else {
            int log2 = DoubleMath.log2(i2, RoundingMode.CEILING);
            while (i4 < i) {
                iArr[i4] = parsableNalUnitBitArray.readBits(log2);
                i4++;
            }
        }
        return new H265RepFormatsAndIndices(builderWithExpectedSize.build(), iArr);
    }

    private static H265RepFormat parseH265RepFormat(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i;
        int i2;
        int i3;
        int readBits = parsableNalUnitBitArray.readBits(16);
        int readBits2 = parsableNalUnitBitArray.readBits(16);
        if (parsableNalUnitBitArray.readBit()) {
            int readBits3 = parsableNalUnitBitArray.readBits(2);
            if (readBits3 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int readBits4 = parsableNalUnitBitArray.readBits(4);
            i3 = parsableNalUnitBitArray.readBits(4);
            i2 = readBits4;
            i = readBits3;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readBits = applyConformanceWindowToWidth(readBits, i, readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2);
            readBits2 = applyConformanceWindowToHeight(readBits2, i, readUnsignedExpGolombCodedInt3, readUnsignedExpGolombCodedInt4);
        }
        return new H265RepFormat(i, i2, i3, readBits, readBits2);
    }

    private static void skipH265DpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, int[] iArr, int[] iArr2, boolean[][] zArr) {
        boolean z;
        for (int i2 = 1; i2 < i; i2++) {
            boolean readBit = parsableNalUnitBitArray.readBit();
            int i3 = 0;
            while (i3 < iArr[i2]) {
                if (i3 <= 0 || !readBit) {
                    z = i3 == 0;
                } else {
                    z = parsableNalUnitBitArray.readBit();
                }
                if (z) {
                    for (int i4 = 0; i4 < iArr2[i2]; i4++) {
                        if (zArr[i2][i4]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i3++;
            }
        }
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, boolean[][] zArr) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt);
        } else {
            for (int i2 = 1; i2 < i; i2++) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (zArr[i2][i3]) {
                        parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i4 = 1; i4 <= readUnsignedExpGolombCodedInt2; i4++) {
            parsableNalUnitBitArray.skipBits(8);
        }
    }

    private static H265VideoSignalInfosAndIndices parseH265VideoSignalInfosAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, int i2, int[] iArr) {
        if (!parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBit() : true) {
            parsableNalUnitBitArray.skipBit();
        }
        boolean readBit = parsableNalUnitBitArray.readBit();
        boolean readBit2 = parsableNalUnitBitArray.readBit();
        if (readBit || readBit2) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < iArr[i3]; i4++) {
                    boolean readBit3 = readBit ? parsableNalUnitBitArray.readBit() : false;
                    boolean readBit4 = readBit2 ? parsableNalUnitBitArray.readBit() : false;
                    if (readBit3) {
                        parsableNalUnitBitArray.skipBits(32);
                    }
                    if (readBit4) {
                        parsableNalUnitBitArray.skipBits(18);
                    }
                }
            }
        }
        boolean readBit5 = parsableNalUnitBitArray.readBit();
        int readBits = readBit5 ? parsableNalUnitBitArray.readBits(4) + 1 : i;
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(readBits);
        int[] iArr2 = new int[i];
        for (int i5 = 0; i5 < readBits; i5++) {
            builderWithExpectedSize.add((Object) parseH265VideoSignalInfo(parsableNalUnitBitArray));
        }
        if (readBit5 && readBits > 1) {
            for (int i6 = 0; i6 < i; i6++) {
                iArr2[i6] = parsableNalUnitBitArray.readBits(4);
            }
        }
        return new H265VideoSignalInfosAndIndices(builderWithExpectedSize.build(), iArr2);
    }

    private static H265VideoSignalInfo parseH265VideoSignalInfo(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(3);
        int i = parsableNalUnitBitArray.readBit() ? 1 : 2;
        int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
        int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
        parsableNalUnitBitArray.skipBits(8);
        return new H265VideoSignalInfo(isoColorPrimariesToColorSpace, i, isoTransferCharacteristicsToColorTransfer);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i = 0; i < readUnsignedExpGolombCodedInt; i++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void skipH265ShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < readUnsignedExpGolombCodedInt; i3++) {
            if (i3 != 0 && parsableNalUnitBitArray.readBit()) {
                int i4 = i + i2;
                int readUnsignedExpGolombCodedInt2 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i5 = i4 + 1;
                boolean[] zArr = new boolean[i5];
                for (int i6 = 0; i6 <= i4; i6++) {
                    if (!parsableNalUnitBitArray.readBit()) {
                        zArr[i6] = parsableNalUnitBitArray.readBit();
                    } else {
                        zArr[i6] = true;
                    }
                }
                int[] iArr3 = new int[i5];
                int[] iArr4 = new int[i5];
                int i7 = 0;
                for (int i8 = i2 - 1; i8 >= 0; i8--) {
                    int i9 = iArr2[i8] + readUnsignedExpGolombCodedInt2;
                    if (i9 < 0 && zArr[i + i8]) {
                        iArr3[i7] = i9;
                        i7++;
                    }
                }
                if (readUnsignedExpGolombCodedInt2 < 0 && zArr[i4]) {
                    iArr3[i7] = readUnsignedExpGolombCodedInt2;
                    i7++;
                }
                for (int i10 = 0; i10 < i; i10++) {
                    int i11 = iArr[i10] + readUnsignedExpGolombCodedInt2;
                    if (i11 < 0 && zArr[i10]) {
                        iArr3[i7] = i11;
                        i7++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i7);
                int i12 = 0;
                for (int i13 = i - 1; i13 >= 0; i13--) {
                    int i14 = iArr[i13] + readUnsignedExpGolombCodedInt2;
                    if (i14 > 0 && zArr[i13]) {
                        iArr4[i12] = i14;
                        i12++;
                    }
                }
                if (readUnsignedExpGolombCodedInt2 > 0 && zArr[i4]) {
                    iArr4[i12] = readUnsignedExpGolombCodedInt2;
                    i12++;
                }
                for (int i15 = 0; i15 < i2; i15++) {
                    int i16 = iArr2[i15] + readUnsignedExpGolombCodedInt2;
                    if (i16 > 0 && zArr[i + i15]) {
                        iArr4[i12] = i16;
                        i12++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i12);
                iArr = copyOf;
                i = i7;
                i2 = i12;
            } else {
                int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr5 = new int[readUnsignedExpGolombCodedInt3];
                int i17 = 0;
                while (i17 < readUnsignedExpGolombCodedInt3) {
                    iArr5[i17] = (i17 > 0 ? iArr5[i17 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i17++;
                }
                int[] iArr6 = new int[readUnsignedExpGolombCodedInt4];
                int i18 = 0;
                while (i18 < readUnsignedExpGolombCodedInt4) {
                    iArr6[i18] = (i18 > 0 ? iArr6[i18 - 1] : 0) + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                    i18++;
                }
                i = readUnsignedExpGolombCodedInt3;
                iArr = iArr5;
                i2 = readUnsignedExpGolombCodedInt4;
                iArr2 = iArr6;
            }
        }
    }

    private NalUnitUtil() {
    }
}

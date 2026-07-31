package io.bidmachine.media3.extractor;

import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.ParsableBitArray;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes8.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    private static final int CHANNEL_MODE_22_2 = 15;
    private static final int CHANNEL_MODE_3_0 = 2;
    private static final int CHANNEL_MODE_5_0 = 3;
    private static final int CHANNEL_MODE_5_1 = 4;
    private static final int CHANNEL_MODE_7_0_322 = 9;
    private static final int CHANNEL_MODE_7_0_34 = 5;
    private static final int CHANNEL_MODE_7_0_4 = 11;
    private static final int CHANNEL_MODE_7_0_52 = 7;
    private static final int CHANNEL_MODE_7_1_322 = 10;
    private static final int CHANNEL_MODE_7_1_34 = 6;
    private static final int CHANNEL_MODE_7_1_4 = 12;
    private static final int CHANNEL_MODE_7_1_52 = 8;
    private static final int CHANNEL_MODE_9_0_4 = 13;
    private static final int CHANNEL_MODE_9_1_4 = 14;
    private static final int CHANNEL_MODE_MONO = 0;
    private static final int CHANNEL_MODE_STEREO = 1;
    private static final int CHANNEL_MODE_UNKNOWN = -1;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    private static int getChannelCountFromChannelMode(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i, int i2, int i3, int i4, int i5) {
            this.bitstreamVersion = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i4;
            this.sampleCount = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, @Nullable String str2, @Nullable DrmInitData drmInitData) throws ParserException {
        int i;
        boolean readBit;
        int readBits;
        int readBits2;
        int i2;
        int i3;
        boolean z;
        boolean readBit2;
        int i4;
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int bitsLeft = parsableBitArray.bitsLeft();
        int readBits3 = parsableBitArray.readBits(3);
        if (readBits3 > 1) {
            throw ParserException.createForUnsupportedContainerFeature("Unsupported AC-4 DSI version: " + readBits3);
        }
        int readBits4 = parsableBitArray.readBits(7);
        int i5 = parsableBitArray.readBit() ? 48000 : 44100;
        parsableBitArray.skipBits(4);
        int readBits5 = parsableBitArray.readBits(9);
        if (readBits4 > 1) {
            if (readBits3 == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Invalid AC-4 DSI version: " + readBits3);
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(128);
                }
            }
        }
        if (readBits3 == 1) {
            if (!skipDsiBitrate(parsableBitArray)) {
                throw ParserException.createForUnsupportedContainerFeature("Invalid AC-4 DSI bitrate.");
            }
            parsableBitArray.byteAlign();
        }
        Ac4Presentation ac4Presentation = new Ac4Presentation();
        for (int i6 = 0; i6 < readBits5; i6++) {
            if (readBits3 == 0) {
                readBit = parsableBitArray.readBit();
                readBits = parsableBitArray.readBits(5);
                readBits2 = parsableBitArray.readBits(5);
                i2 = 0;
                i3 = 0;
                z = false;
            } else {
                int readBits6 = parsableBitArray.readBits(8);
                i2 = parsableBitArray.readBits(8);
                if (i2 == 255) {
                    i2 += parsableBitArray.readBits(16);
                }
                if (readBits6 > 2) {
                    parsableBitArray.skipBits(i2 * 8);
                } else {
                    i3 = (bitsLeft - parsableBitArray.bitsLeft()) / 8;
                    int readBits7 = parsableBitArray.readBits(5);
                    z = readBits7 == 31;
                    readBits2 = readBits6;
                    readBits = readBits7;
                    readBit = false;
                }
            }
            if (readBit || z || readBits != 6) {
                ac4Presentation.level = parsableBitArray.readBits(3);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                parsableBitArray.skipBits(2);
                if (readBits3 == 1 && (readBits2 == 1 || readBits2 == 2)) {
                    parsableBitArray.skipBits(2);
                }
                parsableBitArray.skipBits(5);
                parsableBitArray.skipBits(10);
                if (readBits3 == 1) {
                    if (readBits2 > 0) {
                        ac4Presentation.isChannelCoded = parsableBitArray.readBit();
                    }
                    if (ac4Presentation.isChannelCoded) {
                        if (readBits2 == 1 || readBits2 == 2) {
                            int readBits8 = parsableBitArray.readBits(5);
                            if (readBits8 >= 0 && readBits8 <= 15) {
                                ac4Presentation.channelMode = readBits8;
                            }
                            if (readBits8 >= 11 && readBits8 <= 14) {
                                ac4Presentation.hasBackChannels = parsableBitArray.readBit();
                                ac4Presentation.topChannelPairs = parsableBitArray.readBits(2);
                            }
                        }
                        parsableBitArray.skipBits(24);
                        i4 = 1;
                    } else {
                        i4 = 1;
                    }
                    if (readBits2 == i4 || readBits2 == 2) {
                        if (parsableBitArray.readBit() && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(2);
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBit();
                            int i7 = 8;
                            int readBits9 = parsableBitArray.readBits(8);
                            int i8 = 0;
                            while (i8 < readBits9) {
                                parsableBitArray.skipBits(i7);
                                i8++;
                                i7 = 8;
                            }
                        }
                    }
                }
                if (!readBit && !z) {
                    parsableBitArray.skipBit();
                    if (readBits == 0 || readBits == 1 || readBits == 2) {
                        if (readBits2 == 0) {
                            for (int i9 = 0; i9 < 2; i9++) {
                                parseDsiSubstream(parsableBitArray, ac4Presentation);
                            }
                        } else {
                            for (int i10 = 0; i10 < 2; i10++) {
                                parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                            }
                        }
                    } else if (readBits == 3 || readBits == 4) {
                        if (readBits2 == 0) {
                            for (int i11 = 0; i11 < 3; i11++) {
                                parseDsiSubstream(parsableBitArray, ac4Presentation);
                            }
                        } else {
                            int i12 = 0;
                            for (int i13 = 3; i12 < i13; i13 = 3) {
                                parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                                i12++;
                            }
                        }
                    } else if (readBits != 5) {
                        int readBits10 = parsableBitArray.readBits(7);
                        for (int i14 = 0; i14 < readBits10; i14++) {
                            parsableBitArray.skipBits(8);
                        }
                    } else if (readBits2 == 0) {
                        parseDsiSubstream(parsableBitArray, ac4Presentation);
                    } else {
                        int readBits11 = parsableBitArray.readBits(3);
                        for (int i15 = 0; i15 < readBits11 + 2; i15++) {
                            parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                        }
                    }
                } else if (readBits2 == 0) {
                    parseDsiSubstream(parsableBitArray, ac4Presentation);
                } else {
                    parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                }
                parsableBitArray.skipBit();
                readBit2 = parsableBitArray.readBit();
            } else {
                readBit2 = true;
            }
            if (readBit2) {
                int readBits12 = parsableBitArray.readBits(7);
                for (int i16 = 0; i16 < readBits12; i16++) {
                    parsableBitArray.skipBits(15);
                }
            }
            if (readBits2 > 0) {
                if (parsableBitArray.readBit() && !skipDsiBitrate(parsableBitArray)) {
                    throw ParserException.createForUnsupportedContainerFeature("Can't parse bitrate DSI.");
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.byteAlign();
                    parsableBitArray.skipBytes(parsableBitArray.readBits(16));
                    int readBits13 = parsableBitArray.readBits(5);
                    for (int i17 = 0; i17 < readBits13; i17++) {
                        parsableBitArray.skipBits(3);
                        parsableBitArray.skipBits(8);
                    }
                }
            }
            parsableBitArray.byteAlign();
            if (readBits3 == 1) {
                int bitsLeft2 = ((bitsLeft - parsableBitArray.bitsLeft()) / 8) - i3;
                if (i2 < bitsLeft2) {
                    throw ParserException.createForUnsupportedContainerFeature("pres_bytes is smaller than presentation bytes read.");
                }
                parsableBitArray.skipBytes(i2 - bitsLeft2);
            }
            if (ac4Presentation.isChannelCoded && ac4Presentation.channelMode == -1) {
                throw ParserException.createForUnsupportedContainerFeature("Can't determine channel mode of presentation " + i6);
            }
            if (!ac4Presentation.isChannelCoded) {
                i = getAdjustedChannelCount(ac4Presentation.channelMode, ac4Presentation.hasBackChannels, ac4Presentation.topChannelPairs);
            } else {
                i = ac4Presentation.numOfUmxObjects + 1;
                if (ac4Presentation.level == 4 && i == 17) {
                    i = 21;
                }
            }
            if (i > 0) {
                throw ParserException.createForUnsupportedContainerFeature("Can't determine channel count of presentation.");
            }
            return new Format.Builder().setId(str).setSampleMimeType("audio/ac4").setChannelCount(i).setSampleRate(i5).setDrmInitData(drmInitData).setLanguage(str2).build();
        }
        if (!ac4Presentation.isChannelCoded) {
        }
        if (i > 0) {
        }
    }

    private static void parseDsiSubstream(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        int readBits = parsableBitArray.readBits(5);
        parsableBitArray.skipBits(2);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(5);
        }
        if (readBits >= 7 && readBits <= 10) {
            parsableBitArray.skipBit();
        }
        if (parsableBitArray.readBit()) {
            int readBits2 = parsableBitArray.readBits(3);
            if (ac4Presentation.channelMode == -1 && readBits >= 0 && readBits <= 15 && (readBits2 == 0 || readBits2 == 1)) {
                ac4Presentation.channelMode = readBits;
            }
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static void parseDsiSubstreamGroup(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        parsableBitArray.skipBits(2);
        boolean readBit = parsableBitArray.readBit();
        int readBits = parsableBitArray.readBits(8);
        for (int i = 0; i < readBits; i++) {
            parsableBitArray.skipBits(2);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
            }
            if (readBit) {
                parsableBitArray.skipBits(24);
            } else {
                if (parsableBitArray.readBit()) {
                    if (!parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(4);
                    }
                    ac4Presentation.numOfUmxObjects = parsableBitArray.readBits(6) + 1;
                }
                parsableBitArray.skipBits(4);
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(3);
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static void skipDsiLanguage(ParsableBitArray parsableBitArray) throws ParserException {
        int readBits = parsableBitArray.readBits(6);
        if (readBits < 2 || readBits > 42) {
            throw ParserException.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(readBits)));
        }
        parsableBitArray.skipBits(readBits * 8);
    }

    private static boolean skipDsiBitrate(ParsableBitArray parsableBitArray) {
        if (parsableBitArray.bitsLeft() < 66) {
            return false;
        }
        parsableBitArray.skipBits(66);
        return true;
    }

    private static int getAdjustedChannelCount(int i, boolean z, int i2) {
        int channelCountFromChannelMode = getChannelCountFromChannelMode(i);
        if (i != 11 && i != 12 && i != 13 && i != 14) {
            return channelCountFromChannelMode;
        }
        if (!z) {
            channelCountFromChannelMode -= 2;
        }
        return i2 != 0 ? i2 != 1 ? channelCountFromChannelMode : channelCountFromChannelMode - 2 : channelCountFromChannelMode - 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (r11 != 11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r11 != 8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBits2 == 65535) {
            readBits2 = parsableBitArray.readBits(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = readBits2 + i;
        if (readBits == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int readBits3 = parsableBitArray.readBits(2);
        if (readBits3 == 3) {
            readBits3 += readVariableBits(parsableBitArray, 2);
        }
        int i5 = readBits3;
        int readBits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        int i6 = parsableBitArray.readBit() ? 48000 : 44100;
        int readBits5 = parsableBitArray.readBits(4);
        if (i6 == 44100 && readBits5 == 13) {
            i2 = SAMPLE_COUNT[readBits5];
        } else {
            if (i6 == 48000) {
                int[] iArr = SAMPLE_COUNT;
                if (readBits5 < iArr.length) {
                    int i7 = iArr[readBits5];
                    int i8 = readBits4 % 5;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            if (readBits5 != 8) {
                            }
                            i7++;
                            i2 = i7;
                        } else if (i8 != 3) {
                            if (i8 == 4) {
                                if (readBits5 != 3) {
                                    if (readBits5 != 8) {
                                    }
                                }
                                i7++;
                            }
                            i2 = i7;
                        }
                    }
                    if (readBits5 != 3) {
                    }
                    i7++;
                    i2 = i7;
                }
            }
            i2 = 0;
        }
        return new SyncFrameInfo(i5, 2, i6, i4, i2);
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        if (i3 == 65535) {
            i3 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    public static void getAc4SampleHeader(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i >> 16) & 255);
        data[5] = (byte) ((i >> 8) & 255);
        data[6] = (byte) (i & 255);
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i) {
        int i2 = 0;
        while (true) {
            int readBits = i2 + parsableBitArray.readBits(i);
            if (!parsableBitArray.readBit()) {
                return readBits;
            }
            i2 = (readBits + 1) << i;
        }
    }

    private static final class Ac4Presentation {
        public int channelMode;
        public boolean hasBackChannels;
        public boolean isChannelCoded;
        public int level;
        public int numOfUmxObjects;
        public int topChannelPairs;

        private Ac4Presentation() {
            this.isChannelCoded = true;
            this.channelMode = -1;
            this.numOfUmxObjects = -1;
            this.hasBackChannels = true;
            this.topChannelPairs = 2;
            this.level = 0;
        }
    }

    private Ac4Util() {
    }
}

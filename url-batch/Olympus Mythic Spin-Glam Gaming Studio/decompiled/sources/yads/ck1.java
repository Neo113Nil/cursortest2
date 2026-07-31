package yads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class ck1 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ck1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = "video".equals(vt1.c(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("TmV4dXMgMTA=", 0), r4).equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlci5zZWN1cmU=", 0), r4).equals(r9) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ck1 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        boolean z3;
        int i;
        if (codecCapabilities != null && (i = sb3.a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i <= 22) {
                byte[] decode = Base64.decode("T0RST0lELVhVMw==", 0);
                Charset charset = Charsets.UTF_8;
                String str4 = new String(decode, charset);
                String str5 = sb3.d;
                if (!str4.equals(str5)) {
                }
                if (!new String(Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlcg==", 0), charset).equals(str)) {
                }
            }
            z3 = true;
            if (codecCapabilities != null && sb3.a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            return new ck1(str, str2, str3, codecCapabilities, z, z3, !z2 || (codecCapabilities != null && sb3.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
        }
        z3 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new ck1(str, str2, str3, codecCapabilities, z, z3, !z2 || (codecCapabilities != null && sb3.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final boolean b(jw0 jw0Var) {
        if (this.h) {
            return this.e;
        }
        Pair b = qk1.b(jw0Var);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    public final String toString() {
        return this.a;
    }

    public final boolean a(jw0 jw0Var) {
        int i;
        Pair b;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.b.equals(jw0Var.m) && !this.b.equals(qk1.a(jw0Var))) {
            return false;
        }
        int i2 = 16;
        if (jw0Var.j != null && (b = qk1.b(jw0Var)) != null) {
            int intValue = ((Integer) b.first).intValue();
            int intValue2 = ((Integer) b.second).intValue();
            int i3 = 8;
            if ("video/dolby-vision".equals(jw0Var.m)) {
                if ("video/avc".equals(this.b)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(this.b)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (this.h || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (sb3.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
                    int intValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i3 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i3 = 512;
                    } else if (intValue3 >= 60000000) {
                        i3 = 256;
                    } else if (intValue3 >= 30000000) {
                        i3 = 128;
                    } else if (intValue3 >= 18000000) {
                        i3 = 64;
                    } else if (intValue3 >= 12000000) {
                        i3 = 32;
                    } else if (intValue3 >= 7200000) {
                        i3 = 16;
                    } else if (intValue3 < 3600000) {
                        i3 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i3;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                        if ("video/hevc".equals(this.b) && 2 == intValue) {
                            byte[] decode = Base64.decode("c2FpbGZpc2g=", 0);
                            Charset charset = Charsets.UTF_8;
                            String str = new String(decode, charset);
                            String str2 = sb3.b;
                            if (!str.equals(str2) && !new String(Base64.decode("bWFybGlu", 0), charset).equals(str2)) {
                            }
                        }
                    }
                }
                a("codec.profileLevel, " + jw0Var.j + ", " + this.c);
                return false;
            }
        }
        if (this.h) {
            int i4 = jw0Var.r;
            if (i4 <= 0 || (i = jw0Var.s) <= 0) {
                return true;
            }
            if (sb3.a >= 21) {
                return a(i4, i, jw0Var.t);
            }
            boolean z = i4 * i <= qk1.a();
            if (!z) {
                a("legacyFrameSize, " + jw0Var.r + VastAttributes.HORIZONTAL_POSITION + jw0Var.s);
            }
            return z;
        }
        int i5 = sb3.a;
        if (i5 >= 21) {
            int i6 = jw0Var.A;
            if (i6 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                if (audioCapabilities == null) {
                    a("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i6)) {
                    a("sampleRate.support, " + i6);
                    return false;
                }
            }
            int i7 = jw0Var.z;
            if (i7 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    a("channelCount.aCaps");
                    return false;
                }
                String str3 = this.a;
                String str4 = this.b;
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i5 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                    if ("audio/ac3".equals(str4)) {
                        i2 = 6;
                    } else if (!"audio/eac3".equals(str4)) {
                        i2 = 30;
                    }
                    gh1.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i2 + X3.j.e);
                    maxInputChannelCount = i2;
                }
                if (maxInputChannelCount < i7) {
                    a("channelCount.support, " + i7);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (sb3.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final hb0 a(jw0 jw0Var, jw0 jw0Var2) {
        int i = !sb3.a(jw0Var.m, jw0Var2.m) ? 8 : 0;
        if (this.h) {
            if (jw0Var.u != jw0Var2.u) {
                i |= 1024;
            }
            if (!this.e && (jw0Var.r != jw0Var2.r || jw0Var.s != jw0Var2.s)) {
                i |= 512;
            }
            if (!sb3.a(jw0Var.y, jw0Var2.y)) {
                i |= 2048;
            }
            String str = this.a;
            String str2 = sb3.d;
            dk1 dk1Var = tk2.c;
            if (str2.startsWith(dk1Var.b()) && dk1Var.a().equals(str) && !jw0Var.a(jw0Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new hb0(this.a, jw0Var, jw0Var2, jw0Var.a(jw0Var2) ? 3 : 2, 0);
            }
        } else {
            if (jw0Var.z != jw0Var2.z) {
                i |= 4096;
            }
            if (jw0Var.A != jw0Var2.A) {
                i |= 8192;
            }
            if (jw0Var.B != jw0Var2.B) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair b = qk1.b(jw0Var);
                Pair b2 = qk1.b(jw0Var2);
                if (b != null && b2 != null) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new hb0(this.a, jw0Var, jw0Var2, 3, 0);
                    }
                }
            }
            if (!jw0Var.a(jw0Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new hb0(this.a, jw0Var, jw0Var2, 1, 0);
            }
        }
        return new hb0(this.a, jw0Var, jw0Var2, 0, i);
    }

    public final boolean a(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = sb3.a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i4, i5);
        }
        if (!isSizeSupported) {
            if (i < i2) {
                String str = this.a;
                byte[] decode = Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkhFVkM=", 0);
                Charset charset = Charsets.UTF_8;
                if (!new String(decode, charset).equals(str) || !new String(Base64.decode("bWN2NWE=", 0), charset).equals(sb3.b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i2 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i6 = point2.x;
                    int i7 = point2.y;
                    if (d != -1.0d && d >= 1.0d) {
                        isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i6, i7, Math.floor(d));
                    } else {
                        isSizeSupported2 = videoCapabilities.isSizeSupported(i6, i7);
                    }
                    if (isSizeSupported2) {
                        gh1.a("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + VastAttributes.HORIZONTAL_POSITION + i2 + VastAttributes.HORIZONTAL_POSITION + d) + "] [" + this.a + ", " + this.b + "] [" + sb3.e + X3.j.e);
                    }
                }
            }
            a("sizeAndRate.support, " + i + VastAttributes.HORIZONTAL_POSITION + i2 + VastAttributes.HORIZONTAL_POSITION + d);
            return false;
        }
        return true;
    }

    public final void a(String str) {
        gh1.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.b + "] [" + sb3.e + X3.j.e);
    }
}

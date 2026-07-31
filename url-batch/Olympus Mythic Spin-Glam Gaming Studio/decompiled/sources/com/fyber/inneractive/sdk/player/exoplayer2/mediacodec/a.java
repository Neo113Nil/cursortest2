package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final MediaCodecInfo.CodecCapabilities e;

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        str.getClass();
        this.a = str;
        this.d = str2;
        this.e = codecCapabilities;
        boolean z2 = false;
        this.b = !z && codecCapabilities != null && z.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null && z.a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z2 = true;
        }
        this.c = z2;
    }

    public final boolean a(String str) {
        String a;
        String[] split;
        Pair pair;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer valueOf;
        Integer num;
        int i = 2;
        if (str == null || this.d == null || (a = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.d.equals(a)) {
            b("codec.mime " + str + ", " + a);
            return false;
        }
        Pattern pattern = j.a;
        split = str.split("\\.");
        String str2 = split[0];
        str2.getClass();
        pair = null;
        switch (str2) {
            case "avc1":
            case "avc2":
                if (split.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    break;
                } else {
                    try {
                        if (split[1].length() == 6) {
                            num = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                            valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                        } else if (split.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                            break;
                        } else {
                            Integer valueOf2 = Integer.valueOf(Integer.parseInt(split[1]));
                            valueOf = Integer.valueOf(Integer.parseInt(split[2]));
                            num = valueOf2;
                        }
                        pair = new Pair(Integer.valueOf(j.c.get(num.intValue())), Integer.valueOf(j.d.get(valueOf.intValue())));
                        break;
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        break;
                    }
                }
            case "hev1":
            case "hvc1":
                if (split.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    break;
                } else {
                    Matcher matcher = j.a.matcher(split[1]);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        if ("1".equals(group)) {
                            i = 1;
                        } else if (!"2".equals(group)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                            break;
                        }
                        Integer num2 = (Integer) j.e.get(split[3]);
                        if (num2 == null) {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                            break;
                        } else {
                            pair = new Pair(Integer.valueOf(i), num2);
                            break;
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                        break;
                    }
                }
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + a);
        return false;
    }

    public final boolean b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        b("sampleRate.support, " + i);
        return false;
    }

    public final void b(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.a + ", " + this.d + "] [" + z.e + X3.j.e);
    }

    public final boolean a(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d != -1.0d && d > 0.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i, i2, d);
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i, i2);
        }
        if (isSizeSupported) {
            return true;
        }
        if (i < i2) {
            if (d != -1.0d && d > 0.0d) {
                isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i2, i, d);
            } else {
                isSizeSupported2 = videoCapabilities.isSizeSupported(i2, i);
            }
            if (isSizeSupported2) {
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + VastAttributes.HORIZONTAL_POSITION + i2 + VastAttributes.HORIZONTAL_POSITION + d) + "] [" + this.a + ", " + this.d + "] [" + z.e + X3.j.e);
                return true;
            }
        }
        b("sizeAndRate.support, " + i + VastAttributes.HORIZONTAL_POSITION + i2 + VastAttributes.HORIZONTAL_POSITION + d);
        return false;
    }

    public final Point a(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = z.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i) {
        int i2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        String str = this.a;
        String str2 = this.d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((z.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i2 = 6;
            } else {
                i2 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i2 + X3.j.e);
            maxInputChannelCount = i2;
        }
        if (maxInputChannelCount >= i) {
            return true;
        }
        b("channelCount.support, " + i);
        return false;
    }
}

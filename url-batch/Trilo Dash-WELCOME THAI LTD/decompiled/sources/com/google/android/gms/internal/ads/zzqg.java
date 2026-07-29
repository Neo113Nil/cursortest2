package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzqg {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public static zzqg zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (codecCapabilities != null) {
            int i = zzeg.zza;
            if (codecCapabilities.isFeatureSupported("adaptive-playback") && (zzeg.zza > 22 || ((!"ODROID-XU3".equals(zzeg.zzd) && !"Nexus 10".equals(zzeg.zzd)) || (!"OMX.Exynos.AVC.Decoder".equals(str) && !"OMX.Exynos.AVC.Decoder.secure".equals(str))))) {
                z6 = true;
                return new zzqg(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzeg.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzeg.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
            }
        }
        z6 = false;
        return new zzqg(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzeg.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzeg.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private static Point zzh(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzeg.zze(i, widthAlignment) * widthAlignment, zzeg.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzi(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzeg.zze + "]");
    }

    private static boolean zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzh = zzh(videoCapabilities, i, i2);
        int i3 = zzh.x;
        int i4 = zzh.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzh(videoCapabilities, i, i2);
    }

    public final zzgn zzb(zzad zzadVar, zzad zzadVar2) {
        int i = true != zzeg.zzS(zzadVar.zzm, zzadVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzadVar.zzu != zzadVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzadVar.zzr != zzadVar2.zzr || zzadVar.zzs != zzadVar2.zzs)) {
                i |= 512;
            }
            if (!zzeg.zzS(zzadVar.zzy, zzadVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzeg.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzadVar.zzd(zzadVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgn(this.zza, zzadVar, zzadVar2, true != zzadVar.zzd(zzadVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzadVar.zzz != zzadVar2.zzz) {
                i |= 4096;
            }
            if (zzadVar.zzA != zzadVar2.zzA) {
                i |= 8192;
            }
            if (zzadVar.zzB != zzadVar2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzqy.zzb(zzadVar);
                Pair zzb2 = zzqy.zzb(zzadVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzgn(this.zza, zzadVar, zzadVar2, 3, 0);
                    }
                }
            }
            if (!zzadVar.zzd(zzadVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgn(this.zza, zzadVar, zzadVar2, 1, 0);
            }
        }
        return new zzgn(this.zza, zzadVar, zzadVar2, 0, i);
    }

    public final boolean zzd(zzad zzadVar) throws zzqs {
        Pair zzb;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.zzb.equals(zzadVar.zzm) && !this.zzb.equals(zzqy.zze(zzadVar))) {
            return false;
        }
        int i = 16;
        if (zzadVar.zzj != null && (zzb = zzqy.zzb(zzadVar)) != null) {
            int intValue = ((Integer) zzb.first).intValue();
            int intValue2 = ((Integer) zzb.second).intValue();
            int i2 = 2;
            if ("video/dolby-vision".equals(zzadVar.zzm)) {
                if ("video/avc".equals(this.zzb)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (!this.zzh) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzg = zzg();
            if (zzeg.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzg.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                if (intValue3 >= 180000000) {
                    i2 = 1024;
                } else if (intValue3 >= 120000000) {
                    i2 = 512;
                } else if (intValue3 >= 60000000) {
                    i2 = 256;
                } else if (intValue3 >= 30000000) {
                    i2 = 128;
                } else if (intValue3 >= 18000000) {
                    i2 = 64;
                } else if (intValue3 >= 12000000) {
                    i2 = 32;
                } else if (intValue3 >= 7200000) {
                    i2 = 16;
                } else if (intValue3 >= 3600000) {
                    i2 = 8;
                } else if (intValue3 >= 1800000) {
                    i2 = 4;
                } else if (intValue3 < 800000) {
                    i2 = 1;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i2;
                zzg = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzg) {
                if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                }
            }
            zzi("codec.profileLevel, " + zzadVar.zzj + ", " + this.zzc);
            return false;
        }
        if (this.zzh) {
            if (zzadVar.zzr <= 0 || zzadVar.zzs <= 0) {
                return true;
            }
            if (zzeg.zza >= 21) {
                return zzf(zzadVar.zzr, zzadVar.zzs, zzadVar.zzt);
            }
            boolean z = zzadVar.zzr * zzadVar.zzs <= zzqy.zza();
            if (!z) {
                zzi("legacyFrameSize, " + zzadVar.zzr + "x" + zzadVar.zzs);
            }
            return z;
        }
        if (zzeg.zza >= 21) {
            int i3 = zzadVar.zzA;
            if (i3 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzi("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzi("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    zzi("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = zzadVar.zzz;
            if (i4 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.zzd;
                if (codecCapabilities3 == null) {
                    zzi("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzi("channelCount.aCaps");
                    } else {
                        String str = this.zza;
                        String str2 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((zzeg.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else if (!"audio/eac3".equals(str2)) {
                                i = 30;
                            }
                            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i4) {
                            zzi("channelCount.support, " + i4);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zze(zzad zzadVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzqy.zzb(zzadVar);
        return zzb != null && ((Integer) zzb.first).intValue() == 42;
    }

    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzi("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzi("sizeAndRate.vCaps");
            return false;
        }
        if (zzj(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzeg.zzb)) || !zzj(videoCapabilities, i2, i, d))) {
            zzi("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = zzeg.zze;
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedSupport [");
        sb.append("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
        sb.append("] [");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append("] [");
        sb.append(str3);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zzqg(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzbo.zzh(str2);
    }
}

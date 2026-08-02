package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzqn {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public static zzqn zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (codecCapabilities != null) {
            int i = zzen.zza;
            if (codecCapabilities.isFeatureSupported("adaptive-playback") && (zzen.zza > 22 || ((!"ODROID-XU3".equals(zzen.zzd) && !"Nexus 10".equals(zzen.zzd)) || (!"OMX.Exynos.AVC.Decoder".equals(str) && !"OMX.Exynos.AVC.Decoder.secure".equals(str))))) {
                z6 = true;
                return new zzqn(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzen.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzen.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
            }
        }
        z6 = false;
        return new zzqn(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && zzen.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && zzen.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    private static Point zzh(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzen.zze(i, widthAlignment) * widthAlignment, zzen.zze(i2, heightAlignment) * heightAlignment);
    }

    private final void zzi(String str) {
        zzdw.zza("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzen.zze + "]");
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

    public final zzgt zzb(zzaf zzafVar, zzaf zzafVar2) {
        int i = true != zzen.zzT(zzafVar.zzm, zzafVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzafVar.zzu != zzafVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzafVar.zzr != zzafVar2.zzr || zzafVar.zzs != zzafVar2.zzs)) {
                i |= 512;
            }
            if (!zzen.zzT(zzafVar.zzy, zzafVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzen.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafVar.zzd(zzafVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgt(this.zza, zzafVar, zzafVar2, true != zzafVar.zzd(zzafVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzafVar.zzz != zzafVar2.zzz) {
                i |= 4096;
            }
            if (zzafVar.zzA != zzafVar2.zzA) {
                i |= 8192;
            }
            if (zzafVar.zzB != zzafVar2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzrf.zzb(zzafVar);
                Pair zzb2 = zzrf.zzb(zzafVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzgt(this.zza, zzafVar, zzafVar2, 3, 0);
                    }
                }
            }
            if (!zzafVar.zzd(zzafVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgt(this.zza, zzafVar, zzafVar2, 1, 0);
            }
        }
        return new zzgt(this.zza, zzafVar, zzafVar2, 0, i);
    }

    public final boolean zzd(zzaf zzafVar) throws zzqz {
        Pair zzb;
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.zzb.equals(zzafVar.zzm) && !this.zzb.equals(zzrf.zze(zzafVar))) {
            return false;
        }
        int i2 = 16;
        if (zzafVar.zzj != null && (zzb = zzrf.zzb(zzafVar)) != null) {
            int intValue = ((Integer) zzb.first).intValue();
            int intValue2 = ((Integer) zzb.second).intValue();
            int i3 = 8;
            if ("video/dolby-vision".equals(zzafVar.zzm)) {
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
            if (zzen.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzg.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
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
                zzg = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzg) {
                i = (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2 || ("video/hevc".equals(this.zzb) && intValue == 2 && ("sailfish".equals(zzen.zzb) || "marlin".equals(zzen.zzb)))) ? i + 1 : 0;
            }
            zzi("codec.profileLevel, " + zzafVar.zzj + ", " + this.zzc);
            return false;
        }
        if (this.zzh) {
            if (zzafVar.zzr <= 0 || zzafVar.zzs <= 0) {
                return true;
            }
            if (zzen.zza >= 21) {
                return zzf(zzafVar.zzr, zzafVar.zzs, zzafVar.zzt);
            }
            boolean z = zzafVar.zzr * zzafVar.zzs <= zzrf.zza();
            if (!z) {
                zzi("legacyFrameSize, " + zzafVar.zzr + "x" + zzafVar.zzs);
            }
            return z;
        }
        if (zzen.zza >= 21) {
            int i4 = zzafVar.zzA;
            if (i4 != -1) {
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
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    zzi("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = zzafVar.zzz;
            if (i5 != -1) {
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
                        if (maxInputChannelCount <= 1 && ((zzen.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i2 = 6;
                            } else if (!"audio/eac3".equals(str2)) {
                                i2 = 30;
                            }
                            zzdw.zze("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i2 + "]");
                            maxInputChannelCount = i2;
                        }
                        if (maxInputChannelCount < i5) {
                            zzi("channelCount.support, " + i5);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zze(zzaf zzafVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzrf.zzb(zzafVar);
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
        if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzen.zzb)) || !zzj(videoCapabilities, i2, i, d))) {
            zzi("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        String str3 = zzen.zze;
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
        zzdw.zza("MediaCodecInfo", sb.toString());
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzd.profileLevels;
    }

    zzqn(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzbt.zzh(str2);
    }
}

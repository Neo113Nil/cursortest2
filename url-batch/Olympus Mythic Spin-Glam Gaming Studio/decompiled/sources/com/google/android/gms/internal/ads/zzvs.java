package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.X3;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzvs {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public static zzvs zza(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z8 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z9 = z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str4 = Build.MANUFACTURER;
            if (!str4.equals("Xiaomi") && !str4.equals("OPPO") && !str4.equals("realme") && !str4.equals("motorola") && !str4.equals("LENOVO") && !str4.equals("Fairphone")) {
                z6 = true;
                return new zzvs(str, str2, str3, codecCapabilities, z, z2, z3, z7, z8, z9, z6);
            }
        }
        z6 = false;
        return new zzvs(str, str2, str3, codecCapabilities, z, z2, z3, z7, z8, z9, z6);
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzp) || str.equals(zzwl.zzg(zzvVar));
    }

    private final boolean zzk(Context context, zzv zzvVar, boolean z) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        zzdq zzf = zzdr.zzf(zzvVar);
        String str = zzvVar.zzp;
        char c = 65535;
        if (str != null && str.equals("video/mv-hevc")) {
            String zzh = zzas.zzh(this.zzc);
            if (zzh.equals("video/mv-hevc")) {
                return true;
            }
            if (zzh.equals("video/hevc")) {
                int i = zzwl.zza;
                String zzk = zzgr.zzk(zzvVar.zzs);
                if (zzk == null) {
                    zzf = null;
                } else {
                    String trim = zzk.trim();
                    String str2 = zzfm.zza;
                    zzf = zzdr.zzg(zzk, trim.split("\\.", -1), zzvVar.zzG);
                }
            }
        }
        if (zzf == null) {
            return true;
        }
        if (!zzf.zzc()) {
            return false;
        }
        int zza = zzf.zza();
        int zzb = zzf.zzb();
        int i2 = 8;
        if ("video/dolby-vision".equals(str)) {
            String str3 = this.zzb;
            int hashCode = str3.hashCode();
            if (hashCode != -1662735862) {
                if (hashCode != -1662541442) {
                    if (hashCode == 1331836730 && str3.equals("video/avc")) {
                        c = 0;
                    }
                } else if (str3.equals("video/hevc")) {
                    c = 1;
                }
            } else if (str3.equals("video/av01")) {
                c = 2;
            }
            if (c == 0) {
                zzb = 0;
                zza = 8;
            } else if (c == 1 || c == 2) {
                zzb = 0;
                zza = 2;
            }
        }
        if (!this.zzi && !this.zzb.equals("audio/ac4") && zza != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] zzb2 = zzb();
        String str4 = this.zzb;
        if (str4.equals("audio/ac4") && zzb2.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
                i2 = 16;
            }
            zzb2 = zzfm.zzS(context) ? new MediaCodecInfo.CodecProfileLevel[]{zzwl.zzf(1026, i2)} : new MediaCodecInfo.CodecProfileLevel[]{zzwl.zzf(257, i2), zzwl.zzf(EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE, i2), zzwl.zzf(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, i2), zzwl.zzf(1026, i2), zzwl.zzf(1028, i2)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzb2) {
            if (codecProfileLevel.profile == zza && (codecProfileLevel.level >= zzb || !z)) {
                if ("video/hevc".equals(str4) && zza == 2) {
                    String str5 = Build.DEVICE;
                    if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    }
                }
                return true;
            }
        }
        String str6 = zzvVar.zzk;
        String str7 = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 22 + str7.length());
        sb.append("codec.profileLevel, ");
        sb.append(str6);
        sb.append(", ");
        sb.append(str7);
        zzm(sb.toString());
        return false;
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzp, "audio/flac") && zzvVar.zzL == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfm.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str2);
        sb.append(X3.j.e);
        zzeh.zza("MediaCodecInfo", sb.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzo = zzo(videoCapabilities, i, i2);
        int i3 = zzo.x;
        int i4 = zzo.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfm.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean zzc(Context context, zzv zzvVar) {
        int i;
        if (!zzj(zzvVar) || !zzk(context, zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i2 = zzvVar.zzw;
            if (i2 <= 0 || (i = zzvVar.zzx) <= 0) {
                return true;
            }
            return zzg(i2, i, zzvVar.zzA);
        }
        int i3 = zzvVar.zzK;
        if (i3 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                sb.append("sampleRate.support, ");
                sb.append(i3);
                zzm(sb.toString());
                return false;
            }
        }
        int i4 = zzvVar.zzI;
        if (i4 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzm("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzm("channelCount.aCaps");
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
            StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i5).length() + 1);
            sb2.append("AssumedMaxChannelAdjustment: ");
            sb2.append(str);
            sb2.append(", [");
            sb2.append(maxInputChannelCount);
            sb2.append(" to ");
            sb2.append(i5);
            sb2.append(X3.j.e);
            zzeh.zzc("MediaCodecInfo", sb2.toString());
            maxInputChannelCount = i5;
        }
        if (maxInputChannelCount >= i4) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 22);
        sb3.append("channelCount.support, ");
        sb3.append(i4);
        zzm(sb3.toString());
        return false;
    }

    public final boolean zzd(Context context, zzv zzvVar) {
        return zzj(zzvVar) && zzk(context, zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        zzdq zzf = zzdr.zzf(zzvVar);
        return zzf != null && zzf.zzc() && zzf.zza() == 42;
    }

    public final zzjf zzf(zzv zzvVar, zzv zzvVar2) {
        int i;
        String str = zzvVar.zzp;
        String str2 = zzvVar2.zzp;
        int i2 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzB != zzvVar2.zzB) {
                i2 |= 1024;
            }
            boolean z = (zzvVar.zzw == zzvVar2.zzw && zzvVar.zzx == zzvVar2.zzx) ? false : true;
            if (!this.zze && z) {
                i2 |= 512;
            }
            zzi zziVar = zzvVar.zzG;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzG)) && !Objects.equals(zziVar, zzvVar2.zzG)) {
                i2 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i2 |= 2;
            }
            int i3 = zzvVar.zzy;
            if (i3 != -1 && (i = zzvVar.zzz) != -1 && i3 == zzvVar2.zzy && i == zzvVar2.zzz && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair zze = zzdr.zze(zzvVar);
                Pair zze2 = zzdr.zze(zzvVar2);
                if (zze == null || zze2 == null || !((Integer) zze.first).equals(zze2.first)) {
                    i2 = 2;
                }
            }
            if (i2 == 0) {
                return new zzjf(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
        } else {
            if (zzvVar.zzI != zzvVar2.zzI) {
                i2 |= 4096;
            }
            if (zzvVar.zzK != zzvVar2.zzK) {
                i2 |= 8192;
            }
            if (zzvVar.zzL != zzvVar2.zzL) {
                i2 |= 16384;
            }
            if (i2 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair zze3 = zzdr.zze(zzvVar);
                    Pair zze4 = zzdr.zze(zzvVar2);
                    if (zze3 != null && zze4 != null) {
                        int intValue = ((Integer) zze3.first).intValue();
                        int intValue2 = ((Integer) zze4.first).intValue();
                        if (intValue == 42 && intValue2 == 42) {
                            return new zzjf(this.zza, zzvVar, zzvVar2, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && zze3.equals(zze4)) {
                            return new zzjf(this.zza, zzvVar, zzvVar2, 3, 0);
                        }
                    }
                }
            }
            if (i2 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zzjf(this.zza, zzvVar, zzvVar2, 3, 0);
                }
            }
            if (!zzvVar.zzd(zzvVar2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzjf(this.zza, zzvVar, zzvVar2, 1, 0);
            }
        }
        return new zzjf(this.zza, zzvVar, zzvVar2, 0, i2);
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int zza = zzvu.zza(videoCapabilities, i, i2, d);
            if (zza != 2) {
                if (zza == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                    sb.append("sizeAndRate.cover, ");
                    sb.append(i);
                    sb.append(VastAttributes.HORIZONTAL_POSITION);
                    sb.append(i2);
                    sb.append("@");
                    sb.append(d);
                    zzm(sb.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzn(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.zza;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i2, i, d)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                    sb2.append("sizeAndRate.rotated, ");
                    sb2.append(i);
                    sb2.append(VastAttributes.HORIZONTAL_POSITION);
                    sb2.append(i2);
                    sb2.append("@");
                    sb2.append(d);
                    String sb3 = sb2.toString();
                    String str2 = this.zzb;
                    int length = str.length();
                    String str3 = zzfm.zza;
                    int length2 = String.valueOf(str2).length();
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                    sb4.append("AssumedSupport [");
                    sb4.append(sb3);
                    sb4.append("] [");
                    sb4.append(str);
                    sb4.append(", ");
                    sb4.append(str2);
                    sb4.append("] [");
                    sb4.append(str3);
                    sb4.append(X3.j.e);
                    zzeh.zza("MediaCodecInfo", sb4.toString());
                }
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
            sb5.append("sizeAndRate.support, ");
            sb5.append(i);
            sb5.append(VastAttributes.HORIZONTAL_POSITION);
            sb5.append(i2);
            sb5.append("@");
            sb5.append(d);
            zzm(sb5.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i, int i2) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f = this.zzl;
        if (f != -3.4028235E38f && this.zzj == i && this.zzk == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!zzg(i, i2, 1024.0d)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                boolean zzg = zzg(i, i2, f5);
                if (true == zzg) {
                    f3 = f5;
                }
                if (true != zzg) {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.zzl = f2;
        this.zzj = i;
        this.zzk = i2;
        return f2;
    }

    @Nullable
    public final Point zzi(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i, i2);
    }

    @VisibleForTesting
    zzvs(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }
}

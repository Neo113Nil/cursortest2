package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.common.MimeTypes;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzsu {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Boolean bool;
        Boolean bool2;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int zzc = zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
        boolean z = true;
        if (zzc == 1) {
            bool = zzsv.zza;
            if (bool == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int zzb = zzb(false);
                    int zzb2 = zzb(true);
                    if (zzb != 0) {
                        if (zzb2 == 0) {
                        }
                    }
                    zzsv.zza = Boolean.valueOf(z);
                    bool2 = zzsv.zza;
                    if (!bool2.booleanValue()) {
                        return 0;
                    }
                }
                z = false;
                zzsv.zza = Boolean.valueOf(z);
                bool2 = zzsv.zza;
                if (!bool2.booleanValue()) {
                }
            }
        }
        return zzc;
    }

    private static int zzb(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzs zzsVar = new zzs();
            zzsVar.zzm(MimeTypes.VIDEO_H264);
            zzu zzM = zzsVar.zzM();
            if (zzM.zzo != null) {
                List zzc = zztl.zzc(zztb.zzb, zzM, z, false);
                for (int i = 0; i < zzc.size(); i++) {
                    if (((zzst) zzc.get(i)).zzd != null && (videoCapabilities = ((zzst) zzc.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (zztd unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}

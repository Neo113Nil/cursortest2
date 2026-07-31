package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline1;
import androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline3;
import androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline4;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes4.dex */
final class zzvt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints;
        Boolean bool;
        Boolean bool2;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int zzc = zzc(supportedPerformancePoints, MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline3.m(i, i2, (int) d));
        boolean z = true;
        if (zzc == 1) {
            bool = zzvu.zza;
            if (bool == null) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 37) {
                    int zzb = zzb(true);
                    if (i3 < 35) {
                        zzvu.zza = Boolean.valueOf(z);
                        bool2 = zzvu.zza;
                        if (bool2.booleanValue()) {
                            return 0;
                        }
                    } else {
                        zzvu.zza = Boolean.valueOf(z);
                        bool2 = zzvu.zza;
                        if (bool2.booleanValue()) {
                        }
                    }
                }
                z = false;
                zzvu.zza = Boolean.valueOf(z);
                bool2 = zzvu.zza;
                if (bool2.booleanValue()) {
                }
            }
        }
        return zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzb(boolean z) {
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzo("video/avc");
            zzv zzQ = zztVar.zzQ();
            if (zzQ.zzp != null) {
                List zzc = zzwl.zzc(zzwb.zzb, zzQ, z, false);
                for (int i = 0; i < zzc.size(); i++) {
                    if (((zzvs) zzc.get(i)).zzd != null && (r2 = ((zzvs) zzc.get(i)).zzd.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline4.m();
                        return zzc(supportedPerformancePoints, MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline3.m(1280, 720, 60));
                    }
                }
            }
        } catch (zzwd unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i = 0; i < list.size(); i++) {
            covers = MediaCodecPerformancePointCoverageProvider$Api29$$ExternalSyntheticApiModelOutline1.m(list.get(i)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}

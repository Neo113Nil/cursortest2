package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzjd {
    public static zznz zza(Context context, zzjm zzjmVar, boolean z, String str) {
        LogSessionId logSessionId;
        zznv zzb = zznv.zzb(context);
        if (zzb == null) {
            zzea.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new zznz(logSessionId, str);
        }
        if (z) {
            zzjmVar.zzy(zzb);
        }
        return new zznz(zzb.zza(), str);
    }
}

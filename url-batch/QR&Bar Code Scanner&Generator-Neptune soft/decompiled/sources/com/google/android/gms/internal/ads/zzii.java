package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzii {
    public static zznb zza(Context context, zzit zzitVar, boolean z) {
        zzmx zzb = zzmx.zzb(context);
        if (zzb == null) {
            zzdw.zze("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zznb(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzitVar.zzR(zzb);
        }
        return new zznb(zzb.zza());
    }
}

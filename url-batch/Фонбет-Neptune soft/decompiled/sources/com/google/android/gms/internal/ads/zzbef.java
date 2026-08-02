package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbef {
    public static final zzbdc zza;

    static {
        zzbdc.zzb("gads:ad_loader:timeout_ms", 60000L);
        zza = zzbdc.zzb("gads:rendering:timeout_ms", 60000L);
        zzbdc.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}

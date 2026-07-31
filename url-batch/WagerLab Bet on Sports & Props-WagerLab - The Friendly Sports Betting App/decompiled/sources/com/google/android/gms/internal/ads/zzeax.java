package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeax {
    private final zzbup zza;

    zzeax(zzbup zzbupVar) {
        this.zza = zzbupVar;
    }

    public final void zza() {
        ListenableFuture zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzik)).booleanValue()) {
            zzbzk.zzb(zza, "persistFlags");
        } else {
            zzbzk.zza(zza, "persistFlags");
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzfuu implements Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zze zza;
    final /* synthetic */ zzfvd zzb;

    zzfuu(zzfvd zzfvdVar, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza = zzeVar;
        Objects.requireNonNull(zzfvdVar);
        this.zzb = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzJ(this.zza);
    }
}

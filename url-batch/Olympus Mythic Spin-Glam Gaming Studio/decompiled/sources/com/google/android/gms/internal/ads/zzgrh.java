package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzgrh {
    private final zzggk zza;
    private final zzgdq zzb;

    zzgrh(zzgdq zzgdqVar, zzggk zzggkVar) {
        this.zza = zzggkVar;
        this.zzb = zzgdqVar;
    }

    public final zzgrf zza(int i) {
        return new zzgrf(i, this.zzb, this.zza);
    }

    public final void zzb(int i) {
        this.zza.zzb(i - 1, -1L, null, null);
    }

    public final void zzc(int i, String str) {
        this.zza.zzb(i - 1, -1L, null, str);
    }

    public final void zzd(int i, Throwable th) {
        this.zza.zzb(i - 1, -1L, th, null);
    }

    public final ListenableFuture zze(int i, ListenableFuture listenableFuture) {
        zzgrf zza = zza(i);
        zza.zza();
        zzhcy.zzr(listenableFuture, new zzgrg(this, zza), zzhdp.zza());
        return listenableFuture;
    }

    public final void zzf(int i, Runnable runnable) {
        try {
            zza(i).zza();
            runnable.run();
        } finally {
        }
    }
}

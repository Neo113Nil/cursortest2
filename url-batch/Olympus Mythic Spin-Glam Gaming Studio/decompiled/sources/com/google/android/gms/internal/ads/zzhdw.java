package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhdw extends zzhdf {
    final /* synthetic */ zzhdx zza;
    private final Callable zzb;

    zzhdw(zzhdx zzhdxVar, Callable callable) {
        Objects.requireNonNull(zzhdxVar);
        this.zza = zzhdxVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}

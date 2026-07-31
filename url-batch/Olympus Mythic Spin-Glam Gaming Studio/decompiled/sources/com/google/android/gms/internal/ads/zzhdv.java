package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhdv extends zzhdf {
    final /* synthetic */ zzhdx zza;
    private final zzhcf zzb;

    zzhdv(zzhdx zzhdxVar, zzhcf zzhcfVar) {
        Objects.requireNonNull(zzhdxVar);
        this.zza = zzhdxVar;
        this.zzb = zzhcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzhcf zzhcfVar = this.zzb;
        ListenableFuture zza = zzhcfVar.zza();
        zzguk.zzl(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhcfVar);
        return zza;
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
    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}

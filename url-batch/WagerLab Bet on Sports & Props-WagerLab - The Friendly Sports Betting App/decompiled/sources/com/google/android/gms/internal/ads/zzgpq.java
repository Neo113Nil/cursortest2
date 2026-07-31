package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgpq extends zzgpa {
    final /* synthetic */ zzgps zza;
    private final zzgoa zzb;

    zzgpq(zzgps zzgpsVar, zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgpsVar);
        this.zza = zzgpsVar;
        this.zzb = zzgoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgoa zzgoaVar = this.zzb;
        ListenableFuture zza = zzgoaVar.zza();
        zzghc.zzl(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgoaVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}

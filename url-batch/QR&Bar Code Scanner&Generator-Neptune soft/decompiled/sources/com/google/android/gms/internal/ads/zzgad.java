package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgad extends zzfzo {
    final /* synthetic */ zzgaf zza;
    private final zzfym zzb;

    zzgad(zzgaf zzgafVar, zzfym zzfymVar) {
        this.zza = zzgafVar;
        Objects.requireNonNull(zzfymVar);
        this.zzb = zzfymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfzp zza = this.zzb.zza();
        zzfsx.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfzp) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final boolean zzg() {
        return this.zza.isDone();
    }
}

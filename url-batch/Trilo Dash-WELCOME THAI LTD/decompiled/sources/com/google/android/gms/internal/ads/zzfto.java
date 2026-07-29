package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfto extends zzftq {
    zzfto(zzfvj zzfvjVar, Class cls, zzfuh zzfuhVar) {
        super(zzfvjVar, cls, zzfuhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzfuh zzfuhVar = (zzfuh) obj;
        zzfvj zza = zzfuhVar.zza(th);
        zzfos.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfuhVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    final /* synthetic */ void zzg(Object obj) {
        zzt((zzfvj) obj);
    }
}

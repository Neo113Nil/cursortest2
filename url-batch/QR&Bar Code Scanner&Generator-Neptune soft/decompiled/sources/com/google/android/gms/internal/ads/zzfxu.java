package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfxu extends zzfxw {
    zzfxu(zzfzp zzfzpVar, Class cls, zzfyn zzfynVar) {
        super(zzfzpVar, cls, zzfynVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfxw
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzfyn zzfynVar = (zzfyn) obj;
        zzfzp zza = zzfynVar.zza(th);
        zzfsx.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfynVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxw
    final /* synthetic */ void zzg(Object obj) {
        zzt((zzfzp) obj);
    }
}

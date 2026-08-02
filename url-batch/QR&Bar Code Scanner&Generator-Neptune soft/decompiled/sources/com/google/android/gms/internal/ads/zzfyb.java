package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfyb extends zzfyd {
    zzfyb(zzfzp zzfzpVar, zzfyn zzfynVar) {
        super(zzfzpVar, zzfynVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyd
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzfyn zzfynVar = (zzfyn) obj;
        zzfzp zza = zzfynVar.zza(obj2);
        zzfsx.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfynVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfyd
    final /* synthetic */ void zzg(Object obj) {
        zzt((zzfzp) obj);
    }
}

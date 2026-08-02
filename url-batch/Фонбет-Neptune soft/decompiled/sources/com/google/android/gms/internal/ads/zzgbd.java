package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgbd extends zzgbf {
    zzgbd(ListenableFuture listenableFuture, zzgbq zzgbqVar) {
        super(listenableFuture, zzgbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgbq zzgbqVar = (zzgbq) obj;
        ListenableFuture zza = zzgbqVar.zza(obj2);
        zzfuu.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbqVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}

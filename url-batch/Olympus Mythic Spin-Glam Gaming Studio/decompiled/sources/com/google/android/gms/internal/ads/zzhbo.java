package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhbo extends zzhbq {
    zzhbo(ListenableFuture listenableFuture, Class cls, zzhcg zzhcgVar) {
        super(listenableFuture, cls, zzhcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzhcg zzhcgVar = (zzhcg) obj;
        ListenableFuture zza = zzhcgVar.zza(th);
        zzguk.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhcgVar);
        return zza;
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhbv extends zzhbx {
    zzhbv(ListenableFuture listenableFuture, zzhcg zzhcgVar) {
        super(listenableFuture, zzhcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzhcg zzhcgVar = (zzhcg) obj;
        ListenableFuture zza = zzhcgVar.zza(obj2);
        zzguk.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhcgVar);
        return zza;
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhbp extends zzhbq {
    zzhbp(ListenableFuture listenableFuture, Class cls, zzgub zzgubVar) {
        super(listenableFuture, cls, zzgubVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    final /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        return ((zzgub) obj).apply(th);
    }
}

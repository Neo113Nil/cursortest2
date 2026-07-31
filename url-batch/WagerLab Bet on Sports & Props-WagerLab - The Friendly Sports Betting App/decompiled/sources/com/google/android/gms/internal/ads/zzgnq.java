package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgnq extends zzgns {
    zzgnq(ListenableFuture listenableFuture, zzgob zzgobVar) {
        super(listenableFuture, zzgobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgns
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgob zzgobVar = (zzgob) obj;
        ListenableFuture zza = zzgobVar.zza(obj2);
        zzghc.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgobVar);
        return zza;
    }
}

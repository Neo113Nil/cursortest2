package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgof extends zzgog {
    final /* synthetic */ zzgoh zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgof(zzgoh zzgohVar, Callable callable, Executor executor) {
        super(zzgohVar, executor);
        Objects.requireNonNull(zzgohVar);
        this.zza = zzgohVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgog
    final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    final String zzc() {
        return this.zzc.toString();
    }
}

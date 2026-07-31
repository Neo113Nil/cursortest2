package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzacn implements zzaco {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdu zzb;

    zzacn(Executor executor, zzdu zzduVar) {
        this.zza = executor;
        this.zzb = zzduVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}

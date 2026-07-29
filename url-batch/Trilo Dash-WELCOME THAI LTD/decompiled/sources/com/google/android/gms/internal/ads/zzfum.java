package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
abstract class zzfum extends zzfvi {
    private final Executor zza;
    final /* synthetic */ zzfun zzb;

    zzfum(zzfun zzfunVar, Executor executor) {
        this.zzb = zzfunVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzfvi
    final void zzd(Throwable th) {
        zzfun.zzG(this.zzb, (zzfum) null);
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    final void zze(Object obj) {
        zzfun.zzG(this.zzb, (zzfum) null);
        zzc(obj);
    }

    final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    final boolean zzg() {
        return this.zzb.isDone();
    }
}

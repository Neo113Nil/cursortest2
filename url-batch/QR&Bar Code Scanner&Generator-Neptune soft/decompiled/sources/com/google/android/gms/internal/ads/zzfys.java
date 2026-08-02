package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzfys extends zzfzo {
    private final Executor zza;
    final /* synthetic */ zzfyt zzb;

    zzfys(zzfyt zzfytVar, Executor executor) {
        this.zzb = zzfytVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzfzo
    final void zzd(Throwable th) {
        zzfyt.zzG(this.zzb, (zzfys) null);
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final void zze(Object obj) {
        zzfyt.zzG(this.zzb, (zzfys) null);
        zzc(obj);
    }

    final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzo
    final boolean zzg() {
        return this.zzb.isDone();
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgaf extends zzfyw implements RunnableFuture {

    @CheckForNull
    private volatile zzfzo zza;

    zzgaf(zzfym zzfymVar) {
        this.zza = new zzgad(this, zzfymVar);
    }

    static zzgaf zzf(Runnable runnable, Object obj) {
        return new zzgaf(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfzo zzfzoVar = this.zza;
        if (zzfzoVar != null) {
            zzfzoVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    @CheckForNull
    protected final String zza() {
        zzfzo zzfzoVar = this.zza;
        if (zzfzoVar == null) {
            return super.zza();
        }
        return "task=[" + zzfzoVar + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    protected final void zzb() {
        zzfzo zzfzoVar;
        if (zzu() && (zzfzoVar = this.zza) != null) {
            zzfzoVar.zzh();
        }
        this.zza = null;
    }

    zzgaf(Callable callable) {
        this.zza = new zzgae(this, callable);
    }
}

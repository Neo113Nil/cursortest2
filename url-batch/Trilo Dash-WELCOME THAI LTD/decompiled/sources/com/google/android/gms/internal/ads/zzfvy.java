package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzfvy extends zzfuq implements RunnableFuture {

    @CheckForNull
    private volatile zzfvi zza;

    zzfvy(zzfug zzfugVar) {
        this.zza = new zzfvw(this, zzfugVar);
    }

    static zzfvy zzf(Runnable runnable, Object obj) {
        return new zzfvy(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfvi zzfviVar = this.zza;
        if (zzfviVar != null) {
            zzfviVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    @CheckForNull
    protected final String zza() {
        zzfvi zzfviVar = this.zza;
        if (zzfviVar == null) {
            return super.zza();
        }
        String obj = zzfviVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    protected final void zzb() {
        zzfvi zzfviVar;
        if (zzu() && (zzfviVar = this.zza) != null) {
            zzfviVar.zzh();
        }
        this.zza = null;
    }

    zzfvy(Callable callable) {
        this.zza = new zzfvx(this, callable);
    }
}

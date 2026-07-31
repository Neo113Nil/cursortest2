package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhdx extends zzhcp implements RunnableFuture {
    private volatile zzhdf zza;

    zzhdx(zzhcf zzhcfVar) {
        this.zza = new zzhdv(this, zzhcfVar);
    }

    static zzhdx zze(Runnable runnable, Object obj) {
        return new zzhdx(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzhdf zzhdfVar = this.zza;
        if (zzhdfVar != null) {
            zzhdfVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final void zzc() {
        zzhdf zzhdfVar;
        if (zzj() && (zzhdfVar = this.zza) != null) {
            zzhdfVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final String zzd() {
        zzhdf zzhdfVar = this.zza;
        if (zzhdfVar == null) {
            return super.zzd();
        }
        String obj = zzhdfVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append(X3.j.e);
        return sb.toString();
    }

    zzhdx(Callable callable) {
        this.zza = new zzhdw(this, callable);
    }
}

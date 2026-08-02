package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzfyd extends zzfyw implements Runnable {
    public static final /* synthetic */ int zzc = 0;

    @CheckForNull
    zzfzp zza;

    @CheckForNull
    Object zzb;

    zzfyd(zzfzp zzfzpVar, Object obj) {
        Objects.requireNonNull(zzfzpVar);
        this.zza = zzfzpVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfzp zzfzpVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfzpVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfzpVar.isCancelled()) {
            zzt(zzfzpVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzfzg.zzp(zzfzpVar));
                this.zzb = null;
                zzg(zzf);
            } catch (Throwable th) {
                try {
                    zzfzx.zza(th);
                    zze(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zze(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zze(e2);
        } catch (ExecutionException e3) {
            zze(e3.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    @CheckForNull
    protected final String zza() {
        String str;
        zzfzp zzfzpVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (zzfzpVar != null) {
            str = "inputFuture=[" + zzfzpVar + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    protected final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zzf(Object obj, Object obj2) throws Exception;

    abstract void zzg(Object obj);
}

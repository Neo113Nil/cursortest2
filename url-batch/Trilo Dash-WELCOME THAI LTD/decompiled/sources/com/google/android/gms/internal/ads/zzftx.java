package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
abstract class zzftx extends zzfuq implements Runnable {
    public static final /* synthetic */ int zzc = 0;

    @CheckForNull
    zzfvj zza;

    @CheckForNull
    Object zzb;

    zzftx(zzfvj zzfvjVar, Object obj) {
        Objects.requireNonNull(zzfvjVar);
        this.zza = zzfvjVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvj zzfvjVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfvjVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfvjVar.isCancelled()) {
            zzt(zzfvjVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzfva.zzp(zzfvjVar));
                this.zzb = null;
                zzg(zzf);
            } catch (Throwable th) {
                try {
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

    @Override // com.google.android.gms.internal.ads.zzftr
    @CheckForNull
    protected final String zza() {
        String str;
        zzfvj zzfvjVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (zzfvjVar != null) {
            String obj2 = zzfvjVar.toString();
            StringBuilder sb = new StringBuilder(obj2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj2);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj == null) {
            if (zza != null) {
                return zza.length() != 0 ? str.concat(zza) : new String(str);
            }
            return null;
        }
        String obj3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 11 + obj3.length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(obj3);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    protected final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zzf(Object obj, Object obj2) throws Exception;

    abstract void zzg(Object obj);
}

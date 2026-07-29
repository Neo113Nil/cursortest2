package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
abstract class zzftq extends zzfuq implements Runnable {

    @CheckForNull
    zzfvj zza;

    @CheckForNull
    Class zzb;

    @CheckForNull
    Object zzc;

    zzftq(zzfvj zzfvjVar, Class cls, Object obj) {
        Objects.requireNonNull(zzfvjVar);
        this.zza = zzfvjVar;
        this.zzb = cls;
        Objects.requireNonNull(obj);
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        zzfvj zzfvjVar = this.zza;
        Class cls = this.zzb;
        Object obj2 = this.zzc;
        if (((obj2 == null) || ((zzfvjVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = zzfvjVar instanceof zzfwb ? ((zzfwb) zzfvjVar).zzp() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(zzfvjVar.getClass());
                String valueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
                sb.append("Future type ");
                sb.append(valueOf);
                sb.append(" threw ");
                sb.append(valueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = zzfva.zzp(zzfvjVar);
            if (th != null) {
                zzd(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                zzt(zzfvjVar);
                return;
            }
            try {
                Object zzf = zzf(obj2, th);
                this.zzb = null;
                this.zzc = null;
                zzg(zzf);
                return;
            } catch (Throwable th2) {
                try {
                    zze(th2);
                    return;
                } finally {
                    this.zzb = null;
                    this.zzc = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    @CheckForNull
    protected final String zza() {
        String str;
        zzfvj zzfvjVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
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
        if (cls == null || obj == null) {
            if (zza != null) {
                return zza.length() != 0 ? str.concat(zza) : new String(str);
            }
            return null;
        }
        String obj3 = cls.toString();
        String obj4 = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + obj3.length() + obj4.length());
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(obj3);
        sb2.append("], fallback=[");
        sb2.append(obj4);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    protected final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract Object zzf(Object obj, Throwable th) throws Exception;

    abstract void zzg(Object obj);
}

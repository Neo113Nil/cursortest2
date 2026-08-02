package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzfxw extends zzfyw implements Runnable {

    @CheckForNull
    zzfzp zza;

    @CheckForNull
    Class zzb;

    @CheckForNull
    Object zzc;

    zzfxw(zzfzp zzfzpVar, Class cls, Object obj) {
        Objects.requireNonNull(zzfzpVar);
        this.zza = zzfzpVar;
        this.zzb = cls;
        Objects.requireNonNull(obj);
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable e;
        Object obj;
        zzfzp zzfzpVar = this.zza;
        Class cls = this.zzb;
        Object obj2 = this.zzc;
        if (((obj2 == null) || ((zzfzpVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            e = zzfzpVar instanceof zzgai ? ((zzgai) zzfzpVar).zzp() : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + zzfzpVar.getClass() + " threw " + e4.getClass() + " without a cause");
            }
            e = cause;
        }
        if (e == null) {
            obj = zzfzg.zzp(zzfzpVar);
            if (e != null) {
                zzd(obj);
                return;
            }
            if (!cls.isInstance(e)) {
                zzt(zzfzpVar);
                return;
            }
            try {
                Object zzf = zzf(obj2, e);
                this.zzb = null;
                this.zzc = null;
                zzg(zzf);
                return;
            } catch (Throwable th) {
                try {
                    zzfzx.zza(th);
                    zze(th);
                    return;
                } finally {
                    this.zzb = null;
                    this.zzc = null;
                }
            }
        }
        obj = null;
        if (e != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    @CheckForNull
    protected final String zza() {
        String str;
        zzfzp zzfzpVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (zzfzpVar != null) {
            str = "inputFuture=[" + zzfzpVar + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    protected final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract Object zzf(Object obj, Throwable th) throws Exception;

    abstract void zzg(Object obj);
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
abstract class zzgbf extends zzgbz implements Runnable {
    public static final /* synthetic */ int zzc = 0;

    @CheckForNull
    ListenableFuture zza;

    @CheckForNull
    Object zzb;

    zzgbf(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzs(listenableFuture);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzgcj.zzp(listenableFuture));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th) {
                try {
                    zzgdb.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzd(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            zzd(e2.getCause());
        } catch (Exception e3) {
            zzd(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @CheckForNull
    protected final String zza() {
        String str;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object obj, Object obj2) throws Exception;

    abstract void zzf(Object obj);
}

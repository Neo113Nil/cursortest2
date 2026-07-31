package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
abstract class zzgnl extends zzgok implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    ListenableFuture zza;
    Class zzb;
    Object zzc;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj2 = this.zzc;
        if (((obj2 == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = listenableFuture instanceof zzgpv ? ((zzgpv) listenableFuture).zzl() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(listenableFuture.getClass());
                String valueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length() + 16);
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
            obj = zzgot.zzr(listenableFuture);
            if (th != null) {
                zza(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                zzk(listenableFuture);
                return;
            }
            try {
                Object zzf = zzf(obj2, th);
                this.zzb = null;
                this.zzc = null;
                zze(zzf);
                return;
            } catch (Throwable th2) {
                try {
                    zzgpl.zza(th2);
                    zzb(th2);
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

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final String zzd() {
        String str;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zzd2 = super.zzd();
        if (listenableFuture != null) {
            String obj2 = listenableFuture.toString();
            StringBuilder sb = new StringBuilder(obj2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj2);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (zzd2 != null) {
                return str.concat(zzd2);
            }
            return null;
        }
        int length = str.length();
        String obj3 = cls.toString();
        int length2 = obj3.length();
        String obj4 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 13 + obj4.length() + 1);
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(obj3);
        sb2.append("], fallback=[");
        sb2.append(obj4);
        sb2.append("]");
        return sb2.toString();
    }

    abstract void zze(Object obj);

    abstract Object zzf(Object obj, Throwable th) throws Exception;

    zzgnl(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cls;
        this.zzc = obj;
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhcw implements Runnable {
    final ListenableFuture zza;
    final zzhcv zzb;

    zzhcw(ListenableFuture listenableFuture, zzhcv zzhcvVar) {
        this.zza = listenableFuture;
        this.zzb = zzhcvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        ListenableFuture listenableFuture = this.zza;
        if ((listenableFuture instanceof zzhea) && (zza = zzheb.zza((zzhea) listenableFuture)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzhcy.zzs(listenableFuture));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgug zzb = zzguh.zzb(this);
        zzb.zza(this.zzb);
        return zzb.toString();
    }
}

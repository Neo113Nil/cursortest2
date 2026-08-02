package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzajo implements Runnable {
    final /* synthetic */ zzakd zza;
    final /* synthetic */ zzajp zzb;

    zzajo(zzajp zzajpVar, zzakd zzakdVar) {
        this.zzb = zzajpVar;
        this.zza = zzakdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

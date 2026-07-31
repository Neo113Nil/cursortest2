package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcgj;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public ListenableFuture zzb() {
        return zzcgj.zza.submit(this.zza);
    }

    final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}

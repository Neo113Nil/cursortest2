package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzfuv implements Runnable {
    final /* synthetic */ zzfvd zza;

    zzfuv(zzfvd zzfvdVar) {
        Objects.requireNonNull(zzfvdVar);
        this.zza = zzfvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzL();
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzawq implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzawu zzb;

    zzawq(zzawu zzawuVar, IOException iOException) {
        this.zzb = zzawuVar;
        this.zza = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzawv zzawvVar;
        zzawvVar = this.zzb.zze;
        zzawvVar.zzi(this.zza);
    }
}

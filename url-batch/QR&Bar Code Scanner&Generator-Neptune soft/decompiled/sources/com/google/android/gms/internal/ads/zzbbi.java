package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbbi implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzbbk zzb;

    zzbbi(zzbbk zzbbkVar, Surface surface) {
        this.zzb = zzbbkVar;
        this.zza = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbl zzbblVar;
        zzbblVar = this.zzb.zzb;
        zzbblVar.zzm(this.zza);
    }
}

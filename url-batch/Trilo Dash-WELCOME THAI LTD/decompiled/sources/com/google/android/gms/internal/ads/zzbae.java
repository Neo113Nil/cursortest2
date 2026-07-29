package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbae implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzbag zzb;

    zzbae(zzbag zzbagVar, Surface surface) {
        this.zzb = zzbagVar;
        this.zza = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbah zzbahVar;
        zzbahVar = this.zzb.zzb;
        zzbahVar.zzm(this.zza);
    }
}

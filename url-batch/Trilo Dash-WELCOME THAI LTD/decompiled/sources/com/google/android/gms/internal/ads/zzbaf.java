package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbaf implements Runnable {
    final /* synthetic */ zzatm zza;
    final /* synthetic */ zzbag zzb;

    zzbaf(zzbag zzbagVar, zzatm zzatmVar) {
        this.zzb = zzbagVar;
        this.zza = zzatmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}

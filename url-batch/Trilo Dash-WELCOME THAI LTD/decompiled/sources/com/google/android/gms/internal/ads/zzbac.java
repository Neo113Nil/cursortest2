package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbac implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbag zzc;

    zzbac(zzbag zzbagVar, int i, long j) {
        this.zzc = zzbagVar;
        this.zza = i;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbah zzbahVar;
        zzbahVar = this.zzc.zzb;
        zzbahVar.zzl(this.zza, this.zzb);
    }
}

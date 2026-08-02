package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbbh implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzbbk zze;

    zzbbh(zzbbk zzbbkVar, int i, int i2, int i3, float f) {
        this.zze = zzbbkVar;
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbl zzbblVar;
        zzbblVar = this.zze.zzb;
        zzbblVar.zzo(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

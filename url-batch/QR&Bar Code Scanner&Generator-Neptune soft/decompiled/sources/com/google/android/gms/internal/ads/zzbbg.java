package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbbg implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbbk zzc;

    zzbbg(zzbbk zzbbkVar, int i, long j) {
        this.zzc = zzbbkVar;
        this.zza = i;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbl zzbblVar;
        zzbblVar = this.zzc.zzb;
        zzbblVar.zzl(this.zza, this.zzb);
    }
}

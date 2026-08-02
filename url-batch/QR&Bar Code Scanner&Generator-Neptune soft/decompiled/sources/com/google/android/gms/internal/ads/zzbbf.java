package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbbf implements Runnable {
    final /* synthetic */ zzasw zza;
    final /* synthetic */ zzbbk zzb;

    zzbbf(zzbbk zzbbkVar, zzasw zzaswVar) {
        this.zzb = zzbbkVar;
        this.zza = zzaswVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbl zzbblVar;
        zzbblVar = this.zzb.zzb;
        zzbblVar.zzn(this.zza);
    }
}

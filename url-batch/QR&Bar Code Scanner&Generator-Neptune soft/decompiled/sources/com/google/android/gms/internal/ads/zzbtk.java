package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbtk implements Runnable {
    final /* synthetic */ zzbtv zza;
    final /* synthetic */ zzbsr zzb;
    final /* synthetic */ zzbtw zzc;

    zzbtk(zzbtw zzbtwVar, zzbtv zzbtvVar, zzbsr zzbsrVar) {
        this.zzc = zzbtwVar;
        this.zza = zzbtvVar;
        this.zzb = zzbsrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzc.zza;
        synchronized (obj) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzfzq zzfzqVar = zzchc.zze;
                final zzbsr zzbsrVar = this.zzb;
                zzfzqVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbsr.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}

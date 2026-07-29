package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbrz implements Runnable {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ zzbrg zzb;
    final /* synthetic */ zzbsl zzc;

    zzbrz(zzbsl zzbslVar, zzbsk zzbskVar, zzbrg zzbrgVar) {
        this.zzc = zzbslVar;
        this.zza = zzbskVar;
        this.zzb = zzbrgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzc.zza;
        synchronized (obj) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzfvk zzfvkVar = zzcfv.zze;
                final zzbrg zzbrgVar = this.zzb;
                zzfvkVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbry
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbrg.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}

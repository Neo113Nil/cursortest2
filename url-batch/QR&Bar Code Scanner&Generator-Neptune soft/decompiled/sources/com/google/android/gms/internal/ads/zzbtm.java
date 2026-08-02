package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbtm implements zzchj {
    final /* synthetic */ zzbtv zza;
    final /* synthetic */ zzfjj zzb;
    final /* synthetic */ zzbtw zzc;

    zzbtm(zzbtw zzbtwVar, zzbtv zzbtvVar, zzfjj zzfjjVar) {
        this.zzc = zzbtwVar;
        this.zza = zzbtvVar;
        this.zzb = zzfjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final void zza() {
        Object obj;
        zzfjw zzfjwVar;
        zzfjw zzfjwVar2;
        obj = this.zzc.zza;
        synchronized (obj) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbkl.zzd.zze()).booleanValue()) {
                zzbtw zzbtwVar = this.zzc;
                zzfjwVar = zzbtwVar.zze;
                if (zzfjwVar != null) {
                    zzfjwVar2 = zzbtwVar.zze;
                    zzfjj zzfjjVar = this.zzb;
                    zzfjjVar.zze(false);
                    zzfjwVar2.zzb(zzfjjVar.zzj());
                }
            }
        }
    }
}

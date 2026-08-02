package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbtl implements zzchl {
    final /* synthetic */ zzbtv zza;
    final /* synthetic */ zzfjj zzb;
    final /* synthetic */ zzbtw zzc;

    zzbtl(zzbtw zzbtwVar, zzbtv zzbtvVar, zzfjj zzfjjVar) {
        this.zzc = zzbtwVar;
        this.zza = zzbtvVar;
        this.zzb = zzfjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        zzbtv zzbtvVar;
        zzfjw zzfjwVar;
        zzfjw zzfjwVar2;
        zzbtv zzbtvVar2;
        zzbtv zzbtvVar3;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            this.zzc.zzi = 0;
            zzbtw zzbtwVar = this.zzc;
            zzbtvVar = zzbtwVar.zzh;
            if (zzbtvVar != null) {
                zzbtv zzbtvVar4 = this.zza;
                zzbtvVar2 = zzbtwVar.zzh;
                if (zzbtvVar4 != zzbtvVar2) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbtvVar3 = this.zzc.zzh;
                    zzbtvVar3.zzb();
                }
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbkl.zzd.zze()).booleanValue()) {
                zzbtw zzbtwVar2 = this.zzc;
                zzfjwVar = zzbtwVar2.zze;
                if (zzfjwVar != null) {
                    zzfjwVar2 = zzbtwVar2.zze;
                    zzfjj zzfjjVar = this.zzb;
                    zzfjjVar.zze(true);
                    zzfjwVar2.zzb(zzfjjVar.zzj());
                }
            }
        }
    }
}

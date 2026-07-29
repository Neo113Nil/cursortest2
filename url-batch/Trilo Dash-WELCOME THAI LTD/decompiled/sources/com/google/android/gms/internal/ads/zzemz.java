package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzemz implements zzems {
    private final zzfbw zza;
    private final zzcnf zzb;
    private final Context zzc;
    private final zzemp zzd;
    private final zzfhs zze;
    private zzcyk zzf;

    public zzemz(zzcnf zzcnfVar, Context context, zzemp zzempVar, zzfbw zzfbwVar) {
        this.zzb = zzcnfVar;
        this.zzc = context;
        this.zzd = zzempVar;
        this.zza = zzfbwVar;
        this.zze = zzcnfVar.zzy();
        zzfbwVar.zzu(zzempVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zza() {
        zzcyk zzcykVar = this.zzf;
        return zzcykVar != null && zzcykVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemq zzemqVar, zzemr zzemrVar) throws RemoteException {
        zzfhq zzfhqVar;
        zzfhg zzb = zzfhf.zzb(this.zzc, 7, 8, zzlVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemu
                @Override // java.lang.Runnable
                public final void run() {
                    zzemz.this.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemv
                @Override // java.lang.Runnable
                public final void run() {
                    zzemz.this.zzg();
                }
            });
            return false;
        }
        zzfcs.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzk().zzl(true);
        }
        int i = ((zzemt) zzemqVar).zza;
        zzfbw zzfbwVar = this.zza;
        zzfbwVar.zzE(zzlVar);
        zzfbwVar.zzz(i);
        zzfby zzG = zzfbwVar.zzG();
        com.google.android.gms.ads.internal.client.zzbz zzbzVar = zzG.zzn;
        if (zzbzVar != null) {
            this.zzd.zzd().zzi(zzbzVar);
        }
        zzdls zzh = this.zzb.zzh();
        zzdbc zzdbcVar = new zzdbc();
        zzdbcVar.zzc(this.zzc);
        zzdbcVar.zzf(zzG);
        zzh.zzf(zzdbcVar.zzg());
        zzdhc zzdhcVar = new zzdhc();
        zzdhcVar.zzk(this.zzd.zzd(), this.zzb.zzA());
        zzh.zze(zzdhcVar.zzn());
        zzh.zzd(this.zzd.zzc());
        zzh.zzc(new zzcvr(null));
        zzdlt zzg = zzh.zzg();
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            zzfhq zzf = zzg.zzf();
            zzf.zzh(8);
            zzf.zzb(zzlVar.zzp);
            zzfhqVar = zzf;
        } else {
            zzfhqVar = null;
        }
        this.zzb.zzw().zzc(1);
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        ScheduledExecutorService zzB = this.zzb.zzB();
        zzcyz zza = zzg.zza();
        zzcyk zzcykVar = new zzcyk(zzfvkVar, zzB, zza.zzh(zza.zzi()));
        this.zzf = zzcykVar;
        zzcykVar.zze(new zzemy(this, zzemrVar, zzfhqVar, zzb, zzg));
        return true;
    }

    final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzfcx.zzd(4, null, null));
    }

    final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzfcx.zzd(6, null, null));
    }
}

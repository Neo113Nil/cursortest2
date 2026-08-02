package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzepc implements zzeov {
    private final zzfed zza;
    private final zzcom zzb;
    private final Context zzc;
    private final zzeos zzd;
    private final zzfjw zze;
    private zzczs zzf;

    public zzepc(zzcom zzcomVar, Context context, zzeos zzeosVar, zzfed zzfedVar) {
        this.zzb = zzcomVar;
        this.zzc = context;
        this.zzd = zzeosVar;
        this.zza = zzfedVar;
        this.zze = zzcomVar.zzy();
        zzfedVar.zzu(zzeosVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zza() {
        zzczs zzczsVar = this.zzf;
        return zzczsVar != null && zzczsVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeot zzeotVar, zzeou zzeouVar) throws RemoteException {
        zzfju zzfjuVar;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeox
                @Override // java.lang.Runnable
                public final void run() {
                    zzepc.this.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoy
                @Override // java.lang.Runnable
                public final void run() {
                    zzepc.this.zzg();
                }
            });
            return false;
        }
        zzfez.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzk().zzm(true);
        }
        int i = ((zzeow) zzeotVar).zza;
        zzfed zzfedVar = this.zza;
        zzfedVar.zzE(zzlVar);
        zzfedVar.zzz(i);
        zzfef zzG = zzfedVar.zzG();
        zzfjj zzb = zzfji.zzb(this.zzc, zzfjt.zzf(zzG), 8, zzlVar);
        com.google.android.gms.ads.internal.client.zzbz zzbzVar = zzG.zzn;
        if (zzbzVar != null) {
            this.zzd.zzd().zzi(zzbzVar);
        }
        zzdnc zzh = this.zzb.zzh();
        zzdck zzdckVar = new zzdck();
        zzdckVar.zzc(this.zzc);
        zzdckVar.zzf(zzG);
        zzh.zzf(zzdckVar.zzg());
        zzdik zzdikVar = new zzdik();
        zzdikVar.zzk(this.zzd.zzd(), this.zzb.zzA());
        zzh.zze(zzdikVar.zzn());
        zzh.zzd(this.zzd.zzc());
        zzh.zzc(new zzcwz(null));
        zzdnd zzg = zzh.zzg();
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            zzfju zzf = zzg.zzf();
            zzf.zzh(8);
            zzf.zzb(zzlVar.zzp);
            zzfjuVar = zzf;
        } else {
            zzfjuVar = null;
        }
        this.zzb.zzw().zzc(1);
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        ScheduledExecutorService zzB = this.zzb.zzB();
        zzdah zza = zzg.zza();
        zzczs zzczsVar = new zzczs(zzfzqVar, zzB, zza.zzh(zza.zzi()));
        this.zzf = zzczsVar;
        zzczsVar.zze(new zzepb(this, zzeouVar, zzfjuVar, zzb, zzg));
        return true;
    }

    final /* synthetic */ void zzf() {
        this.zzd.zza().zza(zzffe.zzd(4, null, null));
    }

    final /* synthetic */ void zzg() {
        this.zzd.zza().zza(zzffe.zzd(6, null, null));
    }
}

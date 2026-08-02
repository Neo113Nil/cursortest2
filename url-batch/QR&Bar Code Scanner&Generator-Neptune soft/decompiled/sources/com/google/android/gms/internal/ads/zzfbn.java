package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfbn implements zzeov {
    private final Context zza;
    private final Executor zzb;
    private final zzcom zzc;
    private final zzeof zzd;
    private final zzfcn zze;
    private zzbjx zzf;
    private final zzfjw zzg;
    private final zzfed zzh;
    private zzfzp zzi;

    public zzfbn(Context context, Executor executor, zzcom zzcomVar, zzeof zzeofVar, zzfcn zzfcnVar, zzfed zzfedVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcomVar;
        this.zzd = zzeofVar;
        this.zzh = zzfedVar;
        this.zze = zzfcnVar;
        this.zzg = zzcomVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zza() {
        zzfzp zzfzpVar = this.zzi;
        return (zzfzpVar == null || zzfzpVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeot zzeotVar, zzeou zzeouVar) {
        zzdmh zzh;
        zzfju zzfjuVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbh
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbn.this.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzk().zzm(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfbg) zzeotVar).zza;
        zzfed zzfedVar = this.zzh;
        zzfedVar.zzs(str);
        zzfedVar.zzr(zzqVar);
        zzfedVar.zzE(zzlVar);
        zzfef zzG = zzfedVar.zzG();
        zzfjj zzb = zzfji.zzb(this.zza, zzfjt.zzf(zzG), 4, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzha)).booleanValue()) {
            zzdmg zzg = this.zzc.zzg();
            zzdck zzdckVar = new zzdck();
            zzdckVar.zzc(this.zza);
            zzdckVar.zzf(zzG);
            zzg.zze(zzdckVar.zzg());
            zzdik zzdikVar = new zzdik();
            zzdikVar.zzj(this.zzd, this.zzb);
            zzdikVar.zzk(this.zzd, this.zzb);
            zzg.zzd(zzdikVar.zzn());
            zzg.zzc(new zzemp(this.zzf));
            zzh = zzg.zzh();
        } else {
            zzdik zzdikVar2 = new zzdik();
            zzfcn zzfcnVar = this.zze;
            if (zzfcnVar != null) {
                zzdikVar2.zze(zzfcnVar, this.zzb);
                zzdikVar2.zzf(this.zze, this.zzb);
                zzdikVar2.zzb(this.zze, this.zzb);
            }
            zzdmg zzg2 = this.zzc.zzg();
            zzdck zzdckVar2 = new zzdck();
            zzdckVar2.zzc(this.zza);
            zzdckVar2.zzf(zzG);
            zzg2.zze(zzdckVar2.zzg());
            zzdikVar2.zzj(this.zzd, this.zzb);
            zzdikVar2.zze(this.zzd, this.zzb);
            zzdikVar2.zzf(this.zzd, this.zzb);
            zzdikVar2.zzb(this.zzd, this.zzb);
            zzdikVar2.zza(this.zzd, this.zzb);
            zzdikVar2.zzl(this.zzd, this.zzb);
            zzdikVar2.zzk(this.zzd, this.zzb);
            zzdikVar2.zzi(this.zzd, this.zzb);
            zzdikVar2.zzc(this.zzd, this.zzb);
            zzg2.zzd(zzdikVar2.zzn());
            zzg2.zzc(new zzemp(this.zzf));
            zzh = zzg2.zzh();
        }
        zzdmh zzdmhVar = zzh;
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            zzfju zzf = zzdmhVar.zzf();
            zzf.zzh(4);
            zzf.zzb(zzlVar.zzp);
            zzfjuVar = zzf;
        } else {
            zzfjuVar = null;
        }
        zzdah zza = zzdmhVar.zza();
        zzfzp zzh2 = zza.zzh(zza.zzi());
        this.zzi = zzh2;
        zzfzg.zzr(zzh2, new zzfbm(this, zzeouVar, zzfjuVar, zzb, zzdmhVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzh() {
        this.zzd.zza(zzffe.zzd(6, null, null));
    }

    public final void zzi(zzbjx zzbjxVar) {
        this.zzf = zzbjxVar;
    }
}

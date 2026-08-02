package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfcx implements zzeov {
    private final Context zza;
    private final Executor zzb;
    private final zzcom zzc;
    private final zzfcn zzd;
    private final zzfaz zze;
    private final zzfdx zzf;
    private final zzfjw zzg;
    private final zzfed zzh;
    private zzfzp zzi;

    public zzfcx(Context context, Executor executor, zzcom zzcomVar, zzfaz zzfazVar, zzfcn zzfcnVar, zzfed zzfedVar, zzfdx zzfdxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcomVar;
        this.zze = zzfazVar;
        this.zzd = zzfcnVar;
        this.zzh = zzfedVar;
        this.zzf = zzfdxVar;
        this.zzg = zzcomVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdug zzk(zzfax zzfaxVar) {
        zzfcw zzfcwVar = (zzfcw) zzfaxVar;
        zzdug zzi = this.zzc.zzi();
        zzdck zzdckVar = new zzdck();
        zzdckVar.zzc(this.zza);
        zzdckVar.zzf(zzfcwVar.zza);
        String str = zzfcwVar.zzb;
        zzdckVar.zze(this.zzf);
        zzi.zzd(zzdckVar.zzg());
        zzi.zzc(new zzdik().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeot zzeotVar, zzeou zzeouVar) throws RemoteException {
        zzfju zzfjuVar;
        zzcbz zzcbzVar = new zzcbz(zzlVar, str);
        if (zzcbzVar.zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcq
                @Override // java.lang.Runnable
                public final void run() {
                    zzfcx.this.zzi();
                }
            });
        } else {
            zzfzp zzfzpVar = this.zzi;
            if (zzfzpVar == null || zzfzpVar.isDone()) {
                if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
                    zzfaz zzfazVar = this.zze;
                    if (zzfazVar.zzd() != null) {
                        zzfju zzh = ((zzduh) zzfazVar.zzd()).zzh();
                        zzh.zzh(5);
                        zzh.zzb(zzcbzVar.zza.zzp);
                        zzfjuVar = zzh;
                        zzfez.zza(this.zza, zzcbzVar.zza.zzf);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue() && zzcbzVar.zza.zzf) {
                            this.zzc.zzk().zzm(true);
                        }
                        zzfed zzfedVar = this.zzh;
                        zzfedVar.zzs(zzcbzVar.zzb);
                        zzfedVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                        zzfedVar.zzE(zzcbzVar.zza);
                        zzfef zzG = zzfedVar.zzG();
                        zzfjj zzb = zzfji.zzb(this.zza, zzfjt.zzf(zzG), 5, zzcbzVar.zza);
                        zzfcw zzfcwVar = new zzfcw(null);
                        zzfcwVar.zza = zzG;
                        zzfcwVar.zzb = null;
                        zzfzp zzc = this.zze.zzc(new zzfba(zzfcwVar, null), new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcr
                            @Override // com.google.android.gms.internal.ads.zzfay
                            public final zzdci zza(zzfax zzfaxVar) {
                                zzdug zzk;
                                zzk = zzfcx.this.zzk(zzfaxVar);
                                return zzk;
                            }
                        }, null);
                        this.zzi = zzc;
                        zzfzg.zzr(zzc, new zzfcu(this, zzeouVar, zzfjuVar, zzb, zzfcwVar), this.zzb);
                        return true;
                    }
                }
                zzfjuVar = null;
                zzfez.zza(this.zza, zzcbzVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue()) {
                    this.zzc.zzk().zzm(true);
                }
                zzfed zzfedVar2 = this.zzh;
                zzfedVar2.zzs(zzcbzVar.zzb);
                zzfedVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
                zzfedVar2.zzE(zzcbzVar.zza);
                zzfef zzG2 = zzfedVar2.zzG();
                zzfjj zzb2 = zzfji.zzb(this.zza, zzfjt.zzf(zzG2), 5, zzcbzVar.zza);
                zzfcw zzfcwVar2 = new zzfcw(null);
                zzfcwVar2.zza = zzG2;
                zzfcwVar2.zzb = null;
                zzfzp zzc2 = this.zze.zzc(new zzfba(zzfcwVar2, null), new zzfay() { // from class: com.google.android.gms.internal.ads.zzfcr
                    @Override // com.google.android.gms.internal.ads.zzfay
                    public final zzdci zza(zzfax zzfaxVar) {
                        zzdug zzk;
                        zzk = zzfcx.this.zzk(zzfaxVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc2;
                zzfzg.zzr(zzc2, new zzfcu(this, zzeouVar, zzfjuVar, zzb2, zzfcwVar2), this.zzb);
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ void zzi() {
        this.zzd.zza(zzffe.zzd(6, null, null));
    }

    final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}

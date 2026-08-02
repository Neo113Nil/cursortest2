package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzezu implements zzeov {
    private final Context zza;
    private final Executor zzb;
    private final zzcom zzc;
    private final zzeof zzd;
    private final zzeoj zze;
    private final ViewGroup zzf;
    private zzbjx zzg;
    private final zzdfp zzh;
    private final zzfjw zzi;
    private final zzdhv zzj;
    private final zzfed zzk;
    private zzfzp zzl;

    public zzezu(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcom zzcomVar, zzeof zzeofVar, zzeoj zzeojVar, zzfed zzfedVar, zzdhv zzdhvVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcomVar;
        this.zzd = zzeofVar;
        this.zze = zzeojVar;
        this.zzk = zzfedVar;
        this.zzh = zzcomVar.zzf();
        this.zzi = zzcomVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdhvVar;
        zzfedVar.zzr(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zza() {
        zzfzp zzfzpVar = this.zzl;
        return (zzfzpVar == null || zzfzpVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeov
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzeot zzeotVar, zzeou zzeouVar) throws RemoteException {
        zzcxz zzh;
        zzfju zzfjuVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezq
                @Override // java.lang.Runnable
                public final void run() {
                    zzezu.this.zzm();
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
        zzfed zzfedVar = this.zzk;
        zzfedVar.zzs(str);
        zzfedVar.zzE(zzlVar);
        zzfef zzG = zzfedVar.zzG();
        zzfjj zzb = zzfji.zzb(this.zza, zzfjt.zzf(zzG), 3, zzlVar);
        if (((Boolean) zzbkx.zzc.zze()).booleanValue() && this.zzk.zzg().zzk) {
            zzeof zzeofVar = this.zzd;
            if (zzeofVar != null) {
                zzeofVar.zza(zzffe.zzd(7, null, null));
            }
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgY)).booleanValue()) {
            zzcxy zze = this.zzc.zze();
            zzdck zzdckVar = new zzdck();
            zzdckVar.zzc(this.zza);
            zzdckVar.zzf(zzG);
            zze.zzi(zzdckVar.zzg());
            zzdik zzdikVar = new zzdik();
            zzdikVar.zzj(this.zzd, this.zzb);
            zzdikVar.zzk(this.zzd, this.zzb);
            zze.zzf(zzdikVar.zzn());
            zze.zze(new zzemp(this.zzg));
            zze.zzd(new zzdmy(zzdpb.zza, null));
            zze.zzg(new zzcyw(this.zzh, this.zzj));
            zze.zzc(new zzcwz(this.zzf));
            zzh = zze.zzh();
        } else {
            zzcxy zze2 = this.zzc.zze();
            zzdck zzdckVar2 = new zzdck();
            zzdckVar2.zzc(this.zza);
            zzdckVar2.zzf(zzG);
            zze2.zzi(zzdckVar2.zzg());
            zzdik zzdikVar2 = new zzdik();
            zzdikVar2.zzj(this.zzd, this.zzb);
            zzdikVar2.zza(this.zzd, this.zzb);
            zzdikVar2.zza(this.zze, this.zzb);
            zzdikVar2.zzl(this.zzd, this.zzb);
            zzdikVar2.zzd(this.zzd, this.zzb);
            zzdikVar2.zze(this.zzd, this.zzb);
            zzdikVar2.zzf(this.zzd, this.zzb);
            zzdikVar2.zzb(this.zzd, this.zzb);
            zzdikVar2.zzk(this.zzd, this.zzb);
            zzdikVar2.zzi(this.zzd, this.zzb);
            zze2.zzf(zzdikVar2.zzn());
            zze2.zze(new zzemp(this.zzg));
            zze2.zzd(new zzdmy(zzdpb.zza, null));
            zze2.zzg(new zzcyw(this.zzh, this.zzj));
            zze2.zzc(new zzcwz(this.zzf));
            zzh = zze2.zzh();
        }
        zzcxz zzcxzVar = zzh;
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            zzfju zzj = zzcxzVar.zzj();
            zzj.zzh(3);
            zzj.zzb(zzlVar.zzp);
            zzfjuVar = zzj;
        } else {
            zzfjuVar = null;
        }
        zzdah zzd = zzcxzVar.zzd();
        zzfzp zzh2 = zzd.zzh(zzd.zzi());
        this.zzl = zzh2;
        zzfzg.zzr(zzh2, new zzezt(this, zzeouVar, zzfjuVar, zzb, zzcxzVar), this.zzb);
        return true;
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfed zzi() {
        return this.zzk;
    }

    final /* synthetic */ void zzm() {
        this.zzd.zza(zzffe.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        this.zze.zza(zzbcVar);
    }

    public final void zzp(zzdfq zzdfqVar) {
        this.zzh.zzj(zzdfqVar, this.zzb);
    }

    public final void zzq(zzbjx zzbjxVar) {
        this.zzg = zzbjxVar;
    }

    public final boolean zzr() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzS(view, view.getContext());
    }
}

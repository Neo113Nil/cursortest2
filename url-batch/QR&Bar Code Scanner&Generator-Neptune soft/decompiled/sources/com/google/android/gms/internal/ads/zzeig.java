package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeig implements zzehj {
    private final Context zza;
    private final zzcxz zzb;
    private final Executor zzc;

    public zzeig(Context context, zzcxz zzcxzVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcxzVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, final zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek, zzekr {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgJ)).booleanValue() && zzfdkVar.zzai) {
            zzbvt zzc = ((zzffa) zzehfVar.zzb).zzc();
            if (zzc == null) {
                com.google.android.gms.ads.internal.util.zze.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfek(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfek(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeif
                            @Override // com.google.android.gms.internal.ads.zzfyn
                            public final zzfzp zza(Object obj) {
                                return zzeig.this.zzc(zza, zzfdkVar, obj);
                            }
                        }, zzchc.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfek(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfek(e2);
            }
        } else {
            zza = ((zzffa) zzehfVar.zzb).zza();
        }
        zzcxz zzcxzVar = this.zzb;
        zzczt zzcztVar = new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza);
        final zzffa zzffaVar = (zzffa) zzehfVar.zzb;
        zzcxd zza2 = zzcxzVar.zza(zzcztVar, new zzcxj(zza, null, new zzczc() { // from class: com.google.android.gms.internal.ads.zzeie
            @Override // com.google.android.gms.internal.ads.zzczc
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return zzffa.this.zzb();
            }
        }, (zzfdl) zzfdkVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzj(new zzcuq((zzffa) zzehfVar.zzb), this.zzc);
        ((zzeix) zzehfVar.zzc).zzc(zza2.zzi());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzfdwVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgJ)).booleanValue() && zzfdkVar.zzai) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfej.zza(this.zza, zzfdkVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgJ)).booleanValue() && zzfdkVar.zzai) {
            ((zzffa) zzehfVar.zzb).zzm(this.zza, zzqVar3, zzfdwVar.zza.zza.zzd, zzfdkVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfdkVar.zzt), (zzbvq) zzehfVar.zzc);
        } else {
            ((zzffa) zzehfVar.zzb).zzl(this.zza, zzqVar3, zzfdwVar.zza.zza.zzd, zzfdkVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfdkVar.zzt), (zzbvq) zzehfVar.zzc);
        }
    }

    final /* synthetic */ zzfzp zzc(View view, zzfdk zzfdkVar, Object obj) throws Exception {
        return zzfzg.zzi(zzcyq.zza(this.zza, view, zzfdkVar));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzegd implements zzefg {
    private final Context zza;
    private final zzcwr zzb;
    private final Executor zzc;

    public zzegd(Context context, zzcwr zzcwrVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcwrVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, final zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd, zzeio {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() && zzfbgVar.zzai) {
            zzbui zzc = ((zzfct) zzefbVar.zzb).zzc();
            if (zzc == null) {
                com.google.android.gms.ads.internal.util.zze.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcd(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfcd(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzegc
                            @Override // com.google.android.gms.internal.ads.zzfuh
                            public final zzfvj zza(Object obj) {
                                return zzegd.this.zzc(zza, zzfbgVar, obj);
                            }
                        }, zzcfv.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfcd(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfcd(e2);
            }
        } else {
            zza = ((zzfct) zzefbVar.zzb).zza();
        }
        zzcwr zzcwrVar = this.zzb;
        zzcyl zzcylVar = new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza);
        final zzfct zzfctVar = (zzfct) zzefbVar.zzb;
        zzcvv zza2 = zzcwrVar.zza(zzcylVar, new zzcwb(zza, null, new zzcxu() { // from class: com.google.android.gms.internal.ads.zzegb
            @Override // com.google.android.gms.internal.ads.zzcxu
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return zzfct.this.zzb();
            }
        }, (zzfbh) zzfbgVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzj(new zzcti((zzfct) zzefbVar.zzb), this.zzc);
        ((zzegu) zzefbVar.zzc).zzc(zza2.zzi());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzfbsVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() && zzfbgVar.zzai) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfcc.zza(this.zza, zzfbgVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() && zzfbgVar.zzai) {
            ((zzfct) zzefbVar.zzb).zzm(this.zza, zzqVar3, zzfbsVar.zza.zza.zzd, zzfbgVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbgVar.zzt), (zzbuf) zzefbVar.zzc);
        } else {
            ((zzfct) zzefbVar.zzb).zzl(this.zza, zzqVar3, zzfbsVar.zza.zza.zzd, zzfbgVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbgVar.zzt), (zzbuf) zzefbVar.zzc);
        }
    }

    final /* synthetic */ zzfvj zzc(View view, zzfbg zzfbgVar, Object obj) throws Exception {
        return zzfva.zzi(zzcxi.zza(this.zza, view, zzfbgVar));
    }
}

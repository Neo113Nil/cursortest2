package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzehy implements zzefg {
    private final Context zza;
    private final zzdlt zzb;
    private zzbuo zzc;
    private final zzcfo zzd;

    public zzehy(Context context, zzdlt zzdltVar, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = zzdltVar;
        this.zzd = zzcfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd, zzeio {
        if (!zzfbsVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzeio(2, "Unified must be used for RTB.");
        }
        zzdng zzs = zzdng.zzs(this.zzc);
        if (!zzfbsVar.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
            throw new zzeio(1, "No corresponding native ad listener");
        }
        zzdni zze = this.zzb.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdns(zzs), new zzdpg(null, null, this.zzc, null));
        ((zzegu) zzefbVar.zzc).zzc(zze.zzh());
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd {
        try {
            ((zzbvs) zzefbVar.zzb).zzp(zzfbgVar.zzaa);
            zzehw zzehwVar = null;
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbt)).intValue()) {
                ((zzbvs) zzefbVar.zzb).zzl(zzfbgVar.zzV, zzfbgVar.zzw.toString(), zzfbsVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehx(this, zzefbVar, zzehwVar), (zzbuf) zzefbVar.zzc);
            } else {
                ((zzbvs) zzefbVar.zzb).zzm(zzfbgVar.zzV, zzfbgVar.zzw.toString(), zzfbsVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehx(this, zzefbVar, zzehwVar), (zzbuf) zzefbVar.zzc, zzfbsVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfcd(e);
        }
    }
}

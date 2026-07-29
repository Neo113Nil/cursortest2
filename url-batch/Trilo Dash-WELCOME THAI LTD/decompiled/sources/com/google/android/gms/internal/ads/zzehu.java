package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzehu implements zzefg {
    private final Context zza;
    private final zzdlt zzb;
    private final Executor zzc;

    public zzehu(Context context, zzdlt zzdltVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdltVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfbs zzfbsVar, int i) {
        return zzfbsVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd, zzeio {
        zzdng zzac;
        zzbuk zzB = ((zzfct) zzefbVar.zzb).zzB();
        zzbul zzC = ((zzfct) zzefbVar.zzb).zzC();
        zzbuo zzd = ((zzfct) zzefbVar.zzb).zzd();
        if (zzd != null && zzc(zzfbsVar, 6)) {
            zzac = zzdng.zzs(zzd);
        } else if (zzB != null && zzc(zzfbsVar, 6)) {
            zzac = zzdng.zzad(zzB);
        } else if (zzB != null && zzc(zzfbsVar, 2)) {
            zzac = zzdng.zzab(zzB);
        } else if (zzC != null && zzc(zzfbsVar, 6)) {
            zzac = zzdng.zzae(zzC);
        } else {
            if (zzC == null || !zzc(zzfbsVar, 1)) {
                throw new zzeio(1, "No native ad mappers");
            }
            zzac = zzdng.zzac(zzC);
        }
        if (!zzfbsVar.zza.zza.zzg.contains(Integer.toString(zzac.zzc()))) {
            throw new zzeio(1, "No corresponding native ad listener");
        }
        zzdni zze = this.zzb.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdns(zzac), new zzdpg(zzC, zzB, zzd, null));
        ((zzegu) zzefbVar.zzc).zzc(zze.zzi());
        zze.zzd().zzj(new zzcti((zzfct) zzefbVar.zzb), this.zzc);
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd {
        zzfct zzfctVar = (zzfct) zzefbVar.zzb;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfbsVar.zza.zza.zzd;
        String jSONObject = zzfbgVar.zzw.toString();
        String zzl = com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbgVar.zzt);
        zzbuf zzbufVar = (zzbuf) zzefbVar.zzc;
        zzfby zzfbyVar = zzfbsVar.zza.zza;
        zzfctVar.zzo(context, zzlVar, jSONObject, zzl, zzbufVar, zzfbyVar.zzi, zzfbyVar.zzg);
    }
}

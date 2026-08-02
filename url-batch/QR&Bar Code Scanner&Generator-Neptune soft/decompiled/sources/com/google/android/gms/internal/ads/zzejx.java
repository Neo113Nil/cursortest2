package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzejx implements zzehj {
    private final Context zza;
    private final zzdnd zzb;
    private final Executor zzc;

    public zzejx(Context context, zzdnd zzdndVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdndVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfdw zzfdwVar, int i) {
        return zzfdwVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek, zzekr {
        zzdoq zzac;
        zzbvv zzB = ((zzffa) zzehfVar.zzb).zzB();
        zzbvw zzC = ((zzffa) zzehfVar.zzb).zzC();
        zzbvz zzd = ((zzffa) zzehfVar.zzb).zzd();
        if (zzd != null && zzc(zzfdwVar, 6)) {
            zzac = zzdoq.zzs(zzd);
        } else if (zzB != null && zzc(zzfdwVar, 6)) {
            zzac = zzdoq.zzad(zzB);
        } else if (zzB != null && zzc(zzfdwVar, 2)) {
            zzac = zzdoq.zzab(zzB);
        } else if (zzC != null && zzc(zzfdwVar, 6)) {
            zzac = zzdoq.zzae(zzC);
        } else {
            if (zzC == null || !zzc(zzfdwVar, 1)) {
                throw new zzekr(1, "No native ad mappers");
            }
            zzac = zzdoq.zzac(zzC);
        }
        if (!zzfdwVar.zza.zza.zzg.contains(Integer.toString(zzac.zzc()))) {
            throw new zzekr(1, "No corresponding native ad listener");
        }
        zzdos zze = this.zzb.zze(new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza), new zzdpc(zzac), new zzdqq(zzC, zzB, zzd, null));
        ((zzeix) zzehfVar.zzc).zzc(zze.zzi());
        zze.zzd().zzj(new zzcuq((zzffa) zzehfVar.zzb), this.zzc);
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        zzffa zzffaVar = (zzffa) zzehfVar.zzb;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfdwVar.zza.zza.zzd;
        String jSONObject = zzfdkVar.zzw.toString();
        String zzl = com.google.android.gms.ads.internal.util.zzbu.zzl(zzfdkVar.zzt);
        zzbvq zzbvqVar = (zzbvq) zzehfVar.zzc;
        zzfef zzfefVar = zzfdwVar.zza.zza;
        zzffaVar.zzo(context, zzlVar, jSONObject, zzl, zzbvqVar, zzfefVar.zzi, zzfefVar.zzg);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzekb implements zzehj {
    private final Context zza;
    private final zzdnd zzb;
    private zzbvz zzc;
    private final zzcgv zzd;

    public zzekb(Context context, zzdnd zzdndVar, zzcgv zzcgvVar) {
        this.zza = context;
        this.zzb = zzdndVar;
        this.zzd = zzcgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek, zzekr {
        if (!zzfdwVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzekr(2, "Unified must be used for RTB.");
        }
        zzdoq zzs = zzdoq.zzs(this.zzc);
        if (!zzfdwVar.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
            throw new zzekr(1, "No corresponding native ad listener");
        }
        zzdos zze = this.zzb.zze(new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza), new zzdpc(zzs), new zzdqq(null, null, this.zzc, null));
        ((zzeix) zzehfVar.zzc).zzc(zze.zzh());
        return zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        try {
            ((zzbxd) zzehfVar.zzb).zzp(zzfdkVar.zzaa);
            zzejz zzejzVar = null;
            if (this.zzd.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbv)).intValue()) {
                ((zzbxd) zzehfVar.zzb).zzl(zzfdkVar.zzV, zzfdkVar.zzw.toString(), zzfdwVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeka(this, zzehfVar, zzejzVar), (zzbvq) zzehfVar.zzc);
            } else {
                ((zzbxd) zzehfVar.zzb).zzm(zzfdkVar.zzV, zzfdkVar.zzw.toString(), zzfdwVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeka(this, zzehfVar, zzejzVar), (zzbvq) zzehfVar.zzc, zzfdwVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfek(e);
        }
    }
}

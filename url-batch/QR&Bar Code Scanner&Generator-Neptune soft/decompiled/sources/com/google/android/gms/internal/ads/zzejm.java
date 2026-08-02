package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzejm implements zzehj {
    private final Context zza;
    private final zzdmh zzb;

    public zzejm(Context context, zzdmh zzdmhVar) {
        this.zza = context;
        this.zzb = zzdmhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek, zzekr {
        zzejg zzejgVar = new zzejg(zzfdkVar, (zzbxd) zzehfVar.zzb, false);
        zzdlh zze = this.zzb.zze(new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza), new zzdlk(zzejgVar, null));
        zzejgVar.zzb(zze.zzc());
        ((zzeix) zzehfVar.zzc).zzc(zze.zzh());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        try {
            ((zzbxd) zzehfVar.zzb).zzp(zzfdkVar.zzaa);
            ((zzbxd) zzehfVar.zzb).zzk(zzfdkVar.zzV, zzfdkVar.zzw.toString(), zzfdwVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejl(this, zzehfVar, null), (zzbvq) zzehfVar.zzc);
        } catch (RemoteException e) {
            throw new zzfek(e);
        }
    }
}

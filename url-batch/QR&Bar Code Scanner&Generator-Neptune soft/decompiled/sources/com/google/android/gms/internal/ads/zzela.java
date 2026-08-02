package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzela implements zzehj {
    private final Context zza;
    private final zzduh zzb;

    public zzela(Context context, zzduh zzduhVar) {
        this.zza = context;
        this.zzb = zzduhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek, zzekr {
        zzejg zzejgVar = new zzejg(zzfdkVar, (zzbxd) zzehfVar.zzb, true);
        zzdud zze = this.zzb.zze(new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza), new zzdue(zzejgVar));
        zzejgVar.zzb(zze.zzc());
        ((zzeix) zzehfVar.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        try {
            ((zzbxd) zzehfVar.zzb).zzp(zzfdkVar.zzaa);
            if (zzfdwVar.zza.zza.zzo.zza == 3) {
                ((zzbxd) zzehfVar.zzb).zzn(zzfdkVar.zzV, zzfdkVar.zzw.toString(), zzfdwVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekz(this, zzehfVar, null), (zzbvq) zzehfVar.zzc);
            } else {
                ((zzbxd) zzehfVar.zzb).zzo(zzfdkVar.zzV, zzfdkVar.zzw.toString(), zzfdwVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekz(this, zzehfVar, null), (zzbvq) zzehfVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}

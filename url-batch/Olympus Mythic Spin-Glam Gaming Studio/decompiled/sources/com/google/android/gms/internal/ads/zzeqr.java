package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzeqr implements zzemw {
    private final Context zza;
    private final zzdwp zzb;

    public zzeqr(Context context, zzdwp zzdwpVar) {
        this.zza = context;
        this.zzb = zzdwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.zzb;
            zzbxtVar.zzo(zzfldVar.zzZ);
            zzflw zzflwVar = zzfloVar.zza.zza;
            if (zzflwVar.zzp.zza == 3) {
                zzbxtVar.zzp(zzfldVar.zzU, zzfldVar.zzv.toString(), zzflwVar.zzd, ObjectWrapper.wrap(this.zza), new zzeqq(this, zzemtVar, null), (zzbwa) zzemtVar.zzc);
            } else {
                zzbxtVar.zzl(zzfldVar.zzU, zzfldVar.zzv.toString(), zzflwVar.zzd, ObjectWrapper.wrap(this.zza), new zzeqq(this, zzemtVar, null), (zzbwa) zzemtVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd, zzeqf {
        zzeoo zzeooVar = new zzeoo(zzfldVar, (zzbxt) zzemtVar.zzb, AdFormat.REWARDED);
        zzdwl zzf = this.zzb.zzf(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdwm(zzeooVar));
        zzeooVar.zzc(zzf.zzd());
        ((zzeof) zzemtVar.zzc).zzb(zzf.zzn());
        return zzf.zzh();
    }
}

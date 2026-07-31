package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzeot implements zzemw {
    private final Context zza;
    private final zzdoe zzb;

    public zzeot(Context context, zzdoe zzdoeVar) {
        this.zza = context;
        this.zzb = zzdoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.zzb;
            zzbxtVar.zzo(zzfldVar.zzZ);
            zzbxtVar.zzj(zzfldVar.zzU, zzfldVar.zzv.toString(), zzfloVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeos(this, zzemtVar, null), (zzbwa) zzemtVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfmd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd, zzeqf {
        zzeoo zzeooVar = new zzeoo(zzfldVar, (zzbxt) zzemtVar.zzb, AdFormat.INTERSTITIAL);
        zzdmy zzd = this.zzb.zzd(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdnb(zzeooVar, null));
        zzeooVar.zzc(zzd.zzd());
        ((zzeof) zzemtVar.zzc).zzb(zzd.zzg());
        return zzd.zzh();
    }
}

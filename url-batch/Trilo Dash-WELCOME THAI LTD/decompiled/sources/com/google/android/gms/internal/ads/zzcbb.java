package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcbb extends zzaqv implements zzcbd {
    zzcbb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final Bundle zzb() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        Bundle bundle = (Bundle) zzaqx.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final com.google.android.gms.ads.internal.client.zzdh zzc() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        com.google.android.gms.ads.internal.client.zzdh zzb = com.google.android.gms.ads.internal.client.zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzcba zzd() throws RemoteException {
        zzcba zzcayVar;
        Parcel zzbk = zzbk(11, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzcayVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcayVar = queryLocalInterface instanceof zzcba ? (zzcba) queryLocalInterface : new zzcay(readStrongBinder);
        }
        zzbk.recycle();
        return zzcayVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbk zzcbkVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, zzcbkVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzcbk zzcbkVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzlVar);
        zzaqx.zzg(zza, zzcbkVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzd(zza, z);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzdbVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzdeVar);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzk(zzcbg zzcbgVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcbgVar);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzl(zzcbr zzcbrVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzcbrVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzp(zzcbl zzcblVar) throws RemoteException {
        throw null;
    }
}

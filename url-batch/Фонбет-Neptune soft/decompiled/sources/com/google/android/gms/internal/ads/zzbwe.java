package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwe extends zzaxm implements zzbwg {
    zzbwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final Bundle zzb() throws RemoteException {
        Parcel zzdb = zzdb(9, zza());
        Bundle bundle = (Bundle) zzaxo.zza(zzdb, Bundle.CREATOR);
        zzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel zzdb = zzdb(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzb = com.google.android.gms.ads.internal.client.zzdm.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final zzbwd zzd() throws RemoteException {
        zzbwd zzbwbVar;
        Parcel zzdb = zzdb(11, zza());
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbwbVar = queryLocalInterface instanceof zzbwd ? (zzbwd) queryLocalInterface : new zzbwb(readStrongBinder);
        }
        zzdb.recycle();
        return zzbwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwn zzbwnVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, zzbwnVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbwn zzbwnVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzlVar);
        zzaxo.zzf(zza, zzbwnVar);
        zzdc(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzaxo.zza;
        zza.writeInt(z ? 1 : 0);
        zzdc(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzddVar);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzdgVar);
        zzdc(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzk(zzbwj zzbwjVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbwjVar);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzl(zzbwu zzbwuVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbwuVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzp(zzbwo zzbwoVar) throws RemoteException {
        throw null;
    }
}

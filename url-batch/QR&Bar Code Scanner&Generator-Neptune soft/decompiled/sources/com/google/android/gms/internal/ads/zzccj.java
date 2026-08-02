package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzccj extends zzarz implements zzccl {
    zzccj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final Bundle zzb() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        Bundle bundle = (Bundle) zzasb.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final com.google.android.gms.ads.internal.client.zzdh zzc() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        com.google.android.gms.ads.internal.client.zzdh zzb = com.google.android.gms.ads.internal.client.zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final zzcci zzd() throws RemoteException {
        zzcci zzccgVar;
        Parcel zzbk = zzbk(11, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzccgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzccgVar = queryLocalInterface instanceof zzcci ? (zzcci) queryLocalInterface : new zzccg(readStrongBinder);
        }
        zzbk.recycle();
        return zzccgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccs zzccsVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, zzccsVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccs zzccsVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, zzccsVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzd(zza, z);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzdbVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzdeVar);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzk(zzcco zzccoVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzccoVar);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzl(zzccz zzcczVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzcczVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzp(zzcct zzcctVar) throws RemoteException {
        throw null;
    }
}

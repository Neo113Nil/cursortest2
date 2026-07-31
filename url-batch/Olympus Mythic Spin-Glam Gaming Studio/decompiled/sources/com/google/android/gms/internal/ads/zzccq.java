package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzccq extends zzbeu implements zzccs {
    zzccq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(4, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(6, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk(IObjectWrapper iObjectWrapper, zzcct zzcctVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzcctVar);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzm(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeInt(i);
        zzdb(9, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(11, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(13, zzcZ);
    }
}

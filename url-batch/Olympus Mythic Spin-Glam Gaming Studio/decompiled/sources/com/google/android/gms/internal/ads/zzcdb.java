package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcdb extends zzbeu implements zzcdd {
    zzcdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(zzccx zzccxVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzccxVar);
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(4, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzj() throws RemoteException {
        zzdb(6, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk() throws RemoteException {
        zzdb(7, zzcZ());
    }
}

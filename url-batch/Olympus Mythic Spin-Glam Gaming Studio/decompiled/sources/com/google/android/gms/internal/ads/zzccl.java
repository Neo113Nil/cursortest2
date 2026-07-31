package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzccl extends zzbeu implements zzccn {
    zzccl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzf() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzg() throws RemoteException {
        zzdb(3, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzh() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzi(zzcch zzcchVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzcchVar);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzj() throws RemoteException {
        zzdb(6, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzk(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzccn
    public final void zzl() throws RemoteException {
        zzdb(8, zzcZ());
    }
}

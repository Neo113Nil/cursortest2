package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbhe extends zzbeu implements zzbhg {
    zzbhe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zzb() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zzc() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zze() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zzf() throws RemoteException {
        zzdb(5, zzcZ());
    }
}

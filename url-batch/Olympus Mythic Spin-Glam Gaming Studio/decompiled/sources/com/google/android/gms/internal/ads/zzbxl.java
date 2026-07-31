package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbxl extends zzbeu implements zzbxn {
    zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(zzbwj zzbwjVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbwjVar);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString("Adapter returned null.");
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(3, zzcZ);
    }
}

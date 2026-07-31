package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcbn extends zzbeu implements IInterface {
    zzcbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzcbe zzcbeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzbew.zzc(zzcZ, zzcbeVar);
        zzdb(1, zzcZ);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzbaVar);
        zzdb(2, zzcZ);
    }
}

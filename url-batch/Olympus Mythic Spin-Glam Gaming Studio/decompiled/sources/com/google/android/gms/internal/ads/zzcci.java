package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcci extends zzbeu implements IInterface {
    zzcci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcch zzcchVar, String str, String str2) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzcchVar);
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzdb(2, zzcZ);
    }
}

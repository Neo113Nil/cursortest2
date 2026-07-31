package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzccv extends zzbeu implements zzccx {
    zzccv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final String zze() throws RemoteException {
        Parcel zzda = zzda(1, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzf() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcde extends zzbeu implements IInterface {
    zzcde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(1, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        zzda.recycle();
        return readStrongBinder;
    }
}

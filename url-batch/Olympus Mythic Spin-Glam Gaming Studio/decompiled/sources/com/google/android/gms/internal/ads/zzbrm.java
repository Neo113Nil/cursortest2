package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbrm extends zzbeu implements zzbro {
    zzbrm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final zzbrl zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i, zzbri zzbriVar) throws RemoteException {
        zzbrl zzbrjVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbew.zze(zzcZ, zzbriVar);
        Parcel zzda = zzda(1, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbrjVar = queryLocalInterface instanceof zzbrl ? (zzbrl) queryLocalInterface : new zzbrj(readStrongBinder);
        }
        zzda.recycle();
        return zzbrjVar;
    }
}

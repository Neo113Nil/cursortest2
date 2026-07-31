package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbzn extends zzbeu implements zzbzp {
    zzbzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final zzbzm zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbzm zzbzkVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(1, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbzkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbzkVar = queryLocalInterface instanceof zzbzm ? (zzbzm) queryLocalInterface : new zzbzk(readStrongBinder);
        }
        zzda.recycle();
        return zzbzkVar;
    }
}

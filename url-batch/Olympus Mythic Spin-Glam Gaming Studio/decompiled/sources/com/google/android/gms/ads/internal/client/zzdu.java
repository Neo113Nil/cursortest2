package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbvu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzdu extends zzbeu implements IInterface {
    zzdu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdt zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(1, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
        }
        zzda.recycle();
        return zzdrVar;
    }
}

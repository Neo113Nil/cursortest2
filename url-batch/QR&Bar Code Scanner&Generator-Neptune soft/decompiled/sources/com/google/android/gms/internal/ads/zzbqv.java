package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbqv extends zzarz implements zzbqx {
    zzbqv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final zzbqu zze(IObjectWrapper iObjectWrapper, zzbvk zzbvkVar, int i, zzbqr zzbqrVar) throws RemoteException {
        zzbqu zzbqsVar;
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        zzasb.zzg(zza, zzbqrVar);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbqsVar = queryLocalInterface instanceof zzbqu ? (zzbqu) queryLocalInterface : new zzbqs(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqsVar;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbzu extends zzbeu implements zzbzw {
    zzbzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbzw
    public final IBinder zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        Parcel zzda = zzda(1, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        zzda.recycle();
        return readStrongBinder;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbsm extends zzbeu implements zzbso {
    zzbsm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbso
    public final void zza(List list) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeTypedList(list);
        zzdb(1, zzcZ);
    }
}

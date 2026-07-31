package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbfd extends zzaxz implements IInterface {
    zzbfd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbtzVar);
        zzdf(1, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbht extends zzbeu implements IInterface {
    zzbht(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbho zze(zzbhr zzbhrVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzbhrVar);
        Parcel zzda = zzda(1, zzcZ);
        zzbho zzbhoVar = (zzbho) zzbew.zzb(zzda, zzbho.CREATOR);
        zzda.recycle();
        return zzbhoVar;
    }

    public final zzbho zzf(zzbhr zzbhrVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzbhrVar);
        Parcel zzda = zzda(2, zzcZ);
        zzbho zzbhoVar = (zzbho) zzbew.zzb(zzda, zzbho.CREATOR);
        zzda.recycle();
        return zzbhoVar;
    }

    public final long zzg(zzbhr zzbhrVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzbhrVar);
        Parcel zzda = zzda(3, zzcZ);
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }
}

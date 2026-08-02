package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbed extends zzarz implements IInterface {
    zzbed(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbeb zzbebVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzbebVar);
        Parcel zzbk = zzbk(3, zza);
        long readLong = zzbk.readLong();
        zzbk.recycle();
        return readLong;
    }

    public final zzbdy zzf(zzbeb zzbebVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzbebVar);
        Parcel zzbk = zzbk(1, zza);
        zzbdy zzbdyVar = (zzbdy) zzasb.zza(zzbk, zzbdy.CREATOR);
        zzbk.recycle();
        return zzbdyVar;
    }

    public final zzbdy zzg(zzbeb zzbebVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzbebVar);
        Parcel zzbk = zzbk(2, zza);
        zzbdy zzbdyVar = (zzbdy) zzasb.zza(zzbk, zzbdy.CREATOR);
        zzbk.recycle();
        return zzbdyVar;
    }
}

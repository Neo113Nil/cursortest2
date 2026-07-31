package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbld extends zzaxz implements IInterface {
    zzbld(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkx zzbkxVar, zzblc zzblcVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbkxVar);
        zzayb.zze(zza, zzblcVar);
        zzdg(2, zza);
    }
}

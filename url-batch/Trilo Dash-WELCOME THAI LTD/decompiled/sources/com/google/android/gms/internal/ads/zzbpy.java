package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbpy extends zzaqv implements IInterface {
    zzbpy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbps zzbpsVar, zzbpx zzbpxVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbpsVar);
        zzaqx.zzg(zza, zzbpxVar);
        zzbm(2, zza);
    }
}

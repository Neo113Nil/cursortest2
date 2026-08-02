package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbrj extends zzarz implements IInterface {
    zzbrj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbrd zzbrdVar, zzbri zzbriVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzbrdVar);
        zzasb.zzg(zza, zzbriVar);
        zzbm(2, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbvi extends zzaxz implements IInterface {
    zzbvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvh zzbvhVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbvhVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzdf(2, zza);
    }
}

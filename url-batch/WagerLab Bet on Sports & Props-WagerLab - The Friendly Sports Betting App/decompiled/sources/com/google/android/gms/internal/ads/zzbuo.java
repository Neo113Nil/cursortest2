package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbuo extends zzaxz implements IInterface {
    zzbuo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzbuf zzbufVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayb.zzc(zza, zzbufVar);
        zzdf(1, zza);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbaVar);
        zzdf(2, zza);
    }
}

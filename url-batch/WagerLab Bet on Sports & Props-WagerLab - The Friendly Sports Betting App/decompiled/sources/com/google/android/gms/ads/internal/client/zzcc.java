package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzcc extends zzaxz implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(zzft zzftVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzftVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(zzft zzftVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzftVar);
        zzdf(2, zza);
    }
}

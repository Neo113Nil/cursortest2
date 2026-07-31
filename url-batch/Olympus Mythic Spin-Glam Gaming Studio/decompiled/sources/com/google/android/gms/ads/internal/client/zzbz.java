package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbz extends zzbeu implements zzcb {
    zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze(zzfp zzfpVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzfpVar);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzf(zzfp zzfpVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzfpVar);
        zzdb(2, zzcZ);
    }
}

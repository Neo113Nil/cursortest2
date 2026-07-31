package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcbk extends zzbeu implements zzcbm {
    zzcbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, parcelFileDescriptor);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzbaVar);
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbv zzcbvVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, parcelFileDescriptor);
        zzbew.zzc(zzcZ, zzcbvVar);
        zzdb(3, zzcZ);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbul extends zzaxz implements zzbun {
    zzbul(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, parcelFileDescriptor);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbaVar);
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuv zzbuvVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, parcelFileDescriptor);
        zzayb.zzc(zza, zzbuvVar);
        zzdf(3, zza);
    }
}

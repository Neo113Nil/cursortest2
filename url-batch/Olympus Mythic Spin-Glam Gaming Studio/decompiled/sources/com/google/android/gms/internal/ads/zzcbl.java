package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzcbl extends zzbev implements zzcbm {
    public zzcbl() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbew.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbew.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzbew.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzbew.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbew.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzcbv zzcbvVar = (zzcbv) zzbew.zzb(parcel, zzcbv.CREATOR);
            zzbew.zzh(parcel);
            zzg(parcelFileDescriptor2, zzcbvVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

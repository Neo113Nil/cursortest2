package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbun extends zzaxn implements zzbuo {
    public zzbun() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbur zzburVar = null;
        if (i == 1) {
            zzbuc zzbucVar = (zzbuc) zzaxo.zza(parcel, zzbuc.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzburVar = queryLocalInterface instanceof zzbur ? (zzbur) queryLocalInterface : new zzbup(readStrongBinder);
            }
            zzaxo.zzc(parcel);
            zzf(zzbucVar, zzburVar);
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof zzbur) {
                }
            }
            zzaxo.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbug zzbugVar = (zzbug) zzaxo.zza(parcel, zzbug.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzburVar = queryLocalInterface3 instanceof zzbur ? (zzbur) queryLocalInterface3 : new zzbup(readStrongBinder3);
            }
            zzaxo.zzc(parcel);
            zze(zzbugVar, zzburVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

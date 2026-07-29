package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzbzl extends zzaqw implements zzbzm {
    public zzbzl() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbzq zzbzqVar = null;
        if (i == 1) {
            zzaqx.zzc(parcel);
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, null);
        } else if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbzn) {
                }
            }
            zzaqx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbzu zzbzuVar = (zzbzu) zzaqx.zza(parcel, zzbzu.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzqVar = queryLocalInterface2 instanceof zzbzq ? (zzbzq) queryLocalInterface2 : new zzbzo(readStrongBinder2);
            }
            zzaqx.zzc(parcel);
            zzg(zzbzuVar, zzbzqVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbzu zzbzuVar2 = (zzbzu) zzaqx.zza(parcel, zzbzu.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzqVar = queryLocalInterface3 instanceof zzbzq ? (zzbzq) queryLocalInterface3 : new zzbzo(readStrongBinder3);
            }
            zzaqx.zzc(parcel);
            zzf(zzbzuVar2, zzbzqVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbzu zzbzuVar3 = (zzbzu) zzaqx.zza(parcel, zzbzu.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzqVar = queryLocalInterface4 instanceof zzbzq ? (zzbzq) queryLocalInterface4 : new zzbzo(readStrongBinder4);
            }
            zzaqx.zzc(parcel);
            zze(zzbzuVar3, zzbzqVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzqVar = queryLocalInterface5 instanceof zzbzq ? (zzbzq) queryLocalInterface5 : new zzbzo(readStrongBinder5);
            }
            zzaqx.zzc(parcel);
            zzh(readString, zzbzqVar);
            parcel2.writeNoException();
        }
        return true;
    }
}

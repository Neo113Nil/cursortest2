package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzcat extends zzasa implements zzcau {
    public zzcat() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcay zzcayVar = null;
        if (i == 1) {
            zzasb.zzc(parcel);
            parcel2.writeNoException();
            zzasb.zzf(parcel2, null);
        } else if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzcav) {
                }
            }
            zzasb.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzcbc zzcbcVar = (zzcbc) zzasb.zza(parcel, zzcbc.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcayVar = queryLocalInterface2 instanceof zzcay ? (zzcay) queryLocalInterface2 : new zzcaw(readStrongBinder2);
            }
            zzasb.zzc(parcel);
            zzg(zzcbcVar, zzcayVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzcbc zzcbcVar2 = (zzcbc) zzasb.zza(parcel, zzcbc.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcayVar = queryLocalInterface3 instanceof zzcay ? (zzcay) queryLocalInterface3 : new zzcaw(readStrongBinder3);
            }
            zzasb.zzc(parcel);
            zzf(zzcbcVar2, zzcayVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzcbc zzcbcVar3 = (zzcbc) zzasb.zza(parcel, zzcbc.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcayVar = queryLocalInterface4 instanceof zzcay ? (zzcay) queryLocalInterface4 : new zzcaw(readStrongBinder4);
            }
            zzasb.zzc(parcel);
            zze(zzcbcVar3, zzcayVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcayVar = queryLocalInterface5 instanceof zzcay ? (zzcay) queryLocalInterface5 : new zzcaw(readStrongBinder5);
            }
            zzasb.zzc(parcel);
            zzh(readString, zzcayVar);
            parcel2.writeNoException();
        }
        return true;
    }
}

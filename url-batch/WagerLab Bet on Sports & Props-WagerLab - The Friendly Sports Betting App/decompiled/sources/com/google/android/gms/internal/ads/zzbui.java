package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbui extends zzaya implements zzbuj {
    public zzbui() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbun zzbunVar = null;
        zzbuo zzbuoVar = null;
        zzbun zzbunVar2 = null;
        zzbun zzbunVar3 = null;
        zzbun zzbunVar4 = null;
        switch (i) {
            case 1:
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zzd(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzbuk) {
                    }
                }
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbuv zzbuvVar = (zzbuv) zzayb.zzb(parcel, zzbuv.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbunVar = queryLocalInterface2 instanceof zzbun ? (zzbun) queryLocalInterface2 : new zzbul(readStrongBinder2);
                }
                zzayb.zzh(parcel);
                zze(zzbuvVar, zzbunVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbuv zzbuvVar2 = (zzbuv) zzayb.zzb(parcel, zzbuv.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbunVar4 = queryLocalInterface3 instanceof zzbun ? (zzbun) queryLocalInterface3 : new zzbul(readStrongBinder3);
                }
                zzayb.zzh(parcel);
                zzf(zzbuvVar2, zzbunVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbuv zzbuvVar3 = (zzbuv) zzayb.zzb(parcel, zzbuv.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbunVar3 = queryLocalInterface4 instanceof zzbun ? (zzbun) queryLocalInterface4 : new zzbul(readStrongBinder4);
                }
                zzayb.zzh(parcel);
                zzg(zzbuvVar3, zzbunVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbunVar2 = queryLocalInterface5 instanceof zzbun ? (zzbun) queryLocalInterface5 : new zzbul(readStrongBinder5);
                }
                zzayb.zzh(parcel);
                zzh(readString, zzbunVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbuf zzbufVar = (zzbuf) zzayb.zzb(parcel, zzbuf.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbuoVar = queryLocalInterface6 instanceof zzbuo ? (zzbuo) queryLocalInterface6 : new zzbuo(readStrongBinder6);
                }
                zzayb.zzh(parcel);
                zzi(zzbufVar, zzbuoVar);
                parcel2.writeNoException();
                return true;
        }
    }
}

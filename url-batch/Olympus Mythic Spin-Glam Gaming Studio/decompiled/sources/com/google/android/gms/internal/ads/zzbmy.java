package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbmy extends zzbev implements zzbmz {
    public zzbmy() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbmz zzdG(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzbmz ? (zzbmz) queryLocalInterface : new zzbmx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbms zzbmqVar;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zza(readString, asInterface);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbew.zzh(parcel);
                IObjectWrapper zzb = zzb(readString2);
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzc(asInterface2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzd();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                zzbew.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzdB(asInterface3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzdD(asInterface4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbmqVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbmqVar = queryLocalInterface instanceof zzbms ? (zzbms) queryLocalInterface : new zzbmq(readStrongBinder);
                }
                zzbew.zzh(parcel);
                zzdE(zzbmqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzdC(asInterface5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

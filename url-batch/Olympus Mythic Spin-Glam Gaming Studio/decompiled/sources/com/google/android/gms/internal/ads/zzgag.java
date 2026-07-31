package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public abstract class zzgag extends zzbev implements zzgah {
    public zzgag() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzbew.zzh(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzbew.zzh(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzbew.zzh(parcel);
                break;
            case 6:
                parcel.readInt();
                zzbew.zzh(parcel);
                break;
            case 7:
                parcel.readInt();
                zzbew.zzh(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzbew.zzh(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzcfa extends zzbev implements zzcfb {
    public zzcfa() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzbew.zzh(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzbew.zzh(parcel);
            zza(readString);
        } else {
            if (i != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
            zzbew.zzh(parcel);
            zzb(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}

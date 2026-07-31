package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbmn extends zzbev implements zzbmo {
    public zzbmn() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbmo zzi(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzbmo ? (zzbmo) queryLocalInterface : new zzbmm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String zza = zza();
            parcel2.writeNoException();
            parcel2.writeString(zza);
            return true;
        }
        if (i != 3) {
            return false;
        }
        List zzb = zzb();
        parcel2.writeNoException();
        parcel2.writeList(zzb);
        return true;
    }
}

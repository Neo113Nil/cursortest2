package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzccw extends zzbev implements zzccx {
    public zzccw() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static zzccx zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof zzccx ? (zzccx) queryLocalInterface : new zzccv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
        } else {
            if (i != 2) {
                return false;
            }
            int zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(zzf);
        }
        return true;
    }
}

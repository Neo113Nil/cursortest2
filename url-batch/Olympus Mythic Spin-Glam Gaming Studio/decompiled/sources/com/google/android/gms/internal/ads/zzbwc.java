package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes15.dex */
public abstract class zzbwc extends zzbev implements zzbwd {
    public zzbwc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbwd zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbwd ? (zzbwd) queryLocalInterface : new zzbwb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzbew.zze(parcel2, zze);
        } else {
            if (i != 2) {
                return false;
            }
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i3 = zzbew.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}

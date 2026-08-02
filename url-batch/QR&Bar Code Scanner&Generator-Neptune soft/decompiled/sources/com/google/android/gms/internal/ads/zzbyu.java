package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbyu extends zzasa implements zzbyv {
    public zzbyu() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbyv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbyv ? (zzbyv) queryLocalInterface : new zzbyt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Intent intent = (Intent) zzasb.zza(parcel, Intent.CREATOR);
            zzasb.zzc(parcel);
            zze(intent);
        } else if (i == 2) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzasb.zzc(parcel);
            zzg(asInterface, readString, readString2);
        } else {
            if (i != 3) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}

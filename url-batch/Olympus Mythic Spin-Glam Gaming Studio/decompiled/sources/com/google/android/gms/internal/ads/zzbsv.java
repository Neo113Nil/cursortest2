package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes15.dex */
public abstract class zzbsv extends zzbev implements zzbsw {
    public zzbsv() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbsz zzbsxVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzea zzb = zzb();
            parcel2.writeNoException();
            zzbew.zze(parcel2, zzb);
            return true;
        }
        if (i == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbsxVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbsxVar = queryLocalInterface instanceof zzbsz ? (zzbsz) queryLocalInterface : new zzbsx(readStrongBinder);
            }
            zzbew.zzh(parcel);
            zzd(asInterface, zzbsxVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbew.zzh(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzbms zzf = zzf();
        parcel2.writeNoException();
        zzbew.zze(parcel2, zzf);
        return true;
    }
}

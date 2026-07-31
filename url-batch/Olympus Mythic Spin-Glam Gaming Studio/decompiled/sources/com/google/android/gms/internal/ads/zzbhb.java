package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbhb extends zzbev implements zzbhc {
    public zzbhb() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbhc zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzbhc ? (zzbhc) queryLocalInterface : new zzbha(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgz zzbgxVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbgxVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbgxVar = queryLocalInterface instanceof zzbgz ? (zzbgz) queryLocalInterface : new zzbgx(readStrongBinder);
            }
            zzbew.zzh(parcel);
            zza(zzbgxVar);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            zzbew.zzh(parcel);
            zzb(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbew.zzh(parcel);
            zzc(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

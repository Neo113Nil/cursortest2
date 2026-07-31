package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbof extends zzbev implements zzbog {
    public zzbof() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbog zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof zzbog ? (zzbog) queryLocalInterface : new zzboe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbom zzbokVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbokVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzbokVar = queryLocalInterface instanceof zzbom ? (zzbom) queryLocalInterface : new zzbok(readStrongBinder);
        }
        zzbew.zzh(parcel);
        zze(zzbokVar);
        parcel2.writeNoException();
        return true;
    }
}

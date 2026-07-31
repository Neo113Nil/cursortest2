package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbnv extends zzbev implements zzbnw {
    public zzbnv() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbnw zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof zzbnw ? (zzbnw) queryLocalInterface : new zzbnu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbnm zzbnkVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zzbnkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbnkVar = queryLocalInterface instanceof zzbnm ? (zzbnm) queryLocalInterface : new zzbnk(readStrongBinder);
        }
        String readString = parcel.readString();
        zzbew.zzh(parcel);
        zze(zzbnkVar, readString);
        parcel2.writeNoException();
        return true;
    }
}

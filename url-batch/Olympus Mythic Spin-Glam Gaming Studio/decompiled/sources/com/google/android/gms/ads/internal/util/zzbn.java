package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzbn extends zzbev implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzbew.zzh(parcel);
            boolean zze = zze(asInterface, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i == 2) {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbew.zzh(parcel);
            zzf(asInterface2);
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzbew.zzb(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
            zzbew.zzh(parcel);
            boolean zzg = zzg(asInterface3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zzg ? 1 : 0);
        }
        return true;
    }
}

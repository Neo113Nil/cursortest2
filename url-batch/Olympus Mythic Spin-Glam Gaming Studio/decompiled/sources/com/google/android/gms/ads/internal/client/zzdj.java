package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes8.dex */
public abstract class zzdj extends zzbev implements zzdk {
    public zzdj() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zze zzeVar = (zze) zzbew.zzb(parcel, zze.CREATOR);
        zzbew.zzh(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}

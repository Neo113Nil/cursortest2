package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbry extends zzbev implements zzbrz {
    public zzbry() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbew.zzb(parcel, ParcelFileDescriptor.CREATOR);
        zzbew.zzh(parcel);
        zza(parcelFileDescriptor);
        return true;
    }
}

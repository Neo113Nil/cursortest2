package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzccg extends zzbev implements zzcch {
    public zzccg() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zza = zza();
            parcel2.writeNoException();
            parcel2.writeString(zza);
        } else {
            if (i != 2) {
                return false;
            }
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        }
        return true;
    }
}

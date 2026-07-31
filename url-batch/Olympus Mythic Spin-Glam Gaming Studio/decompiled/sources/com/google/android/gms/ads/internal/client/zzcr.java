package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzcr extends zzbev implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze zzeVar = (zze) zzbew.zzb(parcel, zze.CREATOR);
            zzbew.zzh(parcel);
            zza(zzeVar);
        } else if (i == 2) {
            zzb();
        } else if (i == 3) {
            zzc();
        } else if (i == 4) {
            zzd();
        } else {
            if (i != 5) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}

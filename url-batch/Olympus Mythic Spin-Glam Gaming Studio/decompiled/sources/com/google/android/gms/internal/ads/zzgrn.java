package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzgrn extends zzbev implements zzgro {
    public zzgrn() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
            zzbew.zzh(parcel);
            zza(bundle);
        } else {
            if (i != 2) {
                return false;
            }
            zzbew.zza(parcel);
            zzbew.zza(parcel);
            zzbew.zzh(parcel);
        }
        return true;
    }
}

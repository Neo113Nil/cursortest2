package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public abstract class zzef extends zzaya implements zzeg {
    public zzef() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze();
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzg();
        } else if (i == 4) {
            zzh();
        } else {
            if (i != 5) {
                return false;
            }
            boolean zza = zzayb.zza(parcel);
            zzayb.zzh(parcel);
            zzi(zza);
        }
        parcel2.writeNoException();
        return true;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbqp extends zzaya implements zzbqq {
    public zzbqp() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbpm zzb = zzbpl.zzb(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zze(zzb);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzayb.zzh(parcel);
            zzf(readString);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayb.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}

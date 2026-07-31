package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcdf extends zzbeu implements zzcdh {
    zzcdf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zze() throws RemoteException {
        zzdb(1, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzf(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(3, zzcZ);
    }
}

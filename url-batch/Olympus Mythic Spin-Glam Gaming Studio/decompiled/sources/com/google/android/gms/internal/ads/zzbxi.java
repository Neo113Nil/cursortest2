package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbxi extends zzbeu implements zzbxk {
    zzbxi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zze() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzf(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString("Adapter returned null.");
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzeVar);
        zzdb(4, zzcZ);
    }
}

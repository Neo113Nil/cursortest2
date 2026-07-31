package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcez extends zzbeu implements zzcfb {
    zzcez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zza(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzb(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzcZ.writeString(str2);
        zzbew.zzc(zzcZ, bundle);
        zzdb(3, zzcZ);
    }
}

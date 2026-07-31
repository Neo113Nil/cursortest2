package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbjz extends zzbeu implements zzbkb {
    zzbjz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zze(zzbjy zzbjyVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbjyVar);
        zzdb(1, zzcZ);
    }
}

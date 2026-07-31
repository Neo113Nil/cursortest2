package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbnu extends zzbeu implements zzbnw {
    zzbnu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zze(zzbnm zzbnmVar, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbnmVar);
        zzcZ.writeString(str);
        zzdb(1, zzcZ);
    }
}

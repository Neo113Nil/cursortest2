package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbsg extends zzarz implements zzbsi {
    zzbsg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzf() throws RemoteException {
        zzbl(1, zza());
    }
}

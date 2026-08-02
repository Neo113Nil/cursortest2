package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbnq extends zzarz implements zzbns {
    zzbnq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zze(zzbob zzbobVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzbobVar);
        zzbl(1, zza);
    }
}

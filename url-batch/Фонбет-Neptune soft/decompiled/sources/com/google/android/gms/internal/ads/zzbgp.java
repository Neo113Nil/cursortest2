package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbgp extends zzaxm implements zzbgr {
    zzbgp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zze(zzbha zzbhaVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbhaVar);
        zzdc(1, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbcp extends zzaxm implements zzbcr {
    zzbcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbcr
    public final void zze(zzbco zzbcoVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbcoVar);
        zzdc(1, zza);
    }
}

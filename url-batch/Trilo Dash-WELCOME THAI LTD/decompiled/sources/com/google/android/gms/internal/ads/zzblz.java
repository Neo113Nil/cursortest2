package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzblz extends zzaqv implements zzbmb {
    zzblz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void zze(zzblr zzblrVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzblrVar);
        zzbl(1, zza);
    }
}

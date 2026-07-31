package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbdb extends zzaxz implements zzbdd {
    zzbdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdd
    public final void zze(zzbda zzbdaVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbdaVar);
        zzdf(1, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzblw extends zzaqv implements zzbly {
    zzblw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zze(zzblp zzblpVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzblpVar);
        zzbl(1, zza);
    }
}

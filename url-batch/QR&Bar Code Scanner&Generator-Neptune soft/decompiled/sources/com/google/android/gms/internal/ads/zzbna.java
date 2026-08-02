package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbna extends zzarz implements zzbnc {
    zzbna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zze(zzbmt zzbmtVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzbmtVar);
        zzbl(1, zza);
    }
}

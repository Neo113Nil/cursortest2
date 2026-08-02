package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbnd extends zzarz implements zzbnf {
    zzbnd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zze(zzbmv zzbmvVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzbmvVar);
        zzbl(1, zza);
    }
}

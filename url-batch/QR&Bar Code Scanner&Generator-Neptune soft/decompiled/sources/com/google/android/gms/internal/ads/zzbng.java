package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbng extends zzarz implements zzbni {
    zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zze(zzbmy zzbmyVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzbmyVar);
        zza.writeString(str);
        zzbl(1, zza);
    }
}

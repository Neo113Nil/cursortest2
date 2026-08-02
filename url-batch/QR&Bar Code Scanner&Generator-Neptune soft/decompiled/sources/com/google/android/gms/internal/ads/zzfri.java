package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfri extends zzarz implements zzfrk {
    zzfri(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final void zze(Bundle bundle, zzfrm zzfrmVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, bundle);
        zzasb.zzg(zza, zzfrmVar);
        zzbm(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final void zzf(String str, Bundle bundle, zzfrm zzfrmVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasb.zze(zza, bundle);
        zzasb.zzg(zza, zzfrmVar);
        zzbm(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final void zzg(Bundle bundle, zzfrm zzfrmVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, bundle);
        zzasb.zzg(zza, zzfrmVar);
        zzbm(3, zza);
    }
}

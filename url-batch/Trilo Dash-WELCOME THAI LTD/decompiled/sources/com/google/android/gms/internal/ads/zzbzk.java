package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbzk extends zzaqv implements zzbzm {
    zzbzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zze(zzbzu zzbzuVar, zzbzq zzbzqVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbzuVar);
        zzaqx.zzg(zza, zzbzqVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzf(zzbzu zzbzuVar, zzbzq zzbzqVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbzuVar);
        zzaqx.zzg(zza, zzbzqVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzg(zzbzu zzbzuVar, zzbzq zzbzqVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbzuVar);
        zzaqx.zzg(zza, zzbzqVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzh(String str, zzbzq zzbzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqx.zzg(zza, zzbzqVar);
        zzbl(7, zza);
    }
}

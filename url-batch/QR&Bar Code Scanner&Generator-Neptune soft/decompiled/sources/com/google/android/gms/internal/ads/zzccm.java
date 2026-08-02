package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzccm extends zzarz implements zzcco {
    zzccm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcco
    public final void zze() throws RemoteException {
        zzbl(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcco
    public final void zzf() throws RemoteException {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcco
    public final void zzg() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcco
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcco
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzeVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcco
    public final void zzj() throws RemoteException {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcco
    public final void zzk(zzcci zzcciVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzcciVar);
        zzbl(3, zza);
    }
}

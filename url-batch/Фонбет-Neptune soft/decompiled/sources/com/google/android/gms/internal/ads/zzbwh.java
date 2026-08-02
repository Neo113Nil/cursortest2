package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbwh extends zzaxm implements zzbwj {
    zzbwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zze() throws RemoteException {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzf() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzg() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdc(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzj() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzk(zzbwd zzbwdVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, zzbwdVar);
        zzdc(3, zza);
    }
}

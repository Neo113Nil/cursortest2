package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbcd extends zzaqv implements zzbcf {
    zzbcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final com.google.android.gms.ads.internal.client.zzbs zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final com.google.android.gms.ads.internal.client.zzdh zzf() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        com.google.android.gms.ads.internal.client.zzdh zzb = com.google.android.gms.ads.internal.client.zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzd(zza, z);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzdeVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzi(IObjectWrapper iObjectWrapper, zzbcm zzbcmVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbcmVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzj(zzbcj zzbcjVar) throws RemoteException {
        throw null;
    }
}

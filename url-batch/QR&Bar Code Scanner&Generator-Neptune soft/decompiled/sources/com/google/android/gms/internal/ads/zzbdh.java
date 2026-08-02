package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbdh extends zzarz implements zzbdj {
    zzbdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final com.google.android.gms.ads.internal.client.zzbs zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final com.google.android.gms.ads.internal.client.zzdh zzf() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        com.google.android.gms.ads.internal.client.zzdh zzb = com.google.android.gms.ads.internal.client.zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzd(zza, z);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzdeVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzi(IObjectWrapper iObjectWrapper, zzbdq zzbdqVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbdqVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbdj
    public final void zzj(zzbdn zzbdnVar) throws RemoteException {
        throw null;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcas extends zzarz implements zzcau {
    zzcas(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(zzcbc zzcbcVar, zzcay zzcayVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzcbcVar);
        zzasb.zzg(zza, zzcayVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(zzcbc zzcbcVar, zzcay zzcayVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzcbcVar);
        zzasb.zzg(zza, zzcayVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg(zzcbc zzcbcVar, zzcay zzcayVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzcbcVar);
        zzasb.zzg(zza, zzcayVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzh(String str, zzcay zzcayVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasb.zzg(zza, zzcayVar);
        zzbl(7, zza);
    }
}

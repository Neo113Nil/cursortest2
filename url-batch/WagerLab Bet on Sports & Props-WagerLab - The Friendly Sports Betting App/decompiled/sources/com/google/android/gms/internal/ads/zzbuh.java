package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbuh extends zzaxz implements zzbuj {
    zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(zzbuv zzbuvVar, zzbun zzbunVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbuvVar);
        zzayb.zze(zza, zzbunVar);
        zzdf(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(zzbuv zzbuvVar, zzbun zzbunVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbuvVar);
        zzayb.zze(zza, zzbunVar);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzg(zzbuv zzbuvVar, zzbun zzbunVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbuvVar);
        zzayb.zze(zza, zzbunVar);
        zzdf(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzh(String str, zzbun zzbunVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayb.zze(zza, zzbunVar);
        zzdf(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzi(zzbuf zzbufVar, zzbuo zzbuoVar) throws RemoteException {
        throw null;
    }
}

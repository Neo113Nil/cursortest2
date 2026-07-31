package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzccy extends zzbeu implements zzcda {
    zzccy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zza(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, zzcdhVar);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzmVar);
        zzbew.zze(zzcZ, zzcdhVar);
        zzdb(14, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzd(zzcdd zzcddVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzcddVar);
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zze(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzdnVar);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final Bundle zzf() throws RemoteException {
        Parcel zzda = zzda(9, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzg(zzcdo zzcdoVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzcdoVar);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final boolean zzh() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzj(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final zzccx zzk() throws RemoteException {
        zzccx zzccvVar;
        Parcel zzda = zzda(11, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzccvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzccvVar = queryLocalInterface instanceof zzccx ? (zzccx) queryLocalInterface : new zzccv(readStrongBinder);
        }
        zzda.recycle();
        return zzccvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final com.google.android.gms.ads.internal.client.zzdx zzl() throws RemoteException {
        Parcel zzda = zzda(12, zzcZ());
        com.google.android.gms.ads.internal.client.zzdx zza = com.google.android.gms.ads.internal.client.zzdw.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzm() throws RemoteException {
        Parcel zzda = zzda(16, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzn(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzdqVar);
        zzdb(13, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzo(boolean z) throws RemoteException {
        Parcel zzcZ = zzcZ();
        int i = zzbew.zza;
        zzcZ.writeInt(z ? 1 : 0);
        zzdb(15, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final long zzp() throws RemoteException {
        Parcel zzda = zzda(17, zzcZ());
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzq(long j) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeLong(j);
        zzdb(18, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzr(zzcdi zzcdiVar) throws RemoteException {
        throw null;
    }
}

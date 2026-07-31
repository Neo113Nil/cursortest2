package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbgx extends zzbeu implements zzbgz {
    zzbgx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzf(IObjectWrapper iObjectWrapper, zzbhg zzbhgVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbhgVar);
        zzdb(4, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        com.google.android.gms.ads.internal.client.zzdx zza = com.google.android.gms.ads.internal.client.zzdw.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzh(boolean z) throws RemoteException {
        Parcel zzcZ = zzcZ();
        int i = zzbew.zza;
        zzcZ.writeInt(z ? 1 : 0);
        zzdb(6, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzdqVar);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zzj() throws RemoteException {
        Parcel zzda = zzda(8, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final long zzk() throws RemoteException {
        Parcel zzda = zzda(9, zzcZ());
        long readLong = zzda.readLong();
        zzda.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final void zzl(long j) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeLong(j);
        zzdb(10, zzcZ);
    }
}

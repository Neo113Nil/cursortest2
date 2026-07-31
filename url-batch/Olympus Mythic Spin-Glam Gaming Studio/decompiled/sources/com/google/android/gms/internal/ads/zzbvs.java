package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbvs extends zzbeu implements zzbvu {
    zzbvs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbvx zza(String str) throws RemoteException {
        zzbvx zzbvvVar;
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(1, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbvvVar = queryLocalInterface instanceof zzbvx ? (zzbvx) queryLocalInterface : new zzbvv(readStrongBinder);
        }
        zzda.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzb(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(2, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzc(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(4, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbxt zzd(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(3, zzcZ);
        zzbxt zza = zzbxs.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbov extends zzaxz implements zzbox {
    zzbov(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbpa zzb(String str) throws RemoteException {
        zzbpa zzboyVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(1, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzboyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzboyVar = queryLocalInterface instanceof zzbpa ? (zzbpa) queryLocalInterface : new zzboy(readStrongBinder);
        }
        zzde.recycle();
        return zzboyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(2, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(4, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbqw zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(3, zza);
        zzbqw zzb = zzbqv.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }
}

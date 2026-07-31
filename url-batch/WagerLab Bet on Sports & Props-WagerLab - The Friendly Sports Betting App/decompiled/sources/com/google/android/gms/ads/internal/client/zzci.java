package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwa;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzci extends zzaxz implements zzck {
    zzci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zze(List list, zzce zzceVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayb.zze(zza, zzceVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(2, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbwa zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(3, zza);
        zzbwa zzt = zzbvz.zzt(zzde.readStrongBinder());
        zzde.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(4, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbab zzi(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(5, zza);
        zzbab zzb = zzbaa.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(6, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzk(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(7, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzde.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzl(zzbox zzboxVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzboxVar);
        zzdf(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzm(String str, zzft zzftVar, zzch zzchVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayb.zzc(zza, zzftVar);
        zzayb.zze(zza, zzchVar);
        Parcel zzde = zzde(9, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzn(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzde = zzde(10, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzo(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(11, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = queryLocalInterface instanceof zzbx ? (zzbx) queryLocalInterface : new zzbv(readStrongBinder);
        }
        zzde.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbab zzp(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(12, zza);
        zzbab zzb = zzbaa.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbwa zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(13, zza);
        zzbwa zzt = zzbvz.zzt(zzde.readStrongBinder());
        zzde.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzft zzr(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzde = zzde(14, zza);
        zzft zzftVar = (zzft) zzayb.zzb(zzde, zzft.CREATOR);
        zzde.recycle();
        return zzftVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzs(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        Parcel zzde = zzde(15, zza);
        Bundle bundle = (Bundle) zzayb.zzb(zzde, Bundle.CREATOR);
        zzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zzt(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzde = zzde(16, zza);
        int readInt = zzde.readInt();
        zzde.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        Parcel zzde = zzde(17, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzv(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdf(18, zza);
    }
}

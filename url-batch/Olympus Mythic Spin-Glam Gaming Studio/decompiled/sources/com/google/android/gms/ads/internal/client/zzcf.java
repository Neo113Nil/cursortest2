package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcda;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcf extends zzbeu implements zzch {
    zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(List list, zzcb zzcbVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeTypedList(list);
        zzbew.zze(zzcZ, zzcbVar);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(2, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcda zzg(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(3, zzcZ);
        zzcda zzs = zzccz.zzs(zzda.readStrongBinder());
        zzda.recycle();
        return zzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(4, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgz zzi(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(5, zzcZ);
        zzbgz zza = zzbgy.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(6, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzk(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(7, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzda.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(zzbvu zzbvuVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbvuVar);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzbew.zzc(zzcZ, zzfpVar);
        zzbew.zze(zzcZ, zzceVar);
        Parcel zzda = zzda(9, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzcZ.writeString(str);
        Parcel zzda = zzda(10, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzo(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(11, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzda.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgz zzp(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(12, zzcZ);
        zzbgz zza = zzbgy.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcda zzq(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(13, zzcZ);
        zzcda zzs = zzccz.zzs(zzda.readStrongBinder());
        zzda.recycle();
        return zzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzcZ.writeString(str);
        Parcel zzda = zzda(14, zzcZ);
        zzfp zzfpVar = (zzfp) zzbew.zzb(zzda, zzfp.CREATOR);
        zzda.recycle();
        return zzfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        Parcel zzda = zzda(15, zzcZ);
        Bundle bundle = (Bundle) zzbew.zzb(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzcZ.writeString(str);
        Parcel zzda = zzda(16, zzcZ);
        int readInt = zzda.readInt();
        zzda.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzcZ.writeString(str);
        Parcel zzda = zzda(17, zzcZ);
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(18, zzcZ);
    }
}

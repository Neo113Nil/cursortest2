package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcm extends zzbeu implements zzco {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zza(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzrVar);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(1, zzcZ);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzrVar);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(2, zzcZ);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzc(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(3, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzda.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmz zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, iObjectWrapper2);
        Parcel zzda = zzda(5, zzcZ);
        zzbmz zzdG = zzbmy.zzdG(zzda.readStrongBinder());
        zzda.recycle();
        return zzdG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcck zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzt zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        Parcel zzda = zzda(8, zzcZ);
        zzbzt zzH = zzbzs.zzH(zzda.readStrongBinder());
        zzda.recycle();
        return zzH;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzg(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        zzch zzcfVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(18, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzcfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(readStrongBinder);
        }
        zzda.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzh(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcy zzcwVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(9, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzcwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcwVar = queryLocalInterface instanceof zzcy ? (zzcy) queryLocalInterface : new zzcw(readStrongBinder);
        }
        zzda.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzi(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbne zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcda zzk(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(12, zzcZ);
        zzcda zzs = zzccz.zzs(zzda.readStrongBinder());
        zzda.recycle();
        return zzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzl(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvu zzbvuVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzrVar);
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(13, zzcZ);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcfe zzm(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(14, zzcZ);
        zzcfe zza = zzcfd.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzm zzn(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(15, zzcZ);
        zzbzm zza = zzbzl.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbrl zzo(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i, zzbri zzbriVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbew.zze(zzcZ, zzbriVar);
        Parcel zzda = zzda(16, zzcZ);
        zzbrl zza = zzbrk.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzp(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, zzbvuVar);
        zzcZ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzda = zzda(17, zzcZ);
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
        }
        zzda.recycle();
        return zzdrVar;
    }
}

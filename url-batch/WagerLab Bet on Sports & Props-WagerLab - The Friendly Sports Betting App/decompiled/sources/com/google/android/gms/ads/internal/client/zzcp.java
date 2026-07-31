package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbye;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzcp extends zzaxz implements zzcr {
    zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzb(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbox zzboxVar, int i) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzrVar);
        zza.writeString(str);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(1, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzc(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbox zzboxVar, int i) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzrVar);
        zza.writeString(str);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(2, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbt zzd(IObjectWrapper iObjectWrapper, String str, zzbox zzboxVar, int i) throws RemoteException {
        zzbt zzbrVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(3, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbrVar = queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbr(readStrongBinder);
        }
        zzde.recycle();
        return zzbrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbga zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, iObjectWrapper2);
        Parcel zzde = zzde(5, zza);
        zzbga zzdK = zzbfz.zzdK(zzde.readStrongBinder());
        zzde.recycle();
        return zzdK;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbvk zzf(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbsw zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        Parcel zzde = zzde(8, zza);
        zzbsw zzI = zzbsv.zzI(zzde.readStrongBinder());
        zzde.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzck zzh(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        zzck zzciVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(18, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzciVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzciVar = queryLocalInterface instanceof zzck ? (zzck) queryLocalInterface : new zzci(readStrongBinder);
        }
        zzde.recycle();
        return zzciVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdb zzi(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzdb zzczVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(9, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzczVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzczVar = queryLocalInterface instanceof zzdb ? (zzdb) queryLocalInterface : new zzcz(readStrongBinder);
        }
        zzde.recycle();
        return zzczVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzj(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzrVar);
        zza.writeString(str);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(10, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbgg zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, iObjectWrapper2);
        zzayb.zze(zza, iObjectWrapper3);
        Parcel zzde = zzde(11, zza);
        zzbgg zze = zzbgf.zze(zzde.readStrongBinder());
        zzde.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbwa zzl(IObjectWrapper iObjectWrapper, String str, zzbox zzboxVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(12, zza);
        zzbwa zzt = zzbvz.zzt(zzde.readStrongBinder());
        zzde.recycle();
        return zzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzm(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbox zzboxVar, int i) throws RemoteException {
        zzbx zzbvVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzrVar);
        zza.writeString(str);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(13, zza);
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

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbye zzn(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(14, zza);
        zzbye zzb = zzbyd.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbsp zzo(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(15, zza);
        zzbsp zzb = zzbso.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbko zzp(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i, zzbkl zzbklVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzayb.zze(zza, zzbklVar);
        Parcel zzde = zzde(16, zza);
        zzbko zzb = zzbkn.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdw zzq(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i) throws RemoteException {
        zzdw zzduVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzde = zzde(17, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzduVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzduVar = queryLocalInterface instanceof zzdw ? (zzdw) queryLocalInterface : new zzdu(readStrongBinder);
        }
        zzde.recycle();
        return zzduVar;
    }
}

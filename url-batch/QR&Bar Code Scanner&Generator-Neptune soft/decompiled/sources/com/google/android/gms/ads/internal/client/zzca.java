package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqt;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public final class zzca extends zzarz implements zzcc {
    zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbvk zzbvkVar, int i) throws RemoteException {
        zzbo zzbmVar;
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(3, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbmVar = queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(readStrongBinder);
        }
        zzbk.recycle();
        return zzbmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvk zzbvkVar, int i) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzqVar);
        zza.writeString(str);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(13, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvk zzbvkVar, int i) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzqVar);
        zza.writeString(str);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvk zzbvkVar, int i) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzqVar);
        zza.writeString(str);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(10, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcm zzckVar;
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(9, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzckVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzckVar = queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(readStrongBinder);
        }
        zzbk.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbmi zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, iObjectWrapper2);
        Parcel zzbk = zzbk(5, zza);
        zzbmi zzbB = zzbmh.zzbB(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzbB;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbmo zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, iObjectWrapper2);
        zzasb.zzg(zza, iObjectWrapper3);
        Parcel zzbk = zzbk(11, zza);
        zzbmo zze = zzbmn.zze(zzbk.readStrongBinder());
        zzbk.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbqu zzj(IObjectWrapper iObjectWrapper, zzbvk zzbvkVar, int i, zzbqr zzbqrVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        zzasb.zzg(zza, zzbqrVar);
        Parcel zzbk = zzbk(16, zza);
        zzbqu zzb = zzbqt.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbyv zzk(IObjectWrapper iObjectWrapper, zzbvk zzbvkVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(15, zza);
        zzbyv zzb = zzbyu.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbzc zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(8, zza);
        zzbzc zzF = zzbzb.zzF(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbv zzm(IObjectWrapper iObjectWrapper, zzbvk zzbvkVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzccl zzn(IObjectWrapper iObjectWrapper, String str, zzbvk zzbvkVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(12, zza);
        zzccl zzq = zzcck.zzq(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcfg zzo(IObjectWrapper iObjectWrapper, zzbvk zzbvkVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(14, zza);
        zzcfg zzb = zzcff.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }
}

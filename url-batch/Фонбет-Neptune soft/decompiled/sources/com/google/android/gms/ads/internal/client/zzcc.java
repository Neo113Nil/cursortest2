package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbjy;
import com.google.android.gms.internal.ads.zzbjz;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzbym;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzcc extends zzaxm implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbom zzbomVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(3, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzdb.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbom zzbomVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzqVar);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(13, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbom zzbomVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzqVar);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(1, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbom zzbomVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzqVar);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(2, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(10, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        zzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(9, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        zzdb.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(17, zza);
        IBinder readStrongBinder = zzdb.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        zzdb.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfh zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, iObjectWrapper2);
        Parcel zzdb = zzdb(5, zza);
        zzbfh zzdA = zzbfg.zzdA(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzdA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfn zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, iObjectWrapper2);
        zzaxo.zzf(zza, iObjectWrapper3);
        Parcel zzdb = zzdb(11, zza);
        zzbfn zze = zzbfm.zze(zzdb.readStrongBinder());
        zzdb.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjz zzk(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i, zzbjw zzbjwVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        zzaxo.zzf(zza, zzbjwVar);
        Parcel zzdb = zzdb(16, zza);
        zzbjz zzb = zzbjy.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsg zzl(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(15, zza);
        zzbsg zzb = zzbsf.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsn zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        Parcel zzdb = zzdb(8, zza);
        zzbsn zzI = zzbsm.zzI(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvq zzn(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbwg zzo(IObjectWrapper iObjectWrapper, String str, zzbom zzbomVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(12, zza);
        zzbwg zzq = zzbwf.zzq(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbym zzp(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbomVar);
        zza.writeInt(242402000);
        Parcel zzdb = zzdb(14, zza);
        zzbym zzb = zzbyl.zzb(zzdb.readStrongBinder());
        zzdb.recycle();
        return zzb;
    }
}

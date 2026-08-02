package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbvl extends zzarz implements zzbvn {
    zzbvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzA(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzB(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzlVar);
        zza.writeString(str);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzD() throws RemoteException {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzE() throws RemoteException {
        zzbl(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzF(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzd(zza, z);
        zzbl(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzG() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzbl(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzI(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzbl(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzJ() throws RemoteException {
        zzbl(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final boolean zzK() throws RemoteException {
        Parcel zzbk = zzbk(22, zza());
        boolean zzh = zzasb.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final boolean zzL() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzasb.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final zzbvv zzM() throws RemoteException {
        zzbvv zzbvvVar;
        Parcel zzbk = zzbk(15, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbvvVar = queryLocalInterface instanceof zzbvv ? (zzbvv) queryLocalInterface : new zzbvv(readStrongBinder);
        }
        zzbk.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final zzbvw zzN() throws RemoteException {
        zzbvw zzbvwVar;
        Parcel zzbk = zzbk(16, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbvwVar = queryLocalInterface instanceof zzbvw ? (zzbvw) queryLocalInterface : new zzbvw(readStrongBinder);
        }
        zzbk.recycle();
        return zzbvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final com.google.android.gms.ads.internal.client.zzdk zzh() throws RemoteException {
        Parcel zzbk = zzbk(26, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final zzbmy zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final zzbvt zzj() throws RemoteException {
        zzbvt zzbvrVar;
        Parcel zzbk = zzbk(36, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbvrVar = queryLocalInterface instanceof zzbvt ? (zzbvt) queryLocalInterface : new zzbvr(readStrongBinder);
        }
        zzbk.recycle();
        return zzbvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final zzbvz zzk() throws RemoteException {
        zzbvz zzbvxVar;
        Parcel zzbk = zzbk(27, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbvxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbvxVar = queryLocalInterface instanceof zzbvz ? (zzbvz) queryLocalInterface : new zzbvx(readStrongBinder);
        }
        zzbk.recycle();
        return zzbvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final zzbxq zzl() throws RemoteException {
        Parcel zzbk = zzbk(33, zza());
        zzbxq zzbxqVar = (zzbxq) zzasb.zza(zzbk, zzbxq.CREATOR);
        zzbk.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final zzbxq zzm() throws RemoteException {
        Parcel zzbk = zzbk(34, zza());
        zzbxq zzbxqVar = (zzbxq) zzasb.zza(zzbk, zzbxq.CREATOR);
        zzbk.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzo() throws RemoteException {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzccd zzccdVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzlVar);
        zza.writeString(null);
        zzasb.zzg(zza, zzccdVar);
        zza.writeString(str2);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzq(IObjectWrapper iObjectWrapper, zzbru zzbruVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbruVar);
        zza.writeTypedList(list);
        zzbl(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzr(IObjectWrapper iObjectWrapper, zzccd zzccdVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzccdVar);
        zza.writeStringList(list);
        zzbl(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzlVar);
        zza.writeString(str);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvq zzbvqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzqVar);
        zzasb.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzqVar);
        zzasb.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvq zzbvqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvq zzbvqVar, zzbls zzblsVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zzg(zza, zzbvqVar);
        zzasb.zze(zza, zzblsVar);
        zza.writeStringList(list);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzlVar);
        zza.writeString(str);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(28, zza);
    }
}

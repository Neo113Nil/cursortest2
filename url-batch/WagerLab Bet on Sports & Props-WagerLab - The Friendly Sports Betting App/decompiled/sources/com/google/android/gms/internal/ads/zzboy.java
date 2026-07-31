package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzboy extends zzaxz implements zzbpa {
    zzboy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzA(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayb.zza;
        zza.writeInt(z ? 1 : 0);
        zzdf(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final com.google.android.gms.ads.internal.client.zzed zzB() throws RemoteException {
        Parcel zzde = zzde(26, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpm zzC() throws RemoteException {
        zzbpm zzbpkVar;
        Parcel zzde = zzde(27, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbpkVar = queryLocalInterface instanceof zzbpm ? (zzbpm) queryLocalInterface : new zzbpk(readStrongBinder);
        }
        zzde.recycle();
        return zzbpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzmVar);
        zza.writeString(str);
        zzayb.zze(zza, zzbpdVar);
        zzdf(28, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzF(IObjectWrapper iObjectWrapper, zzblo zzbloVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbloVar);
        zza.writeTypedList(list);
        zzdf(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzmVar);
        zza.writeString(str);
        zzayb.zze(zza, zzbpdVar);
        zzdf(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrl zzH() throws RemoteException {
        Parcel zzde = zzde(33, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(zzde, zzbrl.CREATOR);
        zzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrl zzI() throws RemoteException {
        Parcel zzde = zzde(34, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(zzde, zzbrl.CREATOR);
        zzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzrVar);
        zzayb.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zze(zza, zzbpdVar);
        zzdf(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpg zzK() throws RemoteException {
        zzbpg zzbpeVar;
        Parcel zzde = zzde(36, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpeVar = queryLocalInterface instanceof zzbpg ? (zzbpg) queryLocalInterface : new zzbpe(readStrongBinder);
        }
        zzde.recycle();
        return zzbpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzmVar);
        zza.writeString(str);
        zzayb.zze(zza, zzbpdVar);
        zzdf(38, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(39, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpi zzO() throws RemoteException {
        zzbpi zzbpiVar;
        Parcel zzde = zzde(15, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbpiVar = queryLocalInterface instanceof zzbpi ? (zzbpi) queryLocalInterface : new zzbpi(readStrongBinder);
        }
        zzde.recycle();
        return zzbpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpj zzP() throws RemoteException {
        zzbpj zzbpjVar;
        Parcel zzde = zzde(16, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbpjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpjVar = queryLocalInterface instanceof zzbpj ? (zzbpj) queryLocalInterface : new zzbpj(readStrongBinder);
        }
        zzde.recycle();
        return zzbpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpd zzbpdVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzh() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzi() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzrVar);
        zzayb.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zze(zza, zzbpdVar);
        zzdf(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zze(zza, zzbpdVar);
        zzdf(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzl() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzm() throws RemoteException {
        zzdf(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvs zzbvsVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzmVar);
        zza.writeString(null);
        zzayb.zze(zza, zzbvsVar);
        zza.writeString(str2);
        zzdf(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzmVar);
        zza.writeString(str);
        zzdf(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzp() throws RemoteException {
        zzdf(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzq() throws RemoteException {
        Parcel zzde = zzde(13, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpd zzbpdVar, zzbfl zzbflVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zze(zza, zzbpdVar);
        zzayb.zzc(zza, zzbflVar);
        zza.writeStringList(list);
        zzdf(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzx() throws RemoteException {
        Parcel zzde = zzde(22, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzy(IObjectWrapper iObjectWrapper, zzbvs zzbvsVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbvsVar);
        zza.writeStringList(list);
        zzdf(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbgq zzz() throws RemoteException {
        throw null;
    }
}

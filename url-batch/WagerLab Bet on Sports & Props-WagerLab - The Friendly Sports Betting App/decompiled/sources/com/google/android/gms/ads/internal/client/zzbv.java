package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbvn;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzbv extends zzaxz implements zzbx {
    zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzA() throws RemoteException {
        Parcel zzde = zzde(46, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzB() throws RemoteException {
        Parcel zzde = zzde(23, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbvn zzbvnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzed zzF() throws RemoteException {
        zzed zzebVar;
        Parcel zzde = zzde(26, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzebVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzebVar = queryLocalInterface instanceof zzed ? (zzed) queryLocalInterface : new zzeb(readStrongBinder);
        }
        zzde.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(zzga zzgaVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzgaVar);
        zzdf(29, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzeh zzehVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbae zzbaeVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbaeVar);
        zzdf(40, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayb.zza;
        zza.writeInt(z ? 1 : 0);
        zzdf(34, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(zzdt zzdtVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzdtVar);
        zzdf(42, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzm zzmVar, zzbn zzbnVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, zzbnVar);
        zzdf(43, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(44, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzcv zzcvVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzcvVar);
        zzdf(45, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzdf(48, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final long zzU() throws RemoteException {
        Parcel zzde = zzde(47, zza());
        long readLong = zzde.readLong();
        zzde.recycle();
        return readLong;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzY(zzcs zzcsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel zzde = zzde(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzc() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdW(zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbkVar);
        zzdf(7, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zze(zzm zzmVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzmVar);
        Parcel zzde = zzde(4, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzf() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzg() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(zzco zzcoVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzcoVar);
        zzdf(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(zzcb zzcbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzm() throws RemoteException {
        zzdf(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzr zzn() throws RemoteException {
        Parcel zzde = zzde(12, zza());
        zzr zzrVar = (zzr) zzayb.zzb(zzde, zzr.CREATOR);
        zzde.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzo(zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzrVar);
        zzdf(13, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbtf zzbtfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbti zzbtiVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzea zzt() throws RemoteException {
        zzea zzdyVar;
        Parcel zzde = zzde(41, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdyVar = queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(readStrongBinder);
        }
        zzde.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzu() throws RemoteException {
        Parcel zzde = zzde(31, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzco zzv() throws RemoteException {
        zzco zzcmVar;
        Parcel zzde = zzde(32, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        zzde.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzbk zzw() throws RemoteException {
        zzbk zzbiVar;
        Parcel zzde = zzde(33, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbiVar = queryLocalInterface instanceof zzbk ? (zzbk) queryLocalInterface : new zzbi(readStrongBinder);
        }
        zzde.recycle();
        return zzbiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx(zzbdd zzbddVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(zzbh zzbhVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbhVar);
        zzdf(20, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayb.zza;
        zza.writeInt(z ? 1 : 0);
        zzdf(22, zza);
    }
}

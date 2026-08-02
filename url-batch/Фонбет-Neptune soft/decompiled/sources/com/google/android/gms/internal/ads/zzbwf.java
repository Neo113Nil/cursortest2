package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbwf extends zzaxn implements zzbwg {
    public zzbwf() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwg zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbwg ? (zzbwg) queryLocalInterface : new zzbwe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbwn zzbwnVar = null;
        zzbwn zzbwnVar2 = null;
        zzbwo zzbwoVar = null;
        zzbwj zzbwjVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwnVar = queryLocalInterface instanceof zzbwn ? (zzbwn) queryLocalInterface : new zzbwl(readStrongBinder);
                }
                zzaxo.zzc(parcel);
                zzf(zzlVar, zzbwnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwjVar = queryLocalInterface2 instanceof zzbwj ? (zzbwj) queryLocalInterface2 : new zzbwh(readStrongBinder2);
                }
                zzaxo.zzc(parcel);
                zzk(zzbwjVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                int i3 = zzaxo.zza;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwoVar = queryLocalInterface3 instanceof zzbwo ? (zzbwo) queryLocalInterface3 : new zzbwo(readStrongBinder3);
                }
                zzaxo.zzc(parcel);
                zzp(zzbwoVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbwu zzbwuVar = (zzbwu) zzaxo.zza(parcel, zzbwu.CREATOR);
                zzaxo.zzc(parcel);
                zzl(zzbwuVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdd zzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzaxo.zze(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzg = zzaxo.zzg(parcel);
                zzaxo.zzc(parcel);
                zzn(asInterface2, zzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwd zzd = zzd();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdn zzc = zzc();
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg zzb3 = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzaxo.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwnVar2 = queryLocalInterface4 instanceof zzbwn ? (zzbwn) queryLocalInterface4 : new zzbwl(readStrongBinder4);
                }
                zzaxo.zzc(parcel);
                zzg(zzlVar2, zzbwnVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzg2 = zzaxo.zzg(parcel);
                zzaxo.zzc(parcel);
                zzh(zzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

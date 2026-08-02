package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzcck extends zzasa implements zzccl {
    public zzcck() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzccl zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzccl ? (zzccl) queryLocalInterface : new zzccj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzccs zzccsVar = null;
        zzccs zzccsVar2 = null;
        zzcct zzcctVar = null;
        zzcco zzccoVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccsVar = queryLocalInterface instanceof zzccs ? (zzccs) queryLocalInterface : new zzccq(readStrongBinder);
                }
                zzasb.zzc(parcel);
                zzf(zzlVar, zzccsVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzccoVar = queryLocalInterface2 instanceof zzcco ? (zzcco) queryLocalInterface2 : new zzccm(readStrongBinder2);
                }
                zzasb.zzc(parcel);
                zzk(zzccoVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                zzasb.zzd(parcel2, zzo);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzm(asInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcctVar = queryLocalInterface3 instanceof zzcct ? (zzcct) queryLocalInterface3 : new zzcct(readStrongBinder3);
                }
                zzasb.zzc(parcel);
                zzp(zzcctVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzccz zzcczVar = (zzccz) zzasb.zza(parcel, zzccz.CREATOR);
                zzasb.zzc(parcel);
                zzl(zzcczVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdb zzb = com.google.android.gms.ads.internal.client.zzda.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                zzasb.zzf(parcel2, zzb2);
                return true;
            case 10:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzh = zzasb.zzh(parcel);
                zzasb.zzc(parcel);
                zzn(asInterface2, zzh);
                parcel2.writeNoException();
                return true;
            case 11:
                zzcci zzd = zzd();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdh zzc = zzc();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzde zzb3 = com.google.android.gms.ads.internal.client.zzdd.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccsVar2 = queryLocalInterface4 instanceof zzccs ? (zzccs) queryLocalInterface4 : new zzccq(readStrongBinder4);
                }
                zzasb.zzc(parcel);
                zzg(zzlVar2, zzccsVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zzh2 = zzasb.zzh(parcel);
                zzasb.zzc(parcel);
                zzh(zzh2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

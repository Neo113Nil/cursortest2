package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzccj extends zzbev implements zzcck {
    public zzccj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzcco zzccoVar = (zzcco) zzbew.zzb(parcel, zzcco.CREATOR);
            zzbew.zzh(parcel);
            zza(zzccoVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            zzccn zzccnVar = null;
            zzcci zzcciVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzccnVar = queryLocalInterface instanceof zzccn ? (zzccn) queryLocalInterface : new zzccl(readStrongBinder);
                }
                zzbew.zzh(parcel);
                zzc(zzccnVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zzd = zzd();
                        parcel2.writeNoException();
                        int i3 = zzbew.zza;
                        parcel2.writeInt(zzd ? 1 : 0);
                        break;
                    case 6:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzh(asInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzi(asInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzj(asInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String zzk = zzk();
                        parcel2.writeNoException();
                        parcel2.writeString(zzk);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zzbew.zzh(parcel);
                        zzl(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzby zza = com.google.android.gms.ads.internal.client.zzbx.zza(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzm(zza);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle zzn = zzn();
                        parcel2.writeNoException();
                        zzbew.zzd(parcel2, zzn);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcciVar = queryLocalInterface2 instanceof zzcci ? (zzcci) queryLocalInterface2 : new zzcci(readStrongBinder2);
                        }
                        zzbew.zzh(parcel);
                        zzt(zzcciVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzbew.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbew.zzh(parcel);
                        zzo(asInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zzbew.zzh(parcel);
                        zzp(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zzr = zzr();
                        parcel2.writeNoException();
                        int i4 = zzbew.zza;
                        parcel2.writeInt(zzr ? 1 : 0);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdx zzs = zzs();
                        parcel2.writeNoException();
                        zzbew.zze(parcel2, zzs);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zza2 = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzq(zza2);
                parcel2.writeNoException();
            }
        } else {
            zzb();
            parcel2.writeNoException();
        }
        return true;
    }
}

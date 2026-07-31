package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbye;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public abstract class zzcq extends zzaya implements zzcr {
    public zzcq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                String readString = parcel.readString();
                zzbox zzf = zzbow.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzayb.zzh(parcel);
                zzbx zzb = zzb(asInterface, zzrVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzb);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                String readString2 = parcel.readString();
                zzbox zzf2 = zzbow.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbx zzc = zzc(asInterface2, zzrVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzc);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbox zzf3 = zzbow.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbt zzd = zzd(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbga zze = zze(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zze);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf4 = zzbow.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbvk zzf5 = zzf(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzf5);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                zzayb.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbsw zzg = zzg(asInterface7);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzg);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzayb.zzh(parcel);
                zzdb zzi = zzi(asInterface8, readInt5);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzi);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbx zzj = zzj(asInterface9, zzrVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzj);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbgg zzk = zzk(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzk);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbox zzf6 = zzbow.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbwa zzl = zzl(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzl);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                String readString6 = parcel.readString();
                zzbox zzf7 = zzbow.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbx zzm = zzm(asInterface14, zzrVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzm);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf8 = zzbow.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbye zzn = zzn(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzn);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf9 = zzbow.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzayb.zzh(parcel);
                zzbsp zzo = zzo(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzo);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf10 = zzbow.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbkl zzc2 = zzbkk.zzc(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzbko zzp = zzp(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzp);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf11 = zzbow.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzayb.zzh(parcel);
                zzdw zzq = zzq(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzq);
                return true;
            case 18:
                IObjectWrapper asInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbox zzf12 = zzbow.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzayb.zzh(parcel);
                zzck zzh = zzh(asInterface19, zzf12, readInt13);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}

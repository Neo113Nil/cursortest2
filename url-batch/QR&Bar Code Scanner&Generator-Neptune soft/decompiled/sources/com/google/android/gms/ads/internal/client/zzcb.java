package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqq;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzcfg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public abstract class zzcb extends zzasa implements zzcc {
    public zzcb() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzasb.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbvk zzf = zzbvj.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzasb.zzc(parcel);
                zzbs zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzasb.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbvk zzf2 = zzbvj.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzasb.zzc(parcel);
                zzbs zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbvk zzf3 = zzbvj.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzasb.zzc(parcel);
                zzbo zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzbmi zzh = zzh(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzh);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvk zzf4 = zzbvj.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzasb.zzc(parcel);
                zzcbv zzm = zzm(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzm);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzbzc zzl = zzl(asInterface7);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzl);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzasb.zzc(parcel);
                zzcm zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzasb.zza(parcel, zzq.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzasb.zzc(parcel);
                zzbs zzf5 = zzf(asInterface9, zzqVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzbmo zzi = zzi(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzi);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbvk zzf6 = zzbvj.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzasb.zzc(parcel);
                zzccl zzn = zzn(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzn);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzasb.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbvk zzf7 = zzbvj.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzasb.zzc(parcel);
                zzbs zzc = zzc(asInterface14, zzqVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvk zzf8 = zzbvj.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzasb.zzc(parcel);
                zzcfg zzo = zzo(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzo);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvk zzf9 = zzbvj.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzasb.zzc(parcel);
                zzbyv zzk = zzk(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzk);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvk zzf10 = zzbvj.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbqr zzc2 = zzbqq.zzc(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzbqu zzj = zzj(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzj);
                return true;
            default:
                return false;
        }
    }
}

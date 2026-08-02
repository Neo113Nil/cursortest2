package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbjz;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzbym;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzcd extends zzaxn implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzaxo.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbom zzf = zzbol.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbu zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzaxo.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbom zzf2 = zzbol.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbu zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbom zzf3 = zzbol.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbq zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzbfh zzi = zzi(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzi);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbom zzf4 = zzbol.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbvq zzn = zzn(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzbsn zzm = zzm(asInterface7);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzco zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzaxo.zza(parcel, zzq.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbu zzf5 = zzf(asInterface9, zzqVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzbfn zzj = zzj(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbom zzf6 = zzbol.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbwg zzo = zzo(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzo);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzaxo.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbom zzf7 = zzbol.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbu zzc = zzc(asInterface14, zzqVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbom zzf8 = zzbol.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbym zzp = zzp(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzp);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbom zzf9 = zzbol.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzbsg zzl = zzl(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzl);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbom zzf10 = zzbol.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbjw zzc2 = zzbjv.zzc(parcel.readStrongBinder());
                zzaxo.zzc(parcel);
                zzbjz zzk = zzk(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzk);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbom zzf11 = zzbol.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzaxo.zzc(parcel);
                zzdj zzh = zzh(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                zzaxo.zzf(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}

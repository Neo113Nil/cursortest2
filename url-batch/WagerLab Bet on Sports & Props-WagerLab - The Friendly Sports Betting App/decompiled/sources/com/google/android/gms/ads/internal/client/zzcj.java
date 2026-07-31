package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbwa;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public abstract class zzcj extends zzaya implements zzck {
    public zzcj() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzce zzceVar = null;
        zzch zzchVar = null;
        switch (i) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzceVar = queryLocalInterface instanceof zzce ? (zzce) queryLocalInterface : new zzcc(readStrongBinder);
                }
                zzayb.zzh(parcel);
                zze(createTypedArrayList, zzceVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                zzayb.zzh(parcel);
                boolean zzf = zzf(readString);
                parcel2.writeNoException();
                parcel2.writeInt(zzf ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                zzayb.zzh(parcel);
                zzbwa zzg = zzg(readString2);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzg);
                return true;
            case 4:
                String readString3 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zzh = zzh(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(zzh ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                zzayb.zzh(parcel);
                zzbab zzi = zzi(readString4);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzi);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zzj = zzj(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzj ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                zzayb.zzh(parcel);
                zzbx zzk = zzk(readString6);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzk);
                return true;
            case 8:
                zzbow.zzf(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString7 = parcel.readString();
                zzft zzftVar = (zzft) zzayb.zzb(parcel, zzft.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzchVar = queryLocalInterface2 instanceof zzch ? (zzch) queryLocalInterface2 : new zzcf(readStrongBinder2);
                }
                zzayb.zzh(parcel);
                boolean zzm = zzm(readString7, zzftVar, zzchVar);
                parcel2.writeNoException();
                parcel2.writeInt(zzm ? 1 : 0);
                return true;
            case 10:
                int readInt = parcel.readInt();
                String readString8 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zzn = zzn(readInt, readString8);
                parcel2.writeNoException();
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                String readString9 = parcel.readString();
                zzayb.zzh(parcel);
                zzbx zzo = zzo(readString9);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzo);
                return true;
            case 12:
                String readString10 = parcel.readString();
                zzayb.zzh(parcel);
                zzbab zzp = zzp(readString10);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzp);
                return true;
            case 13:
                String readString11 = parcel.readString();
                zzayb.zzh(parcel);
                zzbwa zzq = zzq(readString11);
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzq);
                return true;
            case 14:
                int readInt2 = parcel.readInt();
                String readString12 = parcel.readString();
                zzayb.zzh(parcel);
                zzft zzr = zzr(readInt2, readString12);
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzr);
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                zzayb.zzh(parcel);
                Bundle zzs = zzs(readInt3);
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzs);
                return true;
            case 16:
                int readInt4 = parcel.readInt();
                String readString13 = parcel.readString();
                zzayb.zzh(parcel);
                int zzt = zzt(readInt4, readString13);
                parcel2.writeNoException();
                parcel2.writeInt(zzt);
                return true;
            case 17:
                int readInt5 = parcel.readInt();
                String readString14 = parcel.readString();
                zzayb.zzh(parcel);
                boolean zzu = zzu(readInt5, readString14);
                parcel2.writeNoException();
                parcel2.writeInt(zzu ? 1 : 0);
                return true;
            case 18:
                int readInt6 = parcel.readInt();
                zzayb.zzh(parcel);
                zzv(readInt6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

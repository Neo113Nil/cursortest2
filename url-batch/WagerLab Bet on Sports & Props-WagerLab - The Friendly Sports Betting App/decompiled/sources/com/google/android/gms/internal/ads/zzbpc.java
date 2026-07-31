package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbpc extends zzaya implements zzbpd {
    public zzbpc() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbpd ? (zzbpd) queryLocalInterface : new zzbpb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzayb.zzh(parcel);
                zzg(readInt);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzbph) {
                    }
                }
                zzayb.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzayb.zzh(parcel);
                zzl(readString, readString2);
                break;
            case 10:
                zzbgp.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzayb.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzayb.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzbvt zzbvtVar = (zzbvt) zzayb.zzb(parcel, zzbvt.CREATOR);
                zzayb.zzh(parcel);
                zzp(zzbvtVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzbvx zzb = zzbvw.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzr(zzb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzayb.zzh(parcel);
                zzs(readInt2);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzayb.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzayb.zzh(parcel);
                zzv(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzayb.zzh(parcel);
                zzw(readInt3, readString4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzayb.zzh(parcel);
                zzx(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzayb.zzh(parcel);
                zzy(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

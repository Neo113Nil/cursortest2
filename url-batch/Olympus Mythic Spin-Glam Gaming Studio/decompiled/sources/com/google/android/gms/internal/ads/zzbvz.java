package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes15.dex */
public abstract class zzbvz extends zzbev implements zzbwa {
    public zzbvz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbwa zzdR(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof zzbwa ? (zzbwa) queryLocalInterface : new zzbvy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                zzbew.zzh(parcel);
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
                    boolean z = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzbwe;
                }
                zzbew.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbew.zzh(parcel);
                zzl(readString, readString2);
                break;
            case 10:
                zzbnl.zza(parcel.readStrongBinder());
                parcel.readString();
                zzbew.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzbew.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzcct zzcctVar = (zzcct) zzbew.zzb(parcel, zzcct.CREATOR);
                zzbew.zzh(parcel);
                zzp(zzcctVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzccx zza = zzccw.zza(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzr(zza);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zzbew.zzh(parcel);
                zzs(readInt2);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzbew.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String readString3 = parcel.readString();
                zzbew.zzh(parcel);
                zzv(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zzbew.zzh(parcel);
                zzw(readInt3, readString4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbew.zzh(parcel);
                zzx(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbew.zzh(parcel);
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

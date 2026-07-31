package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public abstract class zzdz extends zzbev implements zzea {
    public zzdz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzea zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzea ? (zzea) queryLocalInterface : new zzdy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzed zzebVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zza = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzg(zza);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zzh = zzh();
                parcel2.writeNoException();
                int i3 = zzbew.zza;
                parcel2.writeInt(zzh ? 1 : 0);
                return true;
            case 5:
                int zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(zzi);
                return true;
            case 6:
                float zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(zzj);
                return true;
            case 7:
                float zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(zzk);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzebVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzebVar = queryLocalInterface instanceof zzed ? (zzed) queryLocalInterface : new zzeb(readStrongBinder);
                }
                zzbew.zzh(parcel);
                zzl(zzebVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(zzm);
                return true;
            case 10:
                boolean zzn = zzn();
                parcel2.writeNoException();
                int i4 = zzbew.zza;
                parcel2.writeInt(zzn ? 1 : 0);
                return true;
            case 11:
                zzed zzo = zzo();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzo);
                return true;
            case 12:
                boolean zzp = zzp();
                parcel2.writeNoException();
                int i5 = zzbew.zza;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

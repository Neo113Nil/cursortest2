package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbfs extends zzaya implements zzbft {
    public zzbfs() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbhe zzbheVar;
        switch (i) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzf(asInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzg);
                return true;
            case 5:
                float zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case 6:
                float zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(zzi);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzed zzj = zzj();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzj);
                return true;
            case 8:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i3 = zzayb.zza;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbheVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbheVar = queryLocalInterface instanceof zzbhe ? (zzbhe) queryLocalInterface : new zzbhe(readStrongBinder);
                }
                zzayb.zzh(parcel);
                zzm(zzbheVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i4 = zzayb.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbmr extends zzbev implements zzbms {
    public zzbmr() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzboa zzboaVar;
        switch (i) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzf(asInterface);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper zzg = zzg();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzg);
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
                com.google.android.gms.ads.internal.client.zzea zzj = zzj();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzj);
                return true;
            case 8:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i3 = zzbew.zza;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzboaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzboaVar = queryLocalInterface instanceof zzboa ? (zzboa) queryLocalInterface : new zzboa(readStrongBinder);
                }
                zzbew.zzh(parcel);
                zzm(zzboaVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i4 = zzbew.zza;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbmu extends zzbev implements zzbmv {
    public zzbmu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbmv zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbmv ? (zzbmv) queryLocalInterface : new zzbmt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper zza = zza();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zza);
                return true;
            case 2:
                Uri zzb = zzb();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzb);
                return true;
            case 3:
                double zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeDouble(zzc);
                return true;
            case 4:
                int zzd = zzd();
                parcel2.writeNoException();
                parcel2.writeInt(zzd);
                return true;
            case 5:
                int zze = zze();
                parcel2.writeNoException();
                parcel2.writeInt(zze);
                return true;
            case 6:
                Map zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeMap(zzf);
                return true;
            default:
                return false;
        }
    }
}

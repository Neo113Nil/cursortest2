package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbfv extends zzaya implements zzbfw {
    public zzbfv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbfw zzh(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbfw ? (zzbfw) queryLocalInterface : new zzbfu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper zzb = zzb();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzb);
                return true;
            case 2:
                Uri zzc = zzc();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzc);
                return true;
            case 3:
                double zzd = zzd();
                parcel2.writeNoException();
                parcel2.writeDouble(zzd);
                return true;
            case 4:
                int zze = zze();
                parcel2.writeNoException();
                parcel2.writeInt(zze);
                return true;
            case 5:
                int zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeInt(zzf);
                return true;
            case 6:
                Map zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeMap(zzg);
                return true;
            default:
                return false;
        }
    }
}

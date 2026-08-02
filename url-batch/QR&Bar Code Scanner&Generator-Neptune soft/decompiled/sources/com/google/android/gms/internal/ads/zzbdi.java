package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbdi extends zzasa implements zzbdj {
    public zzbdi() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbdn zzbdnVar = null;
        zzbdq zzbdqVar = null;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbs zze = zze();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    zzbdnVar = queryLocalInterface instanceof zzbdn ? (zzbdn) queryLocalInterface : new zzbdn(readStrongBinder);
                }
                zzasb.zzc(parcel);
                zzj(zzbdnVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbdqVar = queryLocalInterface2 instanceof zzbdq ? (zzbdq) queryLocalInterface2 : new zzbdo(readStrongBinder2);
                }
                zzasb.zzc(parcel);
                zzi(asInterface, zzbdqVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdh zzf = zzf();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzf);
                return true;
            case 6:
                boolean zzh = zzasb.zzh(parcel);
                zzasb.zzc(parcel);
                zzg(zzh);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzde zzb = com.google.android.gms.ads.internal.client.zzdd.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

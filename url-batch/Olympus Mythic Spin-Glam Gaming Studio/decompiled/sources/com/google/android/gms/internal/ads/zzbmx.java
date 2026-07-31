package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbmx extends zzbeu implements zzbmz {
    zzbmx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        Parcel zzda = zzda(2, zzcZ);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(3, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzd() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdB(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(6, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(9, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(7, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdE(zzbms zzbmsVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbmsVar);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeInt(i);
        zzdb(5, zzcZ);
    }
}

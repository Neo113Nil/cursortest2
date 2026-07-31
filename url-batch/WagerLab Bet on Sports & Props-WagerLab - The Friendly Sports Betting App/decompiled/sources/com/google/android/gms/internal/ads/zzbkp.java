package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbkp extends zzaxz implements zzbkr {
    zzbkp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final zzbko zze(IObjectWrapper iObjectWrapper, zzbox zzboxVar, int i, zzbkl zzbklVar) throws RemoteException {
        zzbko zzbkmVar;
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzboxVar);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzayb.zze(zza, zzbklVar);
        Parcel zzde = zzde(1, zza);
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzbkmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbkmVar = queryLocalInterface instanceof zzbko ? (zzbko) queryLocalInterface : new zzbkm(readStrongBinder);
        }
        zzde.recycle();
        return zzbkmVar;
    }
}

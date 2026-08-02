package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcfh extends zzarz implements zzcfj {
    zzcfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final zzcfg zze(IObjectWrapper iObjectWrapper, zzbvk zzbvkVar, int i) throws RemoteException {
        zzcfg zzcfeVar;
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbvkVar);
        zza.writeInt(223104000);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzcfeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcfeVar = queryLocalInterface instanceof zzcfg ? (zzcfg) queryLocalInterface : new zzcfe(readStrongBinder);
        }
        zzbk.recycle();
        return zzcfeVar;
    }
}

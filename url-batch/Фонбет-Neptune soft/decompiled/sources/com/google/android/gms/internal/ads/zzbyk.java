package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyk extends zzaxm implements zzbym {
    zzbyk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, iObjectWrapper2);
        zza.writeString(str);
        zzaxo.zzf(zza, iObjectWrapper3);
        Parcel zzdb = zzdb(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzf(IObjectWrapper iObjectWrapper, zzbyq zzbyqVar, zzbyj zzbyjVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzd(zza, zzbyqVar);
        zzaxo.zzf(zza, zzbyjVar);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzg(zzbtl zzbtlVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzbtlVar);
        zzdc(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbtcVar);
        zzdc(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbtcVar);
        zzdc(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzf(zza, iObjectWrapper);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbtcVar);
        zzdc(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaxo.zzf(zza, iObjectWrapper);
        zzaxo.zzf(zza, zzbtcVar);
        zzdc(5, zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbyc extends zzaxz implements zzbye {
    zzbyc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zze(IObjectWrapper iObjectWrapper, zzbyi zzbyiVar, zzbyb zzbybVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zzc(zza, zzbyiVar);
        zzayb.zze(zza, zzbybVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzi(zzbto zzbtoVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtl zzbtlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, iObjectWrapper2);
        zza.writeString(str);
        zzayb.zze(zza, iObjectWrapper3);
        Parcel zzde = zzde(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }
}

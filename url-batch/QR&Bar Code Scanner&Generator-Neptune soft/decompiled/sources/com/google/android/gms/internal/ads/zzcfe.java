package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcfe extends zzarz implements zzcfg {
    zzcfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zze(IObjectWrapper iObjectWrapper, zzcfk zzcfkVar, zzcfd zzcfdVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zze(zza, zzcfkVar);
        zzasb.zzg(zza, zzcfdVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzf(zzcaa zzcaaVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzcaaVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbzrVar);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbzrVar);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbzrVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbzrVar);
        zzbl(5, zza);
    }
}

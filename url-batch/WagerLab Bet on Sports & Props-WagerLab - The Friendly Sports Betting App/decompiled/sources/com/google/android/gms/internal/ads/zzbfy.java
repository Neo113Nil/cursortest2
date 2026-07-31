package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbfy extends zzaxz implements zzbga {
    zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayb.zze(zza, iObjectWrapper);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final IObjectWrapper zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzde = zzde(2, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdG(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdI(zzbft zzbftVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbftVar);
        zzdf(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zza.writeInt(i);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zzdf(6, zza);
    }
}

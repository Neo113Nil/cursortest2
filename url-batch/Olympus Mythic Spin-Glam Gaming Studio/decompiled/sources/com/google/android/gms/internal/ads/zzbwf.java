package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzbwf extends zzbeu implements IInterface {
    zzbwf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final List zzf() throws RemoteException {
        Parcel zzda = zzda(3, zzcZ());
        ArrayList zzf = zzbew.zzf(zzda);
        zzda.recycle();
        return zzf;
    }

    public final String zzg() throws RemoteException {
        Parcel zzda = zzda(4, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final zzbmv zzh() throws RemoteException {
        Parcel zzda = zzda(5, zzcZ());
        zzbmv zzg = zzbmu.zzg(zzda.readStrongBinder());
        zzda.recycle();
        return zzg;
    }

    public final String zzi() throws RemoteException {
        Parcel zzda = zzda(6, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final double zzj() throws RemoteException {
        Parcel zzda = zzda(7, zzcZ());
        double readDouble = zzda.readDouble();
        zzda.recycle();
        return readDouble;
    }

    public final String zzk() throws RemoteException {
        Parcel zzda = zzda(8, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final String zzl() throws RemoteException {
        Parcel zzda = zzda(9, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    public final void zzm() throws RemoteException {
        zzdb(10, zzcZ());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(11, zzcZ);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(12, zzcZ);
    }

    public final boolean zzp() throws RemoteException {
        Parcel zzda = zzda(13, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzda = zzda(14, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel zzda = zzda(15, zzcZ());
        Bundle bundle = (Bundle) zzbew.zzb(zzda, Bundle.CREATOR);
        zzda.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(16, zzcZ);
    }

    public final com.google.android.gms.ads.internal.client.zzea zzt() throws RemoteException {
        Parcel zzda = zzda(17, zzcZ());
        com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(zzda.readStrongBinder());
        zzda.recycle();
        return zza;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        Parcel zzda = zzda(18, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final zzbmo zzv() throws RemoteException {
        Parcel zzda = zzda(19, zzcZ());
        zzbmo zzi = zzbmn.zzi(zzda.readStrongBinder());
        zzda.recycle();
        return zzi;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        Parcel zzda = zzda(20, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzx() throws RemoteException {
        Parcel zzda = zzda(21, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zze(zzcZ, iObjectWrapper2);
        zzbew.zze(zzcZ, iObjectWrapper3);
        zzdb(22, zzcZ);
    }
}

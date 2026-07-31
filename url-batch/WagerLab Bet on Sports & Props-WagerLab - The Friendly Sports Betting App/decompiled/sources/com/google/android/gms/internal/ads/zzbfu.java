package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbfu extends zzaxz implements zzbfw {
    zzbfu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final IObjectWrapper zzb() throws RemoteException {
        Parcel zzde = zzde(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzde.readStrongBinder());
        zzde.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Uri zzc() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        Uri uri = (Uri) zzayb.zzb(zzde, Uri.CREATOR);
        zzde.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final double zzd() throws RemoteException {
        Parcel zzde = zzde(3, zza());
        double readDouble = zzde.readDouble();
        zzde.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zze() throws RemoteException {
        Parcel zzde = zzde(4, zza());
        int readInt = zzde.readInt();
        zzde.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzf() throws RemoteException {
        Parcel zzde = zzde(5, zza());
        int readInt = zzde.readInt();
        zzde.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Map zzg() throws RemoteException {
        Parcel zzde = zzde(6, zza());
        HashMap zzg = zzayb.zzg(zzde);
        zzde.recycle();
        return zzg;
    }
}

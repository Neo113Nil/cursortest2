package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbfb extends zzaxm implements zzbfd {
    zzbfb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final double zzb() throws RemoteException {
        Parcel zzdb = zzdb(3, zza());
        double readDouble = zzdb.readDouble();
        zzdb.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final int zzc() throws RemoteException {
        Parcel zzdb = zzdb(5, zza());
        int readInt = zzdb.readInt();
        zzdb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final int zzd() throws RemoteException {
        Parcel zzdb = zzdb(4, zza());
        int readInt = zzdb.readInt();
        zzdb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final Uri zze() throws RemoteException {
        Parcel zzdb = zzdb(2, zza());
        Uri uri = (Uri) zzaxo.zza(zzdb, Uri.CREATOR);
        zzdb.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfd
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel zzdb = zzdb(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzdb.readStrongBinder());
        zzdb.recycle();
        return asInterface;
    }
}

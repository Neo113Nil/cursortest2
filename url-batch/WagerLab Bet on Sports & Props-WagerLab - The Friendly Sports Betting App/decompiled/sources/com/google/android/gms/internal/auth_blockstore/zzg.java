package com.google.android.gms.internal.auth_blockstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes5.dex */
public final class zzg extends zza implements IInterface {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void zza(zzi zziVar, DeleteBytesRequest deleteBytesRequest) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zziVar);
        zzc.zzb(obtainAndWriteInterfaceToken, deleteBytesRequest);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    public final void zzb(zzk zzkVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zzkVar);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zzmVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void zzd(zzm zzmVar, RetrieveBytesRequest retrieveBytesRequest) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zzmVar);
        zzc.zzb(obtainAndWriteInterfaceToken, retrieveBytesRequest);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    public final void zze(zzo zzoVar, StoreBytesData storeBytesData) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zzoVar);
        zzc.zzb(obtainAndWriteInterfaceToken, storeBytesData);
        transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
    }
}

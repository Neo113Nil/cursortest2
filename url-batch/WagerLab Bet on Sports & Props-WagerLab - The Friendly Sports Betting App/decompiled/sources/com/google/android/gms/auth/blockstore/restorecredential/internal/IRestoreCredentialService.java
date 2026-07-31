package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import com.google.android.gms.internal.auth_blockstore.zzc;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes4.dex */
public interface IRestoreCredentialService extends IInterface {

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    public static abstract class Stub extends zzb implements IRestoreCredentialService {

        /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
        public static class Proxy extends zza implements IRestoreCredentialService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void clearRestoreCredential(ClearRestoreCredentialRequest clearRestoreCredentialRequest, IClearRestoreCredentialCallback iClearRestoreCredentialCallback) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, clearRestoreCredentialRequest);
                zzc.zzc(obtainAndWriteInterfaceToken, iClearRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void createRestoreCredential(CreateRestoreCredentialRequest createRestoreCredentialRequest, ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, createRestoreCredentialRequest);
                zzc.zzc(obtainAndWriteInterfaceToken, iCreateRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void getRestoreCredential(GetRestoreCredentialRequest getRestoreCredentialRequest, IGetRestoreCredentialCallback iGetRestoreCredentialCallback) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                zzc.zzb(obtainAndWriteInterfaceToken, getRestoreCredentialRequest);
                zzc.zzc(obtainAndWriteInterfaceToken, iGetRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public static IRestoreCredentialService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return queryLocalInterface instanceof IRestoreCredentialService ? (IRestoreCredentialService) queryLocalInterface : new Proxy(iBinder);
        }
    }

    void clearRestoreCredential(ClearRestoreCredentialRequest clearRestoreCredentialRequest, IClearRestoreCredentialCallback iClearRestoreCredentialCallback) throws RemoteException;

    void createRestoreCredential(CreateRestoreCredentialRequest createRestoreCredentialRequest, ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback) throws RemoteException;

    void getRestoreCredential(GetRestoreCredentialRequest getRestoreCredentialRequest, IGetRestoreCredentialCallback iGetRestoreCredentialCallback) throws RemoteException;
}

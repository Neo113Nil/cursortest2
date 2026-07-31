package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public interface IHsdpServiceCallback extends IInterface {
    void onDismissed(@NonNull Bundle bundle) throws RemoteException;

    void onError(@NonNull Bundle bundle) throws RemoteException;

    void onShown(@NonNull Bundle bundle) throws RemoteException;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public static abstract class Stub extends zzbev implements IHsdpServiceCallback {

        /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
        public static class Proxy extends zzbeu implements IHsdpServiceCallback {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onDismissed(@NonNull Bundle bundle) throws RemoteException {
                Parcel zzcZ = zzcZ();
                zzbew.zzc(zzcZ, bundle);
                zzdb(2, zzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onError(@NonNull Bundle bundle) throws RemoteException {
                Parcel zzcZ = zzcZ();
                zzbew.zzc(zzcZ, bundle);
                zzdb(3, zzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback
            public void onShown(@NonNull Bundle bundle) throws RemoteException {
                Parcel zzcZ = zzcZ();
                zzbew.zzc(zzcZ, bundle);
                zzdb(1, zzcZ);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
        }

        @NonNull
        public static IHsdpServiceCallback asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
            return queryLocalInterface instanceof IHsdpServiceCallback ? (IHsdpServiceCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.ads.zzbev
        protected boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                onShown(bundle);
            } else if (i == 2) {
                Bundle bundle2 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                onDismissed(bundle2);
            } else {
                if (i != 3) {
                    return false;
                }
                Bundle bundle3 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                onError(bundle3);
            }
            parcel2.writeNoException();
            return true;
        }
    }
}

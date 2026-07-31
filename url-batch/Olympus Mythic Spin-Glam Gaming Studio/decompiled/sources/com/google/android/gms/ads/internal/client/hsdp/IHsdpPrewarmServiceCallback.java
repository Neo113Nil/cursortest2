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
/* loaded from: classes5.dex */
public interface IHsdpPrewarmServiceCallback extends IInterface {
    void onError(@NonNull Bundle bundle) throws RemoteException;

    void onPrewarmCompleted(@NonNull Bundle bundle) throws RemoteException;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public static abstract class Stub extends zzbev implements IHsdpPrewarmServiceCallback {

        /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
        public static class Proxy extends zzbeu implements IHsdpPrewarmServiceCallback {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
            public void onError(@NonNull Bundle bundle) throws RemoteException {
                Parcel zzcZ = zzcZ();
                zzbew.zzc(zzcZ, bundle);
                zzdc(2, zzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback
            public void onPrewarmCompleted(@NonNull Bundle bundle) throws RemoteException {
                Parcel zzcZ = zzcZ();
                zzbew.zzc(zzcZ, bundle);
                zzdc(1, zzcZ);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
        }

        @NonNull
        public static IHsdpPrewarmServiceCallback asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
            return queryLocalInterface instanceof IHsdpPrewarmServiceCallback ? (IHsdpPrewarmServiceCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.ads.zzbev
        protected boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                onPrewarmCompleted(bundle);
            } else {
                if (i != 2) {
                    return false;
                }
                Bundle bundle2 = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                zzbew.zzh(parcel);
                onError(bundle2);
            }
            return true;
        }
    }
}

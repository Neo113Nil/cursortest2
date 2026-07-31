package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public interface IHsdpDeepLinkServiceWrapper extends IInterface {

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
    public static abstract class Stub extends zzbev implements IHsdpDeepLinkServiceWrapper {

        /* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
        public static class Proxy extends zzbeu implements IHsdpDeepLinkServiceWrapper {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void endSession(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str) throws RemoteException {
                Parcel zzcZ = zzcZ();
                zzbew.zze(zzcZ, iObjectWrapper);
                zzcZ.writeString(str);
                zzdb(2, zzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void open(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, @NonNull IHsdpServiceCallback iHsdpServiceCallback) throws RemoteException {
                Parcel zzcZ = zzcZ();
                zzbew.zze(zzcZ, iObjectWrapper);
                zzcZ.writeString(str);
                zzcZ.writeString(str2);
                zzbew.zzc(zzcZ, bundle);
                zzcZ.writeInt(z ? 1 : 0);
                zzbew.zze(zzcZ, iHsdpServiceCallback);
                zzdb(3, zzcZ);
            }

            @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
            public void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @NonNull IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws RemoteException {
                Parcel zzcZ = zzcZ();
                zzbew.zze(zzcZ, iObjectWrapper);
                zzcZ.writeTypedList(list);
                zzbew.zze(zzcZ, iHsdpPrewarmServiceCallback);
                zzdb(1, zzcZ);
            }
        }

        public Stub() {
            super("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
        }

        @NonNull
        public static IHsdpDeepLinkServiceWrapper asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper");
            return queryLocalInterface instanceof IHsdpDeepLinkServiceWrapper ? (IHsdpDeepLinkServiceWrapper) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.ads.zzbev
        protected boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                IHsdpPrewarmServiceCallback asInterface2 = IHsdpPrewarmServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                prewarm(asInterface, createTypedArrayList, asInterface2);
            } else if (i == 2) {
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzbew.zzh(parcel);
                endSession(asInterface3, readString);
            } else {
                if (i != 3) {
                    return false;
                }
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                Bundle bundle = (Bundle) zzbew.zzb(parcel, Bundle.CREATOR);
                boolean zza = zzbew.zza(parcel);
                IHsdpServiceCallback asInterface5 = IHsdpServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                open(asInterface4, readString2, readString3, bundle, zza, asInterface5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void endSession(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str) throws RemoteException;

    void open(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, @NonNull IHsdpServiceCallback iHsdpServiceCallback) throws RemoteException;

    void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @NonNull IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) throws RemoteException;
}

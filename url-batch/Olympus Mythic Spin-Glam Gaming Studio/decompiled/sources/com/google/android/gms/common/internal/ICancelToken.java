package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes8.dex */
public interface ICancelToken extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @NonNull
        public static ICancelToken asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof ICancelToken ? (ICancelToken) queryLocalInterface : new zzu(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws RemoteException;
}

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzbwb extends zzbeu implements zzbwd {
    zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final IObjectWrapper zze() throws RemoteException {
        Parcel zzda = zzda(1, zzcZ());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzda.readStrongBinder());
        zzda.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final boolean zzf() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }
}

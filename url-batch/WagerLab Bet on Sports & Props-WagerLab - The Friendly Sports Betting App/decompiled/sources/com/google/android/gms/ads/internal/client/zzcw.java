package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzcw extends zzaxz implements zzcy {
    zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzbox getAdapterCreator() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        zzbox zzf = zzbow.zzf(zzde.readStrongBinder());
        zzde.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final zzfc getLiteSdkVersion() throws RemoteException {
        Parcel zzde = zzde(1, zza());
        zzfc zzfcVar = (zzfc) zzayb.zzb(zzde, zzfc.CREATOR);
        zzde.recycle();
        return zzfcVar;
    }
}

package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzct extends zzbeu implements zzcv {
    zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbvu getAdapterCreator() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        zzbvu zze = zzbvt.zze(zzda.readStrongBinder());
        zzda.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzez getLiteSdkVersion() throws RemoteException {
        Parcel zzda = zzda(1, zzcZ());
        zzez zzezVar = (zzez) zzbew.zzb(zzda, zzez.CREATOR);
        zzda.recycle();
        return zzezVar;
    }
}

package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbeu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzde extends zzbeu implements zzdg {
    zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zze() throws RemoteException {
        Parcel zzda = zzda(1, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zzf() throws RemoteException {
        Parcel zzda = zzda(2, zzcZ());
        String readString = zzda.readString();
        zzda.recycle();
        return readString;
    }
}

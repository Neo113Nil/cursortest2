package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzdr extends zzaxz implements zzdt {
    zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(zzt zztVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zztVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final boolean zzf() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }
}

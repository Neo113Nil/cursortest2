package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzct extends zzaxz implements zzcv {
    zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zzb(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzeVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zzc() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zzd() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zze() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final void zzf() throws RemoteException {
        zzdf(5, zza());
    }
}

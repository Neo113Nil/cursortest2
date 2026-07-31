package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzged extends zzaxz implements zzgef {
    zzged(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final void zze(String str, Bundle bundle, zzgeh zzgehVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayb.zzc(zza, bundle);
        zzayb.zze(zza, zzgehVar);
        zzdg(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final void zzf(Bundle bundle, zzgeh zzgehVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, bundle);
        zzayb.zze(zza, zzgehVar);
        zzdg(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final void zzg(Bundle bundle, zzgeh zzgehVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, bundle);
        zzayb.zze(zza, zzgehVar);
        zzdg(3, zza);
    }
}

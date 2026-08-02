package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbqm extends zzaxm implements zzbqo {
    zzbqm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqo
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqo
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdc(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqo
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaxo.zzd(zza, zzeVar);
        zzdc(3, zza);
    }
}

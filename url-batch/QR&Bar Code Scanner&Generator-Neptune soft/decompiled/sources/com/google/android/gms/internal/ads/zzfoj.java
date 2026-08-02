package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfoj extends zzarz implements IInterface {
    zzfoj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfoh zze(zzfof zzfofVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzfofVar);
        Parcel zzbk = zzbk(1, zza);
        zzfoh zzfohVar = (zzfoh) zzasb.zza(zzbk, zzfoh.CREATOR);
        zzbk.recycle();
        return zzfohVar;
    }

    public final zzfoq zzf(zzfoo zzfooVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzfooVar);
        Parcel zzbk = zzbk(3, zza);
        zzfoq zzfoqVar = (zzfoq) zzasb.zza(zzbk, zzfoq.CREATOR);
        zzbk.recycle();
        return zzfoqVar;
    }

    public final void zzg(zzfoc zzfocVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzfocVar);
        zzbl(2, zza);
    }
}

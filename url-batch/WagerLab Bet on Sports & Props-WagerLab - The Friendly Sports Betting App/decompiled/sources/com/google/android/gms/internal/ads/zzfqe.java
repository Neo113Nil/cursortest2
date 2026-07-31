package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfqe extends zzaxz implements zzfqg {
    zzfqe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zze() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzf(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzdf(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzg(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdf(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzi(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzdf(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzj(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(null);
        zzdf(8, zza);
    }
}

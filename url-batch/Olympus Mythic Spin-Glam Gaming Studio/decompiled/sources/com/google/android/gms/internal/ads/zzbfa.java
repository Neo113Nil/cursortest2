package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbfa extends zzbeu implements zzbfc {
    zzbfa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzcZ.writeString("GMA_SDK");
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void zzf() throws RemoteException {
        zzdb(3, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void zzg(int[] iArr) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeIntArray(null);
        zzdb(4, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void zzh(byte[] bArr) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeByteArray(bArr);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void zzi(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(0);
        zzdb(6, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final void zzj(int i) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzdb(7, zzcZ);
    }
}

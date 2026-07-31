package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbzk extends zzbeu implements zzbzm {
    zzbzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zze(Intent intent) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, intent);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzg() throws RemoteException {
        zzdb(3, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(4, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeStringArray(strArr);
        zzcZ.writeIntArray(iArr);
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbzm
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzbew.zzc(zzcZ, zzaVar);
        zzdb(6, zzcZ);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbzr extends zzbeu implements zzbzt {
    zzbzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzG(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzcZ.writeStringArray(strArr);
        zzcZ.writeIntArray(iArr);
        zzdb(15, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzd() throws RemoteException {
        zzdb(10, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zze() throws RemoteException {
        zzdb(14, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final boolean zzf() throws RemoteException {
        Parcel zzda = zzda(11, zzcZ());
        boolean zza = zzbew.zza(zzda);
        zzda.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzg(Bundle bundle) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        zzdb(1, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzh() throws RemoteException {
        zzdb(2, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzi() throws RemoteException {
        zzdb(3, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzj() throws RemoteException {
        zzdb(4, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzk() throws RemoteException {
        zzdb(5, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzl(int i, int i2, Intent intent) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeInt(i);
        zzcZ.writeInt(i2);
        zzbew.zzc(zzcZ, intent);
        zzdb(12, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, iObjectWrapper);
        zzdb(13, zzcZ);
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzn(Bundle bundle) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, bundle);
        Parcel zzda = zzda(6, zzcZ);
        if (zzda.readInt() != 0) {
            bundle.readFromParcel(zzda);
        }
        zzda.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzo() throws RemoteException {
        zzdb(7, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzp() throws RemoteException {
        zzdb(8, zzcZ());
    }

    @Override // com.google.android.gms.internal.ads.zzbzt
    public final void zzr() throws RemoteException {
        zzdb(9, zzcZ());
    }
}

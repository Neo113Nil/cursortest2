package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public interface zzbgz extends IInterface {
    com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbhg zzbhgVar) throws RemoteException;

    @Nullable
    com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException;

    void zzh(boolean z) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    @Nullable
    String zzj() throws RemoteException;

    long zzk() throws RemoteException;

    void zzl(long j) throws RemoteException;
}

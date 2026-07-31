package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public interface zzbmz extends IInterface {
    void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzb(String str) throws RemoteException;

    void zzc(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzd() throws RemoteException;

    void zzdB(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdC(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdD(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdE(@Nullable zzbms zzbmsVar) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}

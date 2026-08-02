package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzccs;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public final class zzew extends zzcck {
    private static void zzr(final zzccs zzccsVar) {
        zzcgp.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcgi.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzev
            @Override // java.lang.Runnable
            public final void run() {
                zzccs zzccsVar2 = zzccs.this;
                if (zzccsVar2 != null) {
                    try {
                        zzccsVar2.zze(1);
                    } catch (RemoteException e) {
                        zzcgp.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final zzdh zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final zzcci zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzf(zzl zzlVar, zzccs zzccsVar) throws RemoteException {
        zzr(zzccsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzg(zzl zzlVar, zzccs zzccsVar) throws RemoteException {
        zzr(zzccsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzi(zzdb zzdbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzj(zzde zzdeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzk(zzcco zzccoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzl(zzccz zzcczVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzp(zzcct zzcctVar) throws RemoteException {
    }
}

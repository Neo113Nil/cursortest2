package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbra;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public interface zzbo extends IInterface {
    zzbl zze() throws RemoteException;

    void zzf(zzbly zzblyVar) throws RemoteException;

    void zzg(zzbmb zzbmbVar) throws RemoteException;

    void zzh(String str, zzbmh zzbmhVar, zzbme zzbmeVar) throws RemoteException;

    void zzi(zzbra zzbraVar) throws RemoteException;

    void zzj(zzbml zzbmlVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbmo zzbmoVar) throws RemoteException;

    void zzl(zzbf zzbfVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbqr zzbqrVar) throws RemoteException;

    void zzo(zzbko zzbkoVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcd zzcdVar) throws RemoteException;
}

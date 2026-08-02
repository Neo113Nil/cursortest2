package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public interface zzbo extends IInterface {
    zzbl zze() throws RemoteException;

    void zzf(zzbnc zzbncVar) throws RemoteException;

    void zzg(zzbnf zzbnfVar) throws RemoteException;

    void zzh(String str, zzbnl zzbnlVar, zzbni zzbniVar) throws RemoteException;

    void zzi(zzbsl zzbslVar) throws RemoteException;

    void zzj(zzbnp zzbnpVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbns zzbnsVar) throws RemoteException;

    void zzl(zzbf zzbfVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbsc zzbscVar) throws RemoteException;

    void zzo(zzbls zzblsVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcd zzcdVar) throws RemoteException;
}

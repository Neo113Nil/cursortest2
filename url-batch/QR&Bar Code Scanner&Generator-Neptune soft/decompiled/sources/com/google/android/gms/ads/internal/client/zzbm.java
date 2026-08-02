package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzarz;
import com.google.android.gms.internal.ads.zzasb;
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
public final class zzbm extends zzarz implements zzbo {
    zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final zzbl zze() throws RemoteException {
        zzbl zzbjVar;
        Parcel zzbk = zzbk(1, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbjVar = queryLocalInterface instanceof zzbl ? (zzbl) queryLocalInterface : new zzbj(readStrongBinder);
        }
        zzbk.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzf(zzbnc zzbncVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzg(zzbnf zzbnfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzh(String str, zzbnl zzbnlVar, zzbni zzbniVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasb.zzg(zza, zzbnlVar);
        zzasb.zzg(zza, zzbniVar);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzi(zzbsl zzbslVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzj(zzbnp zzbnpVar, zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzbnpVar);
        zzasb.zze(zza, zzqVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzk(zzbns zzbnsVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzbnsVar);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzl(zzbf zzbfVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, zzbfVar);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, adManagerAdViewOptions);
        zzbl(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzn(zzbsc zzbscVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzo(zzbls zzblsVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zze(zza, zzblsVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzq(zzcd zzcdVar) throws RemoteException {
        throw null;
    }
}

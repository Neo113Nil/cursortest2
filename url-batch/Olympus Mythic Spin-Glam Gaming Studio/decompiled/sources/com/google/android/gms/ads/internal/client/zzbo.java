package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbtc;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbo extends zzbeu implements zzbq {
    zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel zzda = zzda(1, zzcZ());
        IBinder readStrongBinder = zzda.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof zzbn ? (zzbn) queryLocalInterface : new zzbl(readStrongBinder);
        }
        zzda.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbh zzbhVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbhVar);
        zzdb(2, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbnq zzbnqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbnt zzbntVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbnz zzbnzVar, zzbnw zzbnwVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzcZ.writeString(str);
        zzbew.zze(zzcZ, zzbnzVar);
        zzbew.zze(zzcZ, zzbnwVar);
        zzdb(5, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbmk zzbmkVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, zzbmkVar);
        zzdb(6, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbod zzbodVar, zzr zzrVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbodVar);
        zzbew.zzc(zzcZ, zzrVar);
        zzdb(8, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbog zzbogVar) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zze(zzcZ, zzbogVar);
        zzdb(10, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbst zzbstVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbtc zzbtcVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zzcZ = zzcZ();
        zzbew.zzc(zzcZ, adManagerAdViewOptions);
        zzdb(15, zzcZ);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcp zzcpVar) throws RemoteException {
        throw null;
    }
}

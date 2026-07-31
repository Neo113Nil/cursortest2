package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbmf;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzbr extends zzaxz implements zzbt {
    zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final zzbq zze() throws RemoteException {
        zzbq zzboVar;
        Parcel zzde = zzde(1, zza());
        IBinder readStrongBinder = zzde.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        zzde.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(zzbk zzbkVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbkVar);
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzbgu zzbguVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(zzbgx zzbgxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(String str, zzbhd zzbhdVar, zzbha zzbhaVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayb.zze(zza, zzbhdVar);
        zzayb.zze(zza, zzbhaVar);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbfl zzbflVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzbflVar);
        zzdf(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbhh zzbhhVar, zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbhhVar);
        zzayb.zzc(zza, zzrVar);
        zzdf(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(zzbhk zzbhkVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzbhkVar);
        zzdf(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzblw zzblwVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbmf zzbmfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, adManagerAdViewOptions);
        zzdf(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(zzcs zzcsVar) throws RemoteException {
        throw null;
    }
}

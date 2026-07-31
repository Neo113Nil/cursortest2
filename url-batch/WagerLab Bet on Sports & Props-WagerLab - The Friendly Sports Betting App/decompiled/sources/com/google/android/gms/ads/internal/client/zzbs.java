package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmf;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public abstract class zzbs extends zzaya implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbk zzbkVar = null;
        zzcs zzcsVar = null;
        switch (i) {
            case 1:
                zzbq zze = zze();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbkVar = queryLocalInterface instanceof zzbk ? (zzbk) queryLocalInterface : new zzbi(readStrongBinder);
                }
                zzayb.zzh(parcel);
                zzf(zzbkVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbgu zzb = zzbgt.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzg(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbgx zzb2 = zzbgw.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzh(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbhd zzb3 = zzbhc.zzb(parcel.readStrongBinder());
                zzbha zzb4 = zzbgz.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzi(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfl zzbflVar = (zzbfl) zzayb.zzb(parcel, zzbfl.CREATOR);
                zzayb.zzh(parcel);
                zzj(zzbflVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcsVar = queryLocalInterface2 instanceof zzcs ? (zzcs) queryLocalInterface2 : new zzcs(readStrongBinder2);
                }
                zzayb.zzh(parcel);
                zzq(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbhh zzb5 = zzbhg.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzayb.zzb(parcel, zzr.CREATOR);
                zzayb.zzh(parcel);
                zzk(zzb5, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzayb.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzayb.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhk zzb6 = zzbhj.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzm(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzblw zzblwVar = (zzblw) zzayb.zzb(parcel, zzblw.CREATOR);
                zzayb.zzh(parcel);
                zzn(zzblwVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmf zzb7 = zzbme.zzb(parcel.readStrongBinder());
                zzayb.zzh(parcel);
                zzo(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzayb.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzayb.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}

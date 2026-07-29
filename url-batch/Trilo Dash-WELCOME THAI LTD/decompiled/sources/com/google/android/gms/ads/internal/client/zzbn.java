package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzbly;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbml;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbra;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbn extends zzaqw implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzaqw
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbf zzbfVar = null;
        zzcd zzcdVar = null;
        switch (i) {
            case 1:
                zzbl zze = zze();
                parcel2.writeNoException();
                zzaqx.zzg(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = queryLocalInterface instanceof zzbf ? (zzbf) queryLocalInterface : new zzbd(readStrongBinder);
                }
                zzaqx.zzc(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbly zzb = zzblx.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbmb zzb2 = zzbma.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbmh zzb3 = zzbmg.zzb(parcel.readStrongBinder());
                zzbme zzb4 = zzbmd.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbko zzbkoVar = (zzbko) zzaqx.zza(parcel, zzbko.CREATOR);
                zzaqx.zzc(parcel);
                zzo(zzbkoVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcdVar = queryLocalInterface2 instanceof zzcd ? (zzcd) queryLocalInterface2 : new zzcd(readStrongBinder2);
                }
                zzaqx.zzc(parcel);
                zzq(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbml zzb5 = zzbmk.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzaqx.zza(parcel, zzq.CREATOR);
                zzaqx.zzc(parcel);
                zzj(zzb5, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzaqx.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzaqx.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbmo zzb6 = zzbmn.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzk(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbqr zzbqrVar = (zzbqr) zzaqx.zza(parcel, zzbqr.CREATOR);
                zzaqx.zzc(parcel);
                zzn(zzbqrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbra zzb7 = zzbqz.zzb(parcel.readStrongBinder());
                zzaqx.zzc(parcel);
                zzi(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzaqx.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzaqx.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}

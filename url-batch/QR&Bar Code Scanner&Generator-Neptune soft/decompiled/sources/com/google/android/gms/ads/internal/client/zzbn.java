package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbnh;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnk;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public abstract class zzbn extends zzasa implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbf zzbfVar = null;
        zzcd zzcdVar = null;
        switch (i) {
            case 1:
                zzbl zze = zze();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = queryLocalInterface instanceof zzbf ? (zzbf) queryLocalInterface : new zzbd(readStrongBinder);
                }
                zzasb.zzc(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbnc zzb = zzbnb.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzf(zzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbnf zzb2 = zzbne.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzg(zzb2);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                zzbnl zzb3 = zzbnk.zzb(parcel.readStrongBinder());
                zzbni zzb4 = zzbnh.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzh(readString, zzb3, zzb4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbls zzblsVar = (zzbls) zzasb.zza(parcel, zzbls.CREATOR);
                zzasb.zzc(parcel);
                zzo(zzblsVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcdVar = queryLocalInterface2 instanceof zzcd ? (zzcd) queryLocalInterface2 : new zzcd(readStrongBinder2);
                }
                zzasb.zzc(parcel);
                zzq(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbnp zzb5 = zzbno.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzasb.zza(parcel, zzq.CREATOR);
                zzasb.zzc(parcel);
                zzj(zzb5, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzasb.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzasb.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbns zzb6 = zzbnr.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzk(zzb6);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbsc zzbscVar = (zzbsc) zzasb.zza(parcel, zzbsc.CREATOR);
                zzasb.zzc(parcel);
                zzn(zzbscVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsl zzb7 = zzbsk.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzi(zzb7);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzasb.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzasb.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}

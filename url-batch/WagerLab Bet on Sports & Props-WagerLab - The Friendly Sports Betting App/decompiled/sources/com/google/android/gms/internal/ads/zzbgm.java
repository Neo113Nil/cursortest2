package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbgm extends zzaya implements zzbgn {
    public zzbgm() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper zzb = zzb();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzb);
                return true;
            case 3:
                String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
                return true;
            case 4:
                List zzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(zzd);
                return true;
            case 5:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 6:
                zzbfw zzf = zzf();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzf);
                return true;
            case 7:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 8:
                String zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 9:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                zzayb.zzd(parcel2, zzi);
                return true;
            case 10:
                zzj();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzed zzk = zzk();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzk);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                boolean zzm = zzm(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzm ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
                zzayb.zzh(parcel);
                zzn(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbfp zzo = zzo();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzo);
                return true;
            case 16:
                IObjectWrapper zzp = zzp();
                parcel2.writeNoException();
                zzayb.zze(parcel2, zzp);
                return true;
            case 17:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            default:
                return false;
        }
    }
}

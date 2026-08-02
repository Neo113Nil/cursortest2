package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcbx;
import com.google.android.gms.internal.ads.zzcby;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public abstract class zzbr extends zzasa implements zzbs {
    public zzbr() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbs zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbf zzbfVar = null;
        zzcg zzcgVar = null;
        zzbi zzbiVar = null;
        zzde zzdeVar = null;
        zzbw zzbwVar = null;
        zzcd zzcdVar = null;
        zzbc zzbcVar = null;
        zzbz zzbzVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzZ = zzZ();
                parcel2.writeNoException();
                zzasb.zzd(parcel2, zzZ);
                return true;
            case 4:
                zzl zzlVar = (zzl) zzasb.zza(parcel, zzl.CREATOR);
                zzasb.zzc(parcel);
                boolean zzaa = zzaa(zzlVar);
                parcel2.writeNoException();
                zzasb.zzd(parcel2, zzaa);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = queryLocalInterface instanceof zzbf ? (zzbf) queryLocalInterface : new zzbd(readStrongBinder);
                }
                zzasb.zzc(parcel);
                zzD(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbzVar = queryLocalInterface2 instanceof zzbz ? (zzbz) queryLocalInterface2 : new zzbx(readStrongBinder2);
                }
                zzasb.zzc(parcel);
                zzG(zzbzVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzg = zzg();
                parcel2.writeNoException();
                zzasb.zzf(parcel2, zzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) zzasb.zza(parcel, zzq.CREATOR);
                zzasb.zzc(parcel);
                zzF(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbzl zzb = zzbzk.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzM(zzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbzo zzb2 = zzbzn.zzb(parcel.readStrongBinder());
                String readString = parcel.readString();
                zzasb.zzc(parcel);
                zzQ(zzb2, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                zzbjx zzb3 = zzbjw.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzO(zzb3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = queryLocalInterface3 instanceof zzbc ? (zzbc) queryLocalInterface3 : new zzba(readStrongBinder3);
                }
                zzasb.zzc(parcel);
                zzC(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcdVar = queryLocalInterface4 instanceof zzcd ? (zzcd) queryLocalInterface4 : new zzcd(readStrongBinder4);
                }
                zzasb.zzc(parcel);
                zzab(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zzh = zzasb.zzh(parcel);
                zzasb.zzc(parcel);
                zzN(zzh);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zzY = zzY();
                parcel2.writeNoException();
                zzasb.zzd(parcel2, zzY);
                return true;
            case 24:
                zzcby zzb4 = zzcbx.zzb(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzS(zzb4);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zzasb.zzc(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdk zzl = zzl();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzl);
                return true;
            case 29:
                zzff zzffVar = (zzff) zzasb.zza(parcel, zzff.CREATOR);
                zzasb.zzc(parcel);
                zzU(zzffVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzdo zzdoVar = (zzdo) zzasb.zza(parcel, zzdo.CREATOR);
                zzasb.zzc(parcel);
                zzK(zzdoVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 32:
                zzbz zzj = zzj();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzj);
                return true;
            case 33:
                zzbf zzi = zzi();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzi);
                return true;
            case 34:
                boolean zzh2 = zzasb.zzh(parcel);
                zzasb.zzc(parcel);
                zzL(zzh2);
                parcel2.writeNoException();
                return true;
            case 35:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = queryLocalInterface5 instanceof zzbw ? (zzbw) queryLocalInterface5 : new zzbu(readStrongBinder5);
                }
                zzasb.zzc(parcel);
                zzE(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle zzd = zzd();
                parcel2.writeNoException();
                zzasb.zzf(parcel2, zzd);
                return true;
            case 38:
                String readString3 = parcel.readString();
                zzasb.zzc(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) zzasb.zza(parcel, zzw.CREATOR);
                zzasb.zzc(parcel);
                zzI(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbdm zze = zzbdl.zze(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzH(zze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdh zzk = zzk();
                parcel2.writeNoException();
                zzasb.zzg(parcel2, zzk);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdeVar = queryLocalInterface6 instanceof zzde ? (zzde) queryLocalInterface6 : new zzdc(readStrongBinder6);
                }
                zzasb.zzc(parcel);
                zzP(zzdeVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) zzasb.zza(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = queryLocalInterface7 instanceof zzbi ? (zzbi) queryLocalInterface7 : new zzbg(readStrongBinder7);
                }
                zzasb.zzc(parcel);
                zzy(zzlVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasb.zzc(parcel);
                zzW(asInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcgVar = queryLocalInterface8 instanceof zzcg ? (zzcg) queryLocalInterface8 : new zzce(readStrongBinder8);
                }
                zzasb.zzc(parcel);
                zzJ(zzcgVar);
                parcel2.writeNoException();
                return true;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbxc extends zzasa implements zzbxd {
    public zzbxc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbxd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbxd ? (zzbxd) queryLocalInterface : new zzbxb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    protected final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbxg zzbxgVar = null;
        zzbwx zzbwvVar = null;
        zzbwr zzbwpVar = null;
        zzbxa zzbwyVar = null;
        zzbwx zzbwvVar2 = null;
        zzbxa zzbwyVar2 = null;
        zzbwu zzbwsVar = null;
        zzbwr zzbwpVar2 = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzasb.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzasb.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbxgVar = queryLocalInterface instanceof zzbxg ? (zzbxg) queryLocalInterface : new zzbxe(readStrongBinder);
            }
            zzbxg zzbxgVar2 = zzbxgVar;
            zzasb.zzc(parcel);
            zzh(asInterface, readString, bundle, bundle2, zzqVar, zzbxgVar2);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbxq zzf = zzf();
            parcel2.writeNoException();
            zzasb.zzf(parcel2, zzf);
        } else if (i == 3) {
            zzbxq zzg = zzg();
            parcel2.writeNoException();
            zzasb.zzf(parcel2, zzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzdk zze = zze();
            parcel2.writeNoException();
            zzasb.zzg(parcel2, zze);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzasb.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwpVar2 = queryLocalInterface2 instanceof zzbwr ? (zzbwr) queryLocalInterface2 : new zzbwp(readStrongBinder2);
                    }
                    zzbwr zzbwrVar = zzbwpVar2;
                    zzbvq zzb = zzbvp.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzasb.zzc(parcel);
                    zzi(readString2, readString3, zzlVar, asInterface2, zzbwrVar, zzb, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbwsVar = queryLocalInterface3 instanceof zzbwu ? (zzbwu) queryLocalInterface3 : new zzbws(readStrongBinder3);
                    }
                    zzbwu zzbwuVar = zzbwsVar;
                    zzbvq zzb2 = zzbvp.zzb(parcel.readStrongBinder());
                    zzasb.zzc(parcel);
                    zzk(readString4, readString5, zzlVar2, asInterface3, zzbwuVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzasb.zzc(parcel);
                    boolean zzq = zzq(asInterface4);
                    parcel2.writeNoException();
                    zzasb.zzd(parcel2, zzq);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwyVar2 = queryLocalInterface4 instanceof zzbxa ? (zzbxa) queryLocalInterface4 : new zzbwy(readStrongBinder4);
                    }
                    zzbxa zzbxaVar = zzbwyVar2;
                    zzbvq zzb3 = zzbvp.zzb(parcel.readStrongBinder());
                    zzasb.zzc(parcel);
                    zzo(readString6, readString7, zzlVar3, asInterface5, zzbxaVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzasb.zzc(parcel);
                    boolean zzr = zzr(asInterface6);
                    parcel2.writeNoException();
                    zzasb.zzd(parcel2, zzr);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwvVar2 = queryLocalInterface5 instanceof zzbwx ? (zzbwx) queryLocalInterface5 : new zzbwv(readStrongBinder5);
                    }
                    zzbwx zzbwxVar = zzbwvVar2;
                    zzbvq zzb4 = zzbvp.zzb(parcel.readStrongBinder());
                    zzasb.zzc(parcel);
                    zzl(readString8, readString9, zzlVar4, asInterface7, zzbwxVar, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzasb.zzc(parcel);
                    zzp(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwyVar = queryLocalInterface6 instanceof zzbxa ? (zzbxa) queryLocalInterface6 : new zzbwy(readStrongBinder6);
                    }
                    zzbxa zzbxaVar2 = zzbwyVar;
                    zzbvq zzb5 = zzbvp.zzb(parcel.readStrongBinder());
                    zzasb.zzc(parcel);
                    zzn(readString11, readString12, zzlVar5, asInterface8, zzbxaVar2, zzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwpVar = queryLocalInterface7 instanceof zzbwr ? (zzbwr) queryLocalInterface7 : new zzbwp(readStrongBinder7);
                    }
                    zzbwr zzbwrVar2 = zzbwpVar;
                    zzbvq zzb6 = zzbvp.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzasb.zzc(parcel);
                    zzj(readString13, readString14, zzlVar6, asInterface9, zzbwrVar2, zzb6, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzasb.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwvVar = queryLocalInterface8 instanceof zzbwx ? (zzbwx) queryLocalInterface8 : new zzbwv(readStrongBinder8);
                    }
                    zzbwx zzbwxVar2 = zzbwvVar;
                    zzbvq zzb7 = zzbvp.zzb(parcel.readStrongBinder());
                    zzbls zzblsVar = (zzbls) zzasb.zza(parcel, zzbls.CREATOR);
                    zzasb.zzc(parcel);
                    zzm(readString15, readString16, zzlVar7, asInterface10, zzbwxVar2, zzb7, zzblsVar);
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzasb.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}

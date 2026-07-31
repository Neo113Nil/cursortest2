package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public abstract class zzbxs extends zzbev implements zzbxt {
    public zzbxs() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbxt zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbxt ? (zzbxt) queryLocalInterface : new zzbxr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbxw zzbxwVar = null;
        zzbxe zzbxcVar = null;
        zzbxn zzbxlVar = null;
        zzbxh zzbxfVar = null;
        zzbxq zzbxoVar = null;
        zzbxn zzbxlVar2 = null;
        zzbxq zzbxoVar2 = null;
        zzbxk zzbxiVar = null;
        zzbxh zzbxfVar2 = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzbew.zzb(parcel, creator);
            Bundle bundle2 = (Bundle) zzbew.zzb(parcel, creator);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbxwVar = queryLocalInterface instanceof zzbxw ? (zzbxw) queryLocalInterface : new zzbxu(readStrongBinder);
            }
            zzbxw zzbxwVar2 = zzbxwVar;
            zzbew.zzh(parcel);
            zze(asInterface, readString, bundle, bundle2, zzrVar, zzbxwVar2);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbyi zzf = zzf();
            parcel2.writeNoException();
            zzbew.zzd(parcel2, zzf);
        } else if (i == 3) {
            zzbyi zzg = zzg();
            parcel2.writeNoException();
            zzbew.zzd(parcel2, zzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzea zzh = zzh();
            parcel2.writeNoException();
            zzbew.zze(parcel2, zzh);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbew.zzh(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbxfVar2 = queryLocalInterface2 instanceof zzbxh ? (zzbxh) queryLocalInterface2 : new zzbxf(readStrongBinder2);
                    }
                    zzbxh zzbxhVar = zzbxfVar2;
                    zzbwa zzdR = zzbvz.zzdR(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzbew.zzh(parcel);
                    zzi(readString2, readString3, zzmVar, asInterface2, zzbxhVar, zzdR, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbxiVar = queryLocalInterface3 instanceof zzbxk ? (zzbxk) queryLocalInterface3 : new zzbxi(readStrongBinder3);
                    }
                    zzbxk zzbxkVar = zzbxiVar;
                    zzbwa zzdR2 = zzbvz.zzdR(parcel.readStrongBinder());
                    zzbew.zzh(parcel);
                    zzj(readString4, readString5, zzmVar2, asInterface3, zzbxkVar, zzdR2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbew.zzh(parcel);
                    boolean zzk = zzk(asInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzk ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbxoVar2 = queryLocalInterface4 instanceof zzbxq ? (zzbxq) queryLocalInterface4 : new zzbxo(readStrongBinder4);
                    }
                    zzbxq zzbxqVar = zzbxoVar2;
                    zzbwa zzdR3 = zzbvz.zzdR(parcel.readStrongBinder());
                    zzbew.zzh(parcel);
                    zzl(readString6, readString7, zzmVar3, asInterface5, zzbxqVar, zzdR3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbew.zzh(parcel);
                    boolean zzm = zzm(asInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzm ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbxlVar2 = queryLocalInterface5 instanceof zzbxn ? (zzbxn) queryLocalInterface5 : new zzbxl(readStrongBinder5);
                    }
                    zzbxn zzbxnVar = zzbxlVar2;
                    zzbwa zzdR4 = zzbvz.zzdR(parcel.readStrongBinder());
                    zzbew.zzh(parcel);
                    zzn(readString8, readString9, zzmVar4, asInterface7, zzbxnVar, zzdR4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzbew.zzh(parcel);
                    zzo(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbxoVar = queryLocalInterface6 instanceof zzbxq ? (zzbxq) queryLocalInterface6 : new zzbxo(readStrongBinder6);
                    }
                    zzbxq zzbxqVar2 = zzbxoVar;
                    zzbwa zzdR5 = zzbvz.zzdR(parcel.readStrongBinder());
                    zzbew.zzh(parcel);
                    zzp(readString11, readString12, zzmVar5, asInterface8, zzbxqVar2, zzdR5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbxfVar = queryLocalInterface7 instanceof zzbxh ? (zzbxh) queryLocalInterface7 : new zzbxf(readStrongBinder7);
                    }
                    zzbxh zzbxhVar2 = zzbxfVar;
                    zzbwa zzdR6 = zzbvz.zzdR(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzbew.zzh(parcel);
                    zzq(readString13, readString14, zzmVar6, asInterface9, zzbxhVar2, zzdR6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbxlVar = queryLocalInterface8 instanceof zzbxn ? (zzbxn) queryLocalInterface8 : new zzbxl(readStrongBinder8);
                    }
                    zzbxn zzbxnVar2 = zzbxlVar;
                    zzbwa zzdR7 = zzbvz.zzdR(parcel.readStrongBinder());
                    zzbmk zzbmkVar = (zzbmk) zzbew.zzb(parcel, zzbmk.CREATOR);
                    zzbew.zzh(parcel);
                    zzr(readString15, readString16, zzmVar7, asInterface10, zzbxnVar2, zzdR7, zzbmkVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbxcVar = queryLocalInterface9 instanceof zzbxe ? (zzbxe) queryLocalInterface9 : new zzbxc(readStrongBinder9);
                    }
                    zzbxe zzbxeVar = zzbxcVar;
                    zzbwa zzdR8 = zzbvz.zzdR(parcel.readStrongBinder());
                    zzbew.zzh(parcel);
                    zzs(readString17, readString18, zzmVar8, asInterface11, zzbxeVar, zzdR8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbew.zzh(parcel);
                    boolean zzt = zzt(asInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzbew.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}

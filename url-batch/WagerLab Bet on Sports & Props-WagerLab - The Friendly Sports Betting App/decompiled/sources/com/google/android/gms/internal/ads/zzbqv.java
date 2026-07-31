package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbqv extends zzaya implements zzbqw {
    public zzbqv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbqw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbqw ? (zzbqw) queryLocalInterface : new zzbqu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbqz zzbqzVar = null;
        zzbqh zzbqhVar = null;
        zzbqq zzbqqVar = null;
        zzbqk zzbqkVar = null;
        zzbqt zzbqrVar = null;
        zzbqq zzbqqVar2 = null;
        zzbqt zzbqrVar2 = null;
        zzbqn zzbqnVar = null;
        zzbqk zzbqkVar2 = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbqzVar = queryLocalInterface instanceof zzbqz ? (zzbqz) queryLocalInterface : new zzbqx(readStrongBinder);
            }
            zzayb.zzh(parcel);
            zze(asInterface, readString, bundle, bundle2, zzrVar, zzbqzVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbrl zzf = zzf();
            parcel2.writeNoException();
            zzayb.zzd(parcel2, zzf);
        } else if (i == 3) {
            zzbrl zzg = zzg();
            parcel2.writeNoException();
            zzayb.zzd(parcel2, zzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzed zzh = zzh();
            parcel2.writeNoException();
            zzayb.zze(parcel2, zzh);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqkVar2 = queryLocalInterface2 instanceof zzbqk ? (zzbqk) queryLocalInterface2 : new zzbqi(readStrongBinder2);
                    }
                    zzbpd zzb = zzbpc.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzayb.zzh(parcel);
                    zzi(readString2, readString3, zzmVar, asInterface2, zzbqkVar2, zzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbqnVar = queryLocalInterface3 instanceof zzbqn ? (zzbqn) queryLocalInterface3 : new zzbql(readStrongBinder3);
                    }
                    zzbpd zzb2 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzj(readString4, readString5, zzmVar2, asInterface3, zzbqnVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zzk = zzk(asInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzk ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqrVar2 = queryLocalInterface4 instanceof zzbqt ? (zzbqt) queryLocalInterface4 : new zzbqr(readStrongBinder4);
                    }
                    zzbqt zzbqtVar = zzbqrVar2;
                    zzbpd zzb3 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzl(readString6, readString7, zzmVar3, asInterface5, zzbqtVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zzm = zzm(asInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzm ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqqVar2 = queryLocalInterface5 instanceof zzbqq ? (zzbqq) queryLocalInterface5 : new zzbqo(readStrongBinder5);
                    }
                    zzbpd zzb4 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzn(readString8, readString9, zzmVar4, asInterface7, zzbqqVar2, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzayb.zzh(parcel);
                    zzo(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbqrVar = queryLocalInterface6 instanceof zzbqt ? (zzbqt) queryLocalInterface6 : new zzbqr(readStrongBinder6);
                    }
                    zzbqt zzbqtVar2 = zzbqrVar;
                    zzbpd zzb5 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzp(readString11, readString12, zzmVar5, asInterface8, zzbqtVar2, zzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbqkVar = queryLocalInterface7 instanceof zzbqk ? (zzbqk) queryLocalInterface7 : new zzbqi(readStrongBinder7);
                    }
                    zzbpd zzb6 = zzbpc.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzayb.zzh(parcel);
                    zzq(readString13, readString14, zzmVar6, asInterface9, zzbqkVar, zzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbqqVar = queryLocalInterface8 instanceof zzbqq ? (zzbqq) queryLocalInterface8 : new zzbqo(readStrongBinder8);
                    }
                    zzbpd zzb7 = zzbpc.zzb(parcel.readStrongBinder());
                    zzbfl zzbflVar = (zzbfl) zzayb.zzb(parcel, zzbfl.CREATOR);
                    zzayb.zzh(parcel);
                    zzr(readString15, readString16, zzmVar7, asInterface10, zzbqqVar, zzb7, zzbflVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzayb.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbqhVar = queryLocalInterface9 instanceof zzbqh ? (zzbqh) queryLocalInterface9 : new zzbqf(readStrongBinder9);
                    }
                    zzbpd zzb8 = zzbpc.zzb(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    zzs(readString17, readString18, zzmVar8, asInterface11, zzbqhVar, zzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzayb.zzh(parcel);
                    boolean zzt = zzt(asInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzayb.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}

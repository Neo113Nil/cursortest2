package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzbvw extends zzbev implements zzbvx {
    public zzbvw() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbwa zzbwaVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface instanceof zzbwa ? (zzbwa) queryLocalInterface : new zzbvy(readStrongBinder);
                }
                zzbwa zzbwaVar2 = zzbwaVar;
                zzbew.zzh(parcel);
                zze(asInterface, zzrVar, zzmVar, readString, zzbwaVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zzf = zzf();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzf);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface2 instanceof zzbwa ? (zzbwa) queryLocalInterface2 : new zzbvy(readStrongBinder2);
                }
                zzbew.zzh(parcel);
                zzg(asInterface2, zzmVar2, readString2, zzbwaVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface3 instanceof zzbwa ? (zzbwa) queryLocalInterface3 : new zzbvy(readStrongBinder3);
                }
                zzbwa zzbwaVar3 = zzbwaVar;
                zzbew.zzh(parcel);
                zzj(asInterface3, zzrVar2, zzmVar3, readString3, readString4, zzbwaVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface4 instanceof zzbwa ? (zzbwa) queryLocalInterface4 : new zzbvy(readStrongBinder4);
                }
                zzbwa zzbwaVar4 = zzbwaVar;
                zzbew.zzh(parcel);
                zzk(asInterface4, zzmVar4, readString5, readString6, zzbwaVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString7 = parcel.readString();
                zzccs zzdS = zzccr.zzdS(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzbew.zzh(parcel);
                zzn(asInterface5, zzmVar5, readString7, zzdS, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString9 = parcel.readString();
                zzbew.zzh(parcel);
                zzo(zzmVar6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i3 = zzbew.zza;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface5 instanceof zzbwa ? (zzbwa) queryLocalInterface5 : new zzbvy(readStrongBinder5);
                }
                zzbwa zzbwaVar5 = zzbwaVar;
                zzbmk zzbmkVar = (zzbmk) zzbew.zzb(parcel, zzbmk.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zzbew.zzh(parcel);
                zzr(asInterface6, zzmVar7, readString10, readString11, zzbwaVar5, zzbmkVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzbew.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzbew.zze(parcel2, null);
                return true;
            case 17:
                Bundle zzs = zzs();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzs);
                return true;
            case 18:
                Bundle zzt = zzt();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzt);
                return true;
            case 19:
                Bundle zzu = zzu();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzu);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzbew.zzh(parcel);
                zzv(zzmVar8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzw(asInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzbew.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzccs zzdS2 = zzccr.zzdS(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zzbew.zzh(parcel);
                zzy(asInterface8, zzdS2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbnm zzz = zzz();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzz);
                return true;
            case 25:
                boolean zza = zzbew.zza(parcel);
                zzbew.zzh(parcel);
                zzA(zza);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea zzB = zzB();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzB);
                return true;
            case 27:
                zzbwj zzC = zzC();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzC);
                return true;
            case 28:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface6 instanceof zzbwa ? (zzbwa) queryLocalInterface6 : new zzbvy(readStrongBinder6);
                }
                zzbew.zzh(parcel);
                zzD(asInterface9, zzmVar9, readString14, zzbwaVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzE(asInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsl zza2 = zzbsk.zza(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbsr.CREATOR);
                zzbew.zzh(parcel);
                zzF(asInterface11, zza2, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface7 instanceof zzbwa ? (zzbwa) queryLocalInterface7 : new zzbvy(readStrongBinder7);
                }
                zzbew.zzh(parcel);
                zzG(asInterface12, zzmVar10, readString15, zzbwaVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbyi zzH = zzH();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzH);
                return true;
            case 34:
                zzbyi zzI = zzI();
                parcel2.writeNoException();
                zzbew.zzd(parcel2, zzI);
                return true;
            case 35:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface8 instanceof zzbwa ? (zzbwa) queryLocalInterface8 : new zzbvy(readStrongBinder8);
                }
                zzbwa zzbwaVar6 = zzbwaVar;
                zzbew.zzh(parcel);
                zzJ(asInterface13, zzrVar3, zzmVar11, readString16, readString17, zzbwaVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbwd zzK = zzK();
                parcel2.writeNoException();
                zzbew.zze(parcel2, zzK);
                return true;
            case 37:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzL(asInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzbew.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbwaVar = queryLocalInterface9 instanceof zzbwa ? (zzbwa) queryLocalInterface9 : new zzbvy(readStrongBinder9);
                }
                zzbew.zzh(parcel);
                zzM(asInterface15, zzmVar12, readString18, zzbwaVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbew.zzh(parcel);
                zzN(asInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}

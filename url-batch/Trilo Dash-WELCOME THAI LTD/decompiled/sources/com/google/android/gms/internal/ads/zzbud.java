package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbud extends zzaqv implements zzbuf {
    zzbud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zze() throws RemoteException {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzf() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzi(int i, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzj(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzm() throws RemoteException {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzn() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzo() throws RemoteException {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzp() throws RemoteException {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzr(zzblu zzbluVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbluVar);
        zza.writeString(str);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzs(zzcaw zzcawVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzt(zzcba zzcbaVar) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcbaVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzu() throws RemoteException {
        zzbl(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzv() throws RemoteException {
        zzbl(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzw() throws RemoteException {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzx() throws RemoteException {
        zzbl(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzy() throws RemoteException {
        zzbl(13, zza());
    }
}

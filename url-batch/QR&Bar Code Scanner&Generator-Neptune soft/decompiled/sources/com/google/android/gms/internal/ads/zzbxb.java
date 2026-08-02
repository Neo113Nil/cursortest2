package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbxb extends zzarz implements zzbxd {
    zzbxb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final com.google.android.gms.ads.internal.client.zzdk zze() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final zzbxq zzf() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        zzbxq zzbxqVar = (zzbxq) zzasb.zza(zzbk, zzbxq.CREATOR);
        zzbk.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final zzbxq zzg() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        zzbxq zzbxqVar = (zzbxq) zzasb.zza(zzbk, zzbxq.CREATOR);
        zzbk.recycle();
        return zzbxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbxg zzbxgVar) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzasb.zze(zza, bundle);
        zzasb.zze(zza, bundle2);
        zzasb.zze(zza, zzqVar);
        zzasb.zzg(zza, zzbxgVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwr zzbwrVar, zzbvq zzbvqVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbwrVar);
        zzasb.zzg(zza, zzbvqVar);
        zzasb.zze(zza, zzqVar);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwr zzbwrVar, zzbvq zzbvqVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbwrVar);
        zzasb.zzg(zza, zzbvqVar);
        zzasb.zze(zza, zzqVar);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwu zzbwuVar, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbwuVar);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwx zzbwxVar, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbwxVar);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwx zzbwxVar, zzbvq zzbvqVar, zzbls zzblsVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbwxVar);
        zzasb.zzg(zza, zzbvqVar);
        zzasb.zze(zza, zzblsVar);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbxa zzbxaVar, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbxaVar);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbxa zzbxaVar, zzbvq zzbvqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasb.zze(zza, zzlVar);
        zzasb.zzg(zza, iObjectWrapper);
        zzasb.zzg(zza, zzbxaVar);
        zzasb.zzg(zza, zzbvqVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzp(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final boolean zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(15, zza);
        boolean zzh = zzasb.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasb.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(17, zza);
        boolean zzh = zzasb.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}

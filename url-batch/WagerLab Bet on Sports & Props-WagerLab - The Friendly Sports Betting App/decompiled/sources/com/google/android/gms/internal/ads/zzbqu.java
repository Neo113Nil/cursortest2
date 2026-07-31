package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbqu extends zzaxz implements zzbqw {
    zzbqu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbqz zzbqzVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzayb.zzc(zza, bundle);
        zzayb.zzc(zza, bundle2);
        zzayb.zzc(zza, zzrVar);
        zzayb.zze(zza, zzbqzVar);
        zzdf(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final zzbrl zzf() throws RemoteException {
        Parcel zzde = zzde(2, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(zzde, zzbrl.CREATOR);
        zzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final zzbrl zzg() throws RemoteException {
        Parcel zzde = zzde(3, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(zzde, zzbrl.CREATOR);
        zzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        Parcel zzde = zzde(5, zza());
        com.google.android.gms.ads.internal.client.zzed zzb = com.google.android.gms.ads.internal.client.zzec.zzb(zzde.readStrongBinder());
        zzde.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqk zzbqkVar, zzbpd zzbpdVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbqkVar);
        zzayb.zze(zza, zzbpdVar);
        zzayb.zzc(zza, zzrVar);
        zzdf(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqn zzbqnVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbqnVar);
        zzayb.zze(zza, zzbpdVar);
        zzdf(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        Parcel zzde = zzde(15, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqt zzbqtVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbqtVar);
        zzayb.zze(zza, zzbpdVar);
        zzdf(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        Parcel zzde = zzde(17, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqq zzbqqVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbqqVar);
        zzayb.zze(zza, zzbpdVar);
        zzdf(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzo(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdf(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqt zzbqtVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbqtVar);
        zzayb.zze(zza, zzbpdVar);
        zzdf(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqk zzbqkVar, zzbpd zzbpdVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbqkVar);
        zzayb.zze(zza, zzbpdVar);
        zzayb.zzc(zza, zzrVar);
        zzdf(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqq zzbqqVar, zzbpd zzbpdVar, zzbfl zzbflVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbqqVar);
        zzayb.zze(zza, zzbpdVar);
        zzayb.zzc(zza, zzbflVar);
        zzdf(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqh zzbqhVar, zzbpd zzbpdVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayb.zzc(zza, zzmVar);
        zzayb.zze(zza, iObjectWrapper);
        zzayb.zze(zza, zzbqhVar);
        zzayb.zze(zza, zzbpdVar);
        zzdf(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        Parcel zzde = zzde(24, zza);
        boolean zza2 = zzayb.zza(zzde);
        zzde.recycle();
        return zza2;
    }
}

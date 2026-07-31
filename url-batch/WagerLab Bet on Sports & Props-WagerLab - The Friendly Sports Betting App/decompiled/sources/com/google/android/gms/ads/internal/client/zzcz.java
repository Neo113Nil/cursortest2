package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbox;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzcz extends zzaxz implements zzdb {
    zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzf(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzdf(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayb.zza;
        zza.writeInt(z ? 1 : 0);
        zzdf(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zzdf(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzayb.zze(zza, iObjectWrapper);
        zzdf(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final float zzk() throws RemoteException {
        Parcel zzde = zzde(7, zza());
        float readFloat = zzde.readFloat();
        zzde.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final boolean zzl() throws RemoteException {
        Parcel zzde = zzde(8, zza());
        boolean zza = zzayb.zza(zzde);
        zzde.recycle();
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() throws RemoteException {
        Parcel zzde = zzde(9, zza());
        String readString = zzde.readString();
        zzde.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdf(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbox zzboxVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzboxVar);
        zzdf(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzblr zzblrVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzblrVar);
        zzdf(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() throws RemoteException {
        Parcel zzde = zzde(13, zza());
        ArrayList createTypedArrayList = zzde.createTypedArrayList(zzblk.CREATOR);
        zzde.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(zzfv zzfvVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zzc(zza, zzfvVar);
        zzdf(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() throws RemoteException {
        zzdf(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(zzdn zzdnVar) throws RemoteException {
        Parcel zza = zza();
        zzayb.zze(zza, zzdnVar);
        zzdf(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayb.zza;
        zza.writeInt(z ? 1 : 0);
        zzdf(17, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzdf(18, zza);
    }
}

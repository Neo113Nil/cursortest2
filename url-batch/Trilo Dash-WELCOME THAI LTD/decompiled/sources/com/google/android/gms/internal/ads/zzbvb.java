package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbvb extends zzbue {
    private final Adapter zza;
    private final zzcav zzb;

    zzbvb(Adapter adapter, zzcav zzcavVar) {
        this.zza = adapter;
        this.zzb = zzcavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zze() throws RemoteException {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzf() throws RemoteException {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzg(int i) throws RemoteException {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzo() throws RemoteException {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzp() throws RemoteException {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzr(zzblu zzbluVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzs(zzcaw zzcawVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzt(zzcba zzcbaVar) throws RemoteException {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzm(ObjectWrapper.wrap(this.zza), new zzcaw(zzcbaVar.zzf(), zzcbaVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzu() throws RemoteException {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void zzy() throws RemoteException {
        zzcav zzcavVar = this.zzb;
        if (zzcavVar != null) {
            zzcavVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbwm extends zzbvp {
    private final Adapter zza;
    private final zzccd zzb;

    zzbwm(Adapter adapter, zzccd zzccdVar) {
        this.zza = adapter;
        this.zzb = zzccdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zze() throws RemoteException {
        zzccd zzccdVar = this.zzb;
        if (zzccdVar != null) {
            zzccdVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzf() throws RemoteException {
        zzccd zzccdVar = this.zzb;
        if (zzccdVar != null) {
            zzccdVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzg(int i) throws RemoteException {
        zzccd zzccdVar = this.zzb;
        if (zzccdVar != null) {
            zzccdVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzo() throws RemoteException {
        zzccd zzccdVar = this.zzb;
        if (zzccdVar != null) {
            zzccdVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzp() throws RemoteException {
        zzccd zzccdVar = this.zzb;
        if (zzccdVar != null) {
            zzccdVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzr(zzbmy zzbmyVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzs(zzcce zzcceVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzt(zzcci zzcciVar) throws RemoteException {
        zzccd zzccdVar = this.zzb;
        if (zzccdVar != null) {
            zzccdVar.zzm(ObjectWrapper.wrap(this.zza), new zzcce(zzcciVar.zzf(), zzcciVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzu() throws RemoteException {
        zzccd zzccdVar = this.zzb;
        if (zzccdVar != null) {
            zzccdVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final void zzy() throws RemoteException {
        zzccd zzccdVar = this.zzb;
        if (zzccdVar != null) {
            zzccdVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}

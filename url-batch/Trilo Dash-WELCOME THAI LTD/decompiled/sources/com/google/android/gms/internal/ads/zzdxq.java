package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzdxq extends com.google.android.gms.ads.internal.client.zzbe {
    final /* synthetic */ zzdxk zza;
    final /* synthetic */ zzdxr zzb;

    zzdxq(zzdxr zzdxrVar, zzdxk zzdxkVar) {
        this.zzb = zzdxrVar;
        this.zza = zzdxkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzc() throws RemoteException {
        long j;
        zzdxk zzdxkVar = this.zza;
        j = this.zzb.zza;
        zzdxkVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzd() throws RemoteException {
        long j;
        zzdxk zzdxkVar = this.zza;
        j = this.zzb.zza;
        zzdxkVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zze(int i) throws RemoteException {
        long j;
        zzdxk zzdxkVar = this.zza;
        j = this.zzb.zza;
        zzdxkVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdxk zzdxkVar = this.zza;
        j = this.zzb.zza;
        zzdxkVar.zzd(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzi() throws RemoteException {
        long j;
        zzdxk zzdxkVar = this.zza;
        j = this.zzb.zza;
        zzdxkVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzj() throws RemoteException {
        long j;
        zzdxk zzdxkVar = this.zza;
        j = this.zzb.zza;
        zzdxkVar.zzg(j);
    }
}

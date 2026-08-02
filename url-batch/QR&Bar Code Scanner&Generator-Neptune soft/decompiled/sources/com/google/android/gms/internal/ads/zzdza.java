package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdza extends com.google.android.gms.ads.internal.client.zzbe {
    final /* synthetic */ zzdyu zza;
    final /* synthetic */ zzdzb zzb;

    zzdza(zzdzb zzdzbVar, zzdyu zzdyuVar) {
        this.zzb = zzdzbVar;
        this.zza = zzdyuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzc() throws RemoteException {
        long j;
        zzdyu zzdyuVar = this.zza;
        j = this.zzb.zza;
        zzdyuVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzd() throws RemoteException {
        long j;
        zzdyu zzdyuVar = this.zza;
        j = this.zzb.zza;
        zzdyuVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zze(int i) throws RemoteException {
        long j;
        zzdyu zzdyuVar = this.zza;
        j = this.zzb.zza;
        zzdyuVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdyu zzdyuVar = this.zza;
        j = this.zzb.zza;
        zzdyuVar.zzd(j, zzeVar.zza);
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
        zzdyu zzdyuVar = this.zza;
        j = this.zzb.zza;
        zzdyuVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzj() throws RemoteException {
        long j;
        zzdyu zzdyuVar = this.zza;
        j = this.zzb.zza;
        zzdyuVar.zzg(j);
    }
}

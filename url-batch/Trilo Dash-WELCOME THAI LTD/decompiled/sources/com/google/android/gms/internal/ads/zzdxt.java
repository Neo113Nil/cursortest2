package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzdxt extends zzcbj {
    final /* synthetic */ zzdxv zza;

    zzdxt(zzdxv zzdxvVar) {
        this.zza = zzdxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zze(int i) throws RemoteException {
        zzdxk zzdxkVar;
        long j;
        zzdxv zzdxvVar = this.zza;
        zzdxkVar = zzdxvVar.zzc;
        j = zzdxvVar.zza;
        zzdxkVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdxk zzdxkVar;
        long j;
        zzdxv zzdxvVar = this.zza;
        zzdxkVar = zzdxvVar.zzc;
        j = zzdxvVar.zza;
        zzdxkVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzg() throws RemoteException {
        zzdxk zzdxkVar;
        long j;
        zzdxv zzdxvVar = this.zza;
        zzdxkVar = zzdxvVar.zzc;
        j = zzdxvVar.zza;
        zzdxkVar.zzp(j);
    }
}

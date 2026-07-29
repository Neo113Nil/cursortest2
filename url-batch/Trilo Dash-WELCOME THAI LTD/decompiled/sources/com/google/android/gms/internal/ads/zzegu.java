package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzegu extends zzbue implements zzddc {
    private zzbuf zza;
    private zzddb zzb;

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zza(zzddb zzddbVar) {
        this.zzb = zzddbVar;
    }

    public final synchronized void zzc(zzbuf zzbufVar) {
        this.zza = zzbufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zze() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzf() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzg(int i) throws RemoteException {
        zzddb zzddbVar = this.zzb;
        if (zzddbVar != null) {
            zzddbVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzddb zzddbVar = this.zzb;
        if (zzddbVar != null) {
            zzddbVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzi(int i, String str) throws RemoteException {
        zzddb zzddbVar = this.zzb;
        if (zzddbVar != null) {
            zzddbVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzj(int i) throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzj(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzl(String str) throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzm() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzn() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzo() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzo();
        }
        zzddb zzddbVar = this.zzb;
        if (zzddbVar != null) {
            zzddbVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzp() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzr(zzblu zzbluVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzs(zzcaw zzcawVar) throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzs(zzcawVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzt(zzcba zzcbaVar) throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzt(zzcbaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzu() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzv() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzw() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzx() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzy() throws RemoteException {
        zzbuf zzbufVar = this.zza;
        if (zzbufVar != null) {
            zzbufVar.zzy();
        }
    }
}

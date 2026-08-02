package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zznr {
    private final Handler zza;
    private final zzns zzb;

    public zznr(Handler handler, zzns zznsVar) {
        this.zza = zznsVar == null ? null : handler;
        this.zzb = zznsVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznh
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznn
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznm
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzj(str, j, j2);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzno
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzgs zzgsVar) {
        zzgsVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzni
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzl(zzgsVar);
                }
            });
        }
    }

    public final void zzf(final zzgs zzgsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznj
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzm(zzgsVar);
                }
            });
        }
    }

    public final void zzg(final zzaf zzafVar, final zzgt zzgtVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznp
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzn(zzafVar, zzgtVar);
                }
            });
        }
    }

    final /* synthetic */ void zzh(Exception exc) {
        zzns zznsVar = this.zzb;
        int i = zzen.zza;
        zznsVar.zzb(exc);
    }

    final /* synthetic */ void zzi(Exception exc) {
        zzns zznsVar = this.zzb;
        int i = zzen.zza;
        zznsVar.zzi(exc);
    }

    final /* synthetic */ void zzj(String str, long j, long j2) {
        zzns zznsVar = this.zzb;
        int i = zzen.zza;
        zznsVar.zzc(str, j, j2);
    }

    final /* synthetic */ void zzk(String str) {
        zzns zznsVar = this.zzb;
        int i = zzen.zza;
        zznsVar.zzd(str);
    }

    final /* synthetic */ void zzl(zzgs zzgsVar) {
        zzgsVar.zza();
        zzns zznsVar = this.zzb;
        int i = zzen.zza;
        zznsVar.zze(zzgsVar);
    }

    final /* synthetic */ void zzm(zzgs zzgsVar) {
        zzns zznsVar = this.zzb;
        int i = zzen.zza;
        zznsVar.zzf(zzgsVar);
    }

    final /* synthetic */ void zzn(zzaf zzafVar, zzgt zzgtVar) {
        int i = zzen.zza;
        this.zzb.zzg(zzafVar, zzgtVar);
    }

    final /* synthetic */ void zzo(long j) {
        zzns zznsVar = this.zzb;
        int i = zzen.zza;
        zznsVar.zzh(j);
    }

    final /* synthetic */ void zzp(boolean z) {
        zzns zznsVar = this.zzb;
        int i = zzen.zza;
        zznsVar.zzm(z);
    }

    final /* synthetic */ void zzq(int i, long j, long j2) {
        zzns zznsVar = this.zzb;
        int i2 = zzen.zza;
        zznsVar.zzj(i, j, j2);
    }

    public final void zzr(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznk
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzo(j);
                }
            });
        }
    }

    public final void zzs(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznl
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzp(z);
                }
            });
        }
    }

    public final void zzt(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznq
                @Override // java.lang.Runnable
                public final void run() {
                    zznr.this.zzq(i, j, j2);
                }
            });
        }
    }
}

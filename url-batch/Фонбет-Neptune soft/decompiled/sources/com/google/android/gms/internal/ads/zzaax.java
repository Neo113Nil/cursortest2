package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaax {
    private final Handler zza;
    private final zzaay zzb;

    public zzaax(Handler handler, zzaay zzaayVar) {
        this.zza = zzaayVar == null ? null : handler;
        this.zzb = zzaayVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaan
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaw
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzhn zzhnVar) {
        zzhnVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaav
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzi(zzhnVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaap
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzhn zzhnVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaat
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzk(zzhnVar);
                }
            });
        }
    }

    public final void zzf(final zzaf zzafVar, final zzho zzhoVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaau
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzl(zzafVar, zzhoVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, long j, long j2) {
        int i = zzet.zza;
        this.zzb.zzp(str, j, j2);
    }

    final /* synthetic */ void zzh(String str) {
        int i = zzet.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzi(zzhn zzhnVar) {
        zzhnVar.zza();
        int i = zzet.zza;
        this.zzb.zzr(zzhnVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        int i2 = zzet.zza;
        this.zzb.zzl(i, j);
    }

    final /* synthetic */ void zzk(zzhn zzhnVar) {
        int i = zzet.zza;
        this.zzb.zzs(zzhnVar);
    }

    final /* synthetic */ void zzl(zzaf zzafVar, zzho zzhoVar) {
        int i = zzet.zza;
        this.zzb.zzu(zzafVar, zzhoVar);
    }

    final /* synthetic */ void zzm(Object obj, long j) {
        int i = zzet.zza;
        this.zzb.zzm(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        int i2 = zzet.zza;
        this.zzb.zzt(j, i);
    }

    final /* synthetic */ void zzo(Exception exc) {
        int i = zzet.zza;
        this.zzb.zzo(exc);
    }

    final /* synthetic */ void zzp(zzcp zzcpVar) {
        int i = zzet.zza;
        this.zzb.zzv(zzcpVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaq
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaar
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaas
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzcp zzcpVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaao
                @Override // java.lang.Runnable
                public final void run() {
                    zzaax.this.zzp(zzcpVar);
                }
            });
        }
    }
}

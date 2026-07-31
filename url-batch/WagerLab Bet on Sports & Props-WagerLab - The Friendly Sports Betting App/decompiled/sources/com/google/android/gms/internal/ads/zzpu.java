package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzpu {
    private final Handler zza;
    private final zzpv zzb;

    public zzpu(Handler handler, zzpv zzpvVar) {
        if (zzpvVar == null) {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzpvVar;
    }

    public final void zza(final zzhr zzhrVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzn(zzhrVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzo(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzu zzuVar, final zzhs zzhsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzp(zzuVar, zzhsVar);
                }
            });
        }
    }

    public final void zzd(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzq(j);
                }
            });
        }
    }

    public final void zze(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzr(i, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzs(str);
                }
            });
        }
    }

    public final void zzg(final zzhr zzhrVar) {
        zzhrVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzt(zzhrVar);
                }
            });
        }
    }

    public final void zzh(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzu(z);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzv(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzw(exc);
                }
            });
        }
    }

    public final void zzk(final zzpw zzpwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzps
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzx(zzpwVar);
                }
            });
        }
    }

    public final void zzl(final zzpw zzpwVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzy(zzpwVar);
                }
            });
        }
    }

    public final void zzm(final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzpu.this.zzz(i);
                }
            });
        }
    }

    final /* synthetic */ void zzn(zzhr zzhrVar) {
        String str = zzeo.zza;
        this.zzb.zzk(zzhrVar);
    }

    final /* synthetic */ void zzo(String str, long j, long j2) {
        String str2 = zzeo.zza;
        this.zzb.zzl(str, j, j2);
    }

    final /* synthetic */ void zzp(zzu zzuVar, zzhs zzhsVar) {
        String str = zzeo.zza;
        this.zzb.zzm(zzuVar, zzhsVar);
    }

    final /* synthetic */ void zzq(long j) {
        String str = zzeo.zza;
        this.zzb.zzn(j);
    }

    final /* synthetic */ void zzr(int i, long j, long j2) {
        String str = zzeo.zza;
        this.zzb.zzo(i, j, j2);
    }

    final /* synthetic */ void zzs(String str) {
        String str2 = zzeo.zza;
        this.zzb.zzp(str);
    }

    final /* synthetic */ void zzt(zzhr zzhrVar) {
        zzhrVar.zza();
        String str = zzeo.zza;
        this.zzb.zzq(zzhrVar);
    }

    final /* synthetic */ void zzu(boolean z) {
        String str = zzeo.zza;
        this.zzb.zzr(z);
    }

    final /* synthetic */ void zzv(Exception exc) {
        String str = zzeo.zza;
        this.zzb.zzs(exc);
    }

    final /* synthetic */ void zzw(Exception exc) {
        String str = zzeo.zza;
        this.zzb.zzt(exc);
    }

    final /* synthetic */ void zzx(zzpw zzpwVar) {
        String str = zzeo.zza;
        this.zzb.zzu(zzpwVar);
    }

    final /* synthetic */ void zzy(zzpw zzpwVar) {
        String str = zzeo.zza;
        this.zzb.zzv(zzpwVar);
    }

    final /* synthetic */ void zzz(int i) {
        String str = zzeo.zza;
        this.zzb.zzw(i);
    }
}

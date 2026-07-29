package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzxq {
    private final Handler zza;
    private final zzxr zzb;

    public zzxq(Handler handler, zzxr zzxrVar) {
        this.zza = zzxrVar == null ? null : handler;
        this.zzb = zzxrVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxm
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxp
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzgm zzgmVar) {
        zzgmVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxl
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzi(zzgmVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxg
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzgm zzgmVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzk(zzgmVar);
                }
            });
        }
    }

    public final void zzf(final zzad zzadVar, final zzgn zzgnVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxn
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzl(zzadVar, zzgnVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, long j, long j2) {
        zzxr zzxrVar = this.zzb;
        int i = zzeg.zza;
        zzxrVar.zzp(str, j, j2);
    }

    final /* synthetic */ void zzh(String str) {
        zzxr zzxrVar = this.zzb;
        int i = zzeg.zza;
        zzxrVar.zzq(str);
    }

    final /* synthetic */ void zzi(zzgm zzgmVar) {
        zzgmVar.zza();
        zzxr zzxrVar = this.zzb;
        int i = zzeg.zza;
        zzxrVar.zzr(zzgmVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        zzxr zzxrVar = this.zzb;
        int i2 = zzeg.zza;
        zzxrVar.zzl(i, j);
    }

    final /* synthetic */ void zzk(zzgm zzgmVar) {
        zzxr zzxrVar = this.zzb;
        int i = zzeg.zza;
        zzxrVar.zzs(zzgmVar);
    }

    final /* synthetic */ void zzl(zzad zzadVar, zzgn zzgnVar) {
        int i = zzeg.zza;
        this.zzb.zzu(zzadVar, zzgnVar);
    }

    final /* synthetic */ void zzm(Object obj, long j) {
        zzxr zzxrVar = this.zzb;
        int i = zzeg.zza;
        zzxrVar.zzm(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        zzxr zzxrVar = this.zzb;
        int i2 = zzeg.zza;
        zzxrVar.zzt(j, i);
    }

    final /* synthetic */ void zzo(Exception exc) {
        zzxr zzxrVar = this.zzb;
        int i = zzeg.zza;
        zzxrVar.zzo(exc);
    }

    final /* synthetic */ void zzp(zzcv zzcvVar) {
        zzxr zzxrVar = this.zzb;
        int i = zzeg.zza;
        zzxrVar.zzv(zzcvVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxh
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxj
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxi
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzcv zzcvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxo
                @Override // java.lang.Runnable
                public final void run() {
                    zzxq.this.zzp(zzcvVar);
                }
            });
        }
    }
}

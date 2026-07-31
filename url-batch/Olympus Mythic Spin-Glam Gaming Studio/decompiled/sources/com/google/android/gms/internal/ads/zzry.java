package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzry {

    @Nullable
    private final Handler zza;

    @Nullable
    private final zzrz zzb;

    public zzry(@Nullable Handler handler, @Nullable zzrz zzrzVar) {
        this.zza = zzrzVar == null ? null : handler;
        this.zzb = zzrzVar;
    }

    final /* synthetic */ void zzA(int i) {
        String str = zzfm.zza;
        this.zzb.zzx(i);
    }

    final /* synthetic */ void zzB(zzjc zzjcVar) {
        String str = zzfm.zza;
        this.zzb.zzy(zzjcVar);
    }

    public final void zza(final zzje zzjeVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzo(zzjeVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzp(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, @Nullable final zzjf zzjfVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzro
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzq(zzvVar, zzjfVar);
                }
            });
        }
    }

    public final void zzd(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzr(j);
                }
            });
        }
    }

    public final void zze(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzs(i, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzt(str);
                }
            });
        }
    }

    public final void zzg(final zzje zzjeVar) {
        zzjeVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzu(zzjeVar);
                }
            });
        }
    }

    public final void zzh(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzv(z);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzru
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzw(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzx(exc);
                }
            });
        }
    }

    public final void zzk(final zzsc zzscVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzy(zzscVar);
                }
            });
        }
    }

    public final void zzl(final zzsc zzscVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzz(zzscVar);
                }
            });
        }
    }

    public final void zzm(final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzA(i);
                }
            });
        }
    }

    public final void zzn(final zzjc zzjcVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzry.this.zzB(zzjcVar);
                }
            });
        }
    }

    final /* synthetic */ void zzo(zzje zzjeVar) {
        String str = zzfm.zza;
        this.zzb.zzl(zzjeVar);
    }

    final /* synthetic */ void zzp(String str, long j, long j2) {
        String str2 = zzfm.zza;
        this.zzb.zzm(str, j, j2);
    }

    final /* synthetic */ void zzq(zzv zzvVar, zzjf zzjfVar) {
        String str = zzfm.zza;
        this.zzb.zzn(zzvVar, zzjfVar);
    }

    final /* synthetic */ void zzr(long j) {
        String str = zzfm.zza;
        this.zzb.zzo(j);
    }

    final /* synthetic */ void zzs(int i, long j, long j2) {
        String str = zzfm.zza;
        this.zzb.zzp(i, j, j2);
    }

    final /* synthetic */ void zzt(String str) {
        String str2 = zzfm.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzu(zzje zzjeVar) {
        zzjeVar.zza();
        String str = zzfm.zza;
        this.zzb.zzr(zzjeVar);
    }

    final /* synthetic */ void zzv(boolean z) {
        String str = zzfm.zza;
        this.zzb.zzs(z);
    }

    final /* synthetic */ void zzw(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzt(exc);
    }

    final /* synthetic */ void zzx(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzu(exc);
    }

    final /* synthetic */ void zzy(zzsc zzscVar) {
        String str = zzfm.zza;
        this.zzb.zzv(zzscVar);
    }

    final /* synthetic */ void zzz(zzsc zzscVar) {
        String str = zzfm.zza;
        this.zzb.zzw(zzscVar);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzyc {
    private final Handler zza;
    private final zzyd zzb;

    public zzyc(Handler handler, zzyd zzydVar) {
        this.zza = zzydVar == null ? null : handler;
        this.zzb = zzydVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxy
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyb
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzgs zzgsVar) {
        zzgsVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxx
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzi(zzgsVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxs
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzgs zzgsVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxw
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzk(zzgsVar);
                }
            });
        }
    }

    public final void zzf(final zzaf zzafVar, final zzgt zzgtVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxz
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzl(zzafVar, zzgtVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, long j, long j2) {
        zzyd zzydVar = this.zzb;
        int i = zzen.zza;
        zzydVar.zzo(str, j, j2);
    }

    final /* synthetic */ void zzh(String str) {
        zzyd zzydVar = this.zzb;
        int i = zzen.zza;
        zzydVar.zzp(str);
    }

    final /* synthetic */ void zzi(zzgs zzgsVar) {
        zzgsVar.zza();
        zzyd zzydVar = this.zzb;
        int i = zzen.zza;
        zzydVar.zzq(zzgsVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        zzyd zzydVar = this.zzb;
        int i2 = zzen.zza;
        zzydVar.zzk(i, j);
    }

    final /* synthetic */ void zzk(zzgs zzgsVar) {
        zzyd zzydVar = this.zzb;
        int i = zzen.zza;
        zzydVar.zzr(zzgsVar);
    }

    final /* synthetic */ void zzl(zzaf zzafVar, zzgt zzgtVar) {
        int i = zzen.zza;
        this.zzb.zzt(zzafVar, zzgtVar);
    }

    final /* synthetic */ void zzm(Object obj, long j) {
        zzyd zzydVar = this.zzb;
        int i = zzen.zza;
        zzydVar.zzl(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        zzyd zzydVar = this.zzb;
        int i2 = zzen.zza;
        zzydVar.zzs(j, i);
    }

    final /* synthetic */ void zzo(Exception exc) {
        zzyd zzydVar = this.zzb;
        int i = zzen.zza;
        zzydVar.zzn(exc);
    }

    final /* synthetic */ void zzp(zzda zzdaVar) {
        zzyd zzydVar = this.zzb;
        int i = zzen.zza;
        zzydVar.zzu(zzdaVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxt
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxv
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxu
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzda zzdaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzya
                @Override // java.lang.Runnable
                public final void run() {
                    zzyc.this.zzp(zzdaVar);
                }
            });
        }
    }
}

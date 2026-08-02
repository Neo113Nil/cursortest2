package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzxr {
    private final zzxd zza = new zzxd();
    private final zzxn zzb;
    private final zzxq zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzxr(Context context) {
        zzxn zzxnVar;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzen.zza;
            zzxnVar = zzxp.zzc(applicationContext);
            if (zzxnVar == null) {
                zzxnVar = zzxo.zzc(applicationContext);
            }
        } else {
            zzxnVar = null;
        }
        this.zzb = zzxnVar;
        this.zzc = zzxnVar != null ? zzxq.zza() : null;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzxr zzxrVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            zzxrVar.zzk = refreshRate;
            zzxrVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzdw.zze("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzxrVar.zzk = -9223372036854775807L;
            zzxrVar.zzl = -9223372036854775807L;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzen.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzxm.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (java.lang.Math.abs(r0 - r9.zzg) >= r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r5 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r9.zza.zzb() >= 30) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzm() {
        if (zzen.zza < 30 || this.zze == null) {
            return;
        }
        float zza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f = this.zzg;
        if (zza == f) {
            return;
        }
        boolean z = true;
        if (zza != -1.0f && f != -1.0f) {
            float f2 = 1.0f;
            if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                f2 = 0.02f;
            }
        } else if (zza == -1.0f) {
        }
        this.zzg = zza;
        zzn(false);
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzen.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzxm.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc = this.zzq + ((long) ((this.zza.zzc() * (this.zzm - this.zzp)) / this.zzi));
            if (Math.abs(j - zzc) <= 20000000) {
                j = zzc;
            } else {
                zzl();
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzxq zzxqVar = this.zzc;
        if (zzxqVar == null || this.zzk == -9223372036854775807L) {
            return j;
        }
        long j3 = zzxqVar.zza;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.zzk;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            j5 = j4 + j5;
            j2 = j5;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.zzl;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzxq zzxqVar = this.zzc;
            Objects.requireNonNull(zzxqVar);
            zzxqVar.zzb();
            this.zzb.zzb(new zzxl(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzxn zzxnVar = this.zzb;
        if (zzxnVar != null) {
            zzxnVar.zza();
            zzxq zzxqVar = this.zzc;
            Objects.requireNonNull(zzxqVar);
            zzxqVar.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzxj)) {
            surface = null;
        }
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}

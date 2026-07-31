package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzaek {
    private final Context zza;

    @Nullable
    private zzaeg zzb;
    private boolean zzc;

    @Nullable
    private Surface zzd;
    private float zze;
    private float zzf;
    private float zzg = 1.0f;
    private int zzh = 0;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    public zzaek(Context context) {
        this.zza = context;
    }

    private final void zzi() {
        this.zzn = -1L;
        this.zzk = -1L;
        this.zzm = -9223372036854775807L;
        this.zzi = 0L;
        this.zzj = 0L;
    }

    private final void zzj(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zzd) == null || this.zzh == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        float f = 0.0f;
        if (this.zzc) {
            float f2 = this.zze;
            if (f2 != -1.0f) {
                f = this.zzg * f2;
            }
        }
        if (z || this.zzf != f) {
            this.zzf = f;
            zzaef.zza(this.zzd, f);
        }
    }

    private final void zzk() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zzd) == null || this.zzh == Integer.MIN_VALUE || this.zzf == 0.0f || !surface.isValid()) {
            return;
        }
        this.zzf = 0.0f;
        zzaef.zza(this.zzd, 0.0f);
    }

    public final void zza(int i) {
        if (this.zzh == i) {
            return;
        }
        this.zzh = i;
        zzj(true);
    }

    public final void zzb() {
        this.zzc = true;
        zzi();
        DisplayManager displayManager = (DisplayManager) this.zza.getSystemService("display");
        zzaeg zzaegVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                zzaegVar = Build.VERSION.SDK_INT >= 33 ? new zzaej(choreographer, displayManager, null) : new zzaeh(choreographer, displayManager, null);
            } catch (RuntimeException e) {
                zzeh.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        this.zzb = zzaegVar;
        if (zzaegVar != null) {
            zzaegVar.zza();
        }
        zzj(false);
    }

    public final void zzc(@Nullable Surface surface) {
        if (this.zzd == surface) {
            return;
        }
        zzk();
        this.zzd = surface;
        zzj(true);
    }

    public final void zzd() {
        zzi();
    }

    public final void zze(float f) {
        this.zzg = f;
        zzj(false);
    }

    public final void zzf(float f) {
        if (this.zze == f) {
            return;
        }
        this.zze = f;
        zzj(false);
    }

    public final void zzg() {
        this.zzc = false;
        zzaeg zzaegVar = this.zzb;
        if (zzaegVar != null) {
            zzaegVar.zzb();
        }
        zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzh(long j, long j2, long j3, long j4) {
        long j5;
        zzaeg zzaegVar;
        long j6;
        long j7;
        long j8;
        float f;
        long j9;
        long j10 = this.zzm;
        if (j2 != j10) {
            this.zzn = this.zzk;
            this.zzo = this.zzl;
            this.zzp = j10;
            this.zzi = this.zzj;
        }
        long j11 = this.zzn;
        if (j11 != -1) {
            if (j3 != -9223372036854775807L) {
                f = this.zzg;
                j9 = (j4 - j11) * j3;
            } else {
                long j12 = j2 - this.zzp;
                f = this.zzg;
                j9 = j12 * 1000;
            }
            j5 = this.zzo + ((long) (j9 / f));
            if (Math.abs(j - j5) > 20000000) {
                zzi();
            }
            this.zzk = j4;
            this.zzl = j5;
            this.zzm = j2;
            zzaegVar = this.zzb;
            if (zzaegVar != null) {
                long j13 = zzaegVar.zzc;
                long j14 = this.zzb.zzd;
                if (j13 != -9223372036854775807L && j14 != -9223372036854775807L) {
                    long j15 = j13 + (((j5 - j13) / j14) * j14);
                    if (j5 <= j15) {
                        j6 = j15 - j14;
                    } else {
                        j15 += j14;
                        j6 = j15;
                    }
                    long j16 = j14 / 2;
                    long j17 = j15 - j5;
                    long j18 = j5 - j6;
                    long abs = Math.abs(j17 - j18);
                    if (abs < j16) {
                        long j19 = j14 / 4;
                        j8 = 0;
                        j7 = j15;
                        if (abs < j19) {
                            long j20 = this.zzi;
                            if (j20 != 0) {
                                this.zzj = j20;
                                j8 = j20;
                            } else {
                                if (j17 < j18) {
                                    j19 = -j19;
                                }
                                this.zzj = j19;
                                j8 = j19;
                            }
                            return (j17 + j8 >= j18 ? j7 : j6) - ((j14 * 80) / 100);
                        }
                    } else {
                        j7 = j15;
                        j8 = this.zzi;
                    }
                    this.zzj = j8;
                    return (j17 + j8 >= j18 ? j7 : j6) - ((j14 * 80) / 100);
                }
            }
            return j5;
        }
        j5 = j;
        this.zzk = j4;
        this.zzl = j5;
        this.zzm = j2;
        zzaegVar = this.zzb;
        if (zzaegVar != null) {
        }
        return j5;
    }
}

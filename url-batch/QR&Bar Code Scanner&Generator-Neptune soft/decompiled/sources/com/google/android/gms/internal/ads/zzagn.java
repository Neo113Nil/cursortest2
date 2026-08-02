package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzagn {
    private zzaap zzb;
    private zzzl zzc;
    private zzagi zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzagg zza = new zzagg();
    private zzagk zzj = new zzagk();

    protected abstract long zza(zzef zzefVar);

    protected void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzagk();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzef zzefVar, long j, zzagk zzagkVar) throws IOException;

    final int zze(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        zzdd.zzb(this.zzb);
        int i = zzen.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzzjVar)) {
                long zzf = zzzjVar.zzf();
                long j = this.zzf;
                this.zzk = zzf - j;
                if (!zzc(this.zza.zza(), j, this.zzj)) {
                    zzaf zzafVar = this.zzj.zza;
                    this.zzi = zzafVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzafVar);
                        this.zzm = true;
                    }
                    zzagi zzagiVar = this.zzj.zzb;
                    if (zzagiVar != null) {
                        this.zzd = zzagiVar;
                    } else if (zzzjVar.zzd() == -1) {
                        this.zzd = new zzagm(null);
                    } else {
                        zzagh zzb = this.zza.zzb();
                        this.zzd = new zzagb(this, this.zzf, zzzjVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzzjVar.zzf();
            }
            this.zzh = 3;
            return -1;
        }
        if (i2 == 1) {
            ((zzyy) zzzjVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long zzd = this.zzd.zzd(zzzjVar);
        if (zzd >= 0) {
            zzaaiVar.zza = zzd;
            return 1;
        }
        if (zzd < -1) {
            zzi(-(zzd + 2));
        }
        if (!this.zzl) {
            zzaal zze = this.zzd.zze();
            zzdd.zzb(zze);
            this.zzc.zzN(zze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzzjVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzef zza = this.zza.zza();
        long zza2 = zza(zza);
        if (zza2 >= 0) {
            long j2 = this.zzg;
            if (j2 + zza2 >= this.zze) {
                long zzf2 = zzf(j2);
                zzaan.zzb(this.zzb, zza, zza.zzd());
                this.zzb.zzs(zzf2, 1, zza.zzd(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += zza2;
        return 0;
    }

    protected final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    protected final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    final void zzh(zzzl zzzlVar, zzaap zzaapVar) {
        this.zzc = zzzlVar;
        this.zzb = zzaapVar;
        zzb(true);
    }

    protected void zzi(long j) {
        this.zzg = j;
    }

    final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzagi zzagiVar = this.zzd;
            int i = zzen.zza;
            zzagiVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}

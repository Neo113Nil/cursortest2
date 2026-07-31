package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
abstract class zzajj {
    private zzaeb zzb;
    private zzacx zzc;
    private zzajf zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzajd zza = new zzajd();
    private zzajh zzj = new zzajh();

    protected void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzajh();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzef zzefVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzef zzefVar, long j, zzajh zzajhVar) throws IOException;

    final void zze(zzacx zzacxVar, zzaeb zzaebVar) {
        this.zzc = zzacxVar;
        this.zzb = zzaebVar;
        zza(true);
    }

    final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzi(j2);
            zzajf zzajfVar = this.zzd;
            String str = zzeo.zza;
            zzajfVar.zzb(this.zze);
            this.zzh = 2;
        }
    }

    final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        this.zzb.getClass();
        String str = zzeo.zza;
        int i = this.zzh;
        if (i != 0) {
            if (i == 1) {
                zzacvVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i != 2) {
                return -1;
            }
            long zza = this.zzd.zza(zzacvVar);
            if (zza >= 0) {
                zzadsVar.zza = zza;
                return 1;
            }
            if (zza < -1) {
                zzj(-(zza + 2));
            }
            if (!this.zzl) {
                zzadv zzc = this.zzd.zzc();
                zzc.getClass();
                this.zzc.zzw(zzc);
                zzc.zza();
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzacvVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzef zzd = this.zza.zzd();
            long zzb = zzb(zzd);
            if (zzb >= 0) {
                long j = this.zzg;
                if (j + zzb >= this.zze) {
                    long zzh = zzh(j);
                    this.zzb.zzz(zzd, zzd.zze());
                    this.zzb.zzx(zzh, 1, zzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zzb;
            return 0;
        }
        while (true) {
            zzajd zzajdVar = this.zza;
            if (!zzajdVar.zzb(zzacvVar)) {
                this.zzh = 3;
                return -1;
            }
            long zzn = zzacvVar.zzn();
            long j2 = this.zzf;
            this.zzk = zzn - j2;
            if (!zzc(zzajdVar.zzd(), j2, this.zzj)) {
                zzu zzuVar = this.zzj.zza;
                this.zzi = zzuVar.zzH;
                if (!this.zzm) {
                    this.zzb.zzu(zzuVar);
                    this.zzm = true;
                }
                zzajf zzajfVar = this.zzj.zzb;
                if (zzajfVar != null) {
                    this.zzd = zzajfVar;
                } else if (zzacvVar.zzo() == -1) {
                    this.zzd = new zzaji(null);
                } else {
                    zzaje zzc2 = zzajdVar.zzc();
                    this.zzd = new zzaiy(this, this.zzf, zzacvVar.zzo(), zzc2.zzd + zzc2.zze, zzc2.zzb, (zzc2.zza & 4) != 0);
                }
                this.zzh = 2;
                zzajdVar.zze();
                return 0;
            }
            this.zzf = zzacvVar.zzn();
        }
    }

    protected final long zzh(long j) {
        return (j * 1000000) / this.zzi;
    }

    protected final long zzi(long j) {
        return (this.zzi * j) / 1000000;
    }

    protected void zzj(long j) {
        this.zzg = j;
    }
}

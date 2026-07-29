package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
abstract class zzafl {
    private zzzz zzb;
    private zzyv zzc;
    private zzafg zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzafe zza = new zzafe();
    private zzafi zzj = new zzafi();

    protected abstract long zza(zzdy zzdyVar);

    protected void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzafi();
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
    protected abstract boolean zzc(zzdy zzdyVar, long j, zzafi zzafiVar) throws IOException;

    final int zze(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        zzcw.zzb(this.zzb);
        int i = zzeg.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzytVar)) {
                long zzf = zzytVar.zzf();
                long j = this.zzf;
                this.zzk = zzf - j;
                if (!zzc(this.zza.zza(), j, this.zzj)) {
                    zzad zzadVar = this.zzj.zza;
                    this.zzi = zzadVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzadVar);
                        this.zzm = true;
                    }
                    zzafg zzafgVar = this.zzj.zzb;
                    if (zzafgVar != null) {
                        this.zzd = zzafgVar;
                    } else if (zzytVar.zzd() == -1) {
                        this.zzd = new zzafk(null);
                    } else {
                        zzaff zzb = this.zza.zzb();
                        this.zzd = new zzaez(this, this.zzf, zzytVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
                this.zzf = zzytVar.zzf();
            }
            this.zzh = 3;
            return -1;
        }
        if (i2 == 1) {
            ((zzym) zzytVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long zzd = this.zzd.zzd(zzytVar);
        if (zzd >= 0) {
            zzzsVar.zza = zzd;
            return 1;
        }
        if (zzd < -1) {
            zzi(-(zzd + 2));
        }
        if (!this.zzl) {
            zzzv zze = this.zzd.zze();
            zzcw.zzb(zze);
            this.zzc.zzL(zze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzytVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzdy zza = this.zza.zza();
        long zza2 = zza(zza);
        if (zza2 >= 0) {
            long j2 = this.zzg;
            if (j2 + zza2 >= this.zze) {
                long zzf2 = zzf(j2);
                zzzx.zzb(this.zzb, zza, zza.zzd());
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

    final void zzh(zzyv zzyvVar, zzzz zzzzVar) {
        this.zzc = zzyvVar;
        this.zzb = zzzzVar;
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
            zzafg zzafgVar = this.zzd;
            int i = zzeg.zza;
            zzafgVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}

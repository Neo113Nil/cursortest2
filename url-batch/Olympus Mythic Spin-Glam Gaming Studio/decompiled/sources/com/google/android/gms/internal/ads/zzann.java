package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
abstract class zzann {
    private zzaht zzb;
    private zzagk zzc;
    private zzanj zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzanh zza = new zzanh();
    private zzanl zzj = new zzanl();

    protected void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzanl();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzeu zzeuVar);

    protected abstract boolean zzc(zzeu zzeuVar, long j, zzanl zzanlVar) throws IOException;

    final void zze(zzagk zzagkVar, zzaht zzahtVar) {
        this.zzc = zzagkVar;
        this.zzb = zzahtVar;
        zza(true);
    }

    final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long zzi = zzi(j2);
            this.zze = zzi;
            zzanj zzanjVar = this.zzd;
            String str = zzfm.zza;
            zzanjVar.zzb(zzi);
            this.zzh = 2;
        }
    }

    final int zzg(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        this.zzb.getClass();
        String str = zzfm.zza;
        int i = this.zzh;
        if (i == 0) {
            while (true) {
                zzanh zzanhVar = this.zza;
                if (!zzanhVar.zzb(zzagiVar)) {
                    this.zzh = 3;
                    return -1;
                }
                long zzn = zzagiVar.zzn();
                long j = this.zzf;
                this.zzk = zzn - j;
                if (zzc(zzanhVar.zzd(), j, this.zzj)) {
                    this.zzf = zzagiVar.zzn();
                } else {
                    zzv zzvVar = this.zzj.zza;
                    this.zzi = zzvVar.zzK;
                    if (!this.zzm) {
                        this.zzb.zzA(zzvVar);
                        this.zzm = true;
                    }
                    zzanj zzanjVar = this.zzj.zzb;
                    if (zzanjVar != null) {
                        this.zzd = zzanjVar;
                    } else if (zzagiVar.zzo() == -1) {
                        this.zzd = new zzanm(null);
                    } else {
                        zzani zzc = zzanhVar.zzc();
                        this.zzd = new zzanc(this, this.zzf, zzagiVar.zzo(), zzc.zzd + zzc.zze, zzc.zzb, (zzc.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    zzanhVar.zze();
                }
            }
        } else {
            if (i == 1) {
                zzagiVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i != 2) {
                return -1;
            }
            long zza = this.zzd.zza(zzagiVar);
            if (zza >= 0) {
                zzahhVar.zza = zza;
                return 1;
            }
            if (zza < -1) {
                zzj(-(zza + 2));
            }
            if (!this.zzl) {
                zzahk zzc2 = this.zzd.zzc();
                zzc2.getClass();
                this.zzc.zzw(zzc2);
                this.zzb.zzP(zzc2.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzagiVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzeu zzd = this.zza.zzd();
            long zzb = zzb(zzd);
            if (zzb >= 0) {
                long j2 = this.zzg;
                if (j2 + zzb >= this.zze) {
                    long zzh = zzh(j2);
                    this.zzb.zzc(zzd, zzd.zze());
                    this.zzb.zze(zzh, 1, zzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zzb;
        }
        return 0;
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

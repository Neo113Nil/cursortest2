package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjj {
    public final zzsg zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public zzjk zzf;
    public boolean zzg;
    private final zzkb[] zzi;
    private final zzvz zzj;
    private final zzjt zzk;
    private zzjj zzl;
    private zzwa zzn;
    private long zzo;
    private zzuh zzm = zzuh.zza;
    public final zztz[] zzc = new zztz[2];
    private final boolean[] zzh = new boolean[2];

    public zzjj(zzkb[] zzkbVarArr, long j, zzvz zzvzVar, zzwi zzwiVar, zzjt zzjtVar, zzjk zzjkVar, zzwa zzwaVar, byte[] bArr) {
        this.zzi = zzkbVarArr;
        this.zzo = j;
        this.zzj = zzvzVar;
        this.zzk = zzjtVar;
        this.zzb = zzjkVar.zza.zza;
        this.zzf = zzjkVar;
        this.zzn = zzwaVar;
        zzsi zzsiVar = zzjkVar.zza;
        long j2 = zzjkVar.zzb;
        long j3 = zzjkVar.zzd;
        zzsg zzo = zzjtVar.zzo(zzsiVar, zzwiVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zzrn(zzo, true, 0L, j3) : zzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzwa zzwaVar = this.zzn;
            if (i >= zzwaVar.zza) {
                return;
            }
            zzwaVar.zzb(i);
            zzvt zzvtVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzwa zzwaVar = this.zzn;
            if (i >= zzwaVar.zza) {
                return;
            }
            zzwaVar.zzb(i);
            zzvt zzvtVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzwa zzwaVar, long j, boolean z) {
        return zzb(zzwaVar, j, false, new boolean[2]);
    }

    public final long zzb(zzwa zzwaVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzwaVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzwaVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzkb[] zzkbVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzkbVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzwaVar;
        zzt();
        long zzf = this.zza.zzf(zzwaVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzkb[] zzkbVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzkbVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zztz[] zztzVarArr = this.zzc;
            if (i4 >= 2) {
                return zzf;
            }
            if (zztzVarArr[i4] != null) {
                zzdd.zzf(zzwaVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzdd.zzf(zzwaVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzjj zzg() {
        return this.zzl;
    }

    public final zzuh zzh() {
        return this.zzm;
    }

    public final zzwa zzi() {
        return this.zzn;
    }

    public final zzwa zzj(float f, zzcn zzcnVar) throws zzha {
        zzwa zzn = this.zzj.zzn(this.zzi, this.zzm, this.zzf.zza, zzcnVar);
        for (zzvt zzvtVar : zzn.zzc) {
        }
        return zzn;
    }

    public final void zzk(long j) {
        zzdd.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f, zzcn zzcnVar) throws zzha {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzwa zzj = zzj(f, zzcnVar);
        zzjk zzjkVar = this.zzf;
        long j = zzjkVar.zzb;
        long j2 = zzjkVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zza = zza(zzj, j, false);
        long j3 = this.zzo;
        zzjk zzjkVar2 = this.zzf;
        this.zzo = j3 + (zzjkVar2.zzb - zza);
        this.zzf = zzjkVar2.zzb(zza);
    }

    public final void zzm(long j) {
        zzdd.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzjt zzjtVar = this.zzk;
        zzsg zzsgVar = this.zza;
        try {
            if (zzsgVar instanceof zzrn) {
                zzjtVar.zzh(((zzrn) zzsgVar).zza);
            } else {
                zzjtVar.zzh(zzsgVar);
            }
        } catch (RuntimeException e) {
            zzdw.zzc("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzjj zzjjVar) {
        if (zzjjVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzjjVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzsg zzsgVar = this.zza;
        if (zzsgVar instanceof zzrn) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzrn) zzsgVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzjd {
    public final zzrz zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public zzje zzf;
    public boolean zzg;
    private final zzjv[] zzi;
    private final zzvn zzj;
    private final zzjn zzk;
    private zzjd zzl;
    private zzvo zzn;
    private long zzo;
    private zztz zzm = zztz.zza;
    public final zztr[] zzc = new zztr[2];
    private final boolean[] zzh = new boolean[2];

    public zzjd(zzjv[] zzjvVarArr, long j, zzvn zzvnVar, zzvw zzvwVar, zzjn zzjnVar, zzje zzjeVar, zzvo zzvoVar, byte[] bArr) {
        this.zzi = zzjvVarArr;
        this.zzo = j;
        this.zzj = zzvnVar;
        this.zzk = zzjnVar;
        this.zzb = zzjeVar.zza.zza;
        this.zzf = zzjeVar;
        this.zzn = zzvoVar;
        zzsb zzsbVar = zzjeVar.zza;
        long j2 = zzjeVar.zzb;
        long j3 = zzjeVar.zzd;
        zzrz zzo = zzjnVar.zzo(zzsbVar, zzvwVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zzrg(zzo, true, 0L, j3) : zzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzvo zzvoVar = this.zzn;
            if (i >= zzvoVar.zza) {
                return;
            }
            zzvoVar.zzb(i);
            zzvh zzvhVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzvo zzvoVar = this.zzn;
            if (i >= zzvoVar.zza) {
                return;
            }
            zzvoVar.zzb(i);
            zzvh zzvhVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzvo zzvoVar, long j, boolean z) {
        return zzb(zzvoVar, j, false, new boolean[2]);
    }

    public final long zzb(zzvo zzvoVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzvoVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzvoVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzjv[] zzjvVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzjvVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzvoVar;
        zzt();
        long zzf = this.zza.zzf(zzvoVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzjv[] zzjvVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzjvVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zztr[] zztrVarArr = this.zzc;
            if (i4 >= 2) {
                return zzf;
            }
            if (zztrVarArr[i4] != null) {
                zzcw.zzf(zzvoVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzcw.zzf(zzvoVar.zzc[i4] == null);
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

    public final zzjd zzg() {
        return this.zzl;
    }

    public final zztz zzh() {
        return this.zzm;
    }

    public final zzvo zzi() {
        return this.zzn;
    }

    public final zzvo zzj(float f, zzci zzciVar) throws zzgu {
        zzvo zzj = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzciVar);
        for (zzvh zzvhVar : zzj.zzc) {
        }
        return zzj;
    }

    public final void zzk(long j) {
        zzcw.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f, zzci zzciVar) throws zzgu {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzvo zzj = zzj(f, zzciVar);
        zzje zzjeVar = this.zzf;
        long j = zzjeVar.zzb;
        long j2 = zzjeVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zza = zza(zzj, j, false);
        long j3 = this.zzo;
        zzje zzjeVar2 = this.zzf;
        this.zzo = j3 + (zzjeVar2.zzb - zza);
        this.zzf = zzjeVar2.zzb(zza);
    }

    public final void zzm(long j) {
        zzcw.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzjn zzjnVar = this.zzk;
        zzrz zzrzVar = this.zza;
        try {
            if (zzrzVar instanceof zzrg) {
                zzjnVar.zzh(((zzrg) zzrzVar).zza);
            } else {
                zzjnVar.zzh(zzrzVar);
            }
        } catch (RuntimeException e) {
            zzdn.zza("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzjd zzjdVar) {
        if (zzjdVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzjdVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzrz zzrzVar = this.zza;
        if (zzrzVar instanceof zzrg) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzrg) zzrzVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}

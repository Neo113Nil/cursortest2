package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaxg {
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzars zzq;
    private int zza = 1000;
    private int[] zzb = new int[1000];
    private long[] zzc = new long[1000];
    private long[] zzf = new long[1000];
    private int[] zze = new int[1000];
    private int[] zzd = new int[1000];
    private zzaud[] zzg = new zzaud[1000];
    private zzars[] zzh = new zzars[1000];
    private long zzm = Long.MIN_VALUE;
    private long zzn = Long.MIN_VALUE;
    private boolean zzp = true;
    private boolean zzo = true;

    public final int zza() {
        return this.zzj + this.zzi;
    }

    public final synchronized int zzb(zzart zzartVar, zzatn zzatnVar, boolean z, boolean z2, zzars zzarsVar, zzaxf zzaxfVar) {
        if (!zzl()) {
            if (z2) {
                zzatnVar.zzc(4);
                return -4;
            }
            zzars zzarsVar2 = this.zzq;
            if (zzarsVar2 == null || (!z && zzarsVar2 == zzarsVar)) {
                return -3;
            }
            zzartVar.zza = zzarsVar2;
            return -5;
        }
        if (!z) {
            zzars[] zzarsVarArr = this.zzh;
            int i = this.zzk;
            if (zzarsVarArr[i] == zzarsVar) {
                if (zzatnVar.zzb == null) {
                    return -3;
                }
                zzatnVar.zzc = this.zzf[i];
                zzatnVar.zzc(this.zze[i]);
                int[] iArr = this.zzd;
                int i2 = this.zzk;
                zzaxfVar.zza = iArr[i2];
                zzaxfVar.zzb = this.zzc[i2];
                zzaxfVar.zzd = this.zzg[i2];
                this.zzm = Math.max(this.zzm, zzatnVar.zzc);
                int i3 = this.zzi - 1;
                this.zzi = i3;
                int i4 = this.zzk + 1;
                this.zzk = i4;
                this.zzj++;
                if (i4 == this.zza) {
                    this.zzk = 0;
                    i4 = 0;
                }
                zzaxfVar.zzc = i3 > 0 ? this.zzc[i4] : zzaxfVar.zzb + zzaxfVar.zza;
                return -4;
            }
        }
        zzartVar.zza = this.zzh[this.zzk];
        return -5;
    }

    public final synchronized long zzc() {
        return Math.max(this.zzm, this.zzn);
    }

    public final synchronized long zzd() {
        if (!zzl()) {
            return -1L;
        }
        int i = this.zzk;
        int i2 = this.zzi;
        int i3 = i + i2;
        int i4 = this.zza;
        int i5 = (i3 - 1) % i4;
        this.zzk = i3 % i4;
        this.zzj += i2;
        this.zzi = 0;
        return this.zzc[i5] + this.zzd[i5];
    }

    public final synchronized long zze(long j, boolean z) {
        if (zzl()) {
            long[] jArr = this.zzf;
            int i = this.zzk;
            if (j >= jArr[i]) {
                int i2 = 0;
                if (j > this.zzn && !z) {
                    return -1L;
                }
                int i3 = -1;
                while (i != this.zzl && this.zzf[i] <= j) {
                    if (1 == (this.zze[i] & 1)) {
                        i3 = i2;
                    }
                    i = (i + 1) % this.zza;
                    i2++;
                }
                if (i3 == -1) {
                    return -1L;
                }
                int i4 = (this.zzk + i3) % this.zza;
                this.zzk = i4;
                this.zzj += i3;
                this.zzi -= i3;
                return this.zzc[i4];
            }
        }
        return -1L;
    }

    public final synchronized zzars zzf() {
        if (this.zzp) {
            return null;
        }
        return this.zzq;
    }

    public final void zzg() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzi = 0;
        this.zzo = true;
    }

    public final synchronized void zzh(long j, int i, long j2, int i2, zzaud zzaudVar) {
        if (this.zzo) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzo = false;
            }
        }
        zzayy.zze(!this.zzp);
        zzi(j);
        long[] jArr = this.zzf;
        int i3 = this.zzl;
        jArr[i3] = j;
        long[] jArr2 = this.zzc;
        jArr2[i3] = j2;
        this.zzd[i3] = i2;
        this.zze[i3] = i;
        this.zzg[i3] = zzaudVar;
        this.zzh[i3] = this.zzq;
        this.zzb[i3] = 0;
        int i4 = this.zzi + 1;
        this.zzi = i4;
        int i5 = this.zza;
        if (i4 != i5) {
            int i6 = i3 + 1;
            this.zzl = i6;
            if (i6 == i5) {
                this.zzl = 0;
                return;
            }
            return;
        }
        int i7 = i5 + 1000;
        int[] iArr = new int[i7];
        long[] jArr3 = new long[i7];
        long[] jArr4 = new long[i7];
        int[] iArr2 = new int[i7];
        int[] iArr3 = new int[i7];
        zzaud[] zzaudVarArr = new zzaud[i7];
        zzars[] zzarsVarArr = new zzars[i7];
        int i8 = this.zzk;
        int i9 = i5 - i8;
        System.arraycopy(jArr2, i8, jArr3, 0, i9);
        System.arraycopy(this.zzf, this.zzk, jArr4, 0, i9);
        System.arraycopy(this.zze, this.zzk, iArr2, 0, i9);
        System.arraycopy(this.zzd, this.zzk, iArr3, 0, i9);
        System.arraycopy(this.zzg, this.zzk, zzaudVarArr, 0, i9);
        System.arraycopy(this.zzh, this.zzk, zzarsVarArr, 0, i9);
        System.arraycopy(this.zzb, this.zzk, iArr, 0, i9);
        int i10 = this.zzk;
        System.arraycopy(this.zzc, 0, jArr3, i9, i10);
        System.arraycopy(this.zzf, 0, jArr4, i9, i10);
        System.arraycopy(this.zze, 0, iArr2, i9, i10);
        System.arraycopy(this.zzd, 0, iArr3, i9, i10);
        System.arraycopy(this.zzg, 0, zzaudVarArr, i9, i10);
        System.arraycopy(this.zzh, 0, zzarsVarArr, i9, i10);
        System.arraycopy(this.zzb, 0, iArr, i9, i10);
        this.zzc = jArr3;
        this.zzf = jArr4;
        this.zze = iArr2;
        this.zzd = iArr3;
        this.zzg = zzaudVarArr;
        this.zzh = zzarsVarArr;
        this.zzb = iArr;
        this.zzk = 0;
        int i11 = this.zza;
        this.zzl = i11;
        this.zzi = i11;
        this.zza = i7;
    }

    public final synchronized void zzi(long j) {
        this.zzn = Math.max(this.zzn, j);
    }

    public final void zzj() {
        this.zzm = Long.MIN_VALUE;
        this.zzn = Long.MIN_VALUE;
    }

    public final synchronized boolean zzk(zzars zzarsVar) {
        if (zzarsVar == null) {
            this.zzp = true;
            return false;
        }
        this.zzp = false;
        if (zzazn.zzo(zzarsVar, this.zzq)) {
            return false;
        }
        this.zzq = zzarsVar;
        return true;
    }

    public final synchronized boolean zzl() {
        return this.zzi != 0;
    }
}

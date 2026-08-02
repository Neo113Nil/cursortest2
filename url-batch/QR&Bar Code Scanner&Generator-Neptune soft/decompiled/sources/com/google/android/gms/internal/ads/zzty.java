package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzty implements zzaap {
    private boolean zzA;
    private boolean zzB;
    private zzpr zzC;
    private final zzts zza;
    private final zzpq zzd;
    private final zzpk zze;
    private zztx zzf;
    private zzaf zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzaf zzy;
    private zzaf zzz;
    private final zztu zzb = new zztu();
    private int zzh = 1000;
    private int[] zzi = new int[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzaao[] zzn = new zzaao[1000];
    private final zzuf zzc = new zzuf(new zzdh() { // from class: com.google.android.gms.internal.ads.zztt
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;

    protected zzty(zzwi zzwiVar, zzpq zzpqVar, zzpk zzpkVar, byte[] bArr) {
        this.zzd = zzpqVar;
        this.zze = zzpkVar;
        this.zza = new zzts(zzwiVar, null);
    }

    private final int zzA(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzB(zzjg zzjgVar, zzgi zzgiVar, boolean z, boolean z2, zztu zztuVar) {
        zzgiVar.zzc = false;
        if (!zzJ()) {
            if (!z2 && !this.zzv) {
                zzaf zzafVar = this.zzz;
                if (zzafVar == null || (!z && zzafVar == this.zzg)) {
                    return -3;
                }
                zzG(zzafVar, zzjgVar);
                return -5;
            }
            zzgiVar.zzc(4);
            return -4;
        }
        zzaf zzafVar2 = ((zztw) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzafVar2 == this.zzg) {
            int zzA = zzA(this.zzr);
            if (!zzK(zzA)) {
                zzgiVar.zzc = true;
                return -3;
            }
            zzgiVar.zzc(this.zzl[zzA]);
            long j = this.zzm[zzA];
            zzgiVar.zzd = j;
            if (j < this.zzs) {
                zzgiVar.zza(Integer.MIN_VALUE);
            }
            zztuVar.zza = this.zzk[zzA];
            zztuVar.zzb = this.zzj[zzA];
            zztuVar.zzc = this.zzn[zzA];
            return -4;
        }
        zzG(zzafVar2, zzjgVar);
        return -5;
    }

    private final synchronized long zzC(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzo;
        if (i2 != 0) {
            long[] jArr = this.zzm;
            int i3 = this.zzq;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzr) != i2) {
                    i2 = i + 1;
                }
                int zzz = zzz(i3, i2, j, false);
                if (zzz == -1) {
                    return -1L;
                }
                return zzE(zzz);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i = this.zzo;
        if (i == 0) {
            return -1L;
        }
        return zzE(i);
    }

    private final synchronized void zzF(long j, int i, long j2, int i2, zzaao zzaaoVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int zzA = zzA(i3 - 1);
            zzdd.zzd(this.zzj[zzA] + ((long) this.zzk[zzA]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int zzA2 = zzA(this.zzo);
        this.zzm[zzA2] = j;
        this.zzj[zzA2] = j2;
        this.zzk[zzA2] = i2;
        this.zzl[zzA2] = i;
        this.zzn[zzA2] = zzaaoVar;
        this.zzi[zzA2] = 0;
        if (this.zzc.zzf() || !((zztw) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzpp zzppVar = zzpp.zzb;
            zzuf zzufVar = this.zzc;
            int i4 = this.zzp + this.zzo;
            zzaf zzafVar = this.zzz;
            Objects.requireNonNull(zzafVar);
            zzufVar.zzc(i4, new zztw(zzafVar, zzppVar, null));
        }
        int i5 = this.zzo + 1;
        this.zzo = i5;
        int i6 = this.zzh;
        if (i5 == i6) {
            int i7 = i6 + 1000;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            zzaao[] zzaaoVarArr = new zzaao[i7];
            int i8 = this.zzq;
            int i9 = i6 - i8;
            System.arraycopy(this.zzj, i8, jArr, 0, i9);
            System.arraycopy(this.zzm, this.zzq, jArr2, 0, i9);
            System.arraycopy(this.zzl, this.zzq, iArr2, 0, i9);
            System.arraycopy(this.zzk, this.zzq, iArr3, 0, i9);
            System.arraycopy(this.zzn, this.zzq, zzaaoVarArr, 0, i9);
            System.arraycopy(this.zzi, this.zzq, iArr, 0, i9);
            int i10 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr, i9, i10);
            System.arraycopy(this.zzm, 0, jArr2, i9, i10);
            System.arraycopy(this.zzl, 0, iArr2, i9, i10);
            System.arraycopy(this.zzk, 0, iArr3, i9, i10);
            System.arraycopy(this.zzn, 0, zzaaoVarArr, i9, i10);
            System.arraycopy(this.zzi, 0, iArr, i9, i10);
            this.zzj = jArr;
            this.zzm = jArr2;
            this.zzl = iArr2;
            this.zzk = iArr3;
            this.zzn = zzaaoVarArr;
            this.zzi = iArr;
            this.zzq = 0;
            this.zzh = i7;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i) {
        if (this.zzC != null) {
            return (this.zzl[i] & BasicMeasure.EXACTLY) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzaf zzafVar) {
        this.zzx = false;
        if (zzen.zzT(zzafVar, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zztw) this.zzc.zzb()).zza.equals(zzafVar)) {
            this.zzz = zzafVar;
        } else {
            this.zzz = ((zztw) this.zzc.zzb()).zza;
        }
        zzaf zzafVar2 = this.zzz;
        this.zzA = zzbt.zzf(zzafVar2.zzm, zzafVar2.zzj);
        this.zzB = false;
        return true;
    }

    static /* synthetic */ void zzl(zztw zztwVar) {
        zzpp zzppVar = zztwVar.zzb;
        int i = zzpo.zza;
    }

    private final int zzz(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzh) {
                i = 0;
            }
        }
        return i3;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzb(long j, boolean z) {
        int i = this.zzr;
        int zzA = zzA(i);
        if (zzJ() && j >= this.zzm[zzA]) {
            if (j > this.zzu && z) {
                return this.zzo - i;
            }
            int zzz = zzz(zzA, this.zzo - i, j, true);
            if (zzz == -1) {
                return 0;
            }
            return zzz;
        }
        return 0;
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzjg zzjgVar, zzgi zzgiVar, int i, boolean z) {
        int zzB = zzB(zzjgVar, zzgiVar, (i & 2) != 0, z, this.zzb);
        if (zzB != -4) {
            return zzB;
        }
        if (!zzgiVar.zzg()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zze(zzgiVar, this.zzb);
                    this.zzr++;
                    return -4;
                }
                this.zza.zzd(zzgiVar, this.zzb);
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final /* synthetic */ int zze(zzr zzrVar, int i, boolean z) {
        return zzaan.zza(this, zzrVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final int zzf(zzr zzrVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zzrVar, i, z);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzaf zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j, boolean z, boolean z2) {
        this.zza.zzc(zzC(j, false, z2));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzk(zzaf zzafVar) {
        this.zzy = zzafVar;
        boolean zzL = zzL(zzafVar);
        zztx zztxVar = this.zzf;
        if (zztxVar == null || !zzL) {
            return;
        }
        zztxVar.zzL(zzafVar);
    }

    public final void zzm() throws IOException {
        zzpr zzprVar = this.zzC;
        if (zzprVar != null) {
            throw zzprVar.zza();
        }
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final /* synthetic */ void zzq(zzef zzefVar, int i) {
        zzaan.zzb(this, zzefVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzr(zzef zzefVar, int i, int i2) {
        this.zza.zzh(zzefVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzs(long j, int i, int i2, int i3, zzaao zzaaoVar) {
        int i4 = i & 1;
        if (this.zzw) {
            if (i4 == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzs) {
                return;
            }
            if (i4 == 0) {
                if (!this.zzB) {
                    zzdw.zze("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzF(j, i, (this.zza.zzb() - i2) - i3, i2, zzaaoVar);
    }

    public final void zzt(long j) {
        this.zzs = j;
    }

    public final void zzu(zztx zztxVar) {
        this.zzf = zztxVar;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzr + i <= this.zzo) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdd.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzJ()) {
            if (((zztw) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzK(zzA(this.zzr));
        }
        if (!z && !this.zzv) {
            zzaf zzafVar = this.zzz;
            if (zzafVar == null) {
                z2 = false;
            } else if (zzafVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzy(long j, boolean z) {
        zzI();
        int i = this.zzr;
        int zzA = zzA(i);
        if (!zzJ() || j < this.zzm[zzA] || (j > this.zzu && !z)) {
            return false;
        }
        int zzz = zzz(zzA, this.zzo - i, j, true);
        if (zzz == -1) {
            return false;
        }
        this.zzs = j;
        this.zzr += zzz;
        return true;
    }

    private final void zzG(zzaf zzafVar, zzjg zzjgVar) {
        zzaf zzafVar2 = this.zzg;
        zzx zzxVar = zzafVar2 == null ? null : zzafVar2.zzp;
        this.zzg = zzafVar;
        zzx zzxVar2 = zzafVar.zzp;
        zzjgVar.zza = zzafVar.zzc(this.zzd.zza(zzafVar));
        zzjgVar.zzb = this.zzC;
        if (zzafVar2 == null || !zzen.zzT(zzxVar, zzxVar2)) {
            zzpr zzprVar = zzafVar.zzp != null ? new zzpr(new zzpi(new zzpt(1), 6001)) : null;
            this.zzC = zzprVar;
            zzjgVar.zzb = zzprVar;
        }
    }

    private final long zzE(int i) {
        long j = this.zzt;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzA = zzA(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.zzm[zzA]);
                if ((this.zzl[zzA] & 1) != 0) {
                    break;
                }
                zzA--;
                if (zzA == -1) {
                    zzA = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, j2);
        this.zzo -= i;
        int i3 = this.zzp + i;
        this.zzp = i3;
        int i4 = this.zzq + i;
        this.zzq = i4;
        int i5 = this.zzh;
        if (i4 >= i5) {
            this.zzq = i4 - i5;
        }
        int i6 = this.zzr - i;
        this.zzr = i6;
        if (i6 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i3);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i7 = this.zzq;
        if (i7 == 0) {
            i7 = this.zzh;
        }
        return this.zzj[i7 - 1] + this.zzk[r12];
    }
}

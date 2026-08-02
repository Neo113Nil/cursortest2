package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzvw implements zzadp {
    private zzrj zzA;
    private final zzvq zza;
    private final zzri zzd;
    private zzvv zze;
    private zzaf zzf;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzu;
    private zzaf zzx;
    private boolean zzz;
    private final zzvs zzb = new zzvs();
    private int zzg = 1000;
    private long[] zzh = new long[1000];
    private long[] zzi = new long[1000];
    private long[] zzl = new long[1000];
    private int[] zzk = new int[1000];
    private int[] zzj = new int[1000];
    private zzado[] zzm = new zzado[1000];
    private final zzwd zzc = new zzwd(new zzdn() { // from class: com.google.android.gms.internal.ads.zzvr
        @Override // com.google.android.gms.internal.ads.zzdn
        public final void zza(Object obj) {
            zzrh zzrhVar = ((zzvu) obj).zzb;
        }
    });
    private long zzr = Long.MIN_VALUE;
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private boolean zzw = true;
    private boolean zzv = true;
    private boolean zzy = true;

    protected zzvw(zzyk zzykVar, zzri zzriVar, zzrd zzrdVar) {
        this.zzd = zzriVar;
        this.zza = new zzvq(zzykVar);
    }

    private final int zzA(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzl[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzk[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzg) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzB(int i) {
        int i2 = this.zzp + i;
        int i3 = this.zzg;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzC(zzjz zzjzVar, zzhd zzhdVar, boolean z, boolean z2, zzvs zzvsVar) {
        zzhdVar.zzd = false;
        if (!zzK()) {
            if (!z2 && !this.zzu) {
                zzaf zzafVar = this.zzx;
                if (zzafVar == null || (!z && zzafVar == this.zzf)) {
                    return -3;
                }
                zzH(zzafVar, zzjzVar);
                return -5;
            }
            zzhdVar.zzc(4);
            zzhdVar.zze = Long.MIN_VALUE;
            return -4;
        }
        zzaf zzafVar2 = ((zzvu) this.zzc.zza(this.zzo + this.zzq)).zza;
        if (!z && zzafVar2 == this.zzf) {
            int zzB = zzB(this.zzq);
            if (!zzL(zzB)) {
                zzhdVar.zzd = true;
                return -3;
            }
            zzhdVar.zzc(this.zzk[zzB]);
            if (this.zzq == this.zzn - 1 && (z2 || this.zzu)) {
                zzhdVar.zza(536870912);
            }
            zzhdVar.zze = this.zzl[zzB];
            zzvsVar.zza = this.zzj[zzB];
            zzvsVar.zzb = this.zzi[zzB];
            zzvsVar.zzc = this.zzm[zzB];
            return -4;
        }
        zzH(zzafVar2, zzjzVar);
        return -5;
    }

    private final synchronized long zzD(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.zzn;
        if (i2 != 0) {
            long[] jArr = this.zzl;
            int i3 = this.zzp;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.zzq) != i2) {
                    i2 = i + 1;
                }
                int zzA = zzA(i3, i2, j, false);
                if (zzA != -1) {
                    return zzF(zzA);
                }
            }
        }
        return -1L;
    }

    private final synchronized long zzE() {
        int i = this.zzn;
        if (i == 0) {
            return -1L;
        }
        return zzF(i);
    }

    private final synchronized void zzG(long j, int i, long j2, int i2, zzado zzadoVar) {
        int i3 = this.zzn;
        if (i3 > 0) {
            int zzB = zzB(i3 - 1);
            zzdi.zzd(this.zzi[zzB] + ((long) this.zzj[zzB]) <= j2);
        }
        this.zzu = (536870912 & i) != 0;
        this.zzt = Math.max(this.zzt, j);
        int zzB2 = zzB(this.zzn);
        this.zzl[zzB2] = j;
        this.zzi[zzB2] = j2;
        this.zzj[zzB2] = i2;
        this.zzk[zzB2] = i;
        this.zzm[zzB2] = zzadoVar;
        this.zzh[zzB2] = 0;
        if (this.zzc.zzf() || !((zzvu) this.zzc.zzb()).zza.equals(this.zzx)) {
            zzaf zzafVar = this.zzx;
            zzafVar.getClass();
            this.zzc.zzc(this.zzo + this.zzn, new zzvu(zzafVar, zzrh.zza, null));
        }
        int i4 = this.zzn + 1;
        this.zzn = i4;
        int i5 = this.zzg;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            zzado[] zzadoVarArr = new zzado[i6];
            int i7 = this.zzp;
            int i8 = i5 - i7;
            System.arraycopy(this.zzi, i7, jArr2, 0, i8);
            System.arraycopy(this.zzl, this.zzp, jArr3, 0, i8);
            System.arraycopy(this.zzk, this.zzp, iArr, 0, i8);
            System.arraycopy(this.zzj, this.zzp, iArr2, 0, i8);
            System.arraycopy(this.zzm, this.zzp, zzadoVarArr, 0, i8);
            System.arraycopy(this.zzh, this.zzp, jArr, 0, i8);
            int i9 = this.zzp;
            System.arraycopy(this.zzi, 0, jArr2, i8, i9);
            System.arraycopy(this.zzl, 0, jArr3, i8, i9);
            System.arraycopy(this.zzk, 0, iArr, i8, i9);
            System.arraycopy(this.zzj, 0, iArr2, i8, i9);
            System.arraycopy(this.zzm, 0, zzadoVarArr, i8, i9);
            System.arraycopy(this.zzh, 0, jArr, i8, i9);
            this.zzi = jArr2;
            this.zzl = jArr3;
            this.zzk = iArr;
            this.zzj = iArr2;
            this.zzm = zzadoVarArr;
            this.zzh = jArr;
            this.zzp = 0;
            this.zzg = i6;
        }
    }

    private final void zzH(zzaf zzafVar, zzjz zzjzVar) {
        zzaf zzafVar2 = this.zzf;
        zzy zzyVar = zzafVar2 == null ? null : zzafVar2.zzp;
        this.zzf = zzafVar;
        zzy zzyVar2 = zzafVar.zzp;
        zzjzVar.zza = zzafVar.zzc(this.zzd.zza(zzafVar));
        zzjzVar.zzb = this.zzA;
        if (zzafVar2 == null || !zzet.zzG(zzyVar, zzyVar2)) {
            zzrj zzrjVar = zzafVar.zzp != null ? new zzrj(new zzrb(new zzrl(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.zzA = zzrjVar;
            zzjzVar.zzb = zzrjVar;
        }
    }

    private final void zzI() {
        if (this.zzA != null) {
            this.zzA = null;
            this.zzf = null;
        }
    }

    private final synchronized void zzJ() {
        this.zzq = 0;
        this.zza.zzg();
    }

    private final boolean zzK() {
        return this.zzq != this.zzn;
    }

    private final boolean zzL(int i) {
        if (this.zzA != null) {
            return (this.zzk[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzM(zzaf zzafVar) {
        this.zzw = false;
        if (zzet.zzG(zzafVar, this.zzx)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzvu) this.zzc.zzb()).zza.equals(zzafVar)) {
            this.zzx = zzafVar;
        } else {
            this.zzx = ((zzvu) this.zzc.zzb()).zza;
        }
        boolean z = this.zzy;
        zzaf zzafVar2 = this.zzx;
        this.zzy = z & zzbn.zzf(zzafVar2.zzm, zzafVar2.zzj);
        this.zzz = false;
        return true;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzo + this.zzq;
    }

    public final synchronized int zzc(long j, boolean z) {
        int i = this.zzq;
        int zzB = zzB(i);
        if (zzK() && j >= this.zzl[zzB]) {
            if (j > this.zzt && z) {
                return this.zzn - i;
            }
            int zzA = zzA(zzB, this.zzn - i, j, true);
            if (zzA == -1) {
                return 0;
            }
            return zzA;
        }
        return 0;
    }

    public final int zzd() {
        return this.zzo + this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zze(zzjz zzjzVar, zzhd zzhdVar, int i, boolean z) {
        int zzC = zzC(zzjzVar, zzhdVar, (i & 2) != 0, z, this.zzb);
        if (zzC != -4) {
            return zzC;
        }
        if (!zzhdVar.zzf()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zze(zzhdVar, this.zzb);
                    this.zzq++;
                    return -4;
                }
                this.zza.zzd(zzhdVar, this.zzb);
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ int zzf(zzp zzpVar, int i, boolean z) {
        return zzadn.zza(this, zzpVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final int zzg(zzp zzpVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zzpVar, i, z);
    }

    public final synchronized long zzh() {
        return this.zzt;
    }

    public final synchronized zzaf zzi() {
        if (this.zzw) {
            return null;
        }
        return this.zzx;
    }

    public final void zzj(long j, boolean z, boolean z2) {
        this.zza.zzc(zzD(j, false, z2));
    }

    public final void zzk() {
        this.zza.zzc(zzE());
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzl(zzaf zzafVar) {
        boolean zzM = zzM(zzafVar);
        zzvv zzvvVar = this.zze;
        if (zzvvVar == null || !zzM) {
            return;
        }
        zzvvVar.zzM(zzafVar);
    }

    public final void zzm() throws IOException {
        zzrj zzrjVar = this.zzA;
        if (zzrjVar != null) {
            throw zzrjVar.zza();
        }
    }

    public final void zzn() {
        zzk();
        zzI();
    }

    public final void zzo() {
        zzp(true);
        zzI();
    }

    public final void zzp(boolean z) {
        this.zza.zzf();
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzv = true;
        this.zzr = Long.MIN_VALUE;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = false;
        this.zzc.zzd();
        if (z) {
            this.zzx = null;
            this.zzw = true;
            this.zzy = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final /* synthetic */ void zzq(zzek zzekVar, int i) {
        zzadn.zzb(this, zzekVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzr(zzek zzekVar, int i, int i2) {
        this.zza.zzh(zzekVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzadp
    public final void zzs(long j, int i, int i2, int i3, zzado zzadoVar) {
        if (this.zzv) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzv = false;
            }
        }
        if (this.zzy) {
            if (j < this.zzr) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzz) {
                    zzea.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzx))));
                    this.zzz = true;
                }
                i |= 1;
            }
        }
        zzG(j, i, (this.zza.zzb() - i2) - i3, i2, zzadoVar);
    }

    public final void zzt(long j) {
        this.zzr = j;
    }

    public final void zzu(zzvv zzvvVar) {
        this.zze = zzvvVar;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzq + i <= this.zzn) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdi.zzd(z);
        this.zzq += i;
    }

    public final synchronized boolean zzw() {
        return this.zzu;
    }

    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzK()) {
            if (((zzvu) this.zzc.zza(this.zzo + this.zzq)).zza != this.zzf) {
                return true;
            }
            return zzL(zzB(this.zzq));
        }
        if (!z && !this.zzu) {
            zzaf zzafVar = this.zzx;
            if (zzafVar == null) {
                z2 = false;
            } else if (zzafVar == this.zzf) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean zzy(int i) {
        zzJ();
        int i2 = this.zzo;
        if (i >= i2 && i <= this.zzn + i2) {
            this.zzr = Long.MIN_VALUE;
            this.zzq = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzz(long j, boolean z) {
        int zzA;
        zzJ();
        int i = this.zzq;
        int zzB = zzB(i);
        if (zzK() && j >= this.zzl[zzB]) {
            if (j > this.zzt) {
                if (z) {
                    z = true;
                }
            }
            if (this.zzy) {
                zzA = this.zzn - i;
                int i2 = 0;
                while (true) {
                    if (i2 < zzA) {
                        if (this.zzl[zzB] >= j) {
                            zzA = i2;
                            break;
                        }
                        zzB++;
                        if (zzB == this.zzg) {
                            zzB = 0;
                        }
                        i2++;
                    } else if (!z) {
                        zzA = -1;
                    }
                }
            } else {
                zzA = zzA(zzB, this.zzn - i, j, true);
            }
            if (zzA != -1) {
                this.zzr = j;
                this.zzq += zzA;
                return true;
            }
        }
        return false;
    }

    private final long zzF(int i) {
        long j = this.zzs;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int zzB = zzB(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.zzl[zzB]);
                if ((this.zzk[zzB] & 1) != 0) {
                    break;
                }
                zzB--;
                if (zzB == -1) {
                    zzB = this.zzg - 1;
                }
            }
        }
        this.zzs = Math.max(j, j2);
        this.zzn -= i;
        int i3 = this.zzo + i;
        this.zzo = i3;
        int i4 = this.zzp + i;
        this.zzp = i4;
        int i5 = this.zzg;
        if (i4 >= i5) {
            this.zzp = i4 - i5;
        }
        int i6 = this.zzq - i;
        this.zzq = i6;
        if (i6 < 0) {
            this.zzq = 0;
        }
        this.zzc.zze(i3);
        if (this.zzn != 0) {
            return this.zzi[this.zzp];
        }
        int i7 = this.zzp;
        if (i7 == 0) {
            i7 = this.zzg;
        }
        return this.zzi[i7 - 1] + this.zzj[r12];
    }
}

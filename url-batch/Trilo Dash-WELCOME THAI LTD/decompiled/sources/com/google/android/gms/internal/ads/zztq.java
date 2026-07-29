package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zztq implements zzzz {
    private boolean zzA;
    private boolean zzB;
    private zzpk zzC;
    private final zztk zza;
    private final zzpj zzd;
    private final zzpd zze;
    private zztp zzf;
    private zzad zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzad zzy;
    private zzad zzz;
    private final zztm zzb = new zztm();
    private int zzh = 1000;
    private int[] zzi = new int[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzzy[] zzn = new zzzy[1000];
    private final zztx zzc = new zztx(new zzda() { // from class: com.google.android.gms.internal.ads.zztl
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;

    protected zztq(zzvw zzvwVar, zzpj zzpjVar, zzpd zzpdVar, byte[] bArr) {
        this.zzd = zzpjVar;
        this.zze = zzpdVar;
        this.zza = new zztk(zzvwVar, null);
    }

    private final int zzA(int i) {
        int i2 = this.zzq + i;
        int i3 = this.zzh;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized int zzB(zzja zzjaVar, zzgc zzgcVar, boolean z, boolean z2, zztm zztmVar) {
        zzgcVar.zzc = false;
        if (!zzJ()) {
            if (!z2 && !this.zzv) {
                zzad zzadVar = this.zzz;
                if (zzadVar == null || (!z && zzadVar == this.zzg)) {
                    return -3;
                }
                zzG(zzadVar, zzjaVar);
                return -5;
            }
            zzgcVar.zzc(4);
            return -4;
        }
        zzad zzadVar2 = ((zzto) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z && zzadVar2 == this.zzg) {
            int zzA = zzA(this.zzr);
            if (!zzK(zzA)) {
                zzgcVar.zzc = true;
                return -3;
            }
            zzgcVar.zzc(this.zzl[zzA]);
            long j = this.zzm[zzA];
            zzgcVar.zzd = j;
            if (j < this.zzs) {
                zzgcVar.zza(Integer.MIN_VALUE);
            }
            zztmVar.zza = this.zzk[zzA];
            zztmVar.zzb = this.zzj[zzA];
            zztmVar.zzc = this.zzn[zzA];
            return -4;
        }
        zzG(zzadVar2, zzjaVar);
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

    private final synchronized void zzF(long j, int i, long j2, int i2, zzzy zzzyVar) {
        int i3 = this.zzo;
        if (i3 > 0) {
            int zzA = zzA(i3 - 1);
            zzcw.zzd(this.zzj[zzA] + ((long) this.zzk[zzA]) <= j2);
        }
        this.zzv = (536870912 & i) != 0;
        this.zzu = Math.max(this.zzu, j);
        int zzA2 = zzA(this.zzo);
        this.zzm[zzA2] = j;
        this.zzj[zzA2] = j2;
        this.zzk[zzA2] = i2;
        this.zzl[zzA2] = i;
        this.zzn[zzA2] = zzzyVar;
        this.zzi[zzA2] = 0;
        if (this.zzc.zzf() || !((zzto) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzpi zzpiVar = zzpi.zzb;
            zztx zztxVar = this.zzc;
            int i4 = this.zzp + this.zzo;
            zzad zzadVar = this.zzz;
            Objects.requireNonNull(zzadVar);
            zztxVar.zzc(i4, new zzto(zzadVar, zzpiVar, null));
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
            zzzy[] zzzyVarArr = new zzzy[i7];
            int i8 = this.zzq;
            int i9 = i6 - i8;
            System.arraycopy(this.zzj, i8, jArr, 0, i9);
            System.arraycopy(this.zzm, this.zzq, jArr2, 0, i9);
            System.arraycopy(this.zzl, this.zzq, iArr2, 0, i9);
            System.arraycopy(this.zzk, this.zzq, iArr3, 0, i9);
            System.arraycopy(this.zzn, this.zzq, zzzyVarArr, 0, i9);
            System.arraycopy(this.zzi, this.zzq, iArr, 0, i9);
            int i10 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr, i9, i10);
            System.arraycopy(this.zzm, 0, jArr2, i9, i10);
            System.arraycopy(this.zzl, 0, iArr2, i9, i10);
            System.arraycopy(this.zzk, 0, iArr3, i9, i10);
            System.arraycopy(this.zzn, 0, zzzyVarArr, i9, i10);
            System.arraycopy(this.zzi, 0, iArr, i9, i10);
            this.zzj = jArr;
            this.zzm = jArr2;
            this.zzl = iArr2;
            this.zzk = iArr3;
            this.zzn = zzzyVarArr;
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

    private final synchronized boolean zzL(zzad zzadVar) {
        this.zzx = false;
        if (zzeg.zzS(zzadVar, this.zzz)) {
            return false;
        }
        if (this.zzc.zzf() || !((zzto) this.zzc.zzb()).zza.equals(zzadVar)) {
            this.zzz = zzadVar;
        } else {
            this.zzz = ((zzto) this.zzc.zzb()).zza;
        }
        zzad zzadVar2 = this.zzz;
        this.zzA = zzbo.zzf(zzadVar2.zzm, zzadVar2.zzj);
        this.zzB = false;
        return true;
    }

    static /* synthetic */ void zzl(zzto zztoVar) {
        zzpi zzpiVar = zztoVar.zzb;
        int i = zzph.zza;
    }

    private final int zzz(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzm[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.zzl[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
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
    public final int zzd(zzja zzjaVar, zzgc zzgcVar, int i, boolean z) {
        int zzB = zzB(zzjaVar, zzgcVar, (i & 2) != 0, z, this.zzb);
        if (zzB != -4) {
            return zzB;
        }
        if (!zzgcVar.zzg()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                if (i2 == 0) {
                    this.zza.zze(zzgcVar, this.zzb);
                    this.zzr++;
                    return -4;
                }
                this.zza.zzd(zzgcVar, this.zzb);
            }
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ int zze(zzp zzpVar, int i, boolean z) {
        return zzzx.zza(this, zzpVar, i, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final int zzf(zzp zzpVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zza(zzpVar, i, z);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzad zzh() {
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

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzk(zzad zzadVar) {
        this.zzy = zzadVar;
        boolean zzL = zzL(zzadVar);
        zztp zztpVar = this.zzf;
        if (zztpVar == null || !zzL) {
            return;
        }
        zztpVar.zzJ(zzadVar);
    }

    public final void zzm() throws IOException {
        zzpk zzpkVar = this.zzC;
        if (zzpkVar != null) {
            throw zzpkVar.zza();
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

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ void zzq(zzdy zzdyVar, int i) {
        zzzx.zzb(this, zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzr(zzdy zzdyVar, int i, int i2) {
        this.zza.zzh(zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzs(long j, int i, int i2, int i3, zzzy zzzyVar) {
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
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.zzz))));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzF(j, i, (this.zza.zzb() - i2) - i3, i2, zzzyVar);
    }

    public final void zzt(long j) {
        this.zzs = j;
    }

    public final void zzu(zztp zztpVar) {
        this.zzf = zztpVar;
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
        zzcw.zzd(z);
        this.zzr += i;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z) {
        boolean z2 = true;
        if (zzJ()) {
            if (((zzto) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzK(zzA(this.zzr));
        }
        if (!z && !this.zzv) {
            zzad zzadVar = this.zzz;
            if (zzadVar == null) {
                z2 = false;
            } else if (zzadVar == this.zzg) {
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

    private final void zzG(zzad zzadVar, zzja zzjaVar) {
        zzad zzadVar2 = this.zzg;
        zzv zzvVar = zzadVar2 == null ? null : zzadVar2.zzp;
        this.zzg = zzadVar;
        zzv zzvVar2 = zzadVar.zzp;
        zzjaVar.zza = zzadVar.zzc(this.zzd.zza(zzadVar));
        zzjaVar.zzb = this.zzC;
        if (zzadVar2 == null || !zzeg.zzS(zzvVar, zzvVar2)) {
            zzpk zzpkVar = zzadVar.zzp != null ? new zzpk(new zzpb(new zzpm(1), 6001)) : null;
            this.zzC = zzpkVar;
            zzjaVar.zzb = zzpkVar;
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

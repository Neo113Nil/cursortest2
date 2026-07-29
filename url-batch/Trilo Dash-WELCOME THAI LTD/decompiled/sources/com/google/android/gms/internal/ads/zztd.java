package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zztd implements zzrz, zzyv, zzwc, zzwh, zztp {
    private static final Map zzb;
    private static final zzad zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwa zzM;
    private final zzvw zzN;
    private final Uri zzd;
    private final zzer zze;
    private final zzpj zzf;
    private final zzsk zzg;
    private final zzpd zzh;
    private final zzsz zzi;
    private final long zzj;
    private final zzsu zzl;
    private zzry zzq;
    private zzabl zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztc zzx;
    private zzzv zzy;
    private final zzwk zzk = new zzwk("ProgressiveMediaPeriod");
    private final zzcz zzm = new zzcz(zzcx.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzsv
        @Override // java.lang.Runnable
        public final void run() {
            zztd.this.zzS();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzsw
        @Override // java.lang.Runnable
        public final void run() {
            zztd.this.zzC();
        }
    };
    private final Handler zzp = zzeg.zzC(null);
    private zztb[] zzt = new zztb[0];
    private zztq[] zzs = new zztq[0];
    private long zzH = -9223372036854775807L;
    private long zzF = -1;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzab zzabVar = new zzab();
        zzabVar.zzH("icy");
        zzabVar.zzS("application/x-icy");
        zzc = zzabVar.zzY();
    }

    public zztd(Uri uri, zzer zzerVar, zzsu zzsuVar, zzpj zzpjVar, zzpd zzpdVar, zzwa zzwaVar, zzsk zzskVar, zzsz zzszVar, zzvw zzvwVar, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzerVar;
        this.zzf = zzpjVar;
        this.zzh = zzpdVar;
        this.zzM = zzwaVar;
        this.zzg = zzskVar;
        this.zzi = zzszVar;
        this.zzN = zzvwVar;
        this.zzj = i;
        this.zzl = zzsuVar;
    }

    private final int zzN() {
        int i = 0;
        for (zztq zztqVar : this.zzs) {
            i += zztqVar.zzc();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzO() {
        long j = Long.MIN_VALUE;
        for (zztq zztqVar : this.zzs) {
            j = Math.max(j, zztqVar.zzg());
        }
        return j;
    }

    private final zzzz zzP(zztb zztbVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zztbVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzvw zzvwVar = this.zzN;
        zzpj zzpjVar = this.zzf;
        zzpd zzpdVar = this.zzh;
        Objects.requireNonNull(zzpjVar);
        zztq zztqVar = new zztq(zzvwVar, zzpjVar, zzpdVar, null);
        zztqVar.zzu(this);
        int i2 = length + 1;
        zztb[] zztbVarArr = (zztb[]) Arrays.copyOf(this.zzt, i2);
        zztbVarArr[length] = zztbVar;
        this.zzt = (zztb[]) zzeg.zzab(zztbVarArr);
        zztq[] zztqVarArr = (zztq[]) Arrays.copyOf(this.zzs, i2);
        zztqVarArr[length] = zztqVar;
        this.zzs = (zztq[]) zzeg.zzab(zztqVarArr);
        return zztqVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzQ() {
        zzcw.zzf(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    private final void zzR(zzsy zzsyVar) {
        long j;
        if (this.zzF == -1) {
            j = zzsyVar.zzm;
            this.zzF = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzS() {
        int i;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zztq zztqVar : this.zzs) {
            if (zztqVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzck[] zzckVarArr = new zzck[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzad zzh = this.zzs[i2].zzh();
            Objects.requireNonNull(zzh);
            String str = zzh.zzm;
            boolean zzg = zzbo.zzg(str);
            boolean z = zzg || zzbo.zzh(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzabl zzablVar = this.zzr;
            if (zzablVar != null) {
                if (zzg || this.zzt[i2].zzb) {
                    zzbl zzblVar = zzh.zzk;
                    zzbl zzblVar2 = zzblVar == null ? new zzbl(zzablVar) : zzblVar.zzc(zzablVar);
                    zzab zzb2 = zzh.zzb();
                    zzb2.zzM(zzblVar2);
                    zzh = zzb2.zzY();
                }
                if (zzg && zzh.zzg == -1 && zzh.zzh == -1 && (i = zzablVar.zza) != -1) {
                    zzab zzb3 = zzh.zzb();
                    zzb3.zzv(i);
                    zzh = zzb3.zzY();
                }
            }
            zzckVarArr[i2] = new zzck(Integer.toString(i2), zzh.zzc(this.zzf.zza(zzh)));
        }
        this.zzx = new zztc(new zztz(zzckVarArr), zArr);
        this.zzv = true;
        zzry zzryVar = this.zzq;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzi(this);
    }

    private final void zzT(int i) {
        zzQ();
        zztc zztcVar = this.zzx;
        boolean[] zArr = zztcVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzad zzb2 = zztcVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(zzbo.zzb(zzb2.zzm), zzb2, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzU(int i) {
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zztq zztqVar : this.zzs) {
                zztqVar.zzp(false);
            }
            zzry zzryVar = this.zzq;
            Objects.requireNonNull(zzryVar);
            zzryVar.zzg(this);
        }
    }

    private final void zzV() {
        zzew zzewVar;
        long j;
        long j2;
        zzsy zzsyVar = new zzsy(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzcw.zzf(zzW());
            long j3 = this.zzz;
            if (j3 != -9223372036854775807L && this.zzH > j3) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzzv zzzvVar = this.zzy;
            Objects.requireNonNull(zzzvVar);
            zzsy.zzg(zzsyVar, zzzvVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zztq zztqVar : this.zzs) {
                zztqVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzN();
        long zza = this.zzk.zza(zzsyVar, this, zzwa.zza(this.zzB));
        zzewVar = zzsyVar.zzl;
        zzsk zzskVar = this.zzg;
        j = zzsyVar.zzb;
        zzrs zzrsVar = new zzrs(j, zzewVar, zzewVar.zza, Collections.emptyMap(), zza, 0L, 0L);
        j2 = zzsyVar.zzk;
        zzskVar.zzl(zzrsVar, 1, -1, null, 0, null, j2, this.zzz);
    }

    private final boolean zzW() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzX() {
        return this.zzD || zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final void zzB() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    final void zzE() throws IOException {
        this.zzk.zzi(zzwa.zza(this.zzB));
    }

    final void zzF(int i) throws IOException {
        this.zzs[i].zzm();
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final /* bridge */ /* synthetic */ void zzG(zzwg zzwgVar, long j, long j2, boolean z) {
        zzfs zzfsVar;
        long j3;
        zzew zzewVar;
        long j4;
        long unused;
        zzsy zzsyVar = (zzsy) zzwgVar;
        zzfsVar = zzsyVar.zzd;
        j3 = zzsyVar.zzb;
        zzewVar = zzsyVar.zzl;
        zzrs zzrsVar = new zzrs(j3, zzewVar, zzfsVar.zzh(), zzfsVar.zzi(), j, j2, zzfsVar.zzg());
        unused = zzsyVar.zzb;
        zzsk zzskVar = this.zzg;
        j4 = zzsyVar.zzk;
        zzskVar.zzf(zzrsVar, 1, -1, null, 0, null, j4, this.zzz);
        if (z) {
            return;
        }
        zzR(zzsyVar);
        for (zztq zztqVar : this.zzs) {
            zztqVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzry zzryVar = this.zzq;
            Objects.requireNonNull(zzryVar);
            zzryVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final /* bridge */ /* synthetic */ void zzH(zzwg zzwgVar, long j, long j2) {
        zzfs zzfsVar;
        long j3;
        zzew zzewVar;
        long j4;
        zzzv zzzvVar;
        long unused;
        if (this.zzz == -9223372036854775807L && (zzzvVar = this.zzy) != null) {
            boolean zzh = zzzvVar.zzh();
            long zzO = zzO();
            long j5 = zzO == Long.MIN_VALUE ? 0L : zzO + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzz = j5;
            this.zzi.zza(j5, zzh, this.zzA);
        }
        zzsy zzsyVar = (zzsy) zzwgVar;
        zzfsVar = zzsyVar.zzd;
        j3 = zzsyVar.zzb;
        zzewVar = zzsyVar.zzl;
        zzrs zzrsVar = new zzrs(j3, zzewVar, zzfsVar.zzh(), zzfsVar.zzi(), j, j2, zzfsVar.zzg());
        unused = zzsyVar.zzb;
        zzsk zzskVar = this.zzg;
        j4 = zzsyVar.zzk;
        zzskVar.zzh(zzrsVar, 1, -1, null, 0, null, j4, this.zzz);
        zzR(zzsyVar);
        this.zzK = true;
        zzry zzryVar = this.zzq;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzI() {
        for (zztq zztqVar : this.zzs) {
            zztqVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final void zzJ(zzad zzadVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzK() {
        if (this.zzv) {
            for (zztq zztqVar : this.zzs) {
                zztqVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final void zzL(final zzzv zzzvVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsx
            @Override // java.lang.Runnable
            public final void run() {
                zztd.this.zzD(zzzvVar);
            }
        });
    }

    final boolean zzM(int i) {
        return !zzX() && this.zzs[i].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j, zzjx zzjxVar) {
        long j2;
        zzQ();
        if (!this.zzy.zzh()) {
            return 0L;
        }
        zzzt zzg = this.zzy.zzg(j);
        long j3 = zzg.zza.zzb;
        long j4 = zzg.zzb.zzb;
        long j5 = zzjxVar.zzf;
        if (j5 != 0) {
            j2 = j5;
        } else {
            if (zzjxVar.zzg == 0) {
                return j;
            }
            j2 = 0;
        }
        long zzx = zzeg.zzx(j, j2, Long.MIN_VALUE);
        long zzq = zzeg.zzq(j, zzjxVar.zzg, Long.MAX_VALUE);
        boolean z = zzx <= j3 && j3 <= zzq;
        boolean z2 = zzx <= j4 && j4 <= zzq;
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j4 - j)) {
                return j4;
            }
        } else if (!z) {
            return z2 ? j4 : zzx;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        long j;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzK) {
            return Long.MIN_VALUE;
        }
        if (zzW()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.zzs[i].zzw()) {
                    j = Math.min(j, this.zzs[i].zzg());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzO();
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        if (this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzN() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zze(long j) {
        int i;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzW()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            while (i < length) {
                i = (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzwk zzwkVar = this.zzk;
        if (zzwkVar.zzl()) {
            for (zztq zztqVar : this.zzs) {
                zztqVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzwkVar.zzh();
            for (zztq zztqVar2 : this.zzs) {
                zztqVar2.zzp(false);
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r2 == 0) goto L19;
     */
    @Override // com.google.android.gms.internal.ads.zzrz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(zzvh[] zzvhVarArr, boolean[] zArr, zztr[] zztrVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzvh zzvhVar;
        int i;
        zzQ();
        zztc zztcVar = this.zzx;
        zztz zztzVar = zztcVar.zza;
        boolean[] zArr3 = zztcVar.zzc;
        int i2 = this.zzE;
        int i3 = 0;
        for (int i4 = 0; i4 < zzvhVarArr.length; i4++) {
            zztr zztrVar = zztrVarArr[i4];
            if (zztrVar != null && (zzvhVarArr[i4] == null || !zArr[i4])) {
                i = ((zzta) zztrVar).zzb;
                zzcw.zzf(zArr3[i]);
                this.zzE--;
                zArr3[i] = false;
                zztrVarArr[i4] = null;
            }
        }
        if (!this.zzC) {
            if (j == 0) {
                j = 0;
                z = false;
            }
            z = true;
        }
        for (int i5 = 0; i5 < zzvhVarArr.length; i5++) {
            if (zztrVarArr[i5] == null && (zzvhVar = zzvhVarArr[i5]) != null) {
                zzcw.zzf(zzvhVar.zzc() == 1);
                zzcw.zzf(zzvhVar.zza(0) == 0);
                int zza = zztzVar.zza(zzvhVar.zze());
                zzcw.zzf(!zArr3[zza]);
                this.zzE++;
                zArr3[zza] = true;
                zztrVarArr[i5] = new zzta(this, zza);
                zArr2[i5] = true;
                if (!z) {
                    zztq zztqVar = this.zzs[zza];
                    z = (zztqVar.zzy(j, true) || zztqVar.zza() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzl()) {
                zztq[] zztqVarArr = this.zzs;
                int length = zztqVarArr.length;
                while (i3 < length) {
                    zztqVarArr[i3].zzj();
                    i3++;
                }
                this.zzk.zzg();
            } else {
                for (zztq zztqVar2 : this.zzs) {
                    zztqVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i3 < zztrVarArr.length) {
                if (zztrVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzC = true;
        return j;
    }

    final int zzg(int i, zzja zzjaVar, zzgc zzgcVar, int i2) {
        if (zzX()) {
            return -3;
        }
        zzT(i);
        int zzd = this.zzs[i].zzd(zzjaVar, zzgcVar, i2, this.zzK);
        if (zzd == -3) {
            zzU(i);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final zztz zzh() {
        zzQ();
        return this.zzx.zza;
    }

    final int zzi(int i, long j) {
        if (zzX()) {
            return 0;
        }
        zzT(i);
        zztq zztqVar = this.zzs[i];
        int zzb2 = zztqVar.zzb(j, this.zzK);
        zztqVar.zzv(zzb2);
        if (zzb2 != 0) {
            return zzb2;
        }
        zzU(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzj(long j, boolean z) {
        zzQ();
        if (zzW()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() throws IOException {
        zzE();
        if (this.zzK && !this.zzv) {
            throw zzbp.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j) {
        this.zzq = zzryVar;
        this.zzm.zze();
        zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze;
        }
        zzV();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    @Override // com.google.android.gms.internal.ads.zzwc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzwe zzt(zzwg zzwgVar, long j, long j2, IOException iOException, int i) {
        zzfs zzfsVar;
        long j3;
        zzew zzewVar;
        long j4;
        long j5;
        zzwe zzb2;
        zzzv zzzvVar;
        boolean z;
        long j6;
        long unused;
        zzsy zzsyVar = (zzsy) zzwgVar;
        zzR(zzsyVar);
        zzfsVar = zzsyVar.zzd;
        j3 = zzsyVar.zzb;
        zzewVar = zzsyVar.zzl;
        zzrs zzrsVar = new zzrs(j3, zzewVar, zzfsVar.zzh(), zzfsVar.zzi(), j, j2, zzfsVar.zzg());
        j4 = zzsyVar.zzk;
        Throwable th = new zzwb(zzrsVar, new zzrx(1, -1, null, 0, null, zzeg.zzz(j4), zzeg.zzz(this.zzz)), iOException, i).zzc;
        if (!(th instanceof zzbp) && !(th instanceof FileNotFoundException) && !(th instanceof zzfj) && !(th instanceof zzwj)) {
            while (th != null) {
                if (!(th instanceof zzes) || ((zzes) th).zza != 2008) {
                    th = th.getCause();
                }
            }
            j5 = Math.min((r3.zzd - 1) * 1000, 5000);
            if (j5 != -9223372036854775807L) {
                zzb2 = zzwk.zzd;
            } else {
                int zzN = zzN();
                boolean z2 = zzN > this.zzJ;
                if (this.zzF == -1 && ((zzzvVar = this.zzy) == null || zzzvVar.zze() == -9223372036854775807L)) {
                    boolean z3 = this.zzv;
                    if (!z3 || zzX()) {
                        this.zzD = z3;
                        this.zzG = 0L;
                        this.zzJ = 0;
                        for (zztq zztqVar : this.zzs) {
                            zztqVar.zzp(false);
                        }
                        zzsy.zzg(zzsyVar, 0L, 0L);
                    } else {
                        this.zzI = true;
                        zzb2 = zzwk.zzc;
                    }
                } else {
                    this.zzJ = zzN;
                }
                zzb2 = zzwk.zzb(z2, j5);
            }
            z = !zzb2.zzc();
            zzsk zzskVar = this.zzg;
            j6 = zzsyVar.zzk;
            zzskVar.zzj(zzrsVar, 1, -1, null, 0, null, j6, this.zzz, iOException, z);
            if (z) {
                unused = zzsyVar.zzb;
            }
            return zzb2;
        }
        j5 = -9223372036854775807L;
        if (j5 != -9223372036854775807L) {
        }
        z = !zzb2.zzc();
        zzsk zzskVar2 = this.zzg;
        j6 = zzsyVar.zzk;
        zzskVar2.zzj(zzrsVar, 1, -1, null, 0, null, j6, this.zzz, iOException, z);
        if (z) {
        }
        return zzb2;
    }

    final zzzz zzu() {
        return zzP(new zztb(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final zzzz zzv(int i, int i2) {
        return zzP(new zztb(i, false));
    }

    final /* synthetic */ void zzC() {
        if (this.zzL) {
            return;
        }
        zzry zzryVar = this.zzq;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzg(this);
    }

    final /* synthetic */ void zzD(zzzv zzzvVar) {
        this.zzy = this.zzr == null ? zzzvVar : new zzzu(-9223372036854775807L, 0L);
        this.zzz = zzzvVar.zze();
        boolean z = false;
        if (this.zzF == -1 && zzzvVar.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzzvVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzS();
    }
}

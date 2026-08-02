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

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zztl implements zzsg, zzzl, zzwo, zzwt, zztx {
    private static final Map zzb;
    private static final zzaf zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzwm zzM;
    private final zzwi zzN;
    private final Uri zzd;
    private final zzex zze;
    private final zzpq zzf;
    private final zzsr zzg;
    private final zzpk zzh;
    private final zzth zzi;
    private final long zzj;
    private final zztb zzl;
    private zzsf zzq;
    private zzacm zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztk zzx;
    private zzaal zzy;
    private final zzww zzk = new zzww("ProgressiveMediaPeriod");
    private final zzdg zzm = new zzdg(zzde.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zztc
        @Override // java.lang.Runnable
        public final void run() {
            zztl.this.zzT();
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zztd
        @Override // java.lang.Runnable
        public final void run() {
            zztl.this.zzD();
        }
    };
    private final Handler zzp = zzen.zzD(null);
    private zztj[] zzt = new zztj[0];
    private zzty[] zzs = new zzty[0];
    private long zzH = -9223372036854775807L;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzad zzadVar = new zzad();
        zzadVar.zzH("icy");
        zzadVar.zzS("application/x-icy");
        zzc = zzadVar.zzY();
    }

    public zztl(Uri uri, zzex zzexVar, zztb zztbVar, zzpq zzpqVar, zzpk zzpkVar, zzwm zzwmVar, zzsr zzsrVar, zzth zzthVar, zzwi zzwiVar, String str, int i, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzexVar;
        this.zzf = zzpqVar;
        this.zzh = zzpkVar;
        this.zzM = zzwmVar;
        this.zzg = zzsrVar;
        this.zzi = zzthVar;
        this.zzN = zzwiVar;
        this.zzj = i;
        this.zzl = zztbVar;
    }

    static /* bridge */ /* synthetic */ void zzB(final zztl zztlVar) {
        zztlVar.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzte
            @Override // java.lang.Runnable
            public final void run() {
                zztl.this.zzE();
            }
        });
    }

    private final int zzP() {
        int i = 0;
        for (zzty zztyVar : this.zzs) {
            i += zztyVar.zzc();
        }
        return i;
    }

    private final long zzQ(boolean z) {
        int i;
        long j = Long.MIN_VALUE;
        while (true) {
            zzty[] zztyVarArr = this.zzs;
            if (i >= zztyVarArr.length) {
                return j;
            }
            if (!z) {
                zztk zztkVar = this.zzx;
                Objects.requireNonNull(zztkVar);
                i = zztkVar.zzc[i] ? 0 : i + 1;
            }
            j = Math.max(j, zztyVarArr[i].zzg());
        }
    }

    private final zzaap zzR(zztj zztjVar) {
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            if (zztjVar.equals(this.zzt[i])) {
                return this.zzs[i];
            }
        }
        zzwi zzwiVar = this.zzN;
        zzpq zzpqVar = this.zzf;
        zzpk zzpkVar = this.zzh;
        Objects.requireNonNull(zzpqVar);
        zzty zztyVar = new zzty(zzwiVar, zzpqVar, zzpkVar, null);
        zztyVar.zzu(this);
        int i2 = length + 1;
        zztj[] zztjVarArr = (zztj[]) Arrays.copyOf(this.zzt, i2);
        zztjVarArr[length] = zztjVar;
        this.zzt = (zztj[]) zzen.zzac(zztjVarArr);
        zzty[] zztyVarArr = (zzty[]) Arrays.copyOf(this.zzs, i2);
        zztyVarArr[length] = zztyVar;
        this.zzs = (zzty[]) zzen.zzac(zztyVarArr);
        return zztyVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzS() {
        zzdd.zzf(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        int i;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zzty zztyVar : this.zzs) {
            if (zztyVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzcp[] zzcpVarArr = new zzcp[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaf zzh = this.zzs[i2].zzh();
            Objects.requireNonNull(zzh);
            String str = zzh.zzm;
            boolean zzg = zzbt.zzg(str);
            boolean z = zzg || zzbt.zzh(str);
            zArr[i2] = z;
            this.zzw = z | this.zzw;
            zzacm zzacmVar = this.zzr;
            if (zzacmVar != null) {
                if (zzg || this.zzt[i2].zzb) {
                    zzbq zzbqVar = zzh.zzk;
                    zzbq zzbqVar2 = zzbqVar == null ? new zzbq(-9223372036854775807L, zzacmVar) : zzbqVar.zzc(zzacmVar);
                    zzad zzb2 = zzh.zzb();
                    zzb2.zzM(zzbqVar2);
                    zzh = zzb2.zzY();
                }
                if (zzg && zzh.zzg == -1 && zzh.zzh == -1 && (i = zzacmVar.zza) != -1) {
                    zzad zzb3 = zzh.zzb();
                    zzb3.zzv(i);
                    zzh = zzb3.zzY();
                }
            }
            zzcpVarArr[i2] = new zzcp(Integer.toString(i2), zzh.zzc(this.zzf.zza(zzh)));
        }
        this.zzx = new zztk(new zzuh(zzcpVarArr), zArr);
        this.zzv = true;
        zzsf zzsfVar = this.zzq;
        Objects.requireNonNull(zzsfVar);
        zzsfVar.zzi(this);
    }

    private final void zzU(int i) {
        zzS();
        zztk zztkVar = this.zzx;
        boolean[] zArr = zztkVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzaf zzb2 = zztkVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(zzbt.zzb(zzb2.zzm), zzb2, 0, null, this.zzG);
        zArr[i] = true;
    }

    private final void zzV(int i) {
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i] && !this.zzs[i].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zzty zztyVar : this.zzs) {
                zztyVar.zzp(false);
            }
            zzsf zzsfVar = this.zzq;
            Objects.requireNonNull(zzsfVar);
            zzsfVar.zzg(this);
        }
    }

    private final void zzW() {
        zzfc zzfcVar;
        long j;
        long j2;
        zztg zztgVar = new zztg(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzdd.zzf(zzX());
            long j3 = this.zzz;
            if (j3 != -9223372036854775807L && this.zzH > j3) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzaal zzaalVar = this.zzy;
            Objects.requireNonNull(zzaalVar);
            zztg.zzf(zztgVar, zzaalVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zzty zztyVar : this.zzs) {
                zztyVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzP();
        long zza = this.zzk.zza(zztgVar, this, zzwm.zza(this.zzB));
        zzfcVar = zztgVar.zzl;
        zzsr zzsrVar = this.zzg;
        j = zztgVar.zzb;
        zzrz zzrzVar = new zzrz(j, zzfcVar, zzfcVar.zza, Collections.emptyMap(), zza, 0L, 0L);
        j2 = zztgVar.zzk;
        zzsrVar.zzl(zzrzVar, 1, -1, null, 0, null, j2, this.zzz);
    }

    private final boolean zzX() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzY() {
        return this.zzD || zzX();
    }

    static /* bridge */ /* synthetic */ long zzq(zztl zztlVar, boolean z) {
        return zztlVar.zzQ(true);
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzC() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    final /* synthetic */ void zzE() {
        this.zzF = true;
    }

    final void zzG() throws IOException {
        this.zzk.zzi(zzwm.zza(this.zzB));
    }

    final void zzH(int i) throws IOException {
        this.zzs[i].zzm();
        zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzI(zzws zzwsVar, long j, long j2, boolean z) {
        zzfy zzfyVar;
        long j3;
        zzfc zzfcVar;
        long j4;
        long unused;
        zztg zztgVar = (zztg) zzwsVar;
        zzfyVar = zztgVar.zzd;
        j3 = zztgVar.zzb;
        zzfcVar = zztgVar.zzl;
        zzrz zzrzVar = new zzrz(j3, zzfcVar, zzfyVar.zzh(), zzfyVar.zzi(), j, j2, zzfyVar.zzg());
        unused = zztgVar.zzb;
        zzsr zzsrVar = this.zzg;
        j4 = zztgVar.zzk;
        zzsrVar.zzf(zzrzVar, 1, -1, null, 0, null, j4, this.zzz);
        if (z) {
            return;
        }
        for (zzty zztyVar : this.zzs) {
            zztyVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzsf zzsfVar = this.zzq;
            Objects.requireNonNull(zzsfVar);
            zzsfVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwo
    public final /* bridge */ /* synthetic */ void zzJ(zzws zzwsVar, long j, long j2) {
        zzfy zzfyVar;
        long j3;
        zzfc zzfcVar;
        long j4;
        zzaal zzaalVar;
        long unused;
        if (this.zzz == -9223372036854775807L && (zzaalVar = this.zzy) != null) {
            boolean zzh = zzaalVar.zzh();
            long zzQ = zzQ(true);
            long j5 = zzQ == Long.MIN_VALUE ? 0L : zzQ + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzz = j5;
            this.zzi.zza(j5, zzh, this.zzA);
        }
        zztg zztgVar = (zztg) zzwsVar;
        zzfyVar = zztgVar.zzd;
        j3 = zztgVar.zzb;
        zzfcVar = zztgVar.zzl;
        zzrz zzrzVar = new zzrz(j3, zzfcVar, zzfyVar.zzh(), zzfyVar.zzi(), j, j2, zzfyVar.zzg());
        unused = zztgVar.zzb;
        zzsr zzsrVar = this.zzg;
        j4 = zztgVar.zzk;
        zzsrVar.zzh(zzrzVar, 1, -1, null, 0, null, j4, this.zzz);
        this.zzK = true;
        zzsf zzsfVar = this.zzq;
        Objects.requireNonNull(zzsfVar);
        zzsfVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final void zzK() {
        for (zzty zztyVar : this.zzs) {
            zztyVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final void zzL(zzaf zzafVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzM() {
        if (this.zzv) {
            for (zzty zztyVar : this.zzs) {
                zztyVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzN(final zzaal zzaalVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztf
            @Override // java.lang.Runnable
            public final void run() {
                zztl.this.zzF(zzaalVar);
            }
        });
    }

    final boolean zzO(int i) {
        return !zzY() && this.zzs[i].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zza(long j, zzkd zzkdVar) {
        long j2;
        zzS();
        if (!this.zzy.zzh()) {
            return 0L;
        }
        zzaaj zzg = this.zzy.zzg(j);
        long j3 = zzg.zza.zzb;
        long j4 = zzg.zzb.zzb;
        long j5 = zzkdVar.zzf;
        if (j5 != 0) {
            j2 = j5;
        } else {
            if (zzkdVar.zzg == 0) {
                return j;
            }
            j2 = 0;
        }
        long zzx = zzen.zzx(j, j2, Long.MIN_VALUE);
        long zzq = zzen.zzq(j, zzkdVar.zzg, Long.MAX_VALUE);
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

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final long zzb() {
        long j;
        zzS();
        if (this.zzK || this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        if (zzX()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zztk zztkVar = this.zzx;
                if (zztkVar.zzb[i] && zztkVar.zzc[i] && !this.zzs[i].zzw()) {
                    j = Math.min(j, this.zzs[i].zzg());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzQ(false);
        }
        return j == Long.MIN_VALUE ? this.zzG : j;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzd() {
        if (!this.zzD) {
            return -9223372036854775807L;
        }
        if (!this.zzK && zzP() <= this.zzJ) {
            return -9223372036854775807L;
        }
        this.zzD = false;
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zze(long j) {
        int i;
        zzS();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j = 0;
        }
        this.zzD = false;
        this.zzG = j;
        if (zzX()) {
            this.zzH = j;
            return j;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            for (0; i < length; i + 1) {
                i = (this.zzs[i].zzy(j, false) || (!zArr[i] && this.zzw)) ? i + 1 : 0;
            }
            return j;
        }
        this.zzI = false;
        this.zzH = j;
        this.zzK = false;
        zzww zzwwVar = this.zzk;
        if (zzwwVar.zzl()) {
            for (zzty zztyVar : this.zzs) {
                zztyVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzwwVar.zzh();
            for (zzty zztyVar2 : this.zzs) {
                zztyVar2.zzp(false);
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzf(zzvt[] zzvtVarArr, boolean[] zArr, zztz[] zztzVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzvt zzvtVar;
        int i;
        zzS();
        zztk zztkVar = this.zzx;
        zzuh zzuhVar = zztkVar.zza;
        boolean[] zArr3 = zztkVar.zzc;
        int i2 = this.zzE;
        int i3 = 0;
        for (int i4 = 0; i4 < zzvtVarArr.length; i4++) {
            zztz zztzVar = zztzVarArr[i4];
            if (zztzVar != null && (zzvtVarArr[i4] == null || !zArr[i4])) {
                i = ((zzti) zztzVar).zzb;
                zzdd.zzf(zArr3[i]);
                this.zzE--;
                zArr3[i] = false;
                zztzVarArr[i4] = null;
            }
        }
        if (this.zzC) {
            if (i2 != 0) {
                z = false;
            }
            z = true;
        } else {
            if (j == 0) {
                z = false;
                j = 0;
            }
            z = true;
        }
        for (int i5 = 0; i5 < zzvtVarArr.length; i5++) {
            if (zztzVarArr[i5] == null && (zzvtVar = zzvtVarArr[i5]) != null) {
                zzdd.zzf(zzvtVar.zzc() == 1);
                zzdd.zzf(zzvtVar.zza(0) == 0);
                int zza = zzuhVar.zza(zzvtVar.zze());
                zzdd.zzf(!zArr3[zza]);
                this.zzE++;
                zArr3[zza] = true;
                zztzVarArr[i5] = new zzti(this, zza);
                zArr2[i5] = true;
                if (!z) {
                    zzty zztyVar = this.zzs[zza];
                    z = (zztyVar.zzy(j, true) || zztyVar.zza() == 0) ? false : true;
                }
            }
        }
        if (this.zzE == 0) {
            this.zzI = false;
            this.zzD = false;
            if (this.zzk.zzl()) {
                zzty[] zztyVarArr = this.zzs;
                int length = zztyVarArr.length;
                while (i3 < length) {
                    zztyVarArr[i3].zzj();
                    i3++;
                }
                this.zzk.zzg();
            } else {
                for (zzty zztyVar2 : this.zzs) {
                    zztyVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i3 < zztzVarArr.length) {
                if (zztzVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzC = true;
        return j;
    }

    final int zzg(int i, zzjg zzjgVar, zzgi zzgiVar, int i2) {
        if (zzY()) {
            return -3;
        }
        zzU(i);
        int zzd = this.zzs[i].zzd(zzjgVar, zzgiVar, i2, this.zzK);
        if (zzd == -3) {
            zzV(i);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzuh zzh() {
        zzS();
        return this.zzx.zza;
    }

    final int zzi(int i, long j) {
        if (zzY()) {
            return 0;
        }
        zzU(i);
        zzty zztyVar = this.zzs[i];
        int zzb2 = zztyVar.zzb(j, this.zzK);
        zztyVar.zzv(zzb2);
        if (zzb2 != 0) {
            return zzb2;
        }
        zzV(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzj(long j, boolean z) {
        zzS();
        if (zzX()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i = 0; i < length; i++) {
            this.zzs[i].zzi(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzk() throws IOException {
        zzG();
        if (this.zzK && !this.zzv) {
            throw zzbu.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzl(zzsf zzsfVar, long j) {
        this.zzq = zzsfVar;
        this.zzm.zze();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
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
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    @Override // com.google.android.gms.internal.ads.zzwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ zzwq zzt(zzws zzwsVar, long j, long j2, IOException iOException, int i) {
        zzfy zzfyVar;
        long j3;
        zzfc zzfcVar;
        long j4;
        long j5;
        zzwq zzb2;
        zzaal zzaalVar;
        boolean z;
        long j6;
        long unused;
        zztg zztgVar = (zztg) zzwsVar;
        zzfyVar = zztgVar.zzd;
        j3 = zztgVar.zzb;
        zzfcVar = zztgVar.zzl;
        zzrz zzrzVar = new zzrz(j3, zzfcVar, zzfyVar.zzh(), zzfyVar.zzi(), j, j2, zzfyVar.zzg());
        j4 = zztgVar.zzk;
        Throwable th = new zzwn(zzrzVar, new zzse(1, -1, null, 0, null, zzen.zzz(j4), zzen.zzz(this.zzz)), iOException, i).zzc;
        if (!(th instanceof zzbu) && !(th instanceof FileNotFoundException) && !(th instanceof zzfp) && !(th instanceof zzwv)) {
            while (th != null) {
                if (!(th instanceof zzey) || ((zzey) th).zza != 2008) {
                    th = th.getCause();
                }
            }
            j5 = Math.min((r3.zzd - 1) * 1000, 5000);
            if (j5 != -9223372036854775807L) {
                zzb2 = zzww.zzd;
            } else {
                int zzP = zzP();
                boolean z2 = zzP > this.zzJ;
                if (this.zzF || !((zzaalVar = this.zzy) == null || zzaalVar.zze() == -9223372036854775807L)) {
                    this.zzJ = zzP;
                } else {
                    boolean z3 = this.zzv;
                    if (!z3 || zzY()) {
                        this.zzD = z3;
                        this.zzG = 0L;
                        this.zzJ = 0;
                        for (zzty zztyVar : this.zzs) {
                            zztyVar.zzp(false);
                        }
                        zztg.zzf(zztgVar, 0L, 0L);
                    } else {
                        this.zzI = true;
                        zzb2 = zzww.zzc;
                    }
                }
                zzb2 = zzww.zzb(z2, j5);
            }
            z = !zzb2.zzc();
            zzsr zzsrVar = this.zzg;
            j6 = zztgVar.zzk;
            zzsrVar.zzj(zzrzVar, 1, -1, null, 0, null, j6, this.zzz, iOException, z);
            if (z) {
                unused = zztgVar.zzb;
            }
            return zzb2;
        }
        j5 = -9223372036854775807L;
        if (j5 != -9223372036854775807L) {
        }
        z = !zzb2.zzc();
        zzsr zzsrVar2 = this.zzg;
        j6 = zztgVar.zzk;
        zzsrVar2.zzj(zzrzVar, 1, -1, null, 0, null, j6, this.zzz, iOException, z);
        if (z) {
        }
        return zzb2;
    }

    final zzaap zzu() {
        return zzR(new zztj(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final zzaap zzv(int i, int i2) {
        return zzR(new zztj(i, false));
    }

    final /* synthetic */ void zzD() {
        if (this.zzL) {
            return;
        }
        zzsf zzsfVar = this.zzq;
        Objects.requireNonNull(zzsfVar);
        zzsfVar.zzg(this);
    }

    final /* synthetic */ void zzF(zzaal zzaalVar) {
        this.zzy = this.zzr == null ? zzaalVar : new zzaak(-9223372036854775807L, 0L);
        this.zzz = zzaalVar.zze();
        boolean z = false;
        if (!this.zzF && zzaalVar.zze() == -9223372036854775807L) {
            z = true;
        }
        this.zzA = z;
        this.zzB = true == z ? 7 : 1;
        this.zzi.zza(this.zzz, zzaalVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzT();
    }
}

package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.UByte;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzou implements zzny {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;
    private zzng[] zzH;
    private ByteBuffer[] zzI;
    private ByteBuffer zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private byte[] zzM;
    private int zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private zzl zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private final zzok zzY;
    private final zznd zzd;
    private final zzoe zze;
    private final zzpf zzf;
    private final zzng[] zzg;
    private final zzng[] zzh;
    private final zzdg zzi;
    private final zzoc zzj;
    private final ArrayDeque zzk;
    private zzos zzl;
    private final zzon zzm;
    private final zzon zzn;
    private final zzoh zzo;
    private zznb zzp;
    private zznv zzq;
    private zzoj zzr;
    private zzoj zzs;
    private AudioTrack zzt;
    private zzk zzu;
    private zzom zzv;
    private zzom zzw;
    private final zzby zzx;
    private long zzy;
    private long zzz;

    /* synthetic */ zzou(zzoi zzoiVar, zzot zzotVar) {
        zznd zzndVar;
        zzok zzokVar;
        zzndVar = zzoiVar.zzb;
        this.zzd = zzndVar;
        zzokVar = zzoiVar.zzc;
        this.zzY = zzokVar;
        int i = zzen.zza;
        this.zzo = zzoiVar.zza;
        zzdg zzdgVar = new zzdg(zzde.zza);
        this.zzi = zzdgVar;
        zzdgVar.zze();
        this.zzj = new zzoc(new zzop(this, null));
        zzoe zzoeVar = new zzoe();
        this.zze = zzoeVar;
        zzpf zzpfVar = new zzpf();
        this.zzf = zzpfVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzpb(), zzoeVar, zzpfVar);
        Collections.addAll(arrayList, zzokVar.zze());
        this.zzg = (zzng[]) arrayList.toArray(new zzng[0]);
        this.zzh = new zzng[]{new zzox()};
        this.zzG = 1.0f;
        this.zzu = zzk.zza;
        this.zzT = 0;
        this.zzU = new zzl(0, 0.0f);
        this.zzw = new zzom(zzby.zza, false, 0L, 0L, null);
        this.zzx = zzby.zza;
        this.zzO = -1;
        this.zzH = new zzng[0];
        this.zzI = new ByteBuffer[0];
        this.zzk = new ArrayDeque();
        this.zzm = new zzon(100L);
        this.zzn = new zzon(100L);
    }

    static /* synthetic */ void zzC(AudioTrack audioTrack, zzdg zzdgVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            zzdgVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            zzdgVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzE() {
        return this.zzs.zzc == 0 ? this.zzy / r0.zzb : this.zzz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzF() {
        return this.zzs.zzc == 0 ? this.zzA / r0.zzd : this.zzB;
    }

    private final AudioTrack zzG(zzoj zzojVar) throws zznu {
        try {
            return zzojVar.zzb(false, this.zzu, this.zzT);
        } catch (zznu e) {
            zznv zznvVar = this.zzq;
            if (zznvVar != null) {
                zznvVar.zza(e);
            }
            throw e;
        }
    }

    private final zzom zzH() {
        zzom zzomVar = this.zzv;
        return zzomVar != null ? zzomVar : !this.zzk.isEmpty() ? (zzom) this.zzk.getLast() : this.zzw;
    }

    private final void zzI(long j) {
        zzby zzbyVar;
        boolean z;
        zznr zznrVar;
        if (zzT()) {
            zzok zzokVar = this.zzY;
            zzbyVar = zzH().zza;
            zzokVar.zzc(zzbyVar);
        } else {
            zzbyVar = zzby.zza;
        }
        zzby zzbyVar2 = zzbyVar;
        if (zzT()) {
            zzok zzokVar2 = this.zzY;
            boolean z2 = zzH().zzb;
            zzokVar2.zzd(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzk.add(new zzom(zzbyVar2, z, Math.max(0L, j), this.zzs.zza(zzF()), null));
        zzng[] zzngVarArr = this.zzs.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzng zzngVar : zzngVarArr) {
            if (zzngVar.zzg()) {
                arrayList.add(zzngVar);
            } else {
                zzngVar.zzc();
            }
        }
        int size = arrayList.size();
        this.zzH = (zzng[]) arrayList.toArray(new zzng[size]);
        this.zzI = new ByteBuffer[size];
        zzJ();
        zznv zznvVar = this.zzq;
        if (zznvVar != null) {
            zznrVar = ((zzoz) zznvVar).zza.zzc;
            zznrVar.zzs(z);
        }
    }

    private final void zzJ() {
        int i = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzH;
            if (i >= zzngVarArr.length) {
                return;
            }
            zzng zzngVar = zzngVarArr[i];
            zzngVar.zzc();
            this.zzI[i] = zzngVar.zzb();
            i++;
        }
    }

    private final void zzK() {
        if (this.zzs.zzc()) {
            this.zzW = true;
        }
    }

    private final void zzL() {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzc(zzF());
        this.zzt.stop();
    }

    private final void zzM(long j) throws zznx {
        ByteBuffer byteBuffer;
        int length = this.zzH.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzI[i - 1];
            } else {
                byteBuffer = this.zzJ;
                if (byteBuffer == null) {
                    byteBuffer = zzng.zza;
                }
            }
            if (i == length) {
                zzP(byteBuffer, j);
            } else {
                zzng zzngVar = this.zzH[i];
                if (i > this.zzO) {
                    zzngVar.zze(byteBuffer);
                }
                ByteBuffer zzb2 = zzngVar.zzb();
                this.zzI[i] = zzb2;
                if (zzb2.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    private final void zzN(zzby zzbyVar, boolean z) {
        zzom zzH = zzH();
        if (zzbyVar.equals(zzH.zza) && z == zzH.zzb) {
            return;
        }
        zzom zzomVar = new zzom(zzbyVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzR()) {
            this.zzv = zzomVar;
        } else {
            this.zzw = zzomVar;
        }
    }

    private final void zzO() {
        if (zzR()) {
            if (zzen.zza >= 21) {
                this.zzt.setVolume(this.zzG);
                return;
            }
            AudioTrack audioTrack = this.zzt;
            float f = this.zzG;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzP(ByteBuffer byteBuffer, long j) throws zznx {
        int write;
        zznv zznvVar;
        zzjz zzjzVar;
        zzjz zzjzVar2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzL;
            if (byteBuffer2 != null) {
                zzdd.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzL = byteBuffer;
                if (zzen.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzM;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzM = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzM, 0, remaining);
                    byteBuffer.position(position);
                    this.zzN = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzen.zza < 21) {
                int zza2 = this.zzj.zza(this.zzA);
                if (zza2 > 0) {
                    write = this.zzt.write(this.zzM, this.zzN, Math.min(remaining2, zza2));
                    if (write > 0) {
                        this.zzN += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzt.write(byteBuffer, remaining2, 1);
            }
            this.zzV = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzen.zza < 24 || write != -6) && write != -32) {
                    r0 = false;
                }
                if (r0) {
                    zzK();
                }
                zznx zznxVar = new zznx(write, this.zzs.zza, r0);
                zznv zznvVar2 = this.zzq;
                if (zznvVar2 != null) {
                    zznvVar2.zza(zznxVar);
                }
                if (zznxVar.zzb) {
                    throw zznxVar;
                }
                this.zzn.zzb(zznxVar);
                return;
            }
            this.zzn.zza();
            if (zzS(this.zzt)) {
                if (this.zzB > 0) {
                    this.zzX = false;
                }
                if (this.zzR && (zznvVar = this.zzq) != null && write < remaining2 && !this.zzX) {
                    zzpa zzpaVar = ((zzoz) zznvVar).zza;
                    zzjzVar = zzpaVar.zzl;
                    if (zzjzVar != null) {
                        zzjzVar2 = zzpaVar.zzl;
                        zzjzVar2.zza();
                    }
                }
            }
            int i = this.zzs.zzc;
            if (i == 0) {
                this.zzA += write;
            }
            if (write == remaining2) {
                if (i != 0) {
                    zzdd.zzf(byteBuffer == this.zzJ);
                    this.zzB += this.zzC * this.zzK;
                }
                this.zzL = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzQ() throws zznx {
        boolean z;
        int i;
        zzng[] zzngVarArr;
        if (this.zzO == -1) {
            this.zzO = 0;
            z = true;
            i = this.zzO;
            zzngVarArr = this.zzH;
            if (i < zzngVarArr.length) {
                zzng zzngVar = zzngVarArr[i];
                if (z) {
                    zzngVar.zzd();
                }
                zzM(-9223372036854775807L);
                if (!zzngVar.zzh()) {
                    return false;
                }
                this.zzO++;
                z = true;
                i = this.zzO;
                zzngVarArr = this.zzH;
                if (i < zzngVarArr.length) {
                    ByteBuffer byteBuffer = this.zzL;
                    if (byteBuffer != null) {
                        zzP(byteBuffer, -9223372036854775807L);
                        if (this.zzL != null) {
                            return false;
                        }
                    }
                    this.zzO = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.zzO;
            zzngVarArr = this.zzH;
            if (i < zzngVarArr.length) {
            }
        }
    }

    private final boolean zzR() {
        return this.zzt != null;
    }

    private static boolean zzS(AudioTrack audioTrack) {
        return zzen.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzT() {
        if (!"audio/raw".equals(this.zzs.zza.zzm)) {
            return false;
        }
        int i = this.zzs.zza.zzB;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final int zza(zzaf zzafVar) {
        if (!"audio/raw".equals(zzafVar.zzm)) {
            if (!this.zzW) {
                int i = zzen.zza;
            }
            return this.zzd.zza(zzafVar) != null ? 2 : 0;
        }
        if (zzen.zzV(zzafVar.zzB)) {
            return zzafVar.zzB != 2 ? 1 : 2;
        }
        zzdw.zze("DefaultAudioSink", "Invalid PCM encoding: " + zzafVar.zzB);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final long zzb(boolean z) {
        long zzs;
        if (!zzR() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zzb(z), this.zzs.zza(zzF()));
        while (!this.zzk.isEmpty() && min >= ((zzom) this.zzk.getFirst()).zzd) {
            this.zzw = (zzom) this.zzk.remove();
        }
        zzom zzomVar = this.zzw;
        long j = min - zzomVar.zzd;
        if (zzomVar.zza.equals(zzby.zza)) {
            zzs = this.zzw.zzc + j;
        } else if (this.zzk.isEmpty()) {
            zzs = this.zzY.zza(j) + this.zzw.zzc;
        } else {
            zzom zzomVar2 = (zzom) this.zzk.getFirst();
            zzs = zzomVar2.zzc - zzen.zzs(zzomVar2.zzd - min, this.zzw.zza.zzc);
        }
        return zzs + this.zzs.zza(this.zzY.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final zzby zzc() {
        return zzH().zza;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzd(zzaf zzafVar, int i, int[] iArr) throws zznt {
        int i2;
        zzng[] zzngVarArr;
        int intValue;
        int i3;
        int intValue2;
        int i4;
        int i5;
        int zzf;
        int[] iArr2;
        if ("audio/raw".equals(zzafVar.zzm)) {
            zzdd.zzd(zzen.zzV(zzafVar.zzB));
            i3 = zzen.zzo(zzafVar.zzB, zzafVar.zzz);
            int i6 = zzafVar.zzB;
            zzng[] zzngVarArr2 = this.zzg;
            this.zzf.zzq(zzafVar.zzC, zzafVar.zzD);
            if (zzen.zza < 21 && zzafVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i7 = 0; i7 < 6; i7++) {
                    iArr2[i7] = i7;
                }
            } else {
                iArr2 = iArr;
            }
            this.zze.zzo(iArr2);
            zzne zzneVar = new zzne(zzafVar.zzA, zzafVar.zzz, zzafVar.zzB);
            for (zzng zzngVar : zzngVarArr2) {
                try {
                    zzne zza2 = zzngVar.zza(zzneVar);
                    if (true == zzngVar.zzg()) {
                        zzneVar = zza2;
                    }
                } catch (zznf e) {
                    throw new zznt(e, zzafVar);
                }
            }
            int i8 = zzneVar.zzd;
            int i9 = zzneVar.zzb;
            int i10 = zzneVar.zzc;
            int zzj = zzen.zzj(i10);
            zzngVarArr = zzngVarArr2;
            i5 = zzen.zzo(i8, i10);
            i4 = i9;
            i2 = 0;
            intValue = i8;
            intValue2 = zzj;
        } else {
            zzng[] zzngVarArr3 = new zzng[0];
            int i11 = zzafVar.zzA;
            int i12 = zzen.zza;
            Pair zza3 = this.zzd.zza(zzafVar);
            if (zza3 == null) {
                throw new zznt("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzafVar))), zzafVar);
            }
            i2 = 2;
            zzngVarArr = zzngVarArr3;
            intValue = ((Integer) zza3.first).intValue();
            i3 = -1;
            intValue2 = ((Integer) zza3.second).intValue();
            i4 = i11;
            i5 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue2, intValue);
        zzdd.zzf(minBufferSize != -2);
        int i13 = 250000;
        if (i2 == 0) {
            zzf = zzen.zzf(minBufferSize * 4, zzow.zza(250000, i4, i5), zzow.zza(750000, i4, i5));
        } else if (i2 != 1) {
            int i14 = 5;
            if (intValue == 5) {
                i13 = 500000;
                intValue = 5;
            } else {
                i14 = intValue;
            }
            zzf = zzfxs.zza((i13 * zzow.zzb(intValue)) / 1000000);
            i5 = i5;
            intValue = i14;
        } else {
            zzf = zzfxs.zza((zzow.zzb(intValue) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, zzf) + i5) - 1) / i5) * i5;
        if (intValue == 0) {
            throw new zznt("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(zzafVar), zzafVar);
        }
        if (intValue2 != 0) {
            this.zzW = false;
            zzoj zzojVar = new zzoj(zzafVar, i3, i2, i5, i4, intValue2, intValue, max, zzngVarArr);
            if (zzR()) {
                this.zzr = zzojVar;
                return;
            } else {
                this.zzs = zzojVar;
                return;
            }
        }
        throw new zznt("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(zzafVar), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zze() {
        if (zzR()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzX = false;
            this.zzC = 0;
            this.zzw = new zzom(zzH().zza, zzH().zzb, 0L, 0L, null);
            this.zzF = 0L;
            this.zzv = null;
            this.zzk.clear();
            this.zzJ = null;
            this.zzK = 0;
            this.zzL = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzO = -1;
            this.zzf.zzp();
            zzJ();
            if (this.zzj.zzh()) {
                this.zzt.pause();
            }
            if (zzS(this.zzt)) {
                zzos zzosVar = this.zzl;
                Objects.requireNonNull(zzosVar);
                zzosVar.zzb(this.zzt);
            }
            if (zzen.zza < 21 && !this.zzS) {
                this.zzT = 0;
            }
            zzoj zzojVar = this.zzr;
            if (zzojVar != null) {
                this.zzs = zzojVar;
                this.zzr = null;
            }
            this.zzj.zzd();
            final AudioTrack audioTrack = this.zzt;
            final zzdg zzdgVar = this.zzi;
            zzdgVar.zzc();
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzen.zzQ("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzof
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzou.zzC(audioTrack, zzdgVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzn.zza();
        this.zzm.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzf() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzg() {
        this.zzR = false;
        if (zzR() && this.zzj.zzk()) {
            this.zzt.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzh() {
        this.zzR = true;
        if (zzR()) {
            this.zzj.zzf();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzi() throws zznx {
        if (!this.zzP && zzR() && zzQ()) {
            zzL();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzj() {
        zze();
        for (zzng zzngVar : this.zzg) {
            zzngVar.zzf();
        }
        zzng[] zzngVarArr = this.zzh;
        int length = zzngVarArr.length;
        for (int i = 0; i <= 0; i++) {
            zzngVarArr[i].zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzk(zzk zzkVar) {
        if (this.zzu.equals(zzkVar)) {
            return;
        }
        this.zzu = zzkVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzl(int i) {
        if (this.zzT != i) {
            this.zzT = i;
            this.zzS = i != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzm(zzl zzlVar) {
        if (this.zzU.equals(zzlVar)) {
            return;
        }
        int i = zzlVar.zza;
        float f = zzlVar.zzb;
        if (this.zzt != null) {
            int i2 = this.zzU.zza;
        }
        this.zzU = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzn(zznv zznvVar) {
        this.zzq = zznvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzo(zzby zzbyVar) {
        zzN(new zzby(zzen.zza(zzbyVar.zzc, 0.1f, 8.0f), zzen.zza(zzbyVar.zzd, 0.1f, 8.0f)), zzH().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzp(zznb zznbVar) {
        this.zzp = zznbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzq(boolean z) {
        zzN(zzH().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final void zzr(float f) {
        if (this.zzG != f) {
            this.zzG = f;
            zzO();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c7 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzs(ByteBuffer byteBuffer, long j, int i) throws zznu, zznx {
        AudioTrack zzG;
        boolean z;
        zznb zznbVar;
        boolean z2;
        int zza2;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.zzJ;
        zzdd.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzr != null) {
            if (!zzQ()) {
                return false;
            }
            zzoj zzojVar = this.zzr;
            zzoj zzojVar2 = this.zzs;
            if (zzojVar2.zzc == zzojVar.zzc && zzojVar2.zzg == zzojVar.zzg && zzojVar2.zze == zzojVar.zze && zzojVar2.zzf == zzojVar.zzf && zzojVar2.zzd == zzojVar.zzd) {
                this.zzs = zzojVar;
                this.zzr = null;
                if (zzS(this.zzt)) {
                    if (this.zzt.getPlayState() == 3) {
                        this.zzt.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.zzt;
                    zzaf zzafVar = this.zzs.zza;
                    audioTrack.setOffloadDelayPadding(zzafVar.zzC, zzafVar.zzD);
                    this.zzX = true;
                }
            } else {
                zzL();
                if (zzt()) {
                    return false;
                }
                zze();
            }
            zzI(j);
        }
        if (zzR()) {
            z = false;
        } else {
            try {
                if (!this.zzi.zzd()) {
                    return false;
                }
                try {
                    zzoj zzojVar3 = this.zzs;
                    Objects.requireNonNull(zzojVar3);
                    zzG = zzG(zzojVar3);
                } catch (zznu e) {
                    zzoj zzojVar4 = this.zzs;
                    if (zzojVar4.zzh > 1000000) {
                        zzoj zzojVar5 = new zzoj(zzojVar4.zza, zzojVar4.zzb, zzojVar4.zzc, zzojVar4.zzd, zzojVar4.zze, zzojVar4.zzf, zzojVar4.zzg, DurationKt.NANOS_IN_MILLIS, zzojVar4.zzi);
                        try {
                            zzG = zzG(zzojVar5);
                            this.zzs = zzojVar5;
                        } catch (zznu e2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                            } catch (Exception unused) {
                            }
                            zzK();
                            throw e;
                        }
                    }
                    zzK();
                    throw e;
                }
                this.zzt = zzG;
                if (zzS(zzG)) {
                    AudioTrack audioTrack2 = this.zzt;
                    if (this.zzl == null) {
                        this.zzl = new zzos(this);
                    }
                    this.zzl.zza(audioTrack2);
                    AudioTrack audioTrack3 = this.zzt;
                    zzaf zzafVar2 = this.zzs.zza;
                    audioTrack3.setOffloadDelayPadding(zzafVar2.zzC, zzafVar2.zzD);
                }
                if (zzen.zza >= 31 && (zznbVar = this.zzp) != null) {
                    zzog.zza(this.zzt, zznbVar);
                }
                this.zzT = this.zzt.getAudioSessionId();
                zzoc zzocVar = this.zzj;
                AudioTrack audioTrack4 = this.zzt;
                zzoj zzojVar6 = this.zzs;
                zzocVar.zze(audioTrack4, zzojVar6.zzc == 2, zzojVar6.zzg, zzojVar6.zzd, zzojVar6.zzh);
                zzO();
                int i7 = this.zzU.zza;
                this.zzE = true;
                z = false;
            } catch (zznu e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzm.zzb(e3);
                return false;
            }
        }
        this.zzm.zza();
        if (this.zzE) {
            this.zzF = Math.max(0L, j);
            this.zzD = z;
            this.zzE = z;
            zzI(j);
            if (this.zzR) {
                zzh();
            }
        }
        if (!this.zzj.zzj(zzF())) {
            return false;
        }
        if (this.zzJ == null) {
            zzdd.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzoj zzojVar7 = this.zzs;
            if (zzojVar7.zzc != 0 && this.zzC == 0) {
                int i8 = zzojVar7.zzg;
                switch (i8) {
                    case 5:
                    case 6:
                    case 18:
                        z2 = true;
                        zza2 = zzyj.zza(byteBuffer);
                        this.zzC = zza2;
                        if (zza2 == 0) {
                            return z2;
                        }
                        break;
                    case 7:
                    case 8:
                        int i9 = zzzf.zza;
                        int position = byteBuffer.position();
                        byte b2 = byteBuffer.get(position);
                        if (b2 != -2) {
                            if (b2 == -1) {
                                i3 = 2;
                                i4 = (byteBuffer.get(position + 4) & 7) << 4;
                                b = byteBuffer.get(position + 7);
                            } else if (b2 != 31) {
                                i4 = (byteBuffer.get(position + 4) & 1) << 6;
                                i5 = byteBuffer.get(position + 5) & 252;
                                i3 = 2;
                                i2 = (i5 >> i3) | i4;
                                z2 = true;
                            } else {
                                i3 = 2;
                                i4 = (byteBuffer.get(position + 5) & 7) << 4;
                                b = byteBuffer.get(position + 6);
                            }
                            i5 = b & 60;
                            i2 = (i5 >> i3) | i4;
                            z2 = true;
                        } else {
                            z2 = true;
                            i2 = ((byteBuffer.get(position + 4) & 252) >> 2) | ((byteBuffer.get(position + 5) & 1) << 6);
                        }
                        zza2 = (i2 + (z2 ? 1 : 0)) * 32;
                        this.zzC = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 9:
                        zza2 = zzaac.zzc(zzen.zzk(byteBuffer, byteBuffer.position()));
                        if (zza2 == -1) {
                            throw new IllegalArgumentException();
                        }
                        z2 = true;
                        this.zzC = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 10:
                    case 16:
                        zza2 = 1024;
                        z2 = true;
                        this.zzC = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 11:
                    case 12:
                        zza2 = 2048;
                        z2 = true;
                        this.zzC = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException("Unexpected audio encoding: " + i8);
                    case 14:
                        int i10 = zzyj.zza;
                        int position2 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i11 = position2;
                        while (true) {
                            if (i11 > limit) {
                                i6 = -1;
                            } else if ((zzen.zzk(byteBuffer, i11 + 4) & (-2)) == -126718022) {
                                i6 = i11 - position2;
                            } else {
                                i11++;
                            }
                        }
                        if (i6 == -1) {
                            zza2 = 0;
                        } else {
                            zza2 = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        z2 = true;
                        this.zzC = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 15:
                        zza2 = 512;
                        z2 = true;
                        this.zzC = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                    case 17:
                        int i12 = zzym.zza;
                        byte[] bArr = new byte[16];
                        int position3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(position3);
                        zza2 = zzym.zza(new zzee(bArr, 16)).zzc;
                        z2 = true;
                        this.zzC = zza2;
                        if (zza2 == 0) {
                        }
                        break;
                }
            }
            if (this.zzv != null) {
                if (!zzQ()) {
                    return false;
                }
                zzI(j);
                this.zzv = null;
            }
            long zzE = this.zzF + (((zzE() - this.zzf.zzo()) * 1000000) / this.zzs.zza.zzA);
            if (!this.zzD && Math.abs(zzE - j) > 200000) {
                this.zzq.zza(new zznw(j, zzE));
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzQ()) {
                    return false;
                }
                long j2 = j - zzE;
                this.zzF += j2;
                this.zzD = false;
                zzI(j);
                zznv zznvVar = this.zzq;
                if (zznvVar != null && j2 != 0) {
                    ((zzoz) zznvVar).zza.zzab();
                }
            }
            if (this.zzs.zzc == 0) {
                this.zzy += byteBuffer.remaining();
            } else {
                this.zzz += this.zzC * i;
            }
            this.zzJ = byteBuffer;
            this.zzK = i;
        }
        zzM(j);
        if (!this.zzJ.hasRemaining()) {
            this.zzJ = null;
            this.zzK = 0;
            return true;
        }
        if (!this.zzj.zzi(zzF())) {
            return false;
        }
        zzdw.zze("DefaultAudioSink", "Resetting stalled audio track");
        zze();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final boolean zzt() {
        return zzR() && this.zzj.zzg(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final boolean zzu() {
        return !zzR() || (this.zzP && !zzt());
    }

    @Override // com.google.android.gms.internal.ads.zzny
    public final boolean zzv(zzaf zzafVar) {
        return zza(zzafVar) != 0;
    }
}

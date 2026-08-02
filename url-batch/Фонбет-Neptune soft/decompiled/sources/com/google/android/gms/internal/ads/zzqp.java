package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.PeriodicWorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqp implements zzpl {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private zzbq zzA;
    private boolean zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private int zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private float zzK;
    private ByteBuffer zzL;
    private int zzM;
    private ByteBuffer zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzi zzT;
    private zzon zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private Looper zzY;
    private long zzZ;
    private long zzaa;
    private Handler zzab;
    private final zzqd zzac;
    private final zzpt zzad;
    private final Context zzd;
    private final zzpq zze;
    private final zzqz zzf;
    private final zzfxr zzg;
    private final zzfxr zzh;
    private final zzdm zzi;
    private final zzpp zzj;
    private final ArrayDeque zzk;
    private zzqn zzl;
    private final zzqi zzm;
    private final zzqi zzn;
    private zznz zzo;
    private zzpi zzp;
    private zzqc zzq;
    private zzqc zzr;
    private zzcq zzs;
    private AudioTrack zzt;
    private zzof zzu;
    private zzom zzv;
    private zzqh zzw;
    private zzh zzx;
    private zzqf zzy;
    private zzqf zzz;

    /* synthetic */ zzqp(zzqb zzqbVar, zzqo zzqoVar) {
        Context context;
        zzof zzofVar;
        zzqd zzqdVar;
        zzpt zzptVar;
        context = zzqbVar.zza;
        this.zzd = context;
        zzh zzhVar = zzh.zza;
        this.zzx = zzhVar;
        if (context != null) {
            zzof zzofVar2 = zzof.zza;
            int i = zzet.zza;
            zzofVar = zzof.zzc(context, zzhVar, null);
        } else {
            zzofVar = zzqbVar.zzb;
        }
        this.zzu = zzofVar;
        zzqdVar = zzqbVar.zze;
        this.zzac = zzqdVar;
        int i2 = zzet.zza;
        zzptVar = zzqbVar.zzf;
        zzptVar.getClass();
        this.zzad = zzptVar;
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zzi = zzdmVar;
        zzdmVar.zze();
        this.zzj = new zzpp(new zzqk(this, null));
        zzpq zzpqVar = new zzpq();
        this.zze = zzpqVar;
        zzqz zzqzVar = new zzqz();
        this.zzf = zzqzVar;
        this.zzg = zzfxr.zzp(new zzcx(), zzpqVar, zzqzVar);
        this.zzh = zzfxr.zzn(new zzqy());
        this.zzK = 1.0f;
        this.zzS = 0;
        this.zzT = new zzi(0, 0.0f);
        this.zzz = new zzqf(zzbq.zza, 0L, 0L, null);
        this.zzA = zzbq.zza;
        this.zzB = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzqi(100L);
        this.zzn = new zzqi(100L);
    }

    public static /* synthetic */ void zzF(zzqp zzqpVar) {
        if (zzqpVar.zzaa >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            ((zzqu) zzqpVar.zzp).zza.zzm = true;
            zzqpVar.zzaa = 0L;
        }
    }

    static /* synthetic */ void zzH(AudioTrack audioTrack, final zzpi zzpiVar, Handler handler, final zzpf zzpfVar, zzdm zzdmVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpiVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpd zzpdVar;
                        zzpdVar = ((zzqu) zzpi.this).zza.zzc;
                        zzpdVar.zzd(zzpfVar);
                    }
                });
            }
            zzdmVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzpiVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzpd zzpdVar;
                        zzpdVar = ((zzqu) zzpi.this).zza.zzc;
                        zzpdVar.zzd(zzpfVar);
                    }
                });
            }
            zzdmVar.zze();
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
    public final long zzJ() {
        return this.zzr.zzc == 0 ? this.zzC / r0.zzb : this.zzD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzK() {
        zzqc zzqcVar = this.zzr;
        if (zzqcVar.zzc != 0) {
            return this.zzF;
        }
        long j = this.zzE;
        long j2 = zzqcVar.zzd;
        int i = zzet.zza;
        return ((j + j2) - 1) / j2;
    }

    private final AudioTrack zzL(zzqc zzqcVar) throws zzph {
        try {
            return zzqcVar.zza(this.zzx, this.zzS);
        } catch (zzph e) {
            zzpi zzpiVar = this.zzp;
            if (zzpiVar != null) {
                zzpiVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzM(long j) {
        zzbq zzbqVar;
        boolean z;
        zzpd zzpdVar;
        if (zzY()) {
            zzqd zzqdVar = this.zzac;
            zzbqVar = this.zzA;
            zzqdVar.zzc(zzbqVar);
        } else {
            zzbqVar = zzbq.zza;
        }
        zzbq zzbqVar2 = zzbqVar;
        this.zzA = zzbqVar2;
        if (zzY()) {
            zzqd zzqdVar2 = this.zzac;
            z = this.zzB;
            zzqdVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzB = z;
        this.zzk.add(new zzqf(zzbqVar2, Math.max(0L, j), zzet.zzs(zzK(), this.zzr.zze), null));
        zzT();
        zzpi zzpiVar = this.zzp;
        if (zzpiVar != null) {
            boolean z2 = this.zzB;
            zzpdVar = ((zzqu) zzpiVar).zza.zzc;
            zzpdVar.zzw(z2);
        }
    }

    private final void zzN() {
        if (this.zzr.zzc()) {
            this.zzW = true;
        }
    }

    private final void zzO() {
        if (this.zzv != null || this.zzd == null) {
            return;
        }
        this.zzY = Looper.myLooper();
        zzom zzomVar = new zzom(this.zzd, new zzpx(this), this.zzx, this.zzU);
        this.zzv = zzomVar;
        this.zzu = zzomVar.zzc();
    }

    private final void zzP() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        this.zzj.zzb(zzK());
        if (zzX(this.zzt)) {
            this.zzQ = false;
        }
        this.zzt.stop();
    }

    private final void zzQ(long j) throws zzpk {
        ByteBuffer zzb2;
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzL;
            if (byteBuffer == null) {
                byteBuffer = zzct.zza;
            }
            zzU(byteBuffer, j);
            return;
        }
        while (!this.zzs.zzg()) {
            do {
                zzb2 = this.zzs.zzb();
                if (zzb2.hasRemaining()) {
                    zzU(zzb2, j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzL;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzs.zze(this.zzL);
                    }
                }
            } while (!zzb2.hasRemaining());
            return;
        }
    }

    private final void zzR(zzbq zzbqVar) {
        zzqf zzqfVar = new zzqf(zzbqVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzW()) {
            this.zzy = zzqfVar;
        } else {
            this.zzz = zzqfVar;
        }
    }

    private final void zzS() {
        if (zzW()) {
            int i = zzet.zza;
            this.zzt.setVolume(this.zzK);
        }
    }

    private final void zzT() {
        zzcq zzcqVar = this.zzr.zzi;
        this.zzs = zzcqVar;
        zzcqVar.zzc();
    }

    private final void zzU(ByteBuffer byteBuffer, long j) throws zzpk {
        zzpi zzpiVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzN;
            if (byteBuffer2 != null) {
                zzdi.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzN = byteBuffer;
                int i = zzet.zza;
            }
            int remaining = byteBuffer.remaining();
            int i2 = zzet.zza;
            int write = this.zzt.write(byteBuffer, remaining, 1);
            this.zzV = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzet.zza >= 24 && write == -6) || write == -32) {
                    if (zzK() <= 0) {
                        if (zzX(this.zzt)) {
                            zzN();
                        }
                    }
                    r10 = true;
                }
                zzpk zzpkVar = new zzpk(write, this.zzr.zza, r10);
                zzpi zzpiVar2 = this.zzp;
                if (zzpiVar2 != null) {
                    zzpiVar2.zza(zzpkVar);
                }
                if (zzpkVar.zzb) {
                    this.zzu = zzof.zza;
                    throw zzpkVar;
                }
                this.zzn.zzb(zzpkVar);
                return;
            }
            this.zzn.zza();
            if (zzX(this.zzt)) {
                if (this.zzF > 0) {
                    this.zzX = false;
                }
                if (this.zzR && (zzpiVar = this.zzp) != null && write < remaining) {
                }
            }
            int i3 = this.zzr.zzc;
            if (i3 == 0) {
                this.zzE += write;
            }
            if (write == remaining) {
                if (i3 != 0) {
                    zzdi.zzf(byteBuffer == this.zzL);
                    this.zzF += this.zzG * this.zzM;
                }
                this.zzN = null;
            }
        }
    }

    private final boolean zzV() throws zzpk {
        if (!this.zzs.zzh()) {
            ByteBuffer byteBuffer = this.zzN;
            if (byteBuffer == null) {
                return true;
            }
            zzU(byteBuffer, Long.MIN_VALUE);
            return this.zzN == null;
        }
        this.zzs.zzd();
        zzQ(Long.MIN_VALUE);
        if (!this.zzs.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzN;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzW() {
        return this.zzt != null;
    }

    private static boolean zzX(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (zzet.zza < 29) {
            return false;
        }
        isOffloadedPlayback = audioTrack.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    private final boolean zzY() {
        zzqc zzqcVar = this.zzr;
        if (zzqcVar.zzc != 0) {
            return false;
        }
        int i = zzqcVar.zza.zzB;
        return true;
    }

    public final void zzI(zzof zzofVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzY;
        if (looper != myLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (myLooper != null ? myLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
        }
        if (zzofVar.equals(this.zzu)) {
            return;
        }
        this.zzu = zzofVar;
        zzpi zzpiVar = this.zzp;
        if (zzpiVar != null) {
            ((zzqu) zzpiVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final int zza(zzaf zzafVar) {
        zzO();
        if (!"audio/raw".equals(zzafVar.zzm)) {
            return this.zzu.zzb(zzafVar, this.zzx) != null ? 2 : 0;
        }
        if (zzet.zzK(zzafVar.zzB)) {
            return zzafVar.zzB != 2 ? 1 : 2;
        }
        zzea.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzafVar.zzB);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final long zzb(boolean z) {
        long zzp;
        if (!zzW() || this.zzI) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzj.zza(z), zzet.zzs(zzK(), this.zzr.zze));
        while (!this.zzk.isEmpty() && min >= ((zzqf) this.zzk.getFirst()).zzc) {
            this.zzz = (zzqf) this.zzk.remove();
        }
        long j = min - this.zzz.zzc;
        if (this.zzk.isEmpty()) {
            zzp = this.zzz.zzb + this.zzac.zza(j);
        } else {
            zzqf zzqfVar = (zzqf) this.zzk.getFirst();
            zzp = zzqfVar.zzb - zzet.zzp(zzqfVar.zzc - min, this.zzz.zza.zzb);
        }
        long zzb2 = this.zzac.zzb();
        long zzs = zzp + zzet.zzs(zzb2, this.zzr.zze);
        long j2 = this.zzZ;
        if (zzb2 > j2) {
            long zzs2 = zzet.zzs(zzb2 - j2, this.zzr.zze);
            this.zzZ = zzb2;
            this.zzaa += zzs2;
            if (this.zzab == null) {
                this.zzab = new Handler(Looper.myLooper());
            }
            this.zzab.removeCallbacksAndMessages(null);
            this.zzab.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpw
                @Override // java.lang.Runnable
                public final void run() {
                    zzqp.zzF(zzqp.this);
                }
            }, 100L);
        }
        return zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final zzbq zzc() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final zzoq zzd(zzaf zzafVar) {
        return this.zzW ? zzoq.zza : this.zzad.zza(zzafVar, this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zze(zzaf zzafVar, int i, int[] iArr) throws zzpg {
        int intValue;
        zzcq zzcqVar;
        int i2;
        int intValue2;
        int i3;
        int i4;
        int i5;
        int i6;
        int max;
        zzO();
        if ("audio/raw".equals(zzafVar.zzm)) {
            zzdi.zzd(zzet.zzK(zzafVar.zzB));
            i3 = zzet.zzm(zzafVar.zzB, zzafVar.zzz);
            zzfxo zzfxoVar = new zzfxo();
            int i7 = zzafVar.zzB;
            zzfxoVar.zzh(this.zzg);
            zzfxoVar.zzg(this.zzac.zze());
            zzcq zzcqVar2 = new zzcq(zzfxoVar.zzi());
            if (zzcqVar2.equals(this.zzs)) {
                zzcqVar2 = this.zzs;
            }
            this.zzf.zzq(zzafVar.zzC, zzafVar.zzD);
            this.zze.zzo(iArr);
            try {
                zzcr zza2 = zzcqVar2.zza(new zzcr(zzafVar.zzA, zzafVar.zzz, zzafVar.zzB));
                intValue = zza2.zzd;
                i2 = zza2.zzb;
                int i8 = zza2.zzc;
                intValue2 = zzet.zzh(i8);
                zzcqVar = zzcqVar2;
                i5 = zzet.zzm(intValue, i8);
                i4 = 0;
            } catch (zzcs e) {
                throw new zzpg(e, zzafVar);
            }
        } else {
            zzcq zzcqVar3 = new zzcq(zzfxr.zzm());
            int i9 = zzafVar.zzA;
            zzoq zzoqVar = zzoq.zza;
            Pair zzb2 = this.zzu.zzb(zzafVar, this.zzx);
            if (zzb2 == null) {
                throw new zzpg("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzafVar))), zzafVar);
            }
            intValue = ((Integer) zzb2.first).intValue();
            zzcqVar = zzcqVar3;
            i2 = i9;
            intValue2 = ((Integer) zzb2.second).intValue();
            i3 = -1;
            i4 = 2;
            i5 = -1;
        }
        if (intValue == 0) {
            throw new zzpg("Invalid output encoding (mode=" + i4 + ") for: " + String.valueOf(zzafVar), zzafVar);
        }
        if (intValue2 == 0) {
            throw new zzpg("Invalid output channel config (mode=" + i4 + ") for: " + String.valueOf(zzafVar), zzafVar);
        }
        int i10 = zzafVar.zzi;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzafVar.zzm) && i10 == -1) {
            i10 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, intValue2, intValue);
        zzdi.zzf(minBufferSize != -2);
        int i11 = i5 != -1 ? i5 : 1;
        int i12 = 250000;
        if (i4 == 0) {
            i6 = i4;
            max = Math.max(zzqr.zza(250000, i2, i11), Math.min(minBufferSize * 4, zzqr.zza(750000, i2, i11)));
        } else if (i4 != 1) {
            if (intValue == 5) {
                i12 = 500000;
            } else if (intValue == 8) {
                i12 = DurationKt.NANOS_IN_MILLIS;
                intValue = 8;
            }
            i6 = i4;
            max = zzgap.zzb((i12 * (i10 != -1 ? zzgah.zzb(i10, 8, RoundingMode.CEILING) : zzqr.zzb(intValue))) / 1000000);
        } else {
            i6 = i4;
            max = zzgap.zzb((zzqr.zzb(intValue) * 50000000) / 1000000);
        }
        this.zzW = false;
        zzqc zzqcVar = new zzqc(zzafVar, i3, i6, i5, i2, intValue2, intValue, (((Math.max(minBufferSize, max) + i11) - 1) / i11) * i11, zzcqVar, false, false, false);
        if (zzW()) {
            this.zzq = zzqcVar;
        } else {
            this.zzr = zzqcVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzf() {
        zzqh zzqhVar;
        if (zzW()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzX = false;
            this.zzG = 0;
            this.zzz = new zzqf(this.zzA, 0L, 0L, null);
            this.zzJ = 0L;
            this.zzy = null;
            this.zzk.clear();
            this.zzL = null;
            this.zzM = 0;
            this.zzN = null;
            this.zzP = false;
            this.zzO = false;
            this.zzQ = false;
            this.zzf.zzp();
            zzT();
            if (this.zzj.zzg()) {
                this.zzt.pause();
            }
            if (zzX(this.zzt)) {
                zzqn zzqnVar = this.zzl;
                zzqnVar.getClass();
                zzqnVar.zzb(this.zzt);
            }
            int i = zzet.zza;
            final zzpf zzb2 = this.zzr.zzb();
            zzqc zzqcVar = this.zzq;
            if (zzqcVar != null) {
                this.zzr = zzqcVar;
                this.zzq = null;
            }
            this.zzj.zzc();
            if (zzet.zza >= 24 && (zzqhVar = this.zzw) != null) {
                zzqhVar.zzb();
                this.zzw = null;
            }
            final AudioTrack audioTrack = this.zzt;
            final zzdm zzdmVar = this.zzi;
            final zzpi zzpiVar = this.zzp;
            zzdmVar.zzc();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzet.zzE("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzqp.zzH(audioTrack, zzpiVar, handler, zzb2, zzdmVar);
                    }
                });
            }
            this.zzt = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzZ = 0L;
        this.zzaa = 0L;
        Handler handler2 = this.zzab;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzg() {
        this.zzH = true;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzh() {
        this.zzR = false;
        if (zzW()) {
            if (this.zzj.zzj() || zzX(this.zzt)) {
                this.zzt.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzi() {
        this.zzR = true;
        if (zzW()) {
            this.zzj.zze();
            this.zzt.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzj() throws zzpk {
        if (!this.zzO && zzW() && zzV()) {
            zzP();
            this.zzO = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzk() {
        zzom zzomVar = this.zzv;
        if (zzomVar != null) {
            zzomVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzl() {
        zzf();
        zzfxr zzfxrVar = this.zzg;
        int size = zzfxrVar.size();
        for (int i = 0; i < size; i++) {
            ((zzct) zzfxrVar.get(i)).zzf();
        }
        zzfxr zzfxrVar2 = this.zzh;
        int size2 = zzfxrVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzct) zzfxrVar2.get(i2)).zzf();
        }
        zzcq zzcqVar = this.zzs;
        if (zzcqVar != null) {
            zzcqVar.zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzm(zzh zzhVar) {
        if (this.zzx.equals(zzhVar)) {
            return;
        }
        this.zzx = zzhVar;
        zzom zzomVar = this.zzv;
        if (zzomVar != null) {
            zzomVar.zzg(zzhVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzn(int i) {
        if (this.zzS != i) {
            this.zzS = i;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzo(zzi zziVar) {
        if (this.zzT.equals(zziVar)) {
            return;
        }
        if (this.zzt != null) {
            int i = this.zzT.zza;
        }
        this.zzT = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzp(zzpi zzpiVar) {
        this.zzp = zzpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzq(int i, int i2) {
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzX(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzr(zzbq zzbqVar) {
        this.zzA = new zzbq(Math.max(0.1f, Math.min(zzbqVar.zzb, 8.0f)), Math.max(0.1f, Math.min(zzbqVar.zzc, 8.0f)));
        zzR(zzbqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzs(zznz zznzVar) {
        this.zzo = zznzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzu(boolean z) {
        this.zzB = z;
        zzR(this.zzA);
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzv(float f) {
        if (this.zzK != f) {
            this.zzK = f;
            zzS();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0270  */
    @Override // com.google.android.gms.internal.ads.zzpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzw(ByteBuffer byteBuffer, long j, int i) throws zzph, zzpk {
        AudioTrack zzL;
        zzpd zzpdVar;
        zzom zzomVar;
        zznz zznzVar;
        boolean z;
        int zzb2;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.zzL;
        zzdi.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzq != null) {
            if (!zzV()) {
                return false;
            }
            zzqc zzqcVar = this.zzq;
            zzqc zzqcVar2 = this.zzr;
            if (zzqcVar2.zzc == zzqcVar.zzc && zzqcVar2.zzg == zzqcVar.zzg && zzqcVar2.zze == zzqcVar.zze && zzqcVar2.zzf == zzqcVar.zzf && zzqcVar2.zzd == zzqcVar.zzd) {
                boolean z2 = zzqcVar2.zzj;
                boolean z3 = zzqcVar.zzj;
                boolean z4 = zzqcVar2.zzk;
                boolean z5 = zzqcVar.zzk;
                this.zzr = zzqcVar;
                this.zzq = null;
                AudioTrack audioTrack = this.zzt;
                if (audioTrack != null && zzX(audioTrack)) {
                    boolean z6 = this.zzr.zzk;
                }
            } else {
                zzP();
                if (zzx()) {
                    return false;
                }
                zzf();
            }
            zzM(j);
        }
        if (!zzW()) {
            try {
                if (!this.zzi.zzd()) {
                    return false;
                }
                try {
                    zzqc zzqcVar3 = this.zzr;
                    zzqcVar3.getClass();
                    zzL = zzL(zzqcVar3);
                } catch (zzph e) {
                    zzqc zzqcVar4 = this.zzr;
                    if (zzqcVar4.zzh > 1000000) {
                        zzaf zzafVar = zzqcVar4.zza;
                        int i7 = zzqcVar4.zzb;
                        int i8 = zzqcVar4.zzc;
                        int i9 = zzqcVar4.zzd;
                        int i10 = zzqcVar4.zze;
                        int i11 = zzqcVar4.zzf;
                        int i12 = zzqcVar4.zzg;
                        zzcq zzcqVar = zzqcVar4.zzi;
                        boolean z7 = zzqcVar4.zzj;
                        boolean z8 = zzqcVar4.zzk;
                        boolean z9 = zzqcVar4.zzl;
                        zzqc zzqcVar5 = new zzqc(zzafVar, i7, i8, i9, i10, i11, i12, DurationKt.NANOS_IN_MILLIS, zzcqVar, false, false, false);
                        try {
                            zzL = zzL(zzqcVar5);
                            this.zzr = zzqcVar5;
                        } catch (zzph e2) {
                            e.addSuppressed(e2);
                            zzN();
                            throw e;
                        }
                    }
                    zzN();
                    throw e;
                }
                this.zzt = zzL;
                if (zzX(zzL)) {
                    AudioTrack audioTrack2 = this.zzt;
                    if (this.zzl == null) {
                        this.zzl = new zzqn(this);
                    }
                    this.zzl.zza(audioTrack2);
                    boolean z10 = this.zzr.zzk;
                }
                if (zzet.zza >= 31 && (zznzVar = this.zzo) != null) {
                    zzpz.zza(this.zzt, zznzVar);
                }
                this.zzS = this.zzt.getAudioSessionId();
                zzpp zzppVar = this.zzj;
                AudioTrack audioTrack3 = this.zzt;
                zzqc zzqcVar6 = this.zzr;
                zzppVar.zzd(audioTrack3, zzqcVar6.zzc == 2, zzqcVar6.zzg, zzqcVar6.zzd, zzqcVar6.zzh);
                zzS();
                int i13 = this.zzT.zza;
                zzon zzonVar = this.zzU;
                if (zzonVar != null && zzet.zza >= 23) {
                    zzpy.zza(this.zzt, zzonVar);
                    zzom zzomVar2 = this.zzv;
                    if (zzomVar2 != null) {
                        zzomVar2.zzh(this.zzU.zza);
                    }
                }
                if (zzet.zza >= 24 && (zzomVar = this.zzv) != null) {
                    this.zzw = new zzqh(this.zzt, zzomVar);
                }
                this.zzI = true;
                zzpi zzpiVar = this.zzp;
                if (zzpiVar != null) {
                    zzpf zzb3 = this.zzr.zzb();
                    zzpdVar = ((zzqu) zzpiVar).zza.zzc;
                    zzpdVar.zzc(zzb3);
                }
            } catch (zzph e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzm.zzb(e3);
                return false;
            }
        }
        this.zzm.zza();
        if (this.zzI) {
            this.zzJ = Math.max(0L, j);
            this.zzH = false;
            this.zzI = false;
            zzM(j);
            if (this.zzR) {
                zzi();
            }
        }
        if (!this.zzj.zzi(zzK())) {
            return false;
        }
        if (this.zzL == null) {
            zzdi.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzqc zzqcVar7 = this.zzr;
            if (zzqcVar7.zzc != 0 && this.zzG == 0) {
                int i14 = zzqcVar7.zzg;
                if (i14 != 20) {
                    if (i14 != 30) {
                        switch (i14) {
                            case 5:
                            case 6:
                                zzb2 = zzabj.zza(byteBuffer);
                                z = true;
                                break;
                            case 7:
                            case 8:
                                break;
                            case 9:
                                zzb2 = zzadd.zzc(zzet.zzi(byteBuffer, byteBuffer.position()));
                                if (zzb2 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                z = true;
                                break;
                            case 10:
                                zzb2 = 1024;
                                z = true;
                                break;
                            case 11:
                            case 12:
                                zzb2 = 2048;
                                z = true;
                                break;
                            default:
                                switch (i14) {
                                    case 14:
                                        int i15 = zzabj.zza;
                                        int position = byteBuffer.position();
                                        int limit = byteBuffer.limit() - 10;
                                        int i16 = position;
                                        while (true) {
                                            if (i16 > limit) {
                                                i6 = -1;
                                            } else if ((zzet.zzi(byteBuffer, i16 + 4) & (-2)) == -126718022) {
                                                i6 = i16 - position;
                                            } else {
                                                i16++;
                                            }
                                        }
                                        if (i6 != -1) {
                                            zzb2 = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                            break;
                                        } else {
                                            zzb2 = 0;
                                            break;
                                        }
                                    case 15:
                                        zzb2 = 512;
                                        break;
                                    case 16:
                                        break;
                                    case 17:
                                        int i17 = zzabm.zza;
                                        byte[] bArr = new byte[16];
                                        int position2 = byteBuffer.position();
                                        byteBuffer.get(bArr);
                                        byteBuffer.position(position2);
                                        zzb2 = zzabm.zza(new zzej(bArr, 16)).zzc;
                                        break;
                                    case 18:
                                        break;
                                    default:
                                        throw new IllegalStateException("Unexpected audio encoding: " + i14);
                                }
                                z = true;
                                break;
                        }
                    }
                    int i18 = zzach.zza;
                    if (byteBuffer.getInt(0) != -233094848) {
                        if (byteBuffer.getInt(0) != -398277519) {
                            if (byteBuffer.getInt(0) == 622876772) {
                                zzb2 = 4096;
                                z = true;
                            } else {
                                int position3 = byteBuffer.position();
                                byte b2 = byteBuffer.get(position3);
                                if (b2 != -2) {
                                    if (b2 == -1) {
                                        i3 = 2;
                                        i4 = (byteBuffer.get(position3 + 4) & 7) << 4;
                                        b = byteBuffer.get(position3 + 7);
                                    } else if (b2 != 31) {
                                        i4 = (byteBuffer.get(position3 + 4) & 1) << 6;
                                        i5 = byteBuffer.get(position3 + 5) & 252;
                                        i3 = 2;
                                        i2 = (i5 >> i3) | i4;
                                        z = true;
                                    } else {
                                        i3 = 2;
                                        i4 = (byteBuffer.get(position3 + 5) & 7) << 4;
                                        b = byteBuffer.get(position3 + 6);
                                    }
                                    i5 = b & 60;
                                    i2 = (i5 >> i3) | i4;
                                    z = true;
                                } else {
                                    z = true;
                                    i2 = ((byteBuffer.get(position3 + 5) & 1) << 6) | ((byteBuffer.get(position3 + 4) & 252) >> 2);
                                }
                                zzb2 = (i2 + (z ? 1 : 0)) * 32;
                            }
                        }
                        zzb2 = 1024;
                        z = true;
                    } else {
                        z = true;
                        zzb2 = 1024;
                    }
                } else {
                    z = true;
                    zzb2 = zzade.zzb(byteBuffer);
                }
                this.zzG = zzb2;
                if (zzb2 == 0) {
                    return z;
                }
            }
            if (this.zzy != null) {
                if (!zzV()) {
                    return false;
                }
                zzM(j);
                this.zzy = null;
            }
            long zzs = this.zzJ + zzet.zzs(zzJ() - this.zzf.zzo(), this.zzr.zza.zzA);
            if (!this.zzH && Math.abs(zzs - j) > 200000) {
                zzpi zzpiVar2 = this.zzp;
                if (zzpiVar2 != null) {
                    zzpiVar2.zza(new zzpj(j, zzs));
                }
                this.zzH = true;
            }
            if (this.zzH) {
                if (!zzV()) {
                    return false;
                }
                long j2 = j - zzs;
                this.zzJ += j2;
                this.zzH = false;
                zzM(j);
                zzpi zzpiVar3 = this.zzp;
                if (zzpiVar3 != null && j2 != 0) {
                    ((zzqu) zzpiVar3).zza.zzao();
                }
            }
            if (this.zzr.zzc == 0) {
                this.zzC += byteBuffer.remaining();
            } else {
                this.zzD += this.zzG * i;
            }
            this.zzL = byteBuffer;
            this.zzM = i;
        }
        zzQ(j);
        if (!this.zzL.hasRemaining()) {
            this.zzL = null;
            this.zzM = 0;
            return true;
        }
        if (!this.zzj.zzh(zzK())) {
            return false;
        }
        zzea.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final boolean zzx() {
        boolean isOffloadedPlayback;
        if (!zzW()) {
            return false;
        }
        if (zzet.zza >= 29) {
            isOffloadedPlayback = this.zzt.isOffloadedPlayback();
            if (isOffloadedPlayback && this.zzQ) {
                return false;
            }
        }
        return this.zzj.zzf(zzK());
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final boolean zzy() {
        if (zzW()) {
            return this.zzO && !zzx();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final boolean zzz(zzaf zzafVar) {
        return zza(zzafVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpl
    public final void zzt(AudioDeviceInfo audioDeviceInfo) {
        this.zzU = audioDeviceInfo == null ? null : new zzon(audioDeviceInfo);
        zzom zzomVar = this.zzv;
        if (zzomVar != null) {
            zzomVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzpy.zza(audioTrack, this.zzU);
        }
    }
}

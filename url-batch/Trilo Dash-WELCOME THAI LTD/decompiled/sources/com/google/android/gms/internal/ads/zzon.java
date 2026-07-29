package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzon implements zznr {
    private boolean zzA;
    private boolean zzB;
    private long zzC;
    private float zzD;
    private zzmz[] zzE;
    private ByteBuffer[] zzF;
    private ByteBuffer zzG;
    private int zzH;
    private ByteBuffer zzI;
    private byte[] zzJ;
    private int zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private zzj zzR;
    private long zzS;
    private boolean zzT;
    private boolean zzU;
    private final zzod zzV;
    private final zzmw zza;
    private final zznx zzb;
    private final zzoy zzc;
    private final zzmz[] zzd;
    private final zzmz[] zze;
    private final ConditionVariable zzf;
    private final zznv zzg;
    private final ArrayDeque zzh;
    private zzol zzi;
    private final zzog zzj;
    private final zzog zzk;
    private final zzoa zzl;
    private zzmv zzm;
    private zzno zzn;
    private zzoc zzo;
    private zzoc zzp;
    private AudioTrack zzq;
    private zzi zzr;
    private zzof zzs;
    private zzof zzt;
    private final zzbt zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private int zzz;

    /* synthetic */ zzon(zzob zzobVar, zzom zzomVar) {
        zzmw zzmwVar;
        zzod zzodVar;
        zzmwVar = zzobVar.zzb;
        this.zza = zzmwVar;
        zzodVar = zzobVar.zzc;
        this.zzV = zzodVar;
        int i = zzeg.zza;
        this.zzl = zzobVar.zza;
        this.zzf = new ConditionVariable(true);
        this.zzg = new zznv(new zzoi(this, null));
        zznx zznxVar = new zznx();
        this.zzb = zznxVar;
        zzoy zzoyVar = new zzoy();
        this.zzc = zzoyVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzou(), zznxVar, zzoyVar);
        Collections.addAll(arrayList, zzodVar.zze());
        this.zzd = (zzmz[]) arrayList.toArray(new zzmz[0]);
        this.zze = new zzmz[]{new zzoq()};
        this.zzD = 1.0f;
        this.zzr = zzi.zza;
        this.zzQ = 0;
        this.zzR = new zzj(0, 0.0f);
        this.zzt = new zzof(zzbt.zza, false, 0L, 0L, null);
        this.zzu = zzbt.zza;
        this.zzL = -1;
        this.zzE = new zzmz[0];
        this.zzF = new ByteBuffer[0];
        this.zzh = new ArrayDeque();
        this.zzj = new zzog(100L);
        this.zzk = new zzog(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzE() {
        return this.zzp.zzc == 0 ? this.zzv / r0.zzb : this.zzw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzF() {
        return this.zzp.zzc == 0 ? this.zzx / r0.zzd : this.zzy;
    }

    private final AudioTrack zzG(zzoc zzocVar) throws zznn {
        try {
            return zzocVar.zzb(false, this.zzr, this.zzQ);
        } catch (zznn e) {
            zzno zznoVar = this.zzn;
            if (zznoVar != null) {
                zznoVar.zza(e);
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair zzH(zzad zzadVar, zzmw zzmwVar) {
        int i;
        int zzj;
        String str = zzadVar.zzm;
        Objects.requireNonNull(str);
        int zza = zzbo.zza(str, zzadVar.zzj);
        int i2 = 8;
        if (zza != 5 && zza != 6 && zza != 18 && zza != 17 && zza != 7 && zza != 8 && zza != 14) {
            return null;
        }
        if (zza == 18 && !zzmwVar.zza(18)) {
            zza = 6;
        } else if (zza == 8 && !zzmwVar.zza(8)) {
            zza = 7;
        }
        if (!zzmwVar.zza(zza)) {
            return null;
        }
        if (zza != 18) {
            i = zzadVar.zzz;
            if (i > 8) {
                return null;
            }
        } else if (zzeg.zza >= 29) {
            int i3 = zzadVar.zzA;
            if (i3 == -1) {
                i3 = 48000;
            }
            AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
            i = 8;
            while (true) {
                if (i <= 0) {
                    i = 0;
                    break;
                }
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(18).setSampleRate(i3).setChannelMask(zzeg.zzj(i)).build(), build)) {
                    break;
                }
                i--;
            }
            if (i == 0) {
                Log.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            i = 6;
        }
        if (zzeg.zza <= 28) {
            if (i != 7) {
                if (i == 3 || i == 4 || i == 5) {
                    i2 = 6;
                }
            }
            if (zzeg.zza <= 26 && "fugu".equals(zzeg.zzb) && i2 == 1) {
                i2 = 2;
            }
            zzj = zzeg.zzj(i2);
            if (zzj != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(zza), Integer.valueOf(zzj));
        }
        i2 = i;
        if (zzeg.zza <= 26) {
            i2 = 2;
        }
        zzj = zzeg.zzj(i2);
        if (zzj != 0) {
        }
    }

    private final zzof zzI() {
        zzof zzofVar = this.zzs;
        return zzofVar != null ? zzofVar : !this.zzh.isEmpty() ? (zzof) this.zzh.getLast() : this.zzt;
    }

    private final void zzJ(long j) {
        zzbt zzbtVar;
        boolean z;
        zznk zznkVar;
        if (zzU()) {
            zzod zzodVar = this.zzV;
            zzbtVar = zzI().zza;
            zzodVar.zzc(zzbtVar);
        } else {
            zzbtVar = zzbt.zza;
        }
        zzbt zzbtVar2 = zzbtVar;
        if (zzU()) {
            zzod zzodVar2 = this.zzV;
            boolean z2 = zzI().zzb;
            zzodVar2.zzd(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzh.add(new zzof(zzbtVar2, z, Math.max(0L, j), this.zzp.zza(zzF()), null));
        zzmz[] zzmzVarArr = this.zzp.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzmz zzmzVar : zzmzVarArr) {
            if (zzmzVar.zzg()) {
                arrayList.add(zzmzVar);
            } else {
                zzmzVar.zzc();
            }
        }
        int size = arrayList.size();
        this.zzE = (zzmz[]) arrayList.toArray(new zzmz[size]);
        this.zzF = new ByteBuffer[size];
        zzK();
        zzno zznoVar = this.zzn;
        if (zznoVar != null) {
            zznkVar = ((zzos) zznoVar).zza.zzc;
            zznkVar.zzs(z);
        }
    }

    private final void zzK() {
        int i = 0;
        while (true) {
            zzmz[] zzmzVarArr = this.zzE;
            if (i >= zzmzVarArr.length) {
                return;
            }
            zzmz zzmzVar = zzmzVarArr[i];
            zzmzVar.zzc();
            this.zzF[i] = zzmzVar.zzb();
            i++;
        }
    }

    private final void zzL() {
        if (this.zzp.zzc()) {
            this.zzT = true;
        }
    }

    private final void zzM() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        this.zzg.zzd(zzF());
        this.zzq.stop();
    }

    private final void zzN(long j) throws zznq {
        ByteBuffer byteBuffer;
        int length = this.zzE.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzF[i - 1];
            } else {
                byteBuffer = this.zzG;
                if (byteBuffer == null) {
                    byteBuffer = zzmz.zza;
                }
            }
            if (i == length) {
                zzQ(byteBuffer, j);
            } else {
                zzmz zzmzVar = this.zzE[i];
                if (i > this.zzL) {
                    zzmzVar.zze(byteBuffer);
                }
                ByteBuffer zzb = zzmzVar.zzb();
                this.zzF[i] = zzb;
                if (zzb.hasRemaining()) {
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

    private final void zzO(zzbt zzbtVar, boolean z) {
        zzof zzI = zzI();
        if (zzbtVar.equals(zzI.zza) && z == zzI.zzb) {
            return;
        }
        zzof zzofVar = new zzof(zzbtVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (zzS()) {
            this.zzs = zzofVar;
        } else {
            this.zzt = zzofVar;
        }
    }

    private final void zzP() {
        if (zzS()) {
            if (zzeg.zza >= 21) {
                this.zzq.setVolume(this.zzD);
                return;
            }
            AudioTrack audioTrack = this.zzq;
            float f = this.zzD;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzQ(ByteBuffer byteBuffer, long j) throws zznq {
        int write;
        zzjt zzjtVar;
        zzjt zzjtVar2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzI;
            if (byteBuffer2 != null) {
                zzcw.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzI = byteBuffer;
                if (zzeg.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzJ;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzJ = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzJ, 0, remaining);
                    byteBuffer.position(position);
                    this.zzK = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzeg.zza < 21) {
                int zza = this.zzg.zza(this.zzx);
                if (zza > 0) {
                    write = this.zzq.write(this.zzJ, this.zzK, Math.min(remaining2, zza));
                    if (write > 0) {
                        this.zzK += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzq.write(byteBuffer, remaining2, 1);
            }
            this.zzS = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((zzeg.zza < 24 || write != -6) && write != -32) {
                    r0 = false;
                }
                if (r0) {
                    zzL();
                }
                zznq zznqVar = new zznq(write, this.zzp.zza, r0);
                zzno zznoVar = this.zzn;
                if (zznoVar != null) {
                    zznoVar.zza(zznqVar);
                }
                if (zznqVar.zzb) {
                    throw zznqVar;
                }
                this.zzk.zzb(zznqVar);
                return;
            }
            this.zzk.zza();
            if (zzT(this.zzq)) {
                long j2 = this.zzy;
                if (j2 > 0) {
                    this.zzU = false;
                }
                if (this.zzO && this.zzn != null && write < remaining2 && !this.zzU) {
                    long zzc = this.zzg.zzc(j2);
                    zzot zzotVar = ((zzos) this.zzn).zza;
                    zzjtVar = zzotVar.zzl;
                    if (zzjtVar != null) {
                        zzjtVar2 = zzotVar.zzl;
                        zzjtVar2.zza(zzc);
                    }
                }
            }
            int i = this.zzp.zzc;
            if (i == 0) {
                this.zzx += write;
            }
            if (write == remaining2) {
                if (i != 0) {
                    zzcw.zzf(byteBuffer == this.zzG);
                    this.zzy += this.zzz * this.zzH;
                }
                this.zzI = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzR() throws zznq {
        boolean z;
        int i;
        zzmz[] zzmzVarArr;
        if (this.zzL == -1) {
            this.zzL = 0;
            z = true;
            i = this.zzL;
            zzmzVarArr = this.zzE;
            if (i < zzmzVarArr.length) {
                zzmz zzmzVar = zzmzVarArr[i];
                if (z) {
                    zzmzVar.zzd();
                }
                zzN(-9223372036854775807L);
                if (!zzmzVar.zzh()) {
                    return false;
                }
                this.zzL++;
                z = true;
                i = this.zzL;
                zzmzVarArr = this.zzE;
                if (i < zzmzVarArr.length) {
                    ByteBuffer byteBuffer = this.zzI;
                    if (byteBuffer != null) {
                        zzQ(byteBuffer, -9223372036854775807L);
                        if (this.zzI != null) {
                            return false;
                        }
                    }
                    this.zzL = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.zzL;
            zzmzVarArr = this.zzE;
            if (i < zzmzVarArr.length) {
            }
        }
    }

    private final boolean zzS() {
        return this.zzq != null;
    }

    private static boolean zzT(AudioTrack audioTrack) {
        return zzeg.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzU() {
        if (!"audio/raw".equals(this.zzp.zza.zzm)) {
            return false;
        }
        int i = this.zzp.zza.zzB;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final int zza(zzad zzadVar) {
        if (!"audio/raw".equals(zzadVar.zzm)) {
            if (!this.zzT) {
                int i = zzeg.zza;
            }
            return zzH(zzadVar, this.zza) != null ? 2 : 0;
        }
        if (zzeg.zzU(zzadVar.zzB)) {
            return zzadVar.zzB != 2 ? 1 : 2;
        }
        Log.w("DefaultAudioSink", "Invalid PCM encoding: " + zzadVar.zzB);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final long zzb(boolean z) {
        long zzs;
        if (!zzS() || this.zzB) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzg.zzb(z), this.zzp.zza(zzF()));
        while (!this.zzh.isEmpty() && min >= ((zzof) this.zzh.getFirst()).zzd) {
            this.zzt = (zzof) this.zzh.remove();
        }
        zzof zzofVar = this.zzt;
        long j = min - zzofVar.zzd;
        if (zzofVar.zza.equals(zzbt.zza)) {
            zzs = this.zzt.zzc + j;
        } else if (this.zzh.isEmpty()) {
            zzs = this.zzV.zza(j) + this.zzt.zzc;
        } else {
            zzof zzofVar2 = (zzof) this.zzh.getFirst();
            zzs = zzofVar2.zzc - zzeg.zzs(zzofVar2.zzd - min, this.zzt.zza.zzc);
        }
        return zzs + this.zzp.zza(this.zzV.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final zzbt zzc() {
        return zzI().zza;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzd(zzad zzadVar, int i, int[] iArr) throws zznm {
        int i2;
        zzmz[] zzmzVarArr;
        int intValue;
        int i3;
        int intValue2;
        int i4;
        int i5;
        int zzf;
        int[] iArr2;
        if ("audio/raw".equals(zzadVar.zzm)) {
            zzcw.zzd(zzeg.zzU(zzadVar.zzB));
            i3 = zzeg.zzo(zzadVar.zzB, zzadVar.zzz);
            int i6 = zzadVar.zzB;
            zzmz[] zzmzVarArr2 = this.zzd;
            this.zzc.zzq(zzadVar.zzC, zzadVar.zzD);
            if (zzeg.zza < 21 && zzadVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i7 = 0; i7 < 6; i7++) {
                    iArr2[i7] = i7;
                }
            } else {
                iArr2 = iArr;
            }
            this.zzb.zzo(iArr2);
            zzmx zzmxVar = new zzmx(zzadVar.zzA, zzadVar.zzz, zzadVar.zzB);
            for (zzmz zzmzVar : zzmzVarArr2) {
                try {
                    zzmx zza = zzmzVar.zza(zzmxVar);
                    if (true == zzmzVar.zzg()) {
                        zzmxVar = zza;
                    }
                } catch (zzmy e) {
                    throw new zznm(e, zzadVar);
                }
            }
            int i8 = zzmxVar.zzd;
            int i9 = zzmxVar.zzb;
            int i10 = zzmxVar.zzc;
            int zzj = zzeg.zzj(i10);
            zzmzVarArr = zzmzVarArr2;
            i5 = zzeg.zzo(i8, i10);
            i4 = i9;
            i2 = 0;
            intValue = i8;
            intValue2 = zzj;
        } else {
            zzmz[] zzmzVarArr3 = new zzmz[0];
            int i11 = zzadVar.zzA;
            int i12 = zzeg.zza;
            Pair zzH = zzH(zzadVar, this.zza);
            if (zzH == null) {
                throw new zznm("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzadVar))), zzadVar);
            }
            i2 = 2;
            zzmzVarArr = zzmzVarArr3;
            intValue = ((Integer) zzH.first).intValue();
            i3 = -1;
            intValue2 = ((Integer) zzH.second).intValue();
            i4 = i11;
            i5 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i4, intValue2, intValue);
        zzcw.zzf(minBufferSize != -2);
        int i13 = 250000;
        if (i2 == 0) {
            zzf = zzeg.zzf(minBufferSize * 4, zzop.zza(250000, i4, i5), zzop.zza(750000, i4, i5));
        } else if (i2 != 1) {
            int i14 = 5;
            if (intValue == 5) {
                i13 = 500000;
                intValue = 5;
            } else {
                i14 = intValue;
            }
            zzf = zzftm.zza((i13 * zzop.zzb(intValue)) / 1000000);
            i5 = i5;
            intValue = i14;
        } else {
            zzf = zzftm.zza((zzop.zzb(intValue) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, zzf) + i5) - 1) / i5) * i5;
        if (intValue == 0) {
            throw new zznm("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(zzadVar), zzadVar);
        }
        if (intValue2 != 0) {
            this.zzT = false;
            zzoc zzocVar = new zzoc(zzadVar, i3, i2, i5, i4, intValue2, intValue, max, zzmzVarArr);
            if (zzS()) {
                this.zzo = zzocVar;
                return;
            } else {
                this.zzp = zzocVar;
                return;
            }
        }
        throw new zznm("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(zzadVar), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zze() {
        if (zzS()) {
            this.zzv = 0L;
            this.zzw = 0L;
            this.zzx = 0L;
            this.zzy = 0L;
            this.zzU = false;
            this.zzz = 0;
            this.zzt = new zzof(zzI().zza, zzI().zzb, 0L, 0L, null);
            this.zzC = 0L;
            this.zzs = null;
            this.zzh.clear();
            this.zzG = null;
            this.zzH = 0;
            this.zzI = null;
            this.zzN = false;
            this.zzM = false;
            this.zzL = -1;
            this.zzc.zzp();
            zzK();
            if (this.zzg.zzi()) {
                this.zzq.pause();
            }
            if (zzT(this.zzq)) {
                zzol zzolVar = this.zzi;
                Objects.requireNonNull(zzolVar);
                zzolVar.zzb(this.zzq);
            }
            AudioTrack audioTrack = this.zzq;
            this.zzq = null;
            if (zzeg.zza < 21 && !this.zzP) {
                this.zzQ = 0;
            }
            zzoc zzocVar = this.zzo;
            if (zzocVar != null) {
                this.zzp = zzocVar;
                this.zzo = null;
            }
            this.zzg.zze();
            this.zzf.close();
            new zzny(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.zzk.zza();
        this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzf() {
        this.zzA = true;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzg() {
        this.zzO = false;
        if (zzS() && this.zzg.zzl()) {
            this.zzq.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzh() {
        this.zzO = true;
        if (zzS()) {
            this.zzg.zzg();
            this.zzq.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzi() throws zznq {
        if (!this.zzM && zzS() && zzR()) {
            zzM();
            this.zzM = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzj() {
        zze();
        for (zzmz zzmzVar : this.zzd) {
            zzmzVar.zzf();
        }
        zzmz[] zzmzVarArr = this.zze;
        int length = zzmzVarArr.length;
        for (int i = 0; i <= 0; i++) {
            zzmzVarArr[i].zzf();
        }
        this.zzO = false;
        this.zzT = false;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzk(zzi zziVar) {
        if (this.zzr.equals(zziVar)) {
            return;
        }
        this.zzr = zziVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzl(int i) {
        if (this.zzQ != i) {
            this.zzQ = i;
            this.zzP = i != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzm(zzj zzjVar) {
        if (this.zzR.equals(zzjVar)) {
            return;
        }
        int i = zzjVar.zza;
        float f = zzjVar.zzb;
        if (this.zzq != null) {
            int i2 = this.zzR.zza;
        }
        this.zzR = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzn(zzno zznoVar) {
        this.zzn = zznoVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzo(zzbt zzbtVar) {
        zzO(new zzbt(zzeg.zza(zzbtVar.zzc, 0.1f, 8.0f), zzeg.zza(zzbtVar.zzd, 0.1f, 8.0f)), zzI().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzp(zzmv zzmvVar) {
        this.zzm = zzmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzq(boolean z) {
        zzO(zzI().zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final void zzr(float f) {
        if (this.zzD != f) {
            this.zzD = f;
            zzP();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bb A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zznr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzs(ByteBuffer byteBuffer, long j, int i) throws zznn, zznq {
        AudioTrack zzG;
        zzmv zzmvVar;
        boolean z;
        int zza;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.zzG;
        boolean z2 = false;
        zzcw.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzo != null) {
            if (!zzR()) {
                return false;
            }
            zzoc zzocVar = this.zzo;
            zzoc zzocVar2 = this.zzp;
            if (zzocVar2.zzc == zzocVar.zzc && zzocVar2.zzg == zzocVar.zzg && zzocVar2.zze == zzocVar.zze && zzocVar2.zzf == zzocVar.zzf && zzocVar2.zzd == zzocVar.zzd) {
                this.zzp = zzocVar;
                this.zzo = null;
                if (zzT(this.zzq)) {
                    this.zzq.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.zzq;
                    zzad zzadVar = this.zzp.zza;
                    audioTrack.setOffloadDelayPadding(zzadVar.zzC, zzadVar.zzD);
                    this.zzU = true;
                }
            } else {
                zzM();
                if (zzt()) {
                    return false;
                }
                zze();
            }
            zzJ(j);
        }
        if (!zzS()) {
            try {
                this.zzf.block();
                try {
                    zzoc zzocVar3 = this.zzp;
                    Objects.requireNonNull(zzocVar3);
                    zzG = zzG(zzocVar3);
                } catch (zznn e) {
                    zzoc zzocVar4 = this.zzp;
                    if (zzocVar4.zzh > 1000000) {
                        zzoc zzocVar5 = new zzoc(zzocVar4.zza, zzocVar4.zzb, zzocVar4.zzc, zzocVar4.zzd, zzocVar4.zze, zzocVar4.zzf, zzocVar4.zzg, DurationKt.NANOS_IN_MILLIS, zzocVar4.zzi);
                        try {
                            zzG = zzG(zzocVar5);
                            this.zzp = zzocVar5;
                        } catch (zznn e2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                            } catch (Exception unused) {
                            }
                            zzL();
                            throw e;
                        }
                    }
                    zzL();
                    throw e;
                }
                this.zzq = zzG;
                if (zzT(zzG)) {
                    AudioTrack audioTrack2 = this.zzq;
                    if (this.zzi == null) {
                        this.zzi = new zzol(this);
                    }
                    this.zzi.zza(audioTrack2);
                    AudioTrack audioTrack3 = this.zzq;
                    zzad zzadVar2 = this.zzp.zza;
                    audioTrack3.setOffloadDelayPadding(zzadVar2.zzC, zzadVar2.zzD);
                }
                if (zzeg.zza >= 31 && (zzmvVar = this.zzm) != null) {
                    zznz.zza(this.zzq, zzmvVar);
                }
                this.zzQ = this.zzq.getAudioSessionId();
                zznv zznvVar = this.zzg;
                AudioTrack audioTrack4 = this.zzq;
                zzoc zzocVar6 = this.zzp;
                zznvVar.zzf(audioTrack4, zzocVar6.zzc == 2, zzocVar6.zzg, zzocVar6.zzd, zzocVar6.zzh);
                zzP();
                int i7 = this.zzR.zza;
                this.zzB = true;
                z2 = false;
            } catch (zznn e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzj.zzb(e3);
                return false;
            }
        }
        this.zzj.zza();
        if (this.zzB) {
            this.zzC = Math.max(0L, j);
            this.zzA = z2;
            this.zzB = z2;
            zzJ(j);
            if (this.zzO) {
                zzh();
            }
        }
        if (!this.zzg.zzk(zzF())) {
            return false;
        }
        if (this.zzG == null) {
            zzcw.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzoc zzocVar7 = this.zzp;
            if (zzocVar7.zzc != 0 && this.zzz == 0) {
                int i8 = zzocVar7.zzg;
                switch (i8) {
                    case 5:
                    case 6:
                    case 18:
                        z = true;
                        zza = zzxx.zza(byteBuffer);
                        this.zzz = zza;
                        if (zza == 0) {
                            return z;
                        }
                        break;
                    case 7:
                    case 8:
                        int i9 = zzyq.zza;
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
                                z = true;
                            } else {
                                i3 = 2;
                                i4 = (byteBuffer.get(position + 5) & 7) << 4;
                                b = byteBuffer.get(position + 6);
                            }
                            i5 = b & 60;
                            i2 = (i5 >> i3) | i4;
                            z = true;
                        } else {
                            z = true;
                            i2 = ((byteBuffer.get(position + 4) & 252) >> 2) | ((byteBuffer.get(position + 5) & 1) << 6);
                        }
                        zza = (i2 + (z ? 1 : 0)) * 32;
                        this.zzz = zza;
                        if (zza == 0) {
                        }
                        break;
                    case 9:
                        zza = zzzm.zzc(zzeg.zzk(byteBuffer, byteBuffer.position()));
                        if (zza == -1) {
                            throw new IllegalArgumentException();
                        }
                        z = true;
                        this.zzz = zza;
                        if (zza == 0) {
                        }
                        break;
                    case 10:
                    case 16:
                        zza = 1024;
                        z = true;
                        this.zzz = zza;
                        if (zza == 0) {
                        }
                        break;
                    case 11:
                    case 12:
                        zza = 2048;
                        z = true;
                        this.zzz = zza;
                        if (zza == 0) {
                        }
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException("Unexpected audio encoding: " + i8);
                    case 14:
                        int i10 = zzxx.zza;
                        int position2 = byteBuffer.position();
                        int limit = byteBuffer.limit() - 10;
                        int i11 = position2;
                        while (true) {
                            if (i11 > limit) {
                                i6 = -1;
                            } else if ((zzeg.zzk(byteBuffer, i11 + 4) & (-2)) == -126718022) {
                                i6 = i11 - position2;
                            } else {
                                i11++;
                            }
                        }
                        if (i6 == -1) {
                            zza = 0;
                        } else {
                            zza = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & UByte.MAX_VALUE) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        z = true;
                        this.zzz = zza;
                        if (zza == 0) {
                        }
                        break;
                    case 15:
                        zza = 512;
                        z = true;
                        this.zzz = zza;
                        if (zza == 0) {
                        }
                        break;
                    case 17:
                        int i12 = zzya.zza;
                        byte[] bArr = new byte[16];
                        int position3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(position3);
                        zza = zzya.zza(new zzdx(bArr, 16)).zzc;
                        z = true;
                        this.zzz = zza;
                        if (zza == 0) {
                        }
                        break;
                }
            }
            if (this.zzs != null) {
                if (!zzR()) {
                    return false;
                }
                zzJ(j);
                this.zzs = null;
            }
            long zzE = this.zzC + (((zzE() - this.zzc.zzo()) * 1000000) / this.zzp.zza.zzA);
            if (!this.zzA && Math.abs(zzE - j) > 200000) {
                this.zzn.zza(new zznp(j, zzE));
                this.zzA = true;
            }
            if (this.zzA) {
                if (!zzR()) {
                    return false;
                }
                long j2 = j - zzE;
                this.zzC += j2;
                this.zzA = false;
                zzJ(j);
                zzno zznoVar = this.zzn;
                if (zznoVar != null && j2 != 0) {
                    ((zzos) zznoVar).zza.zzab();
                }
            }
            if (this.zzp.zzc == 0) {
                this.zzv += byteBuffer.remaining();
            } else {
                this.zzw += this.zzz * i;
            }
            this.zzG = byteBuffer;
            this.zzH = i;
        }
        zzN(j);
        if (!this.zzG.hasRemaining()) {
            this.zzG = null;
            this.zzH = 0;
            return true;
        }
        if (!this.zzg.zzj(zzF())) {
            return false;
        }
        Log.w("DefaultAudioSink", "Resetting stalled audio track");
        zze();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final boolean zzt() {
        return zzS() && this.zzg.zzh(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final boolean zzu() {
        return !zzS() || (this.zzM && !zzt());
    }

    @Override // com.google.android.gms.internal.ads.zznr
    public final boolean zzv(zzad zzadVar) {
        return zza(zzadVar) != 0;
    }
}

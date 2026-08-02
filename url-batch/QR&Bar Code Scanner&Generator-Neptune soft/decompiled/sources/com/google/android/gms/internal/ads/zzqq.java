package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzqq extends zzgr {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzqp zzC;
    private zzqn zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzqg zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    protected zzgs zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzpr zzan;
    private zzpr zzao;
    private final zzqk zzc;
    private final zzqs zzd;
    private final float zze;
    private final zzgi zzf;
    private final zzgi zzg;
    private final zzgi zzh;
    private final zzqf zzi;
    private final zzek zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzaf zzp;
    private zzaf zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzql zzw;
    private zzaf zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzqq(int i, zzqk zzqkVar, zzqs zzqsVar, boolean z, float f) {
        super(i);
        this.zzc = zzqkVar;
        Objects.requireNonNull(zzqsVar);
        this.zzd = zzqsVar;
        this.zze = f;
        this.zzf = new zzgi(0, 0);
        this.zzg = new zzgi(0, 0);
        this.zzh = new zzgi(2, 0);
        zzqf zzqfVar = new zzqf();
        this.zzi = zzqfVar;
        this.zzj = new zzek(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzqfVar.zzi(0);
        zzqfVar.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzha {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
        } else {
            zzap();
            zzan();
        }
    }

    private final void zzaA() throws zzha {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbg(e, this.zzp, false, 6006);
        }
    }

    private final boolean zzaB() throws zzha {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaA();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaC() throws zzha {
        zzql zzqlVar = this.zzw;
        boolean z = 0;
        if (zzqlVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza = zzqlVar.zza();
            this.zzQ = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                zzay();
            }
            this.zzaa = 2;
            return false;
        }
        if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0L, 0);
            zzay();
            this.zzac = true;
            return true;
        }
        if (this.zzZ == 1) {
            for (int i = 0; i < this.zzx.zzo.size(); i++) {
                this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i));
            }
            this.zzZ = 2;
        }
        int position = this.zzg.zzb.position();
        zzjg zzh = zzh();
        try {
            int zzbf = zzbf(zzh, this.zzg, 0);
            if (zzG()) {
                this.zzag = this.zzaf;
            }
            if (zzbf == -3) {
                return false;
            }
            if (zzbf == -5) {
                if (this.zzZ == 2) {
                    this.zzg.zzb();
                    this.zzZ = 1;
                }
                zzS(zzh);
                return true;
            }
            zzgi zzgiVar = this.zzg;
            if (zzgiVar.zzg()) {
                if (this.zzZ == 2) {
                    zzgiVar.zzb();
                    this.zzZ = 1;
                }
                this.zzah = true;
                if (!this.zzac) {
                    zzax();
                    return false;
                }
                try {
                    if (!this.zzN) {
                        this.zzad = true;
                        this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                        zzay();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzbg(e, this.zzp, false, zzen.zzl(e.getErrorCode()));
                }
            }
            if (!this.zzac && !zzgiVar.zzh()) {
                zzgiVar.zzb();
                if (this.zzZ == 2) {
                    this.zzZ = 1;
                }
                return true;
            }
            boolean zzk = zzgiVar.zzk();
            if (zzk) {
                zzgiVar.zza.zzb(position);
            }
            if (this.zzF && !zzk) {
                ByteBuffer byteBuffer = this.zzg.zzb;
                byte[] bArr = zzaaf.zza;
                int position2 = byteBuffer.position();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + 1;
                    if (i4 >= position2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i5 = byteBuffer.get(i2) & UByte.MAX_VALUE;
                    if (i3 == 3) {
                        if (i5 == 1) {
                            if ((byteBuffer.get(i4) & 31) == 7) {
                                ByteBuffer duplicate = byteBuffer.duplicate();
                                duplicate.position(i2 - 3);
                                duplicate.limit(position2);
                                byteBuffer.position(0);
                                byteBuffer.put(duplicate);
                                break;
                            }
                            i5 = 1;
                        }
                    } else if (i5 == 0) {
                        i3++;
                    }
                    if (i5 != 0) {
                        i3 = 0;
                    }
                    i2 = i4;
                }
                if (this.zzg.zzb.position() == 0) {
                    return true;
                }
                this.zzF = false;
            }
            zzgi zzgiVar2 = this.zzg;
            long j = zzgiVar2.zzd;
            zzqg zzqgVar = this.zzO;
            if (zzqgVar != null) {
                j = zzqgVar.zzb(this.zzp, zzgiVar2);
                this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
            }
            long j2 = j;
            if (this.zzg.zzf()) {
                this.zzk.add(Long.valueOf(j2));
            }
            if (this.zzaj) {
                this.zzj.zzd(j2, this.zzp);
                this.zzaj = false;
            }
            this.zzaf = Math.max(this.zzaf, j2);
            this.zzg.zzj();
            zzgi zzgiVar3 = this.zzg;
            if (zzgiVar3.zze()) {
                zzam(zzgiVar3);
            }
            zzad(this.zzg);
            try {
                if (zzk) {
                    this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j2, 0);
                } else {
                    this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j2, 0);
                }
                zzay();
                this.zzac = true;
                this.zzZ = 0;
                zzgs zzgsVar = this.zza;
                z = zzgsVar.zzc + 1;
                zzgsVar.zzc = z;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzbg(e2, this.zzp, z, zzen.zzl(e2.getErrorCode()));
            }
        } catch (zzgh e3) {
            zzX(e3);
            zzaE(0);
            zzab();
            return true;
        }
    }

    private final boolean zzaD() {
        return this.zzR >= 0;
    }

    private final boolean zzaE(int i) throws zzha {
        zzjg zzh = zzh();
        this.zzf.zzb();
        int zzbf = zzbf(zzh, this.zzf, i | 4);
        if (zzbf == -5) {
            zzS(zzh);
            return true;
        }
        if (zzbf != -4 || !this.zzf.zzg()) {
            return false;
        }
        this.zzah = true;
        zzax();
        return false;
    }

    private final boolean zzaF(long j) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.zzt;
    }

    private final boolean zzaG(zzaf zzafVar) throws zzha {
        if (zzen.zza >= 23 && this.zzw != null && this.zzab != 3 && zzbe() != 0) {
            float zzP = zzP(this.zzv, zzafVar, zzJ());
            float f = this.zzA;
            if (f == zzP) {
                return true;
            }
            if (zzP == -1.0f) {
                zzU();
                return false;
            }
            if (f == -1.0f && zzP <= this.zze) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", zzP);
            this.zzw.zzp(bundle);
            this.zzA = zzP;
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzaq();
        }
    }

    protected static boolean zzav(zzaf zzafVar) {
        return zzafVar.zzF == 0;
    }

    private final void zzaw(zzqn zzqnVar, MediaCrypto mediaCrypto) throws Exception {
        MediaCodec createByCodecName;
        zzql zzrhVar;
        String str = zzqnVar.zza;
        float zzP = zzen.zza < 23 ? -1.0f : zzP(this.zzv, this.zzp, zzJ());
        float f = zzP > this.zze ? zzP : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zzqj zzV = zzV(zzqnVar, this.zzp, null, f);
        if (zzen.zza >= 31) {
            zzqo.zza(zzV, zzl());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            if (zzen.zza < 23 || zzen.zza < 31) {
                try {
                    zzqn zzqnVar2 = zzV.zza;
                    Objects.requireNonNull(zzqnVar2);
                    String str2 = zzqnVar2.zza;
                    Trace.beginSection("createCodec:".concat(String.valueOf(str2)));
                    createByCodecName = MediaCodec.createByCodecName(str2);
                    Trace.endSection();
                } catch (IOException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = e2;
                }
                try {
                    Trace.beginSection("configureCodec");
                    createByCodecName.configure(zzV.zzb, zzV.zzd, (MediaCrypto) null, 0);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    createByCodecName.start();
                    Trace.endSection();
                    zzrhVar = new zzrh(createByCodecName, null);
                } catch (IOException | RuntimeException e3) {
                    e = e3;
                    mediaCodec = createByCodecName;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } else {
                int zzb2 = zzbt.zzb(zzV.zzc.zzm);
                zzdw.zzd("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzen.zzO(zzb2)));
                zzrhVar = new zzpw(zzb2, false).zzc(zzV);
            }
            this.zzw = zzrhVar;
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.zzD = zzqnVar;
            this.zzA = f;
            this.zzx = this.zzp;
            this.zzE = (zzen.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzen.zzd.startsWith("SM-T585") || zzen.zzd.startsWith("SM-A510") || zzen.zzd.startsWith("SM-A520") || zzen.zzd.startsWith("SM-J700"))) ? 2 : (zzen.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzen.zzb) || "flounder_lte".equals(zzen.zzb) || "grouper".equals(zzen.zzb) || "tilapia".equals(zzen.zzb)))) ? 0 : 1;
            this.zzF = zzen.zza < 21 && this.zzx.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzG = zzen.zza == 19 && zzen.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
            this.zzH = zzen.zza == 29 && "c2.android.aac.decoder".equals(str);
            this.zzI = (zzen.zza <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (zzen.zza <= 19 && (("hb2000".equals(zzen.zzb) || "stvm8".equals(zzen.zzb)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
            this.zzJ = zzen.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzK = zzen.zza < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(zzen.zzc) && (zzen.zzb.startsWith("baffin") || zzen.zzb.startsWith("grand") || zzen.zzb.startsWith("fortuna") || zzen.zzb.startsWith("gprimelte") || zzen.zzb.startsWith("j2y18lte") || zzen.zzb.startsWith("ms01"));
            String str3 = zzqnVar.zza;
            this.zzN = (zzen.zza <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (zzen.zza <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3))) || ("Amazon".equals(zzen.zzc) && "AFTS".equals(zzen.zzd) && zzqnVar.zzf);
            this.zzw.zzr();
            if ("c2.android.mp3.decoder".equals(zzqnVar.zza)) {
                this.zzO = new zzqg();
            }
            if (zzbe() == 2) {
                this.zzP = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzY(str, zzV, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final void zzay() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    private final void zzaz() {
        this.zzR = -1;
        this.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzka
    public void zzD(float f, float f2) throws zzha {
        this.zzu = f;
        this.zzv = f2;
        zzaG(this.zzx);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzha {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqq.zzL(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public boolean zzM() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaD()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public final int zzO(zzaf zzafVar) throws zzha {
        try {
            return zzQ(this.zzd, zzafVar);
        } catch (zzqz e) {
            throw zzbg(e, zzafVar, false, 4002);
        }
    }

    protected float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        throw null;
    }

    protected abstract int zzQ(zzqs zzqsVar, zzaf zzafVar) throws zzqz;

    protected zzgt zzR(zzqn zzqnVar, zzaf zzafVar, zzaf zzafVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (zzaB() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0087, code lost:
    
        if (zzaB() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
    
        if (zzaB() == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzgt zzS(zzjg zzjgVar) throws zzha {
        int i;
        boolean z = true;
        this.zzaj = true;
        zzaf zzafVar = zzjgVar.zza;
        Objects.requireNonNull(zzafVar);
        if (zzafVar.zzm == null) {
            throw zzbg(new IllegalArgumentException(), zzafVar, false, 4005);
        }
        zzpr zzprVar = zzjgVar.zzb;
        this.zzao = zzprVar;
        this.zzp = zzafVar;
        if (this.zzV) {
            this.zzX = true;
            return null;
        }
        zzql zzqlVar = this.zzw;
        if (zzqlVar == null) {
            this.zzB = null;
            zzan();
            return null;
        }
        zzqn zzqnVar = this.zzD;
        zzaf zzafVar2 = this.zzx;
        zzpr zzprVar2 = this.zzan;
        if (zzprVar2 != zzprVar) {
            if (zzprVar != null && zzprVar2 != null && zzen.zza >= 23 && !zzo.zze.equals(zzo.zza)) {
                zzo.zze.equals(zzo.zza);
            }
            zzU();
            return new zzgt(zzqnVar.zza, zzafVar2, zzafVar, 0, 128);
        }
        zzdd.zzf(zzprVar == zzprVar2 || zzen.zza >= 23);
        zzgt zzR = zzR(zzqnVar, zzafVar2, zzafVar);
        int i2 = zzR.zzd;
        if (i2 != 0) {
            if (i2 == 1) {
                if (zzaG(zzafVar)) {
                    this.zzx = zzafVar;
                    if (zzprVar == zzprVar2) {
                        if (this.zzac) {
                            this.zzaa = 1;
                            if (this.zzG || this.zzI) {
                                this.zzab = 3;
                                i = 2;
                            } else {
                                this.zzab = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (zzaG(zzafVar)) {
                    this.zzx = zzafVar;
                    if (zzprVar != zzprVar2) {
                    }
                }
                i = 16;
            } else {
                if (zzaG(zzafVar)) {
                    this.zzY = true;
                    this.zzZ = 1;
                    int i3 = this.zzE;
                    if (i3 != 2 && (i3 != 1 || zzafVar.zzr != zzafVar2.zzr || zzafVar.zzs != zzafVar2.zzs)) {
                        z = false;
                    }
                    this.zzL = z;
                    this.zzx = zzafVar;
                    if (zzprVar != zzprVar2) {
                    }
                }
                i = 16;
            }
            return (zzR.zzd != 0 || (this.zzw == zzqlVar && this.zzab != 3)) ? zzR : new zzgt(zzqnVar.zza, zzafVar2, zzafVar, 0, i);
        }
        zzU();
        i = 0;
        if (zzR.zzd != 0) {
        }
    }

    protected abstract zzqj zzV(zzqn zzqnVar, zzaf zzafVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzW(zzqs zzqsVar, zzaf zzafVar, boolean z) throws zzqz;

    protected void zzX(Exception exc) {
        throw null;
    }

    protected void zzY(String str, zzqj zzqjVar, long j, long j2) {
        throw null;
    }

    protected void zzZ(String str) {
        throw null;
    }

    protected void zzaa(zzaf zzafVar, MediaFormat mediaFormat) throws zzha {
        throw null;
    }

    protected void zzac() {
    }

    protected void zzad(zzgi zzgiVar) throws zzha {
        throw null;
    }

    protected void zzae() throws zzha {
    }

    protected abstract boolean zzaf(long j, long j2, zzql zzqlVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzha;

    protected boolean zzag(zzaf zzafVar) {
        return false;
    }

    protected final float zzah() {
        return this.zzu;
    }

    protected final long zzai() {
        return this.zzal;
    }

    protected final zzql zzaj() {
        return this.zzw;
    }

    protected zzqm zzak(Throwable th, zzqn zzqnVar) {
        return new zzqm(th, zzqnVar);
    }

    protected final zzqn zzal() {
        return this.zzD;
    }

    protected void zzam(zzgi zzgiVar) throws zzha {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0100 A[Catch: zzqp -> 0x0123, TryCatch #0 {zzqp -> 0x0123, blocks: (B:29:0x0069, B:74:0x006e, B:76:0x0086, B:77:0x0091, B:32:0x00a0, B:34:0x00a8, B:35:0x00b0, B:37:0x00b4, B:51:0x00dc, B:53:0x0100, B:54:0x0109, B:59:0x0112, B:60:0x0114, B:61:0x0103, B:69:0x0115, B:71:0x0118, B:72:0x0122, B:80:0x0095, B:81:0x009f, B:48:0x00cc, B:63:0x00da, B:40:0x00c3), top: B:28:0x0069, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103 A[Catch: zzqp -> 0x0123, TryCatch #0 {zzqp -> 0x0123, blocks: (B:29:0x0069, B:74:0x006e, B:76:0x0086, B:77:0x0091, B:32:0x00a0, B:34:0x00a8, B:35:0x00b0, B:37:0x00b4, B:51:0x00dc, B:53:0x0100, B:54:0x0109, B:59:0x0112, B:60:0x0114, B:61:0x0103, B:69:0x0115, B:71:0x0118, B:72:0x0122, B:80:0x0095, B:81:0x009f, B:48:0x00cc, B:63:0x00da, B:40:0x00c3), top: B:28:0x0069, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzan() throws zzha {
        zzaf zzafVar;
        zzqp zzqpVar;
        if (this.zzw != null || this.zzV || (zzafVar = this.zzp) == null) {
            return;
        }
        if (this.zzao == null && zzag(zzafVar)) {
            zzaf zzafVar2 = this.zzp;
            zzT();
            String str = zzafVar2.zzm;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzn(32);
            } else {
                this.zzi.zzn(1);
            }
            this.zzV = true;
            return;
        }
        this.zzan = this.zzao;
        String str2 = this.zzp.zzm;
        if (this.zzan != null && zzps.zza) {
            zzpi zza = this.zzan.zza();
            throw zzbg(zza, this.zzp, false, zza.zza);
        }
        try {
            if (this.zzB == null) {
                try {
                    List zzW = zzW(this.zzd, this.zzp, false);
                    zzW.isEmpty();
                    this.zzB = new ArrayDeque();
                    if (!zzW.isEmpty()) {
                        this.zzB.add((zzqn) zzW.get(0));
                    }
                    this.zzC = null;
                } catch (zzqz e) {
                    throw new zzqp(this.zzp, (Throwable) e, false, -49998);
                }
            }
            if (this.zzB.isEmpty()) {
                throw new zzqp(this.zzp, (Throwable) null, false, -49999);
            }
            zzqn zzqnVar = (zzqn) this.zzB.peekFirst();
            while (this.zzw == null) {
                zzqn zzqnVar2 = (zzqn) this.zzB.peekFirst();
                if (!zzau(zzqnVar2)) {
                    return;
                }
                try {
                    zzaw(zzqnVar2, null);
                } catch (Exception e2) {
                    if (zzqnVar2 != zzqnVar) {
                        throw e2;
                    }
                    try {
                        zzdw.zze("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        zzaw(zzqnVar2, null);
                    } catch (Exception e3) {
                        zzdw.zzf("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(zzqnVar2))), e3);
                        this.zzB.removeFirst();
                        zzqp zzqpVar2 = new zzqp(this.zzp, (Throwable) e3, false, zzqnVar2);
                        zzX(zzqpVar2);
                        zzqpVar = this.zzC;
                        if (zzqpVar != null) {
                            this.zzC = zzqpVar2;
                        } else {
                            this.zzC = zzqp.zza(zzqpVar, zzqpVar2);
                        }
                        if (!this.zzB.isEmpty()) {
                            throw this.zzC;
                        }
                    }
                    zzdw.zzf("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(zzqnVar2))), e3);
                    this.zzB.removeFirst();
                    zzqp zzqpVar22 = new zzqp(this.zzp, (Throwable) e3, false, zzqnVar2);
                    zzX(zzqpVar22);
                    zzqpVar = this.zzC;
                    if (zzqpVar != null) {
                    }
                    if (!this.zzB.isEmpty()) {
                    }
                }
            }
            this.zzB = null;
        } catch (zzqp e4) {
            throw zzbg(e4, this.zzp, false, 4001);
        }
    }

    protected void zzao(long j) {
        while (true) {
            int i = this.zzam;
            if (i == 0 || j < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i2 = i - 1;
            this.zzam = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzac();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzap() {
        try {
            zzql zzqlVar = this.zzw;
            if (zzqlVar != null) {
                zzqlVar.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzar();
        }
    }

    protected void zzaq() {
        zzay();
        zzaz();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzqg zzqgVar = this.zzO;
        if (zzqgVar != null) {
            zzqgVar.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    protected final void zzar() {
        zzaq();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    protected final boolean zzas() throws zzha {
        boolean zzat = zzat();
        if (zzat) {
            zzan();
        }
        return zzat;
    }

    protected final boolean zzat() {
        if (this.zzw == null) {
            return false;
        }
        int i = this.zzab;
        if (i == 3 || this.zzG || ((this.zzH && !this.zzae) || (this.zzI && this.zzad))) {
            zzap();
            return true;
        }
        if (i == 2) {
            zzdd.zzf(zzen.zza >= 23);
            if (zzen.zza >= 23) {
                try {
                    zzaA();
                } catch (zzha e) {
                    zzdw.zzf("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzap();
                    return true;
                }
            }
        }
        zzab();
        return false;
    }

    protected boolean zzau(zzqn zzqnVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzkb
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzat();
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected void zzt(boolean z, boolean z2) throws zzha {
        this.zza = new zzgs();
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected void zzu(long j, boolean z) throws zzha {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzas();
        }
        zzek zzekVar = this.zzj;
        if (zzekVar.zza() > 0) {
            this.zzaj = true;
        }
        zzekVar.zze();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected void zzv() {
        try {
            zzT();
            zzap();
        } finally {
            this.zzao = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected final void zzy(zzaf[] zzafVarArr, long j, long j2) throws zzha {
        if (this.zzal == -9223372036854775807L) {
            zzdd.zzf(this.zzak == -9223372036854775807L);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            zzdw.zze("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }

    private final void zzax() throws zzha {
        int i = this.zzab;
        if (i == 1) {
            zzab();
            return;
        }
        if (i == 2) {
            zzab();
            zzaA();
        } else if (i != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzap();
            zzan();
        }
    }
}

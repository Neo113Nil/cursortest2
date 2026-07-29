package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzqj extends zzgl {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzqi zzC;
    private zzqg zzD;
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
    private zzpz zzO;
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
    protected zzgm zza;
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
    private zzpk zzan;
    private zzpk zzao;
    private final zzqd zzc;
    private final zzql zzd;
    private final float zze;
    private final zzgc zzf;
    private final zzgc zzg;
    private final zzgc zzh;
    private final zzpy zzi;
    private final zzed zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzad zzp;
    private zzad zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzqe zzw;
    private zzad zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzqj(int i, zzqd zzqdVar, zzql zzqlVar, boolean z, float f) {
        super(i);
        this.zzc = zzqdVar;
        Objects.requireNonNull(zzqlVar);
        this.zzd = zzqlVar;
        this.zze = f;
        this.zzf = new zzgc(0, 0);
        this.zzg = new zzgc(0, 0);
        this.zzh = new zzgc(2, 0);
        zzpy zzpyVar = new zzpy();
        this.zzi = zzpyVar;
        this.zzj = new zzed(10);
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
        zzpyVar.zzi(0);
        zzpyVar.zzb.order(ByteOrder.nativeOrder());
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

    private final void zzU() throws zzgu {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
        } else {
            zzap();
            zzan();
        }
    }

    private final void zzaA() throws zzgu {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw zzbg(e, this.zzp, false, 6006);
        }
    }

    private final boolean zzaB() throws zzgu {
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
    private final boolean zzaC() throws zzgu {
        zzqe zzqeVar = this.zzw;
        boolean z = 0;
        if (zzqeVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza = zzqeVar.zza();
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
        zzja zzh = zzh();
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
            zzgc zzgcVar = this.zzg;
            if (zzgcVar.zzg()) {
                if (this.zzZ == 2) {
                    zzgcVar.zzb();
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
                    throw zzbg(e, this.zzp, false, zzeg.zzl(e.getErrorCode()));
                }
            }
            if (!this.zzac && !zzgcVar.zzh()) {
                zzgcVar.zzb();
                if (this.zzZ == 2) {
                    this.zzZ = 1;
                }
                return true;
            }
            boolean zzk = zzgcVar.zzk();
            if (zzk) {
                zzgcVar.zza.zzb(position);
            }
            if (this.zzF && !zzk) {
                ByteBuffer byteBuffer = this.zzg.zzb;
                byte[] bArr = zzzp.zza;
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
            zzgc zzgcVar2 = this.zzg;
            long j = zzgcVar2.zzd;
            zzpz zzpzVar = this.zzO;
            if (zzpzVar != null) {
                j = zzpzVar.zzb(this.zzp, zzgcVar2);
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
            zzgc zzgcVar3 = this.zzg;
            if (zzgcVar3.zze()) {
                zzam(zzgcVar3);
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
                zzgm zzgmVar = this.zza;
                z = zzgmVar.zzc + 1;
                zzgmVar.zzc = z;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzbg(e2, this.zzp, z, zzeg.zzl(e2.getErrorCode()));
            }
        } catch (zzgb e3) {
            zzX(e3);
            zzaE(0);
            zzab();
            return true;
        }
    }

    private final boolean zzaD() {
        return this.zzR >= 0;
    }

    private final boolean zzaE(int i) throws zzgu {
        zzja zzh = zzh();
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

    private final boolean zzaG(zzad zzadVar) throws zzgu {
        if (zzeg.zza >= 23 && this.zzw != null && this.zzab != 3 && zzbe() != 0) {
            float zzP = zzP(this.zzv, zzadVar, zzJ());
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

    protected static boolean zzav(zzad zzadVar) {
        return zzadVar.zzF == 0;
    }

    private final void zzaw(zzqg zzqgVar, MediaCrypto mediaCrypto) throws Exception {
        MediaCodec createByCodecName;
        zzqe zzraVar;
        String str = zzqgVar.zza;
        float zzP = zzeg.zza < 23 ? -1.0f : zzP(this.zzv, this.zzp, zzJ());
        float f = zzP > this.zze ? zzP : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        zzqc zzV = zzV(zzqgVar, this.zzp, null, f);
        if (zzeg.zza >= 31) {
            zzqh.zza(zzV, zzl());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            if (zzeg.zza < 23 || zzeg.zza < 31) {
                try {
                    zzqg zzqgVar2 = zzV.zza;
                    Objects.requireNonNull(zzqgVar2);
                    String str2 = zzqgVar2.zza;
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
                    zzraVar = new zzra(createByCodecName, null);
                } catch (IOException | RuntimeException e3) {
                    e = e3;
                    mediaCodec = createByCodecName;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } else {
                int zzb2 = zzbo.zzb(zzV.zzc.zzm);
                Log.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzeg.zzN(zzb2)));
                zzraVar = new zzpp(zzb2, false).zzc(zzV);
            }
            this.zzw = zzraVar;
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.zzD = zzqgVar;
            this.zzA = f;
            this.zzx = this.zzp;
            this.zzE = (zzeg.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzeg.zzd.startsWith("SM-T585") || zzeg.zzd.startsWith("SM-A510") || zzeg.zzd.startsWith("SM-A520") || zzeg.zzd.startsWith("SM-J700"))) ? 2 : (zzeg.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzeg.zzb) || "flounder_lte".equals(zzeg.zzb) || "grouper".equals(zzeg.zzb) || "tilapia".equals(zzeg.zzb)))) ? 0 : 1;
            this.zzF = zzeg.zza < 21 && this.zzx.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzG = zzeg.zza == 19 && zzeg.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
            this.zzH = zzeg.zza == 29 && "c2.android.aac.decoder".equals(str);
            this.zzI = (zzeg.zza <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (zzeg.zza <= 19 && (("hb2000".equals(zzeg.zzb) || "stvm8".equals(zzeg.zzb)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
            this.zzJ = zzeg.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzK = zzeg.zza < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(zzeg.zzc) && (zzeg.zzb.startsWith("baffin") || zzeg.zzb.startsWith("grand") || zzeg.zzb.startsWith("fortuna") || zzeg.zzb.startsWith("gprimelte") || zzeg.zzb.startsWith("j2y18lte") || zzeg.zzb.startsWith("ms01"));
            String str3 = zzqgVar.zza;
            this.zzN = (zzeg.zza <= 25 && "OMX.rk.video_decoder.avc".equals(str3)) || (zzeg.zza <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str3) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str3))) || ("Amazon".equals(zzeg.zzc) && "AFTS".equals(zzeg.zzd) && zzqgVar.zzf);
            this.zzw.zzr();
            if ("c2.android.mp3.decoder".equals(zzqgVar.zza)) {
                this.zzO = new zzpz();
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

    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzju
    public void zzD(float f, float f2) throws zzgu {
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
    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzgu {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.zzL(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public boolean zzM() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzju
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

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzO(zzad zzadVar) throws zzgu {
        try {
            return zzQ(this.zzd, zzadVar);
        } catch (zzqs e) {
            throw zzbg(e, zzadVar, false, 4002);
        }
    }

    protected float zzP(float f, zzad zzadVar, zzad[] zzadVarArr) {
        throw null;
    }

    protected abstract int zzQ(zzql zzqlVar, zzad zzadVar) throws zzqs;

    protected zzgn zzR(zzqg zzqgVar, zzad zzadVar, zzad zzadVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (zzaB() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0087, code lost:
    
        if (zzaB() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009b, code lost:
    
        if (zzaB() == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzgn zzS(zzja zzjaVar) throws zzgu {
        int i;
        boolean z = true;
        this.zzaj = true;
        zzad zzadVar = zzjaVar.zza;
        Objects.requireNonNull(zzadVar);
        if (zzadVar.zzm == null) {
            throw zzbg(new IllegalArgumentException(), zzadVar, false, 4005);
        }
        zzpk zzpkVar = zzjaVar.zzb;
        this.zzao = zzpkVar;
        this.zzp = zzadVar;
        if (this.zzV) {
            this.zzX = true;
            return null;
        }
        zzqe zzqeVar = this.zzw;
        if (zzqeVar == null) {
            this.zzB = null;
            zzan();
            return null;
        }
        zzqg zzqgVar = this.zzD;
        zzad zzadVar2 = this.zzx;
        zzpk zzpkVar2 = this.zzan;
        if (zzpkVar2 != zzpkVar) {
            if (zzpkVar != null && zzpkVar2 != null && zzeg.zza >= 23 && !zzm.zze.equals(zzm.zza)) {
                zzm.zze.equals(zzm.zza);
            }
            zzU();
            return new zzgn(zzqgVar.zza, zzadVar2, zzadVar, 0, 128);
        }
        zzcw.zzf(zzpkVar == zzpkVar2 || zzeg.zza >= 23);
        zzgn zzR = zzR(zzqgVar, zzadVar2, zzadVar);
        int i2 = zzR.zzd;
        if (i2 != 0) {
            if (i2 == 1) {
                if (zzaG(zzadVar)) {
                    this.zzx = zzadVar;
                    if (zzpkVar == zzpkVar2) {
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
                if (zzaG(zzadVar)) {
                    this.zzx = zzadVar;
                    if (zzpkVar != zzpkVar2) {
                    }
                }
                i = 16;
            } else {
                if (zzaG(zzadVar)) {
                    this.zzY = true;
                    this.zzZ = 1;
                    int i3 = this.zzE;
                    if (i3 != 2 && (i3 != 1 || zzadVar.zzr != zzadVar2.zzr || zzadVar.zzs != zzadVar2.zzs)) {
                        z = false;
                    }
                    this.zzL = z;
                    this.zzx = zzadVar;
                    if (zzpkVar != zzpkVar2) {
                    }
                }
                i = 16;
            }
            return (zzR.zzd != 0 || (this.zzw == zzqeVar && this.zzab != 3)) ? zzR : new zzgn(zzqgVar.zza, zzadVar2, zzadVar, 0, i);
        }
        zzU();
        i = 0;
        if (zzR.zzd != 0) {
        }
    }

    protected abstract zzqc zzV(zzqg zzqgVar, zzad zzadVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzW(zzql zzqlVar, zzad zzadVar, boolean z) throws zzqs;

    protected void zzX(Exception exc) {
        throw null;
    }

    protected void zzY(String str, zzqc zzqcVar, long j, long j2) {
        throw null;
    }

    protected void zzZ(String str) {
        throw null;
    }

    protected void zzaa(zzad zzadVar, MediaFormat mediaFormat) throws zzgu {
        throw null;
    }

    protected void zzac() {
    }

    protected void zzad(zzgc zzgcVar) throws zzgu {
        throw null;
    }

    protected void zzae() throws zzgu {
    }

    protected abstract boolean zzaf(long j, long j2, zzqe zzqeVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzadVar) throws zzgu;

    protected boolean zzag(zzad zzadVar) {
        return false;
    }

    protected final float zzah() {
        return this.zzu;
    }

    protected final long zzai() {
        return this.zzal;
    }

    protected final zzqe zzaj() {
        return this.zzw;
    }

    protected zzqf zzak(Throwable th, zzqg zzqgVar) {
        return new zzqf(th, zzqgVar);
    }

    protected final zzqg zzal() {
        return this.zzD;
    }

    protected void zzam(zzgc zzgcVar) throws zzgu {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0100 A[Catch: zzqi -> 0x0123, TryCatch #3 {zzqi -> 0x0123, blocks: (B:29:0x0069, B:74:0x006e, B:76:0x0086, B:77:0x0091, B:32:0x00a0, B:34:0x00a8, B:35:0x00b0, B:37:0x00b4, B:51:0x00dc, B:53:0x0100, B:54:0x0109, B:59:0x0112, B:60:0x0114, B:61:0x0103, B:69:0x0115, B:71:0x0118, B:72:0x0122, B:80:0x0095, B:81:0x009f, B:48:0x00cc, B:63:0x00da, B:40:0x00c3), top: B:28:0x0069, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103 A[Catch: zzqi -> 0x0123, TryCatch #3 {zzqi -> 0x0123, blocks: (B:29:0x0069, B:74:0x006e, B:76:0x0086, B:77:0x0091, B:32:0x00a0, B:34:0x00a8, B:35:0x00b0, B:37:0x00b4, B:51:0x00dc, B:53:0x0100, B:54:0x0109, B:59:0x0112, B:60:0x0114, B:61:0x0103, B:69:0x0115, B:71:0x0118, B:72:0x0122, B:80:0x0095, B:81:0x009f, B:48:0x00cc, B:63:0x00da, B:40:0x00c3), top: B:28:0x0069, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzan() throws zzgu {
        zzad zzadVar;
        zzqi zzqiVar;
        if (this.zzw != null || this.zzV || (zzadVar = this.zzp) == null) {
            return;
        }
        if (this.zzao == null && zzag(zzadVar)) {
            zzad zzadVar2 = this.zzp;
            zzT();
            String str = zzadVar2.zzm;
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
        if (this.zzan != null && zzpl.zza) {
            zzpb zza = this.zzan.zza();
            throw zzbg(zza, this.zzp, false, zza.zza);
        }
        try {
            if (this.zzB == null) {
                try {
                    List zzW = zzW(this.zzd, this.zzp, false);
                    zzW.isEmpty();
                    this.zzB = new ArrayDeque();
                    if (!zzW.isEmpty()) {
                        this.zzB.add((zzqg) zzW.get(0));
                    }
                    this.zzC = null;
                } catch (zzqs e) {
                    throw new zzqi(this.zzp, (Throwable) e, false, -49998);
                }
            }
            if (this.zzB.isEmpty()) {
                throw new zzqi(this.zzp, (Throwable) null, false, -49999);
            }
            zzqg zzqgVar = (zzqg) this.zzB.peekFirst();
            while (this.zzw == null) {
                zzqg zzqgVar2 = (zzqg) this.zzB.peekFirst();
                if (!zzau(zzqgVar2)) {
                    return;
                }
                try {
                    zzaw(zzqgVar2, null);
                } catch (Exception e2) {
                    if (zzqgVar2 != zzqgVar) {
                        throw e2;
                    }
                    try {
                        Log.w("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        zzaw(zzqgVar2, null);
                    } catch (Exception e3) {
                        zzdn.zzb("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(zzqgVar2))), e3);
                        this.zzB.removeFirst();
                        zzqi zzqiVar2 = new zzqi(this.zzp, (Throwable) e3, false, zzqgVar2);
                        zzX(zzqiVar2);
                        zzqiVar = this.zzC;
                        if (zzqiVar != null) {
                            this.zzC = zzqiVar2;
                        } else {
                            this.zzC = zzqi.zza(zzqiVar, zzqiVar2);
                        }
                        if (!this.zzB.isEmpty()) {
                            throw this.zzC;
                        }
                    }
                    zzdn.zzb("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(String.valueOf(zzqgVar2))), e3);
                    this.zzB.removeFirst();
                    zzqi zzqiVar22 = new zzqi(this.zzp, (Throwable) e3, false, zzqgVar2);
                    zzX(zzqiVar22);
                    zzqiVar = this.zzC;
                    if (zzqiVar != null) {
                    }
                    if (!this.zzB.isEmpty()) {
                    }
                }
            }
            this.zzB = null;
        } catch (zzqi e4) {
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
            zzqe zzqeVar = this.zzw;
            if (zzqeVar != null) {
                zzqeVar.zzl();
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
        zzpz zzpzVar = this.zzO;
        if (zzpzVar != null) {
            zzpzVar.zzc();
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

    protected final boolean zzas() throws zzgu {
        boolean zzat = zzat();
        if (zzat) {
            zzan();
        }
        return zzat;
    }

    protected boolean zzau(zzqg zzqgVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzjv
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    protected void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzat();
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    protected void zzt(boolean z, boolean z2) throws zzgu {
        this.zza = new zzgm();
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    protected void zzu(long j, boolean z) throws zzgu {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzas();
        }
        zzed zzedVar = this.zzj;
        if (zzedVar.zza() > 0) {
            this.zzaj = true;
        }
        zzedVar.zze();
        int i = this.zzam;
        if (i != 0) {
            int i2 = i - 1;
            this.zzal = this.zzn[i2];
            this.zzak = this.zzm[i2];
            this.zzam = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    protected void zzv() {
        try {
            zzT();
            zzap();
        } finally {
            this.zzao = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    protected final void zzy(zzad[] zzadVarArr, long j, long j2) throws zzgu {
        if (this.zzal == -9223372036854775807L) {
            zzcw.zzf(this.zzak == -9223372036854775807L);
            this.zzak = j;
            this.zzal = j2;
            return;
        }
        int i = this.zzam;
        if (i == 10) {
            Log.w("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i + 1;
        }
        long[] jArr = this.zzm;
        int i2 = this.zzam - 1;
        jArr[i2] = j;
        this.zzn[i2] = j2;
        this.zzo[i2] = this.zzaf;
    }

    protected final boolean zzat() {
        if (this.zzw == null) {
            return false;
        }
        if (this.zzab == 3 || this.zzG || ((this.zzH && !this.zzae) || (this.zzI && this.zzad))) {
            zzap();
            return true;
        }
        zzab();
        return false;
    }

    private final void zzax() throws zzgu {
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

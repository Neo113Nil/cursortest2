package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzso extends zzhm {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzhn zza;
    private boolean zzaa;
    private zzsn zzab;
    private long zzac;
    private boolean zzad;
    private zzrj zzae;
    private zzrj zzaf;
    private final zzsa zzc;
    private final zzsq zzd;
    private final float zze;
    private final zzhd zzf;
    private final zzhd zzg;
    private final zzhd zzh;
    private final zzrx zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzqw zzl;
    private zzaf zzm;
    private zzaf zzn;
    private zzld zzo;
    private MediaCrypto zzp;
    private float zzq;
    private zzsc zzr;
    private zzaf zzs;
    private MediaFormat zzt;
    private boolean zzu;
    private float zzv;
    private ArrayDeque zzw;
    private zzsk zzx;
    private zzsf zzy;
    private int zzz;

    public zzso(int i, zzsa zzsaVar, zzsq zzsqVar, boolean z, float f) {
        super(i);
        this.zzc = zzsaVar;
        this.zzd = zzsqVar;
        this.zze = f;
        this.zzf = new zzhd(0, 0);
        this.zzg = new zzhd(0, 0);
        this.zzh = new zzhd(2, 0);
        zzrx zzrxVar = new zzrx();
        this.zzi = zzrxVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzab = zzsn.zza;
        zzrxVar.zzi(0);
        zzrxVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzqw();
        this.zzv = -1.0f;
        this.zzz = 0;
        this.zzQ = 0;
        this.zzH = -1;
        this.zzI = -1;
        this.zzG = -9223372036854775807L;
        this.zzW = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzR = 0;
        this.zzS = 0;
        this.zza = new zzhn();
    }

    protected static boolean zzaN(zzaf zzafVar) {
        return zzafVar.zzG == 0;
    }

    private final void zzaO() {
        this.zzH = -1;
        this.zzg.zzc = null;
    }

    private final void zzaP() {
        this.zzI = -1;
        this.zzJ = null;
    }

    private final void zzaQ(zzsn zzsnVar) {
        this.zzab = zzsnVar;
        if (zzsnVar.zzd != -9223372036854775807L) {
            this.zzad = true;
        }
    }

    private final void zzaR() throws zzhw {
        zzrj zzrjVar = this.zzaf;
        zzrjVar.getClass();
        this.zzae = zzrjVar;
        this.zzR = 0;
        this.zzS = 0;
    }

    private final boolean zzaS() throws zzhw {
        if (this.zzT) {
            this.zzR = 1;
            if (this.zzB) {
                this.zzS = 3;
                return false;
            }
            this.zzS = 2;
        } else {
            zzaR();
        }
        return true;
    }

    private final boolean zzaT() throws zzhw {
        zzsc zzscVar = this.zzr;
        if (zzscVar == null || this.zzR == 2 || this.zzY) {
            return false;
        }
        if (this.zzH < 0) {
            int zza = zzscVar.zza();
            this.zzH = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzc = zzscVar.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzR == 1) {
            if (!this.zzF) {
                this.zzU = true;
                zzscVar.zzj(this.zzH, 0, 0, 0L, 4);
                zzaO();
            }
            this.zzR = 2;
            return false;
        }
        if (this.zzD) {
            this.zzD = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            byteBuffer.getClass();
            byteBuffer.put(zzb);
            zzscVar.zzj(this.zzH, 0, 38, 0L, 0);
            zzaO();
            this.zzT = true;
            return true;
        }
        if (this.zzQ == 1) {
            int i = 0;
            while (true) {
                zzaf zzafVar = this.zzs;
                zzafVar.getClass();
                if (i >= zzafVar.zzo.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.zzs.zzo.get(i);
                ByteBuffer byteBuffer2 = this.zzg.zzc;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i++;
            }
            this.zzQ = 2;
        }
        ByteBuffer byteBuffer3 = this.zzg.zzc;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        zzjz zzcY = zzcY();
        try {
            int zzcW = zzcW(zzcY, this.zzg, 0);
            if (zzcW == -3) {
                if (zzQ()) {
                    this.zzX = this.zzW;
                }
                return false;
            }
            if (zzcW == -5) {
                if (this.zzQ == 2) {
                    this.zzg.zzb();
                    this.zzQ = 1;
                }
                zzac(zzcY);
                return true;
            }
            zzhd zzhdVar = this.zzg;
            if (zzhdVar.zzf()) {
                this.zzX = this.zzW;
                if (this.zzQ == 2) {
                    zzhdVar.zzb();
                    this.zzQ = 1;
                }
                this.zzY = true;
                if (!this.zzT) {
                    zzao();
                    return false;
                }
                try {
                    if (!this.zzF) {
                        this.zzU = true;
                        zzscVar.zzj(this.zzH, 0, 0, 0L, 4);
                        zzaO();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzi(e, this.zzm, false, zzet.zzj(e.getErrorCode()));
                }
            }
            if (!this.zzT && !zzhdVar.zzg()) {
                zzhdVar.zzb();
                if (this.zzQ == 2) {
                    this.zzQ = 1;
                }
                return true;
            }
            boolean zzk = zzhdVar.zzk();
            if (zzk) {
                zzhdVar.zzb.zzb(position);
            }
            long j = this.zzg.zze;
            if (this.zzaa) {
                if (this.zzk.isEmpty()) {
                    zzeq zzeqVar = this.zzab.zze;
                    zzaf zzafVar2 = this.zzm;
                    zzafVar2.getClass();
                    zzeqVar.zzd(j, zzafVar2);
                } else {
                    zzeq zzeqVar2 = ((zzsn) this.zzk.peekLast()).zze;
                    zzaf zzafVar3 = this.zzm;
                    zzafVar3.getClass();
                    zzeqVar2.zzd(j, zzafVar3);
                }
                this.zzaa = false;
            }
            long max = Math.max(this.zzW, j);
            this.zzW = max;
            if (zzQ() || this.zzg.zzh()) {
                this.zzX = max;
            }
            this.zzg.zzj();
            zzhd zzhdVar2 = this.zzg;
            if (zzhdVar2.zze()) {
                zzaj(zzhdVar2);
            }
            zzaD(this.zzg);
            zzat(this.zzg);
            try {
                if (zzk) {
                    zzscVar.zzk(this.zzH, 0, this.zzg.zzb, j, 0);
                } else {
                    int i2 = this.zzH;
                    ByteBuffer byteBuffer4 = this.zzg.zzc;
                    byteBuffer4.getClass();
                    zzscVar.zzj(i2, 0, byteBuffer4.limit(), j, 0);
                }
                zzaO();
                this.zzT = true;
                this.zzQ = 0;
                this.zza.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzi(e2, this.zzm, false, zzet.zzj(e2.getErrorCode()));
            }
        } catch (zzhc e3) {
            zzak(e3);
            zzaW(0);
            zzah();
            return true;
        }
    }

    private final boolean zzaU() {
        return this.zzI >= 0;
    }

    private final boolean zzaV(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzaf zzafVar = this.zzn;
        return (zzafVar != null && Objects.equals(zzafVar.zzm, "audio/opus") && zzade.zzf(j, j2)) ? false : true;
    }

    private final boolean zzaW(int i) throws zzhw {
        zzhd zzhdVar = this.zzf;
        zzjz zzcY = zzcY();
        zzhdVar.zzb();
        int zzcW = zzcW(zzcY, this.zzf, i | 4);
        if (zzcW == -5) {
            zzac(zzcY);
            return true;
        }
        if (zzcW != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzY = true;
        zzao();
        return false;
    }

    private final boolean zzaX(zzaf zzafVar) throws zzhw {
        if (zzet.zza >= 23 && this.zzr != null && this.zzS != 3 && zzcV() != 0) {
            float f = this.zzq;
            zzafVar.getClass();
            float zzZ = zzZ(f, zzafVar, zzT());
            float f2 = this.zzv;
            if (f2 != zzZ) {
                if (zzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f2 != -1.0f || zzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ);
                    zzsc zzscVar = this.zzr;
                    zzscVar.getClass();
                    zzscVar.zzp(bundle);
                    this.zzv = zzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzO = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzN = false;
        this.zzM = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzhw {
        if (this.zzT) {
            this.zzR = 1;
            this.zzS = 3;
        } else {
            zzaF();
            zzaB();
        }
    }

    private final void zzah() {
        try {
            zzsc zzscVar = this.zzr;
            zzdi.zzb(zzscVar);
            zzscVar.zzi();
        } finally {
            zzaG();
        }
    }

    private final void zzai(zzsf zzsfVar, MediaCrypto mediaCrypto) throws Exception {
        long j;
        zzrz zzrzVar;
        long j2;
        zzaf zzafVar = this.zzm;
        zzafVar.getClass();
        String str = zzsfVar.zza;
        float zzZ = zzet.zza < 23 ? -1.0f : zzZ(this.zzq, zzafVar, zzT());
        if (zzZ <= this.zze) {
            zzZ = -1.0f;
        }
        zzaE(zzafVar);
        zzh();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzrz zzaf = zzaf(zzsfVar, zzafVar, null, zzZ);
        if (zzet.zza >= 31) {
            zzsj.zza(zzaf, zzn());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            zzsc zzd = this.zzc.zzd(zzaf);
            this.zzr = zzd;
            zzsi.zza(zzd, new zzsm(this, null));
            Trace.endSection();
            zzh();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zzsfVar.zze(zzafVar)) {
                j = elapsedRealtime;
                zzrzVar = zzaf;
            } else {
                Object[] objArr = new Object[2];
                StringBuilder sb = new StringBuilder();
                sb.append("id=");
                sb.append(zzafVar.zza);
                sb.append(", mimeType=");
                sb.append(zzafVar.zzm);
                if (zzafVar.zzl != null) {
                    sb.append(", container=");
                    sb.append(zzafVar.zzl);
                }
                if (zzafVar.zzi != -1) {
                    sb.append(", bitrate=");
                    sb.append(zzafVar.zzi);
                }
                if (zzafVar.zzj != null) {
                    sb.append(", codecs=");
                    sb.append(zzafVar.zzj);
                }
                if (zzafVar.zzp != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i = 0;
                    while (true) {
                        zzy zzyVar = zzafVar.zzp;
                        zzrzVar = zzaf;
                        if (i >= zzyVar.zzb) {
                            break;
                        }
                        UUID uuid = zzyVar.zza(i).zza;
                        if (uuid.equals(zzk.zzb)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(zzk.zzc)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(zzk.zze)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(zzk.zzd)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(zzk.zza)) {
                            linkedHashSet.add("universal");
                        } else {
                            j2 = elapsedRealtime;
                            linkedHashSet.add("unknown (" + uuid.toString() + ")");
                            i++;
                            zzaf = zzrzVar;
                            elapsedRealtime = j2;
                        }
                        j2 = elapsedRealtime;
                        i++;
                        zzaf = zzrzVar;
                        elapsedRealtime = j2;
                    }
                    j = elapsedRealtime;
                    sb.append(", drm=[");
                    zzfum.zzb(sb, linkedHashSet, ",");
                    sb.append(']');
                } else {
                    j = elapsedRealtime;
                    zzrzVar = zzaf;
                }
                if (zzafVar.zzr != -1 && zzafVar.zzs != -1) {
                    sb.append(", res=");
                    sb.append(zzafVar.zzr);
                    sb.append("x");
                    sb.append(zzafVar.zzs);
                }
                zzo zzoVar = zzafVar.zzy;
                if (zzoVar != null && (zzoVar.zze() || zzoVar.zzf())) {
                    sb.append(", color=");
                    sb.append(zzafVar.zzy.zzd());
                }
                if (zzafVar.zzt != -1.0f) {
                    sb.append(", fps=");
                    sb.append(zzafVar.zzt);
                }
                if (zzafVar.zzz != -1) {
                    sb.append(", channels=");
                    sb.append(zzafVar.zzz);
                }
                if (zzafVar.zzA != -1) {
                    sb.append(", sample_rate=");
                    sb.append(zzafVar.zzA);
                }
                if (zzafVar.zzd != null) {
                    sb.append(", language=");
                    sb.append(zzafVar.zzd);
                }
                if (!zzafVar.zzc.isEmpty()) {
                    sb.append(", labels=[");
                    zzfum.zzb(sb, zzafVar.zzc, ",");
                    sb.append("]");
                }
                if (zzafVar.zze != 0) {
                    sb.append(", selectionFlags=[");
                    int i2 = zzafVar.zze;
                    ArrayList arrayList = new ArrayList();
                    if ((i2 & 1) != 0) {
                        arrayList.add("default");
                    }
                    if ((i2 & 2) != 0) {
                        arrayList.add("forced");
                    }
                    zzfum.zzb(sb, arrayList, ",");
                    sb.append("]");
                }
                if (zzafVar.zzf != 0) {
                    sb.append(", roleFlags=[");
                    int i3 = zzafVar.zzf;
                    ArrayList arrayList2 = new ArrayList();
                    if ((i3 & 1) != 0) {
                        arrayList2.add("main");
                    }
                    if ((i3 & 2) != 0) {
                        arrayList2.add("alt");
                    }
                    if ((i3 & 4) != 0) {
                        arrayList2.add("supplementary");
                    }
                    if ((i3 & 8) != 0) {
                        arrayList2.add("commentary");
                    }
                    if ((i3 & 16) != 0) {
                        arrayList2.add("dub");
                    }
                    if ((i3 & 32) != 0) {
                        arrayList2.add("emergency");
                    }
                    if ((i3 & 64) != 0) {
                        arrayList2.add("caption");
                    }
                    if ((i3 & 128) != 0) {
                        arrayList2.add("subtitle");
                    }
                    if ((i3 & 256) != 0) {
                        arrayList2.add("sign");
                    }
                    if ((i3 & 512) != 0) {
                        arrayList2.add("describes-video");
                    }
                    if ((i3 & 1024) != 0) {
                        arrayList2.add("describes-music");
                    }
                    if ((i3 & 2048) != 0) {
                        arrayList2.add("enhanced-intelligibility");
                    }
                    if ((i3 & 4096) != 0) {
                        arrayList2.add("transcribes-dialog");
                    }
                    if ((i3 & 8192) != 0) {
                        arrayList2.add("easy-read");
                    }
                    if ((i3 & 16384) != 0) {
                        arrayList2.add("trick-play");
                    }
                    zzfum.zzb(sb, arrayList2, ",");
                    sb.append("]");
                }
                objArr[0] = sb.toString();
                objArr[1] = str;
                zzea.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
            }
            this.zzy = zzsfVar;
            this.zzv = zzZ;
            this.zzs = zzafVar;
            this.zzz = (zzet.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzet.zzd.startsWith("SM-T585") || zzet.zzd.startsWith("SM-A510") || zzet.zzd.startsWith("SM-A520") || zzet.zzd.startsWith("SM-J700"))) ? 2 : (zzet.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzet.zzb) || "flounder_lte".equals(zzet.zzb) || "grouper".equals(zzet.zzb) || "tilapia".equals(zzet.zzb)))) ? 0 : 1;
            this.zzs.getClass();
            this.zzA = zzet.zza == 29 && "c2.android.aac.decoder".equals(str);
            this.zzB = zzet.zza <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.zzC = zzet.zza == 21 && "OMX.google.aac.decoder".equals(str);
            String str2 = zzsfVar.zza;
            this.zzF = (zzet.zza <= 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (zzet.zza <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(zzet.zzc) && "AFTS".equals(zzet.zzd) && zzsfVar.zzf);
            this.zzr.getClass();
            if (zzcV() == 2) {
                zzh();
                this.zzG = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzal(str, zzrzVar, elapsedRealtime2, elapsedRealtime2 - j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    protected void zzC() {
        try {
            zzad();
            zzaF();
        } finally {
            this.zzaf = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzF(zzaf[] zzafVarArr, long j, long j2, zzui zzuiVar) throws zzhw {
        if (this.zzab.zzd == -9223372036854775807L) {
            zzaQ(new zzsn(-9223372036854775807L, j, j2));
            return;
        }
        if (this.zzk.isEmpty()) {
            long j3 = this.zzW;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzac;
                if (j4 != -9223372036854775807L) {
                }
            }
            zzaQ(new zzsn(-9223372036854775807L, j, j2));
            if (this.zzab.zzd != -9223372036854775807L) {
                zzap();
                return;
            }
            return;
        }
        this.zzk.add(new zzsn(this.zzW, j, j2));
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzle
    public void zzM(float f, float f2) throws zzhw {
        this.zzq = f2;
        zzaX(this.zzs);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzle
    public void zzV(long r22, long r24) throws com.google.android.gms.internal.ads.zzhw {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzso.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public boolean zzW() {
        return this.zzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzle
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaU()) {
            return true;
        }
        if (this.zzG == -9223372036854775807L) {
            return false;
        }
        zzh();
        return SystemClock.elapsedRealtime() < this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final int zzY(zzaf zzafVar) throws zzhw {
        try {
            return zzaa(this.zzd, zzafVar);
        } catch (zzsw e) {
            throw zzi(e, zzafVar, false, 4002);
        }
    }

    protected float zzZ(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        throw null;
    }

    protected final zzsf zzaA() {
        return this.zzy;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed A[Catch: zzsk -> 0x010c, TryCatch #1 {zzsk -> 0x010c, blocks: (B:25:0x0053, B:27:0x0057, B:28:0x005c, B:30:0x0061, B:79:0x0066, B:81:0x007c, B:82:0x0087, B:33:0x0094, B:35:0x009c, B:37:0x00a1, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:56:0x00d3, B:58:0x00ed, B:59:0x00f6, B:64:0x00fd, B:65:0x00ff, B:66:0x00f0, B:74:0x0100, B:76:0x0103, B:77:0x010b, B:85:0x008b, B:86:0x0093, B:45:0x00ba, B:53:0x00c3, B:68:0x00d1), top: B:24:0x0053, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0 A[Catch: zzsk -> 0x010c, TryCatch #1 {zzsk -> 0x010c, blocks: (B:25:0x0053, B:27:0x0057, B:28:0x005c, B:30:0x0061, B:79:0x0066, B:81:0x007c, B:82:0x0087, B:33:0x0094, B:35:0x009c, B:37:0x00a1, B:38:0x00a7, B:40:0x00ab, B:42:0x00b4, B:56:0x00d3, B:58:0x00ed, B:59:0x00f6, B:64:0x00fd, B:65:0x00ff, B:66:0x00f0, B:74:0x0100, B:76:0x0103, B:77:0x010b, B:85:0x008b, B:86:0x0093, B:45:0x00ba, B:53:0x00c3, B:68:0x00d1), top: B:24:0x0053, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzaB() throws zzhw {
        zzaf zzafVar;
        zzsk zzskVar;
        if (this.zzr != null || this.zzM || (zzafVar = this.zzm) == null) {
            return;
        }
        if (zzaL(zzafVar)) {
            zzad();
            String str = zzafVar.zzm;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzn(32);
            } else {
                this.zzi.zzn(1);
            }
            this.zzM = true;
            return;
        }
        zzrj zzrjVar = this.zzaf;
        this.zzae = zzrjVar;
        if (zzrjVar != null) {
            zzdi.zzf(true);
            zzrj zzrjVar2 = this.zzae;
            boolean z = zzrk.zza;
            zzrjVar2.zza();
        }
        try {
            if (this.zzae != null) {
                zzdi.zzb(zzafVar.zzm);
            }
            zzaf zzafVar2 = this.zzm;
            zzafVar2.getClass();
            if (this.zzw == null) {
                try {
                    List zzag = zzag(this.zzd, zzafVar2, false);
                    zzag.isEmpty();
                    this.zzw = new ArrayDeque();
                    if (!zzag.isEmpty()) {
                        this.zzw.add((zzsf) zzag.get(0));
                    }
                    this.zzx = null;
                } catch (zzsw e) {
                    throw new zzsk(zzafVar2, (Throwable) e, false, -49998);
                }
            }
            if (this.zzw.isEmpty()) {
                throw new zzsk(zzafVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzw;
            arrayDeque.getClass();
            zzsf zzsfVar = (zzsf) arrayDeque.peekFirst();
            while (this.zzr == null) {
                zzsf zzsfVar2 = (zzsf) arrayDeque.peekFirst();
                zzsfVar2.getClass();
                if (!zzaM(zzsfVar2)) {
                    return;
                }
                try {
                    zzai(zzsfVar2, null);
                } catch (Exception e2) {
                    if (zzsfVar2 != zzsfVar) {
                        throw e2;
                    }
                    try {
                        zzea.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        zzai(zzsfVar2, null);
                    } catch (Exception e3) {
                        zzea.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsfVar2.zza), e3);
                        arrayDeque.removeFirst();
                        zzsk zzskVar2 = new zzsk(zzafVar2, (Throwable) e3, false, zzsfVar2);
                        zzak(zzskVar2);
                        zzskVar = this.zzx;
                        if (zzskVar != null) {
                        }
                        if (!arrayDeque.isEmpty()) {
                        }
                    }
                    zzea.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zzsfVar2.zza), e3);
                    arrayDeque.removeFirst();
                    zzsk zzskVar22 = new zzsk(zzafVar2, (Throwable) e3, false, zzsfVar2);
                    zzak(zzskVar22);
                    zzskVar = this.zzx;
                    if (zzskVar != null) {
                        this.zzx = zzskVar22;
                    } else {
                        this.zzx = zzsk.zza(zzskVar, zzskVar22);
                    }
                    if (!arrayDeque.isEmpty()) {
                        throw this.zzx;
                    }
                }
            }
            this.zzw = null;
        } catch (zzsk e4) {
            throw zzi(e4, zzafVar, false, 4001);
        }
    }

    protected void zzaC(long j) {
        this.zzac = j;
        while (!this.zzk.isEmpty() && j >= ((zzsn) this.zzk.peek()).zzb) {
            zzsn zzsnVar = (zzsn) this.zzk.poll();
            zzsnVar.getClass();
            zzaQ(zzsnVar);
            zzap();
        }
    }

    protected void zzaD(zzhd zzhdVar) throws zzhw {
    }

    protected void zzaE(zzaf zzafVar) throws zzhw {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaF() {
        try {
            zzsc zzscVar = this.zzr;
            if (zzscVar != null) {
                zzscVar.zzl();
                this.zza.zzb++;
                zzsf zzsfVar = this.zzy;
                zzsfVar.getClass();
                zzam(zzsfVar.zza);
            }
        } finally {
            this.zzr = null;
            this.zzp = null;
            this.zzae = null;
            zzaH();
        }
    }

    protected void zzaG() {
        zzaO();
        zzaP();
        this.zzG = -9223372036854775807L;
        this.zzU = false;
        this.zzT = false;
        this.zzD = false;
        this.zzE = false;
        this.zzK = false;
        this.zzL = false;
        this.zzW = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzR = 0;
        this.zzS = 0;
        this.zzQ = this.zzP ? 1 : 0;
    }

    protected final void zzaH() {
        zzaG();
        this.zzw = null;
        this.zzy = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = false;
        this.zzV = false;
        this.zzv = -1.0f;
        this.zzz = 0;
        this.zzA = false;
        this.zzB = false;
        this.zzC = false;
        this.zzF = false;
        this.zzP = false;
        this.zzQ = 0;
    }

    protected final boolean zzaI() throws zzhw {
        boolean zzaJ = zzaJ();
        if (zzaJ) {
            zzaB();
        }
        return zzaJ;
    }

    protected final boolean zzaJ() {
        if (this.zzr == null) {
            return false;
        }
        int i = this.zzS;
        if (i == 3 || ((this.zzA && !this.zzV) || (this.zzB && this.zzU))) {
            zzaF();
            return true;
        }
        if (i == 2) {
            zzdi.zzf(zzet.zza >= 23);
            if (zzet.zza >= 23) {
                try {
                    zzaR();
                } catch (zzhw e) {
                    zzea.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaF();
                    return true;
                }
            }
        }
        zzah();
        return false;
    }

    protected final boolean zzaK() {
        return this.zzM;
    }

    protected final boolean zzaL(zzaf zzafVar) {
        return this.zzaf == null && zzas(zzafVar);
    }

    protected boolean zzaM(zzsf zzsfVar) {
        return true;
    }

    protected abstract int zzaa(zzsq zzsqVar, zzaf zzafVar) throws zzsw;

    protected zzho zzab(zzsf zzsfVar, zzaf zzafVar, zzaf zzafVar2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (zzaS() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b0, code lost:
    
        if (zzaS() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c4, code lost:
    
        if (zzaS() == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zzho zzac(zzjz zzjzVar) throws zzhw {
        int i;
        boolean z = true;
        this.zzaa = true;
        zzaf zzafVar = zzjzVar.zza;
        zzafVar.getClass();
        String str = zzafVar.zzm;
        if (str == null) {
            throw zzi(new IllegalArgumentException("Sample MIME type is null."), zzafVar, false, 4005);
        }
        if (Objects.equals(str, "video/av01") && !zzafVar.zzo.isEmpty()) {
            zzad zzb2 = zzafVar.zzb();
            zzb2.zzL(null);
            zzafVar = zzb2.zzad();
        }
        zzaf zzafVar2 = zzafVar;
        this.zzaf = zzjzVar.zzb;
        this.zzm = zzafVar2;
        if (this.zzM) {
            this.zzO = true;
            return null;
        }
        zzsc zzscVar = this.zzr;
        if (zzscVar == null) {
            this.zzw = null;
            zzaB();
            return null;
        }
        zzsf zzsfVar = this.zzy;
        zzsfVar.getClass();
        zzaf zzafVar3 = this.zzs;
        zzafVar3.getClass();
        zzrj zzrjVar = this.zzae;
        zzrj zzrjVar2 = this.zzaf;
        if (zzrjVar != zzrjVar2) {
            zzae();
            return new zzho(zzsfVar.zza, zzafVar3, zzafVar2, 0, 128);
        }
        boolean z2 = zzrjVar2 != zzrjVar;
        zzdi.zzf(!z2 || zzet.zza >= 23);
        zzho zzab = zzab(zzsfVar, zzafVar3, zzafVar2);
        int i2 = zzab.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 == 1) {
                if (zzaX(zzafVar2)) {
                    this.zzs = zzafVar2;
                    if (!z2) {
                        if (this.zzT) {
                            this.zzR = 1;
                            if (this.zzB) {
                                this.zzS = 3;
                            } else {
                                this.zzS = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (zzaX(zzafVar2)) {
                    this.zzs = zzafVar2;
                    if (z2) {
                    }
                }
                i = 16;
            } else {
                if (zzaX(zzafVar2)) {
                    this.zzP = true;
                    this.zzQ = 1;
                    int i3 = this.zzz;
                    if (i3 != 2 && (i3 != 1 || zzafVar2.zzr != zzafVar3.zzr || zzafVar2.zzs != zzafVar3.zzs)) {
                        z = false;
                    }
                    this.zzD = z;
                    this.zzs = zzafVar2;
                    if (z2) {
                    }
                }
                i = 16;
            }
            return (zzab.zzd != 0 || (this.zzr == zzscVar && this.zzS != 3)) ? zzab : new zzho(zzsfVar.zza, zzafVar3, zzafVar2, 0, i);
        }
        zzae();
        i = 0;
        if (zzab.zzd != 0) {
        }
    }

    protected abstract zzrz zzaf(zzsf zzsfVar, zzaf zzafVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzag(zzsq zzsqVar, zzaf zzafVar, boolean z) throws zzsw;

    protected void zzaj(zzhd zzhdVar) throws zzhw {
        throw null;
    }

    protected void zzak(Exception exc) {
        throw null;
    }

    protected void zzal(String str, zzrz zzrzVar, long j, long j2) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(zzaf zzafVar, MediaFormat mediaFormat) throws zzhw {
        throw null;
    }

    protected void zzap() {
    }

    protected void zzaq() throws zzhw {
    }

    protected abstract boolean zzar(long j, long j2, zzsc zzscVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzhw;

    protected boolean zzas(zzaf zzafVar) {
        return false;
    }

    protected int zzat(zzhd zzhdVar) {
        return 0;
    }

    protected final long zzau() {
        return this.zzab.zzd;
    }

    protected final long zzav() {
        return this.zzab.zzc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzld zzax() {
        return this.zzo;
    }

    protected final zzsc zzay() {
        return this.zzr;
    }

    protected zzse zzaz(Throwable th, zzsf zzsfVar) {
        return new zzse(th, zzsfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzlh
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzkz
    public void zzt(int i, Object obj) throws zzhw {
        if (i == 11) {
            this.zzo = (zzld) obj;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    protected void zzw() {
        this.zzm = null;
        zzaQ(zzsn.zza);
        this.zzk.clear();
        zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    protected void zzx(boolean z, boolean z2) throws zzhw {
        this.zza = new zzhn();
    }

    @Override // com.google.android.gms.internal.ads.zzhm
    protected void zzz(long j, boolean z) throws zzhw {
        this.zzY = false;
        this.zzZ = false;
        if (this.zzM) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzN = false;
            this.zzl.zzb();
        } else {
            zzaI();
        }
        zzeq zzeqVar = this.zzab.zze;
        if (zzeqVar.zza() > 0) {
            this.zzaa = true;
        }
        zzeqVar.zze();
        this.zzk.clear();
    }

    private final void zzao() throws zzhw {
        int i = this.zzS;
        if (i == 1) {
            zzah();
            return;
        }
        if (i == 2) {
            zzah();
            zzaR();
        } else if (i != 3) {
            this.zzZ = true;
            zzaq();
        } else {
            zzaF();
            zzaB();
        }
    }
}

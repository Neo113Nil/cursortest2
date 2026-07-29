package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzavq extends zzarc {
    private static final byte[] zzb = zzazn.zzp("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    protected zzatm zza;
    private final zzavs zzc;
    private final zzatn zzd;
    private final zzatn zze;
    private final zzart zzf;
    private final List zzg;
    private final MediaCodec.BufferInfo zzh;
    private zzars zzi;
    private MediaCodec zzj;
    private zzavo zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ByteBuffer[] zzu;
    private ByteBuffer[] zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    public zzavq(int i, zzavs zzavsVar, zzats zzatsVar, boolean z) {
        super(i);
        zzayy.zze(zzazn.zza >= 16);
        this.zzc = zzavsVar;
        this.zzd = new zzatn(0);
        this.zze = new zzatn(0);
        this.zzf = new zzart();
        this.zzg = new ArrayList();
        this.zzh = new MediaCodec.BufferInfo();
        this.zzB = 0;
        this.zzC = 0;
    }

    private final void zzI() throws zzare {
        if (this.zzC == 2) {
            zzY();
            zzW();
        } else {
            this.zzG = true;
            zzS();
        }
    }

    private final boolean zzJ() throws zzare {
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec == null || this.zzC == 2 || this.zzF) {
            return false;
        }
        if (this.zzx < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.zzx = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            zzatn zzatnVar = this.zzd;
            zzatnVar.zzb = this.zzu[dequeueInputBuffer];
            zzatnVar.zzb();
        }
        if (this.zzC == 1) {
            if (!this.zzo) {
                this.zzE = true;
                this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                this.zzx = -1;
            }
            this.zzC = 2;
            return false;
        }
        if (this.zzs) {
            this.zzs = false;
            ByteBuffer byteBuffer = this.zzd.zzb;
            byte[] bArr = zzb;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.zzj;
            int i = this.zzx;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0L, 0);
            this.zzx = -1;
            this.zzD = true;
            return true;
        }
        if (this.zzB == 1) {
            for (int i2 = 0; i2 < this.zzi.zzh.size(); i2++) {
                this.zzd.zzb.put((byte[]) this.zzi.zzh.get(i2));
            }
            this.zzB = 2;
        }
        int position = this.zzd.zzb.position();
        int zzd = zzd(this.zzf, this.zzd, false);
        if (zzd == -3) {
            return false;
        }
        if (zzd == -5) {
            if (this.zzB == 2) {
                this.zzd.zzb();
                this.zzB = 1;
            }
            zzQ(this.zzf.zza);
            return true;
        }
        zzatn zzatnVar2 = this.zzd;
        if (zzatnVar2.zzf()) {
            if (this.zzB == 2) {
                zzatnVar2.zzb();
                this.zzB = 1;
            }
            this.zzF = true;
            if (!this.zzD) {
                zzI();
                return false;
            }
            try {
                if (!this.zzo) {
                    this.zzE = true;
                    this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                    this.zzx = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw zzare.zza(e, zza());
            }
        }
        if (this.zzH && !zzatnVar2.zzg()) {
            zzatnVar2.zzb();
            if (this.zzB == 2) {
                this.zzB = 1;
            }
            return true;
        }
        this.zzH = false;
        boolean zzi = zzatnVar2.zzi();
        if (this.zzl && !zzi) {
            ByteBuffer byteBuffer2 = zzatnVar2.zzb;
            byte[] bArr2 = zzaze.zza;
            int position2 = byteBuffer2.position();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                if (i5 >= position2) {
                    byteBuffer2.clear();
                    break;
                }
                int i6 = byteBuffer2.get(i3) & UByte.MAX_VALUE;
                if (i4 == 3) {
                    if (i6 == 1) {
                        if ((byteBuffer2.get(i5) & 31) == 7) {
                            ByteBuffer duplicate = byteBuffer2.duplicate();
                            duplicate.position(i3 - 3);
                            duplicate.limit(position2);
                            byteBuffer2.position(0);
                            byteBuffer2.put(duplicate);
                            break;
                        }
                        i6 = 1;
                    }
                } else if (i6 == 0) {
                    i4++;
                }
                if (i6 != 0) {
                    i4 = 0;
                }
                i3 = i5;
            }
            if (this.zzd.zzb.position() == 0) {
                return true;
            }
            this.zzl = false;
        }
        try {
            zzatn zzatnVar3 = this.zzd;
            long j = zzatnVar3.zzc;
            if (zzatnVar3.zze()) {
                this.zzg.add(Long.valueOf(j));
            }
            this.zzd.zzb.flip();
            zzX(this.zzd);
            if (zzi) {
                MediaCodec.CryptoInfo zza = this.zzd.zza.zza();
                if (position != 0) {
                    if (zza.numBytesOfClearData == null) {
                        zza.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = zza.numBytesOfClearData;
                    iArr[0] = iArr[0] + position;
                }
                this.zzj.queueSecureInputBuffer(this.zzx, 0, zza, j, 0);
            } else {
                this.zzj.queueInputBuffer(this.zzx, 0, this.zzd.zzb.limit(), j, 0);
            }
            this.zzx = -1;
            this.zzD = true;
            this.zzB = 0;
            this.zza.zzc++;
            return true;
        } catch (MediaCodec.CryptoException e2) {
            throw zzare.zza(e2, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzD(long j, long j2) throws zzare {
        boolean zzT;
        int dequeueOutputBuffer;
        boolean z;
        if (this.zzG) {
            zzS();
            return;
        }
        if (this.zzi == null) {
            this.zze.zzb();
            int zzd = zzd(this.zzf, this.zze, true);
            if (zzd != -5) {
                if (zzd == -4) {
                    zzayy.zze(this.zze.zzf());
                    this.zzF = true;
                    zzI();
                    return;
                }
                return;
            }
            zzQ(this.zzf.zza);
        }
        zzW();
        if (this.zzj != null) {
            zzazl.zza("drainAndFeed");
            while (true) {
                if (this.zzy < 0) {
                    if (this.zzq && this.zzE) {
                        try {
                            dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                            this.zzy = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            zzI();
                            if (this.zzG) {
                                zzY();
                            }
                        }
                    } else {
                        dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                        this.zzy = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.zzt) {
                            this.zzt = false;
                            this.zzj.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.zzy = -1;
                        } else {
                            if ((this.zzh.flags & 4) != 0) {
                                zzI();
                                this.zzy = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.zzv[this.zzy];
                            if (byteBuffer != null) {
                                byteBuffer.position(this.zzh.offset);
                                byteBuffer.limit(this.zzh.offset + this.zzh.size);
                            }
                            long j3 = this.zzh.presentationTimeUs;
                            int size = this.zzg.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    z = false;
                                    break;
                                } else {
                                    if (((Long) this.zzg.get(i)).longValue() == j3) {
                                        this.zzg.remove(i);
                                        z = true;
                                        break;
                                    }
                                    i++;
                                }
                            }
                            this.zzz = z;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.zzj.getOutputFormat();
                        if (this.zzn && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.zzt = true;
                        } else {
                            if (this.zzr) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            zzR(this.zzj, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.zzv = this.zzj.getOutputBuffers();
                    } else if (this.zzo && (this.zzF || this.zzC == 2)) {
                        zzI();
                    }
                }
                if (this.zzq && this.zzE) {
                    try {
                        MediaCodec mediaCodec = this.zzj;
                        ByteBuffer[] byteBufferArr = this.zzv;
                        int i2 = this.zzy;
                        zzT = zzT(j, j2, mediaCodec, byteBufferArr[i2], i2, this.zzh.flags, this.zzh.presentationTimeUs, this.zzz);
                    } catch (IllegalStateException unused2) {
                        zzI();
                        if (this.zzG) {
                            zzY();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.zzj;
                    ByteBuffer[] byteBufferArr2 = this.zzv;
                    int i3 = this.zzy;
                    zzT = zzT(j, j2, mediaCodec2, byteBufferArr2[i3], i3, this.zzh.flags, this.zzh.presentationTimeUs, this.zzz);
                }
                if (!zzT) {
                    break;
                }
                long j4 = this.zzh.presentationTimeUs;
                this.zzy = -1;
            }
            while (zzJ()) {
            }
            zzazl.zzb();
        } else {
            zzx(j);
            this.zze.zzb();
            int zzd2 = zzd(this.zzf, this.zze, false);
            if (zzd2 == -5) {
                zzQ(this.zzf.zza);
            } else if (zzd2 == -4) {
                zzayy.zze(this.zze.zzf());
                this.zzF = true;
                zzI();
            }
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public boolean zzE() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public boolean zzF() {
        if (this.zzi != null) {
            if (zzC() || this.zzy >= 0) {
                return true;
            }
            if (this.zzw != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzw) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final int zzG(zzars zzarsVar) throws zzare {
        try {
            return zzH(this.zzc, zzarsVar);
        } catch (zzavv e) {
            throw zzare.zza(e, zza());
        }
    }

    protected abstract int zzH(zzavs zzavsVar, zzars zzarsVar) throws zzavv;

    protected zzavo zzM(zzavs zzavsVar, zzars zzarsVar, boolean z) throws zzavv {
        return zzawa.zzc(zzarsVar.zzf, false);
    }

    protected abstract void zzO(zzavo zzavoVar, MediaCodec mediaCodec, zzars zzarsVar, MediaCrypto mediaCrypto) throws zzavv;

    protected void zzP(String str, long j, long j2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r6.zzk == r0.zzk) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzQ(zzars zzarsVar) throws zzare {
        zzars zzarsVar2 = this.zzi;
        this.zzi = zzarsVar;
        if (!zzazn.zzo(zzarsVar.zzi, zzarsVar2 == null ? null : zzarsVar2.zzi) && this.zzi.zzi != null) {
            throw zzare.zza(new IllegalStateException("Media requires a DrmSessionManager"), zza());
        }
        MediaCodec mediaCodec = this.zzj;
        boolean z = true;
        if (mediaCodec == null || !zzZ(mediaCodec, this.zzk.zzb, zzarsVar2, this.zzi)) {
            if (this.zzD) {
                this.zzC = 1;
                return;
            } else {
                zzY();
                zzW();
                return;
            }
        }
        this.zzA = true;
        this.zzB = 1;
        if (this.zzn) {
            zzars zzarsVar3 = this.zzi;
            if (zzarsVar3.zzj == zzarsVar2.zzj) {
            }
        }
        z = false;
        this.zzs = z;
    }

    protected void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzare {
        throw null;
    }

    protected void zzS() throws zzare {
    }

    protected abstract boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzare;

    protected final MediaCodec zzU() {
        return this.zzj;
    }

    protected final zzavo zzV() {
        return this.zzk;
    }

    protected final void zzW() throws zzare {
        zzars zzarsVar;
        if (this.zzj != null || (zzarsVar = this.zzi) == null) {
            return;
        }
        zzavo zzavoVar = this.zzk;
        if (zzavoVar == null) {
            try {
                zzavoVar = zzM(this.zzc, zzarsVar, false);
                this.zzk = zzavoVar;
                if (zzavoVar == null) {
                    throw zzare.zza(new zzavp(this.zzi, (Throwable) null, false, -49999), zza());
                }
            } catch (zzavv e) {
                throw zzare.zza(new zzavp(this.zzi, (Throwable) e, false, -49998), zza());
            }
        }
        if (zzaa(zzavoVar)) {
            String str = this.zzk.zza;
            this.zzl = zzazn.zza < 21 && this.zzi.zzh.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzm = zzazn.zza < 18 || (zzazn.zza == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (zzazn.zza == 19 && zzazn.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.zzn = zzazn.zza < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzazn.zzb) || "flounder_lte".equals(zzazn.zzb) || "grouper".equals(zzazn.zzb) || "tilapia".equals(zzazn.zzb));
            this.zzo = zzazn.zza <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
            this.zzp = (zzazn.zza <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (zzazn.zza <= 19 && "hb2000".equals(zzazn.zzb) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
            this.zzq = zzazn.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzr = zzazn.zza <= 18 && this.zzi.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzazl.zza("createCodec:" + str);
                this.zzj = MediaCodec.createByCodecName(str);
                zzazl.zzb();
                zzazl.zza("configureCodec");
                zzO(this.zzk, this.zzj, this.zzi, null);
                zzazl.zzb();
                zzazl.zza("startCodec");
                this.zzj.start();
                zzazl.zzb();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                zzP(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.zzu = this.zzj.getInputBuffers();
                this.zzv = this.zzj.getOutputBuffers();
                this.zzw = zzb() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.zzx = -1;
                this.zzy = -1;
                this.zzH = true;
                this.zza.zza++;
            } catch (Exception e2) {
                throw zzare.zza(new zzavp(this.zzi, (Throwable) e2, false, str), zza());
            }
        }
    }

    protected void zzX(zzatn zzatnVar) {
    }

    protected void zzY() {
        this.zzw = -9223372036854775807L;
        this.zzx = -1;
        this.zzy = -1;
        this.zzz = false;
        this.zzg.clear();
        this.zzu = null;
        this.zzv = null;
        this.zzk = null;
        this.zzA = false;
        this.zzD = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = false;
        this.zzp = false;
        this.zzr = false;
        this.zzs = false;
        this.zzt = false;
        this.zzE = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzd.zzb = null;
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec != null) {
            this.zza.zzb++;
            try {
                mediaCodec.stop();
                try {
                    this.zzj.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.zzj.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    protected boolean zzZ(MediaCodec mediaCodec, boolean z, zzars zzarsVar, zzars zzarsVar2) {
        return false;
    }

    protected boolean zzaa(zzavo zzavoVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzarc, com.google.android.gms.internal.ads.zzary
    public final int zze() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    protected void zzo(boolean z) throws zzare {
        this.zza = new zzatm();
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    protected void zzp(long j, boolean z) throws zzare {
        this.zzF = false;
        this.zzG = false;
        if (this.zzj != null) {
            this.zzw = -9223372036854775807L;
            this.zzx = -1;
            this.zzy = -1;
            this.zzH = true;
            this.zzz = false;
            this.zzg.clear();
            this.zzs = false;
            this.zzt = false;
            if (this.zzm || (this.zzp && this.zzE)) {
                zzY();
                zzW();
            } else if (this.zzC != 0) {
                zzY();
                zzW();
            } else {
                this.zzj.flush();
                this.zzD = false;
            }
            if (!this.zzA || this.zzi == null) {
                return;
            }
            this.zzB = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    protected void zzn() {
        this.zzi = null;
        zzY();
    }
}

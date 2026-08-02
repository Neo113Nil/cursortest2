package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzawu extends zzasg {
    private static final byte[] zzb = zzbar.zzp("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    protected zzauq zza;
    private final zzaww zzc;
    private final zzaur zzd;
    private final zzaur zze;
    private final zzasx zzf;
    private final List zzg;
    private final MediaCodec.BufferInfo zzh;
    private zzasw zzi;
    private MediaCodec zzj;
    private zzaws zzk;
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

    public zzawu(int i, zzaww zzawwVar, zzauw zzauwVar, boolean z) {
        super(i);
        zzbac.zze(zzbar.zza >= 16);
        this.zzc = zzawwVar;
        this.zzd = new zzaur(0);
        this.zze = new zzaur(0);
        this.zzf = new zzasx();
        this.zzg = new ArrayList();
        this.zzh = new MediaCodec.BufferInfo();
        this.zzB = 0;
        this.zzC = 0;
    }

    private final void zzI() throws zzasi {
        if (this.zzC == 2) {
            zzY();
            zzW();
        } else {
            this.zzG = true;
            zzS();
        }
    }

    private final boolean zzJ() throws zzasi {
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
            zzaur zzaurVar = this.zzd;
            zzaurVar.zzb = this.zzu[dequeueInputBuffer];
            zzaurVar.zzb();
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
        zzaur zzaurVar2 = this.zzd;
        if (zzaurVar2.zzf()) {
            if (this.zzB == 2) {
                zzaurVar2.zzb();
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
                throw zzasi.zza(e, zza());
            }
        }
        if (this.zzH && !zzaurVar2.zzg()) {
            zzaurVar2.zzb();
            if (this.zzB == 2) {
                this.zzB = 1;
            }
            return true;
        }
        this.zzH = false;
        boolean zzi = zzaurVar2.zzi();
        if (this.zzl && !zzi) {
            ByteBuffer byteBuffer2 = zzaurVar2.zzb;
            byte[] bArr2 = zzbai.zza;
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
            zzaur zzaurVar3 = this.zzd;
            long j = zzaurVar3.zzc;
            if (zzaurVar3.zze()) {
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
            throw zzasi.zza(e2, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzD(long j, long j2) throws zzasi {
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
                    zzbac.zze(this.zze.zzf());
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
            zzbap.zza("drainAndFeed");
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
            zzbap.zzb();
        } else {
            zzx(j);
            this.zze.zzb();
            int zzd2 = zzd(this.zzf, this.zze, false);
            if (zzd2 == -5) {
                zzQ(this.zzf.zza);
            } else if (zzd2 == -4) {
                zzbac.zze(this.zze.zzf());
                this.zzF = true;
                zzI();
            }
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public boolean zzE() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
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

    @Override // com.google.android.gms.internal.ads.zzatc
    public final int zzG(zzasw zzaswVar) throws zzasi {
        try {
            return zzH(this.zzc, zzaswVar);
        } catch (zzawz e) {
            throw zzasi.zza(e, zza());
        }
    }

    protected abstract int zzH(zzaww zzawwVar, zzasw zzaswVar) throws zzawz;

    protected zzaws zzM(zzaww zzawwVar, zzasw zzaswVar, boolean z) throws zzawz {
        return zzaxe.zzc(zzaswVar.zzf, false);
    }

    protected abstract void zzO(zzaws zzawsVar, MediaCodec mediaCodec, zzasw zzaswVar, MediaCrypto mediaCrypto) throws zzawz;

    protected void zzP(String str, long j, long j2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r6.zzk == r0.zzk) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzQ(zzasw zzaswVar) throws zzasi {
        zzasw zzaswVar2 = this.zzi;
        this.zzi = zzaswVar;
        if (!zzbar.zzo(zzaswVar.zzi, zzaswVar2 == null ? null : zzaswVar2.zzi) && this.zzi.zzi != null) {
            throw zzasi.zza(new IllegalStateException("Media requires a DrmSessionManager"), zza());
        }
        MediaCodec mediaCodec = this.zzj;
        boolean z = true;
        if (mediaCodec == null || !zzZ(mediaCodec, this.zzk.zzb, zzaswVar2, this.zzi)) {
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
            zzasw zzaswVar3 = this.zzi;
            if (zzaswVar3.zzj == zzaswVar2.zzj) {
            }
        }
        z = false;
        this.zzs = z;
    }

    protected void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzasi {
        throw null;
    }

    protected void zzS() throws zzasi {
    }

    protected abstract boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzasi;

    protected final MediaCodec zzU() {
        return this.zzj;
    }

    protected final zzaws zzV() {
        return this.zzk;
    }

    protected final void zzW() throws zzasi {
        zzasw zzaswVar;
        if (this.zzj != null || (zzaswVar = this.zzi) == null) {
            return;
        }
        zzaws zzawsVar = this.zzk;
        if (zzawsVar == null) {
            try {
                zzawsVar = zzM(this.zzc, zzaswVar, false);
                this.zzk = zzawsVar;
                if (zzawsVar == null) {
                    throw zzasi.zza(new zzawt(this.zzi, (Throwable) null, false, -49999), zza());
                }
            } catch (zzawz e) {
                throw zzasi.zza(new zzawt(this.zzi, (Throwable) e, false, -49998), zza());
            }
        }
        if (zzaa(zzawsVar)) {
            String str = this.zzk.zza;
            this.zzl = zzbar.zza < 21 && this.zzi.zzh.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.zzm = zzbar.zza < 18 || (zzbar.zza == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (zzbar.zza == 19 && zzbar.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.zzn = zzbar.zza < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzbar.zzb) || "flounder_lte".equals(zzbar.zzb) || "grouper".equals(zzbar.zzb) || "tilapia".equals(zzbar.zzb));
            this.zzo = zzbar.zza <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
            this.zzp = (zzbar.zza <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (zzbar.zza <= 19 && "hb2000".equals(zzbar.zzb) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
            this.zzq = zzbar.zza == 21 && "OMX.google.aac.decoder".equals(str);
            this.zzr = zzbar.zza <= 18 && this.zzi.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzbap.zza("createCodec:" + str);
                this.zzj = MediaCodec.createByCodecName(str);
                zzbap.zzb();
                zzbap.zza("configureCodec");
                zzO(this.zzk, this.zzj, this.zzi, null);
                zzbap.zzb();
                zzbap.zza("startCodec");
                this.zzj.start();
                zzbap.zzb();
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
                throw zzasi.zza(new zzawt(this.zzi, (Throwable) e2, false, str), zza());
            }
        }
    }

    protected void zzX(zzaur zzaurVar) {
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

    protected boolean zzZ(MediaCodec mediaCodec, boolean z, zzasw zzaswVar, zzasw zzaswVar2) {
        return false;
    }

    protected boolean zzaa(zzaws zzawsVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzasg, com.google.android.gms.internal.ads.zzatc
    public final int zze() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzasg
    protected void zzo(boolean z) throws zzasi {
        this.zza = new zzauq();
    }

    @Override // com.google.android.gms.internal.ads.zzasg
    protected void zzp(long j, boolean z) throws zzasi {
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

    @Override // com.google.android.gms.internal.ads.zzasg
    protected void zzn() {
        this.zzi = null;
        zzY();
    }
}

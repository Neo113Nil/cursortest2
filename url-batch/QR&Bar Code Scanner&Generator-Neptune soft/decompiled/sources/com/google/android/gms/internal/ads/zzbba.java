package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbba extends zzawu {
    private int zzA;
    private final Context zzb;
    private final zzbbc zzc;
    private final zzbbk zzd;
    private final boolean zze;
    private final long[] zzf;
    private zzasw[] zzg;
    private zzbaz zzh;
    private Surface zzi;
    private Surface zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private float zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbba(Context context, zzaww zzawwVar, long j, Handler handler, zzbbl zzbblVar, int i) {
        super(2, zzawwVar, null, false);
        boolean z = false;
        this.zzb = context.getApplicationContext();
        this.zzc = new zzbbc(context);
        this.zzd = new zzbbk(handler, zzbblVar);
        if (zzbar.zza <= 22 && "foster".equals(zzbar.zzb) && "NVIDIA".equals(zzbar.zzc)) {
            z = true;
        }
        this.zze = z;
        this.zzf = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        zzab();
    }

    private static int zzN(zzasw zzaswVar) {
        int i = zzaswVar.zzm;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private final void zzab() {
        this.zzv = -1;
        this.zzw = -1;
        this.zzy = -1.0f;
        this.zzx = -1;
    }

    private final void zzac() {
        if (this.zzn > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzd.zzd(this.zzn, elapsedRealtime - this.zzm);
            this.zzn = 0;
            this.zzm = elapsedRealtime;
        }
    }

    private final void zzad() {
        int i = this.zzv;
        int i2 = this.zzr;
        if (i == i2 && this.zzw == this.zzs && this.zzx == this.zzt && this.zzy == this.zzu) {
            return;
        }
        this.zzd.zzh(i2, this.zzs, this.zzt, this.zzu);
        this.zzv = this.zzr;
        this.zzw = this.zzs;
        this.zzx = this.zzt;
        this.zzy = this.zzu;
    }

    private final void zzae() {
        if (this.zzv == -1 && this.zzw == -1) {
            return;
        }
        this.zzd.zzh(this.zzr, this.zzs, this.zzt, this.zzu);
    }

    private static boolean zzaf(long j) {
        return j < -30000;
    }

    private final boolean zzag(boolean z) {
        return zzbar.zza >= 23 && (!z || zzbax.zzb(this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzatb
    public final boolean zzF() {
        Surface surface;
        if (super.zzF() && (this.zzk || (((surface = this.zzj) != null && this.zzi == surface) || zzU() == null))) {
            this.zzl = -9223372036854775807L;
            return true;
        }
        if (this.zzl == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.zzl) {
            return true;
        }
        this.zzl = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final int zzH(zzaww zzawwVar, zzasw zzaswVar) throws zzawz {
        boolean z;
        String str = zzaswVar.zzf;
        if (!zzbah.zzb(str)) {
            return 0;
        }
        zzauv zzauvVar = zzaswVar.zzi;
        if (zzauvVar != null) {
            z = false;
            for (int i = 0; i < zzauvVar.zza; i++) {
                z |= zzauvVar.zza(i).zzc;
            }
        } else {
            z = false;
        }
        zzaws zzc = zzaxe.zzc(str, z);
        if (zzc == null) {
            return 1;
        }
        boolean zze = zzc.zze(zzaswVar.zzc);
        if (zze && zzaswVar.zzj > 0 && zzaswVar.zzk > 0) {
            if (zzbar.zza >= 21) {
                zze = zzc.zzf(zzaswVar.zzj, zzaswVar.zzk, zzaswVar.zzl);
            } else {
                zze = zzaswVar.zzj * zzaswVar.zzk <= zzaxe.zza();
                if (!zze) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + zzaswVar.zzj + "x" + zzaswVar.zzk + "] [" + zzbar.zze + "]");
                }
            }
        }
        return (true != zze ? 2 : 3) | (true != zzc.zzb ? 4 : 8) | (true == zzc.zzc ? 16 : 0);
    }

    final void zzI() {
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        this.zzd.zzg(this.zzi);
    }

    protected final void zzJ(MediaCodec mediaCodec, int i, long j) {
        zzad();
        zzbap.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzbap.zzb();
        this.zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    protected final void zzK(MediaCodec mediaCodec, int i, long j, long j2) {
        zzad();
        zzbap.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzbap.zzb();
        this.zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    protected final void zzL(MediaCodec mediaCodec, int i, long j) {
        zzbap.zza("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzbap.zzb();
        this.zza.zze++;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzO(zzaws zzawsVar, MediaCodec mediaCodec, zzasw zzaswVar, MediaCrypto mediaCrypto) throws zzawz {
        char c;
        int i;
        zzasw[] zzaswVarArr = this.zzg;
        int i2 = zzaswVar.zzj;
        int i3 = zzaswVar.zzk;
        int i4 = zzaswVar.zzg;
        if (i4 == -1) {
            String str = zzaswVar.zzf;
            if (i2 != -1 && i3 != -1) {
                int i5 = 4;
                switch (str.hashCode()) {
                    case -1664118616:
                        if (str.equals("video/3gpp")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1187890754:
                        if (str.equals("video/mp4v-es")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1599127256:
                        if (str.equals("video/x-vnd.on2.vp8")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1599127257:
                        if (str.equals("video/x-vnd.on2.vp9")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0 && c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c == 4 || c == 5) {
                                i = i2 * i3;
                                i4 = (i * 3) / (i5 + i5);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(zzbar.zzd)) {
                        i = zzbar.zzd(i2, 16) * zzbar.zzd(i3, 16) * 256;
                        i5 = 2;
                        i4 = (i * 3) / (i5 + i5);
                    }
                }
                i = i2 * i3;
                i5 = 2;
                i4 = (i * 3) / (i5 + i5);
            }
            i4 = -1;
        }
        int length = zzaswVarArr.length;
        zzbaz zzbazVar = new zzbaz(i2, i3, i4);
        this.zzh = zzbazVar;
        boolean z = this.zze;
        MediaFormat zzb = zzaswVar.zzb();
        zzb.setInteger("max-width", zzbazVar.zza);
        zzb.setInteger("max-height", zzbazVar.zzb);
        int i6 = zzbazVar.zzc;
        if (i6 != -1) {
            zzb.setInteger("max-input-size", i6);
        }
        if (z) {
            zzb.setInteger("auto-frc", 0);
        }
        if (this.zzi == null) {
            zzbac.zze(zzag(zzawsVar.zzd));
            if (this.zzj == null) {
                this.zzj = zzbax.zza(this.zzb, zzawsVar.zzd);
            }
            this.zzi = this.zzj;
        }
        mediaCodec.configure(zzb, this.zzi, (MediaCrypto) null, 0);
        int i7 = zzbar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzP(String str, long j, long j2) {
        this.zzd.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzQ(zzasw zzaswVar) throws zzasi {
        super.zzQ(zzaswVar);
        this.zzd.zzf(zzaswVar);
        float f = zzaswVar.zzn;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.zzq = f;
        this.zzp = zzN(zzaswVar);
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.zzr = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.zzs = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.zzu = this.zzq;
        if (zzbar.zza >= 21) {
            int i = this.zzp;
            if (i == 90 || i == 270) {
                int i2 = this.zzr;
                this.zzr = this.zzs;
                this.zzs = i2;
                this.zzu = 1.0f / this.zzu;
            }
        } else {
            this.zzt = this.zzp;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.zzA;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.zzf;
            long j4 = jArr[0];
            if (j3 < j4) {
                break;
            }
            this.zzz = j4;
            int i4 = i3 - 1;
            this.zzA = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j5 = j3 - this.zzz;
        if (z) {
            zzL(mediaCodec, i, j5);
            return true;
        }
        long j6 = j3 - j;
        if (this.zzi == this.zzj) {
            if (!zzaf(j6)) {
                return false;
            }
            zzL(mediaCodec, i, j5);
            return true;
        }
        if (!this.zzk) {
            if (zzbar.zza >= 21) {
                zzK(mediaCodec, i, j5, System.nanoTime());
            } else {
                zzJ(mediaCodec, i, j5);
            }
            return true;
        }
        if (zzb() != 2) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long nanoTime = System.nanoTime();
        long zza = this.zzc.zza(j3, ((j6 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
        long j7 = (zza - nanoTime) / 1000;
        if (!zzaf(j7)) {
            if (zzbar.zza >= 21) {
                if (j7 < 50000) {
                    zzK(mediaCodec, i, j5, zza);
                    return true;
                }
            } else if (j7 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzJ(mediaCodec, i, j5);
                return true;
            }
            return false;
        }
        zzbap.zza("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzbap.zzb();
        zzauq zzauqVar = this.zza;
        zzauqVar.zzf++;
        this.zzn++;
        int i5 = this.zzo + 1;
        this.zzo = i5;
        zzauqVar.zzg = Math.max(i5, zzauqVar.zzg);
        if (this.zzn == -1) {
            zzac();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzX(zzaur zzaurVar) {
        int i = zzbar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzY() {
        try {
            super.zzY();
        } finally {
            Surface surface = this.zzj;
            if (surface != null) {
                if (this.zzi == surface) {
                    this.zzi = null;
                }
                surface.release();
                this.zzj = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final boolean zzZ(MediaCodec mediaCodec, boolean z, zzasw zzaswVar, zzasw zzaswVar2) {
        if (!zzaswVar.zzf.equals(zzaswVar2.zzf) || zzN(zzaswVar) != zzN(zzaswVar2)) {
            return false;
        }
        if (!z && (zzaswVar.zzj != zzaswVar2.zzj || zzaswVar.zzk != zzaswVar2.zzk)) {
            return false;
        }
        int i = zzaswVar2.zzj;
        zzbaz zzbazVar = this.zzh;
        return i <= zzbazVar.zza && zzaswVar2.zzk <= zzbazVar.zzb && zzaswVar2.zzg <= zzbazVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final boolean zzaa(zzaws zzawsVar) {
        return this.zzi != null || zzag(zzawsVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzasg, com.google.android.gms.internal.ads.zzask
    public final void zzl(int i, Object obj) throws zzasi {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzj;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzaws zzV = zzV();
                    if (zzV != null && zzag(zzV.zzd)) {
                        surface = zzbax.zza(this.zzb, zzV.zzd);
                        this.zzj = surface;
                    }
                }
            }
            if (this.zzi == surface) {
                if (surface == null || surface == this.zzj) {
                    return;
                }
                zzae();
                if (this.zzk) {
                    this.zzd.zzg(this.zzi);
                    return;
                }
                return;
            }
            this.zzi = surface;
            int zzb = zzb();
            if (zzb == 1 || zzb == 2) {
                MediaCodec zzU = zzU();
                if (zzbar.zza < 23 || zzU == null || surface == null) {
                    zzY();
                    zzW();
                } else {
                    zzU.setOutputSurface(surface);
                }
            }
            if (surface == null || surface == this.zzj) {
                zzab();
                this.zzk = false;
                int i2 = zzbar.zza;
            } else {
                zzae();
                this.zzk = false;
                int i3 = zzbar.zza;
                if (zzb == 2) {
                    this.zzl = -9223372036854775807L;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzasg
    protected final void zzn() {
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        this.zzz = -9223372036854775807L;
        this.zzA = 0;
        zzab();
        this.zzk = false;
        int i = zzbar.zza;
        this.zzc.zzb();
        try {
            super.zzn();
        } finally {
            this.zza.zza();
            this.zzd.zzc(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzasg
    protected final void zzo(boolean z) throws zzasi {
        super.zzo(z);
        int i = zzg().zzb;
        this.zzd.zze(this.zza);
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzasg
    protected final void zzp(long j, boolean z) throws zzasi {
        super.zzp(j, z);
        this.zzk = false;
        int i = zzbar.zza;
        this.zzo = 0;
        int i2 = this.zzA;
        if (i2 != 0) {
            this.zzz = this.zzf[i2 - 1];
            this.zzA = 0;
        }
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzasg
    protected final void zzq() {
        this.zzn = 0;
        this.zzm = SystemClock.elapsedRealtime();
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzasg
    protected final void zzr() {
        zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzasg
    protected final void zzs(zzasw[] zzaswVarArr, long j) throws zzasi {
        this.zzg = zzaswVarArr;
        if (this.zzz == -9223372036854775807L) {
            this.zzz = j;
            return;
        }
        int i = this.zzA;
        if (i == 10) {
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.zzf[9]);
        } else {
            this.zzA = i + 1;
        }
        this.zzf[this.zzA - 1] = j;
    }
}

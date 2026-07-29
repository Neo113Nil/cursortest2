package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzate extends zzavq implements zzazc {
    private final zzaso zzb;
    private final zzata zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private boolean zzh;

    public zzate(zzavs zzavsVar, zzats zzatsVar, boolean z, Handler handler, zzasp zzaspVar) {
        super(1, zzavsVar, null, true);
        this.zzc = new zzata(null, new zzash[0], new zzatd(this, null));
        this.zzb = new zzaso(handler, zzaspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarx
    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarx
    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    protected final int zzH(zzavs zzavsVar, zzars zzarsVar) throws zzavv {
        int i;
        int i2;
        String str = zzarsVar.zzf;
        if (!zzazd.zza(str)) {
            return 0;
        }
        int i3 = zzazn.zza >= 21 ? 16 : 0;
        zzavo zzc = zzawa.zzc(str, false);
        if (zzc == null) {
            return 1;
        }
        int i4 = 2;
        if (zzazn.zza < 21 || (((i = zzarsVar.zzs) == -1 || zzc.zzd(i)) && ((i2 = zzarsVar.zzr) == -1 || zzc.zzc(i2)))) {
            i4 = 3;
        }
        return i3 | 4 | i4;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final long zzI() {
        long zza = this.zzc.zza(zzE());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final zzarw zzJ() {
        return this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final zzarw zzK(zzarw zzarwVar) {
        return this.zzc.zzd(zzarwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    protected final zzavo zzM(zzavs zzavsVar, zzars zzarsVar, boolean z) throws zzavv {
        return super.zzM(zzavsVar, zzarsVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    protected final void zzO(zzavo zzavoVar, MediaCodec mediaCodec, zzars zzarsVar, MediaCrypto mediaCrypto) {
        String str = zzavoVar.zza;
        boolean z = true;
        if (zzazn.zza >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(zzazn.zzc) || (!zzazn.zzb.startsWith("zeroflte") && !zzazn.zzb.startsWith("herolte") && !zzazn.zzb.startsWith("heroqlte"))) {
            z = false;
        }
        this.zzd = z;
        mediaCodec.configure(zzarsVar.zzb(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    protected final void zzP(String str, long j, long j2) {
        this.zzb.zzd(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    protected final void zzQ(zzars zzarsVar) throws zzare {
        super.zzQ(zzarsVar);
        this.zzb.zzg(zzarsVar);
        this.zze = "audio/raw".equals(zzarsVar.zzf) ? zzarsVar.zzt : 2;
        this.zzf = zzarsVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    protected final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzare {
        int i;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzd && integer == 6) {
            int i2 = this.zzf;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.zzf; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        } else {
            i = integer;
            iArr = null;
        }
        try {
            this.zzc.zze("audio/raw", i, integer2, this.zze, 0, iArr);
        } catch (zzasu e) {
            throw zzare.zza(e, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    protected final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzare {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zze++;
            this.zzc.zzf();
            return true;
        }
        try {
            if (!this.zzc.zzm(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zzd++;
            return true;
        } catch (zzasv | zzasz e) {
            throw zzare.zza(e, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarc, com.google.android.gms.internal.ads.zzarx
    public final zzazc zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzarc, com.google.android.gms.internal.ads.zzarg
    public final void zzl(int i, Object obj) throws zzare {
        if (i != 2) {
            return;
        }
        this.zzc.zzl(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    protected final void zzn() {
        try {
            this.zzc.zzj();
            try {
                super.zzn();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzn();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    protected final void zzo(boolean z) throws zzare {
        super.zzo(z);
        this.zzb.zzf(this.zza);
        int i = zzg().zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    protected final void zzp(long j, boolean z) throws zzare {
        super.zzp(j, z);
        this.zzc.zzk();
        this.zzg = j;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    protected final void zzq() {
        this.zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    protected final void zzr() {
        this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    protected final void zzS() throws zzare {
        try {
            this.zzc.zzi();
        } catch (zzasz e) {
            throw zzare.zza(e, zza());
        }
    }
}

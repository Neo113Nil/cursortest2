package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaui extends zzawu implements zzbag {
    private final zzats zzb;
    private final zzaue zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private boolean zzh;

    public zzaui(zzaww zzawwVar, zzauw zzauwVar, boolean z, Handler handler, zzatt zzattVar) {
        super(1, zzawwVar, null, true);
        this.zzc = new zzaue(null, new zzatl[0], new zzauh(this, null));
        this.zzb = new zzats(handler, zzattVar);
    }

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzatb
    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzatb
    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final int zzH(zzaww zzawwVar, zzasw zzaswVar) throws zzawz {
        int i;
        int i2;
        String str = zzaswVar.zzf;
        if (!zzbah.zza(str)) {
            return 0;
        }
        int i3 = zzbar.zza >= 21 ? 16 : 0;
        zzaws zzc = zzaxe.zzc(str, false);
        if (zzc == null) {
            return 1;
        }
        int i4 = 2;
        if (zzbar.zza < 21 || (((i = zzaswVar.zzs) == -1 || zzc.zzd(i)) && ((i2 = zzaswVar.zzr) == -1 || zzc.zzc(i2)))) {
            i4 = 3;
        }
        return i3 | 4 | i4;
    }

    @Override // com.google.android.gms.internal.ads.zzbag
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

    @Override // com.google.android.gms.internal.ads.zzbag
    public final zzata zzJ() {
        return this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final zzata zzK(zzata zzataVar) {
        return this.zzc.zzd(zzataVar);
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final zzaws zzM(zzaww zzawwVar, zzasw zzaswVar, boolean z) throws zzawz {
        return super.zzM(zzawwVar, zzaswVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzO(zzaws zzawsVar, MediaCodec mediaCodec, zzasw zzaswVar, MediaCrypto mediaCrypto) {
        String str = zzawsVar.zza;
        boolean z = true;
        if (zzbar.zza >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(zzbar.zzc) || (!zzbar.zzb.startsWith("zeroflte") && !zzbar.zzb.startsWith("herolte") && !zzbar.zzb.startsWith("heroqlte"))) {
            z = false;
        }
        this.zzd = z;
        mediaCodec.configure(zzaswVar.zzb(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzP(String str, long j, long j2) {
        this.zzb.zzd(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzQ(zzasw zzaswVar) throws zzasi {
        super.zzQ(zzaswVar);
        this.zzb.zzg(zzaswVar);
        this.zze = "audio/raw".equals(zzaswVar.zzf) ? zzaswVar.zzt : 2;
        this.zzf = zzaswVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzasi {
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
        } catch (zzaty e) {
            throw zzasi.zza(e, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzasi {
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
        } catch (zzatz | zzaud e) {
            throw zzasi.zza(e, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasg, com.google.android.gms.internal.ads.zzatb
    public final zzbag zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzasg, com.google.android.gms.internal.ads.zzask
    public final void zzl(int i, Object obj) throws zzasi {
        if (i != 2) {
            return;
        }
        this.zzc.zzl(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzasg
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

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzasg
    protected final void zzo(boolean z) throws zzasi {
        super.zzo(z);
        this.zzb.zzf(this.zza);
        int i = zzg().zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzawu, com.google.android.gms.internal.ads.zzasg
    protected final void zzp(long j, boolean z) throws zzasi {
        super.zzp(j, z);
        this.zzc.zzk();
        this.zzg = j;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasg
    protected final void zzq() {
        this.zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzasg
    protected final void zzr() {
        this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    protected final void zzS() throws zzasi {
        try {
            this.zzc.zzi();
        } catch (zzaud e) {
            throw zzasi.zza(e, zza());
        }
    }
}

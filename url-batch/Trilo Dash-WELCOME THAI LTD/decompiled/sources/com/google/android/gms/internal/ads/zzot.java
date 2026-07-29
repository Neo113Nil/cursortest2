package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzot extends zzqj implements zzjc {
    private final Context zzb;
    private final zznk zzc;
    private final zznr zzd;
    private int zze;
    private boolean zzf;
    private zzad zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzjt zzl;

    public zzot(Context context, zzqd zzqdVar, zzql zzqlVar, boolean z, Handler handler, zznl zznlVar, zznr zznrVar) {
        super(1, zzqdVar, zzqlVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zznrVar;
        this.zzc = new zznk(handler, zznlVar);
        zznrVar.zzn(new zzos(this, null));
    }

    private final int zzaw(zzqg zzqgVar, zzad zzadVar) {
        if (!"OMX.google.raw.decoder".equals(zzqgVar.zza) || zzeg.zza >= 24 || (zzeg.zza == 23 && zzeg.zzW(this.zzb))) {
            return zzadVar.zzn;
        }
        return -1;
    }

    private static List zzax(zzql zzqlVar, zzad zzadVar, boolean z, zznr zznrVar) throws zzqs {
        zzqg zzd;
        String str = zzadVar.zzm;
        if (str == null) {
            return zzfrh.zzo();
        }
        if (zznrVar.zzv(zzadVar) && (zzd = zzqy.zzd()) != null) {
            return zzfrh.zzp(zzd);
        }
        List zzf = zzqy.zzf(str, false, false);
        String zze = zzqy.zze(zzadVar);
        if (zze == null) {
            return zzfrh.zzm(zzf);
        }
        List zzf2 = zzqy.zzf(zze, false, false);
        zzfre zzi = zzfrh.zzi();
        zzi.zzf(zzf);
        zzi.zzf(zzf2);
        return zzi.zzg();
    }

    private final void zzay() {
        long zzb = this.zzd.zzb(zzM());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb = Math.max(this.zzh, zzb);
            }
            this.zzh = zzb;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzju, com.google.android.gms.internal.ads.zzjv
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzju
    public final boolean zzM() {
        return super.zzM() && this.zzd.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzju
    public final boolean zzN() {
        return this.zzd.zzt() || super.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final float zzP(float f, zzad zzadVar, zzad[] zzadVarArr) {
        int i = -1;
        for (zzad zzadVar2 : zzadVarArr) {
            int i2 = zzadVar2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final int zzQ(zzql zzqlVar, zzad zzadVar) throws zzqs {
        boolean z;
        if (!zzbo.zzg(zzadVar.zzm)) {
            return 128;
        }
        int i = zzeg.zza >= 21 ? 32 : 0;
        int i2 = zzadVar.zzF;
        boolean zzav = zzav(zzadVar);
        if (zzav && this.zzd.zzv(zzadVar) && (i2 == 0 || zzqy.zzd() != null)) {
            return i | 140;
        }
        if (("audio/raw".equals(zzadVar.zzm) && !this.zzd.zzv(zzadVar)) || !this.zzd.zzv(zzeg.zzE(2, zzadVar.zzz, zzadVar.zzA))) {
            return 129;
        }
        List zzax = zzax(zzqlVar, zzadVar, false, this.zzd);
        if (zzax.isEmpty()) {
            return 129;
        }
        if (!zzav) {
            return 130;
        }
        zzqg zzqgVar = (zzqg) zzax.get(0);
        boolean zzd = zzqgVar.zzd(zzadVar);
        if (!zzd) {
            for (int i3 = 1; i3 < zzax.size(); i3++) {
                zzqg zzqgVar2 = (zzqg) zzax.get(i3);
                if (zzqgVar2.zzd(zzadVar)) {
                    zzqgVar = zzqgVar2;
                    z = false;
                    zzd = true;
                    break;
                }
            }
        }
        z = true;
        int i4 = true != zzd ? 3 : 4;
        int i5 = 8;
        if (zzd && zzqgVar.zze(zzadVar)) {
            i5 = 16;
        }
        return i4 | i5 | i | (true != zzqgVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final zzgn zzR(zzqg zzqgVar, zzad zzadVar, zzad zzadVar2) {
        int i;
        int i2;
        zzgn zzb = zzqgVar.zzb(zzadVar, zzadVar2);
        int i3 = zzb.zze;
        if (zzaw(zzqgVar, zzadVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzqgVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzb.zzd;
            i2 = 0;
        }
        return new zzgn(str, zzadVar, zzadVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final zzgn zzS(zzja zzjaVar) throws zzgu {
        zzgn zzS = super.zzS(zzjaVar);
        this.zzc.zzg(zzjaVar.zza, zzS);
        return zzS;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final zzqc zzV(zzqg zzqgVar, zzad zzadVar, MediaCrypto mediaCrypto, float f) {
        zzad[] zzJ = zzJ();
        int zzaw = zzaw(zzqgVar, zzadVar);
        if (zzJ.length != 1) {
            for (zzad zzadVar2 : zzJ) {
                if (zzqgVar.zzb(zzadVar, zzadVar2).zzd != 0) {
                    zzaw = Math.max(zzaw, zzaw(zzqgVar, zzadVar2));
                }
            }
        }
        this.zze = zzaw;
        this.zzf = zzeg.zza < 24 && "OMX.SEC.aac.dec".equals(zzqgVar.zza) && "samsung".equals(zzeg.zzc) && (zzeg.zzb.startsWith("zeroflte") || zzeg.zzb.startsWith("herolte") || zzeg.zzb.startsWith("heroqlte"));
        String str = zzqgVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzadVar.zzz);
        mediaFormat.setInteger("sample-rate", zzadVar.zzA);
        zzdp.zzb(mediaFormat, zzadVar.zzo);
        zzdp.zza(mediaFormat, "max-input-size", i);
        if (zzeg.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzeg.zza != 23 || (!"ZTE B2017G".equals(zzeg.zzd) && !"AXON 7 mini".equals(zzeg.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzeg.zza <= 28 && "audio/ac4".equals(zzadVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzeg.zza >= 24 && this.zzd.zza(zzeg.zzE(4, zzadVar.zzz, zzadVar.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzeg.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzg = (!"audio/raw".equals(zzqgVar.zzb) || "audio/raw".equals(zzadVar.zzm)) ? null : zzadVar;
        return zzqc.zza(zzqgVar, mediaFormat, zzadVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final List zzW(zzql zzqlVar, zzad zzadVar, boolean z) throws zzqs {
        return zzqy.zzg(zzax(zzqlVar, zzadVar, false, this.zzd), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final void zzX(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final void zzY(String str, zzqc zzqcVar, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final long zza() {
        if (zzbe() == 2) {
            zzay();
        }
        return this.zzh;
    }

    protected final void zzab() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final void zzac() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final void zzad(zzgc zzgcVar) {
        if (!this.zzi || zzgcVar.zzf()) {
            return;
        }
        if (Math.abs(zzgcVar.zzd - this.zzh) > 500000) {
            this.zzh = zzgcVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final boolean zzag(zzad zzadVar) {
        return this.zzd.zzv(zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final zzbt zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final void zzg(zzbt zzbtVar) {
        this.zzd.zzo(zzbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzju
    public final zzjc zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzjq
    public final void zzp(int i, Object obj) throws zzgu {
        if (i == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.zzd.zzk((zzi) obj);
            return;
        }
        if (i == 6) {
            this.zzd.zzm((zzj) obj);
            return;
        }
        switch (i) {
            case 9:
                this.zzd.zzq(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.zzd.zzl(((Integer) obj).intValue());
                break;
            case 11:
                this.zzl = (zzjt) obj;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    protected final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzs();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    protected final void zzt(boolean z, boolean z2) throws zzgu {
        super.zzt(z, z2);
        this.zzc.zzf(this.zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    protected final void zzu(long j, boolean z) throws zzgu {
        super.zzu(j, z);
        this.zzd.zze();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    protected final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    protected final void zzw() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    protected final void zzx() {
        zzay();
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final void zzae() throws zzgu {
        try {
            this.zzd.zzi();
        } catch (zznq e) {
            throw zzbg(e, e.zzc, e.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final boolean zzaf(long j, long j2, zzqe zzqeVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzadVar) throws zzgu {
        Objects.requireNonNull(byteBuffer);
        if (this.zzg != null && (i2 & 2) != 0) {
            Objects.requireNonNull(zzqeVar);
            zzqeVar.zzn(i, false);
            return true;
        }
        if (z) {
            if (zzqeVar != null) {
                zzqeVar.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzf();
            return true;
        }
        try {
            if (!this.zzd.zzs(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzqeVar != null) {
                zzqeVar.zzn(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zznn e) {
            throw zzbg(e, e.zzc, e.zzb, 5001);
        } catch (zznq e2) {
            throw zzbg(e2, zzadVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    protected final void zzaa(zzad zzadVar, MediaFormat mediaFormat) throws zzgu {
        int i;
        zzad zzadVar2 = this.zzg;
        int[] iArr = null;
        if (zzadVar2 != null) {
            zzadVar = zzadVar2;
        } else if (zzaj() != null) {
            int zzn = "audio/raw".equals(zzadVar.zzm) ? zzadVar.zzB : (zzeg.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzeg.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/raw");
            zzabVar.zzN(zzn);
            zzabVar.zzC(zzadVar.zzC);
            zzabVar.zzD(zzadVar.zzD);
            zzabVar.zzw(mediaFormat.getInteger("channel-count"));
            zzabVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzad zzY = zzabVar.zzY();
            if (this.zzf && zzY.zzz == 6 && (i = zzadVar.zzz) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzadVar.zzz; i2++) {
                    iArr[i2] = i2;
                }
            }
            zzadVar = zzY;
        }
        try {
            this.zzd.zzd(zzadVar, 0, iArr);
        } catch (zznm e) {
            throw zzbg(e, e.zza, false, 5001);
        }
    }
}

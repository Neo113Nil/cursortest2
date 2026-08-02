package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzpa extends zzqq implements zzji {
    private final Context zzb;
    private final zznr zzc;
    private final zzny zzd;
    private int zze;
    private boolean zzf;
    private zzaf zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzjz zzl;

    public zzpa(Context context, zzqk zzqkVar, zzqs zzqsVar, boolean z, Handler handler, zzns zznsVar, zzny zznyVar) {
        super(1, zzqkVar, zzqsVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zznyVar;
        this.zzc = new zznr(handler, zznsVar);
        zznyVar.zzn(new zzoz(this, null));
    }

    private final int zzaw(zzqn zzqnVar, zzaf zzafVar) {
        if (!"OMX.google.raw.decoder".equals(zzqnVar.zza) || zzen.zza >= 24 || (zzen.zza == 23 && zzen.zzX(this.zzb))) {
            return zzafVar.zzn;
        }
        return -1;
    }

    private static List zzax(zzqs zzqsVar, zzaf zzafVar, boolean z, zzny zznyVar) throws zzqz {
        zzqn zzd;
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfvn.zzo();
        }
        if (zznyVar.zzv(zzafVar) && (zzd = zzrf.zzd()) != null) {
            return zzfvn.zzp(zzd);
        }
        List zzf = zzrf.zzf(str, false, false);
        String zze = zzrf.zze(zzafVar);
        if (zze == null) {
            return zzfvn.zzm(zzf);
        }
        List zzf2 = zzrf.zzf(zze, false, false);
        zzfvk zzi = zzfvn.zzi();
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

    @Override // com.google.android.gms.internal.ads.zzka, com.google.android.gms.internal.ads.zzkb
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzka
    public final boolean zzM() {
        return super.zzM() && this.zzd.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzka
    public final boolean zzN() {
        return this.zzd.zzt() || super.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        int i = -1;
        for (zzaf zzafVar2 : zzafVarArr) {
            int i2 = zzafVar2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final int zzQ(zzqs zzqsVar, zzaf zzafVar) throws zzqz {
        boolean z;
        if (!zzbt.zzg(zzafVar.zzm)) {
            return 128;
        }
        int i = zzen.zza >= 21 ? 32 : 0;
        int i2 = zzafVar.zzF;
        boolean zzav = zzav(zzafVar);
        if (zzav && this.zzd.zzv(zzafVar) && (i2 == 0 || zzrf.zzd() != null)) {
            return i | 140;
        }
        if (("audio/raw".equals(zzafVar.zzm) && !this.zzd.zzv(zzafVar)) || !this.zzd.zzv(zzen.zzF(2, zzafVar.zzz, zzafVar.zzA))) {
            return 129;
        }
        List zzax = zzax(zzqsVar, zzafVar, false, this.zzd);
        if (zzax.isEmpty()) {
            return 129;
        }
        if (!zzav) {
            return 130;
        }
        zzqn zzqnVar = (zzqn) zzax.get(0);
        boolean zzd = zzqnVar.zzd(zzafVar);
        if (!zzd) {
            for (int i3 = 1; i3 < zzax.size(); i3++) {
                zzqn zzqnVar2 = (zzqn) zzax.get(i3);
                if (zzqnVar2.zzd(zzafVar)) {
                    z = false;
                    zzd = true;
                    zzqnVar = zzqnVar2;
                    break;
                }
            }
        }
        z = true;
        int i4 = true != zzd ? 3 : 4;
        int i5 = 8;
        if (zzd && zzqnVar.zze(zzafVar)) {
            i5 = 16;
        }
        return i4 | i5 | i | (true != zzqnVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final zzgt zzR(zzqn zzqnVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzgt zzb = zzqnVar.zzb(zzafVar, zzafVar2);
        int i3 = zzb.zze;
        if (zzaw(zzqnVar, zzafVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzqnVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzb.zzd;
        }
        return new zzgt(str, zzafVar, zzafVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final zzgt zzS(zzjg zzjgVar) throws zzha {
        zzgt zzS = super.zzS(zzjgVar);
        this.zzc.zzg(zzjgVar.zza, zzS);
        return zzS;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final zzqj zzV(zzqn zzqnVar, zzaf zzafVar, MediaCrypto mediaCrypto, float f) {
        zzaf[] zzJ = zzJ();
        int zzaw = zzaw(zzqnVar, zzafVar);
        if (zzJ.length != 1) {
            for (zzaf zzafVar2 : zzJ) {
                if (zzqnVar.zzb(zzafVar, zzafVar2).zzd != 0) {
                    zzaw = Math.max(zzaw, zzaw(zzqnVar, zzafVar2));
                }
            }
        }
        this.zze = zzaw;
        this.zzf = zzen.zza < 24 && "OMX.SEC.aac.dec".equals(zzqnVar.zza) && "samsung".equals(zzen.zzc) && (zzen.zzb.startsWith("zeroflte") || zzen.zzb.startsWith("herolte") || zzen.zzb.startsWith("heroqlte"));
        String str = zzqnVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzafVar.zzz);
        mediaFormat.setInteger("sample-rate", zzafVar.zzA);
        zzdy.zzb(mediaFormat, zzafVar.zzo);
        zzdy.zza(mediaFormat, "max-input-size", i);
        if (zzen.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzen.zza != 23 || (!"ZTE B2017G".equals(zzen.zzd) && !"AXON 7 mini".equals(zzen.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzen.zza <= 28 && "audio/ac4".equals(zzafVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzen.zza >= 24 && this.zzd.zza(zzen.zzF(4, zzafVar.zzz, zzafVar.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzen.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzg = (!"audio/raw".equals(zzqnVar.zzb) || "audio/raw".equals(zzafVar.zzm)) ? null : zzafVar;
        return zzqj.zza(zzqnVar, mediaFormat, zzafVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final List zzW(zzqs zzqsVar, zzaf zzafVar, boolean z) throws zzqz {
        return zzrf.zzg(zzax(zzqsVar, zzafVar, false, this.zzd), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzX(Exception exc) {
        zzdw.zzc("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzY(String str, zzqj zzqjVar, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final long zza() {
        if (zzbe() == 2) {
            zzay();
        }
        return this.zzh;
    }

    protected final void zzab() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzac() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzad(zzgi zzgiVar) {
        if (!this.zzi || zzgiVar.zzf()) {
            return;
        }
        if (Math.abs(zzgiVar.zzd - this.zzh) > 500000) {
            this.zzh = zzgiVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final boolean zzag(zzaf zzafVar) {
        return this.zzd.zzv(zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final zzby zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzji
    public final void zzg(zzby zzbyVar) {
        this.zzd.zzo(zzbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzka
    public final zzji zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgr, com.google.android.gms.internal.ads.zzjw
    public final void zzp(int i, Object obj) throws zzha {
        if (i == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.zzd.zzk((zzk) obj);
            return;
        }
        if (i == 6) {
            this.zzd.zzm((zzl) obj);
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
                this.zzl = (zzjz) obj;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr
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

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr
    protected final void zzt(boolean z, boolean z2) throws zzha {
        super.zzt(z, z2);
        this.zzc.zzf(this.zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr
    protected final void zzu(long j, boolean z) throws zzha {
        super.zzu(j, z);
        this.zzd.zze();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqq, com.google.android.gms.internal.ads.zzgr
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

    @Override // com.google.android.gms.internal.ads.zzgr
    protected final void zzw() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgr
    protected final void zzx() {
        zzay();
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzae() throws zzha {
        try {
            this.zzd.zzi();
        } catch (zznx e) {
            throw zzbg(e, e.zzc, e.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final boolean zzaf(long j, long j2, zzql zzqlVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzha {
        Objects.requireNonNull(byteBuffer);
        if (this.zzg != null && (i2 & 2) != 0) {
            Objects.requireNonNull(zzqlVar);
            zzqlVar.zzn(i, false);
            return true;
        }
        if (z) {
            if (zzqlVar != null) {
                zzqlVar.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzf();
            return true;
        }
        try {
            if (!this.zzd.zzs(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzqlVar != null) {
                zzqlVar.zzn(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zznu e) {
            throw zzbg(e, e.zzc, e.zzb, 5001);
        } catch (zznx e2) {
            throw zzbg(e2, zzafVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    protected final void zzaa(zzaf zzafVar, MediaFormat mediaFormat) throws zzha {
        int i;
        zzaf zzafVar2 = this.zzg;
        int[] iArr = null;
        if (zzafVar2 != null) {
            zzafVar = zzafVar2;
        } else if (zzaj() != null) {
            int zzn = "audio/raw".equals(zzafVar.zzm) ? zzafVar.zzB : (zzen.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzen.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzad zzadVar = new zzad();
            zzadVar.zzS("audio/raw");
            zzadVar.zzN(zzn);
            zzadVar.zzC(zzafVar.zzC);
            zzadVar.zzD(zzafVar.zzD);
            zzadVar.zzw(mediaFormat.getInteger("channel-count"));
            zzadVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzaf zzY = zzadVar.zzY();
            if (this.zzf && zzY.zzz == 6 && (i = zzafVar.zzz) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzafVar.zzz; i2++) {
                    iArr[i2] = i2;
                }
            }
            zzafVar = zzY;
        }
        try {
            this.zzd.zzd(zzafVar, 0, iArr);
        } catch (zznt e) {
            throw zzbg(e, e.zza, false, 5001);
        }
    }
}

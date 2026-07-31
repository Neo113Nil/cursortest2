package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzrg extends zzsz implements zzkm {
    private final Context zzb;
    private final zzpu zzc;
    private final zzqc zzd;
    private final zzsm zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzu zzi;
    private zzu zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrg(Context context, zzso zzsoVar, zztb zztbVar, boolean z, Handler handler, zzpv zzpvVar, zzqc zzqcVar) {
        super(1, zzsoVar, zztbVar, false, 44100.0f);
        byte[] bArr = null;
        zzsm zzsmVar = Build.VERSION.SDK_INT >= 35 ? new zzsm(zzsl.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzqcVar;
        this.zze = zzsmVar;
        this.zzo = -1000;
        this.zzc = new zzpu(handler, zzpvVar);
        this.zzq = C.TIME_UNSET;
        zzqcVar.zza(new zzrf(this, bArr));
    }

    private static List zzbd(zztb zztbVar, zzu zzuVar, boolean z, zzqc zzqcVar) throws zztd {
        zzst zza;
        return zzuVar.zzo == null ? zzgjz.zzi() : (!zzqcVar.zzd(zzuVar) || (zza = zztl.zza()) == null) ? zztl.zzc(zztbVar, zzuVar, false, false) : zzgjz.zzj(zza);
    }

    private final int zzbe(zzst zzstVar, zzu zzuVar) {
        "OMX.google.raw.decoder".equals(zzstVar.zza);
        return zzuVar.zzp;
    }

    private final void zzbf() {
        long zzg = this.zzd.zzg(zzY());
        if (zzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                zzg = Math.max(this.zzk, zzg);
            }
            this.zzk = zzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzA(long j, boolean z) throws zzhz {
        super.zzA(j, z);
        this.zzd.zzz();
        this.zzk = j;
        this.zzq = C.TIME_UNSET;
        this.zzn = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzB() {
        this.zzd.zzi();
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzC() {
        zzbf();
        this.zzp = false;
        this.zzd.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzq = C.TIME_UNSET;
        try {
            this.zzd.zzz();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzE() {
        this.zzn = false;
        this.zzq = C.TIME_UNSET;
        try {
            super.zzE();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzA();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzA();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhq
    protected final void zzF() {
        zzsm zzsmVar;
        this.zzd.zzB();
        if (Build.VERSION.SDK_INT < 35 || (zzsmVar = this.zze) == null) {
            return;
        }
        zzsmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzll, com.google.android.gms.internal.ads.zzln
    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzX() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzll
    public final boolean zzY() {
        return super.zzY() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final int zzab(zztb zztbVar, zzu zzuVar) throws zztd {
        int i;
        boolean z;
        String str = zzuVar.zzo;
        if (!zzar.zza(str)) {
            return 128;
        }
        int i2 = zzuVar.zzN;
        boolean zzbb = zzbb(zzuVar);
        int i3 = 1;
        if (!zzbb || (i2 != 0 && zztl.zza() == null)) {
            i = 0;
        } else {
            zzqc zzqcVar = this.zzd;
            zzpg zzf = zzqcVar.zzf(zzuVar);
            if (zzf.zzb) {
                i = true != zzf.zzc ? 512 : 1536;
                if (zzf.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzqcVar.zzd(zzuVar)) {
                return i | TsExtractor.TS_STREAM_TYPE_AC4;
            }
        }
        if (!MimeTypes.AUDIO_RAW.equals(str) || this.zzd.zzd(zzuVar)) {
            zzqc zzqcVar2 = this.zzd;
            if (zzqcVar2.zzd(zzeo.zzy(2, zzuVar.zzG, zzuVar.zzH))) {
                List zzbd = zzbd(zztbVar, zzuVar, false, zzqcVar2);
                if (!zzbd.isEmpty()) {
                    if (zzbb) {
                        zzst zzstVar = (zzst) zzbd.get(0);
                        boolean zzc = zzstVar.zzc(zzuVar);
                        if (!zzc) {
                            for (int i4 = 1; i4 < zzbd.size(); i4++) {
                                zzst zzstVar2 = (zzst) zzbd.get(i4);
                                if (zzstVar2.zzc(zzuVar)) {
                                    z = false;
                                    zzc = true;
                                    zzstVar = zzstVar2;
                                    break;
                                }
                            }
                        }
                        z = true;
                        int i5 = true != zzc ? 3 : 4;
                        int i6 = 8;
                        if (zzc && zzstVar.zze(zzuVar)) {
                            i6 = 16;
                        }
                        return i5 | i6 | 32 | (true != zzstVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                    }
                    i3 = 2;
                }
            }
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final List zzac(zztb zztbVar, zzu zzuVar, boolean z) throws zztd {
        return zztl.zze(zzbd(zztbVar, zzuVar, false, this.zzd), zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzad(zzu zzuVar) {
        zzJ();
        return this.zzd.zzd(zzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzsn zzae(zzst zzstVar, zzu zzuVar, MediaCrypto mediaCrypto, float f) {
        zzu[] zzI = zzI();
        int length = zzI.length;
        int zzbe = zzbe(zzstVar, zzuVar);
        if (length != 1) {
            for (zzu zzuVar2 : zzI) {
                if (zzstVar.zzf(zzuVar, zzuVar2).zzd != 0) {
                    zzbe = Math.max(zzbe, zzbe(zzstVar, zzuVar2));
                }
            }
        }
        this.zzf = zzbe;
        String str = zzstVar.zza;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzstVar.zzc;
        int i = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i2 = zzuVar.zzG;
        mediaFormat.setInteger("channel-count", i2);
        int i3 = zzuVar.zzH;
        mediaFormat.setInteger("sample-rate", i3);
        zzdv.zza(mediaFormat, zzuVar.zzr);
        zzdv.zzb(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzuVar.zzo;
        if (MimeTypes.AUDIO_AC4.equals(str3)) {
            Pair zze = zzdc.zze(zzuVar);
            if (zze != null) {
                zzdv.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zze.first).intValue());
                zzdv.zzb(mediaFormat, FirebaseAnalytics.Param.LEVEL, ((Integer) zze.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzeo.zzy(4, i2, i3)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger(NotificationsChannelSerializer.IMPORTANCE_KEY, Math.max(0, -this.zzo));
        }
        this.zzj = (!MimeTypes.AUDIO_RAW.equals(zzstVar.zzb) || MimeTypes.AUDIO_RAW.equals(str3)) ? null : zzuVar;
        return zzsn.zza(zzstVar, mediaFormat, zzuVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzhs zzaf(zzst zzstVar, zzu zzuVar, zzu zzuVar2) {
        int i;
        int i2;
        zzhs zzf = zzstVar.zzf(zzuVar, zzuVar2);
        int i3 = zzf.zze;
        if (zzaA(zzuVar2)) {
            i3 |= 32768;
        }
        if (zzbe(zzstVar, zzuVar2) > this.zzf) {
            i3 |= 64;
        }
        String str = zzstVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zzf.zzd;
        }
        return new zzhs(str, zzuVar, zzuVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final long zzag(long j, long j2, boolean z) {
        long j3 = this.zzq;
        if (!this.zzp) {
            return (j3 != C.TIME_UNSET || super.zzY()) ? 1000000L : 10000L;
        }
        long zzv = this.zzd.zzv();
        if (j3 == C.TIME_UNSET || zzv == C.TIME_UNSET) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(zzv, this.zzq - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzeo.zzq(zzL().zzb()) - j2));
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final float zzah(float f, zzu zzuVar, zzu[] zzuVarArr) {
        int i = -1;
        for (zzu zzuVar2 : zzuVarArr) {
            int i2 = zzuVar2.zzH;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzai(String str, zzsn zzsnVar, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaj(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzak(Exception exc) {
        zzds.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    protected final void zzan() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzao() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzaq() throws zzhz {
        try {
            this.zzd.zzl();
            if (zzaT() != C.TIME_UNSET) {
                this.zzq = zzaT();
            }
        } catch (zzqb e) {
            throw zzN(e, e.zzc, e.zzb, true != zzaC() ? PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED : PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzar(zzhg zzhgVar) {
        zzu zzuVar;
        if (Build.VERSION.SDK_INT < 29 || (zzuVar = zzhgVar.zza) == null || !Objects.equals(zzuVar.zzo, MimeTypes.AUDIO_OPUS) || !zzaC()) {
            return;
        }
        ByteBuffer byteBuffer = zzhgVar.zzf;
        byteBuffer.getClass();
        zzu zzuVar2 = zzhgVar.zza;
        zzuVar2.getClass();
        int i = zzuVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzw(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
        }
    }

    final /* synthetic */ zzpu zzav() {
        return this.zzc;
    }

    final /* synthetic */ zzsm zzaw() {
        return this.zze;
    }

    final /* synthetic */ void zzax(boolean z) {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzll
    public final zzkm zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final long zzg() {
        if (zze() == 2) {
            zzbf();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final boolean zzh() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final void zzi(zzau zzauVar) {
        this.zzd.zzo(zzauVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzau zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq
    protected final void zzy(boolean z, boolean z2) throws zzhz {
        super.zzy(z, z2);
        this.zzc.zza(this.zza);
        zzJ();
        zzqc zzqcVar = this.zzd;
        zzqcVar.zzb(zzK());
        zzqcVar.zzc(zzL());
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final zzhs zzal(zzkh zzkhVar) throws zzhz {
        zzu zzuVar = zzkhVar.zzb;
        zzuVar.getClass();
        this.zzi = zzuVar;
        zzhs zzal = super.zzal(zzkhVar);
        this.zzc.zzc(zzuVar, zzal);
        return zzal;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final boolean zzap(long j, long j2, zzsq zzsqVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzu zzuVar) throws zzhz {
        byteBuffer.getClass();
        this.zzq = C.TIME_UNSET;
        if (this.zzj != null && (i2 & 2) != 0) {
            zzsqVar.getClass();
            zzsqVar.zzc(i, false);
            return true;
        }
        if (z) {
            if (zzsqVar != null) {
                zzsqVar.zzc(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j3, i3)) {
                this.zzq = j3;
                return false;
            }
            if (zzsqVar != null) {
                zzsqVar.zzc(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzpy e) {
            zzu zzuVar2 = this.zzi;
            if (zzaC()) {
                zzJ();
            }
            throw zzN(e, zzuVar2, e.zzb, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        } catch (zzqb e2) {
            if (zzaC()) {
                zzJ();
            }
            throw zzN(e2, zzuVar, e2.zzb, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzlg
    public final void zzx(int i, Object obj) throws zzhz {
        zzsm zzsmVar;
        if (i == 2) {
            zzqc zzqcVar = this.zzd;
            obj.getClass();
            zzqcVar.zzx(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzc zzcVar = (zzc) obj;
            zzqc zzqcVar2 = this.zzd;
            zzcVar.getClass();
            zzqcVar2.zzr(zzcVar);
            return;
        }
        if (i == 6) {
            zzd zzdVar = (zzd) obj;
            zzqc zzqcVar3 = this.zzd;
            zzdVar.getClass();
            zzqcVar3.zzt(zzdVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzsq zzaD = zzaD();
            if (zzaD == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(NotificationsChannelSerializer.IMPORTANCE_KEY, Math.max(0, -this.zzo));
            zzaD.zzo(bundle);
            return;
        }
        if (i == 9) {
            zzqc zzqcVar4 = this.zzd;
            obj.getClass();
            zzqcVar4.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzx(i, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.zzd.zzs(intValue);
            if (Build.VERSION.SDK_INT < 35 || (zzsmVar = this.zze) == null) {
                return;
            }
            zzsmVar.zza(intValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    protected final void zzam(zzu zzuVar, MediaFormat mediaFormat) throws zzhz {
        int[] iArr;
        int i;
        zzu zzuVar2 = this.zzj;
        int[] iArr2 = null;
        boolean z = true;
        if (zzuVar2 != null) {
            zzuVar = zzuVar2;
        } else if (zzaD() != null) {
            mediaFormat.getClass();
            int integer = MimeTypes.AUDIO_RAW.equals(zzuVar.zzo) ? zzuVar.zzI : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? zzeo.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            zzs zzsVar = new zzs();
            zzsVar.zzm(MimeTypes.AUDIO_RAW);
            zzsVar.zzG(integer);
            zzsVar.zzH(zzuVar.zzJ);
            zzsVar.zzI(zzuVar.zzK);
            zzsVar.zzk(zzuVar.zzl);
            Object obj = zzuVar.zzm;
            zzsVar.zza(zzuVar.zza);
            zzsVar.zzc(zzuVar.zzb);
            zzsVar.zzd(zzuVar.zzc);
            zzsVar.zze(zzuVar.zzd);
            zzsVar.zzf(zzuVar.zze);
            zzsVar.zzg(zzuVar.zzf);
            zzsVar.zzE(mediaFormat.getInteger("channel-count"));
            zzsVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzu zzM = zzsVar.zzM();
            if (this.zzg && zzM.zzG == 6 && (i = zzuVar.zzG) < 6) {
                iArr2 = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr2[i2] = i2;
                }
            } else if (this.zzh) {
                int i3 = zzM.zzG;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzuVar = zzM;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (zzaC()) {
                    zzJ();
                }
                if (Build.VERSION.SDK_INT < 29) {
                    z = false;
                }
                zzghc.zzh(z);
            }
            this.zzd.zzh(zzuVar, 0, iArr2);
        } catch (zzpx e) {
            throw zzN(e, e.zza, false, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        }
    }
}

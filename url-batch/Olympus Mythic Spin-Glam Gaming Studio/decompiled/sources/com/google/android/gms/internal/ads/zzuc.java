package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.Scopes;
import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzuc extends zzvz implements zzmf {
    private final Context zzb;
    private final zzry zzc;
    private final zzsi zzd;

    @Nullable
    private final zzvl zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private zzv zzi;

    @Nullable
    private zzv zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzuc(Context context, zzvn zzvnVar, zzwb zzwbVar, boolean z, @Nullable Handler handler, @Nullable zzrz zzrzVar, zzsi zzsiVar) {
        super(context.getApplicationContext(), 1, zzvnVar, zzwbVar, false, 0.0f);
        zzvl zzvlVar = Build.VERSION.SDK_INT >= 35 ? new zzvl(zzvk.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzsiVar;
        this.zze = zzvlVar;
        this.zzp = -1000;
        this.zzc = new zzry(handler, zzrzVar);
        this.zzr = -9223372036854775807L;
    }

    private static List zzbo(zzwb zzwbVar, zzv zzvVar, boolean z, zzsi zzsiVar) throws zzwd {
        zzvs zza;
        return zzvVar.zzp == null ? zzgxm.zzi() : (!zzsiVar.zzd(zzvVar) || (zza = zzwl.zza()) == null) ? zzwl.zzc(zzwbVar, zzvVar, false, false) : zzgxm.zzj(zza);
    }

    private final int zzbp(zzvs zzvsVar, zzv zzvVar) {
        "OMX.google.raw.decoder".equals(zzvsVar.zza);
        return zzvVar.zzq;
    }

    private final void zzbq() {
        long zzg = this.zzd.zzg(zzac());
        if (zzg != Long.MIN_VALUE) {
            if (!this.zzl) {
                zzg = Math.max(this.zzk, zzg);
            }
            this.zzk = zzg;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzA(long j, boolean z, boolean z2) throws zzjn {
        super.zzA(j, z, z2);
        this.zzd.zzC();
        this.zzk = j;
        this.zzr = -9223372036854775807L;
        this.zzn = false;
        this.zzo = false;
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected final void zzB() {
        this.zzd.zzi();
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected final void zzC() {
        zzbq();
        this.zzq = false;
        this.zzd.zzB();
        this.zzo = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzD() {
        this.zzm = true;
        this.zzi = null;
        this.zzr = -9223372036854775807L;
        this.zzo = false;
        try {
            this.zzd.zzC();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzvz) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzE() {
        this.zzn = false;
        this.zzo = false;
        this.zzr = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzD();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzD();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja
    protected final void zzF() {
        zzvl zzvlVar;
        this.zzd.zzE();
        if (Build.VERSION.SDK_INT < 35 || (zzvlVar = this.zze) == null) {
            return;
        }
        zzvlVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzne, com.google.android.gms.internal.ads.zzng
    public final String zzV() {
        return "MediaCodecAudioRenderer";
    }

    final /* synthetic */ zzry zzaB() {
        return this.zzc;
    }

    final /* synthetic */ zzvl zzaC() {
        return this.zze;
    }

    final /* synthetic */ void zzaD(boolean z) {
        this.zzn = true;
    }

    final /* synthetic */ void zzaE(boolean z) {
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean zzab() {
        return this.zzd.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzne
    public final boolean zzac() {
        return super.zzac() && this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final int zzaf(zzwb zzwbVar, zzv zzvVar) throws zzwd {
        int i;
        boolean z;
        String str = zzvVar.zzp;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i2 = zzvVar.zzQ;
        boolean zzbl = zzvz.zzbl(zzvVar);
        int i3 = 1;
        if (!zzbl || (i2 != 0 && zzwl.zza() == null)) {
            i = 0;
        } else {
            zzsi zzsiVar = this.zzd;
            zzqw zzf = zzsiVar.zzf(zzvVar);
            if (zzf.zzb) {
                i = true != zzf.zzc ? 512 : 1536;
                if (zzf.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzsiVar.zzd(zzvVar)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzsi zzsiVar2 = this.zzd;
            if (zzsiVar2.zzd(zzfm.zzB(2, zzvVar.zzI, zzvVar.zzK))) {
                List zzbo = zzbo(zzwbVar, zzvVar, false, zzsiVar2);
                if (!zzbo.isEmpty()) {
                    if (zzbl) {
                        zzvs zzvsVar = (zzvs) zzbo.get(0);
                        Context context = this.zzb;
                        boolean zzc = zzvsVar.zzc(context, zzvVar);
                        if (!zzc) {
                            for (int i4 = 1; i4 < zzbo.size(); i4++) {
                                zzvs zzvsVar2 = (zzvs) zzbo.get(i4);
                                if (zzvsVar2.zzc(context, zzvVar)) {
                                    z = false;
                                    zzc = true;
                                    zzvsVar = zzvsVar2;
                                    break;
                                }
                            }
                        }
                        z = true;
                        int i5 = true != zzc ? 3 : 4;
                        int i6 = 8;
                        if (zzc && zzvsVar.zze(zzvVar)) {
                            i6 = 16;
                        }
                        return i5 | i6 | 32 | (true != zzvsVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                    }
                    i3 = 2;
                }
            }
        }
        return i3 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final List zzag(zzwb zzwbVar, zzv zzvVar, boolean z) throws zzwd {
        return zzwl.zze(this.zzb, zzbo(zzwbVar, zzvVar, false, this.zzd), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final boolean zzah(zzv zzvVar) {
        zzK();
        return this.zzd.zzd(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final zzvm zzai(zzvs zzvsVar, zzv zzvVar, @Nullable MediaCrypto mediaCrypto, float f) {
        zzv[] zzJ = zzJ();
        int length = zzJ.length;
        int zzbp = zzbp(zzvsVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar2 : zzJ) {
                if (zzvsVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    zzbp = Math.max(zzbp, zzbp(zzvsVar, zzvVar2));
                }
            }
        }
        this.zzf = zzbp;
        String str = zzvsVar.zza;
        int i = Build.VERSION.SDK_INT;
        this.zzg = false;
        this.zzh = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzvsVar.zzc;
        int i2 = this.zzf;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i3 = zzvVar.zzI;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = zzvVar.zzK;
        mediaFormat.setInteger("sample-rate", i4);
        zzek.zza(mediaFormat, zzvVar.zzs);
        zzek.zzb(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzvVar.zzp;
        if ("audio/ac4".equals(str3)) {
            Pair zze = zzdr.zze(zzvVar);
            if (zze != null) {
                zzek.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zze.first).intValue());
                zzek.zzb(mediaFormat, AppLovinEventTypes.USER_COMPLETED_LEVEL, ((Integer) zze.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzfm.zzB(4, i3, i4)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger(NotificationCategory.IMPORTANCE_KEY, Math.max(0, -this.zzp));
        }
        if (Objects.equals(str3, "audio/iamf")) {
            zzql zzs = this.zzd.zzs();
            if (zzs == null) {
                zzeh.zzc("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int zza = zzua.zza(zzs);
                int bitCount = Integer.bitCount(zza);
                mediaFormat.setInteger("channel-mask", zza);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        zzbk(mediaFormat);
        this.zzj = (!"audio/raw".equals(zzvsVar.zzb) || "audio/raw".equals(str3)) ? null : zzvVar;
        return zzvm.zza(zzvsVar, mediaFormat, zzvVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final zzjf zzaj(zzvs zzvsVar, zzv zzvVar, zzv zzvVar2, boolean z) {
        int i;
        int i2;
        zzjf zzf = zzvsVar.zzf(zzvVar, zzvVar2);
        int i3 = zzf.zze;
        if (zzaH(zzvVar2)) {
            i3 |= 32768;
        }
        if (zzbp(zzvsVar, zzvVar2) > this.zzf) {
            i3 |= 64;
        }
        String str = zzvsVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzf.zzd;
            i2 = 0;
        }
        return new zzjf(str, zzvVar, zzvVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final long zzak(long j, long j2, boolean z) {
        zzsi zzsiVar = this.zzd;
        boolean z2 = false;
        if (zzsiVar.zzn() && this.zzr != -9223372036854775807L) {
            z2 = true;
        }
        if (!this.zzq) {
            return (z2 || super.zzac()) ? 1000000L : 10000L;
        }
        long zzy = zzsiVar.zzy();
        if (this.zzo && z2 && zzy != -9223372036854775807L) {
            return Math.max(10000L, (long) ((Math.min(zzy, this.zzr - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final float zzal(float f, zzv zzvVar, zzv[] zzvVarArr) {
        int i = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i2 = zzvVar2.zzK;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            MediaFormat zzaM = zzaM();
            i = (zzaM == null || !zzaM.containsKey("sample-rate")) ? -1 : zzaM.getInteger("sample-rate");
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzam(String str, zzvm zzvmVar, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzan(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzao(Exception exc) {
        zzeh.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @CallSuper
    protected final void zzar() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzas() {
        this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzau(zzjc zzjcVar) {
        this.zzc.zzn(zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzav() throws zzjn {
        try {
            this.zzd.zzl();
            if (zzbg() != -9223372036854775807L) {
                this.zzr = zzbg();
            }
        } catch (zzsh e) {
            throw zzQ(e, e.zzc, e.zzb, true != zzaJ() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzaw(long j) {
        this.zzd.zzx(j);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzax(zziy zziyVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zziyVar.zza) == null || !Objects.equals(zzvVar.zzp, "audio/opus") || !zzaJ()) {
            return;
        }
        ByteBuffer byteBuffer = zziyVar.zze;
        byteBuffer.getClass();
        zzv zzvVar2 = zziyVar.zza;
        zzvVar2.getClass();
        int i = zzvVar2.zzM;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzz(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzne
    @Nullable
    public final zzmf zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final long zzg() {
        if (zze() == 2) {
            zzbq();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final boolean zzh() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final zzav zzj() {
        return this.zzd.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja
    protected final void zzy(boolean z, boolean z2) throws zzjn {
        super.zzy(z, z2);
        this.zzc.zza(((zzvz) this).zza);
        zzK();
        zzsi zzsiVar = this.zzd;
        zzsiVar.zzb(zzL());
        zzsiVar.zzc(zzM());
        zzsiVar.zza(new zzub(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    @Nullable
    protected final zzjf zzap(zzma zzmaVar) throws zzjn {
        zzv zzvVar = zzmaVar.zzb;
        zzvVar.getClass();
        this.zzi = zzvVar;
        zzjf zzap = super.zzap(zzmaVar);
        this.zzc.zzc(zzvVar, zzap);
        return zzap;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final boolean zzat(long j, long j2, @Nullable zzvp zzvpVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzjn {
        byteBuffer.getClass();
        this.zzr = -9223372036854775807L;
        if (this.zzj != null && (i2 & 2) != 0) {
            zzvpVar.getClass();
            zzvpVar.zzc(i, false);
            return true;
        }
        if (z) {
            if (zzvpVar != null) {
                zzvpVar.zzc(i, false);
            }
            ((zzvz) this).zza.zzf += i3;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j3, i3)) {
                this.zzr = j3;
                return false;
            }
            if (zzvpVar != null) {
                zzvpVar.zzc(i, false);
            }
            ((zzvz) this).zza.zze += i3;
            return true;
        } catch (zzse e) {
            zzv zzvVar2 = this.zzi;
            if (zzaJ()) {
                zzK();
            }
            throw zzQ(e, zzvVar2, false, 5001);
        } catch (zzsh e2) {
            if (zzaJ()) {
                zzK();
            }
            throw zzQ(e2, zzvVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz, com.google.android.gms.internal.ads.zzja, com.google.android.gms.internal.ads.zzmz
    public final void zzx(int i, @Nullable Object obj) throws zzjn {
        zzvl zzvlVar;
        if (i == 2) {
            zzsi zzsiVar = this.zzd;
            obj.getClass();
            zzsiVar.zzA(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzd zzdVar = (zzd) obj;
            zzsi zzsiVar2 = this.zzd;
            zzdVar.getClass();
            zzsiVar2.zzr(zzdVar);
            return;
        }
        if (i == 6) {
            zze zzeVar = (zze) obj;
            zzsi zzsiVar3 = this.zzd;
            zzeVar.getClass();
            zzsiVar3.zzu(zzeVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzv((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzp = ((Integer) obj).intValue();
            zzvp zzaK = zzaK();
            if (zzaK == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(NotificationCategory.IMPORTANCE_KEY, Math.max(0, -this.zzp));
            zzaK.zzp(bundle);
            return;
        }
        if (i == 19) {
            zzsi zzsiVar4 = this.zzd;
            obj.getClass();
            zzsiVar4.zzw(((Integer) obj).intValue());
            return;
        }
        if (i == 9) {
            zzsi zzsiVar5 = this.zzd;
            obj.getClass();
            zzsiVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzx(i, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.zzd.zzt(intValue);
            if (Build.VERSION.SDK_INT < 35 || (zzvlVar = this.zze) == null) {
                return;
            }
            zzvlVar.zza(intValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    protected final void zzaq(zzv zzvVar, @Nullable MediaFormat mediaFormat) throws zzjn {
        int i;
        int integer;
        zzv zzvVar2 = this.zzj;
        zzhbf zzhbfVar = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaK() != null) {
            mediaFormat.getClass();
            int integer2 = "audio/raw".equals(zzvVar.zzp) ? zzvVar.zzL : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? zzfm.zzC(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            int integer3 = mediaFormat.getInteger("channel-count");
            int i2 = zzvVar.zzJ;
            if (i2 == -1 || zzvVar.zzI != integer3) {
                i2 = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer3) {
                i2 = integer;
            }
            zzt zztVar = new zzt();
            zztVar.zzo("audio/raw");
            zztVar.zzK(integer2);
            zztVar.zzL(zzvVar.zzM);
            zztVar.zzM(zzvVar.zzN);
            zztVar.zzl(zzvVar.zzl);
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzH(integer3);
            zztVar.zzI(i2);
            zztVar.zzJ(mediaFormat.getInteger("sample-rate"));
            zzv zzQ = zztVar.zzQ();
            if (this.zzg && zzQ.zzI == 6 && (i = zzvVar.zzI) < 6) {
                zzhbe zzg = zzhbf.zzg(i);
                for (int i3 = 0; i3 < i; i3++) {
                    zzg.zza(i3);
                }
                zzhbfVar = zzg.zzb();
            } else if (this.zzh) {
                zzhbfVar = zzahv.zza(zzQ.zzI);
            }
            zzvVar = zzQ;
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                if (zzaJ()) {
                    zzK();
                }
                zzguk.zzi(i4 >= 29);
            }
            zzsi zzsiVar = this.zzd;
            zzsa zzsaVar = new zzsa(zzvVar);
            zzsaVar.zza(zzhbfVar);
            zzsaVar.zzb(zzN());
            zzsaVar.zzc(zzO());
            zzsiVar.zzh(zzsaVar.zzd());
            zzbf();
        } catch (zzsd e) {
            throw zzQ(e, e.zza, false, 5001);
        }
    }
}

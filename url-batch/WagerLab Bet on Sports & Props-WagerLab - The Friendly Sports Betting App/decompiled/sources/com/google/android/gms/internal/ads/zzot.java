package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.crypto.tink.Version;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzot implements zzmg, zzou {
    private boolean zzA;
    private final Context zza;
    private final zzov zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzat zzo;
    private zzos zzp;
    private zzos zzq;
    private zzos zzr;
    private zzu zzs;
    private zzu zzt;
    private zzu zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzcv.zza();
    private final zzbd zzf = new zzbd();
    private final zzbc zzg = new zzbc();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzot(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzom zzomVar = new zzom(zzom.zza);
        this.zzc = zzomVar;
        zzomVar.zza(this);
    }

    private final void zzA(int i, long j, zzu zzuVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zze);
        if (zzuVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzuVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzuVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzuVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzuVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzuVar.zzv;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzuVar.zzw;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzuVar.zzG;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzuVar.zzH;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzuVar.zzd;
            if (str4 != null) {
                String str5 = zzeo.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzuVar.zzz;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent build = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzot.this.zzu(build);
            }
        });
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzB(zzbe zzbeVar, zzup zzupVar) {
        int zze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzupVar == null || (zze = zzbeVar.zze(zzupVar.zza)) == -1) {
            return;
        }
        zzbc zzbcVar = this.zzg;
        int i = 0;
        zzbeVar.zzd(zze, zzbcVar, false);
        zzbd zzbdVar = this.zzf;
        zzbeVar.zzb(zzbcVar.zzc, zzbdVar, 0L);
        zzaf zzafVar = zzbdVar.zzd.zzb;
        if (zzafVar != null) {
            int zzG = zzeo.zzG(zzafVar.zza);
            i = zzG != 0 ? zzG != 1 ? zzG != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        long j = zzbdVar.zzm;
        if (j != C.TIME_UNSET && !zzbdVar.zzk && !zzbdVar.zzi && !zzbdVar.zzb()) {
            builder.setMediaDurationMillis(zzeo.zzp(j));
        }
        builder.setPlaybackType(true != zzbdVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzk.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics build = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzot.this.zzv(build);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private static int zzD(int i) {
        switch (zzeo.zzF(i)) {
            case PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED /* 6002 */:
                return 24;
            case PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR /* 6003 */:
                return 28;
            case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    public static zzot zza(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzot(context, mediaMetricsManager.createPlaybackSession());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzw(zzos zzosVar) {
        if (zzosVar != null) {
            return zzosVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j, zzu zzuVar, int i) {
        if (Objects.equals(this.zzs, zzuVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzuVar;
        zzA(1, j, zzuVar, i2);
    }

    private final void zzy(long j, zzu zzuVar, int i) {
        if (Objects.equals(this.zzt, zzuVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzuVar;
        zzA(0, j, zzuVar, i2);
    }

    private final void zzz(long j, zzu zzuVar, int i) {
        if (Objects.equals(this.zzu, zzuVar)) {
            return;
        }
        int i2 = this.zzu == null ? 1 : 0;
        this.zzu = zzuVar;
        zzA(2, j, zzuVar, i2);
    }

    public final LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzou
    public final void zzc(zzme zzmeVar, String str) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null || !zzupVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = new PlaybackMetrics.Builder().setPlayerName(MediaLibraryInfo.TAG).setPlayerVersion(Version.TINK_VERSION);
            zzB(zzmeVar.zzb, zzupVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzou
    public final void zzd(zzme zzmeVar, String str, boolean z) {
        zzup zzupVar = zzmeVar.zzd;
        if ((zzupVar == null || !zzupVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdj(zzme zzmeVar, zzaz zzazVar, zzaz zzazVar2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdk(zzme zzmeVar, zzul zzulVar) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar == null) {
            return;
        }
        zzu zzuVar = zzulVar.zzb;
        zzuVar.getClass();
        zzos zzosVar = new zzos(zzuVar, 0, this.zzc.zzb(zzmeVar.zzb, zzupVar));
        int i = zzulVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzq = zzosVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzr = zzosVar;
                return;
            }
        }
        this.zzp = zzosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdl(zzme zzmeVar, int i, long j, long j2) {
        zzup zzupVar = zzmeVar.zzd;
        if (zzupVar != null) {
            String zzb = this.zzc.zzb(zzmeVar.zzb, zzupVar);
            HashMap hashMap = this.zzi;
            Long l = (Long) hashMap.get(zzb);
            HashMap hashMap2 = this.zzh;
            Long l2 = (Long) hashMap2.get(zzb);
            hashMap.put(zzb, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(zzb, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzdm(zzme zzmeVar, zzhr zzhrVar) {
        this.zzx += zzhrVar.zzg;
        this.zzy += zzhrVar.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ee, code lost:
    
        if (r12 != 1) goto L137;
     */
    @Override // com.google.android.gms.internal.ads.zzmg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzdn(zzba zzbaVar, zzmf zzmfVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int errorCode;
        int zzR;
        zzp zzpVar;
        int i5;
        int i6;
        if (zzmfVar.zzc() == 0) {
            return;
        }
        for (int i7 = 0; i7 < zzmfVar.zzc(); i7++) {
            int zzd = zzmfVar.zzd(i7);
            zzme zza = zzmfVar.zza(zzd);
            if (zzd == 0) {
                this.zzc.zzd(zza);
            } else if (zzd == 11) {
                this.zzc.zze(zza, this.zzl);
            } else {
                this.zzc.zzc(zza);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmfVar.zzb(0)) {
            zzme zza2 = zzmfVar.zza(0);
            if (this.zzk != null) {
                zzB(zza2.zzb, zza2.zzd);
            }
        }
        if (zzmfVar.zzb(2) && this.zzk != null) {
            zzgjz zza3 = zzbaVar.zzn().zza();
            int size = zza3.size();
            int i8 = 0;
            loop1: while (true) {
                if (i8 >= size) {
                    zzpVar = null;
                    break;
                }
                zzbl zzblVar = (zzbl) zza3.get(i8);
                int i9 = 0;
                while (true) {
                    i6 = i8 + 1;
                    if (i9 < zzblVar.zza) {
                        if (zzblVar.zzc(i9) && (zzpVar = zzblVar.zza(i9).zzs) != null) {
                            break loop1;
                        } else {
                            i9++;
                        }
                    }
                }
                i8 = i6;
            }
            if (zzpVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                String str = zzeo.zza;
                int i10 = 0;
                while (true) {
                    if (i10 >= zzpVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzpVar.zza(i10).zza;
                    if (uuid.equals(zzf.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(zzf.zze)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzf.zzc)) {
                            i5 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builder.setDrmType(i5);
            }
        }
        if (zzmfVar.zzb(1011)) {
            this.zzz++;
        }
        zzat zzatVar = this.zzo;
        if (zzatVar != null) {
            Context context = this.zza;
            int i11 = zzatVar.zza;
            if (i11 == 1001) {
                i4 = 20;
            } else {
                zzhz zzhzVar = (zzhz) zzatVar;
                boolean z = zzhzVar.zzc == 1;
                int i12 = zzhzVar.zzg;
                Throwable cause = zzatVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzgr) {
                        zzR = ((zzgr) cause).zzc;
                        i4 = 5;
                    } else if ((cause instanceof zzgq) || (cause instanceof zzas)) {
                        zzR = 0;
                        i4 = 11;
                    } else {
                        boolean z2 = cause instanceof zzgp;
                        if (z2 || (cause instanceof zzgz)) {
                            if (zzed.zza(context).zzc() == 1) {
                                zzR = 0;
                                i4 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    zzR = 0;
                                    i4 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    zzR = 0;
                                    i4 = 7;
                                } else if (z2 && ((zzgp) cause).zzb == 1) {
                                    zzR = 0;
                                    i4 = 4;
                                } else {
                                    zzR = 0;
                                    i4 = 8;
                                }
                            }
                        } else if (i11 == 1002) {
                            i4 = 21;
                        } else if (cause instanceof zzrm) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzeo.zzR(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                i3 = zzD(errorCode);
                                int i13 = i3;
                                zzR = errorCode;
                                i4 = i13;
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i4 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i4 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i4 = 29;
                            } else {
                                if (!(cause3 instanceof zzrx)) {
                                    i4 = cause3 instanceof zzrl ? 28 : 30;
                                }
                                zzR = 0;
                                i4 = 23;
                            }
                        } else if ((cause instanceof zzgm) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i4 = 32;
                            } else {
                                zzR = 0;
                                i4 = 31;
                            }
                        } else {
                            zzR = 0;
                            i4 = 9;
                        }
                    }
                    final PlaybackErrorEvent build = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i4).setSubErrorCode(zzR).setException(zzatVar).build();
                    this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzot.this.zzr(build);
                        }
                    });
                    this.zzA = true;
                    this.zzo = null;
                } else {
                    if (z) {
                        i4 = 35;
                        if (i12 != 0) {
                        }
                    }
                    if (z && i12 == 3) {
                        i4 = 15;
                    } else {
                        if (!z || i12 != 2) {
                            if (cause instanceof zzsw) {
                                zzR = zzeo.zzR(((zzsw) cause).zzd);
                                i4 = 13;
                                final PlaybackErrorEvent build2 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i4).setSubErrorCode(zzR).setException(zzatVar).build();
                                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzot.this.zzr(build2);
                                    }
                                });
                                this.zzA = true;
                                this.zzo = null;
                            } else {
                                i3 = 14;
                                if (cause instanceof zzss) {
                                    errorCode = ((zzss) cause).zza;
                                } else if (cause instanceof OutOfMemoryError) {
                                    i4 = 14;
                                } else if (cause instanceof zzpy) {
                                    errorCode = ((zzpy) cause).zza;
                                    i3 = 17;
                                } else if (cause instanceof zzqb) {
                                    errorCode = ((zzqb) cause).zza;
                                    i3 = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    i3 = zzD(errorCode);
                                } else {
                                    i4 = 22;
                                }
                                int i132 = i3;
                                zzR = errorCode;
                                i4 = i132;
                                final PlaybackErrorEvent build22 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i4).setSubErrorCode(zzR).setException(zzatVar).build();
                                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzot.this.zzr(build22);
                                    }
                                });
                                this.zzA = true;
                                this.zzo = null;
                            }
                        }
                        zzR = 0;
                        i4 = 23;
                        final PlaybackErrorEvent build222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i4).setSubErrorCode(zzR).setException(zzatVar).build();
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzot.this.zzr(build222);
                            }
                        });
                        this.zzA = true;
                        this.zzo = null;
                    }
                }
            }
            zzR = 0;
            final PlaybackErrorEvent build2222 = new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i4).setSubErrorCode(zzR).setException(zzatVar).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzor
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzot.this.zzr(build2222);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzmfVar.zzb(2)) {
            zzbm zzn = zzbaVar.zzn();
            boolean zzb = zzn.zzb(2);
            boolean zzb2 = zzn.zzb(1);
            boolean zzb3 = zzn.zzb(3);
            if (!zzb && !zzb2) {
                if (zzb3) {
                    zzb3 = true;
                }
            }
            if (!zzb) {
                zzx(elapsedRealtime, null, 0);
            }
            if (!zzb2) {
                zzy(elapsedRealtime, null, 0);
            }
            if (!zzb3) {
                zzz(elapsedRealtime, null, 0);
            }
        }
        if (zzw(this.zzp)) {
            zzos zzosVar = this.zzp;
            zzu zzuVar = zzosVar.zza;
            if (zzuVar.zzw != -1) {
                int i14 = zzosVar.zzb;
                zzx(elapsedRealtime, zzuVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            zzos zzosVar2 = this.zzq;
            zzu zzuVar2 = zzosVar2.zza;
            int i15 = zzosVar2.zzb;
            zzy(elapsedRealtime, zzuVar2, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            zzos zzosVar3 = this.zzr;
            zzu zzuVar3 = zzosVar3.zza;
            int i16 = zzosVar3.zzb;
            zzz(elapsedRealtime, zzuVar3, 0);
            this.zzr = null;
        }
        switch (zzed.zza(this.zza).zzc()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzn) {
            this.zzn = i;
            final NetworkEvent build3 = new NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(elapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzon
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzot.this.zzs(build3);
                }
            });
        }
        if (zzbaVar.zzg() != 2) {
            this.zzv = false;
        }
        if (((zzlv) zzbaVar).zzG() == null) {
            this.zzw = false;
        } else if (zzmfVar.zzb(10)) {
            this.zzw = true;
        }
        int zzg = zzbaVar.zzg();
        if (this.zzv) {
            i2 = 5;
        } else if (this.zzw) {
            i2 = 13;
        } else {
            i2 = 4;
            if (zzg == 4) {
                i2 = 11;
            } else if (zzg == 2) {
                int i17 = this.zzm;
                i2 = (i17 == 0 || i17 == 2 || i17 == 12) ? 2 : !zzbaVar.zzj() ? 7 : zzbaVar.zzh() != 0 ? 10 : 6;
            } else if (zzg != 3) {
                i2 = (zzg != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbaVar.zzj()) {
                i2 = zzbaVar.zzh() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i2) {
            this.zzm = i2;
            this.zzA = true;
            final PlaybackStateEvent build4 = new PlaybackStateEvent.Builder().setState(this.zzm).setTimeSinceCreatedMillis(elapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzot.this.zzt(build4);
                }
            });
        }
        if (zzmfVar.zzb(AnalyticsListener.EVENT_PLAYER_RELEASED)) {
            this.zzc.zzg(zzmfVar.zza(AnalyticsListener.EVENT_PLAYER_RELEASED));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzg(zzme zzmeVar, zzat zzatVar) {
        this.zzo = zzatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzh(zzme zzmeVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final void zzp(zzme zzmeVar, zzbu zzbuVar) {
        zzos zzosVar = this.zzp;
        if (zzosVar != null) {
            zzu zzuVar = zzosVar.zza;
            if (zzuVar.zzw == -1) {
                zzs zza = zzuVar.zza();
                zza.zzt(zzbuVar.zzb);
                zza.zzu(zzbuVar.zzc);
                this.zzp = new zzos(zza.zzM(), 0, zzosVar.zzc);
            }
        }
    }

    final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}

package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
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
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline23;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline33;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline48;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline49;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline50;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline51;
import androidx.media3.exoplayer.analytics.MediaMetricsListener$$ExternalSyntheticApiModelOutline52;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes5.dex */
public final class zzqf implements zznt, zzqg {
    private boolean zzA;
    private final Context zza;
    private final zzqh zzc;
    private final PlaybackSession zzd;

    @Nullable
    private String zzj;

    @Nullable
    private PlaybackMetrics.Builder zzk;
    private int zzl;

    @Nullable
    private zzau zzo;

    @Nullable
    private zzqe zzp;

    @Nullable
    private zzqe zzq;

    @Nullable
    private zzqe zzr;

    @Nullable
    private zzv zzs;

    @Nullable
    private zzv zzt;

    @Nullable
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdi.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzqf(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpy zzpyVar = new zzpy(zzpy.zza);
        this.zzc = zzpyVar;
        zzpyVar.zza(this);
    }

    private final void zzA(int i, long j, @Nullable zzv zzvVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        timeSinceCreatedMillis = MediaMetricsListener$$ExternalSyntheticApiModelOutline48.m(i).setTimeSinceCreatedMillis(j - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzvVar.zzo;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzvVar.zzp;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzvVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzvVar.zzw;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzvVar.zzx;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzvVar.zzI;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzvVar.zzK;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzfm.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzvVar.zzA;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        build = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzqf.this.zzu(build);
            }
        });
    }

    private final void zzB(zzbf zzbfVar, @Nullable zzxo zzxoVar) {
        int zze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzxoVar == null || (zze = zzbfVar.zze(zzxoVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i = 0;
        zzbfVar.zzd(zze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int zzK = zzfm.zzK(zzagVar.zza);
            i = zzK != 0 ? zzK != 1 ? zzK != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        long j = zzbeVar.zzm;
        if (j != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(zzfm.zzs(j));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        final PlaybackMetrics build;
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
            build = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzqf.this.zzv(build);
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

    @SuppressLint({"SwitchIntDef"})
    private static int zzD(int i) {
        switch (zzfm.zzJ(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    public static zzqf zza(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager m = MediaMetricsListener$$ExternalSyntheticApiModelOutline33.m(context.getSystemService("media_metrics"));
        if (m == null) {
            return null;
        }
        createPlaybackSession = m.createPlaybackSession();
        return new zzqf(context, createPlaybackSession);
    }

    private final boolean zzw(@Nullable zzqe zzqeVar) {
        if (zzqeVar != null) {
            return zzqeVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j, @Nullable zzv zzvVar, int i) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j, zzvVar, i2);
    }

    private final void zzy(long j, @Nullable zzv zzvVar, int i) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j, zzvVar, i2);
    }

    private final void zzz(long j, @Nullable zzv zzvVar, int i) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i2 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j, zzvVar, i2);
    }

    public final LogSessionId zzb() {
        LogSessionId sessionId;
        sessionId = this.zzd.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzc(zznr zznrVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzxo zzxoVar = zznrVar.zzd;
        if (zzxoVar == null || !zzxoVar.zzb()) {
            zzC();
            this.zzj = str;
            playerName = MediaMetricsListener$$ExternalSyntheticApiModelOutline50.m().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.10.1");
            this.zzk = playerVersion;
            zzB(zznrVar.zzb, zzxoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzd(zznr zznrVar, String str, boolean z) {
        zzxo zzxoVar = zznrVar.zzd;
        if ((zzxoVar == null || !zzxoVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzde(zznr zznrVar, zzba zzbaVar, zzba zzbaVar2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzdf(zznr zznrVar, zzxk zzxkVar) {
        zzxo zzxoVar = zznrVar.zzd;
        if (zzxoVar == null) {
            return;
        }
        zzv zzvVar = zzxkVar.zzb;
        zzvVar.getClass();
        zzqe zzqeVar = new zzqe(zzvVar, 0, this.zzc.zzb(zznrVar.zzb, zzxoVar));
        int i = zzxkVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzq = zzqeVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzr = zzqeVar;
                return;
            }
        }
        this.zzp = zzqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzdg(zznr zznrVar, int i, long j, long j2) {
        zzxo zzxoVar = zznrVar.zzd;
        if (zzxoVar != null) {
            String zzb = this.zzc.zzb(zznrVar.zzb, zzxoVar);
            HashMap hashMap = this.zzi;
            Long l = (Long) hashMap.get(zzb);
            HashMap hashMap2 = this.zzh;
            Long l2 = (Long) hashMap2.get(zzb);
            hashMap.put(zzb, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(zzb, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzdh(zznr zznrVar, zzje zzjeVar) {
        this.zzx += zzjeVar.zzg;
        this.zzy += zzjeVar.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01e8, code lost:
    
        if (r12 != 1) goto L137;
     */
    @Override // com.google.android.gms.internal.ads.zznt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzdi(zzbb zzbbVar, zzns zznsVar) {
        int i;
        int i2;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        final PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        final NetworkEvent build2;
        int i3;
        int i4;
        int errorCode;
        int zzV;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        final PlaybackErrorEvent build3;
        zzq zzqVar;
        int i5;
        int i6;
        if (zznsVar.zzc() == 0) {
            return;
        }
        for (int i7 = 0; i7 < zznsVar.zzc(); i7++) {
            int zzd = zznsVar.zzd(i7);
            zznr zza = zznsVar.zza(zzd);
            if (zzd == 0) {
                this.zzc.zzd(zza);
            } else if (zzd == 11) {
                this.zzc.zze(zza, this.zzl);
            } else {
                this.zzc.zzc(zza);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zznsVar.zzb(0)) {
            zznr zza2 = zznsVar.zza(0);
            if (this.zzk != null) {
                zzB(zza2.zzb, zza2.zzd);
            }
        }
        if (zznsVar.zzb(2) && this.zzk != null) {
            zzgxm zza3 = zzbbVar.zzp().zza();
            int size = zza3.size();
            int i8 = 0;
            loop1: while (true) {
                if (i8 >= size) {
                    zzqVar = null;
                    break;
                }
                zzbm zzbmVar = (zzbm) zza3.get(i8);
                int i9 = 0;
                while (true) {
                    i6 = i8 + 1;
                    if (i9 < zzbmVar.zza) {
                        if (zzbmVar.zzc(i9) && (zzqVar = zzbmVar.zza(i9).zzt) != null) {
                            break loop1;
                        } else {
                            i9++;
                        }
                    }
                }
                i8 = i6;
            }
            if (zzqVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                String str = zzfm.zza;
                PlaybackMetrics.Builder m = MediaMetricsListener$$ExternalSyntheticApiModelOutline23.m(builder);
                int i10 = 0;
                while (true) {
                    if (i10 >= zzqVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzqVar.zza(i10).zza;
                    if (uuid.equals(zzg.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(zzg.zze)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzg.zzc)) {
                            i5 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                m.setDrmType(i5);
            }
        }
        if (zznsVar.zzb(1011)) {
            this.zzz++;
        }
        zzau zzauVar = this.zzo;
        if (zzauVar != null) {
            Context context = this.zza;
            int i11 = zzauVar.zza;
            if (i11 == 1001) {
                i4 = 20;
            } else {
                zzjn zzjnVar = (zzjn) zzauVar;
                boolean z = zzjnVar.zzc == 1;
                int i12 = zzjnVar.zzg;
                Throwable cause = zzauVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzij) {
                        zzV = ((zzij) cause).zzc;
                        i4 = 5;
                    } else if ((cause instanceof zzii) || (cause instanceof zzat)) {
                        zzV = 0;
                        i4 = 11;
                    } else {
                        boolean z2 = cause instanceof zzih;
                        if (z2 || (cause instanceof zzir)) {
                            if (zzes.zza(context).zzc() == 1) {
                                zzV = 0;
                                i4 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    zzV = 0;
                                    i4 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    zzV = 0;
                                    i4 = 7;
                                } else if (z2 && ((zzih) cause).zzb == 1) {
                                    zzV = 0;
                                    i4 = 4;
                                } else {
                                    zzV = 0;
                                    i4 = 8;
                                }
                            }
                        } else if (i11 == 1002) {
                            i4 = 21;
                        } else if (cause instanceof zzuk) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzfm.zzV(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                i3 = zzD(errorCode);
                                int i13 = i3;
                                zzV = errorCode;
                                i4 = i13;
                            } else if (cause3 instanceof MediaDrmResetException) {
                                i4 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i4 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i4 = 29;
                            } else {
                                if (!(cause3 instanceof zzuu)) {
                                    i4 = cause3 instanceof zzuj ? 28 : 30;
                                }
                                zzV = 0;
                                i4 = 23;
                            }
                        } else if ((cause instanceof zzie) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i4 = 32;
                            } else {
                                zzV = 0;
                                i4 = 31;
                            }
                        } else {
                            zzV = 0;
                            i4 = 9;
                        }
                    }
                    timeSinceCreatedMillis3 = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                    errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                    subErrorCode = errorCode2.setSubErrorCode(zzV);
                    exception = subErrorCode.setException(zzauVar);
                    build3 = exception.build();
                    this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzqf.this.zzr(build3);
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
                            if (cause instanceof zzvv) {
                                zzV = zzfm.zzV(((zzvv) cause).zzd);
                                i4 = 13;
                                timeSinceCreatedMillis3 = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                                subErrorCode = errorCode2.setSubErrorCode(zzV);
                                exception = subErrorCode.setException(zzauVar);
                                build3 = exception.build();
                                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzqf.this.zzr(build3);
                                    }
                                });
                                this.zzA = true;
                                this.zzo = null;
                            } else {
                                i3 = 14;
                                if (cause instanceof zzvr) {
                                    errorCode = ((zzvr) cause).zza;
                                } else if (cause instanceof OutOfMemoryError) {
                                    i4 = 14;
                                } else if (cause instanceof zzse) {
                                    i4 = 17;
                                } else if (cause instanceof zzsh) {
                                    errorCode = ((zzsh) cause).zza;
                                    i3 = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    i3 = zzD(errorCode);
                                } else {
                                    i4 = 22;
                                }
                                int i132 = i3;
                                zzV = errorCode;
                                i4 = i132;
                                timeSinceCreatedMillis3 = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                                subErrorCode = errorCode2.setSubErrorCode(zzV);
                                exception = subErrorCode.setException(zzauVar);
                                build3 = exception.build();
                                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzqf.this.zzr(build3);
                                    }
                                });
                                this.zzA = true;
                                this.zzo = null;
                            }
                        }
                        zzV = 0;
                        i4 = 23;
                        timeSinceCreatedMillis3 = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                        errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
                        subErrorCode = errorCode2.setSubErrorCode(zzV);
                        exception = subErrorCode.setException(zzauVar);
                        build3 = exception.build();
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzqf.this.zzr(build3);
                            }
                        });
                        this.zzA = true;
                        this.zzo = null;
                    }
                }
            }
            zzV = 0;
            timeSinceCreatedMillis3 = MediaMetricsListener$$ExternalSyntheticApiModelOutline51.m().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i4);
            subErrorCode = errorCode2.setSubErrorCode(zzV);
            exception = subErrorCode.setException(zzauVar);
            build3 = exception.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzqf.this.zzr(build3);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zznsVar.zzb(2)) {
            zzbn zzp = zzbbVar.zzp();
            boolean zzb = zzp.zzb(2);
            boolean zzb2 = zzp.zzb(1);
            boolean zzb3 = zzp.zzb(3);
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
            zzv zzvVar = this.zzp.zza;
            if (zzvVar.zzx != -1) {
                zzx(elapsedRealtime, zzvVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            zzy(elapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            zzz(elapsedRealtime, this.zzr.zza, 0);
            this.zzr = null;
        }
        switch (zzes.zza(this.zza).zzc()) {
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
            networkType = MediaMetricsListener$$ExternalSyntheticApiModelOutline49.m().setNetworkType(i);
            timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            build2 = timeSinceCreatedMillis2.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzqf.this.zzs(build2);
                }
            });
        }
        if (zzbbVar.zzh() != 2) {
            this.zzv = false;
        }
        if (((zzno) zzbbVar).zzI() == null) {
            this.zzw = false;
        } else if (zznsVar.zzb(10)) {
            this.zzw = true;
        }
        int zzh = zzbbVar.zzh();
        if (this.zzv) {
            i2 = 5;
        } else if (this.zzw) {
            i2 = 13;
        } else {
            i2 = 4;
            if (zzh == 4) {
                i2 = 11;
            } else if (zzh == 2) {
                int i14 = this.zzm;
                i2 = (i14 == 0 || i14 == 2 || i14 == 12) ? 2 : !zzbbVar.zzk() ? 7 : zzbbVar.zzi() != 0 ? 10 : 6;
            } else if (zzh != 3) {
                i2 = (zzh != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbbVar.zzk()) {
                i2 = zzbbVar.zzi() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i2) {
            this.zzm = i2;
            this.zzA = true;
            state = MediaMetricsListener$$ExternalSyntheticApiModelOutline52.m().setState(this.zzm);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            build = timeSinceCreatedMillis.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzqf.this.zzt(build);
                }
            });
        }
        if (zznsVar.zzb(1028)) {
            this.zzc.zzg(zznsVar.zza(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzg(zznr zznrVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzh(zznr zznrVar, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zznt
    public final void zzp(zznr zznrVar, zzbv zzbvVar) {
        zzqe zzqeVar = this.zzp;
        if (zzqeVar != null) {
            zzv zzvVar = zzqeVar.zza;
            if (zzvVar.zzx == -1) {
                zzt zza = zzvVar.zza();
                zza.zzv(zzbvVar.zzb);
                zza.zzw(zzbvVar.zzc);
                this.zzp = new zzqe(zza.zzQ(), 0, zzqeVar.zzc);
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

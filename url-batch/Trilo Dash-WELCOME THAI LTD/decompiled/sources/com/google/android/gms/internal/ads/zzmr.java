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
import androidx.core.view.PointerIconCompat;
import androidx.window.embedding.EmbeddingCompat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmr implements zzkl, zzms {
    private final Context zza;
    private final zzmt zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzbr zzn;
    private zzmq zzo;
    private zzmq zzp;
    private zzmq zzq;
    private zzad zzr;
    private zzad zzs;
    private zzad zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzch zze = new zzch();
    private final zzcf zzf = new zzcf();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzmr(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzmp zzmpVar = new zzmp(zzmp.zza);
        this.zzb = zzmpVar;
        zzmpVar.zzg(this);
    }

    public static zzmr zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmr(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzeg.zzl(i)) {
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

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzad zzadVar, int i) {
        if (zzeg.zzS(this.zzs, zzadVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzadVar;
        zzx(0, j, zzadVar, i2);
    }

    private final void zzu(long j, zzad zzadVar, int i) {
        if (zzeg.zzS(this.zzt, zzadVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzadVar;
        zzx(2, j, zzadVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzci zzciVar, zzsb zzsbVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzsbVar == null || (zza = zzciVar.zza(zzsbVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzciVar.zzd(zza, this.zzf, false);
        zzciVar.zze(this.zzf.zzd, this.zze, 0L);
        zzaw zzawVar = this.zze.zzd.zzd;
        if (zzawVar != null) {
            int zzp = zzeg.zzp(zzawVar.zza);
            i = zzp != 0 ? zzp != 1 ? zzp != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzch zzchVar = this.zze;
        if (zzchVar.zzn != -9223372036854775807L && !zzchVar.zzl && !zzchVar.zzi && !zzchVar.zzb()) {
            builder.setMediaDurationMillis(zzeg.zzz(this.zze.zzn));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, zzad zzadVar, int i) {
        if (zzeg.zzS(this.zzr, zzadVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzadVar;
        zzx(1, j, zzadVar, i2);
    }

    private final void zzx(int i, long j, zzad zzadVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzadVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzadVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzadVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzadVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzadVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzadVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzadVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzadVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzadVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzadVar.zzd;
            if (str4 != null) {
                String[] zzaf = zzeg.zzaf(str4, "-");
                Pair create = Pair.create(zzaf[0], zzaf.length >= 2 ? zzaf[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzadVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = EmbeddingCompat.DEBUG)
    private final boolean zzy(zzmq zzmqVar) {
        return zzmqVar != null && zzmqVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzc(zzkj zzkjVar, String str) {
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar == null || !zzsbVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-alpha03");
            zzv(zzkjVar.zzb, zzkjVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzd(zzkj zzkjVar, String str, boolean z) {
        zzsb zzsbVar = zzkjVar.zzd;
        if ((zzsbVar == null || !zzsbVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zze(zzkj zzkjVar, zzad zzadVar, zzgn zzgnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzf(zzkj zzkjVar, int i, long j, long j2) {
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar != null) {
            String zze = this.zzb.zze(zzkjVar.zzb, zzsbVar);
            Long l = (Long) this.zzh.get(zze);
            Long l2 = (Long) this.zzg.get(zze);
            this.zzh.put(zze, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(zze, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzg(zzkj zzkjVar, zzrx zzrxVar) {
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar == null) {
            return;
        }
        zzad zzadVar = zzrxVar.zzb;
        Objects.requireNonNull(zzadVar);
        zzmq zzmqVar = new zzmq(zzadVar, 0, this.zzb.zze(zzkjVar.zzb, zzsbVar));
        int i = zzrxVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzmqVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzmqVar;
                return;
            }
        }
        this.zzo = zzmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzh(zzkj zzkjVar, int i, long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0327  */
    @Override // com.google.android.gms.internal.ads.zzkl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzcb zzcbVar, zzkk zzkkVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int zzr;
        zzv zzvVar;
        int i5;
        int i6;
        if (zzkkVar.zzb() == 0) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < zzkkVar.zzb(); i8++) {
            int zza = zzkkVar.zza(i8);
            zzkj zzc = zzkkVar.zzc(zza);
            if (zza == 0) {
                this.zzb.zzj(zzc);
            } else if (zza == 11) {
                this.zzb.zzi(zzc, this.zzk);
            } else {
                this.zzb.zzh(zzc);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzkkVar.zzd(0)) {
            zzkj zzc2 = zzkkVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzc2.zzb, zzc2.zzd);
            }
        }
        if (zzkkVar.zzd(2) && this.zzj != null) {
            zzfrh zza2 = zzcbVar.zzo().zza();
            int size = zza2.size();
            int i9 = 0;
            loop1: while (true) {
                if (i9 >= size) {
                    zzvVar = null;
                    break;
                }
                zzcs zzcsVar = (zzcs) zza2.get(i9);
                int i10 = 0;
                while (true) {
                    int i11 = zzcsVar.zzb;
                    i6 = i9 + 1;
                    if (i10 <= 0) {
                        if (zzcsVar.zzd(i10) && (zzvVar = zzcsVar.zzb(i10).zzp) != null) {
                            break loop1;
                        } else {
                            i10++;
                        }
                    }
                }
                i9 = i6;
            }
            if (zzvVar != null) {
                PlaybackMetrics.Builder builder = this.zzj;
                int i12 = zzeg.zza;
                int i13 = 0;
                while (true) {
                    if (i13 >= zzvVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzvVar.zza(i13).zza;
                    if (uuid.equals(zzm.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(zzm.zze)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzm.zzc)) {
                            i5 = 6;
                            break;
                        }
                        i13++;
                    }
                }
                builder.setDrmType(i5);
            }
        }
        if (zzkkVar.zzd(PointerIconCompat.TYPE_COPY)) {
            this.zzy++;
        }
        zzbr zzbrVar = this.zzn;
        if (zzbrVar != null) {
            Context context = this.zza;
            int i14 = 23;
            if (zzbrVar.zzb == 1001) {
                i14 = 20;
            } else {
                zzgu zzguVar = (zzgu) zzbrVar;
                int i15 = zzguVar.zze;
                int i16 = zzguVar.zzi;
                Throwable cause = zzbrVar.getCause();
                Objects.requireNonNull(cause);
                if (cause instanceof IOException) {
                    if (cause instanceof zzfm) {
                        i7 = ((zzfm) cause).zzd;
                        i14 = 5;
                    } else if ((cause instanceof zzfl) || (cause instanceof zzbp)) {
                        i7 = 0;
                        i14 = 11;
                    } else {
                        boolean z2 = cause instanceof zzfk;
                        if (z2 || (cause instanceof zzfu)) {
                            if (zzdw.zzb(context).zza() == 1) {
                                i7 = 0;
                                i14 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i7 = 0;
                                    i14 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    i7 = 0;
                                    i14 = 7;
                                } else if (z2 && ((zzfk) cause).zzc == 1) {
                                    i7 = 0;
                                    i14 = 4;
                                } else {
                                    i7 = 0;
                                    i14 = 8;
                                }
                            }
                        } else if (zzbrVar.zzb == 1002) {
                            i7 = 0;
                            i14 = 21;
                        } else if (cause instanceof zzpb) {
                            Throwable cause3 = cause.getCause();
                            Objects.requireNonNull(cause3);
                            if (zzeg.zza >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                i7 = zzeg.zzm(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                zzr = zzr(i7);
                                i14 = zzr;
                            } else if (zzeg.zza >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i7 = 0;
                                i14 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i7 = 0;
                                i14 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i7 = 0;
                                i14 = 29;
                            } else {
                                if (!(cause3 instanceof zzpm)) {
                                    if (cause3 instanceof zzoz) {
                                        i7 = 0;
                                        i14 = 28;
                                    } else {
                                        i7 = 0;
                                        i14 = 30;
                                    }
                                }
                                i7 = 0;
                            }
                        } else if ((cause instanceof zzfg) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            Objects.requireNonNull(cause4);
                            Throwable cause5 = cause4.getCause();
                            if (zzeg.zza >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i7 = 0;
                                i14 = 32;
                            } else {
                                i7 = 0;
                                i14 = 31;
                            }
                        } else {
                            i7 = 0;
                            i14 = 9;
                        }
                    }
                } else if (i15 == 1 && (i16 == 0 || i16 == 1)) {
                    i7 = 0;
                    i14 = 35;
                } else if (i15 == 1 && i16 == 3) {
                    i7 = 0;
                    i14 = 15;
                } else {
                    if (i15 != 1 || i16 != 2) {
                        if (cause instanceof zzqi) {
                            i7 = zzeg.zzm(((zzqi) cause).zzd);
                            i14 = 13;
                        } else {
                            if (cause instanceof zzqf) {
                                i7 = zzeg.zzm(((zzqf) cause).zzb);
                            } else if (cause instanceof OutOfMemoryError) {
                                i7 = 0;
                            } else if (cause instanceof zznn) {
                                i7 = ((zznn) cause).zza;
                                i14 = 17;
                            } else if (cause instanceof zznq) {
                                i7 = ((zznq) cause).zza;
                                i14 = 18;
                            } else {
                                int i17 = zzeg.zza;
                                if (cause instanceof MediaCodec.CryptoException) {
                                    i7 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    zzr = zzr(i7);
                                    i14 = zzr;
                                } else {
                                    i7 = 0;
                                    i14 = 22;
                                }
                            }
                            i14 = 14;
                        }
                    }
                    i7 = 0;
                }
            }
            this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i14).setSubErrorCode(i7).setException(zzbrVar).build());
            this.zzz = true;
            this.zzn = null;
        }
        if (zzkkVar.zzd(2)) {
            zzct zzo = zzcbVar.zzo();
            boolean zzb = zzo.zzb(2);
            boolean zzb2 = zzo.zzb(1);
            boolean zzb3 = zzo.zzb(3);
            if (!zzb && !zzb2) {
                if (zzb3) {
                    zzb3 = true;
                }
            }
            if (zzb) {
                i4 = 0;
            } else {
                i4 = 0;
                zzw(elapsedRealtime, null, 0);
            }
            if (!zzb2) {
                zzt(elapsedRealtime, null, i4);
            }
            if (!zzb3) {
                zzu(elapsedRealtime, null, i4);
            }
        }
        if (zzy(this.zzo)) {
            zzmq zzmqVar = this.zzo;
            zzad zzadVar = zzmqVar.zza;
            if (zzadVar.zzs != -1) {
                int i18 = zzmqVar.zzb;
                i = 0;
                zzw(elapsedRealtime, zzadVar, 0);
                this.zzo = null;
                if (zzy(this.zzp)) {
                    zzmq zzmqVar2 = this.zzp;
                    zzad zzadVar2 = zzmqVar2.zza;
                    int i19 = zzmqVar2.zzb;
                    zzt(elapsedRealtime, zzadVar2, i);
                    this.zzp = null;
                }
                if (zzy(this.zzq)) {
                    zzmq zzmqVar3 = this.zzq;
                    zzad zzadVar3 = zzmqVar3.zza;
                    int i20 = zzmqVar3.zzb;
                    zzu(elapsedRealtime, zzadVar3, i);
                    this.zzq = null;
                }
                switch (zzdw.zzb(this.zza).zza()) {
                    case 0:
                        i2 = 0;
                        break;
                    case 1:
                        i2 = 9;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                    case 8:
                    default:
                        i2 = 1;
                        break;
                    case 7:
                        i2 = 3;
                        break;
                    case 9:
                        i2 = 8;
                        break;
                    case 10:
                        i2 = 7;
                        break;
                }
                if (i2 != this.zzm) {
                    this.zzm = i2;
                    this.zzc.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i2).setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).build());
                }
                if (zzcbVar.zzh() == 2) {
                    z = false;
                    this.zzu = false;
                } else {
                    z = false;
                }
                if (((zzjz) zzcbVar).zzw() != null) {
                    this.zzv = z;
                } else if (zzkkVar.zzd(10)) {
                    this.zzv = true;
                }
                int zzh = zzcbVar.zzh();
                if (!this.zzu) {
                    i3 = 5;
                } else if (this.zzv) {
                    i3 = 13;
                } else {
                    i3 = 4;
                    if (zzh == 4) {
                        i3 = 11;
                    } else if (zzh == 2) {
                        int i21 = this.zzl;
                        i3 = (i21 == 0 || i21 == 2) ? 2 : !zzcbVar.zzq() ? 7 : zzcbVar.zzi() != 0 ? 10 : 6;
                    } else if (zzh != 3) {
                        i3 = (zzh != 1 || this.zzl == 0) ? this.zzl : 12;
                    } else if (zzcbVar.zzq()) {
                        i3 = zzcbVar.zzi() != 0 ? 9 : 3;
                    }
                }
                if (this.zzl != i3) {
                    this.zzl = i3;
                    this.zzz = true;
                    this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).build());
                }
                if (zzkkVar.zzd(1028)) {
                    return;
                }
                this.zzb.zzf(zzkkVar.zzc(1028));
                return;
            }
        }
        i = 0;
        if (zzy(this.zzp)) {
        }
        if (zzy(this.zzq)) {
        }
        switch (zzdw.zzb(this.zza).zza()) {
        }
        if (i2 != this.zzm) {
        }
        if (zzcbVar.zzh() == 2) {
        }
        if (((zzjz) zzcbVar).zzw() != null) {
        }
        int zzh2 = zzcbVar.zzh();
        if (!this.zzu) {
        }
        if (this.zzl != i3) {
        }
        if (zzkkVar.zzd(1028)) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzj(zzkj zzkjVar, zzrs zzrsVar, zzrx zzrxVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzk(zzkj zzkjVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzl(zzkj zzkjVar, zzbr zzbrVar) {
        this.zzn = zzbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzm(zzkj zzkjVar, zzca zzcaVar, zzca zzcaVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzn(zzkj zzkjVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzo(zzkj zzkjVar, zzgm zzgmVar) {
        this.zzw += zzgmVar.zzg;
        this.zzx += zzgmVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzp(zzkj zzkjVar, zzad zzadVar, zzgn zzgnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzq(zzkj zzkjVar, zzcv zzcvVar) {
        zzmq zzmqVar = this.zzo;
        if (zzmqVar != null) {
            zzad zzadVar = zzmqVar.zza;
            if (zzadVar.zzs == -1) {
                zzab zzb = zzadVar.zzb();
                zzb.zzX(zzcvVar.zzc);
                zzb.zzF(zzcvVar.zzd);
                this.zzo = new zzmq(zzb.zzY(), 0, zzmqVar.zzc);
            }
        }
    }
}

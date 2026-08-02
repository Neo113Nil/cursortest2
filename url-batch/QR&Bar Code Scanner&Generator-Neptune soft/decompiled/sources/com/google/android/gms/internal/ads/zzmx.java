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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzmx implements zzkr, zzmy {
    private final Context zza;
    private final zzmz zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzbw zzn;
    private zzmw zzo;
    private zzmw zzp;
    private zzmw zzq;
    private zzaf zzr;
    private zzaf zzs;
    private zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcm zze = new zzcm();
    private final zzck zzf = new zzck();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzmx(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzmv zzmvVar = new zzmv(zzmv.zza);
        this.zzb = zzmvVar;
        zzmvVar.zzg(this);
    }

    public static zzmx zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmx(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzen.zzl(i)) {
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

    private final void zzt(long j, zzaf zzafVar, int i) {
        if (zzen.zzT(this.zzs, zzafVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzafVar;
        zzx(0, j, zzafVar, i2);
    }

    private final void zzu(long j, zzaf zzafVar, int i) {
        if (zzen.zzT(this.zzt, zzafVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzafVar;
        zzx(2, j, zzafVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcn zzcnVar, zzsi zzsiVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzsiVar == null || (zza = zzcnVar.zza(zzsiVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzcnVar.zzd(zza, this.zzf, false);
        zzcnVar.zze(this.zzf.zzd, this.zze, 0L);
        zzay zzayVar = this.zze.zzd.zzd;
        if (zzayVar != null) {
            int zzp = zzen.zzp(zzayVar.zza);
            i = zzp != 0 ? zzp != 1 ? zzp != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzcm zzcmVar = this.zze;
        if (zzcmVar.zzn != -9223372036854775807L && !zzcmVar.zzl && !zzcmVar.zzi && !zzcmVar.zzb()) {
            builder.setMediaDurationMillis(zzen.zzz(this.zze.zzn));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, zzaf zzafVar, int i) {
        if (zzen.zzT(this.zzr, zzafVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzafVar;
        zzx(1, j, zzafVar, i2);
    }

    private final void zzx(int i, long j, zzaf zzafVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzafVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzafVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzafVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzafVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzafVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzafVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzafVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzafVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzafVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzafVar.zzd;
            if (str4 != null) {
                String[] zzag = zzen.zzag(str4, "-");
                Pair create = Pair.create(zzag[0], zzag.length >= 2 ? zzag[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzafVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zzmw zzmwVar) {
        return zzmwVar != null && zzmwVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzc(zzkp zzkpVar, String str) {
        zzsi zzsiVar = zzkpVar.zzd;
        if (zzsiVar == null || !zzsiVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            zzv(zzkpVar.zzb, zzkpVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzd(zzkp zzkpVar, String str, boolean z) {
        zzsi zzsiVar = zzkpVar.zzd;
        if ((zzsiVar == null || !zzsiVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zze(zzkp zzkpVar, zzaf zzafVar, zzgt zzgtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzf(zzkp zzkpVar, int i, long j, long j2) {
        zzsi zzsiVar = zzkpVar.zzd;
        if (zzsiVar != null) {
            String zze = this.zzb.zze(zzkpVar.zzb, zzsiVar);
            Long l = (Long) this.zzh.get(zze);
            Long l2 = (Long) this.zzg.get(zze);
            this.zzh.put(zze, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(zze, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzg(zzkp zzkpVar, zzse zzseVar) {
        zzsi zzsiVar = zzkpVar.zzd;
        if (zzsiVar == null) {
            return;
        }
        zzaf zzafVar = zzseVar.zzb;
        Objects.requireNonNull(zzafVar);
        zzmw zzmwVar = new zzmw(zzafVar, 0, this.zzb.zze(zzkpVar.zzb, zzsiVar));
        int i = zzseVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzmwVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzmwVar;
                return;
            }
        }
        this.zzo = zzmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzh(zzkp zzkpVar, int i, long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0301  */
    @Override // com.google.android.gms.internal.ads.zzkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzcg zzcgVar, zzkq zzkqVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        zzx zzxVar;
        int i5;
        int i6;
        if (zzkqVar.zzb() == 0) {
            return;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < zzkqVar.zzb(); i8++) {
            int zza = zzkqVar.zza(i8);
            zzkp zzc = zzkqVar.zzc(zza);
            if (zza == 0) {
                this.zzb.zzj(zzc);
            } else if (zza == 11) {
                this.zzb.zzi(zzc, this.zzk);
            } else {
                this.zzb.zzh(zzc);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzkqVar.zzd(0)) {
            zzkp zzc2 = zzkqVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzc2.zzb, zzc2.zzd);
            }
        }
        if (zzkqVar.zzd(2) && this.zzj != null) {
            zzfvn zza2 = zzcgVar.zzo().zza();
            int size = zza2.size();
            int i9 = 0;
            loop1: while (true) {
                if (i9 >= size) {
                    zzxVar = null;
                    break;
                }
                zzcx zzcxVar = (zzcx) zza2.get(i9);
                int i10 = 0;
                while (true) {
                    int i11 = zzcxVar.zzb;
                    i6 = i9 + 1;
                    if (i10 <= 0) {
                        if (zzcxVar.zzd(i10) && (zzxVar = zzcxVar.zzb(i10).zzp) != null) {
                            break loop1;
                        } else {
                            i10++;
                        }
                    }
                }
                i9 = i6;
            }
            if (zzxVar != null) {
                PlaybackMetrics.Builder builder = this.zzj;
                int i12 = zzen.zza;
                int i13 = 0;
                while (true) {
                    if (i13 >= zzxVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzxVar.zza(i13).zza;
                    if (uuid.equals(zzo.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(zzo.zze)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzo.zzc)) {
                            i5 = 6;
                            break;
                        }
                        i13++;
                    }
                }
                builder.setDrmType(i5);
            }
        }
        if (zzkqVar.zzd(PointerIconCompat.TYPE_COPY)) {
            this.zzy++;
        }
        zzbw zzbwVar = this.zzn;
        if (zzbwVar != null) {
            Context context = this.zza;
            int i14 = 14;
            int i15 = 23;
            if (zzbwVar.zzb == 1001) {
                i14 = 20;
            } else {
                zzha zzhaVar = (zzha) zzbwVar;
                int i16 = zzhaVar.zze;
                int i17 = zzhaVar.zzi;
                Throwable cause = zzbwVar.getCause();
                Objects.requireNonNull(cause);
                if (!(cause instanceof IOException)) {
                    if (i16 == 1 && (i17 == 0 || i17 == 1)) {
                        i15 = 35;
                    } else {
                        if (i16 == 1 && i17 == 3) {
                            i14 = 15;
                        } else if (i16 != 1 || i17 != 2) {
                            if (cause instanceof zzqp) {
                                i7 = zzen.zzm(((zzqp) cause).zzd);
                                i15 = 13;
                            } else if (cause instanceof zzqm) {
                                i7 = zzen.zzm(((zzqm) cause).zzb);
                            } else if (!(cause instanceof OutOfMemoryError)) {
                                if (cause instanceof zznu) {
                                    i7 = ((zznu) cause).zza;
                                    i14 = 17;
                                } else if (cause instanceof zznx) {
                                    i7 = ((zznx) cause).zza;
                                    i14 = 18;
                                } else {
                                    int i18 = zzen.zza;
                                    if (cause instanceof MediaCodec.CryptoException) {
                                        i7 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        i14 = zzr(i7);
                                    } else {
                                        i14 = 22;
                                    }
                                }
                            }
                        }
                        i15 = i14;
                    }
                    i7 = 0;
                } else if (cause instanceof zzfs) {
                    i7 = ((zzfs) cause).zzd;
                    i15 = 5;
                } else if ((cause instanceof zzfr) || (cause instanceof zzbu)) {
                    i7 = 0;
                    i15 = 11;
                } else {
                    boolean z2 = cause instanceof zzfq;
                    if (z2 || (cause instanceof zzga)) {
                        if (zzed.zzb(context).zza() == 1) {
                            i15 = 3;
                        } else {
                            Throwable cause2 = cause.getCause();
                            if (cause2 instanceof UnknownHostException) {
                                i7 = 0;
                                i15 = 6;
                            } else if (cause2 instanceof SocketTimeoutException) {
                                i7 = 0;
                                i15 = 7;
                            } else if (z2 && ((zzfq) cause).zzc == 1) {
                                i7 = 0;
                                i15 = 4;
                            } else {
                                i7 = 0;
                                i15 = 8;
                            }
                        }
                    } else if (zzbwVar.zzb == 1002) {
                        i15 = 21;
                    } else if (cause instanceof zzpi) {
                        Throwable cause3 = cause.getCause();
                        Objects.requireNonNull(cause3);
                        if (zzen.zza < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                            if (zzen.zza >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i14 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i14 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i14 = 29;
                            } else if (!(cause3 instanceof zzpt)) {
                                i14 = cause3 instanceof zzpg ? 28 : 30;
                            }
                            i15 = i14;
                        } else {
                            i7 = zzen.zzm(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            i14 = zzr(i7);
                        }
                    } else if ((cause instanceof zzfm) && (cause.getCause() instanceof FileNotFoundException)) {
                        Throwable cause4 = cause.getCause();
                        Objects.requireNonNull(cause4);
                        Throwable cause5 = cause4.getCause();
                        if (zzen.zza >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                            i14 = 32;
                            i15 = i14;
                        } else {
                            i15 = 31;
                        }
                    } else {
                        i15 = 9;
                    }
                    i7 = 0;
                }
                this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i15).setSubErrorCode(i7).setException(zzbwVar).build());
                this.zzz = true;
                this.zzn = null;
            }
            i15 = i14;
            this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i15).setSubErrorCode(i7).setException(zzbwVar).build());
            this.zzz = true;
            this.zzn = null;
        }
        if (zzkqVar.zzd(2)) {
            zzcy zzo = zzcgVar.zzo();
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
            zzmw zzmwVar = this.zzo;
            zzaf zzafVar = zzmwVar.zza;
            if (zzafVar.zzs != -1) {
                int i19 = zzmwVar.zzb;
                i = 0;
                zzw(elapsedRealtime, zzafVar, 0);
                this.zzo = null;
                if (zzy(this.zzp)) {
                    zzmw zzmwVar2 = this.zzp;
                    zzaf zzafVar2 = zzmwVar2.zza;
                    int i20 = zzmwVar2.zzb;
                    zzt(elapsedRealtime, zzafVar2, i);
                    this.zzp = null;
                }
                if (zzy(this.zzq)) {
                    zzmw zzmwVar3 = this.zzq;
                    zzaf zzafVar3 = zzmwVar3.zza;
                    int i21 = zzmwVar3.zzb;
                    zzu(elapsedRealtime, zzafVar3, i);
                    this.zzq = null;
                }
                switch (zzed.zzb(this.zza).zza()) {
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
                if (zzcgVar.zzh() == 2) {
                    z = false;
                    this.zzu = false;
                } else {
                    z = false;
                }
                if (((zzkf) zzcgVar).zzw() != null) {
                    this.zzv = z;
                } else if (zzkqVar.zzd(10)) {
                    this.zzv = true;
                }
                int zzh = zzcgVar.zzh();
                if (!this.zzu) {
                    i3 = 5;
                } else if (this.zzv) {
                    i3 = 13;
                } else {
                    i3 = 4;
                    if (zzh == 4) {
                        i3 = 11;
                    } else if (zzh == 2) {
                        int i22 = this.zzl;
                        i3 = (i22 == 0 || i22 == 2) ? 2 : !zzcgVar.zzq() ? 7 : zzcgVar.zzi() != 0 ? 10 : 6;
                    } else if (zzh != 3) {
                        i3 = (zzh != 1 || this.zzl == 0) ? this.zzl : 12;
                    } else if (zzcgVar.zzq()) {
                        i3 = zzcgVar.zzi() != 0 ? 9 : 3;
                    }
                }
                if (this.zzl != i3) {
                    this.zzl = i3;
                    this.zzz = true;
                    this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).build());
                }
                if (zzkqVar.zzd(1028)) {
                    return;
                }
                this.zzb.zzf(zzkqVar.zzc(1028));
                return;
            }
        }
        i = 0;
        if (zzy(this.zzp)) {
        }
        if (zzy(this.zzq)) {
        }
        switch (zzed.zzb(this.zza).zza()) {
        }
        if (i2 != this.zzm) {
        }
        if (zzcgVar.zzh() == 2) {
        }
        if (((zzkf) zzcgVar).zzw() != null) {
        }
        int zzh2 = zzcgVar.zzh();
        if (!this.zzu) {
        }
        if (this.zzl != i3) {
        }
        if (zzkqVar.zzd(1028)) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzj(zzkp zzkpVar, zzrz zzrzVar, zzse zzseVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzk(zzkp zzkpVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzl(zzkp zzkpVar, zzbw zzbwVar) {
        this.zzn = zzbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzm(zzkp zzkpVar, zzcf zzcfVar, zzcf zzcfVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzn(zzkp zzkpVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzo(zzkp zzkpVar, zzgs zzgsVar) {
        this.zzw += zzgsVar.zzg;
        this.zzx += zzgsVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final /* synthetic */ void zzp(zzkp zzkpVar, zzaf zzafVar, zzgt zzgtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final void zzq(zzkp zzkpVar, zzda zzdaVar) {
        zzmw zzmwVar = this.zzo;
        if (zzmwVar != null) {
            zzaf zzafVar = zzmwVar.zza;
            if (zzafVar.zzs == -1) {
                zzad zzb = zzafVar.zzb();
                zzb.zzX(zzdaVar.zzc);
                zzb.zzF(zzdaVar.zzd);
                this.zzo = new zzmw(zzb.zzY(), 0, zzmwVar.zzc);
            }
        }
    }
}

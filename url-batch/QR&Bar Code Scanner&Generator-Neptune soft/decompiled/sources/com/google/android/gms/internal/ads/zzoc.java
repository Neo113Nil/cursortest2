package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzoc {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzob zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzoa zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzoc(zzob zzobVar) {
        this.zza = zzobVar;
        int i = zzen.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzl(long j) {
        return (j * 1000000) / this.zzg;
    }

    private final long zzm() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzen.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzn() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzm() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long zzl;
        zznv zznvVar;
        zznv zznvVar2;
        zznr zznrVar;
        String str;
        long zzE;
        long zzF;
        long zzE2;
        long zzF2;
        Method method;
        zzoc zzocVar = this;
        AudioTrack audioTrack = zzocVar.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long zzl2 = zzocVar.zzl(zzm());
            if (zzl2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zzocVar.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = zzocVar.zzb;
                    int i = zzocVar.zzv;
                    jArr[i] = zzl2 - nanoTime;
                    zzocVar.zzv = (i + 1) % 10;
                    int i2 = zzocVar.zzw;
                    if (i2 < 10) {
                        zzocVar.zzw = i2 + 1;
                    }
                    zzocVar.zzm = nanoTime;
                    zzocVar.zzl = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = zzocVar.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        zzocVar.zzl += zzocVar.zzb[i3] / i4;
                        i3++;
                    }
                }
                if (!zzocVar.zzh) {
                    zzoa zzoaVar = zzocVar.zzf;
                    Objects.requireNonNull(zzoaVar);
                    if (zzoaVar.zzg(nanoTime)) {
                        long zzb = zzoaVar.zzb();
                        long zza = zzoaVar.zza();
                        if (Math.abs(zzb - nanoTime) > 5000000) {
                            zzop zzopVar = (zzop) zzocVar.zza;
                            zzE2 = zzopVar.zza.zzE();
                            zzF2 = zzopVar.zza.zzF();
                            zzdw.zze("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzl2 + ", " + zzE2 + ", " + zzF2);
                            zzoaVar.zzd();
                            zzocVar = this;
                            str = "DefaultAudioSink";
                        } else {
                            if (Math.abs(zzocVar.zzl(zza) - zzl2) > 5000000) {
                                zzop zzopVar2 = (zzop) zzocVar.zza;
                                zzE = zzopVar2.zza.zzE();
                                zzF = zzopVar2.zza.zzF();
                                str = "DefaultAudioSink";
                                zzdw.zze(str, "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzl2 + ", " + zzE + ", " + zzF);
                                zzoaVar.zzd();
                            } else {
                                str = "DefaultAudioSink";
                                zzoaVar.zzc();
                            }
                            zzocVar = this;
                        }
                    } else {
                        str = "DefaultAudioSink";
                    }
                    if (zzocVar.zzq && (method = zzocVar.zzn) != null && nanoTime - zzocVar.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zzocVar.zzc;
                            Objects.requireNonNull(audioTrack2);
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i5 = zzen.zza;
                            long intValue = (num.intValue() * 1000) - zzocVar.zzi;
                            zzocVar.zzo = intValue;
                            long max = Math.max(intValue, 0L);
                            zzocVar.zzo = max;
                            if (max > 5000000) {
                                zzdw.zze(str, "Ignoring impossibly large audio latency: " + max);
                                zzocVar.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            zzocVar.zzn = null;
                        }
                        zzocVar.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzoa zzoaVar2 = zzocVar.zzf;
        Objects.requireNonNull(zzoaVar2);
        boolean zzf = zzoaVar2.zzf();
        if (zzf) {
            zzl = zzocVar.zzl(zzoaVar2.zza()) + zzen.zzs(nanoTime2 - zzoaVar2.zzb(), zzocVar.zzj);
        } else {
            zzl = zzocVar.zzw == 0 ? zzocVar.zzl(zzm()) : zzocVar.zzl + nanoTime2;
            if (!z) {
                zzl = Math.max(0L, zzl - zzocVar.zzo);
            }
        }
        if (zzocVar.zzD != zzf) {
            zzocVar.zzF = zzocVar.zzC;
            zzocVar.zzE = zzocVar.zzB;
        }
        long j = nanoTime2 - zzocVar.zzF;
        if (j < 1000000) {
            long j2 = (j * 1000) / 1000000;
            zzl = ((zzl * j2) + ((1000 - j2) * (zzocVar.zzE + zzen.zzs(j, zzocVar.zzj)))) / 1000;
        }
        if (!zzocVar.zzk) {
            long j3 = zzocVar.zzB;
            if (zzl > j3) {
                zzocVar.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzen.zzz(zzen.zzu(zzen.zzz(zzl - j3), zzocVar.zzj));
                zzou zzouVar = ((zzop) zzocVar.zza).zza;
                zznvVar = zzouVar.zzq;
                if (zznvVar != null) {
                    zznvVar2 = zzouVar.zzq;
                    zznrVar = ((zzoz) zznvVar2).zza.zzc;
                    zznrVar.zzr(currentTimeMillis);
                }
            }
        }
        zzocVar.zzC = nanoTime2;
        zzocVar.zzB = zzl;
        zzocVar.zzD = zzf;
        return zzl;
    }

    public final void zzc(long j) {
        this.zzz = zzm();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final void zzd() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.zzc = audioTrack;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = new zzoa(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        boolean z2 = true;
        if (z && zzen.zza < 23) {
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.zzh = z2;
            boolean zzV = zzen.zzV(i);
            this.zzq = zzV;
            this.zzi = !zzV ? zzl(i3 / i2) : -9223372036854775807L;
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzu = 0L;
            this.zzp = false;
            this.zzx = -9223372036854775807L;
            this.zzy = -9223372036854775807L;
            this.zzr = 0L;
            this.zzo = 0L;
            this.zzj = 1.0f;
        }
        z2 = false;
        this.zzh = z2;
        boolean zzV2 = zzen.zzV(i);
        this.zzq = zzV2;
        this.zzi = !zzV2 ? zzl(i3 / i2) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzp = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    public final boolean zzg(long j) {
        if (j > zzm()) {
            return true;
        }
        if (!this.zzh) {
            return false;
        }
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && zzm() == 0;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        zznv zznvVar;
        long j2;
        zznv zznvVar2;
        zznr zznrVar;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            }
            if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzg = zzg(j);
        this.zzp = zzg;
        if (z && !zzg && playState != 1) {
            zzob zzobVar = this.zza;
            int i = this.zze;
            long zzz = zzen.zzz(this.zzi);
            zzop zzopVar = (zzop) zzobVar;
            zznvVar = zzopVar.zza.zzq;
            if (zznvVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzou zzouVar = zzopVar.zza;
                j2 = zzouVar.zzV;
                zznvVar2 = zzouVar.zzq;
                zznrVar = ((zzoz) zznvVar2).zza.zzc;
                zznrVar.zzt(i, zzz, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            return false;
        }
        zzoa zzoaVar = this.zzf;
        Objects.requireNonNull(zzoaVar);
        zzoaVar.zze();
        return true;
    }

    public final void zzf() {
        zzoa zzoaVar = this.zzf;
        Objects.requireNonNull(zzoaVar);
        zzoaVar.zze();
    }
}

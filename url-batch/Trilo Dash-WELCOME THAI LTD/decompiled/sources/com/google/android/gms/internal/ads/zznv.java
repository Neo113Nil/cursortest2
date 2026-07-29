package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zznv {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zznu zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zznt zzf;
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

    public zznv(zznu zznuVar) {
        this.zza = zznuVar;
        int i = zzeg.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzm(long j) {
        return (j * 1000000) / this.zzg;
    }

    private final long zzn() {
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
        if (zzeg.zza <= 29) {
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

    private final void zzo() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzn() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long zzm;
        zzno zznoVar;
        zzno zznoVar2;
        zznk zznkVar;
        Method method;
        long zzE;
        long zzF;
        long zzE2;
        long zzF2;
        zznv zznvVar = this;
        AudioTrack audioTrack = zznvVar.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long zzm2 = zznvVar.zzm(zzn());
            if (zzm2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zznvVar.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = zznvVar.zzb;
                    int i = zznvVar.zzv;
                    jArr[i] = zzm2 - nanoTime;
                    zznvVar.zzv = (i + 1) % 10;
                    int i2 = zznvVar.zzw;
                    if (i2 < 10) {
                        zznvVar.zzw = i2 + 1;
                    }
                    zznvVar.zzm = nanoTime;
                    zznvVar.zzl = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = zznvVar.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        zznvVar.zzl += zznvVar.zzb[i3] / i4;
                        i3++;
                    }
                }
                if (!zznvVar.zzh) {
                    zznt zzntVar = zznvVar.zzf;
                    Objects.requireNonNull(zzntVar);
                    if (zzntVar.zzg(nanoTime)) {
                        long zzb = zzntVar.zzb();
                        long zza = zzntVar.zza();
                        if (Math.abs(zzb - nanoTime) > 5000000) {
                            zzoi zzoiVar = (zzoi) zznvVar.zza;
                            zzE2 = zzoiVar.zza.zzE();
                            zzF2 = zzoiVar.zza.zzF();
                            Log.w("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzm2 + ", " + zzE2 + ", " + zzF2);
                            zzntVar.zzd();
                        } else if (Math.abs(zznvVar.zzm(zza) - zzm2) > 5000000) {
                            zzoi zzoiVar2 = (zzoi) zznvVar.zza;
                            zzE = zzoiVar2.zza.zzE();
                            zzF = zzoiVar2.zza.zzF();
                            Log.w("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzm2 + ", " + zzE + ", " + zzF);
                            zzntVar.zzd();
                        } else {
                            zzntVar.zzc();
                        }
                        zznvVar = this;
                    }
                    if (zznvVar.zzq && (method = zznvVar.zzn) != null && nanoTime - zznvVar.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zznvVar.zzc;
                            Objects.requireNonNull(audioTrack2);
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i5 = zzeg.zza;
                            long intValue = (num.intValue() * 1000) - zznvVar.zzi;
                            zznvVar.zzo = intValue;
                            long max = Math.max(intValue, 0L);
                            zznvVar.zzo = max;
                            if (max > 5000000) {
                                Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                zznvVar.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            zznvVar.zzn = null;
                        }
                        zznvVar.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zznt zzntVar2 = zznvVar.zzf;
        Objects.requireNonNull(zzntVar2);
        boolean zzf = zzntVar2.zzf();
        if (zzf) {
            zzm = zznvVar.zzm(zzntVar2.zza()) + zzeg.zzs(nanoTime2 - zzntVar2.zzb(), zznvVar.zzj);
        } else {
            zzm = zznvVar.zzw == 0 ? zznvVar.zzm(zzn()) : zznvVar.zzl + nanoTime2;
            if (!z) {
                zzm = Math.max(0L, zzm - zznvVar.zzo);
            }
        }
        if (zznvVar.zzD != zzf) {
            zznvVar.zzF = zznvVar.zzC;
            zznvVar.zzE = zznvVar.zzB;
        }
        long j = nanoTime2 - zznvVar.zzF;
        if (j < 1000000) {
            long j2 = (j * 1000) / 1000000;
            zzm = ((zzm * j2) + ((1000 - j2) * (zznvVar.zzE + zzeg.zzs(j, zznvVar.zzj)))) / 1000;
        }
        if (!zznvVar.zzk) {
            long j3 = zznvVar.zzB;
            if (zzm > j3) {
                zznvVar.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzeg.zzz(zzeg.zzu(zzeg.zzz(zzm - j3), zznvVar.zzj));
                zzon zzonVar = ((zzoi) zznvVar.zza).zza;
                zznoVar = zzonVar.zzn;
                if (zznoVar != null) {
                    zznoVar2 = zzonVar.zzn;
                    zznkVar = ((zzos) zznoVar2).zza.zzc;
                    zznkVar.zzr(currentTimeMillis);
                }
            }
        }
        zznvVar.zzC = nanoTime2;
        zznvVar.zzB = zzm;
        zznvVar.zzD = zzf;
        return zzm;
    }

    public final long zzc(long j) {
        return zzeg.zzz(zzm(j - zzn()));
    }

    public final void zzd(long j) {
        this.zzz = zzn();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final void zze() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.zzc = audioTrack;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = new zznt(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        boolean z2 = true;
        if (z && zzeg.zza < 23) {
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.zzh = z2;
            boolean zzU = zzeg.zzU(i);
            this.zzq = zzU;
            this.zzi = !zzU ? zzm(i3 / i2) : -9223372036854775807L;
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
        boolean zzU2 = zzeg.zzU(i);
        this.zzq = zzU2;
        this.zzi = !zzU2 ? zzm(i3 / i2) : -9223372036854775807L;
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

    public final boolean zzh(long j) {
        if (j > zzn()) {
            return true;
        }
        if (!this.zzh) {
            return false;
        }
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && zzn() == 0;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzj(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzk(long j) {
        zzno zznoVar;
        long j2;
        zzno zznoVar2;
        zznk zznkVar;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            }
            if (playState == 1) {
                if (zzn() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzh = zzh(j);
        this.zzp = zzh;
        if (z && !zzh && playState != 1) {
            zznu zznuVar = this.zza;
            int i = this.zze;
            long zzz = zzeg.zzz(this.zzi);
            zzoi zzoiVar = (zzoi) zznuVar;
            zznoVar = zzoiVar.zza.zzn;
            if (zznoVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzon zzonVar = zzoiVar.zza;
                j2 = zzonVar.zzS;
                zznoVar2 = zzonVar.zzn;
                zznkVar = ((zzos) zznoVar2).zza.zzc;
                zznkVar.zzt(i, zzz, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzo();
        if (this.zzx != -9223372036854775807L) {
            return false;
        }
        zznt zzntVar = this.zzf;
        Objects.requireNonNull(zzntVar);
        zzntVar.zze();
        return true;
    }

    public final void zzg() {
        zznt zzntVar = this.zzf;
        Objects.requireNonNull(zzntVar);
        zzntVar.zze();
    }
}

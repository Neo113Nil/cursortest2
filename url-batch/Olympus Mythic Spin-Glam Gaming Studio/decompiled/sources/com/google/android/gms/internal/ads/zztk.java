package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zztk {
    private boolean zzA;
    private long zzB;
    private final zztj zza;
    private final zzdp zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzsk zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    @Nullable
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zztk(zztj zztjVar, zzdp zzdpVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.zza = zztjVar;
        this.zzb = zzdpVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzsk(audioTrack, zztjVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zzE = zzfm.zzE(i);
        this.zzg = zzE;
        this.zzf = zzE ? zzfm.zzu(i3 / i2, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j) {
        long j2 = this.zzj;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long zzz = zzfm.zzz(j - j2, this.zzi);
        zzdp zzdpVar = this.zzb;
        long zza = zzdpVar.zza() - zzfm.zzs(zzz);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(zza);
    }

    private final long zzh(long j) {
        long max = Math.max(0L, (this.zzt == 0 ? this.zzu != -9223372036854775807L ? zzfm.zzu(zzl(), this.zze) : zzj() : zzfm.zzy(j + this.zzk, this.zzi)) - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfm.zzu(this.zzx, this.zze), max) : max;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfm.zzu(zzk(), this.zze);
    }

    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return Math.min(this.zzx, zzl());
        }
        long zzb = this.zzb.zzb();
        if (zzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                        this.zzv = -9223372036854775807L;
                    } else if (this.zzv == -9223372036854775807L) {
                        this.zzv = zzb;
                    }
                }
                if (this.zzq > playbackHeadPosition) {
                    this.zzr++;
                }
                this.zzq = playbackHeadPosition;
            }
            this.zzp = zzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfm.zzv(zzfm.zzy(zzfm.zzt(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza() {
        AudioTrack audioTrack;
        int playState;
        Method method;
        AudioTrack audioTrack2 = this.zzd;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long zzc = this.zzb.zzc() / 1000;
            if (zzc - this.zzl >= 30000) {
                long zzj = zzj();
                if (zzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfm.zzz(zzj, this.zzi) - zzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i = this.zzt;
                    if (i < 10) {
                        this.zzt = i + 1;
                    }
                    this.zzl = zzc;
                    this.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.zzt;
                        if (i2 >= i3) {
                            break;
                        }
                        this.zzk += jArr[i2] / i3;
                        i2++;
                    }
                }
            }
            long j = this.zzn;
            if (!this.zzg || (method = this.zzm) == null || zzc - this.zzo < 500000) {
                audioTrack = audioTrack2;
            } else {
                try {
                    Integer num = (Integer) method.invoke(audioTrack2, null);
                    String str = zzfm.zza;
                    audioTrack = audioTrack2;
                    try {
                        long intValue = (num.intValue() * 1000) - this.zzf;
                        this.zzn = intValue;
                        long max = Math.max(intValue, 0L);
                        this.zzn = max;
                        if (max > 10000000) {
                            this.zza.zza(max);
                            this.zzn = 0L;
                        }
                    } catch (Exception unused) {
                        this.zzm = null;
                        this.zzo = zzc;
                        this.zzh.zza(zzc, this.zzi, zzh(zzc), j == this.zzn);
                        long zzc2 = this.zzb.zzc() / 1000;
                        zzsk zzskVar = this.zzh;
                        boolean zzb = zzskVar.zzb();
                        if (zzb) {
                        }
                        playState = audioTrack.getPlayState();
                        if (playState == 3) {
                        }
                        return r7;
                    }
                } catch (Exception unused2) {
                    audioTrack = audioTrack2;
                }
                this.zzo = zzc;
            }
            this.zzh.zza(zzc, this.zzi, zzh(zzc), j == this.zzn);
            long zzc22 = this.zzb.zzc() / 1000;
            zzsk zzskVar2 = this.zzh;
            boolean zzb2 = zzskVar2.zzb();
            long zze = zzb2 ? zzskVar2.zze(zzc22, this.zzi) : zzh(zzc22);
            playState = audioTrack.getPlayState();
            if (playState == 3) {
                if (zzb2 || !zzskVar2.zzc()) {
                    zzg(zze);
                }
                long j2 = this.zzz;
                if (j2 != -9223372036854775807L) {
                    long j3 = zze - this.zzy;
                    long zzy = zzfm.zzy(zzc22 - j2, this.zzi);
                    long j4 = this.zzy + zzy;
                    long abs = Math.abs(j4 - zze);
                    if (j3 != 0 && abs < 1000000) {
                        long j5 = (zzy * 10) / 100;
                        zze = Math.max(j4 - j5, Math.min(zze, j4 + j5));
                    }
                }
                this.zzz = zzc22;
                this.zzy = zze;
            } else if (playState == 1) {
                zzg(zze);
                return zze;
            }
            return zze;
        }
        audioTrack = audioTrack2;
        long zzc222 = this.zzb.zzc() / 1000;
        zzsk zzskVar22 = this.zzh;
        boolean zzb22 = zzskVar22.zzb();
        if (zzb22) {
        }
        playState = audioTrack.getPlayState();
        if (playState == 3) {
        }
        return zze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfm.zzt(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j) {
        return this.zzv != -9223372036854775807L && j > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j) {
        this.zzw = zzk();
        this.zzu = zzfm.zzt(this.zzb.zzb());
        this.zzx = j;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}

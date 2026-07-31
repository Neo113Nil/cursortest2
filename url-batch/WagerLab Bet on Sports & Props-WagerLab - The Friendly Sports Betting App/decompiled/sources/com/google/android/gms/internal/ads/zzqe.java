package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.media3.common.C;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzqe {
    private final zzqd zza;
    private final int zzb;
    private final zzqf zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzqe(AudioTrack audioTrack, zzqf zzqfVar) {
        this.zza = new zzqd(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzqfVar;
        zzf(0);
    }

    private final void zzf(int i) {
        this.zzd = i;
        long j = 10000;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = C.TIME_UNSET;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzf = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    private final long zzg(long j, float f) {
        zzqd zzqdVar = this.zza;
        return zzh(zzqdVar.zzc(), zzqdVar.zzb(), j, f);
    }

    private final long zzh(long j, long j2, long j3, float f) {
        return zzeo.zzr(j, this.zzb) + zzeo.zzv(j3 - j2, f);
    }

    public final void zza(long j, float f, long j2) {
        if (j - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j;
        zzqd zzqdVar = this.zza;
        boolean zza = zzqdVar.zza();
        if (zza) {
            long zzb = zzqdVar.zzb();
            long zzg = zzg(j, f);
            if (Math.abs(zzb - j) > 5000000) {
                this.zzc.zzc(zzqdVar.zzc(), zzb, j, j2);
                zzf(4);
            } else if (Math.abs(zzg - j2) > 5000000) {
                this.zzc.zzb(zzqdVar.zzc(), zzb, j, j2);
                zzf(4);
            } else if (this.zzd == 4) {
                zzf(0);
            }
        }
        int i = this.zzd;
        if (i == 0) {
            if (!zza) {
                if (j - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzqdVar.zzb() >= this.zze) {
                    this.zzh = zzqdVar.zzc();
                    this.zzi = zzqdVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i != 1) {
            if (i == 2) {
                if (zza) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i == 3 && zza) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!zza) {
            zzf(0);
            return;
        }
        long zzc = zzqdVar.zzc();
        long j3 = this.zzh;
        if (zzc > j3) {
            if (Math.abs(zzg(j, f) - zzh(j3, this.zzi, j, f)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j - this.zze > SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) {
            zzf(3);
        } else {
            this.zzh = zzqdVar.zzc();
            this.zzi = zzqdVar.zzb();
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j, float f) {
        return zzg(j, f);
    }
}

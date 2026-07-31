package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzsk {
    private final zzsj zza;
    private final int zzb;
    private final zztj zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzsk(AudioTrack audioTrack, zztj zztjVar) {
        this.zza = new zzsj(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zztjVar;
        zzf(0);
    }

    private final void zzf(int i) {
        this.zzd = i;
        long j = 10000;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
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
        zzsj zzsjVar = this.zza;
        return zzh(zzsjVar.zzc(), zzsjVar.zzb(), j, f);
    }

    private final long zzh(long j, long j2, long j3, float f) {
        return zzfm.zzu(j, this.zzb) + zzfm.zzy(j3 - j2, f);
    }

    public final void zza(long j, float f, long j2, boolean z) {
        boolean z2;
        if (z || j - this.zzg >= this.zzf) {
            this.zzg = j;
            zzsj zzsjVar = this.zza;
            boolean zza = zzsjVar.zza();
            if (zza) {
                long zzb = zzsjVar.zzb();
                long zzg = zzg(j, f);
                if (Math.abs(zzb - j) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                    zztj zztjVar = this.zzc;
                    long zzc = zzsjVar.zzc();
                    long zzs = ((zzsw) zztjVar).zza.zzs();
                    int length = String.valueOf(zzc).length();
                    int length2 = String.valueOf(zzb).length();
                    int length3 = String.valueOf(j).length();
                    int length4 = length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j2).length() + 2;
                    z2 = zza;
                    StringBuilder sb = new StringBuilder(length4 + String.valueOf(zzs).length());
                    sb.append("Spurious audio timestamp (system clock mismatch): ");
                    sb.append(zzc);
                    sb.append(", ");
                    sb.append(zzb);
                    sb.append(", ");
                    sb.append(j);
                    sb.append(", ");
                    sb.append(j2);
                    sb.append(", ");
                    sb.append(zzs);
                    zzeh.zzc("AudioTrackAudioOutput", sb.toString());
                    zzf(4);
                } else {
                    z2 = zza;
                    if (Math.abs(zzg - j2) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                        zztj zztjVar2 = this.zzc;
                        long zzc2 = zzsjVar.zzc();
                        long zzs2 = ((zzsw) zztjVar2).zza.zzs();
                        int length5 = String.valueOf(zzc2).length();
                        int length6 = String.valueOf(zzb).length();
                        int length7 = String.valueOf(j).length();
                        StringBuilder sb2 = new StringBuilder(length5 + 54 + length6 + 2 + length7 + 2 + String.valueOf(j2).length() + 2 + String.valueOf(zzs2).length());
                        sb2.append("Spurious audio timestamp (frame position mismatch): ");
                        sb2.append(zzc2);
                        sb2.append(", ");
                        sb2.append(zzb);
                        sb2.append(", ");
                        sb2.append(j);
                        sb2.append(", ");
                        sb2.append(j2);
                        sb2.append(", ");
                        sb2.append(zzs2);
                        zzeh.zzc("AudioTrackAudioOutput", sb2.toString());
                        zzf(4);
                    } else if (this.zzd == 4) {
                        zzf(0);
                    }
                }
            } else {
                z2 = zza;
            }
            int i = this.zzd;
            if (i == 0) {
                if (!z2) {
                    if (j - this.zze > 500000) {
                        zzf(3);
                        return;
                    }
                    return;
                } else {
                    if (zzsjVar.zzb() >= this.zze) {
                        this.zzh = zzsjVar.zzc();
                        this.zzi = zzsjVar.zzb();
                        zzf(1);
                        return;
                    }
                    return;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    if (z2) {
                        return;
                    }
                    zzf(0);
                    return;
                } else {
                    if (i == 3 && z2) {
                        zzf(0);
                        return;
                    }
                    return;
                }
            }
            if (!z2) {
                zzf(0);
                return;
            }
            long zzc3 = zzsjVar.zzc();
            long j3 = this.zzh;
            if (zzc3 > j3) {
                if (Math.abs(zzg(j, f) - zzh(j3, this.zzi, j, f)) < 1000) {
                    zzf(2);
                    return;
                }
            }
            if (j - this.zze > 2000000) {
                zzf(3);
            } else {
                this.zzh = zzsjVar.zzc();
                this.zzi = zzsjVar.zzb();
            }
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

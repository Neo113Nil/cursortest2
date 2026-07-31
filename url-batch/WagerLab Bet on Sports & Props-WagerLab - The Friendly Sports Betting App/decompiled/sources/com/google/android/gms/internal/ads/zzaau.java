package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaau {
    private final zzaat zza;
    private final zzaaz zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private float zzj = 1.0f;
    private zzdb zzk = zzdb.zza;

    public zzaau(Context context, zzaat zzaatVar, long j) {
        this.zza = zzaatVar;
        this.zzb = new zzaaz(context);
    }

    private final void zzo(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    public final void zza(int i) {
        if (i == 0) {
            this.zzd = 1;
        } else if (i != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzeo.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = C.TIME_UNSET;
        this.zzb.zzh();
    }

    public final void zzd(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f) {
        this.zzb.zzf(f);
    }

    public final boolean zzf() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzeo.zzq(this.zzk.zzb());
        return i != 3;
    }

    public final void zzg(zzdb zzdbVar) {
        this.zzk = zzdbVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z) {
        if (z && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = C.TIME_UNSET;
            return true;
        }
        if (this.zzh == C.TIME_UNSET) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = C.TIME_UNSET;
        return false;
    }

    public final void zzj(boolean z) {
        this.zzi = z;
        this.zzh = C.TIME_UNSET;
    }

    public final int zzk(long j, long j2, long j3, long j4, boolean z, boolean z2, zzaas zzaasVar) throws zzhz {
        boolean z3;
        zzaasVar.zzc();
        if (this.zzc && this.zze == C.TIME_UNSET) {
            this.zze = j2;
        }
        if (this.zzg != j) {
            this.zzb.zzg(j);
            this.zzg = j;
        }
        long j5 = (long) ((j - j2) / this.zzj);
        if (this.zzc) {
            j5 -= zzeo.zzq(this.zzk.zzb()) - j3;
        }
        zzaasVar.zze(j5);
        if (z && !z2) {
            return 3;
        }
        if (!this.zzl) {
            this.zzm = true;
            if (this.zza.zzan(zzaasVar.zzd(), j2, j3, z2, true)) {
                return 4;
            }
            return (!this.zzc || zzaasVar.zzd() >= 30000) ? 5 : 3;
        }
        long zzd = zzaasVar.zzd();
        if (this.zzh == C.TIME_UNSET || this.zzi) {
            int i = this.zzd;
            if (i == 0) {
                z3 = false;
                if (this.zzc) {
                    return 0;
                }
            } else {
                if (i == 1) {
                    return 0;
                }
                if (i == 2) {
                    z3 = false;
                    if (j2 >= j4) {
                        return 0;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    z3 = false;
                    long zzq = zzeo.zzq(this.zzk.zzb()) - this.zzf;
                    if (this.zzc) {
                        long j6 = this.zze;
                        if (j6 != C.TIME_UNSET && j6 != j2 && zzd < -30000 && zzq > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                            return 0;
                        }
                    }
                }
            }
        } else {
            z3 = false;
        }
        if (!this.zzc || j2 == this.zze) {
            return 5;
        }
        long zzc = this.zzk.zzc();
        zzaasVar.zzg(this.zzb.zzi((zzaasVar.zzd() * 1000) + zzc));
        zzaasVar.zze((zzaasVar.zzf() - zzc) / 1000);
        boolean z4 = (this.zzh == C.TIME_UNSET || this.zzi) ? z3 : true;
        if (this.zza.zzan(zzaasVar.zzd(), j2, j3, z2, z4)) {
            return 4;
        }
        return (zzaasVar.zzd() >= -30000 || z2) ? zzaasVar.zzd() > 50000 ? 5 : 1 : z4 ? 3 : 2;
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = C.TIME_UNSET;
        this.zze = C.TIME_UNSET;
        zzo(1);
        this.zzh = C.TIME_UNSET;
    }

    public final void zzm(int i) {
        this.zzb.zza(i);
    }

    public final void zzn(float f) {
        zzghc.zza(f > 0.0f);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }
}

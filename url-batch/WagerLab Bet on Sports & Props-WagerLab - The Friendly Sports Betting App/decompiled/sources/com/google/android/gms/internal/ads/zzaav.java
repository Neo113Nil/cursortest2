package com.google.android.gms.internal.ads;

import android.util.Range;
import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzaav {
    private long zza;
    private long zzb;
    private double zzc;
    private Range zzd;

    public zzaav(float f) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((Double) range.getUpper()).doubleValue();
        this.zza = C.TIME_UNSET;
        this.zzb = C.TIME_UNSET;
    }

    public final void zza(long j, long j2) {
        double doubleValue;
        zzghc.zza(j != C.TIME_UNSET);
        zzghc.zza(j2 != C.TIME_UNSET);
        long j3 = this.zza;
        if (j3 != C.TIME_UNSET) {
            if (this.zzb != C.TIME_UNSET && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d);
                this.zza = j;
                this.zzb = j2;
            }
        }
        doubleValue = ((Double) this.zzd.getUpper()).doubleValue();
        this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d);
        this.zza = j;
        this.zzb = j2;
    }

    public final long zzb(long j) {
        if (this.zza == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return (long) (this.zzb + ((j - r0) * this.zzc));
    }

    public final void zzc(float f) {
        zzghc.zza(f > 0.0f);
        this.zzd = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((Double) this.zzd.getUpper()).doubleValue();
        this.zza = C.TIME_UNSET;
        this.zzb = C.TIME_UNSET;
    }
}

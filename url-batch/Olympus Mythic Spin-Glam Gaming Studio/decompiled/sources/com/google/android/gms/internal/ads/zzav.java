package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzav {
    public static final zzav zza = new zzav(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzav(@FloatRange float f, @FloatRange float f2) {
        zzguk.zza(f > 0.0f);
        zzguk.zza(f2 > 0.0f);
        this.zzb = f;
        this.zzc = f2;
        this.zzd = Math.round(f * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzav.class == obj.getClass()) {
            zzav zzavVar = (zzav) obj;
            if (this.zzb == zzavVar.zzb && this.zzc == zzavVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.zzc);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.zzb), Float.valueOf(this.zzc)};
        String str = zzfm.zza;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public final long zza(long j) {
        return j * this.zzd;
    }
}

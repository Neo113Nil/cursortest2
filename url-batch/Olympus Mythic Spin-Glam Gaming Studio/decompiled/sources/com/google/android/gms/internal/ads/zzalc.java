package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzalc {
    public final int zza;
    public final int zzb;
    public final float zzc;

    private zzalc(int i, int i2, float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
    }

    static /* synthetic */ zzalc zza(int i) {
        int i2 = i >> 13;
        if (i2 == 0) {
            return null;
        }
        return new zzalc(i2, (i >> 10) & 7, ((i & EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE) * ((i & 512) != 0 ? -1 : 1)) / 10.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzalc)) {
            return false;
        }
        zzalc zzalcVar = (zzalc) obj;
        return this.zza == zzalcVar.zza && this.zzb == zzalcVar.zzb && Float.compare(this.zzc, zzalcVar.zzc) == 0;
    }

    public final int hashCode() {
        return (((this.zza * 31) + this.zzb) * 31) + Float.hashCode(this.zzc);
    }

    public final String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        float f = this.zzc;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 7 + String.valueOf(f).length() + 1);
        sb.append("GainField{name=");
        sb.append(i);
        sb.append(", originator=");
        sb.append(i2);
        sb.append(", gain=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}

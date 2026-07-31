package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzald implements zzao {
    public final float zza;

    @Nullable
    public final zzalc zzb;

    @Nullable
    public final zzalc zzc;

    private zzald(float f, @Nullable zzalc zzalcVar, @Nullable zzalc zzalcVar2) {
        this.zza = f;
        this.zzb = zzalcVar;
        this.zzc = zzalcVar2;
    }

    @Nullable
    public static zzald zzb(float f, int i, int i2) {
        zzalc zza = zzalc.zza(i);
        zzalc zza2 = zzalc.zza(i2);
        if (f <= 0.0f && zza == null && zza2 == null) {
            return null;
        }
        return new zzald(f, zza, zza2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzald)) {
            return false;
        }
        zzald zzaldVar = (zzald) obj;
        return Float.compare(this.zza, zzaldVar.zza) == 0 && Objects.equals(this.zzb, zzaldVar.zzb) && Objects.equals(this.zzc, zzaldVar.zzc);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.zza) * 31;
        zzalc zzalcVar = this.zzb;
        int hashCode2 = (hashCode + (zzalcVar != null ? zzalcVar.hashCode() : 0)) * 31;
        zzalc zzalcVar2 = this.zzc;
        return hashCode2 + (zzalcVar2 != null ? zzalcVar2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        float f = this.zza;
        int length = String.valueOf(f).length();
        StringBuilder sb = new StringBuilder(length + 37 + valueOf.length() + 10 + valueOf2.length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f);
        sb.append(", field 1=");
        sb.append(valueOf);
        sb.append(", field 2=");
        sb.append(valueOf2);
        return sb.toString();
    }
}

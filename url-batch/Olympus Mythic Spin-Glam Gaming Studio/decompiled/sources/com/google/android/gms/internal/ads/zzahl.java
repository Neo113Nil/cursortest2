package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.X3;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahl {
    public static final zzahl zza = new zzahl(0, 0);
    public final long zzb;
    public final long zzc;

    public zzahl(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahl.class == obj.getClass()) {
            zzahl zzahlVar = (zzahl) obj;
            if (this.zzb == zzahlVar.zzb && this.zzc == zzahlVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        int length = String.valueOf(j).length();
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j2).length() + 1);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append(X3.j.e);
        return sb.toString();
    }
}

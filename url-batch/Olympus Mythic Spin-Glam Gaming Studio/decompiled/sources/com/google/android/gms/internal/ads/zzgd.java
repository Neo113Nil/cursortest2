package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzgd implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgd(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgd)) {
            return false;
        }
        zzgd zzgdVar = (zzgd) obj;
        return this.zza == zzgdVar.zza && this.zzb == zzgdVar.zzb && this.zzc == zzgdVar.zzc;
    }

    public final int hashCode() {
        return ((((Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc);
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        long j3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j3).length());
        sb.append("Mp4Timestamp: creation time=");
        sb.append(j);
        sb.append(", modification time=");
        sb.append(j2);
        sb.append(", timescale=");
        sb.append(j3);
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzaji implements zzao {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaji(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaji.class == obj.getClass()) {
            zzaji zzajiVar = (zzaji) obj;
            if (this.zza == zzajiVar.zza && this.zzb == zzajiVar.zzb && this.zzc == zzajiVar.zzc && this.zzd == zzajiVar.zzd && this.zze == zzajiVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Long.hashCode(this.zzb)) * 31) + Long.hashCode(this.zzc)) * 31) + Long.hashCode(this.zzd)) * 31) + Long.hashCode(this.zze);
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        long j3 = this.zzc;
        int length3 = String.valueOf(j3).length();
        long j4 = this.zzd;
        int length4 = String.valueOf(j4).length();
        long j5 = this.zze;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j5).length());
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j3);
        sb.append(", videoStartPosition=");
        sb.append(j4);
        sb.append(", videoSize=");
        sb.append(j5);
        return sb.toString();
    }
}

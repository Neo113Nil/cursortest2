package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzwv {
    public final long zza;
    public final long zzb;

    public zzwv(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwv)) {
            return false;
        }
        zzwv zzwvVar = (zzwv) obj;
        return this.zza == zzwvVar.zza && this.zzb == zzwvVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}

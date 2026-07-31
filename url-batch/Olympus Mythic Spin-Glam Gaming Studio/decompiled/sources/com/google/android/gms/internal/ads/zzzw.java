package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzzw {
    public final long zza;
    public final long zzb;

    public zzzw(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzw)) {
            return false;
        }
        zzzw zzzwVar = (zzzw) obj;
        return this.zza == zzzwVar.zza && this.zzb == zzzwVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}

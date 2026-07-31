package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbgo {
    final long zza;
    final String zzb;
    final int zzc;

    zzbgo(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzbgo)) {
            return false;
        }
        zzbgo zzbgoVar = (zzbgo) obj;
        return zzbgoVar.zza == this.zza && zzbgoVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}

package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzajf {
    private long zza = -9223372036854775807L;
    private long zzb = -9223372036854775807L;
    private boolean zzc;

    @Nullable
    private zzx zzd;

    public final zzajf zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzajf zzb(long j) {
        this.zzb = j;
        return this;
    }

    public final zzajf zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzajf zzd(@Nullable zzx zzxVar) {
        this.zzd = zzxVar;
        return this;
    }

    public final zzajg zze() {
        return new zzajh(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zznb {
    public static final zznb zza;
    private final zzna zzb;

    static {
        zza = zzen.zza < 31 ? new zznb() : new zznb(zzna.zza);
    }

    public zznb() {
        this.zzb = null;
        zzdd.zzf(zzen.zza < 31);
    }

    private zznb(zzna zznaVar) {
        this.zzb = zznaVar;
    }

    public final LogSessionId zza() {
        zzna zznaVar = this.zzb;
        Objects.requireNonNull(zznaVar);
        return zznaVar.zzb;
    }

    public zznb(LogSessionId logSessionId) {
        this.zzb = new zzna(logSessionId);
    }
}

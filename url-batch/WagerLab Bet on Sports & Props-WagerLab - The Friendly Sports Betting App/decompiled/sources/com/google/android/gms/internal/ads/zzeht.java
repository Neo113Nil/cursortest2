package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeht {
    private zzehk zza;

    zzeht() {
    }

    private zzeht(zzehk zzehkVar) {
        this.zza = zzehkVar;
    }

    public static zzeht zza(zzehk zzehkVar) {
        return new zzeht(zzehkVar);
    }

    public final zzehk zzb(Clock clock, zzehm zzehmVar, zzeee zzeeeVar, zzfjv zzfjvVar) {
        zzehk zzehkVar = this.zza;
        return zzehkVar != null ? zzehkVar : new zzehk(clock, zzehmVar, zzeeeVar, zzfjvVar);
    }
}

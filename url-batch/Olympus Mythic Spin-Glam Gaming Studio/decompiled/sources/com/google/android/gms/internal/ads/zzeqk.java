package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzeqk {

    @Nullable
    private zzeqb zza;

    zzeqk() {
    }

    private zzeqk(zzeqb zzeqbVar) {
        this.zza = zzeqbVar;
    }

    public static zzeqk zza(zzeqb zzeqbVar) {
        return new zzeqk(zzeqbVar);
    }

    public final zzeqb zzb(Clock clock, zzeqd zzeqdVar, zzemv zzemvVar, zzfte zzfteVar) {
        zzeqb zzeqbVar = this.zza;
        return zzeqbVar != null ? zzeqbVar : new zzeqb(clock, zzeqdVar, zzemvVar, zzfteVar);
    }
}

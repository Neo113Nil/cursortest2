package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzepl implements zzeve {
    private final Clock zza;
    private final zzfef zzb;

    zzepl(Clock clock, zzfef zzfefVar) {
        this.zza = clock;
        this.zzb = zzfefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return zzfzg.zzi(new zzepm(this.zzb, this.zza.currentTimeMillis()));
    }
}

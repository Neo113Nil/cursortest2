package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzffg implements zzgxi {
    private final zzfff zza;

    public zzffg(zzfff zzfffVar) {
        this.zza = zzfffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgxq.zzb(defaultClock);
        return defaultClock;
    }
}

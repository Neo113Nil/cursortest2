package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfeg implements zzhpx {
    private zzfeg(zzfef zzfefVar) {
    }

    public static zzfeg zza(zzfef zzfefVar) {
        return new zzfeg(zzfefVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzhqf.zzb(defaultClock);
        return defaultClock;
    }
}

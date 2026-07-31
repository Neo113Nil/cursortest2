package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
abstract class zzins implements zzinw {
    private final Map zza;

    zzins(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    final Map zza() {
        return this.zza;
    }
}

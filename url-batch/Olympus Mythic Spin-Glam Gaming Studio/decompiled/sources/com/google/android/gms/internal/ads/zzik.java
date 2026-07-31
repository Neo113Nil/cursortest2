package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzik {
    private final Map zza = new HashMap();

    @Nullable
    private Map zzb;

    public final synchronized Map zza() {
        try {
            if (this.zzb == null) {
                this.zzb = Collections.unmodifiableMap(new HashMap(this.zza));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb;
    }
}

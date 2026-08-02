package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzghk {
    private HashMap zza = new HashMap();

    public final zzghm zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzghm zzghmVar = new zzghm(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzghmVar;
    }
}

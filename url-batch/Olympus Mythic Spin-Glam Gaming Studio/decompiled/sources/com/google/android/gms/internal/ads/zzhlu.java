package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzhlu implements zzhlw {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    zzhlu(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhlw
    public final boolean zza() {
        return this.zza.get();
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgxa implements zzgxc {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    zzgxa(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final boolean zza() {
        return this.zza.get();
    }
}

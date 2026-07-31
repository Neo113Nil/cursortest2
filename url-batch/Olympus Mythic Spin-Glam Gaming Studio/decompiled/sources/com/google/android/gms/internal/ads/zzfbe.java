package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzfbe implements zzfdi {
    private final zzflc zza;

    zzfbe(zzflc zzflcVar) {
        this.zza = zzflcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zza(new zzfbf(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 25;
    }
}

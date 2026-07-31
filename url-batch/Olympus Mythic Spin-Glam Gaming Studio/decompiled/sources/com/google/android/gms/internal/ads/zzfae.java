package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzfae implements zzfdi {
    private final zzhdi zza;

    public zzfae(zzhdi zzhdiVar) {
        this.zza = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(zzfad.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 20;
    }
}

package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzepv implements zzevo {
    private final zzffg zza;

    zzepv(zzgcu zzgcuVar, zzffg zzffgVar) {
        this.zza = zzffgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 58;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return zzgcj.zzh(new zzepw(this.zza.zzp));
    }
}

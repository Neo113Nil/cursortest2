package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzesl implements zzeup {
    private final zzfci zza;

    zzesl(zzfci zzfciVar) {
        this.zza = zzfciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzesm(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 25;
    }
}

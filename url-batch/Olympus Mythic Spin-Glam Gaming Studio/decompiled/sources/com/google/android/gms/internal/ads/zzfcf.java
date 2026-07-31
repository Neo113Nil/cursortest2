package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfcf implements zzfdi {
    private final String zza;

    zzfcf(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zza(new zzfcg(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 31;
    }
}

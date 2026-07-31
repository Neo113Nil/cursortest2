package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfvm implements zzhpx {
    private final zzhqg zza;

    private zzfvm(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzfvm zza(zzhqg zzhqgVar) {
        return new zzfvm(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfvu((ExecutorService) this.zza.zzb());
    }
}

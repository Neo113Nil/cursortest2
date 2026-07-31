package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgcp implements zzhpx {
    private final zzhqg zza;

    private zzgcp(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzgcp zza(zzhqg zzhqgVar) {
        return new zzgcp(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "dgd"), "pcbc");
    }
}

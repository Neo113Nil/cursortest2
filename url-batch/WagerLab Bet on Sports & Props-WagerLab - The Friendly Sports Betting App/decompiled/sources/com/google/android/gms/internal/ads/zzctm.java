package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzctm implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzctm(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzctm zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzctm(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr((zzdaj) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}

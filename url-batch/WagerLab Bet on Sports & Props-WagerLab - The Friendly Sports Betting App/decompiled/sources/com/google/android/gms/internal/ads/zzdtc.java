package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdtc implements zzhpx {
    private final zzhqg zza;

    private zzdtc(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdtc zza(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdtc(zzdtbVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zza = zzdtb.zza((zzdtl) this.zza.zzb(), zzfgc.zzc());
        zzhqf.zzb(zza);
        return zza;
    }
}

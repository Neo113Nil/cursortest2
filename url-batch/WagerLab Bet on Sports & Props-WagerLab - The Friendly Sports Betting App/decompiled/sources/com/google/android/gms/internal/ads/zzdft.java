package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdft implements zzhpx {
    private final zzhqg zza;

    private zzdft(zzdfe zzdfeVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdft zza(zzdfe zzdfeVar, zzhqg zzhqgVar) {
        return new zzdft(zzdfeVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzddr((zzcuj) this.zza.zzb(), zzbzh.zzg));
        zzhqf.zzb(singleton);
        return singleton;
    }
}

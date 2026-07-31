package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdfs implements zzhpx {
    private final zzdfe zza;
    private final zzhqg zzb;

    private zzdfs(zzdfe zzdfeVar, zzhqg zzhqgVar) {
        this.zza = zzdfeVar;
        this.zzb = zzhqgVar;
    }

    public static zzdfs zza(zzdfe zzdfeVar, zzhqg zzhqgVar) {
        return new zzdfs(zzdfeVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zze = this.zza.zze((zzcuj) this.zzb.zzb());
        zzhqf.zzb(zze);
        return zze;
    }
}

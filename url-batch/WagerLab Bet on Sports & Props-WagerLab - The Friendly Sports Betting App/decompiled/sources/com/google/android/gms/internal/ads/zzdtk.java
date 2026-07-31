package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdtk implements zzhpx {
    private final zzhqg zza;

    private zzdtk(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
    }

    public static zzdtk zza(zzdtb zzdtbVar, zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdtk(zzdtbVar, zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set zzi = zzdtb.zzi((zzdtl) this.zza.zzb(), zzfgc.zzc());
        zzhqf.zzb(zzi);
        return zzi;
    }
}

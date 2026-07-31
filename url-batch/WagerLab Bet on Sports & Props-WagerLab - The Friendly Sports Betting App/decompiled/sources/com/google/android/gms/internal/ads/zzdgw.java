package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzdgw implements zzcqv {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhqm zzd;
    private final zzdje zze;

    zzdgw(Map map, Map map2, Map map3, zzhqm zzhqmVar, zzdje zzdjeVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhqmVar;
        this.zze = zzdjeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final zzedz zza(int i, String str) {
        zzedz zza;
        zzedz zzedzVar = (zzedz) this.zza.get(str);
        if (zzedzVar != null) {
            return zzedzVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzegf zzegfVar = (zzegf) this.zzc.get(str);
            if (zzegfVar != null) {
                return zzcra.zza(zzegfVar);
            }
            zza = (zzedz) this.zzb.get(str);
            if (zza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zza = ((zzcqv) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return zzcra.zzb(zza);
    }
}

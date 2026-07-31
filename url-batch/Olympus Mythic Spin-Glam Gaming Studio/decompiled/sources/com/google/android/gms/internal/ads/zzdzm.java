package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdzm implements zzfqj {
    private final Map zza;
    private final zzbif zzb;

    zzdzm(zzbif zzbifVar, Map map) {
        this.zza = map;
        this.zzb = zzbifVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdL(zzfqc zzfqcVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdM(zzfqc zzfqcVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfqcVar)) {
            this.zzb.zzc(((zzdzl) map.get(zzfqcVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdN(zzfqc zzfqcVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfqcVar)) {
            this.zzb.zzc(((zzdzl) map.get(zzfqcVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdO(zzfqc zzfqcVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfqcVar)) {
            this.zzb.zzc(((zzdzl) map.get(zzfqcVar)).zzb);
        }
    }
}

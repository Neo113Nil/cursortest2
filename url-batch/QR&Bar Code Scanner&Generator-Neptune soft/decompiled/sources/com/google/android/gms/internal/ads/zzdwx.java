package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdwx implements zzfii {
    private final Map zza;
    private final zzbep zzb;

    zzdwx(zzbep zzbepVar, Map map) {
        this.zza = map;
        this.zzb = zzbepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbF(zzfib zzfibVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbG(zzfib zzfibVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfibVar)) {
            this.zzb.zzc(((zzdww) this.zza.get(zzfibVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzc(zzfib zzfibVar, String str) {
        if (this.zza.containsKey(zzfibVar)) {
            this.zzb.zzc(((zzdww) this.zza.get(zzfibVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzd(zzfib zzfibVar, String str) {
        if (this.zza.containsKey(zzfibVar)) {
            this.zzb.zzc(((zzdww) this.zza.get(zzfibVar)).zzb);
        }
    }
}

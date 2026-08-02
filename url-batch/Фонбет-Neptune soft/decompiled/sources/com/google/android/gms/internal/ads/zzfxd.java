package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfxd extends zzfxg {
    zzfxd() {
        super(null);
    }

    static final zzfxg zzf(int i) {
        zzfxg zzfxgVar;
        zzfxg zzfxgVar2;
        zzfxg zzfxgVar3;
        if (i < 0) {
            zzfxgVar3 = zzfxg.zzb;
            return zzfxgVar3;
        }
        if (i > 0) {
            zzfxgVar2 = zzfxg.zzc;
            return zzfxgVar2;
        }
        zzfxgVar = zzfxg.zza;
        return zzfxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zzd(boolean z, boolean z2) {
        return zzf(zzgal.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxg
    public final zzfxg zze(boolean z, boolean z2) {
        return zzf(zzgal.zza(z2, z));
    }
}

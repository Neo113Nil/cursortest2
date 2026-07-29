package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfqu extends zzfqw {
    zzfqu() {
        super(null);
    }

    static final zzfqw zzf(int i) {
        zzfqw zzfqwVar;
        zzfqw zzfqwVar2;
        zzfqw zzfqwVar3;
        if (i < 0) {
            zzfqwVar3 = zzfqw.zzb;
            return zzfqwVar3;
        }
        if (i > 0) {
            zzfqwVar2 = zzfqw.zzc;
            return zzfqwVar2;
        }
        zzfqwVar = zzfqw.zza;
        return zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzd(boolean z, boolean z2) {
        return zzf(zzftl.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zze(boolean z, boolean z2) {
        return zzf(zzftl.zza(false, false));
    }
}

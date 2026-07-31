package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgjn extends zzgjp {
    zzgjn() {
        super(null);
    }

    static final zzgjp zzf(int i) {
        zzgjp zzgjpVar;
        zzgjp zzgjpVar2;
        zzgjp zzgjpVar3;
        if (i < 0) {
            zzgjpVar3 = zzgjp.zzb;
            return zzgjpVar3;
        }
        if (i > 0) {
            zzgjpVar2 = zzgjp.zzc;
            return zzgjpVar2;
        }
        zzgjpVar = zzgjp.zza;
        return zzgjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final int zze() {
        return 0;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfsf extends zzfsj {
    final /* synthetic */ Comparator zza;

    zzfsf(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    final Map zza() {
        return new TreeMap(this.zza);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzbgj implements Comparator {
    zzbgj(zzbgl zzbglVar) {
        Objects.requireNonNull(zzbglVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbgo zzbgoVar = (zzbgo) obj;
        zzbgo zzbgoVar2 = (zzbgo) obj2;
        int i = zzbgoVar.zzc - zzbgoVar2.zzc;
        return i != 0 ? i : Long.compare(zzbgoVar.zza, zzbgoVar2.zza);
    }
}

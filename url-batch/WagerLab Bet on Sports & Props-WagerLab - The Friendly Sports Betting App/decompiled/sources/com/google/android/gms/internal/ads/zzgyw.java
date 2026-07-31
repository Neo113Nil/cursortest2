package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgyw implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    zzgyw(zzgyz zzgyzVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzgyzVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzgyy(this.zza.iterator(), this.zzb.iterator(), null);
    }
}

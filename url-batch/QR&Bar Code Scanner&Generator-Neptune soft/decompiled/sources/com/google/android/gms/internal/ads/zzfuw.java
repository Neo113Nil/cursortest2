package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfuw extends AbstractCollection {
    final /* synthetic */ zzfux zza;

    zzfuw(zzfux zzfuxVar) {
        this.zza = zzfuxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfux zzfuxVar = this.zza;
        Map zzl = zzfuxVar.zzl();
        return zzl != null ? zzl.values().iterator() : new zzfur(zzfuxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}

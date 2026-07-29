package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfqq extends AbstractCollection {
    final /* synthetic */ zzfqr zza;

    zzfqq(zzfqr zzfqrVar) {
        this.zza = zzfqrVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfqr zzfqrVar = this.zza;
        Map zzl = zzfqrVar.zzl();
        return zzl != null ? zzl.values().iterator() : new zzfql(zzfqrVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}

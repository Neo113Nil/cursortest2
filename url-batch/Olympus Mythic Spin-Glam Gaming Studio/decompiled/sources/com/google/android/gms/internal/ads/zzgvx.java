package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
class zzgvx extends zzgvs implements SortedSet {
    final /* synthetic */ zzgwc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvx(zzgwc zzgwcVar, SortedMap sortedMap) {
        super(zzgwcVar, sortedMap);
        Objects.requireNonNull(zzgwcVar);
        this.zzc = zzgwcVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzgvx(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzgvx(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzgvx(this.zzc, zza().tailMap(obj));
    }

    SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}

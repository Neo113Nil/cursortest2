package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgwq extends AbstractSet {
    final /* synthetic */ zzgwt zza;

    /* synthetic */ zzgwq(zzgwt zzgwtVar, byte[] bArr) {
        Objects.requireNonNull(zzgwtVar);
        this.zza = zzgwtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgwt zzgwtVar = this.zza;
        Map zzc = zzgwtVar.zzc();
        return zzc != null ? zzc.keySet().iterator() : new zzgwl(zzgwtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        zzgwt zzgwtVar = this.zza;
        Map zzc = zzgwtVar.zzc();
        if (zzc != null) {
            return zzc.keySet().remove(obj);
        }
        Object zzj = zzgwtVar.zzj(obj);
        obj2 = zzgwt.zzd;
        return zzj != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}

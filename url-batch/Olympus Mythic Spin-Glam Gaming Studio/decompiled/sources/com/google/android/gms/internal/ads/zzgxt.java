package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzgxt extends zzgxi {
    private final transient zzgxu zza;

    zzgxt(zzgxu zzgxuVar) {
        this.zza = zzgxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgxr(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    /* renamed from: zza */
    public final zzhaa iterator() {
        return new zzgxr(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgxi
    final int zzg(Object[] objArr, int i) {
        zzhab listIterator = ((zzgxm) this.zza.map.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((zzgxi) listIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}

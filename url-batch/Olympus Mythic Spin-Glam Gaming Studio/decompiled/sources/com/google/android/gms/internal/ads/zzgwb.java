package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
class zzgwb extends zzgvz implements List {
    final /* synthetic */ zzgwc zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgwb(zzgwc zzgwcVar, Object obj, List list, zzgvz zzgvzVar) {
        super(zzgwcVar, obj, list, zzgvzVar);
        Objects.requireNonNull(zzgwcVar);
        this.zzf = zzgwcVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzgwc zzgwcVar = this.zzf;
        zzgwcVar.zzq(zzgwcVar.zzp() + 1);
        if (isEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzgwc zzgwcVar = this.zzf;
        zzgwcVar.zzq(zzgwcVar.zzp() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgwa(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zza();
        Object remove = ((List) this.zzb).remove(i);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zza();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zza();
        List subList = ((List) this.zzb).subList(i, i2);
        zzgvz zzgvzVar = this.zzc;
        if (zzgvzVar == null) {
            zzgvzVar = this;
        }
        return this.zzf.zzg(this.zza, subList, zzgvzVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zza();
        return new zzgwa(this, i);
    }
}

package yads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class rx extends AbstractSet {
    public final /* synthetic */ ux b;

    public rx(ux uxVar) {
        this.b = uxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ux uxVar = this.b;
        Map a = uxVar.a();
        return a != null ? a.keySet().iterator() : new mx(uxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map a = this.b.a();
        return a != null ? a.keySet().remove(obj) : this.b.b(obj) != ux.k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}

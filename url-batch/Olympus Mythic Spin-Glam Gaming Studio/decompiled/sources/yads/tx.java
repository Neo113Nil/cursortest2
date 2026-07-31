package yads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class tx extends AbstractCollection {
    public final /* synthetic */ ux b;

    public tx(ux uxVar) {
        this.b = uxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ux uxVar = this.b;
        Map a = uxVar.a();
        return a != null ? a.values().iterator() : new ox(uxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.size();
    }
}

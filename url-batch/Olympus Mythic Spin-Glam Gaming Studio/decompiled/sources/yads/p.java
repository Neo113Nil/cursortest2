package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class p extends ii1 {
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y yVar, Map map) {
        super(map);
        this.c = yVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            o oVar = (o) it;
            if (!oVar.hasNext()) {
                return;
            }
            oVar.next();
            oVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new o(this, this.b.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.b.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.c.f -= i;
        } else {
            i = 0;
        }
        return i > 0;
    }
}

package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a0 extends AbstractCollection {
    public final /* synthetic */ gy1 b;

    public a0(gy1 gy1Var) {
        this.b = gy1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        gy1 gy1Var = this.b;
        Iterator it = gy1Var.e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        gy1Var.e.clear();
        gy1Var.f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = ((ji1) this.b.a().values()).iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new j(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.f;
    }
}

package yads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes6.dex */
public final class yy2 extends xy2 implements SortedSet {
    public yy2(SortedSet sortedSet, ig2 ig2Var) {
        super(sortedSet, ig2Var);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.b.iterator();
        ig2 ig2Var = this.c;
        it.getClass();
        ig2Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ig2Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new yy2(((SortedSet) this.b).headSet(obj), this.c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.b;
        while (true) {
            Object last = sortedSet.last();
            if (this.c.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new yy2(((SortedSet) this.b).subSet(obj, obj2), this.c);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new yy2(((SortedSet) this.b).tailSet(obj), this.c);
    }
}

package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class w extends r {
    public abstract w b(int i, Object obj);

    public abstract w c(Object obj);

    @Override // defpackage.i, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.i, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public w d(Collection collection) {
        tf0 e = e();
        e.addAll(collection);
        return e.c();
    }

    public abstract tf0 e();

    public abstract w f(v vVar);

    public abstract w g(int i);

    public abstract w h(int i, Object obj);

    @Override // defpackage.r, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.r, java.util.List
    public final List subList(int i, int i2) {
        return new lx(this, i, i2);
    }
}

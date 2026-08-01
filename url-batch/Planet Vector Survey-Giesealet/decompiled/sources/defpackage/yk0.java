package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yk0 extends r {
    public final List d;

    public yk0(List list) {
        list.getClass();
        this.d = list;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= px0.B(this)) {
            return this.d.get(px0.B(this) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new ez(0, px0.B(this), 1) + "].");
    }

    @Override // defpackage.r, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new xk0(this, 0);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator() {
        return new xk0(this, 0);
    }

    @Override // defpackage.r, java.util.List
    public final ListIterator listIterator(int i) {
        return new xk0(this, i);
    }
}

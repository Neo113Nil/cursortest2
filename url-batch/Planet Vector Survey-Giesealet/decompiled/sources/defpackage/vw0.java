package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vw0 implements Iterator, j00 {
    public final Iterator d;
    public final /* synthetic */ tu0 e;

    public vw0(tu0 tu0Var) {
        this.e = tu0Var;
        this.d = tu0Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.e.c.c(this.d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

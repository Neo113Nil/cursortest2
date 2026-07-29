package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes.dex */
public final class JO implements Iterator {
    public final Stack h = new Stack();
    public C2271yA i;

    public JO(AbstractC1281j9 abstractC1281j9) {
        while (abstractC1281j9 instanceof LO) {
            LO lo = (LO) abstractC1281j9;
            this.h.push(lo);
            abstractC1281j9 = lo.j;
        }
        this.i = (C2271yA) abstractC1281j9;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2271yA next() {
        C2271yA c2271yA;
        C2271yA c2271yA2 = this.i;
        if (c2271yA2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            Stack stack = this.h;
            if (!stack.isEmpty()) {
                Object obj = ((LO) stack.pop()).k;
                while (obj instanceof LO) {
                    LO lo = (LO) obj;
                    stack.push(lo);
                    obj = lo.j;
                }
                c2271yA = (C2271yA) obj;
                if (c2271yA.i.length != 0) {
                    break;
                }
            } else {
                c2271yA = null;
                break;
            }
        }
        this.i = c2271yA;
        return c2271yA2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class i10 implements Iterator, ed, vo {
    public int f;
    public Object g;
    public Iterator h;
    public ed i;

    @Override // defpackage.ed
    public final sh a() {
        return sh.f;
    }

    @Override // defpackage.ed
    public final void b(Object obj) {
        vv.X(obj);
        this.f = 4;
    }

    public final RuntimeException c() {
        int i = this.f;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.h;
                it.getClass();
                if (it.hasNext()) {
                    this.f = 2;
                    return true;
                }
                this.h = null;
            }
            this.f = 5;
            ed edVar = this.i;
            edVar.getClass();
            this.i = null;
            edVar.b(tg.m);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f = 1;
            Iterator it = this.h;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.f = 0;
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

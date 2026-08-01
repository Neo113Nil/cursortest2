package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jq0 implements Iterator, kj, j00 {
    public int d;
    public Object e;
    public kj f;

    public final RuntimeException a() {
        int i = this.d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.d);
    }

    public final void b(Object obj, tk0 tk0Var) {
        this.e = obj;
        this.d = 3;
        this.f = tk0Var;
    }

    @Override // defpackage.kj
    public final rj getContext() {
        return up.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.d;
            if (i != 0) {
                break;
            }
            this.d = 5;
            kj kjVar = this.f;
            kjVar.getClass();
            this.f = null;
            kjVar.resumeWith(ky0.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            g8.k();
            return null;
        }
        if (i == 2) {
            this.d = 1;
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.d = 0;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.kj
    public final void resumeWith(Object obj) {
        rg0.u(obj);
        this.d = 4;
    }
}

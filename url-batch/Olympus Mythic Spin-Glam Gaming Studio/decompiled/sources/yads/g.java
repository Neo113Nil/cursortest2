package yads;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class g extends wa3 {
    public int b = 2;
    public Object c;

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int a = pg0.a(i);
        if (a == 0) {
            return true;
        }
        if (a == 2) {
            return false;
        }
        this.b = 4;
        this.c = a();
        if (this.b == 3) {
            return false;
        }
        this.b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        Object obj = this.c;
        this.c = null;
        return obj;
    }
}

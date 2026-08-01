package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class em implements Iterator, vo {
    public Object f;
    public int g = -2;
    public final /* synthetic */ we h;

    public em(we weVar) {
        this.h = weVar;
    }

    public final void a() {
        Object a;
        int i = this.g;
        we weVar = this.h;
        if (i == -2) {
            a = ((v1) weVar.b).a();
        } else {
            h hVar = (h) weVar.c;
            this.f.getClass();
            a = ((v1) hVar.g).a();
        }
        this.f = a;
        this.g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g < 0) {
            a();
        }
        return this.g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g < 0) {
            a();
        }
        if (this.g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f;
        obj.getClass();
        this.g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

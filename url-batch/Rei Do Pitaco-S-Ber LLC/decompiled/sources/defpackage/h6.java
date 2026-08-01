package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h6 implements Iterator, vo {
    public int f;
    public int g;
    public boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h6(l6 l6Var, int i) {
        this(l6Var.h);
        this.i = i;
        switch (i) {
            case 1:
                this.j = l6Var;
                this(l6Var.h);
                break;
            default:
                this.j = l6Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.g;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                f = ((l6) obj).f(i);
                break;
            case 1:
                f = ((l6) obj).i(i);
                break;
            default:
                f = ((n6) obj).g[i];
                break;
        }
        this.g++;
        this.h = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            l8.u("Call next() before removing an element.");
            return;
        }
        int i = this.g - 1;
        this.g = i;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                ((l6) obj).g(i);
                break;
            case 1:
                ((l6) obj).g(i);
                break;
            default:
                ((n6) obj).a(i);
                break;
        }
        this.f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h6(n6 n6Var) {
        this(n6Var.h);
        this.i = 2;
        this.j = n6Var;
    }

    public h6(int i) {
        this.f = i;
    }
}

package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.tB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1942tB extends AbstractC2074vB implements Iterator, InterfaceC1594nw {
    public final /* synthetic */ int l;

    public C1942tB(C2140wB c2140wB, int i) {
        this.l = i;
        AbstractC0048Bt.n(c2140wB, "map");
        this.k = c2140wB;
        this.i = -1;
        this.j = c2140wB.f238o;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.l) {
            case 0:
                b();
                int i = this.h;
                C2140wB c2140wB = (C2140wB) this.k;
                if (i >= c2140wB.m) {
                    throw new NoSuchElementException();
                }
                this.h = i + 1;
                this.i = i;
                C2008uB c2008uB = new C2008uB(c2140wB, i);
                f();
                return c2008uB;
            case 1:
                b();
                int i2 = this.h;
                C2140wB c2140wB2 = (C2140wB) this.k;
                if (i2 >= c2140wB2.m) {
                    throw new NoSuchElementException();
                }
                this.h = i2 + 1;
                this.i = i2;
                Object obj = c2140wB2.h[i2];
                f();
                return obj;
            default:
                b();
                int i3 = this.h;
                C2140wB c2140wB3 = (C2140wB) this.k;
                if (i3 >= c2140wB3.m) {
                    throw new NoSuchElementException();
                }
                this.h = i3 + 1;
                this.i = i3;
                Object[] objArr = c2140wB3.i;
                AbstractC0048Bt.k(objArr);
                Object obj2 = objArr[this.i];
                f();
                return obj2;
        }
    }
}

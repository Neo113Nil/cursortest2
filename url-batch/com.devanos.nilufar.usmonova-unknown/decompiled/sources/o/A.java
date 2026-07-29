package o;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class A extends B implements RandomAccess {
    public final B h;
    public final int i;
    public final int j;

    public A(B b, int i, int i2) {
        this.h = b;
        this.i = i;
        PX.v(i, i2, b.j());
        this.j = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.j;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC1888sN.g(i, i2, "index: ", ", size: "));
        }
        return this.h.get(this.i + i);
    }

    @Override // o.r
    public final int j() {
        return this.j;
    }

    @Override // o.B, java.util.List
    public final List subList(int i, int i2) {
        PX.v(i, i2, this.j);
        int i3 = this.i;
        return new A(this.h, i + i3, i3 + i2);
    }
}

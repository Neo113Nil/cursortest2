package o;

import java.util.Iterator;

/* renamed from: o.jG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288jG extends J6 {
    public final C1869s4 h;
    public final int i;

    public C1288jG(int i, C1869s4 c1869s4) {
        this.h = c1869s4;
        this.i = i;
    }

    @Override // o.J6
    public final Object get(int i) {
        if (i == this.i) {
            return this.h;
        }
        return null;
    }

    @Override // o.J6, java.lang.Iterable
    public final Iterator iterator() {
        return new RQ(2, this);
    }

    @Override // o.J6
    public final int j() {
        return 1;
    }

    @Override // o.J6
    public final void k(int i, C1869s4 c1869s4) {
        throw new IllegalStateException();
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mf0 implements Iterator, j00 {
    public final /* synthetic */ int d = 1;
    public final Iterator e;

    public mf0(jf0 jf0Var) {
        lx0[] lx0VarArr = new lx0[8];
        for (int i = 0; i < 8; i++) {
            lx0VarArr[i] = new nx0(this);
        }
        this.e = new kf0(jf0Var, lx0VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                return ((kf0) this.e).f;
            default:
                return this.e.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                return (Map.Entry) ((kf0) this.e).next();
            default:
                return (gz0) this.e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                ((kf0) this.e).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public mf0(ez0 ez0Var) {
        this.e = ez0Var.m.iterator();
    }
}

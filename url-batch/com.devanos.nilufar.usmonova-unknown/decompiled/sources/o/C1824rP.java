package o;

import java.util.Iterator;

/* renamed from: o.rP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1824rP extends AbstractC2022uP implements Iterator {
    public C1890sP h;
    public C1890sP i;
    public final /* synthetic */ int j;

    public C1824rP(C1890sP c1890sP, C1890sP c1890sP2, int i) {
        this.j = i;
        this.h = c1890sP2;
        this.i = c1890sP;
    }

    @Override // o.AbstractC2022uP
    public final void a(C1890sP c1890sP) {
        C1890sP c1890sP2;
        C1890sP c1890sP3 = null;
        if (this.h == c1890sP && c1890sP == this.i) {
            this.i = null;
            this.h = null;
        }
        C1890sP c1890sP4 = this.h;
        if (c1890sP4 == c1890sP) {
            switch (this.j) {
                case 0:
                    c1890sP2 = c1890sP4.k;
                    break;
                default:
                    c1890sP2 = c1890sP4.j;
                    break;
            }
            this.h = c1890sP2;
        }
        C1890sP c1890sP5 = this.i;
        if (c1890sP5 == c1890sP) {
            C1890sP c1890sP6 = this.h;
            if (c1890sP5 != c1890sP6 && c1890sP6 != null) {
                c1890sP3 = b(c1890sP5);
            }
            this.i = c1890sP3;
        }
    }

    public final C1890sP b(C1890sP c1890sP) {
        switch (this.j) {
            case 0:
                return c1890sP.j;
            default:
                return c1890sP.k;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1890sP c1890sP = this.i;
        C1890sP c1890sP2 = this.h;
        this.i = (c1890sP == c1890sP2 || c1890sP2 == null) ? null : b(c1890sP);
        return c1890sP;
    }
}

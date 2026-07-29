package o;

import java.util.Iterator;

/* renamed from: o.tP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1956tP extends AbstractC2022uP implements Iterator {
    public C1890sP h;
    public boolean i = true;
    public final /* synthetic */ C2088vP j;

    public C1956tP(C2088vP c2088vP) {
        this.j = c2088vP;
    }

    @Override // o.AbstractC2022uP
    public final void a(C1890sP c1890sP) {
        C1890sP c1890sP2 = this.h;
        if (c1890sP == c1890sP2) {
            C1890sP c1890sP3 = c1890sP2.k;
            this.h = c1890sP3;
            this.i = c1890sP3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.i) {
            return this.j.h != null;
        }
        C1890sP c1890sP = this.h;
        return (c1890sP == null || c1890sP.j == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.i) {
            this.i = false;
            this.h = this.j.h;
        } else {
            C1890sP c1890sP = this.h;
            this.h = c1890sP != null ? c1890sP.j : null;
        }
        return this.h;
    }
}

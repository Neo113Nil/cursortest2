package o;

import java.util.Iterator;

/* renamed from: o.rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1844rj implements NQ, InterfaceC1910sj {
    public final NQ a;
    public final int b;

    public C1844rj(NQ nq, int i) {
        AbstractC0048Bt.n(nq, "sequence");
        this.a = nq;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o.InterfaceC1910sj
    public final NQ a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new C1844rj(this, i) : new C1844rj(this.a, i2);
    }

    @Override // o.NQ
    public final Iterator iterator() {
        return new C1779qj(this);
    }
}

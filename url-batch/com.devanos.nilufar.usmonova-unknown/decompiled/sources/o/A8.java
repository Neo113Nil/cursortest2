package o;

import java.util.List;

/* loaded from: classes.dex */
public final class A8 implements LB {
    public final C1150h8 a;
    public final boolean b;

    public A8(C1150h8 c1150h8, boolean z) {
        this.a = c1150h8;
        this.b = z;
    }

    @Override // o.LB
    public final M5 a(AbstractC1415lB abstractC1415lB, List list, long j) {
        long n;
        if (list.isEmpty()) {
            return abstractC1415lB.T(C0603Xd.f(j), C0603Xd.e(j), I2.m);
        }
        if (this.b) {
            n = j;
        } else {
            int d = C0603Xd.d(j);
            int c = C0603Xd.c(j);
            if (d < 0) {
                throw new IllegalArgumentException(AbstractC1888sN.h(d, "maxWidth(", ") must be >= minWidth(0)"));
            }
            if (c < 0) {
                throw new IllegalArgumentException(AbstractC1888sN.h(c, "maxHeight(", ") must be >= minHeight(0)"));
            }
            n = AbstractC0868ct.n(0, d, 0, c);
        }
        if (list.size() == 1) {
            IB ib = (IB) list.get(0);
            ib.g();
            AbstractC0700aI a = ib.a(n);
            int max = Math.max(C0603Xd.f(j), a.b);
            int max2 = Math.max(C0603Xd.e(j), a.c);
            return abstractC1415lB.T(max, max2, new C2269y8(a, ib, abstractC1415lB, max, max2, this));
        }
        AbstractC0700aI[] abstractC0700aIArr = new AbstractC0700aI[list.size()];
        C1230iM c1230iM = new C1230iM();
        c1230iM.h = C0603Xd.f(j);
        C1230iM c1230iM2 = new C1230iM();
        c1230iM2.h = C0603Xd.e(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            IB ib2 = (IB) list.get(i);
            ib2.g();
            AbstractC0700aI a2 = ib2.a(n);
            abstractC0700aIArr[i] = a2;
            c1230iM.h = Math.max(c1230iM.h, a2.b);
            c1230iM2.h = Math.max(c1230iM2.h, a2.c);
        }
        return abstractC1415lB.T(c1230iM.h, c1230iM2.h, new C2335z8(abstractC0700aIArr, list, abstractC1415lB, c1230iM, c1230iM2, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A8)) {
            return false;
        }
        A8 a8 = (A8) obj;
        return this.a.equals(a8.a) && this.b == a8.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}

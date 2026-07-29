package o;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: o.dy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0938dy {
    j(true),
    k(true),
    l(false),
    m(true),
    n(true),
    f159o(true),
    p(true),
    q(true),
    r(true),
    s(true),
    t(true),
    u(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(false),
    v(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    w(false),
    x(false),
    y(false),
    z(false),
    A(false),
    B(false),
    C(false),
    D(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF313(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF324(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF335(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF346(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF357(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF368(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF379(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF390(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF401(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF412(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF423(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF435(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF447(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF458(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF469(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF480(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF491(false);

    public static final HashMap i = new HashMap();
    public final boolean h;

    static {
        for (EnumC0938dy enumC0938dy : values()) {
            i.put(enumC0938dy.name(), enumC0938dy);
        }
        EnumC0938dy[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC0938dy enumC0938dy2 : values) {
            if (enumC0938dy2.h) {
                arrayList.add(enumC0938dy2);
            }
        }
        AbstractC0720ac.M0(arrayList);
        P6.u0(values());
        EnumC0938dy enumC0938dy3 = k;
        EnumC0938dy enumC0938dy4 = j;
        AbstractC0868ct.K(enumC0938dy3, enumC0938dy4);
        AbstractC0868ct.K(D, enumC0938dy4);
        AbstractC0868ct.K(w, enumC0938dy4);
        EnumC0938dy enumC0938dy5 = z;
        EnumC0938dy enumC0938dy6 = x;
        AbstractC0868ct.K(enumC0938dy5, enumC0938dy6, enumC0938dy4);
        AbstractC0868ct.K(y, enumC0938dy6, enumC0938dy4);
        AbstractC0868ct.K(A, enumC0938dy4);
        AbstractC0868ct.K(B, enumC0938dy4);
        EnumC0938dy enumC0938dy7 = C;
        EnumC0938dy enumC0938dy8 = m;
        EnumC0938dy enumC0938dy9 = n;
        AbstractC0868ct.K(enumC0938dy7, enumC0938dy8, enumC0938dy9);
        EnumC0938dy enumC0938dy10 = t;
        AbstractC0868ct.J(enumC0938dy10);
        EnumC0938dy enumC0938dy11 = s;
        AbstractC0868ct.J(enumC0938dy11);
        AbstractC0868ct.J(r);
        EnumC0938dy enumC0938dy12 = v;
        AbstractC0868ct.J(enumC0938dy12);
        EnumC1474m4 enumC1474m4 = EnumC1474m4.f197o;
        EnumC0938dy enumC0938dy13 = p;
        EB.G(new C1619oH(enumC1474m4, enumC0938dy13), new C1619oH(EnumC1474m4.i, enumC0938dy9), new C1619oH(EnumC1474m4.k, enumC0938dy8), new C1619oH(EnumC1474m4.j, enumC0938dy12), new C1619oH(EnumC1474m4.l, enumC0938dy11), new C1619oH(EnumC1474m4.m, enumC0938dy10), new C1619oH(EnumC1474m4.n, enumC0938dy13), new C1619oH(EnumC1474m4.p, enumC0938dy13), new C1619oH(EnumC1474m4.q, enumC0938dy9));
    }

    EnumC0938dy(boolean z2) {
        this.h = z2;
    }
}

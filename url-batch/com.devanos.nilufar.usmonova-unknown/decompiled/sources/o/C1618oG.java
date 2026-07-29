package o;

import java.util.ArrayList;

/* renamed from: o.oG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1618oG extends JG {
    public static final C1618oG c = new C1618oG(0, 2, 1);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        C1471m2 c1471m2 = (C1471m2) c0575Wb.c(0);
        Object c2 = c0575Wb.c(1);
        if (c2 instanceof C0836cN) {
            ((ArrayList) c1970td.c).add(((C0836cN) c2).a);
        }
        if (c0972eS.n != 0) {
            EB.h("Can only append a slot if not current inserting");
            throw null;
        }
        int i = c0972eS.i;
        int i2 = c0972eS.j;
        int c3 = c0972eS.c(c1471m2);
        int f = c0972eS.f(c0972eS.b, c0972eS.p(c3 + 1));
        c0972eS.i = f;
        c0972eS.j = f;
        c0972eS.s(1, c3);
        if (i >= f) {
            i++;
            i2++;
        }
        c0972eS.c[f] = c2;
        c0972eS.i = i;
        c0972eS.j = i2;
    }

    @Override // o.JG
    public final String c(int i) {
        return i == 0 ? "anchor" : i == 1 ? "value" : super.c(i);
    }
}

package o;

/* loaded from: classes.dex */
public final class FG extends JG {
    public static final FG c = new FG(1, 0, 2);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        int b = c0575Wb.b(0);
        int o2 = c0972eS.o();
        int i = c0972eS.v;
        int D = c0972eS.D(c0972eS.b, c0972eS.p(i));
        int f = c0972eS.f(c0972eS.b, c0972eS.p(i + 1));
        for (int max = Math.max(D, f - b); max < f; max++) {
            Object obj = c0972eS.c[c0972eS.g(max)];
            if (obj instanceof C0836cN) {
                c1970td.h(((C0836cN) obj).a, o2 - max, -1, -1);
            } else if (obj instanceof WL) {
                ((WL) obj).d();
            }
        }
        EB.T(b > 0);
        int i2 = c0972eS.v;
        int D2 = c0972eS.D(c0972eS.b, c0972eS.p(i2));
        int f2 = c0972eS.f(c0972eS.b, c0972eS.p(i2 + 1)) - b;
        EB.T(f2 >= D2);
        c0972eS.B(f2, b, i2);
        int i3 = c0972eS.i;
        if (i3 >= D2) {
            c0972eS.i = i3 - b;
        }
    }

    @Override // o.JG
    public final String b(int i) {
        return i == 0 ? "count" : super.b(i);
    }
}

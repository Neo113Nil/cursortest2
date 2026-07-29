package o;

/* loaded from: classes.dex */
public final class CG extends JG {
    public static final CG c = new CG(2, 0, 2);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        int b = c0575Wb.b(0);
        int b2 = c0575Wb.b(1);
        C0027Ay c0027Ay = (C0027Ay) c0950e6.k;
        C0208Hx c0208Hx = c0027Ay.f;
        if (b2 < 0) {
            AbstractC0868ct.V("count (" + b2 + ") must be greater than 0");
            throw null;
        }
        int i = (b2 + b) - 1;
        if (b > i) {
            return;
        }
        while (true) {
            c0027Ay.y((C0027Ay) ((YD) c0208Hx.i).h[i]);
            Object n = ((YD) c0208Hx.i).n(i);
            ((C1139h0) c0208Hx.j).invoke();
            if (i == b) {
                return;
            } else {
                i--;
            }
        }
    }

    @Override // o.JG
    public final String b(int i) {
        return i == 0 ? "removeIndex" : i == 1 ? "count" : super.b(i);
    }
}

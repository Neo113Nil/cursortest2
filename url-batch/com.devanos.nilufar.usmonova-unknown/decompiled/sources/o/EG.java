package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class EG extends JG {
    public static final EG c;

    static {
        int i = 1;
        c = new EG(0, i, i);
    }

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        ((ArrayList) c1970td.e).add((InterfaceC1455lp) c0575Wb.c(0));
    }

    @Override // o.JG
    public final String c(int i) {
        return i == 0 ? "effect" : super.c(i);
    }
}

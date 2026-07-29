package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class AG extends JG {
    public static final AG c = new AG(0, 1, 1);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        ((ArrayList) c1970td.c).add((InterfaceC0771bN) c0575Wb.c(0));
    }

    @Override // o.JG
    public final String c(int i) {
        return i == 0 ? "value" : super.c(i);
    }
}

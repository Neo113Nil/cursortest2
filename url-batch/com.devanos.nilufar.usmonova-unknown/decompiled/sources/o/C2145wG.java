package o;

import com.google.firebase.messaging.Constants;

/* renamed from: o.wG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2145wG extends JG {
    public static final C2145wG c = new C2145wG(0, 2, 1);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        C0841cS c0841cS = (C0841cS) c0575Wb.c(1);
        C1471m2 c1471m2 = (C1471m2) c0575Wb.c(0);
        c0972eS.d();
        c1471m2.getClass();
        c0972eS.t(c0841cS, c0841cS.j(c1471m2));
        c0972eS.j();
    }

    @Override // o.JG
    public final String c(int i) {
        return i == 0 ? "anchor" : i == 1 ? Constants.MessagePayloadKeys.FROM : super.c(i);
    }
}

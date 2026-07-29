package o;

/* renamed from: o.pG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1684pG extends JG {
    public static final C1684pG c = new C1684pG(0, 1, 1);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        for (Object obj : (Object[]) c0575Wb.c(0)) {
            c0950e6.v(obj);
        }
    }

    @Override // o.JG
    public final String c(int i) {
        return i == 0 ? "nodes" : super.c(i);
    }
}

package o;

/* loaded from: classes.dex */
public final class PY extends UB {
    public static final PY d = new PY("must have no value parameters", 0);
    public static final PY e = new PY("must have a single value parameter", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PY(String str, int i) {
        super(str, 1);
        this.c = i;
    }

    @Override // o.InterfaceC0496Ta
    public final boolean d(C0934du c0934du) {
        switch (this.c) {
            case 0:
                return c0934du.t0().isEmpty();
            default:
                return c0934du.t0().size() == 1;
        }
    }
}

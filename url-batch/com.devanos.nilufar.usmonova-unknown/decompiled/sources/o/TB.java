package o;

/* loaded from: classes.dex */
public final class TB extends UB {
    public static final TB d = new TB("must be a member function", 0);
    public static final TB e = new TB("must be a member or an extension function", 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TB(String str, int i) {
        super(str, 0);
        this.c = i;
    }

    @Override // o.InterfaceC0496Ta
    public final boolean d(C0934du c0934du) {
        switch (this.c) {
            case 0:
                return c0934du.q != null;
            default:
                return (c0934du.q == null && c0934du.p == null) ? false : true;
        }
    }
}

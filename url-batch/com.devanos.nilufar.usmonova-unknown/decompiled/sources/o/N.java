package o;

/* loaded from: classes.dex */
public final class N {
    public static final N c;
    public static final N d;
    public final boolean a;
    public final Throwable b;

    static {
        if (W.GENERATE_CANCELLATION_CAUSES) {
            d = null;
            c = null;
        } else {
            d = new N(null, false);
            c = new N(null, true);
        }
    }

    public N(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}

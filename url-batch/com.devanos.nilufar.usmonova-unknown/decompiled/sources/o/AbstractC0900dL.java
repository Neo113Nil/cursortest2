package o;

/* renamed from: o.dL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0900dL {
    public final InterfaceC0893dE a;
    public final C0695aD b;
    public final IS c;

    public AbstractC0900dL(InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD, IS is) {
        this.a = interfaceC0893dE;
        this.b = c0695aD;
        this.c = is;
    }

    public abstract C2245xo a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}

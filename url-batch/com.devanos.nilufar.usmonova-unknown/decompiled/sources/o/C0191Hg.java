package o;

/* renamed from: o.Hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191Hg extends AbstractC0774bQ {
    public static final C0191Hg k;

    static {
        int i = UU.c;
        int i2 = UU.d;
        long j = UU.e;
        String str = UU.a;
        C0191Hg c0191Hg = new C0191Hg();
        c0191Hg.j = new ExecutorC0396Pe(i, i2, j, str);
        k = c0191Hg;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o.AbstractC0267Ke
    public final String toString() {
        return "Dispatchers.Default";
    }
}

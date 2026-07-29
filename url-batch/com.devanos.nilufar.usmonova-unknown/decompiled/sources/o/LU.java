package o;

/* loaded from: classes.dex */
public abstract class LU {
    public final String a;
    public final boolean b;
    public QU c;
    public long d;

    public LU(String str, boolean z) {
        AbstractC0048Bt.n(str, "name");
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}

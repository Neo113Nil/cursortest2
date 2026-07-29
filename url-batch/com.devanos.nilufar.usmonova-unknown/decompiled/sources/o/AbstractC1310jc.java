package o;

/* renamed from: o.jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1310jc {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e = 0;

    static {
        long j = 3;
        long j2 = j << 32;
        a = (0 & 4294967295L) | j2;
        b = (1 & 4294967295L) | j2;
        c = j2 | (2 & 4294967295L);
        d = (j & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }
}

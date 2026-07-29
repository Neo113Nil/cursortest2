package o;

/* renamed from: o.aR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709aR {
    public static final /* synthetic */ int d = 0;
    public final long a;
    public final long b;
    public final float c;

    static {
        AbstractC0022At.c(4278190080L);
    }

    public C0709aR(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0709aR)) {
            return false;
        }
        C0709aR c0709aR = (C0709aR) obj;
        return C1114gc.b(this.a, c0709aR.a) && BF.a(this.b, c0709aR.b) && this.c == c0709aR.c;
    }

    public final int hashCode() {
        int i = C1114gc.g;
        return Float.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC2188wx.l(this.a, sb, ", offset=");
        sb.append((Object) BF.g(this.b));
        sb.append(", blurRadius=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}

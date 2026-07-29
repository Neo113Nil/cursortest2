package o;

/* renamed from: o.Kp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278Kp {
    public final EnumC0304Lp a;
    public final int b;

    public C0278Kp(EnumC0304Lp enumC0304Lp, int i) {
        this.a = enumC0304Lp;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0278Kp)) {
            return false;
        }
        C0278Kp c0278Kp = (C0278Kp) obj;
        return this.a == c0278Kp.a && this.b == c0278Kp.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "KindWithArity(kind=" + this.a + ", arity=" + this.b + ')';
    }
}

package o;

/* renamed from: o.Oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366Oa {
    public static final C0340Na b = new C0340Na();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0366Oa) {
            return AbstractC0048Bt.h(this.a, ((C0366Oa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof C0314Ma) {
            return ((C0314Ma) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}

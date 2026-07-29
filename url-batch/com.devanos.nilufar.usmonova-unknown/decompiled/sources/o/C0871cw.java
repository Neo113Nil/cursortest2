package o;

/* renamed from: o.cw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871cw extends AbstractC0936dw {
    public final C1705pb a;

    public C0871cw(C1705pb c1705pb) {
        this.a = c1705pb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0871cw) && AbstractC0048Bt.h(this.a, ((C0871cw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.a + ')';
    }
}

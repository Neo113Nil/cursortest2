package o;

/* renamed from: o.bw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806bw extends AbstractC0936dw {
    public final AbstractC1004ey a;

    public C0806bw(AbstractC1004ey abstractC1004ey) {
        this.a = abstractC1004ey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0806bw) && AbstractC0048Bt.h(this.a, ((C0806bw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.a + ')';
    }
}

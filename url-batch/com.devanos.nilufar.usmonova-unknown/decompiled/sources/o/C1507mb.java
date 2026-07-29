package o;

/* renamed from: o.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507mb {
    public final C1639ob a;
    public final C1047fb b;

    public C1507mb(C1639ob c1639ob, C1047fb c1047fb) {
        AbstractC0048Bt.n(c1639ob, "classId");
        this.a = c1639ob;
        this.b = c1047fb;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1507mb) {
            return AbstractC0048Bt.h(this.a, ((C1507mb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

package o;

import java.util.List;

/* loaded from: classes.dex */
public final class TE {
    public final C1639ob a;
    public final List b;

    public TE(C1639ob c1639ob, List list) {
        AbstractC0048Bt.n(c1639ob, "classId");
        this.a = c1639ob;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TE)) {
            return false;
        }
        TE te = (TE) obj;
        return AbstractC0048Bt.h(this.a, te.a) && AbstractC0048Bt.h(this.b, te.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
    }
}

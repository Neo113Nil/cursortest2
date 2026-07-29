package o;

import java.util.Collection;

/* renamed from: o.Xt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619Xt {
    public final C2144wF a;
    public final Collection b;
    public final boolean c;

    public C0619Xt(C2144wF c2144wF, Collection collection) {
        this(c2144wF, collection, c2144wF.a == EnumC2078vF.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0619Xt)) {
            return false;
        }
        C0619Xt c0619Xt = (C0619Xt) obj;
        return AbstractC0048Bt.h(this.a, c0619Xt.a) && AbstractC0048Bt.h(this.b, c0619Xt.b) && this.c == c0619Xt.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.b + ", definitelyNotNull=" + this.c + ')';
    }

    public C0619Xt(C2144wF c2144wF, Collection collection, boolean z) {
        AbstractC0048Bt.n(collection, "qualifierApplicabilityTypes");
        this.a = c2144wF;
        this.b = collection;
        this.c = z;
    }
}

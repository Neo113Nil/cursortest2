package o;

/* renamed from: o.fu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066fu {
    public static final C1066fu d = new C1066fu(DN.k, 6);
    public final DN a;
    public final C1464ly b;
    public final DN c;

    public C1066fu(DN dn, C1464ly c1464ly, DN dn2) {
        this.a = dn;
        this.b = c1464ly;
        this.c = dn2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1066fu)) {
            return false;
        }
        C1066fu c1066fu = (C1066fu) obj;
        return this.a == c1066fu.a && AbstractC0048Bt.h(this.b, c1066fu.b) && this.c == c1066fu.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        C1464ly c1464ly = this.b;
        return this.c.hashCode() + ((hashCode + (c1464ly == null ? 0 : c1464ly.k)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public C1066fu(DN dn, int i) {
        this(dn, (i & 2) != 0 ? new C1464ly(1, 0, 0) : null, dn);
    }
}

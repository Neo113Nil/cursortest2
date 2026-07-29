package o;

import java.util.Set;

/* renamed from: o.ou, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1658ou {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final JR f;

    public C1658ou(int i, int i2, boolean z, boolean z2, Set set, JR jr) {
        AbstractC1888sN.p(i, "howThisTypeIsUsed");
        AbstractC1888sN.p(i2, "flexibility");
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = set;
        this.f = jr;
    }

    public static C1658ou a(C1658ou c1658ou, int i, boolean z, Set set, JR jr, int i2) {
        int i3 = c1658ou.a;
        if ((i2 & 2) != 0) {
            i = c1658ou.b;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            z = c1658ou.c;
        }
        boolean z2 = z;
        boolean z3 = c1658ou.d;
        if ((i2 & 16) != 0) {
            set = c1658ou.e;
        }
        Set set2 = set;
        if ((i2 & 32) != 0) {
            jr = c1658ou.f;
        }
        c1658ou.getClass();
        AbstractC1888sN.p(i3, "howThisTypeIsUsed");
        AbstractC1888sN.p(i4, "flexibility");
        return new C1658ou(i3, i4, z2, z3, set2, jr);
    }

    public final C1658ou b(int i) {
        AbstractC1888sN.p(i, "flexibility");
        return a(this, i, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1658ou)) {
            return false;
        }
        C1658ou c1658ou = (C1658ou) obj;
        return AbstractC0048Bt.h(c1658ou.f, this.f) && c1658ou.a == this.a && c1658ou.b == this.b && c1658ou.c == this.c && c1658ou.d == this.d;
    }

    public final int hashCode() {
        JR jr = this.f;
        int hashCode = jr != null ? jr.hashCode() : 0;
        int v = AbstractC1888sN.v(this.a) + (hashCode * 31) + hashCode;
        int v2 = AbstractC1888sN.v(this.b) + (v * 31) + v;
        int i = (v2 * 31) + (this.c ? 1 : 0) + v2;
        return (i * 31) + (this.d ? 1 : 0) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? "null" : "COMMON" : "SUPERTYPE");
        sb.append(", flexibility=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "FLEXIBLE_LOWER_BOUND" : "FLEXIBLE_UPPER_BOUND" : "INFLEXIBLE");
        sb.append(", isRaw=");
        sb.append(this.c);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.d);
        sb.append(", visitedTypeParameters=");
        sb.append(this.e);
        sb.append(", defaultType=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C1658ou(int i, boolean z, boolean z2, Set set, int i2) {
        this(i, 1, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : set, null);
    }
}

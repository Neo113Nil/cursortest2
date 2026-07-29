package o;

/* renamed from: o.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046fa {
    public InterfaceC1119gh a;
    public EnumC2057uy b;
    public InterfaceC0980ea c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1046fa) {
            C1046fa c1046fa = (C1046fa) obj;
            return AbstractC0048Bt.h(this.a, c1046fa.a) && this.b == c1046fa.b && AbstractC0048Bt.h(this.c, c1046fa.c) && this.d == c1046fa.d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DrawParams(density=");
        sb.append(this.a);
        sb.append(", layoutDirection=");
        sb.append(this.b);
        sb.append(", canvas=");
        sb.append(this.c);
        sb.append(", size=");
        long j = this.d;
        if (j != 9205357640488583168L) {
            str = "Size(" + AbstractC1052fg.X(ZR.b(j)) + ", " + AbstractC1052fg.X(ZR.a(j)) + ')';
        } else {
            str = "Size.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}

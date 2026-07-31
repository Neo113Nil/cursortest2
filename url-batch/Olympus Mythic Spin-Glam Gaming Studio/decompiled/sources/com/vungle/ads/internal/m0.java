package com.vungle.ads.internal;

/* loaded from: classes4.dex */
public final class m0 {
    public final int a;
    public final int b;

    public m0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.a == m0Var.a && this.b == m0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Coordinate(x=");
        a.append(this.a);
        a.append(", y=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}

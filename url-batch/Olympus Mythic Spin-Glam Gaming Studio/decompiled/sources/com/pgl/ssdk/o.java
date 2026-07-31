package com.pgl.ssdk;

/* loaded from: classes3.dex */
public final class o<A, B> {
    private final A a;
    private final B b;

    public o(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public static <A, B> o<A, B> a(A a, B b) {
        return new o<>(a, b);
    }

    public A a() {
        return this.a;
    }

    public B b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a = this.a;
        if (a == null) {
            if (oVar.a != null) {
                return false;
            }
        } else if (!a.equals(oVar.a)) {
            return false;
        }
        B b = this.b;
        B b2 = oVar.b;
        if (b == null) {
            if (b2 != null) {
                return false;
            }
        } else if (!b.equals(b2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a = this.a;
        int hashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }
}

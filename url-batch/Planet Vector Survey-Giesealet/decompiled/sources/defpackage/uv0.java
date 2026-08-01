package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uv0 {
    public final ns0 a;
    public final ns0 b;
    public final ns0 c;
    public final ns0 d;

    public uv0(ns0 ns0Var, ns0 ns0Var2, ns0 ns0Var3, ns0 ns0Var4) {
        this.a = ns0Var;
        this.b = ns0Var2;
        this.c = ns0Var3;
        this.d = ns0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        return nz.l(this.a, uv0Var.a) && nz.l(this.b, uv0Var.b) && nz.l(this.c, uv0Var.c) && nz.l(this.d, uv0Var.d);
    }

    public final int hashCode() {
        ns0 ns0Var = this.a;
        int hashCode = (ns0Var != null ? ns0Var.hashCode() : 0) * 31;
        ns0 ns0Var2 = this.b;
        int hashCode2 = (hashCode + (ns0Var2 != null ? ns0Var2.hashCode() : 0)) * 31;
        ns0 ns0Var3 = this.c;
        int hashCode3 = (hashCode2 + (ns0Var3 != null ? ns0Var3.hashCode() : 0)) * 31;
        ns0 ns0Var4 = this.d;
        return hashCode3 + (ns0Var4 != null ? ns0Var4.hashCode() : 0);
    }
}

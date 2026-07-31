package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public abstract class s2 {
    public static o2 a(n2 n2Var) {
        if (n2Var instanceof t2) {
            t2 t2Var = (t2) n2Var;
            return new o2(t2Var.a, t2Var.b.b(), t2Var.b.c());
        }
        if (n2Var instanceof p2) {
            h2 a = h2.a();
            return new o2(g1.a(((p2) n2Var).a), a.b(), a.c());
        }
        if (!(n2Var instanceof r2)) {
            return null;
        }
        h2 a2 = h2.a();
        o2 o2Var = new o2(-1, a2.b(), a2.c());
        o2Var.a(((r2) n2Var).a);
        return o2Var;
    }
}

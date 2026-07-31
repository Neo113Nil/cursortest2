package yads;

import java.util.Map;

/* loaded from: classes4.dex */
public abstract class y3 {
    public static z3 a(u82 u82Var) {
        f4 f4Var;
        int i = u82Var != null ? u82Var.a : -1;
        boolean z = ob1.a;
        if (204 == i) {
            f4Var = f4.d;
        } else {
            Map map = u82Var != null ? u82Var.c : null;
            Integer valueOf = u82Var != null ? Integer.valueOf(u82Var.a) : null;
            boolean z2 = false;
            if ((valueOf == null || 400 != valueOf.intValue() || map == null) ? false : xz0.a(map, a11.N)) {
                f4Var = f4.h;
            } else if (403 == i) {
                f4Var = f4.g;
            } else if (404 == i) {
                f4Var = f4.b;
            } else {
                if (500 <= i && i <= 599) {
                    z2 = true;
                }
                f4Var = z2 ? f4.f : -1 == i ? f4.l : f4.e;
            }
        }
        return new z3(f4Var, u82Var);
    }
}

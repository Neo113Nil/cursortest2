package yads;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public abstract class g4 {
    public static d4 a(v3 v3Var, f4 f4Var) {
        switch (f4Var.ordinal()) {
            case 0:
            case 5:
                d4 d4Var = e8.a;
                return e8.a(v3Var != null ? v3Var.c.a : null);
            case 1:
                return e8.c;
            case 2:
                return e8.h;
            case 3:
                return e8.d;
            case 4:
                return e8.e;
            case 6:
                return e8.n;
            case 7:
                return e8.g;
            case 8:
                return e8.j;
            case 9:
                return e8.k;
            case 10:
                return e8.r;
            case 11:
                return e8.s;
            case 12:
                return e8.t;
            case 13:
                return e8.u;
            case 14:
                return e8.v;
            case 15:
                return e8.q;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

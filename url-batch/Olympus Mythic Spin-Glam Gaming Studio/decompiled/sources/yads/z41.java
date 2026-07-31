package yads;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class z41 {
    public static final y41 a = new y41(fo2.y, fo2.x, fo2.z, fo2.A);
    public static final y41 b = new y41(fo2.n, fo2.m, fo2.o, fo2.p);

    public static y41 a(r9 r9Var) {
        int ordinal = r9Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return a;
        }
        if (ordinal == 2) {
            return b;
        }
        throw new NoWhenBranchMatchedException();
    }
}

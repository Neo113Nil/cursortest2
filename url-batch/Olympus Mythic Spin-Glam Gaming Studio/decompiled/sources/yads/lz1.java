package yads;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class lz1 {
    public static vu a(mg2 mg2Var, b63 b63Var) {
        boolean z = false;
        boolean z2 = (b63Var == null || mg2Var == null) ? false : true;
        if (b63Var == null && mg2Var == null) {
            z = true;
        }
        return (z2 || z) ? su.a : b63Var != null ? b63Var.b : mg2Var != null ? new qu(mg2Var) : su.a;
    }

    public static List a(b63 b63Var, pz0 pz0Var) {
        a63 a63Var = b63Var instanceof a63 ? (a63) b63Var : null;
        b63 b63Var2 = pz0Var != null ? pz0Var.b : null;
        return CollectionsKt.listOfNotNull(a63Var, b63Var2 instanceof a63 ? (a63) b63Var2 : null, pz0Var != null ? pz0Var.a : null);
    }
}

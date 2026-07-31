package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zo2 {
    public static final Object a = new Object();
    public static volatile zo2 b;

    public static void a(final Object obj) {
        ep2 ep2Var = g92.b;
        if (ep2Var != null) {
            ep2Var.a(new dp2() { // from class: yads.zo2$$ExternalSyntheticLambda0
                @Override // yads.dp2
                public final boolean a(ro2 ro2Var) {
                    return zo2.a(obj, ro2Var);
                }
            });
        }
    }

    public static final boolean a(Object obj, ro2 ro2Var) {
        return Intrinsics.areEqual(obj, ro2Var.q);
    }
}

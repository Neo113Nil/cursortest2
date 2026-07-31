package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class pw1 {
    public static qw1 a(String str) {
        for (qw1 qw1Var : qw1.values()) {
            if (Intrinsics.areEqual(qw1Var.b, str)) {
                return qw1Var;
            }
        }
        return qw1.d;
    }
}

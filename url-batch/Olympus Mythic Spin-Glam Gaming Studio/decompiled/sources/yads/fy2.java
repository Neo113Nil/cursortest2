package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class fy2 {
    public static boolean a(Context context) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        return a == null || a.j;
    }

    public final boolean b(Context context) {
        vw2 vw2Var;
        bu2 a = uw2.a().a(context);
        if (a != null && a.i && !a(context)) {
            if (zy.a(a)) {
                vw2 vw2Var2 = vw2.l;
                if (vw2Var2 == null) {
                    synchronized (vw2.k) {
                        vw2Var = vw2.l;
                        if (vw2Var == null) {
                            vw2Var = new vw2();
                            vw2.l = vw2Var;
                        }
                    }
                    vw2Var2 = vw2Var;
                }
                if (Intrinsics.areEqual(vw2Var2.c(), Boolean.TRUE)) {
                }
            }
            return false;
        }
        return true;
    }
}

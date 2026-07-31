package yads;

import java.util.Map;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class bo3 {
    public final xw1 a;
    public final h03 b = new h03();

    public bo3(xw1 xw1Var) {
        this.a = xw1Var;
    }

    public final void a(final Map map) {
        h03 h03Var = this.b;
        Runnable runnable = new Runnable() { // from class: yads.bo3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                bo3.a(bo3.this, map);
            }
        };
        synchronized (h03Var.a) {
            if (h03Var.b) {
                return;
            }
            h03Var.b = true;
            Unit unit = Unit.INSTANCE;
            runnable.run();
        }
    }

    public static final void a(bo3 bo3Var, Map map) {
        bo3Var.a.setVisibility(0);
        boolean z = ob1.a;
        xw1 xw1Var = bo3Var.a;
        t01 t01Var = xw1Var.f;
        if (t01Var != null) {
            t01Var.a(xw1Var, map);
        }
    }
}

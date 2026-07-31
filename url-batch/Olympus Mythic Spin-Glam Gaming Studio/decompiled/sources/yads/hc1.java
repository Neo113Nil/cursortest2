package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class hc1 extends pn {
    public final re0 e;

    public hc1(Context context, yu2 yu2Var, v0 v0Var, CoroutineScope coroutineScope, re0 re0Var) {
        super(context, yu2Var, v0Var, coroutineScope);
        this.e = re0Var;
    }

    @Override // yads.pn
    public final Object a(d8 d8Var, Object obj, on onVar) {
        zb1 zb1Var = (zb1) obj;
        if (kc1.d == null) {
            synchronized (kc1.c) {
                try {
                    if (kc1.d == null) {
                        kc1.d = new kc1();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        kc1 kc1Var = kc1.d;
        if (kc1Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        pi2 pi2Var = kc1Var.a;
        kc1Var.b.getClass();
        Object a = pi2Var.a(kx0.a(d8Var), zb1Var, onVar);
        if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a = Unit.INSTANCE;
        }
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    @Override // yads.pn
    public final bx0 a(d8 d8Var, ln lnVar) {
        gc1 gc1Var = new gc1(this, d8Var);
        tb1 tb1Var = new tb1(this.a, this.b, new fc1(), gc1Var, d8Var);
        String str = d8Var.a;
        tb1Var.c.a(str);
        tb1Var.F.f = str;
        tb1Var.a((u00) new ec1(lnVar));
        tb1Var.b(d8Var);
        return tb1Var;
    }
}

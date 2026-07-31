package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class zr2 extends pn {
    public final se0 e;

    public zr2(Context context, yu2 yu2Var, v0 v0Var, CoroutineScope coroutineScope, se0 se0Var) {
        super(context, yu2Var, v0Var, coroutineScope);
        this.e = se0Var;
    }

    @Override // yads.pn
    public final Object a(d8 d8Var, Object obj, on onVar) {
        kr2 kr2Var = (kr2) obj;
        if (gs2.d == null) {
            synchronized (gs2.c) {
                try {
                    if (gs2.d == null) {
                        gs2.d = new gs2();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        gs2 gs2Var = gs2.d;
        if (gs2Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        pi2 pi2Var = gs2Var.a;
        gs2Var.b.getClass();
        Object a = pi2Var.a(kx0.a(d8Var), kr2Var, onVar);
        if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a = Unit.INSTANCE;
        }
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    @Override // yads.pn
    public final bx0 a(d8 d8Var, ln lnVar) {
        yr2 yr2Var = new yr2(this, d8Var);
        er2 er2Var = new er2(this.a, this.b, new xr2(), yr2Var, d8Var);
        String str = d8Var.a;
        er2Var.c.a(str);
        er2Var.F.d = str;
        er2Var.a((o10) new wr2(lnVar));
        er2Var.b(d8Var);
        return er2Var;
    }
}

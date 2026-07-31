package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class wg extends pn {
    public final te0 e;

    public wg(Context context, yu2 yu2Var, v0 v0Var, CoroutineScope coroutineScope, te0 te0Var) {
        super(context, yu2Var, v0Var, coroutineScope);
        this.e = te0Var;
    }

    @Override // yads.pn
    public final Object a(d8 d8Var, Object obj, on onVar) {
        rg rgVar = (rg) obj;
        if (pg.d == null) {
            synchronized (pg.c) {
                try {
                    if (pg.d == null) {
                        pg.d = new pg();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        pg pgVar = pg.d;
        if (pgVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        pi2 pi2Var = pgVar.a;
        pgVar.b.getClass();
        Object a = pi2Var.a(kx0.a(d8Var), rgVar, onVar);
        if (a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            a = Unit.INSTANCE;
        }
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }

    @Override // yads.pn
    public final bx0 a(d8 d8Var, ln lnVar) {
        vg vgVar = new vg(this, d8Var);
        jg jgVar = new jg(this.a, this.b, new ug(), vgVar, d8Var);
        jgVar.c.a(d8Var.a);
        jgVar.a((g00) new tg(lnVar));
        jgVar.b(d8Var);
        return jgVar;
    }
}

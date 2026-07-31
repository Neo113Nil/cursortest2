package yads;

import android.content.Context;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes3.dex */
public final class ls extends in implements vb1 {
    public final ub1 h;
    public final kc1 i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ls(Context context, nt3 nt3Var) {
        super(context, r2, r3, r4, r5, CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new b20(pr.a(r11, r11)))));
        qh1 qh1Var = new qh1(context);
        au2.a.getClass();
        lh1 a = n51.a();
        ub1 ub1Var = new ub1(nt3Var);
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
        ki2 ki2Var = new ki2();
        vd0 vd0Var = new vd0(t0.a(), new es(jc1.a()));
        Context context2 = nt3Var.a;
        this.h = ub1Var;
        this.i = kc1Var;
    }

    @Override // yads.in
    public final void a(d8 d8Var, Object obj, String str) {
        d8 a = d8.a(d8Var, null, str, 6143);
        tb1 tb1Var = new tb1(this.a, this.h.a, this, new fs(this, a), a);
        this.g.add(tb1Var);
        String str2 = a.a;
        tb1Var.c.a(str2);
        tb1Var.F.f = str2;
        tb1Var.a((u00) obj);
        tb1Var.b(a);
    }

    @Override // yads.in
    public final Object b(Object obj) {
        return new js((u00) obj);
    }

    @Override // yads.in
    public final void c(Object obj) {
        ((tb1) obj).a((u00) null);
    }

    @Override // yads.in
    public final void a(Object obj, Object obj2) {
        zb1 zb1Var = (zb1) obj;
        u00 u00Var = (u00) obj2;
        if (u00Var != null) {
            u00Var.a(zb1Var);
        }
    }

    @Override // yads.in
    public final Object a(gn gnVar) {
        return this.i.a.a(gnVar);
    }

    @Override // yads.in
    public final Object a(d8 d8Var) {
        return new is(this, d8Var);
    }
}

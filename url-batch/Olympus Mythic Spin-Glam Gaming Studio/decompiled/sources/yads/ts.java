package yads;

import android.content.Context;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class ts extends in implements gr2 {
    public final fr2 h;
    public final gs2 i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ts(Context context, nt3 nt3Var) {
        super(context, r2, r3, r4, r5, CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new b20(pr.a(r11, r11)))));
        qh1 qh1Var = new qh1(context);
        au2.a.getClass();
        lh1 a = n51.a();
        fr2 fr2Var = new fr2(nt3Var);
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
        ki2 ki2Var = new ki2();
        vd0 vd0Var = new vd0(t0.a(), new ms(fs2.a()));
        Context context2 = nt3Var.a;
        this.h = fr2Var;
        this.i = gs2Var;
    }

    @Override // yads.in
    public final void a(d8 d8Var, Object obj, String str) {
        d8 a = d8.a(d8Var, null, str, 6143);
        er2 er2Var = new er2(this.a, this.h.a, this, new rs(this, a), a);
        this.g.add(er2Var);
        String str2 = a.a;
        er2Var.c.a(str2);
        er2Var.F.d = str2;
        er2Var.a((o10) obj);
        er2Var.b(a);
    }

    @Override // yads.in
    public final Object b(Object obj) {
        return new qs((o10) obj);
    }

    @Override // yads.in
    public final void c(Object obj) {
        ((er2) obj).a((o10) null);
    }

    @Override // yads.in
    public final void a(Object obj, Object obj2) {
        kr2 kr2Var = (kr2) obj;
        o10 o10Var = (o10) obj2;
        if (o10Var != null) {
            o10Var.a(kr2Var);
        }
    }

    @Override // yads.in
    public final Object a(gn gnVar) {
        return this.i.a.a(gnVar);
    }

    @Override // yads.in
    public final Object a(d8 d8Var) {
        return new ps(this, d8Var);
    }
}

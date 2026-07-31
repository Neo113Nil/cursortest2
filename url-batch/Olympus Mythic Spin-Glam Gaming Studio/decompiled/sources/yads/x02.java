package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes13.dex */
public final class x02 extends wm {
    public final u12 A;
    public final x12 B;
    public final y43 C;
    public final zz1 D;
    public final w02 E;
    public final p12 y;
    public final l12 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x02(Context context, yu2 yu2Var, p12 p12Var, v3 v3Var, l12 l12Var, i5 i5Var) {
        super(context, i5Var, v3Var, yu2Var, r10, new o02(context, v3Var, yu2Var, p12Var, i5Var));
        Context context2 = ((nt3) yu2Var).a;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new b20(pr.a(context2, context2))));
        u12 u12Var = new u12(context, v3Var, yu2Var);
        x12 x12Var = new x12(v3Var);
        if (y43.b == null) {
            synchronized (y43.c) {
                try {
                    if (y43.b == null) {
                        y43.b = new y43();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        y43 y43Var = y43.b;
        if (y43Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        zz1 zz1Var = new zz1(context, CoroutineScope, v3Var, i5Var, yu2Var);
        this.y = p12Var;
        this.z = l12Var;
        this.A = u12Var;
        this.B = x12Var;
        this.C = y43Var;
        this.D = zz1Var;
        this.E = new w02(this);
        l12Var.c.f = x12Var;
    }

    @Override // yads.wp2
    public final void a(Object obj) {
        m32 kw2Var;
        t8 t8Var = (t8) obj;
        synchronized (this) {
            this.b.a(h5.t);
            this.w = t8Var;
        }
        this.B.d = t8Var;
        if (this.r == l5.b) {
            return;
        }
        u12 u12Var = this.A;
        u12Var.getClass();
        vq1 vq1Var = t8Var.q;
        if (vq1Var != null) {
            kw2Var = new lp1(u12Var.c, t8Var, vq1Var);
        } else {
            kw2Var = new kw2(u12Var.b, u12Var.a);
        }
        l32 a = kw2Var.a(this, this.x);
        Context a2 = h1.a();
        if (a2 != null) {
            boolean z = ob1.a;
        }
        if (a2 == null) {
            a2 = this.a;
        }
        a.a(a2, t8Var);
    }

    @Override // yads.wm
    public final boolean a(d8 d8Var) {
        return true;
    }

    @Override // yads.wm
    public final synchronized void b(d8 d8Var) {
        throw null;
    }

    @Override // yads.wm
    public final d4 j() {
        return (d4) CollectionsKt.firstOrNull(this.i.a());
    }

    @Override // yads.wm
    public final void a(d4 d4Var) {
        this.z.a(d4Var);
    }
}

package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes10.dex */
public final class iu1 {
    public static final Object f = new Object();
    public static volatile iu1 g;
    public final bu1 a;
    public final fu1 b;
    public final gv2 c;
    public final nt3 d;
    public hu1 e;

    public iu1(bu1 bu1Var, fu1 fu1Var, gv2 gv2Var, nt3 nt3Var) {
        hu1 hu1Var = hu1.b;
        this.a = bu1Var;
        this.b = fu1Var;
        this.c = gv2Var;
        this.d = nt3Var;
        this.e = hu1Var;
    }

    public final void a(final Context context, final k00 k00Var) {
        h1.a(context);
        bu1 bu1Var = this.a;
        bu1Var.a.b.execute(new Runnable() { // from class: yads.iu1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                iu1.a(iu1.this, context, k00Var);
            }
        });
    }

    public final void b(Context context, final k00 k00Var) {
        boolean z;
        boolean z2;
        synchronized (f) {
            try {
                m51 m51Var = new m51(this.a, k00Var);
                z = false;
                if (this.e == hu1.d) {
                    z2 = false;
                    z = true;
                } else {
                    this.b.a(m51Var);
                    if (this.e == hu1.b) {
                        this.e = hu1.c;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.a.a.a.execute(new Runnable() { // from class: yads.iu1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    iu1.a(k00.this);
                }
            });
        }
        if (z2) {
            gv2 gv2Var = this.c;
            nt3 nt3Var = this.d;
            gv2Var.getClass();
            Context context2 = nt3Var.a;
            this.a.a.b.execute(new fv2(context, nt3Var, CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new b20(pr.a(context2, context2))))));
        }
    }

    public static final void a(iu1 iu1Var, Context context, k00 k00Var) {
        iu1Var.b(context, k00Var);
    }

    public static final void a(k00 k00Var) {
        k00Var.onInitializationCompleted();
    }

    public final void a(dv2 dv2Var) {
        if (dv2Var instanceof cv2) {
            synchronized (f) {
                this.e = hu1.d;
                Unit unit = Unit.INSTANCE;
            }
        } else if (dv2Var instanceof bv2) {
            synchronized (f) {
                this.e = hu1.b;
                Unit unit2 = Unit.INSTANCE;
            }
        }
        bu1 bu1Var = this.a;
        bu1Var.a.a.execute(new Runnable() { // from class: yads.iu1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                iu1.a(iu1.this);
            }
        });
    }

    public static final void a(iu1 iu1Var) {
        ArrayList arrayList;
        fu1 fu1Var = iu1Var.b;
        synchronized (fu1Var.a) {
            arrayList = new ArrayList(fu1Var.b);
            fu1Var.b.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m51 m51Var = (m51) it.next();
            if (m51Var != null) {
                m51Var.a();
            }
        }
    }
}

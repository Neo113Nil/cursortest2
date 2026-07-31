package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class xw2 implements q83 {
    public final jx1 a;
    public final kn2 b;
    public final f51 c;
    public final id2 d;

    public xw2(jx1 jx1Var, kn2 kn2Var, f51 f51Var, id2 id2Var) {
        this.a = jx1Var;
        this.b = kn2Var;
        this.c = f51Var;
        this.d = id2Var;
    }

    @Override // yads.q83
    public final void a(Context context, c42 c42Var, a22 a22Var) {
        boolean z;
        kn2 kn2Var = this.b;
        boolean z2 = true;
        if (!kn2Var.f) {
            kn2Var.f = true;
            hn2 hn2Var = kn2Var.e;
            hn2Var.c.post(new gn2(hn2Var, hn2Var.a));
        }
        this.a.a();
        this.d.a(c42Var);
        if (a22Var != null) {
            f51 f51Var = this.c;
            rl3 rl3Var = f51Var.c;
            bu2 a = rl3Var.a.a(context);
            Boolean bool = a != null ? a.Q : null;
            vw2 vw2Var = rl3Var.a;
            synchronized (vw2.k) {
                z = vw2Var.e;
            }
            boolean d = rl3Var.a.d();
            if (bool != null) {
                z2 = bool.booleanValue();
            } else if ((!z || !pa.a(context)) && !d) {
                z2 = false;
            }
            if (z2) {
                f51Var.b.post(new e51(f51Var, a22Var));
            }
        }
    }

    @Override // yads.q83
    public final void a(c42 c42Var) {
        kn2 kn2Var = this.b;
        kn2Var.f = false;
        kn2Var.e.c.removeCallbacksAndMessages(null);
        this.a.b();
        this.d.b(c42Var);
        this.c.b.removeCallbacksAndMessages(null);
    }

    @Override // yads.q83
    public final void a(t8 t8Var, ArrayList arrayList) {
        this.a.a(t8Var, arrayList);
    }

    @Override // yads.q83
    public final void a(a22 a22Var) {
        f51 f51Var = this.c;
        f51Var.b.removeCallbacksAndMessages(null);
        View a = a22Var.c.a();
        if (a instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) a;
            h51 h51Var = f51Var.a.a;
            WeakReference weakReference = (WeakReference) h51Var.d.get(frameLayout);
            cq cqVar = weakReference != null ? (cq) weakReference.get() : null;
            if (cqVar != null) {
                h51Var.d.remove(frameLayout);
                frameLayout.removeView(cqVar);
            }
            WeakReference weakReference2 = (WeakReference) h51Var.e.get(frameLayout);
            j51 j51Var = weakReference2 != null ? (j51) weakReference2.get() : null;
            if (j51Var != null) {
                h51Var.e.remove(frameLayout);
                frameLayout.removeView(j51Var);
            }
        }
    }

    @Override // yads.q83
    public final void a(t41 t41Var) {
        this.a.m = t41Var;
    }

    @Override // yads.q83
    public final void a(v42 v42Var) {
        this.b.d.e.g = v42Var;
    }
}

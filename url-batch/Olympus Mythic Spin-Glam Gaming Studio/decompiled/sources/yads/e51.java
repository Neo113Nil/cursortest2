package yads;

import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class e51 implements Runnable {
    public final a22 b;
    public final /* synthetic */ f51 c;

    public e51(f51 f51Var, a22 a22Var) {
        this.c = f51Var;
        this.b = a22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j51 j51Var;
        View a = this.b.c.a();
        if (a instanceof FrameLayout) {
            db1 db1Var = this.c.d;
            FrameLayout frameLayout = (FrameLayout) a;
            ec3 a2 = db1Var.a.a(frameLayout.getContext(), db1Var.b, false);
            g51 g51Var = this.c.a;
            g51Var.getClass();
            boolean z = a2 instanceof bc3;
            h51 h51Var = g51Var.a;
            WeakReference weakReference = (WeakReference) h51Var.d.get(frameLayout);
            cq cqVar = weakReference != null ? (cq) weakReference.get() : null;
            if (cqVar == null) {
                cqVar = new cq(frameLayout.getContext(), h51Var.c);
                h51Var.d.put(frameLayout, new WeakReference(cqVar));
                frameLayout.addView(cqVar);
            }
            h51Var.b.getClass();
            cqVar.setColor(z ? -65536 : -16711936);
            if (z) {
                WeakReference weakReference2 = (WeakReference) h51Var.e.get(frameLayout);
                j51Var = weakReference2 != null ? (j51) weakReference2.get() : null;
                if (j51Var == null) {
                    j51Var = new j51(frameLayout.getContext(), new yg0());
                    h51Var.e.put(frameLayout, new WeakReference(j51Var));
                    frameLayout.addView(j51Var);
                }
                h51Var.a.getClass();
                j51Var.setDescription(ql3.a((bc3) a2));
            } else {
                WeakReference weakReference3 = (WeakReference) h51Var.e.get(frameLayout);
                j51Var = weakReference3 != null ? (j51) weakReference3.get() : null;
                if (j51Var != null) {
                    h51Var.e.remove(frameLayout);
                    frameLayout.removeView(j51Var);
                }
            }
            f51 f51Var = this.c;
            f51Var.b.postDelayed(new e51(f51Var, this.b), 300L);
        }
    }
}

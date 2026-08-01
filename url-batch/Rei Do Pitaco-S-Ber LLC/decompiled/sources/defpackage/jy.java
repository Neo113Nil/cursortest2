package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class jy {
    public dy a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(dz dzVar) {
        RecyclerView recyclerView;
        int i = dzVar.j;
        if (dzVar.f() || (i & 4) != 0 || (recyclerView = dzVar.r) == null) {
            return;
        }
        recyclerView.J(dzVar);
    }

    public abstract boolean a(dz dzVar, dz dzVar2, av avVar, av avVar2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(dz dzVar) {
        dy dyVar = this.a;
        if (dyVar != null) {
            RecyclerView recyclerView = dyVar.f;
            boolean z = true;
            dzVar.n(true);
            View view = dzVar.a;
            if (dzVar.h != null && dzVar.i == null) {
                dzVar.h = null;
            }
            dzVar.i = null;
            if ((dzVar.j & 16) != 0) {
                return;
            }
            ty tyVar = recyclerView.h;
            recyclerView.k0();
            v9 v9Var = recyclerView.k;
            u9 u9Var = v9Var.b;
            dy dyVar2 = v9Var.a;
            int i = v9Var.d;
            if (i != 1) {
                if (i == 2) {
                    l8.u("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    v9Var.d = 2;
                    int indexOfChild = dyVar2.f.indexOfChild(view);
                    if (indexOfChild == -1) {
                        v9Var.j(view);
                    } else if (u9Var.d(indexOfChild)) {
                        u9Var.g(indexOfChild);
                        v9Var.j(view);
                        dyVar2.h(indexOfChild);
                    }
                    if (z) {
                        dz M = RecyclerView.M(view);
                        tyVar.m(M);
                        tyVar.j(M);
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.m0(!z);
                    if (z && dzVar.j()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    v9Var.d = 0;
                }
            }
            if (v9Var.e != view) {
                l8.u("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
            }
            recyclerView.m0(!z);
            if (z) {
            }
        }
    }

    public abstract void d(dz dzVar);

    public abstract void e();

    public abstract boolean f();
}

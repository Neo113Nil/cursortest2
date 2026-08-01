package g0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public C0136z f2329a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2330b;

    /* renamed from: c, reason: collision with root package name */
    public long f2331c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2332e;

    /* renamed from: f, reason: collision with root package name */
    public long f2333f;

    public static void b(Z z2) {
        RecyclerView recyclerView;
        int i = z2.f2398j;
        if (z2.g() || (i & 4) != 0 || (recyclerView = z2.f2406r) == null) {
            return;
        }
        recyclerView.I(z2);
    }

    public abstract boolean a(Z z2, Z z3, K.r rVar, K.r rVar2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Z z2) {
        C0136z c0136z = this.f2329a;
        if (c0136z != null) {
            boolean z3 = true;
            z2.o(true);
            if (z2.h != null && z2.i == null) {
                z2.h = null;
            }
            z2.i = null;
            if ((z2.f2398j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0136z.f2571a;
            recyclerView.h0();
            C0114c c0114c = recyclerView.f1609f;
            C0113b c0113b = c0114c.f2416b;
            C0136z c0136z2 = c0114c.f2415a;
            int i = c0114c.d;
            View view = z2.f2392a;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0114c.d = 2;
                    int indexOfChild = c0136z2.f2571a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c0114c.j(view);
                    } else if (c0113b.d(indexOfChild)) {
                        c0113b.f(indexOfChild);
                        c0114c.j(view);
                        c0136z2.h(indexOfChild);
                    }
                    if (z3) {
                        Z L2 = RecyclerView.L(view);
                        O o2 = recyclerView.f1604c;
                        o2.l(L2);
                        o2.i(L2);
                        if (RecyclerView.f1576y0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.i0(!z3);
                    if (z3 && z2.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c0114c.d = 0;
                }
            }
            if (c0114c.f2418e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z3 = false;
            if (z3) {
            }
            recyclerView.i0(!z3);
            if (z3) {
            }
        }
    }

    public abstract void d(Z z2);

    public abstract void e();

    public abstract boolean f();
}

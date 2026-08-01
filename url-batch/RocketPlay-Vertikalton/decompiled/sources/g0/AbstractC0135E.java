package g0;

import K.C0024q;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0135E {

    /* renamed from: a, reason: collision with root package name */
    public C0172z f2767a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2768b;

    /* renamed from: c, reason: collision with root package name */
    public long f2769c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f2770e;

    /* renamed from: f, reason: collision with root package name */
    public long f2771f;

    public static void b(Z z2) {
        RecyclerView recyclerView;
        int i = z2.f2836j;
        if (z2.g() || (i & 4) != 0 || (recyclerView = z2.f2844r) == null) {
            return;
        }
        recyclerView.I(z2);
    }

    public abstract boolean a(Z z2, Z z3, C0024q c0024q, C0024q c0024q2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Z z2) {
        C0172z c0172z = this.f2767a;
        if (c0172z != null) {
            boolean z3 = true;
            z2.o(true);
            if (z2.h != null && z2.i == null) {
                z2.h = null;
            }
            z2.i = null;
            if ((z2.f2836j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0172z.f3009a;
            recyclerView.h0();
            C0149b c0149b = recyclerView.f1988f;
            D1.a aVar = c0149b.f2851b;
            C0172z c0172z2 = c0149b.f2850a;
            int i = c0149b.d;
            View view = z2.f2830a;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0149b.d = 2;
                    int indexOfChild = c0172z2.f3009a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c0149b.j(view);
                    } else if (aVar.d(indexOfChild)) {
                        aVar.g(indexOfChild);
                        c0149b.j(view);
                        c0172z2.h(indexOfChild);
                    }
                    if (z3) {
                        Z L2 = RecyclerView.L(view);
                        C0145O c0145o = recyclerView.f1983c;
                        c0145o.l(L2);
                        c0145o.i(L2);
                        if (RecyclerView.f1955y0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.i0(!z3);
                    if (z3 && z2.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c0149b.d = 0;
                }
            }
            if (c0149b.f2853e != view) {
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

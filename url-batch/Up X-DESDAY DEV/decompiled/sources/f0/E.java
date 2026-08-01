package f0;

import K.C0012l;
import K.C0017q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public C0109z f1948a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1949b;

    /* renamed from: c, reason: collision with root package name */
    public long f1950c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f1951e;

    /* renamed from: f, reason: collision with root package name */
    public long f1952f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2015j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2023r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0017q c0017q, C0017q c0017q2);

    public final void c(X x2) {
        C0109z c0109z = this.f1948a;
        if (c0109z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2015j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0109z.f2186a;
            recyclerView.a0();
            C0012l c0012l = recyclerView.f1440e;
            C0109z c0109z2 = (C0109z) c0012l.f431b;
            RecyclerView recyclerView2 = c0109z2.f2186a;
            View view = x2.f2009a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0012l.v(view);
            } else {
                C0086b c0086b = (C0086b) c0012l.f432c;
                if (c0086b.d(indexOfChild)) {
                    c0086b.g(indexOfChild);
                    c0012l.v(view);
                    c0109z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1435b;
                o2.j(I2);
                o2.g(I2);
            }
            recyclerView.b0(!z2);
            if (z2 || !x2.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(X x2);

    public abstract void e();

    public abstract boolean f();
}

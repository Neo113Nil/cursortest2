package f0;

import K.C0011l;
import K.C0016q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public C0121z f1953a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1954b;

    /* renamed from: c, reason: collision with root package name */
    public long f1955c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f1956e;

    /* renamed from: f, reason: collision with root package name */
    public long f1957f;

    public static void b(X x2) {
        RecyclerView recyclerView;
        int i = x2.f2020j;
        if (x2.g() || (i & 4) != 0 || (recyclerView = x2.f2028r) == null) {
            return;
        }
        recyclerView.F(x2);
    }

    public abstract boolean a(X x2, X x3, C0016q c0016q, C0016q c0016q2);

    public final void c(X x2) {
        C0121z c0121z = this.f1953a;
        if (c0121z != null) {
            boolean z2 = true;
            x2.o(true);
            if (x2.h != null && x2.i == null) {
                x2.h = null;
            }
            x2.i = null;
            if ((x2.f2020j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0121z.f2191a;
            recyclerView.a0();
            C0011l c0011l = recyclerView.f1442e;
            C0121z c0121z2 = (C0121z) c0011l.f413b;
            RecyclerView recyclerView2 = c0121z2.f2191a;
            View view = x2.f2014a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0011l.v(view);
            } else {
                C0098b c0098b = (C0098b) c0011l.f414c;
                if (c0098b.d(indexOfChild)) {
                    c0098b.g(indexOfChild);
                    c0011l.v(view);
                    c0121z2.h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                X I2 = RecyclerView.I(view);
                O o2 = recyclerView.f1437b;
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

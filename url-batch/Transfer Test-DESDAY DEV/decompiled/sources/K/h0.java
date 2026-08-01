package K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0006e f405a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f406b;

    public h0(View view, C0006e c0006e) {
        z0 z0Var;
        this.f405a = c0006e;
        WeakHashMap weakHashMap = T.f372a;
        z0 a2 = I.a(view);
        if (a2 != null) {
            int i = Build.VERSION.SDK_INT;
            z0Var = (i >= 30 ? new q0(a2) : i >= 29 ? new p0(a2) : new o0(a2)).b();
        } else {
            z0Var = null;
        }
        this.f406b = z0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        x0 x0Var;
        if (!view.isLaidOut()) {
            this.f406b = z0.g(view, windowInsets);
            return i0.i(view, windowInsets);
        }
        z0 g2 = z0.g(view, windowInsets);
        if (this.f406b == null) {
            WeakHashMap weakHashMap = T.f372a;
            this.f406b = I.a(view);
        }
        if (this.f406b == null) {
            this.f406b = g2;
            return i0.i(view, windowInsets);
        }
        C0006e j2 = i0.j(view);
        if (j2 != null && Objects.equals((WindowInsets) j2.f392b, windowInsets)) {
            return i0.i(view, windowInsets);
        }
        z0 z0Var = this.f406b;
        int i = 1;
        int i2 = 0;
        while (true) {
            x0Var = g2.f465a;
            if (i > 256) {
                break;
            }
            if (!x0Var.f(i).equals(z0Var.f465a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return i0.i(view, windowInsets);
        }
        z0 z0Var2 = this.f406b;
        m0 m0Var = new m0(i2, (i2 & 8) != 0 ? x0Var.f(8).d > z0Var2.f465a.f(8).d ? i0.f413e : i0.f414f : i0.f415g, 160L);
        m0Var.f427a.d(RecyclerView.f1570A0);
        ValueAnimator duration = ValueAnimator.ofFloat(RecyclerView.f1570A0, 1.0f).setDuration(m0Var.f427a.a());
        C.d f2 = x0Var.f(i2);
        C.d f3 = z0Var2.f465a.f(i2);
        int min = Math.min(f2.f94a, f3.f94a);
        int i3 = f2.f95b;
        int i4 = f3.f95b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f96c;
        int i6 = f3.f96c;
        int min3 = Math.min(i5, i6);
        int i7 = f2.d;
        int i8 = i2;
        int i9 = f3.d;
        B.j jVar = new B.j(C.d.b(min, min2, min3, Math.min(i7, i9)), 3, C.d.b(Math.max(f2.f94a, f3.f94a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        i0.f(view, windowInsets, false);
        duration.addUpdateListener(new f0(m0Var, g2, z0Var2, i8, view));
        duration.addListener(new g0(m0Var, view));
        ViewTreeObserverOnPreDrawListenerC0022v.a(view, new H.n(view, m0Var, jVar, duration));
        this.f406b = g2;
        return i0.i(view, windowInsets);
    }
}

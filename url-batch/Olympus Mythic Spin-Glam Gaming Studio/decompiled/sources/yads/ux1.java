package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class ux1 implements View.OnAttachStateChangeListener {
    public final kx1 a;
    public final long b;

    public ux1(kx1 kx1Var, long j) {
        this.a = kx1Var;
        this.b = j;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Unit unit;
        kx1 kx1Var = this.a;
        long j = this.b;
        if (j <= 0 || !kx1Var.e) {
            return;
        }
        kx1Var.a();
        qm2 qm2Var = kx1Var.c;
        KProperty kProperty = kx1.f[0];
        ViewPager2 viewPager2 = (ViewPager2) qm2Var.a.get();
        if (viewPager2 != null) {
            mx1 mx1Var = new mx1(viewPager2, kx1Var.a, kx1Var.b);
            oh1 oh1Var = new oh1();
            kx1Var.d = oh1Var;
            if (mx1Var.b == bt.b) {
                oh1Var.a.postDelayed(new nh1(oh1Var, j, mx1Var), j);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            kx1Var.a();
            kx1Var.e = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a();
    }
}

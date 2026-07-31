package yads;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes4.dex */
public final class ub2 extends ViewPager2.OnPageChangeCallback {
    public final qx1 a;
    public final kx1 b;
    public boolean c;

    public ub2(qx1 qx1Var, kx1 kx1Var) {
        this.a = qx1Var;
        this.b = kx1Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.c = false;
            return;
        }
        if (i != 1) {
            return;
        }
        kx1 kx1Var = this.b;
        if (kx1Var != null) {
            kx1Var.a();
            kx1Var.e = false;
        }
        this.c = true;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        if (this.c) {
            qx1 qx1Var = this.a;
            if (qx1Var.d) {
                qx1Var.a("first_user_swipe");
                qx1Var.d = false;
            }
            this.c = false;
        }
    }
}

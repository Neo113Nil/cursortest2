package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes3.dex */
public final class qz extends sz {
    public final yx1 c;

    public qz(yx1 yx1Var, qx1 qx1Var, kx1 kx1Var) {
        super(qx1Var, kx1Var);
        this.c = yx1Var;
    }

    @Override // yads.sz, android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager2 viewPager2 = (ViewPager2) this.c.a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
        }
        super.onClick(view);
    }
}

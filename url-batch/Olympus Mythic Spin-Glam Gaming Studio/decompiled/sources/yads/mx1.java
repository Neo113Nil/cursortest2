package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.reflect.KProperty;

/* loaded from: classes11.dex */
public final class mx1 extends ct {
    public static final /* synthetic */ KProperty[] g = {ra.a(mx1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final yx1 c;
    public final qx1 d;
    public final qm2 e;
    public lx1 f = lx1.b;

    public mx1(ViewPager2 viewPager2, yx1 yx1Var, qx1 qx1Var) {
        this.c = yx1Var;
        this.d = qx1Var;
        this.e = new qm2(viewPager2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Unit unit;
        ViewPager2 viewPager2;
        qm2 qm2Var = this.e;
        KProperty kProperty = g[0];
        ViewPager2 viewPager22 = (ViewPager2) qm2Var.a.get();
        if (viewPager22 != null) {
            if (hl3.a.a(viewPager22).a > 0) {
                RecyclerView.Adapter adapter = viewPager22.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager22.getCurrentItem();
                    if (currentItem == 0) {
                        this.f = lx1.b;
                    } else if (currentItem == itemCount - 1) {
                        this.f = lx1.c;
                    }
                } else {
                    this.b = bt.c;
                }
                int ordinal = this.f.ordinal();
                if (ordinal == 0) {
                    ViewPager2 viewPager23 = (ViewPager2) this.c.a.get();
                    if (viewPager23 != null) {
                        viewPager23.setCurrentItem(viewPager23.getCurrentItem() + 1, true);
                    }
                } else if (ordinal == 1 && (viewPager2 = (ViewPager2) this.c.a.get()) != null) {
                    viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
                }
                qx1 qx1Var = this.d;
                if (qx1Var.e) {
                    qx1Var.a("first_auto_swipe");
                    qx1Var.e = false;
                }
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.b = bt.c;
        }
    }
}

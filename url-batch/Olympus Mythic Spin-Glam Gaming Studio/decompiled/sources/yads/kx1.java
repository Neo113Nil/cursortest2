package yads;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class kx1 {
    public static final /* synthetic */ KProperty[] f = {ra.a(kx1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final yx1 a;
    public final qx1 b;
    public final qm2 c;
    public oh1 d;
    public boolean e = true;

    public kx1(ViewPager2 viewPager2, yx1 yx1Var, qx1 qx1Var) {
        this.a = yx1Var;
        this.b = qx1Var;
        this.c = new qm2(viewPager2);
    }

    public final void a() {
        oh1 oh1Var = this.d;
        if (oh1Var != null) {
            oh1Var.a.removeCallbacksAndMessages(null);
        }
        this.d = null;
    }
}

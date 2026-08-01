package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class u80 extends hd {
    public kc a;

    @Override // defpackage.hd
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new kc(view);
        }
        kc kcVar = this.a;
        View view2 = (View) kcVar.c;
        kcVar.a = view2.getTop();
        kcVar.b = view2.getLeft();
        kc kcVar2 = this.a;
        View view3 = (View) kcVar2.c;
        int top = 0 - (view3.getTop() - kcVar2.a);
        WeakHashMap weakHashMap = f80.a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - kcVar2.b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}

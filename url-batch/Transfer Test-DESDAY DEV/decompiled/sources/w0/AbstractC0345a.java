package w0;

import K.T;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0346a;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0345a extends AbstractC0346a {

    /* renamed from: a, reason: collision with root package name */
    public l f4048a;

    @Override // x.AbstractC0346a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f4048a == null) {
            this.f4048a = new l(view);
        }
        l lVar = this.f4048a;
        View view2 = (View) lVar.f1906a;
        lVar.f1907b = view2.getTop();
        lVar.f1908c = view2.getLeft();
        l lVar2 = this.f4048a;
        View view3 = (View) lVar2.f1906a;
        int top = 0 - (view3.getTop() - lVar2.f1907b);
        WeakHashMap weakHashMap = T.f372a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1908c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}

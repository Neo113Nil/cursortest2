package u0;

import K.T;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0379a;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0373a extends AbstractC0379a {

    /* renamed from: a, reason: collision with root package name */
    public l f4173a;

    @Override // x.AbstractC0379a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f4173a == null) {
            this.f4173a = new l(view);
        }
        l lVar = this.f4173a;
        View view2 = lVar.f2274a;
        lVar.f2275b = view2.getTop();
        lVar.f2276c = view2.getLeft();
        l lVar2 = this.f4173a;
        View view3 = lVar2.f2274a;
        int top = 0 - (view3.getTop() - lVar2.f2275b);
        WeakHashMap weakHashMap = T.f633a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f2276c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}

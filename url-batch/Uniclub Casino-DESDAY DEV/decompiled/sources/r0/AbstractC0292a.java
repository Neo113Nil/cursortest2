package r0;

import K.S;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import x.AbstractC0333a;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0292a extends AbstractC0333a {

    /* renamed from: a, reason: collision with root package name */
    public l f3582a;

    @Override // x.AbstractC0333a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3582a == null) {
            this.f3582a = new l(view);
        }
        l lVar = this.f3582a;
        View view2 = lVar.f1680a;
        lVar.f1681b = view2.getTop();
        lVar.f1682c = view2.getLeft();
        l lVar2 = this.f3582a;
        View view3 = lVar2.f1680a;
        int top = 0 - (view3.getTop() - lVar2.f1681b);
        WeakHashMap weakHashMap = S.f360a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - lVar2.f1682c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}

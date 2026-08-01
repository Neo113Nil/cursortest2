package x0;

import K.InterfaceC0019s;
import K.T;
import K.x0;
import K.z0;
import L.t;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;
import x.d;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348b implements t, InterfaceC0019s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4069a;

    public /* synthetic */ C0348b(Object obj) {
        this.f4069a = obj;
    }

    @Override // L.t
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f4069a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = T.f372a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(RecyclerView.f1570A0);
        return true;
    }

    @Override // K.InterfaceC0019s
    public z0 c(View view, z0 z0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f4069a;
        if (!Objects.equals(coordinatorLayout.f1430n, z0Var)) {
            coordinatorLayout.f1430n = z0Var;
            boolean z2 = z0Var.d() > 0;
            coordinatorLayout.f1431o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            x0 x0Var = z0Var.f465a;
            if (!x0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = T.f372a;
                    if (childAt.getFitsSystemWindows() && ((d) childAt.getLayoutParams()).f4050a != null && x0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return z0Var;
    }
}

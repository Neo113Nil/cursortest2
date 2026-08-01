package l;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.InterfaceC0156k;
import k.MenuC0158m;
import t0.InterfaceC0317a;
import x.C0339d;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0249n implements InterfaceC0156k, InterfaceC0224a0, L.s, InterfaceC0317a, K.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3013a;

    public /* synthetic */ C0249n(Object obj) {
        this.f3013a = obj;
    }

    public void a(int i) {
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3013a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.T.f381a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // K.r
    public K.x0 c(View view, K.x0 x0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3013a;
        if (!Objects.equals(coordinatorLayout.f1280n, x0Var)) {
            coordinatorLayout.f1280n = x0Var;
            boolean z2 = x0Var.d() > 0;
            coordinatorLayout.f1281o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            K.v0 v0Var = x0Var.f468a;
            if (!v0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = K.T.f381a;
                    if (childAt.getFitsSystemWindows() && ((C0339d) childAt.getLayoutParams()).f4154a != null && v0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return x0Var;
    }

    public void d(int i, float f2) {
    }

    @Override // k.InterfaceC0156k
    public void e(MenuC0158m menuC0158m) {
        W0 w02 = ((ActionMenuView) this.f3013a).f1188u;
        if (w02 != null) {
            w02.e(menuC0158m);
        }
    }

    @Override // k.InterfaceC0156k
    public boolean f(MenuC0158m menuC0158m, MenuItem menuItem) {
        InterfaceC0251o interfaceC0251o = ((ActionMenuView) this.f3013a).f1193z;
        if (interfaceC0251o != null) {
            Iterator it = ((CopyOnWriteArrayList) ((W0) interfaceC0251o).f2921a.f1212G.f432c).iterator();
            while (it.hasNext()) {
                if (((X.B) it.next()).f787a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void g(int i) {
    }

    public C0249n() {
        this.f3013a = new LinkedHashSet();
    }

    public C0249n(j1.a aVar) {
        this.f3013a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}

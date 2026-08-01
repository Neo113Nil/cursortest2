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
import k.InterfaceC0166k;
import k.MenuC0168m;
import x.C0336d;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0238n implements InterfaceC0166k, InterfaceC0213a0, L.s, v0.a, K.r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3038a;

    public /* synthetic */ C0238n(Object obj) {
        this.f3038a = obj;
    }

    public void a(int i) {
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3038a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.S.f360a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // K.r
    public K.w0 c(View view, K.w0 w0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3038a;
        if (!Objects.equals(coordinatorLayout.f1282n, w0Var)) {
            coordinatorLayout.f1282n = w0Var;
            boolean z2 = w0Var.d() > 0;
            coordinatorLayout.f1283o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            K.u0 u0Var = w0Var.f447a;
            if (!u0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = K.S.f360a;
                    if (childAt.getFitsSystemWindows() && ((C0336d) childAt.getLayoutParams()).f4100a != null && u0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return w0Var;
    }

    public void d(int i, float f2) {
    }

    @Override // k.InterfaceC0166k
    public void e(MenuC0168m menuC0168m) {
        W0 w02 = ((ActionMenuView) this.f3038a).f1190u;
        if (w02 != null) {
            w02.e(menuC0168m);
        }
    }

    @Override // k.InterfaceC0166k
    public boolean f(MenuC0168m menuC0168m, MenuItem menuItem) {
        InterfaceC0240o interfaceC0240o = ((ActionMenuView) this.f3038a).f1195z;
        if (interfaceC0240o != null) {
            Iterator it = ((CopyOnWriteArrayList) ((W0) interfaceC0240o).f2946a.f1214G.f414c).iterator();
            while (it.hasNext()) {
                if (((X.B) it.next()).f791a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void g(int i) {
    }

    public C0238n() {
        this.f3038a = new LinkedHashSet();
    }

    public C0238n(j1.a aVar) {
        this.f3038a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}

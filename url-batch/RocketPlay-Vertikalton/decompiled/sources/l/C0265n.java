package l;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import k.InterfaceC0200k;
import k.MenuC0202m;
import y0.InterfaceC0382a;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0265n implements InterfaceC0200k, Z, L.s, K.r, InterfaceC0382a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3473a;

    public /* synthetic */ C0265n(Object obj) {
        this.f3473a = obj;
    }

    public void a(int i) {
    }

    @Override // L.s
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3473a;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = K.T.f633a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(RecyclerView.f1949A0);
        return true;
    }

    @Override // K.r
    public K.z0 c(View view, K.z0 z0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3473a;
        if (!Objects.equals(coordinatorLayout.f1816n, z0Var)) {
            coordinatorLayout.f1816n = z0Var;
            boolean z2 = z0Var.d() > 0;
            coordinatorLayout.f1817o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            K.x0 x0Var = z0Var.f729a;
            if (!x0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = K.T.f633a;
                    if (childAt.getFitsSystemWindows() && ((x.d) childAt.getLayoutParams()).f4447a != null && x0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return z0Var;
    }

    public void d(int i, float f2) {
    }

    @Override // k.InterfaceC0200k
    public void e(MenuC0202m menuC0202m) {
        X0 x02 = ((ActionMenuView) this.f3473a).f1724u;
        if (x02 != null) {
            x02.e(menuC0202m);
        }
    }

    @Override // k.InterfaceC0200k
    public boolean f(MenuC0202m menuC0202m, MenuItem menuItem) {
        InterfaceC0267o interfaceC0267o = ((ActionMenuView) this.f3473a).f1729z;
        if (interfaceC0267o != null) {
            Iterator it = ((CopyOnWriteArrayList) ((X0) interfaceC0267o).f3381a.f1748G.f684b).iterator();
            while (it.hasNext()) {
                if (((Y.B) it.next()).f1322a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void g(int i) {
    }

    public void h(String str, String str2) {
        i1.f.e(str, "name");
        i1.f.e(str2, "value");
        ArrayList arrayList = (ArrayList) this.f3473a;
        arrayList.add(str);
        arrayList.add(p1.d.a0(str2).toString());
    }

    public x1.j i() {
        return new x1.j((String[]) ((ArrayList) this.f3473a).toArray(new String[0]));
    }

    public void j(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f3473a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public C0265n(int i) {
        switch (i) {
            case 5:
                this.f3473a = new ArrayList(20);
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                i1.f.e(timeUnit, "timeUnit");
                this.f3473a = new B1.n(A1.f.h, timeUnit);
                break;
        }
    }
}

package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0176b;
import java.util.ArrayList;
import k.C0204o;
import k.C0206q;
import k.InterfaceC0214y;
import k.MenuC0202m;
import k.SubMenuC0189E;

/* loaded from: classes.dex */
public final class Z0 implements InterfaceC0214y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0202m f3392a;

    /* renamed from: b, reason: collision with root package name */
    public C0204o f3393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3394c;

    public Z0(Toolbar toolbar) {
        this.f3394c = toolbar;
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
    }

    @Override // k.InterfaceC0214y
    public final void c() {
        if (this.f3393b != null) {
            MenuC0202m menuC0202m = this.f3392a;
            if (menuC0202m != null) {
                int size = menuC0202m.f3191f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f3392a.getItem(i) == this.f3393b) {
                        return;
                    }
                }
            }
            h(this.f3393b);
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean d(C0204o c0204o) {
        Toolbar toolbar = this.f3394c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0204o.getActionView();
        toolbar.i = actionView;
        this.f3393b = c0204o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            a1 h = Toolbar.h();
            h.f3399a = (toolbar.f1769n & 112) | 8388611;
            h.f3400b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((a1) childAt.getLayoutParams()).f3400b != 2 && childAt != toolbar.f1759a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1747E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0204o.f3213C = true;
        c0204o.f3224n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0176b) {
            ((C0206q) ((InterfaceC0176b) callback)).f3240a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0214y
    public final boolean e(SubMenuC0189E subMenuC0189E) {
        return false;
    }

    @Override // k.InterfaceC0214y
    public final boolean h(C0204o c0204o) {
        Toolbar toolbar = this.f3394c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0176b) {
            ((C0206q) ((InterfaceC0176b) callback)).f3240a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1747E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f3393b = null;
        toolbar.requestLayout();
        c0204o.f3213C = false;
        c0204o.f3224n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0214y
    public final void j(Context context, MenuC0202m menuC0202m) {
        C0204o c0204o;
        MenuC0202m menuC0202m2 = this.f3392a;
        if (menuC0202m2 != null && (c0204o = this.f3393b) != null) {
            menuC0202m2.d(c0204o);
        }
        this.f3392a = menuC0202m;
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        return false;
    }
}

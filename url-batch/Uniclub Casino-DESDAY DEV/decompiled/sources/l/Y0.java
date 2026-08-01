package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0149b;
import java.util.ArrayList;
import k.C0170o;
import k.C0172q;
import k.InterfaceC0180y;
import k.MenuC0168m;
import k.SubMenuC0155E;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC0180y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0168m f2947a;

    /* renamed from: b, reason: collision with root package name */
    public C0170o f2948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2949c;

    public Y0(Toolbar toolbar) {
        this.f2949c = toolbar;
    }

    @Override // k.InterfaceC0180y
    public final void b(MenuC0168m menuC0168m, boolean z2) {
    }

    @Override // k.InterfaceC0180y
    public final void c() {
        if (this.f2948b != null) {
            MenuC0168m menuC0168m = this.f2947a;
            if (menuC0168m != null) {
                int size = menuC0168m.f2695f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2947a.getItem(i) == this.f2948b) {
                        return;
                    }
                }
            }
            h(this.f2948b);
        }
    }

    @Override // k.InterfaceC0180y
    public final boolean d(C0170o c0170o) {
        Toolbar toolbar = this.f2949c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0170o.getActionView();
        toolbar.i = actionView;
        this.f2948b = c0170o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Z0 h = Toolbar.h();
            h.f2960a = (toolbar.f1235n & 112) | 8388611;
            h.f2961b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Z0) childAt.getLayoutParams()).f2961b != 2 && childAt != toolbar.f1225a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1213E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0170o.f2717C = true;
        c0170o.f2728n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0149b) {
            ((C0172q) ((InterfaceC0149b) callback)).f2744a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0180y
    public final boolean e(SubMenuC0155E subMenuC0155E) {
        return false;
    }

    @Override // k.InterfaceC0180y
    public final boolean h(C0170o c0170o) {
        Toolbar toolbar = this.f2949c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0149b) {
            ((C0172q) ((InterfaceC0149b) callback)).f2744a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1213E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2948b = null;
        toolbar.requestLayout();
        c0170o.f2717C = false;
        c0170o.f2728n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0180y
    public final void j(Context context, MenuC0168m menuC0168m) {
        C0170o c0170o;
        MenuC0168m menuC0168m2 = this.f2947a;
        if (menuC0168m2 != null && (c0170o = this.f2948b) != null) {
            menuC0168m2.d(c0170o);
        }
        this.f2947a = menuC0168m;
    }

    @Override // k.InterfaceC0180y
    public final boolean k() {
        return false;
    }
}

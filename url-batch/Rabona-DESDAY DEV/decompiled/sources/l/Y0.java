package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0139b;
import java.util.ArrayList;
import k.C0160o;
import k.C0162q;
import k.InterfaceC0170y;
import k.MenuC0158m;
import k.SubMenuC0145E;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC0170y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0158m f2944a;

    /* renamed from: b, reason: collision with root package name */
    public C0160o f2945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2946c;

    public Y0(Toolbar toolbar) {
        this.f2946c = toolbar;
    }

    @Override // k.InterfaceC0170y
    public final void b(MenuC0158m menuC0158m, boolean z2) {
    }

    @Override // k.InterfaceC0170y
    public final void c() {
        if (this.f2945b != null) {
            MenuC0158m menuC0158m = this.f2944a;
            if (menuC0158m != null) {
                int size = menuC0158m.f2692f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2944a.getItem(i) == this.f2945b) {
                        return;
                    }
                }
            }
            h(this.f2945b);
        }
    }

    @Override // k.InterfaceC0170y
    public final boolean d(C0160o c0160o) {
        Toolbar toolbar = this.f2946c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0160o.getActionView();
        toolbar.i = actionView;
        this.f2945b = c0160o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Z0 h = Toolbar.h();
            h.f2957a = (toolbar.f1236n & 112) | 8388611;
            h.f2958b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Z0) childAt.getLayoutParams()).f2958b != 2 && childAt != toolbar.f1226a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1214E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0160o.f2714C = true;
        c0160o.f2725n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0139b) {
            ((C0162q) ((InterfaceC0139b) callback)).f2741a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0170y
    public final boolean e(SubMenuC0145E subMenuC0145E) {
        return false;
    }

    @Override // k.InterfaceC0170y
    public final boolean h(C0160o c0160o) {
        Toolbar toolbar = this.f2946c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0139b) {
            ((C0162q) ((InterfaceC0139b) callback)).f2741a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1214E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2945b = null;
        toolbar.requestLayout();
        c0160o.f2714C = false;
        c0160o.f2725n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0170y
    public final void j(Context context, MenuC0158m menuC0158m) {
        C0160o c0160o;
        MenuC0158m menuC0158m2 = this.f2944a;
        if (menuC0158m2 != null && (c0160o = this.f2945b) != null) {
            menuC0158m2.d(c0160o);
        }
        this.f2944a = menuC0158m;
    }

    @Override // k.InterfaceC0170y
    public final boolean k() {
        return false;
    }
}

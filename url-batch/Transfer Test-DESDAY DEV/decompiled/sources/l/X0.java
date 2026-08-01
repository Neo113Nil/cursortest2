package l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0145b;
import java.util.ArrayList;
import k.C0166o;
import k.C0168q;
import k.InterfaceC0176y;
import k.MenuC0164m;
import k.SubMenuC0151E;

/* loaded from: classes.dex */
public final class X0 implements InterfaceC0176y {

    /* renamed from: a, reason: collision with root package name */
    public MenuC0164m f2961a;

    /* renamed from: b, reason: collision with root package name */
    public C0166o f2962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2963c;

    public X0(Toolbar toolbar) {
        this.f2963c = toolbar;
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
    }

    @Override // k.InterfaceC0176y
    public final void c() {
        if (this.f2962b != null) {
            MenuC0164m menuC0164m = this.f2961a;
            if (menuC0164m != null) {
                int size = menuC0164m.f2760f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2961a.getItem(i) == this.f2962b) {
                        return;
                    }
                }
            }
            h(this.f2962b);
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean d(C0166o c0166o) {
        Toolbar toolbar = this.f2963c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = c0166o.getActionView();
        toolbar.i = actionView;
        this.f2962b = c0166o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            Y0 h = Toolbar.h();
            h.f2964a = (toolbar.f1383n & 112) | 8388611;
            h.f2965b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Y0) childAt.getLayoutParams()).f2965b != 2 && childAt != toolbar.f1373a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1361E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0166o.f2782C = true;
        c0166o.f2793n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0145b) {
            ((C0168q) ((InterfaceC0145b) callback)).f2809a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0176y
    public final boolean f(SubMenuC0151E subMenuC0151E) {
        return false;
    }

    @Override // k.InterfaceC0176y
    public final boolean h(C0166o c0166o) {
        Toolbar toolbar = this.f2963c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof InterfaceC0145b) {
            ((C0168q) ((InterfaceC0145b) callback)).f2809a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.f1361E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2962b = null;
        toolbar.requestLayout();
        c0166o.f2782C = false;
        c0166o.f2793n.p(false);
        toolbar.u();
        return true;
    }

    @Override // k.InterfaceC0176y
    public final void j(Context context, MenuC0164m menuC0164m) {
        C0166o c0166o;
        MenuC0164m menuC0164m2 = this.f2961a;
        if (menuC0164m2 != null && (c0166o = this.f2962b) != null) {
            menuC0164m2.d(c0166o);
        }
        this.f2961a = menuC0164m;
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        return false;
    }
}

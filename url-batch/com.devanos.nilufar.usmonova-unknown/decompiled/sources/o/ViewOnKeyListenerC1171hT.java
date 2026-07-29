package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.hT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1171hT extends AbstractC1614oC implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean A;
    public final Context i;
    public final MenuC0825cC j;
    public final ZB k;
    public final boolean l;
    public final int m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final C2009uC f175o;
    public PopupWindow.OnDismissListener r;
    public View s;
    public View t;
    public InterfaceC2075vC u;
    public ViewTreeObserver v;
    public boolean w;
    public boolean x;
    public int y;
    public final B5 p = new B5(3, this);
    public final W2 q = new W2(2, this);
    public int z = 0;

    public ViewOnKeyListenerC1171hT(Context context, MenuC0825cC menuC0825cC, View view, int i, boolean z) {
        this.i = context;
        this.j = menuC0825cC;
        this.l = z;
        this.k = new ZB(menuC0825cC, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.n = i;
        Resources resources = context.getResources();
        this.m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.s = view;
        this.f175o = new C2009uC(context, null, i);
        menuC0825cC.b(this, context);
    }

    @Override // o.InterfaceC1629oR
    public final boolean a() {
        return !this.w && this.f175o.F.isShowing();
    }

    @Override // o.InterfaceC2141wC
    public final void b(MenuC0825cC menuC0825cC, boolean z) {
        if (menuC0825cC != this.j) {
            return;
        }
        dismiss();
        InterfaceC2075vC interfaceC2075vC = this.u;
        if (interfaceC2075vC != null) {
            interfaceC2075vC.b(menuC0825cC, z);
        }
    }

    @Override // o.InterfaceC2141wC
    public final void c() {
        this.x = false;
        ZB zb = this.k;
        if (zb != null) {
            zb.notifyDataSetChanged();
        }
    }

    @Override // o.InterfaceC1629oR
    public final void d() {
        View view;
        if (a()) {
            return;
        }
        if (this.w || (view = this.s) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.t = view;
        C2009uC c2009uC = this.f175o;
        c2009uC.F.setOnDismissListener(this);
        c2009uC.w = this;
        c2009uC.E = true;
        c2009uC.F.setFocusable(true);
        View view2 = this.t;
        boolean z = this.v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.v = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.p);
        }
        view2.addOnAttachStateChangeListener(this.q);
        c2009uC.v = view2;
        c2009uC.s = this.z;
        boolean z2 = this.x;
        Context context = this.i;
        ZB zb = this.k;
        if (!z2) {
            this.y = AbstractC1614oC.m(zb, context, this.m);
            this.x = true;
        }
        c2009uC.r(this.y);
        c2009uC.F.setInputMethodMode(2);
        Rect rect = this.h;
        c2009uC.D = rect != null ? new Rect(rect) : null;
        c2009uC.d();
        C1713pj c1713pj = c2009uC.j;
        c1713pj.setOnKeyListener(this);
        if (this.A) {
            MenuC0825cC menuC0825cC = this.j;
            if (menuC0825cC.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1713pj, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0825cC.m);
                }
                frameLayout.setEnabled(false);
                c1713pj.addHeaderView(frameLayout, null, false);
            }
        }
        c2009uC.p(zb);
        c2009uC.d();
    }

    @Override // o.InterfaceC1629oR
    public final void dismiss() {
        if (a()) {
            this.f175o.dismiss();
        }
    }

    @Override // o.InterfaceC1629oR
    public final C1713pj f() {
        return this.f175o.j;
    }

    @Override // o.InterfaceC2141wC
    public final void g(InterfaceC2075vC interfaceC2075vC) {
        this.u = interfaceC2075vC;
    }

    @Override // o.InterfaceC2141wC
    public final boolean i() {
        return false;
    }

    @Override // o.InterfaceC2141wC
    public final boolean j(SubMenuC0909dU subMenuC0909dU) {
        boolean z;
        if (subMenuC0909dU.hasVisibleItems()) {
            C1746qC c1746qC = new C1746qC(this.i, subMenuC0909dU, this.t, this.l, this.n, 0);
            InterfaceC2075vC interfaceC2075vC = this.u;
            c1746qC.h = interfaceC2075vC;
            AbstractC1614oC abstractC1614oC = c1746qC.i;
            if (abstractC1614oC != null) {
                abstractC1614oC.g(interfaceC2075vC);
            }
            int size = subMenuC0909dU.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC0909dU.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c1746qC.g = z;
            AbstractC1614oC abstractC1614oC2 = c1746qC.i;
            if (abstractC1614oC2 != null) {
                abstractC1614oC2.o(z);
            }
            c1746qC.j = this.r;
            this.r = null;
            this.j.c(false);
            C2009uC c2009uC = this.f175o;
            int i2 = c2009uC.m;
            int n = c2009uC.n();
            if ((Gravity.getAbsoluteGravity(this.z, this.s.getLayoutDirection()) & 7) == 5) {
                i2 += this.s.getWidth();
            }
            if (!c1746qC.b()) {
                if (c1746qC.e != null) {
                    c1746qC.d(i2, n, true, true);
                }
            }
            InterfaceC2075vC interfaceC2075vC2 = this.u;
            if (interfaceC2075vC2 != null) {
                interfaceC2075vC2.z(subMenuC0909dU);
            }
            return true;
        }
        return false;
    }

    @Override // o.AbstractC1614oC
    public final void n(View view) {
        this.s = view;
    }

    @Override // o.AbstractC1614oC
    public final void o(boolean z) {
        this.k.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.w = true;
        this.j.c(true);
        ViewTreeObserver viewTreeObserver = this.v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.v = this.t.getViewTreeObserver();
            }
            this.v.removeGlobalOnLayoutListener(this.p);
            this.v = null;
        }
        this.t.removeOnAttachStateChangeListener(this.q);
        PopupWindow.OnDismissListener onDismissListener = this.r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.AbstractC1614oC
    public final void p(int i) {
        this.z = i;
    }

    @Override // o.AbstractC1614oC
    public final void q(int i) {
        this.f175o.m = i;
    }

    @Override // o.AbstractC1614oC
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.r = onDismissListener;
    }

    @Override // o.AbstractC1614oC
    public final void s(boolean z) {
        this.A = z;
    }

    @Override // o.AbstractC1614oC
    public final void t(int i) {
        this.f175o.i(i);
    }

    @Override // o.AbstractC1614oC
    public final void l(MenuC0825cC menuC0825cC) {
    }
}

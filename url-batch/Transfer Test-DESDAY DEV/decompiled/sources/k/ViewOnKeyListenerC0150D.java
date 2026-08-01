package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.football.transfertrivia.R;
import l.C0233r0;
import l.J0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0150D extends AbstractC0172u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2680b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0164m f2681c;
    public final C0161j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2682e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2683f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2684g;
    public final J0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0173v f2686k;

    /* renamed from: l, reason: collision with root package name */
    public View f2687l;

    /* renamed from: m, reason: collision with root package name */
    public View f2688m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0175x f2689n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2690o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2691p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2692q;

    /* renamed from: r, reason: collision with root package name */
    public int f2693r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2695t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0155d i = new ViewTreeObserverOnGlobalLayoutListenerC0155d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final R0.n f2685j = new R0.n(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2694s = 0;

    public ViewOnKeyListenerC0150D(int i, Context context, View view, MenuC0164m menuC0164m, boolean z2) {
        this.f2680b = context;
        this.f2681c = menuC0164m;
        this.f2682e = z2;
        this.d = new C0161j(menuC0164m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2684g = i;
        Resources resources = context.getResources();
        this.f2683f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2687l = view;
        this.h = new J0(context, null, i);
        menuC0164m.b(this, context);
    }

    @Override // k.InterfaceC0149C
    public final boolean a() {
        return !this.f2691p && this.h.f2889z.isShowing();
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        if (menuC0164m != this.f2681c) {
            return;
        }
        dismiss();
        InterfaceC0175x interfaceC0175x = this.f2689n;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, z2);
        }
    }

    @Override // k.InterfaceC0176y
    public final void c() {
        this.f2692q = false;
        C0161j c0161j = this.d;
        if (c0161j != null) {
            c0161j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0149C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0149C
    public final C0233r0 e() {
        return this.h.f2869c;
    }

    @Override // k.InterfaceC0176y
    public final boolean f(SubMenuC0151E subMenuC0151E) {
        if (subMenuC0151E.hasVisibleItems()) {
            View view = this.f2688m;
            C0174w c0174w = new C0174w(this.f2684g, this.f2680b, view, subMenuC0151E, this.f2682e);
            InterfaceC0175x interfaceC0175x = this.f2689n;
            c0174w.h = interfaceC0175x;
            AbstractC0172u abstractC0172u = c0174w.i;
            if (abstractC0172u != null) {
                abstractC0172u.g(interfaceC0175x);
            }
            boolean u2 = AbstractC0172u.u(subMenuC0151E);
            c0174w.f2822g = u2;
            AbstractC0172u abstractC0172u2 = c0174w.i;
            if (abstractC0172u2 != null) {
                abstractC0172u2.o(u2);
            }
            c0174w.f2823j = this.f2686k;
            this.f2686k = null;
            this.f2681c.c(false);
            J0 j02 = this.h;
            int i = j02.f2871f;
            int j2 = j02.j();
            if ((Gravity.getAbsoluteGravity(this.f2694s, this.f2687l.getLayoutDirection()) & 7) == 5) {
                i += this.f2687l.getWidth();
            }
            if (!c0174w.b()) {
                if (c0174w.f2820e != null) {
                    c0174w.d(i, j2, true, true);
                }
            }
            InterfaceC0175x interfaceC0175x2 = this.f2689n;
            if (interfaceC0175x2 != null) {
                interfaceC0175x2.g(subMenuC0151E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0176y
    public final void g(InterfaceC0175x interfaceC0175x) {
        this.f2689n = interfaceC0175x;
    }

    @Override // k.InterfaceC0149C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2691p || (view = this.f2687l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2688m = view;
        J0 j02 = this.h;
        j02.f2889z.setOnDismissListener(this);
        j02.f2879p = this;
        j02.f2888y = true;
        j02.f2889z.setFocusable(true);
        View view2 = this.f2688m;
        boolean z2 = this.f2690o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2690o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2685j);
        j02.f2878o = view2;
        j02.f2875l = this.f2694s;
        boolean z3 = this.f2692q;
        Context context = this.f2680b;
        C0161j c0161j = this.d;
        if (!z3) {
            this.f2693r = AbstractC0172u.m(c0161j, context, this.f2683f);
            this.f2692q = true;
        }
        j02.q(this.f2693r);
        j02.f2889z.setInputMethodMode(2);
        Rect rect = this.f2815a;
        j02.f2887x = rect != null ? new Rect(rect) : null;
        j02.i();
        C0233r0 c0233r0 = j02.f2869c;
        c0233r0.setOnKeyListener(this);
        if (this.f2695t) {
            MenuC0164m menuC0164m = this.f2681c;
            if (menuC0164m.f2765m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0233r0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0164m.f2765m);
                }
                frameLayout.setEnabled(false);
                c0233r0.addHeaderView(frameLayout, null, false);
            }
        }
        j02.n(c0161j);
        j02.i();
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0172u
    public final void l(MenuC0164m menuC0164m) {
    }

    @Override // k.AbstractC0172u
    public final void n(View view) {
        this.f2687l = view;
    }

    @Override // k.AbstractC0172u
    public final void o(boolean z2) {
        this.d.f2752c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2691p = true;
        this.f2681c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2690o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2690o = this.f2688m.getViewTreeObserver();
            }
            this.f2690o.removeGlobalOnLayoutListener(this.i);
            this.f2690o = null;
        }
        this.f2688m.removeOnAttachStateChangeListener(this.f2685j);
        C0173v c0173v = this.f2686k;
        if (c0173v != null) {
            c0173v.onDismiss();
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

    @Override // k.AbstractC0172u
    public final void p(int i) {
        this.f2694s = i;
    }

    @Override // k.AbstractC0172u
    public final void q(int i) {
        this.h.f2871f = i;
    }

    @Override // k.AbstractC0172u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2686k = (C0173v) onDismissListener;
    }

    @Override // k.AbstractC0172u
    public final void s(boolean z2) {
        this.f2695t = z2;
    }

    @Override // k.AbstractC0172u
    public final void t(int i) {
        this.h.l(i);
    }
}

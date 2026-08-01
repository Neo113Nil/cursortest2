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
import com.fortuneodd.shadegrid.R;
import l.C0251t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0154D extends AbstractC0176u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2615b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0168m f2616c;
    public final C0165j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2617e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2618f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2619g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0177v f2621k;

    /* renamed from: l, reason: collision with root package name */
    public View f2622l;

    /* renamed from: m, reason: collision with root package name */
    public View f2623m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0179x f2624n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2625o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2626p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2627q;

    /* renamed from: r, reason: collision with root package name */
    public int f2628r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2630t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0159d i = new ViewTreeObserverOnGlobalLayoutListenerC0159d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final M0.o f2620j = new M0.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f2629s = 0;

    public ViewOnKeyListenerC0154D(int i, Context context, View view, MenuC0168m menuC0168m, boolean z2) {
        this.f2615b = context;
        this.f2616c = menuC0168m;
        this.f2617e = z2;
        this.d = new C0165j(menuC0168m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2619g = i;
        Resources resources = context.getResources();
        this.f2618f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2622l = view;
        this.h = new L0(context, null, i);
        menuC0168m.b(this, context);
    }

    @Override // k.InterfaceC0153C
    public final boolean a() {
        return !this.f2626p && this.h.f2888z.isShowing();
    }

    @Override // k.InterfaceC0180y
    public final void b(MenuC0168m menuC0168m, boolean z2) {
        if (menuC0168m != this.f2616c) {
            return;
        }
        dismiss();
        InterfaceC0179x interfaceC0179x = this.f2624n;
        if (interfaceC0179x != null) {
            interfaceC0179x.b(menuC0168m, z2);
        }
    }

    @Override // k.InterfaceC0180y
    public final void c() {
        this.f2627q = false;
        C0165j c0165j = this.d;
        if (c0165j != null) {
            c0165j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0153C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0180y
    public final boolean e(SubMenuC0155E subMenuC0155E) {
        if (subMenuC0155E.hasVisibleItems()) {
            View view = this.f2623m;
            C0178w c0178w = new C0178w(this.f2619g, this.f2615b, view, subMenuC0155E, this.f2617e);
            InterfaceC0179x interfaceC0179x = this.f2624n;
            c0178w.h = interfaceC0179x;
            AbstractC0176u abstractC0176u = c0178w.i;
            if (abstractC0176u != null) {
                abstractC0176u.g(interfaceC0179x);
            }
            boolean u2 = AbstractC0176u.u(subMenuC0155E);
            c0178w.f2757g = u2;
            AbstractC0176u abstractC0176u2 = c0178w.i;
            if (abstractC0176u2 != null) {
                abstractC0176u2.o(u2);
            }
            c0178w.f2758j = this.f2621k;
            this.f2621k = null;
            this.f2616c.c(false);
            L0 l02 = this.h;
            int i = l02.f2870f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f2629s, this.f2622l.getLayoutDirection()) & 7) == 5) {
                i += this.f2622l.getWidth();
            }
            if (!c0178w.b()) {
                if (c0178w.f2755e != null) {
                    c0178w.d(i, j2, true, true);
                }
            }
            InterfaceC0179x interfaceC0179x2 = this.f2624n;
            if (interfaceC0179x2 != null) {
                interfaceC0179x2.f(subMenuC0155E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0153C
    public final C0251t0 f() {
        return this.h.f2868c;
    }

    @Override // k.InterfaceC0180y
    public final void g(InterfaceC0179x interfaceC0179x) {
        this.f2624n = interfaceC0179x;
    }

    @Override // k.InterfaceC0153C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2626p || (view = this.f2622l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2623m = view;
        L0 l02 = this.h;
        l02.f2888z.setOnDismissListener(this);
        l02.f2878p = this;
        l02.f2887y = true;
        l02.f2888z.setFocusable(true);
        View view2 = this.f2623m;
        boolean z2 = this.f2625o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2625o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f2620j);
        l02.f2877o = view2;
        l02.f2874l = this.f2629s;
        boolean z3 = this.f2627q;
        Context context = this.f2615b;
        C0165j c0165j = this.d;
        if (!z3) {
            this.f2628r = AbstractC0176u.m(c0165j, context, this.f2618f);
            this.f2627q = true;
        }
        l02.r(this.f2628r);
        l02.f2888z.setInputMethodMode(2);
        Rect rect = this.f2750a;
        l02.f2886x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0251t0 c0251t0 = l02.f2868c;
        c0251t0.setOnKeyListener(this);
        if (this.f2630t) {
            MenuC0168m menuC0168m = this.f2616c;
            if (menuC0168m.f2700m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0251t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0168m.f2700m);
                }
                frameLayout.setEnabled(false);
                c0251t0.addHeaderView(frameLayout, null, false);
            }
        }
        l02.n(c0165j);
        l02.i();
    }

    @Override // k.InterfaceC0180y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0176u
    public final void l(MenuC0168m menuC0168m) {
    }

    @Override // k.AbstractC0176u
    public final void n(View view) {
        this.f2622l = view;
    }

    @Override // k.AbstractC0176u
    public final void o(boolean z2) {
        this.d.f2687c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2626p = true;
        this.f2616c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2625o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2625o = this.f2623m.getViewTreeObserver();
            }
            this.f2625o.removeGlobalOnLayoutListener(this.i);
            this.f2625o = null;
        }
        this.f2623m.removeOnAttachStateChangeListener(this.f2620j);
        C0177v c0177v = this.f2621k;
        if (c0177v != null) {
            c0177v.onDismiss();
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

    @Override // k.AbstractC0176u
    public final void p(int i) {
        this.f2629s = i;
    }

    @Override // k.AbstractC0176u
    public final void q(int i) {
        this.h.f2870f = i;
    }

    @Override // k.AbstractC0176u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2621k = (C0177v) onDismissListener;
    }

    @Override // k.AbstractC0176u
    public final void s(boolean z2) {
        this.f2630t = z2;
    }

    @Override // k.AbstractC0176u
    public final void t(int i) {
        this.h.l(i);
    }
}

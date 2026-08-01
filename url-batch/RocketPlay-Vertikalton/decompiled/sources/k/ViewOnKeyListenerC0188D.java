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
import com.luckycounter.drinkwater.R;
import l.C0278t0;
import l.L0;

/* renamed from: k.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0188D extends AbstractC0210u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3111b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC0202m f3112c;
    public final C0199j d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3113e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3114f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3115g;
    public final L0 h;

    /* renamed from: k, reason: collision with root package name */
    public C0211v f3117k;

    /* renamed from: l, reason: collision with root package name */
    public View f3118l;

    /* renamed from: m, reason: collision with root package name */
    public View f3119m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0213x f3120n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f3121o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3122p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3123q;

    /* renamed from: r, reason: collision with root package name */
    public int f3124r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3126t;
    public final ViewTreeObserverOnGlobalLayoutListenerC0193d i = new ViewTreeObserverOnGlobalLayoutListenerC0193d(1, this);

    /* renamed from: j, reason: collision with root package name */
    public final P0.n f3116j = new P0.n(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f3125s = 0;

    public ViewOnKeyListenerC0188D(int i, Context context, View view, MenuC0202m menuC0202m, boolean z2) {
        this.f3111b = context;
        this.f3112c = menuC0202m;
        this.f3113e = z2;
        this.d = new C0199j(menuC0202m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f3115g = i;
        Resources resources = context.getResources();
        this.f3114f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3118l = view;
        this.h = new L0(context, null, i);
        menuC0202m.b(this, context);
    }

    @Override // k.InterfaceC0187C
    public final boolean a() {
        return !this.f3122p && this.h.f3321z.isShowing();
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        if (menuC0202m != this.f3112c) {
            return;
        }
        dismiss();
        InterfaceC0213x interfaceC0213x = this.f3120n;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, z2);
        }
    }

    @Override // k.InterfaceC0214y
    public final void c() {
        this.f3123q = false;
        C0199j c0199j = this.d;
        if (c0199j != null) {
            c0199j.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0187C
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean e(SubMenuC0189E subMenuC0189E) {
        if (subMenuC0189E.hasVisibleItems()) {
            View view = this.f3119m;
            C0212w c0212w = new C0212w(this.f3115g, this.f3111b, view, subMenuC0189E, this.f3113e);
            InterfaceC0213x interfaceC0213x = this.f3120n;
            c0212w.h = interfaceC0213x;
            AbstractC0210u abstractC0210u = c0212w.i;
            if (abstractC0210u != null) {
                abstractC0210u.g(interfaceC0213x);
            }
            boolean u2 = AbstractC0210u.u(subMenuC0189E);
            c0212w.f3253g = u2;
            AbstractC0210u abstractC0210u2 = c0212w.i;
            if (abstractC0210u2 != null) {
                abstractC0210u2.o(u2);
            }
            c0212w.f3254j = this.f3117k;
            this.f3117k = null;
            this.f3112c.c(false);
            L0 l02 = this.h;
            int i = l02.f3303f;
            int j2 = l02.j();
            if ((Gravity.getAbsoluteGravity(this.f3125s, this.f3118l.getLayoutDirection()) & 7) == 5) {
                i += this.f3118l.getWidth();
            }
            if (!c0212w.b()) {
                if (c0212w.f3251e != null) {
                    c0212w.d(i, j2, true, true);
                }
            }
            InterfaceC0213x interfaceC0213x2 = this.f3120n;
            if (interfaceC0213x2 != null) {
                interfaceC0213x2.f(subMenuC0189E);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0187C
    public final C0278t0 f() {
        return this.h.f3301c;
    }

    @Override // k.InterfaceC0214y
    public final void g(InterfaceC0213x interfaceC0213x) {
        this.f3120n = interfaceC0213x;
    }

    @Override // k.InterfaceC0187C
    public final void i() {
        View view;
        if (a()) {
            return;
        }
        if (this.f3122p || (view = this.f3118l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3119m = view;
        L0 l02 = this.h;
        l02.f3321z.setOnDismissListener(this);
        l02.f3311p = this;
        l02.f3320y = true;
        l02.f3321z.setFocusable(true);
        View view2 = this.f3119m;
        boolean z2 = this.f3121o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3121o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.i);
        }
        view2.addOnAttachStateChangeListener(this.f3116j);
        l02.f3310o = view2;
        l02.f3307l = this.f3125s;
        boolean z3 = this.f3123q;
        Context context = this.f3111b;
        C0199j c0199j = this.d;
        if (!z3) {
            this.f3124r = AbstractC0210u.m(c0199j, context, this.f3114f);
            this.f3123q = true;
        }
        l02.r(this.f3124r);
        l02.f3321z.setInputMethodMode(2);
        Rect rect = this.f3246a;
        l02.f3319x = rect != null ? new Rect(rect) : null;
        l02.i();
        C0278t0 c0278t0 = l02.f3301c;
        c0278t0.setOnKeyListener(this);
        if (this.f3126t) {
            MenuC0202m menuC0202m = this.f3112c;
            if (menuC0202m.f3196m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0278t0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0202m.f3196m);
                }
                frameLayout.setEnabled(false);
                c0278t0.addHeaderView(frameLayout, null, false);
            }
        }
        l02.n(c0199j);
        l02.i();
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0210u
    public final void l(MenuC0202m menuC0202m) {
    }

    @Override // k.AbstractC0210u
    public final void n(View view) {
        this.f3118l = view;
    }

    @Override // k.AbstractC0210u
    public final void o(boolean z2) {
        this.d.f3183c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3122p = true;
        this.f3112c.c(true);
        ViewTreeObserver viewTreeObserver = this.f3121o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3121o = this.f3119m.getViewTreeObserver();
            }
            this.f3121o.removeGlobalOnLayoutListener(this.i);
            this.f3121o = null;
        }
        this.f3119m.removeOnAttachStateChangeListener(this.f3116j);
        C0211v c0211v = this.f3117k;
        if (c0211v != null) {
            c0211v.onDismiss();
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

    @Override // k.AbstractC0210u
    public final void p(int i) {
        this.f3125s = i;
    }

    @Override // k.AbstractC0210u
    public final void q(int i) {
        this.h.f3303f = i;
    }

    @Override // k.AbstractC0210u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3117k = (C0211v) onDismissListener;
    }

    @Override // k.AbstractC0210u
    public final void s(boolean z2) {
        this.f3126t = z2;
    }

    @Override // k.AbstractC0210u
    public final void t(int i) {
        this.h.l(i);
    }
}

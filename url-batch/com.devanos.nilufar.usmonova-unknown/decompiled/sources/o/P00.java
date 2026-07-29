package o;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class P00 extends AbstractC1075g1 implements InterfaceC1469m1 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public InterfaceC1710pg e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public O00 i;
    public O00 j;
    public C2002u5 k;
    public boolean l;
    public final ArrayList m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f80o;
    public boolean p;
    public boolean q;
    public boolean r;
    public C1183hf s;
    public boolean t;
    public boolean u;
    public final N00 v;
    public final N00 w;
    public final C1818rJ x;

    public P00(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.f80o = true;
        this.r = true;
        this.v = new N00(this, 0);
        this.w = new N00(this, 1);
        this.x = new C1818rJ(25, this);
        View decorView = activity.getWindow().getDecorView();
        q(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // o.AbstractC1075g1
    public final boolean b() {
        YV yv;
        InterfaceC1710pg interfaceC1710pg = this.e;
        if (interfaceC1710pg == null || (yv = ((C1108gW) interfaceC1710pg).a.T) == null || yv.i == null) {
            return false;
        }
        YV yv2 = ((C1108gW) interfaceC1710pg).a.T;
        C1284jC c1284jC = yv2 == null ? null : yv2.i;
        if (c1284jC == null) {
            return true;
        }
        c1284jC.collapseActionView();
        return true;
    }

    @Override // o.AbstractC1075g1
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // o.AbstractC1075g1
    public final int d() {
        return ((C1108gW) this.e).b;
    }

    @Override // o.AbstractC1075g1
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.devanos.nilufar.usmonova.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // o.AbstractC1075g1
    public final void g() {
        r(this.a.getResources().getBoolean(com.devanos.nilufar.usmonova.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // o.AbstractC1075g1
    public final boolean i(int i, KeyEvent keyEvent) {
        MenuC0825cC menuC0825cC;
        O00 o00 = this.i;
        if (o00 == null || (menuC0825cC = o00.k) == null) {
            return false;
        }
        menuC0825cC.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuC0825cC.performShortcut(i, keyEvent, 0);
    }

    @Override // o.AbstractC1075g1
    public final void l(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        C1108gW c1108gW = (C1108gW) this.e;
        int i2 = c1108gW.b;
        this.h = true;
        c1108gW.a((i & 4) | (i2 & (-5)));
    }

    @Override // o.AbstractC1075g1
    public final void m(boolean z2) {
        C1183hf c1183hf;
        this.t = z2;
        if (z2 || (c1183hf = this.s) == null) {
            return;
        }
        c1183hf.a();
    }

    @Override // o.AbstractC1075g1
    public final void n(CharSequence charSequence) {
        C1108gW c1108gW = (C1108gW) this.e;
        if (c1108gW.g) {
            return;
        }
        Toolbar toolbar = c1108gW.a;
        c1108gW.h = charSequence;
        if ((c1108gW.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c1108gW.g) {
                AZ.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // o.AbstractC1075g1
    public final B1 o(C2002u5 c2002u5) {
        O00 o00 = this.i;
        if (o00 != null) {
            o00.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        O00 o002 = new O00(this, this.f.getContext(), c2002u5);
        MenuC0825cC menuC0825cC = o002.k;
        menuC0825cC.w();
        try {
            if (!((A1) o002.l.i).a(o002, menuC0825cC)) {
                return null;
            }
            this.i = o002;
            o002.g();
            this.f.c(o002);
            p(true);
            return o002;
        } finally {
            menuC0825cC.v();
        }
    }

    public final void p(boolean z2) {
        C0942e00 i;
        C0942e00 c0942e00;
        if (z2) {
            if (!this.q) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                s(false);
            }
        } else if (this.q) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            s(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((C1108gW) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((C1108gW) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            C1108gW c1108gW = (C1108gW) this.e;
            i = AZ.a(c1108gW.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new C1042fW(c1108gW, 4));
            c0942e00 = this.f.i(200L, 0);
        } else {
            C1108gW c1108gW2 = (C1108gW) this.e;
            C0942e00 a = AZ.a(c1108gW2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new C1042fW(c1108gW2, 0));
            i = this.f.i(100L, 8);
            c0942e00 = a;
        }
        C1183hf c1183hf = new C1183hf();
        ArrayList arrayList = (ArrayList) c1183hf.j;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0942e00.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0942e00);
        c1183hf.c();
    }

    public final void q(View view) {
        InterfaceC1710pg wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.devanos.nilufar.usmonova.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.devanos.nilufar.usmonova.R.id.action_bar);
        if (findViewById instanceof InterfaceC1710pg) {
            wrapper = (InterfaceC1710pg) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.devanos.nilufar.usmonova.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.devanos.nilufar.usmonova.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC1710pg interfaceC1710pg = this.e;
        if (interfaceC1710pg == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(P00.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C1108gW) interfaceC1710pg).a.getContext();
        this.a = context;
        if ((((C1108gW) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        r(context.getResources().getBoolean(com.devanos.nilufar.usmonova.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, AbstractC1886sL.a, com.devanos.nilufar.usmonova.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.n) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = AZ.a;
            AbstractC1769qZ.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void r(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((C1108gW) this.e).getClass();
        } else {
            ((C1108gW) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((C1108gW) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void s(boolean z2) {
        boolean z3 = this.p;
        boolean z4 = this.q;
        final C1818rJ c1818rJ = this.x;
        View view = this.g;
        if (!z4 && z3) {
            if (this.r) {
                this.r = false;
                C1183hf c1183hf = this.s;
                if (c1183hf != null) {
                    c1183hf.a();
                }
                int i = this.n;
                N00 n00 = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    n00.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                C1183hf c1183hf2 = new C1183hf();
                ArrayList arrayList = (ArrayList) c1183hf2.j;
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C0942e00 a = AZ.a(this.d);
                a.e(f);
                final View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c1818rJ != null ? new ValueAnimator.AnimatorUpdateListener(view2) { // from class: o.d00
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((P00) C1818rJ.this.i).d.getParent()).invalidate();
                        }
                    } : null);
                }
                if (!c1183hf2.i) {
                    arrayList.add(a);
                }
                if (this.f80o && view != null) {
                    C0942e00 a2 = AZ.a(view);
                    a2.e(f);
                    if (!c1183hf2.i) {
                        arrayList.add(a2);
                    }
                }
                boolean z5 = c1183hf2.i;
                if (!z5) {
                    c1183hf2.k = y;
                }
                if (!z5) {
                    c1183hf2.h = 250L;
                }
                if (!z5) {
                    c1183hf2.l = n00;
                }
                this.s = c1183hf2;
                c1183hf2.c();
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        C1183hf c1183hf3 = this.s;
        if (c1183hf3 != null) {
            c1183hf3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        N00 n002 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            C1183hf c1183hf4 = new C1183hf();
            ArrayList arrayList2 = (ArrayList) c1183hf4.j;
            C0942e00 a3 = AZ.a(this.d);
            a3.e(0.0f);
            final View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c1818rJ != null ? new ValueAnimator.AnimatorUpdateListener(view3) { // from class: o.d00
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((P00) C1818rJ.this.i).d.getParent()).invalidate();
                    }
                } : null);
            }
            if (!c1183hf4.i) {
                arrayList2.add(a3);
            }
            if (this.f80o && view != null) {
                view.setTranslationY(f2);
                C0942e00 a4 = AZ.a(view);
                a4.e(0.0f);
                if (!c1183hf4.i) {
                    arrayList2.add(a4);
                }
            }
            boolean z6 = c1183hf4.i;
            if (!z6) {
                c1183hf4.k = z;
            }
            if (!z6) {
                c1183hf4.h = 250L;
            }
            if (!z6) {
                c1183hf4.l = n002;
            }
            this.s = c1183hf4;
            c1183hf4.c();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.f80o && view != null) {
                view.setTranslationY(0.0f);
            }
            n002.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AZ.a;
            AbstractC1637oZ.c(actionBarOverlayLayout);
        }
    }

    public P00(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.f80o = true;
        this.r = true;
        this.v = new N00(this, 0);
        this.w = new N00(this, 1);
        this.x = new C1818rJ(25, this);
        q(dialog.getWindow().getDecorView());
    }
}

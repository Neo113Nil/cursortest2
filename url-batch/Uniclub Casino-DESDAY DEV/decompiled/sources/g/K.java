package g;

import K.S;
import K.X;
import K.Z;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
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
import l.InterfaceC0218d;
import l.InterfaceC0237m0;
import l.d1;

/* loaded from: classes.dex */
public final class K extends q1.d implements InterfaceC0218d {

    /* renamed from: C, reason: collision with root package name */
    public static final AccelerateInterpolator f2268C = new AccelerateInterpolator();

    /* renamed from: D, reason: collision with root package name */
    public static final DecelerateInterpolator f2269D = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public final I f2270A;

    /* renamed from: B, reason: collision with root package name */
    public final C.g f2271B;

    /* renamed from: e, reason: collision with root package name */
    public Context f2272e;

    /* renamed from: f, reason: collision with root package name */
    public Context f2273f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarOverlayLayout f2274g;
    public ActionBarContainer h;
    public InterfaceC0237m0 i;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarContextView f2275j;

    /* renamed from: k, reason: collision with root package name */
    public final View f2276k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2277l;

    /* renamed from: m, reason: collision with root package name */
    public J f2278m;

    /* renamed from: n, reason: collision with root package name */
    public J f2279n;

    /* renamed from: o, reason: collision with root package name */
    public B.j f2280o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2281p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2282q;

    /* renamed from: r, reason: collision with root package name */
    public int f2283r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2284s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2285t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2286u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2287v;

    /* renamed from: w, reason: collision with root package name */
    public j.j f2288w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2289x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2290y;

    /* renamed from: z, reason: collision with root package name */
    public final I f2291z;

    public K(Activity activity, boolean z2) {
        new ArrayList();
        this.f2282q = new ArrayList();
        this.f2283r = 0;
        this.f2284s = true;
        this.f2287v = true;
        this.f2291z = new I(this, 0);
        this.f2270A = new I(this, 1);
        this.f2271B = new C.g(24, this);
        View decorView = activity.getWindow().getDecorView();
        d0(decorView);
        if (z2) {
            return;
        }
        this.f2276k = decorView.findViewById(R.id.content);
    }

    public final void b0(boolean z2) {
        Z i;
        Z z3;
        if (z2) {
            if (!this.f2286u) {
                this.f2286u = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2274g;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g0(false);
            }
        } else if (this.f2286u) {
            this.f2286u = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2274g;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g0(false);
        }
        if (!this.h.isLaidOut()) {
            if (z2) {
                ((d1) this.i).f2979a.setVisibility(4);
                this.f2275j.setVisibility(0);
                return;
            } else {
                ((d1) this.i).f2979a.setVisibility(0);
                this.f2275j.setVisibility(8);
                return;
            }
        }
        if (z2) {
            d1 d1Var = (d1) this.i;
            i = S.a(d1Var.f2979a);
            i.a(0.0f);
            i.c(100L);
            i.d(new j.i(d1Var, 4));
            z3 = this.f2275j.i(0, 200L);
        } else {
            d1 d1Var2 = (d1) this.i;
            Z a2 = S.a(d1Var2.f2979a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(d1Var2, 0));
            i = this.f2275j.i(8, 100L);
            z3 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2602a;
        arrayList.add(i);
        View view = (View) i.f369a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) z3.f369a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(z3);
        jVar.b();
    }

    public final Context c0() {
        if (this.f2273f == null) {
            TypedValue typedValue = new TypedValue();
            this.f2272e.getTheme().resolveAttribute(com.fortuneodd.shadegrid.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2273f = new ContextThemeWrapper(this.f2272e, i);
            } else {
                this.f2273f = this.f2272e;
            }
        }
        return this.f2273f;
    }

    public final void d0(View view) {
        InterfaceC0237m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.fortuneodd.shadegrid.R.id.decor_content_parent);
        this.f2274g = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.fortuneodd.shadegrid.R.id.action_bar);
        if (findViewById instanceof InterfaceC0237m0) {
            wrapper = (InterfaceC0237m0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.i = wrapper;
        this.f2275j = (ActionBarContextView) view.findViewById(com.fortuneodd.shadegrid.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.fortuneodd.shadegrid.R.id.action_bar_container);
        this.h = actionBarContainer;
        InterfaceC0237m0 interfaceC0237m0 = this.i;
        if (interfaceC0237m0 == null || this.f2275j == null || actionBarContainer == null) {
            throw new IllegalStateException(K.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((d1) interfaceC0237m0).f2979a.getContext();
        this.f2272e = context;
        if ((((d1) this.i).f2980b & 4) != 0) {
            this.f2277l = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.i.getClass();
        f0(context.getResources().getBoolean(com.fortuneodd.shadegrid.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2272e.obtainStyledAttributes(null, f.a.f1928a, com.fortuneodd.shadegrid.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2274g;
            if (!actionBarOverlayLayout2.f1167g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2290y = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.h;
            WeakHashMap weakHashMap = S.f360a;
            K.G.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void e0(boolean z2) {
        if (this.f2277l) {
            return;
        }
        int i = z2 ? 4 : 0;
        d1 d1Var = (d1) this.i;
        int i2 = d1Var.f2980b;
        this.f2277l = true;
        d1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void f0(boolean z2) {
        if (z2) {
            this.h.setTabContainer(null);
            ((d1) this.i).getClass();
        } else {
            ((d1) this.i).getClass();
            this.h.setTabContainer(null);
        }
        this.i.getClass();
        ((d1) this.i).f2979a.setCollapsible(false);
        this.f2274g.setHasNonEmbeddedTabs(false);
    }

    public final void g0(boolean z2) {
        boolean z3 = this.f2286u || !this.f2285t;
        View view = this.f2276k;
        C.g gVar = this.f2271B;
        if (!z3) {
            if (this.f2287v) {
                this.f2287v = false;
                j.j jVar = this.f2288w;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2283r;
                I i2 = this.f2291z;
                if (i != 0 || (!this.f2289x && !z2)) {
                    i2.a();
                    return;
                }
                this.h.setAlpha(1.0f);
                this.h.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f2 = -this.h.getHeight();
                if (z2) {
                    this.h.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                Z a2 = S.a(this.h);
                a2.e(f2);
                View view2 = (View) a2.f369a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(gVar != null ? new X(gVar, view2) : null);
                }
                boolean z4 = jVar2.f2605e;
                ArrayList arrayList = jVar2.f2602a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2284s && view != null) {
                    Z a3 = S.a(view);
                    a3.e(f2);
                    if (!jVar2.f2605e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2268C;
                boolean z5 = jVar2.f2605e;
                if (!z5) {
                    jVar2.f2604c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2603b = 250L;
                }
                if (!z5) {
                    jVar2.d = i2;
                }
                this.f2288w = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2287v) {
            return;
        }
        this.f2287v = true;
        j.j jVar3 = this.f2288w;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.h.setVisibility(0);
        int i3 = this.f2283r;
        I i4 = this.f2270A;
        if (i3 == 0 && (this.f2289x || z2)) {
            this.h.setTranslationY(0.0f);
            float f3 = -this.h.getHeight();
            if (z2) {
                this.h.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.h.setTranslationY(f3);
            j.j jVar4 = new j.j();
            Z a4 = S.a(this.h);
            a4.e(0.0f);
            View view3 = (View) a4.f369a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(gVar != null ? new X(gVar, view3) : null);
            }
            boolean z6 = jVar4.f2605e;
            ArrayList arrayList2 = jVar4.f2602a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2284s && view != null) {
                view.setTranslationY(f3);
                Z a5 = S.a(view);
                a5.e(0.0f);
                if (!jVar4.f2605e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2269D;
            boolean z7 = jVar4.f2605e;
            if (!z7) {
                jVar4.f2604c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2603b = 250L;
            }
            if (!z7) {
                jVar4.d = i4;
            }
            this.f2288w = jVar4;
            jVar4.b();
        } else {
            this.h.setAlpha(1.0f);
            this.h.setTranslationY(0.0f);
            if (this.f2284s && view != null) {
                view.setTranslationY(0.0f);
            }
            i4.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2274g;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f360a;
            K.E.c(actionBarOverlayLayout);
        }
    }

    public K(Dialog dialog) {
        new ArrayList();
        this.f2282q = new ArrayList();
        this.f2283r = 0;
        this.f2284s = true;
        this.f2287v = true;
        this.f2291z = new I(this, 0);
        this.f2270A = new I(this, 1);
        this.f2271B = new C.g(24, this);
        d0(dialog.getWindow().getDecorView());
    }
}

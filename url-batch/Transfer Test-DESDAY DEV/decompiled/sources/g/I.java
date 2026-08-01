package g;

import K.C0001a0;
import K.T;
import K.c0;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.InterfaceC0204d;
import l.InterfaceC0219k0;
import l.c1;

/* loaded from: classes.dex */
public final class I extends T.e implements InterfaceC0204d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f2182y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f2183z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f2184a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2185b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f2186c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0219k0 f2187e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2188f;

    /* renamed from: g, reason: collision with root package name */
    public final View f2189g;
    public boolean h;
    public C0099H i;

    /* renamed from: j, reason: collision with root package name */
    public C0099H f2190j;

    /* renamed from: k, reason: collision with root package name */
    public B.j f2191k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2192l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2193m;

    /* renamed from: n, reason: collision with root package name */
    public int f2194n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2195o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2196p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2197q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2198r;

    /* renamed from: s, reason: collision with root package name */
    public j.j f2199s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2200t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2201u;

    /* renamed from: v, reason: collision with root package name */
    public final C0098G f2202v;

    /* renamed from: w, reason: collision with root package name */
    public final C0098G f2203w;

    /* renamed from: x, reason: collision with root package name */
    public final A0.h f2204x;

    public I(Activity activity, boolean z2) {
        new ArrayList();
        this.f2193m = new ArrayList();
        this.f2194n = 0;
        this.f2195o = true;
        this.f2198r = true;
        this.f2202v = new C0098G(this, 0);
        this.f2203w = new C0098G(this, 1);
        this.f2204x = new A0.h(22, this);
        View decorView = activity.getWindow().getDecorView();
        b0(decorView);
        if (z2) {
            return;
        }
        this.f2189g = decorView.findViewById(R.id.content);
    }

    public final void Z(boolean z2) {
        c0 i;
        c0 c0Var;
        if (z2) {
            if (!this.f2197q) {
                this.f2197q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2186c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                e0(false);
            }
        } else if (this.f2197q) {
            this.f2197q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2186c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            e0(false);
        }
        if (!this.d.isLaidOut()) {
            if (z2) {
                ((c1) this.f2187e).f2982a.setVisibility(4);
                this.f2188f.setVisibility(0);
                return;
            } else {
                ((c1) this.f2187e).f2982a.setVisibility(0);
                this.f2188f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            c1 c1Var = (c1) this.f2187e;
            i = T.a(c1Var.f2982a);
            i.a(RecyclerView.f1570A0);
            i.c(100L);
            i.d(new j.i(c1Var, 4));
            c0Var = this.f2188f.i(0, 200L);
        } else {
            c1 c1Var2 = (c1) this.f2187e;
            c0 a2 = T.a(c1Var2.f2982a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(c1Var2, 0));
            i = this.f2188f.i(8, 100L);
            c0Var = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f2674a;
        arrayList.add(i);
        View view = (View) i.f390a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0Var.f390a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0Var);
        jVar.b();
    }

    public final Context a0() {
        if (this.f2185b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2184a.getTheme().resolveAttribute(com.football.transfertrivia.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2185b = new ContextThemeWrapper(this.f2184a, i);
            } else {
                this.f2185b = this.f2184a;
            }
        }
        return this.f2185b;
    }

    public final void b0(View view) {
        InterfaceC0219k0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.football.transfertrivia.R.id.decor_content_parent);
        this.f2186c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.football.transfertrivia.R.id.action_bar);
        if (findViewById instanceof InterfaceC0219k0) {
            wrapper = (InterfaceC0219k0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2187e = wrapper;
        this.f2188f = (ActionBarContextView) view.findViewById(com.football.transfertrivia.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.football.transfertrivia.R.id.action_bar_container);
        this.d = actionBarContainer;
        InterfaceC0219k0 interfaceC0219k0 = this.f2187e;
        if (interfaceC0219k0 == null || this.f2188f == null || actionBarContainer == null) {
            throw new IllegalStateException(I.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((c1) interfaceC0219k0).f2982a.getContext();
        this.f2184a = context;
        if ((((c1) this.f2187e).f2983b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f2187e.getClass();
        d0(context.getResources().getBoolean(com.football.transfertrivia.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2184a.obtainStyledAttributes(null, f.a.f2137a, com.football.transfertrivia.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2186c;
            if (!actionBarOverlayLayout2.f1312g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2201u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = T.f372a;
            K.H.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c0(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        c1 c1Var = (c1) this.f2187e;
        int i2 = c1Var.f2983b;
        this.h = true;
        c1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void d0(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((c1) this.f2187e).getClass();
        } else {
            ((c1) this.f2187e).getClass();
            this.d.setTabContainer(null);
        }
        this.f2187e.getClass();
        ((c1) this.f2187e).f2982a.setCollapsible(false);
        this.f2186c.setHasNonEmbeddedTabs(false);
    }

    public final void e0(boolean z2) {
        boolean z3 = this.f2197q || !this.f2196p;
        View view = this.f2189g;
        A0.h hVar = this.f2204x;
        if (!z3) {
            if (this.f2198r) {
                this.f2198r = false;
                j.j jVar = this.f2199s;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2194n;
                C0098G c0098g = this.f2202v;
                if (i != 0 || (!this.f2200t && !z2)) {
                    c0098g.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                c0 a2 = T.a(this.d);
                a2.e(f2);
                View view2 = (View) a2.f390a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(hVar != null ? new C0001a0(hVar, view2) : null);
                }
                boolean z4 = jVar2.f2677e;
                ArrayList arrayList = jVar2.f2674a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2195o && view != null) {
                    c0 a3 = T.a(view);
                    a3.e(f2);
                    if (!jVar2.f2677e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2182y;
                boolean z5 = jVar2.f2677e;
                if (!z5) {
                    jVar2.f2676c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f2675b = 250L;
                }
                if (!z5) {
                    jVar2.d = c0098g;
                }
                this.f2199s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2198r) {
            return;
        }
        this.f2198r = true;
        j.j jVar3 = this.f2199s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.f2194n;
        C0098G c0098g2 = this.f2203w;
        if (i2 == 0 && (this.f2200t || z2)) {
            this.d.setTranslationY(RecyclerView.f1570A0);
            float f3 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.d.setTranslationY(f3);
            j.j jVar4 = new j.j();
            c0 a4 = T.a(this.d);
            a4.e(RecyclerView.f1570A0);
            View view3 = (View) a4.f390a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(hVar != null ? new C0001a0(hVar, view3) : null);
            }
            boolean z6 = jVar4.f2677e;
            ArrayList arrayList2 = jVar4.f2674a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2195o && view != null) {
                view.setTranslationY(f3);
                c0 a5 = T.a(view);
                a5.e(RecyclerView.f1570A0);
                if (!jVar4.f2677e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2183z;
            boolean z7 = jVar4.f2677e;
            if (!z7) {
                jVar4.f2676c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f2675b = 250L;
            }
            if (!z7) {
                jVar4.d = c0098g2;
            }
            this.f2199s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(RecyclerView.f1570A0);
            if (this.f2195o && view != null) {
                view.setTranslationY(RecyclerView.f1570A0);
            }
            c0098g2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2186c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = T.f372a;
            K.F.c(actionBarOverlayLayout);
        }
    }

    public I(Dialog dialog) {
        new ArrayList();
        this.f2193m = new ArrayList();
        this.f2194n = 0;
        this.f2195o = true;
        this.f2198r = true;
        this.f2202v = new C0098G(this, 0);
        this.f2203w = new C0098G(this, 1);
        this.f2204x = new A0.h(22, this);
        b0(dialog.getWindow().getDecorView());
    }
}

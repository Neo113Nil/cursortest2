package g;

import K.C0006a0;
import K.C0010c0;
import K.T;
import a1.AbstractC0067d;
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
import l.InterfaceC0245d;
import l.InterfaceC0264m0;
import l.e1;

/* loaded from: classes.dex */
public final class J extends AbstractC0067d implements InterfaceC0245d {

    /* renamed from: B, reason: collision with root package name */
    public static final AccelerateInterpolator f2605B = new AccelerateInterpolator();

    /* renamed from: C, reason: collision with root package name */
    public static final DecelerateInterpolator f2606C = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public final A1.d f2607A;
    public Context d;

    /* renamed from: e, reason: collision with root package name */
    public Context f2608e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarOverlayLayout f2609f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContainer f2610g;
    public InterfaceC0264m0 h;
    public ActionBarContextView i;

    /* renamed from: j, reason: collision with root package name */
    public final View f2611j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2612k;

    /* renamed from: l, reason: collision with root package name */
    public I f2613l;

    /* renamed from: m, reason: collision with root package name */
    public I f2614m;

    /* renamed from: n, reason: collision with root package name */
    public B.j f2615n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2616o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2617p;

    /* renamed from: q, reason: collision with root package name */
    public int f2618q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2619r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2620s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2621t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2622u;

    /* renamed from: v, reason: collision with root package name */
    public j.j f2623v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2624w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2625x;

    /* renamed from: y, reason: collision with root package name */
    public final C0120H f2626y;

    /* renamed from: z, reason: collision with root package name */
    public final C0120H f2627z;

    public J(Activity activity, boolean z2) {
        new ArrayList();
        this.f2617p = new ArrayList();
        this.f2618q = 0;
        this.f2619r = true;
        this.f2622u = true;
        this.f2626y = new C0120H(this, 0);
        this.f2627z = new C0120H(this, 1);
        this.f2607A = new A1.d(25, this);
        View decorView = activity.getWindow().getDecorView();
        y(decorView);
        if (z2) {
            return;
        }
        this.f2611j = decorView.findViewById(R.id.content);
    }

    public final void A(boolean z2) {
        if (z2) {
            this.f2610g.setTabContainer(null);
            ((e1) this.h).getClass();
        } else {
            ((e1) this.h).getClass();
            this.f2610g.setTabContainer(null);
        }
        this.h.getClass();
        ((e1) this.h).f3414a.setCollapsible(false);
        this.f2609f.setHasNonEmbeddedTabs(false);
    }

    public final void B(boolean z2) {
        boolean z3 = this.f2621t || !this.f2620s;
        View view = this.f2611j;
        A1.d dVar = this.f2607A;
        if (!z3) {
            if (this.f2622u) {
                this.f2622u = false;
                j.j jVar = this.f2623v;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f2618q;
                C0120H c0120h = this.f2626y;
                if (i != 0 || (!this.f2624w && !z2)) {
                    c0120h.a();
                    return;
                }
                this.f2610g.setAlpha(1.0f);
                this.f2610g.setTransitioning(true);
                j.j jVar2 = new j.j();
                float f2 = -this.f2610g.getHeight();
                if (z2) {
                    this.f2610g.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                C0010c0 a2 = T.a(this.f2610g);
                a2.e(f2);
                View view2 = (View) a2.f652a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(dVar != null ? new C0006a0(dVar, view2) : null);
                }
                boolean z4 = jVar2.f3108e;
                ArrayList arrayList = jVar2.f3105a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f2619r && view != null) {
                    C0010c0 a3 = T.a(view);
                    a3.e(f2);
                    if (!jVar2.f3108e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2605B;
                boolean z5 = jVar2.f3108e;
                if (!z5) {
                    jVar2.f3107c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f3106b = 250L;
                }
                if (!z5) {
                    jVar2.d = c0120h;
                }
                this.f2623v = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f2622u) {
            return;
        }
        this.f2622u = true;
        j.j jVar3 = this.f2623v;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f2610g.setVisibility(0);
        int i2 = this.f2618q;
        C0120H c0120h2 = this.f2627z;
        if (i2 == 0 && (this.f2624w || z2)) {
            this.f2610g.setTranslationY(RecyclerView.f1949A0);
            float f3 = -this.f2610g.getHeight();
            if (z2) {
                this.f2610g.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f2610g.setTranslationY(f3);
            j.j jVar4 = new j.j();
            C0010c0 a4 = T.a(this.f2610g);
            a4.e(RecyclerView.f1949A0);
            View view3 = (View) a4.f652a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(dVar != null ? new C0006a0(dVar, view3) : null);
            }
            boolean z6 = jVar4.f3108e;
            ArrayList arrayList2 = jVar4.f3105a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f2619r && view != null) {
                view.setTranslationY(f3);
                C0010c0 a5 = T.a(view);
                a5.e(RecyclerView.f1949A0);
                if (!jVar4.f3108e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2606C;
            boolean z7 = jVar4.f3108e;
            if (!z7) {
                jVar4.f3107c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f3106b = 250L;
            }
            if (!z7) {
                jVar4.d = c0120h2;
            }
            this.f2623v = jVar4;
            jVar4.b();
        } else {
            this.f2610g.setAlpha(1.0f);
            this.f2610g.setTranslationY(RecyclerView.f1949A0);
            if (this.f2619r && view != null) {
                view.setTranslationY(RecyclerView.f1949A0);
            }
            c0120h2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2609f;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = T.f633a;
            K.F.c(actionBarOverlayLayout);
        }
    }

    public final void w(boolean z2) {
        C0010c0 i;
        C0010c0 c0010c0;
        if (z2) {
            if (!this.f2621t) {
                this.f2621t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2609f;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                B(false);
            }
        } else if (this.f2621t) {
            this.f2621t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2609f;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            B(false);
        }
        if (!this.f2610g.isLaidOut()) {
            if (z2) {
                ((e1) this.h).f3414a.setVisibility(4);
                this.i.setVisibility(0);
                return;
            } else {
                ((e1) this.h).f3414a.setVisibility(0);
                this.i.setVisibility(8);
                return;
            }
        }
        if (z2) {
            e1 e1Var = (e1) this.h;
            i = T.a(e1Var.f3414a);
            i.a(RecyclerView.f1949A0);
            i.c(100L);
            i.d(new j.i(e1Var, 4));
            c0010c0 = this.i.i(0, 200L);
        } else {
            e1 e1Var2 = (e1) this.h;
            C0010c0 a2 = T.a(e1Var2.f3414a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new j.i(e1Var2, 0));
            i = this.i.i(8, 100L);
            c0010c0 = a2;
        }
        j.j jVar = new j.j();
        ArrayList arrayList = jVar.f3105a;
        arrayList.add(i);
        View view = (View) i.f652a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0010c0.f652a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0010c0);
        jVar.b();
    }

    public final Context x() {
        if (this.f2608e == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(com.luckycounter.drinkwater.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2608e = new ContextThemeWrapper(this.d, i);
            } else {
                this.f2608e = this.d;
            }
        }
        return this.f2608e;
    }

    public final void y(View view) {
        InterfaceC0264m0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.luckycounter.drinkwater.R.id.decor_content_parent);
        this.f2609f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.luckycounter.drinkwater.R.id.action_bar);
        if (findViewById instanceof InterfaceC0264m0) {
            wrapper = (InterfaceC0264m0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.h = wrapper;
        this.i = (ActionBarContextView) view.findViewById(com.luckycounter.drinkwater.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.luckycounter.drinkwater.R.id.action_bar_container);
        this.f2610g = actionBarContainer;
        InterfaceC0264m0 interfaceC0264m0 = this.h;
        if (interfaceC0264m0 == null || this.i == null || actionBarContainer == null) {
            throw new IllegalStateException(J.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((e1) interfaceC0264m0).f3414a.getContext();
        this.d = context;
        if ((((e1) this.h).f3415b & 4) != 0) {
            this.f2612k = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.h.getClass();
        A(context.getResources().getBoolean(com.luckycounter.drinkwater.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(null, f.a.f2559a, com.luckycounter.drinkwater.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2609f;
            if (!actionBarOverlayLayout2.f1701g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2625x = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2610g;
            WeakHashMap weakHashMap = T.f633a;
            K.H.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void z(boolean z2) {
        if (this.f2612k) {
            return;
        }
        int i = z2 ? 4 : 0;
        e1 e1Var = (e1) this.h;
        int i2 = e1Var.f3415b;
        this.f2612k = true;
        e1Var.a((i & 4) | (i2 & (-5)));
    }

    public J(Dialog dialog) {
        new ArrayList();
        this.f2617p = new ArrayList();
        this.f2618q = 0;
        this.f2619r = true;
        this.f2622u = true;
        this.f2626y = new C0120H(this, 0);
        this.f2627z = new C0120H(this, 1);
        this.f2607A = new A1.d(25, this);
        y(dialog.getWindow().getDecorView());
    }
}

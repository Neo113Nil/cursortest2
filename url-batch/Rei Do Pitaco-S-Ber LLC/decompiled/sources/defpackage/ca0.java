package defpackage;

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

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ca0 implements y0 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public ae e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public ba0 i;
    public ba0 j;
    public o4 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public w80 s;
    public boolean t;
    public boolean u;
    public final aa0 v;
    public final aa0 w;
    public final uv x;

    public ca0(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new aa0(this, 0);
        this.w = new aa0(this, 1);
        this.x = new uv(this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        v80 i;
        v80 v80Var;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        boolean isLaidOut = this.d.isLaidOut();
        ae aeVar = this.e;
        if (!isLaidOut) {
            if (z2) {
                ((r50) aeVar).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((r50) aeVar).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            r50 r50Var = (r50) aeVar;
            i = f80.a(r50Var.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new q50(r50Var, 4));
            v80Var = this.f.i(0, 200L);
        } else {
            r50 r50Var2 = (r50) aeVar;
            v80 a = f80.a(r50Var2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new q50(r50Var2, 0));
            i = this.f.i(8, 100L);
            v80Var = a;
        }
        w80 w80Var = new w80();
        ArrayList arrayList = w80Var.a;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) v80Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(v80Var);
        w80Var.b();
    }

    public final Context b() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.ionia.reidopitaco.libya.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public final void c(View view) {
        ae wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.ionia.reidopitaco.libya.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.ionia.reidopitaco.libya.R.id.action_bar);
        if (findViewById instanceof ae) {
            wrapper = (ae) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.ionia.reidopitaco.libya.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.ionia.reidopitaco.libya.R.id.action_bar_container);
        this.d = actionBarContainer;
        ae aeVar = this.e;
        if (aeVar == null || this.f == null || actionBarContainer == null) {
            l8.u(ca0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((r50) aeVar).a.getContext();
        this.a = context;
        if ((((r50) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        e(context.getResources().getBoolean(com.ionia.reidopitaco.libya.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, kx.a, com.ionia.reidopitaco.libya.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.l) {
                l8.u("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = f80.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        r50 r50Var = (r50) this.e;
        int i2 = r50Var.b;
        this.h = true;
        r50Var.a((i & 4) | (i2 & (-5)));
    }

    public final void e(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((r50) this.e).getClass();
        } else {
            ((r50) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((r50) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        uv uvVar = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                w80 w80Var = this.s;
                if (w80Var != null) {
                    w80Var.a();
                }
                int i = this.n;
                aa0 aa0Var = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    aa0Var.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                w80 w80Var2 = new w80();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                v80 a = f80.a(this.d);
                a.e(f);
                View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(uvVar != null ? new dg(uvVar, view2) : null);
                }
                boolean z5 = w80Var2.e;
                ArrayList arrayList = w80Var2.a;
                if (!z5) {
                    arrayList.add(a);
                }
                if (this.o && view != null) {
                    v80 a2 = f80.a(view);
                    a2.e(f);
                    if (!w80Var2.e) {
                        arrayList.add(a2);
                    }
                }
                boolean z6 = w80Var2.e;
                if (!z6) {
                    w80Var2.c = y;
                }
                if (!z6) {
                    w80Var2.b = 250L;
                }
                if (!z6) {
                    w80Var2.d = aa0Var;
                }
                this.s = w80Var2;
                w80Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        w80 w80Var3 = this.s;
        if (w80Var3 != null) {
            w80Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        aa0 aa0Var2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            w80 w80Var4 = new w80();
            v80 a3 = f80.a(this.d);
            a3.e(0.0f);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(uvVar != null ? new dg(uvVar, view3) : null);
            }
            boolean z7 = w80Var4.e;
            ArrayList arrayList2 = w80Var4.a;
            if (!z7) {
                arrayList2.add(a3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                v80 a4 = f80.a(view);
                a4.e(0.0f);
                if (!w80Var4.e) {
                    arrayList2.add(a4);
                }
            }
            boolean z8 = w80Var4.e;
            if (!z8) {
                w80Var4.c = z;
            }
            if (!z8) {
                w80Var4.b = 250L;
            }
            if (!z8) {
                w80Var4.d = aa0Var2;
            }
            this.s = w80Var4;
            w80Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            aa0Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = f80.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public ca0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new aa0(this, 0);
        this.w = new aa0(this, 1);
        this.x = new uv(this);
        c(dialog.getWindow().getDecorView());
    }
}

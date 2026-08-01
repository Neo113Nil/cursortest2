package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.ionia.reidopitaco.libya.R;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class n7 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final m7 i;
    public final SnackbarContentLayout j;
    public final h7 k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final AccessibilityManager r;
    public final k7 s = new k7(this);
    public static final qi t = y2.b;
    public static final LinearInterpolator u = y2.a;
    public static final qi v = y2.d;
    public static final int[] x = {R.attr.snackbarStyle};
    public static final String y = n7.class.getSimpleName();
    public static final Handler w = new Handler(Looper.getMainLooper(), new g7());

    public n7(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i = 0;
        this.k = new h7(this, i);
        if (view == null) {
            l8.l("Transient bottom bar must have non-null content");
            throw null;
        }
        if (snackbarContentLayout == null) {
            l8.l("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout;
        this.h = context;
        m60.l(context, m60.s, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        m7 m7Var = (m7) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = m7Var;
        m7Var.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
            float actionTextColorAlpha = m7Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout2.g.setTextColor(g8.V(g8.c0(snackbarContentLayout2.getContext(), m60.W(snackbarContentLayout2, R.attr.colorSurface)), snackbarContentLayout2.g.getCurrentTextColor(), actionTextColorAlpha));
            }
            snackbarContentLayout2.setMaxInlineActionWidth(m7Var.getMaxInlineActionWidth());
        }
        m7Var.addView(view);
        m7Var.setAccessibilityLiveRegion(1);
        m7Var.setImportantForAccessibility(1);
        m7Var.setFitsSystemWindows(true);
        i7 i7Var = new i7(this);
        WeakHashMap weakHashMap = f80.a;
        x70.c(m7Var, i7Var);
        f80.m(m7Var, new j7(i, this));
        this.r = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = m60.T(context, R.attr.motionDurationLong2, 250);
        this.a = m60.T(context, R.attr.motionDurationLong2, 150);
        this.b = m60.T(context, R.attr.motionDurationMedium1, 75);
        this.d = m60.U(context, R.attr.motionEasingEmphasizedInterpolator, u);
        this.f = m60.U(context, R.attr.motionEasingEmphasizedInterpolator, v);
        this.e = m60.U(context, R.attr.motionEasingEmphasizedInterpolator, t);
    }

    public final void a(int i) {
        oe o = oe.o();
        k7 k7Var = this.s;
        synchronized (o.f) {
            try {
                if (o.q(k7Var)) {
                    o.e((i20) o.h, i);
                } else {
                    i20 i20Var = (i20) o.i;
                    if (i20Var != null && i20Var.a.get() == k7Var) {
                        o.e((i20) o.i, i);
                    }
                }
            } finally {
            }
        }
    }

    public final void b() {
        oe o = oe.o();
        k7 k7Var = this.s;
        synchronized (o.f) {
            try {
                if (o.q(k7Var)) {
                    o.h = null;
                    if (((i20) o.i) != null) {
                        o.A();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void c() {
        oe o = oe.o();
        k7 k7Var = this.s;
        synchronized (o.f) {
            try {
                if (o.q(k7Var)) {
                    o.z((i20) o.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.r;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        m7 m7Var = this.i;
        if (z) {
            m7Var.post(new h7(this, 2));
            return;
        }
        if (m7Var.getParent() != null) {
            m7Var.setVisibility(0);
        }
        c();
    }

    public final void e() {
        m7 m7Var = this.i;
        ViewGroup.LayoutParams layoutParams = m7Var.getLayoutParams();
        boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = y;
        if (!z) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (m7Var.o == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (m7Var.getParent() == null) {
            return;
        }
        int i = this.l;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = m7Var.o;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.m;
        int i4 = rect.right + this.n;
        int i5 = rect.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            m7Var.requestLayout();
        }
        if ((z2 || this.p != this.o) && Build.VERSION.SDK_INT >= 29 && this.o > 0) {
            ViewGroup.LayoutParams layoutParams2 = m7Var.getLayoutParams();
            if ((layoutParams2 instanceof kd) && (((kd) layoutParams2).a instanceof SwipeDismissBehavior)) {
                h7 h7Var = this.k;
                m7Var.removeCallbacks(h7Var);
                m7Var.post(h7Var);
            }
        }
    }
}

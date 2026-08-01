package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ionia.reidopitaco.libya.R;
import defpackage.f9;
import defpackage.hd;
import defpackage.kd;
import defpackage.l8;
import defpackage.m60;
import defpackage.qm;
import defpackage.rm;
import defpackage.sm;
import defpackage.y2;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends hd {
    public m60 a;
    public AccessibilityManager b;
    public qm c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;
    public int l = 0;
    public int m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // defpackage.hd
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            qm qmVar = new qm(this, view, 1);
            this.c = qmVar;
            accessibilityManager.addTouchExplorationStateChangeListener(qmVar);
            view.addOnAttachStateChangeListener(new f9(4, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((kd) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.A(view, marginLayoutParams);
        this.e = m60.T(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = m60.T(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = m60.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, y2.d);
        this.h = m60.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, y2.c);
        return false;
    }

    @Override // defpackage.hd
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            t(view, 1);
            this.k = this.a.D(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new rm(this, view, 1));
        }
    }

    @Override // defpackage.hd
    public final boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public final void r(int i) {
        m60 m60Var = this.a;
        if (m60Var == null || m60Var.C() != i) {
            if (i == 0) {
                this.a = new sm(2);
                return;
            }
            if (i == 1) {
                this.a = new sm(0);
            } else if (i == 2) {
                this.a = new sm(1);
            } else {
                l8.d(i, ". Must be 0, 1 or 2.", "Invalid view edge position value: ");
            }
        }
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        t(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.a.getClass();
        this.k = this.a.D(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new rm(this, view, 1));
    }

    public final void t(View view, int i) {
        this.j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            l8.c();
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}

package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ionia.reidopitaco.libya.R;
import defpackage.f9;
import defpackage.hd;
import defpackage.l8;
import defpackage.m60;
import defpackage.qm;
import defpackage.rm;
import defpackage.y2;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends hd {
    public int b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;
    public AccessibilityManager g;
    public qm h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet a = new LinkedHashSet();
    public int f = 0;
    public final boolean i = true;
    public int j = 2;
    public int l = 0;
    public int m = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.hd
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.b = m60.T(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = m60.T(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = m60.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, y2.d);
        this.e = m60.U(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, y2.c);
        if (this.g == null) {
            this.g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null && this.h == null) {
            qm qmVar = new qm(this, view, 0);
            this.h = qmVar;
            accessibilityManager.addTouchExplorationStateChangeListener(qmVar);
            view.addOnAttachStateChangeListener(new f9(3, this));
        }
        return false;
    }

    @Override // defpackage.hd
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                r(view);
            }
        } else {
            if (this.j == 1) {
                return;
            }
            if (this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            s(view, 1);
            this.k = view.animate().translationY(this.f).setInterpolator(this.e).setDuration(this.c).setListener(new rm(this, view, 0));
        }
    }

    @Override // defpackage.hd
    public boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public final void r(View view) {
        if (this.j == 2) {
            return;
        }
        s(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.k = view.animate().translationY(0.0f).setInterpolator(this.d).setDuration(this.b).setListener(new rm(this, view, 0));
    }

    public final void s(View view, int i) {
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
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            l8.c();
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}

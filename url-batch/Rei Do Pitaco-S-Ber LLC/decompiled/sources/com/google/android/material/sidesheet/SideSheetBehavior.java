package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.ionia.reidopitaco.libya.R;
import defpackage.bp;
import defpackage.d0;
import defpackage.d20;
import defpackage.d8;
import defpackage.f8;
import defpackage.f80;
import defpackage.g;
import defpackage.g8;
import defpackage.h80;
import defpackage.hd;
import defpackage.jx;
import defpackage.kd;
import defpackage.l8;
import defpackage.ls;
import defpackage.m60;
import defpackage.n10;
import defpackage.n20;
import defpackage.o10;
import defpackage.oo;
import defpackage.t0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends hd {
    public g8 a;
    public final ls b;
    public final ColorStateList c;
    public final o10 d;
    public final f8 e;
    public final float f;
    public final boolean g;
    public int h;
    public h80 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final d8 v;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new f8(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new d8(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.G);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = oo.o(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = o10.g(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o10 o10Var = this.d;
        if (o10Var != null) {
            ls lsVar = new ls(o10Var);
            this.b = lsVar;
            lsVar.n(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.hd
    public final void c(kd kdVar) {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.hd
    public final void e() {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.hd
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        h80 h80Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && f80.e(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (h80Var = this.i) == null || !h80Var.o(motionEvent)) ? false : true;
    }

    @Override // defpackage.hd
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int G;
        int i2;
        View findViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        ls lsVar = this.b;
        int i4 = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            m60.T(context, R.attr.motionDurationMedium2, 300);
            m60.T(context, R.attr.motionDurationShort3, 150);
            m60.T(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (lsVar != null) {
                view.setBackground(lsVar);
                float f = this.f;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                lsVar.q(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = f80.a;
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (f80.e(view) == null) {
                f80.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((kd) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        g8 g8Var = this.a;
        if (g8Var == null || g8Var.L() != i6) {
            kd kdVar = null;
            o10 o10Var = this.d;
            if (i6 == 0) {
                this.a = new bp(this, i3);
                if (o10Var != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof kd)) {
                        kdVar = (kd) view3.getLayoutParams();
                    }
                    if (kdVar == null || ((ViewGroup.MarginLayoutParams) kdVar).rightMargin <= 0) {
                        n10 k = o10Var.k();
                        k.f = new g(0.0f);
                        k.g = new g(0.0f);
                        o10 a = k.a();
                        if (lsVar != null) {
                            lsVar.setShapeAppearanceModel(a);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    l8.d(i6, ". Must be 0 or 1.", "Invalid sheet edge position value: ");
                    return false;
                }
                this.a = new bp(this, i4);
                if (o10Var != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof kd)) {
                        kdVar = (kd) view2.getLayoutParams();
                    }
                    if (kdVar == null || ((ViewGroup.MarginLayoutParams) kdVar).leftMargin <= 0) {
                        n10 k2 = o10Var.k();
                        k2.e = new g(0.0f);
                        k2.h = new g(0.0f);
                        o10 a2 = k2.a();
                        if (lsVar != null) {
                            lsVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new h80(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int G2 = this.a.G(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.K(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.h(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            G = G2 - this.a.G(view);
        } else if (i7 == 3) {
            G = 0;
        } else {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            G = this.a.D();
        }
        WeakHashMap weakHashMap2 = f80.a;
        view.offsetLeftAndRight(G);
        if (this.q == null && (i2 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(findViewById);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                l8.c();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.hd
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.hd
    public final void m(View view, Parcelable parcelable) {
        int i = ((d20) parcelable).h;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.hd
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d20(this);
    }

    @Override // defpackage.hd
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float abs = Math.abs(this.t - motionEvent.getX());
            h80 h80Var = this.i;
            if (abs > h80Var.b) {
                h80Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        if (!it.hasNext()) {
            u();
        } else {
            it.next().getClass();
            l8.c();
        }
    }

    public final boolean s() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i, boolean z) {
        int B;
        if (i == 3) {
            B = this.a.B();
        } else {
            if (i != 5) {
                l8.l(n20.e("Invalid state to get outer edge offset: ", i));
                return;
            }
            B = this.a.D();
        }
        h80 h80Var = this.i;
        if (h80Var != null) {
            if (!z) {
                int top = view.getTop();
                h80Var.r = view;
                h80Var.c = -1;
                boolean h = h80Var.h(B, top, 0, 0);
                if (!h && h80Var.a == 0 && h80Var.r != null) {
                    h80Var.r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        f80.j(view, 262144);
        f80.h(view, 0);
        f80.j(view, 1048576);
        f80.h(view, 0);
        final int i = 5;
        if (this.h != 5) {
            f80.k(view, d0.i, new t0() { // from class: c20
                @Override // defpackage.t0
                public final boolean a(View view2) {
                    int i2 = i;
                    if (i2 != 1) {
                        int i3 = 2;
                        if (i2 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.p;
                            if (weakReference2 == null || weakReference2.get() == null) {
                                sideSheetBehavior.r(i2);
                                return true;
                            }
                            View view3 = (View) sideSheetBehavior.p.get();
                            lr lrVar = new lr(i2, i3, sideSheetBehavior);
                            ViewParent parent = view3.getParent();
                            if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                view3.post(lrVar);
                                return true;
                            }
                            lrVar.run();
                            return true;
                        }
                    }
                    StringBuilder sb = new StringBuilder("STATE_");
                    sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
                    sb.append(" should not be set externally.");
                    throw new IllegalArgumentException(sb.toString());
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            f80.k(view, d0.h, new t0() { // from class: c20
                @Override // defpackage.t0
                public final boolean a(View view2) {
                    int i22 = i2;
                    if (i22 != 1) {
                        int i3 = 2;
                        if (i22 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.p;
                            if (weakReference2 == null || weakReference2.get() == null) {
                                sideSheetBehavior.r(i22);
                                return true;
                            }
                            View view3 = (View) sideSheetBehavior.p.get();
                            lr lrVar = new lr(i22, i3, sideSheetBehavior);
                            ViewParent parent = view3.getParent();
                            if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                view3.post(lrVar);
                                return true;
                            }
                            lrVar.run();
                            return true;
                        }
                    }
                    StringBuilder sb = new StringBuilder("STATE_");
                    sb.append(i22 == 1 ? "DRAGGING" : "SETTLING");
                    sb.append(" should not be set externally.");
                    throw new IllegalArgumentException(sb.toString());
                }
            });
        }
    }

    public SideSheetBehavior() {
        this.e = new f8(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new d8(this, 1);
    }
}

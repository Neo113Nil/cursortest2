package com.google.android.material.sidesheet;

import B.p;
import J0.g;
import J0.j;
import J0.k;
import K.G;
import K.S;
import K0.c;
import K0.d;
import K0.e;
import L.s;
import M.a;
import X.V;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.AbstractC0279a;
import q1.l;
import x.AbstractC0333a;
import x.C0336d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0333a {

    /* renamed from: a, reason: collision with root package name */
    public l f1743a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1744b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1745c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1746e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1747f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1748g;
    public int h;
    public S.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1749j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1750k;

    /* renamed from: l, reason: collision with root package name */
    public int f1751l;

    /* renamed from: m, reason: collision with root package name */
    public int f1752m;

    /* renamed from: n, reason: collision with root package name */
    public int f1753n;

    /* renamed from: o, reason: collision with root package name */
    public int f1754o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1755p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1756q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1757r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1758s;

    /* renamed from: t, reason: collision with root package name */
    public int f1759t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1760u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1761v;

    public SideSheetBehavior() {
        this.f1746e = new e(this);
        this.f1748g = true;
        this.h = 5;
        this.f1750k = 0.1f;
        this.f1757r = -1;
        this.f1760u = new LinkedHashSet();
        this.f1761v = new c(this, 0);
    }

    @Override // x.AbstractC0333a
    public final void c(C0336d c0336d) {
        this.f1755p = null;
        this.i = null;
    }

    @Override // x.AbstractC0333a
    public final void e() {
        this.f1755p = null;
        this.i = null;
    }

    @Override // x.AbstractC0333a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        S.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && S.d(view) == null) || !this.f1748g) {
            this.f1749j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1758s) != null) {
            velocityTracker.recycle();
            this.f1758s = null;
        }
        if (this.f1758s == null) {
            this.f1758s = VelocityTracker.obtain();
        }
        this.f1758s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1759t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1749j) {
            this.f1749j = false;
            return false;
        }
        return (this.f1749j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // x.AbstractC0333a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f1744b;
        WeakHashMap weakHashMap = S.f360a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1755p == null) {
            this.f1755p = new WeakReference(view);
            Context context = view.getContext();
            l.n0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.m0(context, R.attr.motionDurationMedium2, 300);
            l.m0(context, R.attr.motionDurationShort3, 150);
            l.m0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1747f;
                if (f2 == -1.0f) {
                    f2 = G.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1745c;
                if (colorStateList != null) {
                    G.q(view, colorStateList);
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
            if (S.d(view) == null) {
                S.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((C0336d) view.getLayoutParams()).f4102c, i) == 3 ? 1 : 0;
        l lVar = this.f1743a;
        if (lVar == null || lVar.O() != i6) {
            k kVar = this.d;
            C0336d c0336d = null;
            if (i6 == 0) {
                this.f1743a = new K0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f1755p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0336d)) {
                        c0336d = (C0336d) view3.getLayoutParams();
                    }
                    if (c0336d == null || ((ViewGroup.MarginLayoutParams) c0336d).rightMargin <= 0) {
                        j e2 = kVar.e();
                        e2.f304f = new J0.a(0.0f);
                        e2.f305g = new J0.a(0.0f);
                        k a2 = e2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f1743a = new K0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f1755p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0336d)) {
                        c0336d = (C0336d) view2.getLayoutParams();
                    }
                    if (c0336d == null || ((ViewGroup.MarginLayoutParams) c0336d).leftMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f303e = new J0.a(0.0f);
                        e3.h = new J0.a(0.0f);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new S.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1761v);
        }
        int L2 = this.f1743a.L(view);
        coordinatorLayout.q(view, i);
        this.f1752m = coordinatorLayout.getWidth();
        this.f1753n = this.f1743a.M(coordinatorLayout);
        this.f1751l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1754o = marginLayoutParams != null ? this.f1743a.j(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = L2 - this.f1743a.L(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f1743a.F();
        }
        view.offsetLeftAndRight(i3);
        if (this.f1756q == null && (i2 = this.f1757r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1756q = new WeakReference(findViewById);
        }
        Iterator it = this.f1760u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // x.AbstractC0333a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0333a
    public final void m(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f463c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // x.AbstractC0333a
    public final Parcelable n(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0333a
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
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1758s) != null) {
            velocityTracker.recycle();
            this.f1758s = null;
        }
        if (this.f1758s == null) {
            this.f1758s = VelocityTracker.obtain();
        }
        this.f1758s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1749j && s()) {
            float abs = Math.abs(this.f1759t - motionEvent.getX());
            S.e eVar = this.i;
            if (abs > eVar.f692b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1749j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f1755p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1760u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f1748g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f1746e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i, boolean z2) {
        int E2;
        if (i == 3) {
            E2 = this.f1743a.E();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(V.d("Invalid state to get outer edge offset: ", i));
            }
            E2 = this.f1743a.F();
        }
        S.e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f705r = view;
                eVar.f693c = -1;
                boolean h = eVar.h(E2, top, 0, 0);
                if (!h && eVar.f691a == 0 && eVar.f705r != null) {
                    eVar.f705r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1755p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.i(view, 262144);
        S.g(view, 0);
        S.i(view, 1048576);
        S.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            S.j(view, L.e.f475j, new s() { // from class: K0.b
                @Override // L.s
                public final boolean b(View view2) {
                    int i2 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i3 = i;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f1755p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1755p.get();
                        p pVar = new p(sideSheetBehavior, i3, i2);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = S.f360a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(pVar);
                            }
                        }
                        pVar.run();
                    }
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            S.j(view, L.e.h, new s() { // from class: K0.b
                @Override // L.s
                public final boolean b(View view2) {
                    int i22 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f1755p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1755p.get();
                        p pVar = new p(sideSheetBehavior, i3, i22);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = S.f360a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(pVar);
                            }
                        }
                        pVar.run();
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f1746e = new e(this);
        this.f1748g = true;
        this.h = 5;
        this.f1750k = 0.1f;
        this.f1757r = -1;
        this.f1760u = new LinkedHashSet();
        this.f1761v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0279a.f3398w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1745c = q1.d.r(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1757r = resourceId;
            WeakReference weakReference = this.f1756q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1756q = null;
            WeakReference weakReference2 = this.f1755p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = S.f360a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1744b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1745c;
            if (colorStateList != null) {
                this.f1744b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1744b.setTint(typedValue.data);
            }
        }
        this.f1747f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1748g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

package com.google.android.material.sidesheet;

import B.p;
import E1.AbstractC0001b;
import F1.l;
import K.H;
import K.T;
import L.s;
import M.a;
import M0.g;
import M0.j;
import M0.k;
import N0.c;
import N0.e;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.luckycounter.drinkwater.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import s0.AbstractC0363a;
import x.AbstractC0379a;
import x.d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0379a {

    /* renamed from: a, reason: collision with root package name */
    public l f2335a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2336b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f2337c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2338e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2339f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2340g;
    public int h;
    public T.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2341j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2342k;

    /* renamed from: l, reason: collision with root package name */
    public int f2343l;

    /* renamed from: m, reason: collision with root package name */
    public int f2344m;

    /* renamed from: n, reason: collision with root package name */
    public int f2345n;

    /* renamed from: o, reason: collision with root package name */
    public int f2346o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f2347p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f2348q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2349r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f2350s;

    /* renamed from: t, reason: collision with root package name */
    public int f2351t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f2352u;

    /* renamed from: v, reason: collision with root package name */
    public final c f2353v;

    public SideSheetBehavior() {
        this.f2338e = new e(this);
        this.f2340g = true;
        this.h = 5;
        this.f2342k = 0.1f;
        this.f2349r = -1;
        this.f2352u = new LinkedHashSet();
        this.f2353v = new c(this, 0);
    }

    @Override // x.AbstractC0379a
    public final void c(d dVar) {
        this.f2347p = null;
        this.i = null;
    }

    @Override // x.AbstractC0379a
    public final void e() {
        this.f2347p = null;
        this.i = null;
    }

    @Override // x.AbstractC0379a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        T.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && T.d(view) == null) || !this.f2340g) {
            this.f2341j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2350s) != null) {
            velocityTracker.recycle();
            this.f2350s = null;
        }
        if (this.f2350s == null) {
            this.f2350s = VelocityTracker.obtain();
        }
        this.f2350s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2351t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2341j) {
            this.f2341j = false;
            return false;
        }
        return (this.f2341j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // x.AbstractC0379a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f2336b;
        WeakHashMap weakHashMap = T.f633a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2347p == null) {
            this.f2347p = new WeakReference(view);
            Context context = view.getContext();
            F1.d.e0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(RecyclerView.f1949A0, RecyclerView.f1949A0, RecyclerView.f1949A0, 1.0f));
            F1.d.d0(context, R.attr.motionDurationMedium2, 300);
            F1.d.d0(context, R.attr.motionDurationShort3, 150);
            F1.d.d0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f2339f;
                if (f2 == -1.0f) {
                    f2 = H.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f2337c;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
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
            if (T.d(view) == null) {
                T.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((d) view.getLayoutParams()).f4449c, i) == 3 ? 1 : 0;
        l lVar = this.f2335a;
        if (lVar == null || lVar.J() != i6) {
            k kVar = this.d;
            d dVar = null;
            if (i6 == 0) {
                this.f2335a = new N0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f2347p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof d)) {
                        dVar = (d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        j e2 = kVar.e();
                        e2.f852f = new M0.a(RecyclerView.f1949A0);
                        e2.f853g = new M0.a(RecyclerView.f1949A0);
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
                this.f2335a = new N0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f2347p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof d)) {
                        dVar = (d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f851e = new M0.a(RecyclerView.f1949A0);
                        e3.h = new M0.a(RecyclerView.f1949A0);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new T.e(coordinatorLayout.getContext(), coordinatorLayout, this.f2353v);
        }
        int H2 = this.f2335a.H(view);
        coordinatorLayout.q(view, i);
        this.f2344m = coordinatorLayout.getWidth();
        this.f2345n = this.f2335a.I(coordinatorLayout);
        this.f2343l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2346o = marginLayoutParams != null ? this.f2335a.e(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = H2 - this.f2335a.H(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f2335a.E();
        }
        view.offsetLeftAndRight(i3);
        if (this.f2348q == null && (i2 = this.f2349r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f2348q = new WeakReference(findViewById);
        }
        Iterator it = this.f2352u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // x.AbstractC0379a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0379a
    public final void m(View view, Parcelable parcelable) {
        int i = ((N0.d) parcelable).f902c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // x.AbstractC0379a
    public final Parcelable n(View view) {
        return new N0.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0379a
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
        if (actionMasked == 0 && (velocityTracker = this.f2350s) != null) {
            velocityTracker.recycle();
            this.f2350s = null;
        }
        if (this.f2350s == null) {
            this.f2350s = VelocityTracker.obtain();
        }
        this.f2350s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f2341j && s()) {
            float abs = Math.abs(this.f2351t - motionEvent.getX());
            T.e eVar = this.i;
            if (abs > eVar.f1118b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2341j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f2347p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f2352u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f2340g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f2338e.a(r4);
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
        int D2;
        if (i == 3) {
            D2 = this.f2335a.D();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC0001b.f("Invalid state to get outer edge offset: ", i));
            }
            D2 = this.f2335a.E();
        }
        T.e eVar = this.i;
        if (eVar != null) {
            if (!z2) {
                int top = view.getTop();
                eVar.f1131r = view;
                eVar.f1119c = -1;
                boolean h = eVar.h(D2, top, 0, 0);
                if (!h && eVar.f1117a == 0 && eVar.f1131r != null) {
                    eVar.f1131r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f2347p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            T.j(view, L.e.f789j, new s() { // from class: N0.b
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
                    WeakReference weakReference2 = sideSheetBehavior.f2347p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2347p.get();
                        p pVar = new p(sideSheetBehavior, i3, i2);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f633a;
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
            T.j(view, L.e.h, new s() { // from class: N0.b
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
                    WeakReference weakReference2 = sideSheetBehavior.f2347p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2347p.get();
                        p pVar = new p(sideSheetBehavior, i3, i22);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f633a;
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
        this.f2338e = new e(this);
        this.f2340g = true;
        this.h = 5;
        this.f2342k = 0.1f;
        this.f2349r = -1;
        this.f2352u = new LinkedHashSet();
        this.f2353v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0363a.f4113w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2337c = l.z(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2349r = resourceId;
            WeakReference weakReference = this.f2348q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2348q = null;
            WeakReference weakReference2 = this.f2347p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = T.f633a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2336b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2337c;
            if (colorStateList != null) {
                this.f2336b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2336b.setTint(typedValue.data);
            }
        }
        this.f2339f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2340g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

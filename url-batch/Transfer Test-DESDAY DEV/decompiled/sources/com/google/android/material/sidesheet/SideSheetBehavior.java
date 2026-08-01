package com.google.android.material.sidesheet;

import A.c;
import B.p;
import K.H;
import K.T;
import L.t;
import M.a;
import O0.g;
import O0.j;
import O0.k;
import P0.e;
import T.f;
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
import com.football.transfertrivia.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u0.AbstractC0338a;
import x.AbstractC0346a;
import x.d;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0346a {

    /* renamed from: a, reason: collision with root package name */
    public c f1968a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1969b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f1970c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1971e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1972f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1973g;
    public int h;
    public f i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1974j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1975k;

    /* renamed from: l, reason: collision with root package name */
    public int f1976l;

    /* renamed from: m, reason: collision with root package name */
    public int f1977m;

    /* renamed from: n, reason: collision with root package name */
    public int f1978n;

    /* renamed from: o, reason: collision with root package name */
    public int f1979o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1980p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1981q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1982r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1983s;

    /* renamed from: t, reason: collision with root package name */
    public int f1984t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1985u;

    /* renamed from: v, reason: collision with root package name */
    public final P0.c f1986v;

    public SideSheetBehavior() {
        this.f1971e = new e(this);
        this.f1973g = true;
        this.h = 5;
        this.f1975k = 0.1f;
        this.f1982r = -1;
        this.f1985u = new LinkedHashSet();
        this.f1986v = new P0.c(this, 0);
    }

    @Override // x.AbstractC0346a
    public final void c(d dVar) {
        this.f1980p = null;
        this.i = null;
    }

    @Override // x.AbstractC0346a
    public final void e() {
        this.f1980p = null;
        this.i = null;
    }

    @Override // x.AbstractC0346a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        f fVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && T.d(view) == null) || !this.f1973g) {
            this.f1974j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f1983s) != null) {
            velocityTracker.recycle();
            this.f1983s = null;
        }
        if (this.f1983s == null) {
            this.f1983s = VelocityTracker.obtain();
        }
        this.f1983s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f1984t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f1974j) {
            this.f1974j = false;
            return false;
        }
        return (this.f1974j || (fVar = this.i) == null || !fVar.p(motionEvent)) ? false : true;
    }

    @Override // x.AbstractC0346a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f1969b;
        WeakHashMap weakHashMap = T.f372a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1980p == null) {
            this.f1980p = new WeakReference(view);
            Context context = view.getContext();
            c.q0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(RecyclerView.f1570A0, RecyclerView.f1570A0, RecyclerView.f1570A0, 1.0f));
            c.p0(context, R.attr.motionDurationMedium2, 300);
            c.p0(context, R.attr.motionDurationShort3, 150);
            c.p0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1972f;
                if (f2 == -1.0f) {
                    f2 = H.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1970c;
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
        int i6 = Gravity.getAbsoluteGravity(((d) view.getLayoutParams()).f4052c, i) == 3 ? 1 : 0;
        c cVar = this.f1968a;
        if (cVar == null || cVar.S() != i6) {
            k kVar = this.d;
            d dVar = null;
            if (i6 == 0) {
                this.f1968a = new P0.a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f1980p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof d)) {
                        dVar = (d) view3.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).rightMargin <= 0) {
                        j e2 = kVar.e();
                        e2.f556f = new O0.a(RecyclerView.f1570A0);
                        e2.f557g = new O0.a(RecyclerView.f1570A0);
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
                this.f1968a = new P0.a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f1980p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof d)) {
                        dVar = (d) view2.getLayoutParams();
                    }
                    if (dVar == null || ((ViewGroup.MarginLayoutParams) dVar).leftMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f555e = new O0.a(RecyclerView.f1570A0);
                        e3.h = new O0.a(RecyclerView.f1570A0);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f1986v);
        }
        int Q2 = this.f1968a.Q(view);
        coordinatorLayout.q(view, i);
        this.f1977m = coordinatorLayout.getWidth();
        this.f1978n = this.f1968a.R(coordinatorLayout);
        this.f1976l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f1979o = marginLayoutParams != null ? this.f1968a.g(marginLayoutParams) : 0;
        int i7 = this.h;
        if (i7 == 1 || i7 == 2) {
            i3 = Q2 - this.f1968a.Q(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.f1968a.M();
        }
        view.offsetLeftAndRight(i3);
        if (this.f1981q == null && (i2 = this.f1982r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f1981q = new WeakReference(findViewById);
        }
        Iterator it = this.f1985u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // x.AbstractC0346a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0346a
    public final void m(View view, Parcelable parcelable) {
        int i = ((P0.d) parcelable).f608c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // x.AbstractC0346a
    public final Parcelable n(View view) {
        return new P0.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0346a
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
        if (actionMasked == 0 && (velocityTracker = this.f1983s) != null) {
            velocityTracker.recycle();
            this.f1983s = null;
        }
        if (this.f1983s == null) {
            this.f1983s = VelocityTracker.obtain();
        }
        this.f1983s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f1974j && s()) {
            float abs = Math.abs(this.f1984t - motionEvent.getX());
            f fVar = this.i;
            if (abs > fVar.f788b) {
                fVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1974j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.f1980p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f1985u.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u();
    }

    public final boolean s() {
        return this.i != null && (this.f1973g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r(2);
        r2.f1971e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i, boolean z2) {
        int L2;
        if (i == 3) {
            L2 = this.f1968a.L();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
            }
            L2 = this.f1968a.M();
        }
        f fVar = this.i;
        if (fVar != null) {
            if (!z2) {
                int top = view.getTop();
                fVar.f801r = view;
                fVar.f789c = -1;
                boolean h = fVar.h(L2, top, 0, 0);
                if (!h && fVar.f787a == 0 && fVar.f801r != null) {
                    fVar.f801r = null;
                }
            }
        }
        r(i);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f1980p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            T.j(view, L.f.f476j, new t() { // from class: P0.b
                @Override // L.t
                public final boolean a(View view2) {
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
                    WeakReference weakReference2 = sideSheetBehavior.f1980p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1980p.get();
                        p pVar = new p(sideSheetBehavior, i3, i2);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f372a;
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
            T.j(view, L.f.h, new t() { // from class: P0.b
                @Override // L.t
                public final boolean a(View view2) {
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
                    WeakReference weakReference2 = sideSheetBehavior.f1980p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f1980p.get();
                        p pVar = new p(sideSheetBehavior, i3, i22);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f372a;
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
        this.f1971e = new e(this);
        this.f1973g = true;
        this.h = 5;
        this.f1975k = 0.1f;
        this.f1982r = -1;
        this.f1985u = new LinkedHashSet();
        this.f1986v = new P0.c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0338a.f3803w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1970c = c.G(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f1982r = resourceId;
            WeakReference weakReference = this.f1981q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1981q = null;
            WeakReference weakReference2 = this.f1980p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = T.f372a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f1969b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1970c;
            if (colorStateList != null) {
                this.f1969b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1969b.setTint(typedValue.data);
            }
        }
        this.f1972f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1973g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

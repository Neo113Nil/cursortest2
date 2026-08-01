package com.google.android.material.bottomsheet;

import B.j;
import B1.p;
import E1.AbstractC0001b;
import F1.l;
import G0.q;
import I.h;
import K.C0005a;
import K.C0007b;
import K.C0011d;
import K.F;
import K.H;
import K.T;
import K.h0;
import K.i0;
import K.j0;
import M.a;
import M0.f;
import M0.g;
import M0.k;
import N0.c;
import N0.e;
import P0.A;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.U;
import s0.AbstractC0363a;
import x.AbstractC0379a;
import x.d;
import x0.C0380a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0379a {

    /* renamed from: A, reason: collision with root package name */
    public final e f2143A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f2144B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2145C;

    /* renamed from: D, reason: collision with root package name */
    public int f2146D;

    /* renamed from: E, reason: collision with root package name */
    public int f2147E;
    public final float F;

    /* renamed from: G, reason: collision with root package name */
    public int f2148G;

    /* renamed from: H, reason: collision with root package name */
    public final float f2149H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2150I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2151J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f2152K;

    /* renamed from: L, reason: collision with root package name */
    public int f2153L;

    /* renamed from: M, reason: collision with root package name */
    public T.e f2154M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2155N;

    /* renamed from: O, reason: collision with root package name */
    public int f2156O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2157P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f2158Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2159R;

    /* renamed from: S, reason: collision with root package name */
    public int f2160S;

    /* renamed from: T, reason: collision with root package name */
    public int f2161T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f2162U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f2163V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f2164W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f2165X;

    /* renamed from: Y, reason: collision with root package name */
    public int f2166Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2167Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f2168a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2169a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2170b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f2171b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f2172c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f2173c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f2174d0;

    /* renamed from: e, reason: collision with root package name */
    public int f2175e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2176f;

    /* renamed from: g, reason: collision with root package name */
    public int f2177g;
    public final int h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f2178j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2179k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2180l;

    /* renamed from: m, reason: collision with root package name */
    public int f2181m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2182n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2183o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2184p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2185q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2186r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2187s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2188t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2189u;

    /* renamed from: v, reason: collision with root package name */
    public int f2190v;

    /* renamed from: w, reason: collision with root package name */
    public int f2191w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2192x;

    /* renamed from: y, reason: collision with root package name */
    public final k f2193y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2194z;

    public BottomSheetBehavior() {
        this.f2168a = 0;
        this.f2170b = true;
        this.f2179k = -1;
        this.f2180l = -1;
        this.f2143A = new e(this);
        this.F = 0.5f;
        this.f2149H = -1.0f;
        this.f2152K = true;
        this.f2153L = 4;
        this.f2158Q = 0.1f;
        this.f2164W = new ArrayList();
        this.f2167Z = -1;
        this.f2173c0 = new SparseIntArray();
        this.f2174d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = T.f633a;
        if (H.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View v2 = v(viewGroup.getChildAt(i));
                if (v2 != null) {
                    return v2;
                }
            }
        }
        return null;
    }

    public static int w(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.f2176f) {
                return;
            } else {
                this.f2176f = true;
            }
        } else {
            if (!this.f2176f && this.f2175e == i) {
                return;
            }
            this.f2176f = false;
            this.f2175e = Math.max(0, i);
        }
        I();
    }

    public final void B(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f2150I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f2170b && y(i) <= this.f2146D) ? 3 : i;
        WeakReference weakReference = this.f2162U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f2162U.get();
        U u2 = new U(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = T.f633a;
            if (view.isAttachedToWindow()) {
                view.post(u2);
                return;
            }
        }
        u2.run();
    }

    public final void C(int i) {
        if (this.f2153L == i) {
            return;
        }
        this.f2153L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f2150I;
        }
        WeakReference weakReference = this.f2162U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f2164W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f2151J) {
            return true;
        }
        if (view.getTop() < this.f2148G) {
            return false;
        }
        return Math.abs(((f2 * this.f2158Q) + ((float) view.getTop())) - ((float) this.f2148G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.f2143A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z2) {
        int y2 = y(i);
        T.e eVar = this.f2154M;
        if (eVar != null) {
            if (!z2) {
                int left = view.getLeft();
                eVar.f1131r = view;
                eVar.f1119c = -1;
                boolean h = eVar.h(left, y2, 0, 0);
                if (!h && eVar.f1117a == 0 && eVar.f1131r != null) {
                    eVar.f1131r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f2162U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 524288);
        T.g(view, 0);
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        SparseIntArray sparseIntArray = this.f2173c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            T.i(view, i2);
            T.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2170b && this.f2153L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            p pVar = new p(this, 6);
            ArrayList e2 = T.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e2.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = T.d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < e2.size(); i7++) {
                            z2 &= ((L.e) e2.get(i7)).a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((L.e) e2.get(i3)).f792a).getLabel())) {
                        i = ((L.e) e2.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                L.e eVar = new L.e(null, i, string, pVar, null);
                View.AccessibilityDelegate c2 = T.c(view);
                C0007b c0007b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f644a : new C0007b(c2);
                if (c0007b == null) {
                    c0007b = new C0007b();
                }
                T.l(view, c0007b);
                T.i(view, eVar.a());
                T.e(view).add(eVar);
                T.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f2150I && this.f2153L != 5) {
            T.j(view, L.e.f789j, new p(this, 5));
        }
        int i8 = this.f2153L;
        if (i8 == 3) {
            T.j(view, L.e.i, new p(this, this.f2170b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            T.j(view, L.e.h, new p(this, this.f2170b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            T.j(view, L.e.i, new p(this, 4));
            T.j(view, L.e.h, new p(this, 3));
        }
    }

    public final void G(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f2144B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f2153L == 3 && (this.f2192x || z());
        if (this.f2194z == z3 || gVar == null) {
            return;
        }
        this.f2194z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f828a.i, z3 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s2 = this.f2194z ? s() : 1.0f;
        f fVar = gVar.f828a;
        if (fVar.i != s2) {
            fVar.i = s2;
            gVar.f831e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f2162U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2171b0 != null) {
                    return;
                } else {
                    this.f2171b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f2162U.get() && z2) {
                    this.f2171b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2171b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f2162U != null) {
            r();
            if (this.f2153L != 4 || (view = (View) this.f2162U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // x.AbstractC0379a
    public final void c(d dVar) {
        this.f2162U = null;
        this.f2154M = null;
    }

    @Override // x.AbstractC0379a
    public final void e() {
        this.f2162U = null;
        this.f2154M = null;
    }

    @Override // x.AbstractC0379a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        T.e eVar;
        if (!view.isShown() || !this.f2152K) {
            this.f2155N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2166Y = -1;
            this.f2167Z = -1;
            VelocityTracker velocityTracker = this.f2165X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2165X = null;
            }
        }
        if (this.f2165X == null) {
            this.f2165X = VelocityTracker.obtain();
        }
        this.f2165X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2167Z = (int) motionEvent.getY();
            if (this.f2153L != 2) {
                WeakReference weakReference = this.f2163V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f2167Z)) {
                    this.f2166Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2169a0 = true;
                }
            }
            this.f2155N = this.f2166Y == -1 && !coordinatorLayout.o(view, x2, this.f2167Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2169a0 = false;
            this.f2166Y = -1;
            if (this.f2155N) {
                this.f2155N = false;
                return false;
            }
        }
        if (!this.f2155N && (eVar = this.f2154M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2163V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f2155N || this.f2153L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2154M == null || (i = this.f2167Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f2154M.f1118b)) ? false : true;
    }

    @Override // x.AbstractC0379a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f2180l;
        g gVar = this.i;
        int i3 = 1;
        WeakHashMap weakHashMap = T.f633a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2162U == null) {
            this.f2177g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f2182n || this.f2176f) ? false : true;
            if (this.f2183o || this.f2184p || this.f2185q || this.f2187s || this.f2188t || this.f2189u || z2) {
                h hVar = new h(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                q qVar = new q();
                qVar.f518a = paddingStart;
                qVar.f519b = paddingEnd;
                qVar.f520c = paddingBottom;
                H.u(view, new j(hVar, i3, qVar));
                if (view.isAttachedToWindow()) {
                    F.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new G0.p());
                }
            }
            C0011d c0011d = new C0011d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new j0(c0011d));
            } else {
                PathInterpolator pathInterpolator = i0.f675e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener h0Var = new h0(view, c0011d);
                view.setTag(R.id.tag_window_insets_animation_callback, h0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(h0Var);
                }
            }
            this.f2162U = new WeakReference(view);
            Context context = view.getContext();
            F1.d.e0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(RecyclerView.f1949A0, RecyclerView.f1949A0, RecyclerView.f1949A0, 1.0f));
            F1.d.d0(context, R.attr.motionDurationMedium2, 300);
            F1.d.d0(context, R.attr.motionDurationShort3, 150);
            F1.d.d0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f2149H;
                if (f2 == -1.0f) {
                    f2 = H.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f2178j;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2154M == null) {
            this.f2154M = new T.e(coordinatorLayout.getContext(), coordinatorLayout, this.f2174d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f2160S = coordinatorLayout.getWidth();
        this.f2161T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2159R = height;
        int i5 = this.f2161T;
        int i6 = i5 - height;
        int i7 = this.f2191w;
        if (i6 < i7) {
            if (this.f2186r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f2159R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f2159R = i8;
            }
        }
        this.f2146D = Math.max(0, this.f2161T - this.f2159R);
        this.f2147E = (int) ((1.0f - this.F) * this.f2161T);
        r();
        int i9 = this.f2153L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f2147E);
        } else if (this.f2150I && i9 == 5) {
            view.offsetTopAndBottom(this.f2161T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f2148G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f2153L, false);
        this.f2163V = new WeakReference(v(view));
        ArrayList arrayList = this.f2164W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0379a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f2179k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2180l, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0379a
    public final boolean i(View view) {
        WeakReference weakReference = this.f2163V;
        return (weakReference == null || view != weakReference.get() || this.f2153L == 3) ? false : true;
    }

    @Override // x.AbstractC0379a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f2152K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f2163V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = T.f633a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = T.f633a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f2148G;
            if (i4 > i5 && !this.f2150I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = T.f633a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = T.f633a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.f2156O = i2;
        this.f2157P = true;
    }

    @Override // x.AbstractC0379a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // x.AbstractC0379a
    public final void m(View view, Parcelable parcelable) {
        C0380a c0380a = (C0380a) parcelable;
        int i = this.f2168a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f2175e = c0380a.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2170b = c0380a.f4464e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f2150I = c0380a.f4465f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f2151J = c0380a.f4466g;
            }
        }
        int i2 = c0380a.f4463c;
        if (i2 == 1 || i2 == 2) {
            this.f2153L = 4;
        } else {
            this.f2153L = i2;
        }
    }

    @Override // x.AbstractC0379a
    public final Parcelable n(View view) {
        return new C0380a(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0379a
    public final boolean o(View view, int i, int i2) {
        this.f2156O = 0;
        this.f2157P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f2147E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2146D) < java.lang.Math.abs(r5 - r3.f2148G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f2148G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f2148G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2147E) < java.lang.Math.abs(r5 - r3.f2148G)) goto L50;
     */
    @Override // x.AbstractC0379a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.f2163V;
        if (weakReference != null && view2 == weakReference.get() && this.f2157P) {
            if (this.f2156O > 0) {
                if (!this.f2170b) {
                }
                E(view, i2, false);
                this.f2157P = false;
            }
            if (this.f2150I) {
                VelocityTracker velocityTracker = this.f2165X;
                if (velocityTracker == null) {
                    yVelocity = RecyclerView.f1949A0;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f2172c);
                    yVelocity = this.f2165X.getYVelocity(this.f2166Y);
                }
                if (D(view, yVelocity)) {
                    i2 = 5;
                    E(view, i2, false);
                    this.f2157P = false;
                }
            }
            if (this.f2156O == 0) {
                int top = view.getTop();
                if (!this.f2170b) {
                    int i3 = this.f2147E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f2170b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            E(view, i2, false);
            this.f2157P = false;
        }
    }

    @Override // x.AbstractC0379a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f2153L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        T.e eVar = this.f2154M;
        if (eVar != null && (this.f2152K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2166Y = -1;
            this.f2167Z = -1;
            VelocityTracker velocityTracker = this.f2165X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2165X = null;
            }
        }
        if (this.f2165X == null) {
            this.f2165X = VelocityTracker.obtain();
        }
        this.f2165X.addMovement(motionEvent);
        if (this.f2154M != null && ((this.f2152K || this.f2153L == 1) && actionMasked == 2 && !this.f2155N)) {
            float abs = Math.abs(this.f2167Z - motionEvent.getY());
            T.e eVar2 = this.f2154M;
            if (abs > eVar2.f1118b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2155N;
    }

    public final void r() {
        int t2 = t();
        if (this.f2170b) {
            this.f2148G = Math.max(this.f2161T - t2, this.f2146D);
        } else {
            this.f2148G = this.f2161T - t2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f2;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        g gVar = this.i;
        float f3 = RecyclerView.f1949A0;
        if (gVar != null && (weakReference = this.f2162U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f2162U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar2 = this.i;
                float a2 = gVar2.f828a.f814a.f860e.a(gVar2.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > RecyclerView.f1949A0 && a2 > RecyclerView.f1949A0) {
                        f2 = f4 / a2;
                        g gVar3 = this.i;
                        float a3 = gVar3.f828a.f814a.f861f.a(gVar3.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f5 = radius;
                            if (f5 > RecyclerView.f1949A0 && a3 > RecyclerView.f1949A0) {
                                f3 = f5 / a3;
                            }
                        }
                        return Math.max(f2, f3);
                    }
                }
                f2 = 0.0f;
                g gVar32 = this.i;
                float a32 = gVar32.f828a.f814a.f861f.a(gVar32.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f3);
            }
        }
        return RecyclerView.f1949A0;
    }

    public final int t() {
        int i;
        return this.f2176f ? Math.min(Math.max(this.f2177g, this.f2161T - ((this.f2160S * 9) / 16)), this.f2159R) + this.f2190v : (this.f2182n || this.f2183o || (i = this.f2181m) <= 0) ? this.f2175e + this.f2190v : Math.max(this.f2175e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.f2162U.get()) != null) {
            ArrayList arrayList = this.f2164W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f2148G;
            if (i <= i2 && i2 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int x() {
        if (this.f2170b) {
            return this.f2146D;
        }
        return Math.max(this.f2145C, this.f2186r ? 0 : this.f2191w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f2148G;
        }
        if (i == 5) {
            return this.f2161T;
        }
        if (i == 6) {
            return this.f2147E;
        }
        throw new IllegalArgumentException(AbstractC0001b.f("Invalid state to get top offset: ", i));
    }

    public final boolean z() {
        WeakReference weakReference = this.f2162U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f2162U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 2;
        this.f2168a = 0;
        this.f2170b = true;
        this.f2179k = -1;
        this.f2180l = -1;
        this.f2143A = new e(this);
        this.F = 0.5f;
        this.f2149H = -1.0f;
        this.f2152K = true;
        this.f2153L = 4;
        this.f2158Q = 0.1f;
        this.f2164W = new ArrayList();
        this.f2167Z = -1;
        this.f2173c0 = new SparseIntArray();
        this.f2174d0 = new c(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0363a.f4094a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2178j = l.z(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2193y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f2193y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f2178j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f2144B = ofFloat;
        ofFloat.setDuration(500L);
        this.f2144B.addUpdateListener(new A(i2, this));
        this.f2149H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2179k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2180l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f2150I != z2) {
            this.f2150I = z2;
            if (!z2 && this.f2153L == 5) {
                B(4);
            }
            F();
        }
        this.f2182n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2170b != z3) {
            this.f2170b = z3;
            if (this.f2162U != null) {
                r();
            }
            C((this.f2170b && this.f2153L == 6) ? 3 : this.f2153L);
            G(this.f2153L, true);
            F();
        }
        this.f2151J = obtainStyledAttributes.getBoolean(12, false);
        this.f2152K = obtainStyledAttributes.getBoolean(4, true);
        this.f2168a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > RecyclerView.f1949A0 && f2 < 1.0f) {
            this.F = f2;
            if (this.f2162U != null) {
                this.f2147E = (int) ((1.0f - f2) * this.f2161T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f2145C = i3;
                    G(this.f2153L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2145C = dimensionPixelOffset;
                    G(this.f2153L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(11, 500);
            this.f2183o = obtainStyledAttributes.getBoolean(17, false);
            this.f2184p = obtainStyledAttributes.getBoolean(18, false);
            this.f2185q = obtainStyledAttributes.getBoolean(19, false);
            this.f2186r = obtainStyledAttributes.getBoolean(20, true);
            this.f2187s = obtainStyledAttributes.getBoolean(14, false);
            this.f2188t = obtainStyledAttributes.getBoolean(15, false);
            this.f2189u = obtainStyledAttributes.getBoolean(16, false);
            this.f2192x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f2172c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}

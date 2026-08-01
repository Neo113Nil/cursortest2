package com.google.android.material.bottomsheet;

import H.j;
import I.h;
import I0.m;
import I0.n;
import K.C0000a;
import K.C0002b;
import K.C0006e;
import K.F;
import K.H;
import K.T;
import K.h0;
import K.i0;
import K.j0;
import M.a;
import O0.g;
import O0.k;
import P0.c;
import P0.e;
import R0.A;
import T.f;
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
import com.football.transfertrivia.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.RunnableC0197T;
import u0.AbstractC0338a;
import x.AbstractC0346a;
import x.d;
import z0.C0355a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0346a {

    /* renamed from: A, reason: collision with root package name */
    public final e f1775A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f1776B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1777C;

    /* renamed from: D, reason: collision with root package name */
    public int f1778D;

    /* renamed from: E, reason: collision with root package name */
    public int f1779E;
    public final float F;

    /* renamed from: G, reason: collision with root package name */
    public int f1780G;

    /* renamed from: H, reason: collision with root package name */
    public final float f1781H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1782I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1783J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f1784K;

    /* renamed from: L, reason: collision with root package name */
    public int f1785L;

    /* renamed from: M, reason: collision with root package name */
    public f f1786M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1787N;

    /* renamed from: O, reason: collision with root package name */
    public int f1788O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1789P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f1790Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1791R;

    /* renamed from: S, reason: collision with root package name */
    public int f1792S;

    /* renamed from: T, reason: collision with root package name */
    public int f1793T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f1794U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f1795V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f1796W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f1797X;

    /* renamed from: Y, reason: collision with root package name */
    public int f1798Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1799Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1800a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1801a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1802b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f1803b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f1804c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f1805c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f1806d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1807e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1808f;

    /* renamed from: g, reason: collision with root package name */
    public int f1809g;
    public final int h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1810j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1811k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1812l;

    /* renamed from: m, reason: collision with root package name */
    public int f1813m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1814n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1815o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1816p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1817q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1818r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1819s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1820t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1821u;

    /* renamed from: v, reason: collision with root package name */
    public int f1822v;

    /* renamed from: w, reason: collision with root package name */
    public int f1823w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1824x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1825y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1826z;

    public BottomSheetBehavior() {
        this.f1800a = 0;
        this.f1802b = true;
        this.f1811k = -1;
        this.f1812l = -1;
        this.f1775A = new e(this);
        this.F = 0.5f;
        this.f1781H = -1.0f;
        this.f1784K = true;
        this.f1785L = 4;
        this.f1790Q = 0.1f;
        this.f1796W = new ArrayList();
        this.f1799Z = -1;
        this.f1805c0 = new SparseIntArray();
        this.f1806d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = T.f372a;
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
            if (this.f1808f) {
                return;
            } else {
                this.f1808f = true;
            }
        } else {
            if (!this.f1808f && this.f1807e == i) {
                return;
            }
            this.f1808f = false;
            this.f1807e = Math.max(0, i);
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
        if (!this.f1782I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f1802b && y(i) <= this.f1778D) ? 3 : i;
        WeakReference weakReference = this.f1794U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f1794U.get();
        RunnableC0197T runnableC0197T = new RunnableC0197T(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = T.f372a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0197T);
                return;
            }
        }
        runnableC0197T.run();
    }

    public final void C(int i) {
        if (this.f1785L == i) {
            return;
        }
        this.f1785L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f1782I;
        }
        WeakReference weakReference = this.f1794U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f1796W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f1783J) {
            return true;
        }
        if (view.getTop() < this.f1780G) {
            return false;
        }
        return Math.abs(((f2 * this.f1790Q) + ((float) view.getTop())) - ((float) this.f1780G)) / ((float) t()) > 0.5f;
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
        r2.f1775A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z2) {
        int y2 = y(i);
        f fVar = this.f1786M;
        if (fVar != null) {
            if (!z2) {
                int left = view.getLeft();
                fVar.f801r = view;
                fVar.f789c = -1;
                boolean h = fVar.h(left, y2, 0, 0);
                if (!h && fVar.f787a == 0 && fVar.f801r != null) {
                    fVar.f801r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f1794U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 524288);
        T.g(view, 0);
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        SparseIntArray sparseIntArray = this.f1805c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            T.i(view, i2);
            T.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1802b && this.f1785L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            j jVar = new j(this, 6);
            ArrayList e2 = T.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e2.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = T.d[i5];
                        boolean z2 = true;
                        for (int i7 = 0; i7 < e2.size(); i7++) {
                            z2 &= ((L.f) e2.get(i7)).a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((L.f) e2.get(i3)).f479a).getLabel())) {
                        i = ((L.f) e2.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                L.f fVar = new L.f(null, i, string, jVar, null);
                View.AccessibilityDelegate c2 = T.c(view);
                C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f382a : new C0002b(c2);
                if (c0002b == null) {
                    c0002b = new C0002b();
                }
                T.l(view, c0002b);
                T.i(view, fVar.a());
                T.e(view).add(fVar);
                T.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f1782I && this.f1785L != 5) {
            T.j(view, L.f.f476j, new j(this, 5));
        }
        int i8 = this.f1785L;
        if (i8 == 3) {
            T.j(view, L.f.i, new j(this, this.f1802b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            T.j(view, L.f.h, new j(this, this.f1802b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            T.j(view, L.f.i, new j(this, 4));
            T.j(view, L.f.h, new j(this, 3));
        }
    }

    public final void G(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f1776B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f1785L == 3 && (this.f1824x || z());
        if (this.f1826z == z3 || gVar == null) {
            return;
        }
        this.f1826z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f532a.i, z3 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s2 = this.f1826z ? s() : 1.0f;
        O0.f fVar = gVar.f532a;
        if (fVar.i != s2) {
            fVar.i = s2;
            gVar.f535e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f1794U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f1803b0 != null) {
                    return;
                } else {
                    this.f1803b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f1794U.get() && z2) {
                    this.f1803b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f1803b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f1794U != null) {
            r();
            if (this.f1785L != 4 || (view = (View) this.f1794U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // x.AbstractC0346a
    public final void c(d dVar) {
        this.f1794U = null;
        this.f1786M = null;
    }

    @Override // x.AbstractC0346a
    public final void e() {
        this.f1794U = null;
        this.f1786M = null;
    }

    @Override // x.AbstractC0346a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        f fVar;
        if (!view.isShown() || !this.f1784K) {
            this.f1787N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1798Y = -1;
            this.f1799Z = -1;
            VelocityTracker velocityTracker = this.f1797X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1797X = null;
            }
        }
        if (this.f1797X == null) {
            this.f1797X = VelocityTracker.obtain();
        }
        this.f1797X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f1799Z = (int) motionEvent.getY();
            if (this.f1785L != 2) {
                WeakReference weakReference = this.f1795V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f1799Z)) {
                    this.f1798Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1801a0 = true;
                }
            }
            this.f1787N = this.f1798Y == -1 && !coordinatorLayout.o(view, x2, this.f1799Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1801a0 = false;
            this.f1798Y = -1;
            if (this.f1787N) {
                this.f1787N = false;
                return false;
            }
        }
        if (!this.f1787N && (fVar = this.f1786M) != null && fVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f1795V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f1787N || this.f1785L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1786M == null || (i = this.f1799Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f1786M.f788b)) ? false : true;
    }

    @Override // x.AbstractC0346a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f1812l;
        g gVar = this.i;
        int i3 = 2;
        WeakHashMap weakHashMap = T.f372a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1794U == null) {
            this.f1809g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f1814n || this.f1808f) ? false : true;
            if (this.f1815o || this.f1816p || this.f1817q || this.f1819s || this.f1820t || this.f1821u || z2) {
                h hVar = new h(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                n nVar = new n();
                nVar.f347a = paddingStart;
                nVar.f348b = paddingEnd;
                nVar.f349c = paddingBottom;
                H.u(view, new B.j(hVar, i3, nVar));
                if (view.isAttachedToWindow()) {
                    F.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new m());
                }
            }
            C0006e c0006e = new C0006e(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new j0(c0006e));
            } else {
                PathInterpolator pathInterpolator = i0.f413e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener h0Var = new h0(view, c0006e);
                view.setTag(R.id.tag_window_insets_animation_callback, h0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(h0Var);
                }
            }
            this.f1794U = new WeakReference(view);
            Context context = view.getContext();
            A.c.q0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(RecyclerView.f1570A0, RecyclerView.f1570A0, RecyclerView.f1570A0, 1.0f));
            A.c.p0(context, R.attr.motionDurationMedium2, 300);
            A.c.p0(context, R.attr.motionDurationShort3, 150);
            A.c.p0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1781H;
                if (f2 == -1.0f) {
                    f2 = H.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1810j;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f1786M == null) {
            this.f1786M = new f(coordinatorLayout.getContext(), coordinatorLayout, this.f1806d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f1792S = coordinatorLayout.getWidth();
        this.f1793T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1791R = height;
        int i5 = this.f1793T;
        int i6 = i5 - height;
        int i7 = this.f1823w;
        if (i6 < i7) {
            if (this.f1818r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f1791R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f1791R = i8;
            }
        }
        this.f1778D = Math.max(0, this.f1793T - this.f1791R);
        this.f1779E = (int) ((1.0f - this.F) * this.f1793T);
        r();
        int i9 = this.f1785L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f1779E);
        } else if (this.f1782I && i9 == 5) {
            view.offsetTopAndBottom(this.f1793T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f1780G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f1785L, false);
        this.f1795V = new WeakReference(v(view));
        ArrayList arrayList = this.f1796W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0346a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f1811k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1812l, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0346a
    public final boolean i(View view) {
        WeakReference weakReference = this.f1795V;
        return (weakReference == null || view != weakReference.get() || this.f1785L == 3) ? false : true;
    }

    @Override // x.AbstractC0346a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f1784K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f1795V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = T.f372a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = T.f372a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f1780G;
            if (i4 > i5 && !this.f1782I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = T.f372a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = T.f372a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.f1788O = i2;
        this.f1789P = true;
    }

    @Override // x.AbstractC0346a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // x.AbstractC0346a
    public final void m(View view, Parcelable parcelable) {
        C0355a c0355a = (C0355a) parcelable;
        int i = this.f1800a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1807e = c0355a.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1802b = c0355a.f4090e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f1782I = c0355a.f4091f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f1783J = c0355a.f4092g;
            }
        }
        int i2 = c0355a.f4089c;
        if (i2 == 1 || i2 == 2) {
            this.f1785L = 4;
        } else {
            this.f1785L = i2;
        }
    }

    @Override // x.AbstractC0346a
    public final Parcelable n(View view) {
        return new C0355a(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0346a
    public final boolean o(View view, int i, int i2) {
        this.f1788O = 0;
        this.f1789P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f1779E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1778D) < java.lang.Math.abs(r5 - r3.f1780G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f1780G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f1780G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1779E) < java.lang.Math.abs(r5 - r3.f1780G)) goto L50;
     */
    @Override // x.AbstractC0346a
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
        WeakReference weakReference = this.f1795V;
        if (weakReference != null && view2 == weakReference.get() && this.f1789P) {
            if (this.f1788O > 0) {
                if (!this.f1802b) {
                }
                E(view, i2, false);
                this.f1789P = false;
            }
            if (this.f1782I) {
                VelocityTracker velocityTracker = this.f1797X;
                if (velocityTracker == null) {
                    yVelocity = RecyclerView.f1570A0;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1804c);
                    yVelocity = this.f1797X.getYVelocity(this.f1798Y);
                }
                if (D(view, yVelocity)) {
                    i2 = 5;
                    E(view, i2, false);
                    this.f1789P = false;
                }
            }
            if (this.f1788O == 0) {
                int top = view.getTop();
                if (!this.f1802b) {
                    int i3 = this.f1779E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f1802b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            E(view, i2, false);
            this.f1789P = false;
        }
    }

    @Override // x.AbstractC0346a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f1785L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        f fVar = this.f1786M;
        if (fVar != null && (this.f1784K || i == 1)) {
            fVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1798Y = -1;
            this.f1799Z = -1;
            VelocityTracker velocityTracker = this.f1797X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1797X = null;
            }
        }
        if (this.f1797X == null) {
            this.f1797X = VelocityTracker.obtain();
        }
        this.f1797X.addMovement(motionEvent);
        if (this.f1786M != null && ((this.f1784K || this.f1785L == 1) && actionMasked == 2 && !this.f1787N)) {
            float abs = Math.abs(this.f1799Z - motionEvent.getY());
            f fVar2 = this.f1786M;
            if (abs > fVar2.f788b) {
                fVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1787N;
    }

    public final void r() {
        int t2 = t();
        if (this.f1802b) {
            this.f1780G = Math.max(this.f1793T - t2, this.f1778D);
        } else {
            this.f1780G = this.f1793T - t2;
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
        float f3 = RecyclerView.f1570A0;
        if (gVar != null && (weakReference = this.f1794U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f1794U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar2 = this.i;
                float a2 = gVar2.f532a.f518a.f564e.a(gVar2.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > RecyclerView.f1570A0 && a2 > RecyclerView.f1570A0) {
                        f2 = f4 / a2;
                        g gVar3 = this.i;
                        float a3 = gVar3.f532a.f518a.f565f.a(gVar3.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f5 = radius;
                            if (f5 > RecyclerView.f1570A0 && a3 > RecyclerView.f1570A0) {
                                f3 = f5 / a3;
                            }
                        }
                        return Math.max(f2, f3);
                    }
                }
                f2 = 0.0f;
                g gVar32 = this.i;
                float a32 = gVar32.f532a.f518a.f565f.a(gVar32.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f3);
            }
        }
        return RecyclerView.f1570A0;
    }

    public final int t() {
        int i;
        return this.f1808f ? Math.min(Math.max(this.f1809g, this.f1793T - ((this.f1792S * 9) / 16)), this.f1791R) + this.f1822v : (this.f1814n || this.f1815o || (i = this.f1813m) <= 0) ? this.f1807e + this.f1822v : Math.max(this.f1807e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.f1794U.get()) != null) {
            ArrayList arrayList = this.f1796W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f1780G;
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
        if (this.f1802b) {
            return this.f1778D;
        }
        return Math.max(this.f1777C, this.f1818r ? 0 : this.f1823w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f1780G;
        }
        if (i == 5) {
            return this.f1793T;
        }
        if (i == 6) {
            return this.f1779E;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    public final boolean z() {
        WeakReference weakReference = this.f1794U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f1794U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 2;
        this.f1800a = 0;
        this.f1802b = true;
        this.f1811k = -1;
        this.f1812l = -1;
        this.f1775A = new e(this);
        this.F = 0.5f;
        this.f1781H = -1.0f;
        this.f1784K = true;
        this.f1785L = 4;
        this.f1790Q = 0.1f;
        this.f1796W = new ArrayList();
        this.f1799Z = -1;
        this.f1805c0 = new SparseIntArray();
        this.f1806d0 = new c(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0338a.f3784a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1810j = A.c.G(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f1825y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f1825y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1810j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f1776B = ofFloat;
        ofFloat.setDuration(500L);
        this.f1776B.addUpdateListener(new A(i2, this));
        this.f1781H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1811k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1812l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f1782I != z2) {
            this.f1782I = z2;
            if (!z2 && this.f1785L == 5) {
                B(4);
            }
            F();
        }
        this.f1814n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1802b != z3) {
            this.f1802b = z3;
            if (this.f1794U != null) {
                r();
            }
            C((this.f1802b && this.f1785L == 6) ? 3 : this.f1785L);
            G(this.f1785L, true);
            F();
        }
        this.f1783J = obtainStyledAttributes.getBoolean(12, false);
        this.f1784K = obtainStyledAttributes.getBoolean(4, true);
        this.f1800a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > RecyclerView.f1570A0 && f2 < 1.0f) {
            this.F = f2;
            if (this.f1794U != null) {
                this.f1779E = (int) ((1.0f - f2) * this.f1793T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f1777C = i3;
                    G(this.f1785L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f1777C = dimensionPixelOffset;
                    G(this.f1785L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(11, 500);
            this.f1815o = obtainStyledAttributes.getBoolean(17, false);
            this.f1816p = obtainStyledAttributes.getBoolean(18, false);
            this.f1817q = obtainStyledAttributes.getBoolean(19, false);
            this.f1818r = obtainStyledAttributes.getBoolean(20, true);
            this.f1819s = obtainStyledAttributes.getBoolean(14, false);
            this.f1820t = obtainStyledAttributes.getBoolean(15, false);
            this.f1821u = obtainStyledAttributes.getBoolean(16, false);
            this.f1824x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f1804c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}

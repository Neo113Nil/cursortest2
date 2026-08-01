package com.google.android.material.bottomsheet;

import B0.r;
import B0.s;
import H.j;
import H0.f;
import H0.g;
import H0.k;
import I0.c;
import I0.e;
import K.C0000a;
import K.C0002b;
import K.C0004d;
import K.F;
import K.H;
import K.T;
import K.f0;
import K.g0;
import K.h0;
import K0.C;
import M.a;
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
import com.linetic.luckycross.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.V;
import n0.AbstractC0279a;
import q1.d;
import q1.l;
import s0.C0301a;
import x.AbstractC0336a;
import x.C0339d;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0336a {

    /* renamed from: A, reason: collision with root package name */
    public final e f1543A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f1544B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1545C;

    /* renamed from: D, reason: collision with root package name */
    public int f1546D;

    /* renamed from: E, reason: collision with root package name */
    public int f1547E;
    public final float F;

    /* renamed from: G, reason: collision with root package name */
    public int f1548G;

    /* renamed from: H, reason: collision with root package name */
    public final float f1549H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1550I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1551J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f1552K;

    /* renamed from: L, reason: collision with root package name */
    public int f1553L;

    /* renamed from: M, reason: collision with root package name */
    public S.e f1554M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1555N;

    /* renamed from: O, reason: collision with root package name */
    public int f1556O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1557P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f1558Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1559R;

    /* renamed from: S, reason: collision with root package name */
    public int f1560S;

    /* renamed from: T, reason: collision with root package name */
    public int f1561T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f1562U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f1563V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f1564W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f1565X;

    /* renamed from: Y, reason: collision with root package name */
    public int f1566Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1567Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1568a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1569a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1570b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f1571b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f1572c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f1573c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f1574d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1575e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1576f;

    /* renamed from: g, reason: collision with root package name */
    public int f1577g;
    public final int h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1578j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1579k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1580l;

    /* renamed from: m, reason: collision with root package name */
    public int f1581m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1582n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1583o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1584p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1585q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1586r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1587s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1588t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1589u;

    /* renamed from: v, reason: collision with root package name */
    public int f1590v;

    /* renamed from: w, reason: collision with root package name */
    public int f1591w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1592x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1593y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1594z;

    public BottomSheetBehavior() {
        this.f1568a = 0;
        this.f1570b = true;
        this.f1579k = -1;
        this.f1580l = -1;
        this.f1543A = new e(this);
        this.F = 0.5f;
        this.f1549H = -1.0f;
        this.f1552K = true;
        this.f1553L = 4;
        this.f1558Q = 0.1f;
        this.f1564W = new ArrayList();
        this.f1567Z = -1;
        this.f1573c0 = new SparseIntArray();
        this.f1574d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = T.f381a;
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
            if (this.f1576f) {
                return;
            } else {
                this.f1576f = true;
            }
        } else {
            if (!this.f1576f && this.f1575e == i) {
                return;
            }
            this.f1576f = false;
            this.f1575e = Math.max(0, i);
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
        if (!this.f1550I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f1570b && y(i) <= this.f1546D) ? 3 : i;
        WeakReference weakReference = this.f1562U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f1562U.get();
        V v2 = new V(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = T.f381a;
            if (view.isAttachedToWindow()) {
                view.post(v2);
                return;
            }
        }
        v2.run();
    }

    public final void C(int i) {
        if (this.f1553L == i) {
            return;
        }
        this.f1553L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f1550I;
        }
        WeakReference weakReference = this.f1562U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f1564W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f1551J) {
            return true;
        }
        if (view.getTop() < this.f1548G) {
            return false;
        }
        return Math.abs(((f2 * this.f1558Q) + ((float) view.getTop())) - ((float) this.f1548G)) / ((float) t()) > 0.5f;
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
        r2.f1543A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z2) {
        int y2 = y(i);
        S.e eVar = this.f1554M;
        if (eVar != null) {
            if (!z2) {
                int left = view.getLeft();
                eVar.f707r = view;
                eVar.f695c = -1;
                boolean h = eVar.h(left, y2, 0, 0);
                if (!h && eVar.f693a == 0 && eVar.f707r != null) {
                    eVar.f707r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f1562U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 524288);
        T.g(view, 0);
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        SparseIntArray sparseIntArray = this.f1573c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            T.i(view, i2);
            T.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1570b && this.f1553L != 6) {
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
                            z2 &= ((L.e) e2.get(i7)).a() != i6;
                        }
                        if (z2) {
                            i4 = i6;
                        }
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((L.e) e2.get(i3)).f604a).getLabel())) {
                        i = ((L.e) e2.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                L.e eVar = new L.e(null, i, string, jVar, null);
                View.AccessibilityDelegate c2 = T.c(view);
                C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f390a : new C0002b(c2);
                if (c0002b == null) {
                    c0002b = new C0002b();
                }
                T.l(view, c0002b);
                T.i(view, eVar.a());
                T.e(view).add(eVar);
                T.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f1550I && this.f1553L != 5) {
            T.j(view, L.e.f601j, new j(this, 5));
        }
        int i8 = this.f1553L;
        if (i8 == 3) {
            T.j(view, L.e.i, new j(this, this.f1570b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            T.j(view, L.e.h, new j(this, this.f1570b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            T.j(view, L.e.i, new j(this, 4));
            T.j(view, L.e.h, new j(this, 3));
        }
    }

    public final void G(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f1544B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f1553L == 3 && (this.f1592x || z());
        if (this.f1594z == z3 || gVar == null) {
            return;
        }
        this.f1594z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f256a.i, z3 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s2 = this.f1594z ? s() : 1.0f;
        f fVar = gVar.f256a;
        if (fVar.i != s2) {
            fVar.i = s2;
            gVar.f259e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f1562U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f1571b0 != null) {
                    return;
                } else {
                    this.f1571b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f1562U.get() && z2) {
                    this.f1571b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f1571b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f1562U != null) {
            r();
            if (this.f1553L != 4 || (view = (View) this.f1562U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // x.AbstractC0336a
    public final void c(C0339d c0339d) {
        this.f1562U = null;
        this.f1554M = null;
    }

    @Override // x.AbstractC0336a
    public final void e() {
        this.f1562U = null;
        this.f1554M = null;
    }

    @Override // x.AbstractC0336a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        S.e eVar;
        if (!view.isShown() || !this.f1552K) {
            this.f1555N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1566Y = -1;
            this.f1567Z = -1;
            VelocityTracker velocityTracker = this.f1565X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1565X = null;
            }
        }
        if (this.f1565X == null) {
            this.f1565X = VelocityTracker.obtain();
        }
        this.f1565X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f1567Z = (int) motionEvent.getY();
            if (this.f1553L != 2) {
                WeakReference weakReference = this.f1563V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f1567Z)) {
                    this.f1566Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1569a0 = true;
                }
            }
            this.f1555N = this.f1566Y == -1 && !coordinatorLayout.o(view, x2, this.f1567Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1569a0 = false;
            this.f1566Y = -1;
            if (this.f1555N) {
                this.f1555N = false;
                return false;
            }
        }
        if (!this.f1555N && (eVar = this.f1554M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f1563V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f1555N || this.f1553L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1554M == null || (i = this.f1567Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f1554M.f694b)) ? false : true;
    }

    @Override // x.AbstractC0336a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f1580l;
        g gVar = this.i;
        int i3 = 1;
        WeakHashMap weakHashMap = T.f381a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1562U == null) {
            this.f1577g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f1582n || this.f1576f) ? false : true;
            if (this.f1583o || this.f1584p || this.f1585q || this.f1587s || this.f1588t || this.f1589u || z2) {
                I.g gVar2 = new I.g(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                s sVar = new s();
                sVar.f143a = paddingStart;
                sVar.f144b = paddingEnd;
                sVar.f145c = paddingBottom;
                H.u(view, new B.j(gVar2, i3, sVar));
                if (view.isAttachedToWindow()) {
                    F.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new r());
                }
            }
            C0004d c0004d = new C0004d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new h0(c0004d));
            } else {
                PathInterpolator pathInterpolator = g0.f411e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener f0Var = new f0(view, c0004d);
                view.setTag(R.id.tag_window_insets_animation_callback, f0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(f0Var);
                }
            }
            this.f1562U = new WeakReference(view);
            Context context = view.getContext();
            l.R(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.Q(context, R.attr.motionDurationMedium2, 300);
            l.Q(context, R.attr.motionDurationShort3, 150);
            l.Q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1549H;
                if (f2 == -1.0f) {
                    f2 = H.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1578j;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f1554M == null) {
            this.f1554M = new S.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1574d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f1560S = coordinatorLayout.getWidth();
        this.f1561T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1559R = height;
        int i5 = this.f1561T;
        int i6 = i5 - height;
        int i7 = this.f1591w;
        if (i6 < i7) {
            if (this.f1586r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f1559R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f1559R = i8;
            }
        }
        this.f1546D = Math.max(0, this.f1561T - this.f1559R);
        this.f1547E = (int) ((1.0f - this.F) * this.f1561T);
        r();
        int i9 = this.f1553L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f1547E);
        } else if (this.f1550I && i9 == 5) {
            view.offsetTopAndBottom(this.f1561T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f1548G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f1553L, false);
        this.f1563V = new WeakReference(v(view));
        ArrayList arrayList = this.f1564W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0336a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f1579k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1580l, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0336a
    public final boolean i(View view) {
        WeakReference weakReference = this.f1563V;
        return (weakReference == null || view != weakReference.get() || this.f1553L == 3) ? false : true;
    }

    @Override // x.AbstractC0336a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f1552K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f1563V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = T.f381a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = T.f381a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f1548G;
            if (i4 > i5 && !this.f1550I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = T.f381a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = T.f381a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.f1556O = i2;
        this.f1557P = true;
    }

    @Override // x.AbstractC0336a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // x.AbstractC0336a
    public final void m(View view, Parcelable parcelable) {
        C0301a c0301a = (C0301a) parcelable;
        int i = this.f1568a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1575e = c0301a.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1570b = c0301a.f3757e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f1550I = c0301a.f3758f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f1551J = c0301a.f3759g;
            }
        }
        int i2 = c0301a.f3756c;
        if (i2 == 1 || i2 == 2) {
            this.f1553L = 4;
        } else {
            this.f1553L = i2;
        }
    }

    @Override // x.AbstractC0336a
    public final Parcelable n(View view) {
        return new C0301a(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0336a
    public final boolean o(View view, int i, int i2) {
        this.f1556O = 0;
        this.f1557P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f1547E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1546D) < java.lang.Math.abs(r5 - r3.f1548G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f1548G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f1548G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1547E) < java.lang.Math.abs(r5 - r3.f1548G)) goto L50;
     */
    @Override // x.AbstractC0336a
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
        WeakReference weakReference = this.f1563V;
        if (weakReference != null && view2 == weakReference.get() && this.f1557P) {
            if (this.f1556O > 0) {
                if (!this.f1570b) {
                }
                E(view, i2, false);
                this.f1557P = false;
            }
            if (this.f1550I) {
                VelocityTracker velocityTracker = this.f1565X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1572c);
                    yVelocity = this.f1565X.getYVelocity(this.f1566Y);
                }
                if (D(view, yVelocity)) {
                    i2 = 5;
                    E(view, i2, false);
                    this.f1557P = false;
                }
            }
            if (this.f1556O == 0) {
                int top = view.getTop();
                if (!this.f1570b) {
                    int i3 = this.f1547E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f1570b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            E(view, i2, false);
            this.f1557P = false;
        }
    }

    @Override // x.AbstractC0336a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f1553L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        S.e eVar = this.f1554M;
        if (eVar != null && (this.f1552K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1566Y = -1;
            this.f1567Z = -1;
            VelocityTracker velocityTracker = this.f1565X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1565X = null;
            }
        }
        if (this.f1565X == null) {
            this.f1565X = VelocityTracker.obtain();
        }
        this.f1565X.addMovement(motionEvent);
        if (this.f1554M != null && ((this.f1552K || this.f1553L == 1) && actionMasked == 2 && !this.f1555N)) {
            float abs = Math.abs(this.f1567Z - motionEvent.getY());
            S.e eVar2 = this.f1554M;
            if (abs > eVar2.f694b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1555N;
    }

    public final void r() {
        int t2 = t();
        if (this.f1570b) {
            this.f1548G = Math.max(this.f1561T - t2, this.f1546D);
        } else {
            this.f1548G = this.f1561T - t2;
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
        float f3 = 0.0f;
        if (this.i != null && (weakReference = this.f1562U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f1562U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a2 = gVar.f256a.f242a.f288e.a(gVar.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > 0.0f && a2 > 0.0f) {
                        f2 = f4 / a2;
                        g gVar2 = this.i;
                        float a3 = gVar2.f256a.f242a.f289f.a(gVar2.f());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f5 = radius;
                            if (f5 > 0.0f && a3 > 0.0f) {
                                f3 = f5 / a3;
                            }
                        }
                        return Math.max(f2, f3);
                    }
                }
                f2 = 0.0f;
                g gVar22 = this.i;
                float a32 = gVar22.f256a.f242a.f289f.a(gVar22.f());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f2, f3);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i;
        return this.f1576f ? Math.min(Math.max(this.f1577g, this.f1561T - ((this.f1560S * 9) / 16)), this.f1559R) + this.f1590v : (this.f1582n || this.f1583o || (i = this.f1581m) <= 0) ? this.f1575e + this.f1590v : Math.max(this.f1575e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.f1562U.get()) != null) {
            ArrayList arrayList = this.f1564W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f1548G;
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
        if (this.f1570b) {
            return this.f1546D;
        }
        return Math.max(this.f1545C, this.f1586r ? 0 : this.f1591w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f1548G;
        }
        if (i == 5) {
            return this.f1561T;
        }
        if (i == 6) {
            return this.f1547E;
        }
        throw new IllegalArgumentException(X.V.d("Invalid state to get top offset: ", i));
    }

    public final boolean z() {
        WeakReference weakReference = this.f1562U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f1562U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 2;
        this.f1568a = 0;
        this.f1570b = true;
        this.f1579k = -1;
        this.f1580l = -1;
        this.f1543A = new e(this);
        this.F = 0.5f;
        this.f1549H = -1.0f;
        this.f1552K = true;
        this.f1553L = 4;
        this.f1558Q = 0.1f;
        this.f1564W = new ArrayList();
        this.f1567Z = -1;
        this.f1573c0 = new SparseIntArray();
        this.f1574d0 = new c(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0279a.f3285a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1578j = d.B(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f1593y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f1593y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1578j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f1544B = ofFloat;
        ofFloat.setDuration(500L);
        this.f1544B.addUpdateListener(new C(i2, this));
        this.f1549H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1579k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1580l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f1550I != z2) {
            this.f1550I = z2;
            if (!z2 && this.f1553L == 5) {
                B(4);
            }
            F();
        }
        this.f1582n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1570b != z3) {
            this.f1570b = z3;
            if (this.f1562U != null) {
                r();
            }
            C((this.f1570b && this.f1553L == 6) ? 3 : this.f1553L);
            G(this.f1553L, true);
            F();
        }
        this.f1551J = obtainStyledAttributes.getBoolean(12, false);
        this.f1552K = obtainStyledAttributes.getBoolean(4, true);
        this.f1568a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.F = f2;
            if (this.f1562U != null) {
                this.f1547E = (int) ((1.0f - f2) * this.f1561T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f1545C = i3;
                    G(this.f1553L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f1545C = dimensionPixelOffset;
                    G(this.f1553L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(11, 500);
            this.f1583o = obtainStyledAttributes.getBoolean(17, false);
            this.f1584p = obtainStyledAttributes.getBoolean(18, false);
            this.f1585q = obtainStyledAttributes.getBoolean(19, false);
            this.f1586r = obtainStyledAttributes.getBoolean(20, true);
            this.f1587s = obtainStyledAttributes.getBoolean(14, false);
            this.f1588t = obtainStyledAttributes.getBoolean(15, false);
            this.f1589u = obtainStyledAttributes.getBoolean(16, false);
            this.f1592x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f1572c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}

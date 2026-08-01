package com.google.android.material.bottomsheet;

import D0.q;
import D0.r;
import H.j;
import J0.f;
import J0.g;
import J0.k;
import K.C0000a;
import K.C0001b;
import K.C0003d;
import K.E;
import K.G;
import K.S;
import K.e0;
import K.f0;
import K.g0;
import K0.c;
import K0.e;
import M.a;
import M0.C;
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
import com.fortuneodd.shadegrid.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l.V;
import p0.AbstractC0279a;
import q1.d;
import q1.l;
import u0.C0316a;
import x.AbstractC0333a;
import x.C0336d;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0333a {

    /* renamed from: A, reason: collision with root package name */
    public final e f1549A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f1550B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1551C;

    /* renamed from: D, reason: collision with root package name */
    public int f1552D;

    /* renamed from: E, reason: collision with root package name */
    public int f1553E;
    public final float F;

    /* renamed from: G, reason: collision with root package name */
    public int f1554G;

    /* renamed from: H, reason: collision with root package name */
    public final float f1555H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1556I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1557J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f1558K;

    /* renamed from: L, reason: collision with root package name */
    public int f1559L;

    /* renamed from: M, reason: collision with root package name */
    public S.e f1560M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f1561N;

    /* renamed from: O, reason: collision with root package name */
    public int f1562O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1563P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f1564Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1565R;

    /* renamed from: S, reason: collision with root package name */
    public int f1566S;

    /* renamed from: T, reason: collision with root package name */
    public int f1567T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f1568U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f1569V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f1570W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f1571X;

    /* renamed from: Y, reason: collision with root package name */
    public int f1572Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f1573Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1574a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1575a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1576b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f1577b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f1578c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f1579c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public final c f1580d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1581e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1582f;

    /* renamed from: g, reason: collision with root package name */
    public int f1583g;
    public final int h;
    public final g i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1584j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1585k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1586l;

    /* renamed from: m, reason: collision with root package name */
    public int f1587m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1588n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1589o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1590p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1591q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1592r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1593s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1594t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1595u;

    /* renamed from: v, reason: collision with root package name */
    public int f1596v;

    /* renamed from: w, reason: collision with root package name */
    public int f1597w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1598x;

    /* renamed from: y, reason: collision with root package name */
    public final k f1599y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1600z;

    public BottomSheetBehavior() {
        this.f1574a = 0;
        this.f1576b = true;
        this.f1585k = -1;
        this.f1586l = -1;
        this.f1549A = new e(this);
        this.F = 0.5f;
        this.f1555H = -1.0f;
        this.f1558K = true;
        this.f1559L = 4;
        this.f1564Q = 0.1f;
        this.f1570W = new ArrayList();
        this.f1573Z = -1;
        this.f1579c0 = new SparseIntArray();
        this.f1580d0 = new c(this, 1);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = S.f360a;
        if (G.p(view)) {
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
            if (this.f1582f) {
                return;
            } else {
                this.f1582f = true;
            }
        } else {
            if (!this.f1582f && this.f1581e == i) {
                return;
            }
            this.f1582f = false;
            this.f1581e = Math.max(0, i);
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
        if (!this.f1556I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f1576b && y(i) <= this.f1552D) ? 3 : i;
        WeakReference weakReference = this.f1568U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f1568U.get();
        V v2 = new V(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = S.f360a;
            if (view.isAttachedToWindow()) {
                view.post(v2);
                return;
            }
        }
        v2.run();
    }

    public final void C(int i) {
        if (this.f1559L == i) {
            return;
        }
        this.f1559L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f1556I;
        }
        WeakReference weakReference = this.f1568U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f1570W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean D(View view, float f2) {
        if (this.f1557J) {
            return true;
        }
        if (view.getTop() < this.f1554G) {
            return false;
        }
        return Math.abs(((f2 * this.f1564Q) + ((float) view.getTop())) - ((float) this.f1554G)) / ((float) t()) > 0.5f;
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
        r2.f1549A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i, boolean z2) {
        int y2 = y(i);
        S.e eVar = this.f1560M;
        if (eVar != null) {
            if (!z2) {
                int left = view.getLeft();
                eVar.f705r = view;
                eVar.f693c = -1;
                boolean h = eVar.h(left, y2, 0, 0);
                if (!h && eVar.f691a == 0 && eVar.f705r != null) {
                    eVar.f705r = null;
                }
            }
        }
        C(i);
    }

    public final void F() {
        View view;
        int i;
        WeakReference weakReference = this.f1568U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S.i(view, 524288);
        S.g(view, 0);
        S.i(view, 262144);
        S.g(view, 0);
        S.i(view, 1048576);
        S.g(view, 0);
        SparseIntArray sparseIntArray = this.f1579c0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            S.i(view, i2);
            S.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f1576b && this.f1559L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            j jVar = new j(this, 6);
            ArrayList e2 = S.e(view);
            int i3 = 0;
            while (true) {
                if (i3 >= e2.size()) {
                    int i4 = -1;
                    for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                        int i6 = S.d[i5];
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
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((L.e) e2.get(i3)).f478a).getLabel())) {
                        i = ((L.e) e2.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                L.e eVar = new L.e(null, i, string, jVar, null);
                View.AccessibilityDelegate c2 = S.c(view);
                C0001b c0001b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f370a : new C0001b(c2);
                if (c0001b == null) {
                    c0001b = new C0001b();
                }
                S.l(view, c0001b);
                S.i(view, eVar.a());
                S.e(view).add(eVar);
                S.g(view, 0);
            }
            sparseIntArray.put(0, i);
        }
        if (this.f1556I && this.f1559L != 5) {
            S.j(view, L.e.f475j, new j(this, 5));
        }
        int i8 = this.f1559L;
        if (i8 == 3) {
            S.j(view, L.e.i, new j(this, this.f1576b ? 4 : 6));
            return;
        }
        if (i8 == 4) {
            S.j(view, L.e.h, new j(this, this.f1576b ? 3 : 6));
        } else {
            if (i8 != 6) {
                return;
            }
            S.j(view, L.e.i, new j(this, 4));
            S.j(view, L.e.h, new j(this, 3));
        }
    }

    public final void G(int i, boolean z2) {
        g gVar = this.i;
        ValueAnimator valueAnimator = this.f1550B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f1559L == 3 && (this.f1598x || z());
        if (this.f1600z == z3 || gVar == null) {
            return;
        }
        this.f1600z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f280a.i, z3 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s2 = this.f1600z ? s() : 1.0f;
        f fVar = gVar.f280a;
        if (fVar.i != s2) {
            fVar.i = s2;
            gVar.f283e = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z2) {
        WeakReference weakReference = this.f1568U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f1577b0 != null) {
                    return;
                } else {
                    this.f1577b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f1568U.get() && z2) {
                    this.f1577b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f1577b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f1568U != null) {
            r();
            if (this.f1559L != 4 || (view = (View) this.f1568U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // x.AbstractC0333a
    public final void c(C0336d c0336d) {
        this.f1568U = null;
        this.f1560M = null;
    }

    @Override // x.AbstractC0333a
    public final void e() {
        this.f1568U = null;
        this.f1560M = null;
    }

    @Override // x.AbstractC0333a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        S.e eVar;
        if (!view.isShown() || !this.f1558K) {
            this.f1561N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1572Y = -1;
            this.f1573Z = -1;
            VelocityTracker velocityTracker = this.f1571X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1571X = null;
            }
        }
        if (this.f1571X == null) {
            this.f1571X = VelocityTracker.obtain();
        }
        this.f1571X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f1573Z = (int) motionEvent.getY();
            if (this.f1559L != 2) {
                WeakReference weakReference = this.f1569V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.f1573Z)) {
                    this.f1572Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f1575a0 = true;
                }
            }
            this.f1561N = this.f1572Y == -1 && !coordinatorLayout.o(view, x2, this.f1573Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1575a0 = false;
            this.f1572Y = -1;
            if (this.f1561N) {
                this.f1561N = false;
                return false;
            }
        }
        if (!this.f1561N && (eVar = this.f1560M) != null && eVar.p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f1569V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f1561N || this.f1559L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1560M == null || (i = this.f1573Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f1560M.f692b)) ? false : true;
    }

    @Override // x.AbstractC0333a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2 = this.f1586l;
        g gVar = this.i;
        int i3 = 1;
        WeakHashMap weakHashMap = S.f360a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f1568U == null) {
            this.f1583g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f1588n || this.f1582f) ? false : true;
            if (this.f1589o || this.f1590p || this.f1591q || this.f1593s || this.f1594t || this.f1595u || z2) {
                I.g gVar2 = new I.g(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                r rVar = new r();
                rVar.f166a = paddingStart;
                rVar.f167b = paddingEnd;
                rVar.f168c = paddingBottom;
                G.u(view, new B.j(gVar2, i3, rVar));
                if (view.isAttachedToWindow()) {
                    E.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new q());
                }
            }
            C0003d c0003d = new C0003d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new g0(c0003d));
            } else {
                PathInterpolator pathInterpolator = f0.f389e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener e0Var = new e0(view, c0003d);
                view.setTag(R.id.tag_window_insets_animation_callback, e0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(e0Var);
                }
            }
            this.f1568U = new WeakReference(view);
            Context context = view.getContext();
            l.n0(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.m0(context, R.attr.motionDurationMedium2, 300);
            l.m0(context, R.attr.motionDurationShort3, 150);
            l.m0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f1555H;
                if (f2 == -1.0f) {
                    f2 = G.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f1584j;
                if (colorStateList != null) {
                    G.q(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f1560M == null) {
            this.f1560M = new S.e(coordinatorLayout.getContext(), coordinatorLayout, this.f1580d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f1566S = coordinatorLayout.getWidth();
        this.f1567T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f1565R = height;
        int i5 = this.f1567T;
        int i6 = i5 - height;
        int i7 = this.f1597w;
        if (i6 < i7) {
            if (this.f1592r) {
                if (i2 != -1) {
                    i5 = Math.min(i5, i2);
                }
                this.f1565R = i5;
            } else {
                int i8 = i5 - i7;
                if (i2 != -1) {
                    i8 = Math.min(i8, i2);
                }
                this.f1565R = i8;
            }
        }
        this.f1552D = Math.max(0, this.f1567T - this.f1565R);
        this.f1553E = (int) ((1.0f - this.F) * this.f1567T);
        r();
        int i9 = this.f1559L;
        if (i9 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i9 == 6) {
            view.offsetTopAndBottom(this.f1553E);
        } else if (this.f1556I && i9 == 5) {
            view.offsetTopAndBottom(this.f1567T);
        } else if (i9 == 4) {
            view.offsetTopAndBottom(this.f1554G);
        } else if (i9 == 1 || i9 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f1559L, false);
        this.f1569V = new WeakReference(v(view));
        ArrayList arrayList = this.f1570W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0333a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f1585k, marginLayoutParams.width), w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f1586l, marginLayoutParams.height));
        return true;
    }

    @Override // x.AbstractC0333a
    public final boolean i(View view) {
        WeakReference weakReference = this.f1569V;
        return (weakReference == null || view != weakReference.get() || this.f1559L == 3) ? false : true;
    }

    @Override // x.AbstractC0333a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z2 = this.f1558K;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f1569V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = S.f360a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = S.f360a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f1554G;
            if (i4 > i5 && !this.f1556I) {
                int i6 = top - i5;
                iArr[1] = i6;
                WeakHashMap weakHashMap3 = S.f360a;
                view.offsetTopAndBottom(-i6);
                C(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = S.f360a;
                view.offsetTopAndBottom(-i2);
                C(1);
            }
        }
        u(view.getTop());
        this.f1562O = i2;
        this.f1563P = true;
    }

    @Override // x.AbstractC0333a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // x.AbstractC0333a
    public final void m(View view, Parcelable parcelable) {
        C0316a c0316a = (C0316a) parcelable;
        int i = this.f1574a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f1581e = c0316a.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1576b = c0316a.f3811e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f1556I = c0316a.f3812f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f1557J = c0316a.f3813g;
            }
        }
        int i2 = c0316a.f3810c;
        if (i2 == 1 || i2 == 2) {
            this.f1559L = 4;
        } else {
            this.f1559L = i2;
        }
    }

    @Override // x.AbstractC0333a
    public final Parcelable n(View view) {
        return new C0316a(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC0333a
    public final boolean o(View view, int i, int i2) {
        this.f1562O = 0;
        this.f1563P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f1553E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1552D) < java.lang.Math.abs(r5 - r3.f1554G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f1554G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f1554G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f1553E) < java.lang.Math.abs(r5 - r3.f1554G)) goto L50;
     */
    @Override // x.AbstractC0333a
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
        WeakReference weakReference = this.f1569V;
        if (weakReference != null && view2 == weakReference.get() && this.f1563P) {
            if (this.f1562O > 0) {
                if (!this.f1576b) {
                }
                E(view, i2, false);
                this.f1563P = false;
            }
            if (this.f1556I) {
                VelocityTracker velocityTracker = this.f1571X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f1578c);
                    yVelocity = this.f1571X.getYVelocity(this.f1572Y);
                }
                if (D(view, yVelocity)) {
                    i2 = 5;
                    E(view, i2, false);
                    this.f1563P = false;
                }
            }
            if (this.f1562O == 0) {
                int top = view.getTop();
                if (!this.f1576b) {
                    int i3 = this.f1553E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.f1576b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            E(view, i2, false);
            this.f1563P = false;
        }
    }

    @Override // x.AbstractC0333a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f1559L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        S.e eVar = this.f1560M;
        if (eVar != null && (this.f1558K || i == 1)) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1572Y = -1;
            this.f1573Z = -1;
            VelocityTracker velocityTracker = this.f1571X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1571X = null;
            }
        }
        if (this.f1571X == null) {
            this.f1571X = VelocityTracker.obtain();
        }
        this.f1571X.addMovement(motionEvent);
        if (this.f1560M != null && ((this.f1558K || this.f1559L == 1) && actionMasked == 2 && !this.f1561N)) {
            float abs = Math.abs(this.f1573Z - motionEvent.getY());
            S.e eVar2 = this.f1560M;
            if (abs > eVar2.f692b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f1561N;
    }

    public final void r() {
        int t2 = t();
        if (this.f1576b) {
            this.f1554G = Math.max(this.f1567T - t2, this.f1552D);
        } else {
            this.f1554G = this.f1567T - t2;
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
        if (this.i != null && (weakReference = this.f1568U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f1568U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a2 = gVar.f280a.f266a.f312e.a(gVar.f());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f4 = radius2;
                    if (f4 > 0.0f && a2 > 0.0f) {
                        f2 = f4 / a2;
                        g gVar2 = this.i;
                        float a3 = gVar2.f280a.f266a.f313f.a(gVar2.f());
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
                float a32 = gVar22.f280a.f266a.f313f.a(gVar22.f());
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
        return this.f1582f ? Math.min(Math.max(this.f1583g, this.f1567T - ((this.f1566S * 9) / 16)), this.f1565R) + this.f1596v : (this.f1588n || this.f1589o || (i = this.f1587m) <= 0) ? this.f1581e + this.f1596v : Math.max(this.f1581e, i + this.h);
    }

    public final void u(int i) {
        if (((View) this.f1568U.get()) != null) {
            ArrayList arrayList = this.f1570W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f1554G;
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
        if (this.f1576b) {
            return this.f1552D;
        }
        return Math.max(this.f1551C, this.f1592r ? 0 : this.f1597w);
    }

    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f1554G;
        }
        if (i == 5) {
            return this.f1567T;
        }
        if (i == 6) {
            return this.f1553E;
        }
        throw new IllegalArgumentException(X.V.d("Invalid state to get top offset: ", i));
    }

    public final boolean z() {
        WeakReference weakReference = this.f1568U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f1568U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 2;
        this.f1574a = 0;
        this.f1576b = true;
        this.f1585k = -1;
        this.f1586l = -1;
        this.f1549A = new e(this);
        this.F = 0.5f;
        this.f1555H = -1.0f;
        this.f1558K = true;
        this.f1559L = 4;
        this.f1564Q = 0.1f;
        this.f1570W = new ArrayList();
        this.f1573Z = -1;
        this.f1579c0 = new SparseIntArray();
        this.f1580d0 = new c(this, 1);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0279a.f3379a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1584j = d.r(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f1599y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f1599y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f1584j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f1550B = ofFloat;
        ofFloat.setDuration(500L);
        this.f1550B.addUpdateListener(new C(i2, this));
        this.f1555H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1585k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1586l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A(i);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f1556I != z2) {
            this.f1556I = z2;
            if (!z2 && this.f1559L == 5) {
                B(4);
            }
            F();
        }
        this.f1588n = obtainStyledAttributes.getBoolean(13, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1576b != z3) {
            this.f1576b = z3;
            if (this.f1568U != null) {
                r();
            }
            C((this.f1576b && this.f1559L == 6) ? 3 : this.f1559L);
            G(this.f1559L, true);
            F();
        }
        this.f1557J = obtainStyledAttributes.getBoolean(12, false);
        this.f1558K = obtainStyledAttributes.getBoolean(4, true);
        this.f1574a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.F = f2;
            if (this.f1568U != null) {
                this.f1553E = (int) ((1.0f - f2) * this.f1567T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i3 = peekValue2.data;
                if (i3 >= 0) {
                    this.f1551C = i3;
                    G(this.f1559L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f1551C = dimensionPixelOffset;
                    G(this.f1559L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(11, 500);
            this.f1589o = obtainStyledAttributes.getBoolean(17, false);
            this.f1590p = obtainStyledAttributes.getBoolean(18, false);
            this.f1591q = obtainStyledAttributes.getBoolean(19, false);
            this.f1592r = obtainStyledAttributes.getBoolean(20, true);
            this.f1593s = obtainStyledAttributes.getBoolean(14, false);
            this.f1594t = obtainStyledAttributes.getBoolean(15, false);
            this.f1595u = obtainStyledAttributes.getBoolean(16, false);
            this.f1598x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f1578c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}

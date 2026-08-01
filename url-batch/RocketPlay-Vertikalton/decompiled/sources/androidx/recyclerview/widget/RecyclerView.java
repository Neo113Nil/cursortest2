package androidx.recyclerview.widget;

import B.j;
import E1.AbstractC0001b;
import F1.l;
import G.h;
import H.e;
import J.b;
import K.C0021n;
import K.C0024q;
import K.H;
import K.J;
import K.T;
import R.a;
import T.d;
import U.g;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import f0.AbstractC0112a;
import g0.AbstractC0131A;
import g0.AbstractC0134D;
import g0.AbstractC0135E;
import g0.AbstractC0136F;
import g0.AbstractC0139I;
import g0.AbstractC0141K;
import g0.AbstractC0142L;
import g0.C0140J;
import g0.C0143M;
import g0.C0144N;
import g0.C0145O;
import g0.C0147Q;
import g0.C0148a;
import g0.C0149b;
import g0.C0156i;
import g0.C0159l;
import g0.C0160m;
import g0.C0168v;
import g0.C0170x;
import g0.C0171y;
import g0.C0172z;
import g0.InterfaceC0133C;
import g0.InterfaceC0146P;
import g0.RunnableC0162o;
import g0.S;
import g0.U;
import g0.V;
import g0.W;
import g0.X;
import g0.Y;
import g0.Z;
import g0.b0;
import g0.j0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.k;
import q.AbstractC0332e;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: D0, reason: collision with root package name */
    public static final Class[] f1951D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final d f1952E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final W f1953F0;

    /* renamed from: x0, reason: collision with root package name */
    public static boolean f1954x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public static boolean f1955y0 = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f1957A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1958B;

    /* renamed from: C, reason: collision with root package name */
    public int f1959C;

    /* renamed from: D, reason: collision with root package name */
    public int f1960D;

    /* renamed from: E, reason: collision with root package name */
    public AbstractC0134D f1961E;
    public EdgeEffect F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1962G;

    /* renamed from: H, reason: collision with root package name */
    public EdgeEffect f1963H;

    /* renamed from: I, reason: collision with root package name */
    public EdgeEffect f1964I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC0135E f1965J;

    /* renamed from: K, reason: collision with root package name */
    public int f1966K;

    /* renamed from: L, reason: collision with root package name */
    public int f1967L;

    /* renamed from: M, reason: collision with root package name */
    public VelocityTracker f1968M;

    /* renamed from: N, reason: collision with root package name */
    public int f1969N;

    /* renamed from: O, reason: collision with root package name */
    public int f1970O;

    /* renamed from: P, reason: collision with root package name */
    public int f1971P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1972Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1973R;

    /* renamed from: S, reason: collision with root package name */
    public AbstractC0141K f1974S;

    /* renamed from: T, reason: collision with root package name */
    public final int f1975T;

    /* renamed from: U, reason: collision with root package name */
    public final int f1976U;

    /* renamed from: V, reason: collision with root package name */
    public final float f1977V;

    /* renamed from: W, reason: collision with root package name */
    public final float f1978W;

    /* renamed from: a, reason: collision with root package name */
    public final float f1979a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1980a0;

    /* renamed from: b, reason: collision with root package name */
    public final C0147Q f1981b;

    /* renamed from: b0, reason: collision with root package name */
    public final Y f1982b0;

    /* renamed from: c, reason: collision with root package name */
    public final C0145O f1983c;

    /* renamed from: c0, reason: collision with root package name */
    public RunnableC0162o f1984c0;
    public S d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0160m f1985d0;

    /* renamed from: e, reason: collision with root package name */
    public final e f1986e;

    /* renamed from: e0, reason: collision with root package name */
    public final V f1987e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0149b f1988f;

    /* renamed from: f0, reason: collision with root package name */
    public AbstractC0142L f1989f0;

    /* renamed from: g, reason: collision with root package name */
    public final j f1990g;

    /* renamed from: g0, reason: collision with root package name */
    public ArrayList f1991g0;
    public boolean h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1992h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1993i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f1994j;

    /* renamed from: j0, reason: collision with root package name */
    public final C0172z f1995j0;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f1996k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1997k0;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0131A f1998l;

    /* renamed from: l0, reason: collision with root package name */
    public b0 f1999l0;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0139I f2000m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f2001m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2002n;
    public C0021n n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2003o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f2004o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2005p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f2006p0;

    /* renamed from: q, reason: collision with root package name */
    public C0159l f2007q;

    /* renamed from: q0, reason: collision with root package name */
    public final int[] f2008q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2009r;
    public final ArrayList r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2010s;

    /* renamed from: s0, reason: collision with root package name */
    public final A1.e f2011s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2012t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f2013t0;

    /* renamed from: u, reason: collision with root package name */
    public int f2014u;

    /* renamed from: u0, reason: collision with root package name */
    public int f2015u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2016v;

    /* renamed from: v0, reason: collision with root package name */
    public int f2017v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2018w;

    /* renamed from: w0, reason: collision with root package name */
    public final C0172z f2019w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2020x;

    /* renamed from: y, reason: collision with root package name */
    public int f2021y;

    /* renamed from: z, reason: collision with root package name */
    public final AccessibilityManager f2022z;

    /* renamed from: z0, reason: collision with root package name */
    public static final int[] f1956z0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: A0, reason: collision with root package name */
    public static final float f1949A0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: B0, reason: collision with root package name */
    public static final boolean f1950B0 = true;
    public static final boolean C0 = true;

    static {
        Class cls = Integer.TYPE;
        f1951D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1952E0 = new d(1);
        f1953F0 = new W();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.luckycounter.drinkwater.R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView G2 = G(viewGroup.getChildAt(i));
            if (G2 != null) {
                return G2;
            }
        }
        return null;
    }

    public static Z L(View view) {
        if (view == null) {
            return null;
        }
        return ((C0140J) view.getLayoutParams()).f2789a;
    }

    private C0021n getScrollingChildHelper() {
        if (this.n0 == null) {
            this.n0 = new C0021n(this);
        }
        return this.n0;
    }

    public static void l(Z z2) {
        WeakReference weakReference = z2.f2831b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == z2.f2830a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            z2.f2831b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && l.B(edgeEffect) != f1949A0) {
            int round = Math.round(l.Y(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || l.B(edgeEffect2) == f1949A0) {
            return i;
        }
        float f2 = i2;
        int round2 = Math.round(l.Y(edgeEffect2, (i * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        f1954x0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        f1955y0 = z2;
    }

    public final void A() {
        if (this.f1962G != null) {
            return;
        }
        ((W) this.f1961E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1962G = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f1998l + ", layout:" + this.f2000m + ", context:" + getContext();
    }

    public final void C(V v2) {
        if (getScrollState() != 2) {
            v2.getClass();
            return;
        }
        OverScroller overScroller = this.f1982b0.f2825c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        v2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2005p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0159l c0159l = (C0159l) arrayList.get(i);
            int i2 = c0159l.f2947v;
            if (i2 == 1) {
                boolean d = c0159l.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0159l.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0159l.f2948w = 1;
                        c0159l.f2941p = (int) motionEvent.getX();
                    } else if (d) {
                        c0159l.f2948w = 2;
                        c0159l.f2938m = (int) motionEvent.getY();
                    }
                    c0159l.f(2);
                    if (action == 3) {
                        this.f2007q = c0159l;
                        return true;
                    }
                }
            } else {
                if (i2 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int e2 = this.f1988f.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e2; i3++) {
            Z L2 = L(this.f1988f.d(i3));
            if (!L2.p()) {
                int b2 = L2.b();
                if (b2 < i) {
                    i = b2;
                }
                if (b2 > i2) {
                    i2 = b2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final Z H(int i) {
        Z z2 = null;
        if (this.f1957A) {
            return null;
        }
        int h = this.f1988f.h();
        for (int i2 = 0; i2 < h; i2++) {
            Z L2 = L(this.f1988f.g(i2));
            if (L2 != null && !L2.i() && I(L2) == i) {
                if (!this.f1988f.f2852c.contains(L2.f2830a)) {
                    return L2;
                }
                z2 = L2;
            }
        }
        return z2;
    }

    public final int I(Z z2) {
        if (z2.d(524) || !z2.f()) {
            return -1;
        }
        e eVar = this.f1986e;
        int i = z2.f2832c;
        ArrayList arrayList = (ArrayList) eVar.f547c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0148a c0148a = (C0148a) arrayList.get(i2);
            int i3 = c0148a.f2846a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0148a.f2847b;
                    if (i4 <= i) {
                        int i5 = c0148a.f2848c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0148a.f2847b;
                    if (i6 == i) {
                        i = c0148a.f2848c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0148a.f2848c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0148a.f2847b <= i) {
                i += c0148a.f2848c;
            }
        }
        return i;
    }

    public final long J(Z z2) {
        return this.f1998l.f2765b ? z2.f2833e : z2.f2832c;
    }

    public final Z K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        C0140J c0140j = (C0140J) view.getLayoutParams();
        boolean z2 = c0140j.f2791c;
        Rect rect = c0140j.f2790b;
        if (!z2) {
            return rect;
        }
        if (this.f1987e0.f2817g && (c0140j.f2789a.l() || c0140j.f2789a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2003o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.i;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0136F) arrayList.get(i)).getClass();
            ((C0140J) view.getLayoutParams()).f2789a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0140j.f2791c = false;
        return rect;
    }

    public final boolean N() {
        return !this.f2012t || this.f1957A || this.f1986e.f();
    }

    public final boolean O() {
        return this.f1959C > 0;
    }

    public final void P(int i) {
        if (this.f2000m == null) {
            return;
        }
        setScrollState(2);
        this.f2000m.p0(i);
        awakenScrollBars();
    }

    public final void Q() {
        int h = this.f1988f.h();
        for (int i = 0; i < h; i++) {
            ((C0140J) this.f1988f.g(i).getLayoutParams()).f2791c = true;
        }
        ArrayList arrayList = this.f1983c.f2800c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0140J c0140j = (C0140J) ((Z) arrayList.get(i2)).f2830a.getLayoutParams();
            if (c0140j != null) {
                c0140j.f2791c = true;
            }
        }
    }

    public final void R(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int h = this.f1988f.h();
        for (int i4 = 0; i4 < h; i4++) {
            Z L2 = L(this.f1988f.g(i4));
            if (L2 != null && !L2.p()) {
                int i5 = L2.f2832c;
                V v2 = this.f1987e0;
                if (i5 >= i3) {
                    if (f1955y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now at position " + (L2.f2832c - i2));
                    }
                    L2.m(-i2, z2);
                    v2.f2816f = true;
                } else if (i5 >= i) {
                    if (f1955y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now REMOVED");
                    }
                    L2.a(8);
                    L2.m(-i2, z2);
                    L2.f2832c = i - 1;
                    v2.f2816f = true;
                }
            }
        }
        C0145O c0145o = this.f1983c;
        ArrayList arrayList = c0145o.f2800c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Z z3 = (Z) arrayList.get(size);
            if (z3 != null) {
                int i6 = z3.f2832c;
                if (i6 >= i3) {
                    if (f1955y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + z3 + " now at position " + (z3.f2832c - i2));
                    }
                    z3.m(-i2, z2);
                } else if (i6 >= i) {
                    z3.a(8);
                    c0145o.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void S() {
        this.f1959C++;
    }

    public final void T(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1959C - 1;
        this.f1959C = i2;
        if (i2 < 1) {
            if (f1954x0 && i2 < 0) {
                throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1959C = 0;
            if (z2) {
                int i3 = this.f2021y;
                this.f2021y = 0;
                if (i3 != 0 && (accessibilityManager = this.f2022z) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.r0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Z z3 = (Z) arrayList.get(size);
                    if (z3.f2830a.getParent() == this && !z3.p() && (i = z3.f2843q) != -1) {
                        WeakHashMap weakHashMap = T.f633a;
                        z3.f2830a.setImportantForAccessibility(i);
                        z3.f2843q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1967L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1967L = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1971P = x2;
            this.f1969N = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1972Q = y2;
            this.f1970O = y2;
        }
    }

    public final void V() {
        if (this.f1997k0 || !this.f2009r) {
            return;
        }
        WeakHashMap weakHashMap = T.f633a;
        postOnAnimation(this.f2011s0);
        this.f1997k0 = true;
    }

    public final void W(boolean z2) {
        this.f1958B = z2 | this.f1958B;
        this.f1957A = true;
        int h = this.f1988f.h();
        for (int i = 0; i < h; i++) {
            Z L2 = L(this.f1988f.g(i));
            if (L2 != null && !L2.p()) {
                L2.a(6);
            }
        }
        Q();
        C0145O c0145o = this.f1983c;
        ArrayList arrayList = c0145o.f2800c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Z z3 = (Z) arrayList.get(i2);
            if (z3 != null) {
                z3.a(6);
                z3.a(1024);
            }
        }
        AbstractC0131A abstractC0131A = c0145o.h.f1998l;
        if (abstractC0131A == null || !abstractC0131A.f2765b) {
            c0145o.f();
        }
    }

    public final void X(Z z2, C0024q c0024q) {
        z2.f2836j &= -8193;
        boolean z3 = this.f1987e0.h;
        j jVar = this.f1990g;
        if (z3 && z2.l() && !z2.i() && !z2.p()) {
            ((o.e) jVar.f73c).d(J(z2), z2);
        }
        k kVar = (k) jVar.f72b;
        j0 j0Var = (j0) kVar.getOrDefault(z2, null);
        if (j0Var == null) {
            j0Var = j0.a();
            kVar.put(z2, j0Var);
        }
        j0Var.f2921b = c0024q;
        j0Var.f2920a |= 4;
    }

    public final int Y(int i, float f2) {
        float height = f2 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.F;
        float f3 = f1949A0;
        if (edgeEffect == null || l.B(edgeEffect) == f1949A0) {
            EdgeEffect edgeEffect2 = this.f1963H;
            if (edgeEffect2 != null && l.B(edgeEffect2) != f1949A0) {
                if (canScrollHorizontally(1)) {
                    this.f1963H.onRelease();
                } else {
                    float Y2 = l.Y(this.f1963H, width, height);
                    if (l.B(this.f1963H) == f1949A0) {
                        this.f1963H.onRelease();
                    }
                    f3 = Y2;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.F.onRelease();
            } else {
                float f4 = -l.Y(this.F, -width, 1.0f - height);
                if (l.B(this.F) == f1949A0) {
                    this.F.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    public final int Z(int i, float f2) {
        float width = f2 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.f1962G;
        float f3 = f1949A0;
        if (edgeEffect == null || l.B(edgeEffect) == f1949A0) {
            EdgeEffect edgeEffect2 = this.f1964I;
            if (edgeEffect2 != null && l.B(edgeEffect2) != f1949A0) {
                if (canScrollVertically(1)) {
                    this.f1964I.onRelease();
                } else {
                    float Y2 = l.Y(this.f1964I, height, 1.0f - width);
                    if (l.B(this.f1964I) == f1949A0) {
                        this.f1964I.onRelease();
                    }
                    f3 = Y2;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1962G.onRelease();
            } else {
                float f4 = -l.Y(this.f1962G, -height, width);
                if (l.B(this.f1962G) == f1949A0) {
                    this.f1962G.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    public final void a0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0140J) {
            C0140J c0140j = (C0140J) layoutParams;
            if (!c0140j.f2791c) {
                int i = rect.left;
                Rect rect2 = c0140j.f2790b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2000m.m0(this, view, this.i, !this.f2012t, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null) {
            abstractC0139I.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        VelocityTracker velocityTracker = this.f1968M;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        j0(0);
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1962G;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1962G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1963H;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1963H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1964I;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1964I.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = T.f633a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        p();
        AbstractC0131A abstractC0131A = this.f1998l;
        int[] iArr = this.f2008q0;
        if (abstractC0131A != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            d0(i, i2, iArr);
            int i8 = iArr[0];
            int i9 = iArr[1];
            i4 = i8;
            i5 = i9;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f2003o.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.f2004o0, i3, iArr);
        int i10 = iArr[0];
        int i11 = i6 - i10;
        int i12 = iArr[1];
        int i13 = i7 - i12;
        boolean z3 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.f1971P;
        int[] iArr2 = this.f2004o0;
        int i15 = iArr2[0];
        this.f1971P = i14 - i15;
        int i16 = this.f1972Q;
        int i17 = iArr2[1];
        this.f1972Q = i16 - i17;
        int[] iArr3 = this.f2006p0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i11;
                float y2 = motionEvent.getY();
                float f3 = i13;
                if (f2 < f1949A0) {
                    y();
                    l.Y(this.F, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > f1949A0) {
                    z();
                    l.Y(this.f1963H, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= f1949A0) {
                        A();
                        l.Y(this.f1962G, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > f1949A0) {
                            x();
                            l.Y(this.f1964I, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != f1949A0 || f3 != f1949A0) {
                            WeakHashMap weakHashMap = T.f633a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = T.f633a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= f1949A0) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = T.f633a;
                postInvalidateOnAnimation();
            }
            n(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            w(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i4 == 0 && i5 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0140J) && this.f2000m.f((C0140J) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null && abstractC0139I.d()) {
            return this.f2000m.j(this.f1987e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null && abstractC0139I.d()) {
            return this.f2000m.k(this.f1987e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null && abstractC0139I.d()) {
            return this.f2000m.l(this.f1987e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null && abstractC0139I.e()) {
            return this.f2000m.m(this.f1987e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null && abstractC0139I.e()) {
            return this.f2000m.n(this.f1987e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null && abstractC0139I.e()) {
            return this.f2000m.o(this.f1987e0);
        }
        return 0;
    }

    public final void d0(int i, int i2, int[] iArr) {
        Z z2;
        C0149b c0149b = this.f1988f;
        h0();
        S();
        int i3 = h.f433a;
        Trace.beginSection("RV Scroll");
        V v2 = this.f1987e0;
        C(v2);
        C0145O c0145o = this.f1983c;
        int o02 = i != 0 ? this.f2000m.o0(i, c0145o, v2) : 0;
        int q02 = i2 != 0 ? this.f2000m.q0(i2, c0145o, v2) : 0;
        Trace.endSection();
        int e2 = c0149b.e();
        for (int i4 = 0; i4 < e2; i4++) {
            View d = c0149b.d(i4);
            Z K2 = K(d);
            if (K2 != null && (z2 = K2.i) != null) {
                int left = d.getLeft();
                int top = d.getTop();
                View view = z2.f2830a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        i0(false);
        if (iArr != null) {
            iArr[0] = o02;
            iArr[1] = q02;
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f2003o;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0136F) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, f1949A0);
            EdgeEffect edgeEffect2 = this.F;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1962G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1962G;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1963H;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1963H;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1964I;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1964I;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1965J == null || arrayList.size() <= 0 || !this.f1965J.f()) ? z2 : true) {
            WeakHashMap weakHashMap = T.f633a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i) {
        C0168v c0168v;
        if (this.f2018w) {
            return;
        }
        setScrollState(0);
        Y y2 = this.f1982b0;
        y2.f2828g.removeCallbacks(y2);
        y2.f2825c.abortAnimation();
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null && (c0168v = abstractC0139I.f2780e) != null) {
            c0168v.i();
        }
        AbstractC0139I abstractC0139I2 = this.f2000m;
        if (abstractC0139I2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0139I2.p0(i);
            awakenScrollBars();
        }
    }

    public final boolean f0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float B2 = l.B(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f1979a * 0.015f;
        double log = Math.log(abs / f2);
        double d = f1949A0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f2))) < B2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017d, code lost:
    
        if (r5 < 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0185, code lost:
    
        if ((r5 * r6) <= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018d, code lost:
    
        if ((r5 * r6) >= 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (r7 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0177, code lost:
    
        if (r5 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017a, code lost:
    
        if (r7 < 0) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c2;
        boolean z2;
        this.f2000m.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1998l == null || this.f2000m == null || O() || this.f2018w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        V v2 = this.f1987e0;
        C0145O c0145o = this.f1983c;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f2000m.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f2000m.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f2000m.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        p();
                        if (D(view) == null) {
                            return null;
                        }
                        h0();
                        this.f2000m.T(view, i, c0145o, v2);
                        i0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f2000m.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z2) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z4) {
                p();
                if (D(view) == null) {
                    return null;
                }
                h0();
                view2 = this.f2000m.T(view, i, c0145o, v2);
                i0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            a0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (D(view2) == null) {
                z3 = false;
            } else if (view != null && D(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.i;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.f1994j;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f2000m.C() == 1 ? -1 : 1;
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    i2 = 1;
                } else {
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                    c2 = 1;
                } else {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    c2 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i != 66) {
                                    if (i != 130) {
                                        StringBuilder sb = new StringBuilder("Invalid direction: ");
                                        sb.append(i);
                                        throw new IllegalArgumentException(AbstractC0001b.e(this, sb));
                                    }
                                }
                            }
                        }
                    } else if (c2 <= 0) {
                        if (c2 == 0) {
                        }
                    }
                } else if (c2 >= 0) {
                    if (c2 == 0) {
                    }
                }
            }
            return !z3 ? view2 : super.focusSearch(view, i);
        }
        z3 = false;
        if (!z3) {
        }
    }

    public final void g0(int i, int i2, boolean z2) {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2018w) {
            return;
        }
        if (!abstractC0139I.d()) {
            i = 0;
        }
        if (!this.f2000m.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z2) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.f1982b0.c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null) {
            return abstractC0139I.r();
        }
        throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null) {
            return abstractC0139I.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0131A getAdapter() {
        return this.f1998l;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I == null) {
            return super.getBaseline();
        }
        abstractC0139I.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public b0 getCompatAccessibilityDelegate() {
        return this.f1999l0;
    }

    public AbstractC0134D getEdgeEffectFactory() {
        return this.f1961E;
    }

    public AbstractC0135E getItemAnimator() {
        return this.f1965J;
    }

    public int getItemDecorationCount() {
        return this.f2003o.size();
    }

    public AbstractC0139I getLayoutManager() {
        return this.f2000m;
    }

    public int getMaxFlingVelocity() {
        return this.f1976U;
    }

    public int getMinFlingVelocity() {
        return this.f1975T;
    }

    public long getNanoTime() {
        if (C0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0141K getOnFlingListener() {
        return this.f1974S;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1980a0;
    }

    public C0144N getRecycledViewPool() {
        return this.f1983c.c();
    }

    public int getScrollState() {
        return this.f1966K;
    }

    public final void h(Z z2) {
        View view = z2.f2830a;
        boolean z3 = view.getParent() == this;
        this.f1983c.l(K(view));
        if (z2.k()) {
            this.f1988f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f1988f.a(view, -1, true);
            return;
        }
        C0149b c0149b = this.f1988f;
        int indexOfChild = c0149b.f2850a.f3009a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0149b.f2851b.i(indexOfChild);
            c0149b.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0() {
        int i = this.f2014u + 1;
        this.f2014u = i;
        if (i != 1 || this.f2018w) {
            return;
        }
        this.f2016v = false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(AbstractC0136F abstractC0136F) {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null) {
            abstractC0139I.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2003o;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0136F);
        Q();
        requestLayout();
    }

    public final void i0(boolean z2) {
        if (this.f2014u < 1) {
            if (f1954x0) {
                throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f2014u = 1;
        }
        if (!z2 && !this.f2018w) {
            this.f2016v = false;
        }
        if (this.f2014u == 1) {
            if (z2 && this.f2016v && !this.f2018w && this.f2000m != null && this.f1998l != null) {
                r();
            }
            if (!this.f2018w) {
                this.f2016v = false;
            }
        }
        this.f2014u--;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2009r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2018w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(AbstractC0142L abstractC0142L) {
        if (this.f1991g0 == null) {
            this.f1991g0 = new ArrayList();
        }
        this.f1991g0.add(abstractC0142L);
    }

    public final void j0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void k(String str) {
        if (O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1960D > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC0001b.e(this, new StringBuilder(""))));
        }
    }

    public final void m() {
        int h = this.f1988f.h();
        for (int i = 0; i < h; i++) {
            Z L2 = L(this.f1988f.g(i));
            if (!L2.p()) {
                L2.d = -1;
                L2.f2835g = -1;
            }
        }
        C0145O c0145o = this.f1983c;
        ArrayList arrayList = c0145o.f2800c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Z z2 = (Z) arrayList.get(i2);
            z2.d = -1;
            z2.f2835g = -1;
        }
        ArrayList arrayList2 = c0145o.f2798a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Z z3 = (Z) arrayList2.get(i3);
            z3.d = -1;
            z3.f2835g = -1;
        }
        ArrayList arrayList3 = c0145o.f2799b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Z z4 = (Z) c0145o.f2799b.get(i4);
                z4.d = -1;
                z4.f2835g = -1;
            }
        }
    }

    public final void n(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.F.onRelease();
            z2 = this.F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1963H;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1963H.onRelease();
            z2 |= this.f1963H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1962G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1962G.onRelease();
            z2 |= this.f1962G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1964I;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1964I.onRelease();
            z2 |= this.f1964I.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = T.f633a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.f1959C = 0;
        this.f2009r = true;
        this.f2012t = this.f2012t && !isLayoutRequested();
        this.f1983c.d();
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null) {
            abstractC0139I.f2782g = true;
            abstractC0139I.R(this);
        }
        this.f1997k0 = false;
        if (C0) {
            ThreadLocal threadLocal = RunnableC0162o.f2959e;
            RunnableC0162o runnableC0162o = (RunnableC0162o) threadLocal.get();
            this.f1984c0 = runnableC0162o;
            if (runnableC0162o == null) {
                RunnableC0162o runnableC0162o2 = new RunnableC0162o();
                runnableC0162o2.f2961a = new ArrayList();
                runnableC0162o2.d = new ArrayList();
                this.f1984c0 = runnableC0162o2;
                WeakHashMap weakHashMap = T.f633a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                RunnableC0162o runnableC0162o3 = this.f1984c0;
                runnableC0162o3.f2963c = (long) (1.0E9f / f2);
                threadLocal.set(runnableC0162o3);
            }
            RunnableC0162o runnableC0162o4 = this.f1984c0;
            runnableC0162o4.getClass();
            boolean z2 = f1954x0;
            ArrayList arrayList = runnableC0162o4.f2961a;
            if (z2 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0145O c0145o;
        RunnableC0162o runnableC0162o;
        C0168v c0168v;
        super.onDetachedFromWindow();
        AbstractC0135E abstractC0135E = this.f1965J;
        if (abstractC0135E != null) {
            abstractC0135E.e();
        }
        int i = 0;
        setScrollState(0);
        Y y2 = this.f1982b0;
        y2.f2828g.removeCallbacks(y2);
        y2.f2825c.abortAnimation();
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null && (c0168v = abstractC0139I.f2780e) != null) {
            c0168v.i();
        }
        this.f2009r = false;
        AbstractC0139I abstractC0139I2 = this.f2000m;
        if (abstractC0139I2 != null) {
            abstractC0139I2.f2782g = false;
            abstractC0139I2.S(this);
        }
        this.r0.clear();
        removeCallbacks(this.f2011s0);
        this.f1990g.getClass();
        while (j0.d.a() != null) {
        }
        int i2 = 0;
        while (true) {
            c0145o = this.f1983c;
            ArrayList arrayList = c0145o.f2800c;
            if (i2 >= arrayList.size()) {
                break;
            }
            l.g(((Z) arrayList.get(i2)).f2830a);
            i2++;
        }
        c0145o.e(c0145o.h.f1998l, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            a aVar = (a) childAt.getTag(com.luckycounter.drinkwater.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new a();
                childAt.setTag(com.luckycounter.drinkwater.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f1063a;
            int r0 = W0.k.r0(arrayList2);
            if (-1 < r0) {
                arrayList2.get(r0).getClass();
                throw new ClassCastException();
            }
            i = i3;
        }
        if (!C0 || (runnableC0162o = this.f1984c0) == null) {
            return;
        }
        boolean remove = runnableC0162o.f2961a.remove(this);
        if (f1954x0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1984c0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2003o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0136F) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        AbstractC0139I abstractC0139I;
        if (this.f2000m != null && !this.f2018w && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2000m.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2000m.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == f1949A0 || f3 != f1949A0) {
                        int i = (int) (f3 * this.f1977V);
                        int i2 = (int) (f2 * this.f1978W);
                        abstractC0139I = this.f2000m;
                        if (abstractC0139I == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2018w) {
                            int[] iArr = this.f2008q0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = abstractC0139I.d();
                            boolean e2 = this.f2000m.e();
                            int i3 = e2 ? (d ? 1 : 0) | 2 : d ? 1 : 0;
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            int Y2 = i - Y(i, y2);
                            int Z2 = i2 - Z(i2, x2);
                            getScrollingChildHelper().g(i3, 1);
                            if (u(d ? Y2 : 0, e2 ? Z2 : 0, this.f2008q0, this.f2004o0, 1)) {
                                Y2 -= iArr[0];
                                Z2 -= iArr[1];
                            }
                            c0(d ? Y2 : 0, e2 ? Z2 : 0, motionEvent, 1);
                            RunnableC0162o runnableC0162o = this.f1984c0;
                            if (runnableC0162o != null && (Y2 != 0 || Z2 != 0)) {
                                runnableC0162o.a(this, Y2, Z2);
                            }
                            j0(1);
                        }
                    }
                }
                f3 = 0.0f;
                if (f2 == f1949A0) {
                }
                int i4 = (int) (f3 * this.f1977V);
                int i22 = (int) (f2 * this.f1978W);
                abstractC0139I = this.f2000m;
                if (abstractC0139I == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2000m.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == f1949A0) {
                        }
                        int i42 = (int) (f3 * this.f1977V);
                        int i222 = (int) (f2 * this.f1978W);
                        abstractC0139I = this.f2000m;
                        if (abstractC0139I == null) {
                        }
                    } else if (this.f2000m.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == f1949A0) {
                        }
                        int i422 = (int) (f3 * this.f1977V);
                        int i2222 = (int) (f2 * this.f1978W);
                        abstractC0139I = this.f2000m;
                        if (abstractC0139I == null) {
                        }
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == f1949A0) {
                }
                int i4222 = (int) (f3 * this.f1977V);
                int i22222 = (int) (f2 * this.f1978W);
                abstractC0139I = this.f2000m;
                if (abstractC0139I == null) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (this.f2018w) {
            return false;
        }
        this.f2007q = null;
        if (E(motionEvent)) {
            b0();
            setScrollState(0);
            return true;
        }
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I == null) {
            return false;
        }
        boolean d = abstractC0139I.d();
        boolean e2 = this.f2000m.e();
        if (this.f1968M == null) {
            this.f1968M = VelocityTracker.obtain();
        }
        this.f1968M.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2020x) {
                this.f2020x = false;
            }
            this.f1967L = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1971P = x2;
            this.f1969N = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1972Q = y2;
            this.f1970O = y2;
            EdgeEffect edgeEffect = this.F;
            if (edgeEffect == null || l.B(edgeEffect) == f1949A0 || canScrollHorizontally(-1)) {
                z2 = false;
            } else {
                l.Y(this.F, f1949A0, 1.0f - (motionEvent.getY() / getHeight()));
                z2 = true;
            }
            EdgeEffect edgeEffect2 = this.f1963H;
            boolean z4 = z2;
            if (edgeEffect2 != null) {
                z4 = z2;
                if (l.B(edgeEffect2) != f1949A0) {
                    z4 = z2;
                    if (!canScrollHorizontally(1)) {
                        l.Y(this.f1963H, f1949A0, motionEvent.getY() / getHeight());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f1962G;
            boolean z5 = z4;
            if (edgeEffect3 != null) {
                z5 = z4;
                if (l.B(edgeEffect3) != f1949A0) {
                    z5 = z4;
                    if (!canScrollVertically(-1)) {
                        l.Y(this.f1962G, f1949A0, motionEvent.getX() / getWidth());
                        z5 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f1964I;
            boolean z6 = z5;
            if (edgeEffect4 != null) {
                z6 = z5;
                if (l.B(edgeEffect4) != f1949A0) {
                    z6 = z5;
                    if (!canScrollVertically(1)) {
                        l.Y(this.f1964I, f1949A0, 1.0f - (motionEvent.getX() / getWidth()));
                        z6 = true;
                    }
                }
            }
            if (z6 || this.f1966K == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                j0(1);
            }
            int[] iArr = this.f2006p0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = d;
            if (e2) {
                i = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i, 0);
        } else if (actionMasked == 1) {
            this.f1968M.clear();
            j0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1967L);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1967L + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1966K != 1) {
                int i2 = x3 - this.f1969N;
                int i3 = y3 - this.f1970O;
                if (d == 0 || Math.abs(i2) <= this.f1973R) {
                    z3 = false;
                } else {
                    this.f1971P = x3;
                    z3 = true;
                }
                if (e2 && Math.abs(i3) > this.f1973R) {
                    this.f1972Q = y3;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            b0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1967L = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1971P = x4;
            this.f1969N = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1972Q = y4;
            this.f1970O = y4;
        } else if (actionMasked == 6) {
            U(motionEvent);
        }
        return this.f1966K == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f433a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f2012t = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I == null) {
            q(i, i2);
            return;
        }
        boolean L2 = abstractC0139I.L();
        boolean z2 = false;
        V v2 = this.f1987e0;
        if (!L2) {
            if (this.f2010s) {
                this.f2000m.f2778b.q(i, i2);
                return;
            }
            if (v2.f2819k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0131A abstractC0131A = this.f1998l;
            if (abstractC0131A != null) {
                v2.f2815e = abstractC0131A.a();
            } else {
                v2.f2815e = 0;
            }
            h0();
            this.f2000m.f2778b.q(i, i2);
            i0(false);
            v2.f2817g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2000m.f2778b.q(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z2 = true;
        }
        this.f2013t0 = z2;
        if (z2 || this.f1998l == null) {
            return;
        }
        if (v2.d == 1) {
            s();
        }
        this.f2000m.s0(i, i2);
        v2.i = true;
        t();
        this.f2000m.u0(i, i2);
        if (this.f2000m.x0()) {
            this.f2000m.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            v2.i = true;
            t();
            this.f2000m.u0(i, i2);
        }
        this.f2015u0 = getMeasuredWidth();
        this.f2017v0 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof S)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        S s2 = (S) parcelable;
        this.d = s2;
        super.onRestoreInstanceState(s2.f1067a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        S s2 = new S(super.onSaveInstanceState());
        S s3 = this.d;
        if (s3 != null) {
            s2.f2805c = s3.f2805c;
        } else {
            AbstractC0139I abstractC0139I = this.f2000m;
            if (abstractC0139I != null) {
                s2.f2805c = abstractC0139I.g0();
            } else {
                s2.f2805c = null;
            }
        }
        return s2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1964I = null;
        this.f1962G = null;
        this.f1963H = null;
        this.F = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x04d3, code lost:
    
        if (r2 < r4) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Type inference failed for: r5v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        int i;
        int i2;
        Y y2;
        float f2;
        float f3;
        Y y3;
        MotionEvent motionEvent4;
        int minFlingVelocity;
        boolean z3;
        int H2;
        PointF a2;
        Y y4;
        int i3;
        RecyclerView recyclerView2;
        boolean z4;
        if (this.f2018w || this.f2020x) {
            return false;
        }
        C0159l c0159l = this.f2007q;
        if (c0159l == null) {
            z2 = motionEvent.getAction() == 0 ? false : E(motionEvent);
        } else {
            if (c0159l.f2947v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0159l.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0159l.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0159l.f2948w = 1;
                            c0159l.f2941p = (int) motionEvent.getX();
                        } else if (d) {
                            c0159l.f2948w = 2;
                            c0159l.f2938m = (int) motionEvent.getY();
                        }
                        c0159l.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0159l.f2947v == 2) {
                    c0159l.f2938m = f1949A0;
                    c0159l.f2941p = f1949A0;
                    c0159l.f(1);
                    c0159l.f2948w = 0;
                } else if (motionEvent.getAction() == 2 && c0159l.f2947v == 2) {
                    c0159l.g();
                    int i4 = c0159l.f2948w;
                    int i5 = c0159l.f2930b;
                    if (i4 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0159l.f2950y;
                        iArr[0] = i5;
                        int i6 = c0159l.f2942q - i5;
                        iArr[1] = i6;
                        float max = Math.max(i5, Math.min(i6, x2));
                        if (Math.abs(c0159l.f2940o - max) >= 2.0f) {
                            int e2 = C0159l.e(c0159l.f2941p, max, iArr, c0159l.f2944s.computeHorizontalScrollRange(), c0159l.f2944s.computeHorizontalScrollOffset(), c0159l.f2942q);
                            if (e2 != 0) {
                                c0159l.f2944s.scrollBy(e2, 0);
                            }
                            c0159l.f2941p = max;
                        }
                    }
                    if (c0159l.f2948w == 2) {
                        float y5 = motionEvent.getY();
                        int[] iArr2 = c0159l.f2949x;
                        iArr2[0] = i5;
                        int i7 = c0159l.f2943r - i5;
                        iArr2[1] = i7;
                        float max2 = Math.max(i5, Math.min(i7, y5));
                        if (Math.abs(c0159l.f2937l - max2) >= 2.0f) {
                            int e3 = C0159l.e(c0159l.f2938m, max2, iArr2, c0159l.f2944s.computeVerticalScrollRange(), c0159l.f2944s.computeVerticalScrollOffset(), c0159l.f2943r);
                            if (e3 != 0) {
                                c0159l.f2944s.scrollBy(0, e3);
                            }
                            c0159l.f2938m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f2007q = null;
            }
            z2 = true;
        }
        if (z2) {
            b0();
            setScrollState(0);
            return true;
        }
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I == null) {
            return false;
        }
        boolean d2 = abstractC0139I.d();
        boolean e4 = this.f2000m.e();
        if (this.f1968M == null) {
            this.f1968M = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f2006p0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1967L = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1971P = x3;
            recyclerView.f1969N = x3;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1972Q = y6;
            recyclerView.f1970O = y6;
            int i8 = d2;
            if (e4) {
                i8 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f1968M.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1968M;
                int i9 = this.f1976U;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f4 = d2 != 0 ? -this.f1968M.getXVelocity(this.f1967L) : 0.0f;
                float f5 = e4 ? -this.f1968M.getYVelocity(this.f1967L) : 0.0f;
                if (f4 == f1949A0 && f5 == f1949A0) {
                    recyclerView2 = this;
                    i3 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f4;
                    int i11 = (int) f5;
                    AbstractC0139I abstractC0139I2 = this.f2000m;
                    if (abstractC0139I2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f2018w) {
                        int d3 = abstractC0139I2.d();
                        boolean e5 = this.f2000m.e();
                        int i12 = this.f1975T;
                        if (d3 == 0 || Math.abs(i10) < i12) {
                            i10 = 0;
                        }
                        if (!e5 || Math.abs(i11) < i12) {
                            i11 = 0;
                        }
                        if (i10 != 0 || i11 != 0) {
                            if (i10 != 0) {
                                EdgeEffect edgeEffect = this.F;
                                if (edgeEffect == null || l.B(edgeEffect) == f1949A0) {
                                    EdgeEffect edgeEffect2 = this.f1963H;
                                    if (edgeEffect2 != null && l.B(edgeEffect2) != f1949A0) {
                                        if (f0(this.f1963H, i10, getWidth())) {
                                            this.f1963H.onAbsorb(i10);
                                            i10 = 0;
                                        }
                                        i = i10;
                                        i10 = 0;
                                    }
                                } else {
                                    int i13 = -i10;
                                    if (f0(this.F, i13, getWidth())) {
                                        this.F.onAbsorb(i13);
                                        i10 = 0;
                                    }
                                    i = i10;
                                    i10 = 0;
                                }
                                if (i11 != 0) {
                                    EdgeEffect edgeEffect3 = this.f1962G;
                                    if (edgeEffect3 == null || l.B(edgeEffect3) == f1949A0) {
                                        EdgeEffect edgeEffect4 = this.f1964I;
                                        if (edgeEffect4 != null && l.B(edgeEffect4) != f1949A0) {
                                            if (f0(this.f1964I, i11, getHeight())) {
                                                this.f1964I.onAbsorb(i11);
                                                i11 = 0;
                                            }
                                            i2 = 0;
                                        }
                                    } else {
                                        int i14 = -i11;
                                        if (f0(this.f1962G, i14, getHeight())) {
                                            this.f1962G.onAbsorb(i14);
                                            i11 = 0;
                                        }
                                        i2 = 0;
                                    }
                                    y2 = this.f1982b0;
                                    if (i == 0 || i11 != 0) {
                                        int i15 = -i9;
                                        i = Math.max(i15, Math.min(i, i9));
                                        i11 = Math.max(i15, Math.min(i11, i9));
                                        y2.a(i, i11);
                                    }
                                    if (i10 == 0 || i2 != 0) {
                                        f2 = i10;
                                        f3 = i2;
                                        if (!dispatchNestedPreFling(f2, f3)) {
                                            boolean z5 = d3 != 0 || e5;
                                            dispatchNestedFling(f2, f3, z5);
                                            AbstractC0141K abstractC0141K = this.f1974S;
                                            if (abstractC0141K != null) {
                                                C0171y c0171y = (C0171y) abstractC0141K;
                                                AbstractC0139I layoutManager = c0171y.f3006a.getLayoutManager();
                                                if (layoutManager != 0 && c0171y.f3006a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = c0171y.f3006a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z3 = layoutManager instanceof U)))) {
                                                    C0170x c0170x = !z3 ? null : new C0170x(c0171y, c0171y.f3006a.getContext(), 0);
                                                    if (c0170x != null) {
                                                        int B2 = layoutManager.B();
                                                        if (B2 != 0) {
                                                            g e6 = layoutManager.e() ? c0171y.e(layoutManager) : layoutManager.d() ? c0171y.d(layoutManager) : null;
                                                            if (e6 != null) {
                                                                int v2 = layoutManager.v();
                                                                motionEvent4 = obtain;
                                                                int i16 = Integer.MIN_VALUE;
                                                                int i17 = Integer.MAX_VALUE;
                                                                int i18 = 0;
                                                                View view = null;
                                                                View view2 = null;
                                                                while (i18 < v2) {
                                                                    int i19 = v2;
                                                                    View u2 = layoutManager.u(i18);
                                                                    if (u2 == null) {
                                                                        y4 = y2;
                                                                    } else {
                                                                        y4 = y2;
                                                                        int b2 = C0171y.b(u2, e6);
                                                                        if (b2 <= 0 && b2 > i16) {
                                                                            view2 = u2;
                                                                            i16 = b2;
                                                                        }
                                                                        if (b2 >= 0 && b2 < i17) {
                                                                            view = u2;
                                                                            i17 = b2;
                                                                        }
                                                                    }
                                                                    i18++;
                                                                    v2 = i19;
                                                                    y2 = y4;
                                                                }
                                                                y3 = y2;
                                                                boolean z6 = !layoutManager.d() ? i2 <= 0 : i10 <= 0;
                                                                if (z6 && view != null) {
                                                                    H2 = AbstractC0139I.H(view);
                                                                } else if (z6 || view2 == null) {
                                                                    if (z6) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        H2 = ((z3 && (a2 = ((U) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > f1949A0 ? 1 : (a2.x == f1949A0 ? 0 : -1)) < 0 || (a2.y > f1949A0 ? 1 : (a2.y == f1949A0 ? 0 : -1)) < 0)) == z6 ? -1 : 1) + AbstractC0139I.H(view);
                                                                        if (H2 >= 0) {
                                                                        }
                                                                    }
                                                                    H2 = -1;
                                                                } else {
                                                                    H2 = AbstractC0139I.H(view2);
                                                                }
                                                                if (H2 != -1) {
                                                                    c0170x.f2991a = H2;
                                                                    layoutManager.A0(c0170x);
                                                                }
                                                                if (z5) {
                                                                    if (e5) {
                                                                        d3 = (d3 == true ? 1 : 0) | 2;
                                                                    }
                                                                    getScrollingChildHelper().g(d3, 1);
                                                                    int i20 = -i9;
                                                                    y3.a(Math.max(i20, Math.min(i10, i9)), Math.max(i20, Math.min(i2, i9)));
                                                                }
                                                                i3 = 0;
                                                                recyclerView2 = this;
                                                            }
                                                        }
                                                        y3 = y2;
                                                        motionEvent4 = obtain;
                                                        H2 = -1;
                                                        if (H2 != -1) {
                                                        }
                                                        if (z5) {
                                                        }
                                                        i3 = 0;
                                                        recyclerView2 = this;
                                                    }
                                                }
                                            }
                                            y3 = y2;
                                            motionEvent4 = obtain;
                                            if (z5) {
                                            }
                                            i3 = 0;
                                            recyclerView2 = this;
                                        }
                                    } else if (i != 0 || i11 != 0) {
                                        motionEvent4 = obtain;
                                    }
                                    b0();
                                    motionEvent3 = motionEvent4;
                                    motionEvent3.recycle();
                                    return true;
                                }
                                i2 = i11;
                                i11 = 0;
                                y2 = this.f1982b0;
                                if (i == 0) {
                                }
                                int i152 = -i9;
                                i = Math.max(i152, Math.min(i, i9));
                                i11 = Math.max(i152, Math.min(i11, i9));
                                y2.a(i, i11);
                                if (i10 == 0) {
                                }
                                f2 = i10;
                                f3 = i2;
                                if (!dispatchNestedPreFling(f2, f3)) {
                                }
                            }
                            i = 0;
                            if (i11 != 0) {
                            }
                            i2 = i11;
                            i11 = 0;
                            y2 = this.f1982b0;
                            if (i == 0) {
                            }
                            int i1522 = -i9;
                            i = Math.max(i1522, Math.min(i, i9));
                            i11 = Math.max(i1522, Math.min(i11, i9));
                            y2.a(i, i11);
                            if (i10 == 0) {
                            }
                            f2 = i10;
                            f3 = i2;
                            if (!dispatchNestedPreFling(f2, f3)) {
                            }
                        }
                    }
                    motionEvent4 = obtain;
                    i3 = 0;
                    recyclerView2 = this;
                }
                recyclerView2.setScrollState(i3);
                b0();
                motionEvent3 = motionEvent4;
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1967L);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1967L + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y7 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i21 = this.f1971P - x4;
                int i22 = this.f1972Q - y7;
                if (this.f1966K != 1) {
                    if (d2 != 0) {
                        i21 = i21 > 0 ? Math.max(0, i21 - this.f1973R) : Math.min(0, i21 + this.f1973R);
                        if (i21 != 0) {
                            z4 = true;
                            if (e4) {
                                i22 = i22 > 0 ? Math.max(0, i22 - this.f1973R) : Math.min(0, i22 + this.f1973R);
                                if (i22 != 0) {
                                    z4 = true;
                                }
                            }
                            if (z4) {
                                setScrollState(1);
                            }
                        }
                    }
                    z4 = false;
                    if (e4) {
                    }
                    if (z4) {
                    }
                }
                if (this.f1966K == 1) {
                    int[] iArr4 = this.f2008q0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    int Y2 = i21 - Y(i21, motionEvent.getY());
                    int Z2 = i22 - Z(i22, motionEvent.getX());
                    boolean u3 = u(d2 != 0 ? Y2 : 0, e4 ? Z2 : 0, this.f2008q0, this.f2004o0, 0);
                    int[] iArr5 = this.f2004o0;
                    if (u3) {
                        Y2 -= iArr4[0];
                        Z2 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = Y2;
                    int i24 = Z2;
                    this.f1971P = x4 - iArr5[0];
                    this.f1972Q = y7 - iArr5[1];
                    if (c0(d2 != 0 ? i23 : 0, e4 ? i24 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0162o runnableC0162o = this.f1984c0;
                    if (runnableC0162o != null && (i23 != 0 || i24 != 0)) {
                        runnableC0162o.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                b0();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1967L = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1971P = x5;
                this.f1969N = x5;
                int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1972Q = y8;
                this.f1970O = y8;
            } else if (actionMasked == 6) {
                U(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1968M.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    public final void p() {
        e eVar = this.f1986e;
        if (!this.f2012t || this.f1957A) {
            int i = h.f433a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (eVar.f()) {
            eVar.getClass();
            if (eVar.f()) {
                int i2 = h.f433a;
                Trace.beginSection("RV FullInvalidate");
                r();
                Trace.endSection();
            }
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = T.f633a;
        setMeasuredDimension(AbstractC0139I.g(i, paddingRight, getMinimumWidth()), AbstractC0139I.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0332, code lost:
    
        if (r19.f1988f.f2852c.contains(getFocusedChild()) == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x038d, code lost:
    
        if (r6.hasFocusable() != false) goto L190;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [g0.Z] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        ?? r10;
        View view;
        View findViewById;
        boolean z2;
        C0024q c0024q;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1998l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2000m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        V v2 = this.f1987e0;
        v2.i = false;
        boolean z3 = this.f2013t0 && !(this.f2015u0 == getWidth() && this.f2017v0 == getHeight());
        this.f2015u0 = 0;
        this.f2017v0 = 0;
        this.f2013t0 = false;
        if (v2.d == 1) {
            s();
            this.f2000m.r0(this);
            t();
        } else {
            e eVar = this.f1986e;
            if ((((ArrayList) eVar.d).isEmpty() || ((ArrayList) eVar.f547c).isEmpty()) && !z3 && this.f2000m.f2787n == getWidth() && this.f2000m.f2788o == getHeight()) {
                this.f2000m.r0(this);
            } else {
                this.f2000m.r0(this);
                t();
            }
        }
        v2.a(4);
        h0();
        S();
        v2.d = 1;
        boolean z4 = v2.f2818j;
        View view2 = null;
        Long l2 = null;
        C0145O c0145o = this.f1983c;
        j jVar = this.f1990g;
        if (z4) {
            int e2 = this.f1988f.e() - 1;
            while (e2 >= 0) {
                Z L2 = L(this.f1988f.d(e2));
                if (!L2.p()) {
                    long J2 = J(L2);
                    this.f1965J.getClass();
                    C0024q c0024q2 = new C0024q();
                    c0024q2.a(L2);
                    Z z5 = (Z) ((o.e) jVar.f73c).c(J2, l2);
                    if (z5 == null || z5.p()) {
                        jVar.e(L2, c0024q2);
                    } else {
                        k kVar = (k) jVar.f72b;
                        j0 j0Var = (j0) kVar.getOrDefault(z5, l2);
                        boolean z6 = (j0Var == null || (j0Var.f2920a & 1) == 0) ? false : true;
                        j0 j0Var2 = (j0) kVar.getOrDefault(L2, l2);
                        boolean z7 = (j0Var2 == null || (j0Var2.f2920a & 1) == 0) ? false : true;
                        if (z6 && z5 == L2) {
                            jVar.e(L2, c0024q2);
                        } else {
                            C0024q J3 = jVar.J(z5, 4);
                            jVar.e(L2, c0024q2);
                            C0024q J4 = jVar.J(L2, 8);
                            if (J3 == null) {
                                int e3 = this.f1988f.e();
                                for (int i2 = 0; i2 < e3; i2++) {
                                    Z L3 = L(this.f1988f.d(i2));
                                    if (L3 != L2 && J(L3) == J2) {
                                        AbstractC0131A abstractC0131A = this.f1998l;
                                        if (abstractC0131A == null || !abstractC0131A.f2765b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(L3);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(L2);
                                            throw new IllegalStateException(AbstractC0001b.e(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(L3);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(L2);
                                        throw new IllegalStateException(AbstractC0001b.e(this, sb2));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + z5 + " cannot be found but it is necessary for " + L2 + B());
                            } else {
                                z5.o(false);
                                if (z6) {
                                    h(z5);
                                }
                                if (z5 != L2) {
                                    if (z7) {
                                        h(L2);
                                    }
                                    z5.h = L2;
                                    h(z5);
                                    c0145o.l(z5);
                                    L2.o(false);
                                    L2.i = z5;
                                }
                                if (this.f1965J.a(z5, L2, J3, J4)) {
                                    V();
                                }
                            }
                        }
                    }
                }
                e2--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f72b;
            for (int i3 = kVar2.f3612c - 1; i3 >= 0; i3--) {
                Z z8 = (Z) kVar2.h(i3);
                j0 j0Var3 = (j0) kVar2.i(i3);
                int i4 = j0Var3.f2920a;
                int i5 = i4 & 3;
                C0172z c0172z = this.f2019w0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0172z.f3009a;
                    recyclerView2.f2000m.k0(z8.f2830a, recyclerView2.f1983c);
                } else if ((i4 & 1) != 0) {
                    C0024q c0024q3 = j0Var3.f2921b;
                    if (c0024q3 == null) {
                        RecyclerView recyclerView3 = c0172z.f3009a;
                        recyclerView3.f2000m.k0(z8.f2830a, recyclerView3.f1983c);
                    } else {
                        c0172z.g(z8, c0024q3, j0Var3.f2922c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0172z.f(z8, j0Var3.f2921b, j0Var3.f2922c);
                } else if ((i4 & 12) == 12) {
                    C0024q c0024q4 = j0Var3.f2921b;
                    C0024q c0024q5 = j0Var3.f2922c;
                    c0172z.getClass();
                    z8.o(false);
                    RecyclerView recyclerView4 = c0172z.f3009a;
                    if (!recyclerView4.f1957A) {
                        C0156i c0156i = (C0156i) recyclerView4.f1965J;
                        c0156i.getClass();
                        int i6 = c0024q4.f702a;
                        int i7 = c0024q5.f702a;
                        if (i6 == i7 && c0024q4.f703b == c0024q5.f703b) {
                            c0156i.c(z8);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0156i.g(z8, i6, c0024q4.f703b, i7, c0024q5.f703b);
                        }
                        if (g2) {
                            recyclerView.V();
                        }
                    } else if (recyclerView4.f1965J.a(z8, z8, c0024q4, c0024q5)) {
                        recyclerView4.V();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0024q = null;
                        c0172z.g(z8, j0Var3.f2921b, null);
                    } else {
                        c0024q = null;
                        if ((i4 & 8) != 0) {
                            c0172z.f(z8, j0Var3.f2921b, j0Var3.f2922c);
                        }
                    }
                    i = 0;
                    j0Var3.f2920a = i;
                    j0Var3.f2921b = c0024q;
                    j0Var3.f2922c = c0024q;
                    j0.d.c(j0Var3);
                }
                i = 0;
                c0024q = null;
                j0Var3.f2920a = i;
                j0Var3.f2921b = c0024q;
                j0Var3.f2922c = c0024q;
                j0.d.c(j0Var3);
            }
            view2 = null;
        }
        this.f2000m.j0(c0145o);
        v2.f2813b = v2.f2815e;
        this.f1957A = false;
        this.f1958B = false;
        v2.f2818j = false;
        v2.f2819k = false;
        this.f2000m.f2781f = false;
        ArrayList arrayList = c0145o.f2799b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I.f2784k) {
            abstractC0139I.f2783j = 0;
            abstractC0139I.f2784k = false;
            c0145o.m();
        }
        this.f2000m.e0(v2);
        T(true);
        i0(false);
        ((k) jVar.f72b).clear();
        ((o.e) jVar.f73c).a();
        int[] iArr = this.f2001m0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        F(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            w(0, 0);
        }
        if (this.f1980a0 && this.f1998l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = v2.f2821m;
            if (j2 != -1 && (z2 = this.f1998l.f2765b) && z2) {
                int h = this.f1988f.h();
                r10 = view2;
                int i10 = 0;
                while (true) {
                    if (i10 >= h) {
                        break;
                    }
                    Z L4 = L(this.f1988f.g(i10));
                    if (L4 != null && !L4.i() && L4.f2833e == j2) {
                        if (!this.f1988f.f2852c.contains(L4.f2830a)) {
                            r10 = L4;
                            break;
                        }
                        r10 = L4;
                    }
                    i10++;
                    r10 = r10;
                }
            } else {
                r10 = view2;
            }
            if (r10 != null) {
                ArrayList arrayList2 = this.f1988f.f2852c;
                view = r10.f2830a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1988f.e() > 0) {
                int i11 = v2.f2820l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b2 = v2.b();
                for (int i12 = i11; i12 < b2; i12++) {
                    Z H2 = H(i12);
                    if (H2 == null) {
                        break;
                    }
                    View view3 = H2.f2830a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i11) - 1; min >= 0; min--) {
                    Z H3 = H(min);
                    if (H3 == null) {
                        break;
                    }
                    view = H3.f2830a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i13 = v2.f2822n;
                if (i13 != -1 && (findViewById = view2.findViewById(i13)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        v2.f2821m = -1L;
        v2.f2820l = -1;
        v2.f2822n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        Z L2 = L(view);
        if (L2 != null) {
            if (L2.k()) {
                L2.f2836j &= -257;
            } else if (!L2.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L2);
                throw new IllegalArgumentException(AbstractC0001b.e(this, sb));
            }
        } else if (f1954x0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC0001b.e(this, sb2));
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0168v c0168v = this.f2000m.f2780e;
        if ((c0168v == null || !c0168v.f2994e) && !O() && view2 != null) {
            a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2000m.m0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2005p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0159l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2014u != 0 || this.f2018w) {
            this.f2016v = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        View D2;
        int I2;
        View view;
        j0 j0Var;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        char c2;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        C0148a h;
        int i5;
        int i6;
        C0148a c0148a;
        V v2 = this.f1987e0;
        v2.a(1);
        C(v2);
        v2.i = false;
        h0();
        j jVar = this.f1990g;
        ((k) jVar.f72b).clear();
        o.e eVar = (o.e) jVar.f73c;
        eVar.a();
        S();
        if (this.f1957A) {
            e eVar2 = this.f1986e;
            eVar2.j((ArrayList) eVar2.f547c);
            eVar2.j((ArrayList) eVar2.d);
            if (this.f1958B) {
                this.f2000m.Z();
            }
        }
        if (this.f1965J == null || !this.f2000m.B0()) {
            this.f1986e.b();
        } else {
            e eVar3 = this.f1986e;
            ArrayList arrayList = (ArrayList) eVar3.f547c;
            A1.d dVar = (A1.d) eVar3.f549f;
            dVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0148a) arrayList.get(size)).f2846a == 8) {
                        if (z7) {
                            break;
                        }
                    } else {
                        z7 = true;
                    }
                    size--;
                }
                if (size == -1) {
                    break;
                }
                int i7 = size + 1;
                C0148a c0148a2 = (C0148a) arrayList.get(size);
                C0148a c0148a3 = (C0148a) arrayList.get(i7);
                int i8 = c0148a3.f2846a;
                if (i8 != 1) {
                    C0148a c0148a4 = null;
                    e eVar4 = (e) dVar.f38b;
                    if (i8 == 2) {
                        int i9 = c0148a2.f2847b;
                        int i10 = c0148a2.f2848c;
                        if (i9 < i10) {
                            if (c0148a3.f2847b == i9 && c0148a3.f2848c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0148a3.f2847b == i10 + 1 && c0148a3.f2848c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0148a3.f2847b;
                        if (i10 < i11) {
                            c0148a3.f2847b = i11 - 1;
                        } else {
                            int i12 = c0148a3.f2848c;
                            if (i10 < i11 + i12) {
                                c0148a3.f2848c = i12 - 1;
                                c0148a2.f2846a = 2;
                                c0148a2.f2848c = 1;
                                if (c0148a3.f2848c == 0) {
                                    arrayList.remove(i7);
                                    eVar4.getClass();
                                    ((b) eVar4.f546b).c(c0148a3);
                                }
                            }
                        }
                        int i13 = c0148a2.f2847b;
                        int i14 = c0148a3.f2847b;
                        if (i13 <= i14) {
                            c0148a3.f2847b = i14 + 1;
                        } else {
                            int i15 = i14 + c0148a3.f2848c;
                            if (i13 < i15) {
                                c0148a4 = eVar4.h(2, i13 + 1, i15 - i13);
                                c0148a3.f2848c = c0148a2.f2847b - c0148a3.f2847b;
                            }
                        }
                        C0148a c0148a5 = c0148a4;
                        if (z6) {
                            arrayList.set(size, c0148a3);
                            arrayList.remove(i7);
                            eVar4.getClass();
                            ((b) eVar4.f546b).c(c0148a2);
                        } else {
                            if (z5) {
                                if (c0148a5 != null) {
                                    int i16 = c0148a2.f2847b;
                                    if (i16 > c0148a5.f2847b) {
                                        c0148a2.f2847b = i16 - c0148a5.f2848c;
                                    }
                                    int i17 = c0148a2.f2848c;
                                    if (i17 > c0148a5.f2847b) {
                                        c0148a2.f2848c = i17 - c0148a5.f2848c;
                                    }
                                }
                                int i18 = c0148a2.f2847b;
                                if (i18 > c0148a3.f2847b) {
                                    c0148a2.f2847b = i18 - c0148a3.f2848c;
                                }
                                int i19 = c0148a2.f2848c;
                                if (i19 > c0148a3.f2847b) {
                                    c0148a2.f2848c = i19 - c0148a3.f2848c;
                                }
                            } else {
                                if (c0148a5 != null) {
                                    int i20 = c0148a2.f2847b;
                                    if (i20 >= c0148a5.f2847b) {
                                        c0148a2.f2847b = i20 - c0148a5.f2848c;
                                    }
                                    int i21 = c0148a2.f2848c;
                                    if (i21 >= c0148a5.f2847b) {
                                        c0148a2.f2848c = i21 - c0148a5.f2848c;
                                    }
                                }
                                int i22 = c0148a2.f2847b;
                                if (i22 >= c0148a3.f2847b) {
                                    c0148a2.f2847b = i22 - c0148a3.f2848c;
                                }
                                int i23 = c0148a2.f2848c;
                                if (i23 >= c0148a3.f2847b) {
                                    c0148a2.f2848c = i23 - c0148a3.f2848c;
                                }
                            }
                            arrayList.set(size, c0148a3);
                            if (c0148a2.f2847b != c0148a2.f2848c) {
                                arrayList.set(i7, c0148a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0148a5 != null) {
                                arrayList.add(size, c0148a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0148a2.f2848c;
                        int i25 = c0148a3.f2847b;
                        if (i24 < i25) {
                            c0148a3.f2847b = i25 - 1;
                        } else {
                            int i26 = c0148a3.f2848c;
                            if (i24 < i25 + i26) {
                                c0148a3.f2848c = i26 - 1;
                                h = eVar4.h(4, c0148a2.f2847b, 1);
                                i5 = c0148a2.f2847b;
                                i6 = c0148a3.f2847b;
                                if (i5 > i6) {
                                    c0148a3.f2847b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0148a3.f2848c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0148a4 = eVar4.h(4, i5 + 1, i28);
                                        c0148a3.f2848c -= i28;
                                    }
                                }
                                c0148a = c0148a4;
                                arrayList.set(i7, c0148a2);
                                if (c0148a3.f2848c <= 0) {
                                    arrayList.set(size, c0148a3);
                                } else {
                                    arrayList.remove(size);
                                    eVar4.getClass();
                                    ((b) eVar4.f546b).c(c0148a3);
                                }
                                if (h != null) {
                                    arrayList.add(size, h);
                                }
                                if (c0148a == null) {
                                    arrayList.add(size, c0148a);
                                }
                            }
                        }
                        h = null;
                        i5 = c0148a2.f2847b;
                        i6 = c0148a3.f2847b;
                        if (i5 > i6) {
                        }
                        c0148a = c0148a4;
                        arrayList.set(i7, c0148a2);
                        if (c0148a3.f2848c <= 0) {
                        }
                        if (h != null) {
                        }
                        if (c0148a == null) {
                        }
                    }
                } else {
                    int i29 = c0148a2.f2848c;
                    int i30 = c0148a3.f2847b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0148a2.f2847b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0148a2.f2847b = i32 + c0148a3.f2848c;
                    }
                    int i33 = c0148a3.f2847b;
                    if (i33 <= i29) {
                        c0148a2.f2848c = i29 + c0148a3.f2848c;
                    }
                    c0148a3.f2847b = i33 + i31;
                    arrayList.set(size, c0148a3);
                    arrayList.set(i7, c0148a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0148a c0148a6 = (C0148a) arrayList.get(i34);
                int i35 = c0148a6.f2846a;
                if (i35 != 1) {
                    b bVar = (b) eVar3.f546b;
                    C0172z c0172z = (C0172z) eVar3.f548e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0148a6.f2847b;
                        int i37 = c0148a6.f2848c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0172z.b(i38) != null || eVar3.a(i38)) {
                                if (c3 == 0) {
                                    eVar3.c(eVar3.h(2, i36, i39));
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                                c2 = 1;
                            } else {
                                if (c3 == 1) {
                                    eVar3.i(eVar3.h(2, i36, i39));
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c2 = 0;
                            }
                            if (z4) {
                                i38 -= i39;
                                i37 -= i39;
                                i39 = 1;
                            } else {
                                i39++;
                            }
                            i38++;
                            c3 = c2;
                        }
                        if (i39 != c0148a6.f2848c) {
                            bVar.c(c0148a6);
                            c0148a6 = eVar3.h(2, i36, i39);
                        }
                        if (c3 == 0) {
                            eVar3.c(c0148a6);
                        } else {
                            eVar3.i(c0148a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            eVar3.i(c0148a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0148a6.f2847b;
                        int i41 = c0148a6.f2848c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0172z.b(i40) != null || eVar3.a(i40)) {
                                i3 = size2;
                                if (c4 == 0) {
                                    eVar3.c(eVar3.h(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 1;
                            } else {
                                i3 = size2;
                                if (c4 == 1) {
                                    eVar3.i(eVar3.h(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 0;
                            }
                            i43 += i4;
                            i40++;
                            size2 = i3;
                        }
                        i2 = size2;
                        if (i43 != c0148a6.f2848c) {
                            bVar.c(c0148a6);
                            c0148a6 = eVar3.h(4, i42, i43);
                        }
                        if (c4 == 0) {
                            eVar3.c(c0148a6);
                        } else {
                            eVar3.i(c0148a6);
                        }
                    }
                } else {
                    i2 = size2;
                    eVar3.i(c0148a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1992h0 || this.f1993i0;
        boolean z9 = this.f2012t && this.f1965J != null && ((z2 = this.f1957A) || z8 || this.f2000m.f2781f) && (!z2 || this.f1998l.f2765b);
        V v3 = this.f1987e0;
        v3.f2818j = z9;
        v3.f2819k = z9 && z8 && !this.f1957A && this.f1965J != null && this.f2000m.B0();
        View focusedChild = (this.f1980a0 && hasFocus() && this.f1998l != null) ? getFocusedChild() : null;
        Z K2 = (focusedChild == null || (D2 = D(focusedChild)) == null) ? null : K(D2);
        if (K2 == null) {
            v2.f2821m = -1L;
            v2.f2820l = -1;
            v2.f2822n = -1;
        } else {
            v2.f2821m = this.f1998l.f2765b ? K2.f2833e : -1L;
            if (!this.f1957A) {
                if (K2.i()) {
                    I2 = K2.d;
                } else {
                    RecyclerView recyclerView = K2.f2844r;
                    if (recyclerView != null) {
                        I2 = recyclerView.I(K2);
                    }
                }
                v2.f2820l = I2;
                view = K2.f2830a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                v2.f2822n = id;
            }
            I2 = -1;
            v2.f2820l = I2;
            view = K2.f2830a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            v2.f2822n = id2;
        }
        v2.h = v2.f2818j && this.f1993i0;
        this.f1993i0 = false;
        this.f1992h0 = false;
        v2.f2817g = v2.f2819k;
        v2.f2815e = this.f1998l.a();
        F(this.f2001m0);
        boolean z10 = v2.f2818j;
        k kVar = (k) jVar.f72b;
        if (z10) {
            int e2 = this.f1988f.e();
            for (int i44 = 0; i44 < e2; i44++) {
                Z L2 = L(this.f1988f.d(i44));
                if (!L2.p() && (!L2.g() || this.f1998l.f2765b)) {
                    AbstractC0135E abstractC0135E = this.f1965J;
                    AbstractC0135E.b(L2);
                    L2.c();
                    abstractC0135E.getClass();
                    C0024q c0024q = new C0024q();
                    c0024q.a(L2);
                    j0 j0Var2 = (j0) kVar.getOrDefault(L2, null);
                    if (j0Var2 == null) {
                        j0Var2 = j0.a();
                        kVar.put(L2, j0Var2);
                    }
                    j0Var2.f2921b = c0024q;
                    j0Var2.f2920a |= 4;
                    if (v2.h && L2.l() && !L2.i() && !L2.p() && !L2.g()) {
                        eVar.d(J(L2), L2);
                    }
                }
            }
        }
        if (v2.f2819k) {
            int h2 = this.f1988f.h();
            for (int i45 = 0; i45 < h2; i45++) {
                Z L3 = L(this.f1988f.g(i45));
                if (f1954x0 && L3.f2832c == -1 && !L3.i()) {
                    throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!L3.p() && L3.d == -1) {
                    L3.d = L3.f2832c;
                }
            }
            boolean z11 = v2.f2816f;
            v2.f2816f = false;
            this.f2000m.d0(this.f1983c, v2);
            v2.f2816f = z11;
            for (int i46 = 0; i46 < this.f1988f.e(); i46++) {
                Z L4 = L(this.f1988f.d(i46));
                if (!L4.p() && ((j0Var = (j0) kVar.getOrDefault(L4, null)) == null || (j0Var.f2920a & 4) == 0)) {
                    AbstractC0135E.b(L4);
                    boolean d = L4.d(8192);
                    AbstractC0135E abstractC0135E2 = this.f1965J;
                    L4.c();
                    abstractC0135E2.getClass();
                    C0024q c0024q2 = new C0024q();
                    c0024q2.a(L4);
                    if (d) {
                        X(L4, c0024q2);
                    } else {
                        j0 j0Var3 = (j0) kVar.getOrDefault(L4, null);
                        if (j0Var3 == null) {
                            j0Var3 = j0.a();
                            kVar.put(L4, j0Var3);
                        }
                        j0Var3.f2920a |= 2;
                        j0Var3.f2921b = c0024q2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        T(true);
        i0(false);
        v2.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2018w) {
            return;
        }
        boolean d = abstractC0139I.d();
        boolean e2 = this.f2000m.e();
        if (d || e2) {
            if (!d) {
                i = 0;
            }
            if (!e2) {
                i2 = 0;
            }
            c0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!O()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2021y |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(b0 b0Var) {
        this.f1999l0 = b0Var;
        T.l(this, b0Var);
    }

    public void setAdapter(AbstractC0131A abstractC0131A) {
        setLayoutFrozen(false);
        AbstractC0131A abstractC0131A2 = this.f1998l;
        C0147Q c0147q = this.f1981b;
        if (abstractC0131A2 != null) {
            abstractC0131A2.f2764a.unregisterObserver(c0147q);
            this.f1998l.getClass();
        }
        AbstractC0135E abstractC0135E = this.f1965J;
        if (abstractC0135E != null) {
            abstractC0135E.e();
        }
        AbstractC0139I abstractC0139I = this.f2000m;
        C0145O c0145o = this.f1983c;
        if (abstractC0139I != null) {
            abstractC0139I.i0(c0145o);
            this.f2000m.j0(c0145o);
        }
        c0145o.f2798a.clear();
        c0145o.f();
        e eVar = this.f1986e;
        eVar.j((ArrayList) eVar.f547c);
        eVar.j((ArrayList) eVar.d);
        AbstractC0131A abstractC0131A3 = this.f1998l;
        this.f1998l = abstractC0131A;
        if (abstractC0131A != null) {
            abstractC0131A.f2764a.registerObserver(c0147q);
        }
        AbstractC0139I abstractC0139I2 = this.f2000m;
        if (abstractC0139I2 != null) {
            abstractC0139I2.Q();
        }
        AbstractC0131A abstractC0131A4 = this.f1998l;
        c0145o.f2798a.clear();
        c0145o.f();
        c0145o.e(abstractC0131A3, true);
        C0144N c2 = c0145o.c();
        if (abstractC0131A3 != null) {
            c2.f2796b--;
        }
        if (c2.f2796b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c2.f2795a;
                if (i >= sparseArray.size()) {
                    break;
                }
                C0143M c0143m = (C0143M) sparseArray.valueAt(i);
                Iterator it = c0143m.f2792a.iterator();
                while (it.hasNext()) {
                    l.g(((Z) it.next()).f2830a);
                }
                c0143m.f2792a.clear();
                i++;
            }
        }
        if (abstractC0131A4 != null) {
            c2.f2796b++;
        }
        c0145o.d();
        this.f1987e0.f2816f = true;
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0133C interfaceC0133C) {
        if (interfaceC0133C == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.h) {
            this.f1964I = null;
            this.f1962G = null;
            this.f1963H = null;
            this.F = null;
        }
        this.h = z2;
        super.setClipToPadding(z2);
        if (this.f2012t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC0134D abstractC0134D) {
        abstractC0134D.getClass();
        this.f1961E = abstractC0134D;
        this.f1964I = null;
        this.f1962G = null;
        this.f1963H = null;
        this.F = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2010s = z2;
    }

    public void setItemAnimator(AbstractC0135E abstractC0135E) {
        AbstractC0135E abstractC0135E2 = this.f1965J;
        if (abstractC0135E2 != null) {
            abstractC0135E2.e();
            this.f1965J.f2767a = null;
        }
        this.f1965J = abstractC0135E;
        if (abstractC0135E != null) {
            abstractC0135E.f2767a = this.f1995j0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0145O c0145o = this.f1983c;
        c0145o.f2801e = i;
        c0145o.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0139I abstractC0139I) {
        RecyclerView recyclerView;
        C0168v c0168v;
        if (abstractC0139I == this.f2000m) {
            return;
        }
        setScrollState(0);
        Y y2 = this.f1982b0;
        y2.f2828g.removeCallbacks(y2);
        y2.f2825c.abortAnimation();
        AbstractC0139I abstractC0139I2 = this.f2000m;
        if (abstractC0139I2 != null && (c0168v = abstractC0139I2.f2780e) != null) {
            c0168v.i();
        }
        AbstractC0139I abstractC0139I3 = this.f2000m;
        C0145O c0145o = this.f1983c;
        if (abstractC0139I3 != null) {
            AbstractC0135E abstractC0135E = this.f1965J;
            if (abstractC0135E != null) {
                abstractC0135E.e();
            }
            this.f2000m.i0(c0145o);
            this.f2000m.j0(c0145o);
            c0145o.f2798a.clear();
            c0145o.f();
            if (this.f2009r) {
                AbstractC0139I abstractC0139I4 = this.f2000m;
                abstractC0139I4.f2782g = false;
                abstractC0139I4.S(this);
            }
            this.f2000m.v0(null);
            this.f2000m = null;
        } else {
            c0145o.f2798a.clear();
            c0145o.f();
        }
        C0149b c0149b = this.f1988f;
        c0149b.f2851b.h();
        ArrayList arrayList = c0149b.f2852c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0149b.f2850a.f3009a;
            if (size < 0) {
                break;
            }
            Z L2 = L((View) arrayList.get(size));
            if (L2 != null) {
                int i = L2.f2842p;
                if (recyclerView.O()) {
                    L2.f2843q = i;
                    recyclerView.r0.add(L2);
                } else {
                    WeakHashMap weakHashMap = T.f633a;
                    L2.f2830a.setImportantForAccessibility(i);
                }
                L2.f2842p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2000m = abstractC0139I;
        if (abstractC0139I != null) {
            if (abstractC0139I.f2778b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC0139I);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC0001b.e(abstractC0139I.f2778b, sb));
            }
            abstractC0139I.v0(this);
            if (this.f2009r) {
                AbstractC0139I abstractC0139I5 = this.f2000m;
                abstractC0139I5.f2782g = true;
                abstractC0139I5.R(this);
            }
        }
        c0145o.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0021n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = T.f633a;
            H.z(scrollingChildHelper.f692c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(AbstractC0141K abstractC0141K) {
        this.f1974S = abstractC0141K;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0142L abstractC0142L) {
        this.f1989f0 = abstractC0142L;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1980a0 = z2;
    }

    public void setRecycledViewPool(C0144N c0144n) {
        C0145O c0145o = this.f1983c;
        RecyclerView recyclerView = c0145o.h;
        c0145o.e(recyclerView.f1998l, false);
        if (c0145o.f2803g != null) {
            r2.f2796b--;
        }
        c0145o.f2803g = c0144n;
        if (c0144n != null && recyclerView.getAdapter() != null) {
            c0145o.f2803g.f2796b++;
        }
        c0145o.d();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0146P interfaceC0146P) {
    }

    public void setScrollState(int i) {
        C0168v c0168v;
        if (i == this.f1966K) {
            return;
        }
        if (f1955y0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f1966K, new Exception());
        }
        this.f1966K = i;
        if (i != 2) {
            Y y2 = this.f1982b0;
            y2.f2828g.removeCallbacks(y2);
            y2.f2825c.abortAnimation();
            AbstractC0139I abstractC0139I = this.f2000m;
            if (abstractC0139I != null && (c0168v = abstractC0139I.f2780e) != null) {
                c0168v.i();
            }
        }
        AbstractC0139I abstractC0139I2 = this.f2000m;
        if (abstractC0139I2 != null) {
            abstractC0139I2.h0(i);
        }
        AbstractC0142L abstractC0142L = this.f1989f0;
        if (abstractC0142L != null) {
            abstractC0142L.a(this, i);
        }
        ArrayList arrayList = this.f1991g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0142L) this.f1991g0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1973R = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1973R = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(X x2) {
        this.f1983c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0168v c0168v;
        if (z2 != this.f2018w) {
            k("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2018w = false;
                if (this.f2016v && this.f2000m != null && this.f1998l != null) {
                    requestLayout();
                }
                this.f2016v = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, f1949A0, f1949A0, 0));
            this.f2018w = true;
            this.f2020x = true;
            setScrollState(0);
            Y y2 = this.f1982b0;
            y2.f2828g.removeCallbacks(y2);
            y2.f2825c.abortAnimation();
            AbstractC0139I abstractC0139I = this.f2000m;
            if (abstractC0139I == null || (c0168v = abstractC0139I.f2780e) == null) {
                return;
            }
            c0168v.i();
        }
    }

    public final void t() {
        h0();
        S();
        V v2 = this.f1987e0;
        v2.a(6);
        this.f1986e.b();
        v2.f2815e = this.f1998l.a();
        v2.f2814c = 0;
        if (this.d != null) {
            AbstractC0131A abstractC0131A = this.f1998l;
            int a2 = AbstractC0332e.a(abstractC0131A.f2766c);
            if (a2 == 1 ? abstractC0131A.a() > 0 : a2 != 2) {
                Parcelable parcelable = this.d.f2805c;
                if (parcelable != null) {
                    this.f2000m.f0(parcelable);
                }
                this.d = null;
            }
        }
        v2.f2817g = false;
        this.f2000m.d0(this.f1983c, v2);
        v2.f2816f = false;
        v2.f2818j = v2.f2818j && this.f1965J != null;
        v2.d = 4;
        T(true);
        i0(false);
    }

    public final boolean u(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    public final void v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w(int i, int i2) {
        this.f1960D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC0142L abstractC0142L = this.f1989f0;
        if (abstractC0142L != null) {
            abstractC0142L.b(this, i, i2);
        }
        ArrayList arrayList = this.f1991g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0142L) this.f1991g0.get(size)).b(this, i, i2);
            }
        }
        this.f1960D--;
    }

    public final void x() {
        if (this.f1964I != null) {
            return;
        }
        ((W) this.f1961E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1964I = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.F != null) {
            return;
        }
        ((W) this.f1961E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f1963H != null) {
            return;
        }
        ((W) this.f1961E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1963H = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        char c2;
        boolean z2;
        Object[] objArr;
        Constructor constructor;
        this.f1981b = new C0147Q(this);
        this.f1983c = new C0145O(this);
        this.f1990g = new j(15);
        this.i = new Rect();
        this.f1994j = new Rect();
        this.f1996k = new RectF();
        this.f2002n = new ArrayList();
        this.f2003o = new ArrayList();
        this.f2005p = new ArrayList();
        this.f2014u = 0;
        this.f1957A = false;
        this.f1958B = false;
        this.f1959C = 0;
        this.f1960D = 0;
        this.f1961E = f1953F0;
        C0156i c0156i = new C0156i();
        c0156i.f2767a = null;
        c0156i.f2768b = new ArrayList();
        c0156i.f2769c = 120L;
        c0156i.d = 120L;
        c0156i.f2770e = 250L;
        c0156i.f2771f = 250L;
        c0156i.f2905g = true;
        c0156i.h = new ArrayList();
        c0156i.i = new ArrayList();
        c0156i.f2906j = new ArrayList();
        c0156i.f2907k = new ArrayList();
        c0156i.f2908l = new ArrayList();
        c0156i.f2909m = new ArrayList();
        c0156i.f2910n = new ArrayList();
        c0156i.f2911o = new ArrayList();
        c0156i.f2912p = new ArrayList();
        c0156i.f2913q = new ArrayList();
        c0156i.f2914r = new ArrayList();
        this.f1965J = c0156i;
        this.f1966K = 0;
        this.f1967L = -1;
        this.f1977V = Float.MIN_VALUE;
        this.f1978W = Float.MIN_VALUE;
        this.f1980a0 = true;
        this.f1982b0 = new Y(this);
        this.f1985d0 = C0 ? new C0160m() : null;
        V v2 = new V();
        v2.f2812a = -1;
        v2.f2813b = 0;
        v2.f2814c = 0;
        v2.d = 1;
        v2.f2815e = 0;
        v2.f2816f = false;
        v2.f2817g = false;
        v2.h = false;
        v2.i = false;
        v2.f2818j = false;
        v2.f2819k = false;
        this.f1987e0 = v2;
        this.f1992h0 = false;
        this.f1993i0 = false;
        C0172z c0172z = new C0172z(this);
        this.f1995j0 = c0172z;
        this.f1997k0 = false;
        this.f2001m0 = new int[2];
        this.f2004o0 = new int[2];
        this.f2006p0 = new int[2];
        this.f2008q0 = new int[2];
        this.r0 = new ArrayList();
        this.f2011s0 = new A1.e(9, this);
        this.f2015u0 = 0;
        this.f2017v0 = 0;
        this.f2019w0 = new C0172z(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1973R = viewConfiguration.getScaledTouchSlop();
        this.f1977V = K.U.a(viewConfiguration);
        this.f1978W = K.U.b(viewConfiguration);
        this.f1975T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1976U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1979a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1965J.f2767a = c0172z;
        this.f1986e = new e(new C0172z(this));
        this.f1988f = new C0149b(new C0172z(this));
        WeakHashMap weakHashMap = T.f633a;
        if (J.c(this) == 0) {
            J.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2022z = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new b0(this));
        int[] iArr = AbstractC0112a.f2582a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        T.k(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(AbstractC0001b.e(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c2 = 2;
            new C0159l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0139I.class);
                    try {
                        constructor = asSubclass.getConstructor(f1951D0);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        z2 = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[c2] = Integer.valueOf(i);
                            objArr2[3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                objArr = null;
                                constructor = asSubclass.getConstructor(null);
                                constructor.setAccessible(z2);
                                setLayoutManager((AbstractC0139I) constructor.newInstance(objArr));
                                int[] iArr2 = f1956z0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                                T.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
                                boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z3);
                                setTag(com.luckycounter.drinkwater.R.id.is_pooling_container_tag, Boolean.TRUE);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                            }
                        }
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        z2 = true;
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((AbstractC0139I) constructor.newInstance(objArr));
                    int[] iArr22 = f1956z0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    T.k(this, context, iArr22, attributeSet, obtainStyledAttributes22, i);
                    boolean z32 = obtainStyledAttributes22.getBoolean(0, z2);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z32);
                    setTag(com.luckycounter.drinkwater.R.id.is_pooling_container_tag, Boolean.TRUE);
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                }
            }
        }
        z2 = true;
        int[] iArr222 = f1956z0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        T.k(this, context, iArr222, attributeSet, obtainStyledAttributes222, i);
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
        setTag(com.luckycounter.drinkwater.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0139I abstractC0139I = this.f2000m;
        if (abstractC0139I != null) {
            return abstractC0139I.t(layoutParams);
        }
        throw new IllegalStateException(AbstractC0001b.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}

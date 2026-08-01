package androidx.recyclerview.widget;

import A.c;
import B.j;
import G.h;
import H.e;
import K.C0016o;
import K.H;
import K.T;
import K.r;
import Q.b;
import R.a;
import T.d;
import U.g;
import V0.f;
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
import f0.AbstractC0091a;
import g0.AbstractC0109A;
import g0.C0112a;
import g0.C0114c;
import g0.C0121j;
import g0.C0124m;
import g0.C0125n;
import g0.C0133w;
import g0.C0135y;
import g0.C0136z;
import g0.D;
import g0.E;
import g0.F;
import g0.I;
import g0.InterfaceC0111C;
import g0.J;
import g0.K;
import g0.L;
import g0.M;
import g0.N;
import g0.O;
import g0.P;
import g0.Q;
import g0.RunnableC0127p;
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
import q.AbstractC0321e;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: D0, reason: collision with root package name */
    public static final Class[] f1573D0;
    public static final d E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final W f1574F0;

    /* renamed from: x0, reason: collision with root package name */
    public static boolean f1575x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public static boolean f1576y0 = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f1578A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1579B;

    /* renamed from: C, reason: collision with root package name */
    public int f1580C;

    /* renamed from: D, reason: collision with root package name */
    public int f1581D;

    /* renamed from: E, reason: collision with root package name */
    public D f1582E;
    public EdgeEffect F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1583G;

    /* renamed from: H, reason: collision with root package name */
    public EdgeEffect f1584H;

    /* renamed from: I, reason: collision with root package name */
    public EdgeEffect f1585I;

    /* renamed from: J, reason: collision with root package name */
    public E f1586J;

    /* renamed from: K, reason: collision with root package name */
    public int f1587K;

    /* renamed from: L, reason: collision with root package name */
    public int f1588L;

    /* renamed from: M, reason: collision with root package name */
    public VelocityTracker f1589M;

    /* renamed from: N, reason: collision with root package name */
    public int f1590N;

    /* renamed from: O, reason: collision with root package name */
    public int f1591O;

    /* renamed from: P, reason: collision with root package name */
    public int f1592P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1593Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1594R;

    /* renamed from: S, reason: collision with root package name */
    public K f1595S;

    /* renamed from: T, reason: collision with root package name */
    public final int f1596T;

    /* renamed from: U, reason: collision with root package name */
    public final int f1597U;

    /* renamed from: V, reason: collision with root package name */
    public final float f1598V;

    /* renamed from: W, reason: collision with root package name */
    public final float f1599W;

    /* renamed from: a, reason: collision with root package name */
    public final float f1600a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1601a0;

    /* renamed from: b, reason: collision with root package name */
    public final Q f1602b;

    /* renamed from: b0, reason: collision with root package name */
    public final Y f1603b0;

    /* renamed from: c, reason: collision with root package name */
    public final O f1604c;

    /* renamed from: c0, reason: collision with root package name */
    public RunnableC0127p f1605c0;
    public S d;

    /* renamed from: d0, reason: collision with root package name */
    public final C0125n f1606d0;

    /* renamed from: e, reason: collision with root package name */
    public final e f1607e;

    /* renamed from: e0, reason: collision with root package name */
    public final V f1608e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0114c f1609f;

    /* renamed from: f0, reason: collision with root package name */
    public L f1610f0;

    /* renamed from: g, reason: collision with root package name */
    public final j f1611g;

    /* renamed from: g0, reason: collision with root package name */
    public ArrayList f1612g0;
    public boolean h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1613h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1614i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f1615j;

    /* renamed from: j0, reason: collision with root package name */
    public final C0136z f1616j0;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f1617k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1618k0;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0109A f1619l;

    /* renamed from: l0, reason: collision with root package name */
    public b0 f1620l0;

    /* renamed from: m, reason: collision with root package name */
    public I f1621m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f1622m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1623n;
    public C0016o n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1624o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1625o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1626p;

    /* renamed from: p0, reason: collision with root package name */
    public final int[] f1627p0;

    /* renamed from: q, reason: collision with root package name */
    public C0124m f1628q;

    /* renamed from: q0, reason: collision with root package name */
    public final int[] f1629q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1630r;
    public final ArrayList r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1631s;

    /* renamed from: s0, reason: collision with root package name */
    public final b f1632s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1633t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f1634t0;

    /* renamed from: u, reason: collision with root package name */
    public int f1635u;

    /* renamed from: u0, reason: collision with root package name */
    public int f1636u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1637v;

    /* renamed from: v0, reason: collision with root package name */
    public int f1638v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1639w;

    /* renamed from: w0, reason: collision with root package name */
    public final C0136z f1640w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1641x;

    /* renamed from: y, reason: collision with root package name */
    public int f1642y;

    /* renamed from: z, reason: collision with root package name */
    public final AccessibilityManager f1643z;

    /* renamed from: z0, reason: collision with root package name */
    public static final int[] f1577z0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: A0, reason: collision with root package name */
    public static final float f1570A0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: B0, reason: collision with root package name */
    public static final boolean f1571B0 = true;

    /* renamed from: C0, reason: collision with root package name */
    public static final boolean f1572C0 = true;

    static {
        Class cls = Integer.TYPE;
        f1573D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        E0 = new d(1);
        f1574F0 = new W();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.football.transfertrivia.R.attr.recyclerViewStyle);
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
        return ((J) view.getLayoutParams()).f2351a;
    }

    private C0016o getScrollingChildHelper() {
        if (this.n0 == null) {
            this.n0 = new C0016o(this);
        }
        return this.n0;
    }

    public static void l(Z z2) {
        WeakReference weakReference = z2.f2393b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == z2.f2392a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            z2.f2393b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && c.J(edgeEffect) != f1570A0) {
            int round = Math.round(c.l0(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || c.J(edgeEffect2) == f1570A0) {
            return i;
        }
        float f2 = i2;
        int round2 = Math.round(c.l0(edgeEffect2, (i * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z2) {
        f1575x0 = z2;
    }

    public static void setVerboseLoggingEnabled(boolean z2) {
        f1576y0 = z2;
    }

    public final void A() {
        if (this.f1583G != null) {
            return;
        }
        ((W) this.f1582E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1583G = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.f1619l + ", layout:" + this.f1621m + ", context:" + getContext();
    }

    public final void C(V v2) {
        if (getScrollState() != 2) {
            v2.getClass();
            return;
        }
        OverScroller overScroller = this.f1603b0.f2387c;
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
        ArrayList arrayList = this.f1626p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0124m c0124m = (C0124m) arrayList.get(i);
            int i2 = c0124m.f2511v;
            if (i2 == 1) {
                boolean d = c0124m.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0124m.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0124m.f2512w = 1;
                        c0124m.f2505p = (int) motionEvent.getX();
                    } else if (d) {
                        c0124m.f2512w = 2;
                        c0124m.f2502m = (int) motionEvent.getY();
                    }
                    c0124m.f(2);
                    if (action == 3) {
                        this.f1628q = c0124m;
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
        int e2 = this.f1609f.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e2; i3++) {
            Z L2 = L(this.f1609f.d(i3));
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
        if (this.f1578A) {
            return null;
        }
        int h = this.f1609f.h();
        for (int i2 = 0; i2 < h; i2++) {
            Z L2 = L(this.f1609f.g(i2));
            if (L2 != null && !L2.i() && I(L2) == i) {
                if (!this.f1609f.f2417c.contains(L2.f2392a)) {
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
        e eVar = this.f1607e;
        int i = z2.f2394c;
        ArrayList arrayList = (ArrayList) eVar.f221c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0112a c0112a = (C0112a) arrayList.get(i2);
            int i3 = c0112a.f2408a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0112a.f2409b;
                    if (i4 <= i) {
                        int i5 = c0112a.f2410c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0112a.f2409b;
                    if (i6 == i) {
                        i = c0112a.f2410c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0112a.f2410c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0112a.f2409b <= i) {
                i += c0112a.f2410c;
            }
        }
        return i;
    }

    public final long J(Z z2) {
        return this.f1619l.f2327b ? z2.f2395e : z2.f2394c;
    }

    public final Z K(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return L(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect M(View view) {
        J j2 = (J) view.getLayoutParams();
        boolean z2 = j2.f2353c;
        Rect rect = j2.f2352b;
        if (!z2) {
            return rect;
        }
        if (this.f1608e0.f2379g && (j2.f2351a.l() || j2.f2351a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1624o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.i;
            rect2.set(0, 0, 0, 0);
            ((F) arrayList.get(i)).getClass();
            ((J) view.getLayoutParams()).f2351a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        j2.f2353c = false;
        return rect;
    }

    public final boolean N() {
        return !this.f1633t || this.f1578A || this.f1607e.f();
    }

    public final boolean O() {
        return this.f1580C > 0;
    }

    public final void P(int i) {
        if (this.f1621m == null) {
            return;
        }
        setScrollState(2);
        this.f1621m.p0(i);
        awakenScrollBars();
    }

    public final void Q() {
        int h = this.f1609f.h();
        for (int i = 0; i < h; i++) {
            ((J) this.f1609f.g(i).getLayoutParams()).f2353c = true;
        }
        ArrayList arrayList = this.f1604c.f2362c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            J j2 = (J) ((Z) arrayList.get(i2)).f2392a.getLayoutParams();
            if (j2 != null) {
                j2.f2353c = true;
            }
        }
    }

    public final void R(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int h = this.f1609f.h();
        for (int i4 = 0; i4 < h; i4++) {
            Z L2 = L(this.f1609f.g(i4));
            if (L2 != null && !L2.p()) {
                int i5 = L2.f2394c;
                V v2 = this.f1608e0;
                if (i5 >= i3) {
                    if (f1576y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now at position " + (L2.f2394c - i2));
                    }
                    L2.m(-i2, z2);
                    v2.f2378f = true;
                } else if (i5 >= i) {
                    if (f1576y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + L2 + " now REMOVED");
                    }
                    L2.a(8);
                    L2.m(-i2, z2);
                    L2.f2394c = i - 1;
                    v2.f2378f = true;
                }
            }
        }
        O o2 = this.f1604c;
        ArrayList arrayList = o2.f2362c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Z z3 = (Z) arrayList.get(size);
            if (z3 != null) {
                int i6 = z3.f2394c;
                if (i6 >= i3) {
                    if (f1576y0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + z3 + " now at position " + (z3.f2394c - i2));
                    }
                    z3.m(-i2, z2);
                } else if (i6 >= i) {
                    z3.a(8);
                    o2.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void S() {
        this.f1580C++;
    }

    public final void T(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1580C - 1;
        this.f1580C = i2;
        if (i2 < 1) {
            if (f1575x0 && i2 < 0) {
                throw new IllegalStateException(Y.V.e(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f1580C = 0;
            if (z2) {
                int i3 = this.f1642y;
                this.f1642y = 0;
                if (i3 != 0 && (accessibilityManager = this.f1643z) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.r0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Z z3 = (Z) arrayList.get(size);
                    if (z3.f2392a.getParent() == this && !z3.p() && (i = z3.f2405q) != -1) {
                        WeakHashMap weakHashMap = T.f372a;
                        z3.f2392a.setImportantForAccessibility(i);
                        z3.f2405q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1588L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1588L = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1592P = x2;
            this.f1590N = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1593Q = y2;
            this.f1591O = y2;
        }
    }

    public final void V() {
        if (this.f1618k0 || !this.f1630r) {
            return;
        }
        WeakHashMap weakHashMap = T.f372a;
        postOnAnimation(this.f1632s0);
        this.f1618k0 = true;
    }

    public final void W(boolean z2) {
        this.f1579B = z2 | this.f1579B;
        this.f1578A = true;
        int h = this.f1609f.h();
        for (int i = 0; i < h; i++) {
            Z L2 = L(this.f1609f.g(i));
            if (L2 != null && !L2.p()) {
                L2.a(6);
            }
        }
        Q();
        O o2 = this.f1604c;
        ArrayList arrayList = o2.f2362c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Z z3 = (Z) arrayList.get(i2);
            if (z3 != null) {
                z3.a(6);
                z3.a(1024);
            }
        }
        AbstractC0109A abstractC0109A = o2.h.f1619l;
        if (abstractC0109A == null || !abstractC0109A.f2327b) {
            o2.f();
        }
    }

    public final void X(Z z2, r rVar) {
        z2.f2398j &= -8193;
        boolean z3 = this.f1608e0.h;
        j jVar = this.f1611g;
        if (z3 && z2.l() && !z2.i() && !z2.p()) {
            ((o.e) jVar.f57c).d(J(z2), z2);
        }
        k kVar = (k) jVar.f56b;
        j0 j0Var = (j0) kVar.getOrDefault(z2, null);
        if (j0Var == null) {
            j0Var = j0.a();
            kVar.put(z2, j0Var);
        }
        j0Var.f2484b = rVar;
        j0Var.f2483a |= 4;
    }

    public final int Y(int i, float f2) {
        float height = f2 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.F;
        float f3 = f1570A0;
        if (edgeEffect == null || c.J(edgeEffect) == f1570A0) {
            EdgeEffect edgeEffect2 = this.f1584H;
            if (edgeEffect2 != null && c.J(edgeEffect2) != f1570A0) {
                if (canScrollHorizontally(1)) {
                    this.f1584H.onRelease();
                } else {
                    float l02 = c.l0(this.f1584H, width, height);
                    if (c.J(this.f1584H) == f1570A0) {
                        this.f1584H.onRelease();
                    }
                    f3 = l02;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.F.onRelease();
            } else {
                float f4 = -c.l0(this.F, -width, 1.0f - height);
                if (c.J(this.F) == f1570A0) {
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
        EdgeEffect edgeEffect = this.f1583G;
        float f3 = f1570A0;
        if (edgeEffect == null || c.J(edgeEffect) == f1570A0) {
            EdgeEffect edgeEffect2 = this.f1585I;
            if (edgeEffect2 != null && c.J(edgeEffect2) != f1570A0) {
                if (canScrollVertically(1)) {
                    this.f1585I.onRelease();
                } else {
                    float l02 = c.l0(this.f1585I, height, 1.0f - width);
                    if (c.J(this.f1585I) == f1570A0) {
                        this.f1585I.onRelease();
                    }
                    f3 = l02;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f1583G.onRelease();
            } else {
                float f4 = -c.l0(this.f1583G, -height, width);
                if (c.J(this.f1583G) == f1570A0) {
                    this.f1583G.onRelease();
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
        if (layoutParams instanceof J) {
            J j2 = (J) layoutParams;
            if (!j2.f2353c) {
                int i = rect.left;
                Rect rect2 = j2.f2352b;
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
        this.f1621m.m0(this, view, this.i, !this.f1633t, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        I i3 = this.f1621m;
        if (i3 != null) {
            i3.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0() {
        VelocityTracker velocityTracker = this.f1589M;
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
        EdgeEffect edgeEffect2 = this.f1583G;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1583G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1584H;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1584H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1585I;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1585I.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = T.f372a;
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
        AbstractC0109A abstractC0109A = this.f1619l;
        int[] iArr = this.f1629q0;
        if (abstractC0109A != null) {
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
        if (!this.f1624o.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.f1625o0, i3, iArr);
        int i10 = iArr[0];
        int i11 = i6 - i10;
        int i12 = iArr[1];
        int i13 = i7 - i12;
        boolean z3 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.f1592P;
        int[] iArr2 = this.f1625o0;
        int i15 = iArr2[0];
        this.f1592P = i14 - i15;
        int i16 = this.f1593Q;
        int i17 = iArr2[1];
        this.f1593Q = i16 - i17;
        int[] iArr3 = this.f1627p0;
        iArr3[0] = iArr3[0] + i15;
        iArr3[1] = iArr3[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i11;
                float y2 = motionEvent.getY();
                float f3 = i13;
                if (f2 < f1570A0) {
                    y();
                    c.l0(this.F, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > f1570A0) {
                    z();
                    c.l0(this.f1584H, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= f1570A0) {
                        A();
                        c.l0(this.f1583G, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > f1570A0) {
                            x();
                            c.l0(this.f1585I, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != f1570A0 || f3 != f1570A0) {
                            WeakHashMap weakHashMap = T.f372a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = T.f372a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= f1570A0) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = T.f372a;
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
        return (layoutParams instanceof J) && this.f1621m.f((J) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        I i = this.f1621m;
        if (i != null && i.d()) {
            return this.f1621m.j(this.f1608e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        I i = this.f1621m;
        if (i != null && i.d()) {
            return this.f1621m.k(this.f1608e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        I i = this.f1621m;
        if (i != null && i.d()) {
            return this.f1621m.l(this.f1608e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        I i = this.f1621m;
        if (i != null && i.e()) {
            return this.f1621m.m(this.f1608e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        I i = this.f1621m;
        if (i != null && i.e()) {
            return this.f1621m.n(this.f1608e0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        I i = this.f1621m;
        if (i != null && i.e()) {
            return this.f1621m.o(this.f1608e0);
        }
        return 0;
    }

    public final void d0(int i, int i2, int[] iArr) {
        Z z2;
        C0114c c0114c = this.f1609f;
        h0();
        S();
        int i3 = h.f211a;
        Trace.beginSection("RV Scroll");
        V v2 = this.f1608e0;
        C(v2);
        O o2 = this.f1604c;
        int o02 = i != 0 ? this.f1621m.o0(i, o2, v2) : 0;
        int q02 = i2 != 0 ? this.f1621m.q0(i2, o2, v2) : 0;
        Trace.endSection();
        int e2 = c0114c.e();
        for (int i4 = 0; i4 < e2; i4++) {
            View d = c0114c.d(i4);
            Z K2 = K(d);
            if (K2 != null && (z2 = K2.i) != null) {
                int left = d.getLeft();
                int top = d.getTop();
                View view = z2.f2392a;
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
        ArrayList arrayList = this.f1624o;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((F) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, f1570A0);
            EdgeEffect edgeEffect2 = this.F;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1583G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1583G;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1584H;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1584H;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1585I;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1585I;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1586J == null || arrayList.size() <= 0 || !this.f1586J.f()) ? z2 : true) {
            WeakHashMap weakHashMap = T.f372a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i) {
        C0133w c0133w;
        if (this.f1639w) {
            return;
        }
        setScrollState(0);
        Y y2 = this.f1603b0;
        y2.f2390g.removeCallbacks(y2);
        y2.f2387c.abortAnimation();
        I i2 = this.f1621m;
        if (i2 != null && (c0133w = i2.f2342e) != null) {
            c0133w.i();
        }
        I i3 = this.f1621m;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            i3.p0(i);
            awakenScrollBars();
        }
    }

    public final boolean f0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float J2 = c.J(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f1600a * 0.015f;
        double log = Math.log(abs / f2);
        double d = f1570A0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f2))) < J2;
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
        this.f1621m.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1619l == null || this.f1621m == null || O() || this.f1639w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        V v2 = this.f1608e0;
        O o2 = this.f1604c;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1621m.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1621m.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1621m.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        p();
                        if (D(view) == null) {
                            return null;
                        }
                        h0();
                        this.f1621m.T(view, i, o2, v2);
                        i0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1621m.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
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
                view2 = this.f1621m.T(view, i, o2, v2);
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
                Rect rect2 = this.f1615j;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f1621m.C() == 1 ? -1 : 1;
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
                                        throw new IllegalArgumentException(Y.V.e(this, sb));
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
        I i3 = this.f1621m;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1639w) {
            return;
        }
        if (!i3.d()) {
            i = 0;
        }
        if (!this.f1621m.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z2) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().g(i4, 1);
        }
        this.f1603b0.c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        I i = this.f1621m;
        if (i != null) {
            return i.r();
        }
        throw new IllegalStateException(Y.V.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        I i = this.f1621m;
        if (i != null) {
            return i.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(Y.V.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0109A getAdapter() {
        return this.f1619l;
    }

    @Override // android.view.View
    public int getBaseline() {
        I i = this.f1621m;
        if (i == null) {
            return super.getBaseline();
        }
        i.getClass();
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
        return this.f1620l0;
    }

    public D getEdgeEffectFactory() {
        return this.f1582E;
    }

    public E getItemAnimator() {
        return this.f1586J;
    }

    public int getItemDecorationCount() {
        return this.f1624o.size();
    }

    public I getLayoutManager() {
        return this.f1621m;
    }

    public int getMaxFlingVelocity() {
        return this.f1597U;
    }

    public int getMinFlingVelocity() {
        return this.f1596T;
    }

    public long getNanoTime() {
        if (f1572C0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public K getOnFlingListener() {
        return this.f1595S;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1601a0;
    }

    public N getRecycledViewPool() {
        return this.f1604c.c();
    }

    public int getScrollState() {
        return this.f1587K;
    }

    public final void h(Z z2) {
        View view = z2.f2392a;
        boolean z3 = view.getParent() == this;
        this.f1604c.l(K(view));
        if (z2.k()) {
            this.f1609f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f1609f.a(view, -1, true);
            return;
        }
        C0114c c0114c = this.f1609f;
        int indexOfChild = c0114c.f2415a.f2571a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0114c.f2416b.h(indexOfChild);
            c0114c.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0() {
        int i = this.f1635u + 1;
        this.f1635u = i;
        if (i != 1 || this.f1639w) {
            return;
        }
        this.f1637v = false;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(F f2) {
        I i = this.f1621m;
        if (i != null) {
            i.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1624o;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(f2);
        Q();
        requestLayout();
    }

    public final void i0(boolean z2) {
        if (this.f1635u < 1) {
            if (f1575x0) {
                throw new IllegalStateException(Y.V.e(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.f1635u = 1;
        }
        if (!z2 && !this.f1639w) {
            this.f1637v = false;
        }
        if (this.f1635u == 1) {
            if (z2 && this.f1637v && !this.f1639w && this.f1621m != null && this.f1619l != null) {
                r();
            }
            if (!this.f1639w) {
                this.f1637v = false;
            }
        }
        this.f1635u--;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1630r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1639w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(L l2) {
        if (this.f1612g0 == null) {
            this.f1612g0 = new ArrayList();
        }
        this.f1612g0.add(l2);
    }

    public final void j0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void k(String str) {
        if (O()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(Y.V.e(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.f1581D > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(Y.V.e(this, new StringBuilder(""))));
        }
    }

    public final void m() {
        int h = this.f1609f.h();
        for (int i = 0; i < h; i++) {
            Z L2 = L(this.f1609f.g(i));
            if (!L2.p()) {
                L2.d = -1;
                L2.f2397g = -1;
            }
        }
        O o2 = this.f1604c;
        ArrayList arrayList = o2.f2362c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Z z2 = (Z) arrayList.get(i2);
            z2.d = -1;
            z2.f2397g = -1;
        }
        ArrayList arrayList2 = o2.f2360a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Z z3 = (Z) arrayList2.get(i3);
            z3.d = -1;
            z3.f2397g = -1;
        }
        ArrayList arrayList3 = o2.f2361b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                Z z4 = (Z) o2.f2361b.get(i4);
                z4.d = -1;
                z4.f2397g = -1;
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
        EdgeEffect edgeEffect2 = this.f1584H;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f1584H.onRelease();
            z2 |= this.f1584H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1583G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1583G.onRelease();
            z2 |= this.f1583G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1585I;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1585I.onRelease();
            z2 |= this.f1585I.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = T.f372a;
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
        this.f1580C = 0;
        this.f1630r = true;
        this.f1633t = this.f1633t && !isLayoutRequested();
        this.f1604c.d();
        I i = this.f1621m;
        if (i != null) {
            i.f2344g = true;
            i.R(this);
        }
        this.f1618k0 = false;
        if (f1572C0) {
            ThreadLocal threadLocal = RunnableC0127p.f2523e;
            RunnableC0127p runnableC0127p = (RunnableC0127p) threadLocal.get();
            this.f1605c0 = runnableC0127p;
            if (runnableC0127p == null) {
                RunnableC0127p runnableC0127p2 = new RunnableC0127p();
                runnableC0127p2.f2525a = new ArrayList();
                runnableC0127p2.d = new ArrayList();
                this.f1605c0 = runnableC0127p2;
                WeakHashMap weakHashMap = T.f372a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f2 = display.getRefreshRate();
                }
                f2 = 60.0f;
                RunnableC0127p runnableC0127p3 = this.f1605c0;
                runnableC0127p3.f2527c = (long) (1.0E9f / f2);
                threadLocal.set(runnableC0127p3);
            }
            RunnableC0127p runnableC0127p4 = this.f1605c0;
            runnableC0127p4.getClass();
            boolean z2 = f1575x0;
            ArrayList arrayList = runnableC0127p4.f2525a;
            if (z2 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        O o2;
        RunnableC0127p runnableC0127p;
        C0133w c0133w;
        super.onDetachedFromWindow();
        E e2 = this.f1586J;
        if (e2 != null) {
            e2.e();
        }
        int i = 0;
        setScrollState(0);
        Y y2 = this.f1603b0;
        y2.f2390g.removeCallbacks(y2);
        y2.f2387c.abortAnimation();
        I i2 = this.f1621m;
        if (i2 != null && (c0133w = i2.f2342e) != null) {
            c0133w.i();
        }
        this.f1630r = false;
        I i3 = this.f1621m;
        if (i3 != null) {
            i3.f2344g = false;
            i3.S(this);
        }
        this.r0.clear();
        removeCallbacks(this.f1632s0);
        this.f1611g.getClass();
        while (j0.d.a() != null) {
        }
        int i4 = 0;
        while (true) {
            o2 = this.f1604c;
            ArrayList arrayList = o2.f2362c;
            if (i4 >= arrayList.size()) {
                break;
            }
            c.i(((Z) arrayList.get(i4)).f2392a);
            i4++;
        }
        o2.e(o2.h.f1619l, false);
        while (i < getChildCount()) {
            int i5 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            a aVar = (a) childAt.getTag(com.football.transfertrivia.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new a();
                childAt.setTag(com.football.transfertrivia.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f650a;
            int Z2 = f.Z(arrayList2);
            if (-1 < Z2) {
                arrayList2.get(Z2).getClass();
                throw new ClassCastException();
            }
            i = i5;
        }
        if (!f1572C0 || (runnableC0127p = this.f1605c0) == null) {
            return;
        }
        boolean remove = runnableC0127p.f2525a.remove(this);
        if (f1575x0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1605c0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1624o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((F) arrayList.get(i)).a(this);
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
        I i;
        if (this.f1621m != null && !this.f1639w && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1621m.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1621m.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == f1570A0 || f3 != f1570A0) {
                        int i2 = (int) (f3 * this.f1598V);
                        int i3 = (int) (f2 * this.f1599W);
                        i = this.f1621m;
                        if (i == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f1639w) {
                            int[] iArr = this.f1629q0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean d = i.d();
                            boolean e2 = this.f1621m.e();
                            int i4 = e2 ? (d ? 1 : 0) | 2 : d ? 1 : 0;
                            float y2 = motionEvent.getY();
                            float x2 = motionEvent.getX();
                            int Y2 = i2 - Y(i2, y2);
                            int Z2 = i3 - Z(i3, x2);
                            getScrollingChildHelper().g(i4, 1);
                            if (u(d ? Y2 : 0, e2 ? Z2 : 0, this.f1629q0, this.f1625o0, 1)) {
                                Y2 -= iArr[0];
                                Z2 -= iArr[1];
                            }
                            c0(d ? Y2 : 0, e2 ? Z2 : 0, motionEvent, 1);
                            RunnableC0127p runnableC0127p = this.f1605c0;
                            if (runnableC0127p != null && (Y2 != 0 || Z2 != 0)) {
                                runnableC0127p.a(this, Y2, Z2);
                            }
                            j0(1);
                        }
                    }
                }
                f3 = 0.0f;
                if (f2 == f1570A0) {
                }
                int i22 = (int) (f3 * this.f1598V);
                int i32 = (int) (f2 * this.f1599W);
                i = this.f1621m;
                if (i == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1621m.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == f1570A0) {
                        }
                        int i222 = (int) (f3 * this.f1598V);
                        int i322 = (int) (f2 * this.f1599W);
                        i = this.f1621m;
                        if (i == null) {
                        }
                    } else if (this.f1621m.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == f1570A0) {
                        }
                        int i2222 = (int) (f3 * this.f1598V);
                        int i3222 = (int) (f2 * this.f1599W);
                        i = this.f1621m;
                        if (i == null) {
                        }
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == f1570A0) {
                }
                int i22222 = (int) (f3 * this.f1598V);
                int i32222 = (int) (f2 * this.f1599W);
                i = this.f1621m;
                if (i == null) {
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
        if (this.f1639w) {
            return false;
        }
        this.f1628q = null;
        if (E(motionEvent)) {
            b0();
            setScrollState(0);
            return true;
        }
        I i = this.f1621m;
        if (i == null) {
            return false;
        }
        boolean d = i.d();
        boolean e2 = this.f1621m.e();
        if (this.f1589M == null) {
            this.f1589M = VelocityTracker.obtain();
        }
        this.f1589M.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1641x) {
                this.f1641x = false;
            }
            this.f1588L = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1592P = x2;
            this.f1590N = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1593Q = y2;
            this.f1591O = y2;
            EdgeEffect edgeEffect = this.F;
            if (edgeEffect == null || c.J(edgeEffect) == f1570A0 || canScrollHorizontally(-1)) {
                z2 = false;
            } else {
                c.l0(this.F, f1570A0, 1.0f - (motionEvent.getY() / getHeight()));
                z2 = true;
            }
            EdgeEffect edgeEffect2 = this.f1584H;
            boolean z4 = z2;
            if (edgeEffect2 != null) {
                z4 = z2;
                if (c.J(edgeEffect2) != f1570A0) {
                    z4 = z2;
                    if (!canScrollHorizontally(1)) {
                        c.l0(this.f1584H, f1570A0, motionEvent.getY() / getHeight());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f1583G;
            boolean z5 = z4;
            if (edgeEffect3 != null) {
                z5 = z4;
                if (c.J(edgeEffect3) != f1570A0) {
                    z5 = z4;
                    if (!canScrollVertically(-1)) {
                        c.l0(this.f1583G, f1570A0, motionEvent.getX() / getWidth());
                        z5 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f1585I;
            boolean z6 = z5;
            if (edgeEffect4 != null) {
                z6 = z5;
                if (c.J(edgeEffect4) != f1570A0) {
                    z6 = z5;
                    if (!canScrollVertically(1)) {
                        c.l0(this.f1585I, f1570A0, 1.0f - (motionEvent.getX() / getWidth()));
                        z6 = true;
                    }
                }
            }
            if (z6 || this.f1587K == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                j0(1);
            }
            int[] iArr = this.f1627p0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = d;
            if (e2) {
                i2 = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i2, 0);
        } else if (actionMasked == 1) {
            this.f1589M.clear();
            j0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1588L);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1588L + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1587K != 1) {
                int i3 = x3 - this.f1590N;
                int i4 = y3 - this.f1591O;
                if (d == 0 || Math.abs(i3) <= this.f1594R) {
                    z3 = false;
                } else {
                    this.f1592P = x3;
                    z3 = true;
                }
                if (e2 && Math.abs(i4) > this.f1594R) {
                    this.f1593Q = y3;
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
            this.f1588L = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1592P = x4;
            this.f1590N = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1593Q = y4;
            this.f1591O = y4;
        } else if (actionMasked == 6) {
            U(motionEvent);
        }
        return this.f1587K == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f211a;
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.f1633t = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        I i3 = this.f1621m;
        if (i3 == null) {
            q(i, i2);
            return;
        }
        boolean L2 = i3.L();
        boolean z2 = false;
        V v2 = this.f1608e0;
        if (!L2) {
            if (this.f1631s) {
                this.f1621m.f2340b.q(i, i2);
                return;
            }
            if (v2.f2381k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0109A abstractC0109A = this.f1619l;
            if (abstractC0109A != null) {
                v2.f2377e = abstractC0109A.a();
            } else {
                v2.f2377e = 0;
            }
            h0();
            this.f1621m.f2340b.q(i, i2);
            i0(false);
            v2.f2379g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1621m.f2340b.q(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z2 = true;
        }
        this.f1634t0 = z2;
        if (z2 || this.f1619l == null) {
            return;
        }
        if (v2.d == 1) {
            s();
        }
        this.f1621m.s0(i, i2);
        v2.i = true;
        t();
        this.f1621m.u0(i, i2);
        if (this.f1621m.x0()) {
            this.f1621m.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            v2.i = true;
            t();
            this.f1621m.u0(i, i2);
        }
        this.f1636u0 = getMeasuredWidth();
        this.f1638v0 = getMeasuredHeight();
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
        super.onRestoreInstanceState(s2.f771a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        S s2 = new S(super.onSaveInstanceState());
        S s3 = this.d;
        if (s3 != null) {
            s2.f2367c = s3.f2367c;
        } else {
            I i = this.f1621m;
            if (i != null) {
                s2.f2367c = i.g0();
            } else {
                s2.f2367c = null;
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
        this.f1585I = null;
        this.f1583G = null;
        this.f1584H = null;
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
        if (this.f1639w || this.f1641x) {
            return false;
        }
        C0124m c0124m = this.f1628q;
        if (c0124m == null) {
            z2 = motionEvent.getAction() == 0 ? false : E(motionEvent);
        } else {
            if (c0124m.f2511v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0124m.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0124m.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0124m.f2512w = 1;
                            c0124m.f2505p = (int) motionEvent.getX();
                        } else if (d) {
                            c0124m.f2512w = 2;
                            c0124m.f2502m = (int) motionEvent.getY();
                        }
                        c0124m.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0124m.f2511v == 2) {
                    c0124m.f2502m = f1570A0;
                    c0124m.f2505p = f1570A0;
                    c0124m.f(1);
                    c0124m.f2512w = 0;
                } else if (motionEvent.getAction() == 2 && c0124m.f2511v == 2) {
                    c0124m.g();
                    int i4 = c0124m.f2512w;
                    int i5 = c0124m.f2494b;
                    if (i4 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0124m.f2514y;
                        iArr[0] = i5;
                        int i6 = c0124m.f2506q - i5;
                        iArr[1] = i6;
                        float max = Math.max(i5, Math.min(i6, x2));
                        if (Math.abs(c0124m.f2504o - max) >= 2.0f) {
                            int e2 = C0124m.e(c0124m.f2505p, max, iArr, c0124m.f2508s.computeHorizontalScrollRange(), c0124m.f2508s.computeHorizontalScrollOffset(), c0124m.f2506q);
                            if (e2 != 0) {
                                c0124m.f2508s.scrollBy(e2, 0);
                            }
                            c0124m.f2505p = max;
                        }
                    }
                    if (c0124m.f2512w == 2) {
                        float y5 = motionEvent.getY();
                        int[] iArr2 = c0124m.f2513x;
                        iArr2[0] = i5;
                        int i7 = c0124m.f2507r - i5;
                        iArr2[1] = i7;
                        float max2 = Math.max(i5, Math.min(i7, y5));
                        if (Math.abs(c0124m.f2501l - max2) >= 2.0f) {
                            int e3 = C0124m.e(c0124m.f2502m, max2, iArr2, c0124m.f2508s.computeVerticalScrollRange(), c0124m.f2508s.computeVerticalScrollOffset(), c0124m.f2507r);
                            if (e3 != 0) {
                                c0124m.f2508s.scrollBy(0, e3);
                            }
                            c0124m.f2502m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1628q = null;
            }
            z2 = true;
        }
        if (z2) {
            b0();
            setScrollState(0);
            return true;
        }
        I i8 = this.f1621m;
        if (i8 == null) {
            return false;
        }
        boolean d2 = i8.d();
        boolean e4 = this.f1621m.e();
        if (this.f1589M == null) {
            this.f1589M = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1627p0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1588L = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1592P = x3;
            recyclerView.f1590N = x3;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1593Q = y6;
            recyclerView.f1591O = y6;
            int i9 = d2;
            if (e4) {
                i9 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i9, 0);
        } else {
            if (actionMasked == 1) {
                this.f1589M.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1589M;
                int i10 = this.f1597U;
                velocityTracker.computeCurrentVelocity(1000, i10);
                float f4 = d2 != 0 ? -this.f1589M.getXVelocity(this.f1588L) : 0.0f;
                float f5 = e4 ? -this.f1589M.getYVelocity(this.f1588L) : 0.0f;
                if (f4 == f1570A0 && f5 == f1570A0) {
                    recyclerView2 = this;
                    i3 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i11 = (int) f4;
                    int i12 = (int) f5;
                    I i13 = this.f1621m;
                    if (i13 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1639w) {
                        int d3 = i13.d();
                        boolean e5 = this.f1621m.e();
                        int i14 = this.f1596T;
                        if (d3 == 0 || Math.abs(i11) < i14) {
                            i11 = 0;
                        }
                        if (!e5 || Math.abs(i12) < i14) {
                            i12 = 0;
                        }
                        if (i11 != 0 || i12 != 0) {
                            if (i11 != 0) {
                                EdgeEffect edgeEffect = this.F;
                                if (edgeEffect == null || c.J(edgeEffect) == f1570A0) {
                                    EdgeEffect edgeEffect2 = this.f1584H;
                                    if (edgeEffect2 != null && c.J(edgeEffect2) != f1570A0) {
                                        if (f0(this.f1584H, i11, getWidth())) {
                                            this.f1584H.onAbsorb(i11);
                                            i11 = 0;
                                        }
                                        i = i11;
                                        i11 = 0;
                                    }
                                } else {
                                    int i15 = -i11;
                                    if (f0(this.F, i15, getWidth())) {
                                        this.F.onAbsorb(i15);
                                        i11 = 0;
                                    }
                                    i = i11;
                                    i11 = 0;
                                }
                                if (i12 != 0) {
                                    EdgeEffect edgeEffect3 = this.f1583G;
                                    if (edgeEffect3 == null || c.J(edgeEffect3) == f1570A0) {
                                        EdgeEffect edgeEffect4 = this.f1585I;
                                        if (edgeEffect4 != null && c.J(edgeEffect4) != f1570A0) {
                                            if (f0(this.f1585I, i12, getHeight())) {
                                                this.f1585I.onAbsorb(i12);
                                                i12 = 0;
                                            }
                                            i2 = 0;
                                        }
                                    } else {
                                        int i16 = -i12;
                                        if (f0(this.f1583G, i16, getHeight())) {
                                            this.f1583G.onAbsorb(i16);
                                            i12 = 0;
                                        }
                                        i2 = 0;
                                    }
                                    y2 = this.f1603b0;
                                    if (i == 0 || i12 != 0) {
                                        int i17 = -i10;
                                        i = Math.max(i17, Math.min(i, i10));
                                        i12 = Math.max(i17, Math.min(i12, i10));
                                        y2.a(i, i12);
                                    }
                                    if (i11 == 0 || i2 != 0) {
                                        f2 = i11;
                                        f3 = i2;
                                        if (!dispatchNestedPreFling(f2, f3)) {
                                            boolean z5 = d3 != 0 || e5;
                                            dispatchNestedFling(f2, f3, z5);
                                            K k2 = this.f1595S;
                                            if (k2 != null) {
                                                C0135y c0135y = (C0135y) k2;
                                                I layoutManager = c0135y.f2568a.getLayoutManager();
                                                if (layoutManager != 0 && c0135y.f2568a.getAdapter() != null && ((Math.abs(i2) > (minFlingVelocity = c0135y.f2568a.getMinFlingVelocity()) || Math.abs(i11) > minFlingVelocity) && ((z3 = layoutManager instanceof U)))) {
                                                    B0.c cVar = !z3 ? null : new B0.c(c0135y, c0135y.f2568a.getContext(), 1);
                                                    if (cVar != null) {
                                                        int B2 = layoutManager.B();
                                                        if (B2 != 0) {
                                                            g e6 = layoutManager.e() ? c0135y.e(layoutManager) : layoutManager.d() ? c0135y.d(layoutManager) : null;
                                                            if (e6 != null) {
                                                                int v2 = layoutManager.v();
                                                                motionEvent4 = obtain;
                                                                int i18 = Integer.MIN_VALUE;
                                                                int i19 = Integer.MAX_VALUE;
                                                                int i20 = 0;
                                                                View view = null;
                                                                View view2 = null;
                                                                while (i20 < v2) {
                                                                    int i21 = v2;
                                                                    View u2 = layoutManager.u(i20);
                                                                    if (u2 == null) {
                                                                        y4 = y2;
                                                                    } else {
                                                                        y4 = y2;
                                                                        int b2 = C0135y.b(u2, e6);
                                                                        if (b2 <= 0 && b2 > i18) {
                                                                            view2 = u2;
                                                                            i18 = b2;
                                                                        }
                                                                        if (b2 >= 0 && b2 < i19) {
                                                                            view = u2;
                                                                            i19 = b2;
                                                                        }
                                                                    }
                                                                    i20++;
                                                                    v2 = i21;
                                                                    y2 = y4;
                                                                }
                                                                y3 = y2;
                                                                boolean z6 = !layoutManager.d() ? i2 <= 0 : i11 <= 0;
                                                                if (z6 && view != null) {
                                                                    H2 = I.H(view);
                                                                } else if (z6 || view2 == null) {
                                                                    if (z6) {
                                                                        view = view2;
                                                                    }
                                                                    if (view != null) {
                                                                        H2 = ((z3 && (a2 = ((U) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > f1570A0 ? 1 : (a2.x == f1570A0 ? 0 : -1)) < 0 || (a2.y > f1570A0 ? 1 : (a2.y == f1570A0 ? 0 : -1)) < 0)) == z6 ? -1 : 1) + I.H(view);
                                                                        if (H2 >= 0) {
                                                                        }
                                                                    }
                                                                    H2 = -1;
                                                                } else {
                                                                    H2 = I.H(view2);
                                                                }
                                                                if (H2 != -1) {
                                                                    cVar.f2555a = H2;
                                                                    layoutManager.A0(cVar);
                                                                }
                                                                if (z5) {
                                                                    if (e5) {
                                                                        d3 = (d3 == true ? 1 : 0) | 2;
                                                                    }
                                                                    getScrollingChildHelper().g(d3, 1);
                                                                    int i22 = -i10;
                                                                    y3.a(Math.max(i22, Math.min(i11, i10)), Math.max(i22, Math.min(i2, i10)));
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
                                    } else if (i != 0 || i12 != 0) {
                                        motionEvent4 = obtain;
                                    }
                                    b0();
                                    motionEvent3 = motionEvent4;
                                    motionEvent3.recycle();
                                    return true;
                                }
                                i2 = i12;
                                i12 = 0;
                                y2 = this.f1603b0;
                                if (i == 0) {
                                }
                                int i172 = -i10;
                                i = Math.max(i172, Math.min(i, i10));
                                i12 = Math.max(i172, Math.min(i12, i10));
                                y2.a(i, i12);
                                if (i11 == 0) {
                                }
                                f2 = i11;
                                f3 = i2;
                                if (!dispatchNestedPreFling(f2, f3)) {
                                }
                            }
                            i = 0;
                            if (i12 != 0) {
                            }
                            i2 = i12;
                            i12 = 0;
                            y2 = this.f1603b0;
                            if (i == 0) {
                            }
                            int i1722 = -i10;
                            i = Math.max(i1722, Math.min(i, i10));
                            i12 = Math.max(i1722, Math.min(i12, i10));
                            y2.a(i, i12);
                            if (i11 == 0) {
                            }
                            f2 = i11;
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
                int findPointerIndex = motionEvent.findPointerIndex(this.f1588L);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1588L + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y7 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i23 = this.f1592P - x4;
                int i24 = this.f1593Q - y7;
                if (this.f1587K != 1) {
                    if (d2 != 0) {
                        i23 = i23 > 0 ? Math.max(0, i23 - this.f1594R) : Math.min(0, i23 + this.f1594R);
                        if (i23 != 0) {
                            z4 = true;
                            if (e4) {
                                i24 = i24 > 0 ? Math.max(0, i24 - this.f1594R) : Math.min(0, i24 + this.f1594R);
                                if (i24 != 0) {
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
                if (this.f1587K == 1) {
                    int[] iArr4 = this.f1629q0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    int Y2 = i23 - Y(i23, motionEvent.getY());
                    int Z2 = i24 - Z(i24, motionEvent.getX());
                    boolean u3 = u(d2 != 0 ? Y2 : 0, e4 ? Z2 : 0, this.f1629q0, this.f1625o0, 0);
                    int[] iArr5 = this.f1625o0;
                    if (u3) {
                        Y2 -= iArr4[0];
                        Z2 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i25 = Y2;
                    int i26 = Z2;
                    this.f1592P = x4 - iArr5[0];
                    this.f1593Q = y7 - iArr5[1];
                    if (c0(d2 != 0 ? i25 : 0, e4 ? i26 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0127p runnableC0127p = this.f1605c0;
                    if (runnableC0127p != null && (i25 != 0 || i26 != 0)) {
                        runnableC0127p.a(this, i25, i26);
                    }
                }
            } else if (actionMasked == 3) {
                b0();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1588L = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1592P = x5;
                this.f1590N = x5;
                int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1593Q = y8;
                this.f1591O = y8;
            } else if (actionMasked == 6) {
                U(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1589M.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    public final void p() {
        e eVar = this.f1607e;
        if (!this.f1633t || this.f1578A) {
            int i = h.f211a;
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        if (eVar.f()) {
            eVar.getClass();
            if (eVar.f()) {
                int i2 = h.f211a;
                Trace.beginSection("RV FullInvalidate");
                r();
                Trace.endSection();
            }
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = T.f372a;
        setMeasuredDimension(I.g(i, paddingRight, getMinimumWidth()), I.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0332, code lost:
    
        if (r19.f1609f.f2417c.contains(getFocusedChild()) == false) goto L224;
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
        r rVar;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1619l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1621m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        V v2 = this.f1608e0;
        v2.i = false;
        boolean z3 = this.f1634t0 && !(this.f1636u0 == getWidth() && this.f1638v0 == getHeight());
        this.f1636u0 = 0;
        this.f1638v0 = 0;
        this.f1634t0 = false;
        if (v2.d == 1) {
            s();
            this.f1621m.r0(this);
            t();
        } else {
            e eVar = this.f1607e;
            if ((((ArrayList) eVar.d).isEmpty() || ((ArrayList) eVar.f221c).isEmpty()) && !z3 && this.f1621m.f2349n == getWidth() && this.f1621m.f2350o == getHeight()) {
                this.f1621m.r0(this);
            } else {
                this.f1621m.r0(this);
                t();
            }
        }
        v2.a(4);
        h0();
        S();
        v2.d = 1;
        boolean z4 = v2.f2380j;
        View view2 = null;
        Long l2 = null;
        O o2 = this.f1604c;
        j jVar = this.f1611g;
        if (z4) {
            int e2 = this.f1609f.e() - 1;
            while (e2 >= 0) {
                Z L2 = L(this.f1609f.d(e2));
                if (!L2.p()) {
                    long J2 = J(L2);
                    this.f1586J.getClass();
                    r rVar2 = new r();
                    rVar2.a(L2);
                    Z z5 = (Z) ((o.e) jVar.f57c).c(J2, l2);
                    if (z5 == null || z5.p()) {
                        jVar.e(L2, rVar2);
                    } else {
                        k kVar = (k) jVar.f56b;
                        j0 j0Var = (j0) kVar.getOrDefault(z5, l2);
                        boolean z6 = (j0Var == null || (j0Var.f2483a & 1) == 0) ? false : true;
                        j0 j0Var2 = (j0) kVar.getOrDefault(L2, l2);
                        boolean z7 = (j0Var2 == null || (j0Var2.f2483a & 1) == 0) ? false : true;
                        if (z6 && z5 == L2) {
                            jVar.e(L2, rVar2);
                        } else {
                            r H2 = jVar.H(z5, 4);
                            jVar.e(L2, rVar2);
                            r H3 = jVar.H(L2, 8);
                            if (H2 == null) {
                                int e3 = this.f1609f.e();
                                for (int i2 = 0; i2 < e3; i2++) {
                                    Z L3 = L(this.f1609f.d(i2));
                                    if (L3 != L2 && J(L3) == J2) {
                                        AbstractC0109A abstractC0109A = this.f1619l;
                                        if (abstractC0109A == null || !abstractC0109A.f2327b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(L3);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(L2);
                                            throw new IllegalStateException(Y.V.e(this, sb));
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(L3);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(L2);
                                        throw new IllegalStateException(Y.V.e(this, sb2));
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
                                    o2.l(z5);
                                    L2.o(false);
                                    L2.i = z5;
                                }
                                if (this.f1586J.a(z5, L2, H2, H3)) {
                                    V();
                                }
                            }
                        }
                    }
                }
                e2--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f56b;
            for (int i3 = kVar2.f3186c - 1; i3 >= 0; i3--) {
                Z z8 = (Z) kVar2.h(i3);
                j0 j0Var3 = (j0) kVar2.i(i3);
                int i4 = j0Var3.f2483a;
                int i5 = i4 & 3;
                C0136z c0136z = this.f1640w0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0136z.f2571a;
                    recyclerView2.f1621m.k0(z8.f2392a, recyclerView2.f1604c);
                } else if ((i4 & 1) != 0) {
                    r rVar3 = j0Var3.f2484b;
                    if (rVar3 == null) {
                        RecyclerView recyclerView3 = c0136z.f2571a;
                        recyclerView3.f1621m.k0(z8.f2392a, recyclerView3.f1604c);
                    } else {
                        c0136z.g(z8, rVar3, j0Var3.f2485c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0136z.f(z8, j0Var3.f2484b, j0Var3.f2485c);
                } else if ((i4 & 12) == 12) {
                    r rVar4 = j0Var3.f2484b;
                    r rVar5 = j0Var3.f2485c;
                    c0136z.getClass();
                    z8.o(false);
                    RecyclerView recyclerView4 = c0136z.f2571a;
                    if (!recyclerView4.f1578A) {
                        C0121j c0121j = (C0121j) recyclerView4.f1586J;
                        c0121j.getClass();
                        int i6 = rVar4.f440a;
                        int i7 = rVar5.f440a;
                        if (i6 == i7 && rVar4.f441b == rVar5.f441b) {
                            c0121j.c(z8);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0121j.g(z8, i6, rVar4.f441b, i7, rVar5.f441b);
                        }
                        if (g2) {
                            recyclerView.V();
                        }
                    } else if (recyclerView4.f1586J.a(z8, z8, rVar4, rVar5)) {
                        recyclerView4.V();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        rVar = null;
                        c0136z.g(z8, j0Var3.f2484b, null);
                    } else {
                        rVar = null;
                        if ((i4 & 8) != 0) {
                            c0136z.f(z8, j0Var3.f2484b, j0Var3.f2485c);
                        }
                    }
                    i = 0;
                    j0Var3.f2483a = i;
                    j0Var3.f2484b = rVar;
                    j0Var3.f2485c = rVar;
                    j0.d.c(j0Var3);
                }
                i = 0;
                rVar = null;
                j0Var3.f2483a = i;
                j0Var3.f2484b = rVar;
                j0Var3.f2485c = rVar;
                j0.d.c(j0Var3);
            }
            view2 = null;
        }
        this.f1621m.j0(o2);
        v2.f2375b = v2.f2377e;
        this.f1578A = false;
        this.f1579B = false;
        v2.f2380j = false;
        v2.f2381k = false;
        this.f1621m.f2343f = false;
        ArrayList arrayList = o2.f2361b;
        if (arrayList != null) {
            arrayList.clear();
        }
        I i8 = this.f1621m;
        if (i8.f2346k) {
            i8.f2345j = 0;
            i8.f2346k = false;
            o2.m();
        }
        this.f1621m.e0(v2);
        T(true);
        i0(false);
        ((k) jVar.f56b).clear();
        ((o.e) jVar.f57c).a();
        int[] iArr = this.f1622m0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        F(iArr);
        if ((iArr[0] == i9 && iArr[1] == i10) ? false : true) {
            w(0, 0);
        }
        if (this.f1601a0 && this.f1619l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = v2.f2383m;
            if (j2 != -1 && (z2 = this.f1619l.f2327b) && z2) {
                int h = this.f1609f.h();
                r10 = view2;
                int i11 = 0;
                while (true) {
                    if (i11 >= h) {
                        break;
                    }
                    Z L4 = L(this.f1609f.g(i11));
                    if (L4 != null && !L4.i() && L4.f2395e == j2) {
                        if (!this.f1609f.f2417c.contains(L4.f2392a)) {
                            r10 = L4;
                            break;
                        }
                        r10 = L4;
                    }
                    i11++;
                    r10 = r10;
                }
            } else {
                r10 = view2;
            }
            if (r10 != null) {
                ArrayList arrayList2 = this.f1609f.f2417c;
                view = r10.f2392a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1609f.e() > 0) {
                int i12 = v2.f2382l;
                if (i12 == -1) {
                    i12 = 0;
                }
                int b2 = v2.b();
                for (int i13 = i12; i13 < b2; i13++) {
                    Z H4 = H(i13);
                    if (H4 == null) {
                        break;
                    }
                    View view3 = H4.f2392a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i12) - 1; min >= 0; min--) {
                    Z H5 = H(min);
                    if (H5 == null) {
                        break;
                    }
                    view = H5.f2392a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i14 = v2.f2384n;
                if (i14 != -1 && (findViewById = view2.findViewById(i14)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        v2.f2383m = -1L;
        v2.f2382l = -1;
        v2.f2384n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        Z L2 = L(view);
        if (L2 != null) {
            if (L2.k()) {
                L2.f2398j &= -257;
            } else if (!L2.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(L2);
                throw new IllegalArgumentException(Y.V.e(this, sb));
            }
        } else if (f1575x0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(Y.V.e(this, sb2));
        }
        view.clearAnimation();
        L(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0133w c0133w = this.f1621m.f2342e;
        if ((c0133w == null || !c0133w.f2558e) && !O() && view2 != null) {
            a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1621m.m0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1626p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0124m) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1635u != 0 || this.f1639w) {
            this.f1637v = true;
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
        C0112a g2;
        int i5;
        int i6;
        C0112a c0112a;
        V v2 = this.f1608e0;
        v2.a(1);
        C(v2);
        v2.i = false;
        h0();
        j jVar = this.f1611g;
        ((k) jVar.f56b).clear();
        o.e eVar = (o.e) jVar.f57c;
        eVar.a();
        S();
        if (this.f1578A) {
            e eVar2 = this.f1607e;
            eVar2.i((ArrayList) eVar2.f221c);
            eVar2.i((ArrayList) eVar2.d);
            if (this.f1579B) {
                this.f1621m.Z();
            }
        }
        if (this.f1586J == null || !this.f1621m.B0()) {
            this.f1607e.b();
        } else {
            e eVar3 = this.f1607e;
            ArrayList arrayList = (ArrayList) eVar3.f221c;
            A0.h hVar = (A0.h) eVar3.f223f;
            hVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0112a) arrayList.get(size)).f2408a == 8) {
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
                C0112a c0112a2 = (C0112a) arrayList.get(size);
                C0112a c0112a3 = (C0112a) arrayList.get(i7);
                int i8 = c0112a3.f2408a;
                if (i8 != 1) {
                    C0112a c0112a4 = null;
                    e eVar4 = (e) hVar.f30b;
                    if (i8 == 2) {
                        int i9 = c0112a2.f2409b;
                        int i10 = c0112a2.f2410c;
                        if (i9 < i10) {
                            if (c0112a3.f2409b == i9 && c0112a3.f2410c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0112a3.f2409b == i10 + 1 && c0112a3.f2410c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0112a3.f2409b;
                        if (i10 < i11) {
                            c0112a3.f2409b = i11 - 1;
                        } else {
                            int i12 = c0112a3.f2410c;
                            if (i10 < i11 + i12) {
                                c0112a3.f2410c = i12 - 1;
                                c0112a2.f2408a = 2;
                                c0112a2.f2410c = 1;
                                if (c0112a3.f2410c == 0) {
                                    arrayList.remove(i7);
                                    eVar4.getClass();
                                    ((J.b) eVar4.f220b).c(c0112a3);
                                }
                            }
                        }
                        int i13 = c0112a2.f2409b;
                        int i14 = c0112a3.f2409b;
                        if (i13 <= i14) {
                            c0112a3.f2409b = i14 + 1;
                        } else {
                            int i15 = i14 + c0112a3.f2410c;
                            if (i13 < i15) {
                                c0112a4 = eVar4.g(2, i13 + 1, i15 - i13);
                                c0112a3.f2410c = c0112a2.f2409b - c0112a3.f2409b;
                            }
                        }
                        C0112a c0112a5 = c0112a4;
                        if (z6) {
                            arrayList.set(size, c0112a3);
                            arrayList.remove(i7);
                            eVar4.getClass();
                            ((J.b) eVar4.f220b).c(c0112a2);
                        } else {
                            if (z5) {
                                if (c0112a5 != null) {
                                    int i16 = c0112a2.f2409b;
                                    if (i16 > c0112a5.f2409b) {
                                        c0112a2.f2409b = i16 - c0112a5.f2410c;
                                    }
                                    int i17 = c0112a2.f2410c;
                                    if (i17 > c0112a5.f2409b) {
                                        c0112a2.f2410c = i17 - c0112a5.f2410c;
                                    }
                                }
                                int i18 = c0112a2.f2409b;
                                if (i18 > c0112a3.f2409b) {
                                    c0112a2.f2409b = i18 - c0112a3.f2410c;
                                }
                                int i19 = c0112a2.f2410c;
                                if (i19 > c0112a3.f2409b) {
                                    c0112a2.f2410c = i19 - c0112a3.f2410c;
                                }
                            } else {
                                if (c0112a5 != null) {
                                    int i20 = c0112a2.f2409b;
                                    if (i20 >= c0112a5.f2409b) {
                                        c0112a2.f2409b = i20 - c0112a5.f2410c;
                                    }
                                    int i21 = c0112a2.f2410c;
                                    if (i21 >= c0112a5.f2409b) {
                                        c0112a2.f2410c = i21 - c0112a5.f2410c;
                                    }
                                }
                                int i22 = c0112a2.f2409b;
                                if (i22 >= c0112a3.f2409b) {
                                    c0112a2.f2409b = i22 - c0112a3.f2410c;
                                }
                                int i23 = c0112a2.f2410c;
                                if (i23 >= c0112a3.f2409b) {
                                    c0112a2.f2410c = i23 - c0112a3.f2410c;
                                }
                            }
                            arrayList.set(size, c0112a3);
                            if (c0112a2.f2409b != c0112a2.f2410c) {
                                arrayList.set(i7, c0112a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0112a5 != null) {
                                arrayList.add(size, c0112a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0112a2.f2410c;
                        int i25 = c0112a3.f2409b;
                        if (i24 < i25) {
                            c0112a3.f2409b = i25 - 1;
                        } else {
                            int i26 = c0112a3.f2410c;
                            if (i24 < i25 + i26) {
                                c0112a3.f2410c = i26 - 1;
                                g2 = eVar4.g(4, c0112a2.f2409b, 1);
                                i5 = c0112a2.f2409b;
                                i6 = c0112a3.f2409b;
                                if (i5 > i6) {
                                    c0112a3.f2409b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0112a3.f2410c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0112a4 = eVar4.g(4, i5 + 1, i28);
                                        c0112a3.f2410c -= i28;
                                    }
                                }
                                c0112a = c0112a4;
                                arrayList.set(i7, c0112a2);
                                if (c0112a3.f2410c <= 0) {
                                    arrayList.set(size, c0112a3);
                                } else {
                                    arrayList.remove(size);
                                    eVar4.getClass();
                                    ((J.b) eVar4.f220b).c(c0112a3);
                                }
                                if (g2 != null) {
                                    arrayList.add(size, g2);
                                }
                                if (c0112a == null) {
                                    arrayList.add(size, c0112a);
                                }
                            }
                        }
                        g2 = null;
                        i5 = c0112a2.f2409b;
                        i6 = c0112a3.f2409b;
                        if (i5 > i6) {
                        }
                        c0112a = c0112a4;
                        arrayList.set(i7, c0112a2);
                        if (c0112a3.f2410c <= 0) {
                        }
                        if (g2 != null) {
                        }
                        if (c0112a == null) {
                        }
                    }
                } else {
                    int i29 = c0112a2.f2410c;
                    int i30 = c0112a3.f2409b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0112a2.f2409b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0112a2.f2409b = i32 + c0112a3.f2410c;
                    }
                    int i33 = c0112a3.f2409b;
                    if (i33 <= i29) {
                        c0112a2.f2410c = i29 + c0112a3.f2410c;
                    }
                    c0112a3.f2409b = i33 + i31;
                    arrayList.set(size, c0112a3);
                    arrayList.set(i7, c0112a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0112a c0112a6 = (C0112a) arrayList.get(i34);
                int i35 = c0112a6.f2408a;
                if (i35 != 1) {
                    J.b bVar = (J.b) eVar3.f220b;
                    C0136z c0136z = (C0136z) eVar3.f222e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0112a6.f2409b;
                        int i37 = c0112a6.f2410c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0136z.b(i38) != null || eVar3.a(i38)) {
                                if (c3 == 0) {
                                    eVar3.c(eVar3.g(2, i36, i39));
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                                c2 = 1;
                            } else {
                                if (c3 == 1) {
                                    eVar3.h(eVar3.g(2, i36, i39));
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
                        if (i39 != c0112a6.f2410c) {
                            bVar.c(c0112a6);
                            c0112a6 = eVar3.g(2, i36, i39);
                        }
                        if (c3 == 0) {
                            eVar3.c(c0112a6);
                        } else {
                            eVar3.h(c0112a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            eVar3.h(c0112a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0112a6.f2409b;
                        int i41 = c0112a6.f2410c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0136z.b(i40) != null || eVar3.a(i40)) {
                                i3 = size2;
                                if (c4 == 0) {
                                    eVar3.c(eVar3.g(4, i42, i43));
                                    i42 = i40;
                                    i43 = 0;
                                }
                                i4 = 1;
                                c4 = 1;
                            } else {
                                i3 = size2;
                                if (c4 == 1) {
                                    eVar3.h(eVar3.g(4, i42, i43));
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
                        if (i43 != c0112a6.f2410c) {
                            bVar.c(c0112a6);
                            c0112a6 = eVar3.g(4, i42, i43);
                        }
                        if (c4 == 0) {
                            eVar3.c(c0112a6);
                        } else {
                            eVar3.h(c0112a6);
                        }
                    }
                } else {
                    i2 = size2;
                    eVar3.h(c0112a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1613h0 || this.f1614i0;
        boolean z9 = this.f1633t && this.f1586J != null && ((z2 = this.f1578A) || z8 || this.f1621m.f2343f) && (!z2 || this.f1619l.f2327b);
        V v3 = this.f1608e0;
        v3.f2380j = z9;
        v3.f2381k = z9 && z8 && !this.f1578A && this.f1586J != null && this.f1621m.B0();
        View focusedChild = (this.f1601a0 && hasFocus() && this.f1619l != null) ? getFocusedChild() : null;
        Z K2 = (focusedChild == null || (D2 = D(focusedChild)) == null) ? null : K(D2);
        if (K2 == null) {
            v2.f2383m = -1L;
            v2.f2382l = -1;
            v2.f2384n = -1;
        } else {
            v2.f2383m = this.f1619l.f2327b ? K2.f2395e : -1L;
            if (!this.f1578A) {
                if (K2.i()) {
                    I2 = K2.d;
                } else {
                    RecyclerView recyclerView = K2.f2406r;
                    if (recyclerView != null) {
                        I2 = recyclerView.I(K2);
                    }
                }
                v2.f2382l = I2;
                view = K2.f2392a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                v2.f2384n = id;
            }
            I2 = -1;
            v2.f2382l = I2;
            view = K2.f2392a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            v2.f2384n = id2;
        }
        v2.h = v2.f2380j && this.f1614i0;
        this.f1614i0 = false;
        this.f1613h0 = false;
        v2.f2379g = v2.f2381k;
        v2.f2377e = this.f1619l.a();
        F(this.f1622m0);
        boolean z10 = v2.f2380j;
        k kVar = (k) jVar.f56b;
        if (z10) {
            int e2 = this.f1609f.e();
            for (int i44 = 0; i44 < e2; i44++) {
                Z L2 = L(this.f1609f.d(i44));
                if (!L2.p() && (!L2.g() || this.f1619l.f2327b)) {
                    E e3 = this.f1586J;
                    E.b(L2);
                    L2.c();
                    e3.getClass();
                    r rVar = new r();
                    rVar.a(L2);
                    j0 j0Var2 = (j0) kVar.getOrDefault(L2, null);
                    if (j0Var2 == null) {
                        j0Var2 = j0.a();
                        kVar.put(L2, j0Var2);
                    }
                    j0Var2.f2484b = rVar;
                    j0Var2.f2483a |= 4;
                    if (v2.h && L2.l() && !L2.i() && !L2.p() && !L2.g()) {
                        eVar.d(J(L2), L2);
                    }
                }
            }
        }
        if (v2.f2381k) {
            int h = this.f1609f.h();
            for (int i45 = 0; i45 < h; i45++) {
                Z L3 = L(this.f1609f.g(i45));
                if (f1575x0 && L3.f2394c == -1 && !L3.i()) {
                    throw new IllegalStateException(Y.V.e(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!L3.p() && L3.d == -1) {
                    L3.d = L3.f2394c;
                }
            }
            boolean z11 = v2.f2378f;
            v2.f2378f = false;
            this.f1621m.d0(this.f1604c, v2);
            v2.f2378f = z11;
            for (int i46 = 0; i46 < this.f1609f.e(); i46++) {
                Z L4 = L(this.f1609f.d(i46));
                if (!L4.p() && ((j0Var = (j0) kVar.getOrDefault(L4, null)) == null || (j0Var.f2483a & 4) == 0)) {
                    E.b(L4);
                    boolean d = L4.d(8192);
                    E e4 = this.f1586J;
                    L4.c();
                    e4.getClass();
                    r rVar2 = new r();
                    rVar2.a(L4);
                    if (d) {
                        X(L4, rVar2);
                    } else {
                        j0 j0Var3 = (j0) kVar.getOrDefault(L4, null);
                        if (j0Var3 == null) {
                            j0Var3 = j0.a();
                            kVar.put(L4, j0Var3);
                        }
                        j0Var3.f2483a |= 2;
                        j0Var3.f2484b = rVar2;
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
        I i3 = this.f1621m;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1639w) {
            return;
        }
        boolean d = i3.d();
        boolean e2 = this.f1621m.e();
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
            this.f1642y |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(b0 b0Var) {
        this.f1620l0 = b0Var;
        T.l(this, b0Var);
    }

    public void setAdapter(AbstractC0109A abstractC0109A) {
        setLayoutFrozen(false);
        AbstractC0109A abstractC0109A2 = this.f1619l;
        Q q2 = this.f1602b;
        if (abstractC0109A2 != null) {
            abstractC0109A2.f2326a.unregisterObserver(q2);
            this.f1619l.getClass();
        }
        E e2 = this.f1586J;
        if (e2 != null) {
            e2.e();
        }
        I i = this.f1621m;
        O o2 = this.f1604c;
        if (i != null) {
            i.i0(o2);
            this.f1621m.j0(o2);
        }
        o2.f2360a.clear();
        o2.f();
        e eVar = this.f1607e;
        eVar.i((ArrayList) eVar.f221c);
        eVar.i((ArrayList) eVar.d);
        AbstractC0109A abstractC0109A3 = this.f1619l;
        this.f1619l = abstractC0109A;
        if (abstractC0109A != null) {
            abstractC0109A.f2326a.registerObserver(q2);
        }
        I i2 = this.f1621m;
        if (i2 != null) {
            i2.Q();
        }
        AbstractC0109A abstractC0109A4 = this.f1619l;
        o2.f2360a.clear();
        o2.f();
        o2.e(abstractC0109A3, true);
        N c2 = o2.c();
        if (abstractC0109A3 != null) {
            c2.f2358b--;
        }
        if (c2.f2358b == 0) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = c2.f2357a;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                M m2 = (M) sparseArray.valueAt(i3);
                Iterator it = m2.f2354a.iterator();
                while (it.hasNext()) {
                    c.i(((Z) it.next()).f2392a);
                }
                m2.f2354a.clear();
                i3++;
            }
        }
        if (abstractC0109A4 != null) {
            c2.f2358b++;
        }
        o2.d();
        this.f1608e0.f2378f = true;
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0111C interfaceC0111C) {
        if (interfaceC0111C == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.h) {
            this.f1585I = null;
            this.f1583G = null;
            this.f1584H = null;
            this.F = null;
        }
        this.h = z2;
        super.setClipToPadding(z2);
        if (this.f1633t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(D d) {
        d.getClass();
        this.f1582E = d;
        this.f1585I = null;
        this.f1583G = null;
        this.f1584H = null;
        this.F = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1631s = z2;
    }

    public void setItemAnimator(E e2) {
        E e3 = this.f1586J;
        if (e3 != null) {
            e3.e();
            this.f1586J.f2329a = null;
        }
        this.f1586J = e2;
        if (e2 != null) {
            e2.f2329a = this.f1616j0;
        }
    }

    public void setItemViewCacheSize(int i) {
        O o2 = this.f1604c;
        o2.f2363e = i;
        o2.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(I i) {
        RecyclerView recyclerView;
        C0133w c0133w;
        if (i == this.f1621m) {
            return;
        }
        setScrollState(0);
        Y y2 = this.f1603b0;
        y2.f2390g.removeCallbacks(y2);
        y2.f2387c.abortAnimation();
        I i2 = this.f1621m;
        if (i2 != null && (c0133w = i2.f2342e) != null) {
            c0133w.i();
        }
        I i3 = this.f1621m;
        O o2 = this.f1604c;
        if (i3 != null) {
            E e2 = this.f1586J;
            if (e2 != null) {
                e2.e();
            }
            this.f1621m.i0(o2);
            this.f1621m.j0(o2);
            o2.f2360a.clear();
            o2.f();
            if (this.f1630r) {
                I i4 = this.f1621m;
                i4.f2344g = false;
                i4.S(this);
            }
            this.f1621m.v0(null);
            this.f1621m = null;
        } else {
            o2.f2360a.clear();
            o2.f();
        }
        C0114c c0114c = this.f1609f;
        c0114c.f2416b.g();
        ArrayList arrayList = c0114c.f2417c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = c0114c.f2415a.f2571a;
            if (size < 0) {
                break;
            }
            Z L2 = L((View) arrayList.get(size));
            if (L2 != null) {
                int i5 = L2.f2404p;
                if (recyclerView.O()) {
                    L2.f2405q = i5;
                    recyclerView.r0.add(L2);
                } else {
                    WeakHashMap weakHashMap = T.f372a;
                    L2.f2392a.setImportantForAccessibility(i5);
                }
                L2.f2404p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1621m = i;
        if (i != null) {
            if (i.f2340b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(i);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(Y.V.e(i.f2340b, sb));
            }
            i.v0(this);
            if (this.f1630r) {
                I i7 = this.f1621m;
                i7.f2344g = true;
                i7.R(this);
            }
        }
        o2.m();
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
        C0016o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = T.f372a;
            H.z(scrollingChildHelper.f433c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(K k2) {
        this.f1595S = k2;
    }

    @Deprecated
    public void setOnScrollListener(L l2) {
        this.f1610f0 = l2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1601a0 = z2;
    }

    public void setRecycledViewPool(N n2) {
        O o2 = this.f1604c;
        RecyclerView recyclerView = o2.h;
        o2.e(recyclerView.f1619l, false);
        if (o2.f2365g != null) {
            r2.f2358b--;
        }
        o2.f2365g = n2;
        if (n2 != null && recyclerView.getAdapter() != null) {
            o2.f2365g.f2358b++;
        }
        o2.d();
    }

    @Deprecated
    public void setRecyclerListener(P p2) {
    }

    public void setScrollState(int i) {
        C0133w c0133w;
        if (i == this.f1587K) {
            return;
        }
        if (f1576y0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f1587K, new Exception());
        }
        this.f1587K = i;
        if (i != 2) {
            Y y2 = this.f1603b0;
            y2.f2390g.removeCallbacks(y2);
            y2.f2387c.abortAnimation();
            I i2 = this.f1621m;
            if (i2 != null && (c0133w = i2.f2342e) != null) {
                c0133w.i();
            }
        }
        I i3 = this.f1621m;
        if (i3 != null) {
            i3.h0(i);
        }
        L l2 = this.f1610f0;
        if (l2 != null) {
            l2.a(this, i);
        }
        ArrayList arrayList = this.f1612g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1612g0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1594R = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1594R = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(X x2) {
        this.f1604c.getClass();
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
        C0133w c0133w;
        if (z2 != this.f1639w) {
            k("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1639w = false;
                if (this.f1637v && this.f1621m != null && this.f1619l != null) {
                    requestLayout();
                }
                this.f1637v = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, f1570A0, f1570A0, 0));
            this.f1639w = true;
            this.f1641x = true;
            setScrollState(0);
            Y y2 = this.f1603b0;
            y2.f2390g.removeCallbacks(y2);
            y2.f2387c.abortAnimation();
            I i = this.f1621m;
            if (i == null || (c0133w = i.f2342e) == null) {
                return;
            }
            c0133w.i();
        }
    }

    public final void t() {
        h0();
        S();
        V v2 = this.f1608e0;
        v2.a(6);
        this.f1607e.b();
        v2.f2377e = this.f1619l.a();
        v2.f2376c = 0;
        if (this.d != null) {
            AbstractC0109A abstractC0109A = this.f1619l;
            int a2 = AbstractC0321e.a(abstractC0109A.f2328c);
            if (a2 == 1 ? abstractC0109A.a() > 0 : a2 != 2) {
                Parcelable parcelable = this.d.f2367c;
                if (parcelable != null) {
                    this.f1621m.f0(parcelable);
                }
                this.d = null;
            }
        }
        v2.f2379g = false;
        this.f1621m.d0(this.f1604c, v2);
        v2.f2378f = false;
        v2.f2380j = v2.f2380j && this.f1586J != null;
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
        this.f1581D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        L l2 = this.f1610f0;
        if (l2 != null) {
            l2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1612g0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1612g0.get(size)).b(this, i, i2);
            }
        }
        this.f1581D--;
    }

    public final void x() {
        if (this.f1585I != null) {
            return;
        }
        ((W) this.f1582E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1585I = edgeEffect;
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
        ((W) this.f1582E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f1584H != null) {
            return;
        }
        ((W) this.f1582E).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1584H = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        char c2;
        char c3;
        boolean z2;
        Object[] objArr;
        Constructor constructor;
        int i2 = 8;
        this.f1602b = new Q(this);
        this.f1604c = new O(this);
        this.f1611g = new j(14);
        this.i = new Rect();
        this.f1615j = new Rect();
        this.f1617k = new RectF();
        this.f1623n = new ArrayList();
        this.f1624o = new ArrayList();
        this.f1626p = new ArrayList();
        this.f1635u = 0;
        this.f1578A = false;
        this.f1579B = false;
        this.f1580C = 0;
        this.f1581D = 0;
        this.f1582E = f1574F0;
        C0121j c0121j = new C0121j();
        c0121j.f2329a = null;
        c0121j.f2330b = new ArrayList();
        c0121j.f2331c = 120L;
        c0121j.d = 120L;
        c0121j.f2332e = 250L;
        c0121j.f2333f = 250L;
        c0121j.f2473g = true;
        c0121j.h = new ArrayList();
        c0121j.i = new ArrayList();
        c0121j.f2474j = new ArrayList();
        c0121j.f2475k = new ArrayList();
        c0121j.f2476l = new ArrayList();
        c0121j.f2477m = new ArrayList();
        c0121j.f2478n = new ArrayList();
        c0121j.f2479o = new ArrayList();
        c0121j.f2480p = new ArrayList();
        c0121j.f2481q = new ArrayList();
        c0121j.f2482r = new ArrayList();
        this.f1586J = c0121j;
        this.f1587K = 0;
        this.f1588L = -1;
        this.f1598V = Float.MIN_VALUE;
        this.f1599W = Float.MIN_VALUE;
        this.f1601a0 = true;
        this.f1603b0 = new Y(this);
        this.f1606d0 = f1572C0 ? new C0125n() : null;
        V v2 = new V();
        v2.f2374a = -1;
        v2.f2375b = 0;
        v2.f2376c = 0;
        v2.d = 1;
        v2.f2377e = 0;
        v2.f2378f = false;
        v2.f2379g = false;
        v2.h = false;
        v2.i = false;
        v2.f2380j = false;
        v2.f2381k = false;
        this.f1608e0 = v2;
        this.f1613h0 = false;
        this.f1614i0 = false;
        C0136z c0136z = new C0136z(this);
        this.f1616j0 = c0136z;
        this.f1618k0 = false;
        this.f1622m0 = new int[2];
        this.f1625o0 = new int[2];
        this.f1627p0 = new int[2];
        this.f1629q0 = new int[2];
        this.r0 = new ArrayList();
        this.f1632s0 = new b(i2, this);
        this.f1636u0 = 0;
        this.f1638v0 = 0;
        this.f1640w0 = new C0136z(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1594R = viewConfiguration.getScaledTouchSlop();
        this.f1598V = K.U.a(viewConfiguration);
        this.f1599W = K.U.b(viewConfiguration);
        this.f1596T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1597U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1600a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1586J.f2329a = c0136z;
        this.f1607e = new e(new C0136z(this));
        this.f1609f = new C0114c(new C0136z(this));
        WeakHashMap weakHashMap = T.f372a;
        if (K.J.c(this) == 0) {
            K.J.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1643z = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new b0(this));
        int[] iArr = AbstractC0091a.f2160a;
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
                throw new IllegalArgumentException(Y.V.e(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c2 = 3;
            c3 = 2;
            new C0124m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.football.transfertrivia.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.football.transfertrivia.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.football.transfertrivia.R.dimen.fastscroll_margin));
        } else {
            c2 = 3;
            c3 = 2;
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
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(I.class);
                    try {
                        constructor = asSubclass.getConstructor(f1573D0);
                        objArr = new Object[4];
                        objArr[0] = context;
                        z2 = true;
                        try {
                            objArr[1] = attributeSet;
                            objArr[c3] = Integer.valueOf(i);
                            objArr[c2] = 0;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            NoSuchMethodException noSuchMethodException = e;
                            objArr = null;
                            try {
                                constructor = asSubclass.getConstructor(null);
                                Object[] objArr2 = objArr;
                                constructor.setAccessible(z2);
                                setLayoutManager((I) constructor.newInstance(objArr2));
                                int[] iArr2 = f1577z0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                                T.k(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
                                boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z3);
                                setTag(com.football.transfertrivia.R.id.is_pooling_container_tag, Boolean.TRUE);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                            }
                        }
                    } catch (NoSuchMethodException e4) {
                        e = e4;
                        z2 = true;
                    }
                    Object[] objArr22 = objArr;
                    constructor.setAccessible(z2);
                    setLayoutManager((I) constructor.newInstance(objArr22));
                    int[] iArr22 = f1577z0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    T.k(this, context, iArr22, attributeSet, obtainStyledAttributes22, i);
                    boolean z32 = obtainStyledAttributes22.getBoolean(0, z2);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z32);
                    setTag(com.football.transfertrivia.R.id.is_pooling_container_tag, Boolean.TRUE);
                } catch (ClassCastException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                }
            }
        }
        z2 = true;
        int[] iArr222 = f1577z0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        T.k(this, context, iArr222, attributeSet, obtainStyledAttributes222, i);
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
        setTag(com.football.transfertrivia.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        I i = this.f1621m;
        if (i != null) {
            return i.t(layoutParams);
        }
        throw new IllegalStateException(Y.V.e(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}

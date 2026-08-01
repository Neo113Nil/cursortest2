package androidx.recyclerview.widget;

import B.j;
import G.h;
import J.b;
import J0.e;
import K.C0011l;
import K.C0013n;
import K.C0016q;
import K.G;
import K.S;
import M0.B;
import S.d;
import T.g;
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
import android.os.Build;
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
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import e0.a;
import f0.AbstractC0096A;
import f0.C;
import f0.C0097a;
import f0.C0098b;
import f0.C0105i;
import f0.C0108l;
import f0.C0109m;
import f0.C0117v;
import f0.C0119x;
import f0.C0120y;
import f0.C0121z;
import f0.D;
import f0.E;
import f0.F;
import f0.I;
import f0.J;
import f0.K;
import f0.L;
import f0.M;
import f0.N;
import f0.O;
import f0.P;
import f0.Q;
import f0.RunnableC0111o;
import f0.T;
import f0.U;
import f0.V;
import f0.W;
import f0.X;
import f0.Z;
import f0.h0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f1410s0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class[] f1411t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final d f1412u0;

    /* renamed from: A, reason: collision with root package name */
    public int f1413A;

    /* renamed from: B, reason: collision with root package name */
    public int f1414B;

    /* renamed from: C, reason: collision with root package name */
    public D f1415C;

    /* renamed from: D, reason: collision with root package name */
    public EdgeEffect f1416D;

    /* renamed from: E, reason: collision with root package name */
    public EdgeEffect f1417E;
    public EdgeEffect F;

    /* renamed from: G, reason: collision with root package name */
    public EdgeEffect f1418G;

    /* renamed from: H, reason: collision with root package name */
    public E f1419H;

    /* renamed from: I, reason: collision with root package name */
    public int f1420I;

    /* renamed from: J, reason: collision with root package name */
    public int f1421J;

    /* renamed from: K, reason: collision with root package name */
    public VelocityTracker f1422K;

    /* renamed from: L, reason: collision with root package name */
    public int f1423L;

    /* renamed from: M, reason: collision with root package name */
    public int f1424M;

    /* renamed from: N, reason: collision with root package name */
    public int f1425N;

    /* renamed from: O, reason: collision with root package name */
    public int f1426O;

    /* renamed from: P, reason: collision with root package name */
    public int f1427P;

    /* renamed from: Q, reason: collision with root package name */
    public K f1428Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f1429R;

    /* renamed from: S, reason: collision with root package name */
    public final int f1430S;

    /* renamed from: T, reason: collision with root package name */
    public final float f1431T;

    /* renamed from: U, reason: collision with root package name */
    public final float f1432U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f1433V;

    /* renamed from: W, reason: collision with root package name */
    public final W f1434W;

    /* renamed from: a, reason: collision with root package name */
    public final e f1435a;

    /* renamed from: a0, reason: collision with root package name */
    public RunnableC0111o f1436a0;

    /* renamed from: b, reason: collision with root package name */
    public final O f1437b;

    /* renamed from: b0, reason: collision with root package name */
    public final C0109m f1438b0;

    /* renamed from: c, reason: collision with root package name */
    public Q f1439c;

    /* renamed from: c0, reason: collision with root package name */
    public final U f1440c0;
    public final H.e d;

    /* renamed from: d0, reason: collision with root package name */
    public L f1441d0;

    /* renamed from: e, reason: collision with root package name */
    public final C0011l f1442e;

    /* renamed from: e0, reason: collision with root package name */
    public ArrayList f1443e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f1444f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1445f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1446g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1447g0;
    public final Rect h;

    /* renamed from: h0, reason: collision with root package name */
    public final C0121z f1448h0;
    public final Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1449i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1450j;
    public Z j0;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0096A f1451k;

    /* renamed from: k0, reason: collision with root package name */
    public final int[] f1452k0;

    /* renamed from: l, reason: collision with root package name */
    public I f1453l;

    /* renamed from: l0, reason: collision with root package name */
    public C0013n f1454l0;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1455m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f1456m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1457n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f1458n0;

    /* renamed from: o, reason: collision with root package name */
    public C0108l f1459o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1460o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1461p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f1462p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1463q;

    /* renamed from: q0, reason: collision with root package name */
    public final B f1464q0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1465r;

    /* renamed from: r0, reason: collision with root package name */
    public final C0121z f1466r0;

    /* renamed from: s, reason: collision with root package name */
    public int f1467s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1468t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1469u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1470v;

    /* renamed from: w, reason: collision with root package name */
    public int f1471w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f1472x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1473y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1474z;

    static {
        Class cls = Integer.TYPE;
        f1411t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1412u0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.fortuneodd.shadegrid.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static X I(View view) {
        if (view == null) {
            return null;
        }
        return ((J) view.getLayoutParams()).f1975a;
    }

    private C0013n getScrollingChildHelper() {
        if (this.f1454l0 == null) {
            this.f1454l0 = new C0013n(this);
        }
        return this.f1454l0;
    }

    public static void j(X x2) {
        WeakReference weakReference = x2.f2015b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == x2.f2014a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            x2.f2015b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A(View view) {
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
    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f1457n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0108l c0108l = (C0108l) arrayList.get(i);
            int i2 = c0108l.f2129v;
            if (i2 == 1) {
                boolean d = c0108l.d(motionEvent.getX(), motionEvent.getY());
                boolean c2 = c0108l.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c2)) {
                    if (c2) {
                        c0108l.f2130w = 1;
                        c0108l.f2123p = (int) motionEvent.getX();
                    } else if (d) {
                        c0108l.f2130w = 2;
                        c0108l.f2120m = (int) motionEvent.getY();
                    }
                    c0108l.f(2);
                    if (action == 3) {
                        this.f1459o = c0108l;
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

    public final void C(int[] iArr) {
        int f2 = this.f1442e.f();
        if (f2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < f2; i3++) {
            X I2 = I(this.f1442e.e(i3));
            if (!I2.p()) {
                int b2 = I2.b();
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

    public final X E(int i) {
        X x2 = null;
        if (this.f1473y) {
            return null;
        }
        int m2 = this.f1442e.m();
        for (int i2 = 0; i2 < m2; i2++) {
            X I2 = I(this.f1442e.l(i2));
            if (I2 != null && !I2.i() && F(I2) == i) {
                if (!((ArrayList) this.f1442e.d).contains(I2.f2014a)) {
                    return I2;
                }
                x2 = I2;
            }
        }
        return x2;
    }

    public final int F(X x2) {
        if (x2.d(524) || !x2.f()) {
            return -1;
        }
        H.e eVar = this.d;
        int i = x2.f2016c;
        ArrayList arrayList = (ArrayList) eVar.f206c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0097a c0097a = (C0097a) arrayList.get(i2);
            int i3 = c0097a.f2031a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0097a.f2032b;
                    if (i4 <= i) {
                        int i5 = c0097a.f2033c;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0097a.f2032b;
                    if (i6 == i) {
                        i = c0097a.f2033c;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0097a.f2033c <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0097a.f2032b <= i) {
                i += c0097a.f2033c;
            }
        }
        return i;
    }

    public final long G(X x2) {
        return this.f1451k.f1952b ? x2.f2017e : x2.f2016c;
    }

    public final X H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        J j2 = (J) view.getLayoutParams();
        boolean z2 = j2.f1977c;
        Rect rect = j2.f1976b;
        if (!z2) {
            return rect;
        }
        if (this.f1440c0.f2001g && (j2.f1975a.l() || j2.f1975a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f1455m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.h;
            rect2.set(0, 0, 0, 0);
            ((F) arrayList.get(i)).getClass();
            ((J) view.getLayoutParams()).f1975a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        j2.f1977c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f1465r || this.f1473y || this.d.f();
    }

    public final boolean L() {
        return this.f1413A > 0;
    }

    public final void M(int i) {
        if (this.f1453l == null) {
            return;
        }
        setScrollState(2);
        this.f1453l.n0(i);
        awakenScrollBars();
    }

    public final void N() {
        int m2 = this.f1442e.m();
        for (int i = 0; i < m2; i++) {
            ((J) this.f1442e.l(i).getLayoutParams()).f1977c = true;
        }
        ArrayList arrayList = this.f1437b.f1985c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            J j2 = (J) ((X) arrayList.get(i2)).f2014a.getLayoutParams();
            if (j2 != null) {
                j2.f1977c = true;
            }
        }
    }

    public final void O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int m2 = this.f1442e.m();
        for (int i4 = 0; i4 < m2; i4++) {
            X I2 = I(this.f1442e.l(i4));
            if (I2 != null && !I2.p()) {
                int i5 = I2.f2016c;
                U u2 = this.f1440c0;
                if (i5 >= i3) {
                    I2.m(-i2, z2);
                    u2.f2000f = true;
                } else if (i5 >= i) {
                    I2.a(8);
                    I2.m(-i2, z2);
                    I2.f2016c = i - 1;
                    u2.f2000f = true;
                }
            }
        }
        O o2 = this.f1437b;
        ArrayList arrayList = o2.f1985c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x2 = (X) arrayList.get(size);
            if (x2 != null) {
                int i6 = x2.f2016c;
                if (i6 >= i3) {
                    x2.m(-i2, z2);
                } else if (i6 >= i) {
                    x2.a(8);
                    o2.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1413A++;
    }

    public final void Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f1413A - 1;
        this.f1413A = i2;
        if (i2 < 1) {
            this.f1413A = 0;
            if (z2) {
                int i3 = this.f1471w;
                this.f1471w = 0;
                if (i3 != 0 && (accessibilityManager = this.f1472x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f1462p0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    X x2 = (X) arrayList.get(size);
                    if (x2.f2014a.getParent() == this && !x2.p() && (i = x2.f2027q) != -1) {
                        WeakHashMap weakHashMap = S.f360a;
                        x2.f2014a.setImportantForAccessibility(i);
                        x2.f2027q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1421J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1421J = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1425N = x2;
            this.f1423L = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1426O = y2;
            this.f1424M = y2;
        }
    }

    public final void S() {
        if (this.f1449i0 || !this.f1461p) {
            return;
        }
        WeakHashMap weakHashMap = S.f360a;
        postOnAnimation(this.f1464q0);
        this.f1449i0 = true;
    }

    public final void T(X x2, C0016q c0016q) {
        x2.f2020j &= -8193;
        boolean z2 = this.f1440c0.h;
        j jVar = this.f1444f;
        if (z2 && x2.l() && !x2.i() && !x2.p()) {
            ((o.e) jVar.f29c).d(G(x2), x2);
        }
        k kVar = (k) jVar.f28b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2091b = c0016q;
        h0Var.f2090a |= 4;
    }

    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof J) {
            J j2 = (J) layoutParams;
            if (!j2.f1977c) {
                int i = rect.left;
                Rect rect2 = j2.f1976b;
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
        this.f1453l.k0(this, view, this.h, !this.f1465r, view2 == null);
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f1422K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        c0(0);
        EdgeEffect edgeEffect = this.f1416D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1416D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1417E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1417E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1418G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1418G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = S.f360a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        m();
        AbstractC0096A abstractC0096A = this.f1451k;
        int[] iArr = this.f1460o0;
        if (abstractC0096A != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            X(i, i2, iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            i3 = i7;
            i4 = i8;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.f1455m.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i3, i4, i5, i6, this.f1456m0, 0, iArr);
        int i9 = iArr[0];
        int i10 = i5 - i9;
        int i11 = iArr[1];
        int i12 = i6 - i11;
        boolean z3 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f1425N;
        int[] iArr2 = this.f1456m0;
        int i14 = iArr2[0];
        this.f1425N = i13 - i14;
        int i15 = this.f1426O;
        int i16 = iArr2[1];
        this.f1426O = i15 - i16;
        int[] iArr3 = this.f1458n0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i10;
                float y2 = motionEvent.getY();
                float f3 = i12;
                if (f2 < 0.0f) {
                    v();
                    Q.d.a(this.f1416D, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > 0.0f) {
                    w();
                    Q.d.a(this.F, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= 0.0f) {
                        x();
                        Q.d.a(this.f1417E, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > 0.0f) {
                            u();
                            Q.d.a(this.f1418G, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (!z2 || f2 != 0.0f || f3 != 0.0f) {
                            WeakHashMap weakHashMap = S.f360a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (!z2) {
                    }
                    WeakHashMap weakHashMap2 = S.f360a;
                    postInvalidateOnAnimation();
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                z2 = true;
                if (!z2) {
                }
                WeakHashMap weakHashMap22 = S.f360a;
                postInvalidateOnAnimation();
            }
            l(i, i2);
        }
        if (i3 != 0 || i4 != 0) {
            t(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i3 == 0 && i4 == 0) ? false : true;
    }

    public final void X(int i, int i2, int[] iArr) {
        X x2;
        C0011l c0011l = this.f1442e;
        a0();
        P();
        int i3 = h.f179a;
        Trace.beginSection("RV Scroll");
        U u2 = this.f1440c0;
        z(u2);
        O o2 = this.f1437b;
        int m02 = i != 0 ? this.f1453l.m0(i, o2, u2) : 0;
        int o02 = i2 != 0 ? this.f1453l.o0(i2, o2, u2) : 0;
        Trace.endSection();
        int f2 = c0011l.f();
        for (int i4 = 0; i4 < f2; i4++) {
            View e2 = c0011l.e(i4);
            X H2 = H(e2);
            if (H2 != null && (x2 = H2.i) != null) {
                int left = e2.getLeft();
                int top = e2.getTop();
                View view = x2.f2014a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = m02;
            iArr[1] = o02;
        }
    }

    public final void Y(int i) {
        C0117v c0117v;
        if (this.f1469u) {
            return;
        }
        setScrollState(0);
        W w2 = this.f1434W;
        w2.f2012g.removeCallbacks(w2);
        w2.f2009c.abortAnimation();
        I i2 = this.f1453l;
        if (i2 != null && (c0117v = i2.f1966e) != null) {
            c0117v.i();
        }
        I i3 = this.f1453l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            i3.n0(i);
            awakenScrollBars();
        }
    }

    public final void Z(int i, int i2, boolean z2) {
        I i3 = this.f1453l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1469u) {
            return;
        }
        if (!i3.d()) {
            i = 0;
        }
        if (!this.f1453l.e()) {
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
        this.f1434W.b(i, i2, Integer.MIN_VALUE, null);
    }

    public final void a0() {
        int i = this.f1467s + 1;
        this.f1467s = i;
        if (i != 1 || this.f1469u) {
            return;
        }
        this.f1468t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        I i3 = this.f1453l;
        if (i3 != null) {
            i3.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(boolean z2) {
        if (this.f1467s < 1) {
            this.f1467s = 1;
        }
        if (!z2 && !this.f1469u) {
            this.f1468t = false;
        }
        if (this.f1467s == 1) {
            if (z2 && this.f1468t && !this.f1469u && this.f1453l != null && this.f1451k != null) {
                o();
            }
            if (!this.f1469u) {
                this.f1468t = false;
            }
        }
        this.f1467s--;
    }

    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof J) && this.f1453l.f((J) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        I i = this.f1453l;
        if (i != null && i.d()) {
            return this.f1453l.j(this.f1440c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        I i = this.f1453l;
        if (i != null && i.d()) {
            return this.f1453l.k(this.f1440c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        I i = this.f1453l;
        if (i != null && i.d()) {
            return this.f1453l.l(this.f1440c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        I i = this.f1453l;
        if (i != null && i.e()) {
            return this.f1453l.m(this.f1440c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        I i = this.f1453l;
        if (i != null && i.e()) {
            return this.f1453l.n(this.f1440c0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        I i = this.f1453l;
        if (i != null && i.e()) {
            return this.f1453l.o(this.f1440c0);
        }
        return 0;
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
        ArrayList arrayList = this.f1455m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((F) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1416D;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1446g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1416D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1417E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1446g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1417E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1446g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1418G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1446g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f1418G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.f1419H == null || arrayList.size() <= 0 || !this.f1419H.f()) ? z2 : true) {
            WeakHashMap weakHashMap = S.f360a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void f(X x2) {
        View view = x2.f2014a;
        boolean z2 = view.getParent() == this;
        this.f1437b.j(H(view));
        if (x2.k()) {
            this.f1442e.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f1442e.a(view, -1, true);
            return;
        }
        C0011l c0011l = this.f1442e;
        int indexOfChild = ((C0121z) c0011l.f413b).f2191a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0098b) c0011l.f414c).i(indexOfChild);
            c0011l.p(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018a, code lost:
    
        if ((r5 * r6) < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if ((r5 * r6) > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015e, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017c, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017f, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0182, code lost:
    
        if (r5 < 0) goto L136;
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
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c2;
        boolean z2;
        this.f1453l.getClass();
        boolean z3 = true;
        boolean z4 = (this.f1451k == null || this.f1453l == null || L() || this.f1469u) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        U u2 = this.f1440c0;
        O o2 = this.f1437b;
        if (z4 && (i == 2 || i == 1)) {
            if (this.f1453l.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z2 = true;
                    if (!z2 && this.f1453l.d()) {
                        z2 = focusFinder.findNextFocus(this, view, !((this.f1453l.C() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z2) {
                        m();
                        if (A(view) == null) {
                            return null;
                        }
                        a0();
                        this.f1453l.S(view, i, o2, u2);
                        b0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                }
            }
            z2 = false;
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f1453l.C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z2) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z4) {
                m();
                if (A(view) == null) {
                    return null;
                }
                a0();
                view2 = this.f1453l.S(view, i, o2, u2);
                b0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            U(view2, null);
            return view;
        }
        if (view2 != null && view2 != this) {
            if (A(view2) == null) {
                z3 = false;
            } else if (view != null && A(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.h;
                rect.set(0, 0, width, height);
                int width2 = view2.getWidth();
                int height2 = view2.getHeight();
                Rect rect2 = this.i;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(view2, rect2);
                int i3 = this.f1453l.C() == 1 ? -1 : 1;
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
                                        throw new IllegalArgumentException("Invalid direction: " + i + y());
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

    public final void g(F f2) {
        I i = this.f1453l;
        if (i != null) {
            i.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f1455m;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(f2);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        I i = this.f1453l;
        if (i != null) {
            return i.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        I i = this.f1453l;
        if (i != null) {
            return i.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0096A getAdapter() {
        return this.f1451k;
    }

    @Override // android.view.View
    public int getBaseline() {
        I i = this.f1453l;
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
        return this.f1446g;
    }

    public Z getCompatAccessibilityDelegate() {
        return this.j0;
    }

    public D getEdgeEffectFactory() {
        return this.f1415C;
    }

    public E getItemAnimator() {
        return this.f1419H;
    }

    public int getItemDecorationCount() {
        return this.f1455m.size();
    }

    public I getLayoutManager() {
        return this.f1453l;
    }

    public int getMaxFlingVelocity() {
        return this.f1430S;
    }

    public int getMinFlingVelocity() {
        return this.f1429R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public K getOnFlingListener() {
        return this.f1428Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1433V;
    }

    public N getRecycledViewPool() {
        return this.f1437b.c();
    }

    public int getScrollState() {
        return this.f1420I;
    }

    public final void h(L l2) {
        if (this.f1443e0 == null) {
            this.f1443e0 = new ArrayList();
        }
        this.f1443e0.add(l2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f1414B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1461p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1469u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int m2 = this.f1442e.m();
        for (int i = 0; i < m2; i++) {
            X I2 = I(this.f1442e.l(i));
            if (!I2.p()) {
                I2.d = -1;
                I2.f2019g = -1;
            }
        }
        O o2 = this.f1437b;
        ArrayList arrayList = o2.f1985c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            X x2 = (X) arrayList.get(i2);
            x2.d = -1;
            x2.f2019g = -1;
        }
        ArrayList arrayList2 = o2.f1983a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            X x3 = (X) arrayList2.get(i3);
            x3.d = -1;
            x3.f2019g = -1;
        }
        ArrayList arrayList3 = o2.f1984b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X x4 = (X) o2.f1984b.get(i4);
                x4.d = -1;
                x4.f2019g = -1;
            }
        }
    }

    public final void l(int i, int i2) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1416D;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z2 = false;
        } else {
            this.f1416D.onRelease();
            z2 = this.f1416D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.F.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1417E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f1417E.onRelease();
            z2 |= this.f1417E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1418G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f1418G.onRelease();
            z2 |= this.f1418G.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = S.f360a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        H.e eVar = this.d;
        if (!this.f1465r || this.f1473y) {
            int i = h.f179a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        if (eVar.f()) {
            eVar.getClass();
            if (eVar.f()) {
                int i2 = h.f179a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    public final void n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = S.f360a;
        setMeasuredDimension(I.g(i, paddingRight, getMinimumWidth()), I.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0323, code lost:
    
        if (((java.util.ArrayList) r19.f1442e.d).contains(getFocusedChild()) == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0382, code lost:
    
        if (r6.hasFocusable() != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [f0.X] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        ?? r10;
        View view;
        View findViewById;
        boolean z2;
        C0016q c0016q;
        int i;
        RecyclerView recyclerView;
        boolean g2;
        if (this.f1451k == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1453l == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        U u2 = this.f1440c0;
        u2.i = false;
        if (u2.d == 1) {
            p();
            this.f1453l.p0(this);
            q();
        } else {
            H.e eVar = this.d;
            if ((((ArrayList) eVar.d).isEmpty() || ((ArrayList) eVar.f206c).isEmpty()) && this.f1453l.f1973n == getWidth() && this.f1453l.f1974o == getHeight()) {
                this.f1453l.p0(this);
            } else {
                this.f1453l.p0(this);
                q();
            }
        }
        u2.a(4);
        a0();
        P();
        u2.d = 1;
        boolean z3 = u2.f2002j;
        View view2 = null;
        Long l2 = null;
        O o2 = this.f1437b;
        j jVar = this.f1444f;
        if (z3) {
            int f2 = this.f1442e.f() - 1;
            while (f2 >= 0) {
                X I2 = I(this.f1442e.e(f2));
                if (!I2.p()) {
                    long G2 = G(I2);
                    this.f1419H.getClass();
                    C0016q c0016q2 = new C0016q();
                    c0016q2.a(I2);
                    X x2 = (X) ((o.e) jVar.f29c).c(G2, l2);
                    if (x2 == null || x2.p()) {
                        jVar.a(I2, c0016q2);
                    } else {
                        k kVar = (k) jVar.f28b;
                        h0 h0Var = (h0) kVar.getOrDefault(x2, l2);
                        boolean z4 = (h0Var == null || (h0Var.f2090a & 1) == 0) ? false : true;
                        h0 h0Var2 = (h0) kVar.getOrDefault(I2, l2);
                        boolean z5 = (h0Var2 == null || (h0Var2.f2090a & 1) == 0) ? false : true;
                        if (z4 && x2 == I2) {
                            jVar.a(I2, c0016q2);
                        } else {
                            C0016q G3 = jVar.G(x2, 4);
                            jVar.a(I2, c0016q2);
                            C0016q G4 = jVar.G(I2, 8);
                            if (G3 == null) {
                                int f3 = this.f1442e.f();
                                for (int i2 = 0; i2 < f3; i2++) {
                                    X I3 = I(this.f1442e.e(i2));
                                    if (I3 != I2 && G(I3) == G2) {
                                        AbstractC0096A abstractC0096A = this.f1451k;
                                        if (abstractC0096A == null || !abstractC0096A.f1952b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I3 + " \n View Holder 2:" + I2 + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I3 + " \n View Holder 2:" + I2 + y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + x2 + " cannot be found but it is necessary for " + I2 + y());
                            } else {
                                x2.o(false);
                                if (z4) {
                                    f(x2);
                                }
                                if (x2 != I2) {
                                    if (z5) {
                                        f(I2);
                                    }
                                    x2.h = I2;
                                    f(x2);
                                    o2.j(x2);
                                    I2.o(false);
                                    I2.i = x2;
                                }
                                if (this.f1419H.a(x2, I2, G3, G4)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                f2--;
                l2 = null;
            }
            k kVar2 = (k) jVar.f28b;
            for (int i3 = kVar2.f3335c - 1; i3 >= 0; i3--) {
                X x3 = (X) kVar2.h(i3);
                h0 h0Var3 = (h0) kVar2.i(i3);
                int i4 = h0Var3.f2090a;
                int i5 = i4 & 3;
                C0121z c0121z = this.f1466r0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0121z.f2191a;
                    recyclerView2.f1453l.i0(x3.f2014a, recyclerView2.f1437b);
                } else if ((i4 & 1) != 0) {
                    C0016q c0016q3 = h0Var3.f2091b;
                    if (c0016q3 == null) {
                        RecyclerView recyclerView3 = c0121z.f2191a;
                        recyclerView3.f1453l.i0(x3.f2014a, recyclerView3.f1437b);
                    } else {
                        c0121z.g(x3, c0016q3, h0Var3.f2092c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0121z.f(x3, h0Var3.f2091b, h0Var3.f2092c);
                } else if ((i4 & 12) == 12) {
                    C0016q c0016q4 = h0Var3.f2091b;
                    C0016q c0016q5 = h0Var3.f2092c;
                    c0121z.getClass();
                    x3.o(false);
                    RecyclerView recyclerView4 = c0121z.f2191a;
                    if (!recyclerView4.f1473y) {
                        C0105i c0105i = (C0105i) recyclerView4.f1419H;
                        c0105i.getClass();
                        int i6 = c0016q4.f433a;
                        int i7 = c0016q5.f433a;
                        if (i6 == i7 && c0016q4.f434b == c0016q5.f434b) {
                            c0105i.c(x3);
                            recyclerView = recyclerView4;
                            g2 = false;
                        } else {
                            recyclerView = recyclerView4;
                            g2 = c0105i.g(x3, i6, c0016q4.f434b, i7, c0016q5.f434b);
                        }
                        if (g2) {
                            recyclerView.S();
                        }
                    } else if (recyclerView4.f1419H.a(x3, x3, c0016q4, c0016q5)) {
                        recyclerView4.S();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0016q = null;
                        c0121z.g(x3, h0Var3.f2091b, null);
                    } else {
                        c0016q = null;
                        if ((i4 & 8) != 0) {
                            c0121z.f(x3, h0Var3.f2091b, h0Var3.f2092c);
                        }
                    }
                    i = 0;
                    h0Var3.f2090a = i;
                    h0Var3.f2091b = c0016q;
                    h0Var3.f2092c = c0016q;
                    h0.d.c(h0Var3);
                }
                i = 0;
                c0016q = null;
                h0Var3.f2090a = i;
                h0Var3.f2091b = c0016q;
                h0Var3.f2092c = c0016q;
                h0.d.c(h0Var3);
            }
            view2 = null;
        }
        this.f1453l.h0(o2);
        u2.f1997b = u2.f1999e;
        this.f1473y = false;
        this.f1474z = false;
        u2.f2002j = false;
        u2.f2003k = false;
        this.f1453l.f1967f = false;
        ArrayList arrayList = o2.f1984b;
        if (arrayList != null) {
            arrayList.clear();
        }
        I i8 = this.f1453l;
        if (i8.f1970k) {
            i8.f1969j = 0;
            i8.f1970k = false;
            o2.k();
        }
        this.f1453l.c0(u2);
        Q(true);
        b0(false);
        ((k) jVar.f28b).clear();
        ((o.e) jVar.f29c).a();
        int[] iArr = this.f1452k0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        C(iArr);
        if ((iArr[0] == i9 && iArr[1] == i10) ? false : true) {
            t(0, 0);
        }
        if (this.f1433V && this.f1451k != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j2 = u2.f2005m;
            if (j2 != -1 && (z2 = this.f1451k.f1952b) && z2) {
                int m2 = this.f1442e.m();
                r10 = view2;
                int i11 = 0;
                while (true) {
                    if (i11 >= m2) {
                        break;
                    }
                    X I4 = I(this.f1442e.l(i11));
                    if (I4 != null && !I4.i() && I4.f2017e == j2) {
                        if (!((ArrayList) this.f1442e.d).contains(I4.f2014a)) {
                            r10 = I4;
                            break;
                        }
                        r10 = I4;
                    }
                    i11++;
                    r10 = r10;
                }
            } else {
                r10 = view2;
            }
            if (r10 != null) {
                ArrayList arrayList2 = (ArrayList) this.f1442e.d;
                view = r10.f2014a;
                if (!arrayList2.contains(view)) {
                }
            }
            if (this.f1442e.f() > 0) {
                int i12 = u2.f2004l;
                if (i12 == -1) {
                    i12 = 0;
                }
                int b2 = u2.b();
                for (int i13 = i12; i13 < b2; i13++) {
                    X E2 = E(i13);
                    if (E2 == null) {
                        break;
                    }
                    View view3 = E2.f2014a;
                    if (view3.hasFocusable()) {
                        view2 = view3;
                        break;
                    }
                }
                for (int min = Math.min(b2, i12) - 1; min >= 0; min--) {
                    X E3 = E(min);
                    if (E3 == null) {
                        break;
                    }
                    view = E3.f2014a;
                    if (view.hasFocusable()) {
                        view2 = view;
                        break;
                    }
                }
            }
            if (view2 != null) {
                int i14 = u2.f2006n;
                if (i14 != -1 && (findViewById = view2.findViewById(i14)) != null && findViewById.isFocusable()) {
                    view2 = findViewById;
                }
                view2.requestFocus();
            }
        }
        u2.f2005m = -1L;
        u2.f2004l = -1;
        u2.f2006n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.f1413A = 0;
        this.f1461p = true;
        this.f1465r = this.f1465r && !isLayoutRequested();
        I i = this.f1453l;
        if (i != null) {
            i.f1968g = true;
            i.Q(this);
        }
        this.f1449i0 = false;
        ThreadLocal threadLocal = RunnableC0111o.f2141e;
        RunnableC0111o runnableC0111o = (RunnableC0111o) threadLocal.get();
        this.f1436a0 = runnableC0111o;
        if (runnableC0111o == null) {
            RunnableC0111o runnableC0111o2 = new RunnableC0111o();
            runnableC0111o2.f2143a = new ArrayList();
            runnableC0111o2.d = new ArrayList();
            this.f1436a0 = runnableC0111o2;
            WeakHashMap weakHashMap = S.f360a;
            Display display = getDisplay();
            if (!isInEditMode() && display != null) {
                f2 = display.getRefreshRate();
            }
            f2 = 60.0f;
            RunnableC0111o runnableC0111o3 = this.f1436a0;
            runnableC0111o3.f2145c = (long) (1.0E9f / f2);
            threadLocal.set(runnableC0111o3);
        }
        this.f1436a0.f2143a.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0117v c0117v;
        super.onDetachedFromWindow();
        E e2 = this.f1419H;
        if (e2 != null) {
            e2.e();
        }
        setScrollState(0);
        W w2 = this.f1434W;
        w2.f2012g.removeCallbacks(w2);
        w2.f2009c.abortAnimation();
        I i = this.f1453l;
        if (i != null && (c0117v = i.f1966e) != null) {
            c0117v.i();
        }
        this.f1461p = false;
        I i2 = this.f1453l;
        if (i2 != null) {
            i2.f1968g = false;
            i2.R(this);
        }
        this.f1462p0.clear();
        removeCallbacks(this.f1464q0);
        this.f1444f.getClass();
        while (h0.d.a() != null) {
        }
        RunnableC0111o runnableC0111o = this.f1436a0;
        if (runnableC0111o != null) {
            runnableC0111o.f2143a.remove(this);
            this.f1436a0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1455m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((F) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f1453l != null && !this.f1469u && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f1453l.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1453l.d()) {
                    f3 = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || f3 != 0.0f) {
                        W((int) (f3 * this.f1431T), (int) (f2 * this.f1432U), motionEvent);
                    }
                }
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1431T), (int) (f2 * this.f1432U), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1453l.e()) {
                        f2 = -axisValue;
                        f3 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1431T), (int) (f2 * this.f1432U), motionEvent);
                    } else if (this.f1453l.d()) {
                        f3 = axisValue;
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        W((int) (f3 * this.f1431T), (int) (f2 * this.f1432U), motionEvent);
                    }
                }
                f2 = 0.0f;
                f3 = 0.0f;
                if (f2 == 0.0f) {
                }
                W((int) (f3 * this.f1431T), (int) (f2 * this.f1432U), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1469u) {
            return false;
        }
        this.f1459o = null;
        if (B(motionEvent)) {
            V();
            setScrollState(0);
            return true;
        }
        I i = this.f1453l;
        if (i == null) {
            return false;
        }
        boolean d = i.d();
        boolean e2 = this.f1453l.e();
        if (this.f1422K == null) {
            this.f1422K = VelocityTracker.obtain();
        }
        this.f1422K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1470v) {
                this.f1470v = false;
            }
            this.f1421J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f1425N = x2;
            this.f1423L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f1426O = y2;
            this.f1424M = y2;
            if (this.f1420I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c0(1);
            }
            int[] iArr = this.f1458n0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = d;
            if (e2) {
                i2 = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i2, 0);
        } else if (actionMasked == 1) {
            this.f1422K.clear();
            c0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1421J);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1421J + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1420I != 1) {
                int i3 = x3 - this.f1423L;
                int i4 = y3 - this.f1424M;
                if (d == 0 || Math.abs(i3) <= this.f1427P) {
                    z2 = false;
                } else {
                    this.f1425N = x3;
                    z2 = true;
                }
                if (e2 && Math.abs(i4) > this.f1427P) {
                    this.f1426O = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            V();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1421J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1425N = x4;
            this.f1423L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1426O = y4;
            this.f1424M = y4;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f1420I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = h.f179a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f1465r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        I i3 = this.f1453l;
        if (i3 == null) {
            n(i, i2);
            return;
        }
        boolean L2 = i3.L();
        U u2 = this.f1440c0;
        if (!L2) {
            if (this.f1463q) {
                this.f1453l.f1964b.n(i, i2);
                return;
            }
            if (u2.f2003k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0096A abstractC0096A = this.f1451k;
            if (abstractC0096A != null) {
                u2.f1999e = abstractC0096A.a();
            } else {
                u2.f1999e = 0;
            }
            a0();
            this.f1453l.f1964b.n(i, i2);
            b0(false);
            u2.f2001g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f1453l.f1964b.n(i, i2);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f1451k == null) {
            return;
        }
        if (u2.d == 1) {
            p();
        }
        this.f1453l.q0(i, i2);
        u2.i = true;
        q();
        this.f1453l.s0(i, i2);
        if (this.f1453l.v0()) {
            this.f1453l.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            u2.i = true;
            q();
            this.f1453l.s0(i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof Q)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Q q2 = (Q) parcelable;
        this.f1439c = q2;
        super.onRestoreInstanceState(q2.f672a);
        I i = this.f1453l;
        if (i == null || (parcelable2 = this.f1439c.f1989c) == null) {
            return;
        }
        i.d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Q q2 = new Q(super.onSaveInstanceState());
        Q q3 = this.f1439c;
        if (q3 != null) {
            q2.f1989c = q3.f1989c;
        } else {
            I i = this.f1453l;
            if (i != null) {
                q2.f1989c = i.e0();
            } else {
                q2.f1989c = null;
            }
        }
        return q2;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f1418G = null;
        this.f1417E = null;
        this.F = null;
        this.f1416D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0213  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        RecyclerView recyclerView2;
        int minFlingVelocity;
        boolean z3;
        int i;
        PointF a2;
        int i2;
        boolean z4;
        if (this.f1469u || this.f1470v) {
            return false;
        }
        C0108l c0108l = this.f1459o;
        if (c0108l == null) {
            z2 = motionEvent.getAction() == 0 ? false : B(motionEvent);
        } else {
            if (c0108l.f2129v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d = c0108l.d(motionEvent.getX(), motionEvent.getY());
                    boolean c2 = c0108l.c(motionEvent.getX(), motionEvent.getY());
                    if (d || c2) {
                        if (c2) {
                            c0108l.f2130w = 1;
                            c0108l.f2123p = (int) motionEvent.getX();
                        } else if (d) {
                            c0108l.f2130w = 2;
                            c0108l.f2120m = (int) motionEvent.getY();
                        }
                        c0108l.f(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0108l.f2129v == 2) {
                    c0108l.f2120m = 0.0f;
                    c0108l.f2123p = 0.0f;
                    c0108l.f(1);
                    c0108l.f2130w = 0;
                } else if (motionEvent.getAction() == 2 && c0108l.f2129v == 2) {
                    c0108l.g();
                    int i3 = c0108l.f2130w;
                    int i4 = c0108l.f2112b;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0108l.f2132y;
                        iArr[0] = i4;
                        int i5 = c0108l.f2124q - i4;
                        iArr[1] = i5;
                        float max = Math.max(i4, Math.min(i5, x2));
                        if (Math.abs(c0108l.f2122o - max) >= 2.0f) {
                            int e2 = C0108l.e(c0108l.f2123p, max, iArr, c0108l.f2126s.computeHorizontalScrollRange(), c0108l.f2126s.computeHorizontalScrollOffset(), c0108l.f2124q);
                            if (e2 != 0) {
                                c0108l.f2126s.scrollBy(e2, 0);
                            }
                            c0108l.f2123p = max;
                        }
                    }
                    if (c0108l.f2130w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0108l.f2131x;
                        iArr2[0] = i4;
                        int i6 = c0108l.f2125r - i4;
                        iArr2[1] = i6;
                        float max2 = Math.max(i4, Math.min(i6, y2));
                        if (Math.abs(c0108l.f2119l - max2) >= 2.0f) {
                            int e3 = C0108l.e(c0108l.f2120m, max2, iArr2, c0108l.f2126s.computeVerticalScrollRange(), c0108l.f2126s.computeVerticalScrollOffset(), c0108l.f2125r);
                            if (e3 != 0) {
                                c0108l.f2126s.scrollBy(0, e3);
                            }
                            c0108l.f2120m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f1459o = null;
            }
            z2 = true;
        }
        if (z2) {
            V();
            setScrollState(0);
            return true;
        }
        I i7 = this.f1453l;
        if (i7 == null) {
            return false;
        }
        boolean d2 = i7.d();
        boolean e4 = this.f1453l.e();
        if (this.f1422K == null) {
            this.f1422K = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f1458n0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = obtain;
            recyclerView.f1421J = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f1425N = x3;
            recyclerView.f1423L = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f1426O = y3;
            recyclerView.f1424M = y3;
            int i8 = d2;
            if (e4) {
                i8 = (d2 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i8, 0);
        } else {
            if (actionMasked == 1) {
                this.f1422K.addMovement(obtain);
                VelocityTracker velocityTracker = this.f1422K;
                int i9 = this.f1430S;
                velocityTracker.computeCurrentVelocity(1000, i9);
                float f2 = d2 != 0 ? -this.f1422K.getXVelocity(this.f1421J) : 0.0f;
                float f3 = e4 ? -this.f1422K.getYVelocity(this.f1421J) : 0.0f;
                if (f2 == 0.0f && f3 == 0.0f) {
                    recyclerView2 = this;
                    i2 = 0;
                    motionEvent4 = obtain;
                } else {
                    int i10 = (int) f2;
                    int i11 = (int) f3;
                    I i12 = this.f1453l;
                    if (i12 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f1469u) {
                        int d3 = i12.d();
                        boolean e5 = this.f1453l.e();
                        int i13 = this.f1429R;
                        if (d3 == 0 || Math.abs(i10) < i13) {
                            i10 = 0;
                        }
                        if (!e5 || Math.abs(i11) < i13) {
                            i11 = 0;
                        }
                        if (i10 != 0 || i11 != 0) {
                            float f4 = i10;
                            float f5 = i11;
                            if (!dispatchNestedPreFling(f4, f5)) {
                                boolean z5 = d3 != 0 || e5;
                                dispatchNestedFling(f4, f5, z5);
                                K k2 = this.f1428Q;
                                if (k2 != null) {
                                    C0120y c0120y = (C0120y) k2;
                                    I layoutManager = c0120y.f2188a.getLayoutManager();
                                    if (layoutManager != 0 && c0120y.f2188a.getAdapter() != null && ((Math.abs(i11) > (minFlingVelocity = c0120y.f2188a.getMinFlingVelocity()) || Math.abs(i10) > minFlingVelocity) && ((z3 = layoutManager instanceof T)))) {
                                        C0119x c0119x = !z3 ? null : new C0119x(c0120y, c0120y.f2188a.getContext(), 0);
                                        if (c0119x != null) {
                                            int B2 = layoutManager.B();
                                            if (B2 != 0) {
                                                g e6 = layoutManager.e() ? c0120y.e(layoutManager) : layoutManager.d() ? c0120y.d(layoutManager) : null;
                                                if (e6 != null) {
                                                    int v2 = layoutManager.v();
                                                    motionEvent4 = obtain;
                                                    int i14 = Integer.MIN_VALUE;
                                                    int i15 = Integer.MAX_VALUE;
                                                    int i16 = 0;
                                                    View view = null;
                                                    View view2 = null;
                                                    while (i16 < v2) {
                                                        int i17 = v2;
                                                        View u2 = layoutManager.u(i16);
                                                        if (u2 != null) {
                                                            int b2 = C0120y.b(u2, e6);
                                                            if (b2 <= 0 && b2 > i14) {
                                                                i14 = b2;
                                                                view2 = u2;
                                                            }
                                                            if (b2 >= 0 && b2 < i15) {
                                                                i15 = b2;
                                                                view = u2;
                                                            }
                                                        }
                                                        i16++;
                                                        v2 = i17;
                                                    }
                                                    boolean z6 = !layoutManager.d() ? i11 <= 0 : i10 <= 0;
                                                    if (z6 && view != null) {
                                                        i = I.H(view);
                                                    } else if (z6 || view2 == null) {
                                                        if (z6) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int H2 = ((z3 && (a2 = ((T) layoutManager).a(layoutManager.B() - 1)) != null && ((a2.x > 0.0f ? 1 : (a2.x == 0.0f ? 0 : -1)) < 0 || (a2.y > 0.0f ? 1 : (a2.y == 0.0f ? 0 : -1)) < 0)) == z6 ? -1 : 1) + I.H(view);
                                                            if (H2 >= 0 && H2 < B2) {
                                                                i = H2;
                                                            }
                                                        }
                                                        i = -1;
                                                    } else {
                                                        i = I.H(view2);
                                                    }
                                                    if (i != -1) {
                                                        c0119x.f2173a = i;
                                                        layoutManager.y0(c0119x);
                                                        V();
                                                        motionEvent3 = motionEvent4;
                                                        motionEvent3.recycle();
                                                        return true;
                                                    }
                                                    if (z5) {
                                                        if (e5) {
                                                            d3 = (d3 == true ? 1 : 0) | 2;
                                                        }
                                                        getScrollingChildHelper().g(d3, 1);
                                                        int i18 = -i9;
                                                        int max3 = Math.max(i18, Math.min(i10, i9));
                                                        int max4 = Math.max(i18, Math.min(i11, i9));
                                                        W w2 = this.f1434W;
                                                        RecyclerView recyclerView3 = w2.f2012g;
                                                        recyclerView3.setScrollState(2);
                                                        w2.f2008b = 0;
                                                        w2.f2007a = 0;
                                                        Interpolator interpolator = w2.d;
                                                        d dVar = f1412u0;
                                                        if (interpolator != dVar) {
                                                            w2.d = dVar;
                                                            w2.f2009c = new OverScroller(recyclerView3.getContext(), dVar);
                                                        }
                                                        w2.f2009c.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                        w2.a();
                                                        V();
                                                        motionEvent3 = motionEvent4;
                                                        motionEvent3.recycle();
                                                        return true;
                                                    }
                                                    recyclerView2 = this;
                                                    i2 = 0;
                                                }
                                            }
                                            motionEvent4 = obtain;
                                            i = -1;
                                            if (i != -1) {
                                            }
                                            if (z5) {
                                            }
                                        }
                                    }
                                }
                                motionEvent4 = obtain;
                                if (z5) {
                                }
                            }
                        }
                    }
                    recyclerView2 = this;
                    motionEvent4 = obtain;
                    i2 = 0;
                }
                recyclerView2.setScrollState(i2);
                V();
                motionEvent3 = motionEvent4;
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1421J);
                if (findPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1421J + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                int i19 = this.f1425N - x4;
                int i20 = this.f1426O - y4;
                if (this.f1420I != 1) {
                    if (d2 != 0) {
                        i19 = i19 > 0 ? Math.max(0, i19 - this.f1427P) : Math.min(0, i19 + this.f1427P);
                        if (i19 != 0) {
                            z4 = true;
                            if (e4) {
                                i20 = i20 > 0 ? Math.max(0, i20 - this.f1427P) : Math.min(0, i20 + this.f1427P);
                                if (i20 != 0) {
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
                int i21 = i19;
                int i22 = i20;
                if (this.f1420I == 1) {
                    int[] iArr4 = this.f1460o0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean r2 = r(d2 != 0 ? i21 : 0, e4 ? i22 : 0, iArr4, this.f1456m0, 0);
                    int[] iArr5 = this.f1456m0;
                    if (r2) {
                        i21 -= iArr4[0];
                        i22 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i23 = i21;
                    int i24 = i22;
                    this.f1425N = x4 - iArr5[0];
                    this.f1426O = y4 - iArr5[1];
                    if (W(d2 != 0 ? i23 : 0, e4 ? i24 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0111o runnableC0111o = this.f1436a0;
                    if (runnableC0111o != null && (i23 != 0 || i24 != 0)) {
                        runnableC0111o.a(this, i23, i24);
                    }
                }
            } else if (actionMasked == 3) {
                V();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f1421J = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f1425N = x5;
                this.f1423L = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f1426O = y5;
                this.f1424M = y5;
            } else if (actionMasked == 6) {
                R(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = obtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f1422K.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        View A2;
        int F;
        View view;
        h0 h0Var;
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
        C0097a h;
        int i5;
        int i6;
        C0097a c0097a;
        U u2 = this.f1440c0;
        u2.a(1);
        z(u2);
        u2.i = false;
        a0();
        j jVar = this.f1444f;
        ((k) jVar.f28b).clear();
        o.e eVar = (o.e) jVar.f29c;
        eVar.a();
        P();
        if (this.f1473y) {
            H.e eVar2 = this.d;
            eVar2.j((ArrayList) eVar2.f206c);
            eVar2.j((ArrayList) eVar2.d);
            if (this.f1474z) {
                this.f1453l.X();
            }
        }
        if (this.f1419H == null || !this.f1453l.z0()) {
            this.d.b();
        } else {
            H.e eVar3 = this.d;
            ArrayList arrayList = (ArrayList) eVar3.f206c;
            C.g gVar = (C.g) eVar3.f208f;
            gVar.getClass();
            while (true) {
                int size = arrayList.size() - 1;
                boolean z7 = false;
                while (true) {
                    i = 8;
                    if (size < 0) {
                        size = -1;
                        break;
                    }
                    if (((C0097a) arrayList.get(size)).f2031a == 8) {
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
                C0097a c0097a2 = (C0097a) arrayList.get(size);
                C0097a c0097a3 = (C0097a) arrayList.get(i7);
                int i8 = c0097a3.f2031a;
                if (i8 != 1) {
                    C0097a c0097a4 = null;
                    H.e eVar4 = (H.e) gVar.f62b;
                    if (i8 == 2) {
                        int i9 = c0097a2.f2032b;
                        int i10 = c0097a2.f2033c;
                        if (i9 < i10) {
                            if (c0097a3.f2032b == i9 && c0097a3.f2033c == i10 - i9) {
                                z5 = false;
                                z6 = true;
                            } else {
                                z5 = false;
                                z6 = false;
                            }
                        } else if (c0097a3.f2032b == i10 + 1 && c0097a3.f2033c == i9 - i10) {
                            z5 = true;
                            z6 = true;
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        int i11 = c0097a3.f2032b;
                        if (i10 < i11) {
                            c0097a3.f2032b = i11 - 1;
                        } else {
                            int i12 = c0097a3.f2033c;
                            if (i10 < i11 + i12) {
                                c0097a3.f2033c = i12 - 1;
                                c0097a2.f2031a = 2;
                                c0097a2.f2033c = 1;
                                if (c0097a3.f2033c == 0) {
                                    arrayList.remove(i7);
                                    eVar4.getClass();
                                    ((b) eVar4.f205b).c(c0097a3);
                                }
                            }
                        }
                        int i13 = c0097a2.f2032b;
                        int i14 = c0097a3.f2032b;
                        if (i13 <= i14) {
                            c0097a3.f2032b = i14 + 1;
                        } else {
                            int i15 = i14 + c0097a3.f2033c;
                            if (i13 < i15) {
                                c0097a4 = eVar4.h(2, i13 + 1, i15 - i13);
                                c0097a3.f2033c = c0097a2.f2032b - c0097a3.f2032b;
                            }
                        }
                        C0097a c0097a5 = c0097a4;
                        if (z6) {
                            arrayList.set(size, c0097a3);
                            arrayList.remove(i7);
                            eVar4.getClass();
                            ((b) eVar4.f205b).c(c0097a2);
                        } else {
                            if (z5) {
                                if (c0097a5 != null) {
                                    int i16 = c0097a2.f2032b;
                                    if (i16 > c0097a5.f2032b) {
                                        c0097a2.f2032b = i16 - c0097a5.f2033c;
                                    }
                                    int i17 = c0097a2.f2033c;
                                    if (i17 > c0097a5.f2032b) {
                                        c0097a2.f2033c = i17 - c0097a5.f2033c;
                                    }
                                }
                                int i18 = c0097a2.f2032b;
                                if (i18 > c0097a3.f2032b) {
                                    c0097a2.f2032b = i18 - c0097a3.f2033c;
                                }
                                int i19 = c0097a2.f2033c;
                                if (i19 > c0097a3.f2032b) {
                                    c0097a2.f2033c = i19 - c0097a3.f2033c;
                                }
                            } else {
                                if (c0097a5 != null) {
                                    int i20 = c0097a2.f2032b;
                                    if (i20 >= c0097a5.f2032b) {
                                        c0097a2.f2032b = i20 - c0097a5.f2033c;
                                    }
                                    int i21 = c0097a2.f2033c;
                                    if (i21 >= c0097a5.f2032b) {
                                        c0097a2.f2033c = i21 - c0097a5.f2033c;
                                    }
                                }
                                int i22 = c0097a2.f2032b;
                                if (i22 >= c0097a3.f2032b) {
                                    c0097a2.f2032b = i22 - c0097a3.f2033c;
                                }
                                int i23 = c0097a2.f2033c;
                                if (i23 >= c0097a3.f2032b) {
                                    c0097a2.f2033c = i23 - c0097a3.f2033c;
                                }
                            }
                            arrayList.set(size, c0097a3);
                            if (c0097a2.f2032b != c0097a2.f2033c) {
                                arrayList.set(i7, c0097a2);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c0097a5 != null) {
                                arrayList.add(size, c0097a5);
                            }
                        }
                    } else if (i8 == 4) {
                        int i24 = c0097a2.f2033c;
                        int i25 = c0097a3.f2032b;
                        if (i24 < i25) {
                            c0097a3.f2032b = i25 - 1;
                        } else {
                            int i26 = c0097a3.f2033c;
                            if (i24 < i25 + i26) {
                                c0097a3.f2033c = i26 - 1;
                                h = eVar4.h(4, c0097a2.f2032b, 1);
                                i5 = c0097a2.f2032b;
                                i6 = c0097a3.f2032b;
                                if (i5 > i6) {
                                    c0097a3.f2032b = i6 + 1;
                                } else {
                                    int i27 = i6 + c0097a3.f2033c;
                                    if (i5 < i27) {
                                        int i28 = i27 - i5;
                                        c0097a4 = eVar4.h(4, i5 + 1, i28);
                                        c0097a3.f2033c -= i28;
                                    }
                                }
                                c0097a = c0097a4;
                                arrayList.set(i7, c0097a2);
                                if (c0097a3.f2033c <= 0) {
                                    arrayList.set(size, c0097a3);
                                } else {
                                    arrayList.remove(size);
                                    eVar4.getClass();
                                    ((b) eVar4.f205b).c(c0097a3);
                                }
                                if (h != null) {
                                    arrayList.add(size, h);
                                }
                                if (c0097a == null) {
                                    arrayList.add(size, c0097a);
                                }
                            }
                        }
                        h = null;
                        i5 = c0097a2.f2032b;
                        i6 = c0097a3.f2032b;
                        if (i5 > i6) {
                        }
                        c0097a = c0097a4;
                        arrayList.set(i7, c0097a2);
                        if (c0097a3.f2033c <= 0) {
                        }
                        if (h != null) {
                        }
                        if (c0097a == null) {
                        }
                    }
                } else {
                    int i29 = c0097a2.f2033c;
                    int i30 = c0097a3.f2032b;
                    int i31 = i29 < i30 ? -1 : 0;
                    int i32 = c0097a2.f2032b;
                    if (i32 < i30) {
                        i31++;
                    }
                    if (i30 <= i32) {
                        c0097a2.f2032b = i32 + c0097a3.f2033c;
                    }
                    int i33 = c0097a3.f2032b;
                    if (i33 <= i29) {
                        c0097a2.f2033c = i29 + c0097a3.f2033c;
                    }
                    c0097a3.f2032b = i33 + i31;
                    arrayList.set(size, c0097a3);
                    arrayList.set(i7, c0097a2);
                }
            }
            int size2 = arrayList.size();
            int i34 = 0;
            while (i34 < size2) {
                C0097a c0097a6 = (C0097a) arrayList.get(i34);
                int i35 = c0097a6.f2031a;
                if (i35 != 1) {
                    b bVar = (b) eVar3.f205b;
                    C0121z c0121z = (C0121z) eVar3.f207e;
                    if (i35 == 2) {
                        i2 = size2;
                        int i36 = c0097a6.f2032b;
                        int i37 = c0097a6.f2033c + i36;
                        int i38 = i36;
                        int i39 = 0;
                        char c3 = 65535;
                        while (i38 < i37) {
                            if (c0121z.b(i38) != null || eVar3.a(i38)) {
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
                        if (i39 != c0097a6.f2033c) {
                            bVar.c(c0097a6);
                            c0097a6 = eVar3.h(2, i36, i39);
                        }
                        if (c3 == 0) {
                            eVar3.c(c0097a6);
                        } else {
                            eVar3.i(c0097a6);
                        }
                    } else if (i35 != 4) {
                        if (i35 == i) {
                            eVar3.i(c0097a6);
                        }
                        i2 = size2;
                    } else {
                        int i40 = c0097a6.f2032b;
                        int i41 = c0097a6.f2033c + i40;
                        int i42 = i40;
                        char c4 = 65535;
                        int i43 = 0;
                        while (i40 < i41) {
                            if (c0121z.b(i40) != null || eVar3.a(i40)) {
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
                        if (i43 != c0097a6.f2033c) {
                            bVar.c(c0097a6);
                            c0097a6 = eVar3.h(4, i42, i43);
                        }
                        if (c4 == 0) {
                            eVar3.c(c0097a6);
                        } else {
                            eVar3.i(c0097a6);
                        }
                    }
                } else {
                    i2 = size2;
                    eVar3.i(c0097a6);
                }
                i34++;
                size2 = i2;
                i = 8;
            }
            arrayList.clear();
        }
        boolean z8 = this.f1445f0 || this.f1447g0;
        boolean z9 = this.f1465r && this.f1419H != null && ((z2 = this.f1473y) || z8 || this.f1453l.f1967f) && (!z2 || this.f1451k.f1952b);
        U u3 = this.f1440c0;
        u3.f2002j = z9;
        u3.f2003k = z9 && z8 && !this.f1473y && this.f1419H != null && this.f1453l.z0();
        View focusedChild = (this.f1433V && hasFocus() && this.f1451k != null) ? getFocusedChild() : null;
        X H2 = (focusedChild == null || (A2 = A(focusedChild)) == null) ? null : H(A2);
        if (H2 == null) {
            u2.f2005m = -1L;
            u2.f2004l = -1;
            u2.f2006n = -1;
        } else {
            u2.f2005m = this.f1451k.f1952b ? H2.f2017e : -1L;
            if (!this.f1473y) {
                if (H2.i()) {
                    F = H2.d;
                } else {
                    RecyclerView recyclerView = H2.f2028r;
                    if (recyclerView != null) {
                        F = recyclerView.F(H2);
                    }
                }
                u2.f2004l = F;
                view = H2.f2014a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                u2.f2006n = id;
            }
            F = -1;
            u2.f2004l = F;
            view = H2.f2014a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            u2.f2006n = id2;
        }
        u2.h = u2.f2002j && this.f1447g0;
        this.f1447g0 = false;
        this.f1445f0 = false;
        u2.f2001g = u2.f2003k;
        u2.f1999e = this.f1451k.a();
        C(this.f1452k0);
        boolean z10 = u2.f2002j;
        k kVar = (k) jVar.f28b;
        if (z10) {
            int f2 = this.f1442e.f();
            for (int i44 = 0; i44 < f2; i44++) {
                X I2 = I(this.f1442e.e(i44));
                if (!I2.p() && (!I2.g() || this.f1451k.f1952b)) {
                    E e2 = this.f1419H;
                    E.b(I2);
                    I2.c();
                    e2.getClass();
                    C0016q c0016q = new C0016q();
                    c0016q.a(I2);
                    h0 h0Var2 = (h0) kVar.getOrDefault(I2, null);
                    if (h0Var2 == null) {
                        h0Var2 = h0.a();
                        kVar.put(I2, h0Var2);
                    }
                    h0Var2.f2091b = c0016q;
                    h0Var2.f2090a |= 4;
                    if (u2.h && I2.l() && !I2.i() && !I2.p() && !I2.g()) {
                        eVar.d(G(I2), I2);
                    }
                }
            }
        }
        if (u2.f2003k) {
            int m2 = this.f1442e.m();
            for (int i45 = 0; i45 < m2; i45++) {
                X I3 = I(this.f1442e.l(i45));
                if (!I3.p() && I3.d == -1) {
                    I3.d = I3.f2016c;
                }
            }
            boolean z11 = u2.f2000f;
            u2.f2000f = false;
            this.f1453l.b0(this.f1437b, u2);
            u2.f2000f = z11;
            for (int i46 = 0; i46 < this.f1442e.f(); i46++) {
                X I4 = I(this.f1442e.e(i46));
                if (!I4.p() && ((h0Var = (h0) kVar.getOrDefault(I4, null)) == null || (h0Var.f2090a & 4) == 0)) {
                    E.b(I4);
                    boolean d = I4.d(8192);
                    E e3 = this.f1419H;
                    I4.c();
                    e3.getClass();
                    C0016q c0016q2 = new C0016q();
                    c0016q2.a(I4);
                    if (d) {
                        T(I4, c0016q2);
                    } else {
                        h0 h0Var3 = (h0) kVar.getOrDefault(I4, null);
                        if (h0Var3 == null) {
                            h0Var3 = h0.a();
                            kVar.put(I4, h0Var3);
                        }
                        h0Var3.f2090a |= 2;
                        h0Var3.f2091b = c0016q2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        b0(false);
        u2.d = 2;
    }

    public final void q() {
        a0();
        P();
        U u2 = this.f1440c0;
        u2.a(6);
        this.d.b();
        u2.f1999e = this.f1451k.a();
        u2.f1998c = 0;
        u2.f2001g = false;
        this.f1453l.b0(this.f1437b, u2);
        u2.f2000f = false;
        this.f1439c = null;
        u2.f2002j = u2.f2002j && this.f1419H != null;
        u2.d = 4;
        Q(true);
        b0(false);
    }

    public final boolean r(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        X I2 = I(view);
        if (I2 != null) {
            if (I2.k()) {
                I2.f2020j &= -257;
            } else if (!I2.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0117v c0117v = this.f1453l.f1966e;
        if ((c0117v == null || !c0117v.f2176e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1453l.k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f1457n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0108l) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1467s != 0 || this.f1469u) {
            this.f1468t = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        I i3 = this.f1453l;
        if (i3 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1469u) {
            return;
        }
        boolean d = i3.d();
        boolean e2 = this.f1453l.e();
        if (d || e2) {
            if (!d) {
                i = 0;
            }
            if (!e2) {
                i2 = 0;
            }
            W(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1471w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Z z2) {
        this.j0 = z2;
        S.l(this, z2);
    }

    public void setAdapter(AbstractC0096A abstractC0096A) {
        setLayoutFrozen(false);
        AbstractC0096A abstractC0096A2 = this.f1451k;
        e eVar = this.f1435a;
        if (abstractC0096A2 != null) {
            abstractC0096A2.f1951a.unregisterObserver(eVar);
            this.f1451k.getClass();
        }
        E e2 = this.f1419H;
        if (e2 != null) {
            e2.e();
        }
        I i = this.f1453l;
        O o2 = this.f1437b;
        if (i != null) {
            i.g0(o2);
            this.f1453l.h0(o2);
        }
        o2.f1983a.clear();
        o2.d();
        H.e eVar2 = this.d;
        eVar2.j((ArrayList) eVar2.f206c);
        eVar2.j((ArrayList) eVar2.d);
        AbstractC0096A abstractC0096A3 = this.f1451k;
        this.f1451k = abstractC0096A;
        if (abstractC0096A != null) {
            abstractC0096A.f1951a.registerObserver(eVar);
        }
        AbstractC0096A abstractC0096A4 = this.f1451k;
        o2.f1983a.clear();
        o2.d();
        N c2 = o2.c();
        if (abstractC0096A3 != null) {
            c2.f1982b--;
        }
        if (c2.f1982b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c2.f1981a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((M) sparseArray.valueAt(i2)).f1978a.clear();
                i2++;
            }
        }
        if (abstractC0096A4 != null) {
            c2.f1982b++;
        }
        this.f1440c0.f2000f = true;
        this.f1474z |= false;
        this.f1473y = true;
        int m2 = this.f1442e.m();
        for (int i3 = 0; i3 < m2; i3++) {
            X I2 = I(this.f1442e.l(i3));
            if (I2 != null && !I2.p()) {
                I2.a(6);
            }
        }
        N();
        O o3 = this.f1437b;
        ArrayList arrayList = o3.f1985c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x2 = (X) arrayList.get(i4);
            if (x2 != null) {
                x2.a(6);
                x2.a(1024);
            }
        }
        AbstractC0096A abstractC0096A5 = o3.h.f1451k;
        if (abstractC0096A5 == null || !abstractC0096A5.f1952b) {
            o3.d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C c2) {
        if (c2 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1446g) {
            this.f1418G = null;
            this.f1417E = null;
            this.F = null;
            this.f1416D = null;
        }
        this.f1446g = z2;
        super.setClipToPadding(z2);
        if (this.f1465r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(D d) {
        d.getClass();
        this.f1415C = d;
        this.f1418G = null;
        this.f1417E = null;
        this.F = null;
        this.f1416D = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f1463q = z2;
    }

    public void setItemAnimator(E e2) {
        E e3 = this.f1419H;
        if (e3 != null) {
            e3.e();
            this.f1419H.f1953a = null;
        }
        this.f1419H = e2;
        if (e2 != null) {
            e2.f1953a = this.f1448h0;
        }
    }

    public void setItemViewCacheSize(int i) {
        O o2 = this.f1437b;
        o2.f1986e = i;
        o2.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(I i) {
        RecyclerView recyclerView;
        C0117v c0117v;
        if (i == this.f1453l) {
            return;
        }
        setScrollState(0);
        W w2 = this.f1434W;
        w2.f2012g.removeCallbacks(w2);
        w2.f2009c.abortAnimation();
        I i2 = this.f1453l;
        if (i2 != null && (c0117v = i2.f1966e) != null) {
            c0117v.i();
        }
        I i3 = this.f1453l;
        O o2 = this.f1437b;
        if (i3 != null) {
            E e2 = this.f1419H;
            if (e2 != null) {
                e2.e();
            }
            this.f1453l.g0(o2);
            this.f1453l.h0(o2);
            o2.f1983a.clear();
            o2.d();
            if (this.f1461p) {
                I i4 = this.f1453l;
                i4.f1968g = false;
                i4.R(this);
            }
            this.f1453l.t0(null);
            this.f1453l = null;
        } else {
            o2.f1983a.clear();
            o2.d();
        }
        C0011l c0011l = this.f1442e;
        ((C0098b) c0011l.f414c).h();
        ArrayList arrayList = (ArrayList) c0011l.d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0121z) c0011l.f413b).f2191a;
            if (size < 0) {
                break;
            }
            X I2 = I((View) arrayList.get(size));
            if (I2 != null) {
                int i5 = I2.f2026p;
                if (recyclerView.L()) {
                    I2.f2027q = i5;
                    recyclerView.f1462p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f360a;
                    I2.f2014a.setImportantForAccessibility(i5);
                }
                I2.f2026p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1453l = i;
        if (i != null) {
            if (i.f1964b != null) {
                throw new IllegalArgumentException("LayoutManager " + i + " is already attached to a RecyclerView:" + i.f1964b.y());
            }
            i.t0(this);
            if (this.f1461p) {
                I i7 = this.f1453l;
                i7.f1968g = true;
                i7.Q(this);
            }
        }
        o2.k();
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
        C0013n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = S.f360a;
            G.z(scrollingChildHelper.f422c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(K k2) {
        this.f1428Q = k2;
    }

    @Deprecated
    public void setOnScrollListener(L l2) {
        this.f1441d0 = l2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1433V = z2;
    }

    public void setRecycledViewPool(N n2) {
        O o2 = this.f1437b;
        if (o2.f1988g != null) {
            r1.f1982b--;
        }
        o2.f1988g = n2;
        if (n2 == null || o2.h.getAdapter() == null) {
            return;
        }
        o2.f1988g.f1982b++;
    }

    public void setRecyclerListener(P p2) {
    }

    public void setScrollState(int i) {
        C0117v c0117v;
        if (i == this.f1420I) {
            return;
        }
        this.f1420I = i;
        if (i != 2) {
            W w2 = this.f1434W;
            w2.f2012g.removeCallbacks(w2);
            w2.f2009c.abortAnimation();
            I i2 = this.f1453l;
            if (i2 != null && (c0117v = i2.f1966e) != null) {
                c0117v.i();
            }
        }
        I i3 = this.f1453l;
        if (i3 != null) {
            i3.f0(i);
        }
        L l2 = this.f1441d0;
        if (l2 != null) {
            l2.a(this, i);
        }
        ArrayList arrayList = this.f1443e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1443e0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1427P = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1427P = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(V v2) {
        this.f1437b.getClass();
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
        C0117v c0117v;
        if (z2 != this.f1469u) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1469u = false;
                if (this.f1468t && this.f1453l != null && this.f1451k != null) {
                    requestLayout();
                }
                this.f1468t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1469u = true;
            this.f1470v = true;
            setScrollState(0);
            W w2 = this.f1434W;
            w2.f2012g.removeCallbacks(w2);
            w2.f2009c.abortAnimation();
            I i = this.f1453l;
            if (i == null || (c0117v = i.f1966e) == null) {
                return;
            }
            c0117v.i();
        }
    }

    public final void t(int i, int i2) {
        this.f1414B++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        L l2 = this.f1441d0;
        if (l2 != null) {
            l2.b(this, i, i2);
        }
        ArrayList arrayList = this.f1443e0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f1443e0.get(size)).b(this, i, i2);
            }
        }
        this.f1414B--;
    }

    public final void u() {
        if (this.f1418G != null) {
            return;
        }
        this.f1415C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1418G = edgeEffect;
        if (this.f1446g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f1416D != null) {
            return;
        }
        this.f1415C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1416D = edgeEffect;
        if (this.f1446g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.F != null) {
            return;
        }
        this.f1415C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.F = edgeEffect;
        if (this.f1446g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f1417E != null) {
            return;
        }
        this.f1415C.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f1417E = edgeEffect;
        if (this.f1446g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f1451k + ", layout:" + this.f1453l + ", context:" + getContext();
    }

    public final void z(U u2) {
        if (getScrollState() != 2) {
            u2.getClass();
            return;
        }
        OverScroller overScroller = this.f1434W.f2009c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        u2.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        TypedArray typedArray;
        TypedArray typedArray2;
        char c2;
        char c3;
        boolean z2;
        int i3;
        Object[] objArr;
        Constructor constructor;
        this.f1435a = new e(this);
        this.f1437b = new O(this);
        this.f1444f = new j(13);
        this.h = new Rect();
        this.i = new Rect();
        this.f1450j = new RectF();
        this.f1455m = new ArrayList();
        this.f1457n = new ArrayList();
        this.f1467s = 0;
        this.f1473y = false;
        this.f1474z = false;
        this.f1413A = 0;
        this.f1414B = 0;
        this.f1415C = new D();
        C0105i c0105i = new C0105i();
        c0105i.f1953a = null;
        c0105i.f1954b = new ArrayList();
        c0105i.f1955c = 120L;
        c0105i.d = 120L;
        c0105i.f1956e = 250L;
        c0105i.f1957f = 250L;
        c0105i.f2094g = true;
        c0105i.h = new ArrayList();
        c0105i.i = new ArrayList();
        c0105i.f2095j = new ArrayList();
        c0105i.f2096k = new ArrayList();
        c0105i.f2097l = new ArrayList();
        c0105i.f2098m = new ArrayList();
        c0105i.f2099n = new ArrayList();
        c0105i.f2100o = new ArrayList();
        c0105i.f2101p = new ArrayList();
        c0105i.f2102q = new ArrayList();
        c0105i.f2103r = new ArrayList();
        this.f1419H = c0105i;
        this.f1420I = 0;
        this.f1421J = -1;
        this.f1431T = Float.MIN_VALUE;
        this.f1432U = Float.MIN_VALUE;
        this.f1433V = true;
        this.f1434W = new W(this);
        this.f1438b0 = new C0109m();
        U u2 = new U();
        u2.f1996a = -1;
        u2.f1997b = 0;
        u2.f1998c = 0;
        u2.d = 1;
        u2.f1999e = 0;
        u2.f2000f = false;
        u2.f2001g = false;
        u2.h = false;
        u2.i = false;
        u2.f2002j = false;
        u2.f2003k = false;
        this.f1440c0 = u2;
        this.f1445f0 = false;
        this.f1447g0 = false;
        C0121z c0121z = new C0121z(this);
        this.f1448h0 = c0121z;
        this.f1449i0 = false;
        this.f1452k0 = new int[2];
        this.f1456m0 = new int[2];
        this.f1458n0 = new int[2];
        this.f1460o0 = new int[2];
        this.f1462p0 = new ArrayList();
        this.f1464q0 = new B(7, this);
        this.f1466r0 = new C0121z(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1427P = viewConfiguration.getScaledTouchSlop();
        this.f1431T = K.T.a(viewConfiguration);
        this.f1432U = K.T.b(viewConfiguration);
        this.f1429R = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1430S = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1419H.f1953a = c0121z;
        this.d = new H.e(new C0121z(this));
        this.f1442e = new C0011l(new C0121z(this));
        WeakHashMap weakHashMap = S.f360a;
        if (K.I.c(this) == 0) {
            K.I.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1472x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Z(this));
        int[] iArr = a.f1916a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            i2 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
            typedArray = obtainStyledAttributes;
        } else {
            i2 = 8;
            typedArray = obtainStyledAttributes;
        }
        String string = typedArray.getString(i2);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1446g = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            typedArray2 = typedArray;
            c2 = 3;
            c3 = 2;
            new C0108l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.fastscroll_margin));
        } else {
            typedArray2 = typedArray;
            c2 = 3;
            c3 = 2;
        }
        typedArray2.recycle();
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
                        constructor = asSubclass.getConstructor(f1411t0);
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
                                i3 = Build.VERSION.SDK_INT;
                                int[] iArr2 = f1410s0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
                                if (i3 >= 29) {
                                }
                                boolean z3 = obtainStyledAttributes2.getBoolean(0, z2);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z3);
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
                    i3 = Build.VERSION.SDK_INT;
                    int[] iArr22 = f1410s0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i, 0);
                    if (i3 >= 29) {
                        saveAttributeDataForStyleable(context, iArr22, attributeSet, obtainStyledAttributes22, i, 0);
                    }
                    boolean z32 = obtainStyledAttributes22.getBoolean(0, z2);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z32);
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
        i3 = Build.VERSION.SDK_INT;
        int[] iArr222 = f1410s0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i, 0);
        if (i3 >= 29) {
        }
        boolean z322 = obtainStyledAttributes222.getBoolean(0, z2);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z322);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        I i = this.f1453l;
        if (i != null) {
            return i.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}

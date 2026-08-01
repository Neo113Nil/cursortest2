package androidx.recyclerview.widget;

import T.e;
import U.g;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g0.C0125n;
import g0.C0129s;
import g0.C0130t;
import g0.C0131u;
import g0.C0132v;
import g0.C0133w;
import g0.H;
import g0.I;
import g0.J;
import g0.O;
import g0.U;
import g0.V;
import g0.Z;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends I implements U {

    /* renamed from: A, reason: collision with root package name */
    public final C0129s f1555A;

    /* renamed from: B, reason: collision with root package name */
    public final C0130t f1556B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1557C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1558D;

    /* renamed from: p, reason: collision with root package name */
    public int f1559p;

    /* renamed from: q, reason: collision with root package name */
    public C0131u f1560q;

    /* renamed from: r, reason: collision with root package name */
    public g f1561r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1562s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1563t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1564u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1565v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1566w;

    /* renamed from: x, reason: collision with root package name */
    public int f1567x;

    /* renamed from: y, reason: collision with root package name */
    public int f1568y;

    /* renamed from: z, reason: collision with root package name */
    public C0132v f1569z;

    public LinearLayoutManager(int i) {
        this.f1559p = 1;
        this.f1563t = false;
        this.f1564u = false;
        this.f1565v = false;
        this.f1566w = true;
        this.f1567x = -1;
        this.f1568y = Integer.MIN_VALUE;
        this.f1569z = null;
        this.f1555A = new C0129s();
        this.f1556B = new C0130t();
        this.f1557C = 2;
        this.f1558D = new int[2];
        b1(i);
        c(null);
        if (this.f1563t) {
            this.f1563t = false;
            n0();
        }
    }

    @Override // g0.I
    public boolean B0() {
        return this.f1569z == null && this.f1562s == this.f1565v;
    }

    public void C0(V v2, int[] iArr) {
        int i;
        int l2 = v2.f2374a != -1 ? this.f1561r.l() : 0;
        if (this.f1560q.f2547f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void D0(V v2, C0131u c0131u, C0125n c0125n) {
        int i = c0131u.d;
        if (i < 0 || i >= v2.b()) {
            return;
        }
        c0125n.a(i, Math.max(0, c0131u.f2548g));
    }

    public final int E0(V v2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1561r;
        boolean z2 = !this.f1566w;
        return e.n(v2, gVar, L0(z2), K0(z2), this, this.f1566w);
    }

    public final int F0(V v2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1561r;
        boolean z2 = !this.f1566w;
        return e.o(v2, gVar, L0(z2), K0(z2), this, this.f1566w, this.f1564u);
    }

    public final int G0(V v2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1561r;
        boolean z2 = !this.f1566w;
        return e.p(v2, gVar, L0(z2), K0(z2), this, this.f1566w);
    }

    public final int H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1559p == 1) ? 1 : Integer.MIN_VALUE : this.f1559p == 0 ? 1 : Integer.MIN_VALUE : this.f1559p == 1 ? -1 : Integer.MIN_VALUE : this.f1559p == 0 ? -1 : Integer.MIN_VALUE : (this.f1559p != 1 && U0()) ? -1 : 1 : (this.f1559p != 1 && U0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.f1560q == null) {
            C0131u c0131u = new C0131u();
            c0131u.f2543a = true;
            c0131u.h = 0;
            c0131u.i = 0;
            c0131u.f2550k = null;
            this.f1560q = c0131u;
        }
    }

    public final int J0(O o2, C0131u c0131u, V v2, boolean z2) {
        int i;
        int i2 = c0131u.f2545c;
        int i3 = c0131u.f2548g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0131u.f2548g = i3 + i2;
            }
            X0(o2, c0131u);
        }
        int i4 = c0131u.f2545c + c0131u.h;
        while (true) {
            if ((!c0131u.f2551l && i4 <= 0) || (i = c0131u.d) < 0 || i >= v2.b()) {
                break;
            }
            C0130t c0130t = this.f1556B;
            c0130t.f2540a = 0;
            c0130t.f2541b = false;
            c0130t.f2542c = false;
            c0130t.d = false;
            V0(o2, v2, c0131u, c0130t);
            if (!c0130t.f2541b) {
                int i5 = c0131u.f2544b;
                int i6 = c0130t.f2540a;
                c0131u.f2544b = (c0131u.f2547f * i6) + i5;
                if (!c0130t.f2542c || c0131u.f2550k != null || !v2.f2379g) {
                    c0131u.f2545c -= i6;
                    i4 -= i6;
                }
                int i7 = c0131u.f2548g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0131u.f2548g = i8;
                    int i9 = c0131u.f2545c;
                    if (i9 < 0) {
                        c0131u.f2548g = i8 + i9;
                    }
                    X0(o2, c0131u);
                }
                if (z2 && c0130t.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0131u.f2545c;
    }

    public final View K0(boolean z2) {
        return this.f1564u ? O0(0, v(), z2) : O0(v() - 1, -1, z2);
    }

    @Override // g0.I
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z2) {
        return this.f1564u ? O0(v() - 1, -1, z2) : O0(0, v(), z2);
    }

    public final int M0() {
        View O02 = O0(v() - 1, -1, false);
        if (O02 == null) {
            return -1;
        }
        return I.H(O02);
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        I0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f1561r.e(u(i)) < this.f1561r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1559p == 0 ? this.f2341c.x(i, i2, i3, i4) : this.d.x(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z2) {
        I0();
        int i3 = z2 ? 24579 : 320;
        return this.f1559p == 0 ? this.f2341c.x(i, i2, i3, 320) : this.d.x(i, i2, i3, 320);
    }

    public View P0(O o2, V v2, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        I0();
        int v3 = v();
        if (z3) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v3;
            i2 = 0;
            i3 = 1;
        }
        int b2 = v2.b();
        int k2 = this.f1561r.k();
        int g2 = this.f1561r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = I.H(u2);
            int e2 = this.f1561r.e(u2);
            int b3 = this.f1561r.b(u2);
            if (H2 >= 0 && H2 < b2) {
                if (!((J) u2.getLayoutParams()).f2351a.i()) {
                    boolean z4 = b3 <= k2 && e2 < k2;
                    boolean z5 = e2 >= g2 && b3 > g2;
                    if (!z4 && !z5) {
                        return u2;
                    }
                    if (z2) {
                        if (!z5) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                        view2 = u2;
                    } else {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u2;
                        }
                        view2 = u2;
                    }
                } else if (view3 == null) {
                    view3 = u2;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int Q0(int i, O o2, V v2, boolean z2) {
        int g2;
        int g3 = this.f1561r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -a1(-g3, o2, v2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1561r.g() - i3) <= 0) {
            return i2;
        }
        this.f1561r.p(g2);
        return g2 + i2;
    }

    public final int R0(int i, O o2, V v2, boolean z2) {
        int k2;
        int k3 = i - this.f1561r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -a1(k3, o2, v2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1561r.k()) <= 0) {
            return i2;
        }
        this.f1561r.p(-k2);
        return i2 - k2;
    }

    @Override // g0.I
    public final void S(RecyclerView recyclerView) {
    }

    public final View S0() {
        return u(this.f1564u ? 0 : v() - 1);
    }

    @Override // g0.I
    public View T(View view, int i, O o2, V v2) {
        int H02;
        Z0();
        if (v() == 0 || (H02 = H0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        d1(H02, (int) (this.f1561r.l() * 0.33333334f), false, v2);
        C0131u c0131u = this.f1560q;
        c0131u.f2548g = Integer.MIN_VALUE;
        c0131u.f2543a = false;
        J0(o2, c0131u, v2, true);
        View N02 = H02 == -1 ? this.f1564u ? N0(v() - 1, -1) : N0(0, v()) : this.f1564u ? N0(0, v()) : N0(v() - 1, -1);
        View T02 = H02 == -1 ? T0() : S0();
        if (!T02.hasFocusable()) {
            return N02;
        }
        if (N02 == null) {
            return null;
        }
        return T02;
    }

    public final View T0() {
        return u(this.f1564u ? v() - 1 : 0);
    }

    @Override // g0.I
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View O02 = O0(0, v(), false);
            accessibilityEvent.setFromIndex(O02 == null ? -1 : I.H(O02));
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final boolean U0() {
        return C() == 1;
    }

    public void V0(O o2, V v2, C0131u c0131u, C0130t c0130t) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0131u.b(o2);
        if (b2 == null) {
            c0130t.f2541b = true;
            return;
        }
        J j2 = (J) b2.getLayoutParams();
        if (c0131u.f2550k == null) {
            if (this.f1564u == (c0131u.f2547f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1564u == (c0131u.f2547f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        J j3 = (J) b2.getLayoutParams();
        Rect M2 = this.f2340b.M(b2);
        int i5 = M2.left + M2.right;
        int i6 = M2.top + M2.bottom;
        int w2 = I.w(d(), this.f2349n, this.f2347l, F() + E() + ((ViewGroup.MarginLayoutParams) j3).leftMargin + ((ViewGroup.MarginLayoutParams) j3).rightMargin + i5, ((ViewGroup.MarginLayoutParams) j3).width);
        int w3 = I.w(e(), this.f2350o, this.f2348m, D() + G() + ((ViewGroup.MarginLayoutParams) j3).topMargin + ((ViewGroup.MarginLayoutParams) j3).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) j3).height);
        if (w0(b2, w2, w3, j3)) {
            b2.measure(w2, w3);
        }
        c0130t.f2540a = this.f1561r.c(b2);
        if (this.f1559p == 1) {
            if (U0()) {
                i4 = this.f2349n - F();
                i = i4 - this.f1561r.d(b2);
            } else {
                i = E();
                i4 = this.f1561r.d(b2) + i;
            }
            if (c0131u.f2547f == -1) {
                i2 = c0131u.f2544b;
                i3 = i2 - c0130t.f2540a;
            } else {
                i3 = c0131u.f2544b;
                i2 = c0130t.f2540a + i3;
            }
        } else {
            int G2 = G();
            int d = this.f1561r.d(b2) + G2;
            if (c0131u.f2547f == -1) {
                int i7 = c0131u.f2544b;
                int i8 = i7 - c0130t.f2540a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = G2;
            } else {
                int i9 = c0131u.f2544b;
                int i10 = c0130t.f2540a + i9;
                i = i9;
                i2 = d;
                i3 = G2;
                i4 = i10;
            }
        }
        I.N(b2, i, i3, i4, i2);
        if (j2.f2351a.i() || j2.f2351a.l()) {
            c0130t.f2542c = true;
        }
        c0130t.d = b2.hasFocusable();
    }

    public void W0(O o2, V v2, C0129s c0129s, int i) {
    }

    public final void X0(O o2, C0131u c0131u) {
        if (!c0131u.f2543a || c0131u.f2551l) {
            return;
        }
        int i = c0131u.f2548g;
        int i2 = c0131u.i;
        if (c0131u.f2547f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1561r.f() - i) + i2;
            if (this.f1564u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1561r.e(u2) < f2 || this.f1561r.o(u2) < f2) {
                        Y0(o2, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1561r.e(u3) < f2 || this.f1561r.o(u3) < f2) {
                    Y0(o2, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int v3 = v();
        if (!this.f1564u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1561r.b(u4) > i6 || this.f1561r.n(u4) > i6) {
                    Y0(o2, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1561r.b(u5) > i6 || this.f1561r.n(u5) > i6) {
                Y0(o2, i8, i9);
                return;
            }
        }
    }

    public final void Y0(O o2, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                l0(i);
                o2.h(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            l0(i3);
            o2.h(u3);
        }
    }

    public final void Z0() {
        if (this.f1559p == 1 || !U0()) {
            this.f1564u = this.f1563t;
        } else {
            this.f1564u = !this.f1563t;
        }
    }

    @Override // g0.U
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < I.H(u(0))) != this.f1564u ? -1 : 1;
        return this.f1559p == 0 ? new PointF(i2, RecyclerView.f1570A0) : new PointF(RecyclerView.f1570A0, i2);
    }

    public final int a1(int i, O o2, V v2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        I0();
        this.f1560q.f2543a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        d1(i2, abs, true, v2);
        C0131u c0131u = this.f1560q;
        int J0 = J0(o2, c0131u, v2, false) + c0131u.f2548g;
        if (J0 < 0) {
            return 0;
        }
        if (abs > J0) {
            i = i2 * J0;
        }
        this.f1561r.p(-i);
        this.f1560q.f2549j = i;
        return i;
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        c(null);
        if (i != this.f1559p || this.f1561r == null) {
            g a2 = g.a(this, i);
            this.f1561r = a2;
            this.f1555A.f2536a = a2;
            this.f1559p = i;
            n0();
        }
    }

    @Override // g0.I
    public final void c(String str) {
        if (this.f1569z == null) {
            super.c(str);
        }
    }

    public void c1(boolean z2) {
        c(null);
        if (this.f1565v == z2) {
            return;
        }
        this.f1565v = z2;
        n0();
    }

    @Override // g0.I
    public final boolean d() {
        return this.f1559p == 0;
    }

    @Override // g0.I
    public void d0(O o2, V v2) {
        View focusedChild;
        View focusedChild2;
        View P02;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int Q02;
        int i6;
        View q2;
        int e2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f1569z == null && this.f1567x == -1) && v2.b() == 0) {
            i0(o2);
            return;
        }
        C0132v c0132v = this.f1569z;
        if (c0132v != null && (i8 = c0132v.f2552a) >= 0) {
            this.f1567x = i8;
        }
        I0();
        this.f1560q.f2543a = false;
        Z0();
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2339a.f2417c.contains(focusedChild)) {
            focusedChild = null;
        }
        C0129s c0129s = this.f1555A;
        if (!c0129s.f2539e || this.f1567x != -1 || this.f1569z != null) {
            c0129s.d();
            c0129s.d = this.f1564u ^ this.f1565v;
            if (!v2.f2379g && (i = this.f1567x) != -1) {
                if (i < 0 || i >= v2.b()) {
                    this.f1567x = -1;
                    this.f1568y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1567x;
                    c0129s.f2537b = i10;
                    C0132v c0132v2 = this.f1569z;
                    if (c0132v2 != null && c0132v2.f2552a >= 0) {
                        boolean z2 = c0132v2.f2554c;
                        c0129s.d = z2;
                        if (z2) {
                            c0129s.f2538c = this.f1561r.g() - this.f1569z.f2553b;
                        } else {
                            c0129s.f2538c = this.f1561r.k() + this.f1569z.f2553b;
                        }
                    } else if (this.f1568y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                c0129s.d = (this.f1567x < I.H(u(0))) == this.f1564u;
                            }
                            c0129s.a();
                        } else if (this.f1561r.c(q3) > this.f1561r.l()) {
                            c0129s.a();
                        } else if (this.f1561r.e(q3) - this.f1561r.k() < 0) {
                            c0129s.f2538c = this.f1561r.k();
                            c0129s.d = false;
                        } else if (this.f1561r.g() - this.f1561r.b(q3) < 0) {
                            c0129s.f2538c = this.f1561r.g();
                            c0129s.d = true;
                        } else {
                            c0129s.f2538c = c0129s.d ? this.f1561r.m() + this.f1561r.b(q3) : this.f1561r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1564u;
                        c0129s.d = z3;
                        if (z3) {
                            c0129s.f2538c = this.f1561r.g() - this.f1568y;
                        } else {
                            c0129s.f2538c = this.f1561r.k() + this.f1568y;
                        }
                    }
                    c0129s.f2539e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2340b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f2339a.f2417c.contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    J j2 = (J) focusedChild2.getLayoutParams();
                    if (!j2.f2351a.i() && j2.f2351a.b() >= 0 && j2.f2351a.b() < v2.b()) {
                        c0129s.c(focusedChild2, I.H(focusedChild2));
                        c0129s.f2539e = true;
                    }
                }
                boolean z4 = this.f1562s;
                boolean z5 = this.f1565v;
                if (z4 == z5 && (P02 = P0(o2, v2, c0129s.d, z5)) != null) {
                    c0129s.b(P02, I.H(P02));
                    if (!v2.f2379g && B0()) {
                        int e3 = this.f1561r.e(P02);
                        int b2 = this.f1561r.b(P02);
                        int k2 = this.f1561r.k();
                        int g2 = this.f1561r.g();
                        boolean z6 = b2 <= k2 && e3 < k2;
                        boolean z7 = e3 >= g2 && b2 > g2;
                        if (z6 || z7) {
                            if (c0129s.d) {
                                k2 = g2;
                            }
                            c0129s.f2538c = k2;
                        }
                    }
                    c0129s.f2539e = true;
                }
            }
            c0129s.a();
            c0129s.f2537b = this.f1565v ? v2.b() - 1 : 0;
            c0129s.f2539e = true;
        } else if (focusedChild != null && (this.f1561r.e(focusedChild) >= this.f1561r.g() || this.f1561r.b(focusedChild) <= this.f1561r.k())) {
            c0129s.c(focusedChild, I.H(focusedChild));
        }
        C0131u c0131u = this.f1560q;
        c0131u.f2547f = c0131u.f2549j >= 0 ? 1 : -1;
        int[] iArr = this.f1558D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(v2, iArr);
        int k3 = this.f1561r.k() + Math.max(0, iArr[0]);
        int h = this.f1561r.h() + Math.max(0, iArr[1]);
        if (v2.f2379g && (i6 = this.f1567x) != -1 && this.f1568y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1564u) {
                i7 = this.f1561r.g() - this.f1561r.b(q2);
                e2 = this.f1568y;
            } else {
                e2 = this.f1561r.e(q2) - this.f1561r.k();
                i7 = this.f1568y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k3 += i11;
            } else {
                h -= i11;
            }
        }
        if (!c0129s.d ? !this.f1564u : this.f1564u) {
            i9 = 1;
        }
        W0(o2, v2, c0129s, i9);
        p(o2);
        this.f1560q.f2551l = this.f1561r.i() == 0 && this.f1561r.f() == 0;
        this.f1560q.getClass();
        this.f1560q.i = 0;
        if (c0129s.d) {
            f1(c0129s.f2537b, c0129s.f2538c);
            C0131u c0131u2 = this.f1560q;
            c0131u2.h = k3;
            J0(o2, c0131u2, v2, false);
            C0131u c0131u3 = this.f1560q;
            i3 = c0131u3.f2544b;
            int i12 = c0131u3.d;
            int i13 = c0131u3.f2545c;
            if (i13 > 0) {
                h += i13;
            }
            e1(c0129s.f2537b, c0129s.f2538c);
            C0131u c0131u4 = this.f1560q;
            c0131u4.h = h;
            c0131u4.d += c0131u4.f2546e;
            J0(o2, c0131u4, v2, false);
            C0131u c0131u5 = this.f1560q;
            i2 = c0131u5.f2544b;
            int i14 = c0131u5.f2545c;
            if (i14 > 0) {
                f1(i12, i3);
                C0131u c0131u6 = this.f1560q;
                c0131u6.h = i14;
                J0(o2, c0131u6, v2, false);
                i3 = this.f1560q.f2544b;
            }
        } else {
            e1(c0129s.f2537b, c0129s.f2538c);
            C0131u c0131u7 = this.f1560q;
            c0131u7.h = h;
            J0(o2, c0131u7, v2, false);
            C0131u c0131u8 = this.f1560q;
            i2 = c0131u8.f2544b;
            int i15 = c0131u8.d;
            int i16 = c0131u8.f2545c;
            if (i16 > 0) {
                k3 += i16;
            }
            f1(c0129s.f2537b, c0129s.f2538c);
            C0131u c0131u9 = this.f1560q;
            c0131u9.h = k3;
            c0131u9.d += c0131u9.f2546e;
            J0(o2, c0131u9, v2, false);
            C0131u c0131u10 = this.f1560q;
            int i17 = c0131u10.f2544b;
            int i18 = c0131u10.f2545c;
            if (i18 > 0) {
                e1(i15, i2);
                C0131u c0131u11 = this.f1560q;
                c0131u11.h = i18;
                J0(o2, c0131u11, v2, false);
                i2 = this.f1560q.f2544b;
            }
            i3 = i17;
        }
        if (v() > 0) {
            if (this.f1564u ^ this.f1565v) {
                int Q03 = Q0(i2, o2, v2, true);
                i4 = i3 + Q03;
                i5 = i2 + Q03;
                Q02 = R0(i4, o2, v2, false);
            } else {
                int R02 = R0(i3, o2, v2, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                Q02 = Q0(i5, o2, v2, false);
            }
            i3 = i4 + Q02;
            i2 = i5 + Q02;
        }
        if (v2.f2381k && v() != 0 && !v2.f2379g && B0()) {
            List list2 = o2.d;
            int size = list2.size();
            int H2 = I.H(u(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                Z z8 = (Z) list2.get(i21);
                if (!z8.i()) {
                    boolean z9 = z8.b() < H2;
                    boolean z10 = this.f1564u;
                    View view = z8.f2392a;
                    if (z9 != z10) {
                        i19 += this.f1561r.c(view);
                    } else {
                        i20 += this.f1561r.c(view);
                    }
                }
            }
            this.f1560q.f2550k = list2;
            if (i19 > 0) {
                f1(I.H(T0()), i3);
                C0131u c0131u12 = this.f1560q;
                c0131u12.h = i19;
                c0131u12.f2545c = 0;
                c0131u12.a(null);
                J0(o2, this.f1560q, v2, false);
            }
            if (i20 > 0) {
                e1(I.H(S0()), i2);
                C0131u c0131u13 = this.f1560q;
                c0131u13.h = i20;
                c0131u13.f2545c = 0;
                list = null;
                c0131u13.a(null);
                J0(o2, this.f1560q, v2, false);
            } else {
                list = null;
            }
            this.f1560q.f2550k = list;
        }
        if (v2.f2379g) {
            c0129s.d();
        } else {
            g gVar = this.f1561r;
            gVar.f816a = gVar.l();
        }
        this.f1562s = this.f1565v;
    }

    public final void d1(int i, int i2, boolean z2, V v2) {
        int k2;
        this.f1560q.f2551l = this.f1561r.i() == 0 && this.f1561r.f() == 0;
        this.f1560q.f2547f = i;
        int[] iArr = this.f1558D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(v2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0131u c0131u = this.f1560q;
        int i3 = z3 ? max2 : max;
        c0131u.h = i3;
        if (!z3) {
            max = max2;
        }
        c0131u.i = max;
        if (z3) {
            c0131u.h = this.f1561r.h() + i3;
            View S02 = S0();
            C0131u c0131u2 = this.f1560q;
            c0131u2.f2546e = this.f1564u ? -1 : 1;
            int H2 = I.H(S02);
            C0131u c0131u3 = this.f1560q;
            c0131u2.d = H2 + c0131u3.f2546e;
            c0131u3.f2544b = this.f1561r.b(S02);
            k2 = this.f1561r.b(S02) - this.f1561r.g();
        } else {
            View T02 = T0();
            C0131u c0131u4 = this.f1560q;
            c0131u4.h = this.f1561r.k() + c0131u4.h;
            C0131u c0131u5 = this.f1560q;
            c0131u5.f2546e = this.f1564u ? 1 : -1;
            int H3 = I.H(T02);
            C0131u c0131u6 = this.f1560q;
            c0131u5.d = H3 + c0131u6.f2546e;
            c0131u6.f2544b = this.f1561r.e(T02);
            k2 = (-this.f1561r.e(T02)) + this.f1561r.k();
        }
        C0131u c0131u7 = this.f1560q;
        c0131u7.f2545c = i2;
        if (z2) {
            c0131u7.f2545c = i2 - k2;
        }
        c0131u7.f2548g = k2;
    }

    @Override // g0.I
    public final boolean e() {
        return this.f1559p == 1;
    }

    @Override // g0.I
    public void e0(V v2) {
        this.f1569z = null;
        this.f1567x = -1;
        this.f1568y = Integer.MIN_VALUE;
        this.f1555A.d();
    }

    public final void e1(int i, int i2) {
        this.f1560q.f2545c = this.f1561r.g() - i2;
        C0131u c0131u = this.f1560q;
        c0131u.f2546e = this.f1564u ? -1 : 1;
        c0131u.d = i;
        c0131u.f2547f = 1;
        c0131u.f2544b = i2;
        c0131u.f2548g = Integer.MIN_VALUE;
    }

    @Override // g0.I
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof C0132v) {
            C0132v c0132v = (C0132v) parcelable;
            this.f1569z = c0132v;
            if (this.f1567x != -1) {
                c0132v.f2552a = -1;
            }
            n0();
        }
    }

    public final void f1(int i, int i2) {
        this.f1560q.f2545c = i2 - this.f1561r.k();
        C0131u c0131u = this.f1560q;
        c0131u.d = i;
        c0131u.f2546e = this.f1564u ? 1 : -1;
        c0131u.f2547f = -1;
        c0131u.f2544b = i2;
        c0131u.f2548g = Integer.MIN_VALUE;
    }

    @Override // g0.I
    public final Parcelable g0() {
        C0132v c0132v = this.f1569z;
        if (c0132v != null) {
            C0132v c0132v2 = new C0132v();
            c0132v2.f2552a = c0132v.f2552a;
            c0132v2.f2553b = c0132v.f2553b;
            c0132v2.f2554c = c0132v.f2554c;
            return c0132v2;
        }
        C0132v c0132v3 = new C0132v();
        if (v() > 0) {
            I0();
            boolean z2 = this.f1562s ^ this.f1564u;
            c0132v3.f2554c = z2;
            if (z2) {
                View S02 = S0();
                c0132v3.f2553b = this.f1561r.g() - this.f1561r.b(S02);
                c0132v3.f2552a = I.H(S02);
            } else {
                View T02 = T0();
                c0132v3.f2552a = I.H(T02);
                c0132v3.f2553b = this.f1561r.e(T02) - this.f1561r.k();
            }
        } else {
            c0132v3.f2552a = -1;
        }
        return c0132v3;
    }

    @Override // g0.I
    public final void h(int i, int i2, V v2, C0125n c0125n) {
        if (this.f1559p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        d1(i > 0 ? 1 : -1, Math.abs(i), true, v2);
        D0(v2, this.f1560q, c0125n);
    }

    @Override // g0.I
    public final void i(int i, C0125n c0125n) {
        boolean z2;
        int i2;
        C0132v c0132v = this.f1569z;
        if (c0132v == null || (i2 = c0132v.f2552a) < 0) {
            Z0();
            z2 = this.f1564u;
            i2 = this.f1567x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0132v.f2554c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1557C && i2 >= 0 && i2 < i; i4++) {
            c0125n.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // g0.I
    public final int j(V v2) {
        return E0(v2);
    }

    @Override // g0.I
    public int k(V v2) {
        return F0(v2);
    }

    @Override // g0.I
    public int l(V v2) {
        return G0(v2);
    }

    @Override // g0.I
    public final int m(V v2) {
        return E0(v2);
    }

    @Override // g0.I
    public int n(V v2) {
        return F0(v2);
    }

    @Override // g0.I
    public int o(V v2) {
        return G0(v2);
    }

    @Override // g0.I
    public int o0(int i, O o2, V v2) {
        if (this.f1559p == 1) {
            return 0;
        }
        return a1(i, o2, v2);
    }

    @Override // g0.I
    public final void p0(int i) {
        this.f1567x = i;
        this.f1568y = Integer.MIN_VALUE;
        C0132v c0132v = this.f1569z;
        if (c0132v != null) {
            c0132v.f2552a = -1;
        }
        n0();
    }

    @Override // g0.I
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - I.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (I.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // g0.I
    public int q0(int i, O o2, V v2) {
        if (this.f1559p == 0) {
            return 0;
        }
        return a1(i, o2, v2);
    }

    @Override // g0.I
    public J r() {
        return new J(-2, -2);
    }

    @Override // g0.I
    public final boolean x0() {
        if (this.f2348m == 1073741824 || this.f2347l == 1073741824) {
            return false;
        }
        int v2 = v();
        for (int i = 0; i < v2; i++) {
            ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.I
    public void z0(RecyclerView recyclerView, int i) {
        C0133w c0133w = new C0133w(recyclerView.getContext());
        c0133w.f2555a = i;
        A0(c0133w);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1559p = 1;
        this.f1563t = false;
        this.f1564u = false;
        this.f1565v = false;
        this.f1566w = true;
        this.f1567x = -1;
        this.f1568y = Integer.MIN_VALUE;
        this.f1569z = null;
        this.f1555A = new C0129s();
        this.f1556B = new C0130t();
        this.f1557C = 2;
        this.f1558D = new int[2];
        H I2 = I.I(context, attributeSet, i, i2);
        b1(I2.f2336a);
        boolean z2 = I2.f2338c;
        c(null);
        if (z2 != this.f1563t) {
            this.f1563t = z2;
            n0();
        }
        c1(I2.d);
    }
}

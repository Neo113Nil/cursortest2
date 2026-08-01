package androidx.recyclerview.widget;

import E1.AbstractC0001b;
import U.g;
import a1.AbstractC0067d;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import g0.AbstractC0139I;
import g0.C0138H;
import g0.C0140J;
import g0.C0145O;
import g0.C0160m;
import g0.C0165s;
import g0.C0166t;
import g0.C0167u;
import g0.C0168v;
import g0.U;
import g0.V;
import g0.Z;
import g0.r;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0139I implements U {

    /* renamed from: A, reason: collision with root package name */
    public final r f1934A;

    /* renamed from: B, reason: collision with root package name */
    public final C0165s f1935B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1936C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f1937D;

    /* renamed from: p, reason: collision with root package name */
    public int f1938p;

    /* renamed from: q, reason: collision with root package name */
    public C0166t f1939q;

    /* renamed from: r, reason: collision with root package name */
    public g f1940r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1941s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1942t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1943u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1944v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1945w;

    /* renamed from: x, reason: collision with root package name */
    public int f1946x;

    /* renamed from: y, reason: collision with root package name */
    public int f1947y;

    /* renamed from: z, reason: collision with root package name */
    public C0167u f1948z;

    public LinearLayoutManager(int i) {
        this.f1938p = 1;
        this.f1942t = false;
        this.f1943u = false;
        this.f1944v = false;
        this.f1945w = true;
        this.f1946x = -1;
        this.f1947y = Integer.MIN_VALUE;
        this.f1948z = null;
        this.f1934A = new r();
        this.f1935B = new C0165s();
        this.f1936C = 2;
        this.f1937D = new int[2];
        b1(i);
        c(null);
        if (this.f1942t) {
            this.f1942t = false;
            n0();
        }
    }

    @Override // g0.AbstractC0139I
    public boolean B0() {
        return this.f1948z == null && this.f1941s == this.f1944v;
    }

    public void C0(V v2, int[] iArr) {
        int i;
        int l2 = v2.f2812a != -1 ? this.f1940r.l() : 0;
        if (this.f1939q.f2983f == -1) {
            i = 0;
        } else {
            i = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i;
    }

    public void D0(V v2, C0166t c0166t, C0160m c0160m) {
        int i = c0166t.d;
        if (i < 0 || i >= v2.b()) {
            return;
        }
        c0160m.a(i, Math.max(0, c0166t.f2984g));
    }

    public final int E0(V v2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1940r;
        boolean z2 = !this.f1945w;
        return AbstractC0067d.b(v2, gVar, L0(z2), K0(z2), this, this.f1945w);
    }

    public final int F0(V v2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1940r;
        boolean z2 = !this.f1945w;
        return AbstractC0067d.c(v2, gVar, L0(z2), K0(z2), this, this.f1945w, this.f1943u);
    }

    public final int G0(V v2) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1940r;
        boolean z2 = !this.f1945w;
        return AbstractC0067d.d(v2, gVar, L0(z2), K0(z2), this, this.f1945w);
    }

    public final int H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1938p == 1) ? 1 : Integer.MIN_VALUE : this.f1938p == 0 ? 1 : Integer.MIN_VALUE : this.f1938p == 1 ? -1 : Integer.MIN_VALUE : this.f1938p == 0 ? -1 : Integer.MIN_VALUE : (this.f1938p != 1 && U0()) ? -1 : 1 : (this.f1938p != 1 && U0()) ? 1 : -1;
    }

    public final void I0() {
        if (this.f1939q == null) {
            C0166t c0166t = new C0166t();
            c0166t.f2979a = true;
            c0166t.h = 0;
            c0166t.i = 0;
            c0166t.f2986k = null;
            this.f1939q = c0166t;
        }
    }

    public final int J0(C0145O c0145o, C0166t c0166t, V v2, boolean z2) {
        int i;
        int i2 = c0166t.f2981c;
        int i3 = c0166t.f2984g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0166t.f2984g = i3 + i2;
            }
            X0(c0145o, c0166t);
        }
        int i4 = c0166t.f2981c + c0166t.h;
        while (true) {
            if ((!c0166t.f2987l && i4 <= 0) || (i = c0166t.d) < 0 || i >= v2.b()) {
                break;
            }
            C0165s c0165s = this.f1935B;
            c0165s.f2976a = 0;
            c0165s.f2977b = false;
            c0165s.f2978c = false;
            c0165s.d = false;
            V0(c0145o, v2, c0166t, c0165s);
            if (!c0165s.f2977b) {
                int i5 = c0166t.f2980b;
                int i6 = c0165s.f2976a;
                c0166t.f2980b = (c0166t.f2983f * i6) + i5;
                if (!c0165s.f2978c || c0166t.f2986k != null || !v2.f2817g) {
                    c0166t.f2981c -= i6;
                    i4 -= i6;
                }
                int i7 = c0166t.f2984g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0166t.f2984g = i8;
                    int i9 = c0166t.f2981c;
                    if (i9 < 0) {
                        c0166t.f2984g = i8 + i9;
                    }
                    X0(c0145o, c0166t);
                }
                if (z2 && c0165s.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0166t.f2981c;
    }

    public final View K0(boolean z2) {
        return this.f1943u ? O0(0, v(), z2) : O0(v() - 1, -1, z2);
    }

    @Override // g0.AbstractC0139I
    public final boolean L() {
        return true;
    }

    public final View L0(boolean z2) {
        return this.f1943u ? O0(v() - 1, -1, z2) : O0(0, v(), z2);
    }

    public final int M0() {
        View O02 = O0(v() - 1, -1, false);
        if (O02 == null) {
            return -1;
        }
        return AbstractC0139I.H(O02);
    }

    public final View N0(int i, int i2) {
        int i3;
        int i4;
        I0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.f1940r.e(u(i)) < this.f1940r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1938p == 0 ? this.f2779c.x(i, i2, i3, i4) : this.d.x(i, i2, i3, i4);
    }

    public final View O0(int i, int i2, boolean z2) {
        I0();
        int i3 = z2 ? 24579 : 320;
        return this.f1938p == 0 ? this.f2779c.x(i, i2, i3, 320) : this.d.x(i, i2, i3, 320);
    }

    public View P0(C0145O c0145o, V v2, boolean z2, boolean z3) {
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
        int k2 = this.f1940r.k();
        int g2 = this.f1940r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = AbstractC0139I.H(u2);
            int e2 = this.f1940r.e(u2);
            int b3 = this.f1940r.b(u2);
            if (H2 >= 0 && H2 < b2) {
                if (!((C0140J) u2.getLayoutParams()).f2789a.i()) {
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

    public final int Q0(int i, C0145O c0145o, V v2, boolean z2) {
        int g2;
        int g3 = this.f1940r.g() - i;
        if (g3 <= 0) {
            return 0;
        }
        int i2 = -a1(-g3, c0145o, v2);
        int i3 = i + i2;
        if (!z2 || (g2 = this.f1940r.g() - i3) <= 0) {
            return i2;
        }
        this.f1940r.p(g2);
        return g2 + i2;
    }

    public final int R0(int i, C0145O c0145o, V v2, boolean z2) {
        int k2;
        int k3 = i - this.f1940r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i2 = -a1(k3, c0145o, v2);
        int i3 = i + i2;
        if (!z2 || (k2 = i3 - this.f1940r.k()) <= 0) {
            return i2;
        }
        this.f1940r.p(-k2);
        return i2 - k2;
    }

    @Override // g0.AbstractC0139I
    public final void S(RecyclerView recyclerView) {
    }

    public final View S0() {
        return u(this.f1943u ? 0 : v() - 1);
    }

    @Override // g0.AbstractC0139I
    public View T(View view, int i, C0145O c0145o, V v2) {
        int H0;
        Z0();
        if (v() == 0 || (H0 = H0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        I0();
        d1(H0, (int) (this.f1940r.l() * 0.33333334f), false, v2);
        C0166t c0166t = this.f1939q;
        c0166t.f2984g = Integer.MIN_VALUE;
        c0166t.f2979a = false;
        J0(c0145o, c0166t, v2, true);
        View N02 = H0 == -1 ? this.f1943u ? N0(v() - 1, -1) : N0(0, v()) : this.f1943u ? N0(0, v()) : N0(v() - 1, -1);
        View T02 = H0 == -1 ? T0() : S0();
        if (!T02.hasFocusable()) {
            return N02;
        }
        if (N02 == null) {
            return null;
        }
        return T02;
    }

    public final View T0() {
        return u(this.f1943u ? v() - 1 : 0);
    }

    @Override // g0.AbstractC0139I
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View O02 = O0(0, v(), false);
            accessibilityEvent.setFromIndex(O02 == null ? -1 : AbstractC0139I.H(O02));
            accessibilityEvent.setToIndex(M0());
        }
    }

    public final boolean U0() {
        return C() == 1;
    }

    public void V0(C0145O c0145o, V v2, C0166t c0166t, C0165s c0165s) {
        int i;
        int i2;
        int i3;
        int i4;
        View b2 = c0166t.b(c0145o);
        if (b2 == null) {
            c0165s.f2977b = true;
            return;
        }
        C0140J c0140j = (C0140J) b2.getLayoutParams();
        if (c0166t.f2986k == null) {
            if (this.f1943u == (c0166t.f2983f == -1)) {
                b(b2, -1, false);
            } else {
                b(b2, 0, false);
            }
        } else {
            if (this.f1943u == (c0166t.f2983f == -1)) {
                b(b2, -1, true);
            } else {
                b(b2, 0, true);
            }
        }
        C0140J c0140j2 = (C0140J) b2.getLayoutParams();
        Rect M2 = this.f2778b.M(b2);
        int i5 = M2.left + M2.right;
        int i6 = M2.top + M2.bottom;
        int w2 = AbstractC0139I.w(this.f2787n, this.f2785l, F() + E() + ((ViewGroup.MarginLayoutParams) c0140j2).leftMargin + ((ViewGroup.MarginLayoutParams) c0140j2).rightMargin + i5, d(), ((ViewGroup.MarginLayoutParams) c0140j2).width);
        int w3 = AbstractC0139I.w(this.f2788o, this.f2786m, D() + G() + ((ViewGroup.MarginLayoutParams) c0140j2).topMargin + ((ViewGroup.MarginLayoutParams) c0140j2).bottomMargin + i6, e(), ((ViewGroup.MarginLayoutParams) c0140j2).height);
        if (w0(b2, w2, w3, c0140j2)) {
            b2.measure(w2, w3);
        }
        c0165s.f2976a = this.f1940r.c(b2);
        if (this.f1938p == 1) {
            if (U0()) {
                i4 = this.f2787n - F();
                i = i4 - this.f1940r.d(b2);
            } else {
                i = E();
                i4 = this.f1940r.d(b2) + i;
            }
            if (c0166t.f2983f == -1) {
                i2 = c0166t.f2980b;
                i3 = i2 - c0165s.f2976a;
            } else {
                i3 = c0166t.f2980b;
                i2 = c0165s.f2976a + i3;
            }
        } else {
            int G2 = G();
            int d = this.f1940r.d(b2) + G2;
            if (c0166t.f2983f == -1) {
                int i7 = c0166t.f2980b;
                int i8 = i7 - c0165s.f2976a;
                i4 = i7;
                i2 = d;
                i = i8;
                i3 = G2;
            } else {
                int i9 = c0166t.f2980b;
                int i10 = c0165s.f2976a + i9;
                i = i9;
                i2 = d;
                i3 = G2;
                i4 = i10;
            }
        }
        AbstractC0139I.N(b2, i, i3, i4, i2);
        if (c0140j.f2789a.i() || c0140j.f2789a.l()) {
            c0165s.f2978c = true;
        }
        c0165s.d = b2.hasFocusable();
    }

    public void W0(C0145O c0145o, V v2, r rVar, int i) {
    }

    public final void X0(C0145O c0145o, C0166t c0166t) {
        if (!c0166t.f2979a || c0166t.f2987l) {
            return;
        }
        int i = c0166t.f2984g;
        int i2 = c0166t.i;
        if (c0166t.f2983f == -1) {
            int v2 = v();
            if (i < 0) {
                return;
            }
            int f2 = (this.f1940r.f() - i) + i2;
            if (this.f1943u) {
                for (int i3 = 0; i3 < v2; i3++) {
                    View u2 = u(i3);
                    if (this.f1940r.e(u2) < f2 || this.f1940r.o(u2) < f2) {
                        Y0(c0145o, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v2 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u3 = u(i5);
                if (this.f1940r.e(u3) < f2 || this.f1940r.o(u3) < f2) {
                    Y0(c0145o, i4, i5);
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
        if (!this.f1943u) {
            for (int i7 = 0; i7 < v3; i7++) {
                View u4 = u(i7);
                if (this.f1940r.b(u4) > i6 || this.f1940r.n(u4) > i6) {
                    Y0(c0145o, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v3 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u5 = u(i9);
            if (this.f1940r.b(u5) > i6 || this.f1940r.n(u5) > i6) {
                Y0(c0145o, i8, i9);
                return;
            }
        }
    }

    public final void Y0(C0145O c0145o, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u2 = u(i);
                l0(i);
                c0145o.h(u2);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u3 = u(i3);
            l0(i3);
            c0145o.h(u3);
        }
    }

    public final void Z0() {
        if (this.f1938p == 1 || !U0()) {
            this.f1943u = this.f1942t;
        } else {
            this.f1943u = !this.f1942t;
        }
    }

    @Override // g0.U
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0139I.H(u(0))) != this.f1943u ? -1 : 1;
        return this.f1938p == 0 ? new PointF(i2, RecyclerView.f1949A0) : new PointF(RecyclerView.f1949A0, i2);
    }

    public final int a1(int i, C0145O c0145o, V v2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        I0();
        this.f1939q.f2979a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        d1(i2, abs, true, v2);
        C0166t c0166t = this.f1939q;
        int J02 = J0(c0145o, c0166t, v2, false) + c0166t.f2984g;
        if (J02 < 0) {
            return 0;
        }
        if (abs > J02) {
            i = i2 * J02;
        }
        this.f1940r.p(-i);
        this.f1939q.f2985j = i;
        return i;
    }

    public final void b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0001b.f("invalid orientation:", i));
        }
        c(null);
        if (i != this.f1938p || this.f1940r == null) {
            g a2 = g.a(this, i);
            this.f1940r = a2;
            this.f1934A.f2972a = a2;
            this.f1938p = i;
            n0();
        }
    }

    @Override // g0.AbstractC0139I
    public final void c(String str) {
        if (this.f1948z == null) {
            super.c(str);
        }
    }

    public void c1(boolean z2) {
        c(null);
        if (this.f1944v == z2) {
            return;
        }
        this.f1944v = z2;
        n0();
    }

    @Override // g0.AbstractC0139I
    public final boolean d() {
        return this.f1938p == 0;
    }

    @Override // g0.AbstractC0139I
    public void d0(C0145O c0145o, V v2) {
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
        if (!(this.f1948z == null && this.f1946x == -1) && v2.b() == 0) {
            i0(c0145o);
            return;
        }
        C0167u c0167u = this.f1948z;
        if (c0167u != null && (i8 = c0167u.f2988a) >= 0) {
            this.f1946x = i8;
        }
        I0();
        this.f1939q.f2979a = false;
        Z0();
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2777a.f2852c.contains(focusedChild)) {
            focusedChild = null;
        }
        r rVar = this.f1934A;
        if (!rVar.f2975e || this.f1946x != -1 || this.f1948z != null) {
            rVar.d();
            rVar.d = this.f1943u ^ this.f1944v;
            if (!v2.f2817g && (i = this.f1946x) != -1) {
                if (i < 0 || i >= v2.b()) {
                    this.f1946x = -1;
                    this.f1947y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.f1946x;
                    rVar.f2973b = i10;
                    C0167u c0167u2 = this.f1948z;
                    if (c0167u2 != null && c0167u2.f2988a >= 0) {
                        boolean z2 = c0167u2.f2990c;
                        rVar.d = z2;
                        if (z2) {
                            rVar.f2974c = this.f1940r.g() - this.f1948z.f2989b;
                        } else {
                            rVar.f2974c = this.f1940r.k() + this.f1948z.f2989b;
                        }
                    } else if (this.f1947y == Integer.MIN_VALUE) {
                        View q3 = q(i10);
                        if (q3 == null) {
                            if (v() > 0) {
                                rVar.d = (this.f1946x < AbstractC0139I.H(u(0))) == this.f1943u;
                            }
                            rVar.a();
                        } else if (this.f1940r.c(q3) > this.f1940r.l()) {
                            rVar.a();
                        } else if (this.f1940r.e(q3) - this.f1940r.k() < 0) {
                            rVar.f2974c = this.f1940r.k();
                            rVar.d = false;
                        } else if (this.f1940r.g() - this.f1940r.b(q3) < 0) {
                            rVar.f2974c = this.f1940r.g();
                            rVar.d = true;
                        } else {
                            rVar.f2974c = rVar.d ? this.f1940r.m() + this.f1940r.b(q3) : this.f1940r.e(q3);
                        }
                    } else {
                        boolean z3 = this.f1943u;
                        rVar.d = z3;
                        if (z3) {
                            rVar.f2974c = this.f1940r.g() - this.f1947y;
                        } else {
                            rVar.f2974c = this.f1940r.k() + this.f1947y;
                        }
                    }
                    rVar.f2975e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f2778b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f2777a.f2852c.contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    C0140J c0140j = (C0140J) focusedChild2.getLayoutParams();
                    if (!c0140j.f2789a.i() && c0140j.f2789a.b() >= 0 && c0140j.f2789a.b() < v2.b()) {
                        rVar.c(focusedChild2, AbstractC0139I.H(focusedChild2));
                        rVar.f2975e = true;
                    }
                }
                boolean z4 = this.f1941s;
                boolean z5 = this.f1944v;
                if (z4 == z5 && (P02 = P0(c0145o, v2, rVar.d, z5)) != null) {
                    rVar.b(P02, AbstractC0139I.H(P02));
                    if (!v2.f2817g && B0()) {
                        int e3 = this.f1940r.e(P02);
                        int b2 = this.f1940r.b(P02);
                        int k2 = this.f1940r.k();
                        int g2 = this.f1940r.g();
                        boolean z6 = b2 <= k2 && e3 < k2;
                        boolean z7 = e3 >= g2 && b2 > g2;
                        if (z6 || z7) {
                            if (rVar.d) {
                                k2 = g2;
                            }
                            rVar.f2974c = k2;
                        }
                    }
                    rVar.f2975e = true;
                }
            }
            rVar.a();
            rVar.f2973b = this.f1944v ? v2.b() - 1 : 0;
            rVar.f2975e = true;
        } else if (focusedChild != null && (this.f1940r.e(focusedChild) >= this.f1940r.g() || this.f1940r.b(focusedChild) <= this.f1940r.k())) {
            rVar.c(focusedChild, AbstractC0139I.H(focusedChild));
        }
        C0166t c0166t = this.f1939q;
        c0166t.f2983f = c0166t.f2985j >= 0 ? 1 : -1;
        int[] iArr = this.f1937D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(v2, iArr);
        int k3 = this.f1940r.k() + Math.max(0, iArr[0]);
        int h = this.f1940r.h() + Math.max(0, iArr[1]);
        if (v2.f2817g && (i6 = this.f1946x) != -1 && this.f1947y != Integer.MIN_VALUE && (q2 = q(i6)) != null) {
            if (this.f1943u) {
                i7 = this.f1940r.g() - this.f1940r.b(q2);
                e2 = this.f1947y;
            } else {
                e2 = this.f1940r.e(q2) - this.f1940r.k();
                i7 = this.f1947y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k3 += i11;
            } else {
                h -= i11;
            }
        }
        if (!rVar.d ? !this.f1943u : this.f1943u) {
            i9 = 1;
        }
        W0(c0145o, v2, rVar, i9);
        p(c0145o);
        this.f1939q.f2987l = this.f1940r.i() == 0 && this.f1940r.f() == 0;
        this.f1939q.getClass();
        this.f1939q.i = 0;
        if (rVar.d) {
            f1(rVar.f2973b, rVar.f2974c);
            C0166t c0166t2 = this.f1939q;
            c0166t2.h = k3;
            J0(c0145o, c0166t2, v2, false);
            C0166t c0166t3 = this.f1939q;
            i3 = c0166t3.f2980b;
            int i12 = c0166t3.d;
            int i13 = c0166t3.f2981c;
            if (i13 > 0) {
                h += i13;
            }
            e1(rVar.f2973b, rVar.f2974c);
            C0166t c0166t4 = this.f1939q;
            c0166t4.h = h;
            c0166t4.d += c0166t4.f2982e;
            J0(c0145o, c0166t4, v2, false);
            C0166t c0166t5 = this.f1939q;
            i2 = c0166t5.f2980b;
            int i14 = c0166t5.f2981c;
            if (i14 > 0) {
                f1(i12, i3);
                C0166t c0166t6 = this.f1939q;
                c0166t6.h = i14;
                J0(c0145o, c0166t6, v2, false);
                i3 = this.f1939q.f2980b;
            }
        } else {
            e1(rVar.f2973b, rVar.f2974c);
            C0166t c0166t7 = this.f1939q;
            c0166t7.h = h;
            J0(c0145o, c0166t7, v2, false);
            C0166t c0166t8 = this.f1939q;
            i2 = c0166t8.f2980b;
            int i15 = c0166t8.d;
            int i16 = c0166t8.f2981c;
            if (i16 > 0) {
                k3 += i16;
            }
            f1(rVar.f2973b, rVar.f2974c);
            C0166t c0166t9 = this.f1939q;
            c0166t9.h = k3;
            c0166t9.d += c0166t9.f2982e;
            J0(c0145o, c0166t9, v2, false);
            C0166t c0166t10 = this.f1939q;
            int i17 = c0166t10.f2980b;
            int i18 = c0166t10.f2981c;
            if (i18 > 0) {
                e1(i15, i2);
                C0166t c0166t11 = this.f1939q;
                c0166t11.h = i18;
                J0(c0145o, c0166t11, v2, false);
                i2 = this.f1939q.f2980b;
            }
            i3 = i17;
        }
        if (v() > 0) {
            if (this.f1943u ^ this.f1944v) {
                int Q03 = Q0(i2, c0145o, v2, true);
                i4 = i3 + Q03;
                i5 = i2 + Q03;
                Q02 = R0(i4, c0145o, v2, false);
            } else {
                int R02 = R0(i3, c0145o, v2, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                Q02 = Q0(i5, c0145o, v2, false);
            }
            i3 = i4 + Q02;
            i2 = i5 + Q02;
        }
        if (v2.f2819k && v() != 0 && !v2.f2817g && B0()) {
            List list2 = c0145o.d;
            int size = list2.size();
            int H2 = AbstractC0139I.H(u(0));
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 0; i21 < size; i21++) {
                Z z8 = (Z) list2.get(i21);
                if (!z8.i()) {
                    boolean z9 = z8.b() < H2;
                    boolean z10 = this.f1943u;
                    View view = z8.f2830a;
                    if (z9 != z10) {
                        i19 += this.f1940r.c(view);
                    } else {
                        i20 += this.f1940r.c(view);
                    }
                }
            }
            this.f1939q.f2986k = list2;
            if (i19 > 0) {
                f1(AbstractC0139I.H(T0()), i3);
                C0166t c0166t12 = this.f1939q;
                c0166t12.h = i19;
                c0166t12.f2981c = 0;
                c0166t12.a(null);
                J0(c0145o, this.f1939q, v2, false);
            }
            if (i20 > 0) {
                e1(AbstractC0139I.H(S0()), i2);
                C0166t c0166t13 = this.f1939q;
                c0166t13.h = i20;
                c0166t13.f2981c = 0;
                list = null;
                c0166t13.a(null);
                J0(c0145o, this.f1939q, v2, false);
            } else {
                list = null;
            }
            this.f1939q.f2986k = list;
        }
        if (v2.f2817g) {
            rVar.d();
        } else {
            g gVar = this.f1940r;
            gVar.f1174a = gVar.l();
        }
        this.f1941s = this.f1944v;
    }

    public final void d1(int i, int i2, boolean z2, V v2) {
        int k2;
        this.f1939q.f2987l = this.f1940r.i() == 0 && this.f1940r.f() == 0;
        this.f1939q.f2983f = i;
        int[] iArr = this.f1937D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(v2, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z3 = i == 1;
        C0166t c0166t = this.f1939q;
        int i3 = z3 ? max2 : max;
        c0166t.h = i3;
        if (!z3) {
            max = max2;
        }
        c0166t.i = max;
        if (z3) {
            c0166t.h = this.f1940r.h() + i3;
            View S02 = S0();
            C0166t c0166t2 = this.f1939q;
            c0166t2.f2982e = this.f1943u ? -1 : 1;
            int H2 = AbstractC0139I.H(S02);
            C0166t c0166t3 = this.f1939q;
            c0166t2.d = H2 + c0166t3.f2982e;
            c0166t3.f2980b = this.f1940r.b(S02);
            k2 = this.f1940r.b(S02) - this.f1940r.g();
        } else {
            View T02 = T0();
            C0166t c0166t4 = this.f1939q;
            c0166t4.h = this.f1940r.k() + c0166t4.h;
            C0166t c0166t5 = this.f1939q;
            c0166t5.f2982e = this.f1943u ? 1 : -1;
            int H3 = AbstractC0139I.H(T02);
            C0166t c0166t6 = this.f1939q;
            c0166t5.d = H3 + c0166t6.f2982e;
            c0166t6.f2980b = this.f1940r.e(T02);
            k2 = (-this.f1940r.e(T02)) + this.f1940r.k();
        }
        C0166t c0166t7 = this.f1939q;
        c0166t7.f2981c = i2;
        if (z2) {
            c0166t7.f2981c = i2 - k2;
        }
        c0166t7.f2984g = k2;
    }

    @Override // g0.AbstractC0139I
    public final boolean e() {
        return this.f1938p == 1;
    }

    @Override // g0.AbstractC0139I
    public void e0(V v2) {
        this.f1948z = null;
        this.f1946x = -1;
        this.f1947y = Integer.MIN_VALUE;
        this.f1934A.d();
    }

    public final void e1(int i, int i2) {
        this.f1939q.f2981c = this.f1940r.g() - i2;
        C0166t c0166t = this.f1939q;
        c0166t.f2982e = this.f1943u ? -1 : 1;
        c0166t.d = i;
        c0166t.f2983f = 1;
        c0166t.f2980b = i2;
        c0166t.f2984g = Integer.MIN_VALUE;
    }

    @Override // g0.AbstractC0139I
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof C0167u) {
            C0167u c0167u = (C0167u) parcelable;
            this.f1948z = c0167u;
            if (this.f1946x != -1) {
                c0167u.f2988a = -1;
            }
            n0();
        }
    }

    public final void f1(int i, int i2) {
        this.f1939q.f2981c = i2 - this.f1940r.k();
        C0166t c0166t = this.f1939q;
        c0166t.d = i;
        c0166t.f2982e = this.f1943u ? 1 : -1;
        c0166t.f2983f = -1;
        c0166t.f2980b = i2;
        c0166t.f2984g = Integer.MIN_VALUE;
    }

    @Override // g0.AbstractC0139I
    public final Parcelable g0() {
        C0167u c0167u = this.f1948z;
        if (c0167u != null) {
            C0167u c0167u2 = new C0167u();
            c0167u2.f2988a = c0167u.f2988a;
            c0167u2.f2989b = c0167u.f2989b;
            c0167u2.f2990c = c0167u.f2990c;
            return c0167u2;
        }
        C0167u c0167u3 = new C0167u();
        if (v() > 0) {
            I0();
            boolean z2 = this.f1941s ^ this.f1943u;
            c0167u3.f2990c = z2;
            if (z2) {
                View S02 = S0();
                c0167u3.f2989b = this.f1940r.g() - this.f1940r.b(S02);
                c0167u3.f2988a = AbstractC0139I.H(S02);
            } else {
                View T02 = T0();
                c0167u3.f2988a = AbstractC0139I.H(T02);
                c0167u3.f2989b = this.f1940r.e(T02) - this.f1940r.k();
            }
        } else {
            c0167u3.f2988a = -1;
        }
        return c0167u3;
    }

    @Override // g0.AbstractC0139I
    public final void h(int i, int i2, V v2, C0160m c0160m) {
        if (this.f1938p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        d1(i > 0 ? 1 : -1, Math.abs(i), true, v2);
        D0(v2, this.f1939q, c0160m);
    }

    @Override // g0.AbstractC0139I
    public final void i(int i, C0160m c0160m) {
        boolean z2;
        int i2;
        C0167u c0167u = this.f1948z;
        if (c0167u == null || (i2 = c0167u.f2988a) < 0) {
            Z0();
            z2 = this.f1943u;
            i2 = this.f1946x;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = c0167u.f2990c;
        }
        int i3 = z2 ? -1 : 1;
        for (int i4 = 0; i4 < this.f1936C && i2 >= 0 && i2 < i; i4++) {
            c0160m.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // g0.AbstractC0139I
    public final int j(V v2) {
        return E0(v2);
    }

    @Override // g0.AbstractC0139I
    public int k(V v2) {
        return F0(v2);
    }

    @Override // g0.AbstractC0139I
    public int l(V v2) {
        return G0(v2);
    }

    @Override // g0.AbstractC0139I
    public final int m(V v2) {
        return E0(v2);
    }

    @Override // g0.AbstractC0139I
    public int n(V v2) {
        return F0(v2);
    }

    @Override // g0.AbstractC0139I
    public int o(V v2) {
        return G0(v2);
    }

    @Override // g0.AbstractC0139I
    public int o0(int i, C0145O c0145o, V v2) {
        if (this.f1938p == 1) {
            return 0;
        }
        return a1(i, c0145o, v2);
    }

    @Override // g0.AbstractC0139I
    public final void p0(int i) {
        this.f1946x = i;
        this.f1947y = Integer.MIN_VALUE;
        C0167u c0167u = this.f1948z;
        if (c0167u != null) {
            c0167u.f2988a = -1;
        }
        n0();
    }

    @Override // g0.AbstractC0139I
    public final View q(int i) {
        int v2 = v();
        if (v2 == 0) {
            return null;
        }
        int H2 = i - AbstractC0139I.H(u(0));
        if (H2 >= 0 && H2 < v2) {
            View u2 = u(H2);
            if (AbstractC0139I.H(u2) == i) {
                return u2;
            }
        }
        return super.q(i);
    }

    @Override // g0.AbstractC0139I
    public int q0(int i, C0145O c0145o, V v2) {
        if (this.f1938p == 0) {
            return 0;
        }
        return a1(i, c0145o, v2);
    }

    @Override // g0.AbstractC0139I
    public C0140J r() {
        return new C0140J(-2, -2);
    }

    @Override // g0.AbstractC0139I
    public final boolean x0() {
        if (this.f2786m == 1073741824 || this.f2785l == 1073741824) {
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

    @Override // g0.AbstractC0139I
    public void z0(RecyclerView recyclerView, int i) {
        C0168v c0168v = new C0168v(recyclerView.getContext());
        c0168v.f2991a = i;
        A0(c0168v);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1938p = 1;
        this.f1942t = false;
        this.f1943u = false;
        this.f1944v = false;
        this.f1945w = true;
        this.f1946x = -1;
        this.f1947y = Integer.MIN_VALUE;
        this.f1948z = null;
        this.f1934A = new r();
        this.f1935B = new C0165s();
        this.f1936C = 2;
        this.f1937D = new int[2];
        C0138H I2 = AbstractC0139I.I(context, attributeSet, i, i2);
        b1(I2.f2774a);
        boolean z2 = I2.f2776c;
        c(null);
        if (z2 != this.f1942t) {
            this.f1942t = z2;
            n0();
        }
        c1(I2.d);
    }
}

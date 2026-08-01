package androidx.recyclerview.widget;

import B.j;
import K.T;
import Q.b;
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
import g0.C0133w;
import g0.H;
import g0.I;
import g0.J;
import g0.O;
import g0.U;
import g0.V;
import g0.d0;
import g0.e0;
import g0.f0;
import g0.g0;
import g0.h0;
import g0.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends I implements U {

    /* renamed from: B, reason: collision with root package name */
    public final j f1645B;

    /* renamed from: C, reason: collision with root package name */
    public final int f1646C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1647D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1648E;
    public g0 F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f1649G;

    /* renamed from: H, reason: collision with root package name */
    public final d0 f1650H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1651I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f1652J;

    /* renamed from: K, reason: collision with root package name */
    public final b f1653K;

    /* renamed from: p, reason: collision with root package name */
    public final int f1654p;

    /* renamed from: q, reason: collision with root package name */
    public final h0[] f1655q;

    /* renamed from: r, reason: collision with root package name */
    public final g f1656r;

    /* renamed from: s, reason: collision with root package name */
    public final g f1657s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1658t;

    /* renamed from: u, reason: collision with root package name */
    public int f1659u;

    /* renamed from: v, reason: collision with root package name */
    public final r f1660v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1661w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f1663y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1662x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f1664z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f1644A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1654p = -1;
        this.f1661w = false;
        j jVar = new j(12, false);
        this.f1645B = jVar;
        this.f1646C = 2;
        this.f1649G = new Rect();
        this.f1650H = new d0(this);
        this.f1651I = true;
        this.f1653K = new b(9, this);
        H I2 = I.I(context, attributeSet, i, i2);
        int i3 = I2.f2336a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f1658t) {
            this.f1658t = i3;
            g gVar = this.f1656r;
            this.f1656r = this.f1657s;
            this.f1657s = gVar;
            n0();
        }
        int i4 = I2.f2337b;
        c(null);
        if (i4 != this.f1654p) {
            jVar.f();
            n0();
            this.f1654p = i4;
            this.f1663y = new BitSet(this.f1654p);
            this.f1655q = new h0[this.f1654p];
            for (int i5 = 0; i5 < this.f1654p; i5++) {
                this.f1655q[i5] = new h0(this, i5);
            }
            n0();
        }
        boolean z2 = I2.f2338c;
        c(null);
        g0 g0Var = this.F;
        if (g0Var != null && g0Var.h != z2) {
            g0Var.h = z2;
        }
        this.f1661w = z2;
        n0();
        r rVar = new r();
        rVar.f2530a = true;
        rVar.f2534f = 0;
        rVar.f2535g = 0;
        this.f1660v = rVar;
        this.f1656r = g.a(this, this.f1658t);
        this.f1657s = g.a(this, 1 - this.f1658t);
    }

    public static int f1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // g0.I
    public final boolean B0() {
        return this.F == null;
    }

    public final int C0(int i) {
        if (v() == 0) {
            return this.f1662x ? 1 : -1;
        }
        return (i < M0()) != this.f1662x ? -1 : 1;
    }

    public final boolean D0() {
        int M02;
        if (v() != 0 && this.f1646C != 0 && this.f2344g) {
            if (this.f1662x) {
                M02 = N0();
                M0();
            } else {
                M02 = M0();
                N0();
            }
            j jVar = this.f1645B;
            if (M02 == 0 && R0() != null) {
                jVar.f();
                this.f2343f = true;
                n0();
                return true;
            }
        }
        return false;
    }

    public final int E0(V v2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1656r;
        boolean z2 = !this.f1651I;
        return e.n(v2, gVar, J0(z2), I0(z2), this, this.f1651I);
    }

    public final int F0(V v2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1656r;
        boolean z2 = !this.f1651I;
        return e.o(v2, gVar, J0(z2), I0(z2), this, this.f1651I, this.f1662x);
    }

    public final int G0(V v2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f1656r;
        boolean z2 = !this.f1651I;
        return e.p(v2, gVar, J0(z2), I0(z2), this, this.f1651I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int H0(O o2, r rVar, V v2) {
        h0 h0Var;
        ?? r6;
        int i;
        int h;
        int c2;
        int k2;
        int c3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 1;
        this.f1663y.set(0, this.f1654p, true);
        r rVar2 = this.f1660v;
        int i8 = rVar2.i ? rVar.f2533e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : rVar.f2533e == 1 ? rVar.f2535g + rVar.f2531b : rVar.f2534f - rVar.f2531b;
        int i9 = rVar.f2533e;
        for (int i10 = 0; i10 < this.f1654p; i10++) {
            if (!this.f1655q[i10].f2459a.isEmpty()) {
                e1(this.f1655q[i10], i9, i8);
            }
        }
        int g2 = this.f1662x ? this.f1656r.g() : this.f1656r.k();
        boolean z2 = false;
        while (true) {
            int i11 = rVar.f2532c;
            if (((i11 < 0 || i11 >= v2.b()) ? i6 : i7) == 0 || (!rVar2.i && this.f1663y.isEmpty())) {
                break;
            }
            View view = o2.k(rVar.f2532c, Long.MAX_VALUE).f2392a;
            rVar.f2532c += rVar.d;
            e0 e0Var = (e0) view.getLayoutParams();
            int b2 = e0Var.f2351a.b();
            j jVar = this.f1645B;
            int[] iArr = (int[]) jVar.f56b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (V0(rVar.f2533e)) {
                    i5 = this.f1654p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f1654p;
                    i5 = i6;
                }
                h0 h0Var2 = null;
                if (rVar.f2533e == i7) {
                    int k3 = this.f1656r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        h0 h0Var3 = this.f1655q[i5];
                        int f2 = h0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            h0Var2 = h0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f1656r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        h0 h0Var4 = this.f1655q[i5];
                        int h2 = h0Var4.h(g3);
                        if (h2 > i14) {
                            h0Var2 = h0Var4;
                            i14 = h2;
                        }
                        i5 += i3;
                    }
                }
                h0Var = h0Var2;
                jVar.w(b2);
                ((int[]) jVar.f56b)[b2] = h0Var.f2462e;
            } else {
                h0Var = this.f1655q[i12];
            }
            e0Var.f2434e = h0Var;
            if (rVar.f2533e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f1658t == 1) {
                i = 1;
                T0(view, I.w(r6, this.f1659u, this.f2347l, r6, ((ViewGroup.MarginLayoutParams) e0Var).width), I.w(true, this.f2350o, this.f2348m, D() + G(), ((ViewGroup.MarginLayoutParams) e0Var).height));
            } else {
                i = 1;
                T0(view, I.w(true, this.f2349n, this.f2347l, F() + E(), ((ViewGroup.MarginLayoutParams) e0Var).width), I.w(false, this.f1659u, this.f2348m, 0, ((ViewGroup.MarginLayoutParams) e0Var).height));
            }
            if (rVar.f2533e == i) {
                c2 = h0Var.f(g2);
                h = this.f1656r.c(view) + c2;
            } else {
                h = h0Var.h(g2);
                c2 = h - this.f1656r.c(view);
            }
            if (rVar.f2533e == 1) {
                h0 h0Var5 = e0Var.f2434e;
                h0Var5.getClass();
                e0 e0Var2 = (e0) view.getLayoutParams();
                e0Var2.f2434e = h0Var5;
                ArrayList arrayList = h0Var5.f2459a;
                arrayList.add(view);
                h0Var5.f2461c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    h0Var5.f2460b = Integer.MIN_VALUE;
                }
                if (e0Var2.f2351a.i() || e0Var2.f2351a.l()) {
                    h0Var5.d = h0Var5.f2463f.f1656r.c(view) + h0Var5.d;
                }
            } else {
                h0 h0Var6 = e0Var.f2434e;
                h0Var6.getClass();
                e0 e0Var3 = (e0) view.getLayoutParams();
                e0Var3.f2434e = h0Var6;
                ArrayList arrayList2 = h0Var6.f2459a;
                arrayList2.add(0, view);
                h0Var6.f2460b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    h0Var6.f2461c = Integer.MIN_VALUE;
                }
                if (e0Var3.f2351a.i() || e0Var3.f2351a.l()) {
                    h0Var6.d = h0Var6.f2463f.f1656r.c(view) + h0Var6.d;
                }
            }
            if (S0() && this.f1658t == 1) {
                c3 = this.f1657s.g() - (((this.f1654p - 1) - h0Var.f2462e) * this.f1659u);
                k2 = c3 - this.f1657s.c(view);
            } else {
                k2 = this.f1657s.k() + (h0Var.f2462e * this.f1659u);
                c3 = this.f1657s.c(view) + k2;
            }
            if (this.f1658t == 1) {
                I.N(view, k2, c2, c3, h);
            } else {
                I.N(view, c2, k2, h, c3);
            }
            e1(h0Var, rVar2.f2533e, i8);
            X0(o2, rVar2);
            if (rVar2.h && view.hasFocusable()) {
                i2 = 0;
                this.f1663y.set(h0Var.f2462e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            X0(o2, rVar2);
        }
        int k4 = rVar2.f2533e == -1 ? this.f1656r.k() - P0(this.f1656r.k()) : O0(this.f1656r.g()) - this.f1656r.g();
        return k4 > 0 ? Math.min(rVar.f2531b, k4) : i15;
    }

    public final View I0(boolean z2) {
        int k2 = this.f1656r.k();
        int g2 = this.f1656r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f1656r.e(u2);
            int b2 = this.f1656r.b(u2);
            if (b2 > k2 && e2 < g2) {
                if (b2 <= g2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final View J0(boolean z2) {
        int k2 = this.f1656r.k();
        int g2 = this.f1656r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f1656r.e(u2);
            if (this.f1656r.b(u2) > k2 && e2 < g2) {
                if (e2 >= k2 || !z2) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void K0(O o2, V v2, boolean z2) {
        int g2;
        int O02 = O0(Integer.MIN_VALUE);
        if (O02 != Integer.MIN_VALUE && (g2 = this.f1656r.g() - O02) > 0) {
            int i = g2 - (-b1(-g2, o2, v2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f1656r.p(i);
        }
    }

    @Override // g0.I
    public final boolean L() {
        return this.f1646C != 0;
    }

    public final void L0(O o2, V v2, boolean z2) {
        int k2;
        int P02 = P0(Integer.MAX_VALUE);
        if (P02 != Integer.MAX_VALUE && (k2 = P02 - this.f1656r.k()) > 0) {
            int b12 = k2 - b1(k2, o2, v2);
            if (!z2 || b12 <= 0) {
                return;
            }
            this.f1656r.p(-b12);
        }
    }

    public final int M0() {
        if (v() == 0) {
            return 0;
        }
        return I.H(u(0));
    }

    public final int N0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return I.H(u(v2 - 1));
    }

    @Override // g0.I
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f1654p; i2++) {
            h0 h0Var = this.f1655q[i2];
            int i3 = h0Var.f2460b;
            if (i3 != Integer.MIN_VALUE) {
                h0Var.f2460b = i3 + i;
            }
            int i4 = h0Var.f2461c;
            if (i4 != Integer.MIN_VALUE) {
                h0Var.f2461c = i4 + i;
            }
        }
    }

    public final int O0(int i) {
        int f2 = this.f1655q[0].f(i);
        for (int i2 = 1; i2 < this.f1654p; i2++) {
            int f3 = this.f1655q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    @Override // g0.I
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f1654p; i2++) {
            h0 h0Var = this.f1655q[i2];
            int i3 = h0Var.f2460b;
            if (i3 != Integer.MIN_VALUE) {
                h0Var.f2460b = i3 + i;
            }
            int i4 = h0Var.f2461c;
            if (i4 != Integer.MIN_VALUE) {
                h0Var.f2461c = i4 + i;
            }
        }
    }

    public final int P0(int i) {
        int h = this.f1655q[0].h(i);
        for (int i2 = 1; i2 < this.f1654p; i2++) {
            int h2 = this.f1655q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // g0.I
    public final void Q() {
        this.f1645B.f();
        for (int i = 0; i < this.f1654p; i++) {
            this.f1655q[i].b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(int i, int i2, int i3) {
        int i4;
        int i5;
        j jVar;
        int[] iArr;
        ArrayList arrayList;
        int i6;
        int N02 = this.f1662x ? N0() : M0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                jVar = this.f1645B;
                iArr = (int[]) jVar.f56b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) jVar.f57c;
                    if (arrayList != null) {
                        f0 f0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                f0 f0Var2 = (f0) ((ArrayList) jVar.f57c).get(size);
                                if (f0Var2.f2440a == i5) {
                                    f0Var = f0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (f0Var != null) {
                            ((ArrayList) jVar.f57c).remove(f0Var);
                        }
                        int size2 = ((ArrayList) jVar.f57c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((f0) ((ArrayList) jVar.f57c).get(i7)).f2440a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            f0 f0Var3 = (f0) ((ArrayList) jVar.f57c).get(i7);
                            ((ArrayList) jVar.f57c).remove(i7);
                            i6 = f0Var3.f2440a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) jVar.f56b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) jVar.f56b).length;
                            } else {
                                Arrays.fill((int[]) jVar.f56b, i5, Math.min(i6 + 1, ((int[]) jVar.f56b).length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    jVar.B(i, i2);
                } else if (i3 == 2) {
                    jVar.C(i, i2);
                } else if (i3 == 8) {
                    jVar.C(i, 1);
                    jVar.B(i2, 1);
                }
                if (i4 > N02) {
                    return;
                }
                if (i5 <= (this.f1662x ? M0() : N0())) {
                    n0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        jVar = this.f1645B;
        iArr = (int[]) jVar.f56b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f57c;
            if (arrayList != null) {
            }
            i6 = -1;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > N02) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View R0() {
        int v2 = v();
        int i = v2 - 1;
        BitSet bitSet = new BitSet(this.f1654p);
        bitSet.set(0, this.f1654p, true);
        char c2 = (this.f1658t == 1 && S0()) ? (char) 1 : (char) 65535;
        if (this.f1662x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            e0 e0Var = (e0) u2.getLayoutParams();
            if (bitSet.get(e0Var.f2434e.f2462e)) {
                h0 h0Var = e0Var.f2434e;
                if (this.f1662x) {
                    int i3 = h0Var.f2461c;
                    if (i3 == Integer.MIN_VALUE) {
                        h0Var.a();
                        i3 = h0Var.f2461c;
                    }
                    if (i3 < this.f1656r.g()) {
                        ArrayList arrayList = h0Var.f2459a;
                        ((e0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(e0Var.f2434e.f2462e);
                } else {
                    int i4 = h0Var.f2460b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) h0Var.f2459a.get(0);
                        e0 e0Var2 = (e0) view.getLayoutParams();
                        h0Var.f2460b = h0Var.f2463f.f1656r.e(view);
                        e0Var2.getClass();
                        i4 = h0Var.f2460b;
                    }
                    if (i4 > this.f1656r.k()) {
                        ((e0) ((View) h0Var.f2459a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(e0Var.f2434e.f2462e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f1662x) {
                    int b2 = this.f1656r.b(u2);
                    int b3 = this.f1656r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((e0Var.f2434e.f2462e - ((e0) u3.getLayoutParams()).f2434e.f2462e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f1656r.e(u2);
                    int e3 = this.f1656r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((e0Var.f2434e.f2462e - ((e0) u3.getLayoutParams()).f2434e.f2462e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // g0.I
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2340b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1653K);
        }
        for (int i = 0; i < this.f1654p; i++) {
            this.f1655q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0() {
        return C() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004d, code lost:
    
        if (r8.f1658t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0052, code lost:
    
        if (r8.f1658t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005f, code lost:
    
        if (S0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006c, code lost:
    
        if (S0() == false) goto L46;
     */
    @Override // g0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, O o2, V v2) {
        View D2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView == null || (D2 = recyclerView.D(view)) == null || this.f2339a.f2417c.contains(D2)) {
            D2 = null;
        }
        if (D2 == null) {
            return null;
        }
        a1();
        if (i == 1) {
            if (this.f1658t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f1658t != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        e0 e0Var = (e0) D2.getLayoutParams();
        e0Var.getClass();
        h0 h0Var = e0Var.f2434e;
        int N02 = i2 == 1 ? N0() : M0();
        d1(N02, v2);
        c1(i2);
        r rVar = this.f1660v;
        rVar.f2532c = rVar.d + N02;
        rVar.f2531b = (int) (this.f1656r.l() * 0.33333334f);
        rVar.h = true;
        rVar.f2530a = false;
        H0(o2, rVar, v2);
        this.f1647D = this.f1662x;
        View g2 = h0Var.g(N02, i2);
        if (g2 != null && g2 != D2) {
            return g2;
        }
        if (V0(i2)) {
            for (int i3 = this.f1654p - 1; i3 >= 0; i3--) {
                View g3 = this.f1655q[i3].g(N02, i2);
                if (g3 != null && g3 != D2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1654p; i4++) {
                View g4 = this.f1655q[i4].g(N02, i2);
                if (g4 != null && g4 != D2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f1661w ^ true) == (i2 == -1);
        View q2 = q(z2 ? h0Var.c() : h0Var.d());
        if (q2 != null && q2 != D2) {
            return q2;
        }
        if (V0(i2)) {
            for (int i5 = this.f1654p - 1; i5 >= 0; i5--) {
                if (i5 != h0Var.f2462e) {
                    View q3 = q(z2 ? this.f1655q[i5].c() : this.f1655q[i5].d());
                    if (q3 != null && q3 != D2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1654p; i6++) {
                View q4 = q(z2 ? this.f1655q[i6].c() : this.f1655q[i6].d());
                if (q4 != null && q4 != D2) {
                    return q4;
                }
            }
        }
        return null;
    }

    public final void T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f2340b;
        Rect rect = this.f1649G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        e0 e0Var = (e0) view.getLayoutParams();
        int f12 = f1(i, ((ViewGroup.MarginLayoutParams) e0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) e0Var).rightMargin + rect.right);
        int f13 = f1(i2, ((ViewGroup.MarginLayoutParams) e0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) e0Var).bottomMargin + rect.bottom);
        if (w0(view, f12, f13, e0Var)) {
            view.measure(f12, f13);
        }
    }

    @Override // g0.I
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View J0 = J0(false);
            View I02 = I0(false);
            if (J0 == null || I02 == null) {
                return;
            }
            int H2 = I.H(J0);
            int H3 = I.H(I02);
            if (H2 < H3) {
                accessibilityEvent.setFromIndex(H2);
                accessibilityEvent.setToIndex(H3);
            } else {
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x0402, code lost:
    
        if (D0() != false) goto L247;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(O o2, V v2, boolean z2) {
        g0 g0Var;
        int i;
        int i2;
        g0 g0Var2 = this.F;
        d0 d0Var = this.f1650H;
        if (!(g0Var2 == null && this.f1664z == -1) && v2.b() == 0) {
            i0(o2);
            d0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (d0Var.f2427e && this.f1664z == -1 && this.F == null) ? false : true;
        j jVar = this.f1645B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = d0Var.f2429g;
        if (z4) {
            d0Var.a();
            g0 g0Var3 = this.F;
            if (g0Var3 != null) {
                int i3 = g0Var3.f2449c;
                if (i3 > 0) {
                    if (i3 == this.f1654p) {
                        for (int i4 = 0; i4 < this.f1654p; i4++) {
                            this.f1655q[i4].b();
                            g0 g0Var4 = this.F;
                            int i5 = g0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += g0Var4.i ? this.f1656r.g() : this.f1656r.k();
                            }
                            h0 h0Var = this.f1655q[i4];
                            h0Var.f2460b = i5;
                            h0Var.f2461c = i5;
                        }
                    } else {
                        g0Var3.d = null;
                        g0Var3.f2449c = 0;
                        g0Var3.f2450e = 0;
                        g0Var3.f2451f = null;
                        g0Var3.f2452g = null;
                        g0Var3.f2447a = g0Var3.f2448b;
                    }
                }
                g0 g0Var5 = this.F;
                this.f1648E = g0Var5.f2453j;
                boolean z5 = g0Var5.h;
                c(null);
                g0 g0Var6 = this.F;
                if (g0Var6 != null && g0Var6.h != z5) {
                    g0Var6.h = z5;
                }
                this.f1661w = z5;
                n0();
                a1();
                g0 g0Var7 = this.F;
                int i6 = g0Var7.f2447a;
                if (i6 != -1) {
                    this.f1664z = i6;
                    d0Var.f2426c = g0Var7.i;
                } else {
                    d0Var.f2426c = this.f1662x;
                }
                if (g0Var7.f2450e > 1) {
                    jVar.f56b = g0Var7.f2451f;
                    jVar.f57c = g0Var7.f2452g;
                }
            } else {
                a1();
                d0Var.f2426c = this.f1662x;
            }
            if (!v2.f2379g && (i2 = this.f1664z) != -1) {
                if (i2 < 0 || i2 >= v2.b()) {
                    this.f1664z = -1;
                    this.f1644A = Integer.MIN_VALUE;
                } else {
                    g0 g0Var8 = this.F;
                    if (g0Var8 == null || g0Var8.f2447a == -1 || g0Var8.f2449c < 1) {
                        View q2 = q(this.f1664z);
                        if (q2 != null) {
                            d0Var.f2424a = this.f1662x ? N0() : M0();
                            if (this.f1644A != Integer.MIN_VALUE) {
                                if (d0Var.f2426c) {
                                    d0Var.f2425b = (this.f1656r.g() - this.f1644A) - this.f1656r.b(q2);
                                } else {
                                    d0Var.f2425b = (this.f1656r.k() + this.f1644A) - this.f1656r.e(q2);
                                }
                            } else if (this.f1656r.c(q2) > this.f1656r.l()) {
                                d0Var.f2425b = d0Var.f2426c ? this.f1656r.g() : this.f1656r.k();
                            } else {
                                int e2 = this.f1656r.e(q2) - this.f1656r.k();
                                if (e2 < 0) {
                                    d0Var.f2425b = -e2;
                                } else {
                                    int g2 = this.f1656r.g() - this.f1656r.b(q2);
                                    if (g2 < 0) {
                                        d0Var.f2425b = g2;
                                    } else {
                                        d0Var.f2425b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f1664z;
                            d0Var.f2424a = i7;
                            int i8 = this.f1644A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = C0(i7) == 1;
                                d0Var.f2426c = z6;
                                d0Var.f2425b = z6 ? staggeredGridLayoutManager.f1656r.g() : staggeredGridLayoutManager.f1656r.k();
                            } else if (d0Var.f2426c) {
                                d0Var.f2425b = staggeredGridLayoutManager.f1656r.g() - i8;
                            } else {
                                d0Var.f2425b = staggeredGridLayoutManager.f1656r.k() + i8;
                            }
                            d0Var.d = true;
                        }
                    } else {
                        d0Var.f2425b = Integer.MIN_VALUE;
                        d0Var.f2424a = this.f1664z;
                    }
                    d0Var.f2427e = true;
                }
            }
            if (this.f1647D) {
                int b2 = v2.b();
                for (int v3 = v() - 1; v3 >= 0; v3--) {
                    i = I.H(u(v3));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                d0Var.f2424a = i;
                d0Var.f2425b = Integer.MIN_VALUE;
                d0Var.f2427e = true;
            } else {
                int b3 = v2.b();
                int v4 = v();
                for (int i9 = 0; i9 < v4; i9++) {
                    int H2 = I.H(u(i9));
                    if (H2 >= 0 && H2 < b3) {
                        i = H2;
                        break;
                    }
                }
                i = 0;
                d0Var.f2424a = i;
                d0Var.f2425b = Integer.MIN_VALUE;
                d0Var.f2427e = true;
            }
        }
        if (this.F == null && this.f1664z == -1 && (d0Var.f2426c != this.f1647D || S0() != this.f1648E)) {
            jVar.f();
            d0Var.d = true;
        }
        if (v() > 0 && ((g0Var = this.F) == null || g0Var.f2449c < 1)) {
            if (d0Var.d) {
                for (int i10 = 0; i10 < this.f1654p; i10++) {
                    this.f1655q[i10].b();
                    int i11 = d0Var.f2425b;
                    if (i11 != Integer.MIN_VALUE) {
                        h0 h0Var2 = this.f1655q[i10];
                        h0Var2.f2460b = i11;
                        h0Var2.f2461c = i11;
                    }
                }
            } else if (z4 || d0Var.f2428f == null) {
                for (int i12 = 0; i12 < this.f1654p; i12++) {
                    h0 h0Var3 = this.f1655q[i12];
                    boolean z7 = this.f1662x;
                    int i13 = d0Var.f2425b;
                    int f2 = z7 ? h0Var3.f(Integer.MIN_VALUE) : h0Var3.h(Integer.MIN_VALUE);
                    h0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = h0Var3.f2463f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f1656r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f1656r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            h0Var3.f2461c = f2;
                            h0Var3.f2460b = f2;
                        }
                    }
                }
                h0[] h0VarArr = this.f1655q;
                int length = h0VarArr.length;
                int[] iArr = d0Var.f2428f;
                if (iArr == null || iArr.length < length) {
                    d0Var.f2428f = new int[staggeredGridLayoutManager.f1655q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    d0Var.f2428f[i14] = h0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f1654p; i15++) {
                    h0 h0Var4 = this.f1655q[i15];
                    h0Var4.b();
                    int i16 = d0Var.f2428f[i15];
                    h0Var4.f2460b = i16;
                    h0Var4.f2461c = i16;
                }
            }
        }
        p(o2);
        r rVar = this.f1660v;
        rVar.f2530a = false;
        int l2 = this.f1657s.l();
        this.f1659u = l2 / this.f1654p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f1657s.i());
        d1(d0Var.f2424a, v2);
        if (d0Var.f2426c) {
            c1(-1);
            H0(o2, rVar, v2);
            c1(1);
            rVar.f2532c = d0Var.f2424a + rVar.d;
            H0(o2, rVar, v2);
        } else {
            c1(1);
            H0(o2, rVar, v2);
            c1(-1);
            rVar.f2532c = d0Var.f2424a + rVar.d;
            H0(o2, rVar, v2);
        }
        if (this.f1657s.i() != 1073741824) {
            int v5 = v();
            float f3 = RecyclerView.f1570A0;
            for (int i17 = 0; i17 < v5; i17++) {
                View u2 = u(i17);
                float c2 = this.f1657s.c(u2);
                if (c2 >= f3) {
                    ((e0) u2.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f1659u;
            int round = Math.round(f3 * this.f1654p);
            if (this.f1657s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f1657s.l());
            }
            this.f1659u = round / this.f1654p;
            View.MeasureSpec.makeMeasureSpec(round, this.f1657s.i());
            if (this.f1659u != i18) {
                for (int i19 = 0; i19 < v5; i19++) {
                    View u3 = u(i19);
                    e0 e0Var = (e0) u3.getLayoutParams();
                    e0Var.getClass();
                    if (S0() && this.f1658t == 1) {
                        int i20 = -((this.f1654p - 1) - e0Var.f2434e.f2462e);
                        u3.offsetLeftAndRight((this.f1659u * i20) - (i20 * i18));
                    } else {
                        int i21 = e0Var.f2434e.f2462e;
                        int i22 = this.f1659u * i21;
                        int i23 = i21 * i18;
                        if (this.f1658t == 1) {
                            u3.offsetLeftAndRight(i22 - i23);
                        } else {
                            u3.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f1662x) {
                K0(o2, v2, true);
                L0(o2, v2, false);
            } else {
                L0(o2, v2, true);
                K0(o2, v2, false);
            }
        }
        if (z2 && !v2.f2379g && this.f1646C != 0 && v() > 0 && R0() != null) {
            RecyclerView recyclerView = this.f2340b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f1653K);
            }
        }
        z3 = false;
        if (v2.f2379g) {
            d0Var.a();
        }
        this.f1647D = d0Var.f2426c;
        this.f1648E = S0();
        if (z3) {
            d0Var.a();
            U0(o2, v2, false);
        }
    }

    public final boolean V0(int i) {
        if (this.f1658t == 0) {
            return (i == -1) != this.f1662x;
        }
        return ((i == -1) == this.f1662x) == S0();
    }

    public final void W0(int i, V v2) {
        int M02;
        int i2;
        if (i > 0) {
            M02 = N0();
            i2 = 1;
        } else {
            M02 = M0();
            i2 = -1;
        }
        r rVar = this.f1660v;
        rVar.f2530a = true;
        d1(M02, v2);
        c1(i2);
        rVar.f2532c = M02 + rVar.d;
        rVar.f2531b = Math.abs(i);
    }

    public final void X0(O o2, r rVar) {
        if (!rVar.f2530a || rVar.i) {
            return;
        }
        if (rVar.f2531b == 0) {
            if (rVar.f2533e == -1) {
                Y0(o2, rVar.f2535g);
                return;
            } else {
                Z0(o2, rVar.f2534f);
                return;
            }
        }
        int i = 1;
        if (rVar.f2533e == -1) {
            int i2 = rVar.f2534f;
            int h = this.f1655q[0].h(i2);
            while (i < this.f1654p) {
                int h2 = this.f1655q[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            Y0(o2, i3 < 0 ? rVar.f2535g : rVar.f2535g - Math.min(i3, rVar.f2531b));
            return;
        }
        int i4 = rVar.f2535g;
        int f2 = this.f1655q[0].f(i4);
        while (i < this.f1654p) {
            int f3 = this.f1655q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - rVar.f2535g;
        Z0(o2, i5 < 0 ? rVar.f2534f : Math.min(i5, rVar.f2531b) + rVar.f2534f);
    }

    @Override // g0.I
    public final void Y(int i, int i2) {
        Q0(i, i2, 1);
    }

    public final void Y0(O o2, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f1656r.e(u2) < i || this.f1656r.o(u2) < i) {
                return;
            }
            e0 e0Var = (e0) u2.getLayoutParams();
            e0Var.getClass();
            if (e0Var.f2434e.f2459a.size() == 1) {
                return;
            }
            h0 h0Var = e0Var.f2434e;
            ArrayList arrayList = h0Var.f2459a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            e0 e0Var2 = (e0) view.getLayoutParams();
            e0Var2.f2434e = null;
            if (e0Var2.f2351a.i() || e0Var2.f2351a.l()) {
                h0Var.d -= h0Var.f2463f.f1656r.c(view);
            }
            if (size == 1) {
                h0Var.f2460b = Integer.MIN_VALUE;
            }
            h0Var.f2461c = Integer.MIN_VALUE;
            k0(u2, o2);
        }
    }

    @Override // g0.I
    public final void Z() {
        this.f1645B.f();
        n0();
    }

    public final void Z0(O o2, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f1656r.b(u2) > i || this.f1656r.n(u2) > i) {
                return;
            }
            e0 e0Var = (e0) u2.getLayoutParams();
            e0Var.getClass();
            if (e0Var.f2434e.f2459a.size() == 1) {
                return;
            }
            h0 h0Var = e0Var.f2434e;
            ArrayList arrayList = h0Var.f2459a;
            View view = (View) arrayList.remove(0);
            e0 e0Var2 = (e0) view.getLayoutParams();
            e0Var2.f2434e = null;
            if (arrayList.size() == 0) {
                h0Var.f2461c = Integer.MIN_VALUE;
            }
            if (e0Var2.f2351a.i() || e0Var2.f2351a.l()) {
                h0Var.d -= h0Var.f2463f.f1656r.c(view);
            }
            h0Var.f2460b = Integer.MIN_VALUE;
            k0(u2, o2);
        }
    }

    @Override // g0.U
    public final PointF a(int i) {
        int C02 = C0(i);
        PointF pointF = new PointF();
        if (C02 == 0) {
            return null;
        }
        if (this.f1658t == 0) {
            pointF.x = C02;
            pointF.y = RecyclerView.f1570A0;
        } else {
            pointF.x = RecyclerView.f1570A0;
            pointF.y = C02;
        }
        return pointF;
    }

    @Override // g0.I
    public final void a0(int i, int i2) {
        Q0(i, i2, 8);
    }

    public final void a1() {
        if (this.f1658t == 1 || !S0()) {
            this.f1662x = this.f1661w;
        } else {
            this.f1662x = !this.f1661w;
        }
    }

    @Override // g0.I
    public final void b0(int i, int i2) {
        Q0(i, i2, 2);
    }

    public final int b1(int i, O o2, V v2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        W0(i, v2);
        r rVar = this.f1660v;
        int H02 = H0(o2, rVar, v2);
        if (rVar.f2531b >= H02) {
            i = i < 0 ? -H02 : H02;
        }
        this.f1656r.p(-i);
        this.f1647D = this.f1662x;
        rVar.f2531b = 0;
        X0(o2, rVar);
        return i;
    }

    @Override // g0.I
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // g0.I
    public final void c0(int i, int i2) {
        Q0(i, i2, 4);
    }

    public final void c1(int i) {
        r rVar = this.f1660v;
        rVar.f2533e = i;
        rVar.d = this.f1662x != (i == -1) ? -1 : 1;
    }

    @Override // g0.I
    public final boolean d() {
        return this.f1658t == 0;
    }

    @Override // g0.I
    public final void d0(O o2, V v2) {
        U0(o2, v2, true);
    }

    public final void d1(int i, V v2) {
        int i2;
        int i3;
        int i4;
        r rVar = this.f1660v;
        boolean z2 = false;
        rVar.f2531b = 0;
        rVar.f2532c = i;
        C0133w c0133w = this.f2342e;
        if (!(c0133w != null && c0133w.f2558e) || (i4 = v2.f2374a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f1662x == (i4 < i)) {
                i2 = this.f1656r.l();
                i3 = 0;
            } else {
                i3 = this.f1656r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView == null || !recyclerView.h) {
            rVar.f2535g = this.f1656r.f() + i2;
            rVar.f2534f = -i3;
        } else {
            rVar.f2534f = this.f1656r.k() - i3;
            rVar.f2535g = this.f1656r.g() + i2;
        }
        rVar.h = false;
        rVar.f2530a = true;
        if (this.f1656r.i() == 0 && this.f1656r.f() == 0) {
            z2 = true;
        }
        rVar.i = z2;
    }

    @Override // g0.I
    public final boolean e() {
        return this.f1658t == 1;
    }

    @Override // g0.I
    public final void e0(V v2) {
        this.f1664z = -1;
        this.f1644A = Integer.MIN_VALUE;
        this.F = null;
        this.f1650H.a();
    }

    public final void e1(h0 h0Var, int i, int i2) {
        int i3 = h0Var.d;
        int i4 = h0Var.f2462e;
        if (i != -1) {
            int i5 = h0Var.f2461c;
            if (i5 == Integer.MIN_VALUE) {
                h0Var.a();
                i5 = h0Var.f2461c;
            }
            if (i5 - i3 >= i2) {
                this.f1663y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = h0Var.f2460b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) h0Var.f2459a.get(0);
            e0 e0Var = (e0) view.getLayoutParams();
            h0Var.f2460b = h0Var.f2463f.f1656r.e(view);
            e0Var.getClass();
            i6 = h0Var.f2460b;
        }
        if (i6 + i3 <= i2) {
            this.f1663y.set(i4, false);
        }
    }

    @Override // g0.I
    public final boolean f(J j2) {
        return j2 instanceof e0;
    }

    @Override // g0.I
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof g0) {
            g0 g0Var = (g0) parcelable;
            this.F = g0Var;
            if (this.f1664z != -1) {
                g0Var.d = null;
                g0Var.f2449c = 0;
                g0Var.f2447a = -1;
                g0Var.f2448b = -1;
                g0Var.d = null;
                g0Var.f2449c = 0;
                g0Var.f2450e = 0;
                g0Var.f2451f = null;
                g0Var.f2452g = null;
            }
            n0();
        }
    }

    @Override // g0.I
    public final Parcelable g0() {
        int h;
        int k2;
        int[] iArr;
        g0 g0Var = this.F;
        if (g0Var != null) {
            g0 g0Var2 = new g0();
            g0Var2.f2449c = g0Var.f2449c;
            g0Var2.f2447a = g0Var.f2447a;
            g0Var2.f2448b = g0Var.f2448b;
            g0Var2.d = g0Var.d;
            g0Var2.f2450e = g0Var.f2450e;
            g0Var2.f2451f = g0Var.f2451f;
            g0Var2.h = g0Var.h;
            g0Var2.i = g0Var.i;
            g0Var2.f2453j = g0Var.f2453j;
            g0Var2.f2452g = g0Var.f2452g;
            return g0Var2;
        }
        g0 g0Var3 = new g0();
        g0Var3.h = this.f1661w;
        g0Var3.i = this.f1647D;
        g0Var3.f2453j = this.f1648E;
        j jVar = this.f1645B;
        if (jVar == null || (iArr = (int[]) jVar.f56b) == null) {
            g0Var3.f2450e = 0;
        } else {
            g0Var3.f2451f = iArr;
            g0Var3.f2450e = iArr.length;
            g0Var3.f2452g = (ArrayList) jVar.f57c;
        }
        if (v() > 0) {
            g0Var3.f2447a = this.f1647D ? N0() : M0();
            View I02 = this.f1662x ? I0(true) : J0(true);
            g0Var3.f2448b = I02 != null ? I.H(I02) : -1;
            int i = this.f1654p;
            g0Var3.f2449c = i;
            g0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f1654p; i2++) {
                if (this.f1647D) {
                    h = this.f1655q[i2].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1656r.g();
                        h -= k2;
                        g0Var3.d[i2] = h;
                    } else {
                        g0Var3.d[i2] = h;
                    }
                } else {
                    h = this.f1655q[i2].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f1656r.k();
                        h -= k2;
                        g0Var3.d[i2] = h;
                    } else {
                        g0Var3.d[i2] = h;
                    }
                }
            }
        } else {
            g0Var3.f2447a = -1;
            g0Var3.f2448b = -1;
            g0Var3.f2449c = 0;
        }
        return g0Var3;
    }

    @Override // g0.I
    public final void h(int i, int i2, V v2, C0125n c0125n) {
        r rVar;
        int f2;
        int i3;
        if (this.f1658t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        W0(i, v2);
        int[] iArr = this.f1652J;
        if (iArr == null || iArr.length < this.f1654p) {
            this.f1652J = new int[this.f1654p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f1654p;
            rVar = this.f1660v;
            if (i4 >= i6) {
                break;
            }
            if (rVar.d == -1) {
                f2 = rVar.f2534f;
                i3 = this.f1655q[i4].h(f2);
            } else {
                f2 = this.f1655q[i4].f(rVar.f2535g);
                i3 = rVar.f2535g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f1652J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f1652J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = rVar.f2532c;
            if (i9 < 0 || i9 >= v2.b()) {
                return;
            }
            c0125n.a(rVar.f2532c, this.f1652J[i8]);
            rVar.f2532c += rVar.d;
        }
    }

    @Override // g0.I
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // g0.I
    public final int j(V v2) {
        return E0(v2);
    }

    @Override // g0.I
    public final int k(V v2) {
        return F0(v2);
    }

    @Override // g0.I
    public final int l(V v2) {
        return G0(v2);
    }

    @Override // g0.I
    public final int m(V v2) {
        return E0(v2);
    }

    @Override // g0.I
    public final int n(V v2) {
        return F0(v2);
    }

    @Override // g0.I
    public final int o(V v2) {
        return G0(v2);
    }

    @Override // g0.I
    public final int o0(int i, O o2, V v2) {
        return b1(i, o2, v2);
    }

    @Override // g0.I
    public final void p0(int i) {
        g0 g0Var = this.F;
        if (g0Var != null && g0Var.f2447a != i) {
            g0Var.d = null;
            g0Var.f2449c = 0;
            g0Var.f2447a = -1;
            g0Var.f2448b = -1;
        }
        this.f1664z = i;
        this.f1644A = Integer.MIN_VALUE;
        n0();
    }

    @Override // g0.I
    public final int q0(int i, O o2, V v2) {
        return b1(i, o2, v2);
    }

    @Override // g0.I
    public final J r() {
        return this.f1658t == 0 ? new e0(-2, -1) : new e0(-1, -2);
    }

    @Override // g0.I
    public final J s(Context context, AttributeSet attributeSet) {
        return new e0(context, attributeSet);
    }

    @Override // g0.I
    public final J t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e0((ViewGroup.MarginLayoutParams) layoutParams) : new e0(layoutParams);
    }

    @Override // g0.I
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f1654p;
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1658t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2340b;
            WeakHashMap weakHashMap = T.f372a;
            g3 = I.g(i2, height, recyclerView.getMinimumHeight());
            g2 = I.g(i, (this.f1659u * i3) + F, this.f2340b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2340b;
            WeakHashMap weakHashMap2 = T.f372a;
            g2 = I.g(i, width, recyclerView2.getMinimumWidth());
            g3 = I.g(i2, (this.f1659u * i3) + D2, this.f2340b.getMinimumHeight());
        }
        this.f2340b.setMeasuredDimension(g2, g3);
    }

    @Override // g0.I
    public final void z0(RecyclerView recyclerView, int i) {
        C0133w c0133w = new C0133w(recyclerView.getContext());
        c0133w.f2555a = i;
        A0(c0133w);
    }
}

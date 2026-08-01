package androidx.recyclerview.widget;

import A1.e;
import B.j;
import K.T;
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
import g0.C0164q;
import g0.C0168v;
import g0.U;
import g0.V;
import g0.d0;
import g0.e0;
import g0.f0;
import g0.g0;
import g0.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0139I implements U {

    /* renamed from: B, reason: collision with root package name */
    public final j f2024B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2025C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2026D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2027E;
    public g0 F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f2028G;

    /* renamed from: H, reason: collision with root package name */
    public final d0 f2029H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f2030I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f2031J;

    /* renamed from: K, reason: collision with root package name */
    public final e f2032K;

    /* renamed from: p, reason: collision with root package name */
    public final int f2033p;

    /* renamed from: q, reason: collision with root package name */
    public final h0[] f2034q;

    /* renamed from: r, reason: collision with root package name */
    public final g f2035r;

    /* renamed from: s, reason: collision with root package name */
    public final g f2036s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2037t;

    /* renamed from: u, reason: collision with root package name */
    public int f2038u;

    /* renamed from: v, reason: collision with root package name */
    public final C0164q f2039v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2040w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f2042y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2041x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f2043z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f2023A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2033p = -1;
        this.f2040w = false;
        j jVar = new j(13, false);
        this.f2024B = jVar;
        this.f2025C = 2;
        this.f2028G = new Rect();
        this.f2029H = new d0(this);
        this.f2030I = true;
        this.f2032K = new e(10, this);
        C0138H I2 = AbstractC0139I.I(context, attributeSet, i, i2);
        int i3 = I2.f2774a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i3 != this.f2037t) {
            this.f2037t = i3;
            g gVar = this.f2035r;
            this.f2035r = this.f2036s;
            this.f2036s = gVar;
            n0();
        }
        int i4 = I2.f2775b;
        c(null);
        if (i4 != this.f2033p) {
            jVar.g();
            n0();
            this.f2033p = i4;
            this.f2042y = new BitSet(this.f2033p);
            this.f2034q = new h0[this.f2033p];
            for (int i5 = 0; i5 < this.f2033p; i5++) {
                this.f2034q[i5] = new h0(this, i5);
            }
            n0();
        }
        boolean z2 = I2.f2776c;
        c(null);
        g0 g0Var = this.F;
        if (g0Var != null && g0Var.h != z2) {
            g0Var.h = z2;
        }
        this.f2040w = z2;
        n0();
        C0164q c0164q = new C0164q();
        c0164q.f2966a = true;
        c0164q.f2970f = 0;
        c0164q.f2971g = 0;
        this.f2039v = c0164q;
        this.f2035r = g.a(this, this.f2037t);
        this.f2036s = g.a(this, 1 - this.f2037t);
    }

    public static int f1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // g0.AbstractC0139I
    public final boolean B0() {
        return this.F == null;
    }

    public final int C0(int i) {
        if (v() == 0) {
            return this.f2041x ? 1 : -1;
        }
        return (i < M0()) != this.f2041x ? -1 : 1;
    }

    public final boolean D0() {
        int M02;
        if (v() != 0 && this.f2025C != 0 && this.f2782g) {
            if (this.f2041x) {
                M02 = N0();
                M0();
            } else {
                M02 = M0();
                N0();
            }
            j jVar = this.f2024B;
            if (M02 == 0 && R0() != null) {
                jVar.g();
                this.f2781f = true;
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
        g gVar = this.f2035r;
        boolean z2 = !this.f2030I;
        return AbstractC0067d.b(v2, gVar, J0(z2), I0(z2), this, this.f2030I);
    }

    public final int F0(V v2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2035r;
        boolean z2 = !this.f2030I;
        return AbstractC0067d.c(v2, gVar, J0(z2), I0(z2), this, this.f2030I, this.f2041x);
    }

    public final int G0(V v2) {
        if (v() == 0) {
            return 0;
        }
        g gVar = this.f2035r;
        boolean z2 = !this.f2030I;
        return AbstractC0067d.d(v2, gVar, J0(z2), I0(z2), this, this.f2030I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int H0(C0145O c0145o, C0164q c0164q, V v2) {
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
        this.f2042y.set(0, this.f2033p, true);
        C0164q c0164q2 = this.f2039v;
        int i8 = c0164q2.i ? c0164q.f2969e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0164q.f2969e == 1 ? c0164q.f2971g + c0164q.f2967b : c0164q.f2970f - c0164q.f2967b;
        int i9 = c0164q.f2969e;
        for (int i10 = 0; i10 < this.f2033p; i10++) {
            if (!this.f2034q[i10].f2899a.isEmpty()) {
                e1(this.f2034q[i10], i9, i8);
            }
        }
        int g2 = this.f2041x ? this.f2035r.g() : this.f2035r.k();
        boolean z2 = false;
        while (true) {
            int i11 = c0164q.f2968c;
            if (((i11 < 0 || i11 >= v2.b()) ? i6 : i7) == 0 || (!c0164q2.i && this.f2042y.isEmpty())) {
                break;
            }
            View view = c0145o.k(c0164q.f2968c, Long.MAX_VALUE).f2830a;
            c0164q.f2968c += c0164q.d;
            e0 e0Var = (e0) view.getLayoutParams();
            int b2 = e0Var.f2789a.b();
            j jVar = this.f2024B;
            int[] iArr = (int[]) jVar.f72b;
            int i12 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i12 == -1) {
                if (V0(c0164q.f2969e)) {
                    i5 = this.f2033p - i7;
                    i4 = -1;
                    i3 = -1;
                } else {
                    i3 = i7;
                    i4 = this.f2033p;
                    i5 = i6;
                }
                h0 h0Var2 = null;
                if (c0164q.f2969e == i7) {
                    int k3 = this.f2035r.k();
                    int i13 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        h0 h0Var3 = this.f2034q[i5];
                        int f2 = h0Var3.f(k3);
                        if (f2 < i13) {
                            i13 = f2;
                            h0Var2 = h0Var3;
                        }
                        i5 += i3;
                    }
                } else {
                    int g3 = this.f2035r.g();
                    int i14 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        h0 h0Var4 = this.f2034q[i5];
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
                ((int[]) jVar.f72b)[b2] = h0Var.f2902e;
            } else {
                h0Var = this.f2034q[i12];
            }
            e0Var.f2875e = h0Var;
            if (c0164q.f2969e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f2037t == 1) {
                i = 1;
                T0(view, AbstractC0139I.w(this.f2038u, this.f2785l, r6, r6, ((ViewGroup.MarginLayoutParams) e0Var).width), AbstractC0139I.w(this.f2788o, this.f2786m, D() + G(), true, ((ViewGroup.MarginLayoutParams) e0Var).height));
            } else {
                i = 1;
                T0(view, AbstractC0139I.w(this.f2787n, this.f2785l, F() + E(), true, ((ViewGroup.MarginLayoutParams) e0Var).width), AbstractC0139I.w(this.f2038u, this.f2786m, 0, false, ((ViewGroup.MarginLayoutParams) e0Var).height));
            }
            if (c0164q.f2969e == i) {
                c2 = h0Var.f(g2);
                h = this.f2035r.c(view) + c2;
            } else {
                h = h0Var.h(g2);
                c2 = h - this.f2035r.c(view);
            }
            if (c0164q.f2969e == 1) {
                h0 h0Var5 = e0Var.f2875e;
                h0Var5.getClass();
                e0 e0Var2 = (e0) view.getLayoutParams();
                e0Var2.f2875e = h0Var5;
                ArrayList arrayList = h0Var5.f2899a;
                arrayList.add(view);
                h0Var5.f2901c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    h0Var5.f2900b = Integer.MIN_VALUE;
                }
                if (e0Var2.f2789a.i() || e0Var2.f2789a.l()) {
                    h0Var5.d = h0Var5.f2903f.f2035r.c(view) + h0Var5.d;
                }
            } else {
                h0 h0Var6 = e0Var.f2875e;
                h0Var6.getClass();
                e0 e0Var3 = (e0) view.getLayoutParams();
                e0Var3.f2875e = h0Var6;
                ArrayList arrayList2 = h0Var6.f2899a;
                arrayList2.add(0, view);
                h0Var6.f2900b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    h0Var6.f2901c = Integer.MIN_VALUE;
                }
                if (e0Var3.f2789a.i() || e0Var3.f2789a.l()) {
                    h0Var6.d = h0Var6.f2903f.f2035r.c(view) + h0Var6.d;
                }
            }
            if (S0() && this.f2037t == 1) {
                c3 = this.f2036s.g() - (((this.f2033p - 1) - h0Var.f2902e) * this.f2038u);
                k2 = c3 - this.f2036s.c(view);
            } else {
                k2 = this.f2036s.k() + (h0Var.f2902e * this.f2038u);
                c3 = this.f2036s.c(view) + k2;
            }
            if (this.f2037t == 1) {
                AbstractC0139I.N(view, k2, c2, c3, h);
            } else {
                AbstractC0139I.N(view, c2, k2, h, c3);
            }
            e1(h0Var, c0164q2.f2969e, i8);
            X0(c0145o, c0164q2);
            if (c0164q2.h && view.hasFocusable()) {
                i2 = 0;
                this.f2042y.set(h0Var.f2902e, false);
            } else {
                i2 = 0;
            }
            i6 = i2;
            i7 = 1;
            z2 = true;
        }
        int i15 = i6;
        if (!z2) {
            X0(c0145o, c0164q2);
        }
        int k4 = c0164q2.f2969e == -1 ? this.f2035r.k() - P0(this.f2035r.k()) : O0(this.f2035r.g()) - this.f2035r.g();
        return k4 > 0 ? Math.min(c0164q.f2967b, k4) : i15;
    }

    public final View I0(boolean z2) {
        int k2 = this.f2035r.k();
        int g2 = this.f2035r.g();
        View view = null;
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            int e2 = this.f2035r.e(u2);
            int b2 = this.f2035r.b(u2);
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
        int k2 = this.f2035r.k();
        int g2 = this.f2035r.g();
        int v2 = v();
        View view = null;
        for (int i = 0; i < v2; i++) {
            View u2 = u(i);
            int e2 = this.f2035r.e(u2);
            if (this.f2035r.b(u2) > k2 && e2 < g2) {
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

    public final void K0(C0145O c0145o, V v2, boolean z2) {
        int g2;
        int O02 = O0(Integer.MIN_VALUE);
        if (O02 != Integer.MIN_VALUE && (g2 = this.f2035r.g() - O02) > 0) {
            int i = g2 - (-b1(-g2, c0145o, v2));
            if (!z2 || i <= 0) {
                return;
            }
            this.f2035r.p(i);
        }
    }

    @Override // g0.AbstractC0139I
    public final boolean L() {
        return this.f2025C != 0;
    }

    public final void L0(C0145O c0145o, V v2, boolean z2) {
        int k2;
        int P02 = P0(Integer.MAX_VALUE);
        if (P02 != Integer.MAX_VALUE && (k2 = P02 - this.f2035r.k()) > 0) {
            int b12 = k2 - b1(k2, c0145o, v2);
            if (!z2 || b12 <= 0) {
                return;
            }
            this.f2035r.p(-b12);
        }
    }

    public final int M0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC0139I.H(u(0));
    }

    public final int N0() {
        int v2 = v();
        if (v2 == 0) {
            return 0;
        }
        return AbstractC0139I.H(u(v2 - 1));
    }

    @Override // g0.AbstractC0139I
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.f2033p; i2++) {
            h0 h0Var = this.f2034q[i2];
            int i3 = h0Var.f2900b;
            if (i3 != Integer.MIN_VALUE) {
                h0Var.f2900b = i3 + i;
            }
            int i4 = h0Var.f2901c;
            if (i4 != Integer.MIN_VALUE) {
                h0Var.f2901c = i4 + i;
            }
        }
    }

    public final int O0(int i) {
        int f2 = this.f2034q[0].f(i);
        for (int i2 = 1; i2 < this.f2033p; i2++) {
            int f3 = this.f2034q[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    @Override // g0.AbstractC0139I
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.f2033p; i2++) {
            h0 h0Var = this.f2034q[i2];
            int i3 = h0Var.f2900b;
            if (i3 != Integer.MIN_VALUE) {
                h0Var.f2900b = i3 + i;
            }
            int i4 = h0Var.f2901c;
            if (i4 != Integer.MIN_VALUE) {
                h0Var.f2901c = i4 + i;
            }
        }
    }

    public final int P0(int i) {
        int h = this.f2034q[0].h(i);
        for (int i2 = 1; i2 < this.f2033p; i2++) {
            int h2 = this.f2034q[i2].h(i);
            if (h2 < h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // g0.AbstractC0139I
    public final void Q() {
        this.f2024B.g();
        for (int i = 0; i < this.f2033p; i++) {
            this.f2034q[i].b();
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
        int N02 = this.f2041x ? N0() : M0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                jVar = this.f2024B;
                iArr = (int[]) jVar.f72b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) jVar.f73c;
                    if (arrayList != null) {
                        f0 f0Var = null;
                        if (arrayList != null) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                f0 f0Var2 = (f0) ((ArrayList) jVar.f73c).get(size);
                                if (f0Var2.f2880a == i5) {
                                    f0Var = f0Var2;
                                    break;
                                }
                                size--;
                            }
                        }
                        if (f0Var != null) {
                            ((ArrayList) jVar.f73c).remove(f0Var);
                        }
                        int size2 = ((ArrayList) jVar.f73c).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((f0) ((ArrayList) jVar.f73c).get(i7)).f2880a >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            f0 f0Var3 = (f0) ((ArrayList) jVar.f73c).get(i7);
                            ((ArrayList) jVar.f73c).remove(i7);
                            i6 = f0Var3.f2880a;
                            if (i6 == -1) {
                                int[] iArr2 = (int[]) jVar.f72b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) jVar.f72b).length;
                            } else {
                                Arrays.fill((int[]) jVar.f72b, i5, Math.min(i6 + 1, ((int[]) jVar.f72b).length), -1);
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
                if (i5 <= (this.f2041x ? M0() : N0())) {
                    n0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        jVar = this.f2024B;
        iArr = (int[]) jVar.f72b;
        if (iArr != null) {
            arrayList = (ArrayList) jVar.f73c;
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
        BitSet bitSet = new BitSet(this.f2033p);
        bitSet.set(0, this.f2033p, true);
        char c2 = (this.f2037t == 1 && S0()) ? (char) 1 : (char) 65535;
        if (this.f2041x) {
            v2 = -1;
        } else {
            i = 0;
        }
        int i2 = i < v2 ? 1 : -1;
        while (i != v2) {
            View u2 = u(i);
            e0 e0Var = (e0) u2.getLayoutParams();
            if (bitSet.get(e0Var.f2875e.f2902e)) {
                h0 h0Var = e0Var.f2875e;
                if (this.f2041x) {
                    int i3 = h0Var.f2901c;
                    if (i3 == Integer.MIN_VALUE) {
                        h0Var.a();
                        i3 = h0Var.f2901c;
                    }
                    if (i3 < this.f2035r.g()) {
                        ArrayList arrayList = h0Var.f2899a;
                        ((e0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(e0Var.f2875e.f2902e);
                } else {
                    int i4 = h0Var.f2900b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) h0Var.f2899a.get(0);
                        e0 e0Var2 = (e0) view.getLayoutParams();
                        h0Var.f2900b = h0Var.f2903f.f2035r.e(view);
                        e0Var2.getClass();
                        i4 = h0Var.f2900b;
                    }
                    if (i4 > this.f2035r.k()) {
                        ((e0) ((View) h0Var.f2899a.get(0)).getLayoutParams()).getClass();
                        return u2;
                    }
                    bitSet.clear(e0Var.f2875e.f2902e);
                }
            }
            i += i2;
            if (i != v2) {
                View u3 = u(i);
                if (this.f2041x) {
                    int b2 = this.f2035r.b(u2);
                    int b3 = this.f2035r.b(u3);
                    if (b2 < b3) {
                        return u2;
                    }
                    if (b2 == b3) {
                        if ((e0Var.f2875e.f2902e - ((e0) u3.getLayoutParams()).f2875e.f2902e >= 0) == (c2 >= 0)) {
                            return u2;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e2 = this.f2035r.e(u2);
                    int e3 = this.f2035r.e(u3);
                    if (e2 > e3) {
                        return u2;
                    }
                    if (e2 == e3) {
                        if ((e0Var.f2875e.f2902e - ((e0) u3.getLayoutParams()).f2875e.f2902e >= 0) == (c2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // g0.AbstractC0139I
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2778b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2032K);
        }
        for (int i = 0; i < this.f2033p; i++) {
            this.f2034q[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean S0() {
        return C() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004d, code lost:
    
        if (r8.f2037t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0052, code lost:
    
        if (r8.f2037t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005f, code lost:
    
        if (S0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006c, code lost:
    
        if (S0() == false) goto L46;
     */
    @Override // g0.AbstractC0139I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, C0145O c0145o, V v2) {
        View D2;
        int i2;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView == null || (D2 = recyclerView.D(view)) == null || this.f2777a.f2852c.contains(D2)) {
            D2 = null;
        }
        if (D2 == null) {
            return null;
        }
        a1();
        if (i == 1) {
            if (this.f2037t != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.f2037t != 1) {
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
        h0 h0Var = e0Var.f2875e;
        int N02 = i2 == 1 ? N0() : M0();
        d1(N02, v2);
        c1(i2);
        C0164q c0164q = this.f2039v;
        c0164q.f2968c = c0164q.d + N02;
        c0164q.f2967b = (int) (this.f2035r.l() * 0.33333334f);
        c0164q.h = true;
        c0164q.f2966a = false;
        H0(c0145o, c0164q, v2);
        this.f2026D = this.f2041x;
        View g2 = h0Var.g(N02, i2);
        if (g2 != null && g2 != D2) {
            return g2;
        }
        if (V0(i2)) {
            for (int i3 = this.f2033p - 1; i3 >= 0; i3--) {
                View g3 = this.f2034q[i3].g(N02, i2);
                if (g3 != null && g3 != D2) {
                    return g3;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f2033p; i4++) {
                View g4 = this.f2034q[i4].g(N02, i2);
                if (g4 != null && g4 != D2) {
                    return g4;
                }
            }
        }
        boolean z2 = (this.f2040w ^ true) == (i2 == -1);
        View q2 = q(z2 ? h0Var.c() : h0Var.d());
        if (q2 != null && q2 != D2) {
            return q2;
        }
        if (V0(i2)) {
            for (int i5 = this.f2033p - 1; i5 >= 0; i5--) {
                if (i5 != h0Var.f2902e) {
                    View q3 = q(z2 ? this.f2034q[i5].c() : this.f2034q[i5].d());
                    if (q3 != null && q3 != D2) {
                        return q3;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f2033p; i6++) {
                View q4 = q(z2 ? this.f2034q[i6].c() : this.f2034q[i6].d());
                if (q4 != null && q4 != D2) {
                    return q4;
                }
            }
        }
        return null;
    }

    public final void T0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f2778b;
        Rect rect = this.f2028G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.M(view));
        }
        e0 e0Var = (e0) view.getLayoutParams();
        int f1 = f1(i, ((ViewGroup.MarginLayoutParams) e0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) e0Var).rightMargin + rect.right);
        int f12 = f1(i2, ((ViewGroup.MarginLayoutParams) e0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) e0Var).bottomMargin + rect.bottom);
        if (w0(view, f1, f12, e0Var)) {
            view.measure(f1, f12);
        }
    }

    @Override // g0.AbstractC0139I
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View J02 = J0(false);
            View I02 = I0(false);
            if (J02 == null || I02 == null) {
                return;
            }
            int H2 = AbstractC0139I.H(J02);
            int H3 = AbstractC0139I.H(I02);
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
    public final void U0(C0145O c0145o, V v2, boolean z2) {
        g0 g0Var;
        int i;
        int i2;
        g0 g0Var2 = this.F;
        d0 d0Var = this.f2029H;
        if (!(g0Var2 == null && this.f2043z == -1) && v2.b() == 0) {
            i0(c0145o);
            d0Var.a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (d0Var.f2867e && this.f2043z == -1 && this.F == null) ? false : true;
        j jVar = this.f2024B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = d0Var.f2869g;
        if (z4) {
            d0Var.a();
            g0 g0Var3 = this.F;
            if (g0Var3 != null) {
                int i3 = g0Var3.f2890c;
                if (i3 > 0) {
                    if (i3 == this.f2033p) {
                        for (int i4 = 0; i4 < this.f2033p; i4++) {
                            this.f2034q[i4].b();
                            g0 g0Var4 = this.F;
                            int i5 = g0Var4.d[i4];
                            if (i5 != Integer.MIN_VALUE) {
                                i5 += g0Var4.i ? this.f2035r.g() : this.f2035r.k();
                            }
                            h0 h0Var = this.f2034q[i4];
                            h0Var.f2900b = i5;
                            h0Var.f2901c = i5;
                        }
                    } else {
                        g0Var3.d = null;
                        g0Var3.f2890c = 0;
                        g0Var3.f2891e = 0;
                        g0Var3.f2892f = null;
                        g0Var3.f2893g = null;
                        g0Var3.f2888a = g0Var3.f2889b;
                    }
                }
                g0 g0Var5 = this.F;
                this.f2027E = g0Var5.f2894j;
                boolean z5 = g0Var5.h;
                c(null);
                g0 g0Var6 = this.F;
                if (g0Var6 != null && g0Var6.h != z5) {
                    g0Var6.h = z5;
                }
                this.f2040w = z5;
                n0();
                a1();
                g0 g0Var7 = this.F;
                int i6 = g0Var7.f2888a;
                if (i6 != -1) {
                    this.f2043z = i6;
                    d0Var.f2866c = g0Var7.i;
                } else {
                    d0Var.f2866c = this.f2041x;
                }
                if (g0Var7.f2891e > 1) {
                    jVar.f72b = g0Var7.f2892f;
                    jVar.f73c = g0Var7.f2893g;
                }
            } else {
                a1();
                d0Var.f2866c = this.f2041x;
            }
            if (!v2.f2817g && (i2 = this.f2043z) != -1) {
                if (i2 < 0 || i2 >= v2.b()) {
                    this.f2043z = -1;
                    this.f2023A = Integer.MIN_VALUE;
                } else {
                    g0 g0Var8 = this.F;
                    if (g0Var8 == null || g0Var8.f2888a == -1 || g0Var8.f2890c < 1) {
                        View q2 = q(this.f2043z);
                        if (q2 != null) {
                            d0Var.f2864a = this.f2041x ? N0() : M0();
                            if (this.f2023A != Integer.MIN_VALUE) {
                                if (d0Var.f2866c) {
                                    d0Var.f2865b = (this.f2035r.g() - this.f2023A) - this.f2035r.b(q2);
                                } else {
                                    d0Var.f2865b = (this.f2035r.k() + this.f2023A) - this.f2035r.e(q2);
                                }
                            } else if (this.f2035r.c(q2) > this.f2035r.l()) {
                                d0Var.f2865b = d0Var.f2866c ? this.f2035r.g() : this.f2035r.k();
                            } else {
                                int e2 = this.f2035r.e(q2) - this.f2035r.k();
                                if (e2 < 0) {
                                    d0Var.f2865b = -e2;
                                } else {
                                    int g2 = this.f2035r.g() - this.f2035r.b(q2);
                                    if (g2 < 0) {
                                        d0Var.f2865b = g2;
                                    } else {
                                        d0Var.f2865b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i7 = this.f2043z;
                            d0Var.f2864a = i7;
                            int i8 = this.f2023A;
                            if (i8 == Integer.MIN_VALUE) {
                                boolean z6 = C0(i7) == 1;
                                d0Var.f2866c = z6;
                                d0Var.f2865b = z6 ? staggeredGridLayoutManager.f2035r.g() : staggeredGridLayoutManager.f2035r.k();
                            } else if (d0Var.f2866c) {
                                d0Var.f2865b = staggeredGridLayoutManager.f2035r.g() - i8;
                            } else {
                                d0Var.f2865b = staggeredGridLayoutManager.f2035r.k() + i8;
                            }
                            d0Var.d = true;
                        }
                    } else {
                        d0Var.f2865b = Integer.MIN_VALUE;
                        d0Var.f2864a = this.f2043z;
                    }
                    d0Var.f2867e = true;
                }
            }
            if (this.f2026D) {
                int b2 = v2.b();
                for (int v3 = v() - 1; v3 >= 0; v3--) {
                    i = AbstractC0139I.H(u(v3));
                    if (i >= 0 && i < b2) {
                        break;
                    }
                }
                i = 0;
                d0Var.f2864a = i;
                d0Var.f2865b = Integer.MIN_VALUE;
                d0Var.f2867e = true;
            } else {
                int b3 = v2.b();
                int v4 = v();
                for (int i9 = 0; i9 < v4; i9++) {
                    int H2 = AbstractC0139I.H(u(i9));
                    if (H2 >= 0 && H2 < b3) {
                        i = H2;
                        break;
                    }
                }
                i = 0;
                d0Var.f2864a = i;
                d0Var.f2865b = Integer.MIN_VALUE;
                d0Var.f2867e = true;
            }
        }
        if (this.F == null && this.f2043z == -1 && (d0Var.f2866c != this.f2026D || S0() != this.f2027E)) {
            jVar.g();
            d0Var.d = true;
        }
        if (v() > 0 && ((g0Var = this.F) == null || g0Var.f2890c < 1)) {
            if (d0Var.d) {
                for (int i10 = 0; i10 < this.f2033p; i10++) {
                    this.f2034q[i10].b();
                    int i11 = d0Var.f2865b;
                    if (i11 != Integer.MIN_VALUE) {
                        h0 h0Var2 = this.f2034q[i10];
                        h0Var2.f2900b = i11;
                        h0Var2.f2901c = i11;
                    }
                }
            } else if (z4 || d0Var.f2868f == null) {
                for (int i12 = 0; i12 < this.f2033p; i12++) {
                    h0 h0Var3 = this.f2034q[i12];
                    boolean z7 = this.f2041x;
                    int i13 = d0Var.f2865b;
                    int f2 = z7 ? h0Var3.f(Integer.MIN_VALUE) : h0Var3.h(Integer.MIN_VALUE);
                    h0Var3.b();
                    if (f2 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = h0Var3.f2903f;
                        if ((!z7 || f2 >= staggeredGridLayoutManager2.f2035r.g()) && (z7 || f2 <= staggeredGridLayoutManager2.f2035r.k())) {
                            if (i13 != Integer.MIN_VALUE) {
                                f2 += i13;
                            }
                            h0Var3.f2901c = f2;
                            h0Var3.f2900b = f2;
                        }
                    }
                }
                h0[] h0VarArr = this.f2034q;
                int length = h0VarArr.length;
                int[] iArr = d0Var.f2868f;
                if (iArr == null || iArr.length < length) {
                    d0Var.f2868f = new int[staggeredGridLayoutManager.f2034q.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    d0Var.f2868f[i14] = h0VarArr[i14].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < this.f2033p; i15++) {
                    h0 h0Var4 = this.f2034q[i15];
                    h0Var4.b();
                    int i16 = d0Var.f2868f[i15];
                    h0Var4.f2900b = i16;
                    h0Var4.f2901c = i16;
                }
            }
        }
        p(c0145o);
        C0164q c0164q = this.f2039v;
        c0164q.f2966a = false;
        int l2 = this.f2036s.l();
        this.f2038u = l2 / this.f2033p;
        View.MeasureSpec.makeMeasureSpec(l2, this.f2036s.i());
        d1(d0Var.f2864a, v2);
        if (d0Var.f2866c) {
            c1(-1);
            H0(c0145o, c0164q, v2);
            c1(1);
            c0164q.f2968c = d0Var.f2864a + c0164q.d;
            H0(c0145o, c0164q, v2);
        } else {
            c1(1);
            H0(c0145o, c0164q, v2);
            c1(-1);
            c0164q.f2968c = d0Var.f2864a + c0164q.d;
            H0(c0145o, c0164q, v2);
        }
        if (this.f2036s.i() != 1073741824) {
            int v5 = v();
            float f3 = RecyclerView.f1949A0;
            for (int i17 = 0; i17 < v5; i17++) {
                View u2 = u(i17);
                float c2 = this.f2036s.c(u2);
                if (c2 >= f3) {
                    ((e0) u2.getLayoutParams()).getClass();
                    f3 = Math.max(f3, c2);
                }
            }
            int i18 = this.f2038u;
            int round = Math.round(f3 * this.f2033p);
            if (this.f2036s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2036s.l());
            }
            this.f2038u = round / this.f2033p;
            View.MeasureSpec.makeMeasureSpec(round, this.f2036s.i());
            if (this.f2038u != i18) {
                for (int i19 = 0; i19 < v5; i19++) {
                    View u3 = u(i19);
                    e0 e0Var = (e0) u3.getLayoutParams();
                    e0Var.getClass();
                    if (S0() && this.f2037t == 1) {
                        int i20 = -((this.f2033p - 1) - e0Var.f2875e.f2902e);
                        u3.offsetLeftAndRight((this.f2038u * i20) - (i20 * i18));
                    } else {
                        int i21 = e0Var.f2875e.f2902e;
                        int i22 = this.f2038u * i21;
                        int i23 = i21 * i18;
                        if (this.f2037t == 1) {
                            u3.offsetLeftAndRight(i22 - i23);
                        } else {
                            u3.offsetTopAndBottom(i22 - i23);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f2041x) {
                K0(c0145o, v2, true);
                L0(c0145o, v2, false);
            } else {
                L0(c0145o, v2, true);
                K0(c0145o, v2, false);
            }
        }
        if (z2 && !v2.f2817g && this.f2025C != 0 && v() > 0 && R0() != null) {
            RecyclerView recyclerView = this.f2778b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f2032K);
            }
        }
        z3 = false;
        if (v2.f2817g) {
            d0Var.a();
        }
        this.f2026D = d0Var.f2866c;
        this.f2027E = S0();
        if (z3) {
            d0Var.a();
            U0(c0145o, v2, false);
        }
    }

    public final boolean V0(int i) {
        if (this.f2037t == 0) {
            return (i == -1) != this.f2041x;
        }
        return ((i == -1) == this.f2041x) == S0();
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
        C0164q c0164q = this.f2039v;
        c0164q.f2966a = true;
        d1(M02, v2);
        c1(i2);
        c0164q.f2968c = M02 + c0164q.d;
        c0164q.f2967b = Math.abs(i);
    }

    public final void X0(C0145O c0145o, C0164q c0164q) {
        if (!c0164q.f2966a || c0164q.i) {
            return;
        }
        if (c0164q.f2967b == 0) {
            if (c0164q.f2969e == -1) {
                Y0(c0145o, c0164q.f2971g);
                return;
            } else {
                Z0(c0145o, c0164q.f2970f);
                return;
            }
        }
        int i = 1;
        if (c0164q.f2969e == -1) {
            int i2 = c0164q.f2970f;
            int h = this.f2034q[0].h(i2);
            while (i < this.f2033p) {
                int h2 = this.f2034q[i].h(i2);
                if (h2 > h) {
                    h = h2;
                }
                i++;
            }
            int i3 = i2 - h;
            Y0(c0145o, i3 < 0 ? c0164q.f2971g : c0164q.f2971g - Math.min(i3, c0164q.f2967b));
            return;
        }
        int i4 = c0164q.f2971g;
        int f2 = this.f2034q[0].f(i4);
        while (i < this.f2033p) {
            int f3 = this.f2034q[i].f(i4);
            if (f3 < f2) {
                f2 = f3;
            }
            i++;
        }
        int i5 = f2 - c0164q.f2971g;
        Z0(c0145o, i5 < 0 ? c0164q.f2970f : Math.min(i5, c0164q.f2967b) + c0164q.f2970f);
    }

    @Override // g0.AbstractC0139I
    public final void Y(int i, int i2) {
        Q0(i, i2, 1);
    }

    public final void Y0(C0145O c0145o, int i) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            if (this.f2035r.e(u2) < i || this.f2035r.o(u2) < i) {
                return;
            }
            e0 e0Var = (e0) u2.getLayoutParams();
            e0Var.getClass();
            if (e0Var.f2875e.f2899a.size() == 1) {
                return;
            }
            h0 h0Var = e0Var.f2875e;
            ArrayList arrayList = h0Var.f2899a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            e0 e0Var2 = (e0) view.getLayoutParams();
            e0Var2.f2875e = null;
            if (e0Var2.f2789a.i() || e0Var2.f2789a.l()) {
                h0Var.d -= h0Var.f2903f.f2035r.c(view);
            }
            if (size == 1) {
                h0Var.f2900b = Integer.MIN_VALUE;
            }
            h0Var.f2901c = Integer.MIN_VALUE;
            k0(u2, c0145o);
        }
    }

    @Override // g0.AbstractC0139I
    public final void Z() {
        this.f2024B.g();
        n0();
    }

    public final void Z0(C0145O c0145o, int i) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f2035r.b(u2) > i || this.f2035r.n(u2) > i) {
                return;
            }
            e0 e0Var = (e0) u2.getLayoutParams();
            e0Var.getClass();
            if (e0Var.f2875e.f2899a.size() == 1) {
                return;
            }
            h0 h0Var = e0Var.f2875e;
            ArrayList arrayList = h0Var.f2899a;
            View view = (View) arrayList.remove(0);
            e0 e0Var2 = (e0) view.getLayoutParams();
            e0Var2.f2875e = null;
            if (arrayList.size() == 0) {
                h0Var.f2901c = Integer.MIN_VALUE;
            }
            if (e0Var2.f2789a.i() || e0Var2.f2789a.l()) {
                h0Var.d -= h0Var.f2903f.f2035r.c(view);
            }
            h0Var.f2900b = Integer.MIN_VALUE;
            k0(u2, c0145o);
        }
    }

    @Override // g0.U
    public final PointF a(int i) {
        int C0 = C0(i);
        PointF pointF = new PointF();
        if (C0 == 0) {
            return null;
        }
        if (this.f2037t == 0) {
            pointF.x = C0;
            pointF.y = RecyclerView.f1949A0;
        } else {
            pointF.x = RecyclerView.f1949A0;
            pointF.y = C0;
        }
        return pointF;
    }

    @Override // g0.AbstractC0139I
    public final void a0(int i, int i2) {
        Q0(i, i2, 8);
    }

    public final void a1() {
        if (this.f2037t == 1 || !S0()) {
            this.f2041x = this.f2040w;
        } else {
            this.f2041x = !this.f2040w;
        }
    }

    @Override // g0.AbstractC0139I
    public final void b0(int i, int i2) {
        Q0(i, i2, 2);
    }

    public final int b1(int i, C0145O c0145o, V v2) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        W0(i, v2);
        C0164q c0164q = this.f2039v;
        int H0 = H0(c0145o, c0164q, v2);
        if (c0164q.f2967b >= H0) {
            i = i < 0 ? -H0 : H0;
        }
        this.f2035r.p(-i);
        this.f2026D = this.f2041x;
        c0164q.f2967b = 0;
        X0(c0145o, c0164q);
        return i;
    }

    @Override // g0.AbstractC0139I
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // g0.AbstractC0139I
    public final void c0(int i, int i2) {
        Q0(i, i2, 4);
    }

    public final void c1(int i) {
        C0164q c0164q = this.f2039v;
        c0164q.f2969e = i;
        c0164q.d = this.f2041x != (i == -1) ? -1 : 1;
    }

    @Override // g0.AbstractC0139I
    public final boolean d() {
        return this.f2037t == 0;
    }

    @Override // g0.AbstractC0139I
    public final void d0(C0145O c0145o, V v2) {
        U0(c0145o, v2, true);
    }

    public final void d1(int i, V v2) {
        int i2;
        int i3;
        int i4;
        C0164q c0164q = this.f2039v;
        boolean z2 = false;
        c0164q.f2967b = 0;
        c0164q.f2968c = i;
        C0168v c0168v = this.f2780e;
        if (!(c0168v != null && c0168v.f2994e) || (i4 = v2.f2812a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.f2041x == (i4 < i)) {
                i2 = this.f2035r.l();
                i3 = 0;
            } else {
                i3 = this.f2035r.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView == null || !recyclerView.h) {
            c0164q.f2971g = this.f2035r.f() + i2;
            c0164q.f2970f = -i3;
        } else {
            c0164q.f2970f = this.f2035r.k() - i3;
            c0164q.f2971g = this.f2035r.g() + i2;
        }
        c0164q.h = false;
        c0164q.f2966a = true;
        if (this.f2035r.i() == 0 && this.f2035r.f() == 0) {
            z2 = true;
        }
        c0164q.i = z2;
    }

    @Override // g0.AbstractC0139I
    public final boolean e() {
        return this.f2037t == 1;
    }

    @Override // g0.AbstractC0139I
    public final void e0(V v2) {
        this.f2043z = -1;
        this.f2023A = Integer.MIN_VALUE;
        this.F = null;
        this.f2029H.a();
    }

    public final void e1(h0 h0Var, int i, int i2) {
        int i3 = h0Var.d;
        int i4 = h0Var.f2902e;
        if (i != -1) {
            int i5 = h0Var.f2901c;
            if (i5 == Integer.MIN_VALUE) {
                h0Var.a();
                i5 = h0Var.f2901c;
            }
            if (i5 - i3 >= i2) {
                this.f2042y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = h0Var.f2900b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) h0Var.f2899a.get(0);
            e0 e0Var = (e0) view.getLayoutParams();
            h0Var.f2900b = h0Var.f2903f.f2035r.e(view);
            e0Var.getClass();
            i6 = h0Var.f2900b;
        }
        if (i6 + i3 <= i2) {
            this.f2042y.set(i4, false);
        }
    }

    @Override // g0.AbstractC0139I
    public final boolean f(C0140J c0140j) {
        return c0140j instanceof e0;
    }

    @Override // g0.AbstractC0139I
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof g0) {
            g0 g0Var = (g0) parcelable;
            this.F = g0Var;
            if (this.f2043z != -1) {
                g0Var.d = null;
                g0Var.f2890c = 0;
                g0Var.f2888a = -1;
                g0Var.f2889b = -1;
                g0Var.d = null;
                g0Var.f2890c = 0;
                g0Var.f2891e = 0;
                g0Var.f2892f = null;
                g0Var.f2893g = null;
            }
            n0();
        }
    }

    @Override // g0.AbstractC0139I
    public final Parcelable g0() {
        int h;
        int k2;
        int[] iArr;
        g0 g0Var = this.F;
        if (g0Var != null) {
            g0 g0Var2 = new g0();
            g0Var2.f2890c = g0Var.f2890c;
            g0Var2.f2888a = g0Var.f2888a;
            g0Var2.f2889b = g0Var.f2889b;
            g0Var2.d = g0Var.d;
            g0Var2.f2891e = g0Var.f2891e;
            g0Var2.f2892f = g0Var.f2892f;
            g0Var2.h = g0Var.h;
            g0Var2.i = g0Var.i;
            g0Var2.f2894j = g0Var.f2894j;
            g0Var2.f2893g = g0Var.f2893g;
            return g0Var2;
        }
        g0 g0Var3 = new g0();
        g0Var3.h = this.f2040w;
        g0Var3.i = this.f2026D;
        g0Var3.f2894j = this.f2027E;
        j jVar = this.f2024B;
        if (jVar == null || (iArr = (int[]) jVar.f72b) == null) {
            g0Var3.f2891e = 0;
        } else {
            g0Var3.f2892f = iArr;
            g0Var3.f2891e = iArr.length;
            g0Var3.f2893g = (ArrayList) jVar.f73c;
        }
        if (v() > 0) {
            g0Var3.f2888a = this.f2026D ? N0() : M0();
            View I02 = this.f2041x ? I0(true) : J0(true);
            g0Var3.f2889b = I02 != null ? AbstractC0139I.H(I02) : -1;
            int i = this.f2033p;
            g0Var3.f2890c = i;
            g0Var3.d = new int[i];
            for (int i2 = 0; i2 < this.f2033p; i2++) {
                if (this.f2026D) {
                    h = this.f2034q[i2].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f2035r.g();
                        h -= k2;
                        g0Var3.d[i2] = h;
                    } else {
                        g0Var3.d[i2] = h;
                    }
                } else {
                    h = this.f2034q[i2].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f2035r.k();
                        h -= k2;
                        g0Var3.d[i2] = h;
                    } else {
                        g0Var3.d[i2] = h;
                    }
                }
            }
        } else {
            g0Var3.f2888a = -1;
            g0Var3.f2889b = -1;
            g0Var3.f2890c = 0;
        }
        return g0Var3;
    }

    @Override // g0.AbstractC0139I
    public final void h(int i, int i2, V v2, C0160m c0160m) {
        C0164q c0164q;
        int f2;
        int i3;
        if (this.f2037t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        W0(i, v2);
        int[] iArr = this.f2031J;
        if (iArr == null || iArr.length < this.f2033p) {
            this.f2031J = new int[this.f2033p];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.f2033p;
            c0164q = this.f2039v;
            if (i4 >= i6) {
                break;
            }
            if (c0164q.d == -1) {
                f2 = c0164q.f2970f;
                i3 = this.f2034q[i4].h(f2);
            } else {
                f2 = this.f2034q[i4].f(c0164q.f2971g);
                i3 = c0164q.f2971g;
            }
            int i7 = f2 - i3;
            if (i7 >= 0) {
                this.f2031J[i5] = i7;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f2031J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0164q.f2968c;
            if (i9 < 0 || i9 >= v2.b()) {
                return;
            }
            c0160m.a(c0164q.f2968c, this.f2031J[i8]);
            c0164q.f2968c += c0164q.d;
        }
    }

    @Override // g0.AbstractC0139I
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // g0.AbstractC0139I
    public final int j(V v2) {
        return E0(v2);
    }

    @Override // g0.AbstractC0139I
    public final int k(V v2) {
        return F0(v2);
    }

    @Override // g0.AbstractC0139I
    public final int l(V v2) {
        return G0(v2);
    }

    @Override // g0.AbstractC0139I
    public final int m(V v2) {
        return E0(v2);
    }

    @Override // g0.AbstractC0139I
    public final int n(V v2) {
        return F0(v2);
    }

    @Override // g0.AbstractC0139I
    public final int o(V v2) {
        return G0(v2);
    }

    @Override // g0.AbstractC0139I
    public final int o0(int i, C0145O c0145o, V v2) {
        return b1(i, c0145o, v2);
    }

    @Override // g0.AbstractC0139I
    public final void p0(int i) {
        g0 g0Var = this.F;
        if (g0Var != null && g0Var.f2888a != i) {
            g0Var.d = null;
            g0Var.f2890c = 0;
            g0Var.f2888a = -1;
            g0Var.f2889b = -1;
        }
        this.f2043z = i;
        this.f2023A = Integer.MIN_VALUE;
        n0();
    }

    @Override // g0.AbstractC0139I
    public final int q0(int i, C0145O c0145o, V v2) {
        return b1(i, c0145o, v2);
    }

    @Override // g0.AbstractC0139I
    public final C0140J r() {
        return this.f2037t == 0 ? new e0(-2, -1) : new e0(-1, -2);
    }

    @Override // g0.AbstractC0139I
    public final C0140J s(Context context, AttributeSet attributeSet) {
        return new e0(context, attributeSet);
    }

    @Override // g0.AbstractC0139I
    public final C0140J t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e0((ViewGroup.MarginLayoutParams) layoutParams) : new e0(layoutParams);
    }

    @Override // g0.AbstractC0139I
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        int i3 = this.f2033p;
        int F = F() + E();
        int D2 = D() + G();
        if (this.f2037t == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2778b;
            WeakHashMap weakHashMap = T.f633a;
            g3 = AbstractC0139I.g(i2, height, recyclerView.getMinimumHeight());
            g2 = AbstractC0139I.g(i, (this.f2038u * i3) + F, this.f2778b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2778b;
            WeakHashMap weakHashMap2 = T.f633a;
            g2 = AbstractC0139I.g(i, width, recyclerView2.getMinimumWidth());
            g3 = AbstractC0139I.g(i2, (this.f2038u * i3) + D2, this.f2778b.getMinimumHeight());
        }
        this.f2778b.setMeasuredDimension(g2, g3);
    }

    @Override // g0.AbstractC0139I
    public final void z0(RecyclerView recyclerView, int i) {
        C0168v c0168v = new C0168v(recyclerView.getContext());
        c0168v.f2991a = i;
        A0(c0168v);
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.am;
import defpackage.d0;
import defpackage.dz;
import defpackage.ey;
import defpackage.k0;
import defpackage.l8;
import defpackage.m60;
import defpackage.my;
import defpackage.n20;
import defpackage.ny;
import defpackage.oy;
import defpackage.qp;
import defpackage.rp;
import defpackage.sp;
import defpackage.tp;
import defpackage.ty;
import defpackage.up;
import defpackage.xg;
import defpackage.yy;
import defpackage.zy;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends ny implements yy {
    public final qp A;
    public final rp B;
    public final int C;
    public final int[] D;
    public int p;
    public sp q;
    public xg r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public tp z;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new qp();
        this.B = new rp();
        this.C = 2;
        this.D = new int[2];
        my H = ny.H(context, attributeSet, i, i2);
        c1(H.a);
        boolean z = H.c;
        c(null);
        if (z != this.t) {
            this.t = z;
            o0();
        }
        d1(H.d);
    }

    @Override // defpackage.ny
    public void A0(RecyclerView recyclerView, int i) {
        up upVar = new up(recyclerView.getContext());
        upVar.a = i;
        B0(upVar);
    }

    @Override // defpackage.ny
    public boolean C0() {
        return this.z == null && this.s == this.v;
    }

    public void D0(zy zyVar, int[] iArr) {
        int i;
        int l = zyVar.a != -1 ? this.r.l() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = l;
            l = 0;
        }
        iArr[0] = l;
        iArr[1] = i;
    }

    public void E0(zy zyVar, sp spVar, am amVar) {
        int i = spVar.d;
        if (i < 0 || i >= zyVar.b()) {
            return;
        }
        amVar.a(i, Math.max(0, spVar.g));
    }

    public final int F0(zy zyVar) {
        if (v() == 0) {
            return 0;
        }
        J0();
        xg xgVar = this.r;
        boolean z = !this.w;
        return m60.n(zyVar, xgVar, M0(z), L0(z), this, this.w);
    }

    public final int G0(zy zyVar) {
        if (v() == 0) {
            return 0;
        }
        J0();
        xg xgVar = this.r;
        boolean z = !this.w;
        return m60.o(zyVar, xgVar, M0(z), L0(z), this, this.w, this.u);
    }

    public final int H0(zy zyVar) {
        if (v() == 0) {
            return 0;
        }
        J0();
        xg xgVar = this.r;
        boolean z = !this.w;
        return m60.p(zyVar, xgVar, M0(z), L0(z), this, this.w);
    }

    public final int I0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && V0()) ? -1 : 1 : (this.p != 1 && V0()) ? 1 : -1;
    }

    public final void J0() {
        if (this.q == null) {
            sp spVar = new sp();
            spVar.a = true;
            spVar.h = 0;
            spVar.i = 0;
            spVar.k = null;
            this.q = spVar;
        }
    }

    @Override // defpackage.ny
    public final boolean K() {
        return true;
    }

    public final int K0(ty tyVar, sp spVar, zy zyVar, boolean z) {
        int i;
        int i2 = spVar.c;
        int i3 = spVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                spVar.g = i3 + i2;
            }
            Y0(tyVar, spVar);
        }
        int i4 = spVar.c + spVar.h;
        while (true) {
            if ((!spVar.l && i4 <= 0) || (i = spVar.d) < 0 || i >= zyVar.b()) {
                break;
            }
            rp rpVar = this.B;
            rpVar.a = 0;
            rpVar.b = false;
            rpVar.c = false;
            rpVar.d = false;
            W0(tyVar, zyVar, spVar, rpVar);
            if (!rpVar.b) {
                int i5 = spVar.b;
                int i6 = rpVar.a;
                spVar.b = (spVar.f * i6) + i5;
                if (!rpVar.c || spVar.k != null || !zyVar.g) {
                    spVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = spVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    spVar.g = i8;
                    int i9 = spVar.c;
                    if (i9 < 0) {
                        spVar.g = i8 + i9;
                    }
                    Y0(tyVar, spVar);
                }
                if (z && rpVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - spVar.c;
    }

    @Override // defpackage.ny
    public final boolean L() {
        return this.t;
    }

    public final View L0(boolean z) {
        return this.u ? P0(0, v(), z) : P0(v() - 1, -1, z);
    }

    public final View M0(boolean z) {
        return this.u ? P0(v() - 1, -1, z) : P0(0, v(), z);
    }

    public final int N0() {
        View P0 = P0(v() - 1, -1, false);
        if (P0 == null) {
            return -1;
        }
        return ny.G(P0);
    }

    public final View O0(int i, int i2) {
        int i3;
        int i4;
        J0();
        if (i2 <= i && i2 >= i) {
            return u(i);
        }
        if (this.r.e(u(i)) < this.r.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.u(i, i2, i3, i4) : this.d.u(i, i2, i3, i4);
    }

    public final View P0(int i, int i2, boolean z) {
        J0();
        int i3 = z ? 24579 : 320;
        return this.p == 0 ? this.c.u(i, i2, i3, 320) : this.d.u(i, i2, i3, 320);
    }

    public View Q0(ty tyVar, zy zyVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        J0();
        int v = v();
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
            i3 = 1;
        }
        int b = zyVar.b();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View u = u(i2);
            int G = ny.G(u);
            int e = this.r.e(u);
            int b2 = this.r.b(u);
            if (G >= 0 && G < b) {
                if (!((oy) u.getLayoutParams()).a.h()) {
                    boolean z3 = b2 <= k && e < k;
                    boolean z4 = e >= g && b2 > g;
                    if (!z3 && !z4) {
                        return u;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = u;
                        }
                        view2 = u;
                    }
                } else if (view3 == null) {
                    view3 = u;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int R0(int i, ty tyVar, zy zyVar, boolean z) {
        int g;
        int g2 = this.r.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -b1(-g2, tyVar, zyVar);
        int i3 = i + i2;
        if (!z || (g = this.r.g() - i3) <= 0) {
            return i2;
        }
        this.r.o(g);
        return g + i2;
    }

    public final int S0(int i, ty tyVar, zy zyVar, boolean z) {
        int k;
        int k2 = i - this.r.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -b1(k2, tyVar, zyVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.r.k()) <= 0) {
            return i2;
        }
        this.r.o(-k);
        return i2 - k;
    }

    @Override // defpackage.ny
    public View T(View view, int i, ty tyVar, zy zyVar) {
        int I0;
        a1();
        if (v() != 0 && (I0 = I0(i)) != Integer.MIN_VALUE) {
            J0();
            e1(I0, (int) (this.r.l() * 0.33333334f), false, zyVar);
            sp spVar = this.q;
            spVar.g = Integer.MIN_VALUE;
            spVar.a = false;
            K0(tyVar, spVar, zyVar, true);
            boolean z = this.u;
            View O0 = I0 == -1 ? z ? O0(v() - 1, -1) : O0(0, v()) : z ? O0(0, v()) : O0(v() - 1, -1);
            View U0 = I0 == -1 ? U0() : T0();
            if (!U0.hasFocusable()) {
                return O0;
            }
            if (O0 != null) {
                return U0;
            }
        }
        return null;
    }

    public final View T0() {
        return u(this.u ? 0 : v() - 1);
    }

    @Override // defpackage.ny
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View P0 = P0(0, v(), false);
            accessibilityEvent.setFromIndex(P0 == null ? -1 : ny.G(P0));
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final View U0() {
        return u(this.u ? v() - 1 : 0);
    }

    @Override // defpackage.ny
    public void V(ty tyVar, zy zyVar, k0 k0Var) {
        super.V(tyVar, zyVar, k0Var);
        ey eyVar = this.b.r;
        if (eyVar == null || eyVar.a() <= 0) {
            return;
        }
        k0Var.b(d0.j);
    }

    public final boolean V0() {
        return this.b.getLayoutDirection() == 1;
    }

    public void W0(ty tyVar, zy zyVar, sp spVar, rp rpVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View b = spVar.b(tyVar);
        if (b == null) {
            rpVar.b = true;
            return;
        }
        oy oyVar = (oy) b.getLayoutParams();
        List list = spVar.k;
        boolean z = this.u;
        int i5 = spVar.f;
        if (list == null) {
            if (z == (i5 == -1)) {
                b(b, -1, false);
            } else {
                b(b, 0, false);
            }
        } else {
            if (z == (i5 == -1)) {
                b(b, -1, true);
            } else {
                b(b, 0, true);
            }
        }
        oy oyVar2 = (oy) b.getLayoutParams();
        Rect N = this.b.N(b);
        int i6 = N.left + N.right;
        int i7 = N.top + N.bottom;
        int w = ny.w(d(), this.n, this.l, E() + D() + ((ViewGroup.MarginLayoutParams) oyVar2).leftMargin + ((ViewGroup.MarginLayoutParams) oyVar2).rightMargin + i6, ((ViewGroup.MarginLayoutParams) oyVar2).width);
        int w2 = ny.w(e(), this.o, this.m, C() + F() + ((ViewGroup.MarginLayoutParams) oyVar2).topMargin + ((ViewGroup.MarginLayoutParams) oyVar2).bottomMargin + i7, ((ViewGroup.MarginLayoutParams) oyVar2).height);
        if (x0(b, w, w2, oyVar2)) {
            b.measure(w, w2);
        }
        rpVar.a = this.r.c(b);
        if (this.p == 1) {
            if (V0()) {
                i4 = this.n - E();
                i2 = i4 - this.r.d(b);
            } else {
                int D = D();
                i4 = this.r.d(b) + D;
                i2 = D;
            }
            int i8 = spVar.f;
            i3 = spVar.b;
            int i9 = rpVar.a;
            if (i8 == -1) {
                int i10 = i3 - i9;
                i = i3;
                i3 = i10;
            } else {
                i = i9 + i3;
            }
        } else {
            int F = F();
            int d = this.r.d(b) + F;
            int i11 = spVar.f;
            int i12 = spVar.b;
            int i13 = rpVar.a;
            if (i11 == -1) {
                int i14 = i12 - i13;
                i4 = i12;
                i3 = F;
                i = d;
                i2 = i14;
            } else {
                int i15 = i12 + i13;
                i = d;
                i2 = i12;
                i3 = F;
                i4 = i15;
            }
        }
        ny.N(b, i2, i3, i4, i);
        if (oyVar.a.h() || oyVar.a.k()) {
            rpVar.c = true;
        }
        rpVar.d = b.hasFocusable();
    }

    public final void Y0(ty tyVar, sp spVar) {
        if (!spVar.a || spVar.l) {
            return;
        }
        int i = spVar.g;
        int i2 = spVar.i;
        if (spVar.f == -1) {
            int v = v();
            if (i < 0) {
                return;
            }
            int f = (this.r.f() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < v; i3++) {
                    View u = u(i3);
                    if (this.r.e(u) < f || this.r.n(u) < f) {
                        Z0(tyVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View u2 = u(i5);
                if (this.r.e(u2) < f || this.r.n(u2) < f) {
                    Z0(tyVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int v2 = v();
        if (!this.u) {
            for (int i7 = 0; i7 < v2; i7++) {
                View u3 = u(i7);
                if (this.r.b(u3) > i6 || this.r.m(u3) > i6) {
                    Z0(tyVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View u4 = u(i9);
            if (this.r.b(u4) > i6 || this.r.m(u4) > i6) {
                Z0(tyVar, i8, i9);
                return;
            }
        }
    }

    public final void Z0(ty tyVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View u = u(i);
                m0(i);
                tyVar.i(u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View u2 = u(i3);
            m0(i3);
            tyVar.i(u2);
        }
    }

    @Override // defpackage.yy
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i2 = (i < ny.G(u(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final void a1() {
        if (this.p == 1 || !V0()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    public final int b1(int i, ty tyVar, zy zyVar) {
        if (v() != 0 && i != 0) {
            J0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int abs = Math.abs(i);
            e1(i2, abs, true, zyVar);
            sp spVar = this.q;
            int K0 = K0(tyVar, spVar, zyVar, false) + spVar.g;
            if (K0 >= 0) {
                if (abs > K0) {
                    i = i2 * K0;
                }
                this.r.o(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.ny
    public final void c(String str) {
        if (this.z == null) {
            super.c(str);
        }
    }

    public final void c1(int i) {
        if (i != 0 && i != 1) {
            l8.l(n20.e("invalid orientation:", i));
            return;
        }
        c(null);
        if (i != this.p || this.r == null) {
            xg a = xg.a(this, i);
            this.r = a;
            this.A.a = a;
            this.p = i;
            o0();
        }
    }

    @Override // defpackage.ny
    public final boolean d() {
        return this.p == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @Override // defpackage.ny
    public void d0(ty tyVar, zy zyVar) {
        View view;
        View view2;
        View Q0;
        int i;
        int e;
        int i2;
        int i3;
        ?? r4;
        List list;
        int i4;
        int i5;
        int R0;
        int i6;
        View q;
        int e2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.z == null && this.x == -1) && zyVar.b() == 0) {
            j0(tyVar);
            return;
        }
        tp tpVar = this.z;
        if (tpVar != null && (i8 = tpVar.f) >= 0) {
            this.x = i8;
        }
        J0();
        boolean z = false;
        this.q.a = false;
        a1();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || this.a.c.contains(view)) {
            view = null;
        }
        qp qpVar = this.A;
        if (!qpVar.e || this.x != -1 || this.z != null) {
            qpVar.c();
            qpVar.d = this.u ^ this.v;
            if (!zyVar.g && (i = this.x) != -1) {
                if (i < 0 || i >= zyVar.b()) {
                    this.x = -1;
                    this.y = Integer.MIN_VALUE;
                } else {
                    int i10 = this.x;
                    qpVar.b = i10;
                    tp tpVar2 = this.z;
                    if (tpVar2 != null && tpVar2.f >= 0) {
                        boolean z2 = tpVar2.h;
                        qpVar.d = z2;
                        xg xgVar = this.r;
                        if (z2) {
                            qpVar.c = xgVar.g() - this.z.g;
                        } else {
                            qpVar.c = xgVar.k() + this.z.g;
                        }
                    } else if (this.y == Integer.MIN_VALUE) {
                        View q2 = q(i10);
                        if (q2 == null) {
                            if (v() > 0) {
                                qpVar.d = (this.x < ny.G(u(0))) == this.u;
                            }
                            qpVar.a();
                        } else if (this.r.c(q2) > this.r.l()) {
                            qpVar.a();
                        } else {
                            int e3 = this.r.e(q2) - this.r.k();
                            xg xgVar2 = this.r;
                            if (e3 < 0) {
                                qpVar.c = xgVar2.k();
                                qpVar.d = false;
                            } else if (xgVar2.g() - this.r.b(q2) < 0) {
                                qpVar.c = this.r.g();
                                qpVar.d = true;
                            } else {
                                boolean z3 = qpVar.d;
                                xg xgVar3 = this.r;
                                if (z3) {
                                    int b = xgVar3.b(q2);
                                    xg xgVar4 = this.r;
                                    e = (Integer.MIN_VALUE == xgVar4.a ? 0 : xgVar4.l() - xgVar4.a) + b;
                                } else {
                                    e = xgVar3.e(q2);
                                }
                                qpVar.c = e;
                            }
                        }
                    } else {
                        boolean z4 = this.u;
                        qpVar.d = z4;
                        xg xgVar5 = this.r;
                        if (z4) {
                            qpVar.c = xgVar5.g() - this.y;
                        } else {
                            qpVar.c = xgVar5.k() + this.y;
                        }
                    }
                    qpVar.e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || this.a.c.contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    oy oyVar = (oy) view2.getLayoutParams();
                    if (!oyVar.a.h() && oyVar.a.b() >= 0 && oyVar.a.b() < zyVar.b()) {
                        qpVar.b(view2, ny.G(view2));
                        qpVar.e = true;
                    }
                }
                boolean z5 = this.s;
                boolean z6 = this.v;
                if (z5 == z6 && (Q0 = Q0(tyVar, zyVar, qpVar.d, z6)) != null) {
                    int G = ny.G(Q0);
                    boolean z7 = qpVar.d;
                    xg xgVar6 = qpVar.a;
                    if (z7) {
                        int b2 = xgVar6.b(Q0);
                        xg xgVar7 = qpVar.a;
                        qpVar.c = (Integer.MIN_VALUE == xgVar7.a ? 0 : xgVar7.l() - xgVar7.a) + b2;
                    } else {
                        qpVar.c = xgVar6.e(Q0);
                    }
                    qpVar.b = G;
                    if (!zyVar.g && C0()) {
                        int e4 = this.r.e(Q0);
                        int b3 = this.r.b(Q0);
                        int k = this.r.k();
                        int g = this.r.g();
                        boolean z8 = b3 <= k && e4 < k;
                        boolean z9 = e4 >= g && b3 > g;
                        if (z8 || z9) {
                            if (qpVar.d) {
                                k = g;
                            }
                            qpVar.c = k;
                        }
                    }
                    qpVar.e = true;
                }
            }
            qpVar.a();
            qpVar.b = this.v ? zyVar.b() - 1 : 0;
            qpVar.e = true;
        } else if (view != null && (this.r.e(view) >= this.r.g() || this.r.b(view) <= this.r.k())) {
            qpVar.b(view, ny.G(view));
        }
        sp spVar = this.q;
        spVar.f = spVar.j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(zyVar, iArr);
        int k2 = this.r.k() + Math.max(0, iArr[0]);
        int h = this.r.h() + Math.max(0, iArr[1]);
        if (zyVar.g && (i6 = this.x) != -1 && this.y != Integer.MIN_VALUE && (q = q(i6)) != null) {
            boolean z10 = this.u;
            xg xgVar8 = this.r;
            if (z10) {
                i7 = xgVar8.g() - this.r.b(q);
                e2 = this.y;
            } else {
                e2 = xgVar8.e(q) - this.r.k();
                i7 = this.y;
            }
            int i11 = i7 - e2;
            if (i11 > 0) {
                k2 += i11;
            } else {
                h -= i11;
            }
        }
        boolean z11 = qpVar.d;
        boolean z12 = this.u;
        if (!z11 ? !z12 : z12) {
            i9 = 1;
        }
        X0(tyVar, zyVar, qpVar, i9);
        p(tyVar);
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.getClass();
        this.q.i = 0;
        boolean z13 = qpVar.d;
        int i12 = qpVar.b;
        if (z13) {
            g1(i12, qpVar.c);
            sp spVar2 = this.q;
            spVar2.h = k2;
            K0(tyVar, spVar2, zyVar, false);
            sp spVar3 = this.q;
            i3 = spVar3.b;
            int i13 = spVar3.d;
            int i14 = spVar3.c;
            if (i14 > 0) {
                h += i14;
            }
            f1(qpVar.b, qpVar.c);
            sp spVar4 = this.q;
            spVar4.h = h;
            spVar4.d += spVar4.e;
            K0(tyVar, spVar4, zyVar, false);
            sp spVar5 = this.q;
            i2 = spVar5.b;
            int i15 = spVar5.c;
            if (i15 > 0) {
                g1(i13, i3);
                sp spVar6 = this.q;
                spVar6.h = i15;
                K0(tyVar, spVar6, zyVar, false);
                i3 = this.q.b;
            }
        } else {
            f1(i12, qpVar.c);
            sp spVar7 = this.q;
            spVar7.h = h;
            K0(tyVar, spVar7, zyVar, false);
            sp spVar8 = this.q;
            i2 = spVar8.b;
            int i16 = spVar8.d;
            int i17 = spVar8.c;
            if (i17 > 0) {
                k2 += i17;
            }
            g1(qpVar.b, qpVar.c);
            sp spVar9 = this.q;
            spVar9.h = k2;
            spVar9.d += spVar9.e;
            K0(tyVar, spVar9, zyVar, false);
            sp spVar10 = this.q;
            int i18 = spVar10.b;
            int i19 = spVar10.c;
            if (i19 > 0) {
                f1(i16, i2);
                sp spVar11 = this.q;
                spVar11.h = i19;
                K0(tyVar, spVar11, zyVar, false);
                i2 = this.q.b;
            }
            i3 = i18;
        }
        if (v() > 0) {
            if (this.u ^ this.v) {
                int R02 = R0(i2, tyVar, zyVar, true);
                i4 = i3 + R02;
                i5 = i2 + R02;
                R0 = S0(i4, tyVar, zyVar, false);
            } else {
                int S0 = S0(i3, tyVar, zyVar, true);
                i4 = i3 + S0;
                i5 = i2 + S0;
                R0 = R0(i5, tyVar, zyVar, false);
            }
            i3 = i4 + R0;
            i2 = i5 + R0;
        }
        if (zyVar.k && v() != 0 && !zyVar.g && C0()) {
            List list2 = tyVar.d;
            int size = list2.size();
            int G2 = ny.G(u(0));
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (i20 < size) {
                dz dzVar = (dz) list2.get(i20);
                boolean h2 = dzVar.h();
                View view3 = dzVar.a;
                if (!h2) {
                    boolean z14 = dzVar.b() < G2 ? true : z;
                    boolean z15 = this.u;
                    xg xgVar9 = this.r;
                    if (z14 != z15) {
                        i21 += xgVar9.c(view3);
                    } else {
                        i22 += xgVar9.c(view3);
                    }
                }
                i20++;
                z = false;
            }
            this.q.k = list2;
            if (i21 > 0) {
                g1(ny.G(U0()), i3);
                sp spVar12 = this.q;
                spVar12.h = i21;
                r4 = 0;
                spVar12.c = 0;
                spVar12.a(null);
                K0(tyVar, this.q, zyVar, false);
            } else {
                r4 = 0;
            }
            if (i22 > 0) {
                f1(ny.G(T0()), i2);
                sp spVar13 = this.q;
                spVar13.h = i22;
                spVar13.c = r4;
                list = null;
                spVar13.a(null);
                K0(tyVar, this.q, zyVar, r4);
            } else {
                list = null;
            }
            this.q.k = list;
        }
        if (zyVar.g) {
            qpVar.c();
        } else {
            xg xgVar10 = this.r;
            xgVar10.a = xgVar10.l();
        }
        this.s = this.v;
    }

    public void d1(boolean z) {
        c(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        o0();
    }

    @Override // defpackage.ny
    public final boolean e() {
        return this.p == 1;
    }

    @Override // defpackage.ny
    public void e0(zy zyVar) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.c();
    }

    public final void e1(int i, int i2, boolean z, zy zyVar) {
        int k;
        this.q.l = this.r.i() == 0 && this.r.f() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(zyVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        sp spVar = this.q;
        int i3 = z2 ? max2 : max;
        spVar.h = i3;
        if (!z2) {
            max = max2;
        }
        spVar.i = max;
        if (z2) {
            spVar.h = this.r.h() + i3;
            View T0 = T0();
            sp spVar2 = this.q;
            spVar2.e = this.u ? -1 : 1;
            int G = ny.G(T0);
            sp spVar3 = this.q;
            spVar2.d = G + spVar3.e;
            spVar3.b = this.r.b(T0);
            k = this.r.b(T0) - this.r.g();
        } else {
            View U0 = U0();
            sp spVar4 = this.q;
            spVar4.h = this.r.k() + spVar4.h;
            sp spVar5 = this.q;
            spVar5.e = this.u ? 1 : -1;
            int G2 = ny.G(U0);
            sp spVar6 = this.q;
            spVar5.d = G2 + spVar6.e;
            spVar6.b = this.r.e(U0);
            k = (-this.r.e(U0)) + this.r.k();
        }
        sp spVar7 = this.q;
        spVar7.c = i2;
        if (z) {
            spVar7.c = i2 - k;
        }
        spVar7.g = k;
    }

    @Override // defpackage.ny
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof tp) {
            tp tpVar = (tp) parcelable;
            this.z = tpVar;
            if (this.x != -1) {
                tpVar.f = -1;
            }
            o0();
        }
    }

    public final void f1(int i, int i2) {
        this.q.c = this.r.g() - i2;
        sp spVar = this.q;
        spVar.e = this.u ? -1 : 1;
        spVar.d = i;
        spVar.f = 1;
        spVar.b = i2;
        spVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.ny
    public final Parcelable g0() {
        tp tpVar = this.z;
        if (tpVar != null) {
            tp tpVar2 = new tp();
            tpVar2.f = tpVar.f;
            tpVar2.g = tpVar.g;
            tpVar2.h = tpVar.h;
            return tpVar2;
        }
        tp tpVar3 = new tp();
        if (v() <= 0) {
            tpVar3.f = -1;
            return tpVar3;
        }
        J0();
        boolean z = this.s ^ this.u;
        tpVar3.h = z;
        if (z) {
            View T0 = T0();
            tpVar3.g = this.r.g() - this.r.b(T0);
            tpVar3.f = ny.G(T0);
            return tpVar3;
        }
        View U0 = U0();
        tpVar3.f = ny.G(U0);
        tpVar3.g = this.r.e(U0) - this.r.k();
        return tpVar3;
    }

    public final void g1(int i, int i2) {
        this.q.c = i2 - this.r.k();
        sp spVar = this.q;
        spVar.d = i;
        spVar.e = this.u ? 1 : -1;
        spVar.f = -1;
        spVar.b = i2;
        spVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.ny
    public final void h(int i, int i2, zy zyVar, am amVar) {
        if (this.p != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        J0();
        e1(i > 0 ? 1 : -1, Math.abs(i), true, zyVar);
        E0(zyVar, this.q, amVar);
    }

    @Override // defpackage.ny
    public final void i(int i, am amVar) {
        boolean z;
        int i2;
        tp tpVar = this.z;
        if (tpVar == null || (i2 = tpVar.f) < 0) {
            a1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = tpVar.h;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            amVar.a(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // defpackage.ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i0(int i, Bundle bundle) {
        int min;
        if (super.i0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 >= 0) {
                    RecyclerView recyclerView = this.b;
                    min = Math.min(i2, I(recyclerView.h, recyclerView.l0) - 1);
                    if (min >= 0) {
                        this.x = min;
                        this.y = 0;
                        tp tpVar = this.z;
                        if (tpVar != null) {
                            tpVar.f = -1;
                        }
                        o0();
                        return true;
                    }
                }
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 >= 0) {
                    RecyclerView recyclerView2 = this.b;
                    min = Math.min(i3, x(recyclerView2.h, recyclerView2.l0) - 1);
                    if (min >= 0) {
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ny
    public final int j(zy zyVar) {
        return F0(zyVar);
    }

    @Override // defpackage.ny
    public int k(zy zyVar) {
        return G0(zyVar);
    }

    @Override // defpackage.ny
    public int l(zy zyVar) {
        return H0(zyVar);
    }

    @Override // defpackage.ny
    public final int m(zy zyVar) {
        return F0(zyVar);
    }

    @Override // defpackage.ny
    public int n(zy zyVar) {
        return G0(zyVar);
    }

    @Override // defpackage.ny
    public int o(zy zyVar) {
        return H0(zyVar);
    }

    @Override // defpackage.ny
    public int p0(int i, ty tyVar, zy zyVar) {
        if (this.p == 1) {
            return 0;
        }
        return b1(i, tyVar, zyVar);
    }

    @Override // defpackage.ny
    public final View q(int i) {
        int v = v();
        if (v == 0) {
            return null;
        }
        int G = i - ny.G(u(0));
        if (G >= 0 && G < v) {
            View u = u(G);
            if (ny.G(u) == i) {
                return u;
            }
        }
        return super.q(i);
    }

    @Override // defpackage.ny
    public final void q0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        tp tpVar = this.z;
        if (tpVar != null) {
            tpVar.f = -1;
        }
        o0();
    }

    @Override // defpackage.ny
    public oy r() {
        return new oy(-2, -2);
    }

    @Override // defpackage.ny
    public int r0(int i, ty tyVar, zy zyVar) {
        if (this.p == 0) {
            return 0;
        }
        return b1(i, tyVar, zyVar);
    }

    @Override // defpackage.ny
    public final boolean y0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int v = v();
            for (int i = 0; i < v; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ny
    public final void S(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new qp();
        this.B = new rp();
        this.C = 2;
        this.D = new int[2];
        c1(i);
        c(null);
        if (this.t) {
            this.t = false;
            o0();
        }
    }

    public void X0(ty tyVar, zy zyVar, qp qpVar, int i) {
    }
}

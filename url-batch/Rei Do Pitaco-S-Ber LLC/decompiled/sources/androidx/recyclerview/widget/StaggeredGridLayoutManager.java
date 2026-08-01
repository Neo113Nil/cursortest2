package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a30;
import defpackage.am;
import defpackage.ap;
import defpackage.f80;
import defpackage.j0;
import defpackage.k0;
import defpackage.l8;
import defpackage.m60;
import defpackage.my;
import defpackage.ny;
import defpackage.o4;
import defpackage.oy;
import defpackage.sq;
import defpackage.ty;
import defpackage.u6;
import defpackage.up;
import defpackage.x20;
import defpackage.xg;
import defpackage.y20;
import defpackage.yy;
import defpackage.z20;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends ny implements yy {
    public final o4 B;
    public final int C;
    public boolean D;
    public boolean E;
    public a30 F;
    public final Rect G;
    public final x20 H;
    public final boolean I;
    public int[] J;
    public final u6 K;
    public final int p;
    public final sq[] q;
    public final xg r;
    public final xg s;
    public final int t;
    public int u;
    public final ap v;
    public boolean w;
    public final BitSet y;
    public boolean x = false;
    public int z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        o4 o4Var = new o4(22, false);
        this.B = o4Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new x20(this);
        this.I = true;
        this.K = new u6(8, this);
        my H = ny.H(context, attributeSet, i, i2);
        int i3 = H.a;
        if (i3 != 0 && i3 != 1) {
            l8.l("invalid orientation.");
            throw null;
        }
        c(null);
        if (i3 != this.t) {
            this.t = i3;
            xg xgVar = this.r;
            this.r = this.s;
            this.s = xgVar;
            o0();
        }
        int i4 = H.b;
        c(null);
        if (i4 != this.p) {
            o4Var.c();
            o0();
            this.p = i4;
            this.y = new BitSet(this.p);
            this.q = new sq[this.p];
            for (int i5 = 0; i5 < this.p; i5++) {
                this.q[i5] = new sq(this, i5);
            }
            o0();
        }
        boolean z = H.c;
        c(null);
        a30 a30Var = this.F;
        if (a30Var != null && a30Var.m != z) {
            a30Var.m = z;
        }
        this.w = z;
        o0();
        ap apVar = new ap();
        apVar.a = true;
        apVar.f = 0;
        apVar.g = 0;
        this.v = apVar;
        this.r = xg.a(this, this.t);
        this.s = xg.a(this, 1 - this.t);
    }

    public static int d1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.ny
    public final void A0(RecyclerView recyclerView, int i) {
        up upVar = new up(recyclerView.getContext());
        upVar.a = i;
        B0(upVar);
    }

    @Override // defpackage.ny
    public final boolean C0() {
        return this.F == null;
    }

    public final boolean D0() {
        int K0;
        if (v() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                K0 = L0();
                K0();
            } else {
                K0 = K0();
                L0();
            }
            if (K0 == 0 && P0() != null) {
                this.B.c();
                this.f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int E0(zy zyVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return m60.o(zyVar, this.r, H0(z), G0(z), this, this.I, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0270, code lost:
    
        V0(r1, r7);
     */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F0(ty tyVar, ap apVar, zy zyVar) {
        sq[] sqVarArr;
        BitSet bitSet;
        int i;
        sq[] sqVarArr2;
        sq sqVar;
        ?? r5;
        int i2;
        int c;
        int i3;
        int i4;
        BitSet bitSet2;
        int i5;
        int i6;
        ty tyVar2 = tyVar;
        BitSet bitSet3 = this.y;
        int i7 = this.p;
        bitSet3.set(0, i7, true);
        ap apVar2 = this.v;
        int i8 = apVar2.i ? apVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : apVar.e == 1 ? apVar.g + apVar.b : apVar.f - apVar.b;
        int i9 = apVar.e;
        int i10 = 0;
        while (true) {
            sqVarArr = this.q;
            if (i10 >= i7) {
                break;
            }
            if (!((ArrayList) sqVarArr[i10].f).isEmpty()) {
                c1(sqVarArr[i10], i9, i8);
            }
            i10++;
        }
        boolean z = this.x;
        xg xgVar = this.r;
        int g = z ? xgVar.g() : xgVar.k();
        boolean z2 = false;
        while (true) {
            int i11 = apVar.c;
            if (i11 < 0 || i11 >= zyVar.b() || (!apVar2.i && bitSet3.isEmpty())) {
                break;
            }
            View d = tyVar2.d(apVar.c);
            apVar.c += apVar.d;
            y20 y20Var = (y20) d.getLayoutParams();
            int b = y20Var.a.b();
            o4 o4Var = this.B;
            int[] iArr = (int[]) o4Var.g;
            int i12 = (iArr == null || b >= iArr.length) ? -1 : iArr[b];
            if (i12 == -1) {
                if (T0(apVar.e)) {
                    i = i7;
                    i6 = i7 - 1;
                    i7 = -1;
                    i5 = -1;
                } else {
                    i = i7;
                    i5 = 1;
                    i6 = 0;
                }
                sq sqVar2 = null;
                int i13 = i5;
                if (apVar.e == 1) {
                    int k = xgVar.k();
                    sqVarArr2 = sqVarArr;
                    int i14 = i6;
                    int i15 = Integer.MAX_VALUE;
                    while (i14 != i7) {
                        int i16 = i14;
                        sq sqVar3 = sqVarArr2[i16];
                        BitSet bitSet4 = bitSet3;
                        int g2 = sqVar3.g(k);
                        if (g2 < i15) {
                            i15 = g2;
                            sqVar2 = sqVar3;
                        }
                        i14 = i16 + i13;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    sqVarArr2 = sqVarArr;
                    int g3 = xgVar.g();
                    int i17 = i6;
                    int i18 = Integer.MIN_VALUE;
                    while (i17 != i7) {
                        sq sqVar4 = sqVarArr2[i17];
                        int i19 = i7;
                        int i20 = sqVar4.i(g3);
                        if (i20 > i18) {
                            i18 = i20;
                            sqVar2 = sqVar4;
                        }
                        i17 += i13;
                        i7 = i19;
                    }
                }
                sqVar = sqVar2;
                o4Var.t(b);
                ((int[]) o4Var.g)[b] = sqVar.e;
            } else {
                bitSet = bitSet3;
                i = i7;
                sqVarArr2 = sqVarArr;
                sqVar = sqVarArr2[i12];
            }
            y20Var.e = sqVar;
            if (apVar.e == 1) {
                r5 = 0;
                b(d, -1, false);
            } else {
                r5 = 0;
                b(d, 0, false);
            }
            int i21 = this.t;
            if (i21 == 1) {
                R0(d, ny.w(r5, this.u, this.l, r5, ((ViewGroup.MarginLayoutParams) y20Var).width), ny.w(true, this.o, this.m, C() + F(), ((ViewGroup.MarginLayoutParams) y20Var).height));
            } else {
                R0(d, ny.w(true, this.n, this.l, E() + D(), ((ViewGroup.MarginLayoutParams) y20Var).width), ny.w(false, this.u, this.m, 0, ((ViewGroup.MarginLayoutParams) y20Var).height));
            }
            if (apVar.e == 1) {
                c = sqVar.g(g);
                i2 = xgVar.c(d) + c;
            } else {
                i2 = sqVar.i(g);
                c = i2 - xgVar.c(d);
            }
            int i22 = apVar.e;
            sq sqVar5 = y20Var.e;
            if (i22 == 1) {
                sqVar5.getClass();
                y20 y20Var2 = (y20) d.getLayoutParams();
                y20Var2.e = sqVar5;
                ArrayList arrayList = (ArrayList) sqVar5.f;
                arrayList.add(d);
                sqVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    sqVar5.b = Integer.MIN_VALUE;
                }
                if (y20Var2.a.h() || y20Var2.a.k()) {
                    sqVar5.d = ((StaggeredGridLayoutManager) sqVar5.g).r.c(d) + sqVar5.d;
                }
            } else {
                sqVar5.getClass();
                y20 y20Var3 = (y20) d.getLayoutParams();
                y20Var3.e = sqVar5;
                ArrayList arrayList2 = (ArrayList) sqVar5.f;
                arrayList2.add(0, d);
                sqVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    sqVar5.c = Integer.MIN_VALUE;
                }
                if (y20Var3.a.h() || y20Var3.a.k()) {
                    sqVar5.d = ((StaggeredGridLayoutManager) sqVar5.g).r.c(d) + sqVar5.d;
                }
            }
            boolean Q0 = Q0();
            xg xgVar2 = this.s;
            if (Q0 && i21 == 1) {
                i4 = xgVar2.g() - (((i - 1) - sqVar.e) * this.u);
                i3 = i4 - xgVar2.c(d);
            } else {
                int k2 = (sqVar.e * this.u) + xgVar2.k();
                int c2 = xgVar2.c(d) + k2;
                i3 = k2;
                i4 = c2;
            }
            z2 = true;
            if (i21 == 1) {
                ny.N(d, i3, c, i4, i2);
            } else {
                ny.N(d, c, i3, i2, i4);
            }
            c1(sqVar, apVar2.e, i8);
            tyVar2 = tyVar;
            V0(tyVar2, apVar2);
            if (apVar2.h && d.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(sqVar.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i7 = i;
            sqVarArr = sqVarArr2;
        }
        int k3 = apVar2.e == -1 ? xgVar.k() - N0(xgVar.k()) : M0(xgVar.g()) - xgVar.g();
        if (k3 > 0) {
            return Math.min(apVar.b, k3);
        }
        return 0;
    }

    public final View G0(boolean z) {
        xg xgVar = this.r;
        int k = xgVar.k();
        int g = xgVar.g();
        View view = null;
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            int e = xgVar.e(u);
            int b = xgVar.b(u);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return u;
                }
                if (view == null) {
                    view = u;
                }
            }
        }
        return view;
    }

    public final View H0(boolean z) {
        xg xgVar = this.r;
        int k = xgVar.k();
        int g = xgVar.g();
        int v = v();
        View view = null;
        for (int i = 0; i < v; i++) {
            View u = u(i);
            int e = xgVar.e(u);
            if (xgVar.b(u) > k && e < g) {
                if (e >= k || !z) {
                    return u;
                }
                if (view == null) {
                    view = u;
                }
            }
        }
        return view;
    }

    @Override // defpackage.ny
    public final int I(ty tyVar, zy zyVar) {
        if (this.t == 0) {
            return Math.min(this.p, zyVar.b());
        }
        return -1;
    }

    public final void I0(ty tyVar, zy zyVar, boolean z) {
        int g;
        int M0 = M0(Integer.MIN_VALUE);
        if (M0 != Integer.MIN_VALUE && (g = this.r.g() - M0) > 0) {
            int i = g - (-Z0(-g, tyVar, zyVar));
            if (!z || i <= 0) {
                return;
            }
            this.r.o(i);
        }
    }

    public final void J0(ty tyVar, zy zyVar, boolean z) {
        int k;
        int N0 = N0(Integer.MAX_VALUE);
        if (N0 != Integer.MAX_VALUE && (k = N0 - this.r.k()) > 0) {
            int Z0 = k - Z0(k, tyVar, zyVar);
            if (!z || Z0 <= 0) {
                return;
            }
            this.r.o(-Z0);
        }
    }

    @Override // defpackage.ny
    public final boolean K() {
        return this.C != 0;
    }

    public final int K0() {
        if (v() == 0) {
            return 0;
        }
        return ny.G(u(0));
    }

    @Override // defpackage.ny
    public final boolean L() {
        return this.w;
    }

    public final int L0() {
        int v = v();
        if (v == 0) {
            return 0;
        }
        return ny.G(u(v - 1));
    }

    public final int M0(int i) {
        int g = this.q[0].g(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int g2 = this.q[i2].g(i);
            if (g2 > g) {
                g = g2;
            }
        }
        return g;
    }

    public final int N0(int i) {
        int i2 = this.q[0].i(i);
        for (int i3 = 1; i3 < this.p; i3++) {
            int i4 = this.q[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // defpackage.ny
    public final void O(int i) {
        super.O(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            sq sqVar = this.q[i2];
            int i3 = sqVar.b;
            if (i3 != Integer.MIN_VALUE) {
                sqVar.b = i3 + i;
            }
            int i4 = sqVar.c;
            if (i4 != Integer.MIN_VALUE) {
                sqVar.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(int i, int i2, int i3) {
        int i4;
        int i5;
        o4 o4Var;
        int[] iArr;
        ArrayList arrayList;
        z20 z20Var;
        int i6;
        int L0 = this.x ? L0() : K0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                o4Var = this.B;
                iArr = (int[]) o4Var.g;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) o4Var.h;
                    if (arrayList != null) {
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                z20Var = (z20) ((ArrayList) o4Var.h).get(size);
                                if (z20Var.f == i5) {
                                    break;
                                }
                            }
                        }
                        z20Var = null;
                        if (z20Var != null) {
                            ((ArrayList) o4Var.h).remove(z20Var);
                        }
                        int size2 = ((ArrayList) o4Var.h).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((z20) ((ArrayList) o4Var.h).get(i7)).f >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            z20 z20Var2 = (z20) ((ArrayList) o4Var.h).get(i7);
                            ((ArrayList) o4Var.h).remove(i7);
                            i6 = z20Var2.f;
                            int[] iArr2 = (int[]) o4Var.g;
                            if (i6 == -1) {
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) o4Var.g).length;
                            } else {
                                Arrays.fill((int[]) o4Var.g, i5, Math.min(i6 + 1, iArr2.length), -1);
                            }
                        }
                    }
                    i6 = -1;
                    int[] iArr22 = (int[]) o4Var.g;
                    if (i6 == -1) {
                    }
                }
                if (i3 != 1) {
                    o4Var.A(i, i2);
                } else if (i3 == 2) {
                    o4Var.B(i, i2);
                } else if (i3 == 8) {
                    o4Var.B(i, 1);
                    o4Var.A(i2, 1);
                }
                if (i4 > L0) {
                    return;
                }
                if (i5 <= (this.x ? K0() : L0())) {
                    o0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        o4Var = this.B;
        iArr = (int[]) o4Var.g;
        if (iArr != null) {
            arrayList = (ArrayList) o4Var.h;
            if (arrayList != null) {
            }
            i6 = -1;
            int[] iArr222 = (int[]) o4Var.g;
            if (i6 == -1) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > L0) {
        }
    }

    @Override // defpackage.ny
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            sq sqVar = this.q[i2];
            int i3 = sqVar.b;
            if (i3 != Integer.MIN_VALUE) {
                sqVar.b = i3 + i;
            }
            int i4 = sqVar.c;
            if (i4 != Integer.MIN_VALUE) {
                sqVar.c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View P0() {
        int v = v();
        int i = v - 1;
        int i2 = this.p;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        char c = (this.t == 1 && Q0()) ? (char) 1 : (char) 65535;
        if (this.x) {
            v = -1;
        } else {
            i = 0;
        }
        int i3 = i < v ? 1 : -1;
        while (i != v) {
            View u = u(i);
            y20 y20Var = (y20) u.getLayoutParams();
            boolean z = bitSet.get(y20Var.e.e);
            xg xgVar = this.r;
            if (z) {
                sq sqVar = y20Var.e;
                if (this.x) {
                    int i4 = sqVar.c;
                    if (i4 == Integer.MIN_VALUE) {
                        sqVar.a();
                        i4 = sqVar.c;
                    }
                    if (i4 < xgVar.g()) {
                        ArrayList arrayList = (ArrayList) sqVar.f;
                        ((y20) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u;
                    }
                } else {
                    int i5 = sqVar.b;
                    ArrayList arrayList2 = (ArrayList) sqVar.f;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        y20 y20Var2 = (y20) view.getLayoutParams();
                        sqVar.b = ((StaggeredGridLayoutManager) sqVar.g).r.e(view);
                        y20Var2.getClass();
                        i5 = sqVar.b;
                    }
                    if (i5 > xgVar.k()) {
                        ((y20) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return u;
                    }
                }
                bitSet.clear(y20Var.e.e);
            }
            i += i3;
            if (i != v) {
                View u2 = u(i);
                if (this.x) {
                    int b = xgVar.b(u);
                    int b2 = xgVar.b(u2);
                    if (b < b2) {
                        return u;
                    }
                    if (b == b2) {
                        if ((y20Var.e.e - ((y20) u2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                            return u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e = xgVar.e(u);
                    int e2 = xgVar.e(u2);
                    if (e > e2) {
                        return u;
                    }
                    if (e == e2) {
                        if ((y20Var.e.e - ((y20) u2.getLayoutParams()).e.e >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ny
    public final void Q() {
        this.B.c();
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
    }

    public final boolean Q0() {
        return this.b.getLayoutDirection() == 1;
    }

    public final void R0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.N(view));
        }
        y20 y20Var = (y20) view.getLayoutParams();
        int d1 = d1(i, ((ViewGroup.MarginLayoutParams) y20Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) y20Var).rightMargin + rect.right);
        int d12 = d1(i2, ((ViewGroup.MarginLayoutParams) y20Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) y20Var).bottomMargin + rect.bottom);
        if (x0(view, d1, d12, y20Var)) {
            view.measure(d1, d12);
        }
    }

    @Override // defpackage.ny
    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
    
        if ((r4 < K0()) != r17.x) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0179, code lost:
    
        if (r17.x != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0189, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(ty tyVar, zy zyVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        a30 a30Var;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        a30 a30Var2 = this.F;
        x20 x20Var = this.H;
        if (!(a30Var2 == null && this.z == -1) && zyVar.b() == 0) {
            j0(tyVar);
            x20Var.a();
            return;
        }
        boolean z6 = x20Var.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = x20Var.g;
        boolean z7 = (z6 && this.z == -1 && this.F == null) ? false : true;
        sq[] sqVarArr = this.q;
        int i4 = this.p;
        o4 o4Var = this.B;
        if (z7) {
            x20Var.a();
            a30 a30Var3 = this.F;
            xg xgVar = this.r;
            if (a30Var3 != null) {
                int i5 = a30Var3.h;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            sqVarArr[i6].b();
                            a30 a30Var4 = this.F;
                            int i7 = a30Var4.i[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += a30Var4.n ? xgVar.g() : xgVar.k();
                            }
                            sq sqVar = sqVarArr[i6];
                            sqVar.b = i7;
                            sqVar.c = i7;
                        }
                    } else {
                        a30Var3.i = null;
                        a30Var3.h = 0;
                        a30Var3.j = 0;
                        a30Var3.k = null;
                        a30Var3.l = null;
                        a30Var3.f = a30Var3.g;
                    }
                }
                a30 a30Var5 = this.F;
                this.E = a30Var5.o;
                boolean z8 = a30Var5.m;
                c(null);
                a30 a30Var6 = this.F;
                if (a30Var6 != null && a30Var6.m != z8) {
                    a30Var6.m = z8;
                }
                this.w = z8;
                o0();
                Y0();
                a30 a30Var7 = this.F;
                int i8 = a30Var7.f;
                if (i8 != -1) {
                    this.z = i8;
                    x20Var.c = a30Var7.n;
                } else {
                    x20Var.c = this.x;
                }
                if (a30Var7.j > 1) {
                    o4Var.g = a30Var7.k;
                    o4Var.h = a30Var7.l;
                }
            } else {
                Y0();
                x20Var.c = this.x;
            }
            if (!zyVar.g && (i3 = this.z) != -1) {
                if (i3 < 0 || i3 >= zyVar.b()) {
                    this.z = -1;
                    this.A = Integer.MIN_VALUE;
                } else {
                    a30 a30Var8 = this.F;
                    if (a30Var8 == null || a30Var8.f == -1 || a30Var8.h < 1) {
                        View q = q(this.z);
                        if (q != null) {
                            x20Var.a = this.x ? L0() : K0();
                            if (this.A != Integer.MIN_VALUE) {
                                if (x20Var.c) {
                                    x20Var.b = (xgVar.g() - this.A) - xgVar.b(q);
                                } else {
                                    x20Var.b = (xgVar.k() + this.A) - xgVar.e(q);
                                }
                            } else if (xgVar.c(q) > xgVar.l()) {
                                x20Var.b = x20Var.c ? xgVar.g() : xgVar.k();
                            } else {
                                int e = xgVar.e(q) - xgVar.k();
                                if (e < 0) {
                                    x20Var.b = -e;
                                } else {
                                    int g = xgVar.g() - xgVar.b(q);
                                    if (g < 0) {
                                        x20Var.b = g;
                                    } else {
                                        x20Var.b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.z;
                            x20Var.a = i9;
                            int i10 = this.A;
                            if (i10 == Integer.MIN_VALUE) {
                                if (v() == 0) {
                                }
                                x20Var.c = z5;
                                xg xgVar2 = staggeredGridLayoutManager.r;
                                x20Var.b = z5 ? xgVar2.g() : xgVar2.k();
                            } else {
                                boolean z9 = x20Var.c;
                                xg xgVar3 = staggeredGridLayoutManager.r;
                                if (z9) {
                                    x20Var.b = xgVar3.g() - i10;
                                } else {
                                    x20Var.b = xgVar3.k() + i10;
                                }
                            }
                            z4 = true;
                            x20Var.d = true;
                            x20Var.e = z4;
                        }
                    } else {
                        x20Var.b = Integer.MIN_VALUE;
                        x20Var.a = this.z;
                    }
                    z4 = true;
                    x20Var.e = z4;
                }
            }
            if (this.D) {
                int b = zyVar.b();
                for (int v = v() - 1; v >= 0; v--) {
                    i2 = ny.G(u(v));
                    if (i2 >= 0 && i2 < b) {
                        break;
                    }
                }
                i2 = 0;
                x20Var.a = i2;
                x20Var.b = Integer.MIN_VALUE;
                z4 = true;
                x20Var.e = z4;
            } else {
                int b2 = zyVar.b();
                int v2 = v();
                for (int i11 = 0; i11 < v2; i11++) {
                    int G = ny.G(u(i11));
                    if (G >= 0 && G < b2) {
                        i2 = G;
                        break;
                    }
                }
                i2 = 0;
                x20Var.a = i2;
                x20Var.b = Integer.MIN_VALUE;
                z4 = true;
                x20Var.e = z4;
            }
        }
        if (this.F == null && this.z == -1 && !(x20Var.c == this.D && Q0() == this.E)) {
            o4Var.c();
            i = 1;
            x20Var.d = true;
        } else {
            i = 1;
        }
        if (v() > 0 && ((a30Var = this.F) == null || a30Var.h < i)) {
            if (x20Var.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    sqVarArr[i12].b();
                    int i13 = x20Var.b;
                    if (i13 != Integer.MIN_VALUE) {
                        sq sqVar2 = sqVarArr[i12];
                        sqVar2.b = i13;
                        sqVar2.c = i13;
                    }
                }
            } else if (z7 || x20Var.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    sq sqVar3 = sqVarArr[i14];
                    boolean z10 = this.x;
                    int i15 = x20Var.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) sqVar3.g;
                    int g2 = z10 ? sqVar3.g(Integer.MIN_VALUE) : sqVar3.i(Integer.MIN_VALUE);
                    sqVar3.b();
                    if (g2 != Integer.MIN_VALUE && ((!z10 || g2 >= staggeredGridLayoutManager2.r.g()) && (z10 || g2 <= staggeredGridLayoutManager2.r.k()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            g2 += i15;
                        }
                        sqVar3.c = g2;
                        sqVar3.b = g2;
                    }
                }
                int length = sqVarArr.length;
                int[] iArr = x20Var.f;
                if (iArr == null || iArr.length < length) {
                    x20Var.f = new int[staggeredGridLayoutManager.q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    x20Var.f[i16] = sqVarArr[i16].i(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    sq sqVar4 = sqVarArr[i17];
                    sqVar4.b();
                    int i18 = x20Var.f[i17];
                    sqVar4.b = i18;
                    sqVar4.c = i18;
                }
            }
        }
        p(tyVar);
        ap apVar = this.v;
        apVar.a = false;
        xg xgVar4 = this.s;
        int l = xgVar4.l();
        this.u = l / i4;
        View.MeasureSpec.makeMeasureSpec(l, xgVar4.i());
        b1(x20Var.a, zyVar);
        if (x20Var.c) {
            a1(-1);
            F0(tyVar, apVar, zyVar);
            a1(1);
            apVar.c = x20Var.a + apVar.d;
            F0(tyVar, apVar, zyVar);
        } else {
            a1(1);
            F0(tyVar, apVar, zyVar);
            a1(-1);
            apVar.c = x20Var.a + apVar.d;
            F0(tyVar, apVar, zyVar);
        }
        if (xgVar4.i() != 1073741824) {
            int v3 = v();
            float f = 0.0f;
            for (int i19 = 0; i19 < v3; i19++) {
                View u = u(i19);
                float c = xgVar4.c(u);
                if (c >= f) {
                    ((y20) u.getLayoutParams()).getClass();
                    f = Math.max(f, c);
                }
            }
            int i20 = this.u;
            int round = Math.round(f * i4);
            if (xgVar4.i() == Integer.MIN_VALUE) {
                round = Math.min(round, xgVar4.l());
            }
            this.u = round / i4;
            View.MeasureSpec.makeMeasureSpec(round, xgVar4.i());
            if (this.u != i20) {
                for (int i21 = 0; i21 < v3; i21++) {
                    View u2 = u(i21);
                    y20 y20Var = (y20) u2.getLayoutParams();
                    y20Var.getClass();
                    boolean Q0 = Q0();
                    int i22 = this.t;
                    if (Q0 && i22 == 1) {
                        int i23 = -((i4 - 1) - y20Var.e.e);
                        u2.offsetLeftAndRight((this.u * i23) - (i23 * i20));
                    } else {
                        int i24 = y20Var.e.e;
                        int i25 = this.u * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            u2.offsetLeftAndRight(i25 - i26);
                        } else {
                            u2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (v() <= 0) {
            z2 = true;
        } else if (this.x) {
            z2 = true;
            I0(tyVar, zyVar, true);
            J0(tyVar, zyVar, false);
        } else {
            z2 = true;
            J0(tyVar, zyVar, true);
            I0(tyVar, zyVar, false);
        }
        if (z && !zyVar.g && this.C != 0 && v() > 0 && P0() != null) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            if (D0()) {
                z3 = z2;
                if (zyVar.g) {
                    x20Var.a();
                }
                this.D = x20Var.c;
                this.E = Q0();
                if (z3) {
                    return;
                }
                x20Var.a();
                S0(tyVar, zyVar, false);
                return;
            }
        }
        z3 = false;
        if (zyVar.g) {
        }
        this.D = x20Var.c;
        this.E = Q0();
        if (z3) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x004b, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x004f, code lost:
    
        if (r0 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0059, code lost:
    
        if (Q0() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0063, code lost:
    
        if (Q0() == false) goto L34;
     */
    @Override // defpackage.ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, ty tyVar, zy zyVar) {
        View view2;
        int i2;
        if (v() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (view2 = recyclerView.D(view)) == null || this.a.c.contains(view2)) {
                view2 = null;
            }
            if (view2 != null) {
                Y0();
                int i3 = this.t;
                if (i == 1) {
                    if (i3 != 1) {
                    }
                    i2 = -1;
                } else if (i == 2) {
                    if (i3 != 1) {
                    }
                    i2 = 1;
                } else if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i2 = Integer.MIN_VALUE;
                }
                if (i2 != Integer.MIN_VALUE) {
                    y20 y20Var = (y20) view2.getLayoutParams();
                    y20Var.getClass();
                    sq sqVar = y20Var.e;
                    int L0 = i2 == 1 ? L0() : K0();
                    b1(L0, zyVar);
                    a1(i2);
                    ap apVar = this.v;
                    apVar.c = apVar.d + L0;
                    apVar.b = (int) (this.r.l() * 0.33333334f);
                    apVar.h = true;
                    apVar.a = false;
                    F0(tyVar, apVar, zyVar);
                    this.D = this.x;
                    View h = sqVar.h(L0, i2);
                    if (h != null && h != view2) {
                        return h;
                    }
                    boolean T0 = T0(i2);
                    sq[] sqVarArr = this.q;
                    int i4 = this.p;
                    if (T0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View h2 = sqVarArr[i5].h(L0, i2);
                            if (h2 != null && h2 != view2) {
                                return h2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View h3 = sqVarArr[i6].h(L0, i2);
                            if (h3 != null && h3 != view2) {
                                return h3;
                            }
                        }
                    }
                    boolean z = (this.w ^ true) == (i2 == -1);
                    View q = q(z ? sqVar.c() : sqVar.d());
                    if (q != null && q != view2) {
                        return q;
                    }
                    if (T0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != sqVar.e) {
                                View q2 = q(z ? sqVarArr[i7].c() : sqVarArr[i7].d());
                                if (q2 != null && q2 != view2) {
                                    return q2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View q3 = q(z ? sqVarArr[i8].c() : sqVarArr[i8].d());
                            if (q3 != null && q3 != view2) {
                                return q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean T0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == Q0();
    }

    @Override // defpackage.ny
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            View H0 = H0(false);
            View G0 = G0(false);
            if (H0 == null || G0 == null) {
                return;
            }
            int G = ny.G(H0);
            int G2 = ny.G(G0);
            if (G < G2) {
                accessibilityEvent.setFromIndex(G);
                accessibilityEvent.setToIndex(G2);
            } else {
                accessibilityEvent.setFromIndex(G2);
                accessibilityEvent.setToIndex(G);
            }
        }
    }

    public final void U0(int i, zy zyVar) {
        int K0;
        int i2;
        if (i > 0) {
            K0 = L0();
            i2 = 1;
        } else {
            K0 = K0();
            i2 = -1;
        }
        ap apVar = this.v;
        apVar.a = true;
        b1(K0, zyVar);
        a1(i2);
        apVar.c = K0 + apVar.d;
        apVar.b = Math.abs(i);
    }

    @Override // defpackage.ny
    public final void V(ty tyVar, zy zyVar, k0 k0Var) {
        super.V(tyVar, zyVar, k0Var);
        k0Var.h("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void V0(ty tyVar, ap apVar) {
        if (!apVar.a || apVar.i) {
            return;
        }
        int i = apVar.b;
        int i2 = apVar.e;
        if (i == 0) {
            if (i2 == -1) {
                W0(tyVar, apVar.g);
                return;
            } else {
                X0(tyVar, apVar.f);
                return;
            }
        }
        int i3 = this.p;
        sq[] sqVarArr = this.q;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = apVar.f;
            int i6 = sqVarArr[0].i(i5);
            while (i4 < i3) {
                int i7 = sqVarArr[i4].i(i5);
                if (i7 > i6) {
                    i6 = i7;
                }
                i4++;
            }
            int i8 = i5 - i6;
            int i9 = apVar.g;
            if (i8 >= 0) {
                i9 -= Math.min(i8, apVar.b);
            }
            W0(tyVar, i9);
            return;
        }
        int i10 = apVar.g;
        int g = sqVarArr[0].g(i10);
        while (i4 < i3) {
            int g2 = sqVarArr[i4].g(i10);
            if (g2 < g) {
                g = g2;
            }
            i4++;
        }
        int i11 = g - apVar.g;
        int i12 = apVar.f;
        if (i11 >= 0) {
            i12 += Math.min(i11, apVar.b);
        }
        X0(tyVar, i12);
    }

    @Override // defpackage.ny
    public final void W(ty tyVar, zy zyVar, View view, k0 k0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof y20)) {
            X(view, k0Var);
            return;
        }
        sq sqVar = ((y20) layoutParams).e;
        if (this.t == 0) {
            k0Var.i(j0.D(false, sqVar == null ? -1 : sqVar.e, 1, -1, -1));
        } else {
            k0Var.i(j0.D(false, -1, -1, sqVar == null ? -1 : sqVar.e, 1));
        }
    }

    public final void W0(ty tyVar, int i) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            xg xgVar = this.r;
            if (xgVar.e(u) < i || xgVar.n(u) < i) {
                return;
            }
            y20 y20Var = (y20) u.getLayoutParams();
            y20Var.getClass();
            if (((ArrayList) y20Var.e.f).size() == 1) {
                return;
            }
            sq sqVar = y20Var.e;
            ArrayList arrayList = (ArrayList) sqVar.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            y20 y20Var2 = (y20) view.getLayoutParams();
            y20Var2.e = null;
            if (y20Var2.a.h() || y20Var2.a.k()) {
                sqVar.d -= ((StaggeredGridLayoutManager) sqVar.g).r.c(view);
            }
            if (size == 1) {
                sqVar.b = Integer.MIN_VALUE;
            }
            sqVar.c = Integer.MIN_VALUE;
            l0(u, tyVar);
        }
    }

    public final void X0(ty tyVar, int i) {
        while (v() > 0) {
            View u = u(0);
            xg xgVar = this.r;
            if (xgVar.b(u) > i || xgVar.m(u) > i) {
                return;
            }
            y20 y20Var = (y20) u.getLayoutParams();
            y20Var.getClass();
            if (((ArrayList) y20Var.e.f).size() == 1) {
                return;
            }
            sq sqVar = y20Var.e;
            ArrayList arrayList = (ArrayList) sqVar.f;
            View view = (View) arrayList.remove(0);
            y20 y20Var2 = (y20) view.getLayoutParams();
            y20Var2.e = null;
            if (arrayList.size() == 0) {
                sqVar.c = Integer.MIN_VALUE;
            }
            if (y20Var2.a.h() || y20Var2.a.k()) {
                sqVar.d -= ((StaggeredGridLayoutManager) sqVar.g).r.c(view);
            }
            sqVar.b = Integer.MIN_VALUE;
            l0(u, tyVar);
        }
    }

    @Override // defpackage.ny
    public final void Y(int i, int i2) {
        O0(i, i2, 1);
    }

    public final void Y0() {
        if (this.t == 1 || !Q0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // defpackage.ny
    public final void Z() {
        this.B.c();
        o0();
    }

    public final int Z0(int i, ty tyVar, zy zyVar) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        U0(i, zyVar);
        ap apVar = this.v;
        int F0 = F0(tyVar, apVar, zyVar);
        if (apVar.b >= F0) {
            i = i < 0 ? -F0 : F0;
        }
        this.r.o(-i);
        this.D = this.x;
        apVar.b = 0;
        V0(tyVar, apVar);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < K0()) != r3.x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // defpackage.yy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF a(int i) {
        int i2 = -1;
        if (v() == 0) {
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // defpackage.ny
    public final void a0(int i, int i2) {
        O0(i, i2, 8);
    }

    public final void a1(int i) {
        ap apVar = this.v;
        apVar.e = i;
        apVar.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // defpackage.ny
    public final void b0(int i, int i2) {
        O0(i, i2, 2);
    }

    public final void b1(int i, zy zyVar) {
        int i2;
        int i3;
        int i4;
        ap apVar = this.v;
        boolean z = false;
        apVar.b = 0;
        apVar.c = i;
        up upVar = this.e;
        xg xgVar = this.r;
        if (upVar == null || !upVar.e || (i4 = zyVar.a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.x == (i4 < i)) {
                i2 = xgVar.l();
                i3 = 0;
            } else {
                i3 = xgVar.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.m) {
            apVar.g = xgVar.f() + i2;
            apVar.f = -i3;
        } else {
            apVar.f = xgVar.k() - i3;
            apVar.g = xgVar.g() + i2;
        }
        apVar.h = false;
        apVar.a = true;
        if (xgVar.i() == 0 && xgVar.f() == 0) {
            z = true;
        }
        apVar.i = z;
    }

    @Override // defpackage.ny
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // defpackage.ny
    public final void c0(int i, int i2) {
        O0(i, i2, 4);
    }

    public final void c1(sq sqVar, int i, int i2) {
        int i3 = sqVar.d;
        int i4 = sqVar.e;
        BitSet bitSet = this.y;
        if (i != -1) {
            int i5 = sqVar.c;
            if (i5 == Integer.MIN_VALUE) {
                sqVar.a();
                i5 = sqVar.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = sqVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) sqVar.f).get(0);
            y20 y20Var = (y20) view.getLayoutParams();
            sqVar.b = ((StaggeredGridLayoutManager) sqVar.g).r.e(view);
            y20Var.getClass();
            i6 = sqVar.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.ny
    public final boolean d() {
        return this.t == 0;
    }

    @Override // defpackage.ny
    public final void d0(ty tyVar, zy zyVar) {
        S0(tyVar, zyVar, true);
    }

    @Override // defpackage.ny
    public final boolean e() {
        return this.t == 1;
    }

    @Override // defpackage.ny
    public final void e0(zy zyVar) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // defpackage.ny
    public final boolean f(oy oyVar) {
        return oyVar instanceof y20;
    }

    @Override // defpackage.ny
    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof a30) {
            a30 a30Var = (a30) parcelable;
            this.F = a30Var;
            if (this.z != -1) {
                a30Var.f = -1;
                a30Var.g = -1;
                a30Var.i = null;
                a30Var.h = 0;
                a30Var.j = 0;
                a30Var.k = null;
                a30Var.l = null;
            }
            o0();
        }
    }

    @Override // defpackage.ny
    public final Parcelable g0() {
        int i;
        int k;
        int[] iArr;
        a30 a30Var = this.F;
        if (a30Var != null) {
            a30 a30Var2 = new a30();
            a30Var2.h = a30Var.h;
            a30Var2.f = a30Var.f;
            a30Var2.g = a30Var.g;
            a30Var2.i = a30Var.i;
            a30Var2.j = a30Var.j;
            a30Var2.k = a30Var.k;
            a30Var2.m = a30Var.m;
            a30Var2.n = a30Var.n;
            a30Var2.o = a30Var.o;
            a30Var2.l = a30Var.l;
            return a30Var2;
        }
        a30 a30Var3 = new a30();
        a30Var3.m = this.w;
        a30Var3.n = this.D;
        a30Var3.o = this.E;
        o4 o4Var = this.B;
        if (o4Var == null || (iArr = (int[]) o4Var.g) == null) {
            a30Var3.j = 0;
        } else {
            a30Var3.k = iArr;
            a30Var3.j = iArr.length;
            a30Var3.l = (ArrayList) o4Var.h;
        }
        if (v() <= 0) {
            a30Var3.f = -1;
            a30Var3.g = -1;
            a30Var3.h = 0;
            return a30Var3;
        }
        a30Var3.f = this.D ? L0() : K0();
        View G0 = this.x ? G0(true) : H0(true);
        a30Var3.g = G0 != null ? ny.G(G0) : -1;
        int i2 = this.p;
        a30Var3.h = i2;
        a30Var3.i = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = this.D;
            xg xgVar = this.r;
            sq[] sqVarArr = this.q;
            if (z) {
                i = sqVarArr[i3].g(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k = xgVar.g();
                    i -= k;
                    a30Var3.i[i3] = i;
                } else {
                    a30Var3.i[i3] = i;
                }
            } else {
                i = sqVarArr[i3].i(Integer.MIN_VALUE);
                if (i != Integer.MIN_VALUE) {
                    k = xgVar.k();
                    i -= k;
                    a30Var3.i[i3] = i;
                } else {
                    a30Var3.i[i3] = i;
                }
            }
        }
        return a30Var3;
    }

    @Override // defpackage.ny
    public final void h(int i, int i2, zy zyVar, am amVar) {
        ap apVar;
        int g;
        if (this.t != 0) {
            i = i2;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        U0(i, zyVar);
        int[] iArr = this.J;
        int i3 = this.p;
        if (iArr == null || iArr.length < i3) {
            this.J = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            apVar = this.v;
            if (i4 >= i3) {
                break;
            }
            int i6 = apVar.d;
            sq[] sqVarArr = this.q;
            if (i6 == -1) {
                int i7 = apVar.f;
                g = i7 - sqVarArr[i4].i(i7);
            } else {
                g = sqVarArr[i4].g(apVar.g) - apVar.g;
            }
            if (g >= 0) {
                this.J[i5] = g;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.J, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = apVar.c;
            if (i9 < 0 || i9 >= zyVar.b()) {
                return;
            }
            amVar.a(apVar.c, this.J[i8]);
            apVar.c += apVar.d;
        }
    }

    @Override // defpackage.ny
    public final void h0(int i) {
        if (i == 0) {
            D0();
        }
    }

    @Override // defpackage.ny
    public final int j(zy zyVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return m60.n(zyVar, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.ny
    public final int k(zy zyVar) {
        return E0(zyVar);
    }

    @Override // defpackage.ny
    public final int l(zy zyVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return m60.p(zyVar, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.ny
    public final int m(zy zyVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return m60.n(zyVar, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.ny
    public final int n(zy zyVar) {
        return E0(zyVar);
    }

    @Override // defpackage.ny
    public final int o(zy zyVar) {
        if (v() == 0) {
            return 0;
        }
        boolean z = !this.I;
        return m60.p(zyVar, this.r, H0(z), G0(z), this, this.I);
    }

    @Override // defpackage.ny
    public final int p0(int i, ty tyVar, zy zyVar) {
        return Z0(i, tyVar, zyVar);
    }

    @Override // defpackage.ny
    public final void q0(int i) {
        a30 a30Var = this.F;
        if (a30Var != null && a30Var.f != i) {
            a30Var.i = null;
            a30Var.h = 0;
            a30Var.f = -1;
            a30Var.g = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    @Override // defpackage.ny
    public final oy r() {
        return this.t == 0 ? new y20(-2, -1) : new y20(-1, -2);
    }

    @Override // defpackage.ny
    public final int r0(int i, ty tyVar, zy zyVar) {
        return Z0(i, tyVar, zyVar);
    }

    @Override // defpackage.ny
    public final oy s(Context context, AttributeSet attributeSet) {
        return new y20(context, attributeSet);
    }

    @Override // defpackage.ny
    public final oy t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new y20((ViewGroup.MarginLayoutParams) layoutParams) : new y20(layoutParams);
    }

    @Override // defpackage.ny
    public final void u0(Rect rect, int i, int i2) {
        int g;
        int g2;
        int E = E() + D();
        int C = C() + F();
        int i3 = this.t;
        int i4 = this.p;
        if (i3 == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = f80.a;
            g2 = ny.g(i2, height, recyclerView.getMinimumHeight());
            g = ny.g(i, (this.u * i4) + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = f80.a;
            g = ny.g(i, width, recyclerView2.getMinimumWidth());
            g2 = ny.g(i2, (this.u * i4) + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.ny
    public final int x(ty tyVar, zy zyVar) {
        if (this.t == 1) {
            return Math.min(this.p, zyVar.b());
        }
        return -1;
    }
}

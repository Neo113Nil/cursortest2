package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.am;
import defpackage.d0;
import defpackage.dz;
import defpackage.ey;
import defpackage.f80;
import defpackage.fm;
import defpackage.j0;
import defpackage.k0;
import defpackage.l8;
import defpackage.n20;
import defpackage.ny;
import defpackage.o4;
import defpackage.oy;
import defpackage.qp;
import defpackage.rp;
import defpackage.sp;
import defpackage.tp;
import defpackage.ty;
import defpackage.zy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final o4 K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new o4(18);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(ny.H(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final boolean C0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void E0(zy zyVar, sp spVar, am amVar) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = spVar.d) >= 0 && i < zyVar.b() && i2 > 0; i3++) {
            amVar.a(spVar.d, Math.max(0, spVar.g));
            this.K.getClass();
            i2--;
            spVar.d += spVar.e;
        }
    }

    @Override // defpackage.ny
    public final int I(ty tyVar, zy zyVar) {
        if (this.p == 0) {
            return Math.min(this.F, B());
        }
        if (zyVar.b() < 1) {
            return 0;
        }
        return o1(zyVar.b() - 1, tyVar, zyVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(ty tyVar, zy zyVar, boolean z, boolean z2) {
        int i;
        int i2;
        int v = v();
        int i3 = 1;
        if (z2) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v;
            i2 = 0;
        }
        int b = zyVar.b();
        J0();
        int k = this.r.k();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u = u(i2);
            int G = ny.G(u);
            if (G >= 0 && G < b && p1(G, tyVar, zyVar) == 0) {
                if (((oy) u.getLayoutParams()).a.h()) {
                    if (view2 == null) {
                        view2 = u;
                    }
                } else {
                    if (this.r.e(u) < g && this.r.b(u) >= k) {
                        return u;
                    }
                    if (view == null) {
                        view = u;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x001f, code lost:
    
        if (r22.a.c.contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, ty tyVar, zy zyVar) {
        View D;
        int v;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        ty tyVar2 = tyVar;
        zy zyVar2 = zyVar;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            D = recyclerView.D(view);
            if (D != null) {
            }
        }
        D = null;
        if (D != null) {
            fm fmVar = (fm) D.getLayoutParams();
            int i6 = fmVar.e;
            int i7 = fmVar.f + i6;
            if (super.T(view, i, tyVar, zyVar) != null) {
                if ((I0(i) == 1) != this.u) {
                    i3 = v() - 1;
                    v = -1;
                    i2 = -1;
                } else {
                    v = v();
                    i2 = 1;
                    i3 = 0;
                }
                boolean z = this.p == 1 && V0();
                int o1 = o1(i3, tyVar2, zyVar2);
                View view4 = null;
                int i8 = -1;
                int i9 = -1;
                int i10 = 0;
                int i11 = i3;
                int i12 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i11 == v) {
                        break;
                    }
                    int o12 = o1(i11, tyVar2, zyVar2);
                    View u = u(i11);
                    if (u == D) {
                        break;
                    }
                    if (!u.hasFocusable() || o12 == o1) {
                        fm fmVar2 = (fm) u.getLayoutParams();
                        int i13 = fmVar2.e;
                        view3 = D;
                        int i14 = fmVar2.f + i13;
                        if (u.hasFocusable() && i13 == i6 && i14 == i7) {
                            return u;
                        }
                        if (!(u.hasFocusable() && view4 == null) && (u.hasFocusable() || view2 != null)) {
                            i4 = v;
                            int min = Math.min(i14, i7) - Math.max(i13, i6);
                            if (u.hasFocusable()) {
                                if (min <= i10) {
                                    if (min == i10) {
                                    }
                                    i5 = i10;
                                }
                                i5 = i10;
                            } else {
                                if (view4 == null) {
                                    i5 = i10;
                                    if (!this.c.y(u) || !this.d.y(u)) {
                                        if (min <= i12) {
                                            if (min == i12) {
                                            }
                                        }
                                    }
                                }
                                i5 = i10;
                            }
                        } else {
                            i5 = i10;
                            i4 = v;
                        }
                        boolean hasFocusable = u.hasFocusable();
                        int i15 = fmVar2.e;
                        if (hasFocusable) {
                            i10 = Math.min(i14, i7) - Math.max(i13, i6);
                            view4 = u;
                            i9 = i15;
                            view5 = view2;
                        } else {
                            i12 = Math.min(i14, i7) - Math.max(i13, i6);
                            i8 = i15;
                            i10 = i5;
                            view5 = u;
                        }
                        i11 += i2;
                        tyVar2 = tyVar;
                        zyVar2 = zyVar;
                        D = view3;
                        v = i4;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = D;
                        i5 = i10;
                        i4 = v;
                    }
                    view5 = view2;
                    i10 = i5;
                    i11 += i2;
                    tyVar2 = tyVar;
                    zyVar2 = zyVar;
                    D = view3;
                    v = i4;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final void V(ty tyVar, zy zyVar, k0 k0Var) {
        super.V(tyVar, zyVar, k0Var);
        k0Var.h(GridView.class.getName());
        ey eyVar = this.b.r;
        if (eyVar == null || eyVar.a() <= 1) {
            return;
        }
        k0Var.b(d0.m);
    }

    @Override // defpackage.ny
    public final void W(ty tyVar, zy zyVar, View view, k0 k0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof fm)) {
            X(view, k0Var);
            return;
        }
        fm fmVar = (fm) layoutParams;
        int o1 = o1(fmVar.a.b(), tyVar, zyVar);
        int i = this.p;
        int i2 = fmVar.e;
        int i3 = fmVar.f;
        if (i == 0) {
            k0Var.i(j0.D(false, i2, i3, o1, 1));
        } else {
            k0Var.i(j0.D(false, o1, 1, i2, i3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v31 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(ty tyVar, zy zyVar, sp spVar, rp rpVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int w;
        int i7;
        ?? r12;
        int i8;
        View b;
        int j = this.r.j();
        boolean z = j != 1073741824;
        int i9 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            t1();
        }
        boolean z2 = spVar.e == 1;
        int i10 = this.F;
        if (!z2) {
            i10 = p1(spVar.d, tyVar, zyVar) + q1(spVar.d, tyVar, zyVar);
        }
        int i11 = 0;
        while (i11 < this.F && (i8 = spVar.d) >= 0 && i8 < zyVar.b() && i10 > 0) {
            int i12 = spVar.d;
            int q1 = q1(i12, tyVar, zyVar);
            if (q1 > this.F) {
                throw new IllegalArgumentException("Item at position " + i12 + " requires " + q1 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i10 -= q1;
            if (i10 < 0 || (b = spVar.b(tyVar)) == null) {
                break;
            }
            this.H[i11] = b;
            i11++;
        }
        if (z2) {
            i3 = 1;
            i2 = i11;
            i = 0;
        } else {
            i = i11 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i13 = 0;
        while (i != i2) {
            View view = this.H[i];
            fm fmVar = (fm) view.getLayoutParams();
            int q12 = q1(ny.G(view), tyVar, zyVar);
            fmVar.f = q12;
            fmVar.e = i13;
            i13 += q12;
            i += i3;
        }
        float f = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            View view2 = this.H[i15];
            if (spVar.k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.N(view2));
            }
            r1(view2, j, r12);
            int c = this.r.c(view2);
            if (c > i14) {
                i14 = c;
            }
            float d = (this.r.d(view2) * 1.0f) / ((fm) view2.getLayoutParams()).f;
            if (d > f) {
                f = d;
            }
        }
        if (z) {
            h1(Math.max(Math.round(f * this.F), i9));
            i14 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                View view3 = this.H[i16];
                r1(view3, 1073741824, true);
                int c2 = this.r.c(view3);
                if (c2 > i14) {
                    i14 = c2;
                }
            }
        }
        for (int i17 = 0; i17 < i11; i17++) {
            View view4 = this.H[i17];
            if (this.r.c(view4) != i14) {
                fm fmVar2 = (fm) view4.getLayoutParams();
                Rect rect2 = fmVar2.b;
                int i18 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) fmVar2).topMargin + ((ViewGroup.MarginLayoutParams) fmVar2).bottomMargin;
                int i19 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) fmVar2).leftMargin + ((ViewGroup.MarginLayoutParams) fmVar2).rightMargin;
                int n1 = n1(fmVar2.e, fmVar2.f);
                if (this.p == 1) {
                    i7 = ny.w(false, n1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) fmVar2).width);
                    w = View.MeasureSpec.makeMeasureSpec(i14 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - i19, 1073741824);
                    w = ny.w(false, n1, 1073741824, i18, ((ViewGroup.MarginLayoutParams) fmVar2).height);
                    i7 = makeMeasureSpec;
                }
                if (z0(view4, i7, w, (oy) view4.getLayoutParams())) {
                    view4.measure(i7, w);
                }
            }
        }
        rpVar.a = i14;
        int i20 = this.p;
        int i21 = spVar.f;
        int i22 = spVar.b;
        if (i20 != 1) {
            if (i21 == -1) {
                i6 = i22 - i14;
                i5 = 0;
                i4 = i22;
            } else {
                i4 = i22 + i14;
                i5 = 0;
                i6 = i22;
            }
            i22 = i5;
        } else if (i21 == -1) {
            i5 = i22 - i14;
            i6 = 0;
            i4 = 0;
        } else {
            i4 = 0;
            i5 = i22;
            i22 += i14;
            i6 = 0;
        }
        int i23 = 0;
        while (true) {
            View[] viewArr = this.H;
            if (i23 >= i11) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i23];
            fm fmVar3 = (fm) view5.getLayoutParams();
            if (this.p != 1) {
                i5 = F() + this.G[fmVar3.e];
                i22 = this.r.d(view5) + i5;
            } else if (V0()) {
                int D = D() + this.G[this.F - fmVar3.e];
                i4 = D;
                i6 = D - this.r.d(view5);
            } else {
                i6 = D() + this.G[fmVar3.e];
                i4 = this.r.d(view5) + i6;
            }
            ny.N(view5, i6, i5, i4, i22);
            if (fmVar3.a.h() || fmVar3.a.k()) {
                rpVar.c = true;
            }
            rpVar.d = view5.hasFocusable() | rpVar.d;
            i23++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(ty tyVar, zy zyVar, qp qpVar, int i) {
        t1();
        if (zyVar.b() > 0 && !zyVar.g) {
            boolean z = i == 1;
            int p1 = p1(qpVar.b, tyVar, zyVar);
            if (z) {
                while (p1 > 0) {
                    int i2 = qpVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    qpVar.b = i3;
                    p1 = p1(i3, tyVar, zyVar);
                }
            } else {
                int b = zyVar.b() - 1;
                int i4 = qpVar.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int p12 = p1(i5, tyVar, zyVar);
                    if (p12 <= p1) {
                        break;
                    }
                    i4 = i5;
                    p1 = p12;
                }
                qpVar.b = i4;
            }
        }
        i1();
    }

    @Override // defpackage.ny
    public final void Y(int i, int i2) {
        o4 o4Var = this.K;
        o4Var.x();
        ((SparseIntArray) o4Var.h).clear();
    }

    @Override // defpackage.ny
    public final void Z() {
        o4 o4Var = this.K;
        o4Var.x();
        ((SparseIntArray) o4Var.h).clear();
    }

    @Override // defpackage.ny
    public final void a0(int i, int i2) {
        o4 o4Var = this.K;
        o4Var.x();
        ((SparseIntArray) o4Var.h).clear();
    }

    @Override // defpackage.ny
    public final void b0(int i, int i2) {
        o4 o4Var = this.K;
        o4Var.x();
        ((SparseIntArray) o4Var.h).clear();
    }

    @Override // defpackage.ny
    public final void c0(int i, int i2) {
        o4 o4Var = this.K;
        o4Var.x();
        ((SparseIntArray) o4Var.h).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final void d0(ty tyVar, zy zyVar) {
        boolean z = zyVar.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int v = v();
            for (int i = 0; i < v; i++) {
                fm fmVar = (fm) u(i).getLayoutParams();
                int b = fmVar.a.b();
                sparseIntArray2.put(b, fmVar.f);
                sparseIntArray.put(b, fmVar.e);
            }
        }
        super.d0(tyVar, zyVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z) {
        if (z) {
            l8.x("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.d1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final void e0(zy zyVar) {
        View q;
        super.e0(zyVar);
        this.E = false;
        int i = this.M;
        if (i == -1 || (q = q(i)) == null) {
            return;
        }
        q.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override // defpackage.ny
    public final boolean f(oy oyVar) {
        return oyVar instanceof fm;
    }

    public final void h1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0219  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i0(int i, Bundle bundle) {
        View view;
        dz L;
        int i2;
        int i3;
        if (i == d0.m.a() && i != -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= v()) {
                    view = null;
                    break;
                }
                View u = u(i4);
                Objects.requireNonNull(u);
                if (u.isAccessibilityFocused()) {
                    view = u(i4);
                    break;
                }
                i4++;
            }
            if (view != null && bundle != null) {
                int i5 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (P.contains(Integer.valueOf(i5)) && (L = this.b.L(view)) != null) {
                    RecyclerView recyclerView = L.r;
                    int J = recyclerView == null ? -1 : recyclerView.J(L);
                    int k1 = k1(J);
                    int j1 = j1(J);
                    if (k1 >= 0 && j1 >= 0) {
                        if (!l1(J).contains(Integer.valueOf(this.N)) || !m1(j1(J), J).contains(Integer.valueOf(this.O))) {
                            this.N = k1;
                            this.O = j1;
                        }
                        int i6 = this.N;
                        if (i6 == -1) {
                            i6 = k1;
                        }
                        int i7 = this.O;
                        if (i7 != -1) {
                            j1 = i7;
                        }
                        if (i5 == 17) {
                            i2 = J - 1;
                            while (i2 >= 0) {
                                int k12 = k1(i2);
                                int j12 = j1(i2);
                                if (k12 < 0 || j12 < 0) {
                                    break;
                                }
                                if (this.p != 1) {
                                    if (l1(i2).contains(Integer.valueOf(i6)) && j12 < j1) {
                                        this.O = j12;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if ((k12 == i6 && j12 < j1) || k12 < i6) {
                                        this.N = k12;
                                        this.O = j12;
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 33) {
                            i2 = J - 1;
                            while (i2 >= 0) {
                                int k13 = k1(i2);
                                int j13 = j1(i2);
                                if (k13 < 0 || j13 < 0) {
                                    break;
                                }
                                if (this.p == 1) {
                                    if (k13 < i6 && m1(j1(i2), i2).contains(Integer.valueOf(j1))) {
                                        this.N = k13;
                                        break;
                                    }
                                    i2--;
                                } else {
                                    if (k13 < i6 && j13 == j1) {
                                        this.N = ((Integer) Collections.max(l1(i2))).intValue();
                                        break;
                                    }
                                    i2--;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 66) {
                            i2 = J + 1;
                            while (i2 < B()) {
                                int k14 = k1(i2);
                                int j14 = j1(i2);
                                if (k14 < 0 || j14 < 0) {
                                    break;
                                }
                                if (this.p != 1) {
                                    if (j14 > j1 && l1(i2).contains(Integer.valueOf(i6))) {
                                        this.O = j14;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if ((k14 == i6 && j14 > j1) || k14 > i6) {
                                        this.N = k14;
                                        this.O = j14;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1) {
                                if (i5 != 17) {
                                }
                            }
                            if (i2 != -1) {
                            }
                        } else if (i5 == 130) {
                            i2 = J + 1;
                            while (i2 < B()) {
                                int k15 = k1(i2);
                                int j15 = j1(i2);
                                if (k15 < 0 || j15 < 0) {
                                    break;
                                }
                                if (this.p == 1) {
                                    if (k15 > i6 && (j15 == j1 || m1(j1(i2), i2).contains(Integer.valueOf(j1)))) {
                                        this.N = k15;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    if (k15 > i6 && j15 == j1) {
                                        this.N = k1(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            i2 = -1;
                            if (i2 == -1 && (i3 = this.p) == 0) {
                                if (i5 != 17) {
                                    if (k1 >= 0 && i3 != 1) {
                                        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                                        int i8 = 0;
                                        loop2: while (true) {
                                            if (i8 >= B()) {
                                                for (Integer num : treeMap.keySet()) {
                                                    int intValue = num.intValue();
                                                    if (intValue < k1) {
                                                        i2 = ((Integer) treeMap.get(num)).intValue();
                                                        this.N = intValue;
                                                        this.O = j1(i2);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it = l1(i8).iterator();
                                                while (it.hasNext()) {
                                                    Integer num2 = (Integer) it.next();
                                                    if (num2.intValue() < 0) {
                                                        break loop2;
                                                    }
                                                    treeMap.put(num2, Integer.valueOf(i8));
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                } else if (i5 == 66) {
                                    if (k1 >= 0 && i3 != 1) {
                                        TreeMap treeMap2 = new TreeMap();
                                        int i9 = 0;
                                        loop5: while (true) {
                                            if (i9 >= B()) {
                                                for (Integer num3 : treeMap2.keySet()) {
                                                    int intValue2 = num3.intValue();
                                                    if (intValue2 > k1) {
                                                        i2 = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.N = intValue2;
                                                        this.O = 0;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                Iterator it2 = l1(i9).iterator();
                                                while (it2.hasNext()) {
                                                    Integer num4 = (Integer) it2.next();
                                                    if (num4.intValue() < 0) {
                                                        break loop5;
                                                    }
                                                    if (!treeMap2.containsKey(num4)) {
                                                        treeMap2.put(num4, Integer.valueOf(i9));
                                                    }
                                                }
                                                i9++;
                                            }
                                        }
                                    }
                                    i2 = -1;
                                }
                            }
                            if (i2 != -1) {
                                q0(i2);
                                this.M = i2;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.i0(i, bundle);
            }
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i10 != -1 && i11 != -1) {
                int a = this.b.r.a();
                int i12 = 0;
                while (true) {
                    if (i12 >= a) {
                        i12 = -1;
                        break;
                    }
                    RecyclerView recyclerView2 = this.b;
                    int p1 = p1(i12, recyclerView2.h, recyclerView2.l0);
                    RecyclerView recyclerView3 = this.b;
                    int o1 = o1(i12, recyclerView3.h, recyclerView3.l0);
                    if (this.p == 1) {
                        if (p1 == i11 && o1 == i10) {
                            break;
                        }
                        i12++;
                    } else {
                        if (p1 == i10 && o1 == i11) {
                            break;
                        }
                        i12++;
                    }
                }
                if (i12 > -1) {
                    this.x = i12;
                    this.y = 0;
                    tp tpVar = this.z;
                    if (tpVar != null) {
                        tpVar.f = -1;
                    }
                    o0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void i1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int j1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 0 ? o1(i, recyclerView.h, recyclerView.l0) : p1(i, recyclerView.h, recyclerView.l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final int k(zy zyVar) {
        return G0(zyVar);
    }

    public final int k1(int i) {
        int i2 = this.p;
        RecyclerView recyclerView = this.b;
        return i2 == 1 ? o1(i, recyclerView.h, recyclerView.l0) : p1(i, recyclerView.h, recyclerView.l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final int l(zy zyVar) {
        return H0(zyVar);
    }

    public final HashSet l1(int i) {
        return m1(k1(i), i);
    }

    public final HashSet m1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int q1 = q1(i2, recyclerView.h, recyclerView.l0);
        for (int i3 = i; i3 < i + q1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final int n(zy zyVar) {
        return G0(zyVar);
    }

    public final int n1(int i, int i2) {
        if (this.p != 1 || !V0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final int o(zy zyVar) {
        return H0(zyVar);
    }

    public final int o1(int i, ty tyVar, zy zyVar) {
        boolean z = zyVar.g;
        o4 o4Var = this.K;
        if (!z) {
            int i2 = this.F;
            o4Var.getClass();
            return o4.w(i, i2);
        }
        int b = tyVar.b(i);
        if (b != -1) {
            int i3 = this.F;
            o4Var.getClass();
            return o4.w(b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final int p0(int i, ty tyVar, zy zyVar) {
        t1();
        i1();
        return super.p0(i, tyVar, zyVar);
    }

    public final int p1(int i, ty tyVar, zy zyVar) {
        boolean z = zyVar.g;
        o4 o4Var = this.K;
        if (!z) {
            int i2 = this.F;
            o4Var.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b = tyVar.b(i);
        if (b != -1) {
            int i4 = this.F;
            o4Var.getClass();
            return b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int q1(int i, ty tyVar, zy zyVar) {
        boolean z = zyVar.g;
        o4 o4Var = this.K;
        if (!z) {
            o4Var.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (tyVar.b(i) != -1) {
            o4Var.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final oy r() {
        return this.p == 0 ? new fm(-2, -1) : new fm(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.ny
    public final int r0(int i, ty tyVar, zy zyVar) {
        t1();
        i1();
        return super.r0(i, tyVar, zyVar);
    }

    public final void r1(View view, int i, boolean z) {
        int i2;
        int i3;
        fm fmVar = (fm) view.getLayoutParams();
        Rect rect = fmVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) fmVar).topMargin + ((ViewGroup.MarginLayoutParams) fmVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) fmVar).leftMargin + ((ViewGroup.MarginLayoutParams) fmVar).rightMargin;
        int n1 = n1(fmVar.e, fmVar.f);
        if (this.p == 1) {
            i3 = ny.w(false, n1, i, i5, ((ViewGroup.MarginLayoutParams) fmVar).width);
            i2 = ny.w(true, this.r.l(), this.m, i4, ((ViewGroup.MarginLayoutParams) fmVar).height);
        } else {
            int w = ny.w(false, n1, i, i4, ((ViewGroup.MarginLayoutParams) fmVar).height);
            int w2 = ny.w(true, this.r.l(), this.l, i5, ((ViewGroup.MarginLayoutParams) fmVar).width);
            i2 = w;
            i3 = w2;
        }
        oy oyVar = (oy) view.getLayoutParams();
        if (z ? z0(view, i3, i2, oyVar) : x0(view, i3, i2, oyVar)) {
            view.measure(i3, i2);
        }
    }

    @Override // defpackage.ny
    public final oy s(Context context, AttributeSet attributeSet) {
        fm fmVar = new fm(context, attributeSet);
        fmVar.e = -1;
        fmVar.f = 0;
        return fmVar;
    }

    public final void s1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            l8.l(n20.e("Span count should be at least 1. Provided ", i));
            return;
        }
        this.F = i;
        this.K.x();
        o0();
    }

    @Override // defpackage.ny
    public final oy t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            fm fmVar = new fm((ViewGroup.MarginLayoutParams) layoutParams);
            fmVar.e = -1;
            fmVar.f = 0;
            return fmVar;
        }
        fm fmVar2 = new fm(layoutParams);
        fmVar2.e = -1;
        fmVar2.f = 0;
        return fmVar2;
    }

    public final void t1() {
        int C;
        int F;
        if (this.p == 1) {
            C = this.n - E();
            F = D();
        } else {
            C = this.o - C();
            F = F();
        }
        h1(C - F);
    }

    @Override // defpackage.ny
    public final void u0(Rect rect, int i, int i2) {
        int g;
        int g2;
        if (this.G == null) {
            super.u0(rect, i, i2);
        }
        int E = E() + D();
        int C = C() + F();
        if (this.p == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = f80.a;
            g2 = ny.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            g = ny.g(i, iArr[iArr.length - 1] + E, this.b.getMinimumWidth());
        } else {
            int width = rect.width() + E;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = f80.a;
            g = ny.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            g2 = ny.g(i2, iArr2[iArr2.length - 1] + C, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(g, g2);
    }

    @Override // defpackage.ny
    public final int x(ty tyVar, zy zyVar) {
        if (this.p == 1) {
            return Math.min(this.F, B());
        }
        if (zyVar.b() < 1) {
            return 0;
        }
        return o1(zyVar.b() - 1, tyVar, zyVar) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new o4(18);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(i);
    }

    public GridLayoutManager() {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new o4(18);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        s1(3);
    }
}

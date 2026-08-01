package androidx.recyclerview.widget;

import B.j;
import K.S;
import L.i;
import X.V;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import f0.C0109m;
import f0.C0112p;
import f0.C0114s;
import f0.C0115t;
import f0.I;
import f0.J;
import f0.O;
import f0.U;
import f0.r;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1388E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f1389G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f1390H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1391I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1392J;

    /* renamed from: K, reason: collision with root package name */
    public final j f1393K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1394L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1388E = false;
        this.F = -1;
        this.f1391I = new SparseIntArray();
        this.f1392J = new SparseIntArray();
        this.f1393K = new j(10);
        this.f1394L = new Rect();
        l1(I.I(context, attributeSet, i, i2).f1961b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(U u2, C0115t c0115t, C0109m c0109m) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = c0115t.d) >= 0 && i < u2.b() && i2 > 0; i3++) {
            c0109m.a(c0115t.d, Math.max(0, c0115t.f2166g));
            this.f1393K.getClass();
            i2--;
            c0115t.d += c0115t.f2164e;
        }
    }

    @Override // f0.I
    public final int J(O o2, U u2) {
        if (this.f1399p == 0) {
            return this.F;
        }
        if (u2.b() < 1) {
            return 0;
        }
        return h1(u2.b() - 1, o2, u2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(O o2, U u2, int i, int i2, int i3) {
        G0();
        int k2 = this.f1401r.k();
        int g2 = this.f1401r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View u3 = u(i);
            int H2 = I.H(u3);
            if (H2 >= 0 && H2 < i3 && i1(H2, o2, u2) == 0) {
                if (((J) u3.getLayoutParams()).f1975a.i()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f1401r.e(u3) < g2 && this.f1401r.b(u3) >= k2) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0103, code lost:
    
        if (r13 == (r2 > r8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0022, code lost:
    
        if (((java.util.ArrayList) r22.f1963a.d).contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, O o2, U u2) {
        View A2;
        int v2;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        O o3 = o2;
        U u3 = u2;
        RecyclerView recyclerView = this.f1964b;
        View view4 = null;
        if (recyclerView != null) {
            A2 = recyclerView.A(view);
            if (A2 != null) {
            }
        }
        A2 = null;
        if (A2 == null) {
            return null;
        }
        C0112p c0112p = (C0112p) A2.getLayoutParams();
        int i5 = c0112p.f2146e;
        int i6 = c0112p.f2147f + i5;
        if (super.S(view, i, o2, u2) == null) {
            return null;
        }
        if ((F0(i) == 1) != this.f1404u) {
            i3 = v() - 1;
            v2 = -1;
            i2 = -1;
        } else {
            v2 = v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f1399p == 1 && S0();
        int h1 = h1(i3, o3, u3);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != v2) {
            int i13 = v2;
            int h12 = h1(i12, o3, u3);
            View u4 = u(i12);
            if (u4 == A2) {
                break;
            }
            if (!u4.hasFocusable() || h12 == h1) {
                C0112p c0112p2 = (C0112p) u4.getLayoutParams();
                int i14 = c0112p2.f2146e;
                view2 = A2;
                int i15 = c0112p2.f2147f + i14;
                if (u4.hasFocusable() && i14 == i5 && i15 == i6) {
                    return u4;
                }
                if (!(u4.hasFocusable() && view4 == null) && (u4.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i6) - Math.max(i14, i5);
                    if (u4.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i10;
                        if (!this.f1965c.x(u4) || !this.d.x(u4)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (u4.hasFocusable()) {
                                int i16 = c0112p2.f2146e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = u4;
                            } else {
                                int i17 = c0112p2.f2146e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = u4;
                            }
                            i12 += i9;
                            o3 = o2;
                            u3 = u2;
                            v2 = i13;
                            A2 = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        o3 = o2;
                        u3 = u2;
                        v2 = i13;
                        A2 = view2;
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                if (u4.hasFocusable()) {
                }
                i12 += i9;
                o3 = o2;
                u3 = u2;
                v2 = i13;
                A2 = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = A2;
                view3 = view5;
            }
            i4 = i10;
            i10 = i4;
            view5 = view3;
            i12 += i9;
            o3 = o2;
            u3 = u2;
            v2 = i13;
            A2 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f2159b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(O o2, U u2, C0115t c0115t, C0114s c0114s) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int w2;
        int i8;
        ?? r8;
        int i9;
        View b2;
        int j2 = this.f1401r.j();
        boolean z2 = j2 != 1073741824;
        int i10 = v() > 0 ? this.f1389G[this.F] : 0;
        if (z2) {
            m1();
        }
        boolean z3 = c0115t.f2164e == 1;
        int i11 = this.F;
        if (!z3) {
            i11 = i1(c0115t.d, o2, u2) + j1(c0115t.d, o2, u2);
        }
        int i12 = 0;
        while (i12 < this.F && (i9 = c0115t.d) >= 0 && i9 < u2.b() && i11 > 0) {
            int i13 = c0115t.d;
            int j12 = j1(i13, o2, u2);
            if (j12 > this.F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + j12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i11 -= j12;
            if (i11 < 0 || (b2 = c0115t.b(o2)) == null) {
                break;
            }
            this.f1390H[i12] = b2;
            i12++;
        }
        if (z3) {
            i3 = 1;
            i2 = i12;
            i = 0;
        } else {
            i = i12 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i14 = 0;
        while (i != i2) {
            View view = this.f1390H[i];
            C0112p c0112p = (C0112p) view.getLayoutParams();
            int j13 = j1(I.H(view), o2, u2);
            c0112p.f2147f = j13;
            c0112p.f2146e = i14;
            i14 += j13;
            i += i3;
        }
        float f2 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f1390H[i16];
            if (c0115t.f2168k != null) {
                r8 = 0;
                r8 = 0;
                if (z3) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z3) {
                r8 = 0;
                b(view2, -1, false);
            } else {
                r8 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f1964b;
            Rect rect = this.f1394L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, j2, r8);
            int c2 = this.f1401r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d = (this.f1401r.d(view2) * 1.0f) / ((C0112p) view2.getLayoutParams()).f2147f;
            if (d > f2) {
                f2 = d;
            }
        }
        if (z2) {
            e1(Math.max(Math.round(f2 * this.F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f1390H[i17];
                k1(view3, 1073741824, true);
                int c3 = this.f1401r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f1390H[i18];
            if (this.f1401r.c(view4) != i15) {
                C0112p c0112p2 = (C0112p) view4.getLayoutParams();
                Rect rect2 = c0112p2.f1976b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0112p2).topMargin + ((ViewGroup.MarginLayoutParams) c0112p2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0112p2).leftMargin + ((ViewGroup.MarginLayoutParams) c0112p2).rightMargin;
                int g12 = g1(c0112p2.f2146e, c0112p2.f2147f);
                if (this.f1399p == 1) {
                    i8 = I.w(false, g12, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c0112p2).width);
                    w2 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    w2 = I.w(false, g12, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c0112p2).height);
                    i8 = makeMeasureSpec;
                }
                if (w0(view4, i8, w2, (J) view4.getLayoutParams())) {
                    view4.measure(i8, w2);
                }
            }
        }
        c0114s.f2158a = i15;
        if (this.f1399p != 1) {
            if (c0115t.f2165f == -1) {
                int i21 = c0115t.f2162b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0115t.f2162b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0115t.f2165f == -1) {
            int i23 = c0115t.f2162b;
            i5 = 0;
            i4 = 0;
            i7 = i23 - i15;
            i6 = i23;
        } else {
            i7 = c0115t.f2162b;
            i6 = i7 + i15;
            i5 = 0;
            i4 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f1390H[i24];
            C0112p c0112p3 = (C0112p) view5.getLayoutParams();
            if (this.f1399p != 1) {
                int G2 = G() + this.f1389G[c0112p3.f2146e];
                i7 = G2;
                i6 = this.f1401r.d(view5) + G2;
            } else if (S0()) {
                int E2 = E() + this.f1389G[this.F - c0112p3.f2146e];
                i4 = E2;
                i5 = E2 - this.f1401r.d(view5);
            } else {
                i5 = E() + this.f1389G[c0112p3.f2146e];
                i4 = this.f1401r.d(view5) + i5;
            }
            I.N(view5, i5, i7, i4, i6);
            if (c0112p3.f1975a.i() || c0112p3.f1975a.l()) {
                c0114s.f2160c = true;
            }
            c0114s.d = view5.hasFocusable() | c0114s.d;
        }
        Arrays.fill(this.f1390H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(O o2, U u2, r rVar, int i) {
        m1();
        if (u2.b() > 0 && !u2.f2001g) {
            boolean z2 = i == 1;
            int i12 = i1(rVar.f2155b, o2, u2);
            if (z2) {
                while (i12 > 0) {
                    int i2 = rVar.f2155b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    rVar.f2155b = i3;
                    i12 = i1(i3, o2, u2);
                }
            } else {
                int b2 = u2.b() - 1;
                int i4 = rVar.f2155b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int i13 = i1(i5, o2, u2);
                    if (i13 <= i12) {
                        break;
                    }
                    i4 = i5;
                    i12 = i13;
                }
                rVar.f2155b = i4;
            }
        }
        f1();
    }

    @Override // f0.I
    public final void V(O o2, U u2, View view, L.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0112p)) {
            U(view, jVar);
            return;
        }
        C0112p c0112p = (C0112p) layoutParams;
        int h1 = h1(c0112p.f1975a.b(), o2, u2);
        if (this.f1399p == 0) {
            jVar.h(i.a(false, c0112p.f2146e, c0112p.f2147f, h1, 1));
        } else {
            jVar.h(i.a(false, h1, 1, c0112p.f2146e, c0112p.f2147f));
        }
    }

    @Override // f0.I
    public final void W(int i, int i2) {
        j jVar = this.f1393K;
        jVar.w();
        ((SparseIntArray) jVar.f29c).clear();
    }

    @Override // f0.I
    public final void X() {
        j jVar = this.f1393K;
        jVar.w();
        ((SparseIntArray) jVar.f29c).clear();
    }

    @Override // f0.I
    public final void Y(int i, int i2) {
        j jVar = this.f1393K;
        jVar.w();
        ((SparseIntArray) jVar.f29c).clear();
    }

    @Override // f0.I
    public final void Z(int i, int i2) {
        j jVar = this.f1393K;
        jVar.w();
        ((SparseIntArray) jVar.f29c).clear();
    }

    @Override // f0.I
    public final void a0(int i, int i2) {
        j jVar = this.f1393K;
        jVar.w();
        ((SparseIntArray) jVar.f29c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final void b0(O o2, U u2) {
        boolean z2 = u2.f2001g;
        SparseIntArray sparseIntArray = this.f1392J;
        SparseIntArray sparseIntArray2 = this.f1391I;
        if (z2) {
            int v2 = v();
            for (int i = 0; i < v2; i++) {
                C0112p c0112p = (C0112p) u(i).getLayoutParams();
                int b2 = c0112p.f1975a.b();
                sparseIntArray2.put(b2, c0112p.f2147f);
                sparseIntArray.put(b2, c0112p.f2146e);
            }
        }
        super.b0(o2, u2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final void c0(U u2) {
        super.c0(u2);
        this.f1388E = false;
    }

    public final void e1(int i) {
        int i2;
        int[] iArr = this.f1389G;
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
        this.f1389G = iArr;
    }

    @Override // f0.I
    public final boolean f(J j2) {
        return j2 instanceof C0112p;
    }

    public final void f1() {
        View[] viewArr = this.f1390H;
        if (viewArr == null || viewArr.length != this.F) {
            this.f1390H = new View[this.F];
        }
    }

    public final int g1(int i, int i2) {
        if (this.f1399p != 1 || !S0()) {
            int[] iArr = this.f1389G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1389G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int h1(int i, O o2, U u2) {
        boolean z2 = u2.f2001g;
        j jVar = this.f1393K;
        if (!z2) {
            int i2 = this.F;
            jVar.getClass();
            return j.v(i, i2);
        }
        int b2 = o2.b(i);
        if (b2 != -1) {
            int i3 = this.F;
            jVar.getClass();
            return j.v(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int i1(int i, O o2, U u2) {
        boolean z2 = u2.f2001g;
        j jVar = this.f1393K;
        if (!z2) {
            int i2 = this.F;
            jVar.getClass();
            return i % i2;
        }
        int i3 = this.f1392J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = o2.b(i);
        if (b2 != -1) {
            int i4 = this.F;
            jVar.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int j1(int i, O o2, U u2) {
        boolean z2 = u2.f2001g;
        j jVar = this.f1393K;
        if (!z2) {
            jVar.getClass();
            return 1;
        }
        int i2 = this.f1391I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (o2.b(i) != -1) {
            jVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final int k(U u2) {
        return D0(u2);
    }

    public final void k1(View view, int i, boolean z2) {
        int i2;
        int i3;
        C0112p c0112p = (C0112p) view.getLayoutParams();
        Rect rect = c0112p.f1976b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0112p).topMargin + ((ViewGroup.MarginLayoutParams) c0112p).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0112p).leftMargin + ((ViewGroup.MarginLayoutParams) c0112p).rightMargin;
        int g12 = g1(c0112p.f2146e, c0112p.f2147f);
        if (this.f1399p == 1) {
            i3 = I.w(false, g12, i, i5, ((ViewGroup.MarginLayoutParams) c0112p).width);
            i2 = I.w(true, this.f1401r.l(), this.f1972m, i4, ((ViewGroup.MarginLayoutParams) c0112p).height);
        } else {
            int w2 = I.w(false, g12, i, i4, ((ViewGroup.MarginLayoutParams) c0112p).height);
            int w3 = I.w(true, this.f1401r.l(), this.f1971l, i5, ((ViewGroup.MarginLayoutParams) c0112p).width);
            i2 = w2;
            i3 = w3;
        }
        J j2 = (J) view.getLayoutParams();
        if (z2 ? w0(view, i3, i2, j2) : u0(view, i3, i2, j2)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final int l(U u2) {
        return E0(u2);
    }

    public final void l1(int i) {
        if (i == this.F) {
            return;
        }
        this.f1388E = true;
        if (i < 1) {
            throw new IllegalArgumentException(V.d("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.f1393K.w();
        l0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final int m0(int i, O o2, U u2) {
        m1();
        f1();
        return super.m0(i, o2, u2);
    }

    public final void m1() {
        int D2;
        int G2;
        if (this.f1399p == 1) {
            D2 = this.f1973n - F();
            G2 = E();
        } else {
            D2 = this.f1974o - D();
            G2 = G();
        }
        e1(D2 - G2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final int n(U u2) {
        return D0(u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final int o(U u2) {
        return E0(u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final int o0(int i, O o2, U u2) {
        m1();
        f1();
        return super.o0(i, o2, u2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final J r() {
        return this.f1399p == 0 ? new C0112p(-2, -1) : new C0112p(-1, -2);
    }

    @Override // f0.I
    public final void r0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.f1389G == null) {
            super.r0(rect, i, i2);
        }
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1399p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f1964b;
            WeakHashMap weakHashMap = S.f360a;
            g3 = I.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f1389G;
            g2 = I.g(i, iArr[iArr.length - 1] + F, this.f1964b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f1964b;
            WeakHashMap weakHashMap2 = S.f360a;
            g2 = I.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1389G;
            g3 = I.g(i2, iArr2[iArr2.length - 1] + D2, this.f1964b.getMinimumHeight());
        }
        this.f1964b.setMeasuredDimension(g2, g3);
    }

    @Override // f0.I
    public final J s(Context context, AttributeSet attributeSet) {
        C0112p c0112p = new C0112p(context, attributeSet);
        c0112p.f2146e = -1;
        c0112p.f2147f = 0;
        return c0112p;
    }

    @Override // f0.I
    public final J t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0112p c0112p = new C0112p((ViewGroup.MarginLayoutParams) layoutParams);
            c0112p.f2146e = -1;
            c0112p.f2147f = 0;
            return c0112p;
        }
        C0112p c0112p2 = new C0112p(layoutParams);
        c0112p2.f2146e = -1;
        c0112p2.f2147f = 0;
        return c0112p2;
    }

    @Override // f0.I
    public final int x(O o2, U u2) {
        if (this.f1399p == 1) {
            return this.F;
        }
        if (u2.b() < 1) {
            return 0;
        }
        return h1(u2.b() - 1, o2, u2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, f0.I
    public final boolean z0() {
        return this.f1409z == null && !this.f1388E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1388E = false;
        this.F = -1;
        this.f1391I = new SparseIntArray();
        this.f1392J = new SparseIntArray();
        this.f1393K = new j(10);
        this.f1394L = new Rect();
        l1(i);
    }
}

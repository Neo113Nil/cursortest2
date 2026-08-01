package androidx.recyclerview.widget;

import B.j;
import E1.AbstractC0001b;
import K.T;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import g0.AbstractC0139I;
import g0.C0140J;
import g0.C0145O;
import g0.C0160m;
import g0.C0163p;
import g0.C0165s;
import g0.C0166t;
import g0.V;
import g0.r;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f1927E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f1928G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f1929H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f1930I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f1931J;

    /* renamed from: K, reason: collision with root package name */
    public final j f1932K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f1933L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1927E = false;
        this.F = -1;
        this.f1930I = new SparseIntArray();
        this.f1931J = new SparseIntArray();
        this.f1932K = new j(12);
        this.f1933L = new Rect();
        n1(AbstractC0139I.I(context, attributeSet, i, i2).f2775b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final boolean B0() {
        return this.f1948z == null && !this.f1927E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(V v2, C0166t c0166t, C0160m c0160m) {
        int i;
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && (i = c0166t.d) >= 0 && i < v2.b() && i2 > 0; i3++) {
            c0160m.a(c0166t.d, Math.max(0, c0166t.f2984g));
            this.f1932K.getClass();
            i2--;
            c0166t.d += c0166t.f2982e;
        }
    }

    @Override // g0.AbstractC0139I
    public final int J(C0145O c0145o, V v2) {
        if (this.f1938p == 0) {
            return this.F;
        }
        if (v2.b() < 1) {
            return 0;
        }
        return j1(v2.b() - 1, c0145o, v2) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View P0(C0145O c0145o, V v2, boolean z2, boolean z3) {
        int i;
        int i2;
        int v3 = v();
        int i3 = 1;
        if (z3) {
            i2 = v() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = v3;
            i2 = 0;
        }
        int b2 = v2.b();
        I0();
        int k2 = this.f1940r.k();
        int g2 = this.f1940r.g();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View u2 = u(i2);
            int H2 = AbstractC0139I.H(u2);
            if (H2 >= 0 && H2 < b2 && k1(H2, c0145o, v2) == 0) {
                if (((C0140J) u2.getLayoutParams()).f2789a.i()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f1940r.e(u2) < g2 && this.f1940r.b(u2) >= k2) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0101, code lost:
    
        if (r13 == (r2 > r8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0020, code lost:
    
        if (r22.f2777a.f2852c.contains(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View T(View view, int i, C0145O c0145o, V v2) {
        View D2;
        int v3;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        C0145O c0145o2 = c0145o;
        V v4 = v2;
        RecyclerView recyclerView = this.f2778b;
        View view4 = null;
        if (recyclerView != null) {
            D2 = recyclerView.D(view);
            if (D2 != null) {
            }
        }
        D2 = null;
        if (D2 == null) {
            return null;
        }
        C0163p c0163p = (C0163p) D2.getLayoutParams();
        int i5 = c0163p.f2964e;
        int i6 = c0163p.f2965f + i5;
        if (super.T(view, i, c0145o, v2) == null) {
            return null;
        }
        if ((H0(i) == 1) != this.f1943u) {
            i3 = v() - 1;
            v3 = -1;
            i2 = -1;
        } else {
            v3 = v();
            i2 = 1;
            i3 = 0;
        }
        boolean z2 = this.f1938p == 1 && U0();
        int j12 = j1(i3, c0145o2, v4);
        int i7 = -1;
        int i8 = -1;
        int i9 = i2;
        int i10 = 0;
        int i11 = 0;
        int i12 = i3;
        View view5 = null;
        while (i12 != v3) {
            int i13 = v3;
            int j13 = j1(i12, c0145o2, v4);
            View u2 = u(i12);
            if (u2 == D2) {
                break;
            }
            if (!u2.hasFocusable() || j13 == j12) {
                C0163p c0163p2 = (C0163p) u2.getLayoutParams();
                int i14 = c0163p2.f2964e;
                view2 = D2;
                int i15 = c0163p2.f2965f + i14;
                if (u2.hasFocusable() && i14 == i5 && i15 == i6) {
                    return u2;
                }
                if (!(u2.hasFocusable() && view4 == null) && (u2.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i6) - Math.max(i14, i5);
                    if (u2.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i10;
                        if (!this.f2779c.A(u2) || !this.d.A(u2)) {
                            if (min <= i11) {
                                if (min == i11) {
                                }
                            }
                            if (u2.hasFocusable()) {
                                int i16 = c0163p2.f2964e;
                                i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                i7 = i16;
                                i10 = i4;
                                view5 = u2;
                            } else {
                                int i17 = c0163p2.f2964e;
                                i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                i8 = i17;
                                view5 = view3;
                                view4 = u2;
                            }
                            i12 += i9;
                            c0145o2 = c0145o;
                            v4 = v2;
                            v3 = i13;
                            D2 = view2;
                        }
                        i10 = i4;
                        view5 = view3;
                        i12 += i9;
                        c0145o2 = c0145o;
                        v4 = v2;
                        v3 = i13;
                        D2 = view2;
                    }
                } else {
                    view3 = view5;
                }
                i4 = i10;
                if (u2.hasFocusable()) {
                }
                i12 += i9;
                c0145o2 = c0145o;
                v4 = v2;
                v3 = i13;
                D2 = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = D2;
                view3 = view5;
            }
            i4 = i10;
            i10 = i4;
            view5 = view3;
            i12 += i9;
            c0145o2 = c0145o;
            v4 = v2;
            v3 = i13;
            D2 = view2;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // g0.AbstractC0139I
    public final void V(C0145O c0145o, V v2, L.j jVar) {
        super.V(c0145o, v2, jVar);
        jVar.h(GridView.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f2977b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(C0145O c0145o, V v2, C0166t c0166t, C0165s c0165s) {
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
        int j2 = this.f1940r.j();
        boolean z2 = j2 != 1073741824;
        int i10 = v() > 0 ? this.f1928G[this.F] : 0;
        if (z2) {
            o1();
        }
        boolean z3 = c0166t.f2982e == 1;
        int i11 = this.F;
        if (!z3) {
            i11 = k1(c0166t.d, c0145o, v2) + l1(c0166t.d, c0145o, v2);
        }
        int i12 = 0;
        while (i12 < this.F && (i9 = c0166t.d) >= 0 && i9 < v2.b() && i11 > 0) {
            int i13 = c0166t.d;
            int l12 = l1(i13, c0145o, v2);
            if (l12 > this.F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + l12 + " spans but GridLayoutManager has only " + this.F + " spans.");
            }
            i11 -= l12;
            if (i11 < 0 || (b2 = c0166t.b(c0145o)) == null) {
                break;
            }
            this.f1929H[i12] = b2;
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
            View view = this.f1929H[i];
            C0163p c0163p = (C0163p) view.getLayoutParams();
            int l13 = l1(AbstractC0139I.H(view), c0145o, v2);
            c0163p.f2965f = l13;
            c0163p.f2964e = i14;
            i14 += l13;
            i += i3;
        }
        float f2 = RecyclerView.f1949A0;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f1929H[i16];
            if (c0166t.f2986k != null) {
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
            RecyclerView recyclerView = this.f2778b;
            Rect rect = this.f1933L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.M(view2));
            }
            m1(view2, j2, r8);
            int c2 = this.f1940r.c(view2);
            if (c2 > i15) {
                i15 = c2;
            }
            float d = (this.f1940r.d(view2) * 1.0f) / ((C0163p) view2.getLayoutParams()).f2965f;
            if (d > f2) {
                f2 = d;
            }
        }
        if (z2) {
            g1(Math.max(Math.round(f2 * this.F), i10));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f1929H[i17];
                m1(view3, 1073741824, true);
                int c3 = this.f1940r.c(view3);
                if (c3 > i15) {
                    i15 = c3;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f1929H[i18];
            if (this.f1940r.c(view4) != i15) {
                C0163p c0163p2 = (C0163p) view4.getLayoutParams();
                Rect rect2 = c0163p2.f2790b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0163p2).topMargin + ((ViewGroup.MarginLayoutParams) c0163p2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0163p2).leftMargin + ((ViewGroup.MarginLayoutParams) c0163p2).rightMargin;
                int i110 = i1(c0163p2.f2964e, c0163p2.f2965f);
                if (this.f1938p == 1) {
                    i8 = AbstractC0139I.w(i110, 1073741824, i20, false, ((ViewGroup.MarginLayoutParams) c0163p2).width);
                    w2 = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    w2 = AbstractC0139I.w(i110, 1073741824, i19, false, ((ViewGroup.MarginLayoutParams) c0163p2).height);
                    i8 = makeMeasureSpec;
                }
                if (y0(view4, i8, w2, (C0140J) view4.getLayoutParams())) {
                    view4.measure(i8, w2);
                }
            }
        }
        c0165s.f2976a = i15;
        if (this.f1938p != 1) {
            if (c0166t.f2983f == -1) {
                int i21 = c0166t.f2980b;
                i5 = i21 - i15;
                i4 = i21;
            } else {
                int i22 = c0166t.f2980b;
                i4 = i22 + i15;
                i5 = i22;
            }
            i6 = 0;
            i7 = 0;
        } else if (c0166t.f2983f == -1) {
            i7 = c0166t.f2980b;
            i6 = i7 - i15;
            i5 = 0;
            i4 = 0;
        } else {
            int i23 = c0166t.f2980b;
            i6 = i23;
            i4 = 0;
            i7 = i23 + i15;
            i5 = 0;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f1929H[i24];
            C0163p c0163p3 = (C0163p) view5.getLayoutParams();
            if (this.f1938p != 1) {
                i6 = G() + this.f1928G[c0163p3.f2964e];
                i7 = this.f1940r.d(view5) + i6;
            } else if (U0()) {
                int E2 = E() + this.f1928G[this.F - c0163p3.f2964e];
                i4 = E2;
                i5 = E2 - this.f1940r.d(view5);
            } else {
                i5 = E() + this.f1928G[c0163p3.f2964e];
                i4 = this.f1940r.d(view5) + i5;
            }
            AbstractC0139I.N(view5, i5, i6, i4, i7);
            if (c0163p3.f2789a.i() || c0163p3.f2789a.l()) {
                c0165s.f2978c = true;
            }
            c0165s.d = view5.hasFocusable() | c0165s.d;
        }
        Arrays.fill(this.f1929H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(C0145O c0145o, V v2, r rVar, int i) {
        o1();
        if (v2.b() > 0 && !v2.f2817g) {
            boolean z2 = i == 1;
            int k12 = k1(rVar.f2973b, c0145o, v2);
            if (z2) {
                while (k12 > 0) {
                    int i2 = rVar.f2973b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    rVar.f2973b = i3;
                    k12 = k1(i3, c0145o, v2);
                }
            } else {
                int b2 = v2.b() - 1;
                int i4 = rVar.f2973b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int k13 = k1(i5, c0145o, v2);
                    if (k13 <= k12) {
                        break;
                    }
                    i4 = i5;
                    k12 = k13;
                }
                rVar.f2973b = i4;
            }
        }
        h1();
    }

    @Override // g0.AbstractC0139I
    public final void X(C0145O c0145o, V v2, View view, L.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0163p)) {
            W(view, jVar);
            return;
        }
        C0163p c0163p = (C0163p) layoutParams;
        int j12 = j1(c0163p.f2789a.b(), c0145o, v2);
        int i = this.f1938p;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f795a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c0163p.f2964e, c0163p.f2965f, j12, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(j12, 1, c0163p.f2964e, c0163p.f2965f, false, false));
        }
    }

    @Override // g0.AbstractC0139I
    public final void Y(int i, int i2) {
        j jVar = this.f1932K;
        jVar.z();
        ((SparseIntArray) jVar.f73c).clear();
    }

    @Override // g0.AbstractC0139I
    public final void Z() {
        j jVar = this.f1932K;
        jVar.z();
        ((SparseIntArray) jVar.f73c).clear();
    }

    @Override // g0.AbstractC0139I
    public final void a0(int i, int i2) {
        j jVar = this.f1932K;
        jVar.z();
        ((SparseIntArray) jVar.f73c).clear();
    }

    @Override // g0.AbstractC0139I
    public final void b0(int i, int i2) {
        j jVar = this.f1932K;
        jVar.z();
        ((SparseIntArray) jVar.f73c).clear();
    }

    @Override // g0.AbstractC0139I
    public final void c0(int i, int i2) {
        j jVar = this.f1932K;
        jVar.z();
        ((SparseIntArray) jVar.f73c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.c1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final void d0(C0145O c0145o, V v2) {
        boolean z2 = v2.f2817g;
        SparseIntArray sparseIntArray = this.f1931J;
        SparseIntArray sparseIntArray2 = this.f1930I;
        if (z2) {
            int v3 = v();
            for (int i = 0; i < v3; i++) {
                C0163p c0163p = (C0163p) u(i).getLayoutParams();
                int b2 = c0163p.f2789a.b();
                sparseIntArray2.put(b2, c0163p.f2965f);
                sparseIntArray.put(b2, c0163p.f2964e);
            }
        }
        super.d0(c0145o, v2);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final void e0(V v2) {
        super.e0(v2);
        this.f1927E = false;
    }

    @Override // g0.AbstractC0139I
    public final boolean f(C0140J c0140j) {
        return c0140j instanceof C0163p;
    }

    public final void g1(int i) {
        int i2;
        int[] iArr = this.f1928G;
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
        this.f1928G = iArr;
    }

    public final void h1() {
        View[] viewArr = this.f1929H;
        if (viewArr == null || viewArr.length != this.F) {
            this.f1929H = new View[this.F];
        }
    }

    public final int i1(int i, int i2) {
        if (this.f1938p != 1 || !U0()) {
            int[] iArr = this.f1928G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1928G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int j1(int i, C0145O c0145o, V v2) {
        boolean z2 = v2.f2817g;
        j jVar = this.f1932K;
        if (!z2) {
            int i2 = this.F;
            jVar.getClass();
            return j.y(i, i2);
        }
        int b2 = c0145o.b(i);
        if (b2 != -1) {
            int i3 = this.F;
            jVar.getClass();
            return j.y(b2, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final int k(V v2) {
        return F0(v2);
    }

    public final int k1(int i, C0145O c0145o, V v2) {
        boolean z2 = v2.f2817g;
        j jVar = this.f1932K;
        if (!z2) {
            int i2 = this.F;
            jVar.getClass();
            return i % i2;
        }
        int i3 = this.f1931J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = c0145o.b(i);
        if (b2 != -1) {
            int i4 = this.F;
            jVar.getClass();
            return b2 % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final int l(V v2) {
        return G0(v2);
    }

    public final int l1(int i, C0145O c0145o, V v2) {
        boolean z2 = v2.f2817g;
        j jVar = this.f1932K;
        if (!z2) {
            jVar.getClass();
            return 1;
        }
        int i2 = this.f1930I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0145o.b(i) != -1) {
            jVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public final void m1(View view, int i, boolean z2) {
        int i2;
        int i3;
        C0163p c0163p = (C0163p) view.getLayoutParams();
        Rect rect = c0163p.f2790b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0163p).topMargin + ((ViewGroup.MarginLayoutParams) c0163p).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0163p).leftMargin + ((ViewGroup.MarginLayoutParams) c0163p).rightMargin;
        int i12 = i1(c0163p.f2964e, c0163p.f2965f);
        if (this.f1938p == 1) {
            i3 = AbstractC0139I.w(i12, i, i5, false, ((ViewGroup.MarginLayoutParams) c0163p).width);
            i2 = AbstractC0139I.w(this.f1940r.l(), this.f2786m, i4, true, ((ViewGroup.MarginLayoutParams) c0163p).height);
        } else {
            int w2 = AbstractC0139I.w(i12, i, i4, false, ((ViewGroup.MarginLayoutParams) c0163p).height);
            int w3 = AbstractC0139I.w(this.f1940r.l(), this.f2785l, i5, true, ((ViewGroup.MarginLayoutParams) c0163p).width);
            i2 = w2;
            i3 = w3;
        }
        C0140J c0140j = (C0140J) view.getLayoutParams();
        if (z2 ? y0(view, i3, i2, c0140j) : w0(view, i3, i2, c0140j)) {
            view.measure(i3, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final int n(V v2) {
        return F0(v2);
    }

    public final void n1(int i) {
        if (i == this.F) {
            return;
        }
        this.f1927E = true;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0001b.f("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.f1932K.z();
        n0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final int o(V v2) {
        return G0(v2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final int o0(int i, C0145O c0145o, V v2) {
        o1();
        h1();
        return super.o0(i, c0145o, v2);
    }

    public final void o1() {
        int D2;
        int G2;
        if (this.f1938p == 1) {
            D2 = this.f2787n - F();
            G2 = E();
        } else {
            D2 = this.f2788o - D();
            G2 = G();
        }
        g1(D2 - G2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final int q0(int i, C0145O c0145o, V v2) {
        o1();
        h1();
        return super.q0(i, c0145o, v2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, g0.AbstractC0139I
    public final C0140J r() {
        return this.f1938p == 0 ? new C0163p(-2, -1) : new C0163p(-1, -2);
    }

    @Override // g0.AbstractC0139I
    public final C0140J s(Context context, AttributeSet attributeSet) {
        C0163p c0163p = new C0163p(context, attributeSet);
        c0163p.f2964e = -1;
        c0163p.f2965f = 0;
        return c0163p;
    }

    @Override // g0.AbstractC0139I
    public final C0140J t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0163p c0163p = new C0163p((ViewGroup.MarginLayoutParams) layoutParams);
            c0163p.f2964e = -1;
            c0163p.f2965f = 0;
            return c0163p;
        }
        C0163p c0163p2 = new C0163p(layoutParams);
        c0163p2.f2964e = -1;
        c0163p2.f2965f = 0;
        return c0163p2;
    }

    @Override // g0.AbstractC0139I
    public final void t0(Rect rect, int i, int i2) {
        int g2;
        int g3;
        if (this.f1928G == null) {
            super.t0(rect, i, i2);
        }
        int F = F() + E();
        int D2 = D() + G();
        if (this.f1938p == 1) {
            int height = rect.height() + D2;
            RecyclerView recyclerView = this.f2778b;
            WeakHashMap weakHashMap = T.f633a;
            g3 = AbstractC0139I.g(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f1928G;
            g2 = AbstractC0139I.g(i, iArr[iArr.length - 1] + F, this.f2778b.getMinimumWidth());
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f2778b;
            WeakHashMap weakHashMap2 = T.f633a;
            g2 = AbstractC0139I.g(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f1928G;
            g3 = AbstractC0139I.g(i2, iArr2[iArr2.length - 1] + D2, this.f2778b.getMinimumHeight());
        }
        this.f2778b.setMeasuredDimension(g2, g3);
    }

    @Override // g0.AbstractC0139I
    public final int x(C0145O c0145o, V v2) {
        if (this.f1938p == 1) {
            return this.F;
        }
        if (v2.b() < 1) {
            return 0;
        }
        return j1(v2.b() - 1, c0145o, v2) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1927E = false;
        this.F = -1;
        this.f1930I = new SparseIntArray();
        this.f1931J = new SparseIntArray();
        this.f1932K = new j(12);
        this.f1933L = new Rect();
        n1(i);
    }
}

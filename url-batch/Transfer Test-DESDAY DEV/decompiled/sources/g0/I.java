package g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import f0.AbstractC0091a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public C0114c f2339a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2340b;

    /* renamed from: c, reason: collision with root package name */
    public final B.j f2341c;
    public final B.j d;

    /* renamed from: e, reason: collision with root package name */
    public C0133w f2342e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2343f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2344g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f2345j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2346k;

    /* renamed from: l, reason: collision with root package name */
    public int f2347l;

    /* renamed from: m, reason: collision with root package name */
    public int f2348m;

    /* renamed from: n, reason: collision with root package name */
    public int f2349n;

    /* renamed from: o, reason: collision with root package name */
    public int f2350o;

    public I() {
        G g2 = new G(this, 0);
        G g3 = new G(this, 1);
        this.f2341c = new B.j(g2);
        this.d = new B.j(g3);
        this.f2343f = false;
        this.f2344g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((J) view.getLayoutParams()).f2352b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((J) view.getLayoutParams()).f2351a.b();
    }

    public static H I(Context context, AttributeSet attributeSet, int i, int i2) {
        H h = new H();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0091a.f2160a, i, i2);
        h.f2336a = obtainStyledAttributes.getInt(0, 1);
        h.f2337b = obtainStyledAttributes.getInt(10, 1);
        h.f2338c = obtainStyledAttributes.getBoolean(9, false);
        h.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return h;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        J j2 = (J) view.getLayoutParams();
        Rect rect = j2.f2352b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) j2).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) j2).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) j2).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) j2).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(boolean z2, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z2) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i4 = max;
                            i2 = Integer.MIN_VALUE;
                        } else {
                            i4 = max;
                            i2 = 0;
                        }
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int z(View view) {
        Rect rect = ((J) view.getLayoutParams()).f2352b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final void A0(C0133w c0133w) {
        C0133w c0133w2 = this.f2342e;
        if (c0133w2 != null && c0133w != c0133w2 && c0133w2.f2558e) {
            c0133w2.i();
        }
        this.f2342e = c0133w;
        RecyclerView recyclerView = this.f2340b;
        Y y2 = recyclerView.f1603b0;
        y2.f2390g.removeCallbacks(y2);
        y2.f2387c.abortAnimation();
        if (c0133w.h) {
            Log.w("RecyclerView", "An instance of " + c0133w.getClass().getSimpleName() + " was started more than once. Each instance of" + c0133w.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0133w.f2556b = recyclerView;
        c0133w.f2557c = this;
        int i = c0133w.f2555a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1608e0.f2374a = i;
        c0133w.f2558e = true;
        c0133w.d = true;
        c0133w.f2559f = recyclerView.f1621m.q(i);
        c0133w.f2556b.f1603b0.b();
        c0133w.h = true;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2340b;
        AbstractC0109A adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2340b;
        WeakHashMap weakHashMap = K.T.f372a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(O o2, V v2) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((J) view.getLayoutParams()).f2352b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2340b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2340b.f1617k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1609f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1609f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1609f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1609f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, O o2, V v2);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2340b;
        O o2 = recyclerView.f1604c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2340b.canScrollVertically(-1) && !this.f2340b.canScrollHorizontally(-1) && !this.f2340b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0109A abstractC0109A = this.f2340b.f1619l;
        if (abstractC0109A != null) {
            accessibilityEvent.setItemCount(abstractC0109A.a());
        }
    }

    public void V(O o2, V v2, L.k kVar) {
        boolean canScrollVertically = this.f2340b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f482a;
        if (canScrollVertically || this.f2340b.canScrollHorizontally(-1)) {
            kVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f2340b.canScrollVertically(1) || this.f2340b.canScrollHorizontally(1)) {
            kVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(o2, v2), x(o2, v2), false, 0));
    }

    public final void W(View view, L.k kVar) {
        Z L2 = RecyclerView.L(view);
        if (L2 == null || L2.i() || this.f2339a.f2417c.contains(L2.f2392a)) {
            return;
        }
        RecyclerView recyclerView = this.f2340b;
        X(recyclerView.f1604c, recyclerView.f1608e0, view, kVar);
    }

    public void X(O o2, V v2, View view, L.k kVar) {
    }

    public void Y(int i, int i2) {
    }

    public void Z() {
    }

    public void a0(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i, boolean z2) {
        int b2;
        Z L2 = RecyclerView.L(view);
        if (z2 || L2.i()) {
            o.k kVar = (o.k) this.f2340b.f1611g.f56b;
            j0 j0Var = (j0) kVar.getOrDefault(L2, null);
            if (j0Var == null) {
                j0Var = j0.a();
                kVar.put(L2, j0Var);
            }
            j0Var.f2483a |= 1;
        } else {
            this.f2340b.f1611g.I(L2);
        }
        J j2 = (J) view.getLayoutParams();
        if (L2.q() || L2.j()) {
            if (L2.j()) {
                L2.f2402n.l(L2);
            } else {
                L2.f2398j &= -33;
            }
            this.f2339a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2340b) {
                C0114c c0114c = this.f2339a;
                int indexOfChild = c0114c.f2415a.f2571a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0113b c0113b = c0114c.f2416b;
                    if (!c0113b.d(indexOfChild)) {
                        b2 = indexOfChild - c0113b.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2339a.e();
                        }
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb.append(this.f2340b.indexOfChild(view));
                            throw new IllegalStateException(Y.V.e(this.f2340b, sb));
                        }
                        if (b2 != i) {
                            I i2 = this.f2340b.f1621m;
                            View u2 = i2.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + i2.f2340b.toString());
                            }
                            i2.u(b2);
                            i2.f2339a.c(b2);
                            J j3 = (J) u2.getLayoutParams();
                            Z L3 = RecyclerView.L(u2);
                            if (L3.i()) {
                                o.k kVar2 = (o.k) i2.f2340b.f1611g.f56b;
                                j0 j0Var2 = (j0) kVar2.getOrDefault(L3, null);
                                if (j0Var2 == null) {
                                    j0Var2 = j0.a();
                                    kVar2.put(L3, j0Var2);
                                }
                                j0Var2.f2483a = 1 | j0Var2.f2483a;
                            } else {
                                i2.f2340b.f1611g.I(L3);
                            }
                            i2.f2339a.b(u2, i, j3, L3.i());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2339a.a(view, i, false);
                j2.f2353c = true;
                C0133w c0133w = this.f2342e;
                if (c0133w != null && c0133w.f2558e) {
                    c0133w.f2556b.getClass();
                    Z L4 = RecyclerView.L(view);
                    if ((L4 != null ? L4.b() : -1) == c0133w.f2555a) {
                        c0133w.f2559f = view;
                        if (RecyclerView.f1576y0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (j2.d) {
            if (RecyclerView.f1576y0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + j2.f2351a);
            }
            L2.f2392a.invalidate();
            j2.d = false;
        }
    }

    public void b0(int i, int i2) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i2) {
    }

    public abstract boolean d();

    public abstract void d0(O o2, V v2);

    public abstract boolean e();

    public abstract void e0(V v2);

    public boolean f(J j2) {
        return j2 != null;
    }

    public void f0(Parcelable parcelable) {
    }

    public Parcelable g0() {
        return null;
    }

    public void h(int i, int i2, V v2, C0125n c0125n) {
    }

    public void h0(int i) {
    }

    public void i(int i, C0125n c0125n) {
    }

    public final void i0(O o2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.L(u(v2)).p()) {
                View u2 = u(v2);
                l0(v2);
                o2.h(u2);
            }
        }
    }

    public abstract int j(V v2);

    public final void j0(O o2) {
        ArrayList arrayList;
        int size = o2.f2360a.size();
        int i = size - 1;
        while (true) {
            arrayList = o2.f2360a;
            if (i < 0) {
                break;
            }
            View view = ((Z) arrayList.get(i)).f2392a;
            Z L2 = RecyclerView.L(view);
            if (!L2.p()) {
                L2.o(false);
                if (L2.k()) {
                    this.f2340b.removeDetachedView(view, false);
                }
                E e2 = this.f2340b.f1586J;
                if (e2 != null) {
                    e2.d(L2);
                }
                L2.o(true);
                Z L3 = RecyclerView.L(view);
                L3.f2402n = null;
                L3.f2403o = false;
                L3.f2398j &= -33;
                o2.i(L3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = o2.f2361b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2340b.invalidate();
        }
    }

    public abstract int k(V v2);

    public final void k0(View view, O o2) {
        C0114c c0114c = this.f2339a;
        C0136z c0136z = c0114c.f2415a;
        int i = c0114c.d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0114c.d = 1;
            c0114c.f2418e = view;
            int indexOfChild = c0136z.f2571a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c0114c.f2416b.f(indexOfChild)) {
                    c0114c.j(view);
                }
                c0136z.h(indexOfChild);
            }
            c0114c.d = 0;
            c0114c.f2418e = null;
            o2.h(view);
        } catch (Throwable th) {
            c0114c.d = 0;
            c0114c.f2418e = null;
            throw th;
        }
    }

    public abstract int l(V v2);

    public final void l0(int i) {
        if (u(i) != null) {
            C0114c c0114c = this.f2339a;
            C0136z c0136z = c0114c.f2415a;
            int i2 = c0114c.d;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int f2 = c0114c.f(i);
                View childAt = c0136z.f2571a.getChildAt(f2);
                if (childAt != null) {
                    c0114c.d = 1;
                    c0114c.f2418e = childAt;
                    if (c0114c.f2416b.f(f2)) {
                        c0114c.j(childAt);
                    }
                    c0136z.h(f2);
                }
            } finally {
                c0114c.d = 0;
                c0114c.f2418e = null;
            }
        }
    }

    public abstract int m(V v2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int E2 = E();
        int G2 = G();
        int F = this.f2349n - F();
        int D2 = this.f2350o - D();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - E2;
        int min = Math.min(0, i);
        int i2 = top - G2;
        int min2 = Math.min(0, i2);
        int i3 = width - F;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - D2);
        if (C() != 1) {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i3);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        int[] iArr = {max, min2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int E3 = E();
                int G3 = G();
                int F2 = this.f2349n - F();
                int D3 = this.f2350o - D();
                Rect rect2 = this.f2340b.i;
                y(focusedChild, rect2);
                if (rect2.left - i4 < F2) {
                    if (rect2.right - i4 > E3) {
                        if (rect2.top - i5 < D3) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z2) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.g0(i4, i5, false);
            }
            return true;
        }
        return false;
    }

    public abstract int n(V v2);

    public final void n0() {
        RecyclerView recyclerView = this.f2340b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o(V v2);

    public abstract int o0(int i, O o2, V v2);

    public final void p(O o2) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            Z L2 = RecyclerView.L(u2);
            if (L2.p()) {
                if (RecyclerView.f1576y0) {
                    Log.d("RecyclerView", "ignoring view " + L2);
                }
            } else if (!L2.g() || L2.i() || this.f2340b.f1619l.f2327b) {
                u(v2);
                this.f2339a.c(v2);
                o2.j(u2);
                this.f2340b.f1611g.I(L2);
            } else {
                l0(v2);
                o2.i(L2);
            }
        }
    }

    public abstract void p0(int i);

    public View q(int i) {
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            Z L2 = RecyclerView.L(u2);
            if (L2 != null && L2.b() == i && !L2.p() && (this.f2340b.f1608e0.f2379g || !L2.i())) {
                return u2;
            }
        }
        return null;
    }

    public abstract int q0(int i, O o2, V v2);

    public abstract J r();

    public final void r0(RecyclerView recyclerView) {
        s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public J s(Context context, AttributeSet attributeSet) {
        return new J(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        this.f2349n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2347l = mode;
        if (mode == 0 && !RecyclerView.f1571B0) {
            this.f2349n = 0;
        }
        this.f2350o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2348m = mode2;
        if (mode2 != 0 || RecyclerView.f1571B0) {
            return;
        }
        this.f2350o = 0;
    }

    public J t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof J ? new J((J) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new J((ViewGroup.MarginLayoutParams) layoutParams) : new J(layoutParams);
    }

    public void t0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2340b;
        WeakHashMap weakHashMap = K.T.f372a;
        this.f2340b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D2, this.f2340b.getMinimumHeight()));
    }

    public final View u(int i) {
        C0114c c0114c = this.f2339a;
        if (c0114c != null) {
            return c0114c.d(i);
        }
        return null;
    }

    public final void u0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2340b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2340b.i;
            y(u2, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f2340b.i.set(i6, i4, i3, i5);
        t0(this.f2340b.i, i, i2);
    }

    public final int v() {
        C0114c c0114c = this.f2339a;
        if (c0114c != null) {
            return c0114c.e();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2340b = null;
            this.f2339a = null;
            this.f2349n = 0;
            this.f2350o = 0;
        } else {
            this.f2340b = recyclerView;
            this.f2339a = recyclerView.f1609f;
            this.f2349n = recyclerView.getWidth();
            this.f2350o = recyclerView.getHeight();
        }
        this.f2347l = 1073741824;
        this.f2348m = 1073741824;
    }

    public final boolean w0(View view, int i, int i2, J j2) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) j2).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) j2).height)) ? false : true;
    }

    public int x(O o2, V v2) {
        return -1;
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        boolean z2 = RecyclerView.f1575x0;
        J j2 = (J) view.getLayoutParams();
        Rect rect2 = j2.f2352b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) j2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) j2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) j2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) j2).bottomMargin);
    }

    public final boolean y0(View view, int i, int i2, J j2) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) j2).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) j2).height)) ? false : true;
    }

    public abstract void z0(RecyclerView recyclerView, int i);
}

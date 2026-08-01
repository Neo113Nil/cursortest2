package g0;

import E1.AbstractC0001b;
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
import f0.AbstractC0112a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0139I {

    /* renamed from: a, reason: collision with root package name */
    public C0149b f2777a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2778b;

    /* renamed from: c, reason: collision with root package name */
    public final B.j f2779c;
    public final B.j d;

    /* renamed from: e, reason: collision with root package name */
    public C0168v f2780e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2781f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2782g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f2783j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2784k;

    /* renamed from: l, reason: collision with root package name */
    public int f2785l;

    /* renamed from: m, reason: collision with root package name */
    public int f2786m;

    /* renamed from: n, reason: collision with root package name */
    public int f2787n;

    /* renamed from: o, reason: collision with root package name */
    public int f2788o;

    public AbstractC0139I() {
        C0137G c0137g = new C0137G(this, 0);
        C0137G c0137g2 = new C0137G(this, 1);
        this.f2779c = new B.j(c0137g);
        this.d = new B.j(c0137g2);
        this.f2781f = false;
        this.f2782g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((C0140J) view.getLayoutParams()).f2790b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((C0140J) view.getLayoutParams()).f2789a.b();
    }

    public static C0138H I(Context context, AttributeSet attributeSet, int i, int i2) {
        C0138H c0138h = new C0138H();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0112a.f2582a, i, i2);
        c0138h.f2774a = obtainStyledAttributes.getInt(0, 1);
        c0138h.f2775b = obtainStyledAttributes.getInt(10, 1);
        c0138h.f2776c = obtainStyledAttributes.getBoolean(9, false);
        c0138h.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c0138h;
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
        C0140J c0140j = (C0140J) view.getLayoutParams();
        Rect rect = c0140j.f2790b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c0140j).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0140j).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c0140j).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0140j).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(int i, int i2, int i3, boolean z2, int i4) {
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
        Rect rect = ((C0140J) view.getLayoutParams()).f2790b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final void A0(C0168v c0168v) {
        C0168v c0168v2 = this.f2780e;
        if (c0168v2 != null && c0168v != c0168v2 && c0168v2.f2994e) {
            c0168v2.i();
        }
        this.f2780e = c0168v;
        RecyclerView recyclerView = this.f2778b;
        Y y2 = recyclerView.f1982b0;
        y2.f2828g.removeCallbacks(y2);
        y2.f2825c.abortAnimation();
        if (c0168v.h) {
            Log.w("RecyclerView", "An instance of " + c0168v.getClass().getSimpleName() + " was started more than once. Each instance of" + c0168v.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0168v.f2992b = recyclerView;
        c0168v.f2993c = this;
        int i = c0168v.f2991a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1987e0.f2812a = i;
        c0168v.f2994e = true;
        c0168v.d = true;
        c0168v.f2995f = recyclerView.f2000m.q(i);
        c0168v.f2992b.f1982b0.b();
        c0168v.h = true;
    }

    public final int B() {
        RecyclerView recyclerView = this.f2778b;
        AbstractC0131A adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.f2778b;
        WeakHashMap weakHashMap = K.T.f633a;
        return recyclerView.getLayoutDirection();
    }

    public final int D() {
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(C0145O c0145o, V v2) {
        return -1;
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C0140J) view.getLayoutParams()).f2790b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f2778b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f2778b.f1996k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i) {
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1988f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1988f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView != null) {
            int e2 = recyclerView.f1988f.e();
            for (int i2 = 0; i2 < e2; i2++) {
                recyclerView.f1988f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, C0145O c0145o, V v2);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f2778b;
        C0145O c0145o = recyclerView.f1983c;
        V v2 = recyclerView.f1987e0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f2778b.canScrollVertically(-1) && !this.f2778b.canScrollHorizontally(-1) && !this.f2778b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        AbstractC0131A abstractC0131A = this.f2778b.f1998l;
        if (abstractC0131A != null) {
            accessibilityEvent.setItemCount(abstractC0131A.a());
        }
    }

    public void V(C0145O c0145o, V v2, L.j jVar) {
        boolean canScrollVertically = this.f2778b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f795a;
        if (canScrollVertically || this.f2778b.canScrollHorizontally(-1)) {
            jVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f2778b.canScrollVertically(1) || this.f2778b.canScrollHorizontally(1)) {
            jVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(J(c0145o, v2), x(c0145o, v2), false, 0));
    }

    public final void W(View view, L.j jVar) {
        Z L2 = RecyclerView.L(view);
        if (L2 == null || L2.i() || this.f2777a.f2852c.contains(L2.f2830a)) {
            return;
        }
        RecyclerView recyclerView = this.f2778b;
        X(recyclerView.f1983c, recyclerView.f1987e0, view, jVar);
    }

    public void X(C0145O c0145o, V v2, View view, L.j jVar) {
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
            o.k kVar = (o.k) this.f2778b.f1990g.f72b;
            j0 j0Var = (j0) kVar.getOrDefault(L2, null);
            if (j0Var == null) {
                j0Var = j0.a();
                kVar.put(L2, j0Var);
            }
            j0Var.f2920a |= 1;
        } else {
            this.f2778b.f1990g.K(L2);
        }
        C0140J c0140j = (C0140J) view.getLayoutParams();
        if (L2.q() || L2.j()) {
            if (L2.j()) {
                L2.f2840n.l(L2);
            } else {
                L2.f2836j &= -33;
            }
            this.f2777a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f2778b) {
                C0149b c0149b = this.f2777a;
                int indexOfChild = c0149b.f2850a.f3009a.indexOfChild(view);
                if (indexOfChild != -1) {
                    D1.a aVar = c0149b.f2851b;
                    if (!aVar.d(indexOfChild)) {
                        b2 = indexOfChild - aVar.b(indexOfChild);
                        if (i == -1) {
                            i = this.f2777a.e();
                        }
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                            sb.append(this.f2778b.indexOfChild(view));
                            throw new IllegalStateException(AbstractC0001b.e(this.f2778b, sb));
                        }
                        if (b2 != i) {
                            AbstractC0139I abstractC0139I = this.f2778b.f2000m;
                            View u2 = abstractC0139I.u(b2);
                            if (u2 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + abstractC0139I.f2778b.toString());
                            }
                            abstractC0139I.u(b2);
                            abstractC0139I.f2777a.c(b2);
                            C0140J c0140j2 = (C0140J) u2.getLayoutParams();
                            Z L3 = RecyclerView.L(u2);
                            if (L3.i()) {
                                o.k kVar2 = (o.k) abstractC0139I.f2778b.f1990g.f72b;
                                j0 j0Var2 = (j0) kVar2.getOrDefault(L3, null);
                                if (j0Var2 == null) {
                                    j0Var2 = j0.a();
                                    kVar2.put(L3, j0Var2);
                                }
                                j0Var2.f2920a = 1 | j0Var2.f2920a;
                            } else {
                                abstractC0139I.f2778b.f1990g.K(L3);
                            }
                            abstractC0139I.f2777a.b(u2, i, c0140j2, L3.i());
                        }
                    }
                }
                b2 = -1;
                if (i == -1) {
                }
                if (b2 != -1) {
                }
            } else {
                this.f2777a.a(view, i, false);
                c0140j.f2791c = true;
                C0168v c0168v = this.f2780e;
                if (c0168v != null && c0168v.f2994e) {
                    c0168v.f2992b.getClass();
                    Z L4 = RecyclerView.L(view);
                    if ((L4 != null ? L4.b() : -1) == c0168v.f2991a) {
                        c0168v.f2995f = view;
                        if (RecyclerView.f1955y0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (c0140j.d) {
            if (RecyclerView.f1955y0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + c0140j.f2789a);
            }
            L2.f2830a.invalidate();
            c0140j.d = false;
        }
    }

    public void b0(int i, int i2) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i2) {
    }

    public abstract boolean d();

    public abstract void d0(C0145O c0145o, V v2);

    public abstract boolean e();

    public abstract void e0(V v2);

    public boolean f(C0140J c0140j) {
        return c0140j != null;
    }

    public void f0(Parcelable parcelable) {
    }

    public Parcelable g0() {
        return null;
    }

    public void h(int i, int i2, V v2, C0160m c0160m) {
    }

    public void h0(int i) {
    }

    public void i(int i, C0160m c0160m) {
    }

    public final void i0(C0145O c0145o) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            if (!RecyclerView.L(u(v2)).p()) {
                View u2 = u(v2);
                l0(v2);
                c0145o.h(u2);
            }
        }
    }

    public abstract int j(V v2);

    public final void j0(C0145O c0145o) {
        ArrayList arrayList;
        int size = c0145o.f2798a.size();
        int i = size - 1;
        while (true) {
            arrayList = c0145o.f2798a;
            if (i < 0) {
                break;
            }
            View view = ((Z) arrayList.get(i)).f2830a;
            Z L2 = RecyclerView.L(view);
            if (!L2.p()) {
                L2.o(false);
                if (L2.k()) {
                    this.f2778b.removeDetachedView(view, false);
                }
                AbstractC0135E abstractC0135E = this.f2778b.f1965J;
                if (abstractC0135E != null) {
                    abstractC0135E.d(L2);
                }
                L2.o(true);
                Z L3 = RecyclerView.L(view);
                L3.f2840n = null;
                L3.f2841o = false;
                L3.f2836j &= -33;
                c0145o.i(L3);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0145o.f2799b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f2778b.invalidate();
        }
    }

    public abstract int k(V v2);

    public final void k0(View view, C0145O c0145o) {
        C0149b c0149b = this.f2777a;
        C0172z c0172z = c0149b.f2850a;
        int i = c0149b.d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            c0149b.d = 1;
            c0149b.f2853e = view;
            int indexOfChild = c0172z.f3009a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c0149b.f2851b.g(indexOfChild)) {
                    c0149b.j(view);
                }
                c0172z.h(indexOfChild);
            }
            c0149b.d = 0;
            c0149b.f2853e = null;
            c0145o.h(view);
        } catch (Throwable th) {
            c0149b.d = 0;
            c0149b.f2853e = null;
            throw th;
        }
    }

    public abstract int l(V v2);

    public final void l0(int i) {
        if (u(i) != null) {
            C0149b c0149b = this.f2777a;
            C0172z c0172z = c0149b.f2850a;
            int i2 = c0149b.d;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int f2 = c0149b.f(i);
                View childAt = c0172z.f3009a.getChildAt(f2);
                if (childAt != null) {
                    c0149b.d = 1;
                    c0149b.f2853e = childAt;
                    if (c0149b.f2851b.g(f2)) {
                        c0149b.j(childAt);
                    }
                    c0172z.h(f2);
                }
            } finally {
                c0149b.d = 0;
                c0149b.f2853e = null;
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
        int F = this.f2787n - F();
        int D2 = this.f2788o - D();
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
                int F2 = this.f2787n - F();
                int D3 = this.f2788o - D();
                Rect rect2 = this.f2778b.i;
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
        RecyclerView recyclerView = this.f2778b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o(V v2);

    public abstract int o0(int i, C0145O c0145o, V v2);

    public final void p(C0145O c0145o) {
        for (int v2 = v() - 1; v2 >= 0; v2--) {
            View u2 = u(v2);
            Z L2 = RecyclerView.L(u2);
            if (L2.p()) {
                if (RecyclerView.f1955y0) {
                    Log.d("RecyclerView", "ignoring view " + L2);
                }
            } else if (!L2.g() || L2.i() || this.f2778b.f1998l.f2765b) {
                u(v2);
                this.f2777a.c(v2);
                c0145o.j(u2);
                this.f2778b.f1990g.K(L2);
            } else {
                l0(v2);
                c0145o.i(L2);
            }
        }
    }

    public abstract void p0(int i);

    public View q(int i) {
        int v2 = v();
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = u(i2);
            Z L2 = RecyclerView.L(u2);
            if (L2 != null && L2.b() == i && !L2.p() && (this.f2778b.f1987e0.f2817g || !L2.i())) {
                return u2;
            }
        }
        return null;
    }

    public abstract int q0(int i, C0145O c0145o, V v2);

    public abstract C0140J r();

    public final void r0(RecyclerView recyclerView) {
        s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public C0140J s(Context context, AttributeSet attributeSet) {
        return new C0140J(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        this.f2787n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f2785l = mode;
        if (mode == 0 && !RecyclerView.f1950B0) {
            this.f2787n = 0;
        }
        this.f2788o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.f2786m = mode2;
        if (mode2 != 0 || RecyclerView.f1950B0) {
            return;
        }
        this.f2788o = 0;
    }

    public C0140J t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0140J ? new C0140J((C0140J) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0140J((ViewGroup.MarginLayoutParams) layoutParams) : new C0140J(layoutParams);
    }

    public void t0(Rect rect, int i, int i2) {
        int F = F() + E() + rect.width();
        int D2 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f2778b;
        WeakHashMap weakHashMap = K.T.f633a;
        this.f2778b.setMeasuredDimension(g(i, F, recyclerView.getMinimumWidth()), g(i2, D2, this.f2778b.getMinimumHeight()));
    }

    public final View u(int i) {
        C0149b c0149b = this.f2777a;
        if (c0149b != null) {
            return c0149b.d(i);
        }
        return null;
    }

    public final void u0(int i, int i2) {
        int v2 = v();
        if (v2 == 0) {
            this.f2778b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v2; i7++) {
            View u2 = u(i7);
            Rect rect = this.f2778b.i;
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
        this.f2778b.i.set(i6, i4, i3, i5);
        t0(this.f2778b.i, i, i2);
    }

    public final int v() {
        C0149b c0149b = this.f2777a;
        if (c0149b != null) {
            return c0149b.e();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f2778b = null;
            this.f2777a = null;
            this.f2787n = 0;
            this.f2788o = 0;
        } else {
            this.f2778b = recyclerView;
            this.f2777a = recyclerView.f1988f;
            this.f2787n = recyclerView.getWidth();
            this.f2788o = recyclerView.getHeight();
        }
        this.f2785l = 1073741824;
        this.f2786m = 1073741824;
    }

    public final boolean w0(View view, int i, int i2, C0140J c0140j) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c0140j).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c0140j).height)) ? false : true;
    }

    public int x(C0145O c0145o, V v2) {
        return -1;
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        boolean z2 = RecyclerView.f1954x0;
        C0140J c0140j = (C0140J) view.getLayoutParams();
        Rect rect2 = c0140j.f2790b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0140j).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0140j).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0140j).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0140j).bottomMargin);
    }

    public final boolean y0(View view, int i, int i2, C0140J c0140j) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c0140j).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c0140j).height)) ? false : true;
    }

    public abstract void z0(RecyclerView recyclerView, int i);
}

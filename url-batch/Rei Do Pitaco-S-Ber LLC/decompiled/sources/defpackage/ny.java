package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class ny {
    public v9 a;
    public RecyclerView b;
    public final o4 c;
    public final o4 d;
    public up e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public ny() {
        ly lyVar = new ly(this, 0);
        ly lyVar2 = new ly(this, 1);
        this.c = new o4(lyVar);
        this.d = new o4(lyVar2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((oy) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((oy) view.getLayoutParams()).a.b();
    }

    public static my H(Context context, AttributeSet attributeSet, int i, int i2) {
        my myVar = new my();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ix.a, i, i2);
        myVar.a = obtainStyledAttributes.getInt(0, 1);
        myVar.b = obtainStyledAttributes.getInt(10, 1);
        myVar.c = obtainStyledAttributes.getBoolean(9, false);
        myVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return myVar;
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
        oy oyVar = (oy) view.getLayoutParams();
        Rect rect = oyVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) oyVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) oyVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) oyVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) oyVar).bottomMargin);
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
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z) {
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
        Rect rect = ((oy) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i);

    public final int B() {
        RecyclerView recyclerView = this.b;
        ey adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void B0(up upVar) {
        up upVar2 = this.e;
        if (upVar2 != null && upVar != upVar2 && upVar2.e) {
            upVar2.i();
        }
        this.e = upVar;
        RecyclerView recyclerView = this.b;
        cz czVar = recyclerView.i0;
        czVar.l.removeCallbacks(czVar);
        czVar.h.abortAnimation();
        if (upVar.h) {
            Log.w("RecyclerView", "An instance of " + upVar.getClass().getSimpleName() + " was started more than once. Each instance of" + upVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        upVar.b = recyclerView;
        upVar.c = this;
        int i = upVar.a;
        if (i == -1) {
            l8.l("Invalid target position");
            return;
        }
        recyclerView.l0.a = i;
        upVar.e = true;
        upVar.d = true;
        upVar.f = recyclerView.s.q(i);
        upVar.b.i0.b();
        upVar.h = true;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(ty tyVar, zy zyVar) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.r == null || !e()) {
            return 1;
        }
        return this.b.r.a();
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((oy) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public boolean L() {
        return false;
    }

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int e = recyclerView.k.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.k.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int e = recyclerView.k.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.k.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, ty tyVar, zy zyVar);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        ty tyVar = recyclerView.h;
        zy zyVar = recyclerView.l0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        ey eyVar = this.b.r;
        if (eyVar != null) {
            accessibilityEvent.setItemCount(eyVar.a());
        }
    }

    public void V(ty tyVar, zy zyVar, k0 k0Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            k0Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
            k0Var.g(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            k0Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
            k0Var.g(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(tyVar, zyVar), x(tyVar, zyVar), false, 0));
    }

    public void W(ty tyVar, zy zyVar, View view, k0 k0Var) {
        k0Var.i(j0.D(false, e() ? G(view) : 0, 1, d() ? G(view) : 0, 1));
    }

    public final void X(View view, k0 k0Var) {
        dz M = RecyclerView.M(view);
        if (M == null || M.h()) {
            return;
        }
        v9 v9Var = this.a;
        if (v9Var.c.contains(M.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        W(recyclerView.h, recyclerView.l0, view, k0Var);
    }

    public final void b(View view, int i, boolean z) {
        dz M = RecyclerView.M(view);
        if (z || M.h()) {
            e20 e20Var = (e20) this.b.l.g;
            n80 n80Var = (n80) e20Var.get(M);
            if (n80Var == null) {
                n80Var = n80.a();
                e20Var.put(M, n80Var);
            }
            n80Var.a |= 1;
        } else {
            this.b.l.K(M);
        }
        oy oyVar = (oy) view.getLayoutParams();
        if (M.p() || M.i()) {
            if (M.i()) {
                M.n.m(M);
            } else {
                M.j &= -33;
            }
            this.a.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            v9 v9Var = this.a;
            if (parent == recyclerView) {
                u9 u9Var = v9Var.b;
                int indexOfChild = v9Var.a.f.indexOfChild(view);
                int b = (indexOfChild == -1 || u9Var.d(indexOfChild)) ? -1 : indexOfChild - u9Var.b(indexOfChild);
                if (i == -1) {
                    i = this.a.e();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.B());
                }
                if (b != i) {
                    ny nyVar = this.b.s;
                    View u = nyVar.u(b);
                    if (u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + nyVar.b.toString());
                    }
                    nyVar.u(b);
                    nyVar.a.c(b);
                    oy oyVar2 = (oy) u.getLayoutParams();
                    dz M2 = RecyclerView.M(u);
                    boolean h = M2.h();
                    RecyclerView recyclerView2 = nyVar.b;
                    if (h) {
                        e20 e20Var2 = (e20) recyclerView2.l.g;
                        n80 n80Var2 = (n80) e20Var2.get(M2);
                        if (n80Var2 == null) {
                            n80Var2 = n80.a();
                            e20Var2.put(M2, n80Var2);
                        }
                        n80Var2.a = 1 | n80Var2.a;
                    } else {
                        recyclerView2.l.K(M2);
                    }
                    nyVar.a.b(u, i, oyVar2, M2.h());
                }
            } else {
                v9Var.a(view, i, false);
                oyVar.c = true;
                up upVar = this.e;
                if (upVar != null && upVar.e) {
                    upVar.b.getClass();
                    dz M3 = RecyclerView.M(view);
                    if ((M3 != null ? M3.b() : -1) == upVar.a) {
                        upVar.f = view;
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (oyVar.d) {
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + oyVar.a);
            }
            M.a.invalidate();
            oyVar.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(ty tyVar, zy zyVar);

    public abstract boolean e();

    public abstract void e0(zy zyVar);

    public boolean f(oy oyVar) {
        return oyVar != null;
    }

    public Parcelable g0() {
        return null;
    }

    public boolean i0(int i, Bundle bundle) {
        int F;
        int D;
        float f;
        ty tyVar = this.b.h;
        int i2 = this.o;
        int i3 = this.n;
        Rect rect = new Rect();
        if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            F = this.b.canScrollVertically(1) ? (i2 - F()) - C() : 0;
            if (this.b.canScrollHorizontally(1)) {
                D = (i3 - D()) - E();
            }
            D = 0;
        } else if (i != 8192) {
            F = 0;
            D = 0;
        } else {
            F = this.b.canScrollVertically(-1) ? -((i2 - F()) - C()) : 0;
            if (this.b.canScrollHorizontally(-1)) {
                D = -((i3 - D()) - E());
            }
            D = 0;
        }
        if (F != 0 || D != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (RecyclerView.G0) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    D = (int) (D * f);
                    F = (int) (F * f);
                }
                this.b.i0(D, F, true);
                return true;
            }
            RecyclerView recyclerView = this.b;
            ey eyVar = recyclerView.r;
            if (eyVar != null) {
                if (i == 4096) {
                    recyclerView.j0(eyVar.a() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                recyclerView.j0(0);
                return true;
            }
        }
        return false;
    }

    public abstract int j(zy zyVar);

    public final void j0(ty tyVar) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.M(u(v)).o()) {
                View u = u(v);
                m0(v);
                tyVar.i(u);
            }
        }
    }

    public abstract int k(zy zyVar);

    public final void k0(ty tyVar) {
        ArrayList arrayList;
        int size = tyVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = tyVar.a;
            if (i < 0) {
                break;
            }
            View view = ((dz) arrayList.get(i)).a;
            dz M = RecyclerView.M(view);
            if (!M.o()) {
                M.n(false);
                if (M.j()) {
                    this.b.removeDetachedView(view, false);
                }
                jy jyVar = this.b.Q;
                if (jyVar != null) {
                    jyVar.d(M);
                }
                M.n(true);
                dz M2 = RecyclerView.M(view);
                M2.n = null;
                M2.o = false;
                M2.j &= -33;
                tyVar.j(M2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = tyVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int l(zy zyVar);

    public final void l0(View view, ty tyVar) {
        v9 v9Var = this.a;
        dy dyVar = v9Var.a;
        int i = v9Var.d;
        if (i == 1) {
            l8.u("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            l8.u("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            v9Var.d = 1;
            v9Var.e = view;
            int indexOfChild = dyVar.f.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (v9Var.b.g(indexOfChild)) {
                    v9Var.j(view);
                }
                dyVar.h(indexOfChild);
            }
            v9Var.d = 0;
            v9Var.e = null;
            tyVar.i(view);
        } catch (Throwable th) {
            v9Var.d = 0;
            v9Var.e = null;
            throw th;
        }
    }

    public abstract int m(zy zyVar);

    public final void m0(int i) {
        if (u(i) != null) {
            v9 v9Var = this.a;
            dy dyVar = v9Var.a;
            int i2 = v9Var.d;
            if (i2 == 1) {
                l8.u("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                l8.u("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int f = v9Var.f(i);
                View childAt = dyVar.f.getChildAt(f);
                if (childAt == null) {
                    v9Var.d = 0;
                    v9Var.e = null;
                    return;
                }
                v9Var.d = 1;
                v9Var.e = childAt;
                if (v9Var.b.g(f)) {
                    v9Var.j(childAt);
                }
                dyVar.h(f);
                v9Var.d = 0;
                v9Var.e = null;
            } catch (Throwable th) {
                v9Var.d = 0;
                v9Var.e = null;
                throw th;
            }
        }
    }

    public abstract int n(zy zyVar);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int D = D();
        int F = F();
        int E = this.n - E();
        int C = this.o - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - D;
        int min = Math.min(0, i);
        int i2 = top - F;
        int min2 = Math.min(0, i2);
        int i3 = width - E;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - C);
        if (this.b.getLayoutDirection() != 1) {
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
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int D2 = D();
                int F2 = F();
                int E2 = this.n - E();
                int C2 = this.o - C();
                Rect rect2 = this.b.o;
                y(focusedChild, rect2);
                if (rect2.left - i4 < E2) {
                    if (rect2.right - i4 > D2) {
                        if (rect2.top - i5 < C2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.i0(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract int o(zy zyVar);

    public final void o0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(ty tyVar) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            dz M = RecyclerView.M(u);
            if (M.o()) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "ignoring view " + M);
                }
            } else if (!M.f() || M.h() || this.b.r.b) {
                u(v);
                this.a.c(v);
                tyVar.k(u);
                this.b.l.K(M);
            } else {
                m0(v);
                tyVar.j(M);
            }
        }
    }

    public abstract int p0(int i, ty tyVar, zy zyVar);

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            dz M = RecyclerView.M(u);
            if (M != null && M.b() == i && !M.o() && (this.b.l0.g || !M.h())) {
                return u;
            }
        }
        return null;
    }

    public abstract void q0(int i);

    public abstract oy r();

    public abstract int r0(int i, ty tyVar, zy zyVar);

    public oy s(Context context, AttributeSet attributeSet) {
        return new oy(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public oy t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof oy ? new oy((oy) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new oy((ViewGroup.MarginLayoutParams) layoutParams) : new oy(layoutParams);
    }

    public final void t0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.K0) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.K0) {
            return;
        }
        this.o = 0;
    }

    public final View u(int i) {
        v9 v9Var = this.a;
        if (v9Var != null) {
            return v9Var.d(i);
        }
        return null;
    }

    public void u0(Rect rect, int i, int i2) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = f80.a;
        this.b.setMeasuredDimension(g(i, E, recyclerView.getMinimumWidth()), g(i2, C, this.b.getMinimumHeight()));
    }

    public final int v() {
        v9 v9Var = this.a;
        if (v9Var != null) {
            return v9Var.e();
        }
        return 0;
    }

    public final void v0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.b.o;
            y(u, rect);
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
        this.b.o.set(i6, i4, i3, i5);
        u0(this.b.o, i, i2);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.k;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public int x(ty tyVar, zy zyVar) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.r == null || !d()) {
            return 1;
        }
        return this.b.r.a();
    }

    public final boolean x0(View view, int i, int i2, oy oyVar) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) oyVar).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) oyVar).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        boolean z = RecyclerView.G0;
        oy oyVar = (oy) view.getLayoutParams();
        Rect rect2 = oyVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) oyVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) oyVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) oyVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oyVar).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i, int i2, oy oyVar) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) oyVar).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) oyVar).height)) ? false : true;
    }

    public void R(RecyclerView recyclerView) {
    }

    public void f0(Parcelable parcelable) {
    }

    public void h0(int i) {
    }

    public void Q() {
    }

    public void Z() {
    }

    public void Y(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void c0(int i, int i2) {
    }

    public void i(int i, am amVar) {
    }

    public void h(int i, int i2, zy zyVar, am amVar) {
    }
}

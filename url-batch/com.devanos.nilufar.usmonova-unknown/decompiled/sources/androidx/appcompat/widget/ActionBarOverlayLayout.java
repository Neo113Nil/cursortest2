package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.devanos.nilufar.usmonova.R;
import java.util.WeakHashMap;
import o.AZ;
import o.AbstractC1637oZ;
import o.AbstractC1769qZ;
import o.C0644Ys;
import o.C1010f10;
import o.C1108gW;
import o.C1142h10;
import o.C1183hf;
import o.C1337k1;
import o.C1535n1;
import o.C1601o1;
import o.C1682pE;
import o.C2128w1;
import o.EB;
import o.InterfaceC1469m1;
import o.InterfaceC1550nE;
import o.InterfaceC1616oE;
import o.InterfaceC1644og;
import o.InterfaceC1710pg;
import o.InterfaceC2075vC;
import o.MenuC0825cC;
import o.P00;
import o.RunnableC1403l1;
import o.W00;
import o.X00;
import o.Y00;
import o.YV;
import o.Z00;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1644og, InterfaceC1550nE, InterfaceC1616oE {
    public static final int[] J = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final C1142h10 K;
    public static final Rect L;
    public C1142h10 A;
    public InterfaceC1469m1 B;
    public OverScroller C;
    public ViewPropertyAnimator D;
    public final C1337k1 E;
    public final RunnableC1403l1 F;
    public final RunnableC1403l1 G;
    public final C1682pE H;
    public final C1601o1 I;
    public int h;
    public int i;
    public ContentFrameLayout j;
    public ActionBarContainer k;
    public InterfaceC1710pg l;
    public Drawable m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public final Rect t;
    public final Rect u;
    public final Rect v;
    public final Rect w;
    public C1142h10 x;
    public C1142h10 y;
    public C1142h10 z;

    static {
        int i = Build.VERSION.SDK_INT;
        Z00 y00 = i >= 30 ? new Y00() : i >= 29 ? new X00() : new W00();
        y00.d(C0644Ys.a(0, 1, 0, 1));
        K = y00.b();
        L = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C1142h10 c1142h10 = C1142h10.b;
        this.x = c1142h10;
        this.y = c1142h10;
        this.z = c1142h10;
        this.A = c1142h10;
        this.E = new C1337k1(this);
        this.F = new RunnableC1403l1(this, 0);
        this.G = new RunnableC1403l1(this, 1);
        i(context);
        this.H = new C1682pE();
        C1601o1 c1601o1 = new C1601o1(context);
        c1601o1.setWillNotDraw(true);
        this.I = c1601o1;
        addView(c1601o1);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        C1535n1 c1535n1 = (C1535n1) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1535n1).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c1535n1).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c1535n1).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c1535n1).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c1535n1).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c1535n1).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c1535n1).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c1535n1).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // o.InterfaceC1550nE
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // o.InterfaceC1550nE
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // o.InterfaceC1616oE
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1535n1;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.m != null) {
            if (this.k.getVisibility() == 0) {
                i = (int) (this.k.getTranslationY() + this.k.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.m.setBounds(0, i, getWidth(), this.m.getIntrinsicHeight() + i);
            this.m.draw(canvas);
        }
    }

    @Override // o.InterfaceC1550nE
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    @Override // o.InterfaceC1550nE
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1535n1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1535n1(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.k;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1682pE c1682pE = this.H;
        return c1682pE.b | c1682pE.a;
    }

    public CharSequence getTitle() {
        k();
        return ((C1108gW) this.l).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.F);
        removeCallbacks(this.G);
        ViewPropertyAnimator viewPropertyAnimator = this.D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.m = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.C = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((C1108gW) this.l).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C1108gW) this.l).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC1710pg wrapper;
        if (this.j == null) {
            this.j = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.k = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1710pg) {
                wrapper = (InterfaceC1710pg) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.l = wrapper;
        }
    }

    public final void l(Menu menu, InterfaceC2075vC interfaceC2075vC) {
        k();
        C1108gW c1108gW = (C1108gW) this.l;
        Toolbar toolbar = c1108gW.a;
        if (c1108gW.m == null) {
            c1108gW.m = new C2128w1(toolbar.getContext());
        }
        C2128w1 c2128w1 = c1108gW.m;
        c2128w1.l = interfaceC2075vC;
        MenuC0825cC menuC0825cC = (MenuC0825cC) menu;
        if (menuC0825cC == null && toolbar.h == null) {
            return;
        }
        toolbar.f();
        MenuC0825cC menuC0825cC2 = toolbar.h.w;
        if (menuC0825cC2 == menuC0825cC) {
            return;
        }
        if (menuC0825cC2 != null) {
            menuC0825cC2.r(toolbar.S);
            menuC0825cC2.r(toolbar.T);
        }
        if (toolbar.T == null) {
            toolbar.T = new YV(toolbar);
        }
        c2128w1.x = true;
        if (menuC0825cC != null) {
            menuC0825cC.b(c2128w1, toolbar.q);
            menuC0825cC.b(toolbar.T, toolbar.q);
        } else {
            c2128w1.h(toolbar.q, null);
            toolbar.T.h(toolbar.q, null);
            c2128w1.c();
            toolbar.T.c();
        }
        toolbar.h.setPopupTheme(toolbar.r);
        toolbar.h.setPresenter(c2128w1);
        toolbar.S = c2128w1;
        toolbar.v();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        C1142h10 c = C1142h10.c(windowInsets, this);
        C1010f10 c1010f10 = c.a;
        boolean g = g(this.k, new Rect(c1010f10.i().a, c1010f10.i().b, c1010f10.i().c, c1010f10.i().d), false);
        WeakHashMap weakHashMap = AZ.a;
        Rect rect = this.t;
        AbstractC1769qZ.b(this, c, rect);
        C1142h10 k = c1010f10.k(rect.left, rect.top, rect.right, rect.bottom);
        this.x = k;
        boolean z = true;
        if (!this.y.equals(k)) {
            this.y = this.x;
            g = true;
        }
        Rect rect2 = this.u;
        if (rect2.equals(rect)) {
            z = g;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c1010f10.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = AZ.a;
        AbstractC1637oZ.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1535n1 c1535n1 = (C1535n1) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c1535n1).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c1535n1).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.k, i, 0, i2, 0);
        C1535n1 c1535n1 = (C1535n1) this.k.getLayoutParams();
        int max = Math.max(0, this.k.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1535n1).leftMargin + ((ViewGroup.MarginLayoutParams) c1535n1).rightMargin);
        int max2 = Math.max(0, this.k.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1535n1).topMargin + ((ViewGroup.MarginLayoutParams) c1535n1).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.k.getMeasuredState());
        WeakHashMap weakHashMap = AZ.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.h;
            if (this.f4o && this.k.getTabContainer() != null) {
                measuredHeight += this.h;
            }
        } else {
            measuredHeight = this.k.getVisibility() != 8 ? this.k.getMeasuredHeight() : 0;
        }
        Rect rect = this.t;
        Rect rect2 = this.v;
        rect2.set(rect);
        this.z = this.x;
        if (!this.n && !z) {
            C1601o1 c1601o1 = this.I;
            C1142h10 c1142h10 = K;
            Rect rect3 = this.w;
            AbstractC1769qZ.b(c1601o1, c1142h10, rect3);
            if (!rect3.equals(L)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.z = this.z.a.k(0, measuredHeight, 0, 0);
                g(this.j, rect2, true);
                if (!this.A.equals(this.z)) {
                    C1142h10 c1142h102 = this.z;
                    this.A = c1142h102;
                    ContentFrameLayout contentFrameLayout = this.j;
                    WindowInsets b = c1142h102.b();
                    if (b != null) {
                        WindowInsets a = AbstractC1637oZ.a(contentFrameLayout, b);
                        if (!a.equals(b)) {
                            C1142h10.c(a, contentFrameLayout);
                        }
                    }
                }
                measureChildWithMargins(this.j, i, 0, i2, 0);
                C1535n1 c1535n12 = (C1535n1) this.j.getLayoutParams();
                int max3 = Math.max(max, this.j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1535n12).leftMargin + ((ViewGroup.MarginLayoutParams) c1535n12).rightMargin);
                int max4 = Math.max(max2, this.j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1535n12).topMargin + ((ViewGroup.MarginLayoutParams) c1535n12).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.j.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        C0644Ys a2 = C0644Ys.a(this.z.a.i().a, this.z.a.i().b + measuredHeight, this.z.a.i().c, this.z.a.i().d);
        C1142h10 c1142h103 = this.z;
        int i3 = Build.VERSION.SDK_INT;
        Z00 y00 = i3 >= 30 ? new Y00(c1142h103) : i3 >= 29 ? new X00(c1142h103) : new W00(c1142h103);
        y00.d(a2);
        this.z = y00.b();
        g(this.j, rect2, true);
        if (!this.A.equals(this.z)) {
        }
        measureChildWithMargins(this.j, i, 0, i2, 0);
        C1535n1 c1535n122 = (C1535n1) this.j.getLayoutParams();
        int max32 = Math.max(max, this.j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1535n122).leftMargin + ((ViewGroup.MarginLayoutParams) c1535n122).rightMargin);
        int max42 = Math.max(max2, this.j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1535n122).topMargin + ((ViewGroup.MarginLayoutParams) c1535n122).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.C.getFinalY() > this.k.getHeight()) {
            h();
            this.G.run();
        } else {
            h();
            this.F.run();
        }
        this.q = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.r + i2;
        this.r = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        P00 p00;
        C1183hf c1183hf;
        this.H.a = i;
        this.r = getActionBarHideOffset();
        h();
        InterfaceC1469m1 interfaceC1469m1 = this.B;
        if (interfaceC1469m1 == null || (c1183hf = (p00 = (P00) interfaceC1469m1).s) == null) {
            return;
        }
        c1183hf.a();
        p00.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.k.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.q) {
            return;
        }
        if (this.r <= this.k.getHeight()) {
            h();
            postDelayed(this.F, 600L);
        } else {
            h();
            postDelayed(this.G, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.s ^ i;
        this.s = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC1469m1 interfaceC1469m1 = this.B;
        if (interfaceC1469m1 != null) {
            P00 p00 = (P00) interfaceC1469m1;
            p00.f80o = !z2;
            if (z || !z2) {
                if (p00.p) {
                    p00.p = false;
                    p00.s(true);
                }
            } else if (!p00.p) {
                p00.p = true;
                p00.s(true);
            }
        }
        if ((i2 & 256) == 0 || this.B == null) {
            return;
        }
        WeakHashMap weakHashMap = AZ.a;
        AbstractC1637oZ.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.i = i;
        InterfaceC1469m1 interfaceC1469m1 = this.B;
        if (interfaceC1469m1 != null) {
            ((P00) interfaceC1469m1).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.k.setTranslationY(-Math.max(0, Math.min(i, this.k.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1469m1 interfaceC1469m1) {
        this.B = interfaceC1469m1;
        if (getWindowToken() != null) {
            ((P00) this.B).n = this.i;
            int i = this.s;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AZ.a;
                AbstractC1637oZ.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f4o = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        C1108gW c1108gW = (C1108gW) this.l;
        c1108gW.d = i != 0 ? EB.t(c1108gW.a.getContext(), i) : null;
        c1108gW.c();
    }

    public void setLogo(int i) {
        k();
        C1108gW c1108gW = (C1108gW) this.l;
        c1108gW.e = i != 0 ? EB.t(c1108gW.a.getContext(), i) : null;
        c1108gW.c();
    }

    public void setOverlayMode(boolean z) {
        this.n = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // o.InterfaceC1644og
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((C1108gW) this.l).k = callback;
    }

    @Override // o.InterfaceC1644og
    public void setWindowTitle(CharSequence charSequence) {
        k();
        C1108gW c1108gW = (C1108gW) this.l;
        if (c1108gW.g) {
            return;
        }
        Toolbar toolbar = c1108gW.a;
        c1108gW.h = charSequence;
        if ((c1108gW.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c1108gW.g) {
                AZ.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1535n1(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        C1108gW c1108gW = (C1108gW) this.l;
        c1108gW.d = drawable;
        c1108gW.c();
    }

    @Override // o.InterfaceC1550nE
    public final void d(int i, int i2, int[] iArr, int i3) {
    }
}

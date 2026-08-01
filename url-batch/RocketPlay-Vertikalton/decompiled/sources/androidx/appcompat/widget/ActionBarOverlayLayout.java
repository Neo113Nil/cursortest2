package androidx.appcompat.widget;

import C.d;
import K.C0008b0;
import K.C0024q;
import K.F;
import K.H;
import K.InterfaceC0022o;
import K.InterfaceC0023p;
import K.T;
import K.o0;
import K.p0;
import K.q0;
import K.r0;
import K.x0;
import K.z0;
import a1.AbstractC0067d;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.luckycounter.drinkwater.R;
import g.J;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0213x;
import k.MenuC0202m;
import l.C0247e;
import l.C0249f;
import l.C0259k;
import l.InterfaceC0245d;
import l.InterfaceC0262l0;
import l.InterfaceC0264m0;
import l.RunnableC0243c;
import l.Z0;
import l.e1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0262l0, InterfaceC0022o, InterfaceC0023p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1691C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final z0 f1692D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1693E;

    /* renamed from: A, reason: collision with root package name */
    public final C0024q f1694A;

    /* renamed from: B, reason: collision with root package name */
    public final C0249f f1695B;

    /* renamed from: a, reason: collision with root package name */
    public int f1696a;

    /* renamed from: b, reason: collision with root package name */
    public int f1697b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1698c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0264m0 f1699e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1700f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1701g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1702j;

    /* renamed from: k, reason: collision with root package name */
    public int f1703k;

    /* renamed from: l, reason: collision with root package name */
    public int f1704l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1705m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1706n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1707o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1708p;

    /* renamed from: q, reason: collision with root package name */
    public z0 f1709q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f1710r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f1711s;

    /* renamed from: t, reason: collision with root package name */
    public z0 f1712t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0245d f1713u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1714v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1715w;

    /* renamed from: x, reason: collision with root package name */
    public final C0008b0 f1716x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0243c f1717y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0243c f1718z;

    static {
        int i = Build.VERSION.SDK_INT;
        r0 q0Var = i >= 30 ? new q0() : i >= 29 ? new p0() : new o0();
        q0Var.g(d.b(0, 1, 0, 1));
        f1692D = q0Var.b();
        f1693E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1697b = 0;
        this.f1705m = new Rect();
        this.f1706n = new Rect();
        this.f1707o = new Rect();
        this.f1708p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        z0 z0Var = z0.f728b;
        this.f1709q = z0Var;
        this.f1710r = z0Var;
        this.f1711s = z0Var;
        this.f1712t = z0Var;
        this.f1716x = new C0008b0(2, this);
        this.f1717y = new RunnableC0243c(this, 0);
        this.f1718z = new RunnableC0243c(this, 1);
        i(context);
        this.f1694A = new C0024q();
        C0249f c0249f = new C0249f(context);
        c0249f.setWillNotDraw(true);
        this.f1695B = c0249f;
        addView(c0249f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0247e c0247e = (C0247e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0247e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0247e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0247e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0247e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0247e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0247e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0247e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0247e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0022o
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0023p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0022o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0247e;
    }

    @Override // K.InterfaceC0022o
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1700f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1700f.setBounds(0, i, getWidth(), this.f1700f.getIntrinsicHeight() + i);
            this.f1700f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0022o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0022o
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0247e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0247e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0024q c0024q = this.f1694A;
        return c0024q.f703b | c0024q.f702a;
    }

    public CharSequence getTitle() {
        k();
        return ((e1) this.f1699e).f3414a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1717y);
        removeCallbacks(this.f1718z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1715w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1691C);
        this.f1696a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1700f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1714v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((e1) this.f1699e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((e1) this.f1699e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0264m0 wrapper;
        if (this.f1698c == null) {
            this.f1698c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0264m0) {
                wrapper = (InterfaceC0264m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1699e = wrapper;
        }
    }

    public final void l(MenuC0202m menuC0202m, InterfaceC0213x interfaceC0213x) {
        k();
        e1 e1Var = (e1) this.f1699e;
        C0259k c0259k = e1Var.f3423m;
        Toolbar toolbar = e1Var.f3414a;
        if (c0259k == null) {
            e1Var.f3423m = new C0259k(toolbar.getContext());
        }
        C0259k c0259k2 = e1Var.f3423m;
        c0259k2.f3451e = interfaceC0213x;
        if (menuC0202m == null && toolbar.f1759a == null) {
            return;
        }
        toolbar.f();
        MenuC0202m menuC0202m2 = toolbar.f1759a.f1719p;
        if (menuC0202m2 == menuC0202m) {
            return;
        }
        if (menuC0202m2 != null) {
            menuC0202m2.r(toolbar.f1752K);
            menuC0202m2.r(toolbar.f1753L);
        }
        if (toolbar.f1753L == null) {
            toolbar.f1753L = new Z0(toolbar);
        }
        c0259k2.f3461q = true;
        if (menuC0202m != null) {
            menuC0202m.b(c0259k2, toolbar.f1765j);
            menuC0202m.b(toolbar.f1753L, toolbar.f1765j);
        } else {
            c0259k2.j(toolbar.f1765j, null);
            toolbar.f1753L.j(toolbar.f1765j, null);
            c0259k2.c();
            toolbar.f1753L.c();
        }
        toolbar.f1759a.setPopupTheme(toolbar.f1766k);
        toolbar.f1759a.setPresenter(c0259k2);
        toolbar.f1752K = c0259k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        z0 g2 = z0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = T.f633a;
        Rect rect = this.f1705m;
        H.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        x0 x0Var = g2.f729a;
        z0 l2 = x0Var.l(i, i2, i3, i4);
        this.f1709q = l2;
        boolean z2 = true;
        if (!this.f1710r.equals(l2)) {
            this.f1710r = this.f1709q;
            g3 = true;
        }
        Rect rect2 = this.f1706n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return x0Var.a().f729a.c().f729a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = T.f633a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0247e c0247e = (C0247e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0247e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0247e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        C0247e c0247e = (C0247e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0247e).leftMargin + ((ViewGroup.MarginLayoutParams) c0247e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0247e).topMargin + ((ViewGroup.MarginLayoutParams) c0247e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = T.f633a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1696a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1696a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1705m;
        Rect rect2 = this.f1707o;
        rect2.set(rect);
        this.f1711s = this.f1709q;
        if (!this.f1701g && !z2) {
            C0249f c0249f = this.f1695B;
            z0 z0Var = f1692D;
            Rect rect3 = this.f1708p;
            H.b(c0249f, z0Var, rect3);
            if (!rect3.equals(f1693E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1711s = this.f1711s.f729a.l(0, measuredHeight, 0, 0);
                g(this.f1698c, rect2, true);
                if (!this.f1712t.equals(this.f1711s)) {
                    z0 z0Var2 = this.f1711s;
                    this.f1712t = z0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1698c;
                    WindowInsets f2 = z0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = F.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            z0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1698c, i, 0, i2, 0);
                C0247e c0247e2 = (C0247e) this.f1698c.getLayoutParams();
                int max3 = Math.max(max, this.f1698c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0247e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0247e2).rightMargin);
                int max4 = Math.max(max2, this.f1698c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0247e2).topMargin + ((ViewGroup.MarginLayoutParams) c0247e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1698c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1711s.b(), this.f1711s.d() + measuredHeight, this.f1711s.c(), this.f1711s.a());
        z0 z0Var3 = this.f1711s;
        int i3 = Build.VERSION.SDK_INT;
        r0 q0Var = i3 >= 30 ? new q0(z0Var3) : i3 >= 29 ? new p0(z0Var3) : new o0(z0Var3);
        q0Var.g(b2);
        this.f1711s = q0Var.b();
        g(this.f1698c, rect2, true);
        if (!this.f1712t.equals(this.f1711s)) {
        }
        measureChildWithMargins(this.f1698c, i, 0, i2, 0);
        C0247e c0247e22 = (C0247e) this.f1698c.getLayoutParams();
        int max32 = Math.max(max, this.f1698c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0247e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0247e22).rightMargin);
        int max42 = Math.max(max2, this.f1698c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0247e22).topMargin + ((ViewGroup.MarginLayoutParams) c0247e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1698c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1714v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1714v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1718z.run();
        } else {
            h();
            this.f1717y.run();
        }
        this.f1702j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1703k + i2;
        this.f1703k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        J j2;
        j jVar;
        this.f1694A.f702a = i;
        this.f1703k = getActionBarHideOffset();
        h();
        InterfaceC0245d interfaceC0245d = this.f1713u;
        if (interfaceC0245d == null || (jVar = (j2 = (J) interfaceC0245d).f2623v) == null) {
            return;
        }
        jVar.a();
        j2.f2623v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.f1702j) {
            return;
        }
        if (this.f1703k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1717y, 600L);
        } else {
            h();
            postDelayed(this.f1718z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1704l ^ i;
        this.f1704l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0245d interfaceC0245d = this.f1713u;
        if (interfaceC0245d != null) {
            J j2 = (J) interfaceC0245d;
            j2.f2619r = !z3;
            if (z2 || !z3) {
                if (j2.f2620s) {
                    j2.f2620s = false;
                    j2.B(true);
                }
            } else if (!j2.f2620s) {
                j2.f2620s = true;
                j2.B(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1713u == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f633a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1697b = i;
        InterfaceC0245d interfaceC0245d = this.f1713u;
        if (interfaceC0245d != null) {
            ((J) interfaceC0245d).f2618q = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0245d interfaceC0245d) {
        this.f1713u = interfaceC0245d;
        if (getWindowToken() != null) {
            ((J) this.f1713u).f2618q = this.f1697b;
            int i = this.f1704l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = T.f633a;
                F.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.i) {
            this.i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        e1 e1Var = (e1) this.f1699e;
        e1Var.d = i != 0 ? AbstractC0067d.k(e1Var.f3414a.getContext(), i) : null;
        e1Var.c();
    }

    public void setLogo(int i) {
        k();
        e1 e1Var = (e1) this.f1699e;
        e1Var.f3417e = i != 0 ? AbstractC0067d.k(e1Var.f3414a.getContext(), i) : null;
        e1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1701g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0262l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((e1) this.f1699e).f3421k = callback;
    }

    @Override // l.InterfaceC0262l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        e1 e1Var = (e1) this.f1699e;
        if (e1Var.f3419g) {
            return;
        }
        e1Var.h = charSequence;
        if ((e1Var.f3415b & 8) != 0) {
            Toolbar toolbar = e1Var.f3414a;
            toolbar.setTitle(charSequence);
            if (e1Var.f3419g) {
                T.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0247e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        e1 e1Var = (e1) this.f1699e;
        e1Var.d = drawable;
        e1Var.c();
    }
}

package androidx.appcompat.widget;

import C.d;
import K.C0003b0;
import K.F;
import K.H;
import K.InterfaceC0017p;
import K.InterfaceC0018q;
import K.T;
import K.o0;
import K.p0;
import K.q0;
import K.r;
import K.r0;
import K.x0;
import K.z0;
import T.e;
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
import com.football.transfertrivia.R;
import g.I;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0175x;
import k.MenuC0164m;
import l.C0206e;
import l.C0208f;
import l.C0218k;
import l.InterfaceC0204d;
import l.InterfaceC0217j0;
import l.InterfaceC0219k0;
import l.RunnableC0202c;
import l.X0;
import l.c1;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0217j0, InterfaceC0017p, InterfaceC0018q {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1302C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final z0 f1303D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1304E;

    /* renamed from: A, reason: collision with root package name */
    public final r f1305A;

    /* renamed from: B, reason: collision with root package name */
    public final C0208f f1306B;

    /* renamed from: a, reason: collision with root package name */
    public int f1307a;

    /* renamed from: b, reason: collision with root package name */
    public int f1308b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1309c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0219k0 f1310e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1311f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1312g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1313j;

    /* renamed from: k, reason: collision with root package name */
    public int f1314k;

    /* renamed from: l, reason: collision with root package name */
    public int f1315l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1316m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1317n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1318o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1319p;

    /* renamed from: q, reason: collision with root package name */
    public z0 f1320q;

    /* renamed from: r, reason: collision with root package name */
    public z0 f1321r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f1322s;

    /* renamed from: t, reason: collision with root package name */
    public z0 f1323t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0204d f1324u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1325v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1326w;

    /* renamed from: x, reason: collision with root package name */
    public final C0003b0 f1327x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0202c f1328y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0202c f1329z;

    static {
        int i = Build.VERSION.SDK_INT;
        r0 q0Var = i >= 30 ? new q0() : i >= 29 ? new p0() : new o0();
        q0Var.g(d.b(0, 1, 0, 1));
        f1303D = q0Var.b();
        f1304E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1308b = 0;
        this.f1316m = new Rect();
        this.f1317n = new Rect();
        this.f1318o = new Rect();
        this.f1319p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        z0 z0Var = z0.f464b;
        this.f1320q = z0Var;
        this.f1321r = z0Var;
        this.f1322s = z0Var;
        this.f1323t = z0Var;
        this.f1327x = new C0003b0(2, this);
        this.f1328y = new RunnableC0202c(this, 0);
        this.f1329z = new RunnableC0202c(this, 1);
        i(context);
        this.f1305A = new r();
        C0208f c0208f = new C0208f(context);
        c0208f.setWillNotDraw(true);
        this.f1306B = c0208f;
        addView(c0208f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0206e c0206e = (C0206e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0206e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0206e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0206e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0206e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0206e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0206e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0206e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0206e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0017p
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0018q
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0017p
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0206e;
    }

    @Override // K.InterfaceC0017p
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1311f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1311f.setBounds(0, i, getWidth(), this.f1311f.getIntrinsicHeight() + i);
            this.f1311f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0017p
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0017p
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0206e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0206e(getContext(), attributeSet);
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
        r rVar = this.f1305A;
        return rVar.f441b | rVar.f440a;
    }

    public CharSequence getTitle() {
        k();
        return ((c1) this.f1310e).f2982a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1328y);
        removeCallbacks(this.f1329z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1326w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1302C);
        this.f1307a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1311f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1325v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((c1) this.f1310e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((c1) this.f1310e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0219k0 wrapper;
        if (this.f1309c == null) {
            this.f1309c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0219k0) {
                wrapper = (InterfaceC0219k0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1310e = wrapper;
        }
    }

    public final void l(MenuC0164m menuC0164m, InterfaceC0175x interfaceC0175x) {
        k();
        c1 c1Var = (c1) this.f1310e;
        C0218k c0218k = c1Var.f2991m;
        Toolbar toolbar = c1Var.f2982a;
        if (c0218k == null) {
            c1Var.f2991m = new C0218k(toolbar.getContext());
        }
        C0218k c0218k2 = c1Var.f2991m;
        c0218k2.f3019e = interfaceC0175x;
        if (menuC0164m == null && toolbar.f1373a == null) {
            return;
        }
        toolbar.f();
        MenuC0164m menuC0164m2 = toolbar.f1373a.f1330p;
        if (menuC0164m2 == menuC0164m) {
            return;
        }
        if (menuC0164m2 != null) {
            menuC0164m2.r(toolbar.f1366K);
            menuC0164m2.r(toolbar.f1367L);
        }
        if (toolbar.f1367L == null) {
            toolbar.f1367L = new X0(toolbar);
        }
        c0218k2.f3029q = true;
        if (menuC0164m != null) {
            menuC0164m.b(c0218k2, toolbar.f1379j);
            menuC0164m.b(toolbar.f1367L, toolbar.f1379j);
        } else {
            c0218k2.j(toolbar.f1379j, null);
            toolbar.f1367L.j(toolbar.f1379j, null);
            c0218k2.c();
            toolbar.f1367L.c();
        }
        toolbar.f1373a.setPopupTheme(toolbar.f1380k);
        toolbar.f1373a.setPresenter(c0218k2);
        toolbar.f1366K = c0218k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        z0 g2 = z0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = T.f372a;
        Rect rect = this.f1316m;
        H.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        x0 x0Var = g2.f465a;
        z0 l2 = x0Var.l(i, i2, i3, i4);
        this.f1320q = l2;
        boolean z2 = true;
        if (!this.f1321r.equals(l2)) {
            this.f1321r = this.f1320q;
            g3 = true;
        }
        Rect rect2 = this.f1317n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return x0Var.a().f465a.c().f465a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = T.f372a;
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
                C0206e c0206e = (C0206e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0206e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0206e).topMargin + paddingTop;
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
        C0206e c0206e = (C0206e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0206e).leftMargin + ((ViewGroup.MarginLayoutParams) c0206e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0206e).topMargin + ((ViewGroup.MarginLayoutParams) c0206e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = T.f372a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1307a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1307a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1316m;
        Rect rect2 = this.f1318o;
        rect2.set(rect);
        this.f1322s = this.f1320q;
        if (!this.f1312g && !z2) {
            C0208f c0208f = this.f1306B;
            z0 z0Var = f1303D;
            Rect rect3 = this.f1319p;
            H.b(c0208f, z0Var, rect3);
            if (!rect3.equals(f1304E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1322s = this.f1322s.f465a.l(0, measuredHeight, 0, 0);
                g(this.f1309c, rect2, true);
                if (!this.f1323t.equals(this.f1322s)) {
                    z0 z0Var2 = this.f1322s;
                    this.f1323t = z0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1309c;
                    WindowInsets f2 = z0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = F.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            z0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1309c, i, 0, i2, 0);
                C0206e c0206e2 = (C0206e) this.f1309c.getLayoutParams();
                int max3 = Math.max(max, this.f1309c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0206e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0206e2).rightMargin);
                int max4 = Math.max(max2, this.f1309c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0206e2).topMargin + ((ViewGroup.MarginLayoutParams) c0206e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1309c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1322s.b(), this.f1322s.d() + measuredHeight, this.f1322s.c(), this.f1322s.a());
        z0 z0Var3 = this.f1322s;
        int i3 = Build.VERSION.SDK_INT;
        r0 q0Var = i3 >= 30 ? new q0(z0Var3) : i3 >= 29 ? new p0(z0Var3) : new o0(z0Var3);
        q0Var.g(b2);
        this.f1322s = q0Var.b();
        g(this.f1309c, rect2, true);
        if (!this.f1323t.equals(this.f1322s)) {
        }
        measureChildWithMargins(this.f1309c, i, 0, i2, 0);
        C0206e c0206e22 = (C0206e) this.f1309c.getLayoutParams();
        int max32 = Math.max(max, this.f1309c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0206e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0206e22).rightMargin);
        int max42 = Math.max(max2, this.f1309c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0206e22).topMargin + ((ViewGroup.MarginLayoutParams) c0206e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1309c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1325v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1325v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1329z.run();
        } else {
            h();
            this.f1328y.run();
        }
        this.f1313j = true;
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
        int i5 = this.f1314k + i2;
        this.f1314k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        I i2;
        j jVar;
        this.f1305A.f440a = i;
        this.f1314k = getActionBarHideOffset();
        h();
        InterfaceC0204d interfaceC0204d = this.f1324u;
        if (interfaceC0204d == null || (jVar = (i2 = (I) interfaceC0204d).f2199s) == null) {
            return;
        }
        jVar.a();
        i2.f2199s = null;
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
        if (!this.i || this.f1313j) {
            return;
        }
        if (this.f1314k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1328y, 600L);
        } else {
            h();
            postDelayed(this.f1329z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1315l ^ i;
        this.f1315l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0204d interfaceC0204d = this.f1324u;
        if (interfaceC0204d != null) {
            I i3 = (I) interfaceC0204d;
            i3.f2195o = !z3;
            if (z2 || !z3) {
                if (i3.f2196p) {
                    i3.f2196p = false;
                    i3.e0(true);
                }
            } else if (!i3.f2196p) {
                i3.f2196p = true;
                i3.e0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1324u == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f372a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1308b = i;
        InterfaceC0204d interfaceC0204d = this.f1324u;
        if (interfaceC0204d != null) {
            ((I) interfaceC0204d).f2194n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0204d interfaceC0204d) {
        this.f1324u = interfaceC0204d;
        if (getWindowToken() != null) {
            ((I) this.f1324u).f2194n = this.f1308b;
            int i = this.f1315l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = T.f372a;
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
        c1 c1Var = (c1) this.f1310e;
        c1Var.d = i != 0 ? e.w(c1Var.f2982a.getContext(), i) : null;
        c1Var.c();
    }

    public void setLogo(int i) {
        k();
        c1 c1Var = (c1) this.f1310e;
        c1Var.f2985e = i != 0 ? e.w(c1Var.f2982a.getContext(), i) : null;
        c1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1312g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0217j0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((c1) this.f1310e).f2989k = callback;
    }

    @Override // l.InterfaceC0217j0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        c1 c1Var = (c1) this.f1310e;
        if (c1Var.f2987g) {
            return;
        }
        c1Var.h = charSequence;
        if ((c1Var.f2983b & 8) != 0) {
            Toolbar toolbar = c1Var.f2982a;
            toolbar.setTitle(charSequence);
            if (c1Var.f2987g) {
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
        return new C0206e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        c1 c1Var = (c1) this.f1310e;
        c1Var.d = drawable;
        c1Var.c();
    }
}

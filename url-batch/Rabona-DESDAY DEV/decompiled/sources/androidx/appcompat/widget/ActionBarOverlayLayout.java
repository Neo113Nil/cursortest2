package androidx.appcompat.widget;

import C.d;
import K.C0017q;
import K.F;
import K.H;
import K.InterfaceC0015o;
import K.InterfaceC0016p;
import K.T;
import K.Z;
import K.m0;
import K.n0;
import K.o0;
import K.p0;
import K.v0;
import K.x0;
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
import com.linetic.luckycross.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0169x;
import k.MenuC0158m;
import l.C0231e;
import l.C0233f;
import l.C0243k;
import l.InterfaceC0229d;
import l.InterfaceC0246l0;
import l.InterfaceC0248m0;
import l.RunnableC0227c;
import l.Y0;
import l.d1;
import q1.l;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0246l0, InterfaceC0015o, InterfaceC0016p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1158C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final x0 f1159D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1160E;

    /* renamed from: A, reason: collision with root package name */
    public final C0017q f1161A;

    /* renamed from: B, reason: collision with root package name */
    public final C0233f f1162B;

    /* renamed from: a, reason: collision with root package name */
    public int f1163a;

    /* renamed from: b, reason: collision with root package name */
    public int f1164b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1165c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0248m0 f1166e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1167f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1168g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1169j;

    /* renamed from: k, reason: collision with root package name */
    public int f1170k;

    /* renamed from: l, reason: collision with root package name */
    public int f1171l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1172m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1173n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1174o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1175p;

    /* renamed from: q, reason: collision with root package name */
    public x0 f1176q;

    /* renamed from: r, reason: collision with root package name */
    public x0 f1177r;

    /* renamed from: s, reason: collision with root package name */
    public x0 f1178s;

    /* renamed from: t, reason: collision with root package name */
    public x0 f1179t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0229d f1180u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1181v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1182w;

    /* renamed from: x, reason: collision with root package name */
    public final Z f1183x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0227c f1184y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0227c f1185z;

    static {
        int i = Build.VERSION.SDK_INT;
        p0 o0Var = i >= 30 ? new o0() : i >= 29 ? new n0() : new m0();
        o0Var.g(d.b(0, 1, 0, 1));
        f1159D = o0Var.b();
        f1160E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1164b = 0;
        this.f1172m = new Rect();
        this.f1173n = new Rect();
        this.f1174o = new Rect();
        this.f1175p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        x0 x0Var = x0.f467b;
        this.f1176q = x0Var;
        this.f1177r = x0Var;
        this.f1178s = x0Var;
        this.f1179t = x0Var;
        this.f1183x = new Z(3, this);
        this.f1184y = new RunnableC0227c(this, 0);
        this.f1185z = new RunnableC0227c(this, 1);
        i(context);
        this.f1161A = new C0017q();
        C0233f c0233f = new C0233f(context);
        c0233f.setWillNotDraw(true);
        this.f1162B = c0233f;
        addView(c0233f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0231e c0231e = (C0231e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0231e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0231e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0231e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0231e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0231e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0231e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0231e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0231e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0015o
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0016p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0015o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0231e;
    }

    @Override // K.InterfaceC0015o
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1167f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1167f.setBounds(0, i, getWidth(), this.f1167f.getIntrinsicHeight() + i);
            this.f1167f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0015o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0015o
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0231e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0231e(getContext(), attributeSet);
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
        C0017q c0017q = this.f1161A;
        return c0017q.f448b | c0017q.f447a;
    }

    public CharSequence getTitle() {
        k();
        return ((d1) this.f1166e).f2976a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1184y);
        removeCallbacks(this.f1185z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1182w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1158C);
        this.f1163a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1167f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1181v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d1) this.f1166e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d1) this.f1166e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0248m0 wrapper;
        if (this.f1165c == null) {
            this.f1165c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0248m0) {
                wrapper = (InterfaceC0248m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1166e = wrapper;
        }
    }

    public final void l(MenuC0158m menuC0158m, InterfaceC0169x interfaceC0169x) {
        k();
        d1 d1Var = (d1) this.f1166e;
        C0243k c0243k = d1Var.f2985m;
        Toolbar toolbar = d1Var.f2976a;
        if (c0243k == null) {
            d1Var.f2985m = new C0243k(toolbar.getContext());
        }
        C0243k c0243k2 = d1Var.f2985m;
        c0243k2.f3013e = interfaceC0169x;
        if (menuC0158m == null && toolbar.f1226a == null) {
            return;
        }
        toolbar.f();
        MenuC0158m menuC0158m2 = toolbar.f1226a.f1186p;
        if (menuC0158m2 == menuC0158m) {
            return;
        }
        if (menuC0158m2 != null) {
            menuC0158m2.r(toolbar.f1219K);
            menuC0158m2.r(toolbar.f1220L);
        }
        if (toolbar.f1220L == null) {
            toolbar.f1220L = new Y0(toolbar);
        }
        c0243k2.f3023q = true;
        if (menuC0158m != null) {
            menuC0158m.b(c0243k2, toolbar.f1232j);
            menuC0158m.b(toolbar.f1220L, toolbar.f1232j);
        } else {
            c0243k2.j(toolbar.f1232j, null);
            toolbar.f1220L.j(toolbar.f1232j, null);
            c0243k2.c();
            toolbar.f1220L.c();
        }
        toolbar.f1226a.setPopupTheme(toolbar.f1233k);
        toolbar.f1226a.setPresenter(c0243k2);
        toolbar.f1219K = c0243k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        x0 g2 = x0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = T.f381a;
        Rect rect = this.f1172m;
        H.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        v0 v0Var = g2.f468a;
        x0 l2 = v0Var.l(i, i2, i3, i4);
        this.f1176q = l2;
        boolean z2 = true;
        if (!this.f1177r.equals(l2)) {
            this.f1177r = this.f1176q;
            g3 = true;
        }
        Rect rect2 = this.f1173n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return v0Var.a().f468a.c().f468a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = T.f381a;
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
                C0231e c0231e = (C0231e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0231e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0231e).topMargin + paddingTop;
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
        C0231e c0231e = (C0231e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0231e).leftMargin + ((ViewGroup.MarginLayoutParams) c0231e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0231e).topMargin + ((ViewGroup.MarginLayoutParams) c0231e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = T.f381a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1163a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1163a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1172m;
        Rect rect2 = this.f1174o;
        rect2.set(rect);
        this.f1178s = this.f1176q;
        if (!this.f1168g && !z2) {
            C0233f c0233f = this.f1162B;
            x0 x0Var = f1159D;
            Rect rect3 = this.f1175p;
            H.b(c0233f, x0Var, rect3);
            if (!rect3.equals(f1160E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1178s = this.f1178s.f468a.l(0, measuredHeight, 0, 0);
                g(this.f1165c, rect2, true);
                if (!this.f1179t.equals(this.f1178s)) {
                    x0 x0Var2 = this.f1178s;
                    this.f1179t = x0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1165c;
                    WindowInsets f2 = x0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = F.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            x0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1165c, i, 0, i2, 0);
                C0231e c0231e2 = (C0231e) this.f1165c.getLayoutParams();
                int max3 = Math.max(max, this.f1165c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0231e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0231e2).rightMargin);
                int max4 = Math.max(max2, this.f1165c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0231e2).topMargin + ((ViewGroup.MarginLayoutParams) c0231e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1165c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        d b2 = d.b(this.f1178s.b(), this.f1178s.d() + measuredHeight, this.f1178s.c(), this.f1178s.a());
        x0 x0Var3 = this.f1178s;
        int i3 = Build.VERSION.SDK_INT;
        p0 o0Var = i3 >= 30 ? new o0(x0Var3) : i3 >= 29 ? new n0(x0Var3) : new m0(x0Var3);
        o0Var.g(b2);
        this.f1178s = o0Var.b();
        g(this.f1165c, rect2, true);
        if (!this.f1179t.equals(this.f1178s)) {
        }
        measureChildWithMargins(this.f1165c, i, 0, i2, 0);
        C0231e c0231e22 = (C0231e) this.f1165c.getLayoutParams();
        int max32 = Math.max(max, this.f1165c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0231e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0231e22).rightMargin);
        int max42 = Math.max(max2, this.f1165c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0231e22).topMargin + ((ViewGroup.MarginLayoutParams) c0231e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1165c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1181v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1181v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1185z.run();
        } else {
            h();
            this.f1184y.run();
        }
        this.f1169j = true;
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
        int i5 = this.f1170k + i2;
        this.f1170k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1161A.f447a = i;
        this.f1170k = getActionBarHideOffset();
        h();
        InterfaceC0229d interfaceC0229d = this.f1180u;
        if (interfaceC0229d == null || (jVar = (k2 = (K) interfaceC0229d).f2283s) == null) {
            return;
        }
        jVar.a();
        k2.f2283s = null;
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
        if (!this.i || this.f1169j) {
            return;
        }
        if (this.f1170k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1184y, 600L);
        } else {
            h();
            postDelayed(this.f1185z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1171l ^ i;
        this.f1171l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0229d interfaceC0229d = this.f1180u;
        if (interfaceC0229d != null) {
            K k2 = (K) interfaceC0229d;
            k2.f2279o = !z3;
            if (z2 || !z3) {
                if (k2.f2280p) {
                    k2.f2280p = false;
                    k2.i0(true);
                }
            } else if (!k2.f2280p) {
                k2.f2280p = true;
                k2.i0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1180u == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f381a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1164b = i;
        InterfaceC0229d interfaceC0229d = this.f1180u;
        if (interfaceC0229d != null) {
            ((K) interfaceC0229d).f2278n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0229d interfaceC0229d) {
        this.f1180u = interfaceC0229d;
        if (getWindowToken() != null) {
            ((K) this.f1180u).f2278n = this.f1164b;
            int i = this.f1171l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = T.f381a;
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
        d1 d1Var = (d1) this.f1166e;
        d1Var.d = i != 0 ? l.v(d1Var.f2976a.getContext(), i) : null;
        d1Var.c();
    }

    public void setLogo(int i) {
        k();
        d1 d1Var = (d1) this.f1166e;
        d1Var.f2979e = i != 0 ? l.v(d1Var.f2976a.getContext(), i) : null;
        d1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1168g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0246l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d1) this.f1166e).f2983k = callback;
    }

    @Override // l.InterfaceC0246l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d1 d1Var = (d1) this.f1166e;
        if (d1Var.f2981g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2977b & 8) != 0) {
            Toolbar toolbar = d1Var.f2976a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2981g) {
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
        return new C0231e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d1 d1Var = (d1) this.f1166e;
        d1Var.d = drawable;
        d1Var.c();
    }
}

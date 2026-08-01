package androidx.appcompat.widget;

import C.c;
import K.C0016q;
import K.E;
import K.G;
import K.InterfaceC0014o;
import K.InterfaceC0015p;
import K.S;
import K.Y;
import K.l0;
import K.m0;
import K.n0;
import K.o0;
import K.u0;
import K.w0;
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
import com.fortuneodd.shadegrid.R;
import g.K;
import j.j;
import java.util.WeakHashMap;
import k.InterfaceC0179x;
import k.MenuC0168m;
import l.C0220e;
import l.C0222f;
import l.C0232k;
import l.InterfaceC0218d;
import l.InterfaceC0235l0;
import l.InterfaceC0237m0;
import l.RunnableC0216c;
import l.Y0;
import l.d1;
import q1.d;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0235l0, InterfaceC0014o, InterfaceC0015p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1157C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final w0 f1158D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f1159E;

    /* renamed from: A, reason: collision with root package name */
    public final C0016q f1160A;

    /* renamed from: B, reason: collision with root package name */
    public final C0222f f1161B;

    /* renamed from: a, reason: collision with root package name */
    public int f1162a;

    /* renamed from: b, reason: collision with root package name */
    public int f1163b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f1164c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0237m0 f1165e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1166f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1167g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1168j;

    /* renamed from: k, reason: collision with root package name */
    public int f1169k;

    /* renamed from: l, reason: collision with root package name */
    public int f1170l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1171m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1172n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1173o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1174p;

    /* renamed from: q, reason: collision with root package name */
    public w0 f1175q;

    /* renamed from: r, reason: collision with root package name */
    public w0 f1176r;

    /* renamed from: s, reason: collision with root package name */
    public w0 f1177s;

    /* renamed from: t, reason: collision with root package name */
    public w0 f1178t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0218d f1179u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f1180v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f1181w;

    /* renamed from: x, reason: collision with root package name */
    public final Y f1182x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0216c f1183y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0216c f1184z;

    static {
        int i = Build.VERSION.SDK_INT;
        o0 n0Var = i >= 30 ? new n0() : i >= 29 ? new m0() : new l0();
        n0Var.g(c.b(0, 1, 0, 1));
        f1158D = n0Var.b();
        f1159E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1163b = 0;
        this.f1171m = new Rect();
        this.f1172n = new Rect();
        this.f1173o = new Rect();
        this.f1174p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        w0 w0Var = w0.f446b;
        this.f1175q = w0Var;
        this.f1176r = w0Var;
        this.f1177s = w0Var;
        this.f1178t = w0Var;
        this.f1182x = new Y(3, this);
        this.f1183y = new RunnableC0216c(this, 0);
        this.f1184z = new RunnableC0216c(this, 1);
        i(context);
        this.f1160A = new C0016q();
        C0222f c0222f = new C0222f(context);
        c0222f.setWillNotDraw(true);
        this.f1161B = c0222f;
        addView(c0222f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0220e c0220e = (C0220e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0220e).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0220e).leftMargin = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0220e).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0220e).topMargin = i4;
            z3 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0220e).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0220e).rightMargin = i6;
            z3 = true;
        }
        if (z2) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0220e).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0220e).bottomMargin = i8;
                return true;
            }
        }
        return z3;
    }

    @Override // K.InterfaceC0014o
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // K.InterfaceC0015p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(view, i, i2, i3, i4, i5);
    }

    @Override // K.InterfaceC0014o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0220e;
    }

    @Override // K.InterfaceC0014o
    public final void d(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1166f != null) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f1166f.setBounds(0, i, getWidth(), this.f1166f.getIntrinsicHeight() + i);
            this.f1166f.draw(canvas);
        }
    }

    @Override // K.InterfaceC0014o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // K.InterfaceC0014o
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0220e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0220e(getContext(), attributeSet);
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
        C0016q c0016q = this.f1160A;
        return c0016q.f434b | c0016q.f433a;
    }

    public CharSequence getTitle() {
        k();
        return ((d1) this.f1165e).f2979a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1183y);
        removeCallbacks(this.f1184z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1181w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1157C);
        this.f1162a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1166f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1180v = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((d1) this.f1165e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((d1) this.f1165e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0237m0 wrapper;
        if (this.f1164c == null) {
            this.f1164c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0237m0) {
                wrapper = (InterfaceC0237m0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1165e = wrapper;
        }
    }

    public final void l(MenuC0168m menuC0168m, InterfaceC0179x interfaceC0179x) {
        k();
        d1 d1Var = (d1) this.f1165e;
        C0232k c0232k = d1Var.f2988m;
        Toolbar toolbar = d1Var.f2979a;
        if (c0232k == null) {
            d1Var.f2988m = new C0232k(toolbar.getContext());
        }
        C0232k c0232k2 = d1Var.f2988m;
        c0232k2.f3016e = interfaceC0179x;
        if (menuC0168m == null && toolbar.f1225a == null) {
            return;
        }
        toolbar.f();
        MenuC0168m menuC0168m2 = toolbar.f1225a.f1185p;
        if (menuC0168m2 == menuC0168m) {
            return;
        }
        if (menuC0168m2 != null) {
            menuC0168m2.r(toolbar.f1218K);
            menuC0168m2.r(toolbar.f1219L);
        }
        if (toolbar.f1219L == null) {
            toolbar.f1219L = new Y0(toolbar);
        }
        c0232k2.f3026q = true;
        if (menuC0168m != null) {
            menuC0168m.b(c0232k2, toolbar.f1231j);
            menuC0168m.b(toolbar.f1219L, toolbar.f1231j);
        } else {
            c0232k2.j(toolbar.f1231j, null);
            toolbar.f1219L.j(toolbar.f1231j, null);
            c0232k2.c();
            toolbar.f1219L.c();
        }
        toolbar.f1225a.setPopupTheme(toolbar.f1232k);
        toolbar.f1225a.setPresenter(c0232k2);
        toolbar.f1218K = c0232k2;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        w0 g2 = w0.g(this, windowInsets);
        boolean g3 = g(this.d, new Rect(g2.b(), g2.d(), g2.c(), g2.a()), false);
        WeakHashMap weakHashMap = S.f360a;
        Rect rect = this.f1171m;
        G.b(this, g2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        u0 u0Var = g2.f447a;
        w0 l2 = u0Var.l(i, i2, i3, i4);
        this.f1175q = l2;
        boolean z2 = true;
        if (!this.f1176r.equals(l2)) {
            this.f1176r = this.f1175q;
            g3 = true;
        }
        Rect rect2 = this.f1172n;
        if (rect2.equals(rect)) {
            z2 = g3;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return u0Var.a().f447a.c().f447a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = S.f360a;
        E.c(this);
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
                C0220e c0220e = (C0220e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0220e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0220e).topMargin + paddingTop;
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
        C0220e c0220e = (C0220e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0220e).leftMargin + ((ViewGroup.MarginLayoutParams) c0220e).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0220e).topMargin + ((ViewGroup.MarginLayoutParams) c0220e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = S.f360a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f1162a;
            if (this.h && this.d.getTabContainer() != null) {
                measuredHeight += this.f1162a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1171m;
        Rect rect2 = this.f1173o;
        rect2.set(rect);
        this.f1177s = this.f1175q;
        if (!this.f1167g && !z2) {
            C0222f c0222f = this.f1161B;
            w0 w0Var = f1158D;
            Rect rect3 = this.f1174p;
            G.b(c0222f, w0Var, rect3);
            if (!rect3.equals(f1159E)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f1177s = this.f1177s.f447a.l(0, measuredHeight, 0, 0);
                g(this.f1164c, rect2, true);
                if (!this.f1178t.equals(this.f1177s)) {
                    w0 w0Var2 = this.f1177s;
                    this.f1178t = w0Var2;
                    ContentFrameLayout contentFrameLayout = this.f1164c;
                    WindowInsets f2 = w0Var2.f();
                    if (f2 != null) {
                        WindowInsets a2 = E.a(contentFrameLayout, f2);
                        if (!a2.equals(f2)) {
                            w0.g(contentFrameLayout, a2);
                        }
                    }
                }
                measureChildWithMargins(this.f1164c, i, 0, i2, 0);
                C0220e c0220e2 = (C0220e) this.f1164c.getLayoutParams();
                int max3 = Math.max(max, this.f1164c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0220e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0220e2).rightMargin);
                int max4 = Math.max(max2, this.f1164c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0220e2).topMargin + ((ViewGroup.MarginLayoutParams) c0220e2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1164c.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        c b2 = c.b(this.f1177s.b(), this.f1177s.d() + measuredHeight, this.f1177s.c(), this.f1177s.a());
        w0 w0Var3 = this.f1177s;
        int i3 = Build.VERSION.SDK_INT;
        o0 n0Var = i3 >= 30 ? new n0(w0Var3) : i3 >= 29 ? new m0(w0Var3) : new l0(w0Var3);
        n0Var.g(b2);
        this.f1177s = n0Var.b();
        g(this.f1164c, rect2, true);
        if (!this.f1178t.equals(this.f1177s)) {
        }
        measureChildWithMargins(this.f1164c, i, 0, i2, 0);
        C0220e c0220e22 = (C0220e) this.f1164c.getLayoutParams();
        int max32 = Math.max(max, this.f1164c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0220e22).leftMargin + ((ViewGroup.MarginLayoutParams) c0220e22).rightMargin);
        int max42 = Math.max(max2, this.f1164c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0220e22).topMargin + ((ViewGroup.MarginLayoutParams) c0220e22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f1164c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.i || !z2) {
            return false;
        }
        this.f1180v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1180v.getFinalY() > this.d.getHeight()) {
            h();
            this.f1184z.run();
        } else {
            h();
            this.f1183y.run();
        }
        this.f1168j = true;
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
        int i5 = this.f1169k + i2;
        this.f1169k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        K k2;
        j jVar;
        this.f1160A.f433a = i;
        this.f1169k = getActionBarHideOffset();
        h();
        InterfaceC0218d interfaceC0218d = this.f1179u;
        if (interfaceC0218d == null || (jVar = (k2 = (K) interfaceC0218d).f2288w) == null) {
            return;
        }
        jVar.a();
        k2.f2288w = null;
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
        if (!this.i || this.f1168j) {
            return;
        }
        if (this.f1169k <= this.d.getHeight()) {
            h();
            postDelayed(this.f1183y, 600L);
        } else {
            h();
            postDelayed(this.f1184z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.f1170l ^ i;
        this.f1170l = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        InterfaceC0218d interfaceC0218d = this.f1179u;
        if (interfaceC0218d != null) {
            K k2 = (K) interfaceC0218d;
            k2.f2284s = !z3;
            if (z2 || !z3) {
                if (k2.f2285t) {
                    k2.f2285t = false;
                    k2.g0(true);
                }
            } else if (!k2.f2285t) {
                k2.f2285t = true;
                k2.g0(true);
            }
        }
        if ((i2 & 256) == 0 || this.f1179u == null) {
            return;
        }
        WeakHashMap weakHashMap = S.f360a;
        E.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1163b = i;
        InterfaceC0218d interfaceC0218d = this.f1179u;
        if (interfaceC0218d != null) {
            ((K) interfaceC0218d).f2283r = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0218d interfaceC0218d) {
        this.f1179u = interfaceC0218d;
        if (getWindowToken() != null) {
            ((K) this.f1179u).f2283r = this.f1163b;
            int i = this.f1170l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = S.f360a;
                E.c(this);
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
        d1 d1Var = (d1) this.f1165e;
        d1Var.d = i != 0 ? d.u(d1Var.f2979a.getContext(), i) : null;
        d1Var.c();
    }

    public void setLogo(int i) {
        k();
        d1 d1Var = (d1) this.f1165e;
        d1Var.f2982e = i != 0 ? d.u(d1Var.f2979a.getContext(), i) : null;
        d1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f1167g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // l.InterfaceC0235l0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((d1) this.f1165e).f2986k = callback;
    }

    @Override // l.InterfaceC0235l0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        d1 d1Var = (d1) this.f1165e;
        if (d1Var.f2984g) {
            return;
        }
        d1Var.h = charSequence;
        if ((d1Var.f2980b & 8) != 0) {
            Toolbar toolbar = d1Var.f2979a;
            toolbar.setTitle(charSequence);
            if (d1Var.f2984g) {
                S.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0220e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        d1 d1Var = (d1) this.f1165e;
        d1Var.d = drawable;
        d1Var.c();
    }
}

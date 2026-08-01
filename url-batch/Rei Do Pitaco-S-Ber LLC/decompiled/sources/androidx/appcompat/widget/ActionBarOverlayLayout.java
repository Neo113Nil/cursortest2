package androidx.appcompat.widget;

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
import com.ionia.reidopitaco.libya.R;
import defpackage.a1;
import defpackage.ab0;
import defpackage.ae;
import defpackage.av;
import defpackage.ca0;
import defpackage.db0;
import defpackage.f80;
import defpackage.ht;
import defpackage.io;
import defpackage.k1;
import defpackage.ka0;
import defpackage.l8;
import defpackage.la0;
import defpackage.m50;
import defpackage.ma0;
import defpackage.na0;
import defpackage.oa0;
import defpackage.pa0;
import defpackage.qa0;
import defpackage.r50;
import defpackage.ra0;
import defpackage.ss;
import defpackage.vv;
import defpackage.w0;
import defpackage.w80;
import defpackage.x0;
import defpackage.x70;
import defpackage.y0;
import defpackage.yu;
import defpackage.z0;
import defpackage.zu;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements yu, zu {
    public static final int[] H = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final db0 I;
    public static final Rect J;
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final w0 C;
    public final x0 D;
    public final x0 E;
    public final av F;
    public final a1 G;
    public int f;
    public int g;
    public ContentFrameLayout h;
    public ActionBarContainer i;
    public ae j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public db0 v;
    public db0 w;
    public db0 x;
    public db0 y;
    public y0 z;

    static {
        int i = Build.VERSION.SDK_INT;
        ra0 qa0Var = i >= 36 ? new qa0() : i >= 35 ? new pa0() : i >= 34 ? new oa0() : i >= 31 ? new na0() : i >= 30 ? new ma0() : i >= 29 ? new la0() : new ka0();
        qa0Var.h(io.c(0, 1, 0, 1));
        I = qa0Var.b();
        J = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        db0 db0Var = db0.b;
        this.v = db0Var;
        this.w = db0Var;
        this.x = db0Var;
        this.y = db0Var;
        this.C = new w0(0, this);
        this.D = new x0(this, 0);
        this.E = new x0(this, 1);
        i(context);
        this.F = new av();
        a1 a1Var = new a1(context);
        a1Var.setWillNotDraw(true);
        this.G = a1Var;
        addView(a1Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        z0 z0Var = (z0) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) z0Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) z0Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) z0Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) z0Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) z0Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) z0Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) z0Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) z0Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.yu
    public final void a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.yu
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof z0;
    }

    @Override // defpackage.zu
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.k != null) {
            if (this.i.getVisibility() == 0) {
                i = (int) (this.i.getTranslationY() + this.i.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.k.setBounds(0, i, getWidth(), this.k.getIntrinsicHeight() + i);
            this.k.draw(canvas);
        }
    }

    @Override // defpackage.yu
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.yu
    public final boolean f(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new z0(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new z0(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        av avVar = this.F;
        return avVar.b | avVar.a;
    }

    public CharSequence getTitle() {
        k();
        return ((r50) this.j).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.A = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((r50) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((r50) this.j).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        ae wrapper;
        if (this.h == null) {
            this.h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.i = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof ae) {
                wrapper = (ae) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    l8.u("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.j = wrapper;
        }
    }

    public final void l(Menu menu, ht htVar) {
        k();
        r50 r50Var = (r50) this.j;
        Toolbar toolbar = r50Var.a;
        if (r50Var.m == null) {
            k1 k1Var = new k1(toolbar.getContext());
            r50Var.m = k1Var;
            k1Var.n = R.id.action_menu_presenter;
        }
        k1 k1Var2 = r50Var.m;
        k1Var2.j = htVar;
        ss ssVar = (ss) menu;
        if (ssVar == null && toolbar.f == null) {
            return;
        }
        toolbar.f();
        ss ssVar2 = toolbar.f.u;
        if (ssVar2 == ssVar) {
            return;
        }
        if (ssVar2 != null) {
            ssVar2.r(toolbar.P);
            ssVar2.r(toolbar.Q);
        }
        if (toolbar.Q == null) {
            toolbar.Q = new m50(toolbar);
        }
        k1Var2.w = true;
        Context context = toolbar.o;
        if (ssVar != null) {
            ssVar.b(k1Var2, context);
            ssVar.b(toolbar.Q, toolbar.o);
        } else {
            k1Var2.i(context, null);
            toolbar.Q.i(toolbar.o, null);
            k1Var2.j(true);
            toolbar.Q.j(true);
        }
        toolbar.f.setPopupTheme(toolbar.p);
        toolbar.f.setPresenter(k1Var2);
        toolbar.P = k1Var2;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        db0 g = db0.g(this, windowInsets);
        boolean g2 = g(this.i, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = f80.a;
        Rect rect = this.r;
        x70.b(this, g, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        ab0 ab0Var = g.a;
        db0 q = ab0Var.q(i, i2, i3, i4);
        this.v = q;
        boolean z = true;
        if (!this.w.equals(q)) {
            this.w = this.v;
            g2 = true;
        }
        Rect rect2 = this.s;
        if (rect2.equals(rect)) {
            z = g2;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return ab0Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = f80.a;
        requestApplyInsets();
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
                z0 z0Var = (z0) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) z0Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) z0Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.i, i, 0, i2, 0);
        z0 z0Var = (z0) this.i.getLayoutParams();
        int max = Math.max(0, this.i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) z0Var).leftMargin + ((ViewGroup.MarginLayoutParams) z0Var).rightMargin);
        int max2 = Math.max(0, this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z0Var).topMargin + ((ViewGroup.MarginLayoutParams) z0Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.i.getMeasuredState());
        WeakHashMap weakHashMap = f80.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f;
            if (this.m && this.i.getTabContainer() != null) {
                measuredHeight += this.f;
            }
        } else {
            measuredHeight = this.i.getVisibility() != 8 ? this.i.getMeasuredHeight() : 0;
        }
        Rect rect = this.r;
        Rect rect2 = this.t;
        rect2.set(rect);
        this.x = this.v;
        if (!this.l && !z) {
            a1 a1Var = this.G;
            db0 db0Var = I;
            Rect rect3 = this.u;
            x70.b(a1Var, db0Var, rect3);
            if (!rect3.equals(J)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.x = this.x.a.q(0, measuredHeight, 0, 0);
                g(this.h, rect2, true);
                if (!this.y.equals(this.x)) {
                    db0 db0Var2 = this.x;
                    this.y = db0Var2;
                    f80.b(this.h, db0Var2);
                }
                measureChildWithMargins(this.h, i, 0, i2, 0);
                z0 z0Var2 = (z0) this.h.getLayoutParams();
                int max3 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) z0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) z0Var2).rightMargin);
                int max4 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z0Var2).topMargin + ((ViewGroup.MarginLayoutParams) z0Var2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
            }
        }
        io c = io.c(this.x.b(), this.x.d() + measuredHeight, this.x.c(), this.x.a());
        db0 db0Var3 = this.x;
        int i3 = Build.VERSION.SDK_INT;
        ra0 qa0Var = i3 >= 36 ? new qa0(db0Var3) : i3 >= 35 ? new pa0(db0Var3) : i3 >= 34 ? new oa0(db0Var3) : i3 >= 31 ? new na0(db0Var3) : i3 >= 30 ? new ma0(db0Var3) : i3 >= 29 ? new la0(db0Var3) : new ka0(db0Var3);
        qa0Var.h(c);
        this.x = qa0Var.b();
        g(this.h, rect2, true);
        if (!this.y.equals(this.x)) {
        }
        measureChildWithMargins(this.h, i, 0, i2, 0);
        z0 z0Var22 = (z0) this.h.getLayoutParams();
        int max32 = Math.max(max, this.h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) z0Var22).leftMargin + ((ViewGroup.MarginLayoutParams) z0Var22).rightMargin);
        int max42 = Math.max(max2, this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) z0Var22).topMargin + ((ViewGroup.MarginLayoutParams) z0Var22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i2, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        this.A.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A.getFinalY() > this.i.getHeight()) {
            h();
            this.E.run();
        } else {
            h();
            this.D.run();
        }
        this.o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.p + i2;
        this.p = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ca0 ca0Var;
        w80 w80Var;
        this.F.a = i;
        this.p = getActionBarHideOffset();
        h();
        y0 y0Var = this.z;
        if (y0Var == null || (w80Var = (ca0Var = (ca0) y0Var).s) == null) {
            return;
        }
        w80Var.a();
        ca0Var.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.i.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.n || this.o) {
            return;
        }
        if (this.p <= this.i.getHeight()) {
            h();
            postDelayed(this.D, 600L);
        } else {
            h();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.q ^ i;
        this.q = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        y0 y0Var = this.z;
        if (y0Var != null) {
            ca0 ca0Var = (ca0) y0Var;
            ca0Var.o = !z2;
            if (z || !z2) {
                if (ca0Var.p) {
                    ca0Var.p = false;
                    ca0Var.f(true);
                }
            } else if (!ca0Var.p) {
                ca0Var.p = true;
                ca0Var.f(true);
            }
        }
        if ((i2 & 256) == 0 || this.z == null) {
            return;
        }
        WeakHashMap weakHashMap = f80.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.g = i;
        y0 y0Var = this.z;
        if (y0Var != null) {
            ((ca0) y0Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.i.setTranslationY(-Math.max(0, Math.min(i, this.i.getHeight())));
    }

    public void setActionBarVisibilityCallback(y0 y0Var) {
        this.z = y0Var;
        if (getWindowToken() != null) {
            ((ca0) this.z).n = this.g;
            int i = this.q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = f80.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        r50 r50Var = (r50) this.j;
        r50Var.d = i != 0 ? vv.t(r50Var.a.getContext(), i) : null;
        r50Var.c();
    }

    public void setLogo(int i) {
        k();
        r50 r50Var = (r50) this.j;
        r50Var.e = i != 0 ? vv.t(r50Var.a.getContext(), i) : null;
        r50Var.c();
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((r50) this.j).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        r50 r50Var = (r50) this.j;
        if (r50Var.g) {
            return;
        }
        Toolbar toolbar = r50Var.a;
        r50Var.h = charSequence;
        if ((r50Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (r50Var.g) {
                f80.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new z0(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        r50 r50Var = (r50) this.j;
        r50Var.d = drawable;
        r50Var.c();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.yu
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
    }
}

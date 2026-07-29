package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import o.AZ;
import o.AbstractC0064Cj;
import o.AbstractC0811c00;
import o.AbstractC0914dZ;
import o.AbstractC0979eZ;
import o.AbstractC1052fg;
import o.AbstractC1352kE;
import o.AbstractC1769qZ;
import o.C0785bb;
import o.C1045fZ;
import o.C1286jE;
import o.C1484mE;
import o.C1590ns;
import o.C1682pE;
import o.C2173wi;
import o.IZ;
import o.InterfaceC1418lE;
import o.InterfaceC1550nE;
import o.InterfaceC1616oE;
import o.JZ;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1616oE {
    public static final float I = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final C1286jE J = new C1286jE();
    public static final int[] K = {R.attr.fillViewport};
    public final int[] A;
    public int B;
    public int C;
    public C1484mE D;
    public final C1682pE E;
    public final C0785bb F;
    public float G;
    public final C2173wi H;
    public final float h;
    public long i;
    public final Rect j;
    public final OverScroller k;
    public final EdgeEffect l;
    public final EdgeEffect m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7o;
    public boolean p;
    public View q;
    public boolean r;
    public VelocityTracker s;
    public boolean t;
    public boolean u;
    public final int v;
    public final int w;
    public final int x;
    public int y;
    public final int[] z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.devanos.nilufar.usmonova.R.attr.nestedScrollViewStyle);
        this.j = new Rect();
        this.f7o = true;
        this.p = false;
        this.q = null;
        this.r = false;
        this.u = true;
        this.y = -1;
        this.z = new int[2];
        this.A = new int[2];
        this.H = new C2173wi(getContext(), new C1590ns(16, this));
        int i = Build.VERSION.SDK_INT;
        this.l = i >= 31 ? AbstractC0064Cj.a(context, attributeSet) : new EdgeEffect(context);
        this.m = i >= 31 ? AbstractC0064Cj.a(context, attributeSet) : new EdgeEffect(context);
        this.h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.k = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.v = viewConfiguration.getScaledTouchSlop();
        this.w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.x = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K, com.devanos.nilufar.usmonova.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.E = new C1682pE();
        C0785bb c0785bb = new C0785bb();
        c0785bb.d = this;
        this.F = c0785bb;
        setNestedScrollingEnabled(true);
        AZ.h(this, J);
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // o.InterfaceC1550nE
    public final void a(View view, View view2, int i, int i2) {
        C1682pE c1682pE = this.E;
        if (i2 == 1) {
            c1682pE.b = i;
        } else {
            c1682pE.a = i;
        }
        w(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // o.InterfaceC1550nE
    public final void b(View view, int i) {
        C1682pE c1682pE = this.E;
        if (i == 1) {
            c1682pE.b = 0;
        } else {
            c1682pE.a = 0;
        }
        y(i);
    }

    @Override // o.InterfaceC1616oE
    public final void c(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o(i4, i5, iArr);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        int i2;
        if (this.k.isFinished()) {
            return;
        }
        this.k.computeScrollOffset();
        int currY = this.k.getCurrY();
        int i3 = currY - this.C;
        int height = getHeight();
        EdgeEffect edgeEffect = this.l;
        EdgeEffect edgeEffect2 = this.m;
        if (i3 <= 0 || AbstractC1052fg.y(edgeEffect) == 0.0f) {
            if (i3 < 0 && AbstractC1052fg.y(edgeEffect2) != 0.0f) {
                float f = height;
                round = Math.round(AbstractC1052fg.I(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i3) {
                    edgeEffect2.finish();
                }
            }
            this.C = currY;
            int[] iArr = this.A;
            iArr[1] = 0;
            i(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (i == 0) {
                int scrollY = getScrollY();
                q(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.F.b(0, scrollY2, 0, i4, this.z, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i2 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.k.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.k.getCurrVelocity());
                    }
                }
                this.k.abortAnimation();
                y(i2);
            }
            if (this.k.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                y(i2);
                return;
            }
        }
        round = Math.round(AbstractC1052fg.I(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i3) {
            edgeEffect.finish();
        }
        i3 -= round;
        this.C = currY;
        int[] iArr2 = this.A;
        iArr2[1] = 0;
        i(0, i3, 1, iArr2, null);
        i = i3 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i == 0) {
        }
        if (i != 0) {
        }
        if (this.k.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // o.InterfaceC1550nE
    public final void d(int i, int i2, int[] iArr, int i3) {
        i(i, i2, i3, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent c;
        C0785bb c0785bb = this.F;
        if (c0785bb.a && (c = c0785bb.c(0)) != null) {
            try {
                return AbstractC0811c00.a(c, (NestedScrollView) c0785bb.d, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.F.a(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return i(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.F.b(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.l;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (AbstractC1352kE.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (AbstractC1352kE.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.m;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (AbstractC1352kE.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = getPaddingLeft();
        }
        if (AbstractC1352kE.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // o.InterfaceC1550nE
    public final void e(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        o(i4, i5, null);
    }

    @Override // o.InterfaceC1550nE
    public final boolean f(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !n(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.j;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            t(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && !n(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1682pE c1682pE = this.E;
        return c1682pE.b | c1682pE.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.G = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.G;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.F.c(0) != null;
    }

    public final boolean i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent c;
        int i4;
        int i5;
        C0785bb c0785bb = this.F;
        NestedScrollView nestedScrollView = (NestedScrollView) c0785bb.d;
        if (!c0785bb.a || (c = c0785bb.c(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (((int[]) c0785bb.e) == null) {
                c0785bb.e = new int[2];
            }
            iArr = (int[]) c0785bb.e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        NestedScrollView nestedScrollView2 = (NestedScrollView) c0785bb.d;
        if (c instanceof InterfaceC1550nE) {
            ((InterfaceC1550nE) c).d(i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                AbstractC0811c00.c(c, nestedScrollView2, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.F.a;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.j.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : g(130);
                    }
                    if (keyCode == 62) {
                        r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final void k(int i) {
        if (getChildCount() > 0) {
            this.k.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.C = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.j;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i, int i2) {
        Rect rect = this.j;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.F.b(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x011c, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d1, code lost:
    
        if (r4 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        float f2;
        float f3;
        long j;
        float f4;
        float sqrt;
        int i7;
        int i8;
        float f5;
        if (motionEvent.getAction() != 8 || this.r) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            f = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            i2 = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * f)), i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C2173wi c2173wi = this.H;
        NestedScrollView nestedScrollView = (NestedScrollView) c2173wi.b.i;
        int[] iArr = c2173wi.h;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i9 = 1;
        if (c2173wi.f == source && c2173wi.g == deviceId && c2173wi.e == i) {
            z = false;
            i3 = 0;
        } else {
            Context context = c2173wi.a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            i3 = 0;
            int source2 = motionEvent.getSource();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                Method method = JZ.a;
                i4 = IZ.b(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = JZ.a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i4 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i4 = Integer.MAX_VALUE;
            }
            iArr[0] = i4;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i10 >= 34) {
                i5 = IZ.a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i5 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i5 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i5 = Integer.MIN_VALUE;
            }
            iArr[1] = i5;
            c2173wi.f = source;
            c2173wi.g = deviceId;
            c2173wi.e = i;
            z = true;
        }
        if (iArr[i3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = c2173wi.c;
            if (velocityTracker == null) {
                return true;
            }
            velocityTracker.recycle();
            c2173wi.c = null;
            return true;
        }
        if (c2173wi.c == null) {
            c2173wi.c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = c2173wi.c;
        Map map = AbstractC0979eZ.a;
        velocityTracker2.addMovement(motionEvent);
        int i11 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0979eZ.a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C1045fZ());
            }
            C1045fZ c1045fZ = (C1045fZ) map2.get(velocityTracker2);
            long[] jArr = c1045fZ.b;
            long eventTime = motionEvent.getEventTime();
            if (c1045fZ.d != 0 && eventTime - jArr[c1045fZ.e] > 40) {
                c1045fZ.d = i3;
                c1045fZ.c = 0.0f;
            }
            int i12 = (c1045fZ.e + 1) % 20;
            c1045fZ.e = i12;
            int i13 = c1045fZ.d;
            if (i13 != 20) {
                c1045fZ.d = i13 + 1;
            }
            c1045fZ.a[i12] = motionEvent.getAxisValue(26);
            jArr[c1045fZ.e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C1045fZ c1045fZ2 = (C1045fZ) AbstractC0979eZ.a.get(velocityTracker2);
        if (c1045fZ2 != null) {
            float[] fArr = c1045fZ2.a;
            long[] jArr2 = c1045fZ2.b;
            int i14 = c1045fZ2.d;
            if (i14 >= 2) {
                int i15 = c1045fZ2.e;
                int i16 = ((i15 + 20) - (i14 - 1)) % 20;
                long j2 = jArr2[i15];
                while (true) {
                    j = jArr2[i16];
                    if (j2 - j <= 100) {
                        break;
                    }
                    c1045fZ2.d--;
                    i16 = (i16 + 1) % 20;
                }
                int i17 = c1045fZ2.d;
                if (i17 >= 2) {
                    if (i17 == 2) {
                        int i18 = (i16 + 1) % 20;
                        if (j != jArr2[i18]) {
                            i6 = i;
                            f4 = Float.MAX_VALUE;
                            i7 = 1000;
                            sqrt = fArr[i18] / (r12 - j);
                        }
                    } else {
                        f4 = Float.MAX_VALUE;
                        float f6 = 0.0f;
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            if (i19 >= c1045fZ2.d - 1) {
                                break;
                            }
                            int i21 = i19 + i16;
                            long j3 = jArr2[i21 % 20];
                            int i22 = (i21 + 1) % i11;
                            if (jArr2[i22] == j3) {
                                i8 = i;
                            } else {
                                i20++;
                                i8 = i;
                                float sqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                float f7 = fArr[i22] / (jArr2[i22] - j3);
                                float abs = (Math.abs(f7) * (f7 - sqrt2)) + f6;
                                if (i20 == i9) {
                                    abs *= 0.5f;
                                }
                                f6 = abs;
                            }
                            i19++;
                            i = i8;
                            i11 = 20;
                            i9 = 1;
                        }
                        i6 = i;
                        sqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                        i7 = 1000;
                    }
                    f5 = sqrt * i7;
                    c1045fZ2.c = f5;
                    if (f5 >= (-Math.abs(f4))) {
                        c1045fZ2.c = -Math.abs(f4);
                    } else if (c1045fZ2.c > Math.abs(f4)) {
                        c1045fZ2.c = Math.abs(f4);
                    }
                }
            }
            i6 = i;
            f4 = Float.MAX_VALUE;
            i7 = 1000;
            sqrt = 0.0f;
            f5 = sqrt * i7;
            c1045fZ2.c = f5;
            if (f5 >= (-Math.abs(f4))) {
            }
        } else {
            i6 = i;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f2 = AbstractC0914dZ.a(velocityTracker2, i6);
        } else {
            int i23 = i6;
            if (i23 == 0) {
                f2 = velocityTracker2.getXVelocity();
            } else if (i23 == 1) {
                f2 = velocityTracker2.getYVelocity();
            } else {
                C1045fZ c1045fZ3 = (C1045fZ) AbstractC0979eZ.a.get(velocityTracker2);
                f2 = (c1045fZ3 == null || i23 != 26) ? 0.0f : c1045fZ3.c;
            }
        }
        float f8 = f2 * (-nestedScrollView.getVerticalScrollFactorCompat());
        float signum = Math.signum(f8);
        if (z || (signum != Math.signum(c2173wi.d) && signum != 0.0f)) {
            nestedScrollView.k.abortAnimation();
        }
        if (Math.abs(f8) < iArr[0]) {
            return true;
        }
        float max = Math.max(-r1, Math.min(f8, iArr[1]));
        if (max == 0.0f) {
            f3 = 0.0f;
        } else {
            nestedScrollView.k.abortAnimation();
            nestedScrollView.k((int) max);
            f3 = max;
        }
        c2173wi.d = f3;
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.r) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.y;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.n) > this.v && (2 & getNestedScrollAxes()) == 0) {
                                this.r = true;
                                this.n = y;
                                if (this.s == null) {
                                    this.s = VelocityTracker.obtain();
                                }
                                this.s.addMovement(motionEvent);
                                this.B = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        p(motionEvent);
                    }
                }
            }
            this.r = false;
            this.y = -1;
            VelocityTracker velocityTracker = this.s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.s = null;
            }
            if (this.k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.n = y2;
                    this.y = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.s;
                    if (velocityTracker2 == null) {
                        this.s = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.s.addMovement(motionEvent);
                    this.k.computeScrollOffset();
                    if (!x(motionEvent) && this.k.isFinished()) {
                        z = false;
                    }
                    this.r = z;
                    w(2, 0);
                }
            }
            if (!x(motionEvent) && this.k.isFinished()) {
                z = false;
            }
            this.r = z;
            VelocityTracker velocityTracker3 = this.s;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.s = null;
            }
        }
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f7o = false;
        View view = this.q;
        if (view != null && m(view, this)) {
            View view2 = this.q;
            Rect rect = this.j;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.q = null;
        if (!this.p) {
            if (this.D != null) {
                scrollTo(getScrollX(), this.D.h);
                this.D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.t && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.F.a(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        i(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && n(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1484mE)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1484mE c1484mE = (C1484mE) parcelable;
        super.onRestoreInstanceState(c1484mE.getSuperState());
        this.D = c1484mE;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1484mE c1484mE = new C1484mE(super.onSaveInstanceState());
        c1484mE.h = getScrollY();
        return c1484mE;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !n(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.j;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.u) {
                v(0, h, false);
            } else {
                scrollBy(0, h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float I2;
        int round;
        int i;
        ViewParent parent2;
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.B);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.l;
            EdgeEffect edgeEffect2 = this.m;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.s;
                velocityTracker.computeCurrentVelocity(1000, this.x);
                int yVelocity = (int) velocityTracker.getYVelocity(this.y);
                if (Math.abs(yVelocity) >= this.w) {
                    if (AbstractC1052fg.y(edgeEffect) != 0.0f) {
                        if (u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (AbstractC1052fg.y(edgeEffect2) != 0.0f) {
                        int i2 = -yVelocity;
                        if (u(edgeEffect2, i2)) {
                            edgeEffect2.onAbsorb(i2);
                        } else {
                            k(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!this.F.a(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            k(i3);
                        }
                    }
                } else if (this.k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.y = -1;
                this.r = false;
                VelocityTracker velocityTracker2 = this.s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.s = null;
                }
                y(0);
                this.l.onRelease();
                this.m.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.y);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.y + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i4 = this.n - y;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (AbstractC1052fg.y(edgeEffect) != 0.0f) {
                        I2 = -AbstractC1052fg.I(edgeEffect, -height, x);
                        if (AbstractC1052fg.y(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (AbstractC1052fg.y(edgeEffect2) != 0.0f) {
                            I2 = AbstractC1052fg.I(edgeEffect2, height, 1.0f - x);
                            if (AbstractC1052fg.y(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i = i4 - round;
                        if (!this.r && Math.abs(i) > this.v) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.r = true;
                            i = i <= 0 ? i - this.v : i + this.v;
                        }
                        if (this.r) {
                            int t = t(i, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.n = y - t;
                            this.B += t;
                        }
                    }
                    f = I2;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    i = i4 - round;
                    if (!this.r) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.r = true;
                        if (i <= 0) {
                        }
                    }
                    if (this.r) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.r && getChildCount() > 0) {
                    if (this.k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.y = -1;
                this.r = false;
                VelocityTracker velocityTracker3 = this.s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.s = null;
                }
                y(0);
                this.l.onRelease();
                this.m.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.n = (int) motionEvent.getY(actionIndex);
                this.y = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.n = (int) motionEvent.getY(motionEvent.findPointerIndex(this.y));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.r && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.k.isFinished()) {
                this.k.abortAnimation();
                y(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.n = y2;
            this.y = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.s;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.y) {
            int i = actionIndex == 0 ? 1 : 0;
            this.n = (int) motionEvent.getY(i);
            this.y = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z2 = false;
                if (z2 && this.F.c(1) == null) {
                    this.k.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.k.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    public final void r(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.j;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        s(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f7o) {
            this.q = view2;
        } else {
            Rect rect = this.j;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z2 = h != 0;
        if (z2) {
            if (z) {
                scrollBy(0, h);
                return z2;
            }
            v(0, h, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f7o = true;
        super.requestLayout();
    }

    public final boolean s(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            t(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.t) {
            this.t = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0785bb c0785bb = this.F;
        if (c0785bb.a) {
            NestedScrollView nestedScrollView = (NestedScrollView) c0785bb.d;
            WeakHashMap weakHashMap = AZ.a;
            AbstractC1769qZ.z(nestedScrollView);
        }
        c0785bb.a = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.u = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return w(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        boolean z2;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            w(2, i3);
        }
        boolean i6 = i(0, i, i3, this.A, this.z);
        int[] iArr = this.z;
        int[] iArr2 = this.A;
        if (i6) {
            i4 = i - iArr2[1];
            i5 = iArr[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = q(i4, 0, scrollY, scrollRange) && this.F.c(i3) == null;
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.F.b(0, scrollY2, 0, i4 - scrollY2, this.z, i3, iArr2);
        int i7 = i5 + iArr[1];
        int i8 = i4 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.m;
        EdgeEffect edgeEffect2 = this.l;
        if (i9 < 0) {
            if (z3) {
                AbstractC1052fg.I(edgeEffect2, (-i8) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z3) {
            AbstractC1052fg.I(edgeEffect, i8 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
            z2 = false;
        }
        if (z2 && i3 == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            y(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    public final boolean u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float y = AbstractC1052fg.y(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.h * 0.015f;
        double log = Math.log(abs / f);
        double d = I;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < y;
    }

    public final void v(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.i > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.k.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z) {
                w(2, 1);
            } else {
                y(1);
            }
            this.C = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.k.isFinished()) {
                this.k.abortAnimation();
                y(1);
            }
            scrollBy(i, i2);
        }
        this.i = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i, int i2) {
        boolean f;
        C0785bb c0785bb = this.F;
        NestedScrollView nestedScrollView = (NestedScrollView) c0785bb.d;
        if (c0785bb.c(i2) != null) {
            return true;
        }
        if (c0785bb.a) {
            View view = nestedScrollView;
            for (ViewParent parent = nestedScrollView.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof InterfaceC1550nE;
                if (z) {
                    f = ((InterfaceC1550nE) parent).f(view, nestedScrollView, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            f = AbstractC0811c00.f(parent, view, nestedScrollView, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    f = false;
                }
                if (f) {
                    if (i2 == 0) {
                        c0785bb.b = parent;
                    } else if (i2 == 1) {
                        c0785bb.c = parent;
                    }
                    if (z) {
                        ((InterfaceC1550nE) parent).a(view, nestedScrollView, i, i2);
                        return true;
                    }
                    if (i2 != 0) {
                        return true;
                    }
                    try {
                        AbstractC0811c00.e(parent, view, nestedScrollView, i);
                        return true;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.l;
        if (AbstractC1052fg.y(edgeEffect) != 0.0f) {
            AbstractC1052fg.I(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.m;
        if (AbstractC1052fg.y(edgeEffect2) == 0.0f) {
            return z;
        }
        AbstractC1052fg.I(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i) {
        C0785bb c0785bb = this.F;
        ViewParent c = c0785bb.c(i);
        if (c != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) c0785bb.d;
            if (c instanceof InterfaceC1550nE) {
                ((InterfaceC1550nE) c).b(nestedScrollView, i);
            } else if (i == 0) {
                try {
                    AbstractC0811c00.g(c, nestedScrollView);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                c0785bb.b = null;
            } else {
                if (i != 1) {
                    return;
                }
                c0785bb.c = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC1418lE interfaceC1418lE) {
    }
}

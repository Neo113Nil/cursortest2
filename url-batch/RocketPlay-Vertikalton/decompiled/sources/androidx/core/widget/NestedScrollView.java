package androidx.core.widget;

import A1.d;
import F1.l;
import K.A;
import K.AbstractC0031y;
import K.AbstractC0032z;
import K.C0015h;
import K.C0021n;
import K.C0024q;
import K.H;
import K.InterfaceC0023p;
import K.T;
import K.W;
import Q.e;
import Q.h;
import Q.i;
import Q.j;
import Q.k;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0023p {

    /* renamed from: B, reason: collision with root package name */
    public static final float f1835B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final h f1836C = new h(0);

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f1837D = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0015h f1838A;

    /* renamed from: a, reason: collision with root package name */
    public final float f1839a;

    /* renamed from: b, reason: collision with root package name */
    public long f1840b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1841c;
    public final OverScroller d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f1842e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1843f;

    /* renamed from: g, reason: collision with root package name */
    public int f1844g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public View f1845j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1846k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1847l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1848m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1849n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1850o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1851p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1852q;

    /* renamed from: r, reason: collision with root package name */
    public int f1853r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1854s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1855t;

    /* renamed from: u, reason: collision with root package name */
    public int f1856u;

    /* renamed from: v, reason: collision with root package name */
    public int f1857v;

    /* renamed from: w, reason: collision with root package name */
    public k f1858w;

    /* renamed from: x, reason: collision with root package name */
    public final C0024q f1859x;

    /* renamed from: y, reason: collision with root package name */
    public final C0021n f1860y;

    /* renamed from: z, reason: collision with root package name */
    public float f1861z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luckycounter.drinkwater.R.attr.nestedScrollViewStyle);
        this.f1841c = new Rect();
        this.h = true;
        this.i = false;
        this.f1845j = null;
        this.f1846k = false;
        this.f1849n = true;
        this.f1853r = -1;
        this.f1854s = new int[2];
        this.f1855t = new int[2];
        this.f1838A = new C0015h(getContext(), new d(13, this));
        int i = Build.VERSION.SDK_INT;
        this.f1842e = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1843f = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1839a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1850o = viewConfiguration.getScaledTouchSlop();
        this.f1851p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1852q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1837D, com.luckycounter.drinkwater.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1859x = new C0024q();
        this.f1860y = new C0021n(this);
        setNestedScrollingEnabled(true);
        T.l(this, f1836C);
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // K.InterfaceC0022o
    public final void a(View view, View view2, int i, int i2) {
        C0024q c0024q = this.f1859x;
        if (i2 == 1) {
            c0024q.f703b = i;
        } else {
            c0024q.f702a = i;
        }
        this.f1860y.g(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // K.InterfaceC0023p
    public final void b(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(i4, i5, iArr);
    }

    @Override // K.InterfaceC0022o
    public final void c(View view, int i, int i2, int i3, int i4, int i5) {
        n(i4, i5, null);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        if (this.d.isFinished()) {
            return;
        }
        this.d.computeScrollOffset();
        int currY = this.d.getCurrY();
        int i2 = currY - this.f1857v;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1843f;
        EdgeEffect edgeEffect2 = this.f1842e;
        if (i2 <= 0 || l.B(edgeEffect2) == RecyclerView.f1949A0) {
            if (i2 < 0 && l.B(edgeEffect) != RecyclerView.f1949A0) {
                float f2 = height;
                round = Math.round(l.Y(edgeEffect, (i2 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
                if (round != i2) {
                    edgeEffect.finish();
                }
            }
            this.f1857v = currY;
            int[] iArr = this.f1855t;
            iArr[1] = 0;
            this.f1860y.c(0, i2, iArr, null, 1);
            i = i2 - iArr[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i - scrollY2;
                iArr[1] = 0;
                this.f1860y.d(0, scrollY2, 0, i3, this.f1854s, 1, iArr);
                i = i3 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.d.getCurrVelocity());
                    }
                }
                this.d.abortAnimation();
                w(1);
            }
            if (this.d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                w(1);
                return;
            }
        }
        round = Math.round(l.Y(edgeEffect2, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i2) {
            edgeEffect2.finish();
        }
        i2 -= round;
        this.f1857v = currY;
        int[] iArr2 = this.f1855t;
        iArr2[1] = 0;
        this.f1860y.c(0, i2, iArr2, null, 1);
        i = i2 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.d.isFinished()) {
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
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // K.InterfaceC0022o
    public final void d(View view, int i) {
        C0024q c0024q = this.f1859x;
        if (i == 1) {
            c0024q.f703b = 0;
        } else {
            c0024q.f702a = 0;
        }
        w(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1860y.a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1860y.b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1860y.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1860y.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1842e;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (i.a(this)) {
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
        EdgeEffect edgeEffect2 = this.f1843f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, RecyclerView.f1949A0);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // K.InterfaceC0022o
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        this.f1860y.c(i, i2, iArr, null, i3);
    }

    @Override // K.InterfaceC0022o
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
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
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
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1841c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && !m(findFocus, 0, getHeight())) {
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
            return RecyclerView.f1949A0;
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
        C0024q c0024q = this.f1859x;
        return c0024q.f703b | c0024q.f702a;
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
            return RecyclerView.f1949A0;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1861z == RecyclerView.f1949A0) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1861z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1861z;
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
        return this.f1860y.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f1841c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? k(33) : g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? k(130) : g(130);
                }
                if (keyCode == 62) {
                    q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return k(33);
                }
                if (keyCode == 93) {
                    return k(130);
                }
                if (keyCode == 122) {
                    q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1860y.d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1860y.g(2, 1);
            this.f1857v = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f1841c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i2) {
        Rect rect = this.f1841c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
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

    public final void n(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1860y.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1853r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1844g = (int) motionEvent.getY(i);
            this.f1853r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1847l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        int i;
        int i2;
        char c2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c3;
        boolean z2;
        VelocityTracker velocityTracker;
        float f3;
        float f4;
        long j2;
        float sqrt;
        int i4;
        VelocityTracker velocityTracker2;
        float[] fArr;
        int i5;
        float f5;
        if (motionEvent.getAction() != 8 || this.f1846k) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i = 9;
            f2 = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            f2 = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            i = 26;
        } else {
            f2 = 0.0f;
            i = 0;
            i2 = 0;
        }
        if (f2 == RecyclerView.f1949A0) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * f2)), i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i == 0) {
            return true;
        }
        C0015h c0015h = this.f1838A;
        c0015h.getClass();
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i6 = c0015h.f671f;
        int[] iArr = c0015h.h;
        if (i6 == source && c0015h.f672g == deviceId && c0015h.f670e == i) {
            c3 = 0;
            z2 = false;
        } else {
            Context context = c0015h.f667a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                i3 = W.b(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    c2 = 0;
                    i3 = Integer.MAX_VALUE;
                    iArr[c2] = i3;
                    int deviceId3 = motionEvent.getDeviceId();
                    int source3 = motionEvent.getSource();
                    if (i7 < 34) {
                        scaledMaximumFlingVelocity = W.a(viewConfiguration, deviceId3, i, source3);
                    } else {
                        InputDevice device2 = InputDevice.getDevice(deviceId3);
                        int i8 = Integer.MIN_VALUE;
                        if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                            Resources resources = context.getResources();
                            int identifier = (source3 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                            Objects.requireNonNull(viewConfiguration);
                            if (identifier == -1) {
                                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                            } else if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                                i8 = dimensionPixelSize;
                            }
                        }
                        scaledMaximumFlingVelocity = i8;
                    }
                    iArr[1] = scaledMaximumFlingVelocity;
                    c0015h.f671f = source;
                    c0015h.f672g = deviceId;
                    c0015h.f670e = i;
                    c3 = 0;
                    z2 = true;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source2 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        i3 = Integer.MAX_VALUE;
                    }
                    i3 = scaledMinimumFlingVelocity;
                }
            }
            c2 = 0;
            iArr[c2] = i3;
            int deviceId32 = motionEvent.getDeviceId();
            int source32 = motionEvent.getSource();
            if (i7 < 34) {
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0015h.f671f = source;
            c0015h.f672g = deviceId;
            c0015h.f670e = i;
            c3 = 0;
            z2 = true;
        }
        if (iArr[c3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker3 = c0015h.f669c;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                c0015h.f669c = null;
            }
        } else {
            if (c0015h.f669c == null) {
                c0015h.f669c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker4 = c0015h.f669c;
            Map map = AbstractC0032z.f727a;
            velocityTracker4.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0032z.f727a;
                if (!map2.containsKey(velocityTracker4)) {
                    map2.put(velocityTracker4, new A());
                }
                A a2 = (A) map2.get(velocityTracker4);
                a2.getClass();
                long eventTime = motionEvent.getEventTime();
                int i9 = a2.d;
                long[] jArr = a2.f614b;
                if (i9 != 0 && eventTime - jArr[a2.f616e] > 40) {
                    a2.d = 0;
                    a2.f615c = RecyclerView.f1949A0;
                }
                int i10 = (a2.f616e + 1) % 20;
                a2.f616e = i10;
                int i11 = a2.d;
                if (i11 != 20) {
                    a2.d = i11 + 1;
                }
                a2.f613a[i10] = motionEvent.getAxisValue(26);
                jArr[a2.f616e] = eventTime;
            }
            velocityTracker4.computeCurrentVelocity(1000, Float.MAX_VALUE);
            A a3 = (A) AbstractC0032z.f727a.get(velocityTracker4);
            if (a3 != null) {
                int i12 = a3.d;
                if (i12 >= 2) {
                    int i13 = a3.f616e;
                    int i14 = ((i13 + 20) - (i12 - 1)) % 20;
                    long[] jArr2 = a3.f614b;
                    long j3 = jArr2[i13];
                    while (true) {
                        j2 = jArr2[i14];
                        if (j3 - j2 <= 100) {
                            break;
                        }
                        a3.d--;
                        i14 = (i14 + 1) % 20;
                    }
                    int i15 = a3.d;
                    if (i15 >= 2) {
                        float[] fArr2 = a3.f613a;
                        if (i15 == 2) {
                            int i16 = (i14 + 1) % 20;
                            if (j2 != jArr2[i16]) {
                                velocityTracker = velocityTracker4;
                                i4 = 1000;
                                sqrt = fArr2[i16] / (r8 - j2);
                            }
                        } else {
                            float f6 = RecyclerView.f1949A0;
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 >= a3.d - 1) {
                                    break;
                                }
                                int i19 = i17 + i14;
                                long j4 = jArr2[i19 % 20];
                                int i20 = (i19 + 1) % 20;
                                if (jArr2[i20] == j4) {
                                    velocityTracker2 = velocityTracker4;
                                    fArr = fArr2;
                                    i5 = 1;
                                } else {
                                    i18++;
                                    velocityTracker2 = velocityTracker4;
                                    float sqrt2 = (f6 < RecyclerView.f1949A0 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                    float f7 = fArr2[i20];
                                    long j5 = jArr2[i20];
                                    fArr = fArr2;
                                    float f8 = f7 / (j5 - j4);
                                    float abs = (Math.abs(f8) * (f8 - sqrt2)) + f6;
                                    i5 = 1;
                                    if (i18 == 1) {
                                        abs *= 0.5f;
                                    }
                                    f6 = abs;
                                }
                                i17 += i5;
                                fArr2 = fArr;
                                velocityTracker4 = velocityTracker2;
                            }
                            velocityTracker = velocityTracker4;
                            sqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < RecyclerView.f1949A0 ? -1.0f : 1.0f);
                            i4 = 1000;
                        }
                        f5 = sqrt * i4;
                        a3.f615c = f5;
                        if (f5 >= (-Math.abs(Float.MAX_VALUE))) {
                            a3.f615c = -Math.abs(Float.MAX_VALUE);
                        } else if (a3.f615c > Math.abs(Float.MAX_VALUE)) {
                            a3.f615c = Math.abs(Float.MAX_VALUE);
                        }
                    }
                }
                velocityTracker = velocityTracker4;
                i4 = 1000;
                sqrt = RecyclerView.f1949A0;
                f5 = sqrt * i4;
                a3.f615c = f5;
                if (f5 >= (-Math.abs(Float.MAX_VALUE))) {
                }
            } else {
                velocityTracker = velocityTracker4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f3 = AbstractC0031y.a(velocityTracker, i);
            } else {
                VelocityTracker velocityTracker5 = velocityTracker;
                if (i == 0) {
                    f3 = velocityTracker5.getXVelocity();
                } else if (i == 1) {
                    f3 = velocityTracker5.getYVelocity();
                } else {
                    A a4 = (A) AbstractC0032z.f727a.get(velocityTracker5);
                    f3 = (a4 == null || i != 26) ? RecyclerView.f1949A0 : a4.f615c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0015h.f668b.f38b;
            float f9 = f3 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f9);
            if (z2 || (signum != Math.signum(c0015h.d) && signum != RecyclerView.f1949A0)) {
                nestedScrollView.d.abortAnimation();
            }
            if (Math.abs(f9) >= iArr[0]) {
                float max = Math.max(-r4, Math.min(f9, iArr[1]));
                if (max == RecyclerView.f1949A0) {
                    f4 = 0.0f;
                } else {
                    nestedScrollView.d.abortAnimation();
                    nestedScrollView.j((int) max);
                    f4 = max;
                }
                c0015h.d = f4;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1846k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1853r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1844g) > this.f1850o && (2 & getNestedScrollAxes()) == 0) {
                                this.f1846k = true;
                                this.f1844g = y2;
                                if (this.f1847l == null) {
                                    this.f1847l = VelocityTracker.obtain();
                                }
                                this.f1847l.addMovement(motionEvent);
                                this.f1856u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f1846k = false;
            this.f1853r = -1;
            VelocityTracker velocityTracker = this.f1847l;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1847l = null;
            }
            if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.f1844g = y3;
                    this.f1853r = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1847l;
                    if (velocityTracker2 == null) {
                        this.f1847l = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1847l.addMovement(motionEvent);
                    this.d.computeScrollOffset();
                    if (!v(motionEvent) && this.d.isFinished()) {
                        z2 = false;
                    }
                    this.f1846k = z2;
                    this.f1860y.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.d.isFinished()) {
                z2 = false;
            }
            this.f1846k = z2;
            VelocityTracker velocityTracker3 = this.f1847l;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1847l = null;
            }
        }
        return this.f1846k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z2, i, i2, i3, i4);
        int i6 = 0;
        this.h = false;
        View view = this.f1845j;
        if (view != null && l(view, this)) {
            View view2 = this.f1845j;
            Rect rect = this.f1841c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f1845j = null;
        if (!this.i) {
            if (this.f1858w != null) {
                scrollTo(getScrollX(), this.f1858w.f1057a);
                this.f1858w = null;
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
        this.i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1848m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
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
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(RecyclerView.f1949A0, f3, true);
        j((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1860y.b(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.f1860y.c(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
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
        if (findNextFocus != null && m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f1858w = kVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f1057a = getScrollY();
        return kVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f1841c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.f1849n) {
                u(0, h, false);
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
        d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1847l == null) {
            this.f1847l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1856u = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = this.f1856u;
        float f3 = RecyclerView.f1949A0;
        obtain.offsetLocation(RecyclerView.f1949A0, f2);
        C0021n c0021n = this.f1860y;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1843f;
            EdgeEffect edgeEffect2 = this.f1842e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1847l;
                velocityTracker.computeCurrentVelocity(1000, this.f1852q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1853r);
                if (Math.abs(yVelocity) >= this.f1851p) {
                    if (l.B(edgeEffect2) != RecyclerView.f1949A0) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (l.B(edgeEffect) != RecyclerView.f1949A0) {
                        int i = -yVelocity;
                        if (t(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            j(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f4 = i2;
                        if (!c0021n.b(RecyclerView.f1949A0, f4)) {
                            dispatchNestedFling(RecyclerView.f1949A0, f4, true);
                            j(i2);
                        }
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1853r = -1;
                this.f1846k = false;
                VelocityTracker velocityTracker2 = this.f1847l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1847l = null;
                }
                w(0);
                this.f1842e.onRelease();
                this.f1843f.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1853r);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1853r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.f1844g - y2;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i3 / getHeight();
                    if (l.B(edgeEffect2) != RecyclerView.f1949A0) {
                        float f5 = -l.Y(edgeEffect2, -height, x2);
                        if (l.B(edgeEffect2) == RecyclerView.f1949A0) {
                            edgeEffect2.onRelease();
                        }
                        f3 = f5;
                    } else if (l.B(edgeEffect) != RecyclerView.f1949A0) {
                        float Y2 = l.Y(edgeEffect, height, 1.0f - x2);
                        if (l.B(edgeEffect) == RecyclerView.f1949A0) {
                            edgeEffect.onRelease();
                        }
                        f3 = Y2;
                    }
                    int round = Math.round(f3 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i4 = i3 - round;
                    if (!this.f1846k && Math.abs(i4) > this.f1850o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1846k = true;
                        i4 = i4 > 0 ? i4 - this.f1850o : i4 + this.f1850o;
                    }
                    if (this.f1846k) {
                        int s2 = s(i4, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f1844g = y2 - s2;
                        this.f1856u += s2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1846k && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1853r = -1;
                this.f1846k = false;
                VelocityTracker velocityTracker3 = this.f1847l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1847l = null;
                }
                w(0);
                this.f1842e.onRelease();
                this.f1843f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1844g = (int) motionEvent.getY(actionIndex);
                this.f1853r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f1844g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1853r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1846k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.d.isFinished()) {
                this.d.abortAnimation();
                w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1844g = y3;
            this.f1853r = pointerId;
            c0021n.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1847l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z2 = false;
        } else {
            i2 = 0;
            z2 = true;
        }
        if (i5 <= i4) {
            if (i5 >= 0) {
                i4 = i5;
                z3 = false;
                if (z3 && !this.f1860y.f(1)) {
                    this.d.springBack(i2, i4, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i2, i4);
                return z2 || z3;
            }
            i4 = 0;
        }
        z3 = true;
        if (z3) {
            this.d.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i2, i4);
        if (z2) {
            return true;
        }
    }

    public final void q(int i) {
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.f1841c;
        if (z2) {
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
        r(i, i2, i3);
    }

    public final boolean r(int i, int i2, int i3) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z3 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z5 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
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
            s(z3 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.f1845j = view2;
        } else {
            Rect rect = this.f1841c;
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
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z3 = h != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, h);
            } else {
                u(0, h, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1847l) != null) {
            velocityTracker.recycle();
            this.f1847l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final int s(int i, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        VelocityTracker velocityTracker;
        C0021n c0021n = this.f1860y;
        if (i3 == 1) {
            c0021n.g(2, i3);
        }
        boolean c2 = this.f1860y.c(0, i, this.f1855t, this.f1854s, i3);
        int[] iArr = this.f1855t;
        int[] iArr2 = this.f1854s;
        if (c2) {
            i4 = i - iArr[1];
            i5 = iArr2[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = p(i4, 0, scrollY, scrollRange) && !c0021n.f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1860y.d(0, scrollY2, 0, i4 - scrollY2, this.f1854s, i3, iArr);
        int i6 = i5 + iArr2[1];
        int i7 = i4 - iArr[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f1843f;
        EdgeEffect edgeEffect2 = this.f1842e;
        if (i8 < 0) {
            if (z4) {
                l.Y(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z4) {
            l.Y(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i3 == 0 && (velocityTracker = this.f1847l) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            w(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
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

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1848m) {
            this.f1848m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0021n c0021n = this.f1860y;
        if (c0021n.d) {
            WeakHashMap weakHashMap = T.f633a;
            H.z(c0021n.f692c);
        }
        c0021n.d = z2;
    }

    public void setOnScrollChangeListener(j jVar) {
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1849n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f1860y.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float B2 = l.B(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f2 = this.f1839a * 0.015f;
        double log = Math.log(abs / f2);
        double d = f1835B;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f2))) < B2;
    }

    public final void u(int i, int i2, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1840b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                this.f1860y.g(2, 1);
            } else {
                w(1);
            }
            this.f1857v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.d.isFinished()) {
                this.d.abortAnimation();
                w(1);
            }
            scrollBy(i, i2);
        }
        this.f1840b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1842e;
        if (l.B(edgeEffect) != RecyclerView.f1949A0) {
            l.Y(edgeEffect, RecyclerView.f1949A0, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1843f;
        if (l.B(edgeEffect2) == RecyclerView.f1949A0) {
            return z2;
        }
        l.Y(edgeEffect2, RecyclerView.f1949A0, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.f1860y.h(i);
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
}

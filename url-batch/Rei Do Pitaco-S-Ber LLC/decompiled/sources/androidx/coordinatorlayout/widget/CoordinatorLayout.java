package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ionia.reidopitaco.libya.R;
import defpackage.av;
import defpackage.ca;
import defpackage.db0;
import defpackage.e20;
import defpackage.f80;
import defpackage.fx;
import defpackage.gd;
import defpackage.hd;
import defpackage.id;
import defpackage.j0;
import defpackage.jd;
import defpackage.kd;
import defpackage.l8;
import defpackage.l80;
import defpackage.ld;
import defpackage.md;
import defpackage.nw;
import defpackage.oe;
import defpackage.ow;
import defpackage.x70;
import defpackage.yu;
import defpackage.zu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements yu, zu {
    public static final ThreadLocal A;
    public static final ca B;
    public static final ow C;
    public static final String y;
    public static final Class[] z;
    public final ArrayList f;
    public final oe g;
    public final ArrayList h;
    public final ArrayList i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public boolean m;
    public final int[] n;
    public View o;
    public View p;
    public ld q;
    public boolean r;
    public db0 s;
    public boolean t;
    public Drawable u;
    public ViewGroup.OnHierarchyChangeListener v;
    public j0 w;
    public final av x;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        y = r0 != null ? r0.getName() : null;
        B = new ca(1);
        z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal();
        C = new ow(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f = new ArrayList();
        this.g = new oe(1);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new int[2];
        this.k = new int[2];
        this.x = new av();
        int[] iArr = fx.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.n = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.n[i] = (int) (r1[i] * f);
            }
        }
        this.u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new jd(this));
        WeakHashMap weakHashMap = f80.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) C.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i, Rect rect, Rect rect2, kd kdVar, int i2, int i3) {
        int i4 = kdVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = kdVar.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kd n(View view) {
        kd kdVar = (kd) view.getLayoutParams();
        if (!kdVar.b) {
            if (view instanceof gd) {
                hd behavior = ((gd) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                kdVar.b(behavior);
                kdVar.b = true;
                return kdVar;
            }
            id idVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                idVar = (id) cls.getAnnotation(id.class);
                if (idVar != null) {
                    break;
                }
            }
            if (idVar != null) {
                try {
                    kdVar.b((hd) idVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + idVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            kdVar.b = true;
        }
        return kdVar;
    }

    public static void u(View view, int i) {
        kd kdVar = (kd) view.getLayoutParams();
        int i2 = kdVar.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = f80.a;
            view.offsetLeftAndRight(i - i2);
            kdVar.i = i;
        }
    }

    public static void v(View view, int i) {
        kd kdVar = (kd) view.getLayoutParams();
        int i2 = kdVar.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = f80.a;
            view.offsetTopAndBottom(i - i2);
            kdVar.j = i;
        }
    }

    @Override // defpackage.yu
    public final void a(View view, View view2, int i, int i2) {
        av avVar = this.x;
        if (i2 == 1) {
            avVar.b = i;
        } else {
            avVar.a = i;
        }
        this.p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((kd) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // defpackage.yu
    public final void b(View view, int i) {
        av avVar = this.x;
        if (i == 1) {
            avVar.b = 0;
        } else {
            avVar.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            kd kdVar = (kd) childAt.getLayoutParams();
            if (kdVar.a(i)) {
                hd hdVar = kdVar.a;
                if (hdVar != null) {
                    hdVar.p(childAt, view, i);
                }
                if (i == 0) {
                    kdVar.m = false;
                } else if (i == 1) {
                    kdVar.n = false;
                }
                kdVar.o = false;
            }
        }
        this.p = null;
    }

    @Override // defpackage.yu
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        hd hdVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                kd kdVar = (kd) childAt.getLayoutParams();
                if (kdVar.a(i3) && (hdVar = kdVar.a) != null) {
                    int[] iArr2 = this.j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    hdVar.j(this, childAt, view, i, i2, iArr2, i3);
                    i4 = i > 0 ? Math.max(i4, iArr2[0]) : Math.min(i4, iArr2[0]);
                    i5 = i2 > 0 ? Math.max(i5, iArr2[1]) : Math.min(i5, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof kd) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.zu
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        hd hdVar;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                kd kdVar = (kd) childAt.getLayoutParams();
                if (kdVar.a(i5) && (hdVar = kdVar.a) != null) {
                    int[] iArr2 = this.j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    hdVar.k(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        hd hdVar = ((kd) view.getLayoutParams()).a;
        if (hdVar != null) {
            hdVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.yu
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // defpackage.yu
    public final boolean f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                kd kdVar = (kd) childAt.getLayoutParams();
                hd hdVar = kdVar.a;
                if (hdVar != null) {
                    boolean o = hdVar.o(childAt, i, i2);
                    z2 |= o;
                    if (i2 == 0) {
                        kdVar.m = o;
                    } else if (i2 == 1) {
                        kdVar.n = o;
                    }
                } else if (i2 == 0) {
                    kdVar.m = false;
                } else if (i2 == 1) {
                    kdVar.n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kd();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kd ? new kd((kd) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new kd((ViewGroup.MarginLayoutParams) layoutParams) : new kd(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f);
    }

    public final db0 getLastWindowInsets() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        av avVar = this.x;
        return avVar.b | avVar.a;
    }

    public Drawable getStatusBarBackground() {
        return this.u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(kd kdVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) kdVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) kdVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) kdVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) kdVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        e20 e20Var = (e20) this.g.g;
        int i = e20Var.h;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) e20Var.i(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e20Var.f(i2));
            }
        }
        ArrayList arrayList3 = this.i;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = l80.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = l80.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        l80.a(this, view, matrix);
        ThreadLocal threadLocal3 = l80.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i) {
        int[] iArr = this.n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i, int i2) {
        ow owVar = C;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i, i2);
        } finally {
            g.setEmpty();
            owVar.c(g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.r) {
            if (this.q == null) {
                this.q = new ld(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.q);
        }
        if (this.s == null) {
            WeakHashMap weakHashMap = f80.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.r && this.q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.q);
        }
        View view = this.p;
        if (view != null) {
            b(view, 0);
        }
        this.m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.t || this.u == null) {
            return;
        }
        db0 db0Var = this.s;
        int d = db0Var != null ? db0Var.d() : 0;
        if (d > 0) {
            this.u.setBounds(0, 0, getWidth(), d);
            this.u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r;
        }
        t(true);
        return r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        hd hdVar;
        WeakHashMap weakHashMap = f80.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((hdVar = ((kd) view.getLayoutParams()).a) == null || !hdVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        hd hdVar;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        int i14;
        View view;
        int i15;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s();
        int childCount = coordinatorLayout.getChildCount();
        int i16 = 0;
        loop0: while (true) {
            if (i16 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i16);
            e20 e20Var = (e20) coordinatorLayout.g.g;
            int i17 = e20Var.h;
            for (int i18 = 0; i18 < i17; i18++) {
                ArrayList arrayList2 = (ArrayList) e20Var.i(i18);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i16++;
        }
        if (z2 != coordinatorLayout.r) {
            boolean z4 = coordinatorLayout.m;
            if (z2) {
                if (z4) {
                    if (coordinatorLayout.q == null) {
                        coordinatorLayout.q = new ld(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.q);
                }
                coordinatorLayout.r = true;
            } else {
                if (z4 && coordinatorLayout.q != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.q);
                }
                coordinatorLayout.r = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = f80.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z6 = coordinatorLayout.s != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f;
        int size3 = arrayList3.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size3) {
            View view2 = (View) arrayList3.get(i21);
            int i23 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i6 = size3;
                i15 = i21;
                i9 = paddingLeft;
                suggestedMinimumWidth = i23;
                z3 = false;
                i11 = paddingRight;
            } else {
                kd kdVar = (kd) view2.getLayoutParams();
                int i24 = kdVar.e;
                if (i24 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int m = coordinatorLayout.m(i24);
                    int i25 = kdVar.c;
                    if (i25 == 0) {
                        i25 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        max = Math.max(0, (size - paddingRight) - m);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        max = Math.max(0, m - paddingLeft);
                    }
                    int i26 = size3;
                    i5 = max;
                    i4 = i26;
                    if (z6 || view2.getFitsSystemWindows()) {
                        i6 = i4;
                        i7 = i;
                        i8 = i2;
                    } else {
                        i6 = i4;
                        int c = coordinatorLayout.s.c() + coordinatorLayout.s.b();
                        int a = coordinatorLayout.s.a() + coordinatorLayout.s.d();
                        i7 = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - a, mode2);
                    }
                    hdVar = kdVar.a;
                    if (hdVar == null) {
                        z3 = false;
                        i9 = paddingLeft;
                        i10 = i23;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList3;
                        int i27 = i7;
                        i15 = i21;
                        int i28 = i8;
                        boolean h = hdVar.h(this, view2, i27, i5, i28);
                        view = view2;
                        i7 = i27;
                        i13 = i5;
                        i14 = i28;
                        if (h) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) kdVar).leftMargin + ((ViewGroup.MarginLayoutParams) kdVar).rightMargin);
                            int max3 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) kdVar).topMargin + ((ViewGroup.MarginLayoutParams) kdVar).bottomMargin);
                            i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i9 = paddingLeft;
                        i10 = i23;
                        z3 = false;
                        i11 = paddingRight;
                        i12 = i3;
                        arrayList = arrayList3;
                        i13 = i5;
                        i14 = i8;
                        view = view2;
                        i15 = i21;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                    int max22 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) kdVar).leftMargin + ((ViewGroup.MarginLayoutParams) kdVar).rightMargin);
                    int max32 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) kdVar).topMargin + ((ViewGroup.MarginLayoutParams) kdVar).bottomMargin);
                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                }
                i4 = size3;
                i5 = 0;
                if (z6) {
                }
                i6 = i4;
                i7 = i;
                i8 = i2;
                hdVar = kdVar.a;
                if (hdVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i7, i13, i14, 0);
                int max222 = Math.max(i10, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) kdVar).leftMargin + ((ViewGroup.MarginLayoutParams) kdVar).rightMargin);
                int max322 = Math.max(i12, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) kdVar).topMargin + ((ViewGroup.MarginLayoutParams) kdVar).bottomMargin);
                i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i21 = i15 + 1;
            paddingLeft = i9;
            paddingRight = i11;
            size3 = i6;
            arrayList3 = arrayList;
        }
        int i29 = i22;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i29), View.resolveSizeAndState(suggestedMinimumHeight, i2, i29 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                kd kdVar = (kd) childAt.getLayoutParams();
                if (kdVar.a(0)) {
                    hd hdVar = kdVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        hd hdVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                kd kdVar = (kd) childAt.getLayoutParams();
                if (kdVar.a(0) && (hdVar = kdVar.a) != null) {
                    z2 |= hdVar.i(view);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof md)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        md mdVar = (md) parcelable;
        super.onRestoreInstanceState(mdVar.f);
        SparseArray sparseArray = mdVar.h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            hd hdVar = n(childAt).a;
            if (id != -1 && hdVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                hdVar.m(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n;
        md mdVar = new md(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            hd hdVar = ((kd) childAt.getLayoutParams()).a;
            if (id != -1 && hdVar != null && (n = hdVar.n(childAt)) != null) {
                sparseArray.append(id, n);
            }
        }
        mdVar.h = sparseArray;
        return mdVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean q;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.o == null) {
            z2 = r(motionEvent, 1);
        } else {
            z2 = false;
        }
        hd hdVar = ((kd) this.o.getLayoutParams()).a;
        if (hdVar != null) {
            q = hdVar.q(this.o, motionEvent);
            motionEvent2 = null;
            if (this.o != null) {
                q |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return q;
            }
            t(false);
            return q;
        }
        q = false;
        motionEvent2 = null;
        if (this.o != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        t(false);
        return q;
    }

    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList2;
        kd kdVar;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        View view;
        hd hdVar;
        WeakHashMap weakHashMap = f80.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f;
        int size = arrayList3.size();
        Rect g = g();
        Rect g2 = g();
        Rect g3 = g();
        int i13 = 0;
        while (true) {
            ow owVar = C;
            if (i13 >= size) {
                Rect rect3 = g3;
                g.setEmpty();
                owVar.c(g);
                g2.setEmpty();
                owVar.c(g2);
                rect3.setEmpty();
                owVar.c(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i13);
            kd kdVar2 = (kd) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i14 = 0;
                while (i14 < i13) {
                    if (kdVar2.l == ((View) arrayList3.get(i14))) {
                        kd kdVar3 = (kd) view2.getLayoutParams();
                        if (kdVar3.k != null) {
                            Rect g4 = g();
                            Rect g5 = g();
                            kd kdVar4 = kdVar2;
                            Rect g6 = g();
                            k(kdVar3.k, g4);
                            i(view2, g5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            kdVar = kdVar4;
                            i10 = i14;
                            layoutDirection = layoutDirection;
                            i12 = i13;
                            view = view3;
                            l(layoutDirection, g4, g6, kdVar3, measuredWidth, measuredHeight);
                            i11 = size;
                            rect2 = g3;
                            boolean z4 = (g6.left == g5.left && g6.top == g5.top) ? false : true;
                            h(kdVar3, g6, measuredWidth, measuredHeight);
                            int i15 = g6.left - g5.left;
                            int i16 = g6.top - g5.top;
                            if (i15 != 0) {
                                WeakHashMap weakHashMap2 = f80.a;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap weakHashMap3 = f80.a;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z4 && (hdVar = kdVar3.a) != null) {
                                hdVar.d(this, view, kdVar3.k);
                            }
                            g4.setEmpty();
                            owVar.c(g4);
                            g5.setEmpty();
                            owVar.c(g5);
                            g6.setEmpty();
                            owVar.c(g6);
                            i14 = i10 + 1;
                            kdVar2 = kdVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i11;
                            i13 = i12;
                            g3 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    kdVar = kdVar2;
                    i10 = i14;
                    i11 = size;
                    rect2 = g3;
                    i12 = i13;
                    view = view2;
                    i14 = i10 + 1;
                    kdVar2 = kdVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i11;
                    i13 = i12;
                    g3 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                kd kdVar5 = kdVar2;
                int i17 = size;
                Rect rect4 = g3;
                i2 = i13;
                View view4 = view2;
                i(view4, g2, true);
                if (kdVar5.g != 0 && !g2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(kdVar5.g, layoutDirection);
                    int i18 = absoluteGravity & 112;
                    if (i18 == 48) {
                        g.top = Math.max(g.top, g2.bottom);
                    } else if (i18 == 80) {
                        g.bottom = Math.max(g.bottom, getHeight() - g2.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        g.left = Math.max(g.left, g2.right);
                    } else if (i19 == 5) {
                        g.right = Math.max(g.right, getWidth() - g2.left);
                    }
                }
                if (kdVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = f80.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        kd kdVar6 = (kd) view4.getLayoutParams();
                        hd hdVar2 = kdVar6.a;
                        Rect g7 = g();
                        Rect g8 = g();
                        g8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (hdVar2 == null || !hdVar2.a(view4, g7)) {
                            g7.set(g8);
                        } else if (!g8.contains(g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g7.toShortString() + " | Bounds:" + g8.toShortString());
                        }
                        g8.setEmpty();
                        owVar.c(g8);
                        if (g7.isEmpty()) {
                            g7.setEmpty();
                            owVar.c(g7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(kdVar6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (g7.top - ((ViewGroup.MarginLayoutParams) kdVar6).topMargin) - kdVar6.j) >= (i9 = g.top)) {
                                z2 = false;
                            } else {
                                v(view4, i9 - i8);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g7.bottom) - ((ViewGroup.MarginLayoutParams) kdVar6).bottomMargin) + kdVar6.j) < (i7 = g.bottom)) {
                                v(view4, height - i7);
                                z2 = true;
                            }
                            if (!z2) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (g7.left - ((ViewGroup.MarginLayoutParams) kdVar6).leftMargin) - kdVar6.i) >= (i6 = g.left)) {
                                z3 = false;
                            } else {
                                u(view4, i6 - i5);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g7.right) - ((ViewGroup.MarginLayoutParams) kdVar6).rightMargin) + kdVar6.i) < (i4 = g.right)) {
                                u(view4, width - i4);
                                z3 = true;
                            }
                            if (!z3) {
                                u(view4, 0);
                            }
                            g7.setEmpty();
                            owVar.c(g7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect4;
                    rect.set(((kd) view4.getLayoutParams()).p);
                    if (rect.equals(g2)) {
                        arrayList = arrayList4;
                        i3 = i17;
                    } else {
                        ((kd) view4.getLayoutParams()).p.set(g2);
                    }
                } else {
                    rect = rect4;
                }
                int i20 = i2 + 1;
                i3 = i17;
                while (true) {
                    arrayList = arrayList4;
                    if (i20 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i20);
                    kd kdVar7 = (kd) view5.getLayoutParams();
                    hd hdVar3 = kdVar7.a;
                    if (hdVar3 != null && hdVar3.b(view5, view4)) {
                        if (i == 0 && kdVar7.o) {
                            kdVar7.o = false;
                        } else {
                            boolean d = i != 2 ? hdVar3.d(this, view5, view4) : true;
                            if (i == 1) {
                                kdVar7.o = d;
                            }
                        }
                    }
                    i20++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i3 = size;
                rect = g3;
                i2 = i13;
            }
            i13 = i2 + 1;
            g3 = rect;
            size = i3;
            arrayList3 = arrayList;
        }
    }

    public final void q(View view, int i) {
        Rect g;
        Rect g2;
        kd kdVar = (kd) view.getLayoutParams();
        View view2 = kdVar.k;
        if (view2 == null && kdVar.f != -1) {
            l8.u("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        ow owVar = C;
        if (view2 != null) {
            g = g();
            g2 = g();
            try {
                k(view2, g);
                kd kdVar2 = (kd) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, g, g2, kdVar2, measuredWidth, measuredHeight);
                h(kdVar2, g2, measuredWidth, measuredHeight);
                view.layout(g2.left, g2.top, g2.right, g2.bottom);
                return;
            } finally {
                g.setEmpty();
                owVar.c(g);
                g2.setEmpty();
                owVar.c(g2);
            }
        }
        int i2 = kdVar.e;
        if (i2 < 0) {
            kd kdVar3 = (kd) view.getLayoutParams();
            g = g();
            g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) kdVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) kdVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) kdVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) kdVar3).bottomMargin);
            if (this.s != null) {
                WeakHashMap weakHashMap = f80.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g.left = this.s.b() + g.left;
                    g.top = this.s.d() + g.top;
                    g.right -= this.s.c();
                    g.bottom -= this.s.a();
                }
            }
            g2 = g();
            int i3 = kdVar3.c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), g, g2, i);
            view.layout(g2.left, g2.top, g2.right, g2.bottom);
            return;
        }
        kd kdVar4 = (kd) view.getLayoutParams();
        int i4 = kdVar4.c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int m = m(i2) - measuredWidth2;
        if (i5 == 1) {
            m += measuredWidth2 / 2;
        } else if (i5 == 5) {
            m += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) kdVar4).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) kdVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) kdVar4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) kdVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.h;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        ca caVar = B;
        if (caVar != null) {
            Collections.sort(arrayList, caVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            hd hdVar = ((kd) view.getLayoutParams()).a;
            if (z2 && actionMasked != 0) {
                if (hdVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        hdVar.f(this, view, motionEvent2);
                    } else if (i == 1) {
                        hdVar.q(view, motionEvent2);
                    }
                }
            } else if (!z2 && hdVar != null) {
                if (i == 0) {
                    z2 = hdVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    z2 = hdVar.q(view, motionEvent);
                }
                if (z2) {
                    this.o = view;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        hd hdVar = ((kd) view.getLayoutParams()).a;
        if (hdVar == null || !hdVar.l(this, view, rect)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.l) {
            return;
        }
        t(false);
        this.l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        oe oeVar = this.g;
        e20 e20Var = (e20) oeVar.g;
        nw nwVar = (nw) oeVar.f;
        e20 e20Var2 = (e20) oeVar.g;
        int i = e20Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) e20Var.i(i2);
            if (arrayList2 != null) {
                arrayList2.clear();
                nwVar.c(arrayList2);
            }
        }
        e20Var.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            kd n = n(childAt);
            int i4 = n.f;
            if (i4 == -1) {
                n.l = null;
                n.k = null;
            } else {
                View view = n.k;
                if (view != null && view.getId() == i4) {
                    View view2 = n.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            n.l = null;
                            n.k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    n.l = view2;
                }
                View findViewById = findViewById(i4);
                n.k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i4) + " to anchor view " + childAt);
                    }
                    n.l = null;
                    n.k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else if (!isInEditMode()) {
                            l8.u("Anchor must not be a descendant of the anchored view");
                            return;
                        } else {
                            n.l = null;
                            n.k = null;
                        }
                    }
                    n.l = findViewById;
                } else if (!isInEditMode()) {
                    l8.u("View can not be anchored to the the parent CoordinatorLayout");
                    return;
                } else {
                    n.l = null;
                    n.k = null;
                }
            }
            if (!e20Var2.containsKey(childAt)) {
                e20Var2.put(childAt, null);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i3) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2 != n.l) {
                        WeakHashMap weakHashMap = f80.a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((kd) childAt2.getLayoutParams()).g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        hd hdVar = n.a;
                        if (hdVar == null) {
                            continue;
                        } else if (!hdVar.b(childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!e20Var2.containsKey(childAt2) && !e20Var2.containsKey(childAt2)) {
                        e20Var2.put(childAt2, null);
                    }
                    if (!e20Var2.containsKey(childAt2) || !e20Var2.containsKey(childAt)) {
                        l8.l("All nodes must be present in the graph before being added as an edge");
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) e20Var2.get(childAt2);
                    if (arrayList3 == null) {
                        arrayList3 = (ArrayList) nwVar.a();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        e20Var2.put(childAt2, arrayList3);
                    }
                    arrayList3.add(childAt);
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) oeVar.h;
        arrayList4.clear();
        HashSet hashSet = (HashSet) oeVar.i;
        hashSet.clear();
        int i6 = e20Var2.h;
        for (int i7 = 0; i7 < i6; i7++) {
            oeVar.f(e20Var2.f(i7), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.u.setState(getDrawableState());
                }
                Drawable drawable3 = this.u;
                WeakHashMap weakHashMap = f80.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.u.setVisible(getVisibility() == 0, false);
                this.u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = f80.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.u;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.u.setVisible(z2, false);
    }

    public final void t(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            hd hdVar = ((kd) childAt.getLayoutParams()).a;
            if (hdVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    hdVar.f(this, childAt, obtain);
                } else {
                    hdVar.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((kd) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.o = null;
        this.l = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public final void w() {
        WeakHashMap weakHashMap = f80.a;
        if (!getFitsSystemWindows()) {
            x70.c(this, null);
            return;
        }
        if (this.w == null) {
            this.w = new j0(13, this);
        }
        x70.c(this, this.w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new kd(getContext(), attributeSet);
    }
}

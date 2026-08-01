package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.am;
import defpackage.av;
import defpackage.aw;
import defpackage.ay;
import defpackage.az;
import defpackage.bz;
import defpackage.cm;
import defpackage.cy;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e20;
import defpackage.ey;
import defpackage.f80;
import defpackage.fz;
import defpackage.hy;
import defpackage.ix;
import defpackage.iy;
import defpackage.je;
import defpackage.jy;
import defpackage.kf;
import defpackage.ky;
import defpackage.l8;
import defpackage.m60;
import defpackage.mw;
import defpackage.n20;
import defpackage.n80;
import defpackage.ny;
import defpackage.o4;
import defpackage.oy;
import defpackage.py;
import defpackage.qy;
import defpackage.rq;
import defpackage.ry;
import defpackage.sy;
import defpackage.ti;
import defpackage.ty;
import defpackage.up;
import defpackage.uy;
import defpackage.v9;
import defpackage.vv;
import defpackage.vy;
import defpackage.wy;
import defpackage.x1;
import defpackage.xg;
import defpackage.xu;
import defpackage.y1;
import defpackage.yy;
import defpackage.z70;
import defpackage.zv;
import defpackage.zy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static boolean G0 = false;
    public static boolean H0 = false;
    public static final int[] I0 = {R.attr.nestedScrollingEnabled};
    public static final float J0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean K0 = true;
    public static final boolean L0 = true;
    public static final Class[] M0;
    public static final cy N0;
    public static final az O0;
    public int A;
    public boolean A0;
    public boolean B;
    public int B0;
    public boolean C;
    public int C0;
    public boolean D;
    public final boolean D0;
    public int E;
    public final dy E0;
    public boolean F;
    public final kf F0;
    public final AccessibilityManager G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public iy L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public EdgeEffect P;
    public jy Q;
    public int R;
    public int S;
    public VelocityTracker T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public py c0;
    public final int d0;
    public final int e0;
    public final float f;
    public final float f0;
    public final vy g;
    public final float g0;
    public final ty h;
    public boolean h0;
    public wy i;
    public final cz i0;
    public final y1 j;
    public cm j0;
    public final v9 k;
    public final am k0;
    public final o4 l;
    public final zy l0;
    public boolean m;
    public qy m0;
    public final ay n;
    public ArrayList n0;
    public final Rect o;
    public boolean o0;
    public final Rect p;
    public boolean p0;
    public final RectF q;
    public final dy q0;
    public ey r;
    public boolean r0;
    public ny s;
    public fz s0;
    public final ArrayList t;
    public final int[] t0;
    public final ArrayList u;
    public xu u0;
    public final ArrayList v;
    public final int[] v0;
    public ti w;
    public final int[] w0;
    public boolean x;
    public final int[] x0;
    public boolean y;
    public final ArrayList y0;
    public boolean z;
    public final ay z0;

    static {
        Class cls = Integer.TYPE;
        M0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        N0 = new cy(0);
        O0 = new az();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        char c;
        boolean z;
        char c2;
        TypedArray typedArray;
        int i2;
        Constructor constructor;
        Object[] objArr;
        this.g = new vy(this);
        this.h = new ty(this);
        this.l = new o4(24);
        this.n = new ay(this, 0);
        this.o = new Rect();
        this.p = new Rect();
        this.q = new RectF();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.A = 0;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.K = 0;
        this.L = O0;
        je jeVar = new je();
        jeVar.a = null;
        jeVar.b = new ArrayList();
        jeVar.c = 120L;
        jeVar.d = 120L;
        jeVar.e = 250L;
        jeVar.f = 250L;
        int i3 = 1;
        jeVar.g = true;
        jeVar.h = new ArrayList();
        jeVar.i = new ArrayList();
        jeVar.j = new ArrayList();
        jeVar.k = new ArrayList();
        jeVar.l = new ArrayList();
        jeVar.m = new ArrayList();
        jeVar.n = new ArrayList();
        jeVar.o = new ArrayList();
        jeVar.p = new ArrayList();
        jeVar.q = new ArrayList();
        jeVar.r = new ArrayList();
        this.Q = jeVar;
        this.R = 0;
        this.S = -1;
        this.f0 = Float.MIN_VALUE;
        this.g0 = Float.MIN_VALUE;
        this.h0 = true;
        this.i0 = new cz(this);
        this.k0 = L0 ? new am() : null;
        zy zyVar = new zy();
        zyVar.a = -1;
        zyVar.b = 0;
        zyVar.c = 0;
        zyVar.d = 1;
        zyVar.e = 0;
        zyVar.f = false;
        zyVar.g = false;
        zyVar.h = false;
        zyVar.i = false;
        zyVar.j = false;
        zyVar.k = false;
        this.l0 = zyVar;
        this.o0 = false;
        this.p0 = false;
        dy dyVar = new dy(this);
        this.q0 = dyVar;
        this.r0 = false;
        this.t0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.y0 = new ArrayList();
        this.z0 = new ay(this, i3);
        this.B0 = 0;
        this.C0 = 0;
        this.E0 = new dy(this);
        this.F0 = new kf(getContext(), new dy(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b0 = viewConfiguration.getScaledTouchSlop();
        this.f0 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.g0 = viewConfiguration.getScaledVerticalScrollFactor();
        this.d0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.e0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.Q.a = dyVar;
        this.j = new y1(new dy(this));
        this.k = new v9(new dy(this));
        WeakHashMap weakHashMap = f80.a;
        if (z70.a(this) == 0) {
            z70.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new fz(this));
        int[] iArr = ix.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        f80.l(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.m = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                l8.l("Trying to set fast scroller without both required drawables.".concat(B()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            c2 = 2;
            z = 1;
            typedArray = obtainStyledAttributes;
            i2 = 4;
            new ti(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.ionia.reidopitaco.libya.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            z = 1;
            c2 = 2;
            typedArray = obtainStyledAttributes;
            i2 = 4;
        }
        typedArray.recycle();
        this.D0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(ny.class);
                    try {
                        constructor = asSubclass.getConstructor(M0);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[z] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[c] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(z);
                    setLayoutManager((ny) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    l8.g(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    l8.g(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    l8.g(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    l8.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    l8.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = I0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        f80.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(com.ionia.reidopitaco.libya.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView G = G(viewGroup.getChildAt(i));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public static dz M(View view) {
        if (view == null) {
            return null;
        }
        return ((oy) view.getLayoutParams()).a;
    }

    private xu getScrollingChildHelper() {
        if (this.u0 == null) {
            this.u0 = new xu(this);
        }
        return this.u0;
    }

    public static void l(dz dzVar) {
        WeakReference weakReference = dzVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == dzVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            dzVar.b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && m60.x(edgeEffect) != 0.0f) {
            int round = Math.round(m60.N(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || m60.x(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round(m60.N(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        G0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        H0 = z;
    }

    public final void A() {
        if (this.N != null) {
            return;
        }
        ((az) this.L).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.N = edgeEffect;
        if (this.m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.r + ", layout:" + this.s + ", context:" + getContext();
    }

    public final void C(zy zyVar) {
        if (getScrollState() != 2) {
            zyVar.getClass();
            return;
        }
        OverScroller overScroller = this.i0.h;
        overScroller.getFinalX();
        overScroller.getCurrX();
        zyVar.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ti tiVar = (ti) arrayList.get(i);
            int i2 = tiVar.v;
            if (i2 == 1) {
                boolean d = tiVar.d(motionEvent.getX(), motionEvent.getY());
                boolean c = tiVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d || c)) {
                    if (c) {
                        tiVar.w = 1;
                        tiVar.p = (int) motionEvent.getX();
                    } else if (d) {
                        tiVar.w = 2;
                        tiVar.m = (int) motionEvent.getY();
                    }
                    tiVar.f(2);
                    if (action == 3) {
                        this.w = tiVar;
                        return true;
                    }
                }
            } else {
                if (i2 != 2) {
                    continue;
                }
                if (action == 3) {
                }
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        v9 v9Var = this.k;
        int e = v9Var.e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            dz M = M(v9Var.d(i3));
            if (!M.o()) {
                int b = M.b();
                if (b < i) {
                    i = b;
                }
                if (b > i2) {
                    i2 = b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final dz H(int i) {
        dz dzVar = null;
        if (this.H) {
            return null;
        }
        v9 v9Var = this.k;
        int h = v9Var.h();
        for (int i2 = 0; i2 < h; i2++) {
            dz M = M(v9Var.g(i2));
            if (M != null && !M.h() && J(M) == i) {
                if (!v9Var.c.contains(M.a)) {
                    return M;
                }
                dzVar = M;
            }
        }
        return dzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0210, code lost:
    
        if (r1 < r14) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        cz czVar;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        int minFlingVelocity;
        boolean z4;
        int G;
        PointF a;
        int i7;
        ny nyVar = this.s;
        if (nyVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.C) {
            boolean d = nyVar.d();
            boolean e = this.s.e();
            int i8 = (!d || Math.abs(i) < i3) ? 0 : i;
            int i9 = (!e || Math.abs(i2) < i3) ? 0 : i2;
            if (i8 != 0 || i9 != 0) {
                if (i8 != 0) {
                    EdgeEffect edgeEffect = this.M;
                    if (edgeEffect == null || m60.x(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.O;
                        if (edgeEffect2 != null && m60.x(edgeEffect2) != 0.0f) {
                            if (h0(this.O, i8, getWidth())) {
                                this.O.onAbsorb(i8);
                                i8 = 0;
                            }
                            i5 = i8;
                            i8 = 0;
                        }
                    } else {
                        int i10 = -i8;
                        if (h0(this.M, i10, getWidth())) {
                            this.M.onAbsorb(i10);
                            i8 = 0;
                        }
                        i5 = i8;
                        i8 = 0;
                    }
                    if (i9 != 0) {
                        EdgeEffect edgeEffect3 = this.N;
                        if (edgeEffect3 == null || m60.x(edgeEffect3) == 0.0f) {
                            EdgeEffect edgeEffect4 = this.P;
                            if (edgeEffect4 != null && m60.x(edgeEffect4) != 0.0f) {
                                if (h0(this.P, i9, getHeight())) {
                                    this.P.onAbsorb(i9);
                                    i9 = 0;
                                }
                                i6 = 0;
                            }
                        } else {
                            int i11 = -i9;
                            if (h0(this.N, i11, getHeight())) {
                                this.N.onAbsorb(i11);
                                i9 = 0;
                            }
                            i6 = 0;
                        }
                        czVar = this.i0;
                        if (i5 == 0 || i9 != 0) {
                            int i12 = -i4;
                            i5 = Math.max(i12, Math.min(i5, i4));
                            i9 = Math.max(i12, Math.min(i9, i4));
                            l0(1);
                            czVar.a(i5, i9);
                        }
                        if (i8 == 0 || i6 != 0) {
                            f = i8;
                            f2 = i6;
                            if (!dispatchNestedPreFling(f, f2)) {
                                boolean z5 = d || e;
                                dispatchNestedFling(f, f2, z5);
                                py pyVar = this.c0;
                                if (pyVar != null) {
                                    aw awVar = (aw) pyVar;
                                    ny layoutManager = awVar.a.getLayoutManager();
                                    if (layoutManager != 0 && awVar.a.getAdapter() != null && ((Math.abs(i6) > (minFlingVelocity = awVar.a.getMinFlingVelocity()) || Math.abs(i8) > minFlingVelocity) && ((z4 = layoutManager instanceof yy)))) {
                                        View view = null;
                                        zv zvVar = !z4 ? null : new zv(awVar, awVar.a.getContext());
                                        if (zvVar != null) {
                                            int B = layoutManager.B();
                                            if (B != 0) {
                                                xg e2 = layoutManager.e() ? awVar.e(layoutManager) : layoutManager.d() ? awVar.d(layoutManager) : null;
                                                if (e2 != null) {
                                                    z2 = false;
                                                    int v = layoutManager.v();
                                                    z3 = true;
                                                    int i13 = 0;
                                                    int i14 = Integer.MIN_VALUE;
                                                    int i15 = Integer.MAX_VALUE;
                                                    View view2 = null;
                                                    while (i13 < v) {
                                                        boolean z6 = z5;
                                                        View u = layoutManager.u(i13);
                                                        if (u == null) {
                                                            i7 = v;
                                                        } else {
                                                            i7 = v;
                                                            int b = aw.b(u, e2);
                                                            if (b <= 0 && b > i14) {
                                                                view2 = u;
                                                                i14 = b;
                                                            }
                                                            if (b >= 0 && b < i15) {
                                                                view = u;
                                                                i15 = b;
                                                            }
                                                        }
                                                        i13++;
                                                        z5 = z6;
                                                        v = i7;
                                                    }
                                                    z = z5;
                                                    Object[] objArr = !layoutManager.d() ? i6 <= 0 : i8 <= 0;
                                                    if (objArr == true && view != null) {
                                                        G = ny.G(view);
                                                    } else if (objArr == true || view2 == null) {
                                                        if (objArr != false) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            G = ((z4 && (a = ((yy) layoutManager).a(layoutManager.B() + (-1))) != null && ((a.x > 0.0f ? 1 : (a.x == 0.0f ? 0 : -1)) < 0 || (a.y > 0.0f ? 1 : (a.y == 0.0f ? 0 : -1)) < 0)) == objArr ? -1 : 1) + ny.G(view);
                                                            if (G >= 0) {
                                                            }
                                                        }
                                                        G = -1;
                                                    } else {
                                                        G = ny.G(view2);
                                                    }
                                                    if (G != -1) {
                                                        zvVar.a = G;
                                                        layoutManager.B0(zvVar);
                                                        return z3;
                                                    }
                                                    if (!z) {
                                                        return z2;
                                                    }
                                                    boolean z7 = z3;
                                                    l0(z7 ? 1 : 0);
                                                    int i16 = -i4;
                                                    czVar.a(Math.max(i16, Math.min(i8, i4)), Math.max(i16, Math.min(i6, i4)));
                                                    return z7;
                                                }
                                            }
                                            z = z5;
                                            z2 = false;
                                            z3 = true;
                                            G = -1;
                                            if (G != -1) {
                                            }
                                            if (!z) {
                                            }
                                        }
                                    }
                                }
                                z = z5;
                                z2 = false;
                                z3 = true;
                                if (!z) {
                                }
                            }
                        } else if (i5 != 0 || i9 != 0) {
                            return true;
                        }
                    }
                    i6 = i9;
                    i9 = 0;
                    czVar = this.i0;
                    if (i5 == 0) {
                    }
                    int i122 = -i4;
                    i5 = Math.max(i122, Math.min(i5, i4));
                    i9 = Math.max(i122, Math.min(i9, i4));
                    l0(1);
                    czVar.a(i5, i9);
                    if (i8 == 0) {
                    }
                    f = i8;
                    f2 = i6;
                    if (!dispatchNestedPreFling(f, f2)) {
                    }
                }
                i5 = 0;
                if (i9 != 0) {
                }
                i6 = i9;
                i9 = 0;
                czVar = this.i0;
                if (i5 == 0) {
                }
                int i1222 = -i4;
                i5 = Math.max(i1222, Math.min(i5, i4));
                i9 = Math.max(i1222, Math.min(i9, i4));
                l0(1);
                czVar.a(i5, i9);
                if (i8 == 0) {
                }
                f = i8;
                f2 = i6;
                if (!dispatchNestedPreFling(f, f2)) {
                }
            }
        }
        return false;
    }

    public final int J(dz dzVar) {
        if ((dzVar.j & 524) == 0 && dzVar.e()) {
            int i = dzVar.c;
            ArrayList arrayList = (ArrayList) this.j.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                x1 x1Var = (x1) arrayList.get(i2);
                int i3 = x1Var.a;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = x1Var.b;
                        if (i4 <= i) {
                            int i5 = x1Var.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = x1Var.b;
                        if (i6 == i) {
                            i = x1Var.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (x1Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (x1Var.b <= i) {
                    i += x1Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long K(dz dzVar) {
        return this.r.b ? dzVar.e : dzVar.c;
    }

    public final dz L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        l8.p("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect N(View view) {
        oy oyVar = (oy) view.getLayoutParams();
        boolean z = oyVar.c;
        Rect rect = oyVar.b;
        if (!z || (this.l0.g && (oyVar.a.k() || oyVar.a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.o;
            rect2.set(0, 0, 0, 0);
            ((ky) arrayList.get(i)).getClass();
            ((oy) view.getLayoutParams()).a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oyVar.c = false;
        return rect;
    }

    public final boolean O() {
        return !this.z || this.H || this.j.k();
    }

    public final boolean P() {
        return this.J > 0;
    }

    public final void Q(int i) {
        if (this.s == null) {
            return;
        }
        setScrollState(2);
        this.s.q0(i);
        awakenScrollBars();
    }

    public final void R() {
        v9 v9Var = this.k;
        int h = v9Var.h();
        for (int i = 0; i < h; i++) {
            ((oy) v9Var.g(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.h.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oy oyVar = (oy) ((dz) arrayList.get(i2)).a.getLayoutParams();
            if (oyVar != null) {
                oyVar.c = true;
            }
        }
    }

    public final void S(int i, int i2, boolean z) {
        int i3 = i + i2;
        v9 v9Var = this.k;
        int h = v9Var.h();
        for (int i4 = 0; i4 < h; i4++) {
            dz M = M(v9Var.g(i4));
            if (M != null && !M.o()) {
                int i5 = M.c;
                zy zyVar = this.l0;
                if (i5 >= i3) {
                    if (H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + M + " now at position " + (M.c - i2));
                    }
                    M.l(-i2, z);
                    zyVar.f = true;
                } else if (i5 >= i) {
                    if (H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i4 + " holder " + M + " now REMOVED");
                    }
                    M.a(8);
                    M.l(-i2, z);
                    M.c = i - 1;
                    zyVar.f = true;
                }
            }
        }
        ty tyVar = this.h;
        ArrayList arrayList = tyVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            dz dzVar = (dz) arrayList.get(size);
            if (dzVar != null) {
                int i6 = dzVar.c;
                if (i6 >= i3) {
                    if (H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + dzVar + " now at position " + (dzVar.c - i2));
                    }
                    dzVar.l(-i2, z);
                } else if (i6 >= i) {
                    dzVar.a(8);
                    tyVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.J++;
    }

    public final void U(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.J - 1;
        this.J = i2;
        if (i2 < 1) {
            if (G0 && i2 < 0) {
                l8.u("layout or scroll counter cannot go below zero.Some calls are not matching".concat(B()));
                return;
            }
            this.J = 0;
            if (z) {
                int i3 = this.E;
                this.E = 0;
                if (i3 != 0 && (accessibilityManager = this.G) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.y0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    dz dzVar = (dz) arrayList.get(size);
                    if (dzVar.a.getParent() == this && !dzVar.o() && (i = dzVar.q) != -1) {
                        dzVar.a.setImportantForAccessibility(i);
                        dzVar.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.W = x;
            this.U = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.a0 = y;
            this.V = y;
        }
    }

    public final void W() {
        if (this.r0 || !this.x) {
            return;
        }
        WeakHashMap weakHashMap = f80.a;
        postOnAnimation(this.z0);
        this.r0 = true;
    }

    public final void X() {
        boolean z;
        boolean z2 = this.H;
        y1 y1Var = this.j;
        boolean z3 = false;
        if (z2) {
            y1Var.r((ArrayList) y1Var.c);
            y1Var.r((ArrayList) y1Var.d);
            y1Var.a = 0;
            if (this.I) {
                this.s.Z();
            }
        }
        if (this.Q != null && this.s.C0()) {
            y1Var.q();
        } else {
            y1Var.d();
        }
        boolean z4 = this.o0 || this.p0;
        boolean z5 = this.z && this.Q != null && ((z = this.H) || z4 || this.s.f) && (!z || this.r.b);
        zy zyVar = this.l0;
        zyVar.j = z5;
        if (z5 && z4 && !this.H && this.Q != null && this.s.C0()) {
            z3 = true;
        }
        zyVar.k = z3;
    }

    public final void Y(boolean z) {
        this.I = z | this.I;
        this.H = true;
        v9 v9Var = this.k;
        int h = v9Var.h();
        for (int i = 0; i < h; i++) {
            dz M = M(v9Var.g(i));
            if (M != null && !M.o()) {
                M.a(6);
            }
        }
        R();
        ty tyVar = this.h;
        ArrayList arrayList = tyVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dz dzVar = (dz) arrayList.get(i2);
            if (dzVar != null) {
                dzVar.a(6);
                dzVar.a(1024);
            }
        }
        ey eyVar = tyVar.h.r;
        if (eyVar == null || !eyVar.b) {
            tyVar.g();
        }
    }

    public final void Z(dz dzVar, av avVar) {
        dzVar.j &= -8193;
        boolean z = this.l0.h;
        o4 o4Var = this.l;
        if (z && dzVar.k() && !dzVar.h() && !dzVar.o()) {
            ((rq) o4Var.h).d(K(dzVar), dzVar);
        }
        e20 e20Var = (e20) o4Var.g;
        n80 n80Var = (n80) e20Var.get(dzVar);
        if (n80Var == null) {
            n80Var = n80.a();
            e20Var.put(dzVar, n80Var);
        }
        n80Var.b = avVar;
        n80Var.a |= 4;
    }

    public final void a0() {
        boolean z;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.M.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.N;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.P.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ny nyVar = this.s;
        if (nyVar != null) {
            nyVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final int b0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.M;
        float f2 = 0.0f;
        if (edgeEffect == null || m60.x(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.O;
            if (edgeEffect2 != null && m60.x(edgeEffect2) != 0.0f) {
                boolean canScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.O;
                if (canScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float N = m60.N(edgeEffect3, width, height);
                    if (m60.x(this.O) == 0.0f) {
                        this.O.onRelease();
                    }
                    f2 = N;
                }
                invalidate();
            }
        } else {
            boolean canScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.M;
            if (canScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -m60.N(edgeEffect4, -width, 1.0f - height);
                if (m60.x(this.M) == 0.0f) {
                    this.M.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public final int c0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.N;
        float f2 = 0.0f;
        if (edgeEffect == null || m60.x(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.P;
            if (edgeEffect2 != null && m60.x(edgeEffect2) != 0.0f) {
                boolean canScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.P;
                if (canScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float N = m60.N(edgeEffect3, height, 1.0f - width);
                    if (m60.x(this.P) == 0.0f) {
                        this.P.onRelease();
                    }
                    f2 = N;
                }
                invalidate();
            }
        } else {
            boolean canScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.N;
            if (canScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -m60.N(edgeEffect4, -height, width);
                if (m60.x(this.N) == 0.0f) {
                    this.N.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof oy) && this.s.f((oy) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        ny nyVar = this.s;
        if (nyVar != null && nyVar.d()) {
            return this.s.j(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        ny nyVar = this.s;
        if (nyVar != null && nyVar.d()) {
            return this.s.k(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        ny nyVar = this.s;
        if (nyVar != null && nyVar.d()) {
            return this.s.l(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        ny nyVar = this.s;
        if (nyVar != null && nyVar.e()) {
            return this.s.m(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        ny nyVar = this.s;
        if (nyVar != null && nyVar.e()) {
            return this.s.n(this.l0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        ny nyVar = this.s;
        if (nyVar != null && nyVar.e()) {
            return this.s.o(this.l0);
        }
        return 0;
    }

    public final void d0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.o;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof oy) {
            oy oyVar = (oy) layoutParams;
            if (!oyVar.c) {
                Rect rect2 = oyVar.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.s.n0(this, view, this.o, !this.z, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        ny layoutManager = getLayoutManager();
        int i = 0;
        if (layoutManager != null) {
            if (layoutManager.e()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        i0(0, measuredHeight, false);
                        return true;
                    }
                    i0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean L = layoutManager.L();
                    if (keyCode == 122) {
                        if (L) {
                            i = getAdapter().a();
                        }
                    } else if (!L) {
                        i = getAdapter().a();
                    }
                    j0(i);
                    return true;
                }
            } else if (layoutManager.d()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        i0(measuredWidth, 0, false);
                        return true;
                    }
                    i0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean L2 = layoutManager.L();
                    if (keyCode2 == 122) {
                        if (L2) {
                            i = getAdapter().a();
                        }
                    } else if (!L2) {
                        i = getAdapter().a();
                    }
                    j0(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((ky) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.m ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.M;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.m) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.N;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.O;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.m ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.O;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.P;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.m) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.P;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.Q == null || arrayList.size() <= 0 || !this.Q.f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        p();
        ey eyVar = this.r;
        int[] iArr = this.x0;
        if (eyVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            f0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.u.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v(i4, i5, i6, i7, this.v0, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.W;
        int[] iArr2 = this.v0;
        int i13 = iArr2[0];
        this.W = i12 - i13;
        int i14 = this.a0;
        int i15 = iArr2[1];
        this.a0 = i14 - i15;
        int[] iArr3 = this.w0;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || vv.y(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    y();
                    z = true;
                    z2 = false;
                    m60.N(this.M, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        z();
                        m60.N(this.O, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                        if (f2 >= 0.0f) {
                            A();
                            m60.N(this.N, (-f2) / getHeight(), x / getWidth());
                        } else {
                            if (f2 > 0.0f) {
                                x();
                                m60.N(this.P, f2 / getHeight(), 1.0f - (x / getWidth()));
                            }
                            if (!z3 || f != 0.0f || f2 != 0.0f) {
                                postInvalidateOnAnimation();
                            }
                            if (Build.VERSION.SDK_INT >= 31 && vv.y(motionEvent, 4194304)) {
                                a0();
                            }
                        }
                        z3 = z;
                        if (!z3) {
                        }
                        postInvalidateOnAnimation();
                        if (Build.VERSION.SDK_INT >= 31) {
                            a0();
                        }
                    }
                }
                z3 = z;
                if (f2 >= 0.0f) {
                }
                z3 = z;
                if (!z3) {
                }
                postInvalidateOnAnimation();
                if (Build.VERSION.SDK_INT >= 31) {
                }
            }
            n(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            w(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    public final void f0(int i, int i2, int[] iArr) {
        dz dzVar;
        k0();
        T();
        Trace.beginSection("RV Scroll");
        zy zyVar = this.l0;
        C(zyVar);
        ty tyVar = this.h;
        int p0 = i != 0 ? this.s.p0(i, tyVar, zyVar) : 0;
        int r0 = i2 != 0 ? this.s.r0(i2, tyVar, zyVar) : 0;
        Trace.endSection();
        v9 v9Var = this.k;
        int e = v9Var.e();
        for (int i3 = 0; i3 < e; i3++) {
            View d = v9Var.d(i3);
            dz L = L(d);
            if (L != null && (dzVar = L.i) != null) {
                View view = dzVar.a;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        m0(false);
        if (iArr != null) {
            iArr[0] = p0;
            iArr[1] = r0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018a, code lost:
    
        if (r5 < 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0192, code lost:
    
        if ((r5 * r6) <= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x019a, code lost:
    
        if ((r5 * r6) >= 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if (r7 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0184, code lost:
    
        if (r5 > 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0187, code lost:
    
        if (r7 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View view2;
        int i2;
        char c;
        boolean z;
        this.s.getClass();
        boolean z2 = true;
        boolean z3 = (this.r == null || this.s == null || P() || this.C) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        zy zyVar = this.l0;
        ty tyVar = this.h;
        if (z3 && (i == 2 || i == 1)) {
            if (this.s.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                    if (!z && this.s.d()) {
                        z = focusFinder.findNextFocus(this, view, !((this.s.b.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null;
                    }
                    if (z) {
                        p();
                        if (D(view) != null) {
                            k0();
                            this.s.T(view, i, tyVar, zyVar);
                            m0(false);
                        }
                        return null;
                    }
                    view2 = focusFinder.findNextFocus(this, view, i);
                    if (view2 == null) {
                    }
                    if (view2 != null) {
                        if (D(view2) != null) {
                        }
                        if (z2) {
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
            z = false;
            if (!z) {
                if (focusFinder.findNextFocus(this, view, !((this.s.b.getLayoutDirection() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z) {
            }
            view2 = focusFinder.findNextFocus(this, view, i);
            if (view2 == null) {
            }
            if (view2 != null) {
            }
            z2 = false;
            if (z2) {
            }
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z3) {
                p();
                if (D(view) != null) {
                    k0();
                    view2 = this.s.T(view, i, tyVar, zyVar);
                    m0(false);
                }
                return null;
            }
            view2 = findNextFocus;
            if (view2 == null && !view2.hasFocusable()) {
                if (getFocusedChild() == null) {
                    return super.focusSearch(view, i);
                }
                d0(view2, null);
                return view;
            }
            if (view2 != null && view2 != this && view2 != view) {
                if (D(view2) != null) {
                    z2 = false;
                } else if (view != null && D(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.o;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.p;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    int i3 = this.s.b.getLayoutDirection() == 1 ? -1 : 1;
                    int i4 = rect.left;
                    int i5 = rect2.left;
                    if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                        i2 = 1;
                    } else {
                        int i6 = rect.right;
                        int i7 = rect2.right;
                        i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
                    }
                    int i8 = rect.top;
                    int i9 = rect2.top;
                    if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                        c = 1;
                    } else {
                        int i10 = rect.bottom;
                        int i11 = rect2.bottom;
                        c = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 17) {
                                if (i != 33) {
                                    if (i != 66) {
                                        if (i != 130) {
                                            throw new IllegalArgumentException("Invalid direction: " + i + B());
                                        }
                                    }
                                }
                            }
                        } else if (c <= 0) {
                            if (c == 0) {
                            }
                        }
                    } else if (c >= 0) {
                        if (c == 0) {
                        }
                    }
                }
                return z2 ? view2 : super.focusSearch(view, i);
            }
            z2 = false;
            if (z2) {
            }
        }
    }

    public final void g0(int i) {
        if (this.C) {
            return;
        }
        o0();
        ny nyVar = this.s;
        if (nyVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nyVar.q0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ny nyVar = this.s;
        if (nyVar != null) {
            return nyVar.r();
        }
        l8.u("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ny nyVar = this.s;
        if (nyVar != null) {
            return nyVar.s(getContext(), attributeSet);
        }
        l8.u("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public ey getAdapter() {
        return this.r;
    }

    @Override // android.view.View
    public int getBaseline() {
        ny nyVar = this.s;
        if (nyVar == null) {
            return super.getBaseline();
        }
        nyVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.m;
    }

    public fz getCompatAccessibilityDelegate() {
        return this.s0;
    }

    public iy getEdgeEffectFactory() {
        return this.L;
    }

    public jy getItemAnimator() {
        return this.Q;
    }

    public int getItemDecorationCount() {
        return this.u.size();
    }

    public ny getLayoutManager() {
        return this.s;
    }

    public int getMaxFlingVelocity() {
        return this.e0;
    }

    public int getMinFlingVelocity() {
        return this.d0;
    }

    public long getNanoTime() {
        if (L0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public py getOnFlingListener() {
        return this.c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.h0;
    }

    public sy getRecycledViewPool() {
        return this.h.c();
    }

    public int getScrollState() {
        return this.R;
    }

    public final void h(dz dzVar) {
        View view = dzVar.a;
        boolean z = view.getParent() == this;
        this.h.m(L(view));
        boolean j = dzVar.j();
        v9 v9Var = this.k;
        if (j) {
            v9Var.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            v9Var.a(view, -1, true);
            return;
        }
        int indexOfChild = v9Var.a.f.indexOfChild(view);
        if (indexOfChild < 0) {
            l8.w(view, "view is not a child, cannot hide ");
        } else {
            v9Var.b.i(indexOfChild);
            v9Var.i(view);
        }
    }

    public final boolean h0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float x = m60.x(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f = this.f * 0.015f;
        double log = Math.log(abs / f);
        double d = J0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < x;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(ky kyVar) {
        ny nyVar = this.s;
        if (nyVar != null) {
            nyVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.u;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(kyVar);
        R();
        requestLayout();
    }

    public final void i0(int i, int i2, boolean z) {
        ny nyVar = this.s;
        if (nyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        if (!nyVar.d()) {
            i = 0;
        }
        if (!this.s.e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().g(i3, 1);
        }
        this.i0.c(i, i2, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.x;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.C;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(qy qyVar) {
        if (this.n0 == null) {
            this.n0 = new ArrayList();
        }
        this.n0.add(qyVar);
    }

    public final void j0(int i) {
        if (this.C) {
            return;
        }
        ny nyVar = this.s;
        if (nyVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            nyVar.A0(this, i);
        }
    }

    public final void k(String str) {
        if (!P()) {
            if (this.K > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(B()));
            }
        } else if (str == null) {
            l8.u("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(B()));
        } else {
            l8.u(str);
        }
    }

    public final void k0() {
        int i = this.A + 1;
        this.A = i;
        if (i != 1 || this.C) {
            return;
        }
        this.B = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(int i) {
        boolean d = this.s.d();
        int i2 = d;
        if (this.s.e()) {
            i2 = (d ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i2, i);
    }

    public final void m() {
        v9 v9Var = this.k;
        int h = v9Var.h();
        for (int i = 0; i < h; i++) {
            dz M = M(v9Var.g(i));
            if (!M.o()) {
                M.d = -1;
                M.g = -1;
            }
        }
        ty tyVar = this.h;
        ArrayList arrayList = tyVar.a;
        ArrayList arrayList2 = tyVar.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            dz dzVar = (dz) arrayList2.get(i2);
            dzVar.d = -1;
            dzVar.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            dz dzVar2 = (dz) arrayList.get(i3);
            dzVar2.d = -1;
            dzVar2.g = -1;
        }
        ArrayList arrayList3 = tyVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                dz dzVar3 = (dz) tyVar.b.get(i4);
                dzVar3.d = -1;
                dzVar3.g = -1;
            }
        }
    }

    public final void m0(boolean z) {
        if (this.A < 1) {
            if (G0) {
                l8.u("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(B()));
                return;
            }
            this.A = 1;
        }
        if (!z && !this.C) {
            this.B = false;
        }
        if (this.A == 1) {
            if (z && this.B && !this.C && this.s != null && this.r != null) {
                r();
            }
            if (!this.C) {
                this.B = false;
            }
        }
        this.A--;
    }

    public final void n(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.M;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.M.onRelease();
            z = this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.O;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.O.onRelease();
            z |= this.O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.N;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.N.onRelease();
            z |= this.N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.P;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.P.onRelease();
            z |= this.P.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void o0() {
        up upVar;
        setScrollState(0);
        cz czVar = this.i0;
        czVar.l.removeCallbacks(czVar);
        czVar.h.abortAnimation();
        ny nyVar = this.s;
        if (nyVar == null || (upVar = nyVar.e) == null) {
            return;
        }
        upVar.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f;
        super.onAttachedToWindow();
        this.J = 0;
        this.x = true;
        this.z = this.z && !isLayoutRequested();
        this.h.e();
        ny nyVar = this.s;
        if (nyVar != null) {
            nyVar.g = true;
            nyVar.R(this);
        }
        this.r0 = false;
        if (L0) {
            ThreadLocal threadLocal = cm.j;
            cm cmVar = (cm) threadLocal.get();
            this.j0 = cmVar;
            if (cmVar == null) {
                this.j0 = new cm();
                WeakHashMap weakHashMap = f80.a;
                Display display = getDisplay();
                if (!isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                cm cmVar2 = this.j0;
                cmVar2.h = (long) (1.0E9f / f);
                threadLocal.set(cmVar2);
            }
            ArrayList arrayList = this.j0.f;
            if (G0 && arrayList.contains(this)) {
                l8.u("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        cm cmVar;
        super.onDetachedFromWindow();
        jy jyVar = this.Q;
        if (jyVar != null) {
            jyVar.e();
        }
        o0();
        int i = 0;
        this.x = false;
        ny nyVar = this.s;
        if (nyVar != null) {
            nyVar.g = false;
            nyVar.S(this);
        }
        this.y0.clear();
        removeCallbacks(this.z0);
        this.l.getClass();
        while (n80.d.a() != null) {
        }
        ty tyVar = this.h;
        ArrayList arrayList = tyVar.c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            m60.h(((dz) arrayList.get(i2)).a);
        }
        tyVar.f(tyVar.h.r, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            mw mwVar = (mw) childAt.getTag(com.ionia.reidopitaco.libya.R.id.pooling_container_listener_holder_tag);
            if (mwVar == null) {
                mwVar = new mw();
                childAt.setTag(com.ionia.reidopitaco.libya.R.id.pooling_container_listener_holder_tag, mwVar);
            }
            ArrayList arrayList2 = mwVar.a;
            arrayList2.getClass();
            int size = arrayList2.size() - 1;
            if (-1 < size) {
                arrayList2.get(size).getClass();
                l8.c();
                return;
            }
            i = i3;
        }
        if (!L0 || (cmVar = this.j0) == null) {
            return;
        }
        boolean remove = cmVar.f.remove(this);
        if (!G0 || remove) {
            this.j0 = null;
        } else {
            l8.u("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ky) arrayList.get(i)).a(this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        boolean z;
        if (this.s != null && !this.C && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.s.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                f = this.s.d() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                r2 = f2;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.s.e()) {
                    float f3 = -f;
                    f = 0.0f;
                    r2 = f3;
                } else if (!this.s.d()) {
                    f = 0.0f;
                }
                i = 26;
                z = this.D0;
            } else {
                f = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (r2 * this.g0);
            int i3 = (int) (f * this.f0);
            if (z) {
                OverScroller overScroller = this.i0.h;
                i0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                ny nyVar = this.s;
                if (nyVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.C) {
                    int[] iArr = this.x0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean d = nyVar.d();
                    boolean e = this.s.e();
                    int i4 = e ? (d ? 1 : 0) | 2 : d ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int b0 = i3 - b0(i3, y);
                    int c0 = i2 - c0(i2, x);
                    getScrollingChildHelper().g(i4, 1);
                    if (u(d ? b0 : 0, e ? c0 : 0, 1, this.x0, this.v0)) {
                        b0 -= iArr[0];
                        c0 -= iArr[1];
                    }
                    e0(d ? b0 : 0, e ? c0 : 0, motionEvent, 1);
                    cm cmVar = this.j0;
                    if (cmVar != null && (b0 != 0 || c0 != 0)) {
                        cmVar.a(this, b0, c0);
                    }
                    n0(1);
                }
            }
            if (i != 0 && !z) {
                this.F0.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.C) {
            this.w = null;
            if (E(motionEvent)) {
                VelocityTracker velocityTracker = this.T;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                n0(0);
                a0();
                setScrollState(0);
                return true;
            }
            ny nyVar = this.s;
            if (nyVar != null) {
                boolean d = nyVar.d();
                boolean e = this.s.e();
                if (this.T == null) {
                    this.T = VelocityTracker.obtain();
                }
                this.T.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.D) {
                        this.D = false;
                    }
                    this.S = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.W = x;
                    this.U = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.a0 = y;
                    this.V = y;
                    EdgeEffect edgeEffect = this.M;
                    if (edgeEffect == null || m60.x(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        m60.N(this.M, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.O;
                    if (edgeEffect2 != null && m60.x(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        m60.N(this.O, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.N;
                    if (edgeEffect3 != null && m60.x(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        m60.N(this.N, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.P;
                    if (edgeEffect4 != null && m60.x(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        m60.N(this.P, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.R == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        n0(1);
                    }
                    int[] iArr = this.w0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    l0(0);
                } else if (actionMasked == 1) {
                    this.T.clear();
                    n0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.S);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.R != 1) {
                        int i = x2 - this.U;
                        int i2 = y2 - this.V;
                        if (!d || Math.abs(i) <= this.b0) {
                            z2 = false;
                        } else {
                            this.W = x2;
                            z2 = true;
                        }
                        if (e && Math.abs(i2) > this.b0) {
                            this.a0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.T;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    n0(0);
                    a0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.S = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.W = x3;
                    this.U = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.a0 = y3;
                    this.V = y3;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                if (this.R == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        r();
        Trace.endSection();
        this.z = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ny nyVar = this.s;
        if (nyVar == null) {
            q(i, i2);
            return;
        }
        boolean K = nyVar.K();
        boolean z = false;
        zy zyVar = this.l0;
        if (K) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.s.b.q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.A0 = z;
            if (z || this.r == null) {
                return;
            }
            if (zyVar.d == 1) {
                s();
            }
            this.s.t0(i, i2);
            zyVar.i = true;
            t();
            this.s.v0(i, i2);
            if (this.s.y0()) {
                this.s.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                zyVar.i = true;
                t();
                this.s.v0(i, i2);
            }
            this.B0 = getMeasuredWidth();
            this.C0 = getMeasuredHeight();
            return;
        }
        if (this.y) {
            this.s.b.q(i, i2);
            return;
        }
        if (this.F) {
            k0();
            T();
            X();
            U(true);
            if (zyVar.k) {
                zyVar.g = true;
            } else {
                this.j.d();
                zyVar.g = false;
            }
            this.F = false;
            m0(false);
        } else if (zyVar.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        ey eyVar = this.r;
        if (eyVar != null) {
            zyVar.e = eyVar.a();
        } else {
            zyVar.e = 0;
        }
        k0();
        this.s.b.q(i, i2);
        m0(false);
        zyVar.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof wy)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wy wyVar = (wy) parcelable;
        this.i = wyVar;
        super.onRestoreInstanceState(wyVar.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        wy wyVar = new wy(super.onSaveInstanceState());
        wy wyVar2 = this.i;
        if (wyVar2 != null) {
            wyVar.h = wyVar2.h;
            return wyVar;
        }
        ny nyVar = this.s;
        if (nyVar != null) {
            wyVar.h = nyVar.g0();
            return wyVar;
        }
        wyVar.h = null;
        return wyVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.C && !this.D) {
            ti tiVar = this.w;
            if (tiVar == null) {
                z = motionEvent.getAction() == 0 ? false : E(motionEvent);
            } else {
                int i = tiVar.b;
                if (tiVar.v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean d = tiVar.d(motionEvent.getX(), motionEvent.getY());
                        boolean c = tiVar.c(motionEvent.getX(), motionEvent.getY());
                        if (d || c) {
                            if (c) {
                                tiVar.w = 1;
                                tiVar.p = (int) motionEvent.getX();
                            } else if (d) {
                                tiVar.w = 2;
                                tiVar.m = (int) motionEvent.getY();
                            }
                            tiVar.f(2);
                        }
                    } else if (motionEvent.getAction() == 1 && tiVar.v == 2) {
                        tiVar.m = 0.0f;
                        tiVar.p = 0.0f;
                        tiVar.f(1);
                        tiVar.w = 0;
                    } else if (motionEvent.getAction() == 2 && tiVar.v == 2) {
                        tiVar.g();
                        if (tiVar.w == 1) {
                            float x = motionEvent.getX();
                            int[] iArr = tiVar.y;
                            iArr[0] = i;
                            int i2 = tiVar.q - i;
                            iArr[1] = i2;
                            float max = Math.max(i, Math.min(i2, x));
                            if (Math.abs(tiVar.o - max) >= 2.0f) {
                                int e = ti.e(tiVar.p, max, iArr, tiVar.s.computeHorizontalScrollRange(), tiVar.s.computeHorizontalScrollOffset(), tiVar.q);
                                if (e != 0) {
                                    tiVar.s.scrollBy(e, 0);
                                }
                                tiVar.p = max;
                            }
                        }
                        if (tiVar.w == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = tiVar.x;
                            iArr2[0] = i;
                            int i3 = tiVar.r - i;
                            iArr2[1] = i3;
                            float max2 = Math.max(i, Math.min(i3, y));
                            if (Math.abs(tiVar.l - max2) >= 2.0f) {
                                int e2 = ti.e(tiVar.m, max2, iArr2, tiVar.s.computeVerticalScrollRange(), tiVar.s.computeVerticalScrollOffset(), tiVar.r);
                                if (e2 != 0) {
                                    tiVar.s.scrollBy(0, e2);
                                }
                                tiVar.m = max2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.w = null;
                }
                z = true;
            }
            if (z) {
                VelocityTracker velocityTracker = this.T;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                n0(0);
                a0();
                setScrollState(0);
                return true;
            }
            ny nyVar = this.s;
            if (nyVar != null) {
                boolean d2 = nyVar.d();
                boolean e3 = this.s.e();
                if (this.T == null) {
                    this.T = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.w0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    this.S = motionEvent.getPointerId(0);
                    int x2 = (int) (motionEvent.getX() + 0.5f);
                    this.W = x2;
                    this.U = x2;
                    int y2 = (int) (motionEvent.getY() + 0.5f);
                    this.a0 = y2;
                    this.V = y2;
                    l0(0);
                } else {
                    if (actionMasked == 1) {
                        this.T.addMovement(obtain);
                        VelocityTracker velocityTracker2 = this.T;
                        int i4 = this.e0;
                        velocityTracker2.computeCurrentVelocity(1000, i4);
                        float f = d2 ? -this.T.getXVelocity(this.S) : 0.0f;
                        float f2 = e3 ? -this.T.getYVelocity(this.S) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !I((int) f, (int) f2, this.d0, i4)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.T;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        n0(0);
                        a0();
                        obtain.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.S);
                        if (findPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.S + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i5 = this.W - x3;
                        int i6 = this.a0 - y3;
                        if (this.R != 1) {
                            if (d2) {
                                int i7 = this.b0;
                                i5 = i5 > 0 ? Math.max(0, i5 - i7) : Math.min(0, i5 + i7);
                                if (i5 != 0) {
                                    z2 = true;
                                    if (e3) {
                                        int i8 = this.b0;
                                        i6 = i6 > 0 ? Math.max(0, i6 - i8) : Math.min(0, i6 + i8);
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z2 = false;
                            if (e3) {
                            }
                            if (z2) {
                            }
                        }
                        if (this.R == 1) {
                            int[] iArr4 = this.x0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int b0 = i5 - b0(i5, motionEvent.getY());
                            int c0 = i6 - c0(i6, motionEvent.getX());
                            boolean u = u(d2 ? b0 : 0, e3 ? c0 : 0, 0, this.x0, this.v0);
                            int[] iArr5 = this.v0;
                            if (u) {
                                b0 -= iArr4[0];
                                c0 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i9 = b0;
                            int i10 = c0;
                            this.W = x3 - iArr5[0];
                            this.a0 = y3 - iArr5[1];
                            if (e0(d2 ? i9 : 0, e3 ? i10 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            cm cmVar = this.j0;
                            if (cmVar != null && (i9 != 0 || i10 != 0)) {
                                cmVar.a(this, i9, i10);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.T;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        n0(0);
                        a0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.S = motionEvent.getPointerId(actionIndex);
                        int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.W = x4;
                        this.U = x4;
                        int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.a0 = y4;
                        this.V = y4;
                    } else if (actionMasked == 6) {
                        V(motionEvent);
                    }
                }
                this.T.addMovement(obtain);
                obtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.z || this.H) {
            Trace.beginSection("RV FullInvalidate");
            r();
            Trace.endSection();
            return;
        }
        y1 y1Var = this.j;
        if (y1Var.k()) {
            int i = y1Var.a;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (y1Var.k()) {
                    Trace.beginSection("RV FullInvalidate");
                    r();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            k0();
            T();
            y1Var.q();
            if (!this.B) {
                v9 v9Var = this.k;
                int e = v9Var.e();
                int i2 = 0;
                while (true) {
                    if (i2 < e) {
                        dz M = M(v9Var.d(i2));
                        if (M != null && !M.o() && M.k()) {
                            r();
                            break;
                        }
                        i2++;
                    } else {
                        y1Var.c();
                        break;
                    }
                }
            }
            m0(true);
            U(true);
            Trace.endSection();
        }
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = f80.a;
        setMeasuredDimension(ny.g(i, paddingRight, getMinimumWidth()), ny.g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0358, code lost:
    
        if (r7.c.contains(getFocusedChild()) == false) goto L227;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        boolean z;
        dz dzVar;
        View findViewById;
        boolean z2;
        e20 e20Var;
        av avVar;
        boolean g;
        boolean z3;
        if (this.r == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.s == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        zy zyVar = this.l0;
        boolean z4 = false;
        zyVar.i = false;
        boolean z5 = true;
        Object[] objArr = this.A0 && !(this.B0 == getWidth() && this.C0 == getHeight());
        this.B0 = 0;
        this.C0 = 0;
        this.A0 = false;
        if (zyVar.d == 1) {
            s();
            this.s.s0(this);
            t();
        } else {
            y1 y1Var = this.j;
            if ((((ArrayList) y1Var.d).isEmpty() || ((ArrayList) y1Var.c).isEmpty()) && !objArr == true && this.s.n == getWidth() && this.s.o == getHeight()) {
                this.s.s0(this);
            } else {
                this.s.s0(this);
                t();
            }
        }
        zyVar.a(4);
        k0();
        T();
        zyVar.d = 1;
        boolean z6 = zyVar.j;
        v9 v9Var = this.k;
        ty tyVar = this.h;
        o4 o4Var = this.l;
        if (z6) {
            int e = v9Var.e() - 1;
            while (e >= 0) {
                dz M = M(v9Var.d(e));
                if (M.o()) {
                    z3 = z5;
                } else {
                    long K = K(M);
                    this.Q.getClass();
                    av avVar2 = new av();
                    avVar2.a(M);
                    rq rqVar = (rq) o4Var.h;
                    z3 = z5;
                    e20 e20Var2 = (e20) o4Var.g;
                    dz dzVar2 = (dz) rqVar.b(K);
                    if (dzVar2 == null || dzVar2.o()) {
                        o4Var.a(M, avVar2);
                    } else {
                        n80 n80Var = (n80) e20Var2.get(dzVar2);
                        boolean z7 = (n80Var == null || (n80Var.a & 1) == 0) ? z4 : z3;
                        n80 n80Var2 = (n80) e20Var2.get(M);
                        boolean z8 = (n80Var2 == null || (n80Var2.a & 1) == 0) ? z4 : z3;
                        if (z7 && dzVar2 == M) {
                            o4Var.a(M, avVar2);
                        } else {
                            av J = o4Var.J(dzVar2, 4);
                            o4Var.a(M, avVar2);
                            av J2 = o4Var.J(M, 8);
                            if (J == null) {
                                int e2 = v9Var.e();
                                for (int i = 0; i < e2; i++) {
                                    dz M2 = M(v9Var.d(i));
                                    if (M2 != M && K(M2) == K) {
                                        ey eyVar = this.r;
                                        if (eyVar == null || !eyVar.b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + M2 + " \n View Holder 2:" + M + B());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + M2 + " \n View Holder 2:" + M + B());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + dzVar2 + " cannot be found but it is necessary for " + M + B());
                            } else {
                                dzVar2.n(false);
                                if (z7) {
                                    h(dzVar2);
                                }
                                if (dzVar2 != M) {
                                    if (z8) {
                                        h(M);
                                    }
                                    dzVar2.h = M;
                                    h(dzVar2);
                                    tyVar.m(dzVar2);
                                    M.n(false);
                                    M.i = dzVar2;
                                }
                                if (this.Q.a(dzVar2, M, J, J2)) {
                                    W();
                                }
                            }
                        }
                    }
                }
                e--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            e20 e20Var3 = (e20) o4Var.g;
            int i2 = e20Var3.h - 1;
            while (i2 >= 0) {
                dz dzVar3 = (dz) e20Var3.f(i2);
                n80 n80Var3 = (n80) e20Var3.g(i2);
                int i3 = n80Var3.a;
                int i4 = i3 & 3;
                dy dyVar = this.E0;
                if (i4 == 3) {
                    RecyclerView recyclerView = dyVar.f;
                    recyclerView.s.l0(dzVar3.a, recyclerView.h);
                } else if ((i3 & 1) != 0) {
                    av avVar3 = n80Var3.b;
                    if (avVar3 == null) {
                        RecyclerView recyclerView2 = dyVar.f;
                        recyclerView2.s.l0(dzVar3.a, recyclerView2.h);
                    } else {
                        dyVar.g(dzVar3, avVar3, n80Var3.c);
                    }
                } else if ((i3 & 14) == 14) {
                    dyVar.f(dzVar3, n80Var3.b, n80Var3.c);
                } else if ((i3 & 12) == 12) {
                    av avVar4 = n80Var3.b;
                    av avVar5 = n80Var3.c;
                    dyVar.getClass();
                    dzVar3.n(false);
                    RecyclerView recyclerView3 = dyVar.f;
                    boolean z9 = recyclerView3.H;
                    jy jyVar = recyclerView3.Q;
                    if (!z9) {
                        je jeVar = (je) jyVar;
                        jeVar.getClass();
                        int i5 = avVar4.a;
                        int i6 = avVar5.a;
                        if (i5 == i6) {
                            e20Var = e20Var3;
                            if (avVar4.b == avVar5.b) {
                                jeVar.c(dzVar3);
                                g = false;
                                if (g) {
                                    recyclerView3.W();
                                }
                                avVar = null;
                                n80Var3.a = 0;
                                n80Var3.b = avVar;
                                n80Var3.c = avVar;
                                n80.d.c(n80Var3);
                                i2--;
                                e20Var3 = e20Var;
                            }
                        } else {
                            e20Var = e20Var3;
                        }
                        g = jeVar.g(dzVar3, i5, avVar4.b, i6, avVar5.b);
                        if (g) {
                        }
                        avVar = null;
                        n80Var3.a = 0;
                        n80Var3.b = avVar;
                        n80Var3.c = avVar;
                        n80.d.c(n80Var3);
                        i2--;
                        e20Var3 = e20Var;
                    } else if (jyVar.a(dzVar3, dzVar3, avVar4, avVar5)) {
                        recyclerView3.W();
                    }
                } else {
                    e20Var = e20Var3;
                    if ((i3 & 4) != 0) {
                        avVar = null;
                        dyVar.g(dzVar3, n80Var3.b, null);
                    } else {
                        avVar = null;
                        if ((i3 & 8) != 0) {
                            dyVar.f(dzVar3, n80Var3.b, n80Var3.c);
                        }
                    }
                    n80Var3.a = 0;
                    n80Var3.b = avVar;
                    n80Var3.c = avVar;
                    n80.d.c(n80Var3);
                    i2--;
                    e20Var3 = e20Var;
                }
                e20Var = e20Var3;
                avVar = null;
                n80Var3.a = 0;
                n80Var3.b = avVar;
                n80Var3.c = avVar;
                n80.d.c(n80Var3);
                i2--;
                e20Var3 = e20Var;
            }
        } else {
            z = true;
        }
        View view = null;
        this.s.k0(tyVar);
        zyVar.b = zyVar.e;
        this.H = false;
        this.I = false;
        zyVar.j = false;
        zyVar.k = false;
        this.s.f = false;
        ArrayList arrayList = tyVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        ny nyVar = this.s;
        if (nyVar.k) {
            nyVar.j = 0;
            nyVar.k = false;
            tyVar.n();
        }
        this.s.e0(zyVar);
        boolean z10 = z;
        U(z10);
        m0(false);
        ((e20) o4Var.g).clear();
        ((rq) o4Var.h).a();
        int[] iArr = this.t0;
        int i7 = iArr[0];
        int i8 = iArr[z10 ? 1 : 0];
        F(iArr);
        if ((iArr[0] == i7 && iArr[z10 ? 1 : 0] == i8) ? false : true) {
            w(0, 0);
        }
        if (this.h0 && this.r != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j = zyVar.m;
            if (j != -1 && (z2 = this.r.b) && z2) {
                int h = v9Var.h();
                dzVar = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= h) {
                        break;
                    }
                    dz M3 = M(v9Var.g(i9));
                    if (M3 != null && !M3.h() && M3.e == j) {
                        if (!v9Var.c.contains(M3.a)) {
                            dzVar = M3;
                            break;
                        }
                        dzVar = M3;
                    }
                    i9++;
                }
            } else {
                dzVar = null;
            }
            if (dzVar != null) {
                View view2 = dzVar.a;
                if (!v9Var.c.contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i10 = zyVar.n;
                        if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (v9Var.e() > 0) {
                int i11 = zyVar.l;
                if (i11 == -1) {
                    i11 = 0;
                }
                int b = zyVar.b();
                for (int i12 = i11; i12 < b; i12++) {
                    dz H = H(i12);
                    if (H == null) {
                        break;
                    }
                    View view3 = H.a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b, i11) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    dz H2 = H(min);
                    if (H2 == null) {
                        break;
                    }
                    View view4 = H2.a;
                    if (view4.hasFocusable()) {
                        view = view4;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        zyVar.m = -1L;
        zyVar.l = -1;
        zyVar.n = -1;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        dz M = M(view);
        if (M != null) {
            if (M.j()) {
                M.j &= -257;
            } else if (!M.o()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(M);
                l8.q(sb, B());
                return;
            }
        } else if (G0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            l8.q(sb2, B());
            return;
        }
        view.clearAnimation();
        M(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        up upVar = this.s.e;
        if ((upVar == null || !upVar.e) && !P() && view2 != null) {
            d0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.s.n0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ti) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A != 0 || this.C) {
            this.B = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        int J;
        View view;
        n80 n80Var;
        View D;
        zy zyVar = this.l0;
        zyVar.a(1);
        C(zyVar);
        zyVar.i = false;
        k0();
        o4 o4Var = this.l;
        e20 e20Var = (e20) o4Var.g;
        e20 e20Var2 = (e20) o4Var.g;
        e20Var.clear();
        rq rqVar = (rq) o4Var.h;
        rqVar.a();
        T();
        X();
        dz dzVar = null;
        View focusedChild = (this.h0 && hasFocus() && this.r != null) ? getFocusedChild() : null;
        if (focusedChild != null && (D = D(focusedChild)) != null) {
            dzVar = L(D);
        }
        if (dzVar == null) {
            zyVar.m = -1L;
            zyVar.l = -1;
            zyVar.n = -1;
        } else {
            zyVar.m = this.r.b ? dzVar.e : -1L;
            if (!this.H) {
                if (dzVar.h()) {
                    J = dzVar.d;
                } else {
                    RecyclerView recyclerView = dzVar.r;
                    if (recyclerView != null) {
                        J = recyclerView.J(dzVar);
                    }
                }
                zyVar.l = J;
                view = dzVar.a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                zyVar.n = id;
            }
            J = -1;
            zyVar.l = J;
            view = dzVar.a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            zyVar.n = id2;
        }
        zyVar.h = zyVar.j && this.p0;
        this.p0 = false;
        this.o0 = false;
        zyVar.g = zyVar.k;
        zyVar.e = this.r.a();
        F(this.t0);
        boolean z = zyVar.j;
        v9 v9Var = this.k;
        if (z) {
            int e = v9Var.e();
            for (int i = 0; i < e; i++) {
                dz M = M(v9Var.d(i));
                if (!M.o() && (!M.f() || this.r.b)) {
                    jy jyVar = this.Q;
                    jy.b(M);
                    M.c();
                    jyVar.getClass();
                    av avVar = new av();
                    avVar.a(M);
                    n80 n80Var2 = (n80) e20Var2.get(M);
                    if (n80Var2 == null) {
                        n80Var2 = n80.a();
                        e20Var2.put(M, n80Var2);
                    }
                    n80Var2.b = avVar;
                    n80Var2.a |= 4;
                    if (zyVar.h && M.k() && !M.h() && !M.o() && !M.f()) {
                        rqVar.d(K(M), M);
                    }
                }
            }
        }
        if (zyVar.k) {
            int h = v9Var.h();
            for (int i2 = 0; i2 < h; i2++) {
                dz M2 = M(v9Var.g(i2));
                if (G0 && M2.c == -1 && !M2.h()) {
                    l8.u("view holder cannot have position -1 unless it is removed".concat(B()));
                    return;
                }
                if (!M2.o() && M2.d == -1) {
                    M2.d = M2.c;
                }
            }
            boolean z2 = zyVar.f;
            zyVar.f = false;
            this.s.d0(this.h, zyVar);
            zyVar.f = z2;
            for (int i3 = 0; i3 < v9Var.e(); i3++) {
                dz M3 = M(v9Var.d(i3));
                if (!M3.o() && ((n80Var = (n80) e20Var2.get(M3)) == null || (n80Var.a & 4) == 0)) {
                    jy.b(M3);
                    boolean z3 = (M3.j & 8192) != 0;
                    jy jyVar2 = this.Q;
                    M3.c();
                    jyVar2.getClass();
                    av avVar2 = new av();
                    avVar2.a(M3);
                    if (z3) {
                        Z(M3, avVar2);
                    } else {
                        n80 n80Var3 = (n80) e20Var2.get(M3);
                        if (n80Var3 == null) {
                            n80Var3 = n80.a();
                            e20Var2.put(M3, n80Var3);
                        }
                        n80Var3.a |= 2;
                        n80Var3.b = avVar2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        U(true);
        m0(false);
        zyVar.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        ny nyVar = this.s;
        if (nyVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.C) {
            return;
        }
        boolean d = nyVar.d();
        boolean e = this.s.e();
        if (d || e) {
            if (!d) {
                i = 0;
            }
            if (!e) {
                i2 = 0;
            }
            e0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.E |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(fz fzVar) {
        this.s0 = fzVar;
        f80.m(this, fzVar);
    }

    public void setAdapter(ey eyVar) {
        setLayoutFrozen(false);
        ey eyVar2 = this.r;
        vy vyVar = this.g;
        if (eyVar2 != null) {
            eyVar2.a.unregisterObserver(vyVar);
            this.r.getClass();
        }
        jy jyVar = this.Q;
        if (jyVar != null) {
            jyVar.e();
        }
        ny nyVar = this.s;
        ty tyVar = this.h;
        if (nyVar != null) {
            nyVar.j0(tyVar);
            this.s.k0(tyVar);
        }
        tyVar.a.clear();
        tyVar.g();
        y1 y1Var = this.j;
        y1Var.r((ArrayList) y1Var.c);
        y1Var.r((ArrayList) y1Var.d);
        y1Var.a = 0;
        ey eyVar3 = this.r;
        this.r = eyVar;
        if (eyVar != null) {
            eyVar.a.registerObserver(vyVar);
        }
        ny nyVar2 = this.s;
        if (nyVar2 != null) {
            nyVar2.Q();
        }
        ey eyVar4 = this.r;
        tyVar.a.clear();
        tyVar.g();
        tyVar.f(eyVar3, true);
        sy c = tyVar.c();
        if (eyVar3 != null) {
            c.b--;
        }
        if (c.b == 0) {
            SparseArray sparseArray = c.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ry ryVar = (ry) sparseArray.valueAt(i);
                ArrayList arrayList = ryVar.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    m60.h(((dz) obj).a);
                }
                ryVar.a.clear();
            }
        }
        if (eyVar4 != null) {
            c.b++;
        }
        tyVar.e();
        this.l0.f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(hy hyVar) {
        if (hyVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.m) {
            this.P = null;
            this.N = null;
            this.O = null;
            this.M = null;
        }
        this.m = z;
        super.setClipToPadding(z);
        if (this.z) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(iy iyVar) {
        iyVar.getClass();
        this.L = iyVar;
        this.P = null;
        this.N = null;
        this.O = null;
        this.M = null;
    }

    public void setHasFixedSize(boolean z) {
        this.y = z;
    }

    public void setItemAnimator(jy jyVar) {
        jy jyVar2 = this.Q;
        if (jyVar2 != null) {
            jyVar2.e();
            this.Q.a = null;
        }
        this.Q = jyVar;
        if (jyVar != null) {
            jyVar.a = this.q0;
        }
    }

    public void setItemViewCacheSize(int i) {
        ty tyVar = this.h;
        tyVar.e = i;
        tyVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(ny nyVar) {
        RecyclerView recyclerView;
        if (nyVar == this.s) {
            return;
        }
        o0();
        ny nyVar2 = this.s;
        ty tyVar = this.h;
        if (nyVar2 != null) {
            jy jyVar = this.Q;
            if (jyVar != null) {
                jyVar.e();
            }
            this.s.j0(tyVar);
            this.s.k0(tyVar);
            tyVar.a.clear();
            tyVar.g();
            if (this.x) {
                ny nyVar3 = this.s;
                nyVar3.g = false;
                nyVar3.S(this);
            }
            this.s.w0(null);
            this.s = null;
        } else {
            tyVar.a.clear();
            tyVar.g();
        }
        v9 v9Var = this.k;
        v9Var.b.h();
        ArrayList arrayList = v9Var.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = v9Var.a.f;
            if (size < 0) {
                break;
            }
            dz M = M((View) arrayList.get(size));
            if (M != null) {
                int i = M.p;
                if (recyclerView.P()) {
                    M.q = i;
                    recyclerView.y0.add(M);
                } else {
                    M.a.setImportantForAccessibility(i);
                }
                M.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.s = nyVar;
        if (nyVar != null) {
            if (nyVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(nyVar);
                String B = nyVar.b.B();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(B);
                throw new IllegalArgumentException(sb.toString());
            }
            nyVar.w0(this);
            if (this.x) {
                ny nyVar4 = this.s;
                nyVar4.g = true;
                nyVar4.R(this);
            }
        }
        tyVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            l8.l("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        xu scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = f80.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(py pyVar) {
        this.c0 = pyVar;
    }

    @Deprecated
    public void setOnScrollListener(qy qyVar) {
        this.m0 = qyVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.h0 = z;
    }

    public void setRecycledViewPool(sy syVar) {
        ty tyVar = this.h;
        RecyclerView recyclerView = tyVar.h;
        tyVar.f(recyclerView.r, false);
        if (tyVar.g != null) {
            r1.b--;
        }
        tyVar.g = syVar;
        if (syVar != null && recyclerView.getAdapter() != null) {
            tyVar.g.b++;
        }
        tyVar.e();
    }

    public void setScrollState(int i) {
        up upVar;
        if (i == this.R) {
            return;
        }
        if (H0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.R, new Exception());
        }
        this.R = i;
        if (i != 2) {
            cz czVar = this.i0;
            czVar.l.removeCallbacks(czVar);
            czVar.h.abortAnimation();
            ny nyVar = this.s;
            if (nyVar != null && (upVar = nyVar.e) != null) {
                upVar.i();
            }
        }
        ny nyVar2 = this.s;
        if (nyVar2 != null) {
            nyVar2.h0(i);
        }
        qy qyVar = this.m0;
        if (qyVar != null) {
            qyVar.a(this, i);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qy) this.n0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.b0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.b0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(bz bzVar) {
        this.h.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.C) {
            k("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.C = true;
                this.D = true;
                o0();
                return;
            }
            this.C = false;
            if (this.B && this.s != null && this.r != null) {
                requestLayout();
            }
            this.B = false;
        }
    }

    public final void t() {
        k0();
        T();
        zy zyVar = this.l0;
        zyVar.a(6);
        this.j.d();
        zyVar.e = this.r.a();
        zyVar.c = 0;
        if (this.i != null) {
            ey eyVar = this.r;
            int h = n20.h(eyVar.c);
            if (h == 1 ? eyVar.a() > 0 : h != 2) {
                Parcelable parcelable = this.i.h;
                if (parcelable != null) {
                    this.s.f0(parcelable);
                }
                this.i = null;
            }
        }
        zyVar.g = false;
        this.s.d0(this.h, zyVar);
        zyVar.f = false;
        zyVar.j = zyVar.j && this.Q != null;
        zyVar.d = 4;
        U(true);
        m0(false);
    }

    public final boolean u(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w(int i, int i2) {
        this.K++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        qy qyVar = this.m0;
        if (qyVar != null) {
            qyVar.b(this, i, i2);
        }
        ArrayList arrayList = this.n0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((qy) this.n0.get(size)).b(this, i, i2);
            }
        }
        this.K--;
    }

    public final void x() {
        if (this.P != null) {
            return;
        }
        ((az) this.L).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.P = edgeEffect;
        if (this.m) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.M != null) {
            return;
        }
        ((az) this.L).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.M = edgeEffect;
        if (this.m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.O != null) {
            return;
        }
        ((az) this.L).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.O = edgeEffect;
        if (this.m) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ny nyVar = this.s;
        if (nyVar != null) {
            return nyVar.t(layoutParams);
        }
        l8.u("RecyclerView has no LayoutManager".concat(B()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(uy uyVar) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.recyclerViewStyle);
    }
}

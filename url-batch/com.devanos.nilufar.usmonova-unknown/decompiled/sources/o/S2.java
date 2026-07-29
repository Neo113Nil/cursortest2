package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class S2 extends ViewGroup implements ZG, FO, InterfaceC0061Cg {
    public static Class E0;
    public static Method F0;
    public boolean A;
    public final InterfaceC1808r9 A0;
    public final C1089gD B;
    public boolean B0;
    public final C0785bb C;
    public final C1234iQ C0;
    public InterfaceC2114vp D;
    public final C1623oL D0;
    public final C2130w2 E;
    public boolean F;
    public final C2 G;
    public final C0765bH H;
    public boolean I;
    public T3 J;
    public C0924dj K;
    public C0603Xd L;
    public boolean M;
    public final KB N;
    public final R3 O;
    public long P;
    public final int[] Q;
    public final float[] R;
    public final float[] S;
    public long T;
    public boolean U;
    public long V;
    public boolean W;
    public final C2278yH a0;
    public final C1645oh b0;
    public InterfaceC2114vp c0;
    public final E2 d0;
    public final F2 e0;
    public final G2 f0;
    public final C0540Us g0;
    public long h;
    public final C1303jV h0;
    public final boolean i;
    public final AtomicReference i0;
    public final C0079Cy j;
    public final C1097gL j0;
    public final C2278yH k;
    public final C1623oL k0;
    public final androidx.compose.ui.focus.a l;
    public final C2278yH l0;
    public InterfaceC0189He m;
    public int m0;
    public final ViewOnDragListenerC0634Yi n;
    public final C2278yH n0;

    /* renamed from: o, reason: collision with root package name */
    public final R00 f104o;
    public final C0218Ih o0;
    public final C1178ha p;
    public final C1590ns p0;
    public final C0027Ay q;
    public final VC q0;
    public final S2 r;
    public final C1097gL r0;
    public final BQ s;
    public MotionEvent s0;
    public final C1013f3 t;
    public long t0;
    public ViewOnAttachStateChangeListenerC2132w3 u;
    public final KX u0;
    public final C1800r2 v;
    public final YD v0;
    public final C0950e6 w;
    public final R2 w0;
    public final M7 x;
    public final D1 x0;
    public final ArrayList y;
    public boolean y0;
    public ArrayList z;
    public final Q2 z0;

    /* JADX WARN: Type inference failed for: r5v14, types: [o.E2] */
    /* JADX WARN: Type inference failed for: r5v15, types: [o.F2] */
    /* JADX WARN: Type inference failed for: r5v16, types: [o.G2] */
    public S2(Context context, InterfaceC0189He interfaceC0189He) {
        super(context);
        this.h = 9205357640488583168L;
        int i = 1;
        this.i = true;
        this.j = new C0079Cy();
        C1250ih a = EB.a(context);
        C1097gL c1097gL = C1097gL.i;
        int i2 = X1.b;
        this.k = new C2278yH(a, c1097gL);
        C1516mk c1516mk = new C1516mk();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(c1516mk);
        int i3 = 0;
        this.l = new androidx.compose.ui.focus.a(new M2(1, this, S2.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", i3, 0), new N2(2, this, S2.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new J2(0, this, S2.class, "onClearFocusForOwner", "onClearFocusForOwner()V", i3, 1), new O2(this, S2.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        ViewOnDragListenerC0634Yi viewOnDragListenerC0634Yi = new ViewOnDragListenerC0634Yi();
        this.m = interfaceC0189He;
        this.n = viewOnDragListenerC0634Yi;
        this.f104o = new R00();
        int i4 = 0;
        UC a2 = androidx.compose.ui.input.key.a.a(new P2(this, i4));
        UC a3 = androidx.compose.ui.input.rotary.a.a();
        this.p = new C1178ha();
        C0027Ay c0027Ay = new C0027Ay(3);
        LB lb = c0027Ay.p;
        GO go = GO.b;
        if (!AbstractC0048Bt.h(lb, go)) {
            c0027Ay.p = go;
            c0027Ay.s();
        }
        c0027Ay.I(getDensity());
        c0027Ay.K(emptySemanticsElement.c(a3).c(a2).c(((androidx.compose.ui.focus.a) getFocusOwner()).g).c(viewOnDragListenerC0634Yi.c));
        this.q = c0027Ay;
        this.r = this;
        this.s = new BQ(getRoot(), c1516mk);
        C1013f3 c1013f3 = new C1013f3(this);
        this.t = c1013f3;
        this.u = new ViewOnAttachStateChangeListenerC2132w3(this, new J2(0, this, AbstractC1473m3.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0));
        C1800r2 c1800r2 = new C1800r2();
        Object systemService = context.getSystemService("accessibility");
        AbstractC0048Bt.l(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.v = c1800r2;
        this.w = new C0950e6(this);
        this.x = new M7();
        this.y = new ArrayList();
        this.B = new C1089gD();
        C0027Ay root = getRoot();
        C0785bb c0785bb = new C0785bb();
        c0785bb.b = root;
        c0785bb.c = new C0950e6((C0384Os) root.u.c);
        c0785bb.d = new C1590ns(28, (byte) 0);
        c0785bb.e = new C2182wr();
        this.C = c0785bb;
        this.D = I2.i;
        int i5 = Build.VERSION.SDK_INT;
        this.E = i5 >= 26 ? new C2130w2(this, getAutofillTree()) : null;
        this.G = new C2(context);
        this.H = new C0765bH(new P2(this, i));
        this.N = new KB(getRoot());
        ViewConfiguration.get(context);
        this.O = new R3();
        this.P = AbstractC1305jX.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.Q = new int[]{0, 0};
        float[] r = AbstractC1473m3.r();
        this.R = AbstractC1473m3.r();
        this.S = AbstractC1473m3.r();
        this.T = -1L;
        this.V = 9187343241974906880L;
        this.W = true;
        this.a0 = AbstractC2219xO.r(null);
        Q2 q2 = new Q2(this, i);
        C0950e6 c0950e6 = AbstractC2355zS.a;
        this.b0 = new C1645oh(q2);
        this.d0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.E2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                S2.this.G();
            }
        };
        this.e0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: o.F2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                S2.this.G();
            }
        };
        this.f0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: o.G2
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                ((C2278yH) S2.this.p0.i).setValue(new C0566Vs(z ? 1 : 2));
            }
        };
        this.g0 = new C0540Us(getView(), this);
        C1303jV c1303jV = new C1303jV();
        new AtomicReference(null);
        this.h0 = c1303jV;
        this.i0 = new AtomicReference(null);
        getTextInputService();
        this.j0 = new C1097gL(29);
        int i6 = 14;
        this.k0 = new C1623oL(i6);
        this.l0 = new C2278yH(AbstractC0868ct.o(context), c1097gL);
        this.m0 = i5 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        EnumC2057uy enumC2057uy = EnumC2057uy.h;
        EnumC2057uy enumC2057uy2 = layoutDirection != 0 ? layoutDirection != 1 ? null : EnumC2057uy.i : enumC2057uy;
        this.n0 = AbstractC2219xO.r(enumC2057uy2 != null ? enumC2057uy2 : enumC2057uy);
        this.o0 = new C0218Ih(i6);
        this.p0 = new C1590ns(isInTouchMode() ? 1 : 2);
        VC vc = new VC();
        new YD(new X7[16]);
        new YD(new AbstractC0946e20[16]);
        new YD(new C0027Ay[16]);
        new YD(new AbstractC0946e20[16]);
        this.q0 = vc;
        this.r0 = new C1097gL(16);
        this.u0 = new KX(1);
        this.v0 = new YD(new InterfaceC1455lp[16]);
        this.w0 = new R2(i4, this);
        this.x0 = new D1(i, this);
        this.z0 = new Q2(this, i4);
        this.A0 = i5 < 29 ? new C2002u5(r) : new C1874s9();
        addOnAttachStateChangeListener(this.u);
        setWillNotDraw(false);
        setFocusable(true);
        if (i5 >= 26) {
            C1407l3.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AZ.h(this, c1013f3);
        setOnDragListener(viewOnDragListenerC0634Yi);
        getRoot().b(this);
        if (i5 >= 29) {
            C1145h3.a.a(this);
        }
        this.C0 = i5 >= 31 ? new C1234iQ() : null;
        C1623oL c1623oL = new C1623oL(13);
        FI.a.getClass();
        this.D0 = c1623oL;
    }

    public static final boolean e(S2 s2, C0146Fn c0146Fn, C1032fM c1032fM) {
        Integer R;
        if (s2.isFocused() || s2.hasFocus()) {
            return true;
        }
        return super.requestFocus((c0146Fn == null || (R = AbstractC0946e20.R(c0146Fn.a)) == null) ? 130 : R.intValue(), c1032fM != null ? AbstractC0868ct.Z(c1032fM) : null);
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof S2) {
                ((S2) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H2 get_viewTreeOwners() {
        return (H2) this.a0.getValue();
    }

    public static View h(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC0048Bt.h(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View h = h(viewGroup.getChildAt(i2), i);
                    if (h != null) {
                        return h;
                    }
                }
            }
        }
        return null;
    }

    public static void m(C0027Ay c0027Ay) {
        c0027Ay.r();
        YD o2 = c0027Ay.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                m((C0027Ay) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean o(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        z = false;
                        if (!z) {
                            int pointerCount = motionEvent.getPointerCount();
                            for (int i = 1; i < pointerCount; i++) {
                                float x2 = motionEvent.getX(i);
                                if (!Float.isInfinite(x2) && !Float.isNaN(x2)) {
                                    float y2 = motionEvent.getY(i);
                                    if (!Float.isInfinite(y2) && !Float.isNaN(y2) && (Build.VERSION.SDK_INT < 29 || C1285jD.a.a(motionEvent, i))) {
                                        z = false;
                                        if (!z) {
                                            break;
                                        }
                                    }
                                }
                                z = true;
                                if (!z) {
                                }
                            }
                        }
                        return z;
                    }
                }
            }
        }
        z = true;
        if (!z) {
        }
        return z;
    }

    private void setDensity(InterfaceC1119gh interfaceC1119gh) {
        this.k.setValue(interfaceC1119gh);
    }

    private void setFontFamilyResolver(InterfaceC0509Tn interfaceC0509Tn) {
        this.l0.setValue(interfaceC0509Tn);
    }

    private void setLayoutDirection(EnumC2057uy enumC2057uy) {
        this.n0.setValue(enumC2057uy);
    }

    private final void set_viewTreeOwners(H2 h2) {
        this.a0.setValue(h2);
    }

    public final void A() {
        if (this.U) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.T) {
            this.T = currentAnimationTimeMillis;
            InterfaceC1808r9 interfaceC1808r9 = this.A0;
            float[] fArr = this.R;
            interfaceC1808r9.h(this, fArr);
            AbstractC1807r8.K(fArr, this.S);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.Q;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.V = PX.h(f - iArr[0], f2 - iArr[1]);
        }
    }

    public final void B(YG yg) {
        KX kx;
        YD yd;
        Reference poll;
        if (this.K != null) {
            LZ lz = NZ.w;
        }
        do {
            kx = this.u0;
            ReferenceQueue referenceQueue = (ReferenceQueue) kx.i;
            yd = (YD) kx.h;
            poll = referenceQueue.poll();
            if (poll != null) {
                yd.m(poll);
            }
        } while (poll != null);
        yd.b(new WeakReference(yg, (ReferenceQueue) kx.i));
    }

    public final void C(C0027Ay c0027Ay) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c0027Ay != null) {
            while (c0027Ay != null && c0027Ay.v.q.l == 1) {
                if (!this.M) {
                    C0027Ay l = c0027Ay.l();
                    if (l == null) {
                        break;
                    }
                    long j = ((C0384Os) l.u.c).e;
                    if (C0603Xd.b(j) && C0603Xd.a(j)) {
                        break;
                    }
                }
                c0027Ay = c0027Ay.l();
            }
            if (c0027Ay == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long D(long j) {
        A();
        return AbstractC1473m3.Q(this.S, PX.h(BF.b(j) - BF.b(this.V), BF.c(j) - BF.c(this.V)));
    }

    public final int E(MotionEvent motionEvent) {
        Object obj;
        if (this.B0) {
            this.B0 = false;
            int metaState = motionEvent.getMetaState();
            this.f104o.getClass();
            R00.b.setValue(new KI(metaState));
        }
        C1089gD c1089gD = this.B;
        C0208Hx a = c1089gD.a(motionEvent, this);
        C0785bb c0785bb = this.C;
        if (a == null) {
            c0785bb.e();
            return 0;
        }
        List list = (List) a.i;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((JI) obj).e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        JI ji = (JI) obj;
        if (ji != null) {
            this.h = ji.d;
        }
        int d = c0785bb.d(a, this, p(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (d & 1) != 0) {
            return d;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c1089gD.c.delete(pointerId);
        c1089gD.b.delete(pointerId);
        return d;
    }

    public final void F(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            long r = r(PX.h(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = BF.b(r);
            pointerCoords.y = BF.c(r);
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0208Hx a = this.B.a(obtain, this);
        AbstractC0048Bt.k(a);
        this.C.d(a, this, true);
        obtain.recycle();
    }

    public final void G() {
        int[] iArr = this.Q;
        getLocationOnScreen(iArr);
        long j = this.P;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        boolean z = false;
        int i3 = iArr[0];
        if (i != i3 || i2 != iArr[1]) {
            this.P = AbstractC1305jX.c(i3, iArr[1]);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                getRoot().v.q.J();
                z = true;
            }
        }
        this.N.a(z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C2130w2 c2130w2;
        if (Build.VERSION.SDK_INT < 26 || (c2130w2 = this.E) == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue g = AbstractC1665p0.g(sparseArray.get(keyAt));
            I7 i7 = I7.a;
            if (i7.d(g)) {
                M7 m7 = c2130w2.b;
                i7.i(g).toString();
                if (m7.a.get(Integer.valueOf(keyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (i7.b(g)) {
                    throw new WE("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (i7.c(g)) {
                    throw new WE("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (i7.e(g)) {
                    throw new WE("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // o.InterfaceC0061Cg
    public final void c(InterfaceC0365Nz interfaceC0365Nz) {
        setShowLayoutBounds(C1097gL.r());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        this.t.g(this.h, false);
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        this.t.g(this.h, true);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        if (!isAttachedToWindow()) {
            m(getRoot());
        }
        s(true);
        synchronized (AbstractC2025uS.b) {
            QD qd = ((C0201Hq) AbstractC2025uS.i.get()).h;
            if (qd != null) {
                z = qd.h();
            }
        }
        if (z) {
            AbstractC2025uS.a();
        }
        this.A = true;
        C1178ha c1178ha = this.p;
        C2262y2 c2262y2 = c1178ha.a;
        Canvas canvas2 = c2262y2.a;
        c2262y2.a = canvas;
        getRoot().g(c2262y2, null);
        c1178ha.a.a = canvas2;
        if (!this.y.isEmpty()) {
            int size = this.y.size();
            for (int i = 0; i < size; i++) {
                ((YG) this.y.get(i)).f();
            }
        }
        if (NZ.A) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.y.clear();
        this.A = false;
        ArrayList arrayList = this.z;
        if (arrayList != null) {
            this.y.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        MO mo;
        int size;
        C1970td c1970td;
        TC tc;
        C1970td c1970td2;
        if (this.y0) {
            D1 d1 = this.x0;
            removeCallbacks(d1);
            if (motionEvent.getActionMasked() == 8) {
                this.y0 = false;
            } else {
                d1.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (o(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (l(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Method method = JZ.a;
            GZ.b(viewConfiguration);
        } else {
            JZ.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i >= 26) {
            GZ.a(viewConfiguration);
        } else {
            JZ.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) getFocusOwner();
        if (aVar.e.a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        C0405Pn m = AbstractC1052fg.m(aVar.d);
        if (m != null) {
            TC tc2 = m.b;
            if (!tc2.m) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C0027Ay J = AbstractC0946e20.J(m);
            loop0: while (true) {
                if (J == null) {
                    tc = null;
                    break;
                }
                if ((((TC) J.u.f).d & 16384) != 0) {
                    while (tc2 != null) {
                        if ((tc2.c & 16384) != 0) {
                            tc = tc2;
                            while (tc != null) {
                                if (tc instanceof MO) {
                                    break loop0;
                                }
                                tc = null;
                            }
                        }
                        tc2 = tc2.e;
                    }
                }
                J = J.l();
                tc2 = (J == null || (c1970td2 = J.u) == null) ? null : (IU) c1970td2.e;
            }
            mo = (MO) tc;
        } else {
            mo = null;
        }
        if (mo != null) {
            TC tc3 = mo.b;
            if (!tc3.m) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            TC tc4 = tc3.e;
            C0027Ay J2 = AbstractC0946e20.J(mo);
            ArrayList arrayList = null;
            while (J2 != null) {
                if ((((TC) J2.u.f).d & 16384) != 0) {
                    while (tc4 != null) {
                        if ((tc4.c & 16384) != 0) {
                            for (TC tc5 = tc4; tc5 != null; tc5 = null) {
                                if (tc5 instanceof MO) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(tc5);
                                }
                            }
                        }
                        tc4 = tc4.e;
                    }
                }
                J2 = J2.l();
                tc4 = (J2 == null || (c1970td = J2.u) == null) ? null : (IU) c1970td.e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i2 = size - 1;
                    ((MO) arrayList.get(size)).getClass();
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
            for (TC tc6 = tc3; tc6 != null; tc6 = null) {
                if (tc6 instanceof MO) {
                }
            }
            while (tc3 != null) {
                if (tc3 instanceof MO) {
                }
                tc3 = null;
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    I2 i22 = ((MO) arrayList.get(i3)).n;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0143, code lost:
    
        if (q(r24) == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        C1970td c1970td;
        boolean z;
        boolean z2 = this.y0;
        D1 d1 = this.x0;
        if (z2) {
            removeCallbacks(d1);
            d1.run();
        }
        if (!o(motionEvent) && isAttachedToWindow()) {
            C1013f3 c1013f3 = this.t;
            S2 s2 = c1013f3.d;
            AccessibilityManager accessibilityManager = c1013f3.g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    s2.s(true);
                    C2182wr c2182wr = new C2182wr();
                    C0027Ay root = s2.getRoot();
                    long h = PX.h(x, y);
                    C1970td c1970td2 = root.u;
                    ME me = (ME) c1970td2.d;
                    C1823rO c1823rO = ME.D;
                    ((ME) c1970td2.d).l0(ME.G, me.e0(h), c2182wr, true, true);
                    TC tc = (TC) AbstractC0720ac.w0(c2182wr);
                    C0027Ay J = tc != null ? AbstractC0946e20.J(tc) : null;
                    if (J != null && (c1970td = J.u) != null && c1970td.f(8)) {
                        C2287yQ b = AbstractC2219xO.b(J, false);
                        ME c = b.c();
                        if (!(c != null ? c.o0() : false)) {
                            if (!b.d.h.containsKey(CQ.m)) {
                                z = true;
                                if (z) {
                                    if (s2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(J) != null) {
                                        throw new ClassCastException();
                                    }
                                    i = c1013f3.u(J.c);
                                    s2.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                                    i2 = c1013f3.e;
                                    if (i2 != i) {
                                        c1013f3.e = i;
                                        C1013f3.y(c1013f3, i, 128, null, 12);
                                        C1013f3.y(c1013f3, i2, 256, null, 12);
                                    }
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    i = Integer.MIN_VALUE;
                    s2.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    i2 = c1013f3.e;
                    if (i2 != i) {
                    }
                } else if (action == 10) {
                    int i3 = c1013f3.e;
                    if (i3 == Integer.MIN_VALUE) {
                        s2.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i3 != Integer.MIN_VALUE) {
                        c1013f3.e = Integer.MIN_VALUE;
                        C1013f3.y(c1013f3, Integer.MIN_VALUE, 128, null, 12);
                        C1013f3.y(c1013f3, i3, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && p(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.s0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.s0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.y0 = true;
                        postDelayed(d1, 8L);
                        return false;
                    }
                }
                if ((l(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((androidx.compose.ui.focus.a) getFocusOwner()).b(keyEvent, new K2(this, 0, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f104o.getClass();
        R00.b.setValue(new KI(metaState));
        return ((androidx.compose.ui.focus.a) getFocusOwner()).b(keyEvent, C2234xd.m) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C1970td c1970td;
        if (isFocused()) {
            androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) getFocusOwner();
            if (aVar.e.a()) {
                throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.");
            }
            C0405Pn m = AbstractC1052fg.m(aVar.d);
            if (m != null) {
                TC tc = m.b;
                if (!tc.m) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                C0027Ay J = AbstractC0946e20.J(m);
                while (J != null) {
                    if ((((TC) J.u.f).d & 131072) != 0) {
                        while (tc != null) {
                            if ((tc.c & 131072) != 0) {
                                for (TC tc2 = tc; tc2 != null; tc2 = null) {
                                }
                            }
                            tc = tc.e;
                        }
                    }
                    J = J.l();
                    tc = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C1079g3.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.y0) {
            D1 d1 = this.x0;
            removeCallbacks(d1);
            MotionEvent motionEvent2 = this.s0;
            AbstractC0048Bt.k(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.y0 = false;
            } else {
                d1.run();
            }
        }
        if (!o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || q(motionEvent))) {
            int l = l(motionEvent);
            if ((l & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((l & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return h(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        if (view != null) {
            C1032fM i2 = AbstractC0946e20.i(view);
            C0146Fn S = AbstractC0946e20.S(i);
            if (AbstractC0048Bt.h(((androidx.compose.ui.focus.a) getFocusOwner()).c(S != null ? S.a : 6, i2, I2.j), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i);
    }

    public final T3 getAndroidViewsHandler$ui_release() {
        if (this.J == null) {
            T3 t3 = new T3(getContext());
            this.J = t3;
            addView(t3, -1);
            requestLayout();
        }
        T3 t32 = this.J;
        AbstractC0048Bt.k(t32);
        return t32;
    }

    public G7 getAutofill() {
        return this.E;
    }

    public M7 getAutofillTree() {
        return this.x;
    }

    public final InterfaceC2114vp getConfigurationChangeObserver() {
        return this.D;
    }

    public final ViewOnAttachStateChangeListenerC2132w3 getContentCaptureManager$ui_release() {
        return this.u;
    }

    public InterfaceC0189He getCoroutineContext() {
        return this.m;
    }

    public InterfaceC1119gh getDensity() {
        return (InterfaceC1119gh) this.k.getValue();
    }

    public InterfaceC0608Xi getDragAndDropManager() {
        return this.n;
    }

    public InterfaceC0198Hn getFocusOwner() {
        return this.l;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C0782bY c0782bY;
        C1032fM v = v();
        if (v != null) {
            rect.left = Math.round(v.a);
            rect.top = Math.round(v.b);
            rect.right = Math.round(v.c);
            rect.bottom = Math.round(v.d);
            c0782bY = C0782bY.a;
        } else {
            c0782bY = null;
        }
        if (c0782bY == null) {
            super.getFocusedRect(rect);
        }
    }

    public InterfaceC0509Tn getFontFamilyResolver() {
        return (InterfaceC0509Tn) this.l0.getValue();
    }

    public InterfaceC0483Sn getFontLoader() {
        return this.k0;
    }

    public InterfaceC0486Sq getGraphicsContext() {
        return this.w;
    }

    public InterfaceC1523mr getHapticFeedBack() {
        return this.o0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.N.b.S();
    }

    public InterfaceC0592Ws getInputModeManager() {
        return this.p0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.T;
    }

    @Override // android.view.View, android.view.ViewParent
    public EnumC2057uy getLayoutDirection() {
        return (EnumC2057uy) this.n0.getValue();
    }

    public long getMeasureIteration() {
        KB kb = this.N;
        if (kb.c) {
            return kb.g;
        }
        AbstractC0868ct.V("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    public VC getModifierLocalManager() {
        return this.q0;
    }

    public ZH getPlacementScope() {
        int i = AbstractC0766bI.b;
        return new C1481mB(1, this);
    }

    public GI getPointerIconService() {
        return this.D0;
    }

    public C0027Ay getRoot() {
        return this.q;
    }

    public FO getRootForTest() {
        return this.r;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C1234iQ c1234iQ;
        if (Build.VERSION.SDK_INT < 31 || (c1234iQ = this.C0) == null) {
            return false;
        }
        return ((Boolean) c1234iQ.a.getValue()).booleanValue();
    }

    public BQ getSemanticsOwner() {
        return this.s;
    }

    public C0079Cy getSharedDrawScope() {
        return this.j;
    }

    public boolean getShowLayoutBounds() {
        return this.I;
    }

    public C0765bH getSnapshotObserver() {
        return this.H;
    }

    public GS getSoftwareKeyboardController() {
        return this.j0;
    }

    public C1303jV getTextInputService() {
        return this.h0;
    }

    public InterfaceC1765qV getTextToolbar() {
        return this.r0;
    }

    public FZ getViewConfiguration() {
        return this.O;
    }

    public final H2 getViewTreeOwners() {
        return (H2) this.b0.getValue();
    }

    public Q00 getWindowInfo() {
        return this.f104o;
    }

    public final void i(C0027Ay c0027Ay, boolean z) {
        this.N.d(c0027Ay, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017c), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017c), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017c), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017c), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017c), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:5:0x004f, B:7:0x0058, B:25:0x00da, B:27:0x00e2, B:28:0x00e5, B:30:0x00e9, B:32:0x00ef, B:34:0x00f3, B:35:0x00f9, B:38:0x0101, B:41:0x0109, B:42:0x0115, B:44:0x011b, B:46:0x0121, B:48:0x0127, B:49:0x012d, B:51:0x0131, B:52:0x0135, B:57:0x0148, B:59:0x014c, B:60:0x0153, B:66:0x0163, B:67:0x016d, B:73:0x017c), top: B:4:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0085 A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:87:0x006b, B:89:0x0075, B:94:0x0085, B:97:0x00b4, B:13:0x00b7, B:21:0x00ca, B:23:0x00d0, B:98:0x008d, B:104:0x0099, B:107:0x00a1), top: B:86:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        S2 s2;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        MotionEvent motionEvent4;
        float[] fArr = this.R;
        removeCallbacks(this.w0);
        try {
            this.T = AnimationUtils.currentAnimationTimeMillis();
            this.A0.h(this, fArr);
            AbstractC1807r8.K(fArr, this.S);
            long Q = AbstractC1473m3.Q(fArr, PX.h(motionEvent.getX(), motionEvent.getY()));
            this.V = PX.h(motionEvent.getRawX() - BF.b(Q), motionEvent.getRawY() - BF.c(Q));
            boolean z3 = true;
            this.U = true;
            s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent5 = this.s0;
                boolean z4 = motionEvent5 != null && motionEvent5.getToolType(0) == 3;
                C0785bb c0785bb = this.C;
                if (motionEvent5 != null) {
                    try {
                        if (motionEvent5.getSource() == motionEvent.getSource() && motionEvent5.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent5.getButtonState() != 0 || (actionMasked = motionEvent5.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent5;
                                    c0785bb.e();
                                } else if (motionEvent5.getActionMasked() != 10 && z4) {
                                    F(motionEvent5, 10, motionEvent5.getEventTime(), true);
                                    motionEvent2 = motionEvent5;
                                }
                                boolean z5 = motionEvent.getToolType(0) != 3;
                                if (z4 && z5 && actionMasked2 != 3 && actionMasked2 != 9 && p(motionEvent)) {
                                    s2 = this;
                                    s2.F(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    s2 = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = s2.s0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent6 = s2.s0;
                                    pointerId = motionEvent6 == null ? motionEvent6.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    C1089gD c1089gD = s2.B;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent7 = s2.s0;
                                            float x = motionEvent7 == null ? motionEvent7.getX() : Float.NaN;
                                            MotionEvent motionEvent8 = s2.s0;
                                            z2 = x == motionEvent.getX() || (motionEvent8 != null ? motionEvent8.getY() : Float.NaN) != motionEvent.getY();
                                            motionEvent4 = s2.s0;
                                            if ((motionEvent4 == null ? motionEvent4.getEventTime() : -1L) != motionEvent.getEventTime()) {
                                                z3 = false;
                                            }
                                            if (!z2 || z3) {
                                                if (pointerId >= 0) {
                                                    c1089gD.c.delete(pointerId);
                                                    c1089gD.b.delete(pointerId);
                                                }
                                                ((YD) ((C1590ns) ((C0950e6) c0785bb.c).j).i).h();
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        c1089gD.c.delete(pointerId);
                                        c1089gD.b.delete(pointerId);
                                    }
                                }
                                s2.s0 = MotionEvent.obtainNoHistory(motionEvent);
                                int E = E(motionEvent);
                                Trace.endSection();
                                s2.U = false;
                                return E;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent5;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z4) {
                }
                s2 = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = s2.s0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent62 = s2.s0;
                    if (motionEvent62 == null) {
                    }
                    action = motionEvent.getAction();
                    C1089gD c1089gD2 = s2.B;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent72 = s2.s0;
                        if (motionEvent72 == null) {
                        }
                        MotionEvent motionEvent82 = s2.s0;
                        if (motionEvent82 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        motionEvent4 = s2.s0;
                        if ((motionEvent4 == null ? motionEvent4.getEventTime() : -1L) != motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        ((YD) ((C1590ns) ((C0950e6) c0785bb.c).j).i).h();
                    }
                }
                s2.s0 = MotionEvent.obtainNoHistory(motionEvent);
                int E2 = E(motionEvent);
                Trace.endSection();
                s2.U = false;
                return E2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.U = false;
            throw th3;
        }
    }

    public final void n(C0027Ay c0027Ay) {
        int i = 0;
        this.N.l(c0027Ay, false);
        YD o2 = c0027Ay.o();
        int i2 = o2.j;
        if (i2 > 0) {
            Object[] objArr = o2.h;
            do {
                n((C0027Ay) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC0106Dz lifecycle;
        InterfaceC0365Nz interfaceC0365Nz;
        C2130w2 c2130w2;
        super.onAttachedToWindow();
        this.f104o.a.setValue(Boolean.valueOf(hasWindowFocus()));
        n(getRoot());
        m(getRoot());
        DS ds = getSnapshotObserver().a;
        C1861s c1861s = ds.d;
        C0950e6 c0950e6 = AbstractC2025uS.a;
        AbstractC2025uS.f(RP.w);
        synchronized (AbstractC2025uS.b) {
            AbstractC2025uS.g = AbstractC0720ac.B0(AbstractC2025uS.g, c1861s);
        }
        ds.g = new C1932t2(6, c1861s);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && (c2130w2 = this.E) != null) {
            J7.a.a(c2130w2);
        }
        InterfaceC0365Nz g = ON.g(this);
        MP mp = (MP) PQ.v(PQ.A(PQ.x(this, UY.n), UY.f116o));
        H2 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (g != null && mp != null && (g != (interfaceC0365Nz = viewTreeOwners.a) || mp != interfaceC0365Nz))) {
            if (g == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (mp == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.b(this);
            }
            g.getLifecycle().a(this);
            H2 h2 = new H2(g, mp);
            set_viewTreeOwners(h2);
            InterfaceC2114vp interfaceC2114vp = this.c0;
            if (interfaceC2114vp != null) {
                interfaceC2114vp.invoke(h2);
            }
            this.c0 = null;
        }
        ((C2278yH) this.p0.i).setValue(new C0566Vs(isInTouchMode() ? 1 : 2));
        H2 viewTreeOwners2 = getViewTreeOwners();
        AbstractC0106Dz lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            AbstractC0868ct.X("No lifecycle owner exists");
            throw null;
        }
        lifecycle2.a(this);
        lifecycle2.a(this.u);
        getViewTreeObserver().addOnGlobalLayoutListener(this.d0);
        getViewTreeObserver().addOnScrollChangedListener(this.e0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f0);
        if (i >= 31) {
            C1341k3.a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.i0.get() != null) {
            throw new ClassCastException();
        }
        this.g0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(EB.a(getContext()));
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.m0) {
            this.m0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(AbstractC0868ct.o(getContext()));
        }
        this.D.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.i0.get() != null) {
            throw new ClassCastException();
        }
        this.g0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3 = this.u;
        viewOnAttachStateChangeListenerC2132w3.getClass();
        C2000u3.a.b(viewOnAttachStateChangeListenerC2132w3, jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2130w2 c2130w2;
        super.onDetachedFromWindow();
        C0765bH snapshotObserver = getSnapshotObserver();
        C1932t2 c1932t2 = snapshotObserver.a.g;
        if (c1932t2 != null) {
            c1932t2.b();
        }
        DS ds = snapshotObserver.a;
        synchronized (ds.f) {
            YD yd = ds.f;
            int i = yd.j;
            if (i > 0) {
                Object[] objArr = yd.h;
                int i2 = 0;
                do {
                    CS cs = (CS) objArr[i2];
                    ((MD) cs.e.i).a();
                    cs.f.a();
                    ((MD) cs.k.i).a();
                    cs.l.clear();
                    i2++;
                } while (i2 < i);
            }
        }
        H2 viewTreeOwners = getViewTreeOwners();
        AbstractC0106Dz lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            AbstractC0868ct.X("No lifecycle owner exists");
            throw null;
        }
        lifecycle.b(this.u);
        lifecycle.b(this);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && (c2130w2 = this.E) != null) {
            J7.a.b(c2130w2);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.d0);
        getViewTreeObserver().removeOnScrollChangedListener(this.e0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f0);
        if (i3 >= 31) {
            C1341k3.a.a(this);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) getFocusOwner();
        C0405Pn c0405Pn = aVar.d;
        C1711ph c1711ph = aVar.f;
        if (c1711ph.h) {
            AbstractC1807r8.o(c0405Pn, true);
            return;
        }
        try {
            c1711ph.h = true;
            AbstractC1807r8.o(c0405Pn, true);
        } finally {
            C1711ph.b(c1711ph);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.N.g(this.z0);
        this.L = null;
        G();
        if (this.J != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        KB kb = this.N;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                n(getRoot());
            }
            long g = g(i);
            long g2 = g(i2);
            long r = AbstractC1052fg.r((int) (g >>> 32), (int) (g & 4294967295L), (int) (g2 >>> 32), (int) (4294967295L & g2));
            C0603Xd c0603Xd = this.L;
            if (c0603Xd == null) {
                this.L = new C0603Xd(r);
                this.M = false;
            } else {
                if (!(c0603Xd.a == r)) {
                    this.M = true;
                }
            }
            kb.m(r);
            kb.h();
            setMeasuredDimension(getRoot().v.q.b, getRoot().v.q.c);
            if (this.J != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().v.q.b, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().v.q.c, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C2130w2 c2130w2;
        if (Build.VERSION.SDK_INT < 26 || viewStructure == null || (c2130w2 = this.E) == null) {
            return;
        }
        M7 m7 = c2130w2.b;
        int size = m7.a.size();
        H7 h7 = H7.a;
        int a = h7.a(viewStructure, size);
        for (Map.Entry entry : m7.a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            ViewStructure b = h7.b(viewStructure, a);
            if (b != null) {
                I7 i7 = I7.a;
                AutofillId a2 = i7.a(viewStructure);
                AbstractC0048Bt.k(a2);
                i7.g(b, a2, intValue);
                h7.d(b, intValue, c2130w2.a.getContext().getPackageName(), null, null);
                i7.h(b, 1);
                throw null;
            }
            a++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.i) {
            EnumC2057uy enumC2057uy = EnumC2057uy.h;
            EnumC2057uy enumC2057uy2 = i != 0 ? i != 1 ? null : EnumC2057uy.i : enumC2057uy;
            if (enumC2057uy2 != null) {
                enumC2057uy = enumC2057uy2;
            }
            setLayoutDirection(enumC2057uy);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C1234iQ c1234iQ;
        if (Build.VERSION.SDK_INT < 31 || (c1234iQ = this.C0) == null) {
            return;
        }
        c1234iQ.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3 = this.u;
        viewOnAttachStateChangeListenerC2132w3.getClass();
        C2000u3.a.c(viewOnAttachStateChangeListenerC2132w3, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean r;
        this.f104o.a.setValue(Boolean.valueOf(z));
        this.B0 = true;
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (r = C1097gL.r())) {
            return;
        }
        setShowLayoutBounds(r);
        m(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final boolean q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.s0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long r(long j) {
        A();
        long Q = AbstractC1473m3.Q(this.R, j);
        return PX.h(BF.b(this.V) + BF.b(Q), BF.c(this.V) + BF.c(Q));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((androidx.compose.ui.focus.a) getFocusOwner()).d.s().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (ordinal != 3) {
            throw new C0057Cc();
        }
        C0146Fn S = AbstractC0946e20.S(i);
        int i2 = S != null ? S.a : 7;
        Boolean c = ((androidx.compose.ui.focus.a) getFocusOwner()).c(i2, rect != null ? new C1032fM(rect.left, rect.top, rect.right, rect.bottom) : null, new UY(i2));
        if (c != null) {
            return c.booleanValue();
        }
        return false;
    }

    public final void s(boolean z) {
        Q2 q2;
        KB kb = this.N;
        if (kb.b.S() || ((YD) kb.e.i).l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    q2 = this.z0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                q2 = null;
            }
            if (kb.g(q2)) {
                requestLayout();
            }
            kb.a(false);
            Trace.endSection();
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.t.h = j;
    }

    public final void setConfigurationChangeObserver(InterfaceC2114vp interfaceC2114vp) {
        this.D = interfaceC2114vp;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3) {
        this.u = viewOnAttachStateChangeListenerC2132w3;
    }

    public void setCoroutineContext(InterfaceC0189He interfaceC0189He) {
        int i;
        int i2;
        this.m = interfaceC0189He;
        TC tc = (TC) getRoot().u.f;
        TC tc2 = tc.b;
        if (!tc2.m) {
            AbstractC0868ct.W("visitSubtree called on an unattached node");
            throw null;
        }
        TC tc3 = tc2.f;
        C0027Ay J = AbstractC0946e20.J(tc);
        int[] iArr = new int[16];
        YD[] ydArr = new YD[16];
        int i3 = 0;
        while (J != null) {
            if (tc3 == null) {
                tc3 = (TC) J.u.f;
            }
            if ((tc3.d & 16) != 0) {
                while (tc3 != null) {
                    if ((tc3.c & 16) != 0) {
                        for (TC tc4 = tc3; tc4 != null; tc4 = null) {
                            if (tc4 instanceof X7) {
                            }
                        }
                    }
                    tc3 = tc3.f;
                }
            }
            YD o2 = J.o();
            if (!o2.k()) {
                if (i3 >= iArr.length) {
                    iArr = Arrays.copyOf(iArr, iArr.length * 2);
                    AbstractC0048Bt.m(iArr, "copyOf(this, newSize)");
                    Object[] copyOf = Arrays.copyOf(ydArr, ydArr.length * 2);
                    AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
                    ydArr = (YD[]) copyOf;
                }
                iArr[i3] = o2.j - 1;
                ydArr[i3] = o2;
                i3++;
            }
            if (i3 <= 0 || (i2 = iArr[i3 - 1]) < 0) {
                J = null;
            } else {
                if (i3 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                YD yd = ydArr[i];
                AbstractC0048Bt.k(yd);
                if (i2 > 0) {
                    iArr[i] = iArr[i] - 1;
                } else if (i2 == 0) {
                    ydArr[i] = null;
                    i3--;
                }
                J = (C0027Ay) yd.h[i2];
            }
            tc3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.T = j;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC2114vp interfaceC2114vp) {
        H2 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC2114vp.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.c0 = interfaceC2114vp;
    }

    public void setShowLayoutBounds(boolean z) {
        this.I = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(YG yg, boolean z) {
        ArrayList arrayList = this.y;
        if (!z) {
            if (this.A) {
                return;
            }
            arrayList.remove(yg);
            ArrayList arrayList2 = this.z;
            if (arrayList2 != null) {
                arrayList2.remove(yg);
                return;
            }
            return;
        }
        if (!this.A) {
            arrayList.add(yg);
            return;
        }
        ArrayList arrayList3 = this.z;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.z = arrayList3;
        }
        arrayList3.add(yg);
    }

    public final void u() {
        if (this.F) {
            DS ds = getSnapshotObserver().a;
            synchronized (ds.f) {
                try {
                    YD yd = ds.f;
                    int i = yd.j;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        CS cs = (CS) yd.h[i3];
                        cs.e();
                        if (cs.f.e == 0) {
                            i2++;
                        } else if (i2 > 0) {
                            Object[] objArr = yd.h;
                            objArr[i3 - i2] = objArr[i3];
                        }
                    }
                    int i4 = i - i2;
                    P6.g0(yd.h, i4, i);
                    yd.j = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.F = false;
        }
        T3 t3 = this.J;
        if (t3 != null) {
            f(t3);
        }
        while (this.v0.l()) {
            int i5 = this.v0.j;
            for (int i6 = 0; i6 < i5; i6++) {
                Object[] objArr2 = this.v0.h;
                InterfaceC1455lp interfaceC1455lp = (InterfaceC1455lp) objArr2[i6];
                objArr2[i6] = null;
                if (interfaceC1455lp != null) {
                    interfaceC1455lp.invoke();
                }
            }
            this.v0.o(0, i5);
        }
    }

    public final C1032fM v() {
        if (isFocused()) {
            C0405Pn m = AbstractC1052fg.m(((androidx.compose.ui.focus.a) getFocusOwner()).d);
            if (m != null) {
                return AbstractC1052fg.s(m);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return AbstractC0946e20.i(findFocus);
        }
        return null;
    }

    public final void w(C0027Ay c0027Ay) {
        C1013f3 c1013f3 = this.t;
        c1013f3.w = true;
        if (c1013f3.r()) {
            c1013f3.t(c0027Ay);
        }
        ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3 = this.u;
        viewOnAttachStateChangeListenerC2132w3.f237o = true;
        if (viewOnAttachStateChangeListenerC2132w3.e() && viewOnAttachStateChangeListenerC2132w3.p.add(c0027Ay)) {
            viewOnAttachStateChangeListenerC2132w3.q.f(C0782bY.a);
        }
    }

    public final void x(C0027Ay c0027Ay, boolean z, boolean z2) {
        C0027Ay l;
        C0027Ay l2;
        C0131Ey c0131Ey;
        C0053By c0053By;
        KB kb = this.N;
        if (!z) {
            if (kb.l(c0027Ay, z2)) {
                C(c0027Ay);
                return;
            }
            return;
        }
        C2002u5 c2002u5 = kb.b;
        C0027Ay c0027Ay2 = c0027Ay.d;
        C0209Hy c0209Hy = c0027Ay.v;
        if (c0027Ay2 == null) {
            AbstractC0868ct.W("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        int v = AbstractC1888sN.v(c0209Hy.b);
        if (v != 0) {
            if (v == 1) {
                return;
            }
            if (v != 2 && v != 3) {
                if (v != 4) {
                    throw new C0057Cc();
                }
                if (!c0209Hy.f || z2) {
                    c0209Hy.f = true;
                    c0209Hy.c = true;
                    if (c0027Ay.B) {
                        return;
                    }
                    if ((AbstractC0048Bt.h(c0027Ay.x(), Boolean.TRUE) || (c0209Hy.f && (c0027Ay.k() == 1 || !((c0131Ey = c0209Hy.r) == null || (c0053By = c0131Ey.q) == null || !c0053By.e())))) && ((l = c0027Ay.l()) == null || !l.v.f)) {
                        c2002u5.A(c0027Ay, true);
                    } else if ((c0027Ay.w() || (c0209Hy.c && KB.f(c0027Ay))) && ((l2 = c0027Ay.l()) == null || !l2.v.c)) {
                        c2002u5.A(c0027Ay, false);
                    }
                    if (kb.d) {
                        return;
                    }
                    C(c0027Ay);
                    return;
                }
                return;
            }
        }
        kb.h.b(new JB(c0027Ay, true, z2));
    }

    public final void y(C0027Ay c0027Ay, boolean z, boolean z2) {
        C0209Hy c0209Hy = c0027Ay.v;
        KB kb = this.N;
        if (!z) {
            kb.getClass();
            int v = AbstractC1888sN.v(c0209Hy.b);
            if (v == 0 || v == 1 || v == 2 || v == 3) {
                return;
            }
            if (v != 4) {
                throw new C0057Cc();
            }
            if (!z2 && c0027Ay.w() == c0209Hy.q.p && (c0209Hy.c || c0209Hy.d)) {
                return;
            }
            c0209Hy.d = true;
            c0209Hy.e = true;
            if (!c0027Ay.B && c0209Hy.q.p) {
                C0027Ay l = c0027Ay.l();
                if ((l == null || !l.v.d) && (l == null || !l.v.c)) {
                    kb.b.A(c0027Ay, false);
                }
                if (kb.d) {
                    return;
                }
                C(null);
                return;
            }
            return;
        }
        C2002u5 c2002u5 = kb.b;
        int v2 = AbstractC1888sN.v(c0209Hy.b);
        if (v2 != 0) {
            if (v2 == 1) {
                return;
            }
            if (v2 != 2) {
                if (v2 == 3) {
                    return;
                }
                if (v2 != 4) {
                    throw new C0057Cc();
                }
            }
        }
        if ((c0209Hy.f || c0209Hy.g) && !z2) {
            return;
        }
        c0209Hy.g = true;
        c0209Hy.h = true;
        c0209Hy.d = true;
        c0209Hy.e = true;
        if (c0027Ay.B) {
            return;
        }
        C0027Ay l2 = c0027Ay.l();
        if (AbstractC0048Bt.h(c0027Ay.x(), Boolean.TRUE) && ((l2 == null || !l2.v.f) && (l2 == null || !l2.v.g))) {
            c2002u5.A(c0027Ay, true);
        } else if (c0027Ay.w() && ((l2 == null || !l2.v.d) && (l2 == null || !l2.v.c))) {
            c2002u5.A(c0027Ay, false);
        }
        if (kb.d) {
            return;
        }
        C(null);
    }

    public final void z() {
        C1013f3 c1013f3 = this.t;
        c1013f3.w = true;
        if (c1013f3.r() && !c1013f3.H) {
            c1013f3.H = true;
            c1013f3.l.post(c1013f3.I);
        }
        ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3 = this.u;
        viewOnAttachStateChangeListenerC2132w3.f237o = true;
        if (!viewOnAttachStateChangeListenerC2132w3.e() || viewOnAttachStateChangeListenerC2132w3.w) {
            return;
        }
        viewOnAttachStateChangeListenerC2132w3.w = true;
        viewOnAttachStateChangeListenerC2132w3.r.post(viewOnAttachStateChangeListenerC2132w3.x);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        AbstractC0048Bt.k(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    public C1800r2 getAccessibilityManager() {
        return this.v;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C2 m7getClipboardManager() {
        return this.G;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC1315jh
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}

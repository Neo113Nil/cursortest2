package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.input.key.a;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.vectorharbor.planetvectorsurvey.R;
import defpackage.f3;
import defpackage.la;
import defpackage.t50;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f3 extends ViewGroup implements dd0, vl0, dl, tc0 {
    public static Class I0;
    public static Method J0;
    public static Method K0;
    public static final x60 L0 = new x60();
    public static x2 M0;
    public final ArrayList A;
    public final w2 A0;
    public ArrayList B;
    public boolean B0;
    public boolean C;
    public final d3 C0;
    public final d60 D;
    public final sb D0;
    public final w4 E;
    public boolean E0;
    public mu F;
    public final y10 F0;
    public final k2 G;
    public View G0;
    public final m2 H;
    public final b2 H0;
    public boolean I;
    public final r2 J;
    public final q2 K;
    public final fd0 L;
    public boolean M;
    public w5 N;
    public ui O;
    public boolean P;
    public final d50 Q;
    public long R;
    public final int[] S;
    public final float[] T;
    public final float[] U;
    public long V;
    public boolean W;
    public long a0;
    public final ce0 b0;
    public final yl c0;
    public long d;
    public mu d0;
    public final boolean e;
    public final t2 e0;
    public final r10 f;
    public final u2 f0;
    public final ce0 g;
    public final v2 g0;
    public final View h;
    public final ky h0;
    public final boolean i;
    public final nv0 i0;
    public final ks j;
    public final AtomicReference j0;
    public rj k;
    public final y7 k0;
    public final n4 l;
    public final b2 l0;
    public final y10 m;
    public final ce0 m0;
    public final oc n;
    public int n0;
    public final u5 o;
    public final ce0 o0;
    public final py p;
    public final al p0;
    public final p10 q;
    public final ny q0;
    public final p60 r;
    public final v50 r0;
    public final bj0 s;
    public final b2 s0;
    public final f3 t;
    public MotionEvent t0;
    public final up0 u;
    public long u0;
    public final n3 v;
    public final j3 v0;
    public e4 w;
    public final x60 w0;
    public final j2 x;
    public float x0;
    public final w4 y;
    public float y0;
    public final w8 z;
    public final e3 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v37, types: [t2] */
    /* JADX WARN: Type inference failed for: r1v38, types: [u2] */
    /* JADX WARN: Type inference failed for: r1v39, types: [v2] */
    public f3(Context context, rj rjVar) {
        super(context);
        k2 k2Var;
        m2 m2Var;
        final f3 f3Var = this;
        f3Var.d = 9205357640488583168L;
        int i = 1;
        f3Var.e = true;
        f3Var.f = new r10();
        ul f = d31.f(context);
        b2 b2Var = b2.K;
        f3Var.g = new ce0(f, b2Var);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        boolean z = i2 >= 35;
        f3Var.i = z;
        zp zpVar = new zp();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(zpVar);
        z50 z50Var = new z50() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // defpackage.z50
            public final t50 f() {
                return new la();
            }

            @Override // defpackage.z50
            public final void g(t50 t50Var) {
                ((la) t50Var).getClass();
            }

            public final int hashCode() {
                return f3.this.hashCode();
            }
        };
        f3Var.j = new ks(f3Var, f3Var);
        f3Var.k = rjVar;
        f3Var.l = new n4();
        f3Var.m = new y10(0);
        u50 a = a.a(new c3(f3Var, i3));
        u50 a2 = androidx.compose.ui.input.rotary.a.a();
        f3Var.n = new oc();
        f3Var.o = new u5(ViewConfiguration.get(context));
        py pyVar = new py();
        f3Var.p = pyVar;
        p10 p10Var = new p10(3);
        g50 g50Var = p10Var.x;
        wl0 wl0Var = wl0.b;
        if (!nz.l(g50Var, wl0Var)) {
            p10Var.x = wl0Var;
            p10Var.x();
        }
        p10Var.Q(f3Var.getDensity());
        p10Var.U(f3Var.getViewConfiguration());
        p10Var.T(y6.d((z50) b.b(pyVar), emptySemanticsElement).c(a2).c(a).c(((ks) f3Var.getFocusOwner()).e).c(f3Var.getDragAndDropManager().c).c(z50Var));
        f3Var.q = p10Var;
        p60 p60Var = az.a;
        f3Var.r = new p60();
        f3Var.m15getLayoutNodes();
        f3Var.s = new bj0();
        f3Var.t = f3Var;
        f3Var.u = new up0(f3Var.getRoot(), zpVar, f3Var.m15getLayoutNodes());
        n3 n3Var = new n3(f3Var);
        f3Var.v = n3Var;
        f3Var.w = new e4(f3Var, new z2(0, f3Var, x40.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 0));
        j2 j2Var = new j2();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        f3Var.x = j2Var;
        w4 w4Var = new w4();
        w4Var.b = f3Var;
        w4Var.c = new Object();
        v4 v4Var = new v4();
        w4Var.e = v4Var;
        if (f3Var.isAttachedToWindow()) {
            Context context2 = f3Var.getContext();
            if (!w4Var.a) {
                context2.getApplicationContext().registerComponentCallbacks(v4Var);
                w4Var.a = true;
            }
        }
        f3Var.addOnAttachStateChangeListener(new i3(i, w4Var));
        f3Var.y = w4Var;
        f3Var.z = new w8();
        f3Var.A = new ArrayList();
        f3Var.D = new d60();
        p10 root = f3Var.getRoot();
        w4 w4Var2 = new w4();
        w4Var2.b = root;
        w4Var2.c = new hw((iy) root.F.g);
        w4Var2.d = new p01(13);
        w4Var2.e = new kw();
        f3Var.E = w4Var2;
        f3Var.F = o1.g;
        if (j()) {
            w8 autofillTree = f3Var.getAutofillTree();
            k2Var = new k2();
            k2Var.d = f3Var;
            k2Var.e = autofillTree;
            AutofillManager g = t0.g(f3Var.getContext().getSystemService(t0.k()));
            if (g == null) {
                g8.s("Autofill service could not be located.");
                throw null;
            }
            k2Var.f = g;
            f3Var.setImportantForAutofill(1);
            u8 e = yc0.e(f3Var);
            AutofillId e2 = e != null ? t0.e(e.a) : null;
            if (e2 == null) {
                throw y6.u("Required value was null.");
            }
            k2Var.g = e2;
        } else {
            k2Var = null;
        }
        f3Var.G = k2Var;
        if (j()) {
            AutofillManager g2 = t0.g(context.getSystemService(t0.k()));
            if (g2 == null) {
                throw y6.u("Autofill service could not be located.");
            }
            f3Var = this;
            m2Var = new m2(new p01(11, g2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            m2Var = null;
        }
        f3Var.H = m2Var;
        f3Var.J = new r2(context);
        f3Var.m13getClipboardManager();
        f3Var.K = new q2();
        f3Var.L = new fd0(new c3(f3Var, i));
        f3Var.Q = new d50(f3Var.getRoot());
        f3Var.R = 9223372034707292159L;
        f3Var.S = new int[]{0, 0};
        float[] x = mz.x();
        f3Var.T = mz.x();
        f3Var.U = mz.x();
        f3Var.V = -1L;
        f3Var.a0 = 9187343241974906880L;
        f3Var.b0 = ud0.o(null);
        f3Var.c0 = ud0.i(new d3(f3Var, i));
        f3Var.e0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: t2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                f3.this.I();
            }
        };
        f3Var.f0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: u2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                f3.this.I();
            }
        };
        f3Var.g0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: v2
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                f3.this.q0.a.setValue(new ly(z2 ? 1 : 2));
            }
        };
        f3Var.h0 = new ky(f3Var.getView(), f3Var);
        nv0 nv0Var = new nv0();
        new AtomicReference(null);
        f3Var.i0 = nv0Var;
        f3Var.j0 = new AtomicReference(null);
        f3Var.getTextInputService();
        f3Var.k0 = new y7(14);
        f3Var.l0 = new b2(26);
        f3Var.m0 = new ce0(a50.n(context), b2Var);
        f3Var.n0 = i2 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        c10 c10Var = c10.d;
        c10 c10Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : c10.e : c10Var;
        f3Var.o0 = ud0.o(c10Var2 != null ? c10Var2 : c10Var);
        f3Var.p0 = new al();
        f3Var.q0 = new ny(f3Var.isInTouchMode() ? 1 : 2);
        f3Var.r0 = new v50(f3Var);
        f3Var.s0 = new b2(28);
        f3Var.v0 = new j3(16);
        f3Var.w0 = new x60();
        f3Var.z0 = new e3(f3Var);
        int i4 = 0;
        f3Var.A0 = new w2(i4, f3Var);
        f3Var.C0 = new d3(f3Var, i4);
        f3Var.D0 = i2 < 29 ? new tb(x) : new ub();
        f3Var.addOnAttachStateChangeListener(f3Var.w);
        f3Var.setWillNotDraw(false);
        f3Var.setFocusable(true);
        if (i2 >= 26) {
            s3.a.a(f3Var, 1, false);
        }
        f3Var.setFocusableInTouchMode(true);
        f3Var.setClipChildren(false);
        int i5 = c01.a;
        if (f3Var.getImportantForAccessibility() == 0) {
            f3Var.setImportantForAccessibility(1);
        }
        f3Var.setAccessibilityDelegate(n3Var.b);
        f3Var.setOnDragListener(f3Var.getDragAndDropManager());
        f3Var.getRoot().b(f3Var);
        if (i2 >= 29) {
            p3.a.a(f3Var);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            f3Var.h = view;
            f3Var.addView(view, -1);
        }
        f3Var.F0 = i2 >= 31 ? new y10(1) : null;
        f3Var.H0 = new b2(f3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y2 get_viewTreeOwners() {
        return (y2) this.b0.getValue();
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void k(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof f3) {
                ((f3) childAt).w();
            } else if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt);
            }
        }
    }

    public static long l(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View m(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (nz.l(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View m = m(viewGroup.getChildAt(i2), i);
                    if (m != null) {
                        return m;
                    }
                }
            }
        }
        return null;
    }

    public static void p(p10 p10Var) {
        p10Var.w();
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            p((p10) objArr[i2]);
        }
    }

    public static boolean r(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !f60.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private void setDensity(sl slVar) {
        this.g.setValue(slVar);
    }

    private void setFontFamilyResolver(ct ctVar) {
        this.m0.setValue(ctVar);
    }

    private void setLayoutDirection(c10 c10Var) {
        this.o0.setValue(c10Var);
    }

    private final void set_viewTreeOwners(y2 y2Var) {
        this.b0.setValue(y2Var);
    }

    public final void A() {
        n3 n3Var = this.v;
        n3Var.A = true;
        if (n3Var.n() && !n3Var.L) {
            n3Var.L = true;
            n3Var.l.post(n3Var.N);
        }
        e4 e4Var = this.w;
        e4Var.j = true;
        if (!e4Var.k() || e4Var.q) {
            return;
        }
        e4Var.q = true;
        e4Var.l.post(e4Var.r);
    }

    public final void B() {
        if (this.W) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.V) {
            this.V = currentAnimationTimeMillis;
            sb sbVar = this.D0;
            float[] fArr = this.T;
            sbVar.a(this, fArr);
            x40.F(fArr, this.U);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.S;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.a0 = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    public final void C(MotionEvent motionEvent) {
        this.V = AnimationUtils.currentAnimationTimeMillis();
        sb sbVar = this.D0;
        float[] fArr = this.T;
        sbVar.a(this, fArr);
        x40.F(fArr, this.U);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long I = mz.I(fArr, (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (I >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (I & 4294967295L));
        this.a0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean D() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void E(p10 p10Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (p10Var != null) {
            while (p10Var != null && p10Var.l() == n10.d) {
                if (!this.P) {
                    p10 n = p10Var.n();
                    if (n == null) {
                        break;
                    }
                    long j = ((iy) n.F.g).g;
                    if (ui.f(j) && ui.e(j)) {
                        break;
                    }
                }
                p10Var = p10Var.n();
            }
            if (p10Var == getRoot()) {
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

    public final long F(long j) {
        B();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.a0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.a0 & 4294967295L));
        return mz.I(this.U, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int G(MotionEvent motionEvent) {
        Object obj;
        if (this.E0) {
            this.E0 = false;
            int metaState = motionEvent.getMetaState();
            this.m.getClass();
            a11.a.setValue(new bh0(metaState));
        }
        d60 d60Var = this.D;
        j3 a = d60Var.a(motionEvent, this);
        w4 w4Var = this.E;
        if (a == null) {
            if (!w4Var.a) {
                b40 b40Var = (b40) ((p01) w4Var.d).e;
                int i = b40Var.g;
                Object[] objArr = b40Var.f;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                b40Var.g = 0;
                b40Var.d = false;
                ((hw) w4Var.c).c();
            }
            return 0;
        }
        List list = (List) a.e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((yg0) obj).e) {
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                size = i3;
            }
        }
        obj = null;
        yg0 yg0Var = (yg0) obj;
        if (yg0Var != null) {
            this.d = yg0Var.d;
        }
        int f = w4Var.f(a, this, s(motionEvent));
        a.f = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (f & 1) != 0) {
            return f;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        d60Var.c.delete(pointerId);
        d60Var.b.delete(pointerId);
        return f;
    }

    public final void H(MotionEvent motionEvent, int i, long j, boolean z) {
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
            float f = pointerCoords.x;
            long u = u((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (u >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (u & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        j3 a = this.D.a(obtain, this);
        a.getClass();
        this.E.f(a, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        boolean z;
        View view;
        long j;
        long c0;
        float[] fArr;
        int b;
        mw0 mw0Var;
        boolean z2;
        long j2;
        int[] iArr = this.S;
        getLocationOnScreen(iArr);
        long j3 = this.R;
        int i = (int) (j3 >> 32);
        int i2 = (int) (j3 & 4294967295L);
        int i3 = iArr[0];
        if (i != i3 || i2 != iArr[1] || this.V < 0) {
            this.R = (i3 << 32) | (iArr[1] & 4294967295L);
            if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
                getRoot().G.o.S();
                z = true;
                B();
                view = this.G0;
                if (view == null) {
                    view = getRootView();
                    this.G0 = view;
                }
                bj0 rectManager = getRectManager();
                j = this.R;
                c0 = nz.c0(this.a0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.T;
                b = ud0.b(fArr);
                mw0Var = rectManager.b;
                if ((b & 2) != 0) {
                    fArr = null;
                }
                if (bz.a(c0, mw0Var.c)) {
                    mw0Var.c = c0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!bz.a(j, mw0Var.d)) {
                    mw0Var.d = j;
                    z2 = true;
                }
                if (fArr != null) {
                    z2 = true;
                }
                j2 = (width << 32) | (height & 4294967295L);
                if (j2 != mw0Var.e) {
                    mw0Var.e = j2;
                    z2 = true;
                }
                rectManager.e = !z2 || rectManager.e;
                this.Q.a(z);
                getRectManager().b();
            }
        }
        z = false;
        B();
        view = this.G0;
        if (view == null) {
        }
        bj0 rectManager2 = getRectManager();
        j = this.R;
        c0 = nz.c0(this.a0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.T;
        b = ud0.b(fArr);
        mw0Var = rectManager2.b;
        if ((b & 2) != 0) {
        }
        if (bz.a(c0, mw0Var.c)) {
        }
        if (!bz.a(j, mw0Var.d)) {
        }
        if (fArr != null) {
        }
        j2 = (width2 << 32) | (height2 & 4294967295L);
        if (j2 != mw0Var.e) {
        }
        rectManager2.e = !z2 || rectManager2.e;
        this.Q.a(z);
        getRectManager().b();
    }

    public final void J(float f) {
        if (this.i) {
            if (f > 0.0f) {
                if (Float.isNaN(this.x0) || f > this.x0) {
                    this.x0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.y0) || f < this.y0) {
                    this.y0 = f;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        boolean isText2;
        boolean isDate2;
        boolean isList2;
        boolean isToggle2;
        np0 p;
        mu muVar;
        CharSequence textValue2;
        if (j()) {
            int i = 0;
            m2 m2Var = this.H;
            if (m2Var != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = sparseArray.keyAt(i2);
                    AutofillValue h = t0.h(sparseArray.get(keyAt));
                    isText2 = h.isText();
                    if (isText2) {
                        p10 p10Var = (p10) m2Var.b.c.b(keyAt);
                        if (p10Var != null && (p = p10Var.p()) != null) {
                            Object g = p.d.g(mp0.f);
                            if (g == null) {
                                g = null;
                            }
                            h0 h0Var = (h0) g;
                            if (h0Var != null && (muVar = (mu) h0Var.b) != null) {
                                textValue2 = h.getTextValue();
                            }
                        }
                    } else {
                        isDate2 = h.isDate();
                        if (isDate2) {
                            Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                        } else {
                            isList2 = h.isList();
                            if (isList2) {
                                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                            } else {
                                isToggle2 = h.isToggle();
                                if (isToggle2) {
                                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                                }
                            }
                        }
                    }
                }
            }
            k2 k2Var = this.G;
            if (k2Var != null) {
                w8 w8Var = (w8) k2Var.e;
                if (w8Var.a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                while (i < size2) {
                    int keyAt2 = sparseArray.keyAt(i);
                    AutofillValue h2 = t0.h(sparseArray.get(keyAt2));
                    isText = h2.isText();
                    if (isText) {
                        textValue = h2.getTextValue();
                        textValue.toString();
                        if (w8Var.a.get(Integer.valueOf(keyAt2)) != null) {
                            g8.q();
                            return;
                        }
                    } else {
                        isDate = h2.isDate();
                        if (isDate) {
                            throw new fk("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        isList = h2.isList();
                        if (isList) {
                            throw new fk("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        isToggle = h2.isToggle();
                        if (isToggle) {
                            throw new fk("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                    i++;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.v.e(false, i, this.d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.v.e(true, i, this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            p(getRoot());
        }
        v(true);
        ur0.k().m();
        this.C = true;
        oc ocVar = this.n;
        o2 o2Var = ocVar.a;
        Canvas canvas2 = o2Var.a;
        o2Var.a = canvas;
        getRoot().g(o2Var, null);
        ocVar.a.a = canvas2;
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pv) ((cd0) arrayList.get(i))).g();
            }
        }
        int i2 = h01.d;
        arrayList.clear();
        this.C = false;
        ArrayList arrayList2 = this.B;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.i) {
            s7.a(this, this.x0);
            View view = this.h;
            if (view == null) {
                nz.f0("frameRateCategoryView");
                throw null;
            }
            s7.a(view, this.y0);
            if (!Float.isNaN(this.y0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.x0 = Float.NaN;
            this.y0 = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        ca0 ca0Var;
        xl0 xl0Var;
        int size;
        ca0 ca0Var2;
        t50 t50Var;
        ca0 ca0Var3;
        if (this.B0) {
            w2 w2Var = this.A0;
            removeCallbacks(w2Var);
            if (motionEvent.getActionMasked() == 8) {
                this.B0 = false;
            } else {
                w2Var.run();
            }
        }
        if (r(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Float.floatToRawIntBits(x);
                Float.floatToRawIntBits(y);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                ks ksVar = (ks) getFocusOwner();
                if (ksVar.d.e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    ts v = nz.v(ksVar.c);
                    if (v != null) {
                        if (!v.d.q) {
                            cy.b("visitAncestors called on an unattached node");
                        }
                        t50 t50Var2 = v.d;
                        p10 a0 = nz.a0(v);
                        while (a0 != null) {
                            if ((((t50) a0.F.j).g & 2097152) != 0) {
                                while (t50Var2 != null) {
                                    if ((t50Var2.f & 2097152) != 0) {
                                        t50 t50Var3 = t50Var2;
                                        l70 l70Var = null;
                                        while (t50Var3 != null) {
                                            if ((t50Var3.f & 2097152) != 0 && (t50Var3 instanceof ol)) {
                                                int i = 0;
                                                for (t50 t50Var4 = ((ol) t50Var3).s; t50Var4 != null; t50Var4 = t50Var4.i) {
                                                    if ((t50Var4.f & 2097152) != 0) {
                                                        i++;
                                                        if (i == 1) {
                                                            t50Var3 = t50Var4;
                                                        } else {
                                                            if (l70Var == null) {
                                                                l70Var = new l70(new t50[16]);
                                                            }
                                                            if (t50Var3 != null) {
                                                                l70Var.b(t50Var3);
                                                                t50Var3 = null;
                                                            }
                                                            l70Var.b(t50Var4);
                                                        }
                                                    }
                                                }
                                                if (i == 1) {
                                                }
                                            }
                                            t50Var3 = nz.j(l70Var);
                                        }
                                    }
                                    t50Var2 = t50Var2.h;
                                }
                            }
                            a0 = a0.n();
                            t50Var2 = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (o(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            Method method = f01.a;
            oe.d(viewConfiguration);
        } else {
            f01.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i2 >= 26) {
            oe.c(viewConfiguration);
        } else {
            f01.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        ks ksVar2 = (ks) getFocusOwner();
        if (ksVar2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        ts v2 = nz.v(ksVar2.c);
        if (v2 != null) {
            if (!v2.d.q) {
                cy.b("visitAncestors called on an unattached node");
            }
            t50 t50Var5 = v2.d;
            p10 a02 = nz.a0(v2);
            loop0: while (true) {
                if (a02 == null) {
                    t50Var = null;
                    break;
                }
                if ((((t50) a02.F.j).g & 16384) != 0) {
                    while (t50Var5 != null) {
                        if ((t50Var5.f & 16384) != 0) {
                            t50Var = t50Var5;
                            l70 l70Var2 = null;
                            while (t50Var != null) {
                                if (t50Var instanceof xl0) {
                                    break loop0;
                                }
                                if ((t50Var.f & 16384) != 0 && (t50Var instanceof ol)) {
                                    int i3 = 0;
                                    for (t50 t50Var6 = ((ol) t50Var).s; t50Var6 != null; t50Var6 = t50Var6.i) {
                                        if ((t50Var6.f & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                t50Var = t50Var6;
                                            } else {
                                                if (l70Var2 == null) {
                                                    l70Var2 = new l70(new t50[16]);
                                                }
                                                if (t50Var != null) {
                                                    l70Var2.b(t50Var);
                                                    t50Var = null;
                                                }
                                                l70Var2.b(t50Var6);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                t50Var = nz.j(l70Var2);
                            }
                        }
                        t50Var5 = t50Var5.h;
                    }
                }
                a02 = a02.n();
                t50Var5 = (a02 == null || (ca0Var3 = a02.F) == null) ? null : (su0) ca0Var3.i;
            }
            xl0Var = (xl0) t50Var;
        } else {
            xl0Var = null;
        }
        if (xl0Var != null) {
            if (!xl0Var.d.q) {
                cy.b("visitAncestors called on an unattached node");
            }
            t50 t50Var7 = xl0Var.d.h;
            p10 a03 = nz.a0(xl0Var);
            ArrayList arrayList = null;
            while (a03 != null) {
                if ((((t50) a03.F.j).g & 16384) != 0) {
                    while (t50Var7 != null) {
                        if ((t50Var7.f & 16384) != 0) {
                            t50 t50Var8 = t50Var7;
                            l70 l70Var3 = null;
                            while (t50Var8 != null) {
                                if (t50Var8 instanceof xl0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(t50Var8);
                                } else if ((t50Var8.f & 16384) != 0 && (t50Var8 instanceof ol)) {
                                    int i4 = 0;
                                    for (t50 t50Var9 = ((ol) t50Var8).s; t50Var9 != null; t50Var9 = t50Var9.i) {
                                        if ((t50Var9.f & 16384) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                t50Var8 = t50Var9;
                                            } else {
                                                if (l70Var3 == null) {
                                                    l70Var3 = new l70(new t50[16]);
                                                }
                                                if (t50Var8 != null) {
                                                    l70Var3.b(t50Var8);
                                                    t50Var8 = null;
                                                }
                                                l70Var3.b(t50Var9);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                t50Var8 = nz.j(l70Var3);
                            }
                        }
                        t50Var7 = t50Var7.h;
                    }
                }
                a03 = a03.n();
                t50Var7 = (a03 == null || (ca0Var2 = a03.F) == null) ? null : (su0) ca0Var2.i;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((xl0) arrayList.get(size)).getClass();
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            t50 t50Var10 = xl0Var.d;
            l70 l70Var4 = null;
            while (t50Var10 != null) {
                if (!(t50Var10 instanceof xl0) && (t50Var10.f & 16384) != 0 && (t50Var10 instanceof ol)) {
                    int i6 = 0;
                    for (t50 t50Var11 = ((ol) t50Var10).s; t50Var11 != null; t50Var11 = t50Var11.i) {
                        if ((t50Var11.f & 16384) != 0) {
                            i6++;
                            if (i6 == 1) {
                                t50Var10 = t50Var11;
                            } else {
                                if (l70Var4 == null) {
                                    l70Var4 = new l70(new t50[16]);
                                }
                                if (t50Var10 != null) {
                                    l70Var4.b(t50Var10);
                                    t50Var10 = null;
                                }
                                l70Var4.b(t50Var11);
                            }
                        }
                    }
                    if (i6 == 1) {
                    }
                }
                t50Var10 = nz.j(l70Var4);
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                t50 t50Var12 = xl0Var.d;
                l70 l70Var5 = null;
                while (t50Var12 != null) {
                    if (!(t50Var12 instanceof xl0) && (t50Var12.f & 16384) != 0 && (t50Var12 instanceof ol)) {
                        int i7 = 0;
                        for (t50 t50Var13 = ((ol) t50Var12).s; t50Var13 != null; t50Var13 = t50Var13.i) {
                            if ((t50Var13.f & 16384) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    t50Var12 = t50Var13;
                                } else {
                                    if (l70Var5 == null) {
                                        l70Var5 = new l70(new t50[16]);
                                    }
                                    if (t50Var12 != null) {
                                        l70Var5.b(t50Var12);
                                        t50Var12 = null;
                                    }
                                    l70Var5.b(t50Var13);
                                }
                            }
                        }
                        if (i7 == 1) {
                        }
                    }
                    t50Var12 = nz.j(l70Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        o1 o1Var = ((xl0) arrayList.get(i8)).r;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0158, code lost:
    
        if (t(r24) == false) goto L71;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.B0;
        w2 w2Var = this.A0;
        if (z) {
            removeCallbacks(w2Var);
            w2Var.run();
        }
        if (!r(motionEvent) && isAttachedToWindow()) {
            n3 n3Var = this.v;
            f3 f3Var = n3Var.d;
            AccessibilityManager accessibilityManager = n3Var.g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    f3Var.v(true);
                    kw kwVar = new kw();
                    long floatToRawIntBits = (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
                    ca0 ca0Var = f3Var.getRoot().F;
                    ea0 ea0Var = (ea0) ca0Var.h;
                    wk0 wk0Var = ea0.M;
                    ((ea0) ca0Var.h).A0(ea0.P, ea0Var.s0(floatToRawIntBits), kwVar, 1, true);
                    x60 x60Var = kwVar.d;
                    int i2 = x60Var.b - 1;
                    while (true) {
                        if (-1 >= i2) {
                            i = Integer.MIN_VALUE;
                            break;
                        }
                        Object e = x60Var.e(i2);
                        e.getClass();
                        p10 a0 = nz.a0((t50) e);
                        if (f3Var.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(a0) != null) {
                            g8.q();
                            return false;
                        }
                        if (a0.F.h(8)) {
                            int s = n3Var.s(a0.e);
                            rp0 a = yc0.a(a0, false);
                            if (nz.K(a)) {
                                if (!a.k().d.c(vp0.y)) {
                                    i = s;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2--;
                    }
                    f3Var.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i3 = n3Var.e;
                    if (i3 != i) {
                        n3Var.e = i;
                        n3.w(n3Var, i, 128, null, 12);
                        n3.w(n3Var, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = n3Var.e;
                    if (i4 == Integer.MIN_VALUE) {
                        f3Var.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        n3Var.e = Integer.MIN_VALUE;
                        n3.w(n3Var, Integer.MIN_VALUE, 128, null, 12);
                        n3.w(n3Var, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && s(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.t0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.t0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.B0 = true;
                        postDelayed(w2Var, 8L);
                        return false;
                    }
                }
                if ((o(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((ks) getFocusOwner()).d(keyEvent, new a3(i, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.m.getClass();
        a11.a.setValue(new bh0(metaState));
        return ((ks) getFocusOwner()).d(keyEvent, gi.l) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        ca0 ca0Var;
        if (isFocused()) {
            ks ksVar = (ks) getFocusOwner();
            if (ksVar.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                ts v = nz.v(ksVar.c);
                if (v != null) {
                    if (!v.d.q) {
                        cy.b("visitAncestors called on an unattached node");
                    }
                    t50 t50Var = v.d;
                    p10 a0 = nz.a0(v);
                    while (a0 != null) {
                        if ((((t50) a0.F.j).g & 131072) != 0) {
                            while (t50Var != null) {
                                if ((t50Var.f & 131072) != 0) {
                                    t50 t50Var2 = t50Var;
                                    l70 l70Var = null;
                                    while (t50Var2 != null) {
                                        if ((t50Var2.f & 131072) != 0 && (t50Var2 instanceof ol)) {
                                            int i = 0;
                                            for (t50 t50Var3 = ((ol) t50Var2).s; t50Var3 != null; t50Var3 = t50Var3.i) {
                                                if ((t50Var3.f & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        t50Var2 = t50Var3;
                                                    } else {
                                                        if (l70Var == null) {
                                                            l70Var = new l70(new t50[16]);
                                                        }
                                                        if (t50Var2 != null) {
                                                            l70Var.b(t50Var2);
                                                            t50Var2 = null;
                                                        }
                                                        l70Var.b(t50Var3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        t50Var2 = nz.j(l70Var);
                                    }
                                }
                                t50Var = t50Var.h;
                            }
                        }
                        a0 = a0.n();
                        t50Var = (a0 == null || (ca0Var = a0.F) == null) ? null : (su0) ca0Var.i;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            o3.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.B0) {
            w2 w2Var = this.A0;
            removeCallbacks(w2Var);
            MotionEvent motionEvent2 = this.t0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.B0 = false;
            } else {
                w2Var.run();
            }
        }
        if (!r(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || t(motionEvent))) {
            int o = o(motionEvent);
            if ((o & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((o & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dl
    public final void e(o20 o20Var) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(nk.v());
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m(this, i);
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
        zi0 f;
        if (view == null || this.Q.c) {
            return super.focusSearch(view, i);
        }
        Object obj = es.f.get();
        obj.getClass();
        View b = ((es) obj).b(this, view, i);
        if (view == this) {
            ts v = nz.v(((ks) getFocusOwner()).c);
            f = v != null ? nz.w(v) : null;
            if (f == null) {
                f = nk.f(view, this);
            }
        } else {
            f = nk.f(view, this);
        }
        bs N = nk.N(i);
        int i2 = N != null ? N.a : 6;
        gj0 gj0Var = new gj0();
        if (((ks) getFocusOwner()).e(i2, f, new b3(gj0Var, 0)) != null) {
            Object obj2 = gj0Var.d;
            if (obj2 != null) {
                if (b != null) {
                    if (i2 == 1 || i2 == 2) {
                        return super.focusSearch(view, i);
                    }
                    if (od0.m(nz.w((ts) obj2), nk.f(b, this), f, i2)) {
                    }
                }
                return this;
            }
            if (b == null) {
            }
            return b;
        }
        return view;
    }

    public final w5 getAndroidViewsHandler$ui_release() {
        if (this.N == null) {
            w5 w5Var = new w5(getContext());
            this.N = w5Var;
            addView(w5Var, -1);
            requestLayout();
        }
        w5 w5Var2 = this.N;
        w5Var2.getClass();
        return w5Var2;
    }

    public r8 getAutofill() {
        return this.G;
    }

    public v8 getAutofillManager() {
        return this.H;
    }

    public w8 getAutofillTree() {
        return this.z;
    }

    public final mu getConfigurationChangeObserver() {
        return this.F;
    }

    public final e4 getContentCaptureManager$ui_release() {
        return this.w;
    }

    public rj getCoroutineContext() {
        return this.k;
    }

    public sl getDensity() {
        return (sl) this.g.getValue();
    }

    public zi0 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            ts v = nz.v(((ks) getFocusOwner()).c);
            if (v != null) {
                return nz.w(v);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return nk.f(findFocus, this);
        }
        return null;
    }

    public js getFocusOwner() {
        return this.j;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        zi0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (nz.l(((ks) getFocusOwner()).e(6, null, o1.h), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public ct getFontFamilyResolver() {
        return (ct) this.m0.getValue();
    }

    public bt getFontLoader() {
        return this.l0;
    }

    public mv getGraphicsContext() {
        return this.y;
    }

    public ew getHapticFeedBack() {
        return this.p0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.Q.b.t();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public my getInputModeManager() {
        return this.q0;
    }

    public final py getInsetsListener() {
        return this.p;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.V;
    }

    @Override // android.view.View, android.view.ViewParent
    public c10 getLayoutDirection() {
        return (c10) this.o0.getValue();
    }

    public long getMeasureIteration() {
        d50 d50Var = this.Q;
        if (!d50Var.c) {
            cy.a("measureIteration should be only used during the measure/layout pass");
        }
        return d50Var.g;
    }

    public v50 getModifierLocalManager() {
        return this.r0;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public f3 m16getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public xf0 getPlacementScope() {
        int i = zf0.b;
        return new g40(1, this);
    }

    public ug0 getPointerIconService() {
        return this.H0;
    }

    public bj0 getRectManager() {
        return this.s;
    }

    public p10 getRoot() {
        return this.q;
    }

    public vl0 getRootForTest() {
        return this.t;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        y10 y10Var;
        if (Build.VERSION.SDK_INT < 31 || (y10Var = this.F0) == null) {
            return false;
        }
        return ((Boolean) y10Var.a.getValue()).booleanValue();
    }

    public up0 getSemanticsOwner() {
        return this.u;
    }

    public r10 getSharedDrawScope() {
        return this.f;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? q7.a.a(this) : this.M;
    }

    public fd0 getSnapshotObserver() {
        return this.L;
    }

    public js0 getSoftwareKeyboardController() {
        return this.k0;
    }

    public nv0 getTextInputService() {
        return this.i0;
    }

    public ew0 getTextToolbar() {
        return this.s0;
    }

    public final ul0 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public e01 getViewConfiguration() {
        return this.o;
    }

    public final y2 getViewTreeOwners() {
        return (y2) this.c0.getValue();
    }

    public z01 getWindowInfo() {
        return this.m;
    }

    public final m2 get_autofillManager$ui_release() {
        return this.H;
    }

    public final void n(p10 p10Var, boolean z) {
        this.Q.d(p10Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:104:0x0090, B:106:0x0096, B:13:0x00a1, B:21:0x00b4, B:23:0x00ba, B:107:0x0056, B:113:0x0062, B:116:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        f3 f3Var;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        hw hwVar;
        removeCallbacks(this.z0);
        try {
            C(motionEvent);
            this.W = true;
            v(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.t0;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                w4 w4Var = this.E;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!w4Var.a) {
                                        b40 b40Var = (b40) ((p01) w4Var.d).e;
                                        int i = b40Var.g;
                                        Object[] objArr = b40Var.f;
                                        for (int i2 = 0; i2 < i; i2++) {
                                            objArr[i2] = null;
                                        }
                                        b40Var.g = 0;
                                        b40Var.d = false;
                                        ((hw) w4Var.c).c();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    H(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && s(motionEvent)) {
                                    f3Var = this;
                                    f3Var.H(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    f3Var = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = f3Var.t0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = f3Var.t0;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    d60 d60Var = f3Var.D;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = f3Var.t0;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = f3Var.t0;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = f3Var.t0;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    d60Var.c.delete(pointerId);
                                                    d60Var.b.delete(pointerId);
                                                }
                                                hwVar = (hw) w4Var.c;
                                                if (hwVar.d) {
                                                    hwVar.g.a.g();
                                                } else {
                                                    hwVar.d = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        d60Var.c.delete(pointerId);
                                        d60Var.b.delete(pointerId);
                                    }
                                }
                                f3Var.t0 = MotionEvent.obtainNoHistory(motionEvent);
                                int G = G(motionEvent);
                                Trace.endSection();
                                f3Var.W = false;
                                return G;
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
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z3) {
                }
                f3Var = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = f3Var.t0;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = f3Var.t0;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    d60 d60Var2 = f3Var.D;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = f3Var.t0;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = f3Var.t0;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = f3Var.t0;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        hwVar = (hw) w4Var.c;
                        if (hwVar.d) {
                        }
                    }
                }
                f3Var.t0 = MotionEvent.obtainNoHistory(motionEvent);
                int G2 = G(motionEvent);
                Trace.endSection();
                f3Var.W = false;
                return G2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.W = false;
            throw th3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        g20 lifecycle;
        o20 o20Var;
        k2 k2Var;
        super.onAttachedToWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(nk.v());
        }
        this.p.onViewAttachedToWindow(this);
        if (i > 28) {
            if (M0 == null) {
                x2 x2Var = new x2();
                M0 = x2Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (I0 == null) {
                        I0 = Class.forName("android.os.SystemProperties");
                    }
                    if (K0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = I0;
                        K0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = K0;
                    if (method != null) {
                        method.invoke(null, x2Var);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            x60 x60Var = L0;
            synchronized (x60Var) {
                x60Var.a(this);
            }
        }
        this.m.a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.m.getClass();
        this.m.getClass();
        q(getRoot());
        p(getRoot());
        getSnapshotObserver().a.c();
        if (j() && (k2Var = this.G) != null) {
            t8 t8Var = t8.a;
            t8Var.getClass();
            ((AutofillManager) k2Var.f).registerCallback(t0.f(t8Var));
        }
        o20 j = ze0.j(this);
        ln0 k = rg0.k(this);
        y2 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (j != null && k != null && (j != (o20Var = viewTreeOwners.a) || k != o20Var))) {
            if (j == null) {
                g8.s("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (k == null) {
                g8.s("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.a.getLifecycle()) != null) {
                lifecycle.b(this);
            }
            j.getLifecycle().a(this);
            y2 y2Var = new y2(j, k);
            set_viewTreeOwners(y2Var);
            mu muVar = this.d0;
            if (muVar != null) {
                muVar.c(y2Var);
            }
            this.d0 = null;
        }
        this.q0.a.setValue(new ly(isInTouchMode() ? 1 : 2));
        y2 viewTreeOwners2 = getViewTreeOwners();
        g20 lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw y6.u("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.w);
        getViewTreeObserver().addOnGlobalLayoutListener(this.e0);
        getViewTreeObserver().addOnScrollChangedListener(this.f0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.g0);
        if (Build.VERSION.SDK_INT >= 31) {
            r3.a.b(this);
        }
        m2 m2Var = this.H;
        if (m2Var != null) {
            ((ks) getFocusOwner()).g.a(m2Var);
            getSemanticsOwner().d.a(m2Var);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.j0.get() == null) {
            this.h0.getClass();
            return false;
        }
        g8.q();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(d31.f(getContext()));
        this.m.getClass();
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.n0) {
            this.n0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(a50.n(getContext()));
        }
        this.F.c(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.j0.get() == null) {
            this.h0.getClass();
            return null;
        }
        g8.q();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        rp0 rp0Var;
        AutofillId autofillId;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        e4 e4Var = this.w;
        e4Var.getClass();
        int i = 0;
        for (long j : jArr) {
            tp0 tp0Var = (tp0) e4Var.j().b((int) j);
            if (tp0Var != null && (rp0Var = tp0Var.a) != null) {
                s2.n();
                autofillId = e4Var.d.getAutofillId();
                ViewTranslationRequest.Builder j2 = s2.j(autofillId, rp0Var.g);
                Object g = rp0Var.d.d.g(vp0.z);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    forText = TranslationRequestValue.forText(new l7(l30.a(list, "\n", null, 62), i));
                    j2.setValue("android:text", forText);
                    build = j2.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k2 k2Var;
        super.onDetachedFromWindow();
        this.p.onViewDetachedFromWindow(this);
        if (this.i) {
            View view = this.h;
            if (view == null) {
                nz.f0("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            x60 x60Var = L0;
            synchronized (x60Var) {
                x60Var.i(this);
            }
        }
        getSnapshotObserver().b();
        this.m.getClass();
        y2 viewTreeOwners = getViewTreeOwners();
        g20 lifecycle = viewTreeOwners != null ? viewTreeOwners.a.getLifecycle() : null;
        if (lifecycle == null) {
            throw y6.u("No lifecycle owner exists");
        }
        lifecycle.b(this.w);
        lifecycle.b(this);
        if (j() && (k2Var = this.G) != null) {
            t8 t8Var = t8.a;
            t8Var.getClass();
            ((AutofillManager) k2Var.f).unregisterCallback(t0.f(t8Var));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.e0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.g0);
        if (i >= 31) {
            r3.a.a(this);
        }
        m2 m2Var = this.H;
        if (m2Var != null) {
            getSemanticsOwner().d.i(m2Var);
            ((ks) getFocusOwner()).g.i(m2Var);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        mz.v(((ks) getFocusOwner()).c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.V = 0L;
        this.Q.h(this.C0);
        this.O = null;
        I();
        if (this.N != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d50 d50Var = this.Q;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                q(getRoot());
            }
            long l = l(i);
            long l2 = l(i2);
            long x = px0.x((int) (l >>> 32), (int) (l & 4294967295L), (int) (l2 >>> 32), (int) (4294967295L & l2));
            ui uiVar = this.O;
            if (uiVar == null) {
                this.O = new ui(x);
                this.P = false;
            } else if (!ui.b(uiVar.a, x)) {
                this.P = true;
            }
            d50Var.n(x);
            d50Var.i();
            setMeasuredDimension(getRoot().G.o.d, getRoot().G.o.e);
            if (this.N != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().G.o.d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().G.o.e, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!j() || viewStructure == null) {
            return;
        }
        m2 m2Var = this.H;
        if (m2Var != null) {
            p10 p10Var = m2Var.b.a;
            AutofillId autofillId = m2Var.f;
            String str = m2Var.e;
            bj0 bj0Var = m2Var.d;
            yc0.i(viewStructure, p10Var, autofillId, str, bj0Var);
            Object[] objArr = na0.a;
            x60 x60Var = new x60(2);
            x60Var.a(p10Var);
            x60Var.a(viewStructure);
            while (x60Var.h()) {
                Object j = x60Var.j(x60Var.b - 1);
                j.getClass();
                ViewStructure viewStructure2 = (ViewStructure) j;
                Object j2 = x60Var.j(x60Var.b - 1);
                j2.getClass();
                i70 i70Var = (i70) ((p10) j2).i();
                int i2 = i70Var.d.f;
                for (int i3 = 0; i3 < i2; i3++) {
                    p10 p10Var2 = (p10) i70Var.get(i3);
                    if (!p10Var2.N && p10Var2.B() && p10Var2.C()) {
                        np0 p = p10Var2.p();
                        if (p != null) {
                            a70 a70Var = p.d;
                            if (a70Var.b(mp0.f) || a70Var.b(vp0.q) || a70Var.b(vp0.r)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                yc0.i(newChild, p10Var2, m2Var.f, str, bj0Var);
                                x60Var.a(p10Var2);
                                x60Var.a(newChild);
                            }
                        }
                        x60Var.a(p10Var2);
                        x60Var.a(viewStructure2);
                    }
                }
            }
        }
        k2 k2Var = this.G;
        if (k2Var != null) {
            w8 w8Var = (w8) k2Var.e;
            LinkedHashMap linkedHashMap = w8Var.a;
            LinkedHashMap linkedHashMap2 = w8Var.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    g8.q();
                    return;
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                newChild2.setAutofillId((AutofillId) k2Var.g, intValue);
                newChild2.setId(intValue, ((f3) k2Var.d).getContext().getPackageName(), null, null);
                newChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.e) {
            c10 c10Var = c10.d;
            c10 c10Var2 = i != 0 ? i != 1 ? null : c10.e : c10Var;
            if (c10Var2 != null) {
                c10Var = c10Var2;
            }
            setLayoutDirection(c10Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        y10 y10Var;
        if (Build.VERSION.SDK_INT < 31 || (y10Var = this.F0) == null) {
            return;
        }
        up0 semanticsOwner = getSemanticsOwner();
        rj coroutineContext = getCoroutineContext();
        l70 l70Var = new l70(new bo0[16]);
        od0.x(semanticsOwner.a(), 0, new ao0(1, l70Var, l70.class, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(l70Var.d, 0, l70Var.f, new df(0, new mu[]{j80.w, j80.x}));
        int i = l70Var.f;
        bo0 bo0Var = (bo0) (i == 0 ? null : l70Var.d[i - 1]);
        if (bo0Var == null) {
            return;
        }
        fz fzVar = bo0Var.c;
        zg zgVar = new zg(bo0Var.a, fzVar, x40.d(coroutineContext), y10Var, this);
        ea0 ea0Var = bo0Var.d;
        long j = (fzVar.a << 32) | (fzVar.b & 4294967295L);
        ScrollCaptureTarget f = s2.f(this, ld0.s(a50.I(mz.C(ea0Var).z(ea0Var, true))), new Point((int) (j >> 32), (int) (j & 4294967295L)), zgVar);
        f.setScrollBounds(ld0.s(fzVar));
        consumer.accept(f);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        e4 e4Var = this.w;
        e4Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (nz.l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            px0.v(e4Var, longSparseArray);
        } else {
            e4Var.d.post(new c4(0, e4Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean v;
        this.m.a.setValue(Boolean.valueOf(z));
        this.E0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (v = nk.v())) {
            return;
        }
        setShowLayoutBounds(v);
        p(getRoot());
    }

    public final void q(p10 p10Var) {
        this.Q.m(p10Var, false);
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            q((p10) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int ordinal = ((ks) getFocusOwner()).c.l0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (ordinal != 3) {
            g8.c();
            return false;
        }
        bs N = nk.N(i);
        int i2 = N != null ? N.a : 7;
        return nz.l(((ks) getFocusOwner()).e(i2, rect != null ? ld0.t(rect) : null, new cz0(i2)), Boolean.TRUE);
    }

    public final boolean s(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.v.h = j;
    }

    public final void setConfigurationChangeObserver(mu muVar) {
        this.F = muVar;
    }

    public final void setContentCaptureManager$ui_release(e4 e4Var) {
        this.w = e4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [t50] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public void setCoroutineContext(rj rjVar) {
        this.k = rjVar;
        t50 t50Var = (t50) getRoot().F.j;
        if (t50Var instanceof ku0) {
            ((ku0) t50Var).k0();
        }
        if (!t50Var.d.q) {
            cy.b("visitSubtreeIf called on an unattached node");
        }
        l70 l70Var = new l70(new t50[16]);
        t50 t50Var2 = t50Var.d;
        t50 t50Var3 = t50Var2.i;
        if (t50Var3 == null) {
            nz.h(l70Var, t50Var2);
        } else {
            l70Var.b(t50Var3);
        }
        while (true) {
            int i = l70Var.f;
            if (i == 0) {
                return;
            }
            t50 t50Var4 = (t50) l70Var.j(i - 1);
            if ((t50Var4.g & 16) != 0) {
                for (t50 t50Var5 = t50Var4; t50Var5 != null; t50Var5 = t50Var5.i) {
                    if ((t50Var5.f & 16) != 0) {
                        ol olVar = t50Var5;
                        ?? r4 = 0;
                        while (olVar != 0) {
                            if (olVar instanceof zg0) {
                                zg0 zg0Var = (zg0) olVar;
                                if (zg0Var instanceof ku0) {
                                    ((ku0) zg0Var).k0();
                                }
                            } else if ((olVar.f & 16) != 0 && (olVar instanceof ol)) {
                                t50 t50Var6 = olVar.s;
                                int i2 = 0;
                                olVar = olVar;
                                r4 = r4;
                                while (t50Var6 != null) {
                                    if ((t50Var6.f & 16) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            olVar = t50Var6;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new l70(new t50[16]);
                                            }
                                            if (olVar != 0) {
                                                r4.b(olVar);
                                                olVar = 0;
                                            }
                                            r4.b(t50Var6);
                                        }
                                    }
                                    t50Var6 = t50Var6.i;
                                    olVar = olVar;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            olVar = nz.j(r4);
                        }
                    }
                }
            }
            nz.h(l70Var, t50Var4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.V = j;
    }

    public final void setOnViewTreeOwnersAvailable(mu muVar) {
        y2 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            muVar.c(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.d0 = muVar;
    }

    public void setShowLayoutBounds(boolean z) {
        this.M = z;
    }

    public void setUncaughtExceptionHandler(ul0 ul0Var) {
        this.Q.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.t0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long u(long j) {
        B();
        long I = mz.I(this.T, j);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.a0 >> 32)) + Float.intBitsToFloat((int) (I >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.a0 & 4294967295L)) + Float.intBitsToFloat((int) (I & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final void v(boolean z) {
        d3 d3Var;
        d50 d50Var = this.Q;
        if (d50Var.b.t() || ((l70) d50Var.e.e).f != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    d3Var = this.C0;
                } finally {
                    Trace.endSection();
                }
            } else {
                d3Var = null;
            }
            if (d50Var.h(d3Var)) {
                requestLayout();
            }
            d50Var.a(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ae, code lost:
    
        r4.k(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        x60 x60Var;
        m2 m2Var;
        Object[] objArr;
        if (this.I) {
            is0 is0Var = getSnapshotObserver().a;
            synchronized (is0Var.g) {
                try {
                    l70 l70Var = is0Var.f;
                    int i = l70Var.f;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = l70Var.d;
                        if (i2 >= i) {
                            break;
                        }
                        hs0 hs0Var = (hs0) objArr[i2];
                        hs0Var.e();
                        if (!hs0Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = l70Var.d;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    l70Var.f = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.I = false;
        }
        w5 w5Var = this.N;
        if (w5Var != null) {
            k(w5Var);
        }
        if (j() && (m2Var = this.H) != null) {
            q60 q60Var = m2Var.g;
            if (q60Var.d == 0 && m2Var.h) {
                ((AutofillManager) m2Var.a.e).commit();
                m2Var.h = false;
            }
            if (q60Var.d != 0) {
                m2Var.h = true;
            }
        }
        loop1: while (this.w0.h() && this.w0.e(0) != null) {
            int i5 = this.w0.b;
            int i6 = 0;
            while (true) {
                x60 x60Var2 = this.w0;
                if (i6 < i5) {
                    bu buVar = (bu) x60Var2.e(i6);
                    x60Var = this.w0;
                    if (i6 < 0 || i6 >= x60Var.b) {
                        break loop1;
                    }
                    Object[] objArr3 = x60Var.a;
                    Object obj = objArr3[i6];
                    objArr3[i6] = null;
                    if (buVar != null) {
                        buVar.a();
                    }
                    i6++;
                }
            }
            x60Var.m(i6);
            throw null;
        }
    }

    public final void x(p10 p10Var) {
        n3 n3Var = this.v;
        n3Var.A = true;
        if (n3Var.n()) {
            n3Var.o(p10Var);
        }
        e4 e4Var = this.w;
        e4Var.j = true;
        if (e4Var.k()) {
            e4Var.k.r(ky0.a);
        }
    }

    public final void y(p10 p10Var, boolean z, boolean z2) {
        p10 n;
        p10 n2;
        d50 d50Var = this.Q;
        if (!z) {
            if (d50Var.m(p10Var, z2)) {
                E(p10Var);
                return;
            }
            return;
        }
        t7 t7Var = d50Var.b;
        p10 p10Var2 = p10Var.j;
        s10 s10Var = p10Var.G;
        if (p10Var2 == null) {
            cy.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = s10Var.c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    g8.c();
                    return;
                }
                if (!s10Var.d || z2) {
                    s10Var.d = true;
                    s10Var.o.w = true;
                    if (p10Var.N) {
                        return;
                    }
                    if ((nz.l(p10Var.D(), Boolean.TRUE) || d50.f(p10Var)) && ((n = p10Var.n()) == null || !n.G.d)) {
                        t7Var.a(p10Var, tz.d);
                    } else if ((p10Var.C() || d50.g(p10Var)) && ((n2 = p10Var.n()) == null || !n2.k())) {
                        t7Var.a(p10Var, tz.f);
                    }
                    if (d50Var.d) {
                        return;
                    }
                    E(p10Var);
                    return;
                }
                return;
            }
        }
        d50Var.h.b(new c50(p10Var, true, z2));
    }

    public final void z(p10 p10Var, boolean z, boolean z2) {
        s10 s10Var = p10Var.G;
        tz tzVar = tz.g;
        d50 d50Var = this.Q;
        if (!z) {
            d50Var.getClass();
            int ordinal = s10Var.c.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                g8.c();
                return;
            }
            p10 n = p10Var.n();
            boolean z3 = n == null || n.C();
            if (!z2) {
                if (p10Var.k()) {
                    return;
                }
                if (p10Var.j() && p10Var.C() == z3 && p10Var.C() == s10Var.o.v) {
                    return;
                }
            }
            f50 f50Var = s10Var.o;
            f50Var.x = true;
            f50Var.y = true;
            if (!p10Var.N && f50Var.v && z3) {
                if ((n == null || !n.j()) && (n == null || !n.k())) {
                    d50Var.b.a(p10Var, tzVar);
                }
                if (d50Var.d) {
                    return;
                }
                E(null);
                return;
            }
            return;
        }
        t7 t7Var = d50Var.b;
        int ordinal2 = s10Var.c.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    g8.c();
                    return;
                }
            }
        }
        if ((s10Var.d || s10Var.e) && !z2) {
            return;
        }
        s10Var.e = true;
        s10Var.f = true;
        f50 f50Var2 = s10Var.o;
        f50Var2.x = true;
        f50Var2.y = true;
        if (p10Var.N) {
            return;
        }
        p10 n2 = p10Var.n();
        if (nz.l(p10Var.D(), Boolean.TRUE) && ((n2 == null || !n2.G.d) && (n2 == null || !n2.G.e))) {
            t7Var.a(p10Var, tz.e);
        } else if (p10Var.C() && ((n2 == null || !n2.j()) && (n2 == null || !n2.k()))) {
            t7Var.a(p10Var, tzVar);
        }
        if (d50Var.d) {
            return;
        }
        E(null);
    }

    /* renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public j2 m11getAccessibilityManager() {
        return this.x;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public q2 m12getClipboard() {
        return this.K;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public r2 m13getClipboardManager() {
        return this.J;
    }

    public n4 getDragAndDropManager() {
        return this.l;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public p60 m15getLayoutNodes() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
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

    @vl
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @vl
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // defpackage.dl
    public final void a(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void b(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void c(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void d(o20 o20Var) {
    }

    @Override // defpackage.dl
    public final void f(o20 o20Var) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(ul0 ul0Var) {
    }
}

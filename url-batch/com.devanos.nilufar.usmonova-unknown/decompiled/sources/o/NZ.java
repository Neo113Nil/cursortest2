package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class NZ extends View implements YG {
    public static boolean A;
    public static final LZ w = new LZ(1);
    public static Method x;
    public static Field y;
    public static boolean z;
    public final S2 h;
    public final C0924dj i;
    public InterfaceC2312yp j;
    public InterfaceC1455lp k;
    public final SG l;
    public boolean m;
    public Rect n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f73o;
    public boolean p;
    public final C1178ha q;
    public final C1859ry r;
    public long s;
    public boolean t;
    public final long u;
    public int v;

    public NZ(S2 s2, C0924dj c0924dj, InterfaceC2312yp interfaceC2312yp, InterfaceC1455lp interfaceC1455lp) {
        super(s2.getContext());
        this.h = s2;
        this.i = c0924dj;
        this.j = interfaceC2312yp;
        this.k = interfaceC1455lp;
        this.l = new SG();
        this.q = new C1178ha();
        this.r = new C1859ry(SP.x);
        this.s = AbstractC1700pW.a;
        this.t = true;
        setWillNotDraw(false);
        c0924dj.addView(this);
        this.u = View.generateViewId();
    }

    private final DH getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        SG sg = this.l;
        if (!sg.g) {
            return null;
        }
        sg.d();
        return sg.e;
    }

    private final void setInvalidated(boolean z2) {
        if (z2 != this.f73o) {
            this.f73o = z2;
            this.h.t(this, z2);
        }
    }

    @Override // o.YG
    public final long a(long j, boolean z2) {
        C1859ry c1859ry = this.r;
        if (!z2) {
            return AbstractC1473m3.Q(c1859ry.b(this), j);
        }
        float[] a = c1859ry.a(this);
        if (a != null) {
            return AbstractC1473m3.Q(a, j);
        }
        return 9187343241974906880L;
    }

    @Override // o.YG
    public final void b(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq) {
        boolean z2 = getElevation() > 0.0f;
        this.p = z2;
        if (z2) {
            interfaceC0980ea.k();
        }
        this.i.a(interfaceC0980ea, this, getDrawingTime());
        if (this.p) {
            interfaceC0980ea.g();
        }
    }

    @Override // o.YG
    public final void c(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(AbstractC1700pW.a(this.s) * i);
        setPivotY(AbstractC1700pW.b(this.s) * i2);
        setOutlineProvider(this.l.b() != null ? w : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        i();
        this.r.c();
    }

    @Override // o.YG
    public final void d(LD ld, boolean z2) {
        C1859ry c1859ry = this.r;
        if (!z2) {
            AbstractC1473m3.R(c1859ry.b(this), ld);
            return;
        }
        float[] a = c1859ry.a(this);
        if (a != null) {
            AbstractC1473m3.R(a, ld);
            return;
        }
        ld.a = 0.0f;
        ld.b = 0.0f;
        ld.c = 0.0f;
        ld.d = 0.0f;
    }

    @Override // o.YG
    public final void destroy() {
        setInvalidated(false);
        S2 s2 = this.h;
        s2.F = true;
        this.j = null;
        this.k = null;
        s2.B(this);
        this.i.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z2;
        C1178ha c1178ha = this.q;
        C2262y2 c2262y2 = c1178ha.a;
        Canvas canvas2 = c2262y2.a;
        c2262y2.a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z2 = false;
        } else {
            c2262y2.f();
            this.l.a(c2262y2);
            z2 = true;
        }
        InterfaceC2312yp interfaceC2312yp = this.j;
        if (interfaceC2312yp != null) {
            interfaceC2312yp.invoke(c2262y2, null);
        }
        if (z2) {
            c2262y2.d();
        }
        c1178ha.a.a = canvas2;
        setInvalidated(false);
    }

    @Override // o.YG
    public final void e(long j) {
        int i = (int) (j >> 32);
        int left = getLeft();
        C1859ry c1859ry = this.r;
        if (i != left) {
            offsetLeftAndRight(i - getLeft());
            c1859ry.c();
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 != getTop()) {
            offsetTopAndBottom(i2 - getTop());
            c1859ry.c();
        }
    }

    @Override // o.YG
    public final void f() {
        if (!this.f73o || A) {
            return;
        }
        DY.v(this);
        setInvalidated(false);
    }

    @Override // o.YG
    public final void g(InterfaceC2312yp interfaceC2312yp, InterfaceC1455lp interfaceC1455lp) {
        this.i.addView(this);
        this.m = false;
        this.p = false;
        int i = AbstractC1700pW.b;
        this.s = AbstractC1700pW.a;
        this.j = interfaceC2312yp;
        this.k = interfaceC1455lp;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C0924dj getContainer() {
        return this.i;
    }

    public long getLayerId() {
        return this.u;
    }

    public final S2 getOwnerView() {
        return this.h;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return MZ.a(this.h);
        }
        return -1L;
    }

    @Override // o.YG
    public final void h(C1823rO c1823rO) {
        InterfaceC1455lp interfaceC1455lp;
        int i = c1823rO.b | this.v;
        if ((i & 4096) != 0) {
            long j = c1823rO.f;
            this.s = j;
            setPivotX(AbstractC1700pW.a(j) * getWidth());
            setPivotY(AbstractC1700pW.b(this.s) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(1.0f);
        }
        if ((i & 2) != 0) {
            setScaleY(1.0f);
        }
        if ((i & 4) != 0) {
            setAlpha(1.0f);
        }
        if ((i & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i & 32) != 0) {
            setElevation(0.0f);
        }
        if ((i & 1024) != 0) {
            setRotation(0.0f);
        }
        if ((i & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i & 2048) != 0) {
            setCameraDistancePx(c1823rO.e);
        }
        boolean z2 = getManualClipPath() != null;
        if ((i & 24576) != 0) {
            this.m = false;
            i();
            setClipToOutline(false);
        }
        RG rg = c1823rO.k;
        long j2 = c1823rO.h;
        SG sg = this.l;
        boolean c = sg.c(rg, false, j2);
        if (sg.f) {
            setOutlineProvider(sg.b() != null ? w : null);
        }
        boolean z3 = getManualClipPath() != null;
        if (z2 != z3 || (z3 && c)) {
            invalidate();
        }
        if (!this.p && getElevation() > 0.0f && (interfaceC1455lp = this.k) != null) {
            interfaceC1455lp.invoke();
        }
        if ((i & 7963) != 0) {
            this.r.c();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = i & 64;
            RZ rz = RZ.a;
            if (i3 != 0) {
                rz.a(this, AbstractC0022At.L(c1823rO.c));
            }
            if ((i & 128) != 0) {
                rz.b(this, AbstractC0022At.L(c1823rO.d));
            }
        }
        if (i2 >= 31 && (131072 & i) != 0) {
            TZ.a.a(this, null);
        }
        if ((i & 32768) != 0) {
            setLayerType(0, null);
            this.t = true;
        }
        this.v = c1823rO.b;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.t;
    }

    public final void i() {
        Rect rect;
        if (this.m) {
            Rect rect2 = this.n;
            if (rect2 == null) {
                this.n = new Rect(0, 0, getWidth(), getHeight());
            } else {
                AbstractC0048Bt.k(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.n;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View, o.YG
    public final void invalidate() {
        if (this.f73o) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.h.invalidate();
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}

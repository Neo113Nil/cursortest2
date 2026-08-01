package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.layout.b;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class py extends c11 implements Runnable, ua0, View.OnAttachStateChangeListener {
    public boolean f;
    public int g;
    public d21 h;
    public final a70 i;
    public final zd0 j;
    public final x60 k;
    public final gs0 l;

    public py() {
        super(1);
        a70 a70Var = new a70(9);
        l21.a.getClass();
        a70Var.m(k21.b, new u21("caption bar"));
        a70Var.m(k21.c, new u21("display cutout"));
        a70Var.m(k21.d, new u21("ime"));
        a70Var.m(k21.e, new u21("mandatory system gestures"));
        a70Var.m(k21.f, new u21("navigation bars"));
        a70Var.m(k21.g, new u21("status bars"));
        a70Var.m(k21.h, new u21("system gestures"));
        a70Var.m(k21.i, new u21("tappable element"));
        a70Var.m(k21.j, new u21("waterfall"));
        this.i = a70Var;
        this.j = new zd0(0);
        this.k = new x60(4);
        this.l = new gs0();
    }

    @Override // defpackage.ua0
    public final d21 a(View view, d21 d21Var) {
        if (this.f) {
            this.h = d21Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return d21Var;
            }
        } else if (this.g == 0) {
            f(d21Var);
        }
        return d21Var;
    }

    @Override // defpackage.c11
    public final void b(l11 l11Var) {
        boolean z = false;
        this.f = false;
        int d = l11Var.a.d();
        this.g &= ~d;
        this.h = null;
        l21 l21Var = (l21) b.c.b(d);
        if (l21Var != null) {
            Object g = this.i.g(l21Var);
            g.getClass();
            u21 u21Var = (u21) g;
            u21Var.c.h(0.0f);
            u21Var.e.h(1.0f);
            u21Var.d.h(0L);
            u21Var.c.h(0.0f);
            u21Var.b.setValue(Boolean.FALSE);
            u21Var.j = -1L;
            u21Var.k = -1L;
            zd0 zd0Var = this.j;
            zd0Var.h(zd0Var.g() + 1);
            synchronized (ur0.c) {
                b70 b70Var = ur0.j.h;
                if (b70Var != null) {
                    if (b70Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                ur0.a();
            }
        }
    }

    @Override // defpackage.c11
    public final void c(l11 l11Var) {
        this.f = true;
    }

    @Override // defpackage.c11
    public final d21 d(d21 d21Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l11 l11Var = (l11) list.get(i);
            l21 l21Var = (l21) b.c.b(l11Var.a.d());
            if (l21Var != null) {
                Object g = this.i.g(l21Var);
                g.getClass();
                u21 u21Var = (u21) g;
                if (((Boolean) u21Var.b.getValue()).booleanValue()) {
                    k11 k11Var = l11Var.a;
                    u21Var.c.h(k11Var.c());
                    u21Var.e.h(k11Var.a());
                    u21Var.d.h(k11Var.b());
                }
            }
        }
        f(d21Var);
        return d21Var;
    }

    @Override // defpackage.c11
    public final j3 e(l11 l11Var, j3 j3Var) {
        d21 d21Var = this.h;
        boolean z = false;
        this.f = false;
        this.h = null;
        if (l11Var.a.b() > 0 && d21Var != null) {
            int d = l11Var.a.d();
            this.g |= d;
            l21 l21Var = (l21) b.c.b(d);
            if (l21Var != null) {
                Object g = this.i.g(l21Var);
                g.getClass();
                u21 u21Var = (u21) g;
                oy f = d21Var.a.f(d);
                long j = (f.a << 48) | (f.b << 32) | (f.c << 16) | f.d;
                long j2 = u21Var.h;
                if (!ud0.j(j, j2)) {
                    u21Var.j = j2;
                    u21Var.k = j;
                    u21Var.b.setValue(Boolean.TRUE);
                    k11 k11Var = l11Var.a;
                    u21Var.c.h(k11Var.c());
                    u21Var.e.h(k11Var.a());
                    u21Var.d.h(k11Var.b());
                    zd0 zd0Var = this.j;
                    zd0Var.h(zd0Var.g() + 1);
                    synchronized (ur0.c) {
                        b70 b70Var = ur0.j.h;
                        if (b70Var != null) {
                            if (b70Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        ur0.a();
                        return j3Var;
                    }
                }
            }
        }
        return j3Var;
    }

    public final void f(d21 d21Var) {
        char c;
        char c2;
        char c3;
        char c4;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        long d;
        boolean z4;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i;
        p60 p60Var = b.a;
        int[] iArr5 = p60Var.b;
        Object[] objArr = p60Var.c;
        long[] jArr5 = p60Var.a;
        int length = jArr5.length - 2;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            z2 = false;
            z3 = false;
            c = 7;
            c2 = 16;
            c3 = ' ';
            while (true) {
                long j3 = jArr5[i3];
                c4 = '0';
                j = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr5[i6];
                            l21 l21Var = (l21) objArr[i6];
                            i = i2;
                            oy f = d21Var.a.f(i7);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j4 = (f.b << 32) | (f.a << 48) | (f.c << 16) | f.d;
                            Object g = this.i.g(l21Var);
                            g.getClass();
                            u21 u21Var = (u21) g;
                            if (!ud0.j(j4, u21Var.h)) {
                                u21Var.h = j4;
                                z2 = true;
                                if (!ud0.j(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i = i2;
                        }
                        j3 >>= i;
                        i5++;
                        i2 = i;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z = true;
                    if (i4 != i2) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z = true;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i2 = 8;
            }
        } else {
            c = 7;
            c2 = 16;
            c3 = ' ';
            c4 = '0';
            j = -9187201950435737472L;
            z = true;
            z2 = false;
            z3 = false;
        }
        p60 p60Var2 = b.c;
        int[] iArr6 = p60Var2.b;
        Object[] objArr2 = p60Var2.c;
        long[] jArr6 = p60Var2.a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr6[i8];
                if ((((~j5) << c) & j5 & j) != j) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i8 << 3) + i10;
                            int i12 = iArr6[i11];
                            Object g2 = this.i.g((l21) objArr2[i11]);
                            g2.getClass();
                            u21 u21Var2 = (u21) g2;
                            if (i12 != 8) {
                                oy g3 = d21Var.a.g(i12);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j6 = (g3.b << c3) | (g3.a << c4) | (g3.c << c2) | g3.d;
                                if (!ud0.j(u21Var2.i, j6)) {
                                    u21Var2.i = j6;
                                    z2 = z;
                                    if (!ud0.j(j6, 0L)) {
                                        z3 = z2;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            u21Var2.a.setValue(Boolean.valueOf(d21Var.a.p(i12)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j5 >>= 8;
                        i10++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        xm e = d21Var.a.e();
        if (e == null) {
            j2 = 0;
        } else {
            oy a = e.a();
            j2 = (a.a << c4) | (a.b << c3) | (a.c << c2) | a.d;
        }
        a70 a70Var = this.i;
        l21.a.getClass();
        Object g4 = a70Var.g(k21.j);
        g4.getClass();
        u21 u21Var3 = (u21) g4;
        if (!ud0.j(u21Var3.h, j2)) {
            u21Var3.h = j2;
            u21Var3.i = j2;
            z2 = z;
            if (!ud0.j(j2, 0L)) {
                z3 = z2;
            }
        }
        if (e == null) {
            d = 0;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            d = (i13 >= 28 ? wm.d(e.a) : 0) | ((i13 >= 28 ? wm.g(e.a) : 0) << c3) | ((i13 >= 28 ? wm.e(e.a) : 0) << c4) | ((i13 >= 28 ? wm.f(e.a) : 0) << c2);
        }
        Object g5 = this.i.g(k21.c);
        g5.getClass();
        u21 u21Var4 = (u21) g5;
        if (!ud0.j(d, u21Var4.h)) {
            u21Var4.h = d;
            u21Var4.i = d;
            z2 = z;
            if (!ud0.j(d, 0L)) {
                z3 = z2;
            }
        }
        if (e == null) {
            x60 x60Var = this.k;
            if (x60Var.b > 0) {
                x60Var.c();
                this.l.clear();
                z2 = z;
            }
        } else {
            List b = Build.VERSION.SDK_INT >= 28 ? wm.b(e.a) : Collections.EMPTY_LIST;
            int size = b.size();
            x60 x60Var2 = this.k;
            if (size < x60Var2.b) {
                x60Var2.k(b.size(), this.k.b);
                this.l.d(b.size(), this.l.size());
                z2 = z;
            } else {
                int size2 = b.size() - this.k.b;
                int i14 = 0;
                while (i14 < size2) {
                    x60 x60Var3 = this.k;
                    x60Var3.a(ud0.o(b.get(x60Var3.b)));
                    this.l.add(new jy("display cutout rect " + this.k.b));
                    i14++;
                    z2 = z;
                }
            }
            int size3 = b.size();
            for (int i15 = 0; i15 < size3; i15++) {
                Rect rect = (Rect) b.get(i15);
                f70 f70Var = (f70) this.k.e(i15);
                if (!nz.l(f70Var.getValue(), rect)) {
                    f70Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!b.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.j.g() != 0) && z2) {
            zd0 zd0Var = this.j;
            zd0Var.h(zd0Var.g() + 1);
            synchronized (ur0.c) {
                b70 b70Var = ur0.j.h;
                if (b70Var != null) {
                    boolean z5 = z;
                    z4 = b70Var.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                ur0.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = c01.a;
        xz0.b(view, this);
        c01.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = c01.a;
        xz0.b(view, null);
        c01.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f) {
            this.g = 0;
            this.f = false;
            d21 d21Var = this.h;
            if (d21Var != null) {
                f(d21Var);
                this.h = null;
            }
        }
    }
}

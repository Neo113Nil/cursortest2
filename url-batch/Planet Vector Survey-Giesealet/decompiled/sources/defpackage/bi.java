package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bi implements uh {
    public final vh d;
    public final t7 e;
    public final AtomicReference f = new AtomicReference(null);
    public final Object g = new Object();
    public final d70 h;
    public final jr0 i;
    public final a70 j;
    public final b70 k;
    public final b70 l;
    public final a70 m;
    public final rc n;
    public final rc o;
    public final a70 p;
    public a70 q;
    public boolean r;
    public bi s;
    public int t;
    public final y7 u;
    public final ca0 v;
    public final qh w;
    public int x;

    public bi(vh vhVar, t7 t7Var) {
        this.d = vhVar;
        this.e = t7Var;
        d70 d70Var = new d70(new b70());
        this.h = d70Var;
        jr0 jr0Var = new jr0();
        if (vhVar.c()) {
            jr0Var.n = new p60();
        }
        if (vhVar.e()) {
            jr0Var.b();
        }
        this.i = jr0Var;
        this.j = ld0.g();
        this.k = new b70();
        this.l = new b70();
        this.m = ld0.g();
        rc rcVar = new rc();
        this.n = rcVar;
        rc rcVar2 = new rc();
        this.o = rcVar2;
        this.p = ld0.g();
        this.q = ld0.g();
        y7 y7Var = new y7(vhVar);
        this.u = y7Var;
        this.v = new ca0();
        qh qhVar = new qh(t7Var, vhVar, jr0Var, d70Var, rcVar, rcVar2, y7Var, this);
        vhVar.m(qhVar);
        this.w = qhVar;
        eg egVar = jg.a;
    }

    public final void a() {
        this.f.set(null);
        this.n.h.N();
        this.o.h.N();
        d70 d70Var = this.h;
        if (d70Var.d.g()) {
            return;
        }
        ca0 ca0Var = this.v;
        try {
            ca0Var.i(d70Var, this.w.y());
            ca0Var.e();
        } finally {
            ca0Var.b();
        }
    }

    public final void b(Object obj, boolean z) {
        Object g = this.j.g(obj);
        if (g == null) {
            return;
        }
        boolean z2 = g instanceof b70;
        vz vzVar = vz.d;
        b70 b70Var = this.k;
        b70 b70Var2 = this.l;
        a70 a70Var = this.p;
        if (!z2) {
            ri0 ri0Var = (ri0) g;
            if (ld0.o(a70Var, obj, ri0Var) || ri0Var.b(obj) == vzVar) {
                return;
            }
            if (ri0Var.g == null || z) {
                b70Var.a(ri0Var);
                return;
            } else {
                b70Var2.a(ri0Var);
                return;
            }
        }
        b70 b70Var3 = (b70) g;
        Object[] objArr = b70Var3.b;
        long[] jArr = b70Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ri0 ri0Var2 = (ri0) objArr[(i << 3) + i3];
                        if (!ld0.o(a70Var, obj, ri0Var2) && ri0Var2.b(obj) != vzVar) {
                            if (ri0Var2.g == null || z) {
                                b70Var.a(ri0Var2);
                            } else {
                                b70Var2.a(ri0Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i2;
        long j6;
        boolean z2;
        int i3;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c3;
        long j8;
        int i4;
        int i5;
        long[] jArr8;
        boolean z3 = set instanceof xn0;
        a70 a70Var = this.m;
        Object obj = null;
        int i6 = 8;
        if (z3) {
            b70 b70Var = ((xn0) set).d;
            Object[] objArr = b70Var.b;
            long[] jArr9 = b70Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i7 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i7];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i7 << 3) + i9];
                                c3 = c4;
                                if (obj2 instanceof ri0) {
                                    ((ri0) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object g = a70Var.g(obj2);
                                    if (g != null) {
                                        if (g instanceof b70) {
                                            b70 b70Var2 = (b70) g;
                                            Object[] objArr2 = b70Var2.b;
                                            long[] jArr10 = b70Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i10 = i6;
                                                i4 = length;
                                                int i11 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i11];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i13 = 0;
                                                        while (i13 < i12) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr8 = jArr9;
                                                                b((yl) objArr2[(i11 << 3) + i13], z);
                                                            } else {
                                                                jArr8 = jArr9;
                                                            }
                                                            j10 >>= i10;
                                                            i13++;
                                                            jArr9 = jArr8;
                                                        }
                                                        jArr7 = jArr9;
                                                        if (i12 != i10) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr9;
                                                    }
                                                    if (i11 == length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr7;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr9;
                                            j8 = j9;
                                            i4 = length;
                                            b((yl) g, z);
                                        }
                                        i5 = 8;
                                    }
                                }
                                jArr7 = jArr9;
                                j8 = j9;
                                i4 = length;
                                i5 = 8;
                            } else {
                                jArr7 = jArr9;
                                c3 = c4;
                                j8 = j9;
                                i4 = length;
                                i5 = i6;
                            }
                            j9 = j8 >> i5;
                            i9++;
                            length = i4;
                            i6 = i5;
                            c4 = c3;
                            jArr9 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr9;
                        c = c4;
                        int i14 = length;
                        if (i8 != i6) {
                            break;
                        } else {
                            length = i14;
                        }
                    } else {
                        jArr6 = jArr9;
                        c = 7;
                    }
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                    jArr9 = jArr6;
                    obj = null;
                    i6 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof ri0) {
                    ((ri0) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object g2 = a70Var.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof b70) {
                            b70 b70Var3 = (b70) g2;
                            Object[] objArr3 = b70Var3.b;
                            long[] jArr12 = b70Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr12[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                b((yl) objArr3[(i << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            b((yl) g2, z);
                        }
                    }
                }
            }
        }
        a70 a70Var2 = this.j;
        b70 b70Var4 = this.k;
        if (z) {
            b70 b70Var5 = this.l;
            if (b70Var5.h()) {
                long[] jArr13 = a70Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr13[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = a70Var2.b[i20];
                                    Object obj5 = a70Var2.c[i20];
                                    if (obj5 instanceof b70) {
                                        b70 b70Var6 = (b70) obj5;
                                        Object[] objArr4 = b70Var6.b;
                                        long[] jArr14 = b70Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr14[i21];
                                                jArr5 = jArr13;
                                                i2 = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i3 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i3 = i23;
                                                            int i24 = (i21 << 3) + i3;
                                                            j7 = j13;
                                                            ri0 ri0Var = (ri0) objArr4[i24];
                                                            if (b70Var5.c(ri0Var) || b70Var4.c(ri0Var)) {
                                                                b70Var6.l(i24);
                                                            }
                                                        } else {
                                                            i3 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i21 == length5) {
                                                    break;
                                                }
                                                i21++;
                                                length4 = i2;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            i2 = length4;
                                            j6 = j12;
                                        }
                                        z2 = b70Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        i2 = length4;
                                        j6 = j12;
                                        obj5.getClass();
                                        ri0 ri0Var2 = (ri0) obj5;
                                        z2 = b70Var5.c(ri0Var2) || b70Var4.c(ri0Var2);
                                    }
                                    if (z2) {
                                        a70Var2.l(i20);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    i2 = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i2;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr13 = jArr4;
                    }
                }
                b70Var5.b();
                h();
                return;
            }
        }
        if (b70Var4.h()) {
            long[] jArr15 = a70Var2.a;
            int length6 = jArr15.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr15[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = a70Var2.b[i29];
                                Object obj7 = a70Var2.c[i29];
                                if (obj7 instanceof b70) {
                                    b70 b70Var7 = (b70) obj7;
                                    Object[] objArr5 = b70Var7.b;
                                    long[] jArr16 = b70Var7.a;
                                    int length7 = jArr16.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr16[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr17 = jArr16;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr15;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (b70Var4.c((ri0) objArr6[i33])) {
                                                            b70Var7.l(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr15;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr15 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr15;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr15;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr16 = jArr17;
                                            jArr15 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr15;
                                        j4 = j14;
                                    }
                                    c2 = b70Var7.g();
                                } else {
                                    jArr2 = jArr15;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = b70Var4.c((ri0) obj7);
                                }
                                if (c2) {
                                    a70Var2.l(i29);
                                }
                            } else {
                                jArr2 = jArr15;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr15 = jArr2;
                        }
                        jArr = jArr15;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr15;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr15 = jArr;
                }
            }
            h();
            b70Var4.b();
        }
    }

    public final void d() {
        synchronized (this.g) {
            try {
                e(this.n);
                k();
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        ca0 ca0Var = this.v;
                        try {
                            ca0Var.i(this.h, this.w.y());
                            ca0Var.e();
                            ca0Var.b();
                        } catch (Throwable th2) {
                            ca0Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01df A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #3 {all -> 0x01e3, blocks: (B:133:0x01d7, B:135:0x01df), top: B:132:0x01d7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(rc rcVar) {
        ca0 ca0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        ca0 ca0Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        int i3;
        rc rcVar2 = this.o;
        qh qhVar = this.w;
        yh y = qhVar.y();
        ca0 ca0Var3 = this.v;
        ca0Var3.i(this.h, y);
        try {
            if (rcVar.h.P()) {
                try {
                    if (rcVar2.h.P()) {
                        ca0Var3.e();
                    }
                    return;
                } finally {
                }
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    t7 t7Var = this.e;
                    mr0 d = this.i.d();
                    int i4 = 0;
                    try {
                        rcVar.N(t7Var, d, ca0Var3, qhVar.y());
                        d.e(true);
                        t7Var.v();
                        Trace.endSection();
                        ca0Var3.f();
                        l70 l70Var = (l70) ca0Var3.h;
                        if (l70Var.f != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Object[] objArr = l70Var.d;
                                int i5 = l70Var.f;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((bu) objArr[i6]).a();
                                }
                                l70Var.g();
                                Trace.endSection();
                            } finally {
                                Trace.endSection();
                            }
                        }
                        if (this.r) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.r = false;
                                a70 a70Var = this.j;
                                long[] jArr3 = a70Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j3 = jArr3[i7];
                                        char c2 = 7;
                                        long j4 = -9187201950435737472L;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8;
                                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                                            int i10 = i4;
                                            while (i10 < i9) {
                                                if ((j3 & 255) < 128) {
                                                    c = c2;
                                                    int i11 = (i7 << 3) + i10;
                                                    j2 = j4;
                                                    Object obj = a70Var.b[i11];
                                                    Object obj2 = a70Var.c[i11];
                                                    if (obj2 instanceof b70) {
                                                        b70 b70Var = (b70) obj2;
                                                        Object[] objArr2 = b70Var.b;
                                                        long[] jArr4 = b70Var.a;
                                                        int i12 = i8;
                                                        int length2 = jArr4.length - 2;
                                                        if (length2 >= 0) {
                                                            jArr2 = jArr3;
                                                            ca0Var2 = ca0Var3;
                                                            int i13 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j5 = jArr4[i13];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                                        int i15 = 0;
                                                                        while (i15 < i14) {
                                                                            if ((j5 & 255) < 128) {
                                                                                i3 = i10;
                                                                                int i16 = (i13 << 3) + i15;
                                                                                if (!((ri0) objArr2[i16]).a()) {
                                                                                    b70Var.l(i16);
                                                                                }
                                                                            } else {
                                                                                i3 = i10;
                                                                            }
                                                                            j5 >>= i12;
                                                                            i15++;
                                                                            i10 = i3;
                                                                        }
                                                                        i = i10;
                                                                        if (i14 != i12) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        i = i10;
                                                                    }
                                                                    if (i13 == length2) {
                                                                        break;
                                                                    }
                                                                    i13++;
                                                                    j3 = j;
                                                                    i10 = i;
                                                                    i12 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i = i10;
                                                            jArr2 = jArr3;
                                                            ca0Var2 = ca0Var3;
                                                            j = j3;
                                                        }
                                                        z = b70Var.g();
                                                    } else {
                                                        i = i10;
                                                        jArr2 = jArr3;
                                                        ca0Var2 = ca0Var3;
                                                        j = j3;
                                                        obj2.getClass();
                                                        z = !((ri0) obj2).a();
                                                    }
                                                    if (z) {
                                                        a70Var.l(i11);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i10;
                                                    jArr2 = jArr3;
                                                    ca0Var2 = ca0Var3;
                                                    j = j3;
                                                    c = c2;
                                                    j2 = j4;
                                                    i2 = i8;
                                                }
                                                j3 = j >> i2;
                                                i8 = i2;
                                                c2 = c;
                                                j4 = j2;
                                                ca0Var3 = ca0Var2;
                                                jArr3 = jArr2;
                                                i10 = i + 1;
                                            }
                                            jArr = jArr3;
                                            ca0Var = ca0Var3;
                                            if (i9 != i8) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            ca0Var = ca0Var3;
                                        }
                                        if (i7 == length) {
                                            break;
                                        }
                                        i7++;
                                        ca0Var3 = ca0Var;
                                        jArr3 = jArr;
                                        i4 = 0;
                                    }
                                } else {
                                    ca0Var = ca0Var3;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            ca0Var = ca0Var3;
                        }
                        try {
                            if (rcVar2.h.P()) {
                                ca0Var.e();
                            }
                        } finally {
                            ca0Var.b();
                        }
                    } catch (Throwable th3) {
                        try {
                            d.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (rcVar2.h.P()) {
                        ca0Var3.e();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (rcVar2.h.P()) {
            }
            throw th;
        }
    }

    public final void f() {
        synchronized (this.g) {
            try {
                if (this.o.h.Q()) {
                    e(this.o);
                }
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        ca0 ca0Var = this.v;
                        try {
                            ca0Var.i(this.h, this.w.y());
                            ca0Var.e();
                            ca0Var.b();
                        } catch (Throwable th2) {
                            ca0Var.b();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void g() {
        ca0 ca0Var;
        synchronized (this.g) {
            try {
                this.w.u = null;
                if (!this.h.d.g()) {
                    ca0Var = this.v;
                    try {
                        ca0Var.i(this.h, this.w.y());
                        ca0Var.e();
                        ca0Var.b();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.h.d.g()) {
                        ca0Var = this.v;
                        try {
                            ca0Var.i(this.h, this.w.y());
                            ca0Var.e();
                            ca0Var.b();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean z;
        int i3;
        long j7;
        a70 a70Var = this.m;
        long[] jArr3 = a70Var.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = a70Var.b[i8];
                            Object obj2 = a70Var.c[i8];
                            boolean z2 = obj2 instanceof b70;
                            a70 a70Var2 = this.j;
                            if (z2) {
                                b70 b70Var = (b70) obj2;
                                Object[] objArr = b70Var.b;
                                long[] jArr4 = b70Var.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) != j5) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!a70Var2.c((yl) objArr[i13])) {
                                                        b70Var.l(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                z = b70Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                obj2.getClass();
                                z = !a70Var2.c((yl) obj2);
                            }
                            if (z) {
                                a70Var.l(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        b70 b70Var2 = this.l;
        if (!b70Var2.h()) {
            return;
        }
        Object[] objArr2 = b70Var2.b;
        long[] jArr5 = b70Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((ri0) objArr2[i18]).g != null)) {
                            b70Var2.l(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final void i(eg egVar) {
        try {
            synchronized (this.g) {
                j();
                a70 a70Var = this.q;
                this.q = ld0.g();
                try {
                    qh qhVar = this.w;
                    if (!qhVar.e.h.P()) {
                        th.c("Expected applyChanges() to have been called");
                    }
                    qhVar.o(a70Var, egVar);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.h.d.g()) {
                    ca0 ca0Var = this.v;
                    try {
                        ca0Var.i(this.h, this.w.y());
                        ca0Var.e();
                        ca0Var.b();
                    } catch (Throwable th2) {
                        ca0Var.b();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final void j() {
        Object obj = nk.e;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                th.d("pending composition has not been applied");
                throw new kf();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                th.d("corrupt pendingModifications drain: " + atomicReference);
                throw new kf();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void k() {
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(null);
        if (nz.l(andSet, nk.e)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            th.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new kf();
        }
        th.d("corrupt pendingModifications drain: " + atomicReference);
        throw new kf();
    }

    public final void l() {
        bq bqVar = bq.d;
        AtomicReference atomicReference = this.f;
        Object andSet = atomicReference.getAndSet(bqVar);
        if (nz.l(andSet, nk.e) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            th.d("corrupt pendingModifications drain: " + atomicReference);
            throw new kf();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void m(ArrayList arrayList) {
        d70 d70Var = this.h;
        qh qhVar = this.w;
        if (arrayList.size() > 0) {
            ((i60) ((pd0) arrayList.get(0)).d).getClass();
            th.c("Check failed");
        }
        try {
            qhVar.getClass();
            try {
                qhVar.A(arrayList);
                qhVar.i();
            } catch (Throwable th) {
                qhVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!d70Var.d.g()) {
                    ca0 ca0Var = this.v;
                    try {
                        ca0Var.i(d70Var, qhVar.y());
                        ca0Var.e();
                        ca0Var.b();
                    } catch (Throwable th3) {
                        ca0Var.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final vz n(ri0 ri0Var, Object obj) {
        bi biVar;
        int i = ri0Var.b;
        if ((i & 2) != 0) {
            ri0Var.b = i | 4;
        }
        h2 h2Var = ri0Var.c;
        if (h2Var == null || !h2Var.a()) {
            return vz.d;
        }
        if (this.i.e(h2Var)) {
            if (ri0Var.d == null) {
                return vz.d;
            }
            vz p = p(ri0Var, h2Var, obj);
            if (p != vz.d) {
                this.u.getClass();
            }
            return p;
        }
        synchronized (this.g) {
            biVar = this.s;
        }
        if (biVar != null) {
            qh qhVar = biVar.w;
            if (qhVar.E && qhVar.Z(ri0Var, obj)) {
                return vz.g;
            }
        }
        return vz.d;
    }

    public final void o() {
        bi biVar;
        synchronized (this.g) {
            try {
                for (Object obj : this.i.f) {
                    ri0 ri0Var = obj instanceof ri0 ? (ri0) obj : null;
                    if (ri0Var != null && (biVar = ri0Var.a) != null) {
                        biVar.n(ri0Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final vz p(ri0 ri0Var, h2 h2Var, Object obj) {
        bi biVar;
        int i;
        synchronized (this.g) {
            try {
                bi biVar2 = this.s;
                if (biVar2 != null) {
                    jr0 jr0Var = this.i;
                    int i2 = this.t;
                    if (jr0Var.j) {
                        th.c("Writer is active");
                    }
                    if (i2 < 0 || i2 >= jr0Var.e) {
                        th.c("Invalid group index");
                    }
                    if (jr0Var.e(h2Var)) {
                        int i3 = jr0Var.d[(i2 * 5) + 3] + i2;
                        int i4 = h2Var.a;
                        biVar = (i2 <= i4 && i4 < i3) ? biVar2 : null;
                    }
                    biVar2 = null;
                }
                if (biVar == null) {
                    qh qhVar = this.w;
                    if (qhVar.E && qhVar.Z(ri0Var, obj)) {
                        return vz.g;
                    }
                    if (obj == null) {
                        this.q.m(ri0Var, b2.L);
                    } else {
                        boolean z = obj instanceof yl;
                        a70 a70Var = this.q;
                        if (z) {
                            Object g = a70Var.g(ri0Var);
                            if (g != null) {
                                if (g instanceof b70) {
                                    b70 b70Var = (b70) g;
                                    Object[] objArr = b70Var.b;
                                    long[] jArr = b70Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i5];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = 8;
                                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                int i8 = 0;
                                                while (i8 < i7) {
                                                    if ((j & 255) < 128) {
                                                        i = i6;
                                                        if (objArr[(i5 << 3) + i8] == b2.L) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i = i6;
                                                    }
                                                    j >>= i;
                                                    i8++;
                                                    i6 = i;
                                                }
                                                if (i7 != i6) {
                                                    break;
                                                }
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                } else if (g == b2.L) {
                                }
                            }
                            ld0.e(this.q, ri0Var, obj);
                        } else {
                            a70Var.m(ri0Var, b2.L);
                        }
                    }
                }
                if (biVar != null) {
                    return biVar.p(ri0Var, h2Var, obj);
                }
                this.d.j(this);
                return this.w.E ? vz.f : vz.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(Object obj) {
        Object g = this.j.g(obj);
        if (g == null) {
            return;
        }
        boolean z = g instanceof b70;
        vz vzVar = vz.g;
        a70 a70Var = this.p;
        if (!z) {
            ri0 ri0Var = (ri0) g;
            if (ri0Var.b(obj) == vzVar) {
                ld0.e(a70Var, obj, ri0Var);
                return;
            }
            return;
        }
        b70 b70Var = (b70) g;
        Object[] objArr = b70Var.b;
        long[] jArr = b70Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ri0 ri0Var2 = (ri0) objArr[(i << 3) + i3];
                        if (ri0Var2.b(obj) == vzVar) {
                            ld0.e(a70Var, obj, ri0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(Set set) {
        boolean z = set instanceof xn0;
        a70 a70Var = this.m;
        a70 a70Var2 = this.j;
        if (z) {
            b70 b70Var = ((xn0) set).d;
            Object[] objArr = b70Var.b;
            long[] jArr = b70Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (a70Var2.c(obj) || a70Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (a70Var2.c(obj2) || a70Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        boolean Q;
        synchronized (this.g) {
            j();
            try {
                a70 a70Var = this.q;
                this.q = ld0.g();
                try {
                    qh qhVar = this.w;
                    rc rcVar = qhVar.e;
                    if (!rcVar.h.P()) {
                        th.c("Expected applyChanges() to have been called");
                    }
                    if (a70Var.e > 0 || !qhVar.r.isEmpty()) {
                        qhVar.o(a70Var, null);
                        Q = rcVar.h.Q();
                    } else {
                        Q = false;
                    }
                    if (!Q) {
                        k();
                    }
                } catch (Throwable th) {
                    this.q = a70Var;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.h.d.g()) {
                        ca0 ca0Var = this.v;
                        try {
                            ca0Var.i(this.h, this.w.y());
                            ca0Var.e();
                            ca0Var.b();
                        } catch (Throwable th3) {
                            ca0Var.b();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
        return Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    public final void t(xn0 xn0Var) {
        xn0 xn0Var2;
        while (true) {
            Object obj = this.f.get();
            if (obj == null || obj.equals(nk.e)) {
                xn0Var2 = xn0Var;
            } else if (obj instanceof Set) {
                xn0Var2 = new Set[]{obj, xn0Var};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = xn0Var;
                xn0Var2 = copyOf;
            }
            AtomicReference atomicReference = this.f;
            while (!atomicReference.compareAndSet(obj, xn0Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.g) {
                    k();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Object obj) {
        ri0 w;
        int i;
        boolean z;
        int i2;
        qh qhVar = this.w;
        if (qhVar.z > 0 || (w = qhVar.w()) == null) {
            return;
        }
        int i3 = w.b | 1;
        w.b = i3;
        if ((i3 & 32) == 0) {
            w60 w60Var = w.f;
            if (w60Var == null) {
                w60Var = new w60();
                w.f = w60Var;
            }
            int i4 = w.e;
            int c = w60Var.c(obj);
            if (c < 0) {
                c = ~c;
                i = -1;
            } else {
                i = w60Var.c[c];
            }
            w60Var.b[c] = obj;
            w60Var.c[c] = i4;
            if (i == w.e) {
                z = true;
                this.u.getClass();
                if (z) {
                    if (obj instanceof it0) {
                        ((it0) obj).f(1);
                    }
                    ld0.e(this.j, obj, w);
                    if (obj instanceof yl) {
                        yl ylVar = (yl) obj;
                        xl h = ylVar.h();
                        a70 a70Var = this.m;
                        ld0.p(a70Var, obj);
                        w60 w60Var2 = h.e;
                        Object[] objArr = w60Var2.b;
                        long[] jArr = w60Var2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j & 255) < 128) {
                                            ht0 ht0Var = (ht0) objArr[(i5 << 3) + i8];
                                            i2 = i6;
                                            if (ht0Var instanceof it0) {
                                                ((it0) ht0Var).f(1);
                                            }
                                            ld0.e(a70Var, ht0Var, obj);
                                        } else {
                                            i2 = i6;
                                        }
                                        j >>= i2;
                                        i8++;
                                        i6 = i2;
                                    }
                                    if (i7 != i6) {
                                        break;
                                    }
                                }
                                if (i5 == length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        Object obj2 = h.f;
                        a70 a70Var2 = w.g;
                        if (a70Var2 == null) {
                            a70Var2 = new a70();
                            w.g = a70Var2;
                        }
                        a70Var2.m(ylVar, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.u.getClass();
        if (z) {
        }
    }

    public final void v(Object obj) {
        synchronized (this.g) {
            try {
                q(obj);
                Object g = this.m.g(obj);
                if (g != null) {
                    if (g instanceof b70) {
                        b70 b70Var = (b70) g;
                        Object[] objArr = b70Var.b;
                        long[] jArr = b70Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            q((yl) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        q((yl) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

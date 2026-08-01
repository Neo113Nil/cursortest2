package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ze0 {
    public ze0() {
        new ConcurrentHashMap();
    }

    public static final void a(long j, dw0 dw0Var, eg egVar, ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(-716124955);
        if ((((qhVar.e(j) ? 4 : 2) | i | (qhVar.f(dw0Var) ? 32 : 16)) & 147) == 146 && qhVar.z()) {
            qhVar.Q();
        } else {
            ji jiVar = pv0.a;
            nz.c(new ki0[]{aj.a.a(new ge(j)), jiVar.a(((dw0) qhVar.j(jiVar)).c(dw0Var))}, egVar, qhVar, 56);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new nb(j, dw0Var, egVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116 A[Catch: CancellationException -> 0x003d, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003d, blocks: (B:16:0x0038, B:18:0x0101, B:20:0x0116, B:25:0x0139, B:27:0x0149, B:29:0x0153, B:36:0x0160, B:37:0x0165, B:39:0x0166), top: B:15:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d7 d7Var, x6 x6Var, long j, mu muVar, lj ljVar) {
        bu0 bu0Var;
        int i;
        ck ckVar;
        gj0 gj0Var;
        d7 d7Var2;
        d7 d7Var3;
        gj0 gj0Var2;
        Object e;
        mu muVar2;
        b7 b7Var;
        b7 b7Var2;
        Object obj;
        Object e2;
        x6 x6Var2 = x6Var;
        b2 b2Var = b2.B;
        if (ljVar instanceof bu0) {
            bu0Var = (bu0) ljVar;
            int i2 = bu0Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bu0Var.i = i2 - Integer.MIN_VALUE;
                bu0 bu0Var2 = bu0Var;
                Object obj2 = bu0Var2.h;
                i = bu0Var2.i;
                int i3 = 25;
                int i4 = 1;
                ckVar = ck.d;
                if (i != 0) {
                    rg0.u(obj2);
                    Object b = x6Var2.b(0L);
                    i7 f = x6Var2.f(0L);
                    gj0Var = new gj0();
                    if (j == Long.MIN_VALUE) {
                        try {
                            d7Var2 = d7Var;
                            try {
                                du0 du0Var = new du0(gj0Var, b, x6Var2, f, d7Var2, k(bu0Var2.getContext()), muVar);
                                gj0Var2 = gj0Var;
                                try {
                                    bu0Var2.d = d7Var2;
                                    bu0Var2.e = x6Var2;
                                    bu0Var2.f = muVar;
                                    bu0Var2.g = gj0Var2;
                                    bu0Var2.i = 1;
                                    if (!x6Var2.a()) {
                                        e = x40.D(bu0Var2.getContext()).e(new f2(i3, du0Var), bu0Var2);
                                    } else {
                                        if (bu0Var2.getContext().k(b2Var) != null) {
                                            throw new ClassCastException();
                                        }
                                        e = x40.D(bu0Var2.getContext()).e(du0Var, bu0Var2);
                                    }
                                    if (e != ckVar) {
                                        d7Var3 = d7Var2;
                                        muVar2 = muVar;
                                    }
                                    return ckVar;
                                } catch (CancellationException e3) {
                                    e = e3;
                                    d7Var3 = d7Var2;
                                    gj0Var = gj0Var2;
                                    b7Var = (b7) gj0Var.d;
                                    if (b7Var != null) {
                                        b7Var.i.setValue(Boolean.FALSE);
                                    }
                                    b7Var2 = (b7) gj0Var.d;
                                    if (b7Var2 != null && b7Var2.g == d7Var3.g) {
                                        d7Var3.i = false;
                                    }
                                    throw e;
                                }
                            } catch (CancellationException e4) {
                                e = e4;
                                d7Var3 = d7Var2;
                                b7Var = (b7) gj0Var.d;
                                if (b7Var != null) {
                                }
                                b7Var2 = (b7) gj0Var.d;
                                if (b7Var2 != null) {
                                    d7Var3.i = false;
                                }
                                throw e;
                            }
                        } catch (CancellationException e5) {
                            e = e5;
                            d7Var2 = d7Var;
                        }
                    } else {
                        gj0Var2 = gj0Var;
                        try {
                            b7 b7Var3 = new b7(b, x6Var2.d(), f, j, x6Var2.e(), j, new cu0(d7Var, i4));
                            f(b7Var3, j, k(bu0Var2.getContext()), x6Var2, d7Var, muVar);
                            gj0Var2.d = b7Var3;
                            d7Var3 = d7Var;
                            x6Var2 = x6Var;
                            muVar2 = muVar;
                        } catch (CancellationException e6) {
                            e = e6;
                            d7Var3 = d7Var;
                            gj0Var = gj0Var2;
                            b7Var = (b7) gj0Var.d;
                            if (b7Var != null) {
                            }
                            b7Var2 = (b7) gj0Var.d;
                            if (b7Var2 != null) {
                            }
                            throw e;
                        }
                    }
                    gj0Var = gj0Var2;
                } else {
                    if (i != 1 && i != 2) {
                        g8.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gj0Var = bu0Var2.g;
                    muVar2 = bu0Var2.f;
                    x6Var2 = bu0Var2.e;
                    d7Var3 = bu0Var2.d;
                    try {
                        rg0.u(obj2);
                    } catch (CancellationException e7) {
                        e = e7;
                        b7Var = (b7) gj0Var.d;
                        if (b7Var != null) {
                        }
                        b7Var2 = (b7) gj0Var.d;
                        if (b7Var2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = gj0Var.d;
                    obj.getClass();
                    if (((Boolean) ((b7) obj).i.getValue()).booleanValue()) {
                        return ky0.a;
                    }
                    gj0 gj0Var3 = gj0Var;
                    mu muVar3 = muVar2;
                    x6 x6Var3 = x6Var2;
                    d7 d7Var4 = d7Var3;
                    try {
                        eu0 eu0Var = new eu0(gj0Var3, k(bu0Var2.getContext()), x6Var3, d7Var4, muVar3);
                        gj0Var = gj0Var3;
                        x6Var2 = x6Var3;
                        d7Var3 = d7Var4;
                        muVar2 = muVar3;
                        bu0Var2.d = d7Var3;
                        bu0Var2.e = x6Var2;
                        bu0Var2.f = muVar2;
                        bu0Var2.g = gj0Var;
                        bu0Var2.i = 2;
                        if (!x6Var2.a()) {
                            e2 = x40.D(bu0Var2.getContext()).e(new f2(i3, eu0Var), bu0Var2);
                        } else {
                            if (bu0Var2.getContext().k(b2Var) != null) {
                                throw new ClassCastException();
                            }
                            e2 = x40.D(bu0Var2.getContext()).e(eu0Var, bu0Var2);
                        }
                    } catch (CancellationException e8) {
                        e = e8;
                        gj0Var = gj0Var3;
                        d7Var3 = d7Var4;
                        b7Var = (b7) gj0Var.d;
                        if (b7Var != null) {
                        }
                        b7Var2 = (b7) gj0Var.d;
                        if (b7Var2 != null) {
                        }
                        throw e;
                    }
                } while (e2 != ckVar);
                return ckVar;
            }
        }
        bu0Var = new bu0(ljVar);
        bu0 bu0Var22 = bu0Var;
        Object obj22 = bu0Var22.h;
        i = bu0Var22.i;
        int i32 = 25;
        int i42 = 1;
        ckVar = ck.d;
        if (i != 0) {
        }
        do {
            obj = gj0Var.d;
            obj.getClass();
            if (((Boolean) ((b7) obj).i.getValue()).booleanValue()) {
            }
        } while (e2 != ckVar);
        return ckVar;
    }

    public static Object c(float f, float f2, ox0 ox0Var, qu quVar, fu0 fu0Var, int i) {
        c7 c7Var = ox0Var;
        if ((i & 8) != 0) {
            c7Var = nk.K(7, null);
        }
        j3 j3Var = dz0.a;
        Float f3 = new Float(f);
        Float f4 = new Float(f2);
        e7 e7Var = new e7(new Float(0.0f).floatValue());
        Object b = b(new d7(j3Var, f3, e7Var, 56), new zu0(c7Var, j3Var, f3, f4, e7Var), Long.MIN_VALUE, new f2(quVar), fu0Var);
        ky0 ky0Var = ky0.a;
        ck ckVar = ck.d;
        if (b != ckVar) {
            b = ky0Var;
        }
        return b == ckVar ? b : ky0Var;
    }

    public static final void e(wv wvVar, ez0 ez0Var) {
        List list = ez0Var.m;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gz0 gz0Var = (gz0) list.get(i);
            if (gz0Var instanceof iz0) {
                ee0 ee0Var = new ee0();
                iz0 iz0Var = (iz0) gz0Var;
                ee0Var.d = iz0Var.e;
                ee0Var.n = true;
                ee0Var.c();
                ee0Var.s.a.setFillType(iz0Var.f == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                ee0Var.c();
                ee0Var.c();
                ee0Var.b = iz0Var.g;
                ee0Var.c();
                ee0Var.c = iz0Var.h;
                ee0Var.c();
                ee0Var.g = iz0Var.i;
                ee0Var.c();
                ee0Var.e = iz0Var.j;
                ee0Var.c();
                ee0Var.f = iz0Var.k;
                ee0Var.o = true;
                ee0Var.c();
                ee0Var.h = iz0Var.l;
                ee0Var.o = true;
                ee0Var.c();
                ee0Var.i = iz0Var.m;
                ee0Var.o = true;
                ee0Var.c();
                ee0Var.j = iz0Var.n;
                ee0Var.o = true;
                ee0Var.c();
                ee0Var.k = iz0Var.o;
                ee0Var.p = true;
                ee0Var.c();
                ee0Var.l = iz0Var.p;
                ee0Var.p = true;
                ee0Var.c();
                ee0Var.m = iz0Var.q;
                ee0Var.p = true;
                ee0Var.c();
                wvVar.e(i, ee0Var);
            } else if (gz0Var instanceof ez0) {
                wv wvVar2 = new wv();
                ez0 ez0Var2 = (ez0) gz0Var;
                wvVar2.k = ez0Var2.d;
                wvVar2.c();
                wvVar2.l = ez0Var2.e;
                wvVar2.s = true;
                wvVar2.c();
                wvVar2.o = ez0Var2.h;
                wvVar2.s = true;
                wvVar2.c();
                wvVar2.p = ez0Var2.i;
                wvVar2.s = true;
                wvVar2.c();
                wvVar2.q = ez0Var2.j;
                wvVar2.s = true;
                wvVar2.c();
                wvVar2.r = ez0Var2.k;
                wvVar2.s = true;
                wvVar2.c();
                wvVar2.m = ez0Var2.f;
                wvVar2.s = true;
                wvVar2.c();
                wvVar2.n = ez0Var2.g;
                wvVar2.s = true;
                wvVar2.c();
                wvVar2.f = ez0Var2.l;
                wvVar2.g = true;
                wvVar2.c();
                e(wvVar2, ez0Var2);
                wvVar.e(i, wvVar2);
            }
        }
    }

    public static final void f(b7 b7Var, long j, float f, x6 x6Var, d7 d7Var, mu muVar) {
        long c = f == 0.0f ? x6Var.c() : (long) ((j - b7Var.c) / f);
        b7Var.g = j;
        b7Var.e.setValue(x6Var.b(c));
        b7Var.f = x6Var.f(c);
        if (x6Var.g(c)) {
            b7Var.h = b7Var.g;
            b7Var.i.setValue(Boolean.FALSE);
        }
        v(b7Var, d7Var);
        muVar.c(b7Var);
    }

    public static final void g(e5 e5Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            g(e5Var, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            e5Var.a.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            sin2 = sin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static wt h(wt[] wtVarArr) {
        wt wtVar = null;
        int i = Integer.MAX_VALUE;
        for (wt wtVar2 : wtVarArr) {
            int abs = (Math.abs(wtVar2.c - 400) * 2) + (wtVar2.d ? 1 : 0);
            if (wtVar == null || i > abs) {
                wtVar = wtVar2;
                i = abs;
            }
        }
        return wtVar;
    }

    public static final String i(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final o20 j(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            o20 o20Var = tag instanceof o20 ? (o20) tag : null;
            if (o20Var != null) {
                return o20Var;
            }
            Object k = ud0.k(view);
            view = k instanceof View ? (View) k : null;
        }
        return null;
    }

    public static final float k(rj rjVar) {
        b60 b60Var = (b60) rjVar.k(b2.E);
        float t = b60Var != null ? b60Var.t() : 1.0f;
        if (t >= 0.0f) {
            return t;
        }
        hh0.b("negative scale factor");
        return t;
    }

    public static final long l(double d) {
        return p(4294967296L, (float) d);
    }

    public static final long m(int i) {
        return p(4294967296L, i);
    }

    public static final boolean n(float f, float f2, e5 e5Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        e5 a = g5.a();
        Path path = a.a;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            g5.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF = a.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        e5 a2 = g5.a();
        Path path2 = a2.a;
        a2.b(e5Var, a, 1);
        boolean isEmpty = path2.isEmpty();
        path2.reset();
        path.reset();
        return !isEmpty;
    }

    public static final boolean o(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final long p(long j, float f) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        gw0[] gw0VarArr = fw0.b;
        return floatToRawIntBits;
    }

    public static final Object q(Object[] objArr, j3 j3Var, bu buVar, ih ihVar, int i, int i2) {
        Object[] objArr2;
        j3 j3Var2;
        final Object obj;
        Object d;
        qh qhVar = (qh) ihVar;
        long j = qhVar.R;
        nk.g(36);
        final String l = Long.toString(j, 36);
        l.getClass();
        final xm0 xm0Var = (xm0) qhVar.j(zm0.a);
        Object K = qhVar.K();
        y7 y7Var = hh.a;
        if (K == y7Var) {
            Object c = (xm0Var == null || (d = xm0Var.d(l)) == null) ? null : ((mu) j3Var.f).c(d);
            if (c == null) {
                c = buVar.a();
            }
            objArr2 = objArr;
            j3Var2 = j3Var;
            vm0 vm0Var = new vm0(j3Var2, xm0Var, l, c, objArr2);
            qhVar.e0(vm0Var);
            K = vm0Var;
        } else {
            objArr2 = objArr;
            j3Var2 = j3Var;
        }
        final vm0 vm0Var2 = (vm0) K;
        Object obj2 = Arrays.equals(objArr2, vm0Var2.h) ? vm0Var2.g : null;
        if (obj2 == null) {
            obj2 = buVar.a();
        }
        boolean h = qhVar.h(vm0Var2) | ((((i & 112) ^ 48) > 32 && qhVar.h(j3Var2)) || (i & 48) == 32) | qhVar.h(xm0Var) | qhVar.f(l) | qhVar.h(obj2) | qhVar.h(objArr2);
        Object K2 = qhVar.K();
        if (h || K2 == y7Var) {
            final Object[] objArr3 = objArr2;
            obj = obj2;
            final j3 j3Var3 = j3Var2;
            bu buVar2 = new bu() { // from class: ek0
                @Override // defpackage.bu
                public final Object a() {
                    boolean z;
                    vm0 vm0Var3 = vm0.this;
                    xm0 xm0Var2 = vm0Var3.e;
                    xm0 xm0Var3 = xm0Var;
                    boolean z2 = true;
                    if (xm0Var2 != xm0Var3) {
                        vm0Var3.e = xm0Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = vm0Var3.f;
                    String str2 = l;
                    if (nz.l(str, str2)) {
                        z2 = z;
                    } else {
                        vm0Var3.f = str2;
                    }
                    vm0Var3.d = j3Var3;
                    vm0Var3.g = obj;
                    vm0Var3.h = objArr3;
                    t7 t7Var = vm0Var3.i;
                    if (t7Var != null && z2) {
                        t7Var.C();
                        vm0Var3.i = null;
                        vm0Var3.a();
                    }
                    return ky0.a;
                }
            };
            qhVar.e0(buVar2);
            K2 = buVar2;
        } else {
            obj = obj2;
        }
        mz.p((bu) K2, qhVar);
        return obj;
    }

    public static final wm0 r(ih ihVar) {
        qh qhVar = (qh) ihVar;
        qhVar.V(1967008021);
        Object[] objArr = new Object[0];
        Object K = qhVar.K();
        if (K == hh.a) {
            K = new zh(9);
            qhVar.e0(K);
        }
        wm0 wm0Var = (wm0) q(Arrays.copyOf(objArr, 0), wm0.e, (bu) K, qhVar, 3456, 0);
        wm0Var.c = (xm0) qhVar.j(zm0.a);
        qhVar.q(false);
        return wm0Var;
    }

    public static final hz0 s(ax axVar, ih ihVar) {
        qh qhVar = (qh) ihVar;
        sl slVar = (sl) qhVar.j(hi.h);
        float f = axVar.j;
        boolean e = qhVar.e((Float.floatToRawIntBits(slVar.a()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object K = qhVar.K();
        if (e || K == hh.a) {
            wv wvVar = new wv();
            e(wvVar, axVar.f);
            float f2 = axVar.b;
            float f3 = axVar.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(slVar.o(f2)) << 32) | (Float.floatToRawIntBits(slVar.o(f3)) & 4294967295L);
            float f4 = axVar.d;
            float f5 = axVar.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
            hz0 hz0Var = new hz0(wvVar);
            String str = axVar.a;
            long j = axVar.g;
            q9 q9Var = j != 16 ? new q9(j, axVar.h) : null;
            boolean z = axVar.i;
            hz0Var.e.setValue(new fr0(floatToRawIntBits));
            hz0Var.f.setValue(Boolean.valueOf(z));
            bz0 bz0Var = hz0Var.g;
            bz0Var.g.setValue(q9Var);
            bz0Var.i.setValue(new fr0(floatToRawIntBits2));
            bz0Var.c = str;
            qhVar.e0(hz0Var);
            K = hz0Var;
        }
        return (hz0) K;
    }

    public static final void t(List list, e5 e5Var) {
        Path path;
        int i;
        float f;
        int i2;
        ye0 ye0Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        Path path2 = e5Var.a;
        Path path3 = e5Var.a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path3.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        ye0 ye0Var2 = list2.isEmpty() ? ge0.c : (ye0) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i3 < size) {
            ye0 ye0Var3 = (ye0) list2.get(i3);
            if (ye0Var3 instanceof ge0) {
                path3.close();
                path = path3;
                i = size;
                f = f10;
                i2 = i3;
                ye0Var = ye0Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (ye0Var3 instanceof se0) {
                    se0 se0Var = (se0) ye0Var3;
                    float f17 = se0Var.c;
                    f13 += f17;
                    float f18 = se0Var.d;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i = size;
                    f = f10;
                    i2 = i3;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (ye0Var3 instanceof ke0) {
                        ke0 ke0Var = (ke0) ye0Var3;
                        float f19 = ke0Var.c;
                        float f20 = ke0Var.d;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (ye0Var3 instanceof re0) {
                            re0 re0Var = (re0) ye0Var3;
                            float f21 = re0Var.d;
                            float f22 = re0Var.c;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (ye0Var3 instanceof je0) {
                            je0 je0Var = (je0) ye0Var3;
                            float f23 = je0Var.d;
                            float f24 = je0Var.c;
                            path3.lineTo(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (ye0Var3 instanceof qe0) {
                            float f25 = ((qe0) ye0Var3).c;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (ye0Var3 instanceof ie0) {
                            float f26 = ((ie0) ye0Var3).c;
                            path3.lineTo(f26, f14);
                            f13 = f26;
                        } else {
                            if (ye0Var3 instanceof we0) {
                                f9 = ((we0) ye0Var3).c;
                                path3.rLineTo(f10, f9);
                            } else if (ye0Var3 instanceof xe0) {
                                float f27 = ((xe0) ye0Var3).c;
                                path3.lineTo(f13, f27);
                                f14 = f27;
                            } else if (ye0Var3 instanceof pe0) {
                                pe0 pe0Var = (pe0) ye0Var3;
                                path3.rCubicTo(pe0Var.c, pe0Var.d, pe0Var.e, pe0Var.f, pe0Var.g, pe0Var.h);
                                f11 = pe0Var.e + f13;
                                f12 = pe0Var.f + f14;
                                f13 += pe0Var.g;
                                f9 = pe0Var.h;
                            } else {
                                if (ye0Var3 instanceof he0) {
                                    he0 he0Var = (he0) ye0Var3;
                                    path3.cubicTo(he0Var.c, he0Var.d, he0Var.e, he0Var.f, he0Var.g, he0Var.h);
                                    f11 = he0Var.e;
                                    f12 = he0Var.f;
                                    f5 = he0Var.g;
                                    f6 = he0Var.h;
                                } else if (ye0Var3 instanceof ue0) {
                                    if (ye0Var2.a) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    ue0 ue0Var = (ue0) ye0Var3;
                                    path3.rCubicTo(f7, f8, ue0Var.c, ue0Var.d, ue0Var.e, ue0Var.f);
                                    f11 = ue0Var.c + f13;
                                    f12 = ue0Var.d + f14;
                                    f13 += ue0Var.e;
                                    f9 = ue0Var.f;
                                } else if (ye0Var3 instanceof me0) {
                                    if (ye0Var2.a) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    me0 me0Var = (me0) ye0Var3;
                                    path3.cubicTo(f13, f14, me0Var.c, me0Var.d, me0Var.e, me0Var.f);
                                    f11 = me0Var.c;
                                    f12 = me0Var.d;
                                    f5 = me0Var.e;
                                    f6 = me0Var.f;
                                } else if (ye0Var3 instanceof te0) {
                                    te0 te0Var = (te0) ye0Var3;
                                    float f28 = te0Var.f;
                                    float f29 = te0Var.e;
                                    float f30 = te0Var.d;
                                    float f31 = te0Var.c;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (ye0Var3 instanceof le0) {
                                        le0 le0Var = (le0) ye0Var3;
                                        float f34 = le0Var.f;
                                        float f35 = le0Var.e;
                                        float f36 = le0Var.d;
                                        f4 = le0Var.c;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (ye0Var3 instanceof ve0) {
                                        if (ye0Var2.b) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        ve0 ve0Var = (ve0) ye0Var3;
                                        float f37 = ve0Var.d;
                                        float f38 = ve0Var.c;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (ye0Var3 instanceof ne0) {
                                        if (ye0Var2.b) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        ne0 ne0Var = (ne0) ye0Var3;
                                        float f40 = ne0Var.d;
                                        float f41 = ne0Var.c;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        f12 = f14;
                                        ye0Var = ye0Var3;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (ye0Var3 instanceof oe0) {
                                        oe0 oe0Var = (oe0) ye0Var3;
                                        float f42 = oe0Var.h + f13;
                                        float f43 = oe0Var.i + f14;
                                        i = size;
                                        f = 0.0f;
                                        path = path3;
                                        i2 = i3;
                                        g(e5Var, f13, f14, f42, f43, oe0Var.c, oe0Var.d, oe0Var.e, oe0Var.f, oe0Var.g);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        ye0Var = ye0Var3;
                                    } else {
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        if (!(ye0Var3 instanceof fe0)) {
                                            g8.c();
                                            return;
                                        }
                                        fe0 fe0Var = (fe0) ye0Var3;
                                        float f44 = fe0Var.i;
                                        float f45 = fe0Var.h;
                                        ye0Var = ye0Var3;
                                        g(e5Var, f13, f14, f45, f44, fe0Var.c, fe0Var.d, fe0Var.e, fe0Var.f, fe0Var.g);
                                        f12 = f44;
                                        f14 = f12;
                                        f11 = f45;
                                        f13 = f11;
                                    }
                                    i = size;
                                    f = f10;
                                    i2 = i3;
                                    ye0Var = ye0Var3;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f10;
                    i2 = i3;
                }
                ye0Var = ye0Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            size = i;
            path3 = path;
            ye0Var2 = ye0Var;
            f10 = f;
        }
    }

    public static final void u() {
        throw new UnsupportedOperationException();
    }

    public static final void v(b7 b7Var, d7 d7Var) {
        d7Var.e.setValue(b7Var.e.getValue());
        i7 i7Var = d7Var.f;
        i7 i7Var2 = b7Var.f;
        int b = i7Var.b();
        for (int i = 0; i < b; i++) {
            i7Var.e(i7Var2.a(i), i);
        }
        d7Var.h = b7Var.h;
        d7Var.g = b7Var.g;
        d7Var.i = ((Boolean) b7Var.i.getValue()).booleanValue();
    }

    public abstract Typeface d(Context context, wt[] wtVarArr);
}

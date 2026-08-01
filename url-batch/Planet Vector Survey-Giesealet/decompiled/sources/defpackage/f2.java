package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f2 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(qu quVar) {
        super(1);
        this.e = 24;
        j3 j3Var = dz0.a;
        this.f = quVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x04e5, code lost:
    
        if (r17 != false) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0510  */
    @Override // defpackage.mu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        int i;
        q9 q9Var;
        boolean z;
        ks0 ks0Var;
        nc ncVar;
        t7 t7Var;
        float f;
        float f2;
        long r;
        int i2 = this.e;
        hx0 hx0Var = hx0.e;
        hx0 hx0Var2 = hx0.d;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                g2 g2Var = (g2) obj;
                q10 q10Var = (q10) obj2;
                if (g2Var.s()) {
                    if (g2Var.B().b) {
                        g2Var.n();
                    }
                    for (Map.Entry entry : g2Var.B().g.entrySet()) {
                        q10.a(q10Var, (lw) entry.getKey(), ((Number) entry.getValue()).intValue(), g2Var.l());
                    }
                    ea0 ea0Var = g2Var.l().t;
                    ea0Var.getClass();
                    while (!ea0Var.equals(q10Var.a.l())) {
                        for (lw lwVar : q10Var.b(ea0Var).keySet()) {
                            q10.a(q10Var, lwVar, q10Var.c(ea0Var, lwVar), ea0Var);
                        }
                        ea0Var = ea0Var.t;
                        ea0Var.getClass();
                    }
                }
                return ky0Var;
            case 1:
                return Boolean.valueOf(((zy) obj2).a(((rp0) obj).g));
            case 2:
                return Boolean.valueOf(a50.g((rp0) obj, (Resources) obj2));
            case 3:
                Configuration configuration = new Configuration((Configuration) obj);
                ji jiVar = AndroidCompositionLocals_androidKt.a;
                ((f70) obj2).setValue(configuration);
                return ky0Var;
            case 4:
                return new u3(0, (cn) obj2);
            case 5:
                return Boolean.valueOf(nz.l(obj, obj2));
            case 6:
                bt0 bt0Var = (bt0) ((p6) obj2).d.g(obj);
                return new iz(bt0Var != null ? ((iz) bt0Var.getValue()).a : 0L);
            case 7:
                rb rbVar = (rb) obj;
                y9 y9Var = (y9) obj2;
                if (rbVar.a() * y9Var.u < 0.0f || fr0.d(rbVar.d.c()) <= 0.0f) {
                    return rbVar.b(o1.m);
                }
                float min = Math.min(jn.a(y9Var.u, 0.0f) ? 1.0f : (float) Math.ceil(rbVar.a() * y9Var.u), (float) Math.ceil(fr0.d(rbVar.d.c()) / 2.0f));
                float f3 = min / 2.0f;
                long o = mz.o(f3, f3);
                long a = rg0.a(fr0.e(rbVar.d.c()) - min, fr0.c(rbVar.d.c()) - min);
                float f4 = min * 2.0f;
                boolean z2 = f4 > fr0.d(rbVar.d.c());
                xc0 a2 = y9Var.w.a(rbVar.d.c(), rbVar.d.getLayoutDirection(), rbVar);
                if (!(a2 instanceof uc0)) {
                    if (!(a2 instanceof wc0)) {
                        boolean z3 = z2;
                        if (!(a2 instanceof vc0)) {
                            g8.c();
                            return null;
                        }
                        ks0 ks0Var2 = y9Var.v;
                        long j = z3 ? 0L : o;
                        if (z3) {
                            a = rbVar.d.c();
                        }
                        return rbVar.b(new v9(ks0Var2, j, a, z3 ? ar.o : new ut0(min, 0.0f, 0, 0, 30), 0));
                    }
                    ks0 ks0Var3 = y9Var.v;
                    zl0 zl0Var = ((wc0) a2).a;
                    if (ld0.m(zl0Var)) {
                        return rbVar.b(new x9(z2, ks0Var3, zl0Var.e, f3, min, o, a, new ut0(min, 0.0f, 0, 0, 30)));
                    }
                    boolean z4 = z2;
                    if (y9Var.t == null) {
                        y9Var.t = new u9();
                    }
                    u9 u9Var = y9Var.t;
                    u9Var.getClass();
                    e5 e5Var = u9Var.d;
                    if (e5Var == null) {
                        e5Var = g5.a();
                        u9Var.d = e5Var;
                    }
                    e5Var.a.reset();
                    y6.j(e5Var, zl0Var);
                    if (!z4) {
                        e5 a3 = g5.a();
                        y6.j(a3, new zl0(min, min, (zl0Var.c - zl0Var.a) - min, (zl0Var.d - zl0Var.b) - min, a50.M(zl0Var.e, min), a50.M(zl0Var.f, min), a50.M(zl0Var.g, min), a50.M(zl0Var.h, min)));
                        e5Var.b(e5Var, a3, 0);
                    }
                    return rbVar.b(new y3(8, e5Var, ks0Var3));
                }
                ks0 ks0Var4 = y9Var.v;
                uc0 uc0Var = (uc0) a2;
                e5 e5Var2 = uc0Var.a;
                if (z2) {
                    return rbVar.b(new y3(7, uc0Var, ks0Var4));
                }
                if (y6.C(ks0Var4)) {
                    q9Var = new q9(ks0Var4.k, 5);
                    i = 1;
                } else {
                    i = 0;
                    q9Var = null;
                }
                zi0 a4 = e5Var2.a();
                float f5 = a4.b;
                float f6 = a4.a;
                if (y9Var.t == null) {
                    y9Var.t = new u9();
                }
                u9 u9Var2 = y9Var.t;
                u9Var2.getClass();
                e5 e5Var3 = u9Var2.d;
                if (e5Var3 == null) {
                    e5Var3 = g5.a();
                    u9Var2.d = e5Var3;
                }
                e5Var3.a.reset();
                float f7 = a4.a;
                float f8 = a4.d;
                float f9 = a4.c;
                float f10 = a4.b;
                if (Float.isNaN(f7) || Float.isNaN(f10) || Float.isNaN(f9) || Float.isNaN(f8)) {
                    g5.b("Invalid rectangle, make sure no value is NaN");
                }
                if (e5Var3.b == null) {
                    e5Var3.b = new RectF();
                }
                RectF rectF = e5Var3.b;
                rectF.getClass();
                rectF.set(f7, f10, f9, f8);
                Path path = e5Var3.a;
                RectF rectF2 = e5Var3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                e5Var3.b(e5Var3, e5Var2, 0);
                gj0 gj0Var = new gj0();
                long c = px0.c((int) Math.ceil(a4.c - f6), (int) Math.ceil(a4.d - f5));
                u9 u9Var3 = y9Var.t;
                u9Var3.getClass();
                x4 x4Var = u9Var3.a;
                o2 o2Var = u9Var3.b;
                vw vwVar = x4Var != null ? new vw(x4Var.a()) : null;
                try {
                    try {
                        if (vwVar == null || vwVar.a != 0) {
                            vw vwVar2 = x4Var != null ? new vw(x4Var.a()) : null;
                            if (!y6.C(vwVar2) || i != vwVar2.a) {
                                z = false;
                                if (x4Var != null || o2Var == null) {
                                    ks0Var = ks0Var4;
                                } else {
                                    float e = fr0.e(rbVar.d.c());
                                    Bitmap bitmap = x4Var.a;
                                    ks0Var = ks0Var4;
                                    if (e <= bitmap.getWidth()) {
                                        if (fr0.c(rbVar.d.c()) <= bitmap.getHeight()) {
                                        }
                                    }
                                }
                                x4Var = a50.b((int) (c >> 32), (int) (4294967295L & c), i);
                                u9Var3.a = x4Var;
                                Canvas canvas = p2.a;
                                o2Var = new o2();
                                o2Var.a = new Canvas(x4Var.a);
                                u9Var3.b = o2Var;
                                ncVar = u9Var3.c;
                                if (ncVar == null) {
                                    ncVar = new nc();
                                    u9Var3.c = ncVar;
                                }
                                t7Var = ncVar.e;
                                mc mcVar = ncVar.d;
                                long W = px0.W(c);
                                c10 layoutDirection = rbVar.d.getLayoutDirection();
                                sl slVar = mcVar.a;
                                nc ncVar2 = ncVar;
                                c10 c10Var = mcVar.b;
                                e5 e5Var4 = e5Var3;
                                kc kcVar = mcVar.c;
                                long j2 = mcVar.d;
                                mcVar.a = rbVar;
                                mcVar.b = layoutDirection;
                                mcVar.c = o2Var;
                                mcVar.d = W;
                                o2Var.i();
                                y6.q(ncVar2, ge.b, W, 58);
                                f = -f6;
                                f2 = -f5;
                                ((p01) t7Var.e).v(f, f2);
                                ks0 ks0Var5 = ks0Var;
                                y6.o(ncVar2, uc0Var.a, ks0Var5, 0.0f, new ut0(f4, 0.0f, 0, 0, 30), 52);
                                float e2 = (fr0.e(t7Var.r()) + 1.0f) / fr0.e(t7Var.r());
                                float c2 = (fr0.c(t7Var.r()) + 1.0f) / fr0.c(t7Var.r());
                                o2 o2Var2 = o2Var;
                                long D = ncVar2.D();
                                r = t7Var.r();
                                t7Var.p().i();
                                ((p01) t7Var.e).u(e2, c2, D);
                                y6.o(ncVar2, e5Var4, ks0Var5, 0.0f, null, 28);
                                ((p01) t7Var.e).v(-f, -f2);
                                o2Var2.g();
                                mcVar.a = slVar;
                                mcVar.b = c10Var;
                                mcVar.c = kcVar;
                                mcVar.d = j2;
                                x4Var.a.prepareToDraw();
                                gj0Var.d = x4Var;
                                return rbVar.b(new w9(a4, gj0Var, c, q9Var));
                            }
                        }
                        ((p01) t7Var.e).u(e2, c2, D);
                        y6.o(ncVar2, e5Var4, ks0Var5, 0.0f, null, 28);
                        ((p01) t7Var.e).v(-f, -f2);
                        o2Var2.g();
                        mcVar.a = slVar;
                        mcVar.b = c10Var;
                        mcVar.c = kcVar;
                        mcVar.d = j2;
                        x4Var.a.prepareToDraw();
                        gj0Var.d = x4Var;
                        return rbVar.b(new w9(a4, gj0Var, c, q9Var));
                    } finally {
                        t7Var.p().g();
                        t7Var.B(r);
                    }
                    ks0 ks0Var52 = ks0Var;
                    y6.o(ncVar2, uc0Var.a, ks0Var52, 0.0f, new ut0(f4, 0.0f, 0, 0, 30), 52);
                    float e22 = (fr0.e(t7Var.r()) + 1.0f) / fr0.e(t7Var.r());
                    float c22 = (fr0.c(t7Var.r()) + 1.0f) / fr0.c(t7Var.r());
                    o2 o2Var22 = o2Var;
                    long D2 = ncVar2.D();
                    r = t7Var.r();
                    t7Var.p().i();
                } catch (Throwable th) {
                    ((p01) t7Var.e).v(-f, -f2);
                    throw th;
                }
                z = true;
                if (x4Var != null) {
                }
                ks0Var = ks0Var4;
                x4Var = a50.b((int) (c >> 32), (int) (4294967295L & c), i);
                u9Var3.a = x4Var;
                Canvas canvas2 = p2.a;
                o2Var = new o2();
                o2Var.a = new Canvas(x4Var.a);
                u9Var3.b = o2Var;
                ncVar = u9Var3.c;
                if (ncVar == null) {
                }
                t7Var = ncVar.e;
                mc mcVar2 = ncVar.d;
                long W2 = px0.W(c);
                c10 layoutDirection2 = rbVar.d.getLayoutDirection();
                sl slVar2 = mcVar2.a;
                nc ncVar22 = ncVar;
                c10 c10Var2 = mcVar2.b;
                e5 e5Var42 = e5Var3;
                kc kcVar2 = mcVar2.c;
                long j22 = mcVar2.d;
                mcVar2.a = rbVar;
                mcVar2.b = layoutDirection2;
                mcVar2.c = o2Var;
                mcVar2.d = W2;
                o2Var.i();
                y6.q(ncVar22, ge.b, W2, 58);
                f = -f6;
                f2 = -f5;
                ((p01) t7Var.e).v(f, f2);
                break;
            case 8:
                long j3 = ((ra0) obj).a;
                qd qdVar = (qd) obj2;
                if (qdVar.w) {
                    qdVar.x.a();
                }
                return ky0Var;
            case 9:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return ky0Var;
            case 10:
                nn nnVar = (nn) obj;
                if (!nnVar.q) {
                    return hx0Var;
                }
                if (nnVar.s != null) {
                    cy.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                nnVar.s = null;
                cj0 cj0Var = (cj0) obj2;
                cj0Var.d = cj0Var.d;
                return hx0Var2;
            case 11:
                nn nnVar2 = (nn) obj;
                if (!nnVar2.d.q) {
                    return hx0Var;
                }
                nn nnVar3 = nnVar2.s;
                if (nnVar3 != null) {
                    f2 f2Var = new f2(11, (p01) obj2);
                    if (f2Var.c(nnVar3) == hx0Var2) {
                        yc0.t(nnVar3, f2Var);
                    }
                }
                nnVar2.s = null;
                nnVar2.r = null;
                return hx0Var2;
            case 12:
                if (kv.b.compareAndSet(false, true)) {
                    ((eb) obj2).r(ky0Var);
                }
                return ky0Var;
            case 13:
                oo ooVar = (oo) obj;
                nv nvVar = (nv) obj2;
                e5 e5Var5 = nvVar.l;
                if (nvVar.n && nvVar.w && e5Var5 != null) {
                    t7 r2 = ooVar.r();
                    long r3 = r2.r();
                    r2.p().i();
                    try {
                        ((t7) ((p01) r2.e).e).p().q(e5Var5);
                        nvVar.c(ooVar);
                    } finally {
                        r2.p().g();
                        r2.B(r3);
                    }
                } else {
                    nvVar.c(ooVar);
                }
                return ky0Var;
            case 14:
                oo ooVar2 = (oo) obj;
                kc p = ooVar2.r().p();
                qu quVar = ((pv) obj2).g;
                if (quVar != null) {
                    quVar.invoke(p, (nv) ooVar2.r().f);
                }
                return ky0Var;
            case 15:
                wy0 wy0Var = (wy0) obj;
                wv wvVar = (wv) obj2;
                wvVar.g(wy0Var);
                mu muVar = wvVar.i;
                if (muVar != null) {
                    muVar.c(wy0Var);
                }
                return ky0Var;
            case 16:
                Bundle bundle = (Bundle) obj;
                s80 h = d31.h((Context) obj2);
                LinkedHashMap linkedHashMap = h.n;
                if (bundle != null) {
                    bundle.setClassLoader(h.a.getClassLoader());
                    h.d = bundle.getBundle("android-support-nav:controller:navigatorState");
                    h.e = bundle.getParcelableArray("android-support-nav:controller:backStack");
                    linkedHashMap.clear();
                    int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                    if (intArray != null && stringArrayList != null) {
                        int length = intArray.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            h.m.put(Integer.valueOf(intArray[i3]), stringArrayList.get(i4));
                            i3++;
                            i4++;
                        }
                    }
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                    if (stringArrayList2 != null) {
                        int size = stringArrayList2.size();
                        int i5 = 0;
                        while (i5 < size) {
                            String str = stringArrayList2.get(i5);
                            i5++;
                            String str2 = str;
                            Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str2);
                            if (parcelableArray != null) {
                                str2.getClass();
                                h8 h8Var = new h8(parcelableArray.length);
                                int i6 = 0;
                                while (i6 < parcelableArray.length) {
                                    int i7 = i6 + 1;
                                    try {
                                        Parcelable parcelable = parcelableArray[i6];
                                        parcelable.getClass();
                                        h8Var.addLast((z70) parcelable);
                                        i6 = i7;
                                    } catch (ArrayIndexOutOfBoundsException e3) {
                                        g8.e(e3.getMessage());
                                        return null;
                                    }
                                }
                                linkedHashMap.put(str2, h8Var);
                            }
                        }
                    }
                    h.f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
                }
                return h;
            case 17:
                y70 y70Var = (y70) obj;
                p90 p90Var = (p90) obj2;
                y70Var.getClass();
                m80 m80Var = y70Var.e;
                if (m80Var == null) {
                    m80Var = null;
                }
                if (m80Var == null) {
                    return null;
                }
                y70Var.a();
                m80 c3 = p90Var.c(m80Var);
                if (c3 == null) {
                    return null;
                }
                if (c3.equals(m80Var)) {
                    return y70Var;
                }
                a80 b = p90Var.b();
                Bundle a5 = c3.a(y70Var.a());
                s80 s80Var = b.h;
                return y7.g(s80Var.a, c3, a5, s80Var.g(), s80Var.p);
            case 18:
                ((l70) obj2).b((s50) obj);
                return Boolean.TRUE;
            case 19:
                float floatValue = ((Number) obj).floatValue();
                ho0 ho0Var = (ho0) obj2;
                zd0 zd0Var = ho0Var.a;
                float g = zd0Var.g() + floatValue + ho0Var.e;
                float f11 = rg0.f(g, 0.0f, ho0Var.d.g());
                boolean z5 = g == f11;
                float g2 = f11 - zd0Var.g();
                int round = Math.round(g2);
                zd0Var.h(zd0Var.g() + round);
                ho0Var.e = g2 - round;
                if (!z5) {
                    floatValue = g2;
                }
                return Float.valueOf(floatValue);
            case 20:
                ((qo0) obj2).H.v = (b10) obj;
                return ky0Var;
            case 21:
                zo0 zo0Var = (zo0) obj2;
                return new ra0(zo0.a(zo0Var, zo0Var.h, ((ra0) obj).a, zo0Var.g));
            case 22:
                xp0.a((np0) obj, ((tl0) obj2).a);
                return ky0Var;
            case 23:
                wk0 wk0Var = (wk0) obj;
                er0 er0Var = (er0) obj2;
                wk0Var.d(er0Var.r);
                wk0Var.e(er0Var.s);
                wk0Var.b(er0Var.t);
                float f12 = er0Var.u;
                if (wk0Var.h != f12) {
                    wk0Var.d |= 32;
                    wk0Var.h = f12;
                }
                float f13 = er0Var.v;
                if (wk0Var.k != f13) {
                    wk0Var.d |= 2048;
                    wk0Var.k = f13;
                }
                wk0Var.f(er0Var.w);
                rq0 rq0Var = er0Var.x;
                if (!nz.l(wk0Var.m, rq0Var)) {
                    wk0Var.d |= 8192;
                    wk0Var.m = rq0Var;
                }
                boolean z6 = er0Var.y;
                if (wk0Var.n != z6) {
                    wk0Var.d |= 16384;
                    wk0Var.n = z6;
                }
                long j4 = er0Var.z;
                if (!ge.c(wk0Var.i, j4)) {
                    wk0Var.d |= 64;
                    wk0Var.i = j4;
                }
                long j5 = er0Var.A;
                if (!ge.c(wk0Var.j, j5)) {
                    wk0Var.d |= 128;
                    wk0Var.j = j5;
                }
                int i8 = er0Var.B;
                if (wk0Var.r != i8) {
                    wk0Var.d |= 524288;
                    wk0Var.r = i8;
                }
                return ky0Var;
            case 24:
                b7 b7Var = (b7) obj;
                Object value = b7Var.e.getValue();
                j3 j3Var = dz0.a;
                ((qu) obj2).invoke(value, Float.valueOf(((e7) b7Var.f).a));
                return ky0Var;
            case 25:
                return ((mu) obj2).c(Long.valueOf(((Number) obj).longValue()));
            case 26:
                Throwable th2 = (Throwable) obj;
                ju0 ju0Var = (ju0) obj2;
                hc hcVar = ju0Var.f;
                if (hcVar != null) {
                    hcVar.j(th2);
                }
                ju0Var.f = null;
                return ky0Var;
            default:
                return new u3(2, (cx0) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i, Object obj) {
        super(1);
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(p90 p90Var, c90 c90Var) {
        super(1);
        this.e = 17;
        this.f = p90Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(p01 p01Var, nn nnVar, cj0 cj0Var) {
        super(1);
        this.e = 10;
        this.f = cj0Var;
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.graphics.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class d31 {
    public static final op b;
    public static final op c;
    public static final op e;
    public static final dd a = new dd();
    public static final int[] d = new int[2];
    public static final el0 f = new el0(0.16f, 0.1f, 0.08f, 0.1f);
    public static final iw0 g = new iw0(0, new long[0], new Object[0]);

    static {
        int i = 1;
        b = new op("UNDEFINED", i);
        c = new op("REUSABLE_CLAIMED", i);
        e = new op("NULL", i);
    }

    public static final void A(rj rjVar, Throwable th) {
        try {
            vj vjVar = (vj) rjVar.k(b2.u);
            if (vjVar != null) {
                vjVar.m(rjVar, th);
            } else {
                px0.E(rjVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                mz.r(runtimeException, th);
                th = runtimeException;
            }
            px0.E(rjVar, th);
        }
    }

    public static kj B(kj kjVar) {
        kj intercepted;
        kjVar.getClass();
        lj ljVar = kjVar instanceof lj ? (lj) kjVar : null;
        return (ljVar == null || (intercepted = ljVar.intercepted()) == null) ? kjVar : intercepted;
    }

    public static final boolean C(long j) {
        return (j & 2) != 0;
    }

    public static final boolean D(long j) {
        return (j & 1) != 0;
    }

    public static ws0 E(bk bkVar, rj rjVar, qu quVar, int i) {
        if ((i & 1) != 0) {
            rjVar = up.d;
        }
        ek ekVar = (i & 2) != 0 ? ek.d : ek.g;
        rj s = a50.s(bkVar.f(), rjVar, true);
        gl glVar = vm.a;
        if (s != glVar && s.k(b2.t) == null) {
            s = s.i(glVar);
        }
        ws0 v10Var = ekVar == ek.e ? new v10(s, quVar) : new ws0(s, true);
        v10Var.d0(ekVar, v10Var, quVar);
        return v10Var;
    }

    public static final float F(long j) {
        me f2 = ge.f(j);
        if (!x40.A(f2.b, 12884901888L)) {
            fy.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) x40.U(f2.b)));
        }
        zk0 zk0Var = ((dl0) f2).p;
        double b2 = zk0Var.b(ge.h(j));
        float b3 = (float) ((zk0Var.b(ge.e(j)) * 0.0722d) + (zk0Var.b(ge.g(j)) * 0.7152d) + (b2 * 0.2126d));
        if (b3 < 0.0f) {
            b3 = 0.0f;
        }
        if (b3 > 1.0f) {
            return 1.0f;
        }
        return b3;
    }

    public static final void G(kj kjVar, Object obj) {
        if (!(kjVar instanceof rm)) {
            kjVar.resumeWith(obj);
            return;
        }
        rm rmVar = (rm) kjVar;
        uj ujVar = rmVar.g;
        lj ljVar = rmVar.h;
        Throwable a2 = vk0.a(obj);
        Object jfVar = a2 == null ? obj : new jf(a2, false);
        if (ujVar.f(ljVar.getContext())) {
            rmVar.i = jfVar;
            rmVar.f = 1;
            ujVar.d(ljVar.getContext(), rmVar);
            return;
        }
        pq a3 = hw0.a();
        if (a3.f >= 4294967296L) {
            rmVar.i = jfVar;
            rmVar.f = 1;
            a3.p(rmVar);
            return;
        }
        a3.r(true);
        try {
            zz zzVar = (zz) ljVar.getContext().k(b2.C);
            if (zzVar == null || zzVar.b()) {
                Object obj2 = rmVar.j;
                rj context = ljVar.getContext();
                Object Y = mz.Y(context, obj2);
                iy0 P = Y != mz.p ? a50.P(ljVar, context, Y) : null;
                try {
                    ljVar.resumeWith(obj);
                } finally {
                    if (P == null || P.e0()) {
                        mz.S(context, Y);
                    }
                }
            } else {
                rmVar.resumeWith(rg0.i(zzVar.n()));
            }
            while (a3.w()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void H(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final int I(long j) {
        float[] fArr = qe.a;
        return (int) (ge.a(j, qe.e) >>> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [bh, ni0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList J(ir0 ir0Var, int i, Integer num) {
        ?? ni0Var = new ni0(ir0Var);
        int q = ir0Var.q(i);
        h2 a2 = ir0Var.a(i);
        while (i >= 0) {
            ni0Var.d(ir0Var.a.f(i), num);
            if (q >= 0) {
                h2 h2Var = a2;
                a2 = ir0Var.a(q);
                i = q;
                q = ir0Var.q(q);
                num = h2Var;
            } else {
                i = q;
                num = a2;
            }
        }
        return (ArrayList) ni0Var.a;
    }

    public static final Object K(rj rjVar, qu quVar, fu0 fu0Var) {
        rj context = fu0Var.getContext();
        rj i = !((Boolean) rjVar.o(new ze(9), Boolean.FALSE)).booleanValue() ? context.i(rjVar) : a50.s(context, rjVar, false);
        nk.n(i);
        if (i == context) {
            yn0 yn0Var = new yn0(fu0Var, i);
            return ch0.l(yn0Var, yn0Var, quVar);
        }
        b2 b2Var = b2.t;
        if (nz.l(i.k(b2Var), context.k(b2Var))) {
            iy0 iy0Var = new iy0(i, fu0Var);
            rj rjVar2 = iy0Var.f;
            Object Y = mz.Y(rjVar2, null);
            try {
                return ch0.l(iy0Var, iy0Var, quVar);
            } finally {
                mz.S(rjVar2, Y);
            }
        }
        sm smVar = new sm(fu0Var, i);
        try {
            G(B(p(smVar, smVar, quVar)), ky0.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = sm.h;
            do {
                int i2 = atomicIntegerFieldUpdater.get(smVar);
                if (i2 != 0) {
                    if (i2 != 2) {
                        g8.s("Already suspended");
                        return null;
                    }
                    Object R = nk.R(g00.d.get(smVar));
                    if (R instanceof jf) {
                        throw ((jf) R).a;
                    }
                    return R;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(smVar, 0, 1));
            return ck.d;
        } catch (Throwable th) {
            smVar.resumeWith(new uk0(th));
            throw th;
        }
    }

    public static final Object L(rj rjVar, Object obj, Object obj2, qu quVar, kj kjVar) {
        Object invoke;
        Object Y = mz.Y(rjVar, obj2);
        try {
            us0 us0Var = new us0(kjVar, rjVar);
            if (y6.C(quVar)) {
                px0.k(2, quVar);
                invoke = quVar.invoke(obj, us0Var);
            } else {
                invoke = M(quVar, obj, us0Var);
            }
            mz.S(rjVar, Y);
            if (invoke == ck.d) {
                kjVar.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            mz.S(rjVar, Y);
            throw th;
        }
    }

    public static Object M(qu quVar, Object obj, kj kjVar) {
        quVar.getClass();
        rj context = kjVar.getContext();
        Object qzVar = context == up.d ? new qz(kjVar) : new rz(kjVar, context);
        px0.k(2, quVar);
        return quVar.invoke(obj, qzVar);
    }

    public static final void a(String str, u50 u50Var, dw0 dw0Var, int i, boolean z, int i2, int i3, ih ihVar, int i4) {
        int i5;
        qh qhVar = (qh) ihVar;
        qhVar.W(-1186827822);
        if ((i4 & 6) == 0) {
            i5 = (qhVar.f(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= qhVar.f(u50Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= qhVar.f(dw0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= qhVar.h(null) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= qhVar.d(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= qhVar.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= qhVar.d(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= qhVar.d(i3) ? 8388608 : 4194304;
        }
        if (((i5 | 100663296) & 38347923) == 38347922 && qhVar.z()) {
            qhVar.Q();
        } else {
            if (i3 <= 0 || i2 <= 0) {
                throw new IllegalArgumentException(("both minLines " + i3 + " and maxLines " + i2 + " must be greater than zero").toString());
            }
            if (i3 > i2) {
                throw new IllegalArgumentException(y6.v("minLines ", i3, " must be less than or equal to maxLines ", i2).toString());
            }
            if (qhVar.j(lp0.a) != null) {
                g8.q();
                return;
            }
            qhVar.V(-1588686502);
            qhVar.q(false);
            qhVar.V(-1587866335);
            u50 c2 = a.b(u50Var, 0.0f, null, 131071).c(new TextStringSimpleElement(str, dw0Var, (ct) qhVar.j(hi.k), i, z, i2, i3));
            qhVar.q(false);
            k4 k4Var = k4.d;
            int A = px0.A(qhVar);
            u50 D = nk.D(qhVar, c2);
            gf0 l = qhVar.l();
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, k4Var);
            ld0.r(qhVar, dh.d, l);
            ld0.r(qhVar, dh.c, D);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            qhVar.q(true);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new k9(str, u50Var, dw0Var, i, z, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f2, float f3, float f4, float f5, me meVar) {
        int i;
        int i2;
        int i3;
        float b2;
        float a2;
        int i4;
        int i5;
        int i6;
        int i7;
        float b3;
        float a3;
        int i8;
        int i9;
        int i10;
        if (meVar.c()) {
            float f6 = f5 < 0.0f ? 0.0f : f5;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i11 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i12 = i11 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i13 = i12 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            long j = (i13 | ((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i14 = ge.h;
            return j;
        }
        if (((int) (meVar.b >> 32)) != 3) {
            fy.a("Color only works with ColorSpaces with 3 components");
        }
        int i15 = meVar.c;
        if (i15 == -1) {
            fy.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = meVar.b(0);
        float a4 = meVar.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    b2 = meVar.b(1);
                    a2 = meVar.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                b3 = meVar.b(2);
                                a3 = meVar.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i23 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            long j2 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i27 = ge.h;
                                            return j2;
                                        }
                                        i9 = i26;
                                        r7 = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (r7 << 10);
                                if (f5 >= 0.0f) {
                                }
                                long j22 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i272 = ge.h;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    b3 = meVar.b(2);
                    a3 = meVar.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i232 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (r7 << 10);
                    if (f5 >= 0.0f) {
                    }
                    long j222 = (i15 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2722 = ge.h;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s3 = (short) i3;
        b2 = meVar.b(1);
        a2 = meVar.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i202 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        b3 = meVar.b(2);
        a3 = meVar.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2322 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (r7 << 10);
        if (f5 >= 0.0f) {
        }
        long j2222 = (i15 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i27222 = ge.h;
        return j2222;
    }

    public static final long c(int i) {
        long j = i << 32;
        int i2 = ge.h;
        return j;
    }

    public static final long d(long j) {
        long j2 = j << 32;
        int i = ge.h;
        return j2;
    }

    public static long e(int i, int i2, int i3) {
        return c(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final ul f(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        pt a2 = qt.a(f2);
        if (a2 == null) {
            a2 = new b30(f2);
        }
        return new ul(f3, f2, a2);
    }

    public static final float g(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final s80 h(Context context) {
        context.getClass();
        s80 s80Var = new s80(context);
        q90 q90Var = s80Var.v;
        q90Var.a(new pg(q90Var));
        q90Var.a(new rg());
        q90Var.a(new lm());
        return s80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(nw0 nw0Var, tg tgVar, Throwable th, lj ljVar) {
        rr rrVar;
        int i;
        try {
            if (ljVar instanceof rr) {
                rrVar = (rr) ljVar;
                int i2 = rrVar.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rrVar.f = i2 - Integer.MIN_VALUE;
                    Object obj = rrVar.e;
                    i = rrVar.f;
                    ky0 ky0Var = ky0.a;
                    if (i != 0) {
                        rg0.u(obj);
                        rrVar.d = th;
                        rrVar.f = 1;
                        tgVar.b(nw0Var, th, rrVar);
                        ck ckVar = ck.d;
                        if (ky0Var == ckVar) {
                            return ckVar;
                        }
                    } else {
                        if (i != 1) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = rrVar.d;
                        rg0.u(obj);
                    }
                    return ky0Var;
                }
            }
            if (i != 0) {
            }
            return ky0Var;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                mz.r(th2, th);
            }
            throw th2;
        }
        rrVar = new rr(ljVar);
        Object obj2 = rrVar.e;
        i = rrVar.f;
        ky0 ky0Var2 = ky0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:10:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(ju0 ju0Var, h9 h9Var) {
        xt xtVar;
        int i;
        ck ckVar;
        int size;
        int i2;
        if (h9Var instanceof xt) {
            xtVar = (xt) h9Var;
            int i3 = xtVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xtVar.f = i3 - Integer.MIN_VALUE;
                Object obj = xtVar.e;
                i = xtVar.f;
                if (i != 0) {
                    rg0.u(obj);
                    List list = ju0Var.i.w.a;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (((wg0) list.get(i4)).d) {
                            xtVar.d = ju0Var;
                            xtVar.f = 1;
                            obj = ju0Var.b(sg0.f, xtVar);
                            ckVar = ck.d;
                            if (obj == ckVar) {
                            }
                            List list2 = ((qg0) obj).a;
                            size = list2.size();
                            i2 = 0;
                            while (i2 < size) {
                            }
                            return ky0.a;
                        }
                    }
                    return ky0.a;
                }
                if (i != 1) {
                    g8.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ju0Var = xtVar.d;
                rg0.u(obj);
                List list22 = ((qg0) obj).a;
                size = list22.size();
                i2 = 0;
                while (i2 < size) {
                    if (((wg0) list22.get(i2)).d) {
                        xtVar.d = ju0Var;
                        xtVar.f = 1;
                        obj = ju0Var.b(sg0.f, xtVar);
                        ckVar = ck.d;
                        if (obj == ckVar) {
                            return ckVar;
                        }
                        List list222 = ((qg0) obj).a;
                        size = list222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    } else {
                        i2++;
                    }
                }
                return ky0.a;
            }
        }
        xtVar = new xt(h9Var);
        Object obj2 = xtVar.e;
        i = xtVar.f;
        if (i != 0) {
        }
    }

    public static final Object k(ah0 ah0Var, qu quVar, fu0 fu0Var) {
        ck ckVar;
        ky0 ky0Var;
        yt ytVar = new yt(fu0Var.getContext(), quVar, null);
        ku0 ku0Var = (ku0) ah0Var;
        ku0Var.getClass();
        hc hcVar = new hc(1, B(fu0Var));
        hcVar.q();
        ju0 ju0Var = new ju0(ku0Var, hcVar);
        synchronized (ku0Var.y) {
            ku0Var.x.b(ju0Var);
            kj B = B(p(ju0Var, ju0Var, ytVar));
            ckVar = ck.d;
            om0 om0Var = new om0(B);
            ky0Var = ky0.a;
            om0Var.resumeWith(ky0Var);
        }
        hcVar.s(new f2(26, ju0Var));
        Object p = hcVar.p();
        return p == ckVar ? p : ky0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [bh, ni0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [h2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List l(mr0 mr0Var, Integer num, int i, Integer num2) {
        int i2;
        x60 x60Var;
        if (mr0Var.w || mr0Var.o() == 0) {
            return wp.d;
        }
        ?? ni0Var = new ni0(mr0Var);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = mr0Var.v;
            if (i2 < 0) {
                i2 = mr0Var.C(mr0Var.b, i);
            }
        }
        if (num == 0) {
            int L = mr0Var.i - mr0Var.L(mr0Var.b, mr0Var.q(i));
            p60 p60Var = mr0Var.s;
            num = Integer.valueOf(L + ((p60Var == null || (x60Var = (x60) p60Var.b(i)) == null) ? 0 : x60Var.b));
        }
        while (i >= 0) {
            ni0Var.d(mr0Var.M(i), num);
            num = mr0Var.b(i);
            if (i2 >= 0) {
                int i3 = i2;
                i2 = mr0Var.C(mr0Var.b, i2);
                i = i3;
            } else {
                i = i2;
            }
        }
        return (ArrayList) ni0Var.a;
    }

    public static final int m(long j, long j2) {
        boolean D = D(j);
        if (D != D(j2)) {
            return D ? -1 : 1;
        }
        return (Math.min(t(j), t(j2)) >= 0.0f && C(j) != C(j2)) ? C(j) ? -1 : 1 : (int) Math.signum(t(j) - t(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long n(long j, long j2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long a2 = ge.a(j, ge.f(j2));
        float d2 = ge.d(j2);
        float d3 = ge.d(a2);
        float f2 = 1.0f - d3;
        float f3 = (d2 * f2) + d3;
        float h = f3 == 0.0f ? 0.0f : (((ge.h(j2) * d2) * f2) + (ge.h(a2) * d3)) / f3;
        float g2 = f3 == 0.0f ? 0.0f : (((ge.g(j2) * d2) * f2) + (ge.g(a2) * d3)) / f3;
        float e2 = f3 == 0.0f ? 0.0f : (((ge.e(j2) * d2) * f2) + (ge.e(a2) * d3)) / f3;
        if (ge.f(j2).c()) {
            return (((int) ((e2 * 255.0f) + 0.5f)) | (((((int) ((f3 * 255.0f) + 0.5f)) << 24) | (((int) ((h * 255.0f) + 0.5f)) << 16)) | (((int) ((g2 * 255.0f) + 0.5f)) << 8))) << 32;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(h);
        int i10 = floatToRawIntBits >>> 31;
        int i11 = (floatToRawIntBits >>> 23) & 255;
        int i12 = floatToRawIntBits & 8388607;
        int i13 = 49;
        int i14 = 0;
        if (i11 == 255) {
            i2 = i12 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i11 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i15 = i12 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i15) + 1) | (i10 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(g2);
                    int i16 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i17 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i17 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i18 = i17 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i18) + 1) | (i16 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(e2);
                                int i19 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i20 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i13 = 31;
                                    i14 = i20 == 0 ? 0 : 512;
                                } else {
                                    int i21 = i8 - 112;
                                    if (i21 < 31) {
                                        if (i21 > 0) {
                                            i14 = i20 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i21 << 10) | i14) + 1) | (i19 << 15);
                                                return ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.c & 63);
                                            }
                                            i13 = i21;
                                        } else if (i21 >= -10) {
                                            int i22 = (i20 | 8388608) >> (1 - i21);
                                            if ((i22 & 4096) != 0) {
                                                i22 += 8192;
                                            }
                                            i13 = 0;
                                            i14 = i22 >> 13;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                }
                                i9 = (i19 << 15) | (i13 << 10) | i14;
                                return ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.c & 63);
                            }
                            i6 = i18;
                        } else if (i5 >= -10) {
                            int i23 = (i17 | 8388608) >> (1 - i5);
                            if ((i23 & 4096) != 0) {
                                i23 += 8192;
                            }
                            i6 = i23 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i16 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(e2);
                    int i192 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i202 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i192 << 15) | (i13 << 10) | i14;
                    return ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.c & 63);
                }
                i2 = i15;
            } else if (i >= -10) {
                int i24 = (i12 | 8388608) >> (1 - i);
                if ((i24 & 4096) != 0) {
                    i24 += 8192;
                }
                i2 = i24 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i10 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(g2);
        int i162 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i172 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i162 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(e2);
        int i1922 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2022 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i1922 << 15) | (i13 << 10) | i14;
        return ((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.c & 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kj p(kj kjVar, kj kjVar2, qu quVar) {
        quVar.getClass();
        if (quVar instanceof h9) {
            return ((h9) quVar).create(kjVar, kjVar2);
        }
        rj context = kjVar2.getContext();
        return context == up.d ? new oz(kjVar2, kjVar, quVar) : new pz(kjVar2, context, quVar, kjVar);
    }

    public static final long q(long j, boolean z, int i, float f2) {
        int h = ((z || i == 2) && ui.d(j)) ? ui.h(j) : Integer.MAX_VALUE;
        if (ui.j(j) != h) {
            h = rg0.g(yc0.b(f2), ui.j(j), h);
        }
        return px0.y(0, h, 0, ui.g(j));
    }

    public static final Integer r(ir0 ir0Var, vh vhVar, int i, int i2) {
        Integer r;
        int[] iArr = ir0Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (ir0Var.j(i) && ir0Var.i(i) == 206 && nz.l(ir0Var.p(iArr, i), th.e)) {
                Object h = ir0Var.h(i, 0);
                mh mhVar = h instanceof mh ? (mh) h : null;
                if (mhVar != null && mhVar.d == vhVar) {
                    return Integer.valueOf(i);
                }
            }
            if (ir0Var.d(i) && (r = r(ir0Var, vhVar, i + 1, i3)) != null) {
                return Integer.valueOf(r.intValue());
            }
            i = i3;
        }
    }

    public static final float t(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float u(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        fv0 fv0Var = tv0.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : qx.a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float v(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        fv0 fv0Var = tv0.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? qx.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static Set w() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static String x(Class cls) {
        LinkedHashMap linkedHashMap = q90.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            o90 o90Var = (o90) cls.getAnnotation(o90.class);
            str = o90Var != null ? o90Var.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static final h40 y(h40 h40Var) {
        p10 p10Var = h40Var.r.r;
        while (true) {
            p10 n = p10Var.n();
            p10 p10Var2 = null;
            if ((n != null ? n.j : null) == null) {
                h40 t0 = ((ea0) p10Var.F.h).t0();
                t0.getClass();
                return t0;
            }
            p10 n2 = p10Var.n();
            if (n2 != null) {
                p10Var2 = n2.j;
            }
            p10Var2.getClass();
            p10 n3 = p10Var.n();
            n3.getClass();
            p10Var = n3.j;
            p10Var.getClass();
        }
    }

    public static final int z(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public abstract boolean o(ji0 ji0Var);

    public abstract Object s(ji0 ji0Var);
}

package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Path;
import android.graphics.RectF;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y6 {
    public static /* synthetic */ void A(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            r0.l((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static /* synthetic */ void B(Object obj) {
        if (obj == null) {
            return;
        }
        g8.q();
    }

    public static /* synthetic */ boolean C(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ int D(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static u50 E() {
        return new LayoutWeightElement(1.0f);
    }

    public static boolean a(x6 x6Var, long j) {
        return j >= x6Var.c();
    }

    public static kv0 b(kv0 kv0Var, kv0 kv0Var2) {
        boolean z = kv0Var2 instanceof ab;
        if (!z || !(kv0Var instanceof ab)) {
            return (!z || (kv0Var instanceof ab)) ? (z || !(kv0Var instanceof ab)) ? kv0Var2.d(new ab0(9, kv0Var)) : kv0Var : kv0Var2;
        }
        ab abVar = (ab) kv0Var2;
        nq0 nq0Var = abVar.a;
        float f = abVar.b;
        if (Float.isNaN(f)) {
            f = ((ab) kv0Var).b;
        }
        return new ab(nq0Var, f);
    }

    public static int c(float f, sl slVar) {
        float o = slVar.o(f);
        if (Float.isInfinite(o)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(o);
    }

    public static u50 d(u50 u50Var, u50 u50Var2) {
        return u50Var2 == r50.a ? u50Var : new bf(u50Var, u50Var2);
    }

    public static float e(long j, sl slVar) {
        float c;
        float h;
        if (!gw0.a(fw0.b(j), 4294967296L)) {
            ey.b("Only Sp can convert to Px");
        }
        float[] fArr = qt.a;
        if (slVar.h() >= 1.03f) {
            pt a = qt.a(slVar.h());
            c = fw0.c(j);
            if (a != null) {
                return a.b(c);
            }
            h = slVar.h();
        } else {
            c = fw0.c(j);
            h = slVar.h();
        }
        return h * c;
    }

    public static float f(long j, sl slVar) {
        if (!gw0.a(fw0.b(j), 4294967296L)) {
            ey.b("Only Sp can convert to Px");
        }
        return slVar.o(slVar.t(j));
    }

    public static long g(long j, sl slVar) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float o = slVar.o(Float.intBitsToFloat((int) (j >> 32)));
        float o2 = slVar.o(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (Float.floatToRawIntBits(o) << 32) | (Float.floatToRawIntBits(o2) & 4294967295L);
    }

    public static long h(float f, sl slVar) {
        float[] fArr = qt.a;
        if (slVar.h() < 1.03f) {
            return ze0.p(4294967296L, f / slVar.h());
        }
        pt a = qt.a(slVar.h());
        return ze0.p(4294967296L, a != null ? a.a(f) : f / slVar.h());
    }

    public static long i(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static void j(e5 e5Var, zl0 zl0Var) {
        if (e5Var.b == null) {
            e5Var.b = new RectF();
        }
        RectF rectF = e5Var.b;
        rectF.getClass();
        float f = zl0Var.a;
        long j = zl0Var.h;
        long j2 = zl0Var.g;
        long j3 = zl0Var.f;
        long j4 = zl0Var.e;
        rectF.set(f, zl0Var.b, zl0Var.c, zl0Var.d);
        if (e5Var.c == null) {
            e5Var.c = new float[8];
        }
        float[] fArr = e5Var.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = e5Var.a;
        RectF rectF2 = e5Var.b;
        rectF2.getClass();
        float[] fArr2 = e5Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public static /* synthetic */ int l(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ void m(oo ooVar, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = ooVar.D();
        }
        ooVar.k(f, j, j2);
    }

    public static void n(oo ooVar, x4 x4Var, long j, long j2, float f, q9 q9Var, int i, int i2) {
        ooVar.x(x4Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, q9Var, (i2 & 512) != 0 ? 1 : i);
    }

    public static /* synthetic */ void o(oo ooVar, e5 e5Var, px0 px0Var, float f, ut0 ut0Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        nz nzVar = ut0Var;
        if ((i & 8) != 0) {
            nzVar = ar.o;
        }
        ooVar.F(e5Var, px0Var, f2, nzVar, (i & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void p(r10 r10Var, px0 px0Var, long j, long j2, float f, nz nzVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = i(r10Var.c(), j3);
        }
        r10Var.f(px0Var, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? ar.o : nzVar);
    }

    public static /* synthetic */ void q(oo ooVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = i(ooVar.c(), 0L);
        }
        ooVar.p(j, 0L, j2, ar.o, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void r(oo ooVar, px0 px0Var, long j, long j2, long j3, nz nzVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        ooVar.J(px0Var, j4, (i & 4) != 0 ? i(ooVar.c(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? ar.o : nzVar);
    }

    public static /* synthetic */ void s(oo ooVar, long j, long j2, long j3, long j4, ut0 ut0Var, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        ooVar.U(j, j5, (i & 4) != 0 ? i(ooVar.c(), j5) : j3, j4, (i & 16) != 0 ? ar.o : ut0Var);
    }

    public static int t(float f, int i, int i2) {
        return (Float.floatToIntBits(f) + i) * i2;
    }

    public static kf u(String str) {
        cy.c(str);
        return new kf();
    }

    public static String v(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String w(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static void x(int i, int i2, int i3, int i4, int i5) {
        x40.f(i);
        x40.f(i2);
        x40.f(i3);
        x40.f(i4);
        x40.f(i5);
    }

    public static void y(int i, qh qhVar, int i2, h6 h6Var) {
        qhVar.e0(Integer.valueOf(i));
        qhVar.b(h6Var, Integer.valueOf(i2));
    }

    public static void z(long j, StringBuilder sb, String str) {
        sb.append((Object) ge.j(j));
        sb.append(str);
    }
}

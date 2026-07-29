package o;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class KJ {
    public static final float a;
    public static final C0723af b;

    static {
        float f = 10;
        float f2 = 0;
        if ((f2 < 0.0f && !AbstractC0556Vi.a(f2, Float.NaN)) || ((f < 0.0f && !AbstractC0556Vi.a(f, Float.NaN)) || ((f2 < 0.0f && !AbstractC0556Vi.a(f2, Float.NaN)) || (f < 0.0f && !AbstractC0556Vi.a(f, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        a = LJ.b - (LJ.a * 2);
        new C0723af(0.2f, 0.8f);
        new C0723af(0.4f, 1.0f);
        new C0723af(0.0f, 0.65f);
        new C0723af(0.1f, 0.45f);
        b = new C0723af(0.4f, 0.2f);
    }

    public static final void a(UC uc, long j, float f, long j2, int i, InterfaceC1377kd interfaceC1377kd, int i2) {
        long j3;
        float f2;
        UC uc2;
        int i3;
        long j4;
        int i4;
        UC uc3;
        long j5;
        float f3;
        WL s;
        Float valueOf = Float.valueOf(290.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(-115871647);
        if (((i2 | 25990) & 9363) == 9362 && c1575nd.t()) {
            c1575nd.F();
            uc3 = uc;
            f3 = f;
            j5 = j2;
            i4 = i;
        } else {
            c1575nd.G(-127, null, 0, null);
            if ((i2 & 1) == 0 || !c1575nd.t() || c1575nd.v || !((s = c1575nd.s()) == null || (s.a & 4) == 0)) {
                float f4 = HJ.a;
                j3 = C1114gc.e;
                int i5 = HJ.b;
                f2 = f4;
                uc2 = RC.a;
                i3 = i5;
            } else {
                c1575nd.F();
                uc2 = uc;
                f2 = f;
                j3 = j2;
                i3 = i;
            }
            c1575nd.n(false);
            WL s2 = c1575nd.s();
            if (s2 != null) {
                int i6 = s2.a;
                if ((i6 & 1) != 0) {
                    s2.a = i6 | 2;
                }
            }
            C0843cU c0843cU = new C0843cU(((InterfaceC1119gh) c1575nd.h(AbstractC2300yd.f)).i(f2), i3);
            Object C = c1575nd.C();
            C1623oL c1623oL = C1311jd.a;
            if (C == c1623oL) {
                C = new C0177Gs();
                c1575nd.P(C);
            }
            C0177Gs c0177Gs = (C0177Gs) C;
            c0177Gs.a(c1575nd, 0);
            int i7 = i3;
            C0208Hx c0208Hx = VY.b;
            C1574nc c1574nc = AbstractC0012Aj.a;
            float f5 = f2;
            C0099Ds h = AbstractC1807r8.h(c0177Gs, 0, 5, c0208Hx, AbstractC1473m3.K(new HW(6660, c1574nc)), c1575nd, 33208, 16);
            C0099Ds g = AbstractC1807r8.g(c0177Gs, 286.0f, AbstractC1473m3.K(new HW(1332, c1574nc)), c1575nd);
            C1143h2 c1143h2 = new C1143h2();
            c1143h2.h = 1332;
            C0441Qx c = c1143h2.c(valueOf2, 0);
            C0723af c0723af = b;
            c.b = c0723af;
            c1143h2.c(valueOf, 666);
            C0099Ds g2 = AbstractC1807r8.g(c0177Gs, 290.0f, AbstractC1473m3.K(new C1590ns(7, c1143h2)), c1575nd);
            C1143h2 c1143h22 = new C1143h2();
            c1143h22.h = 1332;
            c1143h22.c(valueOf2, 666).b = c0723af;
            c1143h22.c(valueOf, c1143h22.h);
            C0099Ds g3 = AbstractC1807r8.g(c0177Gs, 290.0f, AbstractC1473m3.K(new C1590ns(7, c1143h22)), c1575nd);
            WI wi = WI.j;
            AtomicInteger atomicInteger = AbstractC2089vQ.a;
            UC a2 = androidx.compose.foundation.layout.a.a(uc2.c(new AppendedSemanticsElement(wi)), a);
            boolean c2 = c1575nd.c(j3) | c1575nd.e(c0843cU) | c1575nd.d(h) | c1575nd.d(g2) | c1575nd.d(g3) | c1575nd.d(g);
            Object C2 = c1575nd.C();
            if (c2 || C2 == c1623oL) {
                j4 = j3;
                IJ ij = new IJ(j4, c0843cU, h, g2, g3, g, f5, j);
                c1575nd.P(ij);
                C2 = ij;
            } else {
                j4 = j3;
            }
            AbstractC1052fg.b(a2, (InterfaceC2114vp) C2, c1575nd, 0);
            i4 = i7;
            uc3 = uc2;
            j5 = j4;
            f3 = f5;
        }
        WL o2 = c1575nd.o();
        if (o2 != null) {
            o2.d = new JJ(uc3, j, f3, j5, i4, i2);
        }
    }

    public static final void b(InterfaceC1121gj interfaceC1121gj, float f, float f2, long j, C0843cU c0843cU) {
        float f3 = 2;
        float f4 = c0843cU.i / f3;
        float b2 = ZR.b(interfaceC1121gj.m()) - (f3 * f4);
        interfaceC1121gj.v(j, f, f2, PX.h(f4, f4), AbstractC1035fP.a(b2, b2), c0843cU);
    }
}

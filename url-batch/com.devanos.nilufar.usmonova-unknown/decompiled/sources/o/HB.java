package o;

/* loaded from: classes.dex */
public abstract class HB {
    static {
        new C2058uz(C2234xd.u);
    }

    public static final void a(C1376kc c1376kc, C0906dR c0906dR, QX qx, C0721ad c0721ad, InterfaceC1377kd interfaceC1377kd, int i) {
        C0906dR c0906dR2;
        QX qx2;
        Object co;
        C0721ad c0721ad2;
        C0906dR c0906dR3;
        QX qx3;
        boolean z;
        WL s;
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(-2127166334);
        if (((i | (c1575nd.d(c1376kc) ? 4 : 2) | 144) & 1171) == 1170 && c1575nd.t()) {
            c1575nd.F();
            c0906dR3 = c0906dR;
            qx3 = qx;
            c0721ad2 = c0721ad;
        } else {
            c1575nd.G(-127, null, 0, null);
            if ((i & 1) == 0 || !c1575nd.t() || c1575nd.v || !((s = c1575nd.s()) == null || (s.a & 4) == 0)) {
                c0906dR2 = (C0906dR) c1575nd.h(AbstractC0971eR.a);
                qx2 = (QX) c1575nd.h(RX.a);
            } else {
                c1575nd.F();
                c0906dR2 = c0906dR;
                qx2 = qx;
            }
            c1575nd.n(false);
            WL s2 = c1575nd.s();
            if (s2 != null) {
                int i2 = s2.a;
                if ((i2 & 1) != 0) {
                    s2.a = 2 | i2;
                }
            }
            IT it = AO.a;
            long j = C1114gc.f;
            c1575nd.I(-1280632857);
            boolean booleanValue = ((Boolean) c1575nd.h(AO.a)).booleanValue();
            C1623oL c1623oL = C1311jd.a;
            boolean z2 = true;
            if (booleanValue) {
                int i3 = BO.a;
                C1114gc c1114gc = new C1114gc(j);
                Object C = c1575nd.C();
                if (C == c1623oL) {
                    C = AbstractC2219xO.r(c1114gc);
                    c1575nd.P(C);
                }
                TD td = (TD) C;
                td.setValue(c1114gc);
                Object v = c1575nd.v();
                if ((v instanceof Boolean) && true == ((Boolean) v).booleanValue()) {
                    z = false;
                } else {
                    c1575nd.Q(Boolean.TRUE);
                    z = true;
                }
                Object v2 = c1575nd.v();
                if ((v2 instanceof Float) && Float.NaN == ((Number) v2).floatValue()) {
                    z2 = false;
                } else {
                    c1575nd.Q(Float.valueOf(Float.NaN));
                }
                boolean z3 = z | z2;
                Object C2 = c1575nd.C();
                if (z3 || C2 == c1623oL) {
                    C2 = new C1817rI(td);
                    c1575nd.P(C2);
                }
                co = (C1817rI) C2;
            } else {
                co = (AbstractC0556Vi.a(Float.NaN, Float.NaN) && C1114gc.b(j, j)) ? AO.b : new CO(j, true);
            }
            c1575nd.n(false);
            long j2 = c1376kc.a;
            boolean c = c1575nd.c(j2);
            Object C3 = c1575nd.C();
            if (c || C3 == c1623oL) {
                C3 = new C1567nV(j2, C1114gc.a(j2, 0.4f));
                c1575nd.P(C3);
            }
            c0721ad2 = c0721ad;
            AbstractC1473m3.b(new C1491mL[]{AbstractC1442lc.a.a(c1376kc), AbstractC0047Bs.a.a(co), DO.a.a(C0460Rq.v), AbstractC0971eR.a.a(c0906dR2), AbstractC1633oV.a.a((C1567nV) C3), RX.a.a(qx2)}, AbstractC0946e20.F(-1066563262, new C1671p3(qx2, 3, c0721ad2), c1575nd), c1575nd, 56);
            c0906dR3 = c0906dR2;
            qx3 = qx2;
        }
        WL o2 = c1575nd.o();
        if (o2 != null) {
            o2.d = new GB(c1376kc, c0906dR3, qx3, c0721ad2, i);
        }
    }
}

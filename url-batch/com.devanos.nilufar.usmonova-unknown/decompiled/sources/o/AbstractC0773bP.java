package o;

import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: o.bP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0773bP {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = CH.i;
        CH r = C0218Ih.r("/", false);
        C1619oH[] c1619oHArr = {new C1619oH(r, new C0750b20(r))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(EB.E(1));
        EB.N(linkedHashMap, c1619oHArr);
        for (C0750b20 c0750b20 : AbstractC0720ac.G0(arrayList, new C0685a3(14))) {
            if (((C0750b20) linkedHashMap.put(c0750b20.a, c0750b20)) == null) {
                while (true) {
                    CH ch = c0750b20.a;
                    CH c = ch.c();
                    if (c != null) {
                        C0750b20 c0750b202 = (C0750b20) linkedHashMap.get(c);
                        if (c0750b202 != null) {
                            c0750b202.h.add(ch);
                            break;
                        }
                        C0750b20 c0750b203 = new C0750b20(c);
                        linkedHashMap.put(c, c0750b203);
                        c0750b203.h.add(ch);
                        c0750b20 = c0750b203;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final float b(InterfaceC0189He interfaceC0189He) {
        float f;
        C1023fD c1023fD = (C1023fD) interfaceC0189He.k(C0460Rq.O);
        if (c1023fD != null) {
            C2146wH c2146wH = c1023fD.h;
            f = ((C2091vS) AbstractC2025uS.r(c2146wH.i, c2146wH)).c;
        } else {
            f = 1.0f;
        }
        if (f >= 0.0f) {
            return f;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static final String c(int i) {
        AbstractC0868ct.k(16);
        String num = Integer.toString(i, 16);
        AbstractC0048Bt.m(num, "toString(...)");
        return "0x".concat(num);
    }

    public static final C0750b20 d(JL jl) {
        Long valueOf;
        int j = jl.j();
        if (j != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(j));
        }
        jl.skip(4L);
        short m = jl.m();
        int i = m & 65535;
        if ((m & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        int m2 = jl.m() & 65535;
        short m3 = jl.m();
        int i2 = m3 & 65535;
        short m4 = jl.m();
        int i3 = m4 & 65535;
        if (i2 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i3 >> 9) & 127) + 1980, ((i3 >> 5) & 15) - 1, m4 & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (m3 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l = valueOf;
        jl.j();
        C1294jM c1294jM = new C1294jM();
        c1294jM.h = jl.j() & 4294967295L;
        C1294jM c1294jM2 = new C1294jM();
        c1294jM2.h = jl.j() & 4294967295L;
        int m5 = jl.m() & 65535;
        int m6 = jl.m() & 65535;
        int m7 = jl.m() & 65535;
        jl.skip(8L);
        C1294jM c1294jM3 = new C1294jM();
        c1294jM3.h = jl.j() & 4294967295L;
        String q = jl.q(m5);
        if (UT.D(q, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j2 = c1294jM2.h == 4294967295L ? 8 : 0L;
        if (c1294jM.h == 4294967295L) {
            j2 += 8;
        }
        if (c1294jM3.h == 4294967295L) {
            j2 += 8;
        }
        C1098gM c1098gM = new C1098gM();
        e(jl, m6, new C0881d20(c1098gM, j2, c1294jM2, jl, c1294jM, c1294jM3));
        if (j2 > 0 && !c1098gM.h) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String q2 = jl.q(m7);
        String str = CH.i;
        return new C0750b20(C0218Ih.r("/", false).e(q), AbstractC0778bU.v(q, "/", false), q2, c1294jM.h, c1294jM2.h, m2, l, c1294jM3.h);
    }

    public static final void e(JL jl, int i, InterfaceC2312yp interfaceC2312yp) {
        G8 g8 = jl.i;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int m = jl.m() & 65535;
            long m2 = jl.m() & 65535;
            long j2 = j - 4;
            if (j2 < m2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            jl.y(m2);
            long j3 = g8.i;
            interfaceC2312yp.invoke(Integer.valueOf(m), Long.valueOf(m2));
            long j4 = (g8.i + m2) - j3;
            if (j4 < 0) {
                throw new IOException(AbstractC2188wx.g(m, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                g8.skip(j4);
            }
            j = j2 - m2;
        }
    }

    public static final C0507Tl f(JL jl, C0507Tl c0507Tl) {
        C1360kM c1360kM = new C1360kM();
        c1360kM.h = c0507Tl != null ? c0507Tl.e : null;
        C1360kM c1360kM2 = new C1360kM();
        C1360kM c1360kM3 = new C1360kM();
        int j = jl.j();
        if (j != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(j));
        }
        jl.skip(2L);
        short m = jl.m();
        int i = m & 65535;
        if ((m & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i));
        }
        jl.skip(18L);
        int m2 = jl.m() & 65535;
        jl.skip(jl.m() & 65535);
        if (c0507Tl == null) {
            jl.skip(m2);
            return null;
        }
        e(jl, m2, new GB(jl, c1360kM, c1360kM2, c1360kM3));
        return new C0507Tl(c0507Tl.a, c0507Tl.b, c0507Tl.c, (Long) c1360kM3.h, (Long) c1360kM.h, (Long) c1360kM2.h);
    }

    public static final void g(HO ho, DE de, InterfaceC0961eH interfaceC0961eH, C0827cE c0827cE) {
        AbstractC0048Bt.n(ho, "<this>");
        AbstractC0048Bt.n(de, Constants.MessagePayloadKeys.FROM);
        AbstractC0048Bt.n(interfaceC0961eH, "scopeOwner");
        AbstractC0048Bt.n(c0827cE, "name");
        ((AbstractC1027fH) interfaceC0961eH).l.b();
        AbstractC0048Bt.m(c0827cE.b(), "name.asString()");
    }

    public static final Object h(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        if (!z) {
            if (r4 != null) {
                set = AbstractC0720ac.M0(WQ.o(set, r4));
            }
            return AbstractC0720ac.E0(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (AbstractC0048Bt.h(r1, r2) && AbstractC0048Bt.h(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }

    public static Set i(Object obj) {
        Set singleton = Collections.singleton(obj);
        AbstractC0048Bt.m(singleton, "singleton(...)");
        return singleton;
    }

    public static final Object j(PV pv, InterfaceC2312yp interfaceC2312yp) {
        Object c0031Bc;
        Object O;
        PX.b0(pv, true, new C0374Oi(0, PX.L(pv.k.getContext()).m(pv.l, pv, pv.j)));
        try {
            if (interfaceC2312yp instanceof Y7) {
                AbstractC1305jX.i(2, interfaceC2312yp);
                c0031Bc = interfaceC2312yp.invoke(pv, pv);
            } else {
                c0031Bc = AbstractC1473m3.e0(interfaceC2312yp, pv, pv);
            }
        } catch (Throwable th) {
            c0031Bc = new C0031Bc(th, false);
        }
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (c0031Bc == enumC0448Re || (O = pv.O(c0031Bc)) == EB.i) {
            return enumC0448Re;
        }
        if (O instanceof C0031Bc) {
            Throwable th2 = ((C0031Bc) O).a;
            if (!(th2 instanceof OV)) {
                throw th2;
            }
            if (((OV) th2).h != pv) {
                throw th2;
            }
            if (c0031Bc instanceof C0031Bc) {
                throw ((C0031Bc) c0031Bc).a;
            }
        } else {
            c0031Bc = EB.Y(O);
        }
        return c0031Bc;
    }

    public static final Object k(C1102gQ c1102gQ, C1102gQ c1102gQ2, InterfaceC2312yp interfaceC2312yp) {
        Object c0031Bc;
        Object O;
        try {
            AbstractC1305jX.i(2, interfaceC2312yp);
            c0031Bc = interfaceC2312yp.invoke(c1102gQ2, c1102gQ);
        } catch (Throwable th) {
            c0031Bc = new C0031Bc(th, false);
        }
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (c0031Bc == enumC0448Re || (O = c1102gQ.O(c0031Bc)) == EB.i) {
            return enumC0448Re;
        }
        if (O instanceof C0031Bc) {
            throw ((C0031Bc) O).a;
        }
        return EB.Y(O);
    }

    public static final void l(String str) {
        AbstractC0048Bt.n(str, "message");
        throw new IllegalArgumentException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(long j, InterfaceC2312yp interfaceC2312yp, AbstractC2367ze abstractC2367ze) {
        QV qv;
        int i;
        C1360kM c1360kM;
        if (abstractC2367ze instanceof QV) {
            qv = (QV) abstractC2367ze;
            int i2 = qv.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qv.j = i2 - Integer.MIN_VALUE;
                Object obj = qv.i;
                i = qv.j;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    if (j <= 0) {
                        return null;
                    }
                    C1360kM c1360kM2 = new C1360kM();
                    try {
                        qv.h = c1360kM2;
                        qv.j = 1;
                        PV pv = new PV(j, qv);
                        c1360kM2.h = pv;
                        Object j2 = j(pv, interfaceC2312yp);
                        EnumC0448Re enumC0448Re = EnumC0448Re.h;
                        return j2 == enumC0448Re ? enumC0448Re : j2;
                    } catch (OV e) {
                        e = e;
                        c1360kM = c1360kM2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1360kM = qv.h;
                    try {
                        AbstractC1494mO.l(obj);
                        return obj;
                    } catch (OV e2) {
                        e = e2;
                    }
                }
                if (e.h != c1360kM.h) {
                    return null;
                }
                throw e;
            }
        }
        qv = new QV(abstractC2367ze);
        Object obj2 = qv.i;
        i = qv.j;
        if (i != 0) {
        }
        if (e.h != c1360kM.h) {
        }
    }
}

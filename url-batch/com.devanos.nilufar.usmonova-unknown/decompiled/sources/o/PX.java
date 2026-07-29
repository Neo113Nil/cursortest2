package o;

import android.graphics.Matrix;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class PX {
    public static final C0457Rn h;
    public static final C0457Rn l;
    public static final C0245Ji i = new C0245Ji();
    public static final C1185hh j = new C1185hh(1.0f, 1.0f);
    public static final C0218Ih k = new C0218Ih(21);
    public static final C1903sc m = new C1903sc(6);
    public static final C1903sc n = new C1903sc(7);

    /* renamed from: o, reason: collision with root package name */
    public static final C1903sc f83o = new C1903sc(8);

    static {
        int i2 = 5;
        h = new C0457Rn("CLOSED", i2);
        l = new C0457Rn("NO_THREAD_ELEMENTS", i2);
    }

    public static C0459Rp A(C0252Jp c0252Jp, boolean z) {
        String lowerCase;
        AbstractC0048Bt.n(c0252Jp, "functionClass");
        List list = c0252Jp.r;
        C0459Rp c0459Rp = new C0459Rp(c0252Jp, null, 1, z);
        C0261Jy z0 = c0252Jp.z0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC1437lX) obj).Y() != 2) {
                break;
            }
            arrayList.add(obj);
        }
        S6 N0 = AbstractC0720ac.N0(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(N0));
        Iterator it = N0.iterator();
        while (true) {
            C1779qj c1779qj = (C1779qj) it;
            if (!c1779qj.i.hasNext()) {
                JR i2 = ((InterfaceC1437lX) AbstractC0720ac.v0(list)).i();
                C0244Jh c0244Jh = AbstractC0270Kh.e;
                C1318jk c1318jk = C1318jk.h;
                c0459Rp.M0(null, z0, c1318jk, c1318jk, arrayList2, i2, 4, c0244Jh);
                C0459Rp c0459Rp2 = c0459Rp;
                c0459Rp2.D = true;
                return c0459Rp2;
            }
            C0021As c0021As = (C0021As) c1779qj.next();
            int i3 = c0021As.a;
            InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) c0021As.b;
            String b = interfaceC1437lX.getName().b();
            AbstractC0048Bt.m(b, "typeParameter.name.asString()");
            if (b.equals("T")) {
                lowerCase = "instance";
            } else if (b.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = b.toLowerCase(Locale.ROOT);
                AbstractC0048Bt.m(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            C0459Rp c0459Rp3 = c0459Rp;
            C1672p4 c1672p4 = C0460Rq.t;
            C0827cE e = C0827cE.e(lowerCase);
            JR i4 = interfaceC1437lX.i();
            AbstractC0048Bt.m(i4, "typeParameter.defaultType");
            arrayList2.add(new RY(c0459Rp3, null, i3, c1672p4, e, i4, false, false, false, null, IS.e));
            c0459Rp = c0459Rp3;
        }
    }

    public static JR A0(C0632Yg c0632Yg) {
        if (c0632Yg instanceof C0632Yg) {
            return c0632Yg.i;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c0632Yg);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, c0632Yg.getClass(), sb).toString());
    }

    public static AbstractC2097vY B(InterfaceC2298yb interfaceC2298yb, MR mr, MR mr2) {
        AbstractC0048Bt.n(mr, "lowerBound");
        AbstractC0048Bt.n(mr2, "upperBound");
        if (!(mr instanceof JR)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC2298yb);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC2298yb.getClass(), sb).toString());
        }
        if (mr2 instanceof JR) {
            return HO.m((JR) mr, (JR) mr2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC2298yb);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC2298yb.getClass(), sb2).toString());
    }

    public static int B0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            return ((SW) tw).getParameters().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static final C2080vH C(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Q((C1990tx) it.next()));
            }
            return new C2080vH(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Q((C1990tx) it2.next()));
            }
            return new C2080vH(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        C2080vH C = C(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(subList));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Q((C1990tx) it3.next()));
        }
        return new C2080vH(cls, C, arrayList3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1611o9 C0(C1852rr c1852rr) {
        int i2;
        int i3;
        String str;
        int length;
        C1852rr c1852rr2 = c1852rr;
        int size = c1852rr2.size();
        int i4 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = -1;
        int i6 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = -1;
        int i8 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i4 < size) {
            String k2 = c1852rr2.k(i4);
            String m2 = c1852rr2.m(i4);
            if (AbstractC0778bU.w(k2, "Cache-Control")) {
                if (str2 == null) {
                    str2 = m2;
                    i2 = 0;
                    while (i2 < m2.length()) {
                        int length2 = m2.length();
                        int i9 = i2;
                        while (true) {
                            if (i9 >= length2) {
                                i3 = size;
                                i9 = m2.length();
                                break;
                            }
                            i3 = size;
                            if (UT.D("=,;", m2.charAt(i9))) {
                                break;
                            }
                            i9++;
                            size = i3;
                        }
                        String substring = m2.substring(i2, i9);
                        AbstractC0048Bt.m(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String obj = UT.T(substring).toString();
                        if (i9 == m2.length() || m2.charAt(i9) == ',' || m2.charAt(i9) == ';') {
                            i2 = i9 + 1;
                            str = null;
                        } else {
                            int i10 = i9 + 1;
                            byte[] bArr = HY.a;
                            int length3 = m2.length();
                            while (true) {
                                if (i10 >= length3) {
                                    i10 = m2.length();
                                    break;
                                }
                                char charAt = m2.charAt(i10);
                                int i11 = length3;
                                if (charAt != ' ' && charAt != '\t') {
                                    break;
                                }
                                i10++;
                                length3 = i11;
                            }
                            if (i10 >= m2.length() || m2.charAt(i10) != '\"') {
                                int length4 = m2.length();
                                int i12 = i10;
                                while (true) {
                                    if (i12 >= length4) {
                                        length = m2.length();
                                        break;
                                    }
                                    int i13 = length4;
                                    int i14 = i12;
                                    if (UT.D(",;", m2.charAt(i12))) {
                                        length = i14;
                                        break;
                                    }
                                    i12 = i14 + 1;
                                    length4 = i13;
                                }
                                String substring2 = m2.substring(i10, length);
                                AbstractC0048Bt.m(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str = UT.T(substring2).toString();
                                i2 = length;
                            } else {
                                int i15 = i10 + 1;
                                int H = UT.H(m2, '\"', i15, 4);
                                str = m2.substring(i15, H);
                                AbstractC0048Bt.m(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                i2 = H + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(obj)) {
                            i5 = HY.w(-1, str);
                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                            i6 = HY.w(-1, str);
                        } else if ("private".equalsIgnoreCase(obj)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(obj)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(obj)) {
                            i7 = HY.w(Integer.MAX_VALUE, str);
                        } else if ("min-fresh".equalsIgnoreCase(obj)) {
                            i8 = HY.w(-1, str);
                        } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(obj)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(obj)) {
                            z9 = true;
                        }
                        size = i3;
                    }
                    i4++;
                    c1852rr2 = c1852rr;
                    size = size;
                }
            } else if (!AbstractC0778bU.w(k2, "Pragma")) {
                i4++;
                c1852rr2 = c1852rr;
                size = size;
            }
            z = false;
            i2 = 0;
            while (i2 < m2.length()) {
            }
            i4++;
            c1852rr2 = c1852rr;
            size = size;
        }
        return new C1611o9(z2, z3, i5, i6, z4, z5, z6, i7, i8, z7, z8, z9, !z ? null : str2);
    }

    public static final Object D(long j2, AbstractC2367ze abstractC2367ze) {
        if (j2 > 0) {
            C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(abstractC2367ze));
            c0849ca.r();
            if (j2 < Long.MAX_VALUE) {
                L(c0849ca.l).x(j2, c0849ca);
            }
            Object q = c0849ca.q();
            if (q == EnumC0448Re.h) {
                return q;
            }
        }
        return C0782bY.a;
    }

    public static String D0(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        C1347k9 c1347k9 = C1347k9.k;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        AbstractC0048Bt.m(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i2 = 0;
        EB.f(encoded.length, 0, length);
        byte[] e0 = P6.e0(encoded, 0, length);
        C1347k9 c1347k92 = new C1347k9(e0);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(e0, 0, c1347k92.b());
        byte[] digest = messageDigest.digest();
        AbstractC0048Bt.k(digest);
        new C1347k9(digest);
        byte[] bArr = AbstractC0678a.a;
        AbstractC0048Bt.n(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i3 = 0;
        while (i2 < length2) {
            byte b = digest[i2];
            int i4 = i2 + 2;
            byte b2 = digest[i2 + 1];
            i2 += 3;
            byte b3 = digest[i4];
            bArr2[i3] = bArr[(b & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr2[i5] = bArr[b3 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b4 = digest[i2];
            bArr2[i3] = bArr[(b4 & 255) >> 2];
            bArr2[i3 + 1] = bArr[(b4 & 3) << 4];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        } else if (length3 == 2) {
            int i6 = i2 + 1;
            byte b5 = digest[i2];
            byte b6 = digest[i6];
            bArr2[i3] = bArr[(b5 & 255) >> 2];
            bArr2[i3 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i3 + 2] = bArr[(b6 & 15) << 2];
            bArr2[i3 + 3] = 61;
        }
        sb.append(new String(bArr2, AbstractC0470Sa.a));
        return sb.toString();
    }

    public static final C0244Jh E(EnumC0703aL enumC0703aL) {
        switch (enumC0703aL == null ? -1 : AbstractC1163hL.b[enumC0703aL.ordinal()]) {
            case 1:
                C0244Jh c0244Jh = AbstractC0270Kh.d;
                AbstractC0048Bt.m(c0244Jh, "INTERNAL");
                return c0244Jh;
            case 2:
                C0244Jh c0244Jh2 = AbstractC0270Kh.a;
                AbstractC0048Bt.m(c0244Jh2, "PRIVATE");
                return c0244Jh2;
            case 3:
                C0244Jh c0244Jh3 = AbstractC0270Kh.b;
                AbstractC0048Bt.m(c0244Jh3, "PRIVATE_TO_THIS");
                return c0244Jh3;
            case 4:
                C0244Jh c0244Jh4 = AbstractC0270Kh.c;
                AbstractC0048Bt.m(c0244Jh4, "PROTECTED");
                return c0244Jh4;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                C0244Jh c0244Jh5 = AbstractC0270Kh.e;
                AbstractC0048Bt.m(c0244Jh5, "PUBLIC");
                return c0244Jh5;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                C0244Jh c0244Jh6 = AbstractC0270Kh.f;
                AbstractC0048Bt.m(c0244Jh6, "LOCAL");
                return c0244Jh6;
            default:
                C0244Jh c0244Jh7 = AbstractC0270Kh.a;
                AbstractC0048Bt.m(c0244Jh7, "PRIVATE");
                return c0244Jh7;
        }
    }

    public static InterfaceC0189He E0(InterfaceC0137Fe interfaceC0137Fe, InterfaceC0189He interfaceC0189He) {
        AbstractC0048Bt.n(interfaceC0189He, "context");
        return interfaceC0189He == C1188hk.h ? interfaceC0137Fe : (InterfaceC0189He) interfaceC0189He.I(interfaceC0137Fe, new C1903sc(1));
    }

    public static final void F(InterfaceC0189He interfaceC0189He) {
        InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) interfaceC0189He.k(C0460Rq.K);
        if (interfaceC0075Cu != null && !interfaceC0075Cu.b()) {
            throw interfaceC0075Cu.t();
        }
    }

    public static Collection F0(InterfaceC2298yb interfaceC2298yb, MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        SW Q = interfaceC2298yb.Q(mr);
        if (Q instanceof C1591nt) {
            return ((C1591nt) Q).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    public static final boolean G(long j2, long j3) {
        return j2 == j3;
    }

    public static AbstractC1701pX G0(InterfaceC1440la interfaceC1440la) {
        AbstractC0048Bt.n(interfaceC1440la, "$receiver");
        if (interfaceC1440la instanceof C2077vE) {
            return ((C2077vE) interfaceC1440la).a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1440la);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1440la.getClass(), sb).toString());
    }

    public static final float H(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final Object H0(Object obj) {
        return obj instanceof C0031Bc ? AbstractC1494mO.d(((C0031Bc) obj).a) : obj;
    }

    public static final Object I(AbstractC1760qQ abstractC1760qQ, long j2, InterfaceC2312yp interfaceC2312yp) {
        while (true) {
            if (abstractC1760qQ.c >= j2 && !abstractC1760qQ.c()) {
                return abstractC1760qQ;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0084Dd.a;
            Object obj = atomicReferenceFieldUpdater.get(abstractC1760qQ);
            C0457Rn c0457Rn = h;
            if (obj == c0457Rn) {
                return c0457Rn;
            }
            AbstractC1760qQ abstractC1760qQ2 = (AbstractC1760qQ) ((AbstractC0084Dd) obj);
            if (abstractC1760qQ2 == null) {
                abstractC1760qQ2 = (AbstractC1760qQ) interfaceC2312yp.invoke(Long.valueOf(abstractC1760qQ.c + 1), abstractC1760qQ);
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1760qQ, null, abstractC1760qQ2)) {
                    if (atomicReferenceFieldUpdater.get(abstractC1760qQ) != null) {
                        break;
                    }
                }
                if (abstractC1760qQ.c()) {
                    abstractC1760qQ.d();
                }
            }
            abstractC1760qQ = abstractC1760qQ2;
        }
    }

    public static final void I0(C0405Pn c0405Pn) {
        C1970td c1970td;
        TC tc = c0405Pn.b;
        if (!tc.m) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        C0027Ay J = AbstractC0946e20.J(c0405Pn);
        TC tc2 = tc;
        while (J != null) {
            if ((((TC) J.u.f).d & 5120) != 0) {
                while (tc2 != null) {
                    int i2 = tc2.c;
                    if ((i2 & 5120) != 0) {
                        if (tc2 != tc && (i2 & 1024) != 0) {
                            return;
                        }
                        if ((i2 & 4096) != 0) {
                            for (TC tc3 = tc2; tc3 != null; tc3 = null) {
                                if (tc3 instanceof X7) {
                                    M((X7) tc3);
                                    AbstractC0868ct.W("onFocusEvent called on wrong node");
                                    throw null;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    tc2 = tc2.e;
                }
            }
            J = J.l();
            tc2 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
        }
    }

    public static InterfaceC0137Fe J(InterfaceC0137Fe interfaceC0137Fe, InterfaceC0163Ge interfaceC0163Ge) {
        AbstractC0048Bt.n(interfaceC0163Ge, "key");
        if (AbstractC0048Bt.h(interfaceC0137Fe.getKey(), interfaceC0163Ge)) {
            return interfaceC0137Fe;
        }
        return null;
    }

    public static final ZG J0(C0027Ay c0027Ay) {
        ZG zg = c0027Ay.j;
        if (zg != null) {
            return zg;
        }
        AbstractC0868ct.X("LayoutNode should be attached to an owner");
        throw null;
    }

    public static AbstractC1701pX K(InterfaceC1266iy interfaceC1266iy, int i2) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        if (interfaceC1266iy instanceof AbstractC1004ey) {
            return (AbstractC1701pX) ((AbstractC1004ey) interfaceC1266iy).w0().get(i2);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    public static final void K0(InterfaceC0189He interfaceC0189He, Object obj) {
        if (obj == l) {
            return;
        }
        if (!(obj instanceof HV)) {
            Object I = interfaceC0189He.I(null, n);
            AbstractC0048Bt.l(I, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC1888sN.q(I);
            throw null;
        }
        HV hv = (HV) obj;
        DV[] dvArr = hv.b;
        int length = dvArr.length - 1;
        if (length < 0) {
            return;
        }
        DV dv = dvArr[length];
        AbstractC0048Bt.k(null);
        Object obj2 = hv.a[length];
        throw null;
    }

    public static final InterfaceC0658Zg L(InterfaceC0189He interfaceC0189He) {
        InterfaceC0137Fe k2 = interfaceC0189He.k(C0460Rq.w);
        InterfaceC0658Zg interfaceC0658Zg = k2 instanceof InterfaceC0658Zg ? (InterfaceC0658Zg) k2 : null;
        return interfaceC0658Zg == null ? AbstractC2171wg.a : interfaceC0658Zg;
    }

    public static final void L0(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EnumC0379On M(X7 x7) {
        EnumC0379On s;
        int ordinal;
        EnumC0379On s2;
        int ordinal2;
        X7 x72 = x7;
        for (TC tc = x72.b; tc != null; tc = null) {
            if ((tc instanceof C0405Pn) && ((ordinal2 = (s2 = ((C0405Pn) tc).s()).ordinal()) == 0 || ordinal2 == 1 || ordinal2 == 2)) {
                return s2;
            }
        }
        TC tc2 = x72.b;
        if (!tc2.m) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        YD yd = new YD(new TC[16]);
        TC tc3 = tc2.f;
        if (tc3 == null) {
            AbstractC0946e20.c(yd, tc2);
        } else {
            yd.b(tc3);
        }
        while (yd.l()) {
            TC tc4 = (TC) yd.n(yd.j - 1);
            if ((tc4.d & 1024) == 0) {
                AbstractC0946e20.c(yd, tc4);
            } else {
                while (true) {
                    if (tc4 == null) {
                        break;
                    }
                    if ((tc4.c & 1024) != 0) {
                        while (tc4 != null) {
                            if ((tc4 instanceof C0405Pn) && ((ordinal = (s = ((C0405Pn) tc4).s()).ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                return s;
                            }
                            tc4 = null;
                        }
                    } else {
                        tc4 = tc4.f;
                    }
                }
            }
        }
        return EnumC0379On.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2232xb M0(InterfaceC2298yb interfaceC2298yb, MR mr) {
        if (mr instanceof JR) {
            AbstractC1004ey abstractC1004ey = (AbstractC1004ey) mr;
            return new C2232xb(interfaceC2298yb, new C2096vX(UW.b.b(abstractC1004ey.B0(), abstractC1004ey.w0())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o.Iy] */
    public static final Field N(InterfaceC0937dx interfaceC0937dx) {
        AbstractC0048Bt.n(interfaceC0937dx, "<this>");
        AbstractC1397kx c = JY.c(interfaceC0937dx);
        if (c != null) {
            return (Field) c.q.getValue();
        }
        return null;
    }

    public static Collection N0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            Collection d = ((SW) tw).d();
            AbstractC0048Bt.m(d, "this.supertypes");
            return d;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static final Method O(InterfaceC1396kw interfaceC1396kw) {
        G9 m2;
        AbstractC0048Bt.n(interfaceC1396kw, "<this>");
        AbstractC0491Sv a = JY.a(interfaceC1396kw);
        Member b = (a == null || (m2 = a.m()) == null) ? null : m2.b();
        if (b instanceof Method) {
            return (Method) b;
        }
        return null;
    }

    public static final Object O0(InterfaceC0189He interfaceC0189He) {
        Object I = interfaceC0189He.I(0, m);
        AbstractC0048Bt.k(I);
        return I;
    }

    public static final Type P(InterfaceC1463lx interfaceC1463lx) {
        AbstractC0048Bt.n(interfaceC1463lx, "<this>");
        if (interfaceC1463lx instanceof InterfaceC1529mx) {
            RM rm = ((C1661ox) ((InterfaceC1529mx) interfaceC1463lx)).i;
            Type type = rm != null ? (Type) rm.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return x(interfaceC1463lx, false);
    }

    public static C2077vE P0(InterfaceC1638oa interfaceC1638oa) {
        AbstractC0048Bt.n(interfaceC1638oa, "$receiver");
        if (interfaceC1638oa instanceof C2011uE) {
            return ((C2011uE) interfaceC1638oa).j;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1638oa);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1638oa.getClass(), sb).toString());
    }

    public static final Type Q(C1990tx c1990tx) {
        EnumC2056ux enumC2056ux = c1990tx.a;
        if (enumC2056ux == null) {
            return I00.j;
        }
        InterfaceC1463lx interfaceC1463lx = c1990tx.b;
        AbstractC0048Bt.k(interfaceC1463lx);
        int ordinal = enumC2056ux.ordinal();
        if (ordinal == 0) {
            return x(interfaceC1463lx, true);
        }
        if (ordinal == 1) {
            return new I00(null, x(interfaceC1463lx, true));
        }
        if (ordinal == 2) {
            return new I00(x(interfaceC1463lx, true), null);
        }
        throw new C0057Cc();
    }

    public static SW Q0(MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof JR) {
            return ((JR) mr).B0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    public static final Type R(InterfaceC1463lx interfaceC1463lx) {
        AbstractC0048Bt.n(interfaceC1463lx, "<this>");
        RM rm = ((C1661ox) interfaceC1463lx).i;
        Type type = rm != null ? (Type) rm.invoke() : null;
        return type == null ? P(interfaceC1463lx) : type;
    }

    public static final Object R0(InterfaceC0189He interfaceC0189He, Object obj) {
        if (obj == null) {
            obj = O0(interfaceC0189He);
        }
        if (obj == 0) {
            return l;
        }
        if (obj instanceof Integer) {
            return interfaceC0189He.I(new HV(((Number) obj).intValue(), interfaceC0189He), f83o);
        }
        AbstractC1888sN.q(obj);
        throw null;
    }

    public static final C0210Hz S(InterfaceC0365Nz interfaceC0365Nz) {
        AbstractC0106Dz lifecycle = interfaceC0365Nz.getLifecycle();
        AbstractC0048Bt.n(lifecycle, "<this>");
        AtomicReference atomicReference = lifecycle.a;
        while (true) {
            C0210Hz c0210Hz = (C0210Hz) atomicReference.get();
            if (c0210Hz != null) {
                return c0210Hz;
            }
            C1434lU a = PO.a();
            C0191Hg c0191Hg = AbstractC0115Ei.a;
            C0210Hz c0210Hz2 = new C0210Hz(lifecycle, E0(a, AbstractC1810rB.a.m));
            while (!atomicReference.compareAndSet(null, c0210Hz2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            C0191Hg c0191Hg2 = AbstractC0115Ei.a;
            AbstractC0868ct.H(c0210Hz2, AbstractC1810rB.a.m, null, new C0184Gz(c0210Hz2, null), 2);
            return c0210Hz2;
        }
    }

    public static JR S0(AbstractC1782qm abstractC1782qm) {
        if (abstractC1782qm instanceof AbstractC1782qm) {
            return abstractC1782qm.j;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1782qm);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, abstractC1782qm.getClass(), sb).toString());
    }

    public static InterfaceC1437lX T(TW tw, int i2) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            Object obj = ((SW) tw).getParameters().get(i2);
            AbstractC0048Bt.m(obj, "this.parameters[index]");
            return (InterfaceC1437lX) obj;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static InterfaceC1266iy T0(InterfaceC2298yb interfaceC2298yb, InterfaceC1266iy interfaceC1266iy) {
        if (interfaceC1266iy instanceof MR) {
            return interfaceC2298yb.K((MR) interfaceC1266iy, true);
        }
        if (!(interfaceC1266iy instanceof AbstractC1782qm)) {
            throw new IllegalStateException("sealed");
        }
        AbstractC1782qm abstractC1782qm = (AbstractC1782qm) interfaceC1266iy;
        return interfaceC2298yb.e(interfaceC2298yb.K(interfaceC2298yb.X(abstractC1782qm), true), interfaceC2298yb.K(interfaceC2298yb.Y(abstractC1782qm), true));
    }

    public static AbstractC2097vY U(AbstractC1701pX abstractC1701pX) {
        AbstractC0048Bt.n(abstractC1701pX, "$receiver");
        if (abstractC1701pX instanceof AbstractC1701pX) {
            return abstractC1701pX.b().E0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1701pX);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, abstractC1701pX.getClass(), sb).toString());
    }

    public static JR U0(MR mr, boolean z) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof JR) {
            return ((JR) mr).F0(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    public static InterfaceC1437lX V(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            InterfaceC2364zb c = ((SW) tw).c();
            if (c instanceof InterfaceC1437lX) {
                return (InterfaceC1437lX) c;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static int W(AbstractC1701pX abstractC1701pX) {
        AbstractC0048Bt.n(abstractC1701pX, "$receiver");
        if (abstractC1701pX instanceof AbstractC1701pX) {
            int a = abstractC1701pX.a();
            AbstractC1888sN.t(a, "this.projectionKind");
            return ON.f(a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1701pX);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, abstractC1701pX.getClass(), sb).toString());
    }

    public static boolean X(InterfaceC1266iy interfaceC1266iy, C2245xo c2245xo) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        AbstractC0048Bt.n(c2245xo, "fqName");
        if (interfaceC1266iy instanceof AbstractC1004ey) {
            return ((AbstractC1004ey) interfaceC1266iy).getAnnotations().i(c2245xo);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    public static boolean Y(InterfaceC1437lX interfaceC1437lX, TW tw) {
        if (tw == null ? true : tw instanceof SW) {
            return AbstractC0772bO.p(interfaceC1437lX, (SW) tw, null);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1437lX);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1437lX.getClass(), sb).toString());
    }

    public static boolean Z(MR mr, MR mr2) {
        AbstractC0048Bt.n(mr, "a");
        AbstractC0048Bt.n(mr2, "b");
        if (!(mr instanceof JR)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(mr);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
        }
        if (mr2 instanceof JR) {
            return ((JR) mr).w0() == ((JR) mr2).w0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(mr2);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr2.getClass(), sb2).toString());
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final int a0(N6 n6, Object obj, int i2) {
        int i3 = n6.j;
        if (i3 == 0) {
            return -1;
        }
        try {
            int h2 = AbstractC1473m3.h(i3, i2, n6.h);
            if (h2 < 0 || AbstractC0048Bt.h(obj, n6.i[h2])) {
                return h2;
            }
            int i4 = h2 + 1;
            while (i4 < i3 && n6.h[i4] == i2) {
                if (AbstractC0048Bt.h(obj, n6.i[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = h2 - 1; i5 >= 0 && n6.h[i5] == i2; i5--) {
                if (AbstractC0048Bt.h(obj, n6.i[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final InterfaceC0297Li b0(InterfaceC0075Cu interfaceC0075Cu, boolean z, AbstractC0179Gu abstractC0179Gu) {
        if (interfaceC0075Cu instanceof C0283Ku) {
            return ((C0283Ku) interfaceC0075Cu).L(z, abstractC0179Gu);
        }
        return interfaceC0075Cu.C(abstractC0179Gu.k(), z, new M2(1, abstractC0179Gu, AbstractC0179Gu.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 2));
    }

    public static boolean c0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            return AbstractC0545Ux.H((SW) tw, AbstractC1433lT.a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static final void d(Object obj, InterfaceC2114vp interfaceC2114vp, InterfaceC1377kd interfaceC1377kd) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        boolean d = c1575nd.d(obj);
        Object C = c1575nd.C();
        if (d || C == C1311jd.a) {
            C = new C0193Hi(interfaceC2114vp);
            c1575nd.P(C);
        }
    }

    public static boolean d0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean e0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            return ((SW) tw).c() instanceof InterfaceC1245ib;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static final long f(int i2) {
        long j2 = (i2 << 32) | (0 & 4294967295L);
        int i3 = AbstractC2254xx.m;
        return j2;
    }

    public static boolean f0(TW tw) {
        if (tw instanceof SW) {
            InterfaceC2364zb c = ((SW) tw).c();
            InterfaceC1245ib interfaceC1245ib = c instanceof InterfaceC1245ib ? (InterfaceC1245ib) c : null;
            return (interfaceC1245ib == null || interfaceC1245ib.g() != 1 || interfaceC1245ib.B() == 3 || interfaceC1245ib.B() == 4 || interfaceC1245ib.B() == 5) ? false : true;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static final void g(Object obj, InterfaceC1377kd interfaceC1377kd, InterfaceC2312yp interfaceC2312yp) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        InterfaceC0189He interfaceC0189He = ((C0901dM) c1575nd.b).t;
        boolean d = c1575nd.d(obj);
        Object C = c1575nd.C();
        if (d || C == C1311jd.a) {
            C = new C1728py(interfaceC0189He, interfaceC2312yp);
            c1575nd.P(C);
        }
    }

    public static boolean g0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            return ((SW) tw).a();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static final long h(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static boolean h0(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        if (interfaceC1266iy instanceof AbstractC1004ey) {
            return AbstractC1473m3.P((AbstractC1004ey) interfaceC1266iy);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    public static final String i(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        NQ x = PQ.x(type, OX.j);
        StringBuilder sb = new StringBuilder();
        Iterator it = x.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb.append(((Class) next).getName());
        int t = PQ.t(x);
        if (t < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + t + '.').toString());
        }
        if (t != 0) {
            int i2 = 1;
            if (t != 1) {
                int length = "[]".length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb2 = new StringBuilder("[]".length() * t);
                        if (1 <= t) {
                            while (true) {
                                sb2.append((CharSequence) "[]");
                                if (i2 == t) {
                                    break;
                                }
                                i2++;
                            }
                        }
                        str = sb2.toString();
                        AbstractC0048Bt.k(str);
                    } else {
                        char charAt = "[]".charAt(0);
                        char[] cArr = new char[t];
                        for (int i3 = 0; i3 < t; i3++) {
                            cArr[i3] = charAt;
                        }
                        str = new String(cArr);
                    }
                }
            } else {
                str = "[]".toString();
            }
            sb.append(str);
            return sb.toString();
        }
        str = "";
        sb.append(str);
        return sb.toString();
    }

    public static boolean i0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            InterfaceC2364zb c = ((SW) tw).c();
            InterfaceC1245ib interfaceC1245ib = c instanceof InterfaceC1245ib ? (InterfaceC1245ib) c : null;
            return (interfaceC1245ib != null ? interfaceC1245ib.h0() : null) instanceof C0281Ks;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static final void j(N6 n6, int i2) {
        n6.h = new int[i2];
        n6.i = new Object[i2];
    }

    public static boolean j0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            return tw instanceof C1591nt;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static boolean k(TW tw, TW tw2) {
        AbstractC0048Bt.n(tw, "c1");
        AbstractC0048Bt.n(tw2, "c2");
        if (!(tw instanceof SW)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(tw);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
        }
        if (tw2 instanceof SW) {
            return tw.equals(tw2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(tw2);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw2.getClass(), sb2).toString());
    }

    public static boolean k0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            return tw instanceof C2382zt;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static int l(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        if (interfaceC1266iy instanceof AbstractC1004ey) {
            return ((AbstractC1004ey) interfaceC1266iy).w0().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    public static boolean l0(MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof JR) {
            return ((JR) mr).C0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    public static NW m(MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof JR) {
            return (NW) mr;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    public static boolean m0(TW tw) {
        AbstractC0048Bt.n(tw, "$receiver");
        if (tw instanceof SW) {
            return AbstractC0545Ux.H((SW) tw, AbstractC1433lT.b);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(tw);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, tw.getClass(), sb).toString());
    }

    public static InterfaceC1638oa n(InterfaceC2298yb interfaceC2298yb, MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof JR) {
            if (mr instanceof OR) {
                return interfaceC2298yb.v0(((OR) mr).i);
            }
            if (mr instanceof C2011uE) {
                return (C2011uE) mr;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    public static boolean n0(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        if (interfaceC1266iy instanceof AbstractC1004ey) {
            return AbstractC2228xX.e((AbstractC1004ey) interfaceC1266iy);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    public static C0632Yg o(MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof JR) {
            if (mr instanceof C0632Yg) {
                return (C0632Yg) mr;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean o0(MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof AbstractC1004ey) {
            return AbstractC0545Ux.F((AbstractC1004ey) mr);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    public static AbstractC1782qm p(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        if (interfaceC1266iy instanceof AbstractC1004ey) {
            AbstractC2097vY E0 = ((AbstractC1004ey) interfaceC1266iy).E0();
            if (E0 instanceof AbstractC1782qm) {
                return (AbstractC1782qm) E0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    public static boolean p0(InterfaceC1638oa interfaceC1638oa) {
        if (interfaceC1638oa instanceof C2011uE) {
            return ((C2011uE) interfaceC1638oa).n;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1638oa);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1638oa.getClass(), sb).toString());
    }

    public static JR q(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        if (interfaceC1266iy instanceof AbstractC1004ey) {
            AbstractC2097vY E0 = ((AbstractC1004ey) interfaceC1266iy).E0();
            if (E0 instanceof JR) {
                return (JR) E0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    public static boolean q0(AbstractC1701pX abstractC1701pX) {
        AbstractC0048Bt.n(abstractC1701pX, "$receiver");
        if (abstractC1701pX instanceof AbstractC1701pX) {
            return abstractC1701pX.c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1701pX);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, abstractC1701pX.getClass(), sb).toString());
    }

    public static C1767qX r(InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(interfaceC1266iy, "$receiver");
        if (interfaceC1266iy instanceof AbstractC1004ey) {
            return AbstractC0772bO.a((AbstractC1004ey) interfaceC1266iy);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r0(MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof JR) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    public static final void s(InterfaceC0189He interfaceC0189He, CancellationException cancellationException) {
        InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) interfaceC0189He.k(C0460Rq.K);
        if (interfaceC0075Cu != null) {
            interfaceC0075Cu.c(cancellationException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s0(MR mr) {
        AbstractC0048Bt.n(mr, "$receiver");
        if (mr instanceof JR) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(mr);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JR t(MR mr) {
        List w0;
        ArrayList arrayList;
        C1332jy c1332jy;
        AbstractC1888sN.p(1, "status");
        if (!(mr instanceof JR)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(mr);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, mr.getClass(), sb).toString());
        }
        JR jr = (JR) mr;
        C0425Qh c0425Qh = null;
        if (jr.w0().size() == jr.B0().getParameters().size() && ((w0 = jr.w0()) == null || !w0.isEmpty())) {
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                if (((AbstractC1701pX) it.next()).a() != 1) {
                    List parameters = jr.B0().getParameters();
                    AbstractC0048Bt.m(parameters, "type.constructor.parameters");
                    ArrayList O0 = AbstractC0720ac.O0(w0, parameters);
                    arrayList = new ArrayList(AbstractC0786bc.d0(O0));
                    Iterator it2 = O0.iterator();
                    while (it2.hasNext()) {
                        C1619oH c1619oH = (C1619oH) it2.next();
                        AbstractC1701pX abstractC1701pX = (AbstractC1701pX) c1619oH.h;
                        InterfaceC1437lX interfaceC1437lX = (InterfaceC1437lX) c1619oH.i;
                        if (abstractC1701pX.a() != 1) {
                            AbstractC2097vY E0 = (abstractC1701pX.c() || abstractC1701pX.a() != 2) ? null : abstractC1701pX.b().E0();
                            AbstractC0048Bt.m(interfaceC1437lX, "parameter");
                            abstractC1701pX = AbstractC0772bO.a(new C2011uE(1, new C2077vE(abstractC1701pX, c0425Qh, interfaceC1437lX, 6), E0, (OW) null, false, 56));
                        }
                        arrayList.add(abstractC1701pX);
                    }
                    C2096vX c2096vX = new C2096vX(UW.b.b(jr.B0(), arrayList));
                    int size = w0.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        AbstractC1701pX abstractC1701pX2 = (AbstractC1701pX) w0.get(i2);
                        AbstractC1701pX abstractC1701pX3 = (AbstractC1701pX) arrayList.get(i2);
                        if (abstractC1701pX2.a() != 1) {
                            List upperBounds = ((InterfaceC1437lX) jr.B0().getParameters().get(i2)).getUpperBounds();
                            AbstractC0048Bt.m(upperBounds, "type.constructor.parameters[index].upperBounds");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = upperBounds.iterator();
                            while (true) {
                                boolean hasNext = it3.hasNext();
                                c1332jy = C1332jy.a;
                                if (!hasNext) {
                                    break;
                                }
                                arrayList2.add(c1332jy.a(c2096vX.g(1, (AbstractC1004ey) it3.next()).E0()));
                            }
                            if (!abstractC1701pX2.c() && abstractC1701pX2.a() == 3) {
                                arrayList2.add(c1332jy.a(abstractC1701pX2.b().E0()));
                            }
                            AbstractC1004ey b = abstractC1701pX3.b();
                            AbstractC0048Bt.l(b, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            C2077vE c2077vE = ((C2011uE) b).j;
                            c2077vE.getClass();
                            c2077vE.b = new C0425Qh(2, arrayList2);
                        }
                    }
                    if (arrayList == null) {
                        return HO.r(arrayList, jr.A0(), jr.B0(), jr.C0());
                    }
                    return null;
                }
            }
        }
        arrayList = null;
        if (arrayList == null) {
        }
    }

    public static final boolean t0(long j2) {
        return (j2 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static int u(InterfaceC1638oa interfaceC1638oa) {
        AbstractC0048Bt.n(interfaceC1638oa, "$receiver");
        if (interfaceC1638oa instanceof C2011uE) {
            return ((C2011uE) interfaceC1638oa).i;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1638oa);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1638oa.getClass(), sb).toString());
    }

    public static int u0(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        throw new IOException(AbstractC1888sN.g(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static void v(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(AbstractC1888sN.g(i2, i3, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static JR v0(AbstractC1782qm abstractC1782qm) {
        if (abstractC1782qm instanceof AbstractC1782qm) {
            return abstractC1782qm.i;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC1782qm);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, abstractC1782qm.getClass(), sb).toString());
    }

    public static final int w(long j2, long j3) {
        boolean z = ((int) (j2 & 4294967295L)) != 0;
        return z != (((int) (4294967295L & j3)) != 0) ? z ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32)));
    }

    public static AbstractC2097vY w0(InterfaceC1638oa interfaceC1638oa) {
        if (interfaceC1638oa instanceof C2011uE) {
            return ((C2011uE) interfaceC1638oa).k;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1638oa);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1638oa.getClass(), sb).toString());
    }

    public static final Type x(InterfaceC1463lx interfaceC1463lx, boolean z) {
        C1661ox c1661ox = (C1661ox) interfaceC1463lx;
        InterfaceC1068fw l2 = c1661ox.l();
        if (l2 instanceof InterfaceC1727px) {
            return new C2294yX((InterfaceC1727px) l2);
        }
        if (!(l2 instanceof InterfaceC0517Tv)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + c1661ox);
        }
        InterfaceC0517Tv interfaceC0517Tv = (InterfaceC0517Tv) l2;
        Class E = z ? AbstractC1473m3.E(interfaceC0517Tv) : AbstractC1473m3.D(interfaceC0517Tv);
        List i2 = c1661ox.i();
        if (i2.isEmpty()) {
            return E;
        }
        if (!E.isArray()) {
            return C(E, i2);
        }
        if (E.getComponentType().isPrimitive()) {
            return E;
        }
        C1990tx c1990tx = (C1990tx) AbstractC0720ac.F0(i2);
        if (c1990tx == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + c1661ox);
        }
        EnumC2056ux enumC2056ux = c1990tx.a;
        InterfaceC1463lx interfaceC1463lx2 = c1990tx.b;
        int i3 = enumC2056ux == null ? -1 : NX.a[enumC2056ux.ordinal()];
        if (i3 == -1 || i3 == 1) {
            return E;
        }
        if (i3 != 2 && i3 != 3) {
            throw new C0057Cc();
        }
        AbstractC0048Bt.k(interfaceC1463lx2);
        Type x = x(interfaceC1463lx2, false);
        return x instanceof Class ? E : new C2313yq(x);
    }

    public static AbstractC2097vY x0(InterfaceC1266iy interfaceC1266iy) {
        if (interfaceC1266iy instanceof AbstractC2097vY) {
            return TM.v((AbstractC2097vY) interfaceC1266iy, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1266iy);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, interfaceC1266iy.getClass(), sb).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if ((r5 instanceof o.SJ) == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String y(InterfaceC0381Op interfaceC0381Op, int i2) {
        String b;
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        AbstractC0048Bt.n(interfaceC0381Op, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (interfaceC0381Op instanceof InterfaceC0629Yd) {
                b = "<init>";
            } else {
                b = ((AbstractC1184hg) interfaceC0381Op).getName().b();
                AbstractC0048Bt.m(b, "name.asString()");
            }
            sb.append(b);
        }
        sb.append("(");
        C0261Jy J = interfaceC0381Op.J();
        C0563Vp c0563Vp = C0563Vp.h;
        if (J != null) {
            AbstractC1004ey c = J.c();
            AbstractC0048Bt.m(c, "it.type");
            sb.append((AbstractC0335Mv) AbstractC1473m3.S(c, C1371kX.k, c0563Vp));
        }
        Iterator it = interfaceC0381Op.t0().iterator();
        while (it.hasNext()) {
            AbstractC1004ey c2 = ((RY) it.next()).c();
            AbstractC0048Bt.m(c2, "parameter.type");
            sb.append((AbstractC0335Mv) AbstractC1473m3.S(c2, C1371kX.k, c0563Vp));
        }
        sb.append(")");
        if (z) {
            if (!(interfaceC0381Op instanceof InterfaceC0629Yd)) {
                AbstractC1004ey returnType = interfaceC0381Op.getReturnType();
                AbstractC0048Bt.k(returnType);
                C0827cE c0827cE = AbstractC0545Ux.e;
                if (AbstractC0545Ux.D(returnType, AbstractC1433lT.d)) {
                    AbstractC1004ey returnType2 = interfaceC0381Op.getReturnType();
                    AbstractC0048Bt.k(returnType2);
                    if (!AbstractC2228xX.e(returnType2)) {
                    }
                }
                AbstractC1004ey returnType3 = interfaceC0381Op.getReturnType();
                AbstractC0048Bt.k(returnType3);
                sb.append((AbstractC0335Mv) AbstractC1473m3.S(returnType3, C1371kX.k, c0563Vp));
            }
            sb.append("V");
        }
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final int y0(EnumC2083vK enumC2083vK) {
        int i2 = enumC2083vK == null ? -1 : AbstractC1163hL.a[enumC2083vK.ordinal()];
        if (i2 != 1) {
            int i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                    }
                }
            }
            return i3;
        }
        return 1;
    }

    public static final String z(InterfaceC2072v9 interfaceC2072v9) {
        AbstractC0048Bt.n(interfaceC2072v9, "<this>");
        if (!AbstractC0114Eh.o(interfaceC2072v9)) {
            InterfaceC1118gg n2 = interfaceC2072v9.n();
            InterfaceC1245ib interfaceC1245ib = n2 instanceof InterfaceC1245ib ? (InterfaceC1245ib) n2 : null;
            if (interfaceC1245ib != null && !interfaceC1245ib.getName().i) {
                InterfaceC2072v9 a = interfaceC2072v9.a();
                HR hr = a instanceof HR ? (HR) a : null;
                if (hr != null) {
                    return AbstractC1305jX.H(interfaceC1245ib, y(hr, 3));
                }
            }
        }
        return null;
    }

    public static InterfaceC0189He z0(InterfaceC0137Fe interfaceC0137Fe, InterfaceC0163Ge interfaceC0163Ge) {
        AbstractC0048Bt.n(interfaceC0163Ge, "key");
        return AbstractC0048Bt.h(interfaceC0137Fe.getKey(), interfaceC0163Ge) ? C1188hk.h : interfaceC0137Fe;
    }
}

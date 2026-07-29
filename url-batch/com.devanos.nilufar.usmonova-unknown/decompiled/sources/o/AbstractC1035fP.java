package o;

import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.fP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1035fP {
    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final String b(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0048Bt.m(parameterTypes, "parameterTypes");
        sb.append(P6.o0(parameterTypes, "(", ")", WI.v));
        Class<?> returnType = method.getReturnType();
        AbstractC0048Bt.m(returnType, "returnType");
        sb.append(AbstractC1492mM.b(returnType));
        return sb.toString();
    }

    public static WB c(String str, Collection collection) {
        AbstractC0048Bt.n(str, "message");
        AbstractC0048Bt.n(collection, "types");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(collection2));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1004ey) it.next()).r0());
        }
        C1564nS l = ON.l(arrayList);
        int i = l.h;
        WB c2165wa = i != 0 ? i != 1 ? new C2165wa(str, (WB[]) l.toArray(new WB[0])) : (WB) l.get(0) : VB.b;
        return l.h <= 1 ? c2165wa : new C1531mz(c2165wa);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TV d(String str) {
        AbstractC0048Bt.n(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return TV.k;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return TV.j;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return TV.i;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return TV.l;
            }
        } else if (str.equals("SSLv3")) {
            return TV.m;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String e(InterfaceC0381Op interfaceC0381Op) {
        C0827cE c0827cE;
        InterfaceC2204x9 f = AbstractC0545Ux.z(interfaceC0381Op) ? f(interfaceC0381Op) : null;
        if (f != null) {
            InterfaceC2204x9 k = AbstractC0192Hh.k(f);
            if (k instanceof PJ) {
                AbstractC0545Ux.z(k);
                InterfaceC2204x9 b = AbstractC0192Hh.b(AbstractC0192Hh.k(k), I2.v);
                if (b != null && (c0827cE = (C0827cE) AbstractC0757b9.a.get(AbstractC0192Hh.g(b))) != null) {
                    return c0827cE.b();
                }
            } else if (k instanceof HR) {
                int i = Z8.l;
                LinkedHashMap linkedHashMap = WS.i;
                String z = PX.z((HR) k);
                C0827cE c0827cE2 = z == null ? null : (C0827cE) linkedHashMap.get(z);
                if (c0827cE2 != null) {
                    return c0827cE2.b();
                }
            }
        }
        return null;
    }

    public static final InterfaceC2204x9 f(InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC2204x9, "<this>");
        if (!WS.j.contains(interfaceC2204x9.getName()) && !AbstractC0757b9.d.contains(AbstractC0192Hh.k(interfaceC2204x9).getName())) {
            return null;
        }
        if (interfaceC2204x9 instanceof PJ ? true : interfaceC2204x9 instanceof MJ) {
            return AbstractC0192Hh.b(interfaceC2204x9, RP.y);
        }
        if (interfaceC2204x9 instanceof HR) {
            return AbstractC0192Hh.b(interfaceC2204x9, RP.z);
        }
        return null;
    }

    public static final InterfaceC2204x9 g(InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC2204x9, "<this>");
        InterfaceC2204x9 f = f(interfaceC2204x9);
        if (f != null) {
            return f;
        }
        int i = C0691a9.l;
        C0827cE name = interfaceC2204x9.getName();
        AbstractC0048Bt.m(name, "name");
        if (C0691a9.b(name)) {
            return AbstractC0192Hh.b(interfaceC2204x9, RP.A);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        return !o.AbstractC0545Ux.z(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean h(InterfaceC1245ib interfaceC1245ib, InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC1245ib, "<this>");
        AbstractC0048Bt.n(interfaceC2204x9, "specialCallableDescriptor");
        InterfaceC1118gg n = interfaceC2204x9.n();
        AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        JR i = ((InterfaceC1245ib) n).i();
        AbstractC0048Bt.m(i, "specialCallableDescripto…ssDescriptor).defaultType");
        InterfaceC1245ib j = AbstractC0114Eh.j(interfaceC1245ib);
        while (j != null) {
            if (!(j instanceof InterfaceC0593Wt)) {
                JR i2 = j.i();
                if (i2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                AbstractC2097vY abstractC2097vY = null;
                arrayDeque.add(new C1238iU(i2, null));
                SW B0 = i.B0();
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    C1238iU c1238iU = (C1238iU) arrayDeque.poll();
                    AbstractC1004ey abstractC1004ey = c1238iU.a;
                    SW B02 = abstractC1004ey.B0();
                    if (B02 == null) {
                        AbstractC2219xO.a(3);
                        throw null;
                    }
                    if (B0 == null) {
                        AbstractC2219xO.a(4);
                        throw null;
                    }
                    if (B02.equals(B0)) {
                        boolean C0 = abstractC1004ey.C0();
                        for (C1238iU c1238iU2 = c1238iU.b; c1238iU2 != null; c1238iU2 = c1238iU2.b) {
                            AbstractC1004ey abstractC1004ey2 = c1238iU2.a;
                            List w0 = abstractC1004ey2.w0();
                            GU gu = UW.b;
                            if (w0 == null || !w0.isEmpty()) {
                                Iterator it = w0.iterator();
                                while (it.hasNext()) {
                                    if (((AbstractC1701pX) it.next()).a() != 1) {
                                        abstractC1004ey = (AbstractC1004ey) AbstractC0048Bt.g(new C2096vX(EB.Z(gu.b(abstractC1004ey2.B0(), abstractC1004ey2.w0()))).g(1, abstractC1004ey)).b;
                                        break;
                                    }
                                }
                            }
                            abstractC1004ey = new C2096vX(gu.b(abstractC1004ey2.B0(), abstractC1004ey2.w0())).g(1, abstractC1004ey);
                            C0 = C0 || abstractC1004ey2.C0();
                        }
                        SW B03 = abstractC1004ey.B0();
                        if (B03 == null) {
                            AbstractC2219xO.a(3);
                            throw null;
                        }
                        if (!B03.equals(B0)) {
                            throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + PO.e(B03) + ", \n\nsupertype: " + PO.e(B0) + " \n" + B03.equals(B0));
                        }
                        abstractC2097vY = AbstractC2228xX.g(abstractC1004ey, C0);
                    } else {
                        for (AbstractC1004ey abstractC1004ey3 : B02.d()) {
                            AbstractC0048Bt.m(abstractC1004ey3, "immediateSupertype");
                            arrayDeque.add(new C1238iU(abstractC1004ey3, c1238iU));
                        }
                    }
                }
            }
            j = AbstractC0114Eh.j(j);
        }
        return false;
    }

    public static C1177hZ i(String str) {
        String group;
        if (str == null || UT.J(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
        AbstractC0048Bt.m(group4, "description");
        return new C1177hZ(parseInt, parseInt2, parseInt3, group4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(String str, long j, long j2, long j3) {
        String str2;
        boolean z;
        String str3;
        Long valueOf;
        int i = HU.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        AbstractC0868ct.k(10);
        int length = str2.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (AbstractC0048Bt.t(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i2 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i2 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (i2 < length) {
                int digit = Character.digit((int) str2.charAt(i2), 10);
                if (digit >= 0) {
                    if (j5 >= j6) {
                        str3 = str2;
                    } else if (j6 == -256204778801521550L) {
                        str3 = str2;
                        j6 = j4 / 10;
                        if (j5 < j6) {
                            valueOf = null;
                            break;
                        }
                    }
                    long j7 = j5 * 10;
                    long j8 = digit;
                    if (j7 < j4 + j8) {
                        valueOf = null;
                        break;
                    }
                    j5 = j7 - j8;
                    i2++;
                    str2 = str3;
                }
            }
            str3 = str2;
            valueOf = z ? Long.valueOf(j5) : Long.valueOf(-j5);
            if (valueOf != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
            }
            long longValue = valueOf.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        str3 = str2;
        valueOf = null;
        if (valueOf != null) {
        }
    }

    public static int k(String str, int i, int i2) {
        return (int) j(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final double l(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }
}

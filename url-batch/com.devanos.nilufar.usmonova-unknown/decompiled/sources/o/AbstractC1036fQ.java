package o;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: o.fQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1036fQ {
    public static final Class a;
    public static final C0913dY b;
    public static final C0913dY c;
    public static final C0913dY d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = w(false);
        c = w(true);
        d = new C0913dY();
    }

    public static void A(int i, List list, Y1 y1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C0627Yb) y1.i).h0(i, (C1151h9) list.get(i2));
        }
    }

    public static void B(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                c0627Yb.getClass();
                c0627Yb.l0(Double.doubleToRawLongBits(doubleValue), i);
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C0627Yb.w;
            i3 += 8;
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.m0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void C(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.n0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C0627Yb.X(((Integer) list.get(i4)).intValue());
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.o0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.j0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0627Yb.w;
            i3 += 4;
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.k0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void E(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.l0(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0627Yb.w;
            i3 += 8;
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.m0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void F(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                c0627Yb.getClass();
                c0627Yb.j0(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C0627Yb.w;
            i3 += 4;
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.k0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void G(int i, List list, Y1 y1, InterfaceC0839cQ interfaceC0839cQ) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            y1.i0(i, list.get(i2), interfaceC0839cQ);
        }
    }

    public static void H(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.n0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C0627Yb.X(((Integer) list.get(i4)).intValue());
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.o0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void I(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.v0(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C0627Yb.b0(((Long) list.get(i4)).longValue());
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.w0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void J(int i, List list, Y1 y1, InterfaceC0839cQ interfaceC0839cQ) {
        if (list == null || list.isEmpty()) {
            return;
        }
        y1.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C0627Yb) y1.i).p0(i, (F) list.get(i2), interfaceC0839cQ);
        }
    }

    public static void K(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.j0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0627Yb.w;
            i3 += 4;
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.k0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void L(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.l0(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0627Yb.w;
            i3 += 8;
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.m0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void M(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                c0627Yb.t0(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += C0627Yb.a0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            c0627Yb.u0((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void N(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                c0627Yb.v0((longValue >> 63) ^ (longValue << 1), i);
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += C0627Yb.b0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            c0627Yb.w0((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void O(int i, List list, Y1 y1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!(list instanceof InterfaceC1860rz)) {
            while (i2 < list.size()) {
                c0627Yb.q0(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        InterfaceC1860rz interfaceC1860rz = (InterfaceC1860rz) list;
        while (i2 < list.size()) {
            Object h = interfaceC1860rz.h(i2);
            if (h instanceof String) {
                c0627Yb.q0(i, (String) h);
            } else {
                c0627Yb.h0(i, (C1151h9) h);
            }
            i2++;
        }
    }

    public static void P(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.t0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C0627Yb.a0(((Integer) list.get(i4)).intValue());
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.u0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void Q(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.v0(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C0627Yb.b0(((Long) list.get(i4)).longValue());
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.w0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z = C0627Yb.Z(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Z += C0627Yb.T((C1151h9) list.get(i2));
        }
        return Z;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0627Yb.Z(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C0627Yb.X(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0627Yb.U(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0627Yb.V(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0627Yb.Z(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C0627Yb.X(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0627Yb.Z(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C0627Yb.b0(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int l(int i, List list, InterfaceC0839cQ interfaceC0839cQ) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z = C0627Yb.Z(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int a2 = ((F) list.get(i2)).a(interfaceC0839cQ);
            Z += C0627Yb.a0(a2) + a2;
        }
        return Z;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0627Yb.Z(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += C0627Yb.a0((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0627Yb.Z(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += C0627Yb.b0((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int Z = C0627Yb.Z(i) * size;
        if (!(list instanceof InterfaceC1860rz)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                Z = (obj instanceof C1151h9 ? C0627Yb.T((C1151h9) obj) : C0627Yb.Y((String) obj)) + Z;
                i2++;
            }
            return Z;
        }
        InterfaceC1860rz interfaceC1860rz = (InterfaceC1860rz) list;
        while (i2 < size) {
            Object h = interfaceC1860rz.h(i2);
            Z = (h instanceof C1151h9 ? C0627Yb.T((C1151h9) h) : C0627Yb.Y((String) h)) + Z;
            i2++;
        }
        return Z;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0627Yb.Z(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C0627Yb.a0(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0627Yb.Z(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C0627Yb.b0(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static C0913dY w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (C0913dY) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void x(C0913dY c0913dY, Object obj, Object obj2) {
        c0913dY.getClass();
        AbstractC2181wq abstractC2181wq = (AbstractC2181wq) obj;
        C0847cY c0847cY = abstractC2181wq.unknownFields;
        C0847cY c0847cY2 = ((AbstractC2181wq) obj2).unknownFields;
        C0847cY c0847cY3 = C0847cY.f;
        if (!c0847cY3.equals(c0847cY2)) {
            if (c0847cY3.equals(c0847cY)) {
                int i = c0847cY.a + c0847cY2.a;
                int[] copyOf = Arrays.copyOf(c0847cY.b, i);
                System.arraycopy(c0847cY2.b, 0, copyOf, c0847cY.a, c0847cY2.a);
                Object[] copyOf2 = Arrays.copyOf(c0847cY.c, i);
                System.arraycopy(c0847cY2.c, 0, copyOf2, c0847cY.a, c0847cY2.a);
                c0847cY = new C0847cY(i, copyOf, copyOf2, true);
            } else {
                c0847cY.getClass();
                if (!c0847cY2.equals(c0847cY3)) {
                    if (!c0847cY.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c0847cY.a + c0847cY2.a;
                    c0847cY.a(i2);
                    System.arraycopy(c0847cY2.b, 0, c0847cY.b, c0847cY.a, c0847cY2.a);
                    System.arraycopy(c0847cY2.c, 0, c0847cY.c, c0847cY.a, c0847cY2.a);
                    c0847cY.a = i2;
                }
            }
        }
        abstractC2181wq.unknownFields = c0847cY;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i, List list, Y1 y1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0627Yb c0627Yb = (C0627Yb) y1.i;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0627Yb.g0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c0627Yb.s0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C0627Yb.w;
            i3++;
        }
        c0627Yb.u0(i3);
        while (i2 < list.size()) {
            c0627Yb.e0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static Object v(Object obj, int i, List list, Object obj2, C0913dY c0913dY) {
        return obj2;
    }
}

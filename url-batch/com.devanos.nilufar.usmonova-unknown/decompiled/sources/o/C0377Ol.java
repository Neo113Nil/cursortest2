package o;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.Ol, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377Ol {
    public static final C0377Ol c = new C0377Ol(0);
    public final C1038fS a = new C1038fS(16);
    public boolean b;

    public C0377Ol() {
    }

    public static int c(I10 i10, Object obj) {
        switch (i10.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return M5.h(((Long) obj).longValue());
            case 3:
                return M5.h(((Long) obj).longValue());
            case 4:
                return M5.d(((Integer) obj).intValue());
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                return 8;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                return 4;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return M5.g(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((E) obj).c();
            case 10:
                return M5.f((E) obj);
            case 11:
                if (obj instanceof AbstractC1281j9) {
                    AbstractC1281j9 abstractC1281j9 = (AbstractC1281j9) obj;
                    return abstractC1281j9.size() + M5.g(abstractC1281j9.size());
                }
                byte[] bArr = (byte[]) obj;
                return M5.g(bArr.length) + bArr.length;
            case 12:
                return M5.g(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC1854rt ? M5.d(((InterfaceC1854rt) obj).getNumber()) : M5.d(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return M5.g((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return M5.h((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(C1983tq c1983tq, Object obj) {
        I10 i10 = c1983tq.i;
        int i = c1983tq.h;
        if (!c1983tq.j) {
            int i2 = M5.i(i);
            if (i10 == I10.l) {
                i2 *= 2;
            }
            return c(i10, obj) + i2;
        }
        int i3 = 0;
        for (Object obj2 : (List) obj) {
            int i4 = M5.i(i);
            if (i10 == I10.l) {
                i4 *= 2;
            }
            i3 += c(i10, obj2) + i4;
        }
        return i3;
    }

    public static boolean e(Map.Entry entry) {
        C1983tq c1983tq = (C1983tq) entry.getKey();
        if (c1983tq.i.h != K10.q) {
            return true;
        }
        if (!c1983tq.j) {
            Object value = entry.getValue();
            if (value instanceof E) {
                return ((E) value).b();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((E) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(C0523Ub c0523Ub, I10 i10) {
        switch (i10.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c0523Ub.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c0523Ub.i()));
            case 2:
                return Long.valueOf(c0523Ub.l());
            case 3:
                return Long.valueOf(c0523Ub.l());
            case 4:
                return Integer.valueOf(c0523Ub.k());
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return Long.valueOf(c0523Ub.j());
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(c0523Ub.i());
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(c0523Ub.l() != 0);
            case 8:
                int k = c0523Ub.k();
                int i = c0523Ub.b;
                int i2 = c0523Ub.d;
                if (k > i - i2 || k <= 0) {
                    return k == 0 ? "" : new String(c0523Ub.h(k), "UTF-8");
                }
                String str = new String(c0523Ub.a, i2, k, "UTF-8");
                c0523Ub.d += k;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c0523Ub.e();
            case 12:
                return Integer.valueOf(c0523Ub.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c0523Ub.i());
            case 15:
                return Long.valueOf(c0523Ub.j());
            case 16:
                int k2 = c0523Ub.k();
                return Integer.valueOf((-(k2 & 1)) ^ (k2 >>> 1));
            case 17:
                long l = c0523Ub.l();
                return Long.valueOf((-(l & 1)) ^ (l >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if ((r3 instanceof o.InterfaceC1854rt) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(I10 i10, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (i10.h.ordinal()) {
            case 0:
                z2 = obj instanceof Integer;
                break;
            case 1:
                z2 = obj instanceof Long;
                break;
            case 2:
                z2 = obj instanceof Float;
                break;
            case 3:
                z2 = obj instanceof Double;
                break;
            case 4:
                z2 = obj instanceof Boolean;
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                z2 = obj instanceof String;
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!(obj instanceof AbstractC1281j9)) {
                    break;
                }
                z2 = z;
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = z;
                break;
            case 8:
                z2 = obj instanceof E;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(M5 m5, I10 i10, Object obj) {
        switch (i10.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                m5.getClass();
                m5.C(Double.doubleToRawLongBits(doubleValue));
                break;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                m5.getClass();
                m5.B(Float.floatToRawIntBits(floatValue));
                break;
            case 2:
                m5.E(((Long) obj).longValue());
                break;
            case 3:
                m5.E(((Long) obj).longValue());
                break;
            case 4:
                m5.v(((Integer) obj).intValue());
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                m5.C(((Long) obj).longValue());
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                m5.B(((Integer) obj).intValue());
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                m5.y(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                m5.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                m5.D(bytes.length);
                m5.A(bytes);
                break;
            case 9:
                m5.getClass();
                ((E) obj).f(m5);
                break;
            case 10:
                m5.x((E) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC1281j9)) {
                    byte[] bArr = (byte[]) obj;
                    m5.getClass();
                    m5.D(bArr.length);
                    m5.A(bArr);
                    break;
                } else {
                    AbstractC1281j9 abstractC1281j9 = (AbstractC1281j9) obj;
                    m5.getClass();
                    m5.D(abstractC1281j9.size());
                    m5.z(abstractC1281j9);
                    break;
                }
            case 12:
                m5.D(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC1854rt)) {
                    m5.v(((Integer) obj).intValue());
                    break;
                } else {
                    m5.v(((InterfaceC1854rt) obj).getNumber());
                    break;
                }
            case 14:
                m5.B(((Integer) obj).intValue());
                break;
            case 15:
                m5.C(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                m5.D((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                m5.E((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a(C1983tq c1983tq, Object obj) {
        List list;
        if (!c1983tq.j) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(c1983tq.i, obj);
        C1038fS c1038fS = this.a;
        Object obj2 = c1038fS.get(c1983tq);
        if (obj2 == null) {
            list = new ArrayList();
            c1038fS.put(c1983tq, list);
        } else {
            list = (List) obj2;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0377Ol clone() {
        C1038fS c1038fS;
        C0377Ol c0377Ol = new C0377Ol();
        int i = 0;
        while (true) {
            c1038fS = this.a;
            if (i >= c1038fS.i.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1038fS.i.get(i);
            c0377Ol.i((C1983tq) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c1038fS.c()) {
            c0377Ol.i((C1983tq) entry2.getKey(), entry2.getValue());
        }
        return c0377Ol;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        C1038fS c1038fS = this.a;
        if (!c1038fS.k) {
            for (int i = 0; i < c1038fS.i.size(); i++) {
                Map.Entry entry = (Map.Entry) c1038fS.i.get(i);
                if (((C1983tq) entry.getKey()).j) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c1038fS.c()) {
                if (((C1983tq) entry2.getKey()).j) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c1038fS.k) {
            c1038fS.j = c1038fS.j.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1038fS.j);
            c1038fS.k = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        C1983tq c1983tq = (C1983tq) entry.getKey();
        Object value = entry.getValue();
        boolean z = c1983tq.j;
        C1038fS c1038fS = this.a;
        if (z) {
            Object obj = c1038fS.get(c1983tq);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            c1038fS.put(c1983tq, obj);
            return;
        }
        if (c1983tq.i.h != K10.q) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c1038fS.put(c1983tq, value);
            return;
        }
        Object obj3 = c1038fS.get(c1983tq);
        if (obj3 != null) {
            c1038fS.put(c1983tq, ((E) obj3).e().e((AbstractC2115vq) ((E) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c1038fS.put(c1983tq, value);
    }

    public final void i(C1983tq c1983tq, Object obj) {
        boolean z = c1983tq.j;
        I10 i10 = c1983tq.i;
        if (!z) {
            j(i10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(i10, it.next());
            }
            obj = arrayList;
        }
        this.a.put(c1983tq, obj);
    }

    public C0377Ol(int i) {
        f();
    }
}

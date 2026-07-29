package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class P6 extends AbstractC0946e20 {
    public static List W(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        AbstractC0048Bt.m(asList, "asList(...)");
        return asList;
    }

    public static NQ X(Object[] objArr) {
        return objArr.length == 0 ? C1582nk.a : new T6(0, objArr);
    }

    public static boolean Y(Object obj, Object[] objArr) {
        AbstractC0048Bt.n(objArr, "<this>");
        return m0(objArr, obj) >= 0;
    }

    public static void Z(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        AbstractC0048Bt.n(bArr, "<this>");
        AbstractC0048Bt.n(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void a0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        AbstractC0048Bt.n(iArr, "<this>");
        AbstractC0048Bt.n(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void b0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        AbstractC0048Bt.n(objArr, "<this>");
        AbstractC0048Bt.n(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void c0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        a0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void d0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        b0(objArr, objArr2, 0, i, i2);
    }

    public static byte[] e0(byte[] bArr, int i, int i2) {
        AbstractC0048Bt.n(bArr, "<this>");
        AbstractC0946e20.n(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        AbstractC0048Bt.m(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] f0(Object[] objArr, int i, int i2) {
        AbstractC0048Bt.n(objArr, "<this>");
        AbstractC0946e20.n(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        AbstractC0048Bt.m(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void g0(Object[] objArr, int i, int i2) {
        AbstractC0048Bt.n(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void h0(long[] jArr) {
        int length = jArr.length;
        AbstractC0048Bt.n(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static ArrayList i0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object j0(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object k0(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Integer l0(int[] iArr, int i) {
        AbstractC0048Bt.n(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static int m0(Object[] objArr, Object obj) {
        AbstractC0048Bt.n(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void n0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(objArr, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC2219xO.c(sb, obj, interfaceC2114vp);
        }
        sb.append(charSequence3);
    }

    public static String o0(Object[] objArr, String str, String str2, InterfaceC2114vp interfaceC2114vp) {
        StringBuilder sb = new StringBuilder();
        n0(objArr, sb, "", str, str2, "...", interfaceC2114vp);
        return sb.toString();
    }

    public static Object p0(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static char q0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object r0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final void s0(Object[] objArr, LinkedHashSet linkedHashSet) {
        AbstractC0048Bt.n(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List t0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C6(objArr, false)) : AbstractC0868ct.J(objArr[0]) : C1318jk.h;
    }

    public static Set u0(Object[] objArr) {
        AbstractC0048Bt.n(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C1648ok.h;
        }
        if (length == 1) {
            return AbstractC0773bP.i(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(EB.E(objArr.length));
        s0(objArr, linkedHashSet);
        return linkedHashSet;
    }
}

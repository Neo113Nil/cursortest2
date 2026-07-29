package o;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: o.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685a3 implements Comparator {
    public static final C0685a3 b = new C0685a3(0);
    public static final C0685a3 c = new C0685a3(1);
    public static final C0685a3 d = new C0685a3(2);
    public static final C0685a3 e = new C0685a3(3);
    public static final C0685a3 f = new C0685a3(4);
    public static final C0685a3 g = new C0685a3(5);
    public final /* synthetic */ int a;

    public /* synthetic */ C0685a3(int i) {
        this.a = i;
    }

    public static int a(InterfaceC1118gg interfaceC1118gg) {
        if (AbstractC0114Eh.m(interfaceC1118gg)) {
            return 8;
        }
        if (interfaceC1118gg instanceof InterfaceC0629Yd) {
            return 7;
        }
        if (interfaceC1118gg instanceof PJ) {
            return ((PJ) interfaceC1118gg).J() == null ? 6 : 5;
        }
        if (interfaceC1118gg instanceof InterfaceC0381Op) {
            return ((InterfaceC0381Op) interfaceC1118gg).J() == null ? 4 : 3;
        }
        if (interfaceC1118gg instanceof InterfaceC1245ib) {
            return 2;
        }
        return interfaceC1118gg instanceof C1316ji ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        Integer valueOf;
        switch (this.a) {
            case 0:
                C1032fM f2 = ((C2287yQ) obj).f();
                C1032fM f3 = ((C2287yQ) obj2).f();
                int compare = Float.compare(f2.a, f3.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f2.b, f3.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f2.d, f3.d);
                return compare3 != 0 ? compare3 : Float.compare(f2.c, f3.c);
            case 1:
                C1032fM f4 = ((C2287yQ) obj).f();
                C1032fM f5 = ((C2287yQ) obj2).f();
                int compare4 = Float.compare(f5.c, f4.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f4.b, f5.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f4.d, f5.d);
                return compare6 != 0 ? compare6 : Float.compare(f5.a, f4.a);
            case 2:
                C1619oH c1619oH = (C1619oH) obj;
                C1619oH c1619oH2 = (C1619oH) obj2;
                int compare7 = Float.compare(((C1032fM) c1619oH.h).b, ((C1032fM) c1619oH2.h).b);
                return compare7 != 0 ? compare7 : Float.compare(((C1032fM) c1619oH.h).d, ((C1032fM) c1619oH2.h).d);
            case 3:
                C0405Pn c0405Pn = (C0405Pn) obj;
                C0405Pn c0405Pn2 = (C0405Pn) obj2;
                int i = 0;
                if (!AbstractC1052fg.G(c0405Pn) || !AbstractC1052fg.G(c0405Pn2)) {
                    if (AbstractC1052fg.G(c0405Pn)) {
                        return -1;
                    }
                    return AbstractC1052fg.G(c0405Pn2) ? 1 : 0;
                }
                C0027Ay J = AbstractC0946e20.J(c0405Pn);
                C0027Ay J2 = AbstractC0946e20.J(c0405Pn2);
                if (AbstractC0048Bt.h(J, J2)) {
                    return 0;
                }
                Object[] objArr = new C0027Ay[16];
                int i2 = 0;
                while (J != null) {
                    int i3 = i2 + 1;
                    if (objArr.length < i3) {
                        objArr = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
                        AbstractC0048Bt.m(objArr, "copyOf(this, newSize)");
                    }
                    if (i2 != 0) {
                        P6.b0(objArr, objArr, 0 + 1, 0, i2);
                    }
                    objArr[0] = J;
                    i2++;
                    J = J.l();
                }
                Object[] objArr2 = new C0027Ay[16];
                int i4 = 0;
                while (J2 != null) {
                    int i5 = i4 + 1;
                    if (objArr2.length < i5) {
                        objArr2 = Arrays.copyOf(objArr2, Math.max(i5, objArr2.length * 2));
                        AbstractC0048Bt.m(objArr2, "copyOf(this, newSize)");
                    }
                    if (i4 != 0) {
                        P6.b0(objArr2, objArr2, 0 + 1, 0, i4);
                    }
                    objArr2[0] = J2;
                    i4++;
                    J2 = J2.l();
                }
                int min = Math.min(i2 - 1, i4 - 1);
                if (min >= 0) {
                    while (AbstractC0048Bt.h(objArr[i], objArr2[i])) {
                        if (i != min) {
                            i++;
                        }
                    }
                    return AbstractC0048Bt.t(((C0027Ay) objArr[i]).m(), ((C0027Ay) objArr2[i]).m());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            case 4:
                InterfaceC1118gg interfaceC1118gg = (InterfaceC1118gg) obj;
                InterfaceC1118gg interfaceC1118gg2 = (InterfaceC1118gg) obj2;
                int a = a(interfaceC1118gg2) - a(interfaceC1118gg);
                if (a != 0) {
                    valueOf = Integer.valueOf(a);
                } else if (AbstractC0114Eh.n(interfaceC1118gg, 4) && AbstractC0114Eh.n(interfaceC1118gg2, 4)) {
                    valueOf = 0;
                } else {
                    int compareTo = interfaceC1118gg.getName().h.compareTo(interfaceC1118gg2.getName().h);
                    valueOf = compareTo != 0 ? Integer.valueOf(compareTo) : null;
                }
                if (valueOf != null) {
                    return valueOf.intValue();
                }
                return 0;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                C0027Ay c0027Ay = (C0027Ay) obj;
                C0027Ay c0027Ay2 = (C0027Ay) obj2;
                int t = AbstractC0048Bt.t(c0027Ay2.k, c0027Ay.k);
                return t != 0 ? t : AbstractC0048Bt.t(c0027Ay.hashCode(), c0027Ay2.hashCode());
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC1305jX.l(Integer.valueOf(((X3) obj).b), Integer.valueOf(((X3) obj2).b));
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                AbstractC0048Bt.n(str, "a");
                AbstractC0048Bt.n(str2, "b");
                int min2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < min2; i6++) {
                    char charAt = str.charAt(i6);
                    char charAt2 = str2.charAt(i6);
                    if (charAt != charAt2) {
                        return AbstractC0048Bt.t(charAt, charAt2) < 0 ? -1 : 1;
                    }
                }
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length < length2) {
                }
            case 8:
                return AbstractC1305jX.l(AbstractC0192Hh.g((InterfaceC1245ib) obj).b(), AbstractC0192Hh.g((InterfaceC1245ib) obj2).b());
            case 9:
                C0027Ay c0027Ay3 = (C0027Ay) obj;
                C0027Ay c0027Ay4 = (C0027Ay) obj2;
                int t2 = AbstractC0048Bt.t(c0027Ay3.k, c0027Ay4.k);
                return t2 != 0 ? t2 : AbstractC0048Bt.t(c0027Ay3.hashCode(), c0027Ay4.hashCode());
            case 10:
                return AbstractC1305jX.l(((Method) obj).getName(), ((Method) obj2).getName());
            case 11:
                return AbstractC1305jX.l(((C0362Nw) ((InterfaceC0310Lw) obj)).getName(), ((C0362Nw) ((InterfaceC0310Lw) obj2)).getName());
            case 12:
                Integer b2 = AbstractC0270Kh.b((C0244Jh) obj, (C0244Jh) obj2);
                if (b2 == null) {
                    return 0;
                }
                return b2.intValue();
            case 13:
                return AbstractC1305jX.l(AbstractC0192Hh.g((InterfaceC1245ib) obj).b(), AbstractC0192Hh.g((InterfaceC1245ib) obj2).b());
            default:
                return AbstractC1305jX.l(((C0750b20) obj).a, ((C0750b20) obj2).a);
        }
    }
}

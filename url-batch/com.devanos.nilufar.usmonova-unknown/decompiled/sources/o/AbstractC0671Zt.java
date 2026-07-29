package o;

import com.google.firebase.messaging.Constants;
import java.util.HashMap;

/* renamed from: o.Zt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0671Zt {
    public static final C0244Jh a;
    public static final C0244Jh b;
    public static final C0244Jh c;
    public static final HashMap d;

    static {
        C2185wu c2185wu = C2185wu.c;
        C0244Jh c0244Jh = new C0244Jh(c2185wu, 9);
        a = c0244Jh;
        C2317yu c2317yu = C2317yu.c;
        C0244Jh c0244Jh2 = new C0244Jh(c2317yu, 10);
        b = c0244Jh2;
        C2251xu c2251xu = C2251xu.c;
        C0244Jh c0244Jh3 = new C0244Jh(c2251xu, 11);
        c = c0244Jh3;
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(c2185wu, c0244Jh);
        hashMap.put(c2317yu, c0244Jh2);
        hashMap.put(c2251xu, c0244Jh3);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = Constants.MessagePayloadKeys.FROM;
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static boolean b(UL ul, InterfaceC1446lg interfaceC1446lg, InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg == null) {
            a(1);
            throw null;
        }
        int i = AbstractC0114Eh.a;
        if (c(interfaceC1446lg instanceof InterfaceC2204x9 ? AbstractC0114Eh.t((InterfaceC2204x9) interfaceC1446lg) : interfaceC1446lg, interfaceC1118gg)) {
            return true;
        }
        return AbstractC0270Kh.c.a(ul, interfaceC1446lg, interfaceC1118gg);
    }

    public static boolean c(InterfaceC1446lg interfaceC1446lg, InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1446lg == null) {
            a(2);
            throw null;
        }
        if (interfaceC1118gg == null) {
            a(3);
            throw null;
        }
        InterfaceC0961eH interfaceC0961eH = (InterfaceC0961eH) AbstractC0114Eh.i(interfaceC1446lg, InterfaceC0961eH.class, false);
        InterfaceC0961eH interfaceC0961eH2 = (InterfaceC0961eH) AbstractC0114Eh.i(interfaceC1118gg, InterfaceC0961eH.class, false);
        return (interfaceC0961eH2 == null || interfaceC0961eH == null || !((AbstractC1027fH) interfaceC0961eH).l.equals(((AbstractC1027fH) interfaceC0961eH2).l)) ? false : true;
    }
}

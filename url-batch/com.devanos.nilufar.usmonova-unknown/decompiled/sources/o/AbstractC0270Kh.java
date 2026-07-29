package o;

import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: o.Kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0270Kh {
    public static final C0244Jh a;
    public static final C0244Jh b;
    public static final C0244Jh c;
    public static final C0244Jh d;
    public static final C0244Jh e;
    public static final C0244Jh f;
    public static final C0244Jh g;
    public static final C0244Jh h;
    public static final C0244Jh i;
    public static final C0244Jh j;
    public static final C0218Ih k;
    public static final C0140Fh l;
    public static final C0218Ih m;
    public static final C0892dD n;

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f58o;

    static {
        C1929t00 c1929t00 = C1929t00.c;
        C0244Jh c0244Jh = new C0244Jh(c1929t00, 0);
        a = c0244Jh;
        C1995u00 c1995u00 = C1995u00.c;
        C0244Jh c0244Jh2 = new C0244Jh(c1995u00, 1);
        b = c0244Jh2;
        C2061v00 c2061v00 = C2061v00.c;
        C0244Jh c0244Jh3 = new C0244Jh(c2061v00, 2);
        c = c0244Jh3;
        C1732q00 c1732q00 = C1732q00.c;
        C0244Jh c0244Jh4 = new C0244Jh(c1732q00, 3);
        d = c0244Jh4;
        C2127w00 c2127w00 = C2127w00.c;
        C0244Jh c0244Jh5 = new C0244Jh(c2127w00, 4);
        e = c0244Jh5;
        C1863s00 c1863s00 = C1863s00.c;
        C0244Jh c0244Jh6 = new C0244Jh(c1863s00, 5);
        f = c0244Jh6;
        C1666p00 c1666p00 = C1666p00.c;
        C0244Jh c0244Jh7 = new C0244Jh(c1666p00, 6);
        g = c0244Jh7;
        C1797r00 c1797r00 = C1797r00.c;
        C0244Jh c0244Jh8 = new C0244Jh(c1797r00, 7);
        h = c0244Jh8;
        C2193x00 c2193x00 = C2193x00.c;
        C0244Jh c0244Jh9 = new C0244Jh(c2193x00, 8);
        i = c0244Jh9;
        Collections.unmodifiableSet(P6.u0(new C0244Jh[]{c0244Jh, c0244Jh2, c0244Jh4, c0244Jh6}));
        HashMap hashMap = new HashMap(6);
        hashMap.put(c0244Jh2, 0);
        hashMap.put(c0244Jh, 0);
        hashMap.put(c0244Jh4, 1);
        hashMap.put(c0244Jh3, 1);
        hashMap.put(c0244Jh5, 2);
        Collections.unmodifiableMap(hashMap);
        j = c0244Jh5;
        k = new C0218Ih(0);
        int i2 = 1;
        l = new C0140Fh(i2);
        m = new C0218Ih(i2);
        try {
            Iterator it = Arrays.asList(new C0892dD[0]).iterator();
            n = it.hasNext() ? (C0892dD) it.next() : C0892dD.a;
            HashMap hashMap2 = new HashMap();
            f58o = hashMap2;
            hashMap2.put(c1929t00, c0244Jh);
            hashMap2.put(c1995u00, c0244Jh2);
            hashMap2.put(c2061v00, c0244Jh3);
            hashMap2.put(c1732q00, c0244Jh4);
            hashMap2.put(c2127w00, c0244Jh5);
            hashMap2.put(c1863s00, c0244Jh6);
            hashMap2.put(c1666p00, c0244Jh7);
            hashMap2.put(c1797r00, c0244Jh8);
            hashMap2.put(c2193x00, c0244Jh9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i2 == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i2) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i2 != 16) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = Constants.MessagePayloadKeys.FROM;
        if (i2 == 16) {
        }
        switch (i2) {
        }
        String format2 = String.format(str, objArr);
        if (i2 != 16) {
        }
    }

    public static Integer b(C0244Jh c0244Jh, C0244Jh c0244Jh2) {
        if (c0244Jh == null) {
            a(12);
            throw null;
        }
        AbstractC2325z00 abstractC2325z00 = c0244Jh.a;
        if (c0244Jh2 == null) {
            a(13);
            throw null;
        }
        AbstractC2325z00 abstractC2325z002 = c0244Jh2.a;
        Integer a2 = abstractC2325z00.a(abstractC2325z002);
        if (a2 != null) {
            return a2;
        }
        Integer a3 = abstractC2325z002.a(abstractC2325z00);
        if (a3 != null) {
            return Integer.valueOf(-a3.intValue());
        }
        return null;
    }

    public static InterfaceC1446lg c(UL ul, InterfaceC1446lg interfaceC1446lg, InterfaceC1118gg interfaceC1118gg) {
        InterfaceC1446lg c2;
        if (interfaceC1446lg == null) {
            a(8);
            throw null;
        }
        if (interfaceC1118gg == null) {
            a(9);
            throw null;
        }
        for (InterfaceC1446lg interfaceC1446lg2 = (InterfaceC1446lg) interfaceC1446lg.a(); interfaceC1446lg2 != null && interfaceC1446lg2.getVisibility() != f; interfaceC1446lg2 = (InterfaceC1446lg) AbstractC0114Eh.i(interfaceC1446lg2, InterfaceC1446lg.class, true)) {
            if (!interfaceC1446lg2.getVisibility().a(ul, interfaceC1446lg2, interfaceC1118gg)) {
                return interfaceC1446lg2;
            }
        }
        if (!(interfaceC1446lg instanceof KW) || (c2 = c(ul, ((LW) ((KW) interfaceC1446lg)).M, interfaceC1118gg)) == null) {
            return null;
        }
        return c2;
    }

    public static boolean d(InterfaceC1446lg interfaceC1446lg, InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg == null) {
            a(7);
            throw null;
        }
        C1623oL f2 = AbstractC0114Eh.f(interfaceC1118gg);
        if (f2 != C1623oL.m) {
            return f2.equals(AbstractC0114Eh.f(interfaceC1446lg));
        }
        return false;
    }

    public static boolean e(C0244Jh c0244Jh) {
        if (c0244Jh != null) {
            return c0244Jh == a || c0244Jh == b;
        }
        a(14);
        throw null;
    }

    public static C0244Jh f(AbstractC2325z00 abstractC2325z00) {
        if (abstractC2325z00 == null) {
            a(15);
            throw null;
        }
        C0244Jh c0244Jh = (C0244Jh) f58o.get(abstractC2325z00);
        if (c0244Jh != null) {
            return c0244Jh;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC2325z00);
    }
}

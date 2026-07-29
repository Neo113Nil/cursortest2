package o;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.fJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029fJ extends AbstractC2181wq {
    private static final C1029fJ DEFAULT_INSTANCE;
    private static volatile BH PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC1920st strings_ = C1293jL.k;

    static {
        C1029fJ c1029fJ = new C1029fJ();
        DEFAULT_INSTANCE = c1029fJ;
        AbstractC2181wq.j(C1029fJ.class, c1029fJ);
    }

    public static void l(C1029fJ c1029fJ, Iterable iterable) {
        InterfaceC1920st interfaceC1920st = c1029fJ.strings_;
        if (!((K) interfaceC1920st).h) {
            int size = interfaceC1920st.size();
            c1029fJ.strings_ = interfaceC1920st.d(size == 0 ? 10 : size * 2);
        }
        List list = c1029fJ.strings_;
        Charset charset = AbstractC2052ut.a;
        iterable.getClass();
        if (iterable instanceof InterfaceC1860rz) {
            List b = ((InterfaceC1860rz) iterable).b();
            InterfaceC1860rz interfaceC1860rz = (InterfaceC1860rz) list;
            int size2 = list.size();
            for (Object obj : b) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1860rz.size() - size2) + " is null.";
                    for (int size3 = interfaceC1860rz.size() - 1; size3 >= size2; size3--) {
                        interfaceC1860rz.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C1151h9) {
                    interfaceC1860rz.f((C1151h9) obj);
                } else {
                    interfaceC1860rz.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC1291jJ) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public static C1029fJ m() {
        return DEFAULT_INSTANCE;
    }

    public static C0963eJ o() {
        return (C0963eJ) ((AbstractC1720pq) DEFAULT_INSTANCE.c(5));
    }

    @Override // o.AbstractC2181wq
    public final Object c(int i) {
        BH bh;
        switch (AbstractC1888sN.v(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2018uL(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C1029fJ();
            case 4:
                return new C0963eJ(DEFAULT_INSTANCE);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                BH bh2 = PARSER;
                if (bh2 != null) {
                    return bh2;
                }
                synchronized (C1029fJ.class) {
                    try {
                        bh = PARSER;
                        if (bh == null) {
                            bh = new C1786qq();
                            PARSER = bh;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bh;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC1920st n() {
        return this.strings_;
    }
}

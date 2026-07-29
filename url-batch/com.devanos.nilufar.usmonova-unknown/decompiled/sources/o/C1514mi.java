package o;

import java.util.Locale;
import java.util.UUID;

/* renamed from: o.mi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514mi {
    public final C2069v6 a;

    public C1514mi(C2069v6 c2069v6) {
        AbstractC0048Bt.n(c2069v6, "preferences");
        this.a = c2069v6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r7 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC2367ze abstractC2367ze) {
        C1448li c1448li;
        int i;
        C2069v6 c2069v6;
        EnumC0448Re enumC0448Re;
        String str;
        Object b;
        if (abstractC2367ze instanceof C1448li) {
            c1448li = (C1448li) abstractC2367ze;
            int i2 = c1448li.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1448li.k = i2 - Integer.MIN_VALUE;
                Object obj = c1448li.i;
                i = c1448li.k;
                c2069v6 = this.a;
                enumC0448Re = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    c1448li.k = 1;
                    obj = AbstractC0022At.o(new C1410l6(((InterfaceC1972tf) ((C1590ns) AbstractC2135w6.a(c2069v6.a)).i).c(), 1), c1448li);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str2 = c1448li.h;
                        AbstractC1494mO.l(obj);
                        return str2;
                    }
                    AbstractC1494mO.l(obj);
                }
                str = (String) obj;
                if (str == null && !UT.J(str)) {
                    return str;
                }
                String uuid = UUID.randomUUID().toString();
                AbstractC0048Bt.m(uuid, "toString(...)");
                String upperCase = AbstractC0778bU.z(uuid, "-", "").toUpperCase(Locale.ROOT);
                AbstractC0048Bt.m(upperCase, "toUpperCase(...)");
                c1448li.h = upperCase;
                c1448li.k = 2;
                b = ((C1590ns) AbstractC2135w6.a(c2069v6.a)).b(new C0701aJ(new C1871s6(upperCase, null), null), c1448li);
                if (b != enumC0448Re) {
                    b = C0782bY.a;
                }
                return b != enumC0448Re ? enumC0448Re : upperCase;
            }
        }
        c1448li = new C1448li(this, abstractC2367ze);
        Object obj2 = c1448li.i;
        i = c1448li.k;
        c2069v6 = this.a;
        enumC0448Re = EnumC0448Re.h;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        String uuid2 = UUID.randomUUID().toString();
        AbstractC0048Bt.m(uuid2, "toString(...)");
        String upperCase2 = AbstractC0778bU.z(uuid2, "-", "").toUpperCase(Locale.ROOT);
        AbstractC0048Bt.m(upperCase2, "toUpperCase(...)");
        c1448li.h = upperCase2;
        c1448li.k = 2;
        b = ((C1590ns) AbstractC2135w6.a(c2069v6.a)).b(new C0701aJ(new C1871s6(upperCase2, null), null), c1448li);
        if (b != enumC0448Re) {
        }
        if (b != enumC0448Re) {
        }
    }
}

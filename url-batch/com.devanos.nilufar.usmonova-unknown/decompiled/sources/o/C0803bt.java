package o;

import java.util.UUID;

/* renamed from: o.bt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803bt {
    public final C2069v6 a;

    public C0803bt(C2069v6 c2069v6) {
        AbstractC0048Bt.n(c2069v6, "preferences");
        this.a = c2069v6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r7 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC2367ze abstractC2367ze) {
        C0737at c0737at;
        int i;
        C2069v6 c2069v6;
        EnumC0448Re enumC0448Re;
        String str;
        Object b;
        if (abstractC2367ze instanceof C0737at) {
            c0737at = (C0737at) abstractC2367ze;
            int i2 = c0737at.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0737at.k = i2 - Integer.MIN_VALUE;
                Object obj = c0737at.i;
                i = c0737at.k;
                c2069v6 = this.a;
                enumC0448Re = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    c0737at.k = 1;
                    obj = AbstractC0022At.o(new C1410l6(((InterfaceC1972tf) ((C1590ns) AbstractC2135w6.a(c2069v6.a)).i).c(), 2), c0737at);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str2 = c0737at.h;
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
                c0737at.h = uuid;
                c0737at.k = 2;
                b = ((C1590ns) AbstractC2135w6.a(c2069v6.a)).b(new C0701aJ(new C1937t6(uuid, null), null), c0737at);
                if (b != enumC0448Re) {
                    b = C0782bY.a;
                }
                return b != enumC0448Re ? enumC0448Re : uuid;
            }
        }
        c0737at = new C0737at(this, abstractC2367ze);
        Object obj2 = c0737at.i;
        i = c0737at.k;
        c2069v6 = this.a;
        enumC0448Re = EnumC0448Re.h;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        String uuid2 = UUID.randomUUID().toString();
        AbstractC0048Bt.m(uuid2, "toString(...)");
        c0737at.h = uuid2;
        c0737at.k = 2;
        b = ((C1590ns) AbstractC2135w6.a(c2069v6.a)).b(new C0701aJ(new C1937t6(uuid2, null), null), c0737at);
        if (b != enumC0448Re) {
        }
        if (b != enumC0448Re) {
        }
    }
}

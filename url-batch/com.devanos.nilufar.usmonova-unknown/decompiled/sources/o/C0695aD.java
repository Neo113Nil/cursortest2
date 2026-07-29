package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.aD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695aD {
    public final List a;

    public C0695aD(SK sk) {
        AbstractC0048Bt.n(sk, "typeTable");
        List list = sk.j;
        if ((sk.i & 1) == 1) {
            int i = sk.k;
            AbstractC0048Bt.m(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0868ct.Y();
                    throw null;
                }
                MK mk = (MK) obj;
                if (i2 >= i) {
                    mk.getClass();
                    LK r = MK.r(mk);
                    r.k |= 2;
                    r.m = true;
                    mk = r.g();
                    if (!mk.b()) {
                        throw new C0057Cc();
                    }
                }
                arrayList.add(mk);
                i2 = i3;
            }
            list = arrayList;
        }
        AbstractC0048Bt.m(list, "run {\n        val origin… else originalTypes\n    }");
        this.a = list;
    }

    public MK a(int i) {
        return (MK) this.a.get(i);
    }

    public C0695aD(List list) {
        this.a = list;
    }
}

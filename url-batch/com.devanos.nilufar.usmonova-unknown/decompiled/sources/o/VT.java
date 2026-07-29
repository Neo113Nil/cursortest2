package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class VT extends AbstractC2219xO {
    public static String u(String str) {
        List list;
        AbstractC0048Bt.n(str, "<this>");
        if (UT.J("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        C0625Xz c0625Xz = new C0625Xz(str);
        if (c0625Xz.hasNext()) {
            Object next = c0625Xz.next();
            if (c0625Xz.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c0625Xz.hasNext()) {
                    arrayList.add(c0625Xz.next());
                }
                list = arrayList;
            } else {
                list = AbstractC0868ct.J(next);
            }
        } else {
            list = C1318jk.h;
        }
        int length = str.length();
        list.size();
        int w = AbstractC0868ct.w(list);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            String str2 = null;
            if (i < 0) {
                AbstractC0868ct.Y();
                throw null;
            }
            String str3 = (String) obj;
            if ((i != 0 && i != w) || !UT.J(str3)) {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC0868ct.G(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && AbstractC0778bU.A(i3, str3, "|", false)) {
                    str2 = str3.substring("|".length() + i3);
                    AbstractC0048Bt.m(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0720ac.s0(arrayList2, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}

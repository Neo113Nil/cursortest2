package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class n30 extends vv {
    public static String g0(String str) {
        List list;
        if (m30.s0("|")) {
            l8.l("marginPrefix must be non-blank string.");
            return null;
        }
        wp wpVar = new wp(str);
        if (wpVar.hasNext()) {
            Object next = wpVar.next();
            if (wpVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (wpVar.hasNext()) {
                    arrayList.add(wpVar.next());
                }
                list = arrayList;
            } else {
                list = oo.x(next);
            }
        } else {
            list = uh.f;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                va.X();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && m30.s0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    char charAt = str2.charAt(i3);
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && u30.k0(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        ua.a0(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}

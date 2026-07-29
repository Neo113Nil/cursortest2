package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Z3 {
    static {
        new Y3("", null, null, null);
    }

    public static final ArrayList a(List list, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                X3 x3 = (X3) obj;
                if (b(i, i2, x3.b, x3.c)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                X3 x32 = (X3) arrayList.get(i4);
                arrayList2.add(new X3(x32.a, Math.max(i, x32.b) - i, Math.min(i2, x32.c) - i, x32.d));
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if ((r6 == r7) == (r4 == r5)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) >= Math.min(i2, i4)) {
            if (i <= i3 && i4 <= i2) {
                if (i2 == i4) {
                }
            }
            if (i3 <= i && i2 <= i4) {
                if (i4 == i2) {
                    if ((i == i2) == (i3 == i4)) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}

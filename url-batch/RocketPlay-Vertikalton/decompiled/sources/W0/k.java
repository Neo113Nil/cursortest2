package W0;

import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends F1.l {
    public static int r0(List list) {
        i1.f.e(list, "<this>");
        return list.size() - 1;
    }

    public static List s0(Object... objArr) {
        i1.f.e(objArr, "elements");
        return objArr.length > 0 ? i.r0(objArr) : s.f1284a;
    }
}

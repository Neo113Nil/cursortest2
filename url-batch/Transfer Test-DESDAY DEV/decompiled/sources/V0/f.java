package V0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends T.e {
    public static int Z(AbstractList abstractList) {
        g1.f.e(abstractList, "<this>");
        return abstractList.size() - 1;
    }

    public static List a0(Object... objArr) {
        if (objArr.length <= 0) {
            return m.f875a;
        }
        List asList = Arrays.asList(objArr);
        g1.f.d(asList, "asList(...)");
        return asList;
    }

    public static void b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

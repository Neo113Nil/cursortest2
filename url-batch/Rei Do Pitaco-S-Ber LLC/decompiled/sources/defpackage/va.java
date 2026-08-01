package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class va extends oo {
    public static List V(Object... objArr) {
        if (objArr.length <= 0) {
            return uh.f;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void W() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void X() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

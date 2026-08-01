package Q0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class j extends i {
    public static int w0(Iterable iterable) {
        X0.d.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

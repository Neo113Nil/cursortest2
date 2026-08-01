package V0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class g extends f {
    public static int c0(Iterable iterable) {
        g1.f.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

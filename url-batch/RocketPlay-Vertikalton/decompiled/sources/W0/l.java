package W0;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static int t0(Iterable iterable) {
        i1.f.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

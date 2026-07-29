package o;

import java.util.Collection;

/* renamed from: o.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0786bc extends AbstractC0868ct {
    public static int d0(Iterable iterable) {
        AbstractC0048Bt.n(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

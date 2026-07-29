package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0982ec extends AbstractC0917dc {
    public static void e0(List list, Comparator comparator) {
        AbstractC0048Bt.n(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

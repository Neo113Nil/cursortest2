package o;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1048fc extends AbstractC0982ec {
    public static void f0(Collection collection, Iterable iterable) {
        AbstractC0048Bt.n(collection, "<this>");
        AbstractC0048Bt.n(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}

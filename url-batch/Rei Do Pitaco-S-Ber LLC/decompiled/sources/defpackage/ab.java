package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class ab extends za {
    public static void Z(AbstractList abstractList, Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            abstractList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }
}

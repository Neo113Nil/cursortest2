package o;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class TU implements Iterable {
    public final ArrayList h = new ArrayList();
    public final J4 i;

    public TU(J4 j4) {
        this.i = j4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.h.iterator();
    }
}

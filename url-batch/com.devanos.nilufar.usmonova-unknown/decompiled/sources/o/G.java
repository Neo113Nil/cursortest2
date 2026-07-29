package o;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class G extends AbstractList implements List, InterfaceC1726pw {
    public abstract int j();

    public abstract Object k(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return k(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return j();
    }
}

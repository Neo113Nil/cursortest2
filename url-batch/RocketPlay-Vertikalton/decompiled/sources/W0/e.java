package W0;

import j1.InterfaceC0183a;
import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends AbstractList implements List, InterfaceC0183a {
    public abstract int a();

    public abstract Object b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}

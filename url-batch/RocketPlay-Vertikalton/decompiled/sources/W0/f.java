package W0;

import j1.InterfaceC0183a;
import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f extends AbstractSet implements Set, InterfaceC0183a {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}

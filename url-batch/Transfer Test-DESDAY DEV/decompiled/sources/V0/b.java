package V0;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class b extends AbstractSet implements Set, h1.a {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}

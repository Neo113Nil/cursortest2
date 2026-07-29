package o;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class I extends AbstractSet implements Set, InterfaceC0103Dw {
    public abstract int j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return j();
    }
}

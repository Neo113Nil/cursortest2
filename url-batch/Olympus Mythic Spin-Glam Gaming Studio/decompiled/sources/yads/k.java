package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class k extends hi1 {
    public final /* synthetic */ m b;

    public k(m mVar) {
        this.b = mVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.b.d.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new l(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean z;
        Object obj2;
        Set entrySet = this.b.d.entrySet();
        entrySet.getClass();
        try {
            z = entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        y yVar = this.b.e;
        Object key = entry.getKey();
        Map map = yVar.e;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused2) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        yVar.f -= size;
        return true;
    }
}

package yads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class hi1 extends zy2 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        ((k) this).b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return ((k) this).b.isEmpty();
    }

    @Override // yads.zy2, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= remove(it.next());
            }
            return z;
        }
    }

    @Override // yads.zy2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i;
        boolean z;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                dx.a(size, "expectedSize");
                i = size + 1;
            } else {
                i = size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object obj : collection) {
                Set entrySet = ((k) this).b.d.entrySet();
                entrySet.getClass();
                try {
                    z = entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    z = false;
                }
                if (z && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((k) this).b.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((k) this).b.d.size();
    }
}

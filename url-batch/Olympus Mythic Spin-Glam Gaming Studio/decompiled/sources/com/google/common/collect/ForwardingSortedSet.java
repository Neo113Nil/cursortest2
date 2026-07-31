package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes13.dex */
public abstract class ForwardingSortedSet extends ForwardingSet implements SortedSet {
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected abstract SortedSet delegate();

    protected ForwardingSortedSet() {
    }

    @Override // java.util.SortedSet
    public Comparator<Object> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedSet
    public Object first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> headSet(Object obj) {
        return delegate().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return delegate().last();
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return delegate().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public SortedSet<Object> tailSet(Object obj) {
        return delegate().tailSet(obj);
    }

    protected boolean standardContains(Object obj) {
        try {
            return ForwardingSortedMap.unsafeCompare(comparator(), tailSet(obj).first(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    protected boolean standardRemove(Object obj) {
        try {
            Iterator it = tailSet(obj).iterator();
            if (it.hasNext()) {
                if (ForwardingSortedMap.unsafeCompare(comparator(), it.next(), obj) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    protected SortedSet<Object> standardSubSet(Object obj, Object obj2) {
        return tailSet(obj).headSet(obj2);
    }
}
